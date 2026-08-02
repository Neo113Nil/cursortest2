package ru.ok.android.onelog.uv.composite;

import android.net.Uri;
import xsna.brm0;
import xsna.zcl;

/* compiled from: OneLogRoutingPolicy.kt */
/* loaded from: classes11.dex */
public final class OneLogRoutingPolicy {
    private final boolean isNewStatToOkEnabled;
    private final boolean isNewStatToUvEnabled;
    private final boolean isOldStatToOkEnabled;
    private final boolean isOldStatToUvEnabled;
    public static final Companion Companion = new Companion(null);
    private static final Uri UV_OLD_STAT_URI = Uri.parse("https://uvapi.okcdn.ru/uv/stat/externalLog");
    private static final Uri UV_NEW_STAT_URI = Uri.parse("https://uvapi.okcdn.ru/uv/stat/logUvStat");

    /* compiled from: OneLogRoutingPolicy.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public OneLogRoutingPolicy(boolean z, boolean z2, boolean z3, boolean z4) {
        this.isOldStatToOkEnabled = z;
        this.isOldStatToUvEnabled = z2;
        this.isNewStatToOkEnabled = z3;
        this.isNewStatToUvEnabled = z4;
    }

    private final boolean isNewStatUri(Uri uri) {
        return brm0.v(uri.toString(), "fb.do", false);
    }

    private final boolean isOldStatUri(Uri uri) {
        return brm0.v(uri.toString(), "log/externalLog", false);
    }

    public final Uri resolveUvUri(Uri uri) {
        return isOldStatUri(uri) ? UV_OLD_STAT_URI : isNewStatUri(uri) ? UV_NEW_STAT_URI : uri;
    }

    public final boolean shouldSendToOk(Uri uri) {
        if (isOldStatUri(uri)) {
            return this.isOldStatToOkEnabled;
        }
        if (isNewStatUri(uri)) {
            return this.isNewStatToOkEnabled;
        }
        return true;
    }

    public final boolean shouldSendToUv(Uri uri) {
        if (isOldStatUri(uri)) {
            return this.isOldStatToUvEnabled;
        }
        if (isNewStatUri(uri)) {
            return this.isNewStatToUvEnabled;
        }
        return false;
    }
}
