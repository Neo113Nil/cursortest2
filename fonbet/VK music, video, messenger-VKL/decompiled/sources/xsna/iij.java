package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.common.ImageSize;
import com.vk.dto.photo.Photo;
import com.vk.toggle.features.CoreFeatures;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;

/* compiled from: ContentPhotosAdapter.kt */
/* loaded from: classes5.dex */
public final class iij extends zoj0<Photo, a> {
    public final gkh e;
    public final WeakReference<View> f;

    /* compiled from: ContentPhotosAdapter.kt */
    public final class a extends vif0<Photo> {
        public final VkImage n;

        public a(View view) {
            super(view);
            VkImage vkImage = (VkImage) view.findViewById(R.id.iv_photo);
            this.n = vkImage;
            vkImage.setPlaceholderColor(dhr0.t.c(R.attr.vk_ui_image_placeholder));
            bwt0.i0(vkImage, new mm1(9, iij.this, this));
        }

        @Override // xsna.vif0
        public final void i6(Photo photo) {
            final Photo photo2 = photo;
            iso0 s = com.vk.toggle.d.s();
            String str = photo2.P;
            CoreFeatures coreFeatures = CoreFeatures.THUMB_HASH;
            coreFeatures.getClass();
            String b = s.b(str, com.vk.toggle.b.A.a(coreFeatures) && com.vk.toggle.d.s().d);
            VkImage vkImage = this.n;
            if (b != null) {
                vkImage.setThumbHash(b);
            }
            iij.this.e.F.i(vkImage, photo2, false, new yzs() { // from class: xsna.hij
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ImageSize Ab;
                    String str2;
                    Photo photo3 = (Photo) obj;
                    int intValue = ((Integer) obj2).intValue();
                    int intValue2 = ((Integer) obj3).intValue();
                    if (photo3 != null) {
                        if (intValue <= 0 || intValue2 <= 0) {
                            photo3 = null;
                        }
                        if (photo3 != null && (Ab = photo3.Ab(intValue, intValue2)) != null && (str2 = Ab.d.d) != null) {
                            return str2;
                        }
                    }
                    int z = iah0.z(this.itemView.getContext()) / 3;
                    return Photo.this.Ab(z, z).d.d;
                }
            });
        }
    }

    public iij(gkh gkhVar, WeakReference weakReference, com.vk.lists.a aVar) {
        super(aVar);
        this.e = gkhVar;
        this.f = weakReference;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((a) e0Var).V5(this.c.c(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(tf3.b(viewGroup, R.layout.holder_photo_item, viewGroup, false));
    }
}
