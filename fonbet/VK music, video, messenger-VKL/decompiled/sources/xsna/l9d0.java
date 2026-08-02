package xsna;

import android.view.View;
import com.vk.feed.tool.view.newsfeed.photo.BlurredImageWrapper;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.DocumentAttachment;

/* compiled from: PrimaryDocumentAnimationHolder.kt */
/* loaded from: classes4.dex */
public final class l9d0 extends m56<DocumentAttachment> implements ent0, bnw {
    public static final /* synthetic */ int F = 0;
    public final pp2 D;
    public final BlurredImageWrapper E;

    public l9d0(View view, pp2 pp2Var) {
        super(view);
        this.D = pp2Var;
        BlurredImageWrapper blurredImageWrapper = (BlurredImageWrapper) view.findViewById(R.id.wrapper);
        this.E = blurredImageWrapper;
        abg0 abg0Var = dhr0.t;
        blurredImageWrapper.b(abg0Var.c(R.attr.vk_ui_background_content));
        blurredImageWrapper.setBlurPostprocessor(edg0.a);
        blurredImageWrapper.setBlurPlaceholderColor(abg0Var.c(R.attr.vk_ui_background_secondary));
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        this.D.Q6(s6oVar);
    }

    @Override // xsna.m56
    public final void T6(DocumentAttachment documentAttachment) {
        this.E.a(documentAttachment.h);
        pp2 pp2Var = this.D;
        f4m.u(pp2Var.itemView, 0, 0, 0, 0);
        pp2Var.itemView.setPadding(0, 0, 0, 0);
    }

    @Override // xsna.m56, xsna.qi6
    public final void a6(u1c0 u1c0Var) {
        this.D.a6(u1c0Var);
        super.a6(u1c0Var);
    }

    @Override // xsna.bnw
    public final void b5(anw anwVar) {
        this.D.F = anwVar;
    }

    @Override // xsna.ent0
    public final dnt0 q3() {
        return this.D.H;
    }
}
