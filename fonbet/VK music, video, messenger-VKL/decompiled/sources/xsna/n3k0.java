package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.drawee.generic.RoundingParams;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ContentType;
import com.vk.catalog2.common.dto.api.Meta;
import com.vk.catalog2.common.dto.api.link.CatalogLink;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.catalog2.common.ui.holders.LinkVh;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.imageloader.ImageScreenSize;
import com.vk.imageloader.view.VKImageView;
import com.vk.log.L;
import com.vkontakte.android.R;
import java.util.HashSet;

/* compiled from: SmallPlaylistItemVh.kt */
/* loaded from: classes16.dex */
public final class n3k0 implements VkCell.d {
    public final k7a a;
    public final LinkVh.a b;
    public final LottieAnimationView c;
    public final VKImageView d;
    public final FrameLayout e;

    public n3k0(Context context, k7a k7aVar, LinkVh.a aVar) {
        this.a = k7aVar;
        this.b = aVar;
        LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
        lottieAnimationView.setRepeatMode(1);
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.setVisibility(4);
        this.c = lottieAnimationView;
        VKImageView vKImageView = new VKImageView(context, null, 6, 0);
        vKImageView.setVisibility(4);
        this.d = vKImageView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        bwt0.b0(17, frameLayout);
        frameLayout.addView(lottieAnimationView);
        frameLayout.addView(vKImageView);
        this.e = frameLayout;
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final void a(VkCell.f fVar) {
        p3k0 p3k0Var = fVar instanceof p3k0 ? (p3k0) fVar : null;
        if (p3k0Var != null) {
            final UIBlockLink uIBlockLink = p3k0Var.b;
            String str = p3k0Var.a;
            if (str == null) {
                b(uIBlockLink);
                return;
            }
            LottieAnimationView lottieAnimationView = this.c;
            lottieAnimationView.setVisibility(0);
            this.d.setVisibility(4);
            lottieAnimationView.setFailureListener(new r800() { // from class: xsna.m3k0
                @Override // xsna.r800
                public final void onResult(Object obj) {
                    L.i((Throwable) obj);
                    n3k0.this.b(uIBlockLink);
                }
            });
            lottieAnimationView.s0(str, (String) j5g.k0(drm0.c0(str, new String[]{DomExceptionUtils.SEPARATOR}, 0, 6)));
            lottieAnimationView.m0();
        }
    }

    public final void b(UIBlockLink uIBlockLink) {
        float[] fArr;
        float[] fArr2;
        this.c.setVisibility(4);
        VKImageView vKImageView = this.d;
        vKImageView.setVisibility(0);
        vKImageView.setOnLoadCallback(new a());
        LinkVh.a aVar = this.b;
        if (aVar != null) {
            Integer num = aVar.b;
            vKImageView.setRound(false);
            if (num != null) {
                vKImageView.setCornerRadius(vKImageView.getResources().getDimension(num.intValue()));
            }
            RoundingParams roundingParams = vKImageView.getHierarchy().c;
            if (roundingParams != null) {
                roundingParams.i = aVar.a;
            }
        }
        CatalogLink catalogLink = uIBlockLink.y;
        Resources resources = this.e.getResources();
        vKImageView.setEmptyImagePlaceholder((Drawable) null);
        Meta meta = catalogLink.g;
        ContentType contentType = meta != null ? meta.c : null;
        CatalogDataType catalogDataType = uIBlockLink.e;
        CatalogViewType catalogViewType = uIBlockLink.d;
        RoundingParams roundingParams2 = vKImageView.getHierarchy().c;
        float f = -1.0f;
        this.a.b(vKImageView, contentType, catalogDataType, catalogViewType, (roundingParams2 == null || (fArr2 = roundingParams2.c) == null) ? -1.0f : fArr2[0]);
        CatalogDataType catalogDataType2 = uIBlockLink.e;
        CatalogViewType catalogViewType2 = uIBlockLink.d;
        RoundingParams roundingParams3 = vKImageView.getHierarchy().c;
        if (roundingParams3 != null && (fArr = roundingParams3.c) != null) {
            f = fArr[0];
        }
        this.a.d(vKImageView, catalogDataType2, catalogViewType2, f);
        Image image = catalogLink.f;
        Context context = vKImageView.getContext();
        HashSet hashSet = iah0.a;
        ImageSize Cb = image.Cb(fnj.b(context) ? ImageScreenSize.BIG.h() : resources.getDimensionPixelSize(R.dimen.catalog_link_small_list_content_item_width), true, false);
        vKImageView.s0(Cb != null ? Cb.d.d : null);
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final View getView() {
        return this.e;
    }

    /* compiled from: SmallPlaylistItemVh.kt */
    public static final class a implements b780 {
        public a() {
        }

        @Override // xsna.b780
        public final void b(String str, Throwable th) {
            n3k0.this.d.W();
        }

        @Override // xsna.b780
        public final void g(String str) {
        }

        @Override // xsna.b780
        public final void onCancel(String str) {
        }

        @Override // xsna.b780
        public final void t(int i, int i2, String str) {
        }
    }
}
