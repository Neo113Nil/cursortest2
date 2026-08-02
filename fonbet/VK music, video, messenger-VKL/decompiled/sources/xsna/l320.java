package xsna;

import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.tool.view.AdaptiveHorizontalLinearLayout;
import com.vk.core.view.components.cell.VkCell;
import com.vk.mentions.MentionProfileVO;
import xsna.p320;
import xsna.tlo0;

/* compiled from: MentionAdapter.kt */
/* loaded from: classes3.dex */
public final class l320 extends zoj0<MentionProfileVO, p320> {
    public c420 e;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        p320 p320Var = (p320) e0Var;
        MentionProfileVO mentionProfileVO = (MentionProfileVO) this.c.c(i);
        p320Var.itemView.setOnClickListener(new f9m(1, p320Var, mentionProfileVO));
        VkCell.Left.Main.a aVar = new VkCell.Left.Main.a(new p320.c(mentionProfileVO.e), VkCell.Left.Main.Size.Small);
        VkCell vkCell = p320Var.m;
        vkCell.setLeft(VkCell.Left.a.a(VkCell.Left.Companion, aVar));
        vkCell.setMiddle(VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e(oq.d(tlo0.Companion, mentionProfileVO.c), 1, TextUtils.TruncateAt.END, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), null, null, 14));
        VkCell.Right.c cVar = VkCell.Right.Companion;
        tlo0.h hVar = new tlo0.h("@".concat(mentionProfileVO.f));
        vkCell.setRight(VkCell.Right.c.a(cVar, new VkCell.Right.a.e(hVar, hVar), null, null, null, 30));
        vkCell.setRightAdaptivity(AdaptiveHorizontalLinearLayout.LayoutParams.Adaptivity.SHRINK);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new p320(viewGroup, new fgh(this, 29));
    }
}
