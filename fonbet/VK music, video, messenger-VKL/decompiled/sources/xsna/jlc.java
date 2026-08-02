package xsna;

import com.vk.push.common.Logger;
import com.vk.push.common.analytics.AnalyticsSender;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ClientAppRepository.kt */
/* loaded from: classes5.dex */
public final class jlc {
    public final g790 a;
    public final ske0 b;
    public final don0 c;
    public final fje0 d;
    public final AnalyticsSender e;
    public final Logger f;
    public final wi50 g = bay.a();
    public final ConcurrentHashMap<String, Boolean> h = new ConcurrentHashMap<>();

    public jlc(g790 g790Var, ske0 ske0Var, don0 don0Var, fje0 fje0Var, AnalyticsSender analyticsSender, Logger logger) {
        this.a = g790Var;
        this.b = ske0Var;
        this.c = don0Var;
        this.d = fje0Var;
        this.e = analyticsSender;
        this.f = logger.createLogger("ClientAppRepository");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0130, code lost:
    
        if (r8.d(r3, r0) == r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x011c, code lost:
    
        if (r8.d(r3, r0) != r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ea, code lost:
    
        if (r8 == r1) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bd A[Catch: all -> 0x00c3, TRY_LEAVE, TryCatch #0 {all -> 0x00c3, blocks: (B:35:0x00ad, B:37:0x00bd, B:40:0x00c6), top: B:34:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c6 A[Catch: all -> 0x00c3, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00c3, blocks: (B:35:0x00ad, B:37:0x00bd, B:40:0x00c6), top: B:34:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r7v5, types: [xsna.ui50] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        ilc ilcVar;
        wi50 wi50Var;
        jlc jlcVar;
        Boolean bool;
        Boolean bool2;
        jlc jlcVar2;
        String str2;
        String str3;
        int intValue;
        String str4;
        String str5;
        jlc jlcVar3;
        if (continuationImpl instanceof ilc) {
            ilcVar = (ilc) continuationImpl;
            int i = ilcVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ilcVar.label = i - Integer.MIN_VALUE;
                Object obj = ilcVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (ilcVar.label) {
                    case 0:
                        kotlin.a.a(obj);
                        ilcVar.L$0 = this;
                        ilcVar.L$1 = str;
                        wi50Var = this.g;
                        ilcVar.L$2 = wi50Var;
                        ilcVar.label = 1;
                        if (wi50Var.b(ilcVar) != coroutineSingletons) {
                            jlcVar = this;
                            try {
                                bool = jlcVar.h.get(str);
                                bool2 = Boolean.TRUE;
                                if (!epx.f(bool, bool2)) {
                                    return s3q0.a;
                                }
                                jlcVar.h.put(str, bool2);
                                s3q0 s3q0Var = s3q0.a;
                                wi50Var.c(null);
                                Logger.DefaultImpls.info$default(jlcVar.f, go9.b("Stop deliver requests to ", str), null, 2, null);
                                ske0 ske0Var = jlcVar.b;
                                ilcVar.L$0 = jlcVar;
                                ilcVar.L$1 = str;
                                ilcVar.L$2 = null;
                                ilcVar.label = 2;
                                obj = ske0Var.g(str, ilcVar);
                                break;
                            } finally {
                                wi50Var.c(null);
                            }
                        }
                        return coroutineSingletons;
                    case 1:
                        ?? r7 = (ui50) ilcVar.L$2;
                        String str6 = (String) ilcVar.L$1;
                        jlc jlcVar4 = (jlc) ilcVar.L$0;
                        kotlin.a.a(obj);
                        wi50Var = r7;
                        str = str6;
                        jlcVar = jlcVar4;
                        bool = jlcVar.h.get(str);
                        bool2 = Boolean.TRUE;
                        if (!epx.f(bool, bool2)) {
                        }
                        break;
                    case 2:
                        str = (String) ilcVar.L$1;
                        jlcVar = (jlc) ilcVar.L$0;
                        kotlin.a.a(obj);
                        String str7 = (String) obj;
                        fje0 fje0Var = jlcVar.d;
                        ilcVar.L$0 = jlcVar;
                        ilcVar.L$1 = str;
                        ilcVar.L$2 = str7;
                        ilcVar.label = 3;
                        Object b = fje0Var.b(str, ilcVar);
                        if (b != coroutineSingletons) {
                            jlcVar2 = jlcVar;
                            str2 = str7;
                            obj = b;
                            str3 = str;
                            intValue = ((Number) obj).intValue();
                            ske0 ske0Var2 = jlcVar2.b;
                            ilcVar.L$0 = jlcVar2;
                            ilcVar.L$1 = str3;
                            ilcVar.L$2 = str2;
                            ilcVar.I$0 = intValue;
                            ilcVar.label = 4;
                            break;
                        }
                        return coroutineSingletons;
                    case 3:
                        String str8 = (String) ilcVar.L$2;
                        String str9 = (String) ilcVar.L$1;
                        jlc jlcVar5 = (jlc) ilcVar.L$0;
                        kotlin.a.a(obj);
                        jlcVar2 = jlcVar5;
                        str3 = str9;
                        str2 = str8;
                        intValue = ((Number) obj).intValue();
                        ske0 ske0Var22 = jlcVar2.b;
                        ilcVar.L$0 = jlcVar2;
                        ilcVar.L$1 = str3;
                        ilcVar.L$2 = str2;
                        ilcVar.I$0 = intValue;
                        ilcVar.label = 4;
                        break;
                    case 4:
                        intValue = ilcVar.I$0;
                        str2 = (String) ilcVar.L$2;
                        str3 = (String) ilcVar.L$1;
                        jlcVar2 = (jlc) ilcVar.L$0;
                        kotlin.a.a(obj);
                        g790 g790Var = jlcVar2.a;
                        ilcVar.L$0 = jlcVar2;
                        ilcVar.L$1 = str3;
                        ilcVar.L$2 = str2;
                        ilcVar.I$0 = intValue;
                        ilcVar.label = 5;
                        break;
                    case 5:
                        intValue = ilcVar.I$0;
                        str2 = (String) ilcVar.L$2;
                        str3 = (String) ilcVar.L$1;
                        jlcVar2 = (jlc) ilcVar.L$0;
                        kotlin.a.a(obj);
                        if (str2 == null) {
                            return s3q0.a;
                        }
                        don0 don0Var = jlcVar2.c;
                        ilcVar.L$0 = jlcVar2;
                        ilcVar.L$1 = str3;
                        ilcVar.L$2 = str2;
                        ilcVar.I$0 = intValue;
                        ilcVar.label = 6;
                        if (don0Var.a(str2, ilcVar) != coroutineSingletons) {
                            str4 = str2;
                            str5 = str3;
                            jlcVar3 = jlcVar2;
                            jlcVar3.e.send(new hlc(str5, intValue, str4));
                            jlcVar3.h.remove(str5);
                            return s3q0.a;
                        }
                        return coroutineSingletons;
                    case 6:
                        intValue = ilcVar.I$0;
                        str4 = (String) ilcVar.L$2;
                        str5 = (String) ilcVar.L$1;
                        jlcVar3 = (jlc) ilcVar.L$0;
                        kotlin.a.a(obj);
                        jlcVar3.e.send(new hlc(str5, intValue, str4));
                        jlcVar3.h.remove(str5);
                        return s3q0.a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        ilcVar = new ilc(this, continuationImpl);
        Object obj2 = ilcVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (ilcVar.label) {
        }
    }
}
