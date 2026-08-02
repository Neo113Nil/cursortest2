package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.util.measure.ScaleType;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.image.VkEnhancedImageView;
import com.vk.dto.attaches.AttachDoc;
import com.vk.im.ui.components.attaches_history.attaches.model.simple.SimpleAttachListItem;
import com.vkontakte.android.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import xsna.tlo0;

/* compiled from: DocAttachViewTypeDelegate.kt */
/* loaded from: classes2.dex */
public final class gtn extends vc6 {

    @SuppressLint({"SimpleDateFormat"})
    public final SimpleDateFormat b = new SimpleDateFormat("dd MMMM HH:mm");

    /* compiled from: DocAttachViewTypeDelegate.kt */
    public final class a extends vfz<SimpleAttachListItem> {
        public final VkCell l;

        public a(View view) {
            super(view);
            VkCell vkCell = (VkCell) this.itemView.findViewById(R.id.vkim_cell_item);
            this.l = vkCell;
            vkCell.setLeftMainViewController(c.a);
        }

        @Override // xsna.vfz
        public final void W5(SimpleAttachListItem simpleAttachListItem) {
            SimpleAttachListItem simpleAttachListItem2 = simpleAttachListItem;
            AttachDoc attachDoc = (AttachDoc) simpleAttachListItem2.b.d;
            VkCell.Left.b a = VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.e(new d(attachDoc), new Size(iah0.a(64), iah0.a(48))));
            VkCell vkCell = this.l;
            vkCell.setLeft(a);
            VkCell.Middle.a aVar = VkCell.Middle.Companion;
            tlo0.h d = oq.d(tlo0.Companion, attachDoc.g);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MARQUEE;
            VkCell.Middle.e eVar = new VkCell.Middle.e(d, 1, truncateAt, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50);
            StringBuilder sb = new StringBuilder();
            lar larVar = lar.a;
            long j = attachDoc.h;
            larVar.getClass();
            lar.b(j, sb);
            sb.append(" · ");
            xuo0 xuo0Var = xuo0.a;
            long j2 = attachDoc.m;
            xuo0Var.getClass();
            Date date = new Date(xuo0.d(j2));
            gtn gtnVar = gtn.this;
            sb.append(gtnVar.b.format(date));
            vkCell.setMiddle(VkCell.Middle.a.a(aVar, eVar, new VkCell.Middle.d(new tlo0.h(sb.toString()), (gzs) null, 1, truncateAt, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 50), null, 12));
            vkCell.setRight(VkCell.Right.c.a(VkCell.Right.Companion, null, null, new VkCell.Right.ExtraAction.d(new xo8(gtnVar, this, simpleAttachListItem2, 2), (tlo0.f) null, 6), null, 27));
            bwt0.i0(vkCell, new sy4(gtnVar, attachDoc, this, 2));
        }
    }

    /* compiled from: DocAttachViewTypeDelegate.kt */
    public static final class b implements VkCell.d {
        public final VkEnhancedImageView a;

        public b(Context context) {
            VkEnhancedImageView vkEnhancedImageView = new VkEnhancedImageView(context, null, 6, 0);
            vkEnhancedImageView.setScaleType(ScaleType.CENTER_CROP);
            vkEnhancedImageView.setCornerRadius(cn70.c(2));
            this.a = vkEnhancedImageView;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            if (fVar instanceof d) {
                AttachDoc attachDoc = ((d) fVar).a;
                boolean Jb = attachDoc.n.Jb();
                VkEnhancedImageView vkEnhancedImageView = this.a;
                if (Jb) {
                    vkEnhancedImageView.setRemoteImages(attachDoc.n.b);
                    return;
                }
                String str = attachDoc.j;
                String upperCase = str.substring(0, Math.min(str.length(), 4)).toUpperCase(Locale.ROOT);
                hny hnyVar = new hny(vkEnhancedImageView.getContext());
                hnyVar.c(cn70.c(2), R.attr.vk_ui_image_placeholder);
                hnyVar.b(new aeo0(vkEnhancedImageView.getContext().getResources(), upperCase, 0, 16.0f, dhr0.t.c(R.attr.vk_ui_vkontakte_color_placeholder_icon_foreground_secondary)));
                vkEnhancedImageView.setImageDrawable(hnyVar);
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }
    }

    /* compiled from: DocAttachViewTypeDelegate.kt */
    public static final class c implements VkCell.e {
        public static final c a = new c();

        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new b(context);
        }
    }

    /* compiled from: DocAttachViewTypeDelegate.kt */
    public static final class d implements VkCell.f {
        public final AttachDoc a;

        public d(AttachDoc attachDoc) {
            this.a = attachDoc;
        }
    }

    @Override // xsna.p1u0
    public final vfz<? extends SimpleAttachListItem> b(ViewGroup viewGroup) {
        return new a(bwt0.I(R.layout.vkim_cell_item, viewGroup, false));
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return (hfzVar instanceof SimpleAttachListItem) && (((SimpleAttachListItem) hfzVar).b.d instanceof AttachDoc);
    }
}
