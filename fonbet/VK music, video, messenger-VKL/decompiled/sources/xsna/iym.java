package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.newsfeed.Counters;
import com.vk.dto.newsfeed.entries.DigestItem;

/* compiled from: DigestInversedListItemHolder.kt */
/* loaded from: classes4.dex */
public class iym extends uym {
    public final lym Q;
    public final VkText R;
    public final VkText S;
    public final View T;
    public final VkText U;
    public final VkImage V;
    public final VkImageSimple W;
    public final int X;

    public iym(ViewGroup viewGroup, lym lymVar) {
        super(viewGroup, lymVar);
        this.Q = lymVar;
        this.R = lymVar.getBadgeView();
        this.S = lymVar.getCommentsDividerView();
        this.T = lymVar.getCommentsIconView();
        this.U = lymVar.getCommentsCounterView();
        this.V = lymVar.getAttachThumb();
        this.W = lymVar.getOverlayView();
        this.X = cn70.b(64);
        this.F.setOnClickListener(this);
        VkImage vkImage = this.I;
        getContext();
        vkImage.setCornerRadius(cn70.a() * 8.0f);
        lymVar.setMaxLines(2);
    }

    @Override // xsna.uym, xsna.jym
    public void R6(DigestItem digestItem) {
        super.R6(digestItem);
        xo9.A(this.R, digestItem.i);
        Counters counters = digestItem.g.E;
        int i = counters.e;
        View view = this.T;
        VkText vkText = this.S;
        VkText vkText2 = this.U;
        if (i <= 0) {
            bwt0.p0(vkText, false);
            bwt0.p0(vkText2, false);
            bwt0.p0(view, false);
        } else {
            bwt0.p0(vkText, true);
            bwt0.p0(vkText2, true);
            bwt0.p0(view, true);
            vkText2.setText(String.valueOf(counters.e));
        }
    }

    @Override // xsna.uym
    public final boolean b7() {
        return false;
    }

    @Override // xsna.uym
    public final int e7() {
        return this.X;
    }

    @Override // xsna.uym
    public void i7(boolean z) {
        if (z) {
            return;
        }
        bwt0.p0(this.V, false);
        bwt0.p0(this.W, false);
    }
}
