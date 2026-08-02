package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.runtime.f;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.scooters.mosru.b;
import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.i330;
import defpackage.o430;
import defpackage.tfx;
import defpackage.wls;
import defpackage.zy11;
import kotlin.jvm.internal.Ref$FloatRef;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.scroll.Anchor;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.SliderButtonView;
import ru.yandex.taxi.logistics.sdk.dashboard.ui.widget.tile.a;
import ru.yandex.taxi.logistics.sdk.show_modalview_action.ui.c;
import ru.yandex.taxi.widget.floatbuttonholder.RotatableFloatButton;

/* loaded from: classes5.dex */
public final /* synthetic */ class c1p0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c1p0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = 6;
        int i3 = 2;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                k4b1.d((s1p0) obj4, (tls) obj3, (fid) obj, vng.O(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                g2p0.h((l2p0) obj4, (f530) obj3, (fid) obj, vng.O(1));
                break;
            case 2:
                b5p0 b5p0Var = (b5p0) obj4;
                ((sls) obj).invoke();
                b5p0Var.A((m950) b5p0Var.H.get(), new w8p0(new r8p0(((eer) obj3).o.b), (b) null, 6), new hac0(i3, (sls) obj2));
                break;
            case 3:
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) obj4;
                float floatValue = ((Float) obj).floatValue();
                ((Float) obj2).floatValue();
                float f = ref$FloatRef.element;
                ref$FloatRef.element = ((iip0) obj3).a(floatValue - f) + f;
                break;
            case 4:
                ((Integer) obj2).getClass();
                d5b1.c((qip0) obj4, (Anchor) obj3, (fid) obj, vng.O(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                u9b1.b((f530) obj4, (vge) obj3, (fid) obj, vng.O(7));
                break;
            case 6:
                ((Integer) obj).getClass();
                muq0 muq0Var = (muq0) obj2;
                wtv wtvVar = new wtv((ouq0) obj4, muq0Var);
                ((nw8) ((pgk0) obj3).b).getClass();
                break;
            case 7:
                ((Integer) obj2).getClass();
                ccb1.c((jrr0) obj4, (sls) obj3, (fid) obj, vng.O(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                ctr0.a((f530) obj4, (wls) obj3, (fid) obj, vng.O(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                a.b((f530) obj4, (a5z0) obj3, (fid) obj, vng.O(1));
                break;
            case 10:
                Activity activity = (Activity) obj3;
                Lifecycle.Event event = (Lifecycle.Event) obj2;
                if (((d6s0) obj4).a) {
                    if (event == Lifecycle.Event.ON_PAUSE && activity != null) {
                        kf91.c(activity);
                    }
                    if (event == Lifecycle.Event.ON_RESUME && activity != null) {
                        WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
                        attributes.screenBrightness = 1.0f;
                        activity.getWindow().setAttributes(attributes);
                        break;
                    }
                }
                break;
            case 11:
                hwo0 hwo0Var = (hwo0) obj4;
                final c cVar = (c) obj3;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    qti.a((hwy0) hwo0Var.w, wwg.S(659376956, true, new wls() { // from class: ru.yandex.taxi.logistics.sdk.show_modalview_action.ui.a
                        @Override // defpackage.wls
                        public final Object invoke(Object obj5, Object obj6) {
                            fid fidVar2 = (fid) obj5;
                            int intValue2 = ((Integer) obj6).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                                c cVar2 = c.this;
                                i330 i330Var = (i330) f.b(cVar2.A, btsVar2).getValue();
                                if (i330Var == null) {
                                    btsVar2.e0(-1681390715);
                                    btsVar2.t(false);
                                } else {
                                    btsVar2.e0(-1681390714);
                                    boolean e = btsVar2.e(cVar2);
                                    Object Q = btsVar2.Q();
                                    o430 o430Var = did.a;
                                    if (e || Q == o430Var) {
                                        ShowModalViewActionScreen$getView$1$1$1$1$1$1$1$1 showModalViewActionScreen$getView$1$1$1$1$1$1$1$1 = new ShowModalViewActionScreen$getView$1$1$1$1$1$1$1$1(2, cVar2, c.class, "onButtonClick", "onButtonClick(Lcom/yandex/delivery/mapper/model/DashboardAction;Ljava/lang/String;)V", 0);
                                        btsVar2.o0(showModalViewActionScreen$getView$1$1$1$1$1$1$1$1);
                                        Q = showModalViewActionScreen$getView$1$1$1$1$1$1$1$1;
                                    }
                                    wls wlsVar = (wls) ((tfx) Q);
                                    boolean e2 = btsVar2.e(cVar2);
                                    Object Q2 = btsVar2.Q();
                                    if (e2 || Q2 == o430Var) {
                                        ShowModalViewActionScreen$getView$1$1$1$1$1$1$2$1 showModalViewActionScreen$getView$1$1$1$1$1$1$2$1 = new ShowModalViewActionScreen$getView$1$1$1$1$1$1$2$1(2, cVar2, c.class, "onShown", "onShown(Ljava/lang/String;Ljava/lang/Object;)V", 0);
                                        btsVar2.o0(showModalViewActionScreen$getView$1$1$1$1$1$1$2$1);
                                        Q2 = showModalViewActionScreen$getView$1$1$1$1$1$1$2$1;
                                    }
                                    ru.yandex.taxi.logistics.sdk.show_modalview_action.ui.components.a.b(i330Var, wlsVar, (wls) ((tfx) Q2), btsVar2, 0);
                                    btsVar2.t(false);
                                }
                            } else {
                                btsVar2.Y();
                            }
                            return zy11.a;
                        }
                    }, btsVar), btsVar, 56);
                    break;
                }
            case 12:
                aq80 aq80Var = (aq80) obj4;
                xz3 xz3Var = (xz3) obj3;
                View inflate = ((LayoutInflater) obj).inflate(zrh0.popup_modal_slider_item, (ViewGroup) obj2, false);
                int i4 = agh0.slider_button_view;
                SliderButtonView sliderButtonView = (SliderButtonView) cma1.O(i4, inflate);
                if (sliderButtonView == null) {
                    ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
                    break;
                } else {
                    break;
                }
            case 13:
                ((Integer) obj2).getClass();
                tdb1.a((ebp0) obj4, (bss0) obj3, (fid) obj, vng.O(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                wdb1.h((u92) obj4, (f530) obj3, (fid) obj, vng.O(1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                az91.b((jus0) obj4, (sls) obj3, (fid) obj, vng.O(1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                ru.yandex.logistics.sdk.cargo_form.impl.ui.common.a.b((vus0) obj4, (tls) obj3, (fid) obj, vng.O(1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                ru.yandex.logistics.sdk.cargo_form.impl.ui.common.a.d((xus0) obj4, (tls) obj3, (fid) obj, vng.O(1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                ru.yandex.logistics.sdk.cargo_form.impl.ui.common.a.o((ivs0) obj4, (tls) obj3, (fid) obj, vng.O(1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                ru.yandex.logistics.sdk.cargo_form.impl.ui.common.a.f((zus0) obj4, (tls) obj3, (fid) obj, vng.O(1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                ru.yandex.logistics.sdk.cargo_form.impl.ui.common.a.n((hvs0) obj4, (tls) obj3, (fid) obj, vng.O(1));
                break;
            case 21:
                zls zlsVar = (zls) obj4;
                o0t0 o0t0Var = (o0t0) obj3;
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    zlsVar.invoke(o0t0Var, btsVar2, 0);
                    break;
                }
            case 22:
                ru.yandex.taxi.preorder.suggested.selection.c cVar2 = (ru.yandex.taxi.preorder.suggested.selection.c) obj4;
                ga0 ga0Var = (ga0) obj3;
                RotatableFloatButton rotatableFloatButton = new RotatableFloatButton(cVar2.O.getContext(), null, 0, 0, 14, null);
                ru.yandex.taxi.design.utils.c.z(new gyt0(5, cVar2, ga0Var), rotatableFloatButton);
                rotatableFloatButton.setImageDrawable((Drawable) obj2);
                rotatableFloatButton.setContentDescription(ga0Var.b);
                androidx.core.view.b.p(rotatableFloatButton, new ei(22));
                View view = cVar2.a;
                int h = ru.yandex.taxi.design.utils.c.h(16, view);
                int u = tje.u(6, view.getContext());
                rotatableFloatButton.setPadding(h, u, h, u);
                ((ListItemComponent) obj).setTrailView(rotatableFloatButton);
                break;
            case 23:
                ((Integer) obj2).getClass();
                com.yandex.go.summary.ui.compose.mapcontent.surge.a.f((bww0) obj4, (f530) obj3, (fid) obj, vng.O(1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                com.yandex.go.summary.ui.compose.mapcontent.surge.a.b((fow0) obj4, (f530) obj3, (fid) obj, vng.O(1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                com.yandex.go.summary.ui.compose.mapcontent.surge.a.a((eow0) obj4, (f530) obj3, (fid) obj, vng.O(49));
                break;
            case 26:
                ((Integer) obj2).getClass();
                com.yandex.go.summary.ui.compose.mapcontent.surge.a.g((iww0) obj4, (f530) obj3, (fid) obj, vng.O(1));
                break;
            case 27:
                rzw0 rzw0Var = (rzw0) obj4;
                tls tlsVar = (tls) obj3;
                fid fidVar3 = (fid) obj;
                int intValue3 = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (!btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                    btsVar3.Y();
                    break;
                } else {
                    cx20.a(null, null, null, null, null, false, false, null, wwg.S(-53499331, true, new ays0(i2, rzw0Var, tlsVar), btsVar3), btsVar3, 100663296, 255);
                    break;
                }
            case 28:
                ((Integer) obj2).getClass();
                com.yandex.go.summary.ui.compose.common.tariffcell.a.f((mex0) obj4, (f530) obj3, (fid) obj, vng.O(1));
                break;
            default:
                ((Integer) obj2).getClass();
                com.yandex.go.summary.ui.compose.common.tariffcell.a.b((k58) obj4, (f530) obj3, (fid) obj, vng.O(1));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ c1p0(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }
}
