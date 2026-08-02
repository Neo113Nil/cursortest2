package com.yandex.go.suggest.impl.data.flex;

import android.content.Context;
import defpackage.d6x;
import defpackage.g6u;
import defpackage.i3y;
import defpackage.k6x;
import defpackage.ku2;
import defpackage.ny61;
import defpackage.o400;
import defpackage.qhq0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import json.state.disk.storage.feature.c;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class a {
    public final tt2 a;
    public final k6x b;
    public final i3y c;
    public final i3y d = kotlin.a.a(new qhq0(22, this));

    public a(Context context, tt2 tt2Var, k6x k6xVar) {
        this.a = tt2Var;
        this.b = k6xVar;
        this.c = kotlin.a.a(new ku2(context, 19));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        SuperappSuggestFlexJasonStateDiskStorageRepository$start$1 superappSuggestFlexJasonStateDiskStorageRepository$start$1;
        int i;
        d6x d6xVar;
        if (continuationImpl instanceof SuperappSuggestFlexJasonStateDiskStorageRepository$start$1) {
            superappSuggestFlexJasonStateDiskStorageRepository$start$1 = (SuperappSuggestFlexJasonStateDiskStorageRepository$start$1) continuationImpl;
            int i2 = superappSuggestFlexJasonStateDiskStorageRepository$start$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappSuggestFlexJasonStateDiskStorageRepository$start$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappSuggestFlexJasonStateDiskStorageRepository$start$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappSuggestFlexJasonStateDiskStorageRepository$start$1.label;
                if (i != 0) {
                    b.b(obj);
                    ((json.state.disk.storage.feature.b) this.d.getValue()).a();
                    c cVar = (c) this.c.getValue();
                    superappSuggestFlexJasonStateDiskStorageRepository$start$1.label = 1;
                    obj = cVar.a(superappSuggestFlexJasonStateDiskStorageRepository$start$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        return zy11.a;
                    }
                    b.b(obj);
                }
                d6xVar = (d6x) obj;
                if (d6xVar != null) {
                    this.a.getClass();
                    sjh sjhVar = uyj.a;
                    g6u g6uVar = o400.a;
                    SuperappSuggestFlexJasonStateDiskStorageRepository$start$2$1 superappSuggestFlexJasonStateDiskStorageRepository$start$2$1 = new SuperappSuggestFlexJasonStateDiskStorageRepository$start$2$1(this, d6xVar, null);
                    superappSuggestFlexJasonStateDiskStorageRepository$start$1.L$0 = null;
                    superappSuggestFlexJasonStateDiskStorageRepository$start$1.label = 2;
                    obj = tje.k0(g6uVar, superappSuggestFlexJasonStateDiskStorageRepository$start$2$1, superappSuggestFlexJasonStateDiskStorageRepository$start$1);
                }
                return zy11.a;
            }
        }
        superappSuggestFlexJasonStateDiskStorageRepository$start$1 = new SuperappSuggestFlexJasonStateDiskStorageRepository$start$1(this, continuationImpl);
        Object obj2 = superappSuggestFlexJasonStateDiskStorageRepository$start$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappSuggestFlexJasonStateDiskStorageRepository$start$1.label;
        if (i != 0) {
        }
        d6xVar = (d6x) obj2;
        if (d6xVar != null) {
        }
        return zy11.a;
    }
}
