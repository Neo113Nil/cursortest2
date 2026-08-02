package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: RectList.kt */
/* loaded from: classes11.dex */
public final class cif0 {
    public static final long a = (IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE << 50) ^ (-1);
    public static final long b = (-1) ^ (33554431 << 25);
    public static final long c;

    static {
        long j = 33554431;
        c = j | (Math.min(0, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) << 50) | (j << 25);
    }
}
