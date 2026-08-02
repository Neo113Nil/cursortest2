package xsna;

import com.vk.rlottie.RLottieDrawable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class y6r0 implements izs {
    public final /* synthetic */ zk2 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ y6r0(zk2 zk2Var, boolean z, int i, boolean z2) {
        this.b = zk2Var;
        this.c = z;
        this.d = i;
        this.e = z2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str = (String) obj;
        zk2 zk2Var = this.b;
        boolean z = this.c;
        String b = zk2Var.b(z);
        int i = this.d;
        return new RLottieDrawable(str, b, i, i, null, this.e, z, null, 272);
    }
}
