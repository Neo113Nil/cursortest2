package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Size;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.music.Playlist;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.k1u0;
import xsna.tlo0;

/* compiled from: PlaylistCellViewHolder.kt */
/* loaded from: classes3.dex */
public final class b8b0 extends se50<Playlist> {
    public final boolean n;
    public final long o;
    public final ap30 p;
    public final VkCell q;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b8b0(ViewGroup viewGroup, boolean z, long j, ap30 ap30Var) {
        super(r0);
        VkCell vkCell = new VkCell(viewGroup.getContext(), null, 6, 0);
        vkCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        vkCell.setLeftMainPictureController(ccb0.a);
        this.n = z;
        this.o = j;
        this.p = ap30Var;
        this.q = (VkCell) this.itemView;
    }

    @Override // xsna.se50
    public final void b6(Playlist playlist) {
        Playlist playlist2 = playlist;
        String str = playlist2.i;
        VkCell.Left.b a = VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.d(new dcb0(playlist2.m, playlist2.p), VkCell.Left.Main.Size.Large));
        VkCell vkCell = this.q;
        vkCell.setLeft(a);
        VkCell.Middle.a aVar = VkCell.Middle.Companion;
        tlo0.a aVar2 = tlo0.Companion;
        String str2 = playlist2.h;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        tlo0.h d = oq.d(aVar2, str2);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        Context context = this.itemView.getContext();
        e3m.a aVar3 = e3m.a;
        Drawable a2 = m33.a(R.drawable.vk_icon_error_circle_fill_gray_12, context);
        VkCell.Middle.d dVar = null;
        VkCell.Middle.e eVar = new VkCell.Middle.e(d, 1, truncateAt, (VkCell.Middle.e.b) null, (!playlist2.k || a2 == null) ? null : new VkCell.Middle.e.b.C0817b(new eko(a2), k1u0.c.a, (tlo0.f) null, (Size) null, 12), 18);
        String d2 = (xx1.x(playlist2) && xx1.w(playlist2)) ? c9b0.d(this.itemView.getContext(), playlist2) : xx1.u(playlist2) ? str == null ? "" : str : c9b0.g(this.itemView.getContext(), playlist2);
        if (d2.length() <= 0) {
            d2 = null;
        }
        if (d2 != null) {
            dVar = new VkCell.Middle.d(new tlo0.h(d2), (gzs) null, playlist2.C ? 2 : 1, truncateAt, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 50);
        }
        if (playlist2.Eb()) {
            Context context2 = this.itemView.getContext();
            int i = playlist2.l;
            boolean z = i != 0;
            boolean f = myc0.f(str);
            if (f && z) {
                str = context2.getString(R.string.music_dot_delimiter, Integer.valueOf(i), str);
            } else if (!f) {
                str = z ? String.valueOf(i) : "";
            }
            str3 = str;
        }
        if (str3.length() <= 0) {
            str3 = null;
        }
        vkCell.setMiddle(VkCell.Middle.a.a(aVar, eVar, dVar, str3 != null ? new VkCell.Middle.c(new tlo0.h(str3), null, 1, 2) : null, 8));
        boolean z2 = this.n;
        vkCell.setRight(z2 ? null : VkCell.Right.c.a(VkCell.Right.Companion, null, null, new VkCell.Right.ExtraAction.d(new nh3(23, this, playlist2), new tlo0.f(R.string.music_talkback_more), 4), null, 27));
        vkCell.setAlpha((z2 && (playlist2.Fb() || playlist2.Db() == this.o)) ? 0.64f : 1.0f);
    }
}
