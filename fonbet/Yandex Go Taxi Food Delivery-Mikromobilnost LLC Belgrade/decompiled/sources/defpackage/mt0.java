package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.b;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.AccessibilityDelegateCompat;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.radio.button.RadioButtonView;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import kotlinx.coroutines.flow.r0;
import ru.yandex.logistics.sdk.cargo_form.impl.address_details.domain.c;

/* loaded from: classes5.dex */
public final /* synthetic */ class mt0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ mt0(int i, Object obj, Object obj2, Object obj3, int i2) {
        this.a = i2;
        this.c = i;
        this.w = obj;
        this.b = obj2;
        this.x = obj3;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str;
        Object value;
        LinkedHashMap linkedHashMap;
        int i = this.a;
        int i2 = 0;
        zy11 zy11Var = zy11.a;
        int i3 = this.c;
        Object obj2 = this.x;
        Object obj3 = this.b;
        Object obj4 = this.w;
        switch (i) {
            case 0:
                c cVar = (c) obj4;
                cVar.g((String) obj3, "DeleteFile", (Map) obj2);
                cVar.e.d.c((String) obj, new r5s(joa1.d(i3)));
                return zy11Var;
            case 1:
                w3j0 w3j0Var = (w3j0) obj;
                w3j0Var.d("button_name", ((String) obj3) + "_" + ((String) obj4));
                w3j0Var.b(((fki) ((hki) obj2)).a, "current_destination_point_num");
                w3j0Var.b(i3, "total_destination_points_num");
                return w3j0Var;
            case 2:
                String str2 = (String) obj3;
                enn ennVar = (enn) obj4;
                f4l0 f4l0Var = (f4l0) obj2;
                s9e s9eVar = (s9e) obj;
                if (str2 != null) {
                    if (s9eVar != null && (str = s9eVar.b) != null) {
                        r0 r0Var = ennVar.f.a;
                        do {
                            value = r0Var.getValue();
                            linkedHashMap = new LinkedHashMap((Map) value);
                            linkedHashMap.put(str2, str);
                        } while (!r0Var.k(value, linkedHashMap));
                    }
                } else if (s9eVar != null) {
                    f4l0Var.e(i3, s9eVar);
                }
                return zy11Var;
            case 3:
                ((m6y) ((u6y) obj)).f(i3, null, av0.C, new a(1387103546, new dhj0(5, (tse) obj4, (b) obj3, (a) obj2), true));
                return zy11Var;
            case 4:
                yqu yquVar = (yqu) obj4;
                k kVar = (k) obj3;
                o oVar = (o) obj2;
                o.a aVar = (o.a) obj;
                int i4 = yquVar.b;
                yny0 yny0Var = yquVar.a;
                vw01 vw01Var = yquVar.c;
                ery0 ery0Var = (ery0) yquVar.w.invoke();
                yny0Var.a(Orientation.Horizontal, xlb1.b(aVar, i4, vw01Var, ery0Var != null ? ery0Var.a : null, kVar.getLayoutDirection() == LayoutDirection.Rtl, oVar.a), i3, oVar.a);
                o.a.o(aVar, oVar, Math.round(-yny0Var.a.getFloatValue()), 0);
                return zy11Var;
            case 5:
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) obj4;
                tls tlsVar = (tls) obj3;
                CountDownLatch countDownLatch = (CountDownLatch) obj2;
                hlf0 hlf0Var = (hlf0) obj;
                if (hlf0Var instanceof glf0) {
                    concurrentHashMap.put(Integer.valueOf(i3), new xmx(((glf0) hlf0Var).a));
                } else {
                    if (!(hlf0Var instanceof flf0)) {
                        w511.b();
                        return null;
                    }
                    tlsVar.invoke(((flf0) hlf0Var).a);
                }
                countDownLatch.countDown();
                return zy11Var;
            case 6:
                ((q6c0) obj4).F(i3, (RadioButtonView) obj, (a6i0) obj3, (el11) obj2);
                return zy11Var;
            case 7:
                o[] oVarArr = (o[]) obj4;
                lhl0 lhl0Var = (lhl0) obj3;
                int[] iArr = (int[]) obj2;
                o.a aVar2 = (o.a) obj;
                int length = oVarArr.length;
                int i5 = 0;
                while (i2 < length) {
                    o oVar2 = oVarArr[i2];
                    int i6 = i5 + 1;
                    Object a = oVar2.a();
                    hhl0 hhl0Var = a instanceof hhl0 ? (hhl0) a : null;
                    vtb1 vtb1Var = hhl0Var != null ? hhl0Var.c : null;
                    aVar2.g(oVar2, iArr[i5], vtb1Var != null ? vtb1Var.b(i3, oVar2.b, LayoutDirection.Ltr) : lhl0Var.b.a(oVar2.b, i3), 0.0f);
                    i2++;
                    i5 = i6;
                }
                return zy11Var;
            case 8:
                wls wlsVar = (wls) obj4;
                jpy0 jpy0Var = (jpy0) obj3;
                oz40 oz40Var = (oz40) obj2;
                hoy0 hoy0Var = (hoy0) obj;
                String str3 = hoy0Var.a.b;
                if (str3.length() <= i3) {
                    oz40Var.setValue(hoy0Var);
                    wlsVar.invoke(str3, jpy0Var.h);
                } else {
                    String A0 = gvu0.A0(i3, str3);
                    long j = hoy0Var.b;
                    int i7 = asy0.c;
                    int i8 = (int) (j >> 32);
                    oz40Var.setValue(new hoy0(A0, eja1.c(i8, i8), 4));
                    wlsVar.invoke(((hoy0) oz40Var.getValue()).a.b, jpy0Var.h);
                }
                return zy11Var;
            default:
                View view = (View) obj4;
                sls slsVar = (sls) obj3;
                sls slsVar2 = (sls) obj2;
                ViewParent parent = view.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup == null) {
                    return new u241();
                }
                AccessibilityDelegateCompat f = androidx.core.view.b.f(viewGroup);
                androidx.core.view.b.p(viewGroup, new t241(view, f, slsVar, this.c, slsVar2));
                return new te4(23, viewGroup, f);
        }
    }

    public /* synthetic */ mt0(Object obj, int i, Object obj2, Object obj3, int i2) {
        this.a = i2;
        this.w = obj;
        this.c = i;
        this.b = obj2;
        this.x = obj3;
    }

    public /* synthetic */ mt0(Object obj, Object obj2, int i, Object obj3, int i2) {
        this.a = i2;
        this.w = obj;
        this.b = obj2;
        this.c = i;
        this.x = obj3;
    }

    public /* synthetic */ mt0(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.a = i2;
        this.w = obj;
        this.b = obj2;
        this.x = obj3;
        this.c = i;
    }

    public /* synthetic */ mt0(String str, Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.w = obj;
        this.x = obj2;
        this.c = i;
    }
}
