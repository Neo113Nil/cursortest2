package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.badge.VkContentBadge;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.picture.VkPicture;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.libvideo.design.view.movika.InteractiveDurationView;
import com.vk.newsfeed.posting.mediapicker.videovk.presentation.VkVideoPickerFragment;
import com.vkontakte.android.R;

/* compiled from: VideoPickerViewHolder.kt */
/* loaded from: classes4.dex */
public final class g3t0 extends RecyclerView.e0 {
    public final b2t0 l;
    public final VkCell m;
    public VideoFile n;

    /* compiled from: VideoPickerViewHolder.kt */
    public static final class a implements VkCell.d {
        public final View a;
        public final VkPicture b;
        public final VkPicture c;
        public final VkContentBadge d;
        public final InteractiveDurationView e;

        public a(Context context) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.media_picker_video_vk_video_item_image, (ViewGroup) null, false);
            inflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            this.b = (VkPicture) inflate.findViewById(R.id.preview);
            this.c = (VkPicture) inflate.findViewById(R.id.restriction_icon);
            this.d = (VkContentBadge) inflate.findViewById(R.id.duration);
            this.e = (InteractiveDurationView) inflate.findViewById(R.id.interactive_duration);
            this.a = inflate;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            if (fVar instanceof c) {
                m0w0 m0w0Var = ((c) fVar).a;
                boolean z = m0w0Var.h;
                String str = m0w0Var.j;
                if (z) {
                    InteractiveDurationView interactiveDurationView = this.e;
                    if (interactiveDurationView != null) {
                        interactiveDurationView.setVisibility(0);
                    }
                    InteractiveDurationView interactiveDurationView2 = this.e;
                    if (interactiveDurationView2 != null) {
                        interactiveDurationView2.setTextDescriptionVisible(false);
                    }
                    InteractiveDurationView interactiveDurationView3 = this.e;
                    if (interactiveDurationView3 != null) {
                        interactiveDurationView3.setDurationText(str);
                    }
                } else {
                    InteractiveDurationView interactiveDurationView4 = this.e;
                    if (interactiveDurationView4 != null) {
                        interactiveDurationView4.setVisibility(4);
                    }
                }
                if (m0w0Var.i) {
                    VkContentBadge vkContentBadge = this.d;
                    if (vkContentBadge != null) {
                        vkContentBadge.setVisibility(0);
                    }
                    VkContentBadge vkContentBadge2 = this.d;
                    if (vkContentBadge2 != null) {
                        vkContentBadge2.setText(str);
                    }
                } else {
                    VkContentBadge vkContentBadge3 = this.d;
                    if (vkContentBadge3 != null) {
                        vkContentBadge3.setVisibility(4);
                    }
                }
                VkPicture vkPicture = this.c;
                if (vkPicture != null) {
                    bwt0.p0(vkPicture, m0w0Var.l);
                }
                VkPicture vkPicture2 = this.c;
                if (vkPicture2 != null) {
                    vkPicture2.o0(m0w0Var.n, null);
                }
                VkPicture vkPicture3 = this.c;
                if (vkPicture3 != null) {
                    vkPicture3.setColorFilter(m0w0Var.m);
                }
                VkPicture vkPicture4 = this.b;
                if (vkPicture4 != null) {
                    VideoRestriction O = m0w0Var.a.O();
                    kci.o(vkPicture4, (O == null || !O.d) ? null : new jwx(3, 20));
                }
                VkPicture vkPicture5 = this.b;
                if (vkPicture5 != null) {
                    vkPicture5.setBackground(m0w0Var.c);
                }
                VkPicture vkPicture6 = this.b;
                if (vkPicture6 != null) {
                    vkPicture6.o0(m0w0Var.e, null);
                }
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }
    }

    /* compiled from: VideoPickerViewHolder.kt */
    public static final class b implements VkCell.e {
        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new a(context);
        }
    }

    /* compiled from: VideoPickerViewHolder.kt */
    public static final class c implements VkCell.f {
        public final m0w0 a;

        public c(m0w0 m0w0Var) {
            this.a = m0w0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "VideoImageViewParams(item=" + this.a + ')';
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g3t0(VkVideoPickerFragment vkVideoPickerFragment, ViewGroup viewGroup) {
        super(r0);
        VkCell vkCell = new VkCell(viewGroup.getContext(), null, 6, 0);
        vkCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.l = vkVideoPickerFragment;
        VkCell vkCell2 = (VkCell) this.itemView;
        vkCell2.setId(R.id.posting_media_picker_video_item);
        vkCell2.setLeftMainViewController(new b());
        bwt0.i0(vkCell2, new g15(1, this, g3t0.class, "handleRootClick", "handleRootClick(Landroid/view/View;)V", 0, 10));
        this.m = vkCell2;
    }
}
