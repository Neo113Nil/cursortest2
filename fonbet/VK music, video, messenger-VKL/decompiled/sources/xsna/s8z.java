package xsna;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.util.measure.ScaleType;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.image.VkEnhancedImageView;
import com.vk.im.engine.models.attaches.AttachLink;
import com.vk.im.ui.components.attaches_history.attaches.model.simple.SimpleAttachListItem;
import com.vkontakte.android.R;
import java.util.Locale;
import kotlin.Result;
import xsna.tlo0;

/* compiled from: LinkAttachViewTypeDelegate.kt */
/* loaded from: classes2.dex */
public final class s8z extends p1u0<SimpleAttachListItem> {
    public j0u0 a;

    /* compiled from: LinkAttachViewTypeDelegate.kt */
    public final class a extends vfz<SimpleAttachListItem> {
        public final VkCell l;

        public a(View view) {
            super(view);
            VkCell vkCell = (VkCell) view.findViewById(R.id.vkim_cell_item);
            this.l = vkCell;
            vkCell.setLeftMainViewController(c.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.vfz
        public final void W5(SimpleAttachListItem simpleAttachListItem) {
            SimpleAttachListItem simpleAttachListItem2 = simpleAttachListItem;
            AttachLink attachLink = (AttachLink) simpleAttachListItem2.b.d;
            VkCell.Left.b a = VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.e(new d(attachLink), new Size(iah0.a(84), iah0.a(72))));
            VkCell vkCell = this.l;
            vkCell.setLeft(a);
            VkCell.Middle.a aVar = VkCell.Middle.Companion;
            tlo0.h d = oq.d(tlo0.Companion, attachLink.f);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            vkCell.setMiddle(VkCell.Middle.a.a(aVar, new VkCell.Middle.e(d, 2, truncateAt, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), new VkCell.Middle.d((tlo0) new tlo0.h(attachLink.e), (gzs) (0 == true ? 1 : 0), 1, truncateAt, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 50), null, 12));
            VkCell.Right.c cVar = VkCell.Right.Companion;
            s8z s8zVar = s8z.this;
            vkCell.setRight(VkCell.Right.c.a(cVar, null, null, new VkCell.Right.ExtraAction.d(new a2c(s8zVar, this, simpleAttachListItem2, 1), new tlo0.f(R.string.vkim_accessibility_options), 4), null, 27));
            bwt0.i0(vkCell, new g86(10, s8zVar, attachLink));
            bwt0.k0(vkCell, new ya(23, s8zVar, attachLink));
        }
    }

    /* compiled from: LinkAttachViewTypeDelegate.kt */
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
            Object failure;
            String str;
            Character y0;
            if (fVar instanceof d) {
                AttachLink attachLink = ((d) fVar).a;
                boolean Jb = attachLink.i.Jb();
                VkEnhancedImageView vkEnhancedImageView = this.a;
                if (Jb) {
                    vkEnhancedImageView.setRemoteImages(attachLink.i.b);
                    return;
                }
                try {
                    Uri parse = Uri.parse(attachLink.e);
                    failure = parse != null ? parse.getHost() : null;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                String str2 = "";
                if (Result.a(failure) == null && (str = (String) failure) != null && (y0 = erm0.y0(str)) != null) {
                    str2 = String.valueOf(y0.charValue()).toUpperCase(Locale.ROOT);
                }
                hny hnyVar = new hny(vkEnhancedImageView.getContext());
                hnyVar.c(cn70.c(2), R.attr.vk_ui_image_placeholder);
                hnyVar.b(new aeo0(vkEnhancedImageView.getContext().getResources(), str2, 0, 28.0f, dhr0.t.c(R.attr.vk_ui_vkontakte_color_placeholder_icon_foreground_secondary)));
                vkEnhancedImageView.setImageDrawable(hnyVar);
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }
    }

    /* compiled from: LinkAttachViewTypeDelegate.kt */
    public static final class c implements VkCell.e {
        public static final c a = new c();

        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new b(context);
        }
    }

    /* compiled from: LinkAttachViewTypeDelegate.kt */
    public static final class d implements VkCell.f {
        public final AttachLink a;

        public d(AttachLink attachLink) {
            this.a = attachLink;
        }
    }

    @Override // xsna.p1u0
    public final vfz<? extends SimpleAttachListItem> b(ViewGroup viewGroup) {
        return new a(bwt0.I(R.layout.vkim_cell_item, viewGroup, false));
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return (hfzVar instanceof SimpleAttachListItem) && (((SimpleAttachListItem) hfzVar).b.d instanceof AttachLink);
    }
}
