package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.picture.VkPicture;
import com.vk.dto.common.Image;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.k1u0;
import xsna.tlo0;

/* compiled from: GoodCategoryHolder.kt */
/* loaded from: classes18.dex */
public final class v3u extends vif0<cla> implements UsableRecyclerView.e {
    public final VkCell n;
    public int o;

    /* compiled from: GoodCategoryHolder.kt */
    public static final class a implements VkCell.d {
        public final VkPicture a;

        public a(Context context) {
            VkPicture vkPicture = new VkPicture(context, null, 6, 0);
            vkPicture.setCornerRadius(VkPicture.CornerRadius.Large);
            vkPicture.setScaleType(ImageView.ScaleType.FIT_XY);
            this.a = vkPicture;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            c cVar = fVar instanceof c ? (c) fVar : null;
            if (cVar != null) {
                bwt0.S(this.a, new u3u(cVar, 0));
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }
    }

    /* compiled from: GoodCategoryHolder.kt */
    public static final class b implements VkCell.e {
        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new a(context);
        }
    }

    /* compiled from: GoodCategoryHolder.kt */
    public static final class c implements VkCell.f {
        public final Image a;

        public c(Image image) {
            this.a = image;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            Image image = this.a;
            if (image == null) {
                return 0;
            }
            return image.hashCode();
        }

        public final String toString() {
            return er.d(new StringBuilder("ImageViewParams(image="), this.a, ')');
        }
    }

    public v3u(ViewGroup viewGroup) {
        super(new VkCell(viewGroup.getContext(), null, 6, 0), viewGroup);
        VkCell vkCell = (VkCell) this.itemView;
        this.n = vkCell;
        this.o = cn70.b(0);
        vkCell.setLeftMainPictureController(new b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.vif0
    public final void i6(cla claVar) {
        cla claVar2 = claVar;
        int i = this.o;
        VkCell vkCell = this.n;
        f4m.v(i, vkCell);
        vkCell.setLeft(VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.d(new c(claVar2.c), VkCell.Left.Main.Size.Medium)));
        int i2 = 1;
        Object[] objArr = 0 == true ? 1 : 0;
        vkCell.setMiddle(VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e(oq.d(tlo0.Companion, claVar2.a), i2, TextUtils.TruncateAt.END, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), new VkCell.Middle.d((tlo0) new tlo0.h(claVar2.b), (gzs) null, 0, (TextUtils.TruncateAt) objArr, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62), null, 12));
        vkCell.setRight(VkCell.Right.c.a(VkCell.Right.Companion, null, null, null, new VkCell.Right.b(new ng3(21, claVar2, this), (tlo0.f) null, (k1u0.a) null, 6), 23));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // me.grishka.appkit.views.UsableRecyclerView.e
    public final void onClick() {
        cla claVar = (cla) this.m;
        if (claVar != null) {
            claVar.e.onClick(this.itemView);
        }
    }
}
