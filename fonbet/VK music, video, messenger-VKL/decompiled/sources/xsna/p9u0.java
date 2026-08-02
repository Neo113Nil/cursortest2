package xsna;

import com.vk.im.mvicomponent.MultiComponentFragment;
import xsna.mwv;

/* compiled from: VkAppDialogsToolbarMviComponentFactory.kt */
/* loaded from: classes18.dex */
public final class p9u0 implements iwm {
    public final b25 a;
    public final q7v0 b;
    public final mwv<mwv.a> c;

    public p9u0(b25 b25Var, q7v0 q7v0Var, mwv<mwv.a> mwvVar) {
        this.a = b25Var;
        this.b = q7v0Var;
        this.c = mwvVar;
    }

    @Override // xsna.iwm
    public final yj50 a(MultiComponentFragment multiComponentFragment, com.vk.dialogsscreen.impl.a aVar) {
        return new o9u0(multiComponentFragment, aVar, this.a, new fwm(this.b), this.c);
    }
}
