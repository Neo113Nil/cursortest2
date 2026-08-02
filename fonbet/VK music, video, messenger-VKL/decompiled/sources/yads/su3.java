package yads;

import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class su3 extends Lambda implements gzs {
    public final /* synthetic */ tu3 b;
    public final /* synthetic */ com.yandex.mobile.ads.nativeads.d c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su3(tu3 tu3Var, com.yandex.mobile.ads.nativeads.d dVar) {
        super(0);
        this.b = tu3Var;
        this.c = dVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        this.b.a.onAdLoaded(this.c);
        return s3q0.a;
    }
}
