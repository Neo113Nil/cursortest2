package yads;

import kotlin.jvm.internal.Lambda;
import xsna.i7s;
import xsna.izs;

/* loaded from: classes10.dex */
public final class ai extends Lambda implements izs {
    public static final ai b = new ai();

    public ai() {
        super(1);
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int reason;
        reason = i7s.a(obj).getReason();
        return Boolean.valueOf(reason == 6);
    }
}
