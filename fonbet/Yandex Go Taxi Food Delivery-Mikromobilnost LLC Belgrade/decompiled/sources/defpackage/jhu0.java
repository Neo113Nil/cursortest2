package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.MenuItem;
import android.view.Window;
import androidx.appcompat.app.n;
import androidx.appcompat.view.menu.MenuBuilder;
import com.yandex.go.payments.summary.domain.f;
import com.yandex.go.superapp.discovery.map.api.repositories.state.SuperAppDiscoveryMapOverlayState;
import com.yandex.go.superapp.discovery.map.impl.ui.model.SuperAppDiscoveryMapSearchOpenedEntity;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.messaging.contacts.sync.b;
import com.yandex.messaging.internal.authorized.sync.SyncController$SyncErrorSource;
import com.yandex.messaging.internal.authorized.sync.g;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class jhu0 implements wyn, nvu0, nsd0, sxv, iqs, t0x0, khx0, sj10, t501 {
    public final Object a;

    public /* synthetic */ jhu0(Object obj) {
        this.a = obj;
    }

    public static ArrayList k(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(mja1.a(((n4v) it.next()).b, null, 6));
        }
        return arrayList;
    }

    public boolean a(lmw0 lmw0Var) {
        Object obj;
        if (!(lmw0Var instanceof kmw0)) {
            return false;
        }
        String str = ((kmw0) lmw0Var).h.a;
        b8r b8rVar = (b8r) this.a;
        qrw qrwVar = b8rVar.b;
        List list = ((k) b8rVar.a).j().a;
        qrwVar.getClass();
        Iterator it = list.iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            List list2 = ((za31) obj).b;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (jl40.l(((mi31) it2.next()).a.b, str)) {
                        break loop0;
                    }
                }
            }
        }
        return ((za31) obj) == null;
    }

    @Override // defpackage.t501
    public void b(s501 s501Var) {
        v501 v501Var = (v501) this.a;
        String str = v501Var.U;
        if (str == null) {
            return;
        }
        v501Var.S.a(new a201(1, str, s501Var));
    }

    @Override // defpackage.nsd0
    public void d(wqw wqwVar) {
        if (wqwVar == null) {
            wqwVar = null;
        }
        if (wqwVar != null) {
            f.P((f) this.a, wqwVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // defpackage.wyn
    public boolean e(Object obj, File file, mg70 mg70Var) {
        InputStream inputStream = (InputStream) obj;
        izz izzVar = (izz) ((g63) this.a);
        byte[] bArr = (byte[]) izzVar.c(65536, byte[].class);
        boolean z = false;
        ?? r1 = 0;
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        r1 = -1;
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, read);
                    } catch (IOException unused) {
                        fileOutputStream = fileOutputStream2;
                        Log.isLoggable("StreamEncoder", 3);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        izzVar.g(bArr);
                        r1 = fileOutputStream;
                        return z;
                    } catch (Throwable th) {
                        th = th;
                        r1 = fileOutputStream2;
                        if (r1 != 0) {
                            try {
                                r1.close();
                            } catch (IOException unused3) {
                            }
                        }
                        izzVar.g(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused4) {
                }
                izzVar.g(bArr);
                z = true;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException unused5) {
        }
        return z;
    }

    public void f(SyncController$SyncErrorSource syncController$SyncErrorSource) {
        g gVar = (g) this.a;
        n5e n5eVar = gVar.A;
        n5eVar.z = syncController$SyncErrorSource;
        n5eVar.C = true;
        n5eVar.e();
        n8z0 n8z0Var = gVar.D;
        n8z0Var.getClass();
        Looper.myLooper();
        z83.i();
        n8z0Var.e = 0L;
        n8z0Var.f = "";
        gVar.U = null;
    }

    public void g() {
        w4b0[] w4b0VarArr;
        g gVar = (g) this.a;
        b bVar = gVar.a;
        n5e n5eVar = gVar.A;
        z83.g(null, n5eVar.a, Looper.myLooper());
        int i = 0;
        n5eVar.B = false;
        int i2 = 1;
        n5eVar.C = true;
        n5eVar.z = null;
        n5eVar.e();
        n8z0 n8z0Var = gVar.D;
        n8z0Var.getClass();
        Looper.myLooper();
        z83.i();
        if (n8z0Var.e != 0) {
            n8z0Var.a.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - n8z0Var.e;
            String providerName = ((n5t0) n8z0Var.c.get()).getProviderName();
            if (providerName != null) {
                n8z0Var.b.g("request2sync", "ms", Long.valueOf(elapsedRealtime), "socket", providerName, "source", n8z0Var.f, "hostName", n8z0Var.d);
            }
            n8z0Var.e = 0L;
            n8z0Var.f = "";
        }
        gVar.C.a = true;
        gVar.H.a = true;
        fzg fzgVar = gVar.I;
        fzgVar.d.reportEvent("tech start deep message sync");
        h3y h3yVar = fzgVar.a;
        x08 f = ((n5t0) h3yVar.get()).f(new ezg(true, fzgVar));
        op3 op3Var = fzgVar.f;
        kgx[] kgxVarArr = fzg.g;
        kgx kgxVar = kgxVarArr[1];
        op3Var.b(f);
        x08 f2 = ((n5t0) h3yVar.get()).f(new ezg(false, fzgVar));
        op3 op3Var2 = fzgVar.e;
        kgx kgxVar2 = kgxVarArr[0];
        op3Var2.b(f2);
        py10 py10Var = gVar.J;
        Handler handler = py10Var.a;
        handler.getLooper();
        Looper.myLooper();
        z83.i();
        oy10 oy10Var = py10Var.g;
        op3 op3Var3 = oy10Var.b;
        kgx kgxVar3 = oy10.e[0];
        op3Var3.b(null);
        Handler handler2 = oy10Var.c;
        handler2.removeCallbacksAndMessages(null);
        handler2.postDelayed(new my10(oy10Var, i2), 60000L);
        handler.postDelayed(new fbz(25, py10Var), 30000L);
        jh10 jh10Var = gVar.Q;
        kse.a(jh10Var.b);
        jh10Var.a.getClass();
        qp3 qp3Var = jh10Var.c;
        kgx kgxVar4 = jh10.d[0];
        qp3Var.b(e1k.M1);
        kgx[] kgxVarArr2 = b.S;
        bVar.c(false);
        bVar.d();
        gVar.U = null;
        gVar.V = true;
        x22 x22Var = gVar.P;
        x4b0 A = gVar.c.A();
        if (A != null && (w4b0VarArr = A.j) != null) {
            int length = w4b0VarArr.length;
            int i3 = 0;
            while (i < length) {
                if (!w4b0VarArr[i].d) {
                    i3++;
                }
                i++;
            }
            i = i3;
        }
        x22Var.f("messenger user", "org count", Integer.valueOf(i), "os level", Integer.valueOf(Build.VERSION.SDK_INT));
    }

    @Override // defpackage.nvu0
    public nvu0 get(String str) {
        Object opt = ((JSONObject) this.a).opt(str);
        if (opt instanceof JSONArray) {
            return new wor0((JSONArray) opt);
        }
        if (opt instanceof JSONObject) {
            return new jhu0((JSONObject) opt);
        }
        if (opt == null ? true : opt.equals(JSONObject.NULL)) {
            return null;
        }
        return bei.Q;
    }

    @Override // defpackage.sxv
    public void h() {
        ((r9w0) this.a).I.set(false);
    }

    public void i(q010 q010Var) {
        ygs ygsVar = (ygs) this.a;
        ((kxv0) ygsVar.O).a = SuperAppDiscoveryMapSearchOpenedEntity.TRANSPORT;
        e7c0 e7c0Var = (e7c0) ygsVar.J;
        e7c0Var.b(t6c0.a);
        SuperAppDiscoveryMapOverlayState superAppDiscoveryMapOverlayState = SuperAppDiscoveryMapOverlayState.HIDDEN;
        e7c0Var.a(superAppDiscoveryMapOverlayState);
        ((vw9) ygsVar.L).a(superAppDiscoveryMapOverlayState);
        ((ein0) ygsVar.M).a(superAppDiscoveryMapOverlayState);
        ((sux0) ygsVar.N).a(superAppDiscoveryMapOverlayState);
        z111 z111Var = (z111) ygsVar.K;
        z111Var.a(SuperAppDiscoveryMapOverlayState.SELECTED);
        z111Var.b(q010Var);
        ygsVar.r(new qu(9));
    }

    public void j(x6c0 x6c0Var) {
        ygs ygsVar = (ygs) this.a;
        ((kxv0) ygsVar.O).a = SuperAppDiscoveryMapSearchOpenedEntity.PLACES;
        z111 z111Var = (z111) ygsVar.K;
        SuperAppDiscoveryMapOverlayState superAppDiscoveryMapOverlayState = SuperAppDiscoveryMapOverlayState.HIDDEN;
        z111Var.a(superAppDiscoveryMapOverlayState);
        ((vw9) ygsVar.L).a(superAppDiscoveryMapOverlayState);
        ((ein0) ygsVar.M).a(superAppDiscoveryMapOverlayState);
        ((sux0) ygsVar.N).a(superAppDiscoveryMapOverlayState);
        e7c0 e7c0Var = (e7c0) ygsVar.J;
        e7c0Var.a(SuperAppDiscoveryMapOverlayState.SELECTED);
        e7c0Var.b(x6c0Var);
    }

    @Override // defpackage.iqs
    public void onFailure(Throwable th) {
    }

    @Override // defpackage.sj10
    public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
        return false;
    }

    @Override // defpackage.sj10
    public void onMenuModeChange(MenuBuilder menuBuilder) {
        n nVar = (n) this.a;
        boolean isOverflowMenuShowing = nVar.a.a.isOverflowMenuShowing();
        Window.Callback callback = nVar.b;
        if (isOverflowMenuShowing) {
            callback.onPanelClosed(108, menuBuilder);
        } else if (callback.onPreparePanel(0, null, menuBuilder)) {
            callback.onMenuOpened(108, menuBuilder);
        }
    }

    @Override // defpackage.iqs
    public void onSuccess(Object obj) {
        ((bnw0) this.a).run();
    }

    @Override // defpackage.nvu0
    public void set(String str, Object obj) {
        try {
            ((JSONObject) this.a).put(str, obj);
        } catch (Throwable unused) {
        }
    }
}
