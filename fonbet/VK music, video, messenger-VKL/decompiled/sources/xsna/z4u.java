package xsna;

import android.content.Context;
import android.view.View;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.ecomm.market.good.ui.restriction.ProductCardRestrictionViewState;
import com.vk.ecomm.market.good.ui.restriction.b;
import com.vk.ecomm.market.good.ui.restriction.c;
import com.vk.ecomm.moderation.api.restrictions.ModerationCheckAdultResult;

/* compiled from: GoodFragmentRestrictionsInteractor.kt */
/* loaded from: classes18.dex */
public final class z4u {
    public final r7u a;
    public final y4u b;
    public final com.vk.ecomm.market.good.ui.restriction.a c;

    /* compiled from: GoodFragmentRestrictionsInteractor.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ModerationCheckAdultResult.values().length];
            try {
                iArr[ModerationCheckAdultResult.ADULT_NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ModerationCheckAdultResult.CONFIRM_ADULT_REQUIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ModerationCheckAdultResult.ONLY_FOR_ADULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
    public z4u(GoodFragment.d dVar, y4u y4uVar, io.reactivex.rxjava3.disposables.b bVar, Context context, View view) {
        this.a = dVar;
        this.b = y4uVar;
        this.c = new com.vk.ecomm.market.good.ui.restriction.a(dVar, (n430) y4uVar.W.getValue(), (dhc) y4uVar.M.getValue(), bVar, (qdz) y4uVar.Y.getValue(), context, view);
    }

    public final void a() {
        com.vk.ecomm.market.good.ui.restriction.a aVar = this.c;
        aVar.g.setVisibility(0);
        aVar.c(new ProductCardRestrictionViewState(ProductCardRestrictionViewState.Icon.Lock, b.d.a, new ProductCardRestrictionViewState.Button(ProductCardRestrictionViewState.Button.Mode.Tertiary, c.d.a, false), null));
        this.a.e();
    }
}
