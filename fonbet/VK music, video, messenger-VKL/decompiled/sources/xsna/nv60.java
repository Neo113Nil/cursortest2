package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: NewsfeedPlaceholderHolder.kt */
/* loaded from: classes4.dex */
public final class nv60 extends rp6<ov60, NewsEntry> implements View.OnClickListener {
    public final tsa0 E;

    static {
        int i = tsa0.h;
    }

    public nv60(ViewGroup viewGroup) {
        super(new tsa0(viewGroup.getContext()), viewGroup);
        tsa0 tsa0Var = (tsa0) this.itemView;
        tsa0Var.setOnClickListener(this);
        tsa0Var.setDrawable(new gko(R.drawable.placeholder_newsfeed));
        this.E = tsa0Var;
    }

    @Override // xsna.rp6
    public final void R6(ov60 ov60Var) {
        ov60 ov60Var2 = ov60Var;
        CharSequence charSequence = ov60Var2.h;
        tlo0.h f = charSequence != null ? u11.f(tlo0.Companion, charSequence) : null;
        tsa0 tsa0Var = this.E;
        tsa0Var.setDescriptionText(f);
        CharSequence charSequence2 = ov60Var2.i;
        tsa0Var.setButtonText(charSequence2 != null ? u11.f(tlo0.Companion, charSequence2) : null);
        tsa0Var.setButtonShown(ov60Var2.j);
        ViewGroup.LayoutParams layoutParams = tsa0Var.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = ov60Var2.k;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ov60 ov60Var;
        NewsfeedExternalAction newsfeedExternalAction;
        if (jjc.b() || (ov60Var = (ov60) this.C) == null || (newsfeedExternalAction = ov60Var.l) == null) {
            return;
        }
        this.D.sa(newsfeedExternalAction);
    }
}
