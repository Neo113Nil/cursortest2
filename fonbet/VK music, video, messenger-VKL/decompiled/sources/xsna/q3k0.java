package xsna;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import com.vk.catalog2.common.dto.api.Meta;
import com.vk.catalog2.common.dto.api.link.CatalogLink;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.catalog2.common.ui.holders.LinkVh;
import com.vk.core.view.components.cell.VkCell;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: SmallPlaylistItemVh.kt */
/* loaded from: classes16.dex */
public final class q3k0 extends k9z {
    public final View l;
    public final wzs<View, UIBlockLink, View.OnClickListener> m;
    public final bpn0 n;
    public final VkCell o;

    public q3k0(View view, k7a k7aVar, LinkVh.a aVar, nq1 nq1Var) {
        super(view);
        this.l = view;
        this.m = nq1Var;
        this.n = new bpn0(new vpj0(this, 1));
        VkCell vkCell = (VkCell) view.findViewById(R.id.cell);
        vkCell.setLeftMainPictureController(new o3k0(k7aVar, aVar));
        this.o = vkCell;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.k9z
    public final void V5(UIBlockLink uIBlockLink) {
        Bitmap b;
        View view = this.itemView;
        view.setOnClickListener(this.m.invoke(view, uIBlockLink));
        CatalogLink catalogLink = uIBlockLink.y;
        Meta meta = catalogLink.g;
        String str = catalogLink.d;
        String str2 = catalogLink.c;
        if (meta != null && meta.h) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
            spannableStringBuilder.insert(0, (CharSequence) "  ");
            Drawable drawable = (Drawable) this.n.getValue();
            spannableStringBuilder.setSpan((drawable == null || (b = xjo.b(drawable, 0, 0, 7)) == null) ? null : new ImageSpan(this.itemView.getContext(), b, 2), 0, 1, 0);
            str2 = spannableStringBuilder;
        }
        if (str.length() == 0) {
            str = null;
        }
        VkCell.Left.b a = VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.d(new p3k0(catalogLink.k, uIBlockLink), VkCell.Left.Main.Size.Small));
        VkCell vkCell = this.o;
        vkCell.setLeft(a);
        tlo0.h f = u11.f(tlo0.Companion, str2);
        int i = str == null ? 2 : 1;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        vkCell.setMiddle(new VkCell.Middle.b(new VkCell.Middle.e(f, i, truncateAt, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), str == null ? null : new VkCell.Middle.d(new tlo0.h(str), (gzs) null, 1, truncateAt, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 50), (VkCell.Middle.c) null, (VkCell.Middle.Size) null, 12));
    }
}
