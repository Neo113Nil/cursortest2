package defpackage;

import android.bluetooth.le.BluetoothLeScanner;
import android.graphics.Bitmap;
import android.os.Looper;
import android.renderscript.Allocation;
import android.renderscript.Matrix4f;
import android.renderscript.ScriptIntrinsicColorMatrix;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.yandex.go.ble.domain.BleScanningInteractorImpl$listenBleDevicesScanning$1$scanCallback$1;
import com.yandex.messaging.views.bottomsheet.b;
import com.yandex.payment.sdk.core.data.BoundCard;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.payment.sdk.core.data.a;
import com.yandex.xplat.common.YSError;
import ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.domain.c;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes14.dex */
public final /* synthetic */ class lu5 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lu5(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        int i2 = 1;
        zy11 zy11Var = zy11.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((ryj0) obj2).onSuccess(new rim0(((e0t0) obj).a));
                break;
            case 1:
                PaymentKitError.Companion.getClass();
                ((jvf) obj2).i(a.b((YSError) obj));
                break;
            case 2:
                ((jvf) obj2).onSuccess(new BoundCard(((sb8) obj).a, null));
                break;
            case 3:
                ((ryj0) obj2).onSuccess((zy11) obj);
                break;
            case 4:
                ((ymu) ((hh5) obj2).b).onSuccess(new zb8(((anh) obj).a.toString()));
                break;
            case 5:
                ct20 ct20Var = (ct20) obj;
                ymu ymuVar = (ymu) ((sr4) obj2).b;
                p89 p89Var = ct20Var instanceof p89 ? (p89) ct20Var : null;
                ymuVar.onSuccess(p89Var != null ? new zb8(p89Var.b, p89Var.c) : new zb8(""));
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                try {
                    ((BluetoothLeScanner) obj2).stopScan((BleScanningInteractorImpl$listenBleDevicesScanning$1$scanCallback$1) obj);
                    break;
                } catch (Exception e) {
                    hst hstVar = jst.e;
                    ke00 a = hstVar.b.a();
                    if (a != null && a.b(15)) {
                        a.a(15, null, e, "Error while stop BLE scanning", hstVar.a);
                        break;
                    }
                }
                break;
            case 9:
                e76 e76Var = (e76) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Allocation createFromBitmap = Allocation.createFromBitmap(e76Var.b, bitmap);
                Allocation createFromBitmap2 = Allocation.createFromBitmap(e76Var.b, bitmap);
                ScriptIntrinsicColorMatrix scriptIntrinsicColorMatrix = e76Var.w;
                if (scriptIntrinsicColorMatrix != null) {
                    scriptIntrinsicColorMatrix.setColorMatrix(new Matrix4f(new float[]{0.6f, 0.0f, 0.0f, 0.0f, 0.0f, 0.6f, 0.0f, 0.0f, 0.0f, 0.0f, 0.6f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f}));
                    scriptIntrinsicColorMatrix.forEach(createFromBitmap, createFromBitmap2);
                }
                createFromBitmap2.copyTo(bitmap);
                break;
            case 10:
                com.yandex.messaging.views.bottomsheet.a aVar = (com.yandex.messaging.views.bottomsheet.a) obj2;
                b bVar = (b) obj;
                op3 op3Var = aVar.k;
                BottomSheetBehavior bottomSheetBehavior = aVar.e;
                kgx kgxVar = com.yandex.messaging.views.bottomsheet.a.m[0];
                x08 a2 = op3Var.a();
                if (a2 != null) {
                    a2.cancel();
                }
                if (!bVar.k().c) {
                    bottomSheetBehavior.P(Math.max(0, aVar.a().getHeight() - bottomSheetBehavior.G()));
                    break;
                } else {
                    bottomSheetBehavior.P(0);
                    break;
                }
            case 11:
                ((tls) obj2).invoke(((lj6) obj).d);
                break;
            case 12:
                ru.yandex.taxi.bugreport.router.b bVar2 = (ru.yandex.taxi.bugreport.router.b) obj2;
                bVar2.A(((scg) ((ff41) bVar2.K.getValue())).b(), new dg41((UiWebViewConfig) obj, null, null, null, null, null, null, 254), new hr6(bVar2, i2));
                break;
            case 13:
                c37 c37Var = (c37) obj;
                ((wls) obj2).invoke(c37Var.c, c37Var.e);
                break;
            case 14:
                j27 j27Var = (j27) ((i3y) ((am2) obj2).b).getValue();
                int i3 = png0.acquisition_sdk_buttonSectionStyle;
                int i4 = a1i0.AcquisitionSdk_Widget_ButtonSection;
                j27Var.getClass();
                break;
            case 15:
                sb7 sb7Var = (sb7) obj2;
                z83.g(null, sb7Var.a, Looper.myLooper());
                sb7Var.i.d((tb7) obj);
                break;
            case 16:
                sb7 sb7Var2 = (sb7) obj2;
                z83.g(null, sb7Var2.a, Looper.myLooper());
                sb7Var2.l.d((ub7) obj);
                break;
            case 17:
                ((sb7) obj2).b((vb7) obj);
                break;
            case 18:
                ((sb7) obj2).b((wb7) obj);
                break;
            case 19:
                sb7 sb7Var3 = (sb7) obj2;
                z83.g(null, sb7Var3.a, Looper.myLooper());
                sb7Var3.k.d((xb7) obj);
                break;
            case 20:
                sb7 sb7Var4 = (sb7) obj2;
                z83.g(null, sb7Var4.a, Looper.myLooper());
                sb7Var4.f.d((yb7) obj);
                break;
            case 21:
                sb7 sb7Var5 = (sb7) obj2;
                z83.g(null, sb7Var5.a, Looper.myLooper());
                sb7Var5.j.d((zb7) obj);
                break;
            case 22:
                sb7 sb7Var6 = (sb7) obj2;
                z83.g(null, sb7Var6.a, Looper.myLooper());
                sb7Var6.g.d((ac7) obj);
                break;
            case 23:
                sb7 sb7Var7 = (sb7) obj2;
                z83.g(null, sb7Var7.a, Looper.myLooper());
                sb7Var7.h.d((bc7) obj);
                break;
            case 24:
                com.yandex.go.taxi.order.delegates.a aVar2 = (com.yandex.go.taxi.order.delegates.a) obj2;
                aVar2.c.a.g(zy11Var);
                ((aj7) aVar2.a).b((String) obj, true);
                break;
            case 25:
                ((sls) obj2).invoke();
                ((c) obj).b();
                break;
            case 26:
                ((fv7) obj).getClass();
                ((tls) obj2).invoke(cv7.a);
                break;
            case 27:
                ((tls) obj2).invoke(((zy7) obj).g);
                break;
            case 28:
                yy7 yy7Var = ((cz7) obj).d;
                ((tls) obj2).invoke(uy7.a);
                break;
            default:
                ((tls) obj2).invoke(((xy7) obj).c);
                break;
        }
        return zy11Var;
    }
}
