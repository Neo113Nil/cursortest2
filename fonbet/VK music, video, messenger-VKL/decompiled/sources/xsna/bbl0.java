package xsna;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.viewpager.widget.PagerAdapter;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.stickers.longtap.LongtapStickerPreview;
import com.vk.stickers.views.VKStickerCachedImageView;
import com.vk.stickers.views.sticker.ImStickerView;
import com.vkontakte.android.R;
import java.util.List;
import xsna.f5h0;

/* compiled from: StickersPagerAdapter.kt */
/* loaded from: classes6.dex */
public final class bbl0 extends PagerAdapter {
    public final kcl0 b;
    public final b c;
    public final boolean d;
    public n1l0 e;
    public List<? extends n1l0> f;

    /* compiled from: StickersPagerAdapter.kt */
    public static final class a implements xwb0 {
        public final /* synthetic */ LongtapStickerPreview a;

        public a(LongtapStickerPreview longtapStickerPreview) {
            this.a = longtapStickerPreview;
        }

        @Override // xsna.xwb0
        public final void E() {
            this.a.setLoadingState(true);
        }

        @Override // xsna.xwb0
        public final void k() {
            this.a.setLoadingState(false);
        }
    }

    /* compiled from: StickersPagerAdapter.kt */
    public interface b {
        void a(c cVar);
    }

    /* compiled from: StickersPagerAdapter.kt */
    public static final class c {
        public final ProgressBar a;
        public final LongtapStickerPreview b;
        public final ImStickerView c;
        public final a d;

        public c(ProgressBar progressBar, LongtapStickerPreview longtapStickerPreview, ImStickerView imStickerView, a aVar) {
            this.a = progressBar;
            this.b = longtapStickerPreview;
            this.c = imStickerView;
            this.d = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a.equals(cVar.a) && this.b.equals(cVar.b) && this.c.equals(cVar.c) && this.d.equals(cVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "StickersPagerItemViewHolder(progress=" + this.a + ", image=" + this.b + ", rLottieAnimView=" + this.c + ", callback=" + this.d + ')';
        }
    }

    public bbl0(kcl0 kcl0Var, m3l0 m3l0Var, int i) {
        m3l0Var = (i & 2) != 0 ? null : m3l0Var;
        boolean z = (i & 4) != 0;
        this.b = kcl0Var;
        this.c = m3l0Var;
        this.d = z;
    }

    public static void b(View view) {
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 1.0f, 1.08f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 1.0f, 1.08f, 1.0f));
        ofPropertyValuesHolder.setDuration(200L);
        ofPropertyValuesHolder.start();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        List<? extends n1l0> list = this.f;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getItemPosition(Object obj) {
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        n1l0 n1l0Var;
        njt hierarchy;
        Context context = viewGroup.getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        LongtapStickerPreview longtapStickerPreview = new LongtapStickerPreview(context, null, 0, 14, 0);
        boolean z = this.d;
        longtapStickerPreview.setPlayPopupBtnVisible(z);
        VKStickerCachedImageView stickerImage = longtapStickerPreview.getStickerImage();
        if (stickerImage != null && (hierarchy = stickerImage.getHierarchy()) != null) {
            hierarchy.o(f5h0.i.a);
        }
        ProgressBar progressBar = new ProgressBar(context);
        progressBar.setIndeterminateTintList(ColorStateList.valueOf(context.getColor(R.color.vk_white)));
        progressBar.setIndeterminateTintMode(PorterDuff.Mode.SRC_IN);
        ImStickerView imStickerView = new ImStickerView(context, null, 6);
        frameLayout.addView(progressBar, new FrameLayout.LayoutParams(-2, -2, 17));
        int i2 = h9l0.h;
        frameLayout.addView(longtapStickerPreview, new FrameLayout.LayoutParams(i2, i2, 17));
        frameLayout.addView(imStickerView, new FrameLayout.LayoutParams(i2, i2, 17));
        c cVar = new c(progressBar, longtapStickerPreview, imStickerView, new a(longtapStickerPreview));
        frameLayout.setTag(cVar);
        List<? extends n1l0> list = this.f;
        if (list != null && (n1l0Var = list.get(i)) != null) {
            StickerStockItem H = this.b.H(n1l0Var.o2());
            if (H != null) {
                frameLayout.setContentDescription(context.getString(R.string.sticker_details_overlay_sticker_title, H.d));
            }
            if (n1l0Var.V0()) {
                dhr0.a.c(context);
                progressBar.setVisibility(0);
                longtapStickerPreview.setVisibility(8);
                ImStickerView.b(imStickerView, n1l0Var, null, 6);
                b(imStickerView);
            } else {
                t6g0 t6g0Var = t6g0.b;
                String z0 = t6g0.d().z0(n1l0Var, h9l0.b, dhr0.a.c(context));
                boolean z2 = z && n1l0Var.z9();
                ImageView playPopupBtn = longtapStickerPreview.getPlayPopupBtn();
                if (playPopupBtn != null) {
                    awt0.u(playPopupBtn, z2);
                }
                progressBar.setVisibility(0);
                longtapStickerPreview.setVisibility(8);
                longtapStickerPreview.setVisibility(0);
                VKStickerCachedImageView stickerImage2 = longtapStickerPreview.getStickerImage();
                if (stickerImage2 != null) {
                    stickerImage2.setOnLoadCallback(new cbl0(cVar, this));
                }
                VKStickerCachedImageView stickerImage3 = longtapStickerPreview.getStickerImage();
                if (stickerImage3 != null) {
                    stickerImage3.load(z0);
                }
            }
        }
        ImageView playPopupBtn2 = longtapStickerPreview.getPlayPopupBtn();
        if (playPopupBtn2 != null) {
            jjc.g(playPopupBtn2, new mp3(28, this, cVar));
        }
        viewGroup.addView(frameLayout);
        return frameLayout;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        return view.equals(obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        List<? extends n1l0> list = this.f;
        if (list == null || i >= list.size()) {
            return;
        }
        this.e = this.f.get(i);
    }
}
