package xsna;

import androidx.room.ObservedTableStates;
import androidx.room.RoomDatabase;
import androidx.room.Transactor;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.SetBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: InvalidationTracker.kt */
/* loaded from: classes.dex */
public final class sqp0 {
    public static final String[] l = {"INSERT", SignalingProtocol.KEY_ROOMS_EVENT_TYPE_UPDATE, "DELETE"};
    public final RoomDatabase a;
    public final HashMap b;
    public final HashMap c;
    public final boolean d;
    public final vpx e;
    public final String[] g;
    public final ObservedTableStates h;
    public final dr70 i;
    public final AtomicBoolean j = new AtomicBoolean(false);
    public gzs<Boolean> k = new aq0(10);
    public final LinkedHashMap f = new LinkedHashMap();

    /* compiled from: InvalidationTracker.kt */
    public static final class a {
    }

    /* compiled from: InvalidationTracker.kt */
    @b6l(c = "androidx.room.TriggerBasedInvalidationTracker$refreshInvalidationAsync$3", f = "InvalidationTracker.kt", l = {389}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ gzs<s3q0> $onRefreshCompleted;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(gzs<s3q0> gzsVar, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$onRefreshCompleted = gzsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return sqp0.this.new b(this.$onRefreshCompleted, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.a.a(obj);
                    sqp0 sqp0Var = sqp0.this;
                    this.label = 1;
                    obj = sqp0.b(sqp0Var, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                this.$onRefreshCompleted.invoke();
                return s3q0.a;
            } catch (Throwable th) {
                this.$onRefreshCompleted.invoke();
                throw th;
            }
        }
    }

    public sqp0(RoomDatabase roomDatabase, HashMap hashMap, HashMap hashMap2, String[] strArr, boolean z, vpx vpxVar) {
        this.a = roomDatabase;
        this.b = hashMap;
        this.c = hashMap2;
        this.d = z;
        this.e = vpxVar;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.ROOT;
            String lowerCase = str.toLowerCase(locale);
            this.f.put(lowerCase, Integer.valueOf(i));
            String str2 = (String) this.b.get(strArr[i]);
            String lowerCase2 = str2 != null ? str2.toLowerCase(locale) : null;
            if (lowerCase2 != null) {
                lowerCase = lowerCase2;
            }
            strArr2[i] = lowerCase;
        }
        this.g = strArr2;
        for (Map.Entry entry : this.b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = str3.toLowerCase(locale2);
            if (this.f.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                LinkedHashMap linkedHashMap = this.f;
                linkedHashMap.put(lowerCase4, pn00.h(lowerCase3, linkedHashMap));
            }
        }
        this.h = new ObservedTableStates(this.g.length);
        this.i = new dr70(this.g.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (r4 == r6) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(sqp0 sqp0Var, nvb0 nvb0Var, ContinuationImpl continuationImpl) {
        tqp0 tqp0Var;
        int i;
        Set set;
        sqp0Var.getClass();
        if (continuationImpl instanceof tqp0) {
            tqp0Var = (tqp0) continuationImpl;
            int i2 = tqp0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tqp0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = tqp0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tqp0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    lh20 lh20Var = new lh20(1);
                    tqp0Var.L$0 = nvb0Var;
                    tqp0Var.label = 1;
                    obj = nvb0Var.b("SELECT * FROM room_table_modification_log WHERE invalidated = 1", lh20Var, tqp0Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Set set2 = (Set) tqp0Var.L$0;
                        kotlin.a.a(obj);
                        return set2;
                    }
                    nvb0Var = (nvb0) tqp0Var.L$0;
                    kotlin.a.a(obj);
                }
                set = (Set) obj;
                if (!set.isEmpty()) {
                    tqp0Var.L$0 = set;
                    tqp0Var.label = 2;
                    if (androidx.room.q.a(nvb0Var, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", tqp0Var) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return set;
            }
        }
        tqp0Var = new tqp0(sqp0Var, continuationImpl);
        Object obj2 = tqp0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tqp0Var.label;
        if (i != 0) {
        }
        set = (Set) obj2;
        if (!set.isEmpty()) {
        }
        return set;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0092 A[Catch: all -> 0x005a, TryCatch #1 {all -> 0x005a, blocks: (B:13:0x0087, B:15:0x0092, B:18:0x00c8, B:19:0x009e, B:20:0x00a0, B:22:0x00ad, B:24:0x00b7, B:26:0x00bd, B:27:0x00bb, B:30:0x00c2, B:48:0x004c, B:50:0x0054, B:53:0x0060, B:55:0x006e, B:58:0x0074), top: B:47:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(sqp0 sqp0Var, ContinuationImpl continuationImpl) {
        vqp0 vqp0Var;
        int i;
        jvf jvfVar;
        Throwable th;
        jvf jvfVar2;
        Object x;
        Set<? extends Integer> set;
        Object value;
        int[] iArr;
        RoomDatabase roomDatabase = sqp0Var.a;
        if (continuationImpl instanceof vqp0) {
            vqp0Var = (vqp0) continuationImpl;
            int i2 = vqp0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vqp0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = vqp0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = vqp0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    jvfVar = roomDatabase.h;
                    if (!jvfVar.a()) {
                        return EmptySet.b;
                    }
                    try {
                        if (!sqp0Var.j.compareAndSet(true, false)) {
                            EmptySet emptySet = EmptySet.b;
                            jvfVar.b();
                            return emptySet;
                        }
                        if (!sqp0Var.k.invoke().booleanValue()) {
                            EmptySet emptySet2 = EmptySet.b;
                            jvfVar.b();
                            return emptySet2;
                        }
                        androidx.room.r rVar = new androidx.room.r(sqp0Var, null);
                        vqp0Var.L$0 = sqp0Var;
                        vqp0Var.L$1 = jvfVar;
                        vqp0Var.label = 1;
                        x = roomDatabase.x(false, rVar, vqp0Var);
                        if (x == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        jvfVar2 = jvfVar;
                        jvfVar2.b();
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jvfVar2 = (jvf) vqp0Var.L$1;
                    sqp0 sqp0Var2 = (sqp0) vqp0Var.L$0;
                    try {
                        kotlin.a.a(obj);
                        jvfVar = jvfVar2;
                        sqp0Var = sqp0Var2;
                        x = obj;
                    } catch (Throwable th3) {
                        th = th3;
                        jvfVar2.b();
                        throw th;
                    }
                }
                set = (Set) x;
                if (!set.isEmpty()) {
                    dr70 dr70Var = sqp0Var.i;
                    dr70Var.getClass();
                    if (!set.isEmpty()) {
                        utk0 utk0Var = dr70Var.a;
                        do {
                            value = utk0Var.getValue();
                            int[] iArr2 = (int[]) value;
                            int length = iArr2.length;
                            iArr = new int[length];
                            for (int i3 = 0; i3 < length; i3++) {
                                iArr[i3] = set.contains(Integer.valueOf(i3)) ? iArr2[i3] + 1 : iArr2[i3];
                            }
                        } while (!utk0Var.compareAndSet(value, iArr));
                    }
                    sqp0Var.e.invoke(set);
                }
                jvfVar.b();
                return set;
            }
        }
        vqp0Var = new vqp0(sqp0Var, continuationImpl);
        Object obj2 = vqp0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = vqp0Var.label;
        if (i != 0) {
        }
        set = (Set) x;
        if (!set.isEmpty()) {
        }
        jvfVar.b();
        return set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00eb, code lost:
    
        if (androidx.room.q.a(r10, r3, r4) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ed, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008b, code lost:
    
        if (androidx.room.q.a(r1, r3, r4) == r5) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00eb -> B:11:0x00ee). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(sqp0 sqp0Var, Transactor transactor, int i, ContinuationImpl continuationImpl) {
        wqp0 wqp0Var;
        int i2;
        String[] strArr;
        sqp0 sqp0Var2;
        int i3;
        nvb0 nvb0Var;
        int i4;
        String str;
        sqp0 sqp0Var3 = sqp0Var;
        nvb0 nvb0Var2 = transactor;
        int i5 = i;
        sqp0Var3.getClass();
        if (continuationImpl instanceof wqp0) {
            wqp0Var = (wqp0) continuationImpl;
            int i6 = wqp0Var.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                wqp0Var.label = i6 - Integer.MIN_VALUE;
                Object obj = wqp0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = wqp0Var.label;
                boolean z = true;
                if (i2 != 0) {
                    kotlin.a.a(obj);
                    String str2 = "INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i5 + ", 0)";
                    wqp0Var.L$0 = sqp0Var3;
                    wqp0Var.L$1 = nvb0Var2;
                    wqp0Var.I$0 = i5;
                    wqp0Var.label = 1;
                } else if (i2 == 1) {
                    int i7 = wqp0Var.I$0;
                    nvb0Var2 = (nvb0) wqp0Var.L$1;
                    sqp0 sqp0Var4 = (sqp0) wqp0Var.L$0;
                    kotlin.a.a(obj);
                    i5 = i7;
                    sqp0Var3 = sqp0Var4;
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i3 = wqp0Var.I$2;
                    i4 = wqp0Var.I$1;
                    i5 = wqp0Var.I$0;
                    strArr = (String[]) wqp0Var.L$3;
                    str = (String) wqp0Var.L$2;
                    nvb0Var = (nvb0) wqp0Var.L$1;
                    sqp0Var2 = (sqp0) wqp0Var.L$0;
                    kotlin.a.a(obj);
                    boolean z2 = true;
                    i4++;
                    z = z2;
                    if (i4 >= i3) {
                        return s3q0.a;
                    }
                    String str3 = strArr[i4];
                    z2 = z;
                    StringBuilder a2 = xe9.a("CREATE ", sqp0Var2.d ? "TEMP" : "", " TRIGGER IF NOT EXISTS `", "room_table_modification_trigger_" + str + '_' + str3, "` AFTER ");
                    n6j.b(a2, str3, " ON `", str, "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ");
                    String c = h5s.c(i5, " AND invalidated = 0; END", a2);
                    wqp0Var.L$0 = sqp0Var2;
                    wqp0Var.L$1 = nvb0Var;
                    wqp0Var.L$2 = str;
                    wqp0Var.L$3 = strArr;
                    wqp0Var.I$0 = i5;
                    wqp0Var.I$1 = i4;
                    wqp0Var.I$2 = i3;
                    wqp0Var.label = 2;
                }
                String str4 = sqp0Var3.g[i5];
                strArr = l;
                sqp0Var2 = sqp0Var3;
                i3 = 3;
                nvb0Var = nvb0Var2;
                i4 = 0;
                str = str4;
                if (i4 >= i3) {
                }
            }
        }
        wqp0Var = new wqp0(sqp0Var3, continuationImpl);
        Object obj2 = wqp0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = wqp0Var.label;
        boolean z3 = true;
        if (i2 != 0) {
        }
        String str42 = sqp0Var3.g[i5];
        strArr = l;
        sqp0Var2 = sqp0Var3;
        i3 = 3;
        nvb0Var = nvb0Var2;
        i4 = 0;
        str = str42;
        if (i4 >= i3) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r4v5, types: [xsna.nvb0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0088 -> B:10:0x008b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(sqp0 sqp0Var, Transactor transactor, int i, ContinuationImpl continuationImpl) {
        xqp0 xqp0Var;
        int i2;
        String str;
        int i3;
        Transactor transactor2;
        int i4;
        String[] strArr;
        sqp0Var.getClass();
        if (continuationImpl instanceof xqp0) {
            xqp0Var = (xqp0) continuationImpl;
            int i5 = xqp0Var.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                xqp0Var.label = i5 - Integer.MIN_VALUE;
                Object obj = xqp0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = xqp0Var.label;
                if (i2 != 0) {
                    kotlin.a.a(obj);
                    str = sqp0Var.g[i];
                    i3 = 3;
                    transactor2 = transactor;
                    i4 = 0;
                    strArr = l;
                    if (i4 < i3) {
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i3 = xqp0Var.I$1;
                    i4 = xqp0Var.I$0;
                    String[] strArr2 = (String[]) xqp0Var.L$2;
                    str = (String) xqp0Var.L$1;
                    ?? r4 = (nvb0) xqp0Var.L$0;
                    kotlin.a.a(obj);
                    strArr = strArr2;
                    transactor2 = r4;
                    i4++;
                    if (i4 < i3) {
                        String b2 = air.b('`', "DROP TRIGGER IF EXISTS `", "room_table_modification_trigger_" + str + '_' + strArr[i4]);
                        xqp0Var.L$0 = transactor2;
                        xqp0Var.L$1 = str;
                        xqp0Var.L$2 = strArr;
                        xqp0Var.I$0 = i4;
                        xqp0Var.I$1 = i3;
                        xqp0Var.label = 1;
                        if (androidx.room.q.a(transactor2, b2, xqp0Var) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        i4++;
                        if (i4 < i3) {
                            return s3q0.a;
                        }
                    }
                }
            }
        }
        xqp0Var = new xqp0(sqp0Var, continuationImpl);
        Object obj2 = xqp0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = xqp0Var.label;
        if (i2 != 0) {
        }
    }

    public final void e(gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2) {
        if (this.j.compareAndSet(false, true)) {
            gzsVar.invoke();
            hpj hpjVar = this.a.b;
            if (hpjVar == null) {
                hpjVar = null;
            }
            myc0.h(hpjVar, new vvj("Room Invalidation Tracker Refresh"), null, new b(gzsVar2, null), 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ContinuationImpl continuationImpl) {
        yqp0 yqp0Var;
        int i;
        jvf jvfVar;
        if (continuationImpl instanceof yqp0) {
            yqp0Var = (yqp0) continuationImpl;
            int i2 = yqp0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yqp0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = yqp0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = yqp0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    RoomDatabase roomDatabase = this.a;
                    jvf jvfVar2 = roomDatabase.h;
                    if (jvfVar2.a()) {
                        try {
                            androidx.room.s sVar = new androidx.room.s(this, null);
                            yqp0Var.L$0 = jvfVar2;
                            yqp0Var.label = 1;
                            if (roomDatabase.x(false, sVar, yqp0Var) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            jvfVar = jvfVar2;
                        } catch (Throwable th) {
                            th = th;
                            jvfVar = jvfVar2;
                            jvfVar.b();
                            throw th;
                        }
                    }
                    return s3q0.a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jvfVar = (jvf) yqp0Var.L$0;
                try {
                    kotlin.a.a(obj);
                } catch (Throwable th2) {
                    th = th2;
                    jvfVar.b();
                    throw th;
                }
                jvfVar.b();
                return s3q0.a;
            }
        }
        yqp0Var = new yqp0(this, continuationImpl);
        Object obj2 = yqp0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = yqp0Var.label;
        if (i != 0) {
        }
        jvfVar.b();
        return s3q0.a;
    }

    public final Pair<String[], int[]> g(String[] strArr) {
        SetBuilder setBuilder = new SetBuilder();
        for (String str : strArr) {
            Set set = (Set) this.c.get(str.toLowerCase(Locale.ROOT));
            if (set != null) {
                setBuilder.addAll(set);
            } else {
                setBuilder.add(str);
            }
        }
        String[] strArr2 = (String[]) setBuilder.d().toArray(new String[0]);
        int length = strArr2.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr2[i];
            Integer num = (Integer) this.f.get(str2.toLowerCase(Locale.ROOT));
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name ".concat(str2));
            }
            iArr[i] = num.intValue();
        }
        return new Pair<>(strArr2, iArr);
    }
}
