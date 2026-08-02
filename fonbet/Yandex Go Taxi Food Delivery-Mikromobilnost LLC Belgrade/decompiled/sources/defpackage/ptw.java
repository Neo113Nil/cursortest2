package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.camera.core.e;
import androidx.compose.foundation.lazy.grid.b;
import androidx.compose.ui.node.LayoutNode;
import com.yandex.go.intentprocessor.i;
import com.yandex.go.navigator.experiment.NavigatorLanguageSettingAvailabilityExperiment;
import com.yandex.go.payments.domain.BankModel;
import com.yandex.go.payments.domain.m;
import com.yandex.mapkit.map.VisibleRegion;
import com.yandex.messaging.isolated.IsolatedRootLayoutBuilder;
import com.ybsdk.feature.kyc.internal.screens.photo.KycPhotoFragment;
import com.ybsdk.feature.kyc.internal.screens.photov2.KycPhotoV2Fragment;
import com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.selectprovider.domain.InternetProviderWithPersonalAccountEntity;
import defpackage.bxz;
import defpackage.hwz;
import defpackage.tje;
import defpackage.waz;
import defpackage.zaz;
import defpackage.zy11;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.linked_order.modals.info.LinkedOrderInfoModalView;
import ru.yandex.taxi.maas.impl.ride.exitchoice.MaasExitChooseModalView;
import ru.yandex.taxi.maas.impl.ride.metropick.MaasMetroPickModalView;
import ru.yandex.taxi.maas.impl.ride.metropick.c;
import ru.yandex.taxi.systemrequeirements.location.LocationRequirementsException;
import ru.yandex.taxi.systemrequeirements.location.l;
import ru.yandex.video.m3.list_player_manager.ListYandexPlayer;
import ru.yandex.video.m3.list_player_manager.ListYandexPlayerManager;

