package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.dto.compilation.Compilation;
import com.vk.dto.masks.Mask;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.k1u0;
import xsna.lz5;
import xsna.mih0;
import xsna.tlo0;

/* compiled from: ClipBadgesModalAdapter.kt */
/* loaded from: classes17.dex */
public final class emc extends sxm {
    public final ah3 i;

    /* compiled from: ClipBadgesModalAdapter.kt */
    public class a<Item extends mih0> extends vfz<Item> {
        public a(FrameLayout frameLayout) {
            super(frameLayout);
        }

        public final void h6(Item item) {
            View view = this.itemView;
            bwt0.i0(view, new mh4(6, emc.this, item));
            boolean b = item.b();
            view.setClickable(b);
            view.setFocusable(b);
        }
    }

    /* compiled from: ClipBadgesModalAdapter.kt */
    public class b<Item extends mih0> extends a<Item> {
        public final VkCell m;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b(emc emcVar, ViewGroup viewGroup) {
            super(r0);
            VkCell vkCell = new VkCell(viewGroup.getContext(), null, 6, 0);
            vkCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            s3q0 s3q0Var = s3q0.a;
            this.m = (VkCell) this.itemView;
        }
    }

    /* compiled from: ClipBadgesModalAdapter.kt */
    public final class c extends b<mih0.a> {
        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(hfz hfzVar) {
            mih0.a aVar = (mih0.a) hfzVar;
            h6(aVar);
            Parcelable parcelable = aVar.i.c;
            Compilation compilation = parcelable instanceof Compilation ? (Compilation) parcelable : null;
            if (compilation == null) {
                throw new IllegalStateException("SdkCompilation.extendedModel isn't Compilation model");
            }
            tlo0.a aVar2 = tlo0.Companion;
            String str = compilation.c;
            if (str == null) {
                str = "";
            }
            VkCell.Middle.b bVar = new VkCell.Middle.b(new VkCell.Middle.e(oq.d(aVar2, str), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), new VkCell.Middle.d(new tlo0.h(uqm0.i(compilation.d, R.plurals.clips_count, R.string.clips_count_formatted, true)), (gzs) null, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62), (VkCell.Middle.c) null, (VkCell.Middle.Size) null, 12);
            VkCell vkCell = this.m;
            vkCell.setMiddle(bVar);
            vkCell.setLeftMainPictureController(new mz5(this.itemView.getContext(), R.drawable.vk_icon_cards_2_outline_28));
            vkCell.setLeft(new VkCell.Left.b(new VkCell.Left.Main.d(new lz5.a(compilation.f), VkCell.Left.Main.Size.Medium), null));
            vkCell.setRight(new VkCell.Right.d((VkCell.Right.a) null, (VkCell.Right.e) null, (VkCell.Right.ExtraAction.a) null, new VkCell.Right.b((izs) null, (tlo0.f) null, (k1u0.a) null, 7), 23));
        }
    }

    /* compiled from: ClipBadgesModalAdapter.kt */
    public final class d extends b<mih0.c> {
        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(hfz hfzVar) {
            mih0.c cVar = (mih0.c) hfzVar;
            h6(cVar);
            VkCell.Middle.b bVar = new VkCell.Middle.b(new VkCell.Middle.e(oq.d(tlo0.Companion, cVar.i.getTitle()), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), (VkCell.Middle.d) null, (VkCell.Middle.c) null, (VkCell.Middle.Size) null, 14);
            VkCell vkCell = this.m;
            vkCell.setMiddle(bVar);
            Context context = this.itemView.getContext();
            e3m.a aVar = e3m.a;
            Drawable a = m33.a(R.drawable.vk_icon_place_outline_28, context);
            if (a != null) {
                a.setTint(e3m.f(R.attr.vk_ui_icon_contrast, context));
            } else {
                a = null;
            }
            hny hnyVar = new hny(context);
            hnyVar.a(e3m.a(R.dimen.clips_additions_bottomsheet_preview_corner_radius, context), R.color.vk_gray_850);
            hnyVar.b(a);
            vkCell.setLeftMainPictureController(new mz5(hnyVar));
            vkCell.setLeft(new VkCell.Left.b(new VkCell.Left.Main.d(new lz5.a((String) null), VkCell.Left.Main.Size.Medium), null));
            vkCell.setRight(new VkCell.Right.d((VkCell.Right.a) null, (VkCell.Right.e) null, (VkCell.Right.ExtraAction.a) null, new VkCell.Right.b((izs) null, (tlo0.f) null, (k1u0.a) null, 7), 23));
        }
    }

