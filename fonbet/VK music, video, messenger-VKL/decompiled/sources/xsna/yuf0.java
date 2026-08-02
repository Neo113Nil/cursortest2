package xsna;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.core.preference.Preference;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: RemoteConfigComponent.java */
/* loaded from: classes.dex */
public final class yuf0 {
    public static final Random j = new Random();
    public final HashMap a;
    public final Context b;
    public final Executor c;
    public final vhr d;
    public final uir e;
    public final shr f;

    @Nullable
    public final f9e0<ex1> g;
    public final String h;
    public final HashMap i;

    public yuf0() {
        throw null;
    }

    public yuf0(Context context, @pf7 Executor executor, vhr vhrVar, uir uirVar, shr shrVar, f9e0<ex1> f9e0Var) {
        this.a = new HashMap();
        this.i = new HashMap();
        this.b = context;
        this.c = executor;
        this.d = vhrVar;
        this.e = uirVar;
        this.f = shrVar;
        this.g = f9e0Var;
        vhrVar.a();
        this.h = vhrVar.c.b;
        Tasks.call(executor, new wuf0(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0065 A[Catch: all -> 0x007a, TryCatch #3 {all -> 0x007a, blocks: (B:32:0x0054, B:34:0x005c, B:7:0x0065, B:8:0x006c, B:17:0x0077, B:10:0x006d, B:11:0x0072), top: B:31:0x0054, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized zjr a(String str) {
        Throwable th;
        final w1a0 w1a0Var;
        try {
            try {
                ixi c = c(str, "fetch");
                ixi c2 = c(str, "activate");
                ixi c3 = c(str, "defaults");
                com.google.firebase.remoteconfig.internal.c cVar = new com.google.firebase.remoteconfig.internal.c(Preference.h(this.b, 0, "frc_" + this.h + BundleUtil.UNDERLINE_TAG + str + "_settings"));
                pxi pxiVar = new pxi(this.c, c2, c3);
                vhr vhrVar = this.d;
                f9e0<ex1> f9e0Var = this.g;
                vhrVar.a();
                if (vhrVar.b.equals("[DEFAULT]")) {
                    try {
                        if (str.equals("firebase")) {
                            w1a0Var = new w1a0(f9e0Var);
                            if (w1a0Var != null) {
                                ry6 ry6Var = new ry6() { // from class: xsna.vuf0
                                    @Override // xsna.ry6
                                    public final void accept(Object obj, Object obj2) {
                                        JSONObject optJSONObject;
                                        w1a0 w1a0Var2 = w1a0.this;
                                        String str2 = (String) obj;
                                        com.google.firebase.remoteconfig.internal.a aVar = (com.google.firebase.remoteconfig.internal.a) obj2;
                                        ex1 ex1Var = w1a0Var2.a.get();
                                        if (ex1Var == null) {
                                            return;
                                        }
                                        JSONObject c4 = aVar.c();
                                        if (c4.length() < 1) {
                                            return;
                                        }
                                        JSONObject b = aVar.b();
                                        if (b.length() >= 1 && (optJSONObject = c4.optJSONObject(str2)) != null) {
                                            String optString = optJSONObject.optString("choiceId");
                                            if (optString.isEmpty()) {
                                                return;
                                            }
                                            synchronized (w1a0Var2.b) {
                                                try {
                                                    if (optString.equals(w1a0Var2.b.get(str2))) {
                                                        return;
                                                    }
                                                    w1a0Var2.b.put(str2, optString);
                                                    Bundle a = q9k.a("arm_key", str2);
                                                    a.putString("arm_value", b.optString(str2));
                                                    a.putString("personalization_id", optJSONObject.optString("personalizationId"));
                                                    a.putInt("arm_index", optJSONObject.optInt("armIndex", -1));
                                                    a.putString("group", optJSONObject.optString("group"));
                                                    ex1Var.d("fp", "personalization_assignment", a);
                                                    Bundle bundle = new Bundle();
                                                    bundle.putString("_fpid", optString);
                                                    ex1Var.d("fp", "_fpc", bundle);
                                                } catch (Throwable th2) {
                                                    throw th2;
                                                }
                                            }
                                        }
                                    }
                                };
                                synchronized (pxiVar.a) {
                                    pxiVar.a.add(ry6Var);
                                }
                            }
                            return b(this.d, str, this.e, this.f, this.c, c, c2, c3, d(str, c, cVar), pxiVar, cVar);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                w1a0Var = null;
                if (w1a0Var != null) {
                }
                return b(this.d, str, this.e, this.f, this.c, c, c2, c3, d(str, c, cVar), pxiVar, cVar);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final synchronized zjr b(vhr vhrVar, String str, uir uirVar, shr shrVar, Executor executor, ixi ixiVar, ixi ixiVar2, ixi ixiVar3, com.google.firebase.remoteconfig.internal.b bVar, pxi pxiVar, com.google.firebase.remoteconfig.internal.c cVar) {
        shr shrVar2;
        try {
            if (!this.a.containsKey(str)) {
                if (str.equals("firebase")) {
                    vhrVar.a();
                    if (vhrVar.b.equals("[DEFAULT]")) {
                        shrVar2 = shrVar;
                        zjr zjrVar = new zjr(uirVar, shrVar2, executor, ixiVar, ixiVar2, ixiVar3, bVar, pxiVar, cVar);
                        ixiVar2.b();
                        ixiVar3.b();
                        ixiVar.b();
                        this.a.put(str, zjrVar);
                    }
                }
                shrVar2 = null;
                zjr zjrVar2 = new zjr(uirVar, shrVar2, executor, ixiVar, ixiVar2, ixiVar3, bVar, pxiVar, cVar);
                ixiVar2.b();
                ixiVar3.b();
                ixiVar.b();
                this.a.put(str, zjrVar2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (zjr) this.a.get(str);
    }

    public final ixi c(String str, String str2) {
        uxi uxiVar;
        ixi ixiVar;
        String a = i5s.a(xe9.a("frc_", this.h, BundleUtil.UNDERLINE_TAG, str, BundleUtil.UNDERLINE_TAG), str2, ".json");
        Executor executor = this.c;
        Context context = this.b;
        HashMap hashMap = uxi.c;
        synchronized (uxi.class) {
            try {
                HashMap hashMap2 = uxi.c;
                if (!hashMap2.containsKey(a)) {
                    hashMap2.put(a, new uxi(context, a));
                }
                uxiVar = (uxi) hashMap2.get(a);
            } finally {
            }
        }
        HashMap hashMap3 = ixi.d;
        synchronized (ixi.class) {
            try {
                String str3 = uxiVar.b;
                HashMap hashMap4 = ixi.d;
                if (!hashMap4.containsKey(str3)) {
                    hashMap4.put(str3, new ixi(executor, uxiVar));
                }
                ixiVar = (ixi) hashMap4.get(str3);
            } finally {
            }
        }
        return ixiVar;
    }

    public final synchronized com.google.firebase.remoteconfig.internal.b d(String str, ixi ixiVar, com.google.firebase.remoteconfig.internal.c cVar) {
        uir uirVar;
        f9e0 xuf0Var;
        Executor executor;
        Random random;
        String str2;
        vhr vhrVar;
        try {
            uirVar = this.e;
            vhr vhrVar2 = this.d;
            vhrVar2.a();
            xuf0Var = vhrVar2.b.equals("[DEFAULT]") ? this.g : new xuf0();
            executor = this.c;
            random = j;
            vhr vhrVar3 = this.d;
            vhrVar3.a();
            str2 = vhrVar3.c.a;
            vhrVar = this.d;
            vhrVar.a();
        } catch (Throwable th) {
            throw th;
        }
        return new com.google.firebase.remoteconfig.internal.b(uirVar, xuf0Var, executor, random, ixiVar, new ConfigFetchHttpClient(this.b, vhrVar.c.b, str2, str, cVar.a.getLong("fetch_timeout_in_seconds", 60L), cVar.a.getLong("fetch_timeout_in_seconds", 60L)), cVar, this.i);
    }
}
