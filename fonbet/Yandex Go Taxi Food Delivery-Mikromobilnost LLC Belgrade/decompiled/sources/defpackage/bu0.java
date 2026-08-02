package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.go.payments.data.UnbindPaymentMethodsApi;
import com.yandex.go.payments.data.q;
import com.yandex.go.payments.sbp.data.SbpTokenApi;
import com.yandex.go.payments.sbp.data.f;
import com.yandex.go.payments.sbp.data.g;
import com.yandex.go.payments.sbp.domain.d;
import com.yandex.go.payments.sbp.domain.e;
import com.yandex.go.payments.sbp.navigation.c;
import com.yandex.go.taxi.order.change.route.RouteChangeWarning;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.TaxiOrderLocalData;
import com.yandex.passport.sloth.ui.dependencies.m;
import com.yandex.runtime.image.ImageProvider;
import java.net.URI;
import java.util.HashMap;
import java.util.Locale;
import kotlin.a;
import ru.rt.ebs.cryptosdk.core.common.controllers.ICommonController;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.fragment.CopiedNotification;
import ru.yandex.taxi.order.OrderMvpView;
import ru.yandex.taxi.widget.pin.FixedPinView;

/* loaded from: classes14.dex */
public final class bu0 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public /* synthetic */ bu0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
        this.g = obj7;
        this.h = obj8;
        this.i = obj9;
    }

    public void a(xn2 xn2Var, URI uri) {
        HashMap hashMap = (HashMap) this.h;
        hashMap.remove(xn2Var);
        HashMap hashMap2 = (HashMap) this.i;
        hashMap2.remove(xn2Var);
        String d = hhb1.d(uri.toString());
        hashMap.put(xn2Var, d);
        hashMap2.put(xn2Var, a.a(new swu(this, d, ((ICommonController) this.f).isUseGost(), false)));
    }

    public Bitmap b(zwy0 zwy0Var, float f) {
        Bitmap a;
        a = ((tcc0) this.b).a(zwy0Var, (int) (((Number) ((i3y) this.c).getValue()).intValue() * f), (int) (((Number) ((i3y) this.d).getValue()).intValue() * f), (r24 & 8) != 0 ? 0 : d(), (r24 & 16) != 0 ? 0 : d(), (r24 & 32) != 0 ? 0 : ((Number) ((i3y) this.f).getValue()).intValue(), (r24 & 64) != 0 ? null : null, (r24 & 128) != 0 ? 0 : 0, (r24 & 256) == 0, null, null);
        return a;
    }

    public void c(Bitmap bitmap, zwy0 zwy0Var, float f) {
        Canvas canvas = new Canvas(bitmap);
        float intValue = (int) (((Number) ((i3y) this.g).getValue()).intValue() * f);
        float f2 = intValue / 2.0f;
        i3y i3yVar = (i3y) this.h;
        float intValue2 = (((((Number) ((i3y) this.d).getValue()).intValue() * f) + d()) - (((Number) ((i3y) this.i).getValue()).intValue() * f)) - (((Number) i3yVar.getValue()).intValue() + f2);
        float width = bitmap.getWidth() / 2.0f;
        tcc0 tcc0Var = (tcc0) this.b;
        int intValue3 = ((Number) i3yVar.getValue()).intValue();
        Bitmap a = zwy0Var.a(tcc0Var.b.getThemeType());
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(qje.t(xng0.bgMain, tcc0Var.a));
        canvas.drawCircle(width, intValue2, intValue3 + f2, paint);
        float max = Math.max(intValue / a.getWidth(), intValue / a.getHeight());
        float width2 = a.getWidth() * max;
        float height = a.getHeight() * max;
        Paint paint2 = new Paint(1);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(a, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setScale(max, max);
        matrix.postTranslate(width - (width2 / 2.0f), intValue2 - (height / 2.0f));
        bitmapShader.setLocalMatrix(matrix);
        paint2.setShader(bitmapShader);
        canvas.drawCircle(width, intValue2, f2, paint2);
    }

    public int d() {
        return ((Number) ((i3y) this.e).getValue()).intValue();
    }

    public c e() {
        String str = (String) this.a;
        w030 w030Var = (w030) this.b;
        c0g c0gVar = (c0g) ((i6r) this.c);
        Context W1 = c0gVar.W1();
        q5z.h(W1);
        c0g c0gVar2 = c0gVar.A;
        zzf zzfVar = c0gVar2.a.a;
        com.yandex.go.payments.sbp.domain.c cVar = new com.yandex.go.payments.sbp.domain.c((f) zzfVar.Gq.get(), (tt2) zzfVar.n.get());
        dfm0 N = c0gVar2.a.N();
        zzf zzfVar2 = c0gVar.z;
        return new c(str, w030Var, W1, new ygm0(cVar, N, zzfVar2.b1()), c0gVar.E2(), (zi60) this.g, new d(new g((SbpTokenApi) c0gVar2.a.a.Fq.get())), new e((com.yandex.go.payments.paymentlist.data.c) zzfVar2.j1.get(), new q((UnbindPaymentMethodsApi) zzfVar2.pj.get())), new tim0((f) c0gVar2.a.a.Gq.get()), (jpj0) this.h, (vfg0) this.i);
    }

    public void f(ibk0 ibk0Var) {
        int i = 1;
        if (ibk0Var instanceof uak0) {
            uak0 uak0Var = (uak0) ibk0Var;
            cm70 cm70Var = (cm70) ((zch) this.a).a;
            if (uak0Var instanceof sak0) {
                xl10 xl10Var = cm70Var.b;
                if (xl10Var == null) {
                    xl10Var = null;
                }
                com.yandex.go.taxi.order.view.e eVar = ((o480) xl10Var.a).a;
                ((ru.yandex.taxi.order.f) eVar.D).Y(eVar.B, null, null);
                return;
            }
            if (!(uak0Var instanceof tak0)) {
                w511.b();
                return;
            }
            xl10 xl10Var2 = cm70Var.b;
            com.yandex.go.taxi.order.view.e eVar2 = ((o480) (xl10Var2 != null ? xl10Var2 : null).a).a;
            ci70 ci70Var = eVar2.E;
            o2y0 o2y0Var = eVar2.B;
            String str = o2y0Var.b().a;
            yh70 yh70Var = ci70Var.f;
            yh70Var.getClass();
            yh70Var.a.a("openEditPorchNumber", new HashMap(), 1, new HashMap());
            ru.yandex.taxi.order.f fVar = (ru.yandex.taxi.order.f) eVar2.D;
            fVar.E((m950) fVar.z0.get(), o2y0Var.b(), new bp70(o2y0Var, fVar), hxx.a);
            return;
        }
        if (ibk0Var instanceof oak0) {
            oak0 oak0Var = (oak0) ibk0Var;
            xl10 xl10Var3 = ((cm70) ((qnh) this.b).a).b;
            o480 o480Var = (o480) (xl10Var3 != null ? xl10Var3 : null).a;
            if (oak0Var instanceof mak0) {
                com.yandex.go.taxi.order.view.e eVar3 = o480Var.a;
                if (((OrderMvpView) eVar3.Dg()).hasPopupsShown()) {
                    return;
                }
                ci70 ci70Var2 = eVar3.E;
                String str2 = eVar3.B.b().a;
                fo70 fo70Var = ci70Var2.z;
                String b = ci70Var2.b(str2);
                fo70Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("order_id", str2);
                hashMap.put("mode", b);
                fo70Var.a.a("OrderChangeWillDisplayAddMidPointSelection", hashMap, 1, new HashMap());
                ((OrderMvpView) eVar3.Dg()).showRouteChangeWarning(RouteChangeWarning.ADD_ROUTE_POINT);
                return;
            }
            if (!(oak0Var instanceof nak0)) {
                w511.b();
                return;
            }
            com.yandex.go.taxi.order.view.e eVar4 = o480Var.a;
            if (((OrderMvpView) eVar4.Dg()).hasPopupsShown()) {
                return;
            }
            ci70 ci70Var3 = eVar4.E;
            String str3 = eVar4.B.b().a;
            x770 x770Var = ci70Var3.A;
            String b2 = ci70Var3.b(str3);
            x770Var.getClass();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("order_id", str3);
            hashMap2.put("mode", b2);
            x770Var.a.a("OrderChangeWillDisplayEditMidPointSelection", hashMap2, 1, new HashMap());
            ((OrderMvpView) eVar4.Dg()).showRouteChangeWarning(RouteChangeWarning.CHANGE_ROUTE_POINT);
            return;
        }
        if (ibk0Var instanceof l9k0) {
            xl10 xl10Var4 = ((cm70) ((yzh) this.c).a).b;
            com.yandex.go.taxi.order.view.e eVar5 = ((o480) (xl10Var4 != null ? xl10Var4 : null).a).a;
            if (((OrderMvpView) eVar5.Dg()).hasPopupsShown()) {
                return;
            }
            ci70 ci70Var4 = eVar5.E;
            String str4 = eVar5.B.b().a;
            yh70 yh70Var2 = ci70Var4.f;
            yh70Var2.getClass();
            yh70Var2.a.a("openAddDest", new HashMap(), 1, new HashMap());
            ((OrderMvpView) eVar5.Dg()).showRouteChangeWarning(RouteChangeWarning.CHANGE_DESTINATION);
            return;
        }
        if (ibk0Var instanceof hak0) {
            ((ru.yandex.taxi.order.f) ((l2y0) this.h).a).k0((o2y0) this.i);
            return;
        }
        int i2 = 0;
        if (ibk0Var instanceof yak0) {
            m mVar = (m) this.d;
            yak0 yak0Var = (yak0) ibk0Var;
            int i3 = 3;
            int i4 = 2;
            if (yak0Var instanceof wak0) {
                ((pep0) ((oep0) mVar.j)).f(new uva(i3, (ypc) ((yvf0) mVar.i).get(), new gyt0(20, mVar, yak0Var)), new wpc(eqc.b, i4), hxx.a);
                return;
            } else if (yak0Var instanceof xak0) {
                ((pep0) ((oep0) mVar.j)).f(new f9a((gkw0) ((yvf0) mVar.c).get(), (yvf0) mVar.i, (oep0) mVar.j, new oiw0(mVar, i2), new but0(10, mVar), new oiw0(mVar, i), new oiw0(mVar, i4), new oiw0(mVar, i3)), (o2y0) mVar.a, hxx.a);
                return;
            } else {
                w511.b();
                return;
            }
        }
        if (ibk0Var instanceof gbk0) {
            gbk0 gbk0Var = (gbk0) ibk0Var;
            wwf wwfVar = (wwf) ((yzh) this.e).a;
            ((x770) ((qnh) wwfVar.b).a).a.a("ShortcutsOrderCard.Tapped", g8e.u("id", gbk0Var.a.a, MetaDataField.SCREEN_FIELD, "ORDER_DETAILS".toLowerCase(Locale.ROOT)), 1, new HashMap());
            ((n3h) wwfVar.a).a(Uri.parse(gbk0Var.b), DeeplinkSource.TOTW_COMMUNICATIONS);
            hbk0 hbk0Var = gbk0Var.a;
            String str5 = hbk0Var.a;
            boolean z = hbk0Var.b;
            apf apfVar = (apf) wwfVar.c;
            TaxiOrder b3 = ((o2y0) apfVar.w).b();
            b3.getClass();
            synchronized (b3) {
                TaxiOrderLocalData taxiOrderLocalData = b3.l;
                b3.l = TaxiOrderLocalData.b(taxiOrderLocalData, false, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, v4r0.i(taxiOrderLocalData.R, str5), null, null, null, null, false, null, false, null, null, null, -1, 16775167);
            }
            if (z) {
                ((y7j) apfVar.c).a.l(c8j.a);
                return;
            }
            return;
        }
        if (ibk0Var instanceof i9k0) {
            zch zchVar = (zch) this.f;
            i9k0 i9k0Var = (i9k0) ibk0Var;
            if (i9k0Var instanceof h9k0) {
                ((b5j) zchVar.a).a.a(Uri.parse(((h9k0) i9k0Var).b), DeeplinkSource.UNSPECIFIED);
                return;
            } else {
                if (i9k0Var instanceof g9k0) {
                    return;
                }
                w511.b();
                return;
            }
        }
        if (ibk0Var instanceof p9k0) {
            return;
        }
        if (ibk0Var instanceof j9k0) {
            q4g q4gVar = (q4g) this.g;
            j9k0 j9k0Var = (j9k0) ibk0Var;
            tj60 tj60Var = (tj60) q4gVar.x;
            if (tj60Var.a("driver_phone_copied") != null) {
                return;
            }
            ((k3c) q4gVar.w).a(false, j9k0Var.a, "Driver Phone");
            ci70 ci70Var5 = (ci70) q4gVar.y;
            String str6 = ((o2y0) q4gVar.c).b().a;
            d3c d3cVar = ci70Var5.t;
            d3cVar.getClass();
            HashMap hashMap3 = new HashMap();
            hashMap3.put("order_id", str6);
            d3cVar.a.a("copy_to_clipboard", hashMap3, 1, new HashMap());
            Context context = (Context) q4gVar.b;
            int i5 = kyh0.common_copied_to_clipboard;
            CopiedNotification copiedNotification = new CopiedNotification(context, i5, i5, "driver_phone_copied");
            tj60Var.e(copiedNotification);
            copiedNotification.startExpiresTimer();
            copiedNotification.setExpiresListener(new wz1(5, q4gVar));
            return;
        }
        if ((ibk0Var instanceof c9k0) || (ibk0Var instanceof iak0) || (ibk0Var instanceof jak0) || (ibk0Var instanceof dak0) || (ibk0Var instanceof r9k0) || (ibk0Var instanceof rak0) || (ibk0Var instanceof eak0) || (ibk0Var instanceof qak0) || (ibk0Var instanceof cak0) || (ibk0Var instanceof z9k0) || (ibk0Var instanceof fak0) || (ibk0Var instanceof b9k0) || (ibk0Var instanceof ebk0) || (ibk0Var instanceof gak0) || (ibk0Var instanceof q9k0) || (ibk0Var instanceof u9k0) || (ibk0Var instanceof lak0) || (ibk0Var instanceof a9k0) || (ibk0Var instanceof t9k0) || (ibk0Var instanceof w9k0) || (ibk0Var instanceof y9k0) || (ibk0Var instanceof fbk0) || (ibk0Var instanceof bak0) || (ibk0Var instanceof x9k0) || (ibk0Var instanceof k9k0) || (ibk0Var instanceof s9k0) || (ibk0Var instanceof pak0) || (ibk0Var instanceof aak0) || (ibk0Var instanceof d9k0) || (ibk0Var instanceof e9k0) || (ibk0Var instanceof zak0) || (ibk0Var instanceof f9k0) || (ibk0Var instanceof vak0)) {
            return;
        }
        w511.b();
    }

    public ImageProvider g(int i) {
        Context context = (Context) this.a;
        Drawable drawable = context.getDrawable(i);
        int color = context.getColor(mqg0.component_gray_450);
        FixedPinView fixedPinView = doa1.a;
        if (fixedPinView == null) {
            fixedPinView = (FixedPinView) LayoutInflater.from(context).inflate(tqh0.fixed_map_pin, (ViewGroup) new FrameLayout(context), false);
            int i2 = fixedPinView.getLayoutParams().width;
            int i3 = fixedPinView.getLayoutParams().height;
            fixedPinView.measure(View.MeasureSpec.makeMeasureSpec(i2, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
            fixedPinView.layout(0, 0, i2, i3);
            doa1.a = fixedPinView;
        }
        if (drawable != null) {
            fixedPinView.setIcon(drawable);
        }
        fixedPinView.setPinColor(color);
        return fixedPinView.imageProviderForCurrentState();
    }

    public i3y h(sls slsVar) {
        return a.a(new xw90(27, this, slsVar));
    }

    public i2c0 i(float f) {
        return new i2c0((d() * 2) + ((int) (((Number) ((i3y) this.c).getValue()).intValue() * f)), (d() * 2) + ((int) (((Number) ((i3y) this.d).getValue()).intValue() * f)));
    }
}
