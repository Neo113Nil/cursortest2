package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.stickers.views.VKStickerImageView;
import com.vk.vmoji.character.model.ImageListModel;
import com.vk.vmoji.character.model.StickerModel;
import com.vk.vmoji.character.model.VmojiStickerPackPreviewModel;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: VmojiCharacterMyStickerPackHolder.kt */
/* loaded from: classes7.dex */
public final class f7w0 extends u6w0<g7w0> {
    public static final int t = cn70.b(6);
    public static final int u = cn70.b(94);
    public final b8w0 l;
    public final TextView m;
    public final TextView n;
    public final View o;
    public final View p;
    public final LinearLayout q;
    public final LinearLayout r;
    public List<StickerModel> s;

    public f7w0(ViewGroup viewGroup, b8w0 b8w0Var) {
        super(R.layout.vmoji_character_my_sticker_pack_item, viewGroup);
        this.l = b8w0Var;
        this.m = (TextView) this.itemView.findViewById(R.id.title);
        this.n = (TextView) this.itemView.findViewById(R.id.description);
        this.o = this.itemView.findViewById(R.id.more);
        this.p = this.itemView.findViewById(R.id.show);
        LinearLayout linearLayout = (LinearLayout) this.itemView.findViewById(R.id.first_row);
        this.q = linearLayout;
        this.r = (LinearLayout) this.itemView.findViewById(R.id.second_row);
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = linearLayout.getMeasuredWidth();
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        ref$IntRef2.element = linearLayout.getMeasuredHeight();
        f4m.a(linearLayout, new dab(linearLayout, ref$IntRef, ref$IntRef2, this, 1));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(hfz hfzVar) {
        g7w0 g7w0Var = (g7w0) hfzVar;
        VmojiStickerPackPreviewModel vmojiStickerPackPreviewModel = g7w0Var.b;
        this.m.setText(vmojiStickerPackPreviewModel.c);
        this.n.setText(vmojiStickerPackPreviewModel.d);
        boolean z = g7w0Var.c;
        View view = this.o;
        bwt0.p0(view, z);
        jjc.g(view, new o6i0(11, this, g7w0Var));
        jjc.g(this.p, new r770(12, this, g7w0Var));
        List<StickerModel> list = vmojiStickerPackPreviewModel.k;
        this.s = list;
        i6(this.q.getWidth(), list);
    }

    public final VKStickerImageView h6(StickerModel stickerModel, int i) {
        ImageListModel.ImageModel zb;
        ImageListModel.ImageModel zb2;
        String str = null;
        VKStickerImageView vKStickerImageView = new VKStickerImageView(this.itemView.getContext(), null, 6, 0);
        int b = cn70.b(8);
        vKStickerImageView.setPadding(b, b, b, b);
        vKStickerImageView.setAspectRatio(1.0f);
        vKStickerImageView.setClickable(true);
        vKStickerImageView.getHierarchy().d.setVisible(true, true);
        vKStickerImageView.getHierarchy().q(0);
        vKStickerImageView.setContentDescription(vKStickerImageView.getContext().getString(R.string.stickers_accessibility_sticker));
        Integer num = stickerModel.b;
        ImageListModel imageListModel = stickerModel.d;
        vKStickerImageView.setTag(R.id.id, num);
        boolean c = dhr0.a.c(vKStickerImageView.getContext());
        ImageListModel imageListModel2 = stickerModel.e;
        String str2 = (imageListModel2 == null || (zb2 = imageListModel2.zb(i)) == null) ? null : zb2.b;
        if (c && str2 != null) {
            str = str2;
        } else if (imageListModel != null && (zb = imageListModel.zb(i)) != null) {
            str = zb.b;
        }
        if (str != null) {
            vKStickerImageView.load(str);
            return vKStickerImageView;
        }
        com.vk.metrics.eventtracking.b.a.q(new IllegalArgumentException("There is no required sticker image size; size:" + i + "; imgs:" + imageListModel + "; imgsBg:" + imageListModel2));
        return vKStickerImageView;
    }

    public final void i6(int i, List list) {
        List list2 = list;
        if (list2 == null || list2.isEmpty() || i == 0) {
            return;
        }
        LinearLayout linearLayout = this.q;
        linearLayout.removeAllViews();
        LinearLayout linearLayout2 = this.r;
        linearLayout2.removeAllViews();
        int i2 = t;
        int i3 = (i + i2) / (u + i2);
        if (i3 > 6) {
            i3 = 6;
        }
        int i4 = (i - ((i2 * 2) * i3)) / i3;
        List list3 = list;
        Iterator it = j5g.H0(list3, i3).iterator();
        while (it.hasNext()) {
            VKStickerImageView h6 = h6((StickerModel) it.next(), i4);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i4, i4);
            layoutParams.setMargins(i2, 0, i2, 0);
            linearLayout.addView(h6, layoutParams);
        }
        if (i3 > 3) {
            f4m.j(linearLayout2);
            return;
        }
        Iterator it2 = j5g.H0(j5g.S(list3, i3), i3).iterator();
        while (it2.hasNext()) {
            VKStickerImageView h62 = h6((StickerModel) it2.next(), i4);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i4, i4);
            layoutParams2.setMargins(i2, 0, i2, 0);
            linearLayout2.addView(h62, layoutParams2);
        }
        linearLayout2.setVisibility(0);
    }
}
