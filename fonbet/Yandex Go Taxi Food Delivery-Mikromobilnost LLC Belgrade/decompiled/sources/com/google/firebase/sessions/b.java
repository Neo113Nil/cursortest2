package com.google.firebase.sessions;

import com.google.android.gms.tasks.zzw;
import defpackage.e3w;
import defpackage.f3w;
import defpackage.gtq0;
import defpackage.hcr;
import defpackage.ny61;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class b {
    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:(6:11|12|13|(1:15)|16|17)(2:20|21))(2:22|23))(6:30|31|32|33|(1:35)|28)|24|25|26))|41|6|7|(0)(0)|24|25|26|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        if (r6 != r8) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r7v0, types: [hcr] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(hcr hcrVar, ContinuationImpl continuationImpl) {
        InstallationId$Companion$create$1 installationId$Companion$create$1;
        int i;
        com.google.firebase.installations.a aVar;
        String str;
        if (continuationImpl instanceof InstallationId$Companion$create$1) {
            installationId$Companion$create$1 = (InstallationId$Companion$create$1) continuationImpl;
            int i2 = installationId$Companion$create$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                installationId$Companion$create$1.label = i2 - Integer.MIN_VALUE;
                Object obj = installationId$Companion$create$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = installationId$Companion$create$1.label;
                String str2 = "";
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.google.firebase.installations.a aVar2 = (com.google.firebase.installations.a) hcrVar;
                    zzw d = aVar2.d();
                    try {
                        installationId$Companion$create$1.L$0 = aVar2;
                        installationId$Companion$create$1.label = 1;
                        Object c = gtq0.c(d, installationId$Companion$create$1);
                        if (c != coroutineSingletons) {
                            hcrVar = aVar2;
                            obj = c;
                        }
                    } catch (Exception unused) {
                        hcrVar = aVar2;
                        aVar = hcrVar;
                        str = "";
                        zzw c2 = aVar.c();
                        installationId$Companion$create$1.L$0 = str;
                        installationId$Companion$create$1.label = 2;
                        obj = gtq0.c(c2, installationId$Companion$create$1);
                        hcrVar = str;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str3 = (String) installationId$Companion$create$1.L$0;
                    kotlin.b.b(obj);
                    hcrVar = str3;
                    String str4 = (String) obj;
                    if (str4 != null) {
                        str2 = str4;
                    }
                    return new e3w(str2, hcrVar);
                }
                hcr hcrVar2 = (hcr) installationId$Companion$create$1.L$0;
                kotlin.b.b(obj);
                hcrVar = hcrVar2;
                com.google.firebase.installations.a aVar3 = hcrVar;
                str = ((f3w) obj).a();
                aVar = aVar3;
                zzw c22 = aVar.c();
                installationId$Companion$create$1.L$0 = str;
                installationId$Companion$create$1.label = 2;
                obj = gtq0.c(c22, installationId$Companion$create$1);
                hcrVar = str;
            }
        }
        installationId$Companion$create$1 = new InstallationId$Companion$create$1(this, continuationImpl);
        Object obj2 = installationId$Companion$create$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = installationId$Companion$create$1.label;
        String str22 = "";
        if (i != 0) {
        }
        com.google.firebase.installations.a aVar32 = hcrVar;
        str = ((f3w) obj2).a();
        aVar = aVar32;
        zzw c222 = aVar.c();
        installationId$Companion$create$1.L$0 = str;
        installationId$Companion$create$1.label = 2;
        obj2 = gtq0.c(c222, installationId$Companion$create$1);
        hcrVar = str;
    }
}
