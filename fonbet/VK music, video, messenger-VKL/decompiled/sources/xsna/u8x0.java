package xsna;

import android.content.Context;
import android.os.PowerManager;
import com.vk.push.core.feature.CommonFeaturesKt;
import com.vk.push.core.feature.Feature;
import com.vk.push.core.feature.FeatureManager;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: WakeLockHolder.kt */
/* loaded from: classes5.dex */
public final class u8x0 {
    public static final long f;
    public static final long g;
    public static final /* synthetic */ int h = 0;
    public final Context a;
    public final FeatureManager b;
    public volatile PowerManager.WakeLock c;
    public volatile Boolean d;
    public final wi50 e = bay.a();

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f = timeUnit.toMillis(40L);
        g = timeUnit.toMillis(10L);
    }

    public u8x0(Context context, FeatureManager featureManager) {
        this.a = context;
        this.b = featureManager;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:(5:11|12|(1:14)|16|17)(2:19|20))(1:21))(3:30|(1:32)|29)|22|(2:24|25)(2:26|27)))|34|6|7|(0)(0)|22|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
    
        if (r6 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        o8x0 o8x0Var;
        Object obj;
        int i;
        u8x0 u8x0Var;
        if (continuationImpl instanceof o8x0) {
            o8x0Var = (o8x0) continuationImpl;
            int i2 = o8x0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o8x0Var.label = i2 - Integer.MIN_VALUE;
                obj = o8x0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = o8x0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    o8x0Var.L$0 = this;
                    o8x0Var.label = 1;
                    obj = c(o8x0Var);
                    if (obj != coroutineSingletons) {
                        u8x0Var = this;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) obj;
                    if (wakeLock != null) {
                        wakeLock.acquire(f);
                        s3q0 s3q0Var = s3q0.a;
                    }
                    return s3q0.a;
                }
                u8x0Var = (u8x0) o8x0Var.L$0;
                kotlin.a.a(obj);
                if (((Boolean) obj).booleanValue()) {
                    return s3q0.a;
                }
                o8x0Var.L$0 = null;
                o8x0Var.label = 2;
                obj = u8x0Var.b(o8x0Var);
            }
        }
        o8x0Var = new o8x0(this, continuationImpl);
        obj = o8x0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = o8x0Var.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0054 A[Catch: all -> 0x006d, TRY_LEAVE, TryCatch #0 {all -> 0x006d, blocks: (B:12:0x0050, B:14:0x0054, B:22:0x006f), top: B:11:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        p8x0 p8x0Var;
        int i;
        u8x0 u8x0Var;
        ui50 ui50Var;
        PowerManager.WakeLock newWakeLock;
        try {
            if (continuationImpl instanceof p8x0) {
                p8x0Var = (p8x0) continuationImpl;
                int i2 = p8x0Var.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    p8x0Var.label = i2 - Integer.MIN_VALUE;
                    Object obj = p8x0Var.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = p8x0Var.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        PowerManager.WakeLock wakeLock = this.c;
                        if (wakeLock != null) {
                            return wakeLock;
                        }
                        wi50 wi50Var = this.e;
                        p8x0Var.L$0 = this;
                        p8x0Var.L$1 = wi50Var;
                        p8x0Var.label = 1;
                        if (wi50Var.b(p8x0Var) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        u8x0Var = this;
                        ui50Var = wi50Var;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ui50Var = (ui50) p8x0Var.L$1;
                        u8x0Var = (u8x0) p8x0Var.L$0;
                        kotlin.a.a(obj);
                    }
                    if (u8x0Var.c == null) {
                        PowerManager powerManager = (PowerManager) u8x0Var.a.getSystemService(PowerManager.class);
                        if (powerManager != null) {
                            try {
                                newWakeLock = powerManager.newWakeLock(1, "Vkpns:push_deliver_wake_lock");
                            } catch (Throwable unused) {
                            }
                        } else {
                            newWakeLock = null;
                        }
                        u8x0Var.c = newWakeLock;
                        s3q0 s3q0Var = s3q0.a;
                    }
                    return u8x0Var.c;
                }
            }
            if (u8x0Var.c == null) {
            }
            return u8x0Var.c;
        } finally {
            ui50Var.c(null);
        }
        p8x0Var = new p8x0(this, continuationImpl);
        Object obj2 = p8x0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = p8x0Var.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067 A[Catch: all -> 0x006d, TryCatch #1 {all -> 0x006d, blocks: (B:26:0x0063, B:28:0x0067, B:29:0x0071), top: B:25:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071 A[Catch: all -> 0x006d, TRY_LEAVE, TryCatch #1 {all -> 0x006d, blocks: (B:26:0x0063, B:28:0x0067, B:29:0x0071), top: B:25:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v6, types: [xsna.ui50] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        q8x0 q8x0Var;
        int i;
        wi50 wi50Var;
        u8x0 u8x0Var;
        ui50 ui50Var;
        Throwable th;
        Boolean bool;
        u8x0 u8x0Var2;
        boolean booleanValue;
        try {
            if (continuationImpl instanceof q8x0) {
                q8x0Var = (q8x0) continuationImpl;
                int i2 = q8x0Var.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    q8x0Var.label = i2 - Integer.MIN_VALUE;
                    Object obj = q8x0Var.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = q8x0Var.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        Boolean bool2 = this.d;
                        if (bool2 != null) {
                            return bool2;
                        }
                        wi50Var = this.e;
                        q8x0Var.L$0 = this;
                        q8x0Var.L$1 = wi50Var;
                        q8x0Var.label = 1;
                        if (wi50Var.b(q8x0Var) != coroutineSingletons) {
                            u8x0Var = this;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ui50Var = (ui50) q8x0Var.L$1;
                        u8x0Var2 = (u8x0) q8x0Var.L$0;
                        try {
                            kotlin.a.a(obj);
                            Boolean bool3 = (Boolean) obj;
                            boolean booleanValue2 = bool3.booleanValue();
                            u8x0Var2.d = bool3;
                            booleanValue = booleanValue2;
                            Boolean valueOf = Boolean.valueOf(booleanValue);
                            ui50Var.c(null);
                            return valueOf;
                        } catch (Throwable th2) {
                            th = th2;
                            ui50Var.c(null);
                            throw th;
                        }
                    }
                    ?? r2 = (ui50) q8x0Var.L$1;
                    u8x0Var = (u8x0) q8x0Var.L$0;
                    kotlin.a.a(obj);
                    wi50Var = r2;
                    bool = u8x0Var.d;
                    if (bool == null) {
                        booleanValue = bool.booleanValue();
                        ui50Var = wi50Var;
                        Boolean valueOf2 = Boolean.valueOf(booleanValue);
                        ui50Var.c(null);
                        return valueOf2;
                    }
                    FeatureManager featureManager = u8x0Var.b;
                    Feature.BooleanFeature isWakeLocksEnabled = CommonFeaturesKt.isWakeLocksEnabled();
                    q8x0Var.L$0 = u8x0Var;
                    q8x0Var.L$1 = wi50Var;
                    q8x0Var.label = 2;
                    Object featureValue = featureManager.getFeatureValue(isWakeLocksEnabled, q8x0Var);
                    if (featureValue != coroutineSingletons) {
                        ui50Var = wi50Var;
                        obj = featureValue;
                        u8x0Var2 = u8x0Var;
                        Boolean bool32 = (Boolean) obj;
                        boolean booleanValue22 = bool32.booleanValue();
                        u8x0Var2.d = bool32;
                        booleanValue = booleanValue22;
                        Boolean valueOf22 = Boolean.valueOf(booleanValue);
                        ui50Var.c(null);
                        return valueOf22;
                    }
                    return coroutineSingletons;
                }
            }
            bool = u8x0Var.d;
            if (bool == null) {
            }
        } catch (Throwable th3) {
            ui50Var = wi50Var;
            th = th3;
            ui50Var.c(null);
            throw th;
        }
        q8x0Var = new q8x0(this, continuationImpl);
        Object obj2 = q8x0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = q8x0Var.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:(5:11|12|(1:14)|16|17)(2:19|20))(1:21))(3:30|(1:32)|29)|22|(2:24|25)(2:26|27)))|34|6|7|(0)(0)|22|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
    
        if (r6 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        r8x0 r8x0Var;
        Object obj;
        int i;
        u8x0 u8x0Var;
        if (continuationImpl instanceof r8x0) {
            r8x0Var = (r8x0) continuationImpl;
            int i2 = r8x0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r8x0Var.label = i2 - Integer.MIN_VALUE;
                obj = r8x0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = r8x0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    r8x0Var.L$0 = this;
                    r8x0Var.label = 1;
                    obj = c(r8x0Var);
                    if (obj != coroutineSingletons) {
                        u8x0Var = this;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) obj;
                    if (wakeLock != null) {
                        wakeLock.release();
                        s3q0 s3q0Var = s3q0.a;
                    }
                    return s3q0.a;
                }
                u8x0Var = (u8x0) r8x0Var.L$0;
                kotlin.a.a(obj);
                if (((Boolean) obj).booleanValue()) {
                    return s3q0.a;
                }
                r8x0Var.L$0 = null;
                r8x0Var.label = 2;
                obj = u8x0Var.b(r8x0Var);
            }
        }
        r8x0Var = new r8x0(this, continuationImpl);
        obj = r8x0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = r8x0Var.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (xsna.zvj.d(r6, r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        s8x0 s8x0Var;
        Object obj;
        int i;
        u8x0 u8x0Var;
        if (continuationImpl instanceof s8x0) {
            s8x0Var = (s8x0) continuationImpl;
            int i2 = s8x0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s8x0Var.label = i2 - Integer.MIN_VALUE;
                obj = s8x0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = s8x0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    s8x0Var.L$0 = this;
                    s8x0Var.label = 1;
                    obj = c(s8x0Var);
                    if (obj != coroutineSingletons) {
                        u8x0Var = this;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return s3q0.a;
                }
                u8x0Var = (u8x0) s8x0Var.L$0;
                kotlin.a.a(obj);
                if (((Boolean) obj).booleanValue()) {
                    return s3q0.a;
                }
                t8x0 t8x0Var = new t8x0(u8x0Var, null);
                s8x0Var.L$0 = null;
                s8x0Var.label = 2;
            }
        }
        s8x0Var = new s8x0(this, continuationImpl);
        obj = s8x0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = s8x0Var.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }
}
