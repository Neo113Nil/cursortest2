package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.plus.home.plaque.plugin.internal.defaults.DefaultLifecycleVisibilityDetector;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.divkit.internal.extensions.a;
import com.ybsdk.feature.qr.payments.internal.screens.presentation.QrPaymentsMainFragment;
import com.ybsdk.navigation.NavigationFragment;
import com.ybsdk.screens.modal.RootSlideableModalView;
import defpackage.upl;
import java.util.ArrayList;
import ru.yandex.taxi.maas.impl.ride.exitchoice.MaasExitChooseModalView;
import ru.yandex.taxi.maas.impl.ride.metropick.MaasMetroPickModalView;
import ru.yandex.taxi.multiorder.BubbleModalView;

/* loaded from: classes2.dex */
public final /* synthetic */ class o6 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean z;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((a) obj).invoke();
                break;
            case 1:
                com.yandex.div.core.view2.a aVar = (com.yandex.div.core.view2.a) obj;
                if (aVar.z && aVar.c.getVisibility() != 0) {
                    aVar.b();
                    break;
                }
                break;
            case 2:
                BubbleModalView.onGlobalLayoutListener$lambda$0((BubbleModalView) obj);
                break;
            case 3:
                CustomizableMediaView.a((CustomizableMediaView) obj);
                break;
            case 4:
                DefaultLifecycleVisibilityDetector.onGlobalLayoutListener$lambda$0((DefaultLifecycleVisibilityDetector) obj);
                break;
            case 5:
                final upl uplVar = (upl) obj;
                Rect rect = uplVar.b;
                YbDivView ybDivView = uplVar.a;
                if (ybDivView.isShown() && ybDivView.getGlobalVisibleRect(rect)) {
                    int height = rect.height() * rect.width();
                    int height2 = ybDivView.getHeight() * ybDivView.getWidth();
                    if (height2 != 0 && (height * 100) / height2 > 0) {
                        ybDivView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.ybsdk.screens.divbottomsheet.DivViewVisibilityLogHelper$clearListeners$$inlined$doOnNextLayout$1
                            @Override // android.view.View.OnLayoutChangeListener
                            public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                                view.removeOnLayoutChangeListener(this);
                                upl.this.a.getViewTreeObserver().removeOnGlobalLayoutListener(upl.this.c);
                                upl.this.c = null;
                            }
                        });
                        ybDivView.tryLogVisibility();
                        break;
                    }
                }
                break;
            case 6:
                com.yandex.messaging.input.util.a aVar2 = (com.yandex.messaging.input.util.a) obj;
                qv10.B(aVar2.a(), aVar2.d, null);
                zq60 zq60Var = aVar2.b;
                zq60Var.getClass();
                zq60Var.b++;
                ArrayList arrayList = zq60Var.a;
                int size = arrayList.size();
                int i2 = 0;
                boolean z2 = false;
                while (true) {
                    int i3 = i2;
                    while (i3 < size && arrayList.get(i3) == null) {
                        i3++;
                    }
                    if (i3 < size) {
                        z = true;
                    } else {
                        if (!z2) {
                            zq60.a(zq60Var);
                            z2 = true;
                        }
                        z = false;
                    }
                    if (!z) {
                        break;
                    } else {
                        while (i2 < size && arrayList.get(i2) == null) {
                            i2++;
                        }
                        if (i2 >= size) {
                            if (!z2) {
                                zq60.a(zq60Var);
                            }
                            ny61.p();
                            break;
                        } else {
                            ((dkx) arrayList.get(i2)).getClass();
                            i2++;
                        }
                    }
                }
            case 7:
                ekx ekxVar = (ekx) obj;
                bkx c = lcb1.c(ekxVar.a);
                if (!c.equals(ekxVar.c)) {
                    RootSlideableModalView._init_$lambda$2((RootSlideableModalView) ekxVar.b.b, c);
                    ekxVar.c = c;
                    break;
                }
                break;
            case 8:
                MaasExitChooseModalView.onAttachedToWindow$lambda$0((MaasExitChooseModalView) obj);
                break;
            case 9:
                MaasMetroPickModalView.onAttachedToWindow$lambda$0((MaasMetroPickModalView) obj);
                break;
            case 10:
                NavigationFragment.initBottomSheetAccessibility$lambda$39$lambda$38((s861) obj);
                break;
            case 11:
                QrPaymentsMainFragment.onViewCreated$lambda$17((QrPaymentsMainFragment) obj);
                break;
            default:
                ((YbDivView) obj).setScreenSizeVariables();
                break;
        }
    }
}
