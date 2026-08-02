package yads;

import kotlin.jvm.internal.Lambda;
import xsna.i7s;
import xsna.izs;

/* loaded from: classes10.dex */
public final class di extends Lambda implements izs {
    public final /* synthetic */ ei b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di(ei eiVar) {
        super(1);
        this.b = eiVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        return ei.a(this.b, i7s.a(obj));
    }
}
