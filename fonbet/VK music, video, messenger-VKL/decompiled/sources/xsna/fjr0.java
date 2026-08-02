package xsna;

import android.content.SharedPreferences;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.preference.Preference;
import com.vk.log.L;
import com.vk.log.b;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import kotlin.collections.builders.ListBuilder;
import xsna.k200;
import xsna.n7r0;

/* compiled from: ValidationHandlerChainCall.kt */
/* loaded from: classes.dex */
public final class fjr0<T> extends dfg0<T> {
    public final ara<T> c;
    public final n7r0.e d;

    /* JADX WARN: Multi-variable type inference failed */
    public fjr0(l7r0 l7r0Var, int i, ara<? extends T> araVar, n7r0.e eVar) {
        super(l7r0Var, i);
        this.c = araVar;
        this.d = eVar;
    }

    @Override // xsna.ara
    public final T a(zqa zqaVar) throws Exception {
        String str;
        Set<Map.Entry<String, String>> entrySet;
        k200 k200Var;
        k200 k200Var2;
        int i = 0;
        while (i <= this.b) {
            int i2 = i + 1;
            try {
                CountDownLatch countDownLatch = this.d.a.get();
                if (countDownLatch != null) {
                    countDownLatch.await();
                }
                T a = this.c.a(zqaVar);
                if (zqaVar.a() && (k200Var2 = this.a.e) != null) {
                    k200Var2.d();
                }
                return a;
            } catch (VKApiExecutionException e) {
                if (!e.O()) {
                    i = i2;
                }
                if (zqaVar.a() && !e.O() && (k200Var = this.a.e) != null) {
                    k200Var.d();
                }
                if (e.O()) {
                    String str2 = zqaVar.d;
                    n7r0.c cVar = (n7r0.c) c(str2 != null ? new n7r0.b("", null, null, null, true, "", Boolean.FALSE, null, null, null, str2, zqaVar.e, null, 4096) : new n7r0.b(e.j(), Integer.valueOf(e.i()), Integer.valueOf(e.r()), Double.valueOf(e.m()), e.k(), e.o(), e.l(), e.q(), e.d(), e.n(), null, null, zqaVar.f, 3072), this.a.e, cjr0.b);
                    if (cVar == null) {
                        throw e;
                    }
                    zqaVar.a = e.o();
                    zqaVar.i = e.h();
                    zqaVar.j = e.p();
                    if (cVar.b()) {
                        zqaVar.c = "";
                        zqaVar.b = "";
                        zqaVar.g = cVar.a();
                    } else if (cVar.c()) {
                        zqaVar.c = String.valueOf(cVar.a());
                        zqaVar.b = "";
                        zqaVar.g = null;
                    } else {
                        zqaVar.b = String.valueOf(cVar.a());
                        zqaVar.c = "";
                        zqaVar.g = null;
                    }
                    zqaVar.h = Boolean.valueOf(cVar.d());
                    e.q();
                } else if (e.h0()) {
                    n7r0.d dVar = (n7r0.d) c(e.F(), this.a.e, ejr0.b);
                    n7r0.d dVar2 = n7r0.d.g;
                    if (epx.f(dVar, n7r0.d.a.a())) {
                        continue;
                    } else {
                        if (dVar == null) {
                            throw e;
                        }
                        if (!dVar.f()) {
                            throw e;
                        }
                        ListBuilder e2 = e43.e();
                        e2.addAll(this.a.i().e.getValue());
                        Iterator<h7r0> it = this.a.i().e.getValue().iterator();
                        int i3 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i3 = -1;
                                break;
                            }
                            if (epx.f(it.next().e, dVar.e())) {
                                break;
                            }
                            i3++;
                        }
                        if (i3 != -1 && dVar.d() != null && dVar.e() != null) {
                            h7r0 h7r0Var = (h7r0) e2.get(i3);
                            e2.remove(i3);
                            e2.add(i3, new h7r0(dVar.b(), dVar.a(), h7r0Var.f, dVar.e(), dVar.d(), dVar.c()));
                        }
                        this.a.j(e2.g());
                    }
                } else {
                    if (!e.f0()) {
                        k200 k200Var3 = this.a.e;
                        if (k200Var3 == null) {
                            throw e;
                        }
                        k200Var3.getClass();
                        String g = e.g();
                        int s = e.s();
                        String t = e.t();
                        Map<String, String> z = e.z();
                        if (z == null || (entrySet = z.entrySet()) == null || (str = j5g.g0(entrySet, null, null, null, 0, new nyq(9), 31)) == null) {
                            str = "empty";
                        }
                        StringBuilder sb = new StringBuilder("=============================================\n");
                        sb.append(g + ' ' + s);
                        sb.append('\n');
                        sb.append(t);
                        sb.append('\n');
                        sb.append("req_params:".concat(str));
                        sb.append("\n=============================================\n");
                        b.a.a((com.vk.log.b) k200Var3.c.getValue(), L.LogType.e, sb.toString(), e, new k200.a(p2i0.c), 8);
                        t8u0 t8u0Var = k200Var3.b;
                        t8u0Var.getClass();
                        if (!e.N() && !e.S()) {
                            t8u0Var.b.getClass();
                            throw e;
                        }
                        synchronized (t8u0.c) {
                            SharedPreferences.Editor edit = Preference.i().edit();
                            edit.putBoolean("key_client_update_needed", true);
                            edit.apply();
                            s3q0 s3q0Var = s3q0.a;
                            throw e;
                        }
                    }
                    Boolean bool = (Boolean) c(e.E(), this.a.e, djr0.b);
                    if (bool == null) {
                        throw e;
                    }
                    if (bool.equals(Boolean.FALSE)) {
                        throw e;
                    }
                    zqaVar.k = bool.booleanValue();
                }
            }
        }
        throw new VKApiException("Can't confirm validation due to retry limit!");
    }

    public final Object c(Object obj, k200 k200Var, yzs yzsVar) {
        if (k200Var == null) {
            return null;
        }
        n7r0.e eVar = this.d;
        if (!vcl0.d(eVar.a, new CountDownLatch(1))) {
            return null;
        }
        n7r0.a aVar = new n7r0.a(eVar);
        yzsVar.invoke(k200Var, obj, aVar);
        CountDownLatch countDownLatch = eVar.a.get();
        if (countDownLatch != null) {
            countDownLatch.await();
        }
        return aVar.c();
    }
}
