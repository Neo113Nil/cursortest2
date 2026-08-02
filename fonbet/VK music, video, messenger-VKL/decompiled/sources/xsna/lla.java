package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.picture.VkImage;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.superapp.api.dto.app.catalog.section.AppsCategory;
import com.vkontakte.android.R;
import xsna.jp20;
import xsna.tlo0;
import xsna.x7a;

/* compiled from: CategoryViewHolder.kt */
/* loaded from: classes6.dex */
public final class lla extends e9r0<x7a.d.b> {
    public static final int n = iah0.a(28);
    public final VkCell m;

    /* compiled from: CategoryViewHolder.kt */
    public static final class a implements VkCell.d {
        public final Context a;
        public final bpn0 b = new bpn0(new pu(this, 16));

        public a(Context context) {
            this.a = context;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            jp20.a aVar = fVar instanceof jp20.a ? (jp20.a) fVar : null;
            if (aVar == null) {
                return;
            }
            ((VkImage) this.b.getValue()).o0(aVar.a, null);
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return (VkImage) this.b.getValue();
        }
    }

    /* compiled from: CategoryViewHolder.kt */
    public static final class b implements VkCell.e {
        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new a(context);
        }
    }

    public lla(ViewGroup viewGroup, pka pkaVar) {
        super(R.layout.vk_item_apps_catalog_category_item, viewGroup);
        VkCell vkCell = (VkCell) this.itemView;
        this.m = vkCell;
        awt0.o(vkCell, new com.vk.movika.sdk.base.observable.e(this, 19));
        jjc.g(vkCell, new com.vk.libvideo.design.view.video.a(4, pkaVar, this));
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.v96
    public final void W5(Object obj) {
        WebImageSize e;
        View view = this.itemView;
        AppsCategory appsCategory = ((x7a.d.b) obj).e;
        view.setContentDescription(appsCategory.b);
        VkCell.Middle.b bVar = new VkCell.Middle.b(new VkCell.Middle.e(oq.d(tlo0.Companion, appsCategory.b), 1, TextUtils.TruncateAt.END, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), (VkCell.Middle.d) null, (VkCell.Middle.c) null, (VkCell.Middle.Size) null, 14);
        VkCell vkCell = this.m;
        vkCell.setMiddle(bVar);
        WebImage webImage = appsCategory.d;
        String str = (webImage == null || (e = webImage.e(n)) == null) ? null : e.b;
        if (str != null && !drm0.N(str)) {
            vkCell.setLeftMainPictureController(new b());
            vkCell.setLeft(new VkCell.Left.b(new VkCell.Left.Main.d(new jp20.a(str), VkCell.Left.Main.Size.ExtraSmall), null));
        } else {
            Object obj2 = oka.a;
            Integer num = (Integer) oka.a.get(appsCategory.c);
            vkCell.setLeft(new VkCell.Left.b(new VkCell.Left.Main.c(num != null ? num.intValue() : R.drawable.vk_icon_services_outline_28, VkCell.Left.Main.Size.Medium, (k1u0) null, (tlo0.h) null, 12), null));
        }
    }
}
