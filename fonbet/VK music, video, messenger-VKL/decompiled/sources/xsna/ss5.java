package xsna;

import android.content.Context;
import android.view.View;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;

/* compiled from: AvatarViewControllerFactory.kt */
/* loaded from: classes16.dex */
public final class ss5 implements VkCell.e {

    /* compiled from: AvatarViewControllerFactory.kt */
    public static final class a implements VkCell.d {
        public final VkAvatar a;

        public a(Context context) {
            this.a = new VkAvatar(context, null, 6, 0);
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            b bVar = fVar instanceof b ? (b) fVar : null;
            if (bVar != null) {
                ImageList imageList = bVar.a;
                int i = bVar.b;
                Image Bb = imageList.Bb(i, i);
                if (Bb != null) {
                    this.a.o0(Bb.d, null);
                }
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }
    }

    /* compiled from: AvatarViewControllerFactory.kt */
    public static final class b implements VkCell.f {
        public final ImageList a;
        public final int b;

        public b(ImageList imageList, int i) {
            this.a = imageList;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AvatarViewParams(avatar=");
            sb.append(this.a);
            sb.append(", imageSizePx=");
            return vu5.b(sb, this.b, ')');
        }
    }

    @Override // com.vk.core.view.components.cell.VkCell.e
    public final VkCell.d create(Context context) {
        return new a(context);
    }
}
