package xsna;

import android.graphics.Rect;
import android.view.View;
import com.vk.newsfeed.common.recycler.holders.attachments.market.FeedGoodsPhotoHolder;
import com.vkontakte.android.attachments.PhotoAttachment;

/* compiled from: PrimaryPhotoHolder.kt */
/* loaded from: classes4.dex */
public final class iad0 extends m56<PhotoAttachment> implements bnw, vmw, FeedGoodsPhotoHolder, n880 {
    public final cvj0 D;
    public final bx80 E;

    public iad0(cvj0 cvj0Var) {
        super(cvj0Var.itemView);
        this.D = cvj0Var;
        this.E = cvj0Var.H;
    }

    @Override // xsna.vmw
    public final Rect F2() {
        return this.D.c7();
    }

    @Override // com.vk.newsfeed.common.recycler.holders.attachments.market.FeedGoodsPhotoHolder
    public final FeedGoodsPhotoHolder.b G5() {
        return this.E;
    }

    @Override // xsna.qi6
    public final void O6(s980 s980Var) {
        this.y = s980Var;
        this.D.y = s980Var;
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        this.D.Q6(s6oVar);
    }

    @Override // xsna.n880
    public final View R3() {
        return this.D.R;
    }

    @Override // xsna.m56
    public final void T6(PhotoAttachment photoAttachment) {
        s1c0 s1c0Var;
        cvj0 cvj0Var = this.D;
        cvj0Var.itemView.setPadding(0, 0, 0, 0);
        u1c0 J0 = J0();
        if (J0 == null || (s1c0Var = J0.n) == null || !s1c0Var.l) {
            return;
        }
        cvj0Var.Q.setWrapContent(true);
    }

    @Override // com.vk.newsfeed.common.recycler.holders.attachments.market.FeedGoodsPhotoHolder
    public final void V1() {
        this.D.V1();
    }

    @Override // xsna.m56, xsna.qi6
    public final void a6(u1c0 u1c0Var) {
        this.D.a6(u1c0Var);
        super.a6(u1c0Var);
    }

    @Override // xsna.bnw
    public final void b5(anw anwVar) {
        this.D.D = anwVar;
    }

    @Override // com.vk.newsfeed.common.recycler.holders.attachments.market.FeedGoodsPhotoHolder
    public final void c3(FeedGoodsPhotoHolder.GoodsVisibilityState goodsVisibilityState) {
        this.D.i7(goodsVisibilityState);
    }

    @Override // xsna.n880
    public final void i3() {
        this.D.i3();
    }

    @Override // xsna.qi6
    public final s980 l6() {
        return this.y;
    }

    @Override // com.vk.newsfeed.common.recycler.holders.attachments.market.FeedGoodsPhotoHolder
    public final void n1() {
        this.D.n1();
    }

    @Override // xsna.n880
    public final void s4(String str) {
        this.D.s4(str);
    }

    @Override // com.vk.newsfeed.common.recycler.holders.attachments.market.FeedGoodsPhotoHolder
    public final void u5(FeedGoodsPhotoHolder.a aVar) {
        this.D.I = aVar;
    }

    @Override // com.vk.newsfeed.common.recycler.holders.attachments.market.FeedGoodsPhotoHolder
    public final void z5() {
        this.D.z5();
    }

    @Override // xsna.n880
    public final void Y0(izs<? super o880, s3q0> izsVar) {
    }

    @Override // xsna.n880
    public final void i2(izs<? super o880, s3q0> izsVar) {
    }
}
