package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.navigation.screen.c;
import com.yandex.go.payments.cards.ui.AddCardViewImpl;
import com.yandex.go.routestops.RouteStopsModalView;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import java.util.function.Supplier;
import ru.yandex.taxi.logistics.ndd_map.router.e;
import ru.yandex.taxi.order.f;
import ru.yandex.taxi.preorder.source.domain.r;
import ru.yandex.taxi.preorder.source.points.a;
import ru.yandex.taxi.search.fragment.AddressMapPickerFragment;
import ru.yandex.taxi.tariffs.model.DeliveryFlowType;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes12.dex */
public final /* synthetic */ class ob0 implements Supplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ob0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0104 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    @Override // java.util.function.Supplier
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get() {
        View findFocus;
        String onViewCreated$lambda$0$0;
        String c;
        String str;
        Integer attachSlideableShadowView$lambda$0;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                findFocus = ((AddCardViewImpl) obj).findFocus();
                return findFocus;
            case 1:
                onViewCreated$lambda$0$0 = AddressMapPickerFragment.onViewCreated$lambda$0$0((AddressMapPickerFragment) obj);
                return onViewCreated$lambda$0$0;
            case 2:
                gif gifVar = (gif) obj;
                c cVar = gifVar.a;
                jpv0 b = gifVar.e.b();
                b.getClass();
                if ((b instanceof fpv0) && !gifVar.b.b() && !gifVar.d.a()) {
                    r3 = (cVar.b() == Screen.MULTI_AREA || cVar.b() == Screen.TAXI_MAIN) ? "default" : "main";
                }
                return r3 == null ? "" : r3;
            case 3:
                return ((jmw) obj).y0.a;
            case 4:
                return (TaxiOrder) obj;
            case 5:
                e eVar = (e) obj;
                ji50 ji50Var = eVar.a;
                if (ji50Var instanceof hi50) {
                    hi50 hi50Var = (hi50) ji50Var;
                    String str2 = hi50Var.c;
                    d51 d51Var = hi50Var.b;
                    if (d51Var instanceof b51) {
                        if (str2 == null) {
                            str2 = Mode.DELIVERY_NDD.getSerializedName();
                        }
                        if (eVar.H.a().a) {
                            String str3 = eVar.s.b().t.e;
                            r3 = evu0.J(str3) ? null : str3;
                            if (r3 != null) {
                                str2 = r3;
                            }
                        }
                    } else {
                        if (!(d51Var instanceof c51)) {
                            w511.b();
                            return null;
                        }
                        if (str2 == null) {
                            c = hi50Var.a;
                        }
                    }
                    str = str2;
                    return str.length() != 0 ? TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY : str;
                }
                c = ji50Var.c();
                str = c;
                if (str.length() != 0) {
                }
            case 6:
                f fVar = (f) obj;
                if (fVar.u()) {
                    return fVar.p1;
                }
                return null;
            case 7:
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                return BitmapFactory.decodeResource(((hmb0) obj).a.getResources(), 0, options);
            case 8:
                Drawable drawable = (Drawable) ((i5c0) obj).o.getValue();
                if (drawable != null) {
                    return ffx.d0(drawable, 0, 0, 7);
                }
                ny61.r("Required value was null.");
                return null;
            case 9:
                return ((c2d0) obj).f.c();
            case 10:
                v8l0 v8l0Var = (v8l0) obj;
                pex0 m = ((k) v8l0Var.b).m();
                ati atiVar = m != null ? m.Z : null;
                if (atiVar == null || atiVar.f != DeliveryFlowType.ROVER) {
                    if ((m != null ? m.F0 : null) != null) {
                        if (m != null) {
                            r3 = m.F0;
                        }
                    } else if (m != null && jl40.l(m.b, v8l0Var.c.a)) {
                        r3 = v8l0Var.c.b;
                    }
                } else {
                    r3 = "rover";
                }
                return r3 == null ? "" : r3;
            case 11:
                attachSlideableShadowView$lambda$0 = RouteStopsModalView.attachSlideableShadowView$lambda$0((RouteStopsModalView) obj);
                return attachSlideableShadowView$lambda$0;
            case 12:
                return ((mvq0) obj).k0.a;
            case 13:
                return u8b1.h(a0h0.ic_boarding_point, ((r) obj).c);
            default:
                return ((a) obj).b().get$image();
        }
    }
}
