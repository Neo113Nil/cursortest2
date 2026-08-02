package yads;

import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class vg extends Lambda implements gzs {
    public final /* synthetic */ wg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vg(wg wgVar) {
        super(0);
        this.b = wgVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        this.b.c();
        this.b.d.getClass();
        rg.a("Connection timeout");
        this.b.a();
        return s3q0.a;
    }
}
