package xsna;

import kotlin.time.DurationUnit;

/* compiled from: DownloadHelperExt.kt */
/* loaded from: classes8.dex */
public final class s8o {
    public static final Long a(androidx.media3.common.a aVar, zno znoVar) {
        if (znoVar == null) {
            return null;
        }
        return Long.valueOf((aVar.j * zno.l(znoVar.b, DurationUnit.SECONDS)) / 8);
    }
}
