package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.Task;
import com.yandex.messenger.websdk.api.DebugConfiguration;
import com.yandex.messenger.websdk.api.MessengerParams;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes.dex */
public final class ew2 implements xbi0 {
    public boolean a;
    public final Object b;
    public Object c;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0044, code lost:
    
        if (r8.e == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ew2(qh41 qh41Var) {
        PackageInfo packageInfo;
        Context context = qh41Var.a;
        mc mcVar = ((v720) qh41Var.b).a.a;
        this.b = new t720((Application) mcVar.a.get(), (j) mcVar.b.get());
        MessengerParams messengerParams = qh41Var.g;
        o6v o6vVar = (o6v) qh41Var.q.getValue();
        drw drwVar = (drw) qh41Var.p.getValue();
        DebugConfiguration debugConfiguration = (DebugConfiguration) qh41Var.i.getValue();
        boolean z = debugConfiguration != null ? true : z;
        z = false;
        this.a = z;
        Pair pair = new Pair("serviceId", messengerParams.a);
        String str = o6vVar.c;
        Pair pair2 = new Pair("deviceId", str == null ? "" : str);
        Pair pair3 = new Pair("sessionId", drwVar.a);
        Pair pair4 = new Pair(WebViewActivity.KEY_ENVIRONMENT, messengerParams.e.a);
        try {
            packageInfo = context.getPackageManager().getPackageInfo("com.google.android.webview", 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        String str2 = packageInfo != null ? packageInfo.versionName : null;
        this.c = b.i(pair, pair2, pair3, pair4, new Pair("webView", str2 == null ? "unknown" : str2));
    }

    public Boolean a() {
        return Boolean.valueOf(((SharedPreferences) this.b).getBoolean((String) this.c, this.a));
    }

    public void b(String str) {
        vx21.b(new ou(26, this, str));
    }

    public void c(String str, Map map) {
        vx21.b(new in2(8, map, this, str));
    }

    public void d(boolean z) {
        SharedPreferences.Editor edit = ((SharedPreferences) this.b).edit();
        edit.putBoolean((String) this.c, z);
        edit.apply();
    }

    public void e(agb1 agb1Var) {
        synchronized (this.b) {
            try {
                if (((ArrayDeque) this.c) == null) {
                    this.c = new ArrayDeque();
                }
                ((ArrayDeque) this.c).add(agb1Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f(Task task) {
        agb1 agb1Var;
        synchronized (this.b) {
            if (((ArrayDeque) this.c) != null && !this.a) {
                this.a = true;
                while (true) {
                    synchronized (this.b) {
                        try {
                            agb1Var = (agb1) ((ArrayDeque) this.c).poll();
                            if (agb1Var == null) {
                                this.a = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    agb1Var.a(task);
                }
            }
        }
    }

    @Override // defpackage.vbi0
    public /* bridge */ /* synthetic */ Object getValue(Object obj, kgx kgxVar) {
        return a();
    }

    @Override // defpackage.xbi0
    public /* bridge */ /* synthetic */ void setValue(Object obj, kgx kgxVar, Object obj2) {
        d(((Boolean) obj2).booleanValue());
    }

    public /* synthetic */ ew2(Object obj, Object obj2, boolean z) {
        this.b = obj;
        this.c = obj2;
        this.a = z;
    }

    public ew2(List list, List list2) {
        this.b = list;
        this.c = list2;
        this.a = list.isEmpty() && list2.isEmpty();
    }

    public ew2(uv2 uv2Var, boolean z, cxq0 cxq0Var) {
        this.b = uv2Var;
        this.a = z;
        this.c = cxq0Var;
    }

    public ew2() {
        this.b = new Object();
    }
}
