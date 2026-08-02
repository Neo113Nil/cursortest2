package xsna;

import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.api.sdk.auth.AccountProfileType;
import com.vk.core.files.a;
import com.vk.core.serialize.Serializer;
import com.vk.dto.auth.VKLightAccount;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import java.io.File;
import java.io.FileOutputStream;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;
import org.json.JSONObject;
import xsna.ext;
import xsna.i9r0;
import xsna.usi0;
import xsna.xcu0;

/* compiled from: VKAccountManager.java */
/* loaded from: classes11.dex */
public final class q6r0 {
    public static volatile m6r0 a;
    public static volatile VKLightAccount b;
    public static final ConcurrentHashMap c = new ConcurrentHashMap();
    public static final bpn0 d = new bpn0(new tog(8));
    public static final bpn0 e = new bpn0(new j55(14));
    public static final bpn0 f = new bpn0(new k55(9));
    public static final bpn0 g = new bpn0(new u94(9));
    public static final bpn0 h = new bpn0(new v94(12));

    /* compiled from: VKAccountManager.java */
    public class a implements w8i {
    }

    /* compiled from: VKAccountManager.java */
    /* loaded from: classes7.dex */
    public class b implements w8i {
    }

    /* compiled from: VKAccountManager.java */
    /* loaded from: classes7.dex */
    public class c implements w8i {
    }

    /* compiled from: VKAccountManager.java */
    public class d implements w8i {
    }

    /* compiled from: VKAccountManager.java */
    /* loaded from: classes7.dex */
    public class e implements w8i {
    }

    @Nullable
    public static void a(@Nullable m6r0 m6r0Var, boolean z) {
        VKLightAccount a2;
        Throwable th;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        if (m6r0Var == null) {
            a2 = null;
        } else {
            Serializer.c<VKLightAccount> cVar = VKLightAccount.CREATOR;
            a2 = VKLightAccount.a.a(m6r0Var);
        }
        d(a2);
        if (m6r0Var == null) {
            i9r0.a aVar = i9r0.a;
            i9r0.a.c();
            EmptyList emptyList = EmptyList.b;
            vx2.a.getClass();
            vx2.b().j(emptyList);
            return;
        }
        i9r0.a aVar2 = i9r0.a;
        String jSONObject = m6r0Var.h().toString();
        File d2 = i9r0.a.d();
        Regex regex = com.vk.core.files.a.a;
        vhk0.b(d2);
        if (com.vk.core.files.a.P(new File(e43.a.getFilesDir(), "account.json"), jSONObject)) {
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
            Serializer.c<VKLightAccount> cVar2 = VKLightAccount.CREATOR;
            byte[] e2 = Serializer.b.e(VKLightAccount.a.a(m6r0Var));
            try {
                try {
                    fileOutputStream = new FileOutputStream(i9r0.a.d(), false);
                } catch (Exception e3) {
                    throw e3;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                fileOutputStream.write(e2);
                a.c.a(fileOutputStream);
            } catch (Exception e4) {
                throw e4;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream2 = fileOutputStream;
                a.c.a(fileOutputStream2);
                throw th;
            }
        }
        long d3 = m6r0Var.d(m6r0.U0);
        long d4 = m6r0Var.d(m6r0.V0);
        long d5 = m6r0Var.d(m6r0.W0);
        j560 b2 = com.vk.toggle.d.w0.b();
        if (b2 == null) {
            j560.h.getClass();
            b2 = j560.i;
        }
        if (b2.a) {
            SecureRandom secureRandom = new SecureRandom();
            d3 = secureRandom.nextDouble() <= b2.b ? d3 - b2.e : 0L;
            d4 = secureRandom.nextDouble() <= b2.c ? d4 - b2.f : 0L;
            d5 = secureRandom.nextDouble() <= b2.d ? d5 - b2.g : 0L;
        }
        we7.t(d3, d4, d5, z);
    }

    public static synchronized void b(m6r0 m6r0Var) {
        synchronized (q6r0.class) {
            new ArrayList(((mui0) d.getValue()).e()).forEach(new Consumer() { // from class: xsna.p6r0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    usi0.a aVar = (usi0.a) obj;
                    ((sxi0) q6r0.e.getValue()).h(aVar);
                    UserId userId = aVar.c().a;
                    i9r0.a aVar2 = i9r0.a;
                    synchronized (i9r0.class) {
                        i9r0.a.e(userId);
                    }
                }
            });
            ((com.vk.superapp.multiaccount.api.d) f.getValue()).c();
            UserId y = m6r0Var.y();
            i9r0.a aVar = i9r0.a;
            synchronized (i9r0.class) {
                i9r0.a.e(y);
            }
            a(null, true);
            h(null, false);
            c.remove(m6r0Var.y());
        }
    }

    @NonNull
    public static o6r0 c() {
        return new o6r0(f());
    }

