package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.ActionButtonAttachment;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ChipActionButtonHolderV2.kt */
/* loaded from: classes4.dex */
public final class hac extends rp6<iac, NewsEntry> implements View.OnClickListener {
    public final ouu0 E;
    public final Object F;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public hac(ViewGroup viewGroup) {
        super(r1, viewGroup);
        ouu0 ouu0Var = new ouu0(viewGroup.getContext());
        ouu0Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        ouu0 ouu0Var2 = (ouu0) this.itemView;
        this.E = ouu0Var2;
        this.F = msy.a(LazyThreadSafetyMode.NONE, new i9(11));
        ouu0Var2.setOnLinkClickListener(this);
    }

    @Override // xsna.rp6
    public final void R6(iac iacVar) {
        this.E.setLinkText(iacVar.h);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ActionButtonAttachment actionButtonAttachment;
        NewsEntry newsEntry;
        iac iacVar = (iac) this.C;
        if (iacVar == null || (actionButtonAttachment = iacVar.i) == null) {
            return;
        }
        di60.w(actionButtonAttachment.h, this.itemView.getContext(), t6(), null, null, null, 60);
        u1c0 J0 = J0();
        if (J0 == null || (newsEntry = J0.a) == null) {
            return;
        }
        lu luVar = (lu) this.F.getValue();
        int i = J0.k;
        luVar.getClass();
        lu.a(newsEntry, actionButtonAttachment, i);
    }
}
