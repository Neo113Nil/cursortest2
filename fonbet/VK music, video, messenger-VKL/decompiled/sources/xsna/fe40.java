package xsna;

import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.vk.catalog2.common.dto.api.link.CatalogLinkImageStyle;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.music.Thumb;
import com.vk.imageloader.view.VKImageView;
import com.vk.music.view.MusicCoverStackedView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: MusicCategoryBaseItemVh.kt */
/* loaded from: classes16.dex */
public class fe40 extends RecyclerView.e0 {
    public final wzs<View, UIBlockLink, View.OnClickListener> l;
    public final MusicCoverStackedView m;
    public final VKImageView n;
    public final LottieAnimationView o;
    public final TextView p;
    public final TextView q;
    public UIBlockLink r;

    /* compiled from: MusicCategoryBaseItemVh.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogLinkImageStyle.values().length];
            try {
                iArr[CatalogLinkImageStyle.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogLinkImageStyle.RECTANGLE_STACKED_ROTATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogLinkImageStyle.PLACEHOLDER_ICON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CatalogLinkImageStyle.ROUND_STACKED_ROTATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CatalogLinkImageStyle.RECTANGLE_RIGHT_SIDE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CatalogLinkImageStyle.TRIPLE_ROTATED_RIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public fe40(View view, wzs<? super View, ? super UIBlockLink, ? extends View.OnClickListener> wzsVar) {
        super(view);
        this.l = wzsVar;
        CardView cardView = (CardView) view.findViewById(R.id.container);
        this.m = (MusicCoverStackedView) view.findViewById(R.id.music_category_stacked_cover);
        this.n = (VKImageView) view.findViewById(R.id.music_rectangle_right_image);
        this.o = (LottieAnimationView) view.findViewById(R.id.music_rectangle_right_image_animation);
        this.p = (TextView) view.findViewById(R.id.music_category_title);
        this.q = (TextView) view.findViewById(R.id.music_category_subtitle);
        if (gz80.a(28)) {
            cardView.setOutlineSpotShadowColor(cardView.getContext().getColor(R.color.vk_black_alpha20));
        }
    }

    public void V5(UIBlockLink uIBlockLink) {
        this.r = uIBlockLink;
        View view = this.itemView;
        view.setOnClickListener(this.l.invoke(view, uIBlockLink));
        this.p.setText(uIBlockLink.y.c);
    }

    public final void W5(Image image, boolean z) {
        ArrayList Fb = image.Fb();
        ArrayList arrayList = new ArrayList();
        Iterator it = Fb.iterator();
        while (it.hasNext()) {
            arrayList.add(new Image((List<ImageSize>) Collections.singletonList((ImageSize) it.next())));
        }
        boolean isEmpty = arrayList.isEmpty();
        MusicCoverStackedView musicCoverStackedView = this.m;
        if (isEmpty) {
            f4m.j(musicCoverStackedView);
            return;
        }
        if (arrayList.size() <= 1) {
            Image image2 = (Image) j5g.Y(arrayList);
            musicCoverStackedView.getClass();
            musicCoverStackedView.T4(new Thumb(image2), null, z);
        } else {
            Image image3 = (Image) j5g.Y(arrayList);
            Image image4 = (Image) j5g.i0(arrayList);
            musicCoverStackedView.getClass();
            musicCoverStackedView.T4(new Thumb(image3), image4 != null ? new Thumb(image4) : null, z);
        }
    }

    public void c() {
    }
}
