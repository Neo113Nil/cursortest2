package xsna;

import com.vk.api.internal.LongPollCall;
import com.vk.api.sdk.VKApiConfig;
import com.vk.api.sdk.exceptions.IgnoredAccessTokenException;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.push.core.network.http.BaseHttpHeadersHolder;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import okhttp3.c;
import okhttp3.k;
import okhttp3.m;
import okhttp3.p;
import okhttp3.t;
import ru.ok.android.commons.http.Http;
import xsna.k8g0;
import xsna.xjv;

/* compiled from: InternalOkHttpExecutor.kt */
/* loaded from: classes.dex */
public final class mkx extends tu2 {
    public final wdp0 j;

    /* compiled from: InternalOkHttpExecutor.kt */
    /* loaded from: classes15.dex */
    public static final class a {
        public final InputStream a;
        public final long b;
        public final boolean c;

        public a(InputStream inputStream, long j, boolean z) {
            this.a = inputStream;
            this.b = j;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + bh10.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DownloadResponse(stream=");
            sb.append(this.a);
            sb.append(", contentLength=");
            sb.append(this.b);
            sb.append(", contentRangeSupported=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: InternalOkHttpExecutor.kt */
    /* loaded from: classes15.dex */
    public static final class b<T> {
        public final T a;
        public final long b;
        public final long c;

        public b(T t, long j, long j2) {
            this.a = t;
            this.b = j;
            this.c = j2;
        }

        public final T a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c;
        }

        public final int hashCode() {
            T t = this.a;
            return Long.hashCode(this.c) + bh10.a((t == null ? 0 : t.hashCode()) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ProfiledResponse(response=");
            sb.append(this.a);
            sb.append(", processingTime=");
            sb.append(this.b);
            sb.append(", contentLength=");
            return vu5.a(')', this.c, sb);
        }
    }

    /* compiled from: InternalOkHttpExecutor.kt */
    /* loaded from: classes15.dex */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LongPollCall.Type.values().length];
            try {
                iArr[LongPollCall.Type.POST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LongPollCall.Type.GET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public mkx(u8y u8yVar, wdp0 wdp0Var) {
        super(u8yVar);
        this.j = wdp0Var;
    }

    @Override // xsna.tu2, xsna.vx70
    public final c200 c(boolean z, d13 d13Var, w03 w03Var) {
        return new mhx(z, tu2.i, d13Var, w03Var);
    }

    @Override // xsna.vx70
    public final p.a n(ly70 ly70Var, f3e0 f3e0Var) {
        String a2;
        Long d;
        p.a n = super.n(ly70Var, f3e0Var);
        if ((ly70Var instanceof okx) && (d = ((okx) ly70Var).d()) != null) {
            m8g0.a(n, d.longValue());
        }
        Object obj = ((HashMap) ly70Var.a()).get("wait");
        xjv.b bVar = obj instanceof xjv.b ? (xjv.b) obj : null;
        Integer m = (bVar == null || (a2 = bVar.a()) == null) ? null : arm0.m(10, a2);
        Object obj2 = ((HashMap) ly70Var.a()).get("act");
        xjv.b bVar2 = obj2 instanceof xjv.b ? (xjv.b) obj2 : null;
        String a3 = bVar2 != null ? bVar2.a() : null;
        if (m != null && epx.f(a3, "a_check")) {
            n.h(k8g0.c.class, new k8g0.c(m.intValue()));
        }
        return n;
    }

    public final okhttp3.u r(fy70 fy70Var, long j) {
        p.a aVar = new p.a();
        int i = c.$EnumSwitchMapping$0[fy70Var.b().ordinal()];
        if (i == 1) {
            t.a aVar2 = okhttp3.t.Companion;
            String a2 = fy70Var.a();
            Pattern pattern = okhttp3.m.e;
            okhttp3.m a3 = m.a.a(BaseHttpHeadersHolder.CONTENT_TYPE_URLENCODED);
            aVar2.getClass();
            aVar.f("POST", t.a.a(a2, a3));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            aVar.d();
        }
        aVar.h(k8g0.c.class, new k8g0.c((int) (fy70Var.e() / 1000)));
        aVar.i(fy70Var.c());
        aVar.c(okhttp3.c.n);
        l8g0 d = fy70Var.d();
        aVar.h(Map.class, d != null ? d.a() : null);
        m8g0.a(aVar, j);
        return g(aVar.b());
    }

    public final okhttp3.u s(qob qobVar, long j) {
        String d = qobVar.d();
        p.a aVar = new p.a();
        aVar.d();
        aVar.i(d);
        aVar.c(okhttp3.c.n);
        m8g0.a(aVar, j);
        return g(aVar.b());
    }

    public final p.a t(nkx nkxVar, long j) throws VKApiExecutionException {
        okhttp3.m mVar;
        okhttp3.c cVar;
        String i = i(nkxVar);
        String str = nkxVar.d;
        if (this.h != null && i != null && i.equals(this.h)) {
            throw new IgnoredAccessTokenException(str);
        }
        String j2 = j(nkxVar);
        String str2 = nkxVar.a;
        if (str2 == null) {
            str2 = ((VKApiConfig) this.a.b).p.invoke();
        }
        a(nkxVar);
        kpe0 kpe0Var = kpe0.a;
        String str3 = nkxVar.d;
        LinkedHashMap linkedHashMap = nkxVar.f;
        String str4 = nkxVar.e;
        int i2 = ((VKApiConfig) this.a.b).b;
        boolean z = nkxVar.k;
        List<h7r0> value = this.e.getValue();
        ArrayList arrayList = new ArrayList(c5g.u(value, 10));
        Iterator<T> it = value.iterator();
        while (it.hasNext()) {
            arrayList.add(((h7r0) it.next()).a);
        }
        String d = kpe0Var.d(str3, linkedHashMap, str4, null, j2, i2, z, arrayList, nkxVar.m);
        t.a aVar = okhttp3.t.Companion;
        vx70.q(nkxVar, d);
        Pattern pattern = okhttp3.m.e;
        try {
            mVar = m.a.a(BaseHttpHeadersHolder.CONTENT_TYPE_URLENCODED);
        } catch (IllegalArgumentException unused) {
            mVar = null;
        }
        aVar.getClass();
        okhttp3.s a2 = t.a.a(d, mVar);
        p.a aVar2 = new p.a();
        aVar2.f("POST", a2);
        if (!nkxVar.k && !nkxVar.m && i != null && !drm0.N(i)) {
            aVar2.c.h(Http.Header.AUTHORIZATION, "Bearer ".concat(i));
        }
        if (nkxVar.w) {
            aVar2.c.h("X-Fake-Push-Token", "true");
        }
        String str5 = (String) ((VKApiConfig) this.a.b).G.invoke();
        if (!drm0.N(str5)) {
            aVar2.c.h("X-Screen", str5);
        }
        for (Map.Entry entry : nkxVar.g.entrySet()) {
            aVar2.e((String) entry.getKey(), (String) entry.getValue());
        }
        nkxVar.o = go9.b("https://", str2);
        m8g0.a(aVar2, j);
        aVar2.h(k8g0.a.class, new k8g0.a(nkxVar.j, nkxVar.d));
        aVar2.i(nkxVar.o + nkxVar.b.h() + '/' + nkxVar.d);
        String str6 = nkxVar.c;
        if (str6 != null) {
            okhttp3.c cVar2 = okhttp3.c.n;
            k.a aVar3 = new k.a();
            aVar3.b("Cache-Control", str6);
            cVar = c.b.a(aVar3.e());
        } else {
            cVar = okhttp3.c.n;
        }
        aVar2.c(cVar);
        return aVar2;
    }
}
