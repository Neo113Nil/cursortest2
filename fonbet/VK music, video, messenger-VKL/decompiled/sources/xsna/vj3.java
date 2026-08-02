package xsna;

import android.text.TextUtils;
import android.util.Size;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkCell;
import com.vkontakte.android.R;

/* compiled from: ArchivedCommunityPostCommentViewHolder.kt */
/* loaded from: classes4.dex */
public final class vj3 extends g56 {
    public final VkCell r;
    public final VkCell.Middle.d s;

    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.Lazy] */
    public vj3(ViewGroup viewGroup, afg afgVar) {
        super(R.layout.community_post_comment_deleted, viewGroup, afgVar);
        VkCell vkCell = (VkCell) this.itemView.findViewById(R.id.comment_cell);
        this.r = vkCell;
        this.s = new VkCell.Middle.d(tq.h(tlo0.Companion, R.string.comment_deleted), (gzs) null, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62);
        vkCell.setLeftMainViewController((VkCell.e) this.q.getValue());
        float f = 36;
        vkCell.setLeft(VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.e(new i56(), new Size(iah0.a(f), iah0.a(f)))));
    }

    @Override // xsna.vif0
    public final void i6(iag iagVar) {
        VkCell.Middle.e eVar;
        iag iagVar2 = iagVar;
        VkCell.Middle.a aVar = VkCell.Middle.Companion;
        String y1 = iagVar2.y1();
        if (y1 != null) {
            eVar = new VkCell.Middle.e(oq.d(tlo0.Companion, y1), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62);
        } else {
            eVar = null;
        }
        this.r.setMiddle(VkCell.Middle.a.a(aVar, eVar, this.s, null, 12));
        super.x6(iagVar2);
    }
}
