package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.d;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.squareup.moshi.Moshi;
import com.yandex.div.core.state.b;
import com.yandex.div.core.view2.divs.u;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.plus.adapter.auth.api.PlusAuthAdapter$Environment;
import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.core.config.Environment;
import com.yandex.plus.home.benchmark.BenchmarkState;
import com.ybsdk.core.utils.dto.ErrorResponseDto;
import com.ybsdk.core.utils.ext.EmptyResponseBodyException;
import com.ybsdk.core.utils.ext.ErrorResponse;
import com.ybsdk.core.utils.ext.ErrorResponseException;
import defpackage.inc;
import defpackage.n5;
import defpackage.oa20;
import defpackage.oo2;
import defpackage.ru2;
import defpackage.w511;
import defpackage.z5d0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Result;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.PropertyReference0;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import retrofit2.Call;
import retrofit2.Response;

/* loaded from: classes.dex */
public final class oo2 implements yk7, jl11, ag7 {
    public final Object a;
    public Object b;
    public Object c;
    public Object w;
    public Object x;

    public oo2(ru2 ru2Var) {
        this.a = ru2Var;
        this.b = a.a(new bgc(3));
        final int i = 0;
        this.c = a.a(new sls(this) { // from class: hnc
            public final /* synthetic */ oo2 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                String str;
                String str2;
                int i2 = i;
                oo2 oo2Var = this.b;
                switch (i2) {
                    case 0:
                        i3y i3yVar = (i3y) oo2Var.b;
                        ru2 ru2Var2 = (ru2) oo2Var.a;
                        int i3 = inc.a[((Environment) ru2Var2.f).ordinal()];
                        if (i3 == 1) {
                            str = "3k20G4eV5cmBDMWxhyvXqf651stJFfVpeId8dV+kXA1q5dJSjFb2pWgfEheYTUxS";
                            str2 = "2x20HNWT5ZSEWcWxhy7X/xyoA7ggb85RVHMIux1XXPt+Ym/sp+1ZVPXv+RwNO2ci";
                        } else {
                            if (i3 != 2) {
                                w511.b();
                                return null;
                            }
                            str = "20/lGNbEvpjWDMK+hy7Yrut12HQLzNXBa7frlDvQnOS4mKGmYxDJbD9ycJFBAivB";
                            str2 = "jBCxHNGSsciDDcCwhyre+1hiqknkcyuMrI7IOY6HkgzcDwTZSVa362DWBL9xyq1M";
                        }
                        String str3 = str;
                        String str4 = str2;
                        e1d0 e1d0Var = (e1d0) ru2Var2.b;
                        PlusAuthAdapter$Environment f = gwk0.f((Environment) ru2Var2.f);
                        i3y i3yVar2 = skd0.a;
                        rkd0 a = skd0.a(PlusLogTag.SDK);
                        qhw0 a2 = jl40.a();
                        ((wyj) ((xyj) i3yVar.getValue())).getClass();
                        ike a3 = bvf0.a(cvw.U(a2, wyj.e));
                        ((wyj) ((xyj) i3yVar.getValue())).getClass();
                        g6u g6uVar = wyj.c;
                        ((wyj) ((xyj) i3yVar.getValue())).getClass();
                        return new com.yandex.plus.domain.auth.impl.a(e1d0Var, f, str3, str4, a, a3, g6uVar, wyj.f, "acquisition_sdk");
                    default:
                        return (x75) ((y75) ((i3y) oo2Var.x).getValue()).b.getValue();
                }
            }
        });
        final int i2 = 1;
        this.w = a.a(new sls(this) { // from class: hnc
            public final /* synthetic */ oo2 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                String str;
                String str2;
                int i22 = i2;
                oo2 oo2Var = this.b;
                switch (i22) {
                    case 0:
                        i3y i3yVar = (i3y) oo2Var.b;
                        ru2 ru2Var2 = (ru2) oo2Var.a;
                        int i3 = inc.a[((Environment) ru2Var2.f).ordinal()];
                        if (i3 == 1) {
                            str = "3k20G4eV5cmBDMWxhyvXqf651stJFfVpeId8dV+kXA1q5dJSjFb2pWgfEheYTUxS";
                            str2 = "2x20HNWT5ZSEWcWxhy7X/xyoA7ggb85RVHMIux1XXPt+Ym/sp+1ZVPXv+RwNO2ci";
                        } else {
                            if (i3 != 2) {
                                w511.b();
                                return null;
                            }
                            str = "20/lGNbEvpjWDMK+hy7Yrut12HQLzNXBa7frlDvQnOS4mKGmYxDJbD9ycJFBAivB";
                            str2 = "jBCxHNGSsciDDcCwhyre+1hiqknkcyuMrI7IOY6HkgzcDwTZSVa362DWBL9xyq1M";
                        }
                        String str3 = str;
                        String str4 = str2;
                        e1d0 e1d0Var = (e1d0) ru2Var2.b;
                        PlusAuthAdapter$Environment f = gwk0.f((Environment) ru2Var2.f);
                        i3y i3yVar2 = skd0.a;
                        rkd0 a = skd0.a(PlusLogTag.SDK);
                        qhw0 a2 = jl40.a();
                        ((wyj) ((xyj) i3yVar.getValue())).getClass();
                        ike a3 = bvf0.a(cvw.U(a2, wyj.e));
                        ((wyj) ((xyj) i3yVar.getValue())).getClass();
                        g6u g6uVar = wyj.c;
                        ((wyj) ((xyj) i3yVar.getValue())).getClass();
                        return new com.yandex.plus.domain.auth.impl.a(e1d0Var, f, str3, str4, a, a3, g6uVar, wyj.f, "acquisition_sdk");
                    default:
                        return (x75) ((y75) ((i3y) oo2Var.x).getValue()).b.getValue();
                }
            }
        });
        this.x = a.a(new sls() { // from class: com.yandex.plus.acquisition.sdk.common.impl.di.a
            @Override // defpackage.sls
            public final Object invoke() {
                String str;
                ru2 ru2Var2 = (ru2) oo2.this.a;
                Context context = (Context) ru2Var2.g;
                Environment environment = (Environment) ru2Var2.f;
                int i3 = inc.a[environment.ordinal()];
                if (i3 == 1) {
                    str = "a99f48c7-c89c-497e-89b3-ee0e697a16d4";
                } else {
                    if (i3 != 2) {
                        w511.b();
                        return null;
                    }
                    str = "2c129634-4c21-414a-9acd-1890762ce8cf";
                }
                String str2 = str;
                com.yandex.plus.metrica.api.a aVar = (com.yandex.plus.metrica.api.a) ru2Var2.c;
                n5 n5Var = new n5(context, 12);
                CommonComponent$metrica$2$2 commonComponent$metrica$2$2 = new CommonComponent$metrica$2$2();
                aVar.getClass();
                return new z5d0(context, (oa20) com.yandex.plus.metrica.api.a.b.getValue(), str2, "PLUSPAYSDKA", "com.yandex.plus.pay", "plus_hq_Payment-SDK", environment, n5Var, commonComponent$metrica$2$2);
            }
        });
    }

    public static oo2 f(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        oo2 oo2Var = new oo2(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) oo2Var.w)) {
            try {
                ((ArrayDeque) oo2Var.w).clear();
                String string = ((SharedPreferences) oo2Var.a).getString((String) oo2Var.b, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) oo2Var.c)) {
                    String[] split = string.split((String) oo2Var.c, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) oo2Var.w).add(str);
                        }
                    }
                    return oo2Var;
                }
                return oo2Var;
            } finally {
            }
        }
    }

    @Override // defpackage.jl11
    public void a(Object obj) {
        Object obj2;
        String str = (String) obj;
        dbl dblVar = (dbl) this.b;
        DivStateLayout divStateLayout = (DivStateLayout) this.a;
        if (str == null || divStateLayout.getStateId() == null || str.equals(divStateLayout.getStateId())) {
            return;
        }
        Iterator it = dblVar.I.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it.next();
                if (jl40.l(((cbl) obj2).d, str)) {
                    break;
                }
            }
        }
        cbl cblVar = (cbl) obj2;
        b bVar = (b) this.c;
        String str2 = dblVar.p;
        if (str2 == null && (str2 = dblVar.x) == null) {
            str2 = "";
        }
        ((aw5) this.w).a.switchToState(com.yandex.div.core.state.a.a(bVar, str2, cblVar, str), true);
    }

    public void b(Object obj, Object obj2, hlx hlxVar, boolean z) {
        byte[] array;
        if (((ConcurrentHashMap) this.b) == null) {
            ny61.r("addPrimitive cannot be called after build");
            return;
        }
        if (obj == null && obj2 == null) {
            kbs.v("at least one of the `fullPrimitive` or `primitive` must be set");
            return;
        }
        if (hlxVar.E() != KeyStatusType.ENABLED) {
            kbs.v("only ENABLED key is allowed");
            return;
        }
        Integer valueOf = Integer.valueOf(hlxVar.C());
        if (hlxVar.D() == OutputPrefixType.RAW) {
            valueOf = null;
        }
        lhx a = jz40.b.a(yuf0.p(hlxVar.B().C(), hlxVar.B().D(), hlxVar.B().B(), hlxVar.D(), valueOf));
        int i = scf.a[hlxVar.D().ordinal()];
        if (i == 1 || i == 2) {
            array = ByteBuffer.allocate(5).put((byte) 0).putInt(hlxVar.C()).array();
        } else if (i == 3) {
            array = ByteBuffer.allocate(5).put((byte) 1).putInt(hlxVar.C()).array();
        } else {
            if (i != 4) {
                kbs.v("unknown output prefix type");
                return;
            }
            array = d6z.a;
        }
        p2f0 p2f0Var = new p2f0(obj, obj2, array, hlxVar.E(), hlxVar.D(), hlxVar.C(), hlxVar.B().C(), a);
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.b;
        ArrayList arrayList = (ArrayList) this.w;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(p2f0Var);
        byte[] bArr = p2f0Var.c;
        q2f0 q2f0Var = new q2f0(bArr != null ? Arrays.copyOf(bArr, bArr.length) : null);
        List list = (List) concurrentHashMap.put(q2f0Var, Collections.unmodifiableList(arrayList2));
        if (list != null) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(list);
            arrayList3.add(p2f0Var);
            concurrentHashMap.put(q2f0Var, Collections.unmodifiableList(arrayList3));
        }
        arrayList.add(p2f0Var);
        if (z) {
            if (((p2f0) this.c) == null) {
                this.c = p2f0Var;
            } else {
                ny61.r("you cannot set two primary primitives");
            }
        }
    }

    public wkp c() {
        if (((rlp) this.b) == null && ((rlp) this.c) == null) {
            ny61.g("At least one of settings, experiments or configuration must be set!");
            return null;
        }
        g0c g0cVar = (g0c) this.a;
        final int i = 0;
        sls slsVar = new sls(this) { // from class: a0d
            public final /* synthetic */ oo2 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                oo2 oo2Var = this.b;
                switch (i2) {
                    case 0:
                        rlp rlpVar = (rlp) oo2Var.b;
                        llp llpVar = rlpVar instanceof llp ? (llp) rlpVar : null;
                        rlp rlpVar2 = (rlp) oo2Var.c;
                        llp llpVar2 = rlpVar2 instanceof llp ? (llp) rlpVar2 : null;
                        Object obj = oo2Var.w;
                        return new clp(null, llpVar, llpVar2, obj instanceof Boolean ? (Boolean) obj : null, 1);
                    case 1:
                        rlp rlpVar3 = (rlp) oo2Var.b;
                        olp olpVar = rlpVar3 instanceof olp ? (olp) rlpVar3 : null;
                        rlp rlpVar4 = (rlp) oo2Var.c;
                        olp olpVar2 = rlpVar4 instanceof olp ? (olp) rlpVar4 : null;
                        Object obj2 = oo2Var.w;
                        return new glp(null, olpVar, olpVar2, obj2 instanceof String ? (String) obj2 : null, 1);
                    case 2:
                        rlp rlpVar5 = (rlp) oo2Var.b;
                        plp plpVar = rlpVar5 instanceof plp ? (plp) rlpVar5 : null;
                        rlp rlpVar6 = (rlp) oo2Var.c;
                        plp plpVar2 = rlpVar6 instanceof plp ? (plp) rlpVar6 : null;
                        Object obj3 = oo2Var.w;
                        return new hlp(null, plpVar, plpVar2, obj3 != null ? rzo.b0(obj3) : null, 1);
                    case 3:
                        rlp rlpVar7 = (rlp) oo2Var.b;
                        nlp nlpVar = rlpVar7 instanceof nlp ? (nlp) rlpVar7 : null;
                        rlp rlpVar8 = (rlp) oo2Var.c;
                        nlp nlpVar2 = rlpVar8 instanceof nlp ? (nlp) rlpVar8 : null;
                        Object obj4 = oo2Var.w;
                        Integer num = obj4 instanceof Integer ? (Integer) obj4 : null;
                        vjg0 vjg0Var = (vjg0) oo2Var.x;
                        return new elp(null, nlpVar, nlpVar2, num, vjg0Var != null ? vjg0Var : null, 1);
                    default:
                        rlp rlpVar9 = (rlp) oo2Var.b;
                        mlp mlpVar = rlpVar9 instanceof mlp ? (mlp) rlpVar9 : null;
                        rlp rlpVar10 = (rlp) oo2Var.c;
                        mlp mlpVar2 = rlpVar10 instanceof mlp ? (mlp) rlpVar10 : null;
                        Object obj5 = oo2Var.w;
                        Float f = obj5 instanceof Float ? (Float) obj5 : null;
                        vjg0 vjg0Var2 = (vjg0) oo2Var.x;
                        return new dlp(null, mlpVar, mlpVar2, f, vjg0Var2 != null ? vjg0Var2 : null, 1);
                }
            }
        };
        final int i2 = 1;
        sls slsVar2 = new sls(this) { // from class: a0d
            public final /* synthetic */ oo2 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                oo2 oo2Var = this.b;
                switch (i22) {
                    case 0:
                        rlp rlpVar = (rlp) oo2Var.b;
                        llp llpVar = rlpVar instanceof llp ? (llp) rlpVar : null;
                        rlp rlpVar2 = (rlp) oo2Var.c;
                        llp llpVar2 = rlpVar2 instanceof llp ? (llp) rlpVar2 : null;
                        Object obj = oo2Var.w;
                        return new clp(null, llpVar, llpVar2, obj instanceof Boolean ? (Boolean) obj : null, 1);
                    case 1:
                        rlp rlpVar3 = (rlp) oo2Var.b;
                        olp olpVar = rlpVar3 instanceof olp ? (olp) rlpVar3 : null;
                        rlp rlpVar4 = (rlp) oo2Var.c;
                        olp olpVar2 = rlpVar4 instanceof olp ? (olp) rlpVar4 : null;
                        Object obj2 = oo2Var.w;
                        return new glp(null, olpVar, olpVar2, obj2 instanceof String ? (String) obj2 : null, 1);
                    case 2:
                        rlp rlpVar5 = (rlp) oo2Var.b;
                        plp plpVar = rlpVar5 instanceof plp ? (plp) rlpVar5 : null;
                        rlp rlpVar6 = (rlp) oo2Var.c;
                        plp plpVar2 = rlpVar6 instanceof plp ? (plp) rlpVar6 : null;
                        Object obj3 = oo2Var.w;
                        return new hlp(null, plpVar, plpVar2, obj3 != null ? rzo.b0(obj3) : null, 1);
                    case 3:
                        rlp rlpVar7 = (rlp) oo2Var.b;
                        nlp nlpVar = rlpVar7 instanceof nlp ? (nlp) rlpVar7 : null;
                        rlp rlpVar8 = (rlp) oo2Var.c;
                        nlp nlpVar2 = rlpVar8 instanceof nlp ? (nlp) rlpVar8 : null;
                        Object obj4 = oo2Var.w;
                        Integer num = obj4 instanceof Integer ? (Integer) obj4 : null;
                        vjg0 vjg0Var = (vjg0) oo2Var.x;
                        return new elp(null, nlpVar, nlpVar2, num, vjg0Var != null ? vjg0Var : null, 1);
                    default:
                        rlp rlpVar9 = (rlp) oo2Var.b;
                        mlp mlpVar = rlpVar9 instanceof mlp ? (mlp) rlpVar9 : null;
                        rlp rlpVar10 = (rlp) oo2Var.c;
                        mlp mlpVar2 = rlpVar10 instanceof mlp ? (mlp) rlpVar10 : null;
                        Object obj5 = oo2Var.w;
                        Float f = obj5 instanceof Float ? (Float) obj5 : null;
                        vjg0 vjg0Var2 = (vjg0) oo2Var.x;
                        return new dlp(null, mlpVar, mlpVar2, f, vjg0Var2 != null ? vjg0Var2 : null, 1);
                }
            }
        };
        final int i3 = 2;
        sls slsVar3 = new sls(this) { // from class: a0d
            public final /* synthetic */ oo2 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i3;
                oo2 oo2Var = this.b;
                switch (i22) {
                    case 0:
                        rlp rlpVar = (rlp) oo2Var.b;
                        llp llpVar = rlpVar instanceof llp ? (llp) rlpVar : null;
                        rlp rlpVar2 = (rlp) oo2Var.c;
                        llp llpVar2 = rlpVar2 instanceof llp ? (llp) rlpVar2 : null;
                        Object obj = oo2Var.w;
                        return new clp(null, llpVar, llpVar2, obj instanceof Boolean ? (Boolean) obj : null, 1);
                    case 1:
                        rlp rlpVar3 = (rlp) oo2Var.b;
                        olp olpVar = rlpVar3 instanceof olp ? (olp) rlpVar3 : null;
                        rlp rlpVar4 = (rlp) oo2Var.c;
                        olp olpVar2 = rlpVar4 instanceof olp ? (olp) rlpVar4 : null;
                        Object obj2 = oo2Var.w;
                        return new glp(null, olpVar, olpVar2, obj2 instanceof String ? (String) obj2 : null, 1);
                    case 2:
                        rlp rlpVar5 = (rlp) oo2Var.b;
                        plp plpVar = rlpVar5 instanceof plp ? (plp) rlpVar5 : null;
                        rlp rlpVar6 = (rlp) oo2Var.c;
                        plp plpVar2 = rlpVar6 instanceof plp ? (plp) rlpVar6 : null;
                        Object obj3 = oo2Var.w;
                        return new hlp(null, plpVar, plpVar2, obj3 != null ? rzo.b0(obj3) : null, 1);
                    case 3:
                        rlp rlpVar7 = (rlp) oo2Var.b;
                        nlp nlpVar = rlpVar7 instanceof nlp ? (nlp) rlpVar7 : null;
                        rlp rlpVar8 = (rlp) oo2Var.c;
                        nlp nlpVar2 = rlpVar8 instanceof nlp ? (nlp) rlpVar8 : null;
                        Object obj4 = oo2Var.w;
                        Integer num = obj4 instanceof Integer ? (Integer) obj4 : null;
                        vjg0 vjg0Var = (vjg0) oo2Var.x;
                        return new elp(null, nlpVar, nlpVar2, num, vjg0Var != null ? vjg0Var : null, 1);
                    default:
                        rlp rlpVar9 = (rlp) oo2Var.b;
                        mlp mlpVar = rlpVar9 instanceof mlp ? (mlp) rlpVar9 : null;
                        rlp rlpVar10 = (rlp) oo2Var.c;
                        mlp mlpVar2 = rlpVar10 instanceof mlp ? (mlp) rlpVar10 : null;
                        Object obj5 = oo2Var.w;
                        Float f = obj5 instanceof Float ? (Float) obj5 : null;
                        vjg0 vjg0Var2 = (vjg0) oo2Var.x;
                        return new dlp(null, mlpVar, mlpVar2, f, vjg0Var2 != null ? vjg0Var2 : null, 1);
                }
            }
        };
        final int i4 = 3;
        sls slsVar4 = new sls(this) { // from class: a0d
            public final /* synthetic */ oo2 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i4;
                oo2 oo2Var = this.b;
                switch (i22) {
                    case 0:
                        rlp rlpVar = (rlp) oo2Var.b;
                        llp llpVar = rlpVar instanceof llp ? (llp) rlpVar : null;
                        rlp rlpVar2 = (rlp) oo2Var.c;
                        llp llpVar2 = rlpVar2 instanceof llp ? (llp) rlpVar2 : null;
                        Object obj = oo2Var.w;
                        return new clp(null, llpVar, llpVar2, obj instanceof Boolean ? (Boolean) obj : null, 1);
                    case 1:
                        rlp rlpVar3 = (rlp) oo2Var.b;
                        olp olpVar = rlpVar3 instanceof olp ? (olp) rlpVar3 : null;
                        rlp rlpVar4 = (rlp) oo2Var.c;
                        olp olpVar2 = rlpVar4 instanceof olp ? (olp) rlpVar4 : null;
                        Object obj2 = oo2Var.w;
                        return new glp(null, olpVar, olpVar2, obj2 instanceof String ? (String) obj2 : null, 1);
                    case 2:
                        rlp rlpVar5 = (rlp) oo2Var.b;
                        plp plpVar = rlpVar5 instanceof plp ? (plp) rlpVar5 : null;
                        rlp rlpVar6 = (rlp) oo2Var.c;
                        plp plpVar2 = rlpVar6 instanceof plp ? (plp) rlpVar6 : null;
                        Object obj3 = oo2Var.w;
                        return new hlp(null, plpVar, plpVar2, obj3 != null ? rzo.b0(obj3) : null, 1);
                    case 3:
                        rlp rlpVar7 = (rlp) oo2Var.b;
                        nlp nlpVar = rlpVar7 instanceof nlp ? (nlp) rlpVar7 : null;
                        rlp rlpVar8 = (rlp) oo2Var.c;
                        nlp nlpVar2 = rlpVar8 instanceof nlp ? (nlp) rlpVar8 : null;
                        Object obj4 = oo2Var.w;
                        Integer num = obj4 instanceof Integer ? (Integer) obj4 : null;
                        vjg0 vjg0Var = (vjg0) oo2Var.x;
                        return new elp(null, nlpVar, nlpVar2, num, vjg0Var != null ? vjg0Var : null, 1);
                    default:
                        rlp rlpVar9 = (rlp) oo2Var.b;
                        mlp mlpVar = rlpVar9 instanceof mlp ? (mlp) rlpVar9 : null;
                        rlp rlpVar10 = (rlp) oo2Var.c;
                        mlp mlpVar2 = rlpVar10 instanceof mlp ? (mlp) rlpVar10 : null;
                        Object obj5 = oo2Var.w;
                        Float f = obj5 instanceof Float ? (Float) obj5 : null;
                        vjg0 vjg0Var2 = (vjg0) oo2Var.x;
                        return new dlp(null, mlpVar, mlpVar2, f, vjg0Var2 != null ? vjg0Var2 : null, 1);
                }
            }
        };
        final int i5 = 4;
        return rzo.m(g0cVar, slsVar, slsVar2, slsVar3, slsVar4, new sls(this) { // from class: a0d
            public final /* synthetic */ oo2 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i5;
                oo2 oo2Var = this.b;
                switch (i22) {
                    case 0:
                        rlp rlpVar = (rlp) oo2Var.b;
                        llp llpVar = rlpVar instanceof llp ? (llp) rlpVar : null;
                        rlp rlpVar2 = (rlp) oo2Var.c;
                        llp llpVar2 = rlpVar2 instanceof llp ? (llp) rlpVar2 : null;
                        Object obj = oo2Var.w;
                        return new clp(null, llpVar, llpVar2, obj instanceof Boolean ? (Boolean) obj : null, 1);
                    case 1:
                        rlp rlpVar3 = (rlp) oo2Var.b;
                        olp olpVar = rlpVar3 instanceof olp ? (olp) rlpVar3 : null;
                        rlp rlpVar4 = (rlp) oo2Var.c;
                        olp olpVar2 = rlpVar4 instanceof olp ? (olp) rlpVar4 : null;
                        Object obj2 = oo2Var.w;
                        return new glp(null, olpVar, olpVar2, obj2 instanceof String ? (String) obj2 : null, 1);
                    case 2:
                        rlp rlpVar5 = (rlp) oo2Var.b;
                        plp plpVar = rlpVar5 instanceof plp ? (plp) rlpVar5 : null;
                        rlp rlpVar6 = (rlp) oo2Var.c;
                        plp plpVar2 = rlpVar6 instanceof plp ? (plp) rlpVar6 : null;
                        Object obj3 = oo2Var.w;
                        return new hlp(null, plpVar, plpVar2, obj3 != null ? rzo.b0(obj3) : null, 1);
                    case 3:
                        rlp rlpVar7 = (rlp) oo2Var.b;
                        nlp nlpVar = rlpVar7 instanceof nlp ? (nlp) rlpVar7 : null;
                        rlp rlpVar8 = (rlp) oo2Var.c;
                        nlp nlpVar2 = rlpVar8 instanceof nlp ? (nlp) rlpVar8 : null;
                        Object obj4 = oo2Var.w;
                        Integer num = obj4 instanceof Integer ? (Integer) obj4 : null;
                        vjg0 vjg0Var = (vjg0) oo2Var.x;
                        return new elp(null, nlpVar, nlpVar2, num, vjg0Var != null ? vjg0Var : null, 1);
                    default:
                        rlp rlpVar9 = (rlp) oo2Var.b;
                        mlp mlpVar = rlpVar9 instanceof mlp ? (mlp) rlpVar9 : null;
                        rlp rlpVar10 = (rlp) oo2Var.c;
                        mlp mlpVar2 = rlpVar10 instanceof mlp ? (mlp) rlpVar10 : null;
                        Object obj5 = oo2Var.w;
                        Float f = obj5 instanceof Float ? (Float) obj5 : null;
                        vjg0 vjg0Var2 = (vjg0) oo2Var.x;
                        return new dlp(null, mlpVar, mlpVar2, f, vjg0Var2 != null ? vjg0Var2 : null, 1);
                }
            }
        });
    }

    public void d(v0e v0eVar, String str) {
        this.c = rzo.n((g0c) this.a, new b0d(v0eVar, str, 5), new b0d(v0eVar, str, 6), new b0d(v0eVar, str, 7), new b0d(v0eVar, str, 8), new b0d(v0eVar, str, 9));
    }

    @Override // defpackage.jl11
    public void e(tls tlsVar) {
        ibl iblVar = ((u) this.x).y;
        String str = ((aw5) this.w).a.getDataTag().a;
        b bVar = (b) this.c;
        Map map = (Map) iblVar.d.get(str);
        if (map == null) {
            return;
        }
        b6u0 b6u0Var = (b6u0) map.get(bVar.e() + '/' + ((String) kotlin.collections.a.Z(bVar.c)));
        if (b6u0Var == null) {
            return;
        }
        b6u0Var.b = new WeakReference(tlsVar);
    }

    public Object g(ContinuationImpl continuationImpl) {
        ArrayList arrayList;
        fc70 fc70Var = (fc70) this.b;
        UUID.randomUUID();
        ovn ovnVar = (ovn) this.c;
        ArrayList arrayList2 = (ArrayList) this.w;
        qo2 qo2Var = (qo2) this.a;
        Boolean bool = (Boolean) this.x;
        boolean z = bool == null || bool.equals(Boolean.TRUE);
        zwd zwdVar = qo2Var.y;
        c cVar = qo2Var.b;
        zwdVar.getClass();
        tko b = d.a(zwdVar, cVar).b(qo2Var.x).b(ovnVar);
        UUID randomUUID = UUID.randomUUID();
        tko b2 = d.a(zwdVar, cVar).b(b).b(ovnVar);
        if (arrayList2 == null) {
            arrayList = null;
        } else {
            if (!z) {
                arrayList2 = kotlin.collections.a.m0(arrayList2, EmptyList.a);
            }
            arrayList = arrayList2;
        }
        to2 to2Var = new to2(fc70Var, randomUUID, b2, null, arrayList, null, null, null);
        ArrayList o0 = kotlin.collections.a.o0(qo2Var.w, qo2Var.z);
        if (o0.size() > 0) {
            return e.P(((so2) o0.get(0)).a(to2Var, new kdh(o0, 1)), continuationImpl);
        }
        ny61.r("Check failed.");
        return null;
    }

    public void h(dro droVar, String str) {
        this.b = rzo.n((g0c) this.a, new b0d(droVar, str, 0), new b0d(droVar, str, 1), new b0d(droVar, str, 2), new b0d(droVar, str, 3), new b0d(droVar, str, 4));
    }

    public com.yandex.go.shortcuts.impl.b i() {
        d3s0 d3s0Var = (d3s0) this.a;
        d2c d2cVar = d3s0Var.c;
        q5z.h(d2cVar);
        c1f c1fVar = d3s0Var.d;
        q5z.h(c1fVar);
        z660 z660Var = d3s0Var.e;
        q5z.h(z660Var);
        pzr0 pzr0Var = (pzr0) this.b;
        o1s0 o1s0Var = (o1s0) this.c;
        n170 n170Var = d3s0Var.f;
        q5z.h(n170Var);
        jc00 jc00Var = d3s0Var.g;
        q5z.h(jc00Var);
        xsv0 xsv0Var = d3s0Var.h;
        q5z.h(xsv0Var);
        com.yandex.go.models.b bVar = d3s0Var.i;
        q5z.h(bVar);
        u8w0 l = l();
        hwe0 hwe0Var = d3s0Var.j;
        q5z.h(hwe0Var);
        sxr0 sxr0Var = (sxr0) this.w;
        txr0 txr0Var = new txr0();
        tse tseVar = d3s0Var.a;
        q5z.h(tseVar);
        return new com.yandex.go.shortcuts.impl.b(d2cVar, c1fVar, z660Var, pzr0Var, o1s0Var, n170Var, jc00Var, xsv0Var, bVar, l, hwe0Var, sxr0Var, txr0Var, tseVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0063, code lost:
    
        ((com.yandex.plus.core.benchmark.b) r1.b).b();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void j() {
        if (((Boolean) ((r0) this.b).getValue()).booleanValue() && ((Boolean) ((r0) this.c).getValue()).booleanValue()) {
            ReentrantLock reentrantLock = (ReentrantLock) this.x;
            reentrantLock.lock();
            try {
                jb7 jb7Var = (jb7) this.w;
                if (jb7Var != null) {
                    AtomicReference atomicReference = (AtomicReference) jb7Var.w;
                    BenchmarkState benchmarkState = BenchmarkState.STARTED;
                    BenchmarkState benchmarkState2 = BenchmarkState.ERROR;
                    while (true) {
                        if (atomicReference.compareAndSet(benchmarkState, benchmarkState2)) {
                            ((com.yandex.plus.core.benchmark.b) jb7Var.b).c();
                            break;
                        } else if (atomicReference.get() != benchmarkState) {
                            break;
                        }
                    }
                }
                jb7 jb7Var2 = (jb7) ((t9a0) this.a).invoke();
                this.w = jb7Var2;
                AtomicReference atomicReference2 = (AtomicReference) jb7Var2.w;
                BenchmarkState benchmarkState3 = BenchmarkState.NOT_STARTED;
                BenchmarkState benchmarkState4 = BenchmarkState.STARTED;
                while (true) {
                    if (atomicReference2.compareAndSet(benchmarkState3, benchmarkState4)) {
                        break;
                    } else if (atomicReference2.get() != benchmarkState3) {
                        break;
                    }
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    @Override // defpackage.yk7
    public void k(Call call, Throwable th) {
        kol0 kol0Var = (kol0) this.b;
        com.ybsdk.network.retrofit.b bVar = (com.ybsdk.network.retrofit.b) this.c;
        bVar.c.b(call, th, (ak7) this.w);
        bVar.b(call);
        kol0Var.resumeWith(new Result(new Result.Failure(th)));
    }

    public u8w0 l() {
        o1s0 o1s0Var = (o1s0) this.c;
        pzr0 pzr0Var = (pzr0) this.b;
        ylp0 ylp0Var = ((d3s0) this.a).b;
        q5z.h(ylp0Var);
        return new u8w0(o1s0Var, pzr0Var, ylp0Var, (q3s0) ((xvf0) this.x).get());
    }

    @Override // defpackage.ag7
    public Type n() {
        return (Type) this.b;
    }

    @Override // defpackage.yk7
    public void o(Call call, Response response) {
        Throwable errorResponseException;
        wls wlsVar = (wls) this.x;
        ak7 ak7Var = (ak7) this.w;
        kol0 kol0Var = (kol0) this.b;
        com.ybsdk.network.retrofit.b bVar = (com.ybsdk.network.retrofit.b) this.c;
        u0k0 u0k0Var = bVar.c;
        kvj0 kvj0Var = response.a;
        String str = kvj0Var.c;
        int i = kvj0Var.w;
        String a = kvj0Var.y.a(yu50.d);
        ((tls) this.a).invoke(response);
        Object obj = response.b;
        rvj0 rvj0Var = response.c;
        try {
            if (i == 204) {
                kol0Var.resumeWith(new Result(com.ybsdk.network.retrofit.b.a(bVar, call, zy11.a, ak7Var, new tj(6, wlsVar, response))));
                return;
            }
            boolean z = kvj0Var.J;
            int i2 = 0;
            if (z && obj != null) {
                kol0Var.resumeWith(new Result(com.ybsdk.network.retrofit.b.a(bVar, call, obj, ak7Var, new vg7(i2, wlsVar, response))));
                return;
            }
            if (z && obj == null) {
                errorResponseException = new EmptyResponseBodyException(0);
            } else if (rvj0Var == null) {
                errorResponseException = new ErrorResponseException(new ErrorResponse(i, str), a);
            } else {
                try {
                    Moshi moshi = bVar.b;
                    i9o i9oVar = ErrorResponseDto.Companion;
                    String string = rvj0Var.string();
                    i9oVar.getClass();
                    ErrorResponseDto a2 = i9o.a(moshi, string);
                    String str2 = !evu0.J(str) ? str : null;
                    if (str2 == null) {
                        str2 = a2.getMessage();
                    }
                    errorResponseException = new ErrorResponseException(new ErrorResponse(i, str2), a);
                } catch (Exception unused) {
                    errorResponseException = new ErrorResponseException(new ErrorResponse(i, str), a);
                }
            }
            u0k0Var.b(call, errorResponseException, ak7Var);
            bVar.b(call);
            kol0Var.resumeWith(new Result(new Result.Failure(errorResponseException)));
        } catch (Exception e) {
            u0k0Var.b(call, e, ak7Var);
            bVar.b(call);
            kol0Var.resumeWith(new Result(new Result.Failure(e)));
        }
    }

    @Override // defpackage.ag7
    public Object r(yv60 yv60Var) {
        return new ru.yandex.taxi.network.impl.a((Type) this.b, (xf7) this.a, yv60Var, (sls) this.c, (jse) ((sls) this.w).invoke(), (jk7) this.x);
    }

    public oo2(t9a0 t9a0Var) {
        this.a = t9a0Var;
        Boolean bool = Boolean.FALSE;
        this.b = bvf0.c(bool);
        this.c = bvf0.c(bool);
        this.x = new ReentrantLock();
    }

    public oo2(n0p n0pVar, am2 am2Var, com.yandex.plus.pay.ui.core.internal.di.b bVar) {
        this.a = n0pVar;
        this.b = am2Var;
        this.c = bVar;
        final int i = 0;
        this.w = a.a(new sls(this) { // from class: gt11
            public final /* synthetic */ oo2 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                i3y i3yVar;
                tt20 tt20Var;
                int i2 = i;
                oo2 oo2Var = this.b;
                switch (i2) {
                    case 0:
                        return new ht11(oo2Var);
                    default:
                        n0p n0pVar2 = (n0p) oo2Var.a;
                        i3y i3yVar2 = (i3y) ((am2) oo2Var.b).c;
                        bdd0 bdd0Var = n0pVar2.f;
                        com.yandex.plus.domain.auth.impl.a aVar = bdd0Var.k;
                        am2 am2Var2 = n0pVar2.i;
                        if (am2Var2 != null) {
                            com.yandex.plus.pay.ui.core.internal.di.b bVar2 = (com.yandex.plus.pay.ui.core.internal.di.b) oo2Var.c;
                            i3yVar = i3yVar2;
                            tt20Var = new tt20((gbd0) am2Var2.a, (kaa0) am2Var2.b, (yci0) am2Var2.c, new wn40(bdd0Var.a, bdd0Var.e, bdd0Var.f, bdd0Var.g, bdd0Var.i, bdd0Var.m.getEnvironment(), aVar, bdd0Var.j, bdd0Var.x, bdd0Var.y, (com.yandex.plus.experiments.impl.providers.a) ((PropertyReference0) bdd0Var.z).get(), bdd0Var.r, bdd0Var.n, n0pVar2.c, n0pVar2.g, bdd0Var.l, bdd0Var.p, (com.yandex.plus.pay.ui.core.internal.common.a) i3yVar.getValue(), bdd0Var.v, (ht11) ((i3y) oo2Var.w).getValue(), n0pVar2.h, (eu90) bVar2.b.getValue(), (fu90) bVar2.c.getValue(), n0pVar2.d, n0pVar2.e));
                        } else {
                            i3yVar = i3yVar2;
                            tt20Var = null;
                        }
                        return new com.yandex.plus.pay.ui.core.internal.a(tt20Var, aVar.h, (com.yandex.plus.pay.ui.core.internal.common.a) i3yVar.getValue());
                }
            }
        });
        final int i2 = 1;
        this.x = a.a(new sls(this) { // from class: gt11
            public final /* synthetic */ oo2 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                i3y i3yVar;
                tt20 tt20Var;
                int i22 = i2;
                oo2 oo2Var = this.b;
                switch (i22) {
                    case 0:
                        return new ht11(oo2Var);
                    default:
                        n0p n0pVar2 = (n0p) oo2Var.a;
                        i3y i3yVar2 = (i3y) ((am2) oo2Var.b).c;
                        bdd0 bdd0Var = n0pVar2.f;
                        com.yandex.plus.domain.auth.impl.a aVar = bdd0Var.k;
                        am2 am2Var2 = n0pVar2.i;
                        if (am2Var2 != null) {
                            com.yandex.plus.pay.ui.core.internal.di.b bVar2 = (com.yandex.plus.pay.ui.core.internal.di.b) oo2Var.c;
                            i3yVar = i3yVar2;
                            tt20Var = new tt20((gbd0) am2Var2.a, (kaa0) am2Var2.b, (yci0) am2Var2.c, new wn40(bdd0Var.a, bdd0Var.e, bdd0Var.f, bdd0Var.g, bdd0Var.i, bdd0Var.m.getEnvironment(), aVar, bdd0Var.j, bdd0Var.x, bdd0Var.y, (com.yandex.plus.experiments.impl.providers.a) ((PropertyReference0) bdd0Var.z).get(), bdd0Var.r, bdd0Var.n, n0pVar2.c, n0pVar2.g, bdd0Var.l, bdd0Var.p, (com.yandex.plus.pay.ui.core.internal.common.a) i3yVar.getValue(), bdd0Var.v, (ht11) ((i3y) oo2Var.w).getValue(), n0pVar2.h, (eu90) bVar2.b.getValue(), (fu90) bVar2.c.getValue(), n0pVar2.d, n0pVar2.e));
                        } else {
                            i3yVar = i3yVar2;
                            tt20Var = null;
                        }
                        return new com.yandex.plus.pay.ui.core.internal.a(tt20Var, aVar.h, (com.yandex.plus.pay.ui.core.internal.common.a) i3yVar.getValue());
                }
            }
        });
    }

    public oo2(qo2 qo2Var, fc70 fc70Var) {
        this.a = qo2Var;
        this.b = fc70Var;
        this.c = ovn.a;
    }

    public /* synthetic */ oo2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.w = obj4;
        this.x = obj5;
    }

    public oo2(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.w = new ArrayDeque();
        this.a = sharedPreferences;
        this.b = "topic_operation_queue";
        this.c = ",";
        this.x = scheduledThreadPoolExecutor;
    }

    public oo2(d3s0 d3s0Var, pzr0 pzr0Var, sxr0 sxr0Var, o1s0 o1s0Var) {
        this.a = d3s0Var;
        this.b = pzr0Var;
        this.c = o1s0Var;
        this.w = sxr0Var;
        this.x = i5m.b(r3s0.a);
    }

    public oo2(g0c g0cVar) {
        this.a = g0cVar;
    }

    public oo2(Class cls) {
        this.b = new ConcurrentHashMap();
        this.w = new ArrayList();
        this.a = cls;
        this.x = d630.b;
    }

    public oo2(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, List list, ArrayList arrayList4) {
        this.w = arrayList;
        this.a = arrayList2;
        this.b = arrayList3;
        this.c = list;
        this.x = arrayList4;
    }
}