    public static void d(@Nullable VKLightAccount vKLightAccount) {
        long j;
        String str;
        if (vKLightAccount != null) {
            try {
                j = vKLightAccount.b.b;
            } catch (Exception e2) {
                L.i(e2);
                return;
            }
        } else {
            j = 0;
        }
        if (vKLightAccount != null) {
            str = "" + vKLightAccount.d;
        } else {
            str = "DELETED";
        }
        String h2 = dy2.h(e43.a, null);
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        Bundle bundle = new rhp0().a;
        bundle.putLong(CommonConstant.RETKEY.USERID, j);
        bundle.putString("USER_NAME", str);
        bundle.putString("STORE_NAME", h2);
        bVar.f(bundle);
    }

    @Nullable
    public static m6r0 e(@NonNull UserId userId) {
        ConcurrentHashMap concurrentHashMap = c;
        m6r0 m6r0Var = (m6r0) concurrentHashMap.get(userId);
        if (m6r0Var == null) {
            i9r0.a aVar = i9r0.a;
            String C = com.vk.core.files.a.C(i9r0.a.a(userId));
            if (C != null) {
                try {
                    m6r0Var = new m6r0(new JSONObject(C));
                } catch (Throwable th) {
                    L.i(th);
                }
            }
            m6r0Var = null;
        }
        if (m6r0Var != null) {
            concurrentHashMap.put(userId, m6r0Var);
        }
        return m6r0Var;
    }

    @NonNull
    public static m6r0 f() {
        if (a == null) {
            synchronized (q6r0.class) {
                try {
                    if (a == null) {
                        i9r0.a aVar = i9r0.a;
                        Regex regex = com.vk.core.files.a.a;
                        String C = com.vk.core.files.a.C(new File(e43.a.getFilesDir(), "account.json"));
                        m6r0 m6r0Var = null;
                        if (C != null) {
                            try {
                                m6r0Var = new m6r0(new JSONObject(C));
                            } catch (Throwable th) {
                                L.i(th);
                            }
                        }
                        a = m6r0Var;
                    }
                    if (a == null) {
                        a = new m6r0();
                    }
                } finally {
                }
            }
        }
        return a;
    }

    @NonNull
    public static VKLightAccount g() {
        if (b == null) {
            synchronized (q6r0.class) {
                try {
                    if (b == null) {
                        i9r0.a aVar = i9r0.a;
                        VKLightAccount vKLightAccount = null;
                        byte[] B = com.vk.core.files.a.B(i9r0.a.d(), null);
                        if (B != null) {
                            try {
                                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                                vKLightAccount = (VKLightAccount) Serializer.b.a(B, VKLightAccount.class.getClassLoader());
                            } catch (Throwable th) {
                                Log.e("VKAuthUtils", "LightAccount loading error", th);
                            }
                        }
                        b = vKLightAccount;
                    }
                    if (b == null) {
                        m6r0 f2 = f();
                        Serializer.c<VKLightAccount> cVar = VKLightAccount.CREATOR;
                        b = VKLightAccount.a.a(f2);
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public static void h(@Nullable m6r0 m6r0Var, boolean z) {
        m6r0 f2 = f();
        a = m6r0Var;
        m6r0 f3 = f();
        if (m6r0Var != null) {
            c.put(m6r0Var.y(), m6r0Var);
        }
        if (!z) {
            asu0.a.getClass();
            asu0.n().execute(new twv(1));
        }
        if (Objects.equals(f2.y(), f3.y())) {
            return;
        }
        o25.a().x();
    }

    public static synchronized void i(@NonNull m6r0 m6r0Var, ext.b bVar) {
        synchronized (q6r0.class) {
            i9r0.a aVar = i9r0.a;
            m6r0Var.i(bVar.a);
            a(m6r0Var, true);
            h(m6r0Var, false);
            i9r0.a(m6r0Var);
        }
    }

    public static void j() {
        L.p("Sync internal auth and AccountManager auth");
        ArrayList e2 = ((mui0) d.getValue()).e();
        ArrayList arrayList = new ArrayList(c5g.u(e2, 10));
        int i = 0;
        for (Object obj : e2) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            usi0.a aVar = (usi0.a) obj;
            h7r0 h7r0Var = new h7r0(aVar.a().d(), aVar.a().c(), aVar.d, aVar.c().b(), aVar.a().e(), null);
            String valueOf = String.valueOf(aVar.c().b().b);
            AccountProfileType a2 = aVar.c().a();
            usi0.a.b bVar = aVar instanceof usi0.a.b ? (usi0.a.b) aVar : null;
            arrayList.add(new xcu0.a(h7r0Var, valueOf, i, a2, bVar != null ? bVar.e() : null));
            i = i2;
        }
        ((xcu0) g.getValue()).a(arrayList);
    }

    public static boolean k(@NonNull m6r0 m6r0Var, boolean z) {
        if (!Objects.equals(f().y(), m6r0Var.y())) {
            return false;
        }
        a(m6r0Var, !z);
        h(m6r0Var, z);
        i9r0.a(m6r0Var);
        c.put(m6r0Var.y(), m6r0Var);
        return true;
    }
}
