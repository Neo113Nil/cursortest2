package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.hardware.SensorManager;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import com.yandex.go.scooters.qr.domain.ScootersQrProximityTooCloseInteractor$special$$inlined$simpleCallbackApiToFlow$1;
import com.yandex.messaging.internal.entities.ImageMessageData;
import com.yandex.messaging.views.LimitedRoundImageView;
import com.yandex.payment.divkit.usecases.t;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.ybsdk.api.YBSdkVisualParams;
import defpackage.xeo;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.e;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.eats_commons.EatsService;
import ru.yandex.taxi.experiments.superapp.j;
import ru.yandex.yx_platform_api.ScreenOnReceiver;
import ru.yandex.yx_platform_api.ScreenOnStreamHandler$onListen$2;

/* loaded from: classes13.dex */
public final class cjm0 implements ryj0, zeo, anp0, xbi0, e170 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public cjm0(SensorManager sensorManager, tse tseVar) {
        this.a = 10;
        this.b = sensorManager;
        this.c = e.O(e.t(e.g(new ScootersQrProximityTooCloseInteractor$special$$inlined$simpleCallbackApiToFlow$1(new iin0(24, this), null))), tseVar, wsr0.a(xsr0.a, 3), 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b A[EDGE_INSN: B:28:0x004b->B:19:0x004b BREAK  A[LOOP:0: B:13:0x0039->B:27:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(List list, StringBuilder sb, EatsService eatsService) {
        String str;
        Iterator it;
        String str2;
        szv0 a = ((j) this.c).a();
        szv0.Companion.getClass();
        Object obj = null;
        if (a != null && a != szv0.m) {
            a.getClass();
            uwq0 a2 = a.a(eatsService.getValue());
            if (a2 != null && (str2 = a2.d) != null && !evu0.J(str2)) {
                str = d6z.Y(a, str2);
                it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (eatsService == ((ren) next).b) {
                        obj = next;
                        break;
                    }
                }
                if (obj == null) {
                    if (sb.length() > 0) {
                        sb.append(Extension.FIX_SPACE);
                    }
                    sb.append(str);
                    return;
                }
                return;
            }
        }
        str = null;
        it = list.iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        if (obj == null) {
        }
    }

    public int b() {
        if (((YBSdkVisualParams) this.b).getShowAsSlidableView()) {
            return (int) ((ContextThemeWrapper) this.c).getResources().getDimension(vvg0.ybsdk_root_card_inset_height);
        }
        return 0;
    }

    @Override // defpackage.e170
    public void d(int i) {
        lhs0 lhs0Var = (lhs0) this.b;
        r6e r6eVar = lhs0Var.V2;
        int i2 = i - lhs0Var.X2;
        ImageMessageData imageMessageData = (ImageMessageData) this.c;
        Point a = r6eVar.a(i2, imageMessageData.width, imageMessageData.height);
        LimitedRoundImageView limitedRoundImageView = lhs0Var.x2;
        ViewGroup.LayoutParams layoutParams = limitedRoundImageView.getLayoutParams();
        layoutParams.width = a.x;
        layoutParams.height = a.y;
        limitedRoundImageView.setLayoutParams(layoutParams);
    }

    @Override // defpackage.vbi0
    public Object getValue(Object obj, kgx kgxVar) {
        return Long.valueOf(((SharedPreferences) this.b).getLong("last_sync_with_back_ts", 0L));
    }

    @Override // defpackage.ryj0
    public void i(Object obj) {
        switch (this.a) {
            case 0:
                tem0 tem0Var = ((t) this.b).d;
                int i = 28;
                o8k0 o8k0Var = new o8k0(i, (luf) this.c, (PaymentKitError) obj);
                if (tem0Var.a) {
                    o8k0Var.invoke();
                    break;
                }
                break;
            default:
                ((afq0) this.b).Z((List) this.c);
                break;
        }
    }

    @Override // defpackage.zeo
    public void onCancel(Object obj) {
        ScreenOnStreamHandler$onListen$2 screenOnStreamHandler$onListen$2 = (ScreenOnStreamHandler$onListen$2) this.c;
        if (screenOnStreamHandler$onListen$2 != null) {
            ((Context) this.b).unregisterReceiver(screenOnStreamHandler$onListen$2);
        }
        this.c = null;
    }

    @Override // defpackage.zeo
    public void onListen(Object obj, final xeo xeoVar) {
        Context context = (Context) this.b;
        ScreenOnStreamHandler$onListen$2 screenOnStreamHandler$onListen$2 = (ScreenOnStreamHandler$onListen$2) this.c;
        if (screenOnStreamHandler$onListen$2 != null) {
            context.unregisterReceiver(screenOnStreamHandler$onListen$2);
        }
        ScreenOnReceiver screenOnReceiver = new ScreenOnReceiver() { // from class: ru.yandex.yx_platform_api.ScreenOnStreamHandler$onListen$2
            @Override // ru.yandex.yx_platform_api.ScreenOnReceiver
            public void onStateChanged(boolean state) {
                xeo.this.success(Boolean.valueOf(state));
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(screenOnReceiver, intentFilter, 4);
        } else {
            context.registerReceiver(screenOnReceiver, intentFilter);
        }
        this.c = screenOnReceiver;
    }

    @Override // defpackage.ryj0
    public void onSuccess(Object obj) {
        switch (this.a) {
            case 0:
                sm0 sm0Var = (sm0) obj;
                tem0 tem0Var = ((t) this.b).d;
                luf lufVar = (luf) this.c;
                if (tem0Var.a) {
                    lufVar.invoke(new kyj0(sm0Var));
                    break;
                }
                break;
            default:
                List list = (List) obj;
                afq0 afq0Var = (afq0) this.b;
                dy40 dy40Var = afq0Var.D;
                kcq0 kcq0Var = afq0Var.I;
                if (kcq0Var == null) {
                    kcq0Var = null;
                }
                dy40Var.l(new ieq0(list, kcq0Var.c()));
                afq0.b0(afq0Var);
                break;
        }
    }

    @Override // defpackage.xbi0
    public void setValue(Object obj, kgx kgxVar, Object obj2) {
        ((SharedPreferences) this.c).edit().putLong("last_sync_with_back_ts", ((Number) obj2).longValue()).apply();
    }

    public /* synthetic */ cjm0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ cjm0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
