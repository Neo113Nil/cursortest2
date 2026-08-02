package xsna;

import com.vk.push.core.feature.CommonFeaturesKt;
import com.vk.push.core.feature.Feature;
import com.vk.push.core.feature.FeatureManager;
import com.vk.push.core.filedatastore.FileDataSource;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.rustore.sdk.pushclient.t.a$d;
import ru.rustore.sdk.pushclient.t.a$e;
import ru.rustore.sdk.pushclient.t.a$f;

/* loaded from: classes9.dex */
public final class hay0 {
    public final FeatureManager a;
    public final FileDataSource b;
    public volatile a c;
    public final wi50 d = bay.a();

    public static final class a {
        public static final C2982a d = new C2982a();
        public static final a e = new a(false, false, EmptyList.b);
        public final boolean a;
        public final boolean b;
        public final List<String> c;

        /* renamed from: xsna.hay0$a$a, reason: collision with other inner class name */
        public static final class C2982a {
            public static Object a(String str) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    boolean z = jSONObject.getBoolean("is_enabled");
                    boolean z2 = jSONObject.getBoolean("is_force");
                    JSONArray jSONArray = jSONObject.getJSONArray("package_names");
                    ListBuilder e = e43.e();
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        e.add(jSONArray.getString(i));
                    }
                    return new a(z, z2, e.g());
                } catch (Throwable th) {
                    return new Result.Failure(th);
                }
            }
        }

        public a(boolean z, boolean z2, List<String> list) {
            this.a = z;
            this.b = z2;
            this.c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && epx.f(this.c, aVar.c);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            boolean z = this.a;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int i2 = i * 31;
            boolean z2 = this.b;
            return this.c.hashCode() + ((i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ExternalMasterHostAnalyticsConfig(isEnabled=");
            sb.append(this.a);
            sb.append(", isForce=");
            sb.append(this.b);
            sb.append(", packageNames=");
            return ms9.a(')', sb, this.c);
        }
    }

    public hay0(FeatureManager featureManager, FileDataSource fileDataSource) {
        this.a = featureManager;
        this.b = fileDataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ru.rustore.sdk.pushclient.t.a$b a_b;
        int i;
        if (continuationImpl instanceof ru.rustore.sdk.pushclient.t.a$b) {
            a_b = (ru.rustore.sdk.pushclient.t.a$b) continuationImpl;
            int i2 = a_b.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a_b.c = i2 - Integer.MIN_VALUE;
                Object obj = a_b.a;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = a_b.c;
                if (i != 0) {
                    kotlin.a.a(obj);
                    a_b.c = 1;
                    obj = d(a_b);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((a) obj).c;
            }
        }
        a_b = new ru.rustore.sdk.pushclient.t.a$b(this, continuationImpl);
        Object obj3 = a_b.a;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = a_b.c;
        if (i != 0) {
        }
        return ((a) obj3).c;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        ru.rustore.sdk.pushclient.t.a$c a_c;
        int i;
        if (continuationImpl instanceof ru.rustore.sdk.pushclient.t.a$c) {
            a_c = (ru.rustore.sdk.pushclient.t.a$c) continuationImpl;
            int i2 = a_c.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a_c.c = i2 - Integer.MIN_VALUE;
                Object obj = a_c.a;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = a_c.c;
                if (i != 0) {
                    kotlin.a.a(obj);
                    a_c.c = 1;
                    obj = d(a_c);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return Boolean.valueOf(((a) obj).a);
            }
        }
        a_c = new ru.rustore.sdk.pushclient.t.a$c(this, continuationImpl);
        Object obj3 = a_c.a;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = a_c.c;
        if (i != 0) {
        }
        return Boolean.valueOf(((a) obj3).a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006c, code lost:
    
        if (r8.m100setDatagIAlus(androidx.credentials.provider.CredentialEntry.FALSE_STRING, r0) == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
    
        if (r8 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        a$d a_d;
        Object obj;
        int i;
        hay0 hay0Var;
        Object m99getDataIoAF18A;
        if (continuationImpl instanceof a$d) {
            a_d = (a$d) continuationImpl;
            int i2 = a_d.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a_d.d = i2 - Integer.MIN_VALUE;
                obj = a_d.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = a_d.d;
                if (i != 0) {
                    kotlin.a.a(obj);
                    a_d.a = this;
                    a_d.d = 1;
                    obj = d(a_d);
                    if (obj != coroutineSingletons) {
                        hay0Var = this;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.a.a(obj);
                        ((Result) obj).getClass();
                        return Boolean.FALSE;
                    }
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    m99getDataIoAF18A = ((Result) obj).d();
                    String str = (String) (m99getDataIoAF18A instanceof Result.Failure ? null : m99getDataIoAF18A);
                    return Boolean.valueOf(str != null && Boolean.parseBoolean(str));
                }
                hay0Var = a_d.a;
                kotlin.a.a(obj);
                if (((a) obj).b) {
                    FileDataSource fileDataSource = hay0Var.b;
                    a_d.a = null;
                    a_d.d = 3;
                    m99getDataIoAF18A = fileDataSource.m99getDataIoAF18A(a_d);
                } else {
                    FileDataSource fileDataSource2 = hay0Var.b;
                    a_d.a = null;
                    a_d.d = 2;
                }
                return coroutineSingletons;
            }
        }
        a_d = new a$d(this, continuationImpl);
        obj = a_d.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = a_d.d;
        if (i != 0) {
        }
        if (((a) obj).b) {
        }
        return coroutineSingletons2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002d, B:13:0x0079, B:16:0x0089, B:24:0x005b, B:26:0x005f), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [xsna.ui50] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [xsna.ui50] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        a$e a_e;
        ?? r2;
        hay0 hay0Var;
        wi50 wi50Var;
        a aVar;
        a.C2982a c2982a;
        hay0 hay0Var2;
        wi50 wi50Var2;
        Object a2;
        try {
            if (continuationImpl instanceof a$e) {
                a_e = (a$e) continuationImpl;
                int i = a_e.f;
                if ((i & Integer.MIN_VALUE) != 0) {
                    a_e.f = i - Integer.MIN_VALUE;
                    Object obj = a_e.d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    r2 = a_e.f;
                    if (r2 != 0) {
                        kotlin.a.a(obj);
                        a aVar2 = this.c;
                        if (aVar2 != null) {
                            return aVar2;
                        }
                        wi50 wi50Var3 = this.d;
                        a_e.a = this;
                        a_e.b = wi50Var3;
                        a_e.f = 1;
                        if (wi50Var3.b(a_e) != coroutineSingletons) {
                            hay0Var = this;
                            wi50Var = wi50Var3;
                        }
                        return coroutineSingletons;
                    }
                    if (r2 != 1) {
                        if (r2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c2982a = a_e.c;
                        ui50 ui50Var = a_e.b;
                        hay0Var2 = a_e.a;
                        kotlin.a.a(obj);
                        r2 = ui50Var;
                        c2982a.getClass();
                        a2 = a.C2982a.a((String) obj);
                        a aVar3 = a.e;
                        if (a2 instanceof Result.Failure) {
                            a2 = aVar3;
                        }
                        hay0Var2.c = (a) a2;
                        aVar = (a) a2;
                        wi50Var2 = r2;
                        return aVar;
                    }
                    ?? r22 = a_e.b;
                    hay0Var = a_e.a;
                    kotlin.a.a(obj);
                    wi50Var = r22;
                    aVar = hay0Var.c;
                    wi50Var2 = wi50Var;
                    if (aVar == null) {
                        a.C2982a c2982a2 = a.d;
                        FeatureManager featureManager = hay0Var.a;
                        Feature.StringFeature externalMasterHostAnalyticsConfig = CommonFeaturesKt.getExternalMasterHostAnalyticsConfig();
                        a_e.a = hay0Var;
                        a_e.b = wi50Var;
                        a_e.c = c2982a2;
                        a_e.f = 2;
                        Object featureValue = featureManager.getFeatureValue(externalMasterHostAnalyticsConfig, a_e);
                        if (featureValue != coroutineSingletons) {
                            c2982a = c2982a2;
                            obj = featureValue;
                            hay0Var2 = hay0Var;
                            r2 = wi50Var;
                            c2982a.getClass();
                            a2 = a.C2982a.a((String) obj);
                            a aVar32 = a.e;
                            if (a2 instanceof Result.Failure) {
                            }
                            hay0Var2.c = (a) a2;
                            aVar = (a) a2;
                            wi50Var2 = r2;
                        }
                        return coroutineSingletons;
                    }
                    return aVar;
                }
            }
            if (r2 != 0) {
            }
            aVar = hay0Var.c;
            wi50Var2 = wi50Var;
            if (aVar == null) {
            }
            return aVar;
        } finally {
            r2.c(null);
        }
        a_e = new a$e(this, continuationImpl);
        Object obj2 = a_e.d;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        r2 = a_e.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        a$f a_f;
        int i;
        if (continuationImpl instanceof a$f) {
            a_f = (a$f) continuationImpl;
            int i2 = a_f.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a_f.c = i2 - Integer.MIN_VALUE;
                Object obj = a_f.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = a_f.c;
                if (i != 0) {
                    kotlin.a.a(obj);
                    a_f.c = 1;
                    if (this.b.m100setDatagIAlus("true", a_f) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    ((Result) obj).getClass();
                }
                return s3q0.a;
            }
        }
        a_f = new a$f(this, continuationImpl);
        Object obj2 = a_f.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = a_f.c;
        if (i != 0) {
        }
        return s3q0.a;
    }
}
