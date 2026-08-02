package xsna;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import android.widget.ImageView;
import com.vk.core.view.components.cell.VkCell;
import com.vk.imageloader.view.VKImageView;

/* compiled from: BonusRewardIconViewController.kt */
/* loaded from: classes5.dex */
public final class nl7 implements VkCell.d {
    public final bpn0 a;
    public final VKImageView b;

    /* compiled from: BonusRewardIconViewController.kt */
    public static final class a implements VkCell.f {
        public final String a;
        public final boolean b;

        public a(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            String str = this.a;
            return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BonusRewardIconParams(imageUrl=");
            sb.append(this.a);
            sb.append(", isInactive=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    public nl7(Context context, float f, float f2) {
        bpn0 bpn0Var = new bpn0(new ll7(context, 0));
        this.a = new bpn0(new ml7(0));
        VKImageView vKImageView = new VKImageView(context, null, 6, 0);
        bwt0.d(vKImageView, f, (r4 & 2) != 0, (r4 & 4) != 0);
        vKImageView.y0(f2, ((Number) bpn0Var.getValue()).intValue());
        vKImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.b = vKImageView;
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final void a(VkCell.f fVar) {
        a aVar = fVar instanceof a ? (a) fVar : null;
        if (aVar == null) {
            return;
        }
        String str = aVar.a;
        VKImageView vKImageView = this.b;
        vKImageView.o0(str, null);
        if (((a) fVar).b) {
            vKImageView.setActualColorFilter((ColorFilter) this.a.getValue());
        } else {
            vKImageView.setActualColorFilter((ColorFilter) null);
        }
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final View getView() {
        return this.b;
    }

    /* compiled from: BonusRewardIconViewController.kt */
    public static final class b implements VkCell.e {
        public final float a;
        public final float b;

        public b(float f) {
            this(f, iah0.b(0.5f));
        }

        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new nl7(context, this.a, this.b);
        }

        public b(float f, float f2) {
            this.a = f;
            this.b = f2;
        }
    }
}
