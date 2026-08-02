package xsna;

import kotlin.jvm.internal.Lambda;

/* compiled from: EnterExitTransition.kt */
/* loaded from: classes11.dex */
public final class vnp extends Lambda implements izs<Integer, Integer> {
    public static final vnp i = new vnp(1);

    @Override // xsna.izs
    public final Integer invoke(Integer num) {
        return Integer.valueOf((-num.intValue()) / 2);
    }
}
