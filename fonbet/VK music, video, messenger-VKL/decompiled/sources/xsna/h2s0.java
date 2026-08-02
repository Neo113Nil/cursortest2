package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Size;
import android.view.ViewGroup;
import com.vk.core.utils.b;
import com.vk.core.view.VideoRestrictionView;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.MusicVideoParams;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.attaches.HistoryAttach;
import com.vk.im.ui.components.attaches_history.attaches.model.simple.SimpleAttachListItem;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.k1u0;
import xsna.tlo0;

/* compiled from: VideoAttachViewTypeDelegateV2.kt */
/* loaded from: classes2.dex */
public final class h2s0 extends p1u0<SimpleAttachListItem> {
    public m6a a;

    /* compiled from: VideoAttachViewTypeDelegateV2.kt */
    public final class a extends vfz<SimpleAttachListItem> {
        public final VkCell l;
        public HistoryAttach m;
        public io.reactivex.rxjava3.disposables.c n;
        public final Drawable o;
        public final dpg0 p;
        public final coo q;

        public a(VkCell vkCell) {
            super(vkCell);
            this.l = vkCell;
            int i = VideoRestrictionView.d;
            VideoRestrictionView.a.a(iah0.a(2), this.itemView.getContext());
            Context context = this.itemView.getContext();
            e3m.a aVar = e3m.a;
            this.o = m33.a(R.drawable.default_placeholder_2, context);
            Drawable a = m33.a(R.drawable.ic_videos_placeholder, this.itemView.getContext());
            this.p = a != null ? new dpg0(a, iah0.a(r2)) : null;
            this.q = new coo(this.itemView.getContext());
            bwt0.i0(vkCell, new gs80(6, this, h2s0.this));
            vkCell.c(new l5r0(2), new com.vk.movika.tools.controls.seekbar.i(this, 21));
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(SimpleAttachListItem simpleAttachListItem) {
            CharSequence title;
            CharSequence quantityString;
            int i;
            String str;
            HistoryAttach historyAttach = simpleAttachListItem.b;
            this.m = historyAttach;
            AttachVideo attachVideo = (AttachVideo) historyAttach.d;
            MusicVideoParams i2 = attachVideo.i();
            if (epx.f(attachVideo.b.getType(), "music_video")) {
                title = s490.d(this.itemView.getContext(), attachVideo.getTitle(), i2 != null ? i2.b : null, R.attr.vk_ui_text_secondary);
                quantityString = s490.d(this.itemView.getContext(), s490.i(i2 != null ? i2.f : null), s490.c(i2 != null ? i2.g : null), R.attr.vk_ui_text_secondary);
                str = b.C0795b.d(i2 != null ? i2.c : 0L, i2 != null ? i2.e : null);
                i = 1;
            } else {
                title = attachVideo.getTitle();
                quantityString = this.itemView.getContext().getResources().getQuantityString(R.plurals.vkim_history_attaches_video_views, attachVideo.b.L8(), Integer.valueOf(attachVideo.b.L8()));
                i = 2;
                str = null;
            }
            VkCell.Middle.e.b.C0817b c0817b = (i2 == null || !i2.d) ? null : new VkCell.Middle.e.b.C0817b(new gko(R.drawable.vk_icon_error_circle_12), new k1u0.a(new x7g(R.attr.vk_ui_icon_tertiary)), (tlo0.f) null, (Size) null, 12);
            VkCell.Middle.a aVar = VkCell.Middle.Companion;
            tlo0.h f = u11.f(tlo0.Companion, title);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            VkCell.Middle.b a = VkCell.Middle.a.a(aVar, new VkCell.Middle.e(f, i, truncateAt, (VkCell.Middle.e.b) null, c0817b, 18), new VkCell.Middle.d(new tlo0.h(quantityString), (gzs) null, 1, truncateAt, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 50), str != null ? new VkCell.Middle.c(new tlo0.h(str), null, 1, 2) : null, 8);
            VkCell vkCell = this.l;
            vkCell.setMiddle(a);
            vkCell.setRight(VkCell.Right.c.a(VkCell.Right.Companion, null, null, new VkCell.Right.ExtraAction.d(new hc1(26, this, h2s0.this), new tlo0.f(R.string.vkim_accessibility_options), 4), null, 27));
            vkCell.setLeft(VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.e(new b(attachVideo, attachVideo.c), new Size(-2, -2))));
        }
    }

    /* compiled from: VideoAttachViewTypeDelegateV2.kt */
    public static final class b implements VkCell.f {
        public final AttachVideo a;
        public final ImageList b;

        public b(AttachVideo attachVideo, ImageList imageList) {
            this.a = attachVideo;
            this.b = imageList;
        }
    }

    @Override // xsna.p1u0
    public final vfz<? extends SimpleAttachListItem> b(ViewGroup viewGroup) {
        return new a((VkCell) bwt0.I(R.layout.vkim_history_attach_video_v2, viewGroup, false));
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return (hfzVar instanceof SimpleAttachListItem) && (((SimpleAttachListItem) hfzVar).b.d instanceof AttachVideo);
    }
}
