package androidx.media3.exoplayer;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import defpackage.d6z;
import defpackage.sf10;
import defpackage.tw21;

/* loaded from: classes10.dex */
public final class ExoPlaybackException extends PlaybackException {
    final boolean isRecoverable;
    public final sf10 mediaPeriodId;
    public final androidx.media3.common.a rendererFormat;
    public final int rendererFormatSupport;
    public final int rendererIndex;
    public final String rendererName;
    public final int type;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ExoPlaybackException(int i, Throwable th, int i2, String str, int i3, androidx.media3.common.a aVar, int i4, boolean z) {
        this(TextUtils.isEmpty(null) ? r0 : r0.concat(": null"), th, i2, i, r5, r6, r7, i4, null, SystemClock.elapsedRealtime(), z);
        String str2;
        int i5;
        androidx.media3.common.a aVar2;
        String str3;
        if (i == 0) {
            str2 = str;
            i5 = i3;
            aVar2 = aVar;
            str3 = "Source error";
        } else if (i != 1) {
            str3 = i != 3 ? "Unexpected runtime error" : "Remote error";
            str2 = str;
            i5 = i3;
            aVar2 = aVar;
        } else {
            StringBuilder sb = new StringBuilder();
            str2 = str;
            sb.append(str2);
            sb.append(" error, index=");
            i5 = i3;
            sb.append(i5);
            sb.append(", format=");
            aVar2 = aVar;
            sb.append(aVar2);
            sb.append(", format_supported=");
            sb.append(tw21.C(i4));
            str3 = sb.toString();
        }
    }

    public final ExoPlaybackException b(sf10 sf10Var) {
        String message = getMessage();
        int i = tw21.a;
        return new ExoPlaybackException(message, getCause(), this.errorCode, this.type, this.rendererName, this.rendererIndex, this.rendererFormat, this.rendererFormatSupport, sf10Var, this.timestampMs, this.isRecoverable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExoPlaybackException(String str, Throwable th, int i, int i2, String str2, int i3, androidx.media3.common.a aVar, int i4, sf10 sf10Var, long j, boolean z) {
        super(str, th, i, j);
        Bundle bundle = Bundle.EMPTY;
        d6z.l(!z || i2 == 1);
        d6z.l(th != null || i2 == 3);
        this.type = i2;
        this.rendererName = str2;
        this.rendererIndex = i3;
        this.rendererFormat = aVar;
        this.rendererFormatSupport = i4;
        this.mediaPeriodId = sf10Var;
        this.isRecoverable = z;
    }

    public ExoPlaybackException(int i, Exception exc, int i2) {
        this(i, exc, i2, null, -1, null, 4, false);
    }
}
