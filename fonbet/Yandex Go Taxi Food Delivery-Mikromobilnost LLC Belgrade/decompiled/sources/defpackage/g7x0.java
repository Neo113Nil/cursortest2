package defpackage;

import android.view.View;
import com.yandex.go.taxi.order.feedback.tag.TagRatingItemView;
import com.yandex.go.taxi.order.feedback.tag.a;
import defpackage.g18;
import defpackage.g7x0;

/* loaded from: classes14.dex */
public final class g7x0 extends kr31 implements xv5 {
    public final TagRatingItemView d;
    public g18 e;
    public final /* synthetic */ a f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7x0(a aVar, TagRatingItemView tagRatingItemView) {
        super(tagRatingItemView);
        this.f = aVar;
        this.d = tagRatingItemView;
        tagRatingItemView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.go.taxi.order.feedback.tag.TagRatingAdapter$TagRatingViewHolder$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
                g18 g18Var = g7x0.this.e;
                if (g18Var != null) {
                    g18Var.cancel();
                }
            }
        });
    }

    @Override // defpackage.xv5
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void c(h7x0 h7x0Var) {
        String str = h7x0Var.c;
        TagRatingItemView tagRatingItemView = this.d;
        tagRatingItemView.setTitle(str);
        tagRatingItemView.setSelectedItem(h7x0Var.a.c);
        a aVar = this.f;
        msq msqVar = aVar.f;
        tagRatingItemView.setOnClickListener(new nl(18, h7x0Var, this, aVar));
        String str2 = h7x0Var.b;
        boolean z = (str2 == null || str2.length() == 0) ? false : true;
        tagRatingItemView.getLeadImageView().setVisibility(z ? 0 : 8);
        if (z) {
            g18 g18Var = this.e;
            if (g18Var != null) {
                g18Var.cancel();
            }
            nac nacVar = (nac) msqVar.a.a(tagRatingItemView.getLeadImageView());
            nacVar.e(n4h0.feedback_tag_icon);
            this.e = nacVar.c(((m7x0) msqVar.b).a(str2));
        }
    }
}
