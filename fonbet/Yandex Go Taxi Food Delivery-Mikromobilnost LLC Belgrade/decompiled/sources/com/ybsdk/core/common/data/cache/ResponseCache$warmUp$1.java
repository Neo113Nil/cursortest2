package com.ybsdk.core.common.data.cache;

import android.util.Base64;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.yandex.passport.sloth.ui.dependencies.m;
import defpackage.awa0;
import defpackage.cvu0;
import defpackage.dsg;
import defpackage.dzm;
import defpackage.e3n;
import defpackage.e5z0;
import defpackage.evu0;
import defpackage.f8z0;
import defpackage.g3r;
import defpackage.gw00;
import defpackage.h3r;
import defpackage.i3y;
import defpackage.i5z0;
import defpackage.jqp0;
import defpackage.lrp0;
import defpackage.mlg;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s5r;
import defpackage.s630;
import defpackage.t5r;
import defpackage.trp0;
import defpackage.tse;
import defpackage.uvj0;
import defpackage.vvj0;
import defpackage.wls;
import defpackage.wvj0;
import defpackage.x4c;
import defpackage.x4e;
import defpackage.zy11;
import java.io.File;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FileWalkDirection;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.core.common.data.cache.ResponseCache$warmUp$1", f = "ResponseCache.kt", l = {HProv.ALG_SID_SHA3_256}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ResponseCache$warmUp$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.ybsdk.core.common.data.cache.ResponseCache$warmUp$1$1", f = "ResponseCache.kt", l = {HProv.ALG_SID_SHA3_384, HProv.PP_BIO_STATISTICA_LEN}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.core.common.data.cache.ResponseCache$warmUp$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(19:0|1|(1:(1:(9:5|6|7|8|9|10|(3:12|(1:14)|15)(1:37)|16|(10:18|19|20|(1:31)(1:24)|(1:26)(1:27)|9|10|(0)(0)|16|(1:36)(0))(0))(2:42|43))(1:44))(12:113|114|115|(1:117)(1:148)|(1:119)(5:131|132|133|134|(1:144)(3:138|(2:141|139)|142))|120|(1:122)|123|(1:125)|126|(1:128)|129)|45|46|47|(13:50|51|52|(4:55|(3:57|58|59)(1:61)|60|53)|62|63|64|65|66|67|(6:72|73|74|(1:76)(12:(2:80|81)(3:95|96|97)|82|83|84|(1:86)(1:94)|87|(1:89)|90|(1:92)|93|16|(0)(0))|77|78)(2:69|70)|71|48)|108|109|84|(0)(0)|87|(0)|90|(0)|93|16|(0)(0)|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:111:0x02b4, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:112:0x02b5, code lost:
        
            r23 = r2;
            r13 = r10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:130:0x0127, code lost:
        
            if (r9 == r3) goto L116;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x038c, code lost:
        
            if (com.ybsdk.core.common.data.cache.b.a(r5, r0, r36) == r3) goto L116;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x038e, code lost:
        
            return r3;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:122:0x010a  */
        /* JADX WARN: Removed duplicated region for block: B:125:0x0119  */
        /* JADX WARN: Removed duplicated region for block: B:128:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x039c  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x02f5  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x03d3 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x03cf  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x02a9  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0265 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:86:0x02c8  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x02d9  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x02de  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x02d4  */
        /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.Result$Failure] */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v10 */
        /* JADX WARN: Type inference failed for: r4v11, types: [java.util.LinkedHashMap, java.util.Map] */
        /* JADX WARN: Type inference failed for: r4v12 */
        /* JADX WARN: Type inference failed for: r7v22, types: [java.util.LinkedHashMap, java.util.Map] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0333 -> B:9:0x038f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x038c -> B:9:0x038f). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i;
            ?? failure;
            Throwable a;
            boolean z;
            Map map;
            Map map2;
            lrp0 lrp0Var;
            int i2;
            Result.Failure failure2;
            Throwable a2;
            Object obj2;
            boolean z2;
            Map map3;
            b bVar;
            b bVar2;
            Iterator it;
            Object failure3;
            Throwable a3;
            List singletonList;
            String name;
            boolean isEmpty;
            String X;
            Object failure4;
            lrp0 lrp0Var2 = lrp0.z;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.label;
            zy11 zy11Var = zy11.a;
            int i4 = 1;
            if (i3 == 0) {
                kotlin.b.b(obj);
                b bVar3 = this.this$0;
                r0 r0Var = bVar3.i;
                m mVar = bVar3.h;
                mVar.getClass();
                try {
                    String e = g3r.e((File) mVar.f);
                    if (evu0.J(e)) {
                        e = null;
                    }
                    if (e == null) {
                        failure = 0;
                        i = 0;
                    } else {
                        uvj0 uvj0Var = (uvj0) mVar.c;
                        i = 0;
                        try {
                            byte[] c = g3r.c((File) mVar.e);
                            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                            cipher.init(2, uvj0Var.b(), new GCMParameterSpec(128, Base64.decode(e, 1)));
                            String q = cvu0.q(cipher.doFinal(c));
                            if (evu0.J(q) || (map2 = (Map) ((Moshi) mVar.a).adapter((ParameterizedType) mVar.i).fromJson(q)) == null) {
                                failure = 0;
                            } else {
                                failure = new LinkedHashMap(gw00.d(map2.size()));
                                for (Object obj3 : map2.entrySet()) {
                                    failure.put(((Map.Entry) obj3).getKey(), StoredDataEntry.copy$default((StoredDataEntry) ((Map.Entry) obj3).getValue(), 0L, 0L, null, null, true, 15, null));
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            failure = new Result.Failure(th);
                            a = Result.a(failure);
                            if (a != null) {
                            }
                            z = failure instanceof Result.Failure;
                            Map map4 = failure;
                            if (z) {
                            }
                            map = map4;
                            if (map == null) {
                            }
                            this.label = 1;
                            r0Var.emit(map, this);
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    i = 0;
                }
                a = Result.a(failure);
                if (a != null) {
                    x4c.g("Failed to get common data from persistent storage", a, null, Collections.singletonList(lrp0Var2), 4);
                }
                z = failure instanceof Result.Failure;
                Map map42 = failure;
                if (z) {
                    map42 = null;
                }
                map = map42;
                if (map == null) {
                    map = kotlin.collections.b.f();
                }
                this.label = 1;
                r0Var.emit(map, this);
            } else if (i3 == 1) {
                kotlin.b.b(obj);
                i = 0;
            } else {
                if (i3 != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Map.Entry entry = (Map.Entry) this.L$4;
                it = (Iterator) this.L$3;
                bVar = (b) this.L$2;
                bVar2 = (b) this.L$1;
                map3 = (Map) this.L$0;
                try {
                    kotlin.b.b(obj);
                    i2 = 1;
                } catch (Throwable th3) {
                    i2 = 1;
                    failure4 = new Result.Failure(th3);
                }
                failure4 = zy11Var;
                Throwable a4 = Result.a(failure4);
                if (a4 == null) {
                    e5z0 e5z0Var = i5z0.a;
                    e5z0Var.m("ResponseCache");
                    e5z0Var.c(a4, "Failed to perform action during map traversal", new Object[0]);
                    String valueOf = String.valueOf(entry.getKey());
                    String message = a4.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    bVar2.d.m0.a.a("tech.insta_cache.warm_up.file.loading_error", x4e.t(2, "name", valueOf, "error", message));
                }
                if (!it.hasNext()) {
                    entry = (Map.Entry) it.next();
                    try {
                    } catch (Throwable th4) {
                        failure4 = new Result.Failure(th4);
                    }
                    vvj0 vvj0Var = (vvj0) entry.getKey();
                    StoredLayoutInfo storedLayoutInfo = (StoredLayoutInfo) entry.getValue();
                    if (((storedLayoutInfo.getLifeExpectancyMs() <= System.currentTimeMillis() || storedLayoutInfo.getVersion() != ((mlg) ((wvj0) bVar.c.get(vvj0Var.a))).a.s().b) ? 0 : i2) != 0) {
                        bVar.j.put(vvj0Var.b, bVar.e(vvj0Var, storedLayoutInfo));
                        e5z0 e5z0Var2 = i5z0.a;
                        e5z0Var2.m("ResponseCache");
                        e5z0Var2.a("Cache loading success for " + vvj0Var, new Object[0]);
                    } else {
                        e5z0 e5z0Var3 = i5z0.a;
                        e5z0Var3.m("ResponseCache");
                        e5z0Var3.a("Cache loading fail for " + vvj0Var, new Object[0]);
                        String str = vvj0Var.b;
                        this.L$0 = map3;
                        this.L$1 = bVar2;
                        this.L$2 = bVar;
                        this.L$3 = it;
                        this.L$4 = entry;
                        this.label = 2;
                    }
                    failure4 = zy11Var;
                    Throwable a42 = Result.a(failure4);
                    if (a42 == null) {
                    }
                    if (!it.hasNext()) {
                        return zy11Var;
                    }
                }
            }
            m mVar2 = this.this$0.h;
            mVar2.getClass();
            t5r g = kotlin.sequences.b.g(h3r.i((File) mVar2.g, FileWalkDirection.TOP_DOWN), new dzm(29, mVar2));
            ?? linkedHashMap = new LinkedHashMap();
            s5r s5rVar = new s5r(g);
            while (s5rVar.hasNext()) {
                File file = (File) s5rVar.next();
                try {
                    String e2 = g3r.e(new File((File) mVar2.h, file.getName() + "_meta"));
                    char[] cArr = new char[i4];
                    cArr[i] = '\n';
                    List Y = evu0.Y(e2, cArr, i, 6);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : Y) {
                        if (!evu0.J((String) obj4)) {
                            arrayList.add(obj4);
                        }
                    }
                    String str2 = (String) arrayList.get(0);
                    byte[] c2 = g3r.c(file);
                    long a5 = s630.a();
                    uvj0 uvj0Var2 = (uvj0) mVar2.c;
                    Cipher cipher2 = Cipher.getInstance("AES/GCM/NoPadding");
                    lrp0Var = lrp0Var2;
                    try {
                        cipher2.init(2, uvj0Var2.b(), new GCMParameterSpec(128, Base64.decode(str2, i4)));
                        String q2 = cvu0.q(cipher2.doFinal(c2));
                        ((awa0) mVar2.d).a(e3n.e(f8z0.a(a5)), "Insta.Security.Decrypt");
                        StoredLayoutInfo storedLayoutInfo2 = (StoredLayoutInfo) ((JsonAdapter) ((i3y) mVar2.j).getValue()).fromJson((String) arrayList.get(1));
                        String str3 = (String) arrayList.get(2);
                        Pair pair = new Pair(new vvj0(str3, file.getName()), StoredLayoutInfo.copy$default(storedLayoutInfo2, 0L, 0L, null, true, 0, ((mlg) ((wvj0) ((LinkedHashMap) mVar2.b).get(str3))).b.fromJson(q2), 23, null));
                        failure3 = linkedHashMap.put(pair.c(), pair.f());
                    } catch (Throwable th5) {
                        th = th5;
                        failure3 = new Result.Failure(th);
                        a3 = Result.a(failure3);
                        if (a3 == null) {
                        }
                        i4 = i2;
                        lrp0Var2 = lrp0Var;
                        i = 0;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    lrp0Var = lrp0Var2;
                }
                a3 = Result.a(failure3);
                if (a3 == null) {
                    try {
                        singletonList = Collections.singletonList(lrp0Var);
                        name = file.getName();
                        isEmpty = singletonList.isEmpty();
                        i2 = 1;
                    } catch (Throwable th7) {
                        th = th7;
                        i2 = 1;
                    }
                    if (isEmpty) {
                        X = null;
                    } else {
                        if (isEmpty) {
                            throw new NoWhenBranchMatchedException();
                        }
                        try {
                            X = kotlin.collections.a.X(singletonList, "", null, null, new dsg(16), 30);
                        } catch (Throwable th8) {
                            th = th8;
                        }
                        th = th8;
                        failure2 = new Result.Failure(th);
                        a2 = Result.a(failure2);
                        if (a2 == null) {
                            obj2 = null;
                            x4c.g("Failed to get all responses from persistent storage", a2, null, Collections.singletonList(lrp0Var), 4);
                        } else {
                            obj2 = null;
                        }
                        z2 = failure2 instanceof Result.Failure;
                        Object obj5 = failure2;
                        if (z2) {
                            obj5 = obj2;
                        }
                        map3 = (Map) obj5;
                        if (map3 == null) {
                            map3 = kotlin.collections.b.f();
                        }
                        bVar = this.this$0;
                        bVar2 = bVar;
                        it = map3.entrySet().iterator();
                        if (!it.hasNext()) {
                        }
                    }
                    trp0 trp0Var = trp0.a;
                    trp0.e(new jqp0(a3, "Failed to read response from cache", name, X));
                } else {
                    i2 = 1;
                }
                i4 = i2;
                lrp0Var2 = lrp0Var;
                i = 0;
            }
            lrp0Var = lrp0Var2;
            i2 = i4;
            failure2 = linkedHashMap;
            a2 = Result.a(failure2);
            if (a2 == null) {
            }
            z2 = failure2 instanceof Result.Failure;
            Object obj52 = failure2;
            if (z2) {
            }
            map3 = (Map) obj52;
            if (map3 == null) {
            }
            bVar = this.this$0;
            bVar2 = bVar;
            it = map3.entrySet().iterator();
            if (!it.hasNext()) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResponseCache$warmUp$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ResponseCache$warmUp$1 responseCache$warmUp$1 = new ResponseCache$warmUp$1(this.this$0, continuation);
        responseCache$warmUp$1.L$0 = obj;
        return responseCache$warmUp$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ResponseCache$warmUp$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tse tseVar = (tse) this.L$0;
            b bVar = this.this$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(bVar, null);
            this.label = 1;
            if (bVar.f(tseVar, "Failed to load cache from persistent storage", null, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            ((Result) obj).getClass();
        }
        return zy11.a;
    }
}