/* loaded from: classes13.dex */
public final /* synthetic */ class ptw implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ptw(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c8  */
    @Override // defpackage.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        zy11 consumeSideEffect$lambda$22;
        zy11 showBottomSheet$lambda$24;
        i4y i4yVar;
        s6y s6yVar;
        zy11 insetsType$lambda$0;
        zy11 adapter$lambda$0;
        zy11 adapter$lambda$02;
        int i = this.a;
        float f = 0.0f;
        i4y i4yVar2 = null;
        s6y s6yVar2 = null;
        int i2 = 0;
        char c = 1;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(evu0.y(((InternetProviderWithPersonalAccountEntity) obj).getProvider().getName(), ((utw) obj2).b, true));
            case 1:
                ViewGroup.LayoutParams generateLayoutParams = ((IsolatedRootLayoutBuilder) obj2).generateLayoutParams(-2, -2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) generateLayoutParams;
                layoutParams.width = 0;
                layoutParams.height = 0;
                ((View) obj).setLayoutParams(generateLayoutParams);
                return zy11Var;
            case 2:
                consumeSideEffect$lambda$22 = KycPhotoFragment.consumeSideEffect$lambda$22((KycPhotoFragment) obj2, ((Boolean) obj).booleanValue());
                return consumeSideEffect$lambda$22;
            case 3:
                showBottomSheet$lambda$24 = KycPhotoV2Fragment.showBottomSheet$lambda$24((KycPhotoV2Fragment) obj2, ((Boolean) obj).booleanValue());
                return showBottomSheet$lambda$24;
            case 4:
                y1u0 y1u0Var = (y1u0) ((zrx) obj);
                c2u0 c2u0Var = y1u0Var.a;
                c2u0Var.A((m950) c2u0Var.F.get(), (NavigatorLanguageSettingAvailabilityExperiment.Language) obj2, new b2u0(c2u0Var, y1u0Var.b));
                return zy11Var;
            case 5:
                return Integer.valueOf(((s1n) obj2).j(((Integer) obj).intValue()));
            case 6:
                b bVar = (b) obj2;
                float floatValue = ((Float) obj).floatValue();
                tig0 tig0Var = b.w;
                float f2 = -floatValue;
                if ((f2 >= 0.0f || bVar.b()) && (f2 <= 0.0f || bVar.e())) {
                    if (Math.abs(bVar.g) > 0.5f) {
                        lxv.c("entered drag with non-zero pending scroll");
                    }
                    float f3 = bVar.g + f2;
                    bVar.g = f3;
                    if (Math.abs(f3) > 0.5f) {
                        float f4 = bVar.g;
                        int b = m810.b(f4);
                        i4y d = ((i4y) bVar.e.getValue()).d(b, !bVar.b);
                        if (d != null && (i4yVar = bVar.c) != null) {
                            i4y d2 = i4yVar.d(b, true);
                            if (d2 != null) {
                                bVar.c = d2;
                            }
                            if (i4yVar2 == null) {
                                bVar.f(i4yVar2, bVar.b, true);
                                bVar.r.setValue(zy11Var);
                                bVar.h(f4 - bVar.g, i4yVar2);
                            } else {
                                xti0 xti0Var = bVar.j;
                                if (xti0Var != null) {
                                    ((LayoutNode) xti0Var).h();
                                }
                                bVar.h(f4 - bVar.g, bVar.g());
                            }
                        }
                        i4yVar2 = d;
                        if (i4yVar2 == null) {
                        }
                    }
                    if (Math.abs(bVar.g) > 0.5f) {
                        f2 -= bVar.g;
                        bVar.g = 0.0f;
                    }
                    f = f2;
                }
                return Float.valueOf(-f);
            case 7:
                return new w50(12, (o5y) obj2);
            case 8:
                return new w50(14, (y5y) obj2);
            case 9:
                q5y q5yVar = (q5y) ((j6y) obj2).a.invoke();
                int itemCount = q5yVar.getItemCount();
                while (true) {
                    if (i2 >= itemCount) {
                        i2 = -1;
                    } else if (!q5yVar.c(i2).equals(obj)) {
                        i2++;
                    }
                }
                return Integer.valueOf(i2);
            case 10:
                q6y q6yVar = (q6y) obj2;
                return q6yVar.c(((Integer) obj).intValue(), q6yVar.d);
            case 11:
                androidx.compose.foundation.lazy.b bVar2 = (androidx.compose.foundation.lazy.b) obj2;
                float floatValue2 = ((Float) obj).floatValue();
                tig0 tig0Var2 = androidx.compose.foundation.lazy.b.y;
                float f5 = -floatValue2;
                if ((f5 >= 0.0f || bVar2.b()) && (f5 <= 0.0f || bVar2.e())) {
                    if (Math.abs(bVar2.h) > 0.5f) {
                        lxv.c("entered drag with non-zero pending scroll");
                    }
                    bVar2.d = true;
                    float f6 = bVar2.h + f5;
                    bVar2.h = f6;
                    if (Math.abs(f6) > 0.5f) {
                        float f7 = bVar2.h;
                        int round = Math.round(f7);
                        s6y d3 = ((s6y) bVar2.f.getValue()).d(round, !bVar2.b);
                        if (d3 != null && (s6yVar = bVar2.c) != null) {
                            s6y d4 = s6yVar.d(round, true);
                            if (d4 != null) {
                                bVar2.c = d4;
                            }
                            if (s6yVar2 == null) {
                                bVar2.g(s6yVar2, bVar2.b, true);
                                bVar2.w.setValue(zy11Var);
                                bVar2.k(f7 - bVar2.h, s6yVar2);
                            } else {
                                xti0 xti0Var2 = bVar2.l;
                                if (xti0Var2 != null) {
                                    ((LayoutNode) xti0Var2).h();
                                }
                                bVar2.k(f7 - bVar2.h, bVar2.j());
                            }
                        }
                        s6yVar2 = d3;
                        if (s6yVar2 == null) {
                        }
                    }
                    if (Math.abs(bVar2.h) > 0.5f) {
                        f5 -= bVar2.h;
                        bVar2.h = 0.0f;
                    }
                    f = f5;
                }
                return Float.valueOf(-f);
            case 12:
                l1m0 l1m0Var = (l1m0) obj2;
                return Boolean.valueOf(l1m0Var != null ? l1m0Var.d(obj) : true);
            case 13:
                return ((e) obj2).m;
            case 14:
                insetsType$lambda$0 = LinkedOrderInfoModalView.insetsType$lambda$0((LinkedOrderInfoModalView) obj2, (t1w) obj);
                return insetsType$lambda$0;
            case 15:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                r0 r0Var = ((hoy) obj2).D;
                r0Var.getClass();
                r0Var.m(null, bool);
                return zy11Var;
            case 16:
                n70 n70Var = (n70) obj;
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                n70Var.W(new lc0(((h261) n70Var.N).a, n70Var, ref$ObjectRef, (sc20) obj2, 29));
                n70Var.b0(new z00(c == true ? 1 : 0, ref$ObjectRef));
                return zy11Var;
            case 17:
                n70 n70Var2 = (n70) obj;
                Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                n70Var2.W(new vqy(((a361) n70Var2.N).a, n70Var2, ref$ObjectRef2, (but0) obj2, 0));
                n70Var2.b0(new z00(2, ref$ObjectRef2));
                return zy11Var;
            case 18:
                ((ListYandexPlayerManager) obj).returnPlayer((ListYandexPlayer) obj2);
                return zy11Var;
            case 19:
                ((euy) obj2).cancel(false);
                return zy11Var;
            case 20:
                return ((InputMethodManager) obj2).getEnabledInputMethodSubtypeList((InputMethodInfo) obj, true);
            case 21:
                i iVar = (i) obj2;
                iVar.c.a = (t7z) obj;
                iVar.c();
                return Boolean.TRUE;
            case 22:
                final waz wazVar = (waz) obj2;
                yfd yfdVar = (yfd) obj;
                ((agd) yfdVar).c = wazVar.H.f;
                agd agdVar = (agd) yfdVar;
                agdVar.e = new tls() { // from class: com.yandex.go.permission.location_with_agreement.router.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj3) {
                        waz wazVar2 = waz.this;
                        tje.N(wazVar2.o(), null, null, new LocationPermissionV2Router$content$1$1$1(wazVar2, (zaz) obj3, null), 3);
                        return zy11.a;
                    }
                };
                agdVar.f = me4.a;
                f8d.a.getClass();
                agdVar.g = f8d.b;
                return zy11Var;
            case 23:
                l lVar = (l) obj2;
                LocationRequirementsException.Companion.getClass();
                if (ru.yandex.taxi.systemrequeirements.location.e.b((Throwable) obj)) {
                    lVar.g();
                }
                return zy11Var;
            case 24:
                VisibleRegion visibleRegion = (VisibleRegion) obj2;
                li6 li6Var = (li6) obj;
                li6Var.a(visibleRegion.getTopLeft());
                li6Var.a(visibleRegion.getTopRight());
                li6Var.a(visibleRegion.getBottomRight());
                li6Var.a(visibleRegion.getBottomLeft());
                return zy11Var;
            case 25:
                final hwz hwzVar = (hwz) obj2;
                final yfd yfdVar2 = (yfd) obj;
                final gwz gwzVar = new gwz(hwzVar);
                ((agd) yfdVar2).e = new tls() { // from class: com.yandex.go.loyalty.impl.selector.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj3) {
                        hwz hwzVar2 = hwz.this;
                        tje.N(hwzVar2.o(), null, null, new LoyaltySelectorInternalRouter$content$1$1$1(hwzVar2, (bxz) obj3, yfdVar2, gwzVar, null), 3);
                        return zy11.a;
                    }
                };
                g8d.a.getClass();
                ((agd) yfdVar2).g = g8d.b;
                return zy11Var;
            case 26:
                ayz ayzVar = ((m) obj2).c;
                BankModel.Companion.getClass();
                ayzVar.a.l(BankModel.d);
                return zy11Var;
            case 27:
                adapter$lambda$0 = MaasExitChooseModalView.adapter$lambda$0((MaasExitChooseModalView) obj2, (lmo) obj);
                return adapter$lambda$0;
            case 28:
                ((c) obj).n1(((h100) obj2).a);
                return zy11Var;
            default:
                adapter$lambda$02 = MaasMetroPickModalView.adapter$lambda$0((MaasMetroPickModalView) obj2, (j7u0) obj);
                return adapter$lambda$02;
        }
    }
}
