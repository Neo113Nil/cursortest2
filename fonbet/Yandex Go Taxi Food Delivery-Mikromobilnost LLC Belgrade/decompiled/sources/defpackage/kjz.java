package defpackage;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Bundle;
import androidx.compose.runtime.internal.AtomicInt;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.gson.JsonParseException;
import com.google.gson.stream.MalformedJsonException;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.payments.data.model.response.PaymentMethods;
import com.yandex.go.permission.location_with_agreement.interactor.e;
import com.yandex.go.zone.dto.objects.TariffUnavailable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.SSLException;
import kotlin.a;
import kotlinx.coroutines.flow.r0;
import kotlinx.serialization.SerializationException;
import org.json.JSONException;
import retrofit2.Call;
import retrofit2.Response;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.am.k;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.logistics.sdk.n;
import ru.yandex.taxi.logistics.sdk.o;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes9.dex */
public final class kjz implements yyt0, yk7, t18, nsd0 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public kjz(Context context, int i) {
        this.a = i;
        switch (i) {
            case 12:
                this.b = context;
                this.c = new Canvas();
                break;
            default:
                this.c = null;
                this.b = context;
                break;
        }
    }

    @Override // defpackage.yyt0
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        yyt0[] yyt0VarArr = (yyt0[]) this.b;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i = 0; i < 1; i++) {
            yyt0 yyt0Var = yyt0VarArr[i];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = yyt0Var.a(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > 1024 ? ((ums) this.c).a(stackTraceElementArr2) : stackTraceElementArr2;
    }

    public void b(Object obj, String str) {
        int length = str.length();
        String valueOf = String.valueOf(obj);
        ((ArrayList) this.b).add(unr0.r(new StringBuilder(length + 1 + valueOf.length()), str, "=", valueOf));
    }

    public NinePatchDrawable c(Drawable drawable, wa60 wa60Var, wa60... wa60VarArr) {
        NinePatchDrawable l;
        synchronized (((Canvas) this.c)) {
            l = sb2.l((Canvas) this.c, (Context) this.b, drawable, wa60Var, (wa60[]) Arrays.copyOf(wa60VarArr, wa60VarArr.length));
        }
        return l;
    }

    @Override // defpackage.t18
    public void cancel() {
        if (((AtomicInt) this.c).compareAndSet(1, 1)) {
            return;
        }
        ((in2) this.b).invoke();
    }

    @Override // defpackage.nsd0
    public void d(wqw wqwVar) {
        hda0 hda0Var = (hda0) this.c;
        nsd0 nsd0Var = (nsd0) this.b;
        if (nsd0Var != null) {
            nsd0Var.d(wqwVar);
        }
        hda0Var.G.a();
        z80 z80Var = (z80) wqwVar;
        PaymentMethod$Type a = z80Var.e().a();
        if (!z80Var.f() || a == null) {
            return;
        }
        kv90 kv90Var = lv90.Companion;
        String c = z80Var.c();
        kv90Var.getClass();
        hda0Var.E.b(kv90.b(c, a));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CctBackendFactory e(String str) {
        Bundle bundle;
        Map map;
        PackageManager packageManager;
        ServiceInfo serviceInfo;
        if (((Map) this.c) == null) {
            Context context = (Context) this.b;
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128)) != null) {
                bundle = serviceInfo.metaData;
                if (bundle != null) {
                    map = Collections.EMPTY_MAP;
                } else {
                    HashMap hashMap = new HashMap();
                    for (String str2 : bundle.keySet()) {
                        Object obj = bundle.get(str2);
                        if ((obj instanceof String) && str2.startsWith("backend:")) {
                            for (String str3 : ((String) obj).split(",", -1)) {
                                String trim = str3.trim();
                                if (!trim.isEmpty()) {
                                    hashMap.put(trim, str2.substring(8));
                                }
                            }
                        }
                    }
                    map = hashMap;
                }
                this.c = map;
            }
            bundle = null;
            if (bundle != null) {
            }
            this.c = map;
        }
        String str4 = (String) ((Map) this.c).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException unused2) {
            StringBuilder sb = new StringBuilder("Class ");
            sb.append(str4);
            sb.append(" is not found.");
            return null;
        } catch (IllegalAccessException unused3) {
            StringBuilder sb2 = new StringBuilder("Could not instantiate ");
            sb2.append(str4);
            sb2.append(Extension.DOT_CHAR);
            return null;
        } catch (InstantiationException unused4) {
            StringBuilder sb3 = new StringBuilder("Could not instantiate ");
            sb3.append(str4);
            sb3.append(Extension.DOT_CHAR);
            return null;
        } catch (NoSuchMethodException | InvocationTargetException unused5) {
            return null;
        }
    }

    public fq50 f() {
        o oVar = (o) this.b;
        return new fq50(new n(((k) oVar.c.get()).Hg(), oVar), ((jhz) oVar.b.get()).a, new dq50(((not) ((jhz) oVar.b.get()).b).d()), new ijz(oVar));
    }

    public PaymentMethods g() {
        return ((vda0) ((r0) ((pz40) ((i3y) this.c).getValue())).getValue()).a;
    }

    public avy0 h() {
        o oVar = (o) this.b;
        nzh nzhVar = (nzh) oVar.q.get();
        s3i s3iVar = (s3i) oVar.r.get();
        Application application = (Application) this.c;
        return new avy0(s3iVar, nzhVar, new YandexShapes(m810.b(tje.s(mrg0.button_component_default_rounded_corners_radius, application)), m810.b(tje.s(mrg0.modal_view_corner_radius_big, application)), 3));
    }

    public ofa0 i(TariffUnavailable tariffUnavailable) {
        kdc b;
        yp2 yp2Var = (yp2) this.c;
        pdc pdcVar = (pdc) this.b;
        if (tariffUnavailable == null) {
            return null;
        }
        String str = tariffUnavailable.j;
        String str2 = tariffUnavailable.k;
        kdc i = ((ufu) pdcVar).i(str2);
        if (i == null || (b = ((ufu) pdcVar).b(str)) == null) {
            return null;
        }
        return new ofa0(i, b, yp2Var.a(str2, AppColor$Palette.TextOnControl), yp2Var.a(str, AppColor$Palette.Control));
    }

    public void j(PaymentMethods paymentMethods) {
        r0 r0Var;
        Object value;
        pz40 pz40Var = (pz40) ((i3y) this.c).getValue();
        do {
            r0Var = (r0) pz40Var;
            value = r0Var.getValue();
        } while (!r0Var.k(value, new vda0(paymentMethods == null ? g() : paymentMethods, ((vda0) value).b)));
    }

    @Override // defpackage.yk7
    public void k(Call call, Throwable th) {
        switch (this.a) {
            case 11:
                String a = call.k().c.a("X-Request-Id");
                d5z0 d5z0Var = h5z0.a;
                d5z0Var.t("NetworkResultCall");
                d5z0Var.f(th, "onFailure", new Object[0]);
                ((yk7) this.b).o((tz50) this.c, Response.b(th instanceof SSLException ? new kz50(new hzj0(th), a) : ((th instanceof JSONException) || (th instanceof MalformedJsonException) || (th instanceof JsonParseException) || (th instanceof SerializationException)) ? new kz50(new gzj0(th), a) : th instanceof IOException ? new kz50(new fzj0(th), a) : new kz50(new jzj0(th), a)));
                call.cancel();
                break;
            default:
                g6d0 g6d0Var = (g6d0) this.b;
                j6d0 j6d0Var = g6d0Var.b;
                d5j0 k = g6d0Var.a.k();
                j6d0Var.getClass();
                ((yk7) this.c).o(g6d0Var, Response.b(j6d0.b(k, th)));
                break;
        }
    }

    public void l(vda0 vda0Var) {
        r0 r0Var;
        Object value;
        PaymentMethods paymentMethods;
        long j;
        ((pme0) ((i3y) this.b).getValue()).a(vda0Var.a);
        pz40 pz40Var = (pz40) ((i3y) this.c).getValue();
        do {
            r0Var = (r0) pz40Var;
            value = r0Var.getValue();
            paymentMethods = vda0Var.a;
            j = vda0Var.b;
            ((vda0) value).getClass();
        } while (!r0Var.k(value, new vda0(paymentMethods, j)));
    }

    @Override // defpackage.yk7
    public void o(Call call, Response response) {
        Object kz50Var;
        switch (this.a) {
            case 11:
                kvj0 kvj0Var = response.a;
                String str = kvj0Var.c;
                String a = kvj0Var.y.a("X-Request-Id");
                int i = kvj0Var.w;
                if (y1b1.b(i)) {
                    Object obj = response.b;
                    kz50Var = obj != null ? new mz50(obj, a) : new kz50(new jzj0(new IllegalStateException("Response body is null")), a);
                } else {
                    kz50Var = (i == 401 || i == 403) ? new kz50(new izj0(i, str), a) : new kz50(new ezj0(i, str), a);
                }
                d5z0 d5z0Var = h5z0.a;
                d5z0Var.t("NetworkResultCall");
                d5z0Var.a("onResponse. result = " + kz50Var, new Object[0]);
                ((yk7) this.b).o((tz50) this.c, Response.b(kz50Var));
                break;
            default:
                g6d0 g6d0Var = (g6d0) this.b;
                g6d0Var.b.getClass();
                ((yk7) this.c).o(g6d0Var, Response.b(j6d0.a(response)));
                break;
        }
    }

    public String toString() {
        int i = 0;
        switch (this.a) {
            case 15:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.c.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                while (i < size) {
                    sb.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb.append(Extension.FIX_SPACE);
                    }
                    i++;
                }
                sb.append('}');
                return sb.toString();
            case 27:
                String str = "[ ";
                if (((z7t0) this.b) != null) {
                    while (i < 9) {
                        str = uw51.i(qv10.t(str), ((z7t0) this.b).A[i], " ");
                        i++;
                    }
                }
                StringBuilder v = oyr.v(str, "] ");
                v.append((z7t0) this.b);
                return v.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ kjz(Object obj) {
        this.a = 15;
        cvw.l(obj);
        this.c = obj;
        this.b = new ArrayList();
    }

    public kjz(e eVar, yvi0 yvi0Var) {
        this.a = 14;
        this.b = yvi0Var;
        this.c = new ru.yandex.taxi.notifications.e(eVar.b(), this);
    }

    public kjz(b03 b03Var, wnt wntVar, dne0 dne0Var) {
        this.a = 19;
        this.b = a.a(new in2(15, b03Var, dne0Var, wntVar));
        this.c = a.a(new t9a0(3, this));
    }

    public kjz(yyt0[] yyt0VarArr) {
        this.a = 7;
        this.b = yyt0VarArr;
        this.c = new ums(4);
    }

    public kjz(in2 in2Var) {
        this.a = 16;
        this.b = in2Var;
        this.c = new AtomicInt(0);
    }

    public kjz(h3f0 h3f0Var) {
        this.a = 27;
        this.c = h3f0Var;
    }

    public /* synthetic */ kjz(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
