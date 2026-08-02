package xsna;

import com.vkontakte.android.attachments.MarketAlbumAttachment;

/* compiled from: PrimaryMarketAlbumHolder.kt */
/* loaded from: classes4.dex */
public final class w9d0 extends m56<MarketAlbumAttachment> {
    public final tuj0 D;

    public w9d0(tuj0 tuj0Var) {
        super(tuj0Var.itemView);
        this.D = tuj0Var;
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        this.D.Q6(s6oVar);
    }

    @Override // xsna.m56
    public final void T6(MarketAlbumAttachment marketAlbumAttachment) {
        tuj0 tuj0Var = this.D;
        tuj0Var.itemView.setPadding(0, 0, 0, 0);
        tuj0Var.y = this.y;
    }

    @Override // xsna.m56, xsna.qi6
    public final void a6(u1c0 u1c0Var) {
        this.D.a6(u1c0Var);
        super.a6(u1c0Var);
    }
}
