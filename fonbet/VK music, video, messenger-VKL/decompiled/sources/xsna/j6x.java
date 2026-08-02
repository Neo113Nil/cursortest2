package xsna;

import com.google.android.gms.tasks.Task;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: InstallationId.kt */
/* loaded from: classes.dex */
public final class j6x {
    public static final a c = new a();
    public final String a;
    public final String b;

    /* compiled from: InstallationId.kt */
    public static final class a {
        /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:(6:11|12|13|14|15|16)(2:19|20))(2:21|22))(3:29|30|(2:32|27))|23|24|25))|35|6|7|(0)(0)|23|24|25) */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
        
            if (r9 != r1) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x005c, code lost:
        
            r9 = r8;
            r8 = "";
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
        /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, xsna.uir] */
        /* JADX WARN: Type inference failed for: r8v1 */
        /* JADX WARN: Type inference failed for: r8v14 */
        /* JADX WARN: Type inference failed for: r8v15 */
        /* JADX WARN: Type inference failed for: r8v16 */
        /* JADX WARN: Type inference failed for: r8v17 */
        /* JADX WARN: Type inference failed for: r8v3 */
        /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r8v6 */
        /* JADX WARN: Type inference failed for: r8v7 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object a(uir uirVar, ContinuationImpl continuationImpl) {
            i6x i6xVar;
            int i;
            if (continuationImpl instanceof i6x) {
                i6xVar = (i6x) continuationImpl;
                int i2 = i6xVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    i6xVar.label = i2 - Integer.MIN_VALUE;
                    Object obj = i6xVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = i6xVar.label;
                    String str = "";
                    if (i != 0) {
                        kotlin.a.a(obj);
                        Task token = uirVar.getToken();
                        i6xVar.L$0 = uirVar;
                        i6xVar.label = 1;
                        obj = whn0.b(token, i6xVar);
                        uirVar = uirVar;
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            String str2 = (String) i6xVar.L$0;
                            kotlin.a.a(obj);
                            uirVar = str2;
                            str = (String) obj;
                            return new j6x(str, uirVar);
                        }
                        uir uirVar2 = (uir) i6xVar.L$0;
                        kotlin.a.a(obj);
                        uirVar = uirVar2;
                    }
                    String b = ((k6x) obj).b();
                    uir uirVar3 = uirVar;
                    String str3 = b;
                    Task<String> id = uirVar3.getId();
                    i6xVar.L$0 = str3;
                    i6xVar.label = 2;
                    obj = whn0.b(id, i6xVar);
                    uirVar = str3;
                }
            }
            i6xVar = new i6x(this, continuationImpl);
            Object obj2 = i6xVar.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = i6xVar.label;
            String str4 = "";
            if (i != 0) {
            }
            String b2 = ((k6x) obj2).b();
            uir uirVar32 = uirVar;
            String str32 = b2;
            Task<String> id2 = uirVar32.getId();
            i6xVar.L$0 = str32;
            i6xVar.label = 2;
            obj2 = whn0.b(id2, i6xVar);
            uirVar = str32;
        }
    }

    public j6x(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
