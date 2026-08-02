package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.e0;
import com.vungle.ads.internal.protos.Sdk;
import io.jsonwebtoken.JwtParser;
import java.util.Arrays;
import java.util.LinkedHashMap;
import xsna.qbk;

/* compiled from: Retained.kt */
/* loaded from: classes3.dex */
public final class qeg0 {
    public static final <Instance extends uic> Instance a(String str, gzs<? extends Instance> gzsVar, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1204556678, i, -1, "com.vk.mvi.saver.compose.rememberRetained (Retained.kt:36)");
        }
        int i2 = i & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(393114455, i2, -1, "com.vk.mvi.saver.compose.rememberRetainedInternal (Retained.kt:42)");
        }
        f5z f5zVar = (f5z) aVar.r(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        boolean J = aVar.J(f5zVar);
        Object x = aVar.x();
        Object obj = a.C0011a.a;
        if (J || x == obj) {
            int hashCode = f5zVar.hashCode();
            ro.d(16);
            x = Integer.toString(hashCode, 16);
            aVar.R(x);
        }
        String str2 = (String) x;
        wh50 c = androidx.compose.runtime.k.c(str2, aVar, 0);
        Object x2 = aVar.x();
        if (x2 == obj) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            oeg0 oeg0Var = new oeg0(0, c);
            rfc a = fpf0.a(seg0.class);
            if (linkedHashMap.containsKey(a)) {
                throw new IllegalArgumentException(("A `initializer` with the same `clazz` has already been added: " + a.h() + JwtParser.SEPARATOR_CHAR).toString());
            }
            linkedHashMap.put(a, new tyt0(a, oeg0Var));
            tyt0[] tyt0VarArr = (tyt0[]) linkedHashMap.values().toArray(new tyt0[0]);
            x2 = new ozw((tyt0[]) Arrays.copyOf(tyt0VarArr, tyt0VarArr.length));
            aVar.R(x2);
        }
        e0.c cVar = (e0.c) x2;
        xyt0 a2 = jwz.a(aVar);
        if (a2 == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        seg0 seg0Var = (seg0) uyt0.a(fpf0.a(seg0.class), a2, cVar, a2 instanceof androidx.lifecycle.f ? ((androidx.lifecycle.f) a2).getDefaultViewModelCreationExtras() : qbk.a.b, aVar);
        boolean J2 = aVar.J(str) | aVar.J(f5zVar);
        Object x3 = aVar.x();
        if (J2 || x3 == obj) {
            Instance instance = (Instance) seg0Var.c.remove(str);
            if (instance == null) {
                instance = gzsVar.invoke();
            }
            x3 = new peg0(instance, seg0Var, str, f5zVar);
            aVar.R(x3);
        }
        peg0 peg0Var = (peg0) x3;
        boolean y = aVar.y(seg0Var) | aVar.y(f5zVar) | aVar.J(str2);
        Object x4 = aVar.x();
        if (y || x4 == obj) {
            x4 = new ywc(seg0Var, f5zVar, str2, 5);
            aVar.R(x4);
        }
        bap.i((gzs) x4, aVar, 0);
        Instance instance2 = (Instance) peg0Var.b;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return instance2;
    }
}
