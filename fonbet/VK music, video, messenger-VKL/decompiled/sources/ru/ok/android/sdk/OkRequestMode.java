package ru.ok.android.sdk;

import java.util.EnumSet;
import java.util.Set;
import xsna.zcl;

/* compiled from: OkRequestMode.kt */
/* loaded from: classes9.dex */
public enum OkRequestMode {
    SIGNED,
    UNSIGNED,
    SDK_SESSION,
    NO_PLATFORM_REPORTING;

    public static final Companion Companion;
    private static final Set<OkRequestMode> DEFAULT;

    /* compiled from: OkRequestMode.kt */
    public static final class Companion {
        private Companion() {
        }

        public final Set<OkRequestMode> getDEFAULT() {
            return OkRequestMode.DEFAULT;
        }

        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public static /* synthetic */ void DEFAULT$annotations() {
        }
    }

    static {
        OkRequestMode okRequestMode = SIGNED;
        Companion = new Companion(null);
        DEFAULT = EnumSet.of(okRequestMode);
    }

    public static final Set<OkRequestMode> getDEFAULT() {
        return DEFAULT;
    }
}
