package xsna;

import com.vk.stickers.views.gift.AnimatedGiftView;
import xsna.zk2;

/* compiled from: AnimatedGiftView.kt */
/* loaded from: classes6.dex */
public final class uj2 implements en2 {
    public final /* synthetic */ gzs<s3q0> a;
    public final /* synthetic */ AnimatedGiftView b;

    public uj2(gzs<s3q0> gzsVar, AnimatedGiftView animatedGiftView) {
        this.a = gzsVar;
        this.b = animatedGiftView;
    }

    @Override // xsna.en2
    public final void a() {
        AnimatedGiftView animatedGiftView = this.b;
        xse0 xse0Var = animatedGiftView.b;
        zk2.d7.getClass();
        xse0Var.setAnimatedItem(zk2.a.b);
        f4m.j(animatedGiftView);
    }

    @Override // xsna.en2
    public final void b(bl2 bl2Var) {
        this.a.invoke();
        int i = AnimatedGiftView.g;
        this.b.c();
    }

    @Override // xsna.en2
    public final void onCancel() {
    }
}