    /* compiled from: ClipBadgesModalAdapter.kt */
    public final class e extends a<mih0.e> {
        public final VkGroupHeader m;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public e(emc emcVar, ViewGroup viewGroup) {
            super(r0);
            VkGroupHeader vkGroupHeader = new VkGroupHeader(viewGroup.getContext(), null, 6);
            vkGroupHeader.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            vkGroupHeader.setSize(VkGroupHeader.Size.Medium);
            s3q0 s3q0Var = s3q0.a;
            this.m = (VkGroupHeader) this.itemView;
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(hfz hfzVar) {
            mih0.e eVar = (mih0.e) hfzVar;
            h6(eVar);
            VkGroupHeader vkGroupHeader = this.m;
            vkGroupHeader.setTitle(new VkGroupHeader.d(vkGroupHeader.getContext().getString(eVar.i), null, null, null, 0, null, 510));
            vkGroupHeader.setShowTopDivider(true);
        }
    }

    /* compiled from: ClipBadgesModalAdapter.kt */
    public final class f extends b<mih0.g> {
        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(hfz hfzVar) {
            mih0.g gVar = (mih0.g) hfzVar;
            h6(gVar);
            Mask s = ine0.s(gVar.i);
            VkCell vkCell = this.m;
            SpannableStringBuilder h = fz5.h(s, vkCell.getContext());
            tlo0.a aVar = tlo0.Companion;
            String str = s.g;
            if (str == null) {
                str = "";
            }
            vkCell.setMiddle(new VkCell.Middle.b(new VkCell.Middle.e(oq.d(aVar, str), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), new VkCell.Middle.d(new tlo0.h(h), (gzs) null, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62), (VkCell.Middle.c) null, (VkCell.Middle.Size) null, 12));
            Context context = this.itemView.getContext();
            int i = s.u ? R.drawable.vk_icon_stars_outline_28 : R.drawable.vk_icon_masks_outline_28;
            e3m.a aVar2 = e3m.a;
            Drawable a = m33.a(i, context);
            if (a != null) {
                a.setTint(e3m.f(R.attr.vk_ui_icon_secondary, context));
            } else {
                a = null;
            }
            hny hnyVar = new hny(context);
            hnyVar.a(e3m.a(R.dimen.clips_additions_bottomsheet_preview_corner_radius, context), R.color.vk_gray_850);
            hnyVar.b(a);
            vkCell.setLeftMainPictureController(new mz5(hnyVar));
            vkCell.setLeft(new VkCell.Left.b(new VkCell.Left.Main.d(new lz5.a(s.l), VkCell.Left.Main.Size.Medium), null));
            vkCell.setRight(new VkCell.Right.d((VkCell.Right.a) null, (VkCell.Right.e) null, (VkCell.Right.ExtraAction.a) null, new VkCell.Right.b((izs) null, (tlo0.f) null, (k1u0.a) null, 7), 23));
        }
    }

    /* compiled from: ClipBadgesModalAdapter.kt */
    public final class g extends b<mih0.l.b> {
        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(hfz hfzVar) {
            mih0.l.b bVar = (mih0.l.b) hfzVar;
            h6(bVar);
            ClipsPlaylist clipsPlaylist = bVar.i;
            String i = uqm0.i(clipsPlaylist.e, R.plurals.clips_count, R.string.clips_count_formatted, true);
            tlo0.a aVar = tlo0.Companion;
            String str = clipsPlaylist.c;
            if (str == null) {
                str = "";
            }
            VkCell.Middle.b bVar2 = new VkCell.Middle.b(new VkCell.Middle.e(oq.d(aVar, str), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), new VkCell.Middle.d(new tlo0.h(i), (gzs) null, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62), (VkCell.Middle.c) null, (VkCell.Middle.Size) null, 12);
            VkCell vkCell = this.m;
            vkCell.setMiddle(bVar2);
            vkCell.setLeftMainPictureController(new mz5(this.itemView.getContext(), R.drawable.vk_icon_list_play_outline_28));
            String str2 = (String) j5g.a0(clipsPlaylist.d);
            if (str2 != null) {
                vkCell.setLeft(new VkCell.Left.b(new VkCell.Left.Main.d(new lz5.a(str2), VkCell.Left.Main.Size.Medium), null));
            } else {
                vkCell.setLeft((VkCell.Left.b) null);
            }
            vkCell.setRight(new VkCell.Right.d((VkCell.Right.a) null, (VkCell.Right.e) null, (VkCell.Right.ExtraAction.a) null, new VkCell.Right.b((izs) null, (tlo0.f) null, (k1u0.a) null, 7), 23));
        }
    }

    public emc(ah3 ah3Var) {
        this.i = ah3Var;
        x0(mih0.c.class, new k00(this, 23));
        x0(mih0.g.class, new l00(this, 16));
        x0(mih0.a.class, new n40(this, 19));
        x0(mih0.e.class, new qm1(this, 23));
        x0(mih0.l.b.class, new p40(this, 26));
    }
}
