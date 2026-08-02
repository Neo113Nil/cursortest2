package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;
import com.vkontakte.android.data.PostInteract;
import com.vungle.ads.internal.protos.Sdk;
import xsna.tlo0;

/* compiled from: AttachCutHolderV2.kt */
/* loaded from: classes4.dex */
public final class h14 extends rp6<i14, NewsEntry> implements View.OnClickListener {
    public final p870 E;
    public final ouu0 F;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h14(ViewGroup viewGroup, p870 p870Var) {
        super(r1, viewGroup);
        ouu0 ouu0Var = new ouu0(viewGroup.getContext());
        ouu0Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.E = p870Var;
        ouu0 ouu0Var2 = (ouu0) this.itemView;
        this.F = ouu0Var2;
        ouu0Var2.setOnLinkClickListener(this);
    }

    @Override // xsna.rp6
    public final void R6(i14 i14Var) {
        tlo0 c;
        int i = i14Var.h;
        if (i == 0) {
            tlo0.Companion.getClass();
            c = tlo0.c.a;
        } else {
            String quantityString = this.itemView.getContext().getResources().getQuantityString(R.plurals.num_attach_short, i);
            tlo0.a aVar = tlo0.Companion;
            Object[] objArr = {Integer.valueOf(i), quantityString};
            aVar.getClass();
            c = tlo0.a.c(R.string.post_attach_cut_show_more, objArr);
        }
        ouu0 ouu0Var = this.F;
        ouu0Var.setLinkText(c);
        ouu0Var.setLinkContentDescription(c);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (bwt0.b()) {
            return;
        }
        this.E.e(Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, q6());
        PostInteract postInteract = this.w;
        if (postInteract != null) {
            postInteract.zb(PostInteract.Type.expand_attach);
        }
    }
}
