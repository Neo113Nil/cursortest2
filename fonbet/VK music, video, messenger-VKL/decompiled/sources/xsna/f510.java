package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.api.di.ReviewsComponent;
import com.vk.ecomm.reviews.impl.marketitem.createreview.presentation.model.CreateMarketItemReviewResult;
import com.vk.ecomm.reviews.impl.marketitem.itemsforreview.domain.model.ItemsForReviewViewTypeModel;
import com.vk.ecomm.reviews.impl.marketitem.itemsforreview.view.viewpager.model.ReviewOfferViewType;
import java.util.Locale;
import java.util.UUID;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.dh6;
import xsna.e510;
import xsna.mk50;
import xsna.xn50;

/* compiled from: MarketItemsForReviewComposeBottomSheet.kt */
/* loaded from: classes18.dex */
public final class f510 extends tl50<x510, n610, e510> implements w8i {
    public final ComposeView i1;
    public q510 j1;

    /* compiled from: MarketItemsForReviewComposeBottomSheet.kt */
    public static final class a extends kmu0 {
        public final ReviewOfferViewType h;
        public final UserId i;
        public final Integer j;
        public final Long k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, ReviewOfferViewType reviewOfferViewType, UserId userId, Integer num, Long l, dh6.a aVar, int i) {
            super(context, (i & 32) != 0 ? tzp0.a(null, 3) : aVar);
            userId = (i & 4) != 0 ? null : userId;
            num = (i & 8) != 0 ? null : num;
            l = (i & 16) != 0 ? null : l;
            this.h = reviewOfferViewType;
            this.i = userId;
            this.j = num;
            this.k = l;
            T0();
            c(new jgj(S0(), 0, 0, 62));
            F0(true);
            x(0);
            B(iah0.b(12.0f), false, true);
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            f510 f510Var = new f510(S0());
            f510Var.setArguments(yfb.b(new Pair("extra_community_id", this.i), new Pair("extra_order_id", this.j), new Pair("extra_open_view_type", this.h.i()), new Pair("extra_item_id", this.k)));
            return f510Var;
        }
    }

    public f510(ComposeView composeView) {
        this.i1 = composeView;
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        q510 q510Var = new q510(this, requireContext(), this.i1, getFeature().p);
        this.j1 = q510Var;
        return new mk50.c(q510Var.f);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        n610 n610Var = (n610) ao50Var;
        q510 q510Var = this.j1;
        if (q510Var == null) {
            q510Var = null;
        }
        q510Var.f(n610Var, new ic1(1, this, f510.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 5));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((x510) vk50Var).n.a(new h2s(this, 13), this);
    }

    @Override // xsna.dw20
    public final boolean a0() {
        xn50.a.c(this, e510.c.b);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        Bundle bundleExtra;
        Parcelable parcelable;
        Object parcelable2;
        super.onActivityResult(i, i2, intent);
        if (i2 != -1 || i != 111722 || intent == null || (bundleExtra = intent.getBundleExtra("create_market_item_result")) == null) {
            return;
        }
        String l = fpf0.a(CreateMarketItemReviewResult.class).l();
        if (l == null) {
            l = "";
        }
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = bundleExtra.getParcelable(l, CreateMarketItemReviewResult.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = bundleExtra.getParcelable(l);
            if (!(parcelable3 instanceof CreateMarketItemReviewResult)) {
                parcelable3 = null;
            }
            parcelable = (CreateMarketItemReviewResult) parcelable3;
        }
        CreateMarketItemReviewResult createMarketItemReviewResult = (CreateMarketItemReviewResult) parcelable;
        if (createMarketItemReviewResult != null) {
            Float f = createMarketItemReviewResult.c;
            Long l2 = createMarketItemReviewResult.b;
            if (l2 == null || f == null) {
                return;
            }
            xn50.a.c(this, new e510.a(l2.longValue(), f.floatValue(), createMarketItemReviewResult.d));
            LayoutInflater.Factory kn = kn();
            if (kn instanceof ey50) {
                ((ey50) kn).Y().H(new h510());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        if (r14 == null) goto L15;
     */
    @Override // xsna.xn50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        UserId userId;
        String i;
        Parcelable parcelable;
        Object parcelable2;
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = arguments.getParcelable("extra_community_id", UserId.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = arguments.getParcelable("extra_community_id");
                if (!(parcelable3 instanceof UserId)) {
                    parcelable3 = null;
                }
                parcelable = (UserId) parcelable3;
            }
            userId = (UserId) parcelable;
        }
        userId = UserId.d;
        UserId userId2 = userId;
        Bundle arguments2 = getArguments();
        int i2 = arguments2 != null ? arguments2.getInt("extra_order_id") : 0;
        Bundle arguments3 = getArguments();
        Long valueOf = arguments3 != null ? Long.valueOf(arguments3.getLong("extra_item_id")) : null;
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (i = arguments4.getString("extra_open_view_type")) == null) {
            i = ReviewOfferViewType.COMMUNITY_MAIN.i();
        }
        return new x510(new d610(new g610(UserId.d, 0, EmptyList.b, false, null)), userId2, ItemsForReviewViewTypeModel.valueOf(i.toUpperCase(Locale.ROOT)), i2 > 0 ? Integer.valueOf(i2) : null, valueOf, UUID.randomUUID().hashCode(), ((ReviewsComponent) ((k7m) m7m.f(this)).a(fpf0.a(ReviewsComponent.class))).e7(), ((ReviewsComponent) ((k7m) m7m.f(this)).a(fpf0.a(ReviewsComponent.class))).zd());
    }
}
