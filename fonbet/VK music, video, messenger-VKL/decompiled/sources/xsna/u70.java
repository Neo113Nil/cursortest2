package xsna;

import android.content.Context;
import android.widget.EditText;
import com.vk.common.links.LaunchContext;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.fave.MarketFavable;
import com.vk.ecomm.market.good.ui.restriction.ProductCardRestrictionViewState;
import com.vk.ecomm.market.good.ui.restriction.c;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.video.ui.discovery.minimizable.doc2doc.onboarding.D2DOnboardingView;
import kotlin.Pair;
import xsna.v70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class u70 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u70(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        ProductCardRestrictionViewState.Button button;
        ProductCardRestrictionViewState.Button button2;
        int i = this.b;
        ProductCardRestrictionViewState productCardRestrictionViewState = null;
        r3 = null;
        ProductCardRestrictionViewState.Button button3 = null;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                v70.a aVar = (v70.a) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(398664128, intValue, -1, "com.vk.ecomm.reviews.impl.dialogs.actionsmenu.ActionsSheet.Builder.<anonymous> (ActionsSheet.kt:27)");
                    }
                    z70.b(0, aVar2, aVar.h, aVar.i, null);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                ((rr5) obj3).a(ne7.I(7), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                int i2 = D2DOnboardingView.n;
                ((D2DOnboardingView) obj3).o(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 3:
                EditText editText = (EditText) obj;
                String[] strArr = DebugDevSettingsFragment.t0;
                editText.setInputType(1);
                editText.setHint("wereaction");
                editText.setText((String) obj3);
                return null;
            case 4:
                ((Integer) obj2).getClass();
                ((v0r) obj3).l(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 5:
                com.vk.ecomm.market.good.ui.restriction.a aVar3 = (com.vk.ecomm.market.good.ui.restriction.a) obj3;
                ProductCardRestrictionViewState a = aVar3.a();
                if (((a == null || (button2 = a.c) == null) ? null : button2.b) instanceof c.b) {
                    ProductCardRestrictionViewState a2 = aVar3.a();
                    if (a2 != null) {
                        ProductCardRestrictionViewState a3 = aVar3.a();
                        if (a3 != null && (button = a3.c) != null) {
                            button3 = ProductCardRestrictionViewState.Button.a(button, false);
                        }
                        productCardRestrictionViewState = ProductCardRestrictionViewState.a(a2, button3);
                    }
                    aVar3.c(productCardRestrictionViewState);
                }
                return s3q0.a;
            case 6:
                uiy uiyVar = (uiy) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1885552407, intValue2, -1, "com.vk.music.stickyplayer.presentation.components.podcast.KidsPodcastBigPlayerControls.Content.<anonymous> (KidsPodcastBigPlayerControls.kt:37)");
                    }
                    uiyVar.c(0, aVar4);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 7:
                ((Integer) obj2).getClass();
                ((wzy) obj3).a(ne7.I(55), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 8:
                lb40 lb40Var = (lb40) obj3;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-150717830, intValue3, -1, "com.vk.music.stickyplayer.presentation.components.MusicBigPlayerControls.Content.<anonymous> (MusicBigPlayerControls.kt:44)");
                    }
                    lb40Var.b(0, aVar5);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            case 9:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                gmq gmqVar = (gmq) obj2;
                boolean X = gmqVar.X();
                rkd0 rkd0Var = ((lld0) obj3).b;
                ((gwh0) rkd0Var.E.getValue()).a(X ? MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.FAVE_OUT : MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.UNFAVE_OUT);
                if (gmqVar instanceof MarketFavable) {
                    MarketFavable marketFavable = (MarketFavable) gmqVar;
                    ((fy00) rkd0Var.o.getValue()).b(new hy00(marketFavable.b, marketFavable.c, booleanValue));
                }
                return s3q0.a;
            case 10:
                int M = drm0.M((CharSequence) obj, (char[]) obj3, ((Integer) obj2).intValue(), false);
                if (M < 0) {
                    return null;
                }
                return new Pair(Integer.valueOf(M), 1);
            default:
                maz.c(((com.vk.catalog2.common.ui.mvp.configuration.a) obj3).k0().e(), (Context) obj, (String) obj2, LaunchContext.A, null, null, 24);
                return s3q0.a;
        }
    }

    public /* synthetic */ u70(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
