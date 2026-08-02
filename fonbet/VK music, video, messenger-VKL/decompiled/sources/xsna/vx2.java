package xsna;

import android.content.Context;
import com.vk.api.internal.debug.FakeApiErrorTypes;
import com.vk.api.sdk.VKApiConfig;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.toggle.features.CoreFeatures;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NotImplementedError;
import kotlin.Result;
import org.json.JSONObject;
import xsna.dc3;
import xsna.z230;

/* compiled from: ApiConfig.kt */
/* loaded from: classes.dex */
public final class vx2 {
    public static volatile int b;
    public static volatile a d;
    public static volatile wy2 e;
    public static final ReentrantLock f;
    public static final Condition g;
    public static final vx2 a = new vx2();
    public static volatile String c = "";

    static {
        a.a.getClass();
        d = a.C3906a.b;
        ReentrantLock reentrantLock = new ReentrantLock();
        f = reentrantLock;
        g = reentrantLock.newCondition();
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0196, code lost:
    
        if (r0 != null) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [xsna.tx2] */
    /* JADX WARN: Type inference failed for: r9v2, types: [xsna.ux2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(final VKApiConfig vKApiConfig, final dc3 dc3Var, v03 v03Var, bpn0 bpn0Var) {
        EnumSet noneOf;
        Set<String> stringSet;
        Object failure;
        String a2 = ply.a();
        int i = 0;
        bpn0 bpn0Var2 = new bpn0(new qx2(dc3Var, i));
        vx2 vx2Var = a;
        vx2Var.getClass();
        int i2 = b;
        bpn0 bpn0Var3 = new bpn0(new rx2(dc3Var, i));
        vx2Var.getClass();
        VKApiConfig.a aVar = new VKApiConfig.a(VKApiConfig.a(vKApiConfig, i2, bpn0Var3, dc3Var.d(), bpn0Var2, c, new gzs() { // from class: xsna.tx2
            @Override // xsna.gzs
            public final Object invoke() {
                dc3 dc3Var2 = dc3.this;
                return dc3Var2.n() ? dc3Var2.h() : vKApiConfig.p.invoke();
            }
        }, new gzs() { // from class: xsna.ux2
            @Override // xsna.gzs
            public final Object invoke() {
                dc3 dc3Var2 = dc3.this;
                if (!dc3Var2.n()) {
                    return vKApiConfig.q.invoke();
                }
                return dc3Var2.h() + "/oauth";
            }
        }, new jhg(a2, 2), 0L, 0L, 0L, null, new bpn0(new sx2(dc3Var, vKApiConfig)), null, -268688483));
        Long s = d.s();
        if (s != null) {
            long longValue = s.longValue();
            aVar.a = VKApiConfig.a(aVar.a, 0, null, null, null, null, null, null, null, 0L, longValue, 0L, VKApiConfig.a.a(aVar, 0L, longValue, 0L, 11), null, null, -18874369);
        }
        Long j = d.j();
        if (j != null) {
            long longValue2 = j.longValue();
            aVar.a = VKApiConfig.a(aVar.a, 0, null, null, null, null, null, null, null, longValue2, 0L, 0L, VKApiConfig.a.a(aVar, longValue2, 0L, 0L, 13), null, null, -17825793);
        }
        Long k = d.k();
        if (k != null) {
            long longValue3 = k.longValue();
            aVar.a = VKApiConfig.a(aVar.a, 0, null, null, null, null, null, null, null, 0L, 0L, longValue3, VKApiConfig.a.a(aVar, 0L, 0L, longValue3, 7), null, null, -20971521);
        }
        VKApiConfig a3 = VKApiConfig.a(aVar.a, 0, null, null, null, null, null, null, null, 0L, 0L, 0L, null, null, aVar.b, -536870913);
        o2l o2lVar = o2l.a;
        o2lVar.getClass();
        boolean b2 = o2l.b("__dbg_network_fake_push_token", false);
        o2lVar.getClass();
        boolean b3 = o2l.b("__dbg_network_fake_safety_net", false);
        o2lVar.getClass();
        if (o2l.g()) {
            if (!o2l.g()) {
                o2lVar = null;
            }
            if (o2lVar != null && (stringSet = Preference.j().getStringSet("__dbg_network_fail_api_errors_to_fail_with", null)) != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = stringSet.iterator();
                while (it.hasNext()) {
                    try {
                        failure = FakeApiErrorTypes.valueOf((String) it.next());
                    } catch (Throwable th) {
                        failure = new Result.Failure(th);
                    }
                    if (failure instanceof Result.Failure) {
                        failure = null;
                    }
                    FakeApiErrorTypes fakeApiErrorTypes = (FakeApiErrorTypes) failure;
                    if (fakeApiErrorTypes != null) {
                        arrayList.add(fakeApiErrorTypes);
                    }
                }
                r7 = arrayList.isEmpty() ? null : arrayList;
                if (r7 != null) {
                    noneOf = EnumSet.copyOf((Collection) r7);
                }
            }
            noneOf = EnumSet.noneOf(FakeApiErrorTypes.class);
            r7 = noneOf;
        }
        EnumSet enumSet = r7;
        o2l.a.getClass();
        int parseInt = (o2l.g() && o2l.g()) ? Integer.parseInt(o2l.c("__dbg_network_fail_on_request_sleep_timeout", "0")) : 0;
        List<String> list = js5.a;
        eqy<bek0> eqyVar = com.vk.toggle.d.a;
        wy2 wy2Var = new wy2(a3, new v6l(b2, b3, enumSet, parseInt, list, com.vk.toggle.b.A.a(CoreFeatures.BASEURL_VALIDATE_PHOTO_SIZES), bpn0Var), v03Var);
        wy2Var.g = new dc3.a();
        wy2Var.l = new cpl(new wb3(i), new ec3(1, xuo0.a, xuo0.class, "toServerTime", "toServerTime(J)J", 0));
        wy2Var.i = new fdl(dc3Var.b, dc3Var.c);
        wy2Var.m = new ial();
        e = wy2Var;
    }

    public static wy2 b() {
        f.lock();
        try {
            wy2 wy2Var = e;
            while (wy2Var == null) {
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.w, new Object[]{"Couldn't get an ApiManager, it's still null"});
                }
                g.await(2500L, TimeUnit.MILLISECONDS);
                wy2Var = e;
            }
            return wy2Var;
        } finally {
            g.signal();
            f.unlock();
        }
    }

    /* compiled from: ApiConfig.kt */
    public interface a extends z230.a {
        public static final C3906a a = C3906a.a;

        default String d() {
            return "5.285";
        }

        boolean e();

        void f(HashMap hashMap);

        boolean g();

        String getDeviceId();

        String h();

        boolean i();

        default Long j() {
            return null;
        }

        default Long k() {
            return null;
        }

        String l();

        io.reactivex.rxjava3.core.w m();

        boolean n();

        boolean o();

        String q();

        io.reactivex.rxjava3.core.w r();

        default Long s() {
            return null;
        }

        boolean u();

        /* compiled from: ApiConfig.kt */
        /* renamed from: xsna.vx2$a$a, reason: collision with other inner class name */
        public static final class C3906a {
            public static final /* synthetic */ C3906a a = new C3906a();
            public static final C3907a b = new C3907a();

            /* compiled from: ApiConfig.kt */
            /* renamed from: xsna.vx2$a$a$a, reason: collision with other inner class name */
            public static final class C3907a implements a {
                @Override // xsna.z230.a
                public final ArrayList a(JSONObject jSONObject) {
                    return new ArrayList();
                }

                @Override // xsna.z230.a
                public final float b() {
                    return iah0.f().density;
                }

                @Override // xsna.z230.a
                public final UserId c() {
                    return UserId.d;
                }

                @Override // xsna.vx2.a
                public final String d() {
                    return "5.285";
                }

                @Override // xsna.vx2.a
                public final boolean e() {
                    throw new NotImplementedError();
                }

                @Override // xsna.vx2.a
                public final boolean g() {
                    return false;
                }

                @Override // xsna.z230.a
                public final Context getContext() {
                    throw new NotImplementedError();
                }

                @Override // xsna.vx2.a
                public final String getDeviceId() {
                    throw new NotImplementedError();
                }

                @Override // xsna.vx2.a
                public final String h() {
                    return "api.".concat(a0a.d);
                }

                @Override // xsna.vx2.a
                public final boolean i() {
                    return false;
                }

                @Override // xsna.vx2.a
                public final Long j() {
                    return null;
                }

                @Override // xsna.vx2.a
                public final Long k() {
                    return null;
                }

                @Override // xsna.vx2.a
                public final String l() {
                    return "internal.api.".concat(a0a.d);
                }

                @Override // xsna.vx2.a
                public final io.reactivex.rxjava3.core.w m() {
                    return io.reactivex.rxjava3.schedulers.a.b();
                }

                @Override // xsna.vx2.a
                public final boolean n() {
                    return false;
                }

                @Override // xsna.vx2.a
                public final boolean o() {
                    return true;
                }

                @Override // xsna.vx2.a
                public final String q() {
                    return ply.a();
                }

                @Override // xsna.vx2.a
                public final io.reactivex.rxjava3.core.w r() {
                    return io.reactivex.rxjava3.schedulers.a.a();
                }

                @Override // xsna.vx2.a
                public final Long s() {
                    return null;
                }

                @Override // xsna.z230.a
                public final int t() {
                    return iah0.a(130.0f);
                }

                @Override // xsna.vx2.a
                public final boolean u() {
                    return false;
                }

                @Override // xsna.vx2.a
                public final void f(HashMap hashMap) {
                }

                @Override // xsna.vx2.a
                public final void p(xz2 xz2Var) {
                }
            }
        }

        default void p(xz2 xz2Var) {
        }
    }
}
