package xsna;

import android.util.Size;
import android.view.ViewGroup;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vkontakte.android.R;
import xsna.ngv0;

/* compiled from: ArchivedCommunityReplyPostCommentViewHolder.kt */
/* loaded from: classes4.dex */
public final class wj3 extends g56 {
    public final VkRichCell r;
    public final qgv0 s;

    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, kotlin.Lazy] */
    public wj3(ViewGroup viewGroup, afg afgVar) {
        super(R.layout.community_post_comment_reply_deleted, viewGroup, afgVar);
        VkRichCell vkRichCell = (VkRichCell) this.itemView.findViewById(R.id.comment_cell);
        this.r = vkRichCell;
        this.s = new qgv0(tq.h(tlo0.Companion, R.string.comment_deleted), (ngv0.a) null, (ngv0.a) null, 0, 30);
        vkRichCell.setLeftMainViewController((VkCell.e) this.q.getValue());
        float f = 24;
        vkRichCell.setLeft(VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.e(new i56(), new Size(iah0.a(f), iah0.a(f)))));
    }

    @Override // xsna.vif0
    public final void i6(iag iagVar) {
        iag iagVar2 = iagVar;
        String y1 = iagVar2.y1();
        pgv0 v = ahn.v(y1 != null ? new vgv0(oq.d(tlo0.Companion, y1), (ngv0.a) null, (ngv0) null, 0, 30) : null, null, this.s, null, null, null, null, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE);
        VkRichCell vkRichCell = this.r;
        vkRichCell.setMiddle(v);
        f4m.x(getItemViewType() == 454 ? iah0.a(16) : iah0.a(48), vkRichCell);
        f4m.x((iah0.w(this.itemView.getContext()) < iah0.a((float) 388) && getItemViewType() != 454) ? vkRichCell.getPaddingStart() - iah0.a(12) : iah0.a(16) + vkRichCell.getPaddingStart(), this.p);
        super.x6(iagVar2);
    }
}
