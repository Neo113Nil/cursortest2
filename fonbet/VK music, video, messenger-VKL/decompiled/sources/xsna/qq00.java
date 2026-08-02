package xsna;

import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.picture.VkPicture;
import com.vkontakte.android.R;

/* compiled from: MarketAdsItemViewContainer.kt */
/* loaded from: classes17.dex */
public final class qq00 {
    public final FrameLayout a;
    public final VkPicture b;
    public final LinearLayout c;
    public final RecyclerView d;
    public final ViewStub e;
    public RecyclerView f;
    public final RecyclerView.u g;

    public qq00(View view) {
        RecyclerView.u uVar = new RecyclerView.u();
        this.g = uVar;
        this.a = (FrameLayout) view.findViewById(R.id.fullscreen_market_ads_container);
        this.b = (VkPicture) view.findViewById(R.id.fullscreen_market_ads_bg_blurred_image);
        this.c = (LinearLayout) view.findViewById(R.id.carousel_container);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.market_recycler_first_row);
        this.d = recyclerView;
        recyclerView.setRecycledViewPool(uVar);
        this.e = (ViewStub) view.findViewById(R.id.market_recycler_second_row);
    }

    public final RecyclerView a() {
        RecyclerView recyclerView = this.f;
        if (recyclerView != null) {
            return recyclerView;
        }
        RecyclerView recyclerView2 = (RecyclerView) this.e.inflate();
        this.f = recyclerView2;
        a().setRecycledViewPool(this.g);
        return recyclerView2;
    }
}
