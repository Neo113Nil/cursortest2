package com.yandex.mob.domain;

import defpackage.g050;
import defpackage.gtq0;
import defpackage.ny61;
import defpackage.tls;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.LicenseUtility;

/* loaded from: classes8.dex */
public final class n {
    public static final List f = Collections.singletonList(Character.valueOf(LicenseUtility.SEPARATOR));
    public final com.yandex.mob.datastore.d a;
    public final tls b;
    public final boolean c;
    public volatile String d;
    public final kotlinx.coroutines.sync.a e = gtq0.a();

    public n(com.yandex.mob.datastore.d dVar, tls tlsVar, boolean z) {
        this.a = dVar;
        this.b = tlsVar;
        this.c = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x008a, code lost:
    
        if (r15 == r1) goto L80;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00da A[Catch: all -> 0x0068, TryCatch #1 {all -> 0x0068, blocks: (B:36:0x0063, B:37:0x00d6, B:39:0x00da, B:41:0x00f3, B:43:0x0103, B:45:0x0106, B:48:0x0109, B:51:0x012e), top: B:35:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012e A[Catch: all -> 0x0068, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0068, blocks: (B:36:0x0063, B:37:0x00d6, B:39:0x00da, B:41:0x00f3, B:43:0x0103, B:45:0x0106, B:48:0x0109, B:51:0x012e), top: B:35:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b0 A[Catch: all -> 0x00bc, TryCatch #2 {all -> 0x00bc, blocks: (B:57:0x00ac, B:59:0x00b0, B:60:0x00be), top: B:56:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00be A[Catch: all -> 0x00bc, TRY_LEAVE, TryCatch #2 {all -> 0x00bc, blocks: (B:57:0x00ac, B:59:0x00b0, B:60:0x00be), top: B:56:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v17, types: [g050] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [g050] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r6v6, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        MobIdProvider$mobId$1 mobIdProvider$mobId$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        int i2;
        ?? r4;
        String str;
        g050 g050Var;
        int i3;
        int i4;
        Pair pair;
        String str2;
        Pair pair2;
        String str3;
        g050 g050Var2;
        boolean booleanValue;
        if (continuationImpl instanceof MobIdProvider$mobId$1) {
            mobIdProvider$mobId$1 = (MobIdProvider$mobId$1) continuationImpl;
            int i5 = mobIdProvider$mobId$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                mobIdProvider$mobId$1.label = i5 - Integer.MIN_VALUE;
                Object obj = mobIdProvider$mobId$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobIdProvider$mobId$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (this.c) {
                        com.yandex.mob.datastore.d dVar = this.a;
                        mobIdProvider$mobId$1.label = 1;
                        obj = dVar.l(mobIdProvider$mobId$1);
                    } else {
                        String str4 = this.d;
                        if (str4 != null) {
                            return str4;
                        }
                        aVar = this.e;
                        mobIdProvider$mobId$1.L$0 = aVar;
                        mobIdProvider$mobId$1.I$0 = 0;
                        mobIdProvider$mobId$1.label = 2;
                        if (aVar.a(mobIdProvider$mobId$1) != coroutineSingletons) {
                            i2 = 0;
                            str = this.d;
                            if (str == null) {
                            }
                        }
                    }
                } else {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        String str5 = (String) obj;
                        return str5 == null ? "Undefined" : str5;
                    }
                    if (i == 2) {
                        i2 = mobIdProvider$mobId$1.I$0;
                        ?? r6 = (g050) mobIdProvider$mobId$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r6;
                        try {
                            str = this.d;
                            if (str == null) {
                                pair = new Pair(str, Boolean.FALSE);
                                aVar.d(null);
                                String str6 = (String) pair.getFirst();
                                booleanValue = ((Boolean) pair.getSecond()).booleanValue();
                                if (booleanValue) {
                                }
                                return str6;
                            }
                            com.yandex.mob.datastore.d dVar2 = this.a;
                            mobIdProvider$mobId$1.L$0 = aVar;
                            mobIdProvider$mobId$1.L$1 = null;
                            mobIdProvider$mobId$1.I$0 = i2;
                            mobIdProvider$mobId$1.I$1 = 0;
                            mobIdProvider$mobId$1.label = 3;
                            Object l = dVar2.l(mobIdProvider$mobId$1);
                            if (l != coroutineSingletons) {
                                g050Var = aVar;
                                obj = l;
                                i3 = i2;
                                i4 = 0;
                                str2 = (String) obj;
                                if (str2 == null) {
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            r4 = aVar;
                            r4.d(null);
                            throw th;
                        }
                    } else {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                String str7 = (String) mobIdProvider$mobId$1.L$0;
                                kotlin.b.b(obj);
                                return str7;
                            }
                            str3 = (String) mobIdProvider$mobId$1.L$3;
                            r4 = (g050) mobIdProvider$mobId$1.L$0;
                            try {
                                kotlin.b.b(obj);
                                g050Var2 = r4;
                                pair2 = new Pair(str3, Boolean.TRUE);
                                r4 = g050Var2;
                                String str8 = (String) pair2.getFirst();
                                Boolean bool = (Boolean) pair2.getSecond();
                                bool.getClass();
                                this.d = str8;
                                Pair pair3 = new Pair(str8, bool);
                                aVar = r4;
                                pair = pair3;
                                aVar.d(null);
                                String str62 = (String) pair.getFirst();
                                booleanValue = ((Boolean) pair.getSecond()).booleanValue();
                                if (booleanValue) {
                                    tls tlsVar = this.b;
                                    mobIdProvider$mobId$1.L$0 = str62;
                                    mobIdProvider$mobId$1.L$1 = null;
                                    mobIdProvider$mobId$1.L$2 = null;
                                    mobIdProvider$mobId$1.L$3 = null;
                                    mobIdProvider$mobId$1.Z$0 = booleanValue;
                                    mobIdProvider$mobId$1.label = 5;
                                    if (tlsVar.invoke(mobIdProvider$mobId$1) == coroutineSingletons) {
                                    }
                                }
                                return str62;
                            } catch (Throwable th2) {
                                th = th2;
                                r4.d(null);
                                throw th;
                            }
                        }
                        i4 = mobIdProvider$mobId$1.I$1;
                        i3 = mobIdProvider$mobId$1.I$0;
                        g050Var = (g050) mobIdProvider$mobId$1.L$0;
                        try {
                            kotlin.b.b(obj);
                            str2 = (String) obj;
                            if (str2 == null) {
                                pair2 = new Pair(str2, Boolean.FALSE);
                                r4 = g050Var;
                                String str82 = (String) pair2.getFirst();
                                Boolean bool2 = (Boolean) pair2.getSecond();
                                bool2.getClass();
                                this.d = str82;
                                Pair pair32 = new Pair(str82, bool2);
                                aVar = r4;
                                pair = pair32;
                                aVar.d(null);
                                String str622 = (String) pair.getFirst();
                                booleanValue = ((Boolean) pair.getSecond()).booleanValue();
                                if (booleanValue) {
                                }
                                return str622;
                            }
                            String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.ROOT);
                            StringBuilder sb = new StringBuilder();
                            int length = lowerCase.length();
                            for (int i6 = 0; i6 < length; i6++) {
                                char charAt = lowerCase.charAt(i6);
                                if (!f.contains(Character.valueOf(charAt))) {
                                    sb.append(charAt);
                                }
                            }
                            String sb2 = sb.toString();
                            com.yandex.mob.datastore.d dVar3 = this.a;
                            mobIdProvider$mobId$1.L$0 = g050Var;
                            mobIdProvider$mobId$1.L$1 = null;
                            mobIdProvider$mobId$1.L$2 = null;
                            mobIdProvider$mobId$1.L$3 = sb2;
                            mobIdProvider$mobId$1.I$0 = i3;
                            mobIdProvider$mobId$1.I$1 = i4;
                            mobIdProvider$mobId$1.label = 4;
                            if (dVar3.w(sb2, mobIdProvider$mobId$1) != coroutineSingletons) {
                                str3 = sb2;
                                g050Var2 = g050Var;
                                pair2 = new Pair(str3, Boolean.TRUE);
                                r4 = g050Var2;
                                String str822 = (String) pair2.getFirst();
                                Boolean bool22 = (Boolean) pair2.getSecond();
                                bool22.getClass();
                                this.d = str822;
                                Pair pair322 = new Pair(str822, bool22);
                                aVar = r4;
                                pair = pair322;
                                aVar.d(null);
                                String str6222 = (String) pair.getFirst();
                                booleanValue = ((Boolean) pair.getSecond()).booleanValue();
                                if (booleanValue) {
                                }
                                return str6222;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            r4 = g050Var;
                            r4.d(null);
                            throw th;
                        }
                    }
                }
                return coroutineSingletons;
            }
        }
        mobIdProvider$mobId$1 = new MobIdProvider$mobId$1(this, continuationImpl);
        Object obj2 = mobIdProvider$mobId$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobIdProvider$mobId$1.label;
        if (i != 0) {
        }
        return coroutineSingletons2;
    }
}
