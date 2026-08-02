package xsna;

import android.view.ViewGroup;
import com.vk.feed.core.models.news.NewsEntry;
import kotlin.LazyThreadSafetyMode;
import xsna.lhu0;
import xsna.tlo0;

/* compiled from: CaptionHolderV2.kt */
/* loaded from: classes4.dex */
public final class ur9 extends rp6<sr9, NewsEntry> implements w8i {
    public static final /* synthetic */ int H = 0;
    public final lhu0 E;
    public final Object F;
    public final Object G;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ur9(ViewGroup viewGroup) {
        super(r1, viewGroup);
        lhu0 lhu0Var = new lhu0(viewGroup.getContext());
        lhu0Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        lhu0 lhu0Var2 = (lhu0) this.itemView;
        this.E = lhu0Var2;
        com.vk.movika.sdk.base.logic.interactor.j jVar = new com.vk.movika.sdk.base.logic.interactor.j(this, 14);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.F = msy.a(lazyThreadSafetyMode, jVar);
        this.G = msy.a(lazyThreadSafetyMode, new xm1(this, 10));
        lhu0Var2.setOnClickListener(new l44(this, 2));
    }

    @Override // xsna.rp6
    public final void R6(sr9 sr9Var) {
        sr9 sr9Var2 = sr9Var;
        boolean z = sr9Var2.l;
        lhu0 lhu0Var = this.E;
        lhu0Var.setCanClick(z);
        lhu0Var.setMiddle(new lhu0.b.a(u11.f(tlo0.Companion, sr9Var2.h)));
        boolean z2 = sr9Var2.i;
        boolean z3 = sr9Var2.m;
        s1c0 s1c0Var = this.x;
        boolean z4 = false;
        if ((s1c0Var == null || !s1c0Var.k) && A6() && z3) {
            z4 = true;
        }
        lhu0Var.setRight(z2 ? new lhu0.c.a(new tlo0.h(sr9Var2.k), new tr9(0, this, ur9.class, "onActionButtonClick", "onActionButtonClick()V", 0, 0)) : z4 ? new lhu0.c.C3269c(new kl4(0, this, ur9.class, "onHideClick", "onHideClick()V", 0, 1)) : null);
        Integer num = sr9Var2.p;
        lhu0Var.setLeft(num != null ? new lhu0.a.C3268a(new gko(num.intValue())) : null);
    }

    @Override // xsna.qi6, me.grishka.appkit.views.UsableRecyclerView.j
    public final boolean isEnabled() {
        return false;
    }
}
