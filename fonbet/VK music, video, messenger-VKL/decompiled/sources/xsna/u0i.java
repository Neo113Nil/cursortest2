package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vk.clips.design.view.component.video.preview.ClipRectanglePreview;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vkontakte.android.R;

/* compiled from: CommunityScheduledClipsGridRectanglePreviewHolder.kt */
/* loaded from: classes5.dex */
public final class u0i extends FrameLayout {
    public final ClipRectanglePreview b;
    public final ClipRectanglePreview c;
    public final VideoOverlayView d;

    /* compiled from: CommunityScheduledClipsGridRectanglePreviewHolder.kt */
    public static final class a implements vut0 {
        public String b;
        public ViewOnLayoutChangeListenerC3780a c;
        public final VkImage d;

        /* compiled from: CommunityScheduledClipsGridRectanglePreviewHolder.kt */
        /* renamed from: xsna.u0i$a$a, reason: collision with other inner class name */
        public static final class ViewOnLayoutChangeListenerC3780a implements View.OnLayoutChangeListener {
            public final /* synthetic */ rzt0 c;

            public ViewOnLayoutChangeListenerC3780a(rzt0 rzt0Var) {
                this.c = rzt0Var;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                a aVar = a.this;
                aVar.c = null;
                VkImage vkImage = aVar.d;
                vkImage.removeOnLayoutChangeListener(this);
                ImageSize Cb = ((b) this.c).a.Cb(vkImage.getHeight(), false, false);
                String str = Cb != null ? Cb.d.d : null;
                if (epx.f(aVar.b, str)) {
                    return;
                }
                aVar.b = str;
                vkImage.o0(str, null);
            }
        }

        public a(Context context) {
            VkImage vkImage = new VkImage(context, null, 6, 0);
            vkImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
            vkImage.setId(R.id.vk_community_scheduled_clip_photo);
            vkImage.setPlaceholderImage(context.getDrawable(R.drawable.clip_placeholder));
            this.d = vkImage;
        }

        @Override // xsna.vut0
        public final void c(rzt0 rzt0Var) {
            if (rzt0Var instanceof b) {
                VkImage vkImage = this.d;
                int height = vkImage.getHeight();
                ViewOnLayoutChangeListenerC3780a viewOnLayoutChangeListenerC3780a = this.c;
                if (viewOnLayoutChangeListenerC3780a != null) {
                    vkImage.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC3780a);
                }
                if (height <= 0) {
                    ViewOnLayoutChangeListenerC3780a viewOnLayoutChangeListenerC3780a2 = new ViewOnLayoutChangeListenerC3780a(rzt0Var);
                    vkImage.addOnLayoutChangeListener(viewOnLayoutChangeListenerC3780a2);
                    this.c = viewOnLayoutChangeListenerC3780a2;
                    return;
                }
                this.c = null;
                ImageSize Cb = ((b) rzt0Var).a.Cb(height, false, false);
                String str = Cb != null ? Cb.d.d : null;
                if (epx.f(this.b, str)) {
                    return;
                }
                this.b = str;
                vkImage.o0(str, null);
            }
        }

        @Override // xsna.vut0
        public final View getView() {
            return this.d;
        }
    }

    /* compiled from: CommunityScheduledClipsGridRectanglePreviewHolder.kt */
    @vby
    public static final class b implements rzt0 {
        public final Image a;

        public /* synthetic */ b(Image image) {
            this.a = image;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return epx.f(this.a, ((b) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "CommunityScheduledClipPreviewParams(image=" + this.a + ')';
        }
    }

    public u0i(Context context) {
        super(context, null, 0);
        setId(R.id.vk_community_scheduled_clips_preview);
        LayoutInflater.from(context).inflate(R.layout.community_scheduled_clip_grid_item_view, this);
        ClipRectanglePreview clipRectanglePreview = (ClipRectanglePreview) findViewById(R.id.community_scheduled_clip_preview);
        this.b = clipRectanglePreview;
        this.c = clipRectanglePreview;
        this.d = (VideoOverlayView) findViewById(R.id.community_scheduled_clip_overlay_restriction);
        clipRectanglePreview.setBackgroundContentControllerFactory(new t7(context, 13));
        iut0.q(this, new v0i(this));
    }

    public final View getClickableContainer() {
        return this.c;
    }

    public final ClipRectanglePreview getClipPreview() {
        return this.b;
    }

    public final VideoOverlayView getRestrictionView() {
        return this.d;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        this.b.layout(0, 0, i5, i6);
        this.c.layout(0, 0, i5, i6);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(an10.a(size * 1.773109243697479d), 1073741824));
    }
}
