package xsna;

import android.text.TextUtils;
import android.util.Size;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.ImageSize;
import com.vk.libvideo.live.api.broadcast_settings.models.BroadcastAuthor;
import com.vk.libvideo.live.api.broadcast_settings.models.BroadcastStream;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.nj8;
import xsna.tlo0;

/* compiled from: BroadcastSettingsStreamViewHolder.kt */
/* loaded from: classes3.dex */
public final class jj8 extends mj8 {
    public final izs<BroadcastStream, s3q0> m;
    public final Object n;
    public final VkCell o;

    public jj8(ViewGroup viewGroup, a8 a8Var) {
        super(viewGroup, R.layout.live_brodacast_settings_stream_item, 0);
        this.m = a8Var;
        this.n = msy.a(LazyThreadSafetyMode.NONE, new com.vk.movika.sdk.base.logic.processor.actions.f(this, 10));
        VkCell vkCell = (VkCell) this.itemView;
        vkCell.setLeftMainViewController(new hj8());
        this.o = vkCell;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x006c, code lost:
    
        if (((com.vk.libvideo.live.api.broadcast_settings.models.BroadcastStream.Upcoming) r2).b.Na() > 0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005d  */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.mj8
    /* renamed from: j6, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i6(nj8.e eVar) {
        baf0 x;
        String str;
        String title;
        BroadcastAuthor broadcastAuthor;
        String str2;
        String a;
        BroadcastStream broadcastStream = eVar.c;
        boolean z = broadcastStream instanceof BroadcastStream.New;
        if (z) {
            x = dhr0.x(R.drawable.vk_icon_live_outline_28, R.attr.vk_ui_vkontakte_color_placeholder_icon_foreground_secondary, this.itemView.getContext());
        } else {
            if (!(broadcastStream instanceof BroadcastStream.Upcoming)) {
                throw new NoWhenBranchMatchedException();
            }
            x = dhr0.x(R.drawable.vk_icon_video_28, R.attr.vk_ui_vkontakte_color_placeholder_icon_foreground_secondary, this.itemView.getContext());
        }
        boolean z2 = true;
        if (!z) {
            if (!(broadcastStream instanceof BroadcastStream.Upcoming)) {
                throw new NoWhenBranchMatchedException();
            }
            ImageSize Cb = ((BroadcastStream.Upcoming) broadcastStream).b.getImage().Cb(e3m.a(R.dimen.live_settings_stream_cover_width, this.itemView.getContext()), true, false);
            if (Cb != null) {
                str = Cb.d.d;
                if (!z) {
                    if (!(broadcastStream instanceof BroadcastStream.Upcoming)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                z2 = false;
                VkCell.Left.b a2 = VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.e(new rom0(x, str, z2), new Size(e3m.a(R.dimen.live_settings_stream_cover_width, this.itemView.getContext()), e3m.a(R.dimen.live_settings_stream_cover_height, this.itemView.getContext()))));
                VkCell vkCell = this.o;
                vkCell.setLeft(a2);
                if (!z) {
                    title = this.itemView.getContext().getString(R.string.live_broadcast_settings_stream_new);
                } else {
                    if (!(broadcastStream instanceof BroadcastStream.Upcoming)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    title = ((BroadcastStream.Upcoming) broadcastStream).b.getTitle();
                }
                broadcastAuthor = eVar.b;
                if (!(broadcastAuthor instanceof BroadcastAuthor.CurrentUser)) {
                    str2 = ((BroadcastAuthor.CurrentUser) broadcastAuthor).b.e;
                } else {
                    if (!(broadcastAuthor instanceof BroadcastAuthor.Group)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str2 = ((BroadcastAuthor.Group) broadcastAuthor).b.d;
                }
                if (!z) {
                    a = this.itemView.getContext().getString(R.string.live_broadcast_settings_stream_now);
                } else {
                    if (!(broadcastStream instanceof BroadcastStream.Upcoming)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    BroadcastStream.Upcoming upcoming = (BroadcastStream.Upcoming) broadcastStream;
                    a = upcoming.b.Na() > 0 ? ((vj8) this.n.getValue()).a(upcoming.b.Na() * 1000) : this.itemView.getContext().getString(R.string.live_broadcast_settings_stream_now);
                }
                VkCell.Middle.a aVar = VkCell.Middle.Companion;
                tlo0.h d = oq.d(tlo0.Companion, title);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                vkCell.setMiddle(VkCell.Middle.a.a(aVar, new VkCell.Middle.e(d, 1, truncateAt, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), new VkCell.Middle.d(new tlo0.h(str2), (gzs) null, 2, truncateAt, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 50), new VkCell.Middle.c(new tlo0.h(a), null, 2, 2), 8));
                vkCell.setRight(VkCell.Right.c.a(VkCell.Right.Companion, null, null, new VkCell.Right.ExtraAction.a(4, new xk(4, this, eVar), eVar.d), null, 27));
                bwt0.j0(vkCell, new ij8(0, this, eVar), 100L);
            }
        }
        str = null;
        if (!z) {
        }
        z2 = false;
        VkCell.Left.b a22 = VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.e(new rom0(x, str, z2), new Size(e3m.a(R.dimen.live_settings_stream_cover_width, this.itemView.getContext()), e3m.a(R.dimen.live_settings_stream_cover_height, this.itemView.getContext()))));
        VkCell vkCell2 = this.o;
        vkCell2.setLeft(a22);
        if (!z) {
        }
        broadcastAuthor = eVar.b;
        if (!(broadcastAuthor instanceof BroadcastAuthor.CurrentUser)) {
        }
        if (!z) {
        }
        VkCell.Middle.a aVar2 = VkCell.Middle.Companion;
        tlo0.h d2 = oq.d(tlo0.Companion, title);
        TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
        vkCell2.setMiddle(VkCell.Middle.a.a(aVar2, new VkCell.Middle.e(d2, 1, truncateAt2, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), new VkCell.Middle.d(new tlo0.h(str2), (gzs) null, 2, truncateAt2, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 50), new VkCell.Middle.c(new tlo0.h(a), null, 2, 2), 8));
        vkCell2.setRight(VkCell.Right.c.a(VkCell.Right.Companion, null, null, new VkCell.Right.ExtraAction.a(4, new xk(4, this, eVar), eVar.d), null, 27));
        bwt0.j0(vkCell2, new ij8(0, this, eVar), 100L);
    }
}
