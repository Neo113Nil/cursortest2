package xsna;

import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.link.CatalogLinkImageStyle;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.imageloader.view.VKImageView;
import com.vk.music.view.MusicKidsCoverStackedView;
import com.vkontakte.android.R;

/* compiled from: MusicKidsCollectionItemVh.kt */
/* loaded from: classes16.dex */
public final class vl40 extends RecyclerView.e0 {
    public final View l;
    public final wzs<View, UIBlockLink, View.OnClickListener> m;
    public final CardView n;
    public final TextView o;
    public final TextView p;
    public final MusicKidsCoverStackedView q;
    public final VKImageView r;

    /* compiled from: MusicKidsCollectionItemVh.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogLinkImageStyle.values().length];
            try {
                iArr[CatalogLinkImageStyle.RECTANGLE_STACKED_ROTATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogLinkImageStyle.PLACEHOLDER_ICON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public vl40(View view, cv4 cv4Var) {
        super(view);
        this.l = view;
        this.m = cv4Var;
        CardView cardView = (CardView) view.findViewById(R.id.root_container);
        this.n = cardView;
        this.o = (TextView) view.findViewById(R.id.title);
        this.p = (TextView) view.findViewById(R.id.subtitle);
        this.q = (MusicKidsCoverStackedView) view.findViewById(R.id.stacked_cover);
        this.r = (VKImageView) view.findViewById(R.id.default_cover);
        if (gz80.a(28)) {
            cardView.setOutlineSpotShadowColor(cardView.getContext().getColor(R.color.vk_black_alpha20));
        }
    }
}
