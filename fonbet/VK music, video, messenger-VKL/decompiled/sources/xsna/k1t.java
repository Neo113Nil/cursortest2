package xsna;

import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;
import xsna.b4p;
import xsna.h2t;

/* compiled from: GLCollageController.kt */
/* loaded from: classes4.dex */
public final class k1t implements h2t.a {
    public final e4p a;
    public final b4p.a b;
    public final String c;
    public final /* synthetic */ e4p d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ l1t f;

    public k1t(e4p e4pVar, boolean z, l1t l1tVar) {
        this.d = e4pVar;
        this.e = z;
        this.f = l1tVar;
        this.a = e4pVar;
        b4p.a a = f4p.a(e4pVar, z);
        this.b = a;
        this.c = pzl.b(e4pVar.getKey(), StringUtils.PROCESS_POSTFIX_DELIMITER, a.d);
    }

    @Override // xsna.h2t.a
    public final e4p e() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.h2t.a
    public final void f(f2t f2tVar) {
        l1t l1tVar = this.f;
        e4p e4pVar = this.d;
        boolean z = this.e;
        synchronized (l1tVar.h) {
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap((Map) l1tVar.i);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap((Map) l1tVar.j);
                Map t = pn00.t(l1tVar.g);
                HashMap<n2k0, m1t> hashMap = new HashMap<>();
                for (Map.Entry entry : t.entrySet()) {
                    n2k0 n2k0Var = (n2k0) entry.getKey();
                    m1t m1tVar = (m1t) entry.getValue();
                    if (epx.f(m1tVar.i, e4pVar)) {
                        hashMap.put(n2k0Var, z ? m1t.a(m1tVar, null, f2tVar, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) : m1t.a(m1tVar, f2tVar, null, 1535));
                        linkedHashMap.put(n2k0Var, Boolean.FALSE);
                        linkedHashMap2.put(n2k0Var, new Size(an10.b(f2tVar.b), an10.b(f2tVar.c)));
                    } else {
                        hashMap.put(n2k0Var, m1tVar);
                    }
                }
                l1tVar.g = hashMap;
                l1tVar.i = linkedHashMap;
                l1tVar.j = linkedHashMap2;
                l1tVar.r.setValue(j5g.O0(hashMap.values()));
            } catch (Throwable th) {
                throw th;
            }
        }
        new Handler(Looper.getMainLooper()).post(new w29(l1tVar, 4));
        l1tVar.d.g(l1tVar.i);
        l1tVar.d.h(l1tVar.j);
    }

    @Override // xsna.h2t.a
    public final b4p.a getConfig() {
        return this.b;
    }

    @Override // xsna.h2t.a
    public final String getKey() {
        return this.c;
    }

    @Override // xsna.h2t.a
    public final void onLowMemory() {
        boolean isCurrentThread = Looper.getMainLooper().isCurrentThread();
        l1t l1tVar = this.f;
        if (isCurrentThread) {
            l1tVar.d.f();
        } else {
            new Handler(Looper.getMainLooper()).post(new hod(l1tVar, 4));
        }
    }

    public final String toString() {
        return new JSONObject(pn00.k(new Pair("key", this.c), new Pair("link", this.a), new Pair("config", this.b))).toString();
    }
}
