package xsna;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.util.measure.ScaleType;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.ImageSize;
import com.vk.dto.photo.ImageCropData;
import com.vk.dto.photo.Photo;
import com.vk.feed.tool.view.newsfeed.image.FixedSizeVKEnhancedImageView;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;

/* compiled from: PhotoHolder.kt */
/* loaded from: classes4.dex */
public final class y9a0 extends de6<w9a0> implements blc0, xna0 {
    public final boolean k;
    public final h170 l;
    public final FixedSizeVKEnhancedImageView m;
    public final View n;
    public final Object o;
    public x64 p;
    public final nwf0 q;
    public final Object r;
    public final Object s;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public y9a0(ViewGroup viewGroup, boolean z, gzs gzsVar, h170 h170Var) {
        super(r7, 0);
        qcy<Object>[] qcyVarArr = bwt0.a;
        FrameLayout frameLayout = (FrameLayout) tf3.b(viewGroup, R.layout.attach_photo_multiple_item, viewGroup, false);
        this.k = z;
        this.l = h170Var;
        FixedSizeVKEnhancedImageView fixedSizeVKEnhancedImageView = (FixedSizeVKEnhancedImageView) frameLayout.findViewById(R.id.image);
        this.m = fixedSizeVKEnhancedImageView;
        this.n = frameLayout.findViewById(R.id.attached_goods_indicator);
        int i = 9;
        z260 z260Var = new z260(this, i);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.o = msy.a(lazyThreadSafetyMode, z260Var);
        this.q = new nwf0(frameLayout, new en9(this, i));
        this.r = msy.a(lazyThreadSafetyMode, new jz70(this, 6));
        Lazy a2 = msy.a(lazyThreadSafetyMode, new vo50(7));
        this.s = a2;
        fixedSizeVKEnhancedImageView.setScaleType(ScaleType.CENTER_CROP);
        fixedSizeVKEnhancedImageView.setPlaceholder(new ColorDrawable(dhr0.t.c(R.attr.vk_ui_image_placeholder)));
        fixedSizeVKEnhancedImageView.setWithImageDownscale(z);
        if (!z) {
            fixedSizeVKEnhancedImageView.setFadeDuration(0);
        }
        if (frameLayout.getContentDescription() == null) {
            frameLayout.setContentDescription(frameLayout.getContext().getString(R.string.accessibility_photo));
        }
        frameLayout.setOnClickListener(this);
        fixedSizeVKEnhancedImageView.setIgnoreTrafficSaverPredicate(gzsVar);
        fixedSizeVKEnhancedImageView.setCollectLoadingMetrics(((Boolean) a2.getValue()).booleanValue());
        dek0.b(fixedSizeVKEnhancedImageView, null, null, 6);
    }

    @Override // xsna.blc0
    public final void D1(boolean z) {
        this.q.a(z);
    }

    @Override // xsna.blc0
    public final void Z1(x64 x64Var) {
        this.p = x64Var;
    }

    @Override // xsna.xna0
    public final void a(m680 m680Var) {
        f().d = m680Var;
    }

    @Override // xsna.de6
    public final void b(Attachment attachment) {
        if (attachment instanceof PhotoAttachment) {
            FixedSizeVKEnhancedImageView fixedSizeVKEnhancedImageView = this.m;
            fixedSizeVKEnhancedImageView.setLocalImage((fxj0) null);
            PhotoAttachment photoAttachment = (PhotoAttachment) attachment;
            Photo photo = photoAttachment.l;
            fixedSizeVKEnhancedImageView.setRemoteImage((List<? extends fxj0>) photo.y.b);
            iso0 s = com.vk.toggle.d.s();
            String str = photo.P;
            h170 h170Var = this.l;
            String b = s.b(str, h170Var.h() && h170Var.i());
            if (b != null) {
                fixedSizeVKEnhancedImageView.setThumbHash(b);
            }
            View view = this.n;
            if (view != null) {
                bwt0.p0(view, photo.r);
            }
            f().e = false;
            fixedSizeVKEnhancedImageView.setOnLoadCallback(new a());
            ImageSize imageSize = (ImageSize) ixj0.b(photo.y.b);
            e(photoAttachment, imageSize != null ? imageSize.d.b : 0, imageSize != null ? imageSize.d.c : 0);
        }
    }

    @Override // xsna.de6
    public final void c(w9a0 w9a0Var) {
        w9a0 w9a0Var2 = w9a0Var;
        FixedSizeVKEnhancedImageView fixedSizeVKEnhancedImageView = this.m;
        fixedSizeVKEnhancedImageView.setLocalImage((fxj0) null);
        fixedSizeVKEnhancedImageView.setRemoteImage((List<? extends fxj0>) w9a0Var2.f);
        iso0 s = com.vk.toggle.d.s();
        PhotoAttachment photoAttachment = w9a0Var2.e;
        String str = photoAttachment.l.P;
        h170 h170Var = this.l;
        String b = s.b(str, h170Var.h() && h170Var.i());
        if (b != null) {
            fixedSizeVKEnhancedImageView.setThumbHash(b);
        }
        View view = this.n;
        if (view != null) {
            bwt0.p0(view, w9a0Var2.g);
        }
        f().e = false;
        fixedSizeVKEnhancedImageView.setOnLoadCallback(new z9a0(this));
        e(photoAttachment, w9a0Var2.h, w9a0Var2.i);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void e(PhotoAttachment photoAttachment, int i, int i2) {
        Photo photo = photoAttachment.l;
        ImageCropData Gb = photo.K == null ? photo.Gb() : null;
        ?? r0 = this.o;
        chk chkVar = (chk) r0.getValue();
        if (i <= 0) {
            i = 135;
        }
        if (i2 <= 0) {
            i2 = 100;
        }
        chkVar.c(Gb, i, i2, null);
        if (((chk) r0.getValue()).b()) {
            return;
        }
        this.m.setWithImageDownscale(this.k);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final h2r f() {
        return (h2r) this.r.getValue();
    }

    @Override // xsna.de6, android.view.View.OnClickListener
    public final void onClick(View view) {
        x64 x64Var = this.p;
        if (x64Var != null) {
            x64Var.a(this.d);
        } else {
            super.onClick(view);
        }
    }

    @Override // xsna.blc0
    public final void p5() {
    }

    /* compiled from: PhotoHolder.kt */
    public static final class a implements b780 {
        public a() {
        }

        @Override // xsna.b780
        public final void t(int i, int i2, String str) {
            y9a0.this.f().e = true;
        }

        @Override // xsna.b780
        public final void g(String str) {
        }

        @Override // xsna.b780
        public final void onCancel(String str) {
        }

        @Override // xsna.b780
        public final void b(String str, Throwable th) {
        }
    }

    @Override // xsna.blc0
    public final void j1(View.OnClickListener onClickListener) {
    }
}
