package ru.rustore.sdk.pushclient.k;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.vk.push.common.AppInfo;
import com.vk.push.common.Logger;
import com.vk.push.common.analytics.AnalyticsSender;
import com.vk.push.core.data.source.PackageManagerDataSource;
import com.vk.push.core.network.data.source.MasterHostApi;
import com.vk.push.core.utils.ResultExtensionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.rustore.sdk.pushclient.m.i;
import ru.rustore.sdk.pushclient.m.j;
import ru.rustore.sdk.pushclient.m.k;
import xsna.apy0;
import xsna.b6l;
import xsna.bay;
import xsna.c5g;
import xsna.epx;
import xsna.j5g;
import xsna.ms9;
import xsna.niy0;
import xsna.oq;
import xsna.s3q0;
import xsna.ui50;
import xsna.utb;
import xsna.wi50;
import xsna.x9y0;

/* loaded from: classes9.dex */
public final class b {
    public final PackageManagerDataSource a;
    public final utb b;
    public final niy0 c;
    public final MasterHostApi d;
    public final apy0 e;
    public final i f;
    public final AnalyticsSender g;
    public final Logger h;
    public final wi50 i = bay.a();
    public volatile AppInfo j;

    public static abstract class a extends Throwable {

        /* renamed from: ru.rustore.sdk.pushclient.k.b$a$a, reason: collision with other inner class name */
        public static final class C2403a extends a {
            public static final C2403a c = new C2403a();
        }

        /* renamed from: ru.rustore.sdk.pushclient.k.b$a$b, reason: collision with other inner class name */
        public static final class C2404b extends a {
            public final List<String> a;

