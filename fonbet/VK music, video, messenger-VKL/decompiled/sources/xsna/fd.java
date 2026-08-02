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

/* compiled from: AbstractClipPreview.kt */
/* loaded from: classes17.dex */
public abstract class fd extends FrameLayout implements too0 {
    public final a b;
    public final ClipRectanglePreview c;
    public final ClipRectanglePreview d;
    public final VideoOverlayView e;

    /* compiled from: AbstractClipPreview.kt */
    public static final class a implements vut0 {
        public String b;
        public ViewOnLayoutChangeListenerC2865a c;
        public final VkImage d;

        /* compiled from: AbstractClipPreview.kt */
        /* renamed from: xsna.fd$a$a, reason: collision with other inner class name */
        public static final class ViewOnLayoutChangeListenerC2865a implements View.OnLayoutChangeListener {
            public final /* synthetic */ rzt0 c;

            public ViewOnLayoutChangeListenerC2865a(rzt0 rzt0Var) {
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
            vkImage.setId(R.id.clip_photo);
            vkImage.setPlaceholderImage(context.getDrawable(R.drawable.clip_placeholder));
            this.d = vkImage;
        }

        @Override // xsna.vut0
        public final void c(rzt0 rzt0Var) {
            if (rzt0Var instanceof b) {
                VkImage vkImage = this.d;
                int height = vkImage.getHeight();
                ViewOnLayoutChangeListenerC2865a viewOnLayoutChangeListenerC2865a = this.c;
                if (viewOnLayoutChangeListenerC2865a != null) {
                    vkImage.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC2865a);
                }
                if (height <= 0) {
                    ViewOnLayoutChangeListenerC2865a viewOnLayoutChangeListenerC2865a2 = new ViewOnLayoutChangeListenerC2865a(rzt0Var);
                    vkImage.addOnLayoutChangeListener(viewOnLayoutChangeListenerC2865a2);
                    this.c = viewOnLayoutChangeListenerC2865a2;
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

    /* compiled from: AbstractClipPreview.kt */
    @vby
    public static final class b implements rzt0 {
        public final Image a;

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
            return "ClipPreviewParams(image=" + this.a + ')';
        }
    }

    public fd(Context context) {
        super(context, null, 0);
        this.b = new a(context);
        setId(R.id.clips_grid_clip_item_preview);
        setContentDescription(context.getString(R.string.accessibility_open_clip));
        LayoutInflater.from(context).inflate(R.layout.clip_grid_item_view, this);
        ClipRectanglePreview clipRectanglePreview = (ClipRectanglePreview) findViewById(R.id.clip_preview);
        this.c = clipRectanglePreview;
        this.d = clipRectanglePreview;
        this.e = (VideoOverlayView) findViewById(R.id.clip_overlay_restriction);
        clipRectanglePreview.setBackgroundContentControllerFactory(new ed(this, 0));
    }

    public final View getClickableContainer() {
        return this.d;
    }

    public final ClipRectanglePreview getClipPreview() {
        return this.c;
    }

    public final a getImageViewController() {
        return this.b;
    }

    public final VideoOverlayView getRestrictionView() {
        return this.e;
    }
}
