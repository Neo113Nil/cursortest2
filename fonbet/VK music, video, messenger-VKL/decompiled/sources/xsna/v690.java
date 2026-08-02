package xsna;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.common.links.LinksParserData;
import com.vkontakte.android.R;

/* compiled from: PackShareHolder.kt */
/* loaded from: classes6.dex */
public final class v690 extends yr6<u690> {
    public final g3l0 l;
    public final View m;
    public final TextView n;

    public v690(g3l0 g3l0Var, ViewGroup viewGroup) {
        super(R.layout.sticker_details_pack_share, viewGroup);
        this.l = g3l0Var;
        this.m = this.itemView.findViewById(R.id.share);
        this.n = (TextView) this.itemView.findViewById(R.id.copyrights);
    }

    @Override // xsna.yr6
    /* renamed from: i6, reason: merged with bridge method [inline-methods] */
    public final void W5(u690 u690Var) {
        this.m.setOnClickListener(new pgr(2, this, u690Var));
        String str = u690Var.b.N;
        TextView textView = this.n;
        if (str == null || drm0.N(str)) {
            f4m.j(textView);
        } else {
            textView.setText(xwk.d().a().d(str, new LinksParserData(779, (Bundle) null, 0, 0, (String) null, (String) null, 0, 0, (LinksParserData.HashtagService) null, (saz) null, 0, (taz) null, false, 16382)));
            textView.setVisibility(0);
        }
    }
}
