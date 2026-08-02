package yads;

import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class zr3 extends Lambda implements gzs {
    public final /* synthetic */ as3 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zr3(as3 as3Var, String str) {
        super(0);
        this.b = as3Var;
        this.c = str;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        this.b.a.onBidderTokenLoaded(this.c);
        return s3q0.a;
    }
}
