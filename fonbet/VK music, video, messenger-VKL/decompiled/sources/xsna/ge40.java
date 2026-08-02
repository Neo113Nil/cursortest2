package xsna;

import android.widget.TextView;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.airbnb.lottie.LottieAnimationView;
import com.vk.catalog2.common.dto.api.link.CatalogLink;
import com.vk.catalog2.common.dto.api.link.CatalogLinkImageStyle;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.imageloader.view.VKImageView;
import com.vk.log.L;
import com.vk.music.view.MusicCoverStackedView;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.fe40;

/* compiled from: MusicCategoryItemNewVh.kt */
/* loaded from: classes16.dex */
public final class ge40 extends fe40 {
    @Override // xsna.fe40
    public final void V5(UIBlockLink uIBlockLink) {
        Object obj;
        super.V5(uIBlockLink);
        CatalogLink catalogLink = uIBlockLink.y;
        Image image = catalogLink.f;
        String str = catalogLink.d;
        CatalogLinkImageStyle catalogLinkImageStyle = catalogLink.j;
        String str2 = catalogLink.k;
        int[] iArr = fe40.a.$EnumSwitchMapping$0;
        int i = iArr[catalogLinkImageStyle.ordinal()];
        LottieAnimationView lottieAnimationView = this.o;
        VKImageView vKImageView = this.n;
        MusicCoverStackedView musicCoverStackedView = this.m;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                f4m.j(vKImageView);
                f4m.j(lottieAnimationView);
                musicCoverStackedView.setVisibility(0);
                break;
            case 5:
                f4m.j(musicCoverStackedView);
                break;
            case 6:
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        switch (iArr[catalogLinkImageStyle.ordinal()]) {
            case 1:
            case 2:
                W5(image, false);
                break;
            case 3:
                musicCoverStackedView.setPlaceholder(image);
                break;
            case 4:
                W5(image, true);
                break;
            case 5:
                Iterator it = image.b.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (myc0.f(((ImageSize) obj).d.d)) {
                        }
                    } else {
                        obj = null;
                    }
                }
                final ImageSize imageSize = (ImageSize) obj;
                if (str2 == null) {
                    if (imageSize == null) {
                        f4m.j(vKImageView);
                        f4m.j(lottieAnimationView);
                        break;
                    } else {
                        f4m.j(lottieAnimationView);
                        vKImageView.setVisibility(0);
                        vKImageView.s0(imageSize.d.d);
                        break;
                    }
                } else {
                    f4m.j(vKImageView);
                    lottieAnimationView.setVisibility(0);
                    lottieAnimationView.setFailureListener(new r800() { // from class: xsna.ee40
                        @Override // xsna.r800
                        public final void onResult(Object obj2) {
                            L.i((Throwable) obj2);
                            ge40 ge40Var = ge40.this;
                            LottieAnimationView lottieAnimationView2 = ge40Var.o;
                            f4m.j(lottieAnimationView2);
                            VKImageView vKImageView2 = ge40Var.n;
                            ImageSize imageSize2 = imageSize;
                            if (imageSize2 == null) {
                                f4m.j(vKImageView2);
                                return;
                            }
                            f4m.j(lottieAnimationView2);
                            vKImageView2.setVisibility(0);
                            vKImageView2.s0(imageSize2.d.d);
                        }
                    });
                    lottieAnimationView.s0(str2, (String) j5g.k0(drm0.c0(str2, new String[]{DomExceptionUtils.SEPARATOR}, 0, 6)));
                    break;
                }
            case 6:
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        int length = str.length();
        TextView textView = this.q;
        if (length == 0) {
            f4m.j(textView);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
        }
    }
}
