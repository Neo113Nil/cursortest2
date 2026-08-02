package yads;

import kotlin.jvm.internal.Lambda;
import xsna.izs;

/* loaded from: classes10.dex */
public final class on extends Lambda implements izs {
    public static final on b = new on();

    public on() {
        super(1);
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        obj.getClass();
        throw new ClassCastException();
    }
}
