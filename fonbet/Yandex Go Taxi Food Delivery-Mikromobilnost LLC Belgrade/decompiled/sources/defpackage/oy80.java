package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import androidx.camera.core.ImageCaptureException;
import com.yandex.messaging.auth.AuthEnvironment;
import com.yandex.messaging.auth.passport.b;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.plus.pay.ui.core.debug.internal.DebugMenuDialogFragment;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.i3y;
import defpackage.q7u;
import defpackage.rs31;
import defpackage.sls;
import defpackage.w8f;
import defpackage.xeo;
import defpackage.y8f;
import io.flutter.plugin.platform.d;
import io.flutter.view.AccessibilityBridge;
import io.scer.pdfx.PdfRendererException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e;
import ru.yandex.yx_platform_api.PowerSaveModeChangesReceiver;
import ru.yandex.yx_platform_api.PowerSaveModeChangesStreamHandler$onListen$2;

/* loaded from: classes10.dex */
public final class oy80 implements zo90, ryj0, us20, u8v, srb0, xwc0, vbi0, cid0, zeo {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.yandex.plus.di.PlusFragmentSurvivesRecreationHolder$special$$inlined$viewModels$default$1] */
    public oy80(final DebugMenuDialogFragment debugMenuDialogFragment, hvg hvgVar) {
        this.a = 20;
        this.b = hvgVar;
        r0d0 r0d0Var = new r0d0(1, this);
        final ?? r0 = new sls() { // from class: com.yandex.plus.di.PlusFragmentSurvivesRecreationHolder$special$$inlined$viewModels$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return debugMenuDialogFragment;
            }
        };
        final i3y b = a.b(LazyThreadSafetyMode.NONE, new sls() { // from class: com.yandex.plus.di.PlusFragmentSurvivesRecreationHolder$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return (rs31) r0.invoke();
            }
        });
        this.c = new es31(qoi0.a(cnd0.class), new sls() { // from class: com.yandex.plus.di.PlusFragmentSurvivesRecreationHolder$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return ((rs31) i3y.this.getValue()).getViewModelStore();
            }
        }, r0d0Var, new sls() { // from class: com.yandex.plus.di.PlusFragmentSurvivesRecreationHolder$special$$inlined$viewModels$default$4
            final /* synthetic */ sls $extrasProducer = null;

            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                y8f y8fVar;
                sls slsVar = this.$extrasProducer;
                if (slsVar != null && (y8fVar = (y8f) slsVar.invoke()) != null) {
                    return y8fVar;
                }
                rs31 rs31Var = (rs31) i3y.this.getValue();
                q7u q7uVar = rs31Var instanceof q7u ? (q7u) rs31Var : null;
                y8f defaultViewModelCreationExtras = q7uVar != null ? q7uVar.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? w8f.b : defaultViewModelCreationExtras;
            }
        });
    }

    @Override // defpackage.xwc0
    public void a(AccessibilityBridge accessibilityBridge) {
        ((d) this.b).B.a = accessibilityBridge;
        ((dxc0) this.c).A.a = accessibilityBridge;
    }

    @Override // defpackage.us20
    public void b(String str) {
        n891.n(new xw90(11, str, this));
    }

    @Override // defpackage.srb0
    public void c(PdfRendererException pdfRendererException) {
        HashMap hashMap = (HashMap) this.b;
        hashMap.put("error", jrb0.a(pdfRendererException));
        ((ce5) this.c).a(hashMap);
    }

    @Override // defpackage.xwc0
    public View d(int i) {
        dxc0 dxc0Var = (dxc0) this.c;
        return dxc0Var.d(i) != null ? dxc0Var.d(i) : ((d) this.b).d(i);
    }

    @Override // defpackage.us20
    public void e(final ct20 ct20Var) {
        if (ct20Var instanceof p89) {
            final int i = 0;
            n891.n(new sls(this) { // from class: tga0
                public final /* synthetic */ oy80 b;

                {
                    this.b = this;
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    int i2 = i;
                    zy11 zy11Var = zy11.a;
                    ct20 ct20Var2 = ct20Var;
                    oy80 oy80Var = this.b;
                    switch (i2) {
                        case 0:
                            p89 p89Var = (p89) ct20Var2;
                            ((ox90) oy80Var.b).a(Uri.parse(p89Var.b), p89Var.c);
                            break;
                        case 1:
                            ox90 ox90Var = (ox90) oy80Var.b;
                            ox90Var.f();
                            ox90Var.e(ct20Var2);
                            break;
                        default:
                            ((ox90) oy80Var.b).e(ct20Var2);
                            break;
                    }
                    return zy11Var;
                }
            });
            return;
        }
        if (ct20Var instanceof w89) {
            n891.n(new xw90(12, (wga0) this.c, ct20Var));
        } else if (ct20Var instanceof s89) {
            final int i2 = 1;
            n891.n(new sls(this) { // from class: tga0
                public final /* synthetic */ oy80 b;

                {
                    this.b = this;
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    int i22 = i2;
                    zy11 zy11Var = zy11.a;
                    ct20 ct20Var2 = ct20Var;
                    oy80 oy80Var = this.b;
                    switch (i22) {
                        case 0:
                            p89 p89Var = (p89) ct20Var2;
                            ((ox90) oy80Var.b).a(Uri.parse(p89Var.b), p89Var.c);
                            break;
                        case 1:
                            ox90 ox90Var = (ox90) oy80Var.b;
                            ox90Var.f();
                            ox90Var.e(ct20Var2);
                            break;
                        default:
                            ((ox90) oy80Var.b).e(ct20Var2);
                            break;
                    }
                    return zy11Var;
                }
            });
        } else if (ct20Var instanceof daj) {
            final int i3 = 2;
            n891.n(new sls(this) { // from class: tga0
                public final /* synthetic */ oy80 b;

                {
                    this.b = this;
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    int i22 = i3;
                    zy11 zy11Var = zy11.a;
                    ct20 ct20Var2 = ct20Var;
                    oy80 oy80Var = this.b;
                    switch (i22) {
                        case 0:
                            p89 p89Var = (p89) ct20Var2;
                            ((ox90) oy80Var.b).a(Uri.parse(p89Var.b), p89Var.c);
                            break;
                        case 1:
                            ox90 ox90Var = (ox90) oy80Var.b;
                            ox90Var.f();
                            ox90Var.e(ct20Var2);
                            break;
                        default:
                            ((ox90) oy80Var.b).e(ct20Var2);
                            break;
                    }
                    return zy11Var;
                }
            });
        }
    }

    @Override // defpackage.zo90
    public Object f(b bVar) {
        return bVar.d((vh3) this.b);
    }

    @Override // defpackage.xwc0
    public boolean g(int i) {
        dxc0 dxc0Var = (dxc0) this.c;
        if (dxc0Var.d(i) == null) {
            return ((d) this.b).g(i);
        }
        dxc0Var.getClass();
        return false;
    }

    @Override // defpackage.vbi0
    public Object getValue(Object obj, kgx kgxVar) {
        switch (this.a) {
            case 19:
                break;
            default:
                break;
        }
        return ((cnd0) ((es31) this.c).getValue()).b;
    }

    @Override // defpackage.xwc0
    public void h() {
        ((d) this.b).h();
        ((dxc0) this.c).h();
    }

    @Override // defpackage.ryj0
    public void i(Object obj) {
        switch (this.a) {
            case 5:
                ((ryj0) this.c).i((PaymentKitError) obj);
                break;
            default:
                ((rwe0) this.b).A.l(new pwe0((ArrayList) this.c));
                break;
        }
    }

    @Override // defpackage.u8v
    public void j(ImageCaptureException imageCaptureException) {
        ((tls) this.c).invoke(imageCaptureException);
    }

    @Override // defpackage.u8v
    public void k(reu reuVar) {
        ((sls) this.b).invoke();
    }

    @Override // defpackage.zo90
    public void l(Object obj) {
        List list = (List) obj;
        v94 v94Var = (v94) ((m6) this.c).b;
        if (v94Var.b) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((un90) obj2).a.isAuthorized()) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((un90) next).b.a == AuthEnvironment.TeamProduction) {
                arrayList2.add(next);
            }
        }
        v94Var.a.invoke(arrayList2.size() == 1 ? (un90) arrayList2.get(0) : arrayList.size() == 1 ? (un90) arrayList.get(0) : null);
    }

    public aoi m(y4a0 y4a0Var) {
        z501 z501Var = (z501) this.c;
        ufe0 ufe0Var = (ufe0) y4a0Var.b;
        kbg a = z501Var.a(ufe0Var.a);
        w040 w040Var = (w040) this.b;
        w040Var.getClass();
        q5z.h((qcp0) w040Var.b);
        Context context = (Context) w040Var.a;
        q5z.h(context);
        hwy0 hwy0Var = (hwy0) w040Var.d;
        q5z.h(hwy0Var);
        vfe0 vfe0Var = (vfe0) y4a0Var.c;
        q5z.h(vfe0Var);
        e b = a.b();
        q5z.h(b);
        ru.yandex.taxi.logistics.sdk.postcard.presentation.b bVar = (ru.yandex.taxi.logistics.sdk.postcard.presentation.b) w040Var.e;
        q5z.h(bVar);
        com.yandex.delivery.utils.dialogmanager.impl.b bVar2 = (com.yandex.delivery.utils.dialogmanager.impl.b) w040Var.f;
        q5z.h(bVar2);
        yuj0 yuj0Var = (yuj0) w040Var.g;
        q5z.h(yuj0Var);
        jwh jwhVar = (jwh) w040Var.h;
        q5z.h(jwhVar);
        e b2 = a.b();
        q5z.h(b2);
        ru.yandex.taxi.logistics.sdk.postcard.presentation.ui.d dVar = new ru.yandex.taxi.logistics.sdk.postcard.presentation.ui.d(ufe0Var, vfe0Var, b, bVar, bVar2, yuj0Var, new q6c0(8, jwhVar, b2, ufe0Var));
        dci dciVar = (dci) w040Var.c;
        q5z.h(dciVar);
        return new aoi(new xv10(context, hwy0Var, dVar, dciVar), ufe0Var, vfe0Var);
    }

    public void n(boolean z) {
        l9y0 l9y0Var = (l9y0) this.c;
        if (l9y0Var != null) {
            i a = l9y0Var.a("CashbackCard.YandexPlusBuySubscriptionFailed", ((bkd0) this.b).b);
            String b = l9y0.b(z);
            LinkedHashMap linkedHashMap = a.a;
            linkedHashMap.put("initiated", b);
            linkedHashMap.put("purchase_source_type", "native");
            a.m();
        }
    }

    @Override // defpackage.zo90
    public String name() {
        return "getAccounts";
    }

    public void o(String str) {
        i d = ((j) ((lx4) this.b)).d(str);
        d.a.put("tariffClassName", (String) this.c);
        d.m();
    }

    @Override // defpackage.zeo
    public void onCancel(Object obj) {
        PowerSaveModeChangesStreamHandler$onListen$2 powerSaveModeChangesStreamHandler$onListen$2 = (PowerSaveModeChangesStreamHandler$onListen$2) this.c;
        if (powerSaveModeChangesStreamHandler$onListen$2 != null) {
            ((Context) this.b).unregisterReceiver(powerSaveModeChangesStreamHandler$onListen$2);
        }
        this.c = null;
    }

    @Override // defpackage.zeo
    public void onListen(Object obj, final xeo xeoVar) {
        final Context context = (Context) this.b;
        PowerSaveModeChangesStreamHandler$onListen$2 powerSaveModeChangesStreamHandler$onListen$2 = (PowerSaveModeChangesStreamHandler$onListen$2) this.c;
        if (powerSaveModeChangesStreamHandler$onListen$2 != null) {
            context.unregisterReceiver(powerSaveModeChangesStreamHandler$onListen$2);
        }
        PowerSaveModeChangesReceiver powerSaveModeChangesReceiver = new PowerSaveModeChangesReceiver(context) { // from class: ru.yandex.yx_platform_api.PowerSaveModeChangesStreamHandler$onListen$2
            @Override // ru.yandex.yx_platform_api.PowerSaveModeChangesReceiver
            public void onPowerSaveModeChanged(boolean isPowerSaveMode) {
                xeo.this.success(Boolean.valueOf(isPowerSaveMode));
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        intentFilter.addAction("miui.intent.action.POWER_SAVE_MODE_CHANGED");
        intentFilter.addAction("huawei.intent.action.POWER_MODE_CHANGED_ACTION");
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(powerSaveModeChangesReceiver, intentFilter, 4);
        } else {
            context.registerReceiver(powerSaveModeChangesReceiver, intentFilter);
        }
        this.c = powerSaveModeChangesReceiver;
    }

    @Override // defpackage.ryj0
    public void onSuccess(Object obj) {
        switch (this.a) {
            case 5:
                uv90 uv90Var = (uv90) obj;
                oy90 oy90Var = (oy90) this.b;
                oy90Var.j = uv90Var;
                oy90Var.k = ((wga0) ((zrw) uv90Var)).b;
                oy90Var.l = true;
                ((ryj0) this.c).onSuccess(uv90Var);
                break;
            default:
                ((rwe0) this.b).A.l(new pwe0((List) obj));
                break;
        }
    }

    @Override // defpackage.srb0
    public void success(Object obj) {
        HashMap hashMap = (HashMap) this.b;
        hashMap.put(TarifficatorScenarioActivity.RESULT_KEY, null);
        ((ce5) this.c).a(hashMap);
    }

    public /* synthetic */ oy80(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ oy80(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public oy80(Context context) {
        this.a = 26;
        this.b = context;
    }

    public oy80(final TarifficatorScenarioActivity tarifficatorScenarioActivity, arx0 arx0Var) {
        this.a = 19;
        this.b = arx0Var;
        this.c = new es31(qoi0.a(cnd0.class), new sls() { // from class: com.yandex.plus.di.PlusActivitySurvivesRecreationHolder$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return tarifficatorScenarioActivity.getViewModelStore();
            }
        }, new r0d0(0, this), new sls() { // from class: com.yandex.plus.di.PlusActivitySurvivesRecreationHolder$special$$inlined$viewModels$default$3
            final /* synthetic */ sls $extrasProducer = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                y8f y8fVar;
                sls slsVar = this.$extrasProducer;
                return (slsVar == null || (y8fVar = (y8f) slsVar.invoke()) == null) ? tarifficatorScenarioActivity.getDefaultViewModelCreationExtras() : y8fVar;
            }
        });
    }

    public oy80(ufg ufgVar) {
        this.a = 17;
        v5c0 v5c0Var = new v5c0(3, this);
        ea20 ea20Var = new ea20(ufgVar, "flutter/platform_views_2", wzt0.b, null);
        this.b = ea20Var;
        ea20Var.b(v5c0Var);
    }

    public /* synthetic */ oy80() {
        this.a = 18;
    }

    public oy80(String str) {
        this.a = 0;
        this.b = (ExtraSupportedOutputSizeQuirk) xbj.a.b(ExtraSupportedOutputSizeQuirk.class);
        this.c = new bg1(str, 9);
    }

    public oy80(pbj pbjVar) {
        this.a = 28;
        this.b = pbjVar;
        this.c = new HashMap();
    }
}
