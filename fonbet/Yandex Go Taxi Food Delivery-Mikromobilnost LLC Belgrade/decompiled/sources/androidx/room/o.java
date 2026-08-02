package androidx.room;

import defpackage.b64;
import defpackage.ceu0;
import defpackage.d6e0;
import defpackage.d6z;
import defpackage.g8e;
import defpackage.ike;
import defpackage.k4c;
import defpackage.k801;
import defpackage.mg01;
import defpackage.nq60;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.pse;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.unr0;
import defpackage.zy11;
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
import kotlinx.coroutines.flow.r0;

/* loaded from: classes.dex */
public final class o {
    public static final String[] l = {"INSERT", "UPDATE", "DELETE"};
    public final RoomDatabase a;
    public final HashMap b;
    public final HashMap c;
    public final boolean d;
    public final tls e;
    public final String[] g;
    public final nq60 h;
    public final g i;
    public final AtomicBoolean j = new AtomicBoolean(false);
    public sls k = new k801(25);
    public final LinkedHashMap f = new LinkedHashMap();

    public o(RoomDatabase roomDatabase, HashMap hashMap, HashMap hashMap2, String[] strArr, boolean z, tls tlsVar) {
        this.a = roomDatabase;
        this.b = hashMap;
        this.c = hashMap2;
        this.d = z;
        this.e = tlsVar;
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
                linkedHashMap.put(lowerCase4, kotlin.collections.b.g(lowerCase3, linkedHashMap));
            }
        }
        this.h = new nq60(this.g.length);
        this.i = new g(this.g.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (r4 == r6) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(o oVar, d6e0 d6e0Var, ContinuationImpl continuationImpl) {
        TriggerBasedInvalidationTracker$checkInvalidatedTables$1 triggerBasedInvalidationTracker$checkInvalidatedTables$1;
        int i;
        Set set;
        oVar.getClass();
        if (continuationImpl instanceof TriggerBasedInvalidationTracker$checkInvalidatedTables$1) {
            triggerBasedInvalidationTracker$checkInvalidatedTables$1 = (TriggerBasedInvalidationTracker$checkInvalidatedTables$1) continuationImpl;
            int i2 = triggerBasedInvalidationTracker$checkInvalidatedTables$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                triggerBasedInvalidationTracker$checkInvalidatedTables$1.label = i2 - Integer.MIN_VALUE;
                Object obj = triggerBasedInvalidationTracker$checkInvalidatedTables$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = triggerBasedInvalidationTracker$checkInvalidatedTables$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ceu0 ceu0Var = new ceu0(14);
                    triggerBasedInvalidationTracker$checkInvalidatedTables$1.L$0 = d6e0Var;
                    triggerBasedInvalidationTracker$checkInvalidatedTables$1.label = 1;
                    obj = d6e0Var.d("SELECT * FROM room_table_modification_log WHERE invalidated = 1", ceu0Var, triggerBasedInvalidationTracker$checkInvalidatedTables$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Set set2 = (Set) triggerBasedInvalidationTracker$checkInvalidatedTables$1.L$0;
                        kotlin.b.b(obj);
                        return set2;
                    }
                    d6e0Var = (d6e0) triggerBasedInvalidationTracker$checkInvalidatedTables$1.L$0;
                    kotlin.b.b(obj);
                }
                set = (Set) obj;
                if (!set.isEmpty()) {
                    triggerBasedInvalidationTracker$checkInvalidatedTables$1.L$0 = set;
                    triggerBasedInvalidationTracker$checkInvalidatedTables$1.label = 2;
                    if (d6z.D(d6e0Var, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", triggerBasedInvalidationTracker$checkInvalidatedTables$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return set;
            }
        }
        triggerBasedInvalidationTracker$checkInvalidatedTables$1 = new TriggerBasedInvalidationTracker$checkInvalidatedTables$1(oVar, continuationImpl);
        Object obj2 = triggerBasedInvalidationTracker$checkInvalidatedTables$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = triggerBasedInvalidationTracker$checkInvalidatedTables$1.label;
        if (i != 0) {
        }
        set = (Set) obj2;
        if (!set.isEmpty()) {
        }
        return set;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0081 A[Catch: all -> 0x002f, TryCatch #1 {all -> 0x002f, blocks: (B:11:0x002b, B:12:0x0076, B:14:0x0081, B:17:0x00b7, B:19:0x008d, B:20:0x008f, B:22:0x009c, B:24:0x00a6, B:26:0x00ac, B:27:0x00aa, B:30:0x00b1), top: B:10:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(o oVar, ContinuationImpl continuationImpl) {
        TriggerBasedInvalidationTracker$notifyInvalidation$1 triggerBasedInvalidationTracker$notifyInvalidation$1;
        int i;
        k4c k4cVar;
        Set set;
        Object value;
        int[] iArr;
        RoomDatabase roomDatabase = oVar.a;
        if (continuationImpl instanceof TriggerBasedInvalidationTracker$notifyInvalidation$1) {
            triggerBasedInvalidationTracker$notifyInvalidation$1 = (TriggerBasedInvalidationTracker$notifyInvalidation$1) continuationImpl;
            int i2 = triggerBasedInvalidationTracker$notifyInvalidation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                triggerBasedInvalidationTracker$notifyInvalidation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = triggerBasedInvalidationTracker$notifyInvalidation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = triggerBasedInvalidationTracker$notifyInvalidation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    k4c k4cVar2 = roomDatabase.g;
                    boolean a = k4cVar2.a();
                    EmptySet emptySet = EmptySet.a;
                    if (!a) {
                        return emptySet;
                    }
                    try {
                        if (!oVar.j.compareAndSet(true, false)) {
                            k4cVar2.b();
                            return emptySet;
                        }
                        if (!((Boolean) oVar.k.invoke()).booleanValue()) {
                            k4cVar2.b();
                            return emptySet;
                        }
                        TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1 triggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1 = new TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1(oVar, null);
                        triggerBasedInvalidationTracker$notifyInvalidation$1.L$0 = k4cVar2;
                        triggerBasedInvalidationTracker$notifyInvalidation$1.label = 1;
                        Object R0 = roomDatabase.R0(false, triggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1, triggerBasedInvalidationTracker$notifyInvalidation$1);
                        if (R0 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        k4cVar = k4cVar2;
                        obj = R0;
                    } catch (Throwable th) {
                        th = th;
                        k4cVar = k4cVar2;
                        k4cVar.b();
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k4cVar = (k4c) triggerBasedInvalidationTracker$notifyInvalidation$1.L$0;
                    try {
                        kotlin.b.b(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        k4cVar.b();
                        throw th;
                    }
                }
                set = (Set) obj;
                if (!set.isEmpty()) {
                    g gVar = oVar.i;
                    gVar.getClass();
                    if (!set.isEmpty()) {
                        r0 r0Var = gVar.a;
                        do {
                            value = r0Var.getValue();
                            int[] iArr2 = (int[]) value;
                            int length = iArr2.length;
                            iArr = new int[length];
                            for (int i3 = 0; i3 < length; i3++) {
                                iArr[i3] = set.contains(Integer.valueOf(i3)) ? iArr2[i3] + 1 : iArr2[i3];
                            }
                        } while (!r0Var.k(value, iArr));
                    }
                    ((InvalidationTracker$implementation$1) oVar.e).invoke(set);
                }
                k4cVar.b();
                return set;
            }
        }
        triggerBasedInvalidationTracker$notifyInvalidation$1 = new TriggerBasedInvalidationTracker$notifyInvalidation$1(oVar, continuationImpl);
        Object obj2 = triggerBasedInvalidationTracker$notifyInvalidation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = triggerBasedInvalidationTracker$notifyInvalidation$1.label;
        if (i != 0) {
        }
        set = (Set) obj2;
        if (!set.isEmpty()) {
        }
        k4cVar.b();
        return set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e0, code lost:
    
        if (defpackage.d6z.D(r11, r3, r4) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00e2, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
    
        if (defpackage.d6z.D(r1, r3, r4) == r5) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Type inference failed for: r2v7, types: [d6e0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00e0 -> B:11:0x00e3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(o oVar, mg01 mg01Var, int i, ContinuationImpl continuationImpl) {
        TriggerBasedInvalidationTracker$startTrackingTable$1 triggerBasedInvalidationTracker$startTrackingTable$1;
        int i2;
        int i3;
        int i4;
        String[] strArr;
        d6e0 d6e0Var;
        int i5;
        String str;
        mg01 mg01Var2 = mg01Var;
        int i6 = i;
        oVar.getClass();
        if (continuationImpl instanceof TriggerBasedInvalidationTracker$startTrackingTable$1) {
            triggerBasedInvalidationTracker$startTrackingTable$1 = (TriggerBasedInvalidationTracker$startTrackingTable$1) continuationImpl;
            int i7 = triggerBasedInvalidationTracker$startTrackingTable$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                triggerBasedInvalidationTracker$startTrackingTable$1.label = i7 - Integer.MIN_VALUE;
                Object obj = triggerBasedInvalidationTracker$startTrackingTable$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = triggerBasedInvalidationTracker$startTrackingTable$1.label;
                boolean z = true;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    String str2 = "INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i6 + ", 0)";
                    triggerBasedInvalidationTracker$startTrackingTable$1.L$0 = mg01Var2;
                    triggerBasedInvalidationTracker$startTrackingTable$1.I$0 = i6;
                    triggerBasedInvalidationTracker$startTrackingTable$1.label = 1;
                } else if (i2 == 1) {
                    int i8 = triggerBasedInvalidationTracker$startTrackingTable$1.I$0;
                    ?? r2 = (d6e0) triggerBasedInvalidationTracker$startTrackingTable$1.L$0;
                    kotlin.b.b(obj);
                    i6 = i8;
                    mg01Var2 = r2;
                } else {
                    if (i2 != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i5 = triggerBasedInvalidationTracker$startTrackingTable$1.I$2;
                    i4 = triggerBasedInvalidationTracker$startTrackingTable$1.I$1;
                    i3 = triggerBasedInvalidationTracker$startTrackingTable$1.I$0;
                    strArr = (String[]) triggerBasedInvalidationTracker$startTrackingTable$1.L$2;
                    str = (String) triggerBasedInvalidationTracker$startTrackingTable$1.L$1;
                    d6e0Var = (d6e0) triggerBasedInvalidationTracker$startTrackingTable$1.L$0;
                    kotlin.b.b(obj);
                    boolean z2 = true;
                    i4++;
                    z = z2;
                    if (i4 >= i5) {
                        return zy11.a;
                    }
                    String str3 = strArr[i4];
                    z2 = z;
                    StringBuilder v = b64.v("CREATE ", oVar.d ? "TEMP" : "", " TRIGGER IF NOT EXISTS `", "room_table_modification_trigger_" + str + '_' + str3, "` AFTER ");
                    g8e.D(v, str3, " ON `", str, "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ");
                    String m = oyr.m(i3, " AND invalidated = 0; END", v);
                    triggerBasedInvalidationTracker$startTrackingTable$1.L$0 = d6e0Var;
                    triggerBasedInvalidationTracker$startTrackingTable$1.L$1 = str;
                    triggerBasedInvalidationTracker$startTrackingTable$1.L$2 = strArr;
                    triggerBasedInvalidationTracker$startTrackingTable$1.I$0 = i3;
                    triggerBasedInvalidationTracker$startTrackingTable$1.I$1 = i4;
                    triggerBasedInvalidationTracker$startTrackingTable$1.I$2 = i5;
                    triggerBasedInvalidationTracker$startTrackingTable$1.label = 2;
                }
                String str4 = oVar.g[i6];
                i3 = i6;
                i4 = 0;
                strArr = l;
                d6e0Var = mg01Var2;
                i5 = 3;
                str = str4;
                if (i4 >= i5) {
                }
            }
        }
        triggerBasedInvalidationTracker$startTrackingTable$1 = new TriggerBasedInvalidationTracker$startTrackingTable$1(oVar, continuationImpl);
        Object obj2 = triggerBasedInvalidationTracker$startTrackingTable$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = triggerBasedInvalidationTracker$startTrackingTable$1.label;
        boolean z3 = true;
        if (i2 != 0) {
        }
        String str42 = oVar.g[i6];
        i3 = i6;
        i4 = 0;
        strArr = l;
        d6e0Var = mg01Var2;
        i5 = 3;
        str = str42;
        if (i4 >= i5) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r4v5, types: [d6e0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0087 -> B:10:0x008a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(o oVar, mg01 mg01Var, int i, ContinuationImpl continuationImpl) {
        TriggerBasedInvalidationTracker$stopTrackingTable$1 triggerBasedInvalidationTracker$stopTrackingTable$1;
        int i2;
        String str;
        int i3;
        mg01 mg01Var2;
        int i4;
        String[] strArr;
        oVar.getClass();
        if (continuationImpl instanceof TriggerBasedInvalidationTracker$stopTrackingTable$1) {
            triggerBasedInvalidationTracker$stopTrackingTable$1 = (TriggerBasedInvalidationTracker$stopTrackingTable$1) continuationImpl;
            int i5 = triggerBasedInvalidationTracker$stopTrackingTable$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                triggerBasedInvalidationTracker$stopTrackingTable$1.label = i5 - Integer.MIN_VALUE;
                Object obj = triggerBasedInvalidationTracker$stopTrackingTable$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = triggerBasedInvalidationTracker$stopTrackingTable$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    str = oVar.g[i];
                    i3 = 3;
                    mg01Var2 = mg01Var;
                    i4 = 0;
                    strArr = l;
                    if (i4 < i3) {
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = triggerBasedInvalidationTracker$stopTrackingTable$1.I$1;
                    i4 = triggerBasedInvalidationTracker$stopTrackingTable$1.I$0;
                    String[] strArr2 = (String[]) triggerBasedInvalidationTracker$stopTrackingTable$1.L$2;
                    str = (String) triggerBasedInvalidationTracker$stopTrackingTable$1.L$1;
                    ?? r4 = (d6e0) triggerBasedInvalidationTracker$stopTrackingTable$1.L$0;
                    kotlin.b.b(obj);
                    strArr = strArr2;
                    mg01Var2 = r4;
                    i4++;
                    if (i4 < i3) {
                        String l2 = unr0.l('`', "DROP TRIGGER IF EXISTS `", "room_table_modification_trigger_" + str + '_' + strArr[i4]);
                        triggerBasedInvalidationTracker$stopTrackingTable$1.L$0 = mg01Var2;
                        triggerBasedInvalidationTracker$stopTrackingTable$1.L$1 = str;
                        triggerBasedInvalidationTracker$stopTrackingTable$1.L$2 = strArr;
                        triggerBasedInvalidationTracker$stopTrackingTable$1.I$0 = i4;
                        triggerBasedInvalidationTracker$stopTrackingTable$1.I$1 = i3;
                        triggerBasedInvalidationTracker$stopTrackingTable$1.label = 1;
                        if (d6z.D(mg01Var2, l2, triggerBasedInvalidationTracker$stopTrackingTable$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        i4++;
                        if (i4 < i3) {
                            return zy11.a;
                        }
                    }
                }
            }
        }
        triggerBasedInvalidationTracker$stopTrackingTable$1 = new TriggerBasedInvalidationTracker$stopTrackingTable$1(oVar, continuationImpl);
        Object obj2 = triggerBasedInvalidationTracker$stopTrackingTable$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = triggerBasedInvalidationTracker$stopTrackingTable$1.label;
        if (i2 != 0) {
        }
    }

    public final void e(sls slsVar, sls slsVar2) {
        if (this.j.compareAndSet(false, true)) {
            slsVar.invoke();
            ike ikeVar = this.a.a;
            if (ikeVar == null) {
                ikeVar = null;
            }
            tje.N(ikeVar, new pse("Room Invalidation Tracker Refresh"), null, new TriggerBasedInvalidationTracker$refreshInvalidationAsync$3(this, slsVar2, null), 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ContinuationImpl continuationImpl) {
        TriggerBasedInvalidationTracker$syncTriggers$1 triggerBasedInvalidationTracker$syncTriggers$1;
        int i;
        k4c k4cVar;
        if (continuationImpl instanceof TriggerBasedInvalidationTracker$syncTriggers$1) {
            triggerBasedInvalidationTracker$syncTriggers$1 = (TriggerBasedInvalidationTracker$syncTriggers$1) continuationImpl;
            int i2 = triggerBasedInvalidationTracker$syncTriggers$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                triggerBasedInvalidationTracker$syncTriggers$1.label = i2 - Integer.MIN_VALUE;
                Object obj = triggerBasedInvalidationTracker$syncTriggers$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = triggerBasedInvalidationTracker$syncTriggers$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    RoomDatabase roomDatabase = this.a;
                    k4c k4cVar2 = roomDatabase.g;
                    if (k4cVar2.a()) {
                        try {
                            TriggerBasedInvalidationTracker$syncTriggers$2$1 triggerBasedInvalidationTracker$syncTriggers$2$1 = new TriggerBasedInvalidationTracker$syncTriggers$2$1(this, null);
                            triggerBasedInvalidationTracker$syncTriggers$1.L$0 = k4cVar2;
                            triggerBasedInvalidationTracker$syncTriggers$1.label = 1;
                            if (roomDatabase.R0(false, triggerBasedInvalidationTracker$syncTriggers$2$1, triggerBasedInvalidationTracker$syncTriggers$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            k4cVar = k4cVar2;
                        } catch (Throwable th) {
                            th = th;
                            k4cVar = k4cVar2;
                            k4cVar.b();
                            throw th;
                        }
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k4cVar = (k4c) triggerBasedInvalidationTracker$syncTriggers$1.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    k4cVar.b();
                    throw th;
                }
                k4cVar.b();
                return zy11.a;
            }
        }
        triggerBasedInvalidationTracker$syncTriggers$1 = new TriggerBasedInvalidationTracker$syncTriggers$1(this, continuationImpl);
        Object obj2 = triggerBasedInvalidationTracker$syncTriggers$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = triggerBasedInvalidationTracker$syncTriggers$1.label;
        if (i != 0) {
        }
        k4cVar.b();
        return zy11.a;
    }

    public final Pair g(String[] strArr) {
        SetBuilder setBuilder = new SetBuilder();
        for (String str : strArr) {
            Set set = (Set) this.c.get(str.toLowerCase(Locale.ROOT));
            if (set != null) {
                setBuilder.addAll(set);
            } else {
                setBuilder.add(str);
            }
        }
        String[] strArr2 = (String[]) setBuilder.b().toArray(new String[0]);
        int length = strArr2.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr2[i];
            Integer num = (Integer) this.f.get(str2.toLowerCase(Locale.ROOT));
            if (num == null) {
                ny61.g("There is no table with name ".concat(str2));
                return null;
            }
            iArr[i] = num.intValue();
        }
        return new Pair(strArr2, iArr);
    }
}
