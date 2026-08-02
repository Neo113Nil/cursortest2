package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.ui.fave.FaveTagViewGroup;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.newsfeed.FaveTag;
import com.vk.dto.newsfeed.Owner;
import com.vk.fave.FaveItem;
import com.vk.fave.entities.FaveEntry;
import com.vk.narratives.core.NarrativeCoverView;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: NarrativeFaveHolder.kt */
/* loaded from: classes4.dex */
public final class lu50 extends qi6<FaveEntry> {
    public final NarrativeCoverView C;
    public final TextView D;
    public final TextView E;
    public final View F;
    public final FaveTagViewGroup G;
    public final View H;

    public lu50(ViewGroup viewGroup) {
        super(R.layout.fave_narrative_holder, viewGroup);
        NarrativeCoverView narrativeCoverView = (NarrativeCoverView) this.itemView.findViewById(R.id.cover);
        this.C = narrativeCoverView;
        this.D = (TextView) this.itemView.findViewById(R.id.title);
        this.E = (TextView) this.itemView.findViewById(R.id.owner_name);
        View findViewById = this.itemView.findViewById(R.id.iv_actions);
        this.F = findViewById;
        this.G = (FaveTagViewGroup) this.itemView.findViewById(R.id.ft_tag_group);
        this.H = this.itemView.findViewById(R.id.tag_icon);
        findViewById.setOnClickListener(new yn3(this, 13));
        narrativeCoverView.setBorderType(NarrativeCoverView.BorderType.BLUE);
    }

    @Override // xsna.qi6
    public final void E6(FaveEntry faveEntry) {
        FaveItem faveItem = faveEntry.i;
        gmq gmqVar = faveItem.f;
        Narrative narrative = gmqVar instanceof Narrative ? (Narrative) gmqVar : null;
        if (narrative == null) {
            return;
        }
        this.C.a(narrative);
        String str = narrative.d;
        TextView textView = this.D;
        textView.setText(str);
        Owner owner = narrative.f;
        String str2 = owner != null ? owner.c : null;
        TextView textView2 = this.E;
        textView2.setText(str2);
        List<FaveTag> list = faveItem.e;
        boolean isEmpty = list.isEmpty();
        boolean z = !isEmpty;
        FaveTagViewGroup faveTagViewGroup = this.G;
        faveTagViewGroup.setTags(list);
        bwt0.p0(this.H, z);
        bwt0.p0(faveTagViewGroup, z);
        textView2.setMaxLines(!isEmpty ? 1 : 2);
        jno0.c(textView, narrative.Ab() ? R.attr.vk_ui_text_primary : R.attr.vk_ui_text_secondary);
    }
}