            public C2404b(List<String> list) {
                this.a = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2404b) && epx.f(this.a, ((C2404b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            @Override // java.lang.Throwable
            public final String toString() {
                return ms9.a(')', new StringBuilder("NoHostsFromApiReceived(installedHosts="), this.a);
            }
        }

        public static final class c extends a {
            public final String a;
            public final List<String> b;

            public c(String str, ArrayList arrayList) {
                this.a = str;
                this.b = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            @Override // java.lang.Throwable
            public final String toString() {
                StringBuilder sb = new StringBuilder("NoMasterInHostsList(master=");
                sb.append(this.a);
                sb.append(", installedHosts=");
                return ms9.a(')', sb, this.b);
            }
        }

        public static final class d extends a {
            public static final d c = new d();
        }

        public static final class e extends a {
            public final String a;
            public final Throwable b;

            public e(String str, Throwable th) {
                this.a = str;
                this.b = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                Throwable th = this.b;
                return hashCode + (th == null ? 0 : th.hashCode());
            }

            @Override // java.lang.Throwable
            public final String toString() {
                StringBuilder sb = new StringBuilder("NoResponseFromArbiter(arbiter=");
                sb.append(this.a);
                sb.append(", exception=");
                return oq.c(sb, this.b, ')');
            }
        }
    }

    @b6l(c = "ru.rustore.sdk.pushclient.internal.data.repository.ArbiterRepository", f = "ArbiterRepository.kt", l = {172, 120}, m = "clear")
    /* renamed from: ru.rustore.sdk.pushclient.k.b$b, reason: collision with other inner class name */
    public final class C2405b extends ContinuationImpl {
        public Object a;
        public ui50 b;
        public /* synthetic */ Object c;
        public int e;

        public C2405b(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return b.this.d(this);
        }
    }

    @b6l(c = "ru.rustore.sdk.pushclient.internal.data.repository.ArbiterRepository", f = "ArbiterRepository.kt", l = {125}, m = "getHostList")
    public final class c extends ContinuationImpl {
        public b a;
        public /* synthetic */ Object b;
        public int d;

        public c(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return b.this.c(null, this);
        }
    }

    @b6l(c = "ru.rustore.sdk.pushclient.internal.data.repository.ArbiterRepository", f = "ArbiterRepository.kt", l = {33}, m = "getMasterHost")
    public final class d extends ContinuationImpl {
        public b a;
        public /* synthetic */ Object b;
        public int d;

        public d(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return b.this.e(this);
        }
    }

    @b6l(c = "ru.rustore.sdk.pushclient.internal.data.repository.ArbiterRepository", f = "ArbiterRepository.kt", l = {172, 46, 47, 55, 66, TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER, 84, 112}, m = "getMasterHostInternal")
    public final class e extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public AppInfo d;
        public /* synthetic */ Object e;
        public int g;

        public e(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            return b.this.f(this);
        }
    }

    @b6l(c = "ru.rustore.sdk.pushclient.internal.data.repository.ArbiterRepository", f = "ArbiterRepository.kt", l = {134}, m = "saveMasterHost")
    public final class f extends ContinuationImpl {
        public b a;
        public AppInfo b;
        public boolean c;
        public /* synthetic */ Object d;
        public int f;

        public f(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return b.this.b(null, false, this);
        }
    }

    public b(PackageManagerDataSource packageManagerDataSource, utb utbVar, niy0 niy0Var, MasterHostApi masterHostApi, apy0 apy0Var, i iVar, AnalyticsSender analyticsSender, Logger logger) {
        this.a = packageManagerDataSource;
        this.b = utbVar;
        this.c = niy0Var;
        this.d = masterHostApi;
        this.e = apy0Var;
        this.f = iVar;
        this.g = analyticsSender;
        this.h = logger.createLogger(this);
    }

    public final AppInfo a(a aVar) {
        this.g.send(new ru.rustore.sdk.pushclient.c.b(new Result.Failure(aVar)));
        return (AppInfo) ((k) this.b.c).invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(AppInfo appInfo, boolean z, ContinuationImpl continuationImpl) {
        f fVar;
        Object obj;
        int i;
        b bVar;
        if (continuationImpl instanceof f) {
            fVar = (f) continuationImpl;
            int i2 = fVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.f = i2 - Integer.MIN_VALUE;
                obj = fVar.d;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fVar.f;
                if (i != 0) {
                    kotlin.a.a(obj);
                    fVar.a = this;
                    fVar.b = appInfo;
                    fVar.c = z;
                    fVar.f = 1;
                    obj = this.c.a.write(new niy0.a(appInfo.getPackageName(), appInfo.getPubKey()), fVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    bVar = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = fVar.c;
                    appInfo = fVar.b;
                    bVar = fVar.a;
                    kotlin.a.a(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    bVar.g.send(new ru.rustore.sdk.pushclient.c.b(new Result.Failure(a.C2403a.c)));
                } else {
                    bVar.g.send(new ru.rustore.sdk.pushclient.c.b(new x9y0(appInfo.getPackageName(), z)));
                }
                return s3q0.a;
            }
        }
        fVar = new f(continuationImpl);
        obj = fVar.d;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fVar.f;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return s3q0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(List list, ContinuationImpl continuationImpl) {
        c cVar;
        int i;
        Object m105getHostListgIAlus;
        b bVar;
        Throwable a2;
        if (continuationImpl instanceof c) {
            cVar = (c) continuationImpl;
            int i2 = cVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.d = i2 - Integer.MIN_VALUE;
                Object obj = cVar.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cVar.d;
                if (i != 0) {
                    kotlin.a.a(obj);
                    cVar.a = this;
                    cVar.d = 1;
                    m105getHostListgIAlus = this.d.m105getHostListgIAlus(list, cVar);
                    if (m105getHostListgIAlus == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    bVar = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = cVar.a;
                    kotlin.a.a(obj);
                    m105getHostListgIAlus = ((Result) obj).d();
                }
                a2 = Result.a(m105getHostListgIAlus);
                if (a2 != null) {
                    return m105getHostListgIAlus;
                }
                bVar.h.warn("Unable to get host list. Will be used empty host list", a2);
                return EmptyList.b;
            }
        }
        cVar = new c(continuationImpl);
        Object obj2 = cVar.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cVar.d;
        if (i != 0) {
        }
        a2 = Result.a(m105getHostListgIAlus);
        if (a2 != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v3, types: [xsna.ui50] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        C2405b c2405b;
        CoroutineSingletons coroutineSingletons;
        int i;
        wi50 wi50Var;
        b bVar;
        ui50 ui50Var;
        Throwable th;
        niy0 niy0Var;
        try {
            if (continuationImpl instanceof C2405b) {
                c2405b = (C2405b) continuationImpl;
                int i2 = c2405b.e;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c2405b.e = i2 - Integer.MIN_VALUE;
                    Object obj = c2405b.c;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = c2405b.e;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        c2405b.a = this;
                        wi50Var = this.i;
                        c2405b.b = wi50Var;
                        c2405b.e = 1;
                        if (wi50Var.b(c2405b) != coroutineSingletons) {
                            bVar = this;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ui50Var = (ui50) c2405b.a;
                        try {
                            kotlin.a.a(obj);
                            s3q0 s3q0Var = s3q0.a;
                            ui50Var.c(null);
                            return s3q0Var;
                        } catch (Throwable th2) {
                            th = th2;
                            ui50Var.c(null);
                            throw th;
                        }
                    }
                    ?? r2 = c2405b.b;
                    bVar = (b) c2405b.a;
                    kotlin.a.a(obj);
                    wi50Var = r2;
                    niy0Var = bVar.c;
                    c2405b.a = wi50Var;
                    c2405b.b = null;
                    c2405b.e = 2;
                    if (niy0Var.b(c2405b) != coroutineSingletons) {
                        ui50Var = wi50Var;
                        s3q0 s3q0Var2 = s3q0.a;
                        ui50Var.c(null);
                        return s3q0Var2;
                    }
                    return coroutineSingletons;
                }
            }
            niy0Var = bVar.c;
            c2405b.a = wi50Var;
            c2405b.b = null;
            c2405b.e = 2;
            if (niy0Var.b(c2405b) != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            ui50Var = wi50Var;
            th = th3;
            ui50Var.c(null);
            throw th;
        }
        c2405b = new C2405b(continuationImpl);
        Object obj2 = c2405b.c;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = c2405b.e;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        d dVar;
        int i;
        b bVar;
        if (continuationImpl instanceof d) {
            dVar = (d) continuationImpl;
            int i2 = dVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.d = i2 - Integer.MIN_VALUE;
                Object obj = dVar.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dVar.d;
                if (i != 0) {
                    kotlin.a.a(obj);
                    dVar.a = this;
                    dVar.d = 1;
                    obj = f(dVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    bVar = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = dVar.a;
                    kotlin.a.a(obj);
                }
                bVar.j = (AppInfo) obj;
                return obj;
            }
        }
        dVar = new d(continuationImpl);
        Object obj2 = dVar.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dVar.d;
        if (i != 0) {
        }
        bVar.j = (AppInfo) obj2;
        return obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x0119, code lost:
    
        if (r13.invoke(r0) == r1) goto L141;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0147 A[Catch: all -> 0x02bf, TRY_ENTER, TryCatch #8 {all -> 0x02bf, blocks: (B:31:0x0227, B:50:0x0280, B:55:0x0291, B:100:0x01d9, B:110:0x0088, B:111:0x013f, B:115:0x0147, B:117:0x0153, B:120:0x0164), top: B:109:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x011f A[Catch: all -> 0x009e, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x009e, blocks: (B:126:0x0099, B:128:0x011f, B:131:0x012a), top: B:125:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x012a A[Catch: all -> 0x009e, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x009e, blocks: (B:126:0x0099, B:128:0x011f, B:131:0x012a), top: B:125:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x010a A[Catch: all -> 0x007d, TRY_LEAVE, TryCatch #6 {all -> 0x007d, blocks: (B:81:0x0074, B:138:0x00ae, B:139:0x0102, B:141:0x010a), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01ef A[Catch: all -> 0x020b, TRY_LEAVE, TryCatch #3 {all -> 0x020b, blocks: (B:21:0x01e9, B:23:0x01ef, B:27:0x020f, B:28:0x0214, B:30:0x021a, B:32:0x022a, B:35:0x0232, B:36:0x0236, B:38:0x023c, B:42:0x024f, B:44:0x0254, B:45:0x026a, B:47:0x0270, B:49:0x027e, B:51:0x0283, B:54:0x028b, B:57:0x0295, B:66:0x02a5), top: B:20:0x01e9, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x020f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0180 A[Catch: all -> 0x018d, TRY_LEAVE, TryCatch #5 {all -> 0x018d, blocks: (B:84:0x0178, B:86:0x0180, B:89:0x0191, B:91:0x0197, B:94:0x01b5, B:96:0x01bd, B:99:0x01d1, B:102:0x01dc), top: B:83:0x0178 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0191 A[Catch: all -> 0x018d, TRY_ENTER, TryCatch #5 {all -> 0x018d, blocks: (B:84:0x0178, B:86:0x0180, B:89:0x0191, B:91:0x0197, B:94:0x01b5, B:96:0x01bd, B:99:0x01d1, B:102:0x01dc), top: B:83:0x0178 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.Object, xsna.wi50] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v14, types: [xsna.ui50] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v25, types: [xsna.ui50] */
    /* JADX WARN: Type inference failed for: r2v3, types: [xsna.ui50] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, xsna.ui50] */
    /* JADX WARN: Type inference failed for: r6v13, types: [xsna.ui50] */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ContinuationImpl continuationImpl) {
        e eVar;
        ?? r2;
        b bVar;
        e eVar2;
        AppInfo appInfo;
        Object a2;
        Object obj;
        ?? r6;
        ui50 ui50Var;
        b bVar2;
        AppInfo appInfo2;
        b bVar3;
        List<String> list;
        ui50 ui50Var2;
        List list2;
        AppInfo appInfo3;
        List list3;
        Object obj2;
        AppInfo appInfo4;
        ui50 ui50Var3;
        ui50 ui50Var4;
        ui50 ui50Var5;
        AppInfo appInfo5;
        ui50 ui50Var6;
        AppInfo appInfo6;
        try {
            try {
                if (continuationImpl instanceof e) {
                    eVar = (e) continuationImpl;
                    int i = eVar.g;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        eVar.g = i - Integer.MIN_VALUE;
                        Object obj3 = eVar.e;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        switch (eVar.g) {
                            case 0:
                                kotlin.a.a(obj3);
                                eVar.a = this;
                                ?? r13 = this.i;
                                eVar.b = r13;
                                eVar.g = 1;
                                if (r13.b(eVar) != coroutineSingletons) {
                                    bVar = this;
                                    eVar2 = r13;
                                    try {
                                        Logger.DefaultImpls.info$default(bVar.h, "getMasterHost started", null, 2, null);
                                        appInfo = (AppInfo) j5g.a0(((j) bVar.b.b).invoke());
                                        niy0 niy0Var = bVar.c;
                                        eVar.a = bVar;
                                        eVar.b = eVar2;
                                        eVar.c = appInfo;
                                        eVar.g = 2;
                                        a2 = niy0Var.a(appInfo, eVar);
                                        if (a2 != coroutineSingletons) {
                                            obj = eVar2;
                                            obj3 = a2;
                                            r6 = obj;
                                            if (((Boolean) obj3).booleanValue()) {
                                                i iVar = bVar.f;
                                                eVar.a = bVar;
                                                eVar.b = obj;
                                                eVar.c = appInfo;
                                                eVar.g = 3;
                                                r6 = obj;
                                                break;
                                            }
                                            if (appInfo != null) {
                                                Logger.DefaultImpls.warn$default(bVar.h, "Default host is not null", null, 2, null);
                                                r6.c(null);
                                                return appInfo;
                                            }
                                            niy0 niy0Var2 = bVar.c;
                                            eVar.a = bVar;
                                            eVar.b = r6;
                                            eVar.c = null;
                                            eVar.g = 4;
                                            obj3 = niy0Var2.c(eVar);
                                            if (obj3 != coroutineSingletons) {
                                                ui50Var = r6;
                                                bVar2 = bVar;
                                                appInfo2 = (AppInfo) obj3;
                                                if (appInfo2 == null) {
                                                    ui50Var.c(null);
                                                    return appInfo2;
                                                }
                                                List<String> initializedHostPackages = bVar2.a.getInitializedHostPackages();
                                                if (initializedHostPackages.isEmpty()) {
                                                    Logger.DefaultImpls.warn$default(bVar2.h, "Empty packages list", null, 2, null);
                                                    AppInfo a3 = bVar2.a(a.d.c);
                                                    ui50Var.c(null);
                                                    return a3;
                                                }
                                                eVar.a = bVar2;
                                                eVar.b = ui50Var;
                                                eVar.c = initializedHostPackages;
                                                eVar.g = 5;
                                                Object c2 = bVar2.c(initializedHostPackages, eVar);
                                                if (c2 != coroutineSingletons) {
                                                    bVar3 = bVar2;
                                                    list = initializedHostPackages;
                                                    obj3 = c2;
                                                    ui50Var2 = ui50Var;
                                                    try {
                                                        list2 = (List) obj3;
                                                        if (!list2.isEmpty()) {
                                                            AppInfo a4 = bVar3.a(new a.C2404b(list));
                                                            ui50Var2.c(null);
                                                            return a4;
                                                        }
                                                        if (list2.size() == 1) {
                                                            AppInfo appInfo7 = (AppInfo) j5g.Y(list2);
                                                            eVar.a = ui50Var2;
                                                            eVar.b = appInfo7;
                                                            eVar.c = null;
                                                            eVar.g = 6;
                                                            if (bVar3.b(appInfo7, false, eVar) != coroutineSingletons) {
                                                                appInfo4 = appInfo7;
                                                                ui50Var3 = ui50Var2;
                                                                ui50Var3.c(null);
                                                                return appInfo4;
                                                            }
                                                        } else {
                                                            appInfo3 = (AppInfo) j5g.a0(list2);
                                                            if (appInfo3 == null) {
                                                                Logger.DefaultImpls.warn$default(bVar3.h, "Unable to get arbiter", null, 2, null);
                                                                AppInfo a5 = bVar3.a(new a.C2404b(list));
                                                                ui50Var2.c(null);
                                                                return a5;
                                                            }
                                                            apy0 apy0Var = bVar3.e;
                                                            eVar.a = bVar3;
                                                            eVar.b = ui50Var2;
                                                            eVar.c = list2;
                                                            eVar.d = appInfo3;
                                                            eVar.g = 7;
                                                            Object a6 = apy0Var.a(appInfo3, eVar);
                                                            if (a6 != coroutineSingletons) {
                                                                list3 = list2;
                                                                obj2 = a6;
                                                                ui50Var5 = ui50Var2;
                                                                try {
                                                                    if (ResultExtensionsKt.isValid(obj2)) {
                                                                        Logger.DefaultImpls.warn$default(bVar3.h, "Unable to get valid master from arbiter", null, 2, null);
                                                                        AppInfo a7 = bVar3.a(new a.e(appInfo3.getPackageName(), Result.a(obj2)));
                                                                        ui50Var5.c(null);
                                                                        return a7;
                                                                    }
                                                                    try {
                                                                        kotlin.a.a(obj2);
                                                                        String str = (String) obj2;
                                                                        if (str.length() == 0) {
                                                                            Logger.DefaultImpls.error$default(bVar3.h, "Master package is empty", null, 2, null);
                                                                            AppInfo a8 = bVar3.a(new a.e(appInfo3.getPackageName(), null));
                                                                            ui50Var5.c(null);
                                                                            return a8;
                                                                        }
                                                                        Iterator it = list3.iterator();
                                                                        while (true) {
                                                                            if (it.hasNext()) {
                                                                                ?? next = it.next();
                                                                                if (epx.f(((AppInfo) next).getPackageName(), str)) {
                                                                                    appInfo5 = next;
                                                                                }
                                                                            } else {
                                                                                appInfo5 = null;
                                                                            }
                                                                        }
                                                                        AppInfo appInfo8 = appInfo5;
                                                                        if (appInfo8 == null) {
                                                                            Logger.DefaultImpls.error$default(bVar3.h, "Master host is empty", null, 2, null);
                                                                            ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
                                                                            Iterator it2 = list3.iterator();
                                                                            while (it2.hasNext()) {
                                                                                arrayList.add(((AppInfo) it2.next()).getPackageName());
                                                                            }
                                                                            AppInfo a9 = bVar3.a(new a.c(str, arrayList));
                                                                            ui50Var5.c(null);
                                                                            return a9;
                                                                        }
                                                                        eVar.a = ui50Var5;
                                                                        eVar.b = appInfo8;
                                                                        eVar.c = null;
                                                                        eVar.d = null;
                                                                        eVar.g = 8;
                                                                        if (bVar3.b(appInfo8, true, eVar) != coroutineSingletons) {
                                                                            ui50Var6 = ui50Var5;
                                                                            appInfo6 = appInfo8;
                                                                            ui50Var6.c(null);
                                                                            return appInfo6;
                                                                        }
                                                                    } catch (Exception e2) {
                                                                        bVar3.h.error("Unable to get master from arbiter", e2);
                                                                        AppInfo a10 = bVar3.a(new a.e(appInfo3.getPackageName(), e2));
                                                                        ui50Var5.c(null);
                                                                        return a10;
                                                                    }
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    ui50Var4 = ui50Var5;
                                                                    r2 = ui50Var4;
                                                                    r2.c(null);
                                                                    throw th;
                                                                }
                                                            }
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        ui50 ui50Var7 = ui50Var2;
                                                        r2 = ui50Var7;
                                                        r2.c(null);
                                                        throw th;
                                                    }
                                                }
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        eVar = eVar2;
                                        th = th3;
                                        r2 = eVar;
                                        r2.c(null);
                                        throw th;
                                    }
                                }
                                return coroutineSingletons;
                            case 1:
                                ?? r22 = (ui50) eVar.b;
                                b bVar4 = (b) eVar.a;
                                kotlin.a.a(obj3);
                                eVar2 = r22;
                                bVar = bVar4;
                                Logger.DefaultImpls.info$default(bVar.h, "getMasterHost started", null, 2, null);
                                appInfo = (AppInfo) j5g.a0(((j) bVar.b.b).invoke());
                                niy0 niy0Var3 = bVar.c;
                                eVar.a = bVar;
                                eVar.b = eVar2;
                                eVar.c = appInfo;
                                eVar.g = 2;
                                a2 = niy0Var3.a(appInfo, eVar);
                                if (a2 != coroutineSingletons) {
                                }
                                return coroutineSingletons;
                            case 2:
                                appInfo = (AppInfo) eVar.c;
                                Object obj4 = (ui50) eVar.b;
                                bVar = (b) eVar.a;
                                kotlin.a.a(obj3);
                                obj = obj4;
                                r6 = obj;
                                if (((Boolean) obj3).booleanValue()) {
                                }
                                if (appInfo != null) {
                                }
                                break;
                            case 3:
                                appInfo = (AppInfo) eVar.c;
                                ?? r62 = (ui50) eVar.b;
                                bVar = (b) eVar.a;
                                try {
                                    kotlin.a.a(obj3);
                                    r6 = r62;
                                    if (appInfo != null) {
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    eVar = r62;
                                    r2 = eVar;
                                    r2.c(null);
                                    throw th;
                                }
                                break;
                            case 4:
                                r2 = (ui50) eVar.b;
                                bVar2 = (b) eVar.a;
                                try {
                                    kotlin.a.a(obj3);
                                    ui50Var = r2;
                                    appInfo2 = (AppInfo) obj3;
                                    if (appInfo2 == null) {
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    r2.c(null);
                                    throw th;
                                }
                                break;
                            case 5:
                                List<String> list4 = (List) eVar.c;
                                ui50 ui50Var8 = (ui50) eVar.b;
                                b bVar5 = (b) eVar.a;
                                kotlin.a.a(obj3);
                                list = list4;
                                ui50Var2 = ui50Var8;
                                bVar3 = bVar5;
                                list2 = (List) obj3;
                                if (!list2.isEmpty()) {
                                }
                                break;
                            case 6:
                                appInfo4 = (AppInfo) eVar.b;
                                ui50Var3 = (ui50) eVar.a;
                                kotlin.a.a(obj3);
                                ui50Var3.c(null);
                                return appInfo4;
                            case 7:
                                AppInfo appInfo9 = eVar.d;
                                list3 = (List) eVar.c;
                                ui50Var4 = (ui50) eVar.b;
                                bVar3 = (b) eVar.a;
                                try {
                                    kotlin.a.a(obj3);
                                    obj2 = ((Result) obj3).d();
                                    appInfo3 = appInfo9;
                                    ui50Var5 = ui50Var4;
                                    if (ResultExtensionsKt.isValid(obj2)) {
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    r2 = ui50Var4;
                                    r2.c(null);
                                    throw th;
                                }
                                break;
                            case 8:
                                appInfo6 = (AppInfo) eVar.b;
                                ui50Var6 = (ui50) eVar.a;
                                kotlin.a.a(obj3);
                                ui50Var6.c(null);
                                return appInfo6;
                            default:
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                }
                switch (eVar.g) {
                }
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Throwable th8) {
            th = th8;
        }
        eVar = new e(continuationImpl);
        Object obj32 = eVar.e;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
    }
}
