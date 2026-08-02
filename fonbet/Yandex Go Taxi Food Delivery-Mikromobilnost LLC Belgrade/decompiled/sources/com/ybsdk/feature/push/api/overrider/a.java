package com.ybsdk.feature.push.api.overrider;

import defpackage.ny61;
import defpackage.v190;
import java.util.Iterator;
import java.util.Set;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a {
    public final Set a;

    public a(Set set) {
        this.a = set;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005e -> B:10:0x0061). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(JSONObject jSONObject, ContinuationImpl continuationImpl) {
        PushContentOverridersHolder$tryOverrideContent$1 pushContentOverridersHolder$tryOverrideContent$1;
        int i;
        Iterator it;
        if (continuationImpl instanceof PushContentOverridersHolder$tryOverrideContent$1) {
            pushContentOverridersHolder$tryOverrideContent$1 = (PushContentOverridersHolder$tryOverrideContent$1) continuationImpl;
            int i2 = pushContentOverridersHolder$tryOverrideContent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pushContentOverridersHolder$tryOverrideContent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pushContentOverridersHolder$tryOverrideContent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pushContentOverridersHolder$tryOverrideContent$1.label;
                if (i != 0) {
                    b.b(obj);
                    it = this.a.iterator();
                    while (it.hasNext()) {
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it = (Iterator) pushContentOverridersHolder$tryOverrideContent$1.L$1;
                jSONObject = (JSONObject) pushContentOverridersHolder$tryOverrideContent$1.L$0;
                b.b(obj);
                Object a = ((Result) obj).getValue();
                if (!(a instanceof Result.Failure)) {
                    return (v190) a;
                }
                while (it.hasNext()) {
                    com.ybsdk.feature.trackid.push.internal.a aVar = (com.ybsdk.feature.trackid.push.internal.a) it.next();
                    if (jSONObject != null) {
                        pushContentOverridersHolder$tryOverrideContent$1.L$0 = jSONObject;
                        pushContentOverridersHolder$tryOverrideContent$1.L$1 = it;
                        pushContentOverridersHolder$tryOverrideContent$1.label = 1;
                        a = aVar.a(jSONObject, pushContentOverridersHolder$tryOverrideContent$1);
                        if (a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        if (!(a instanceof Result.Failure)) {
                        }
                        while (it.hasNext()) {
                        }
                    }
                }
                return null;
            }
        }
        pushContentOverridersHolder$tryOverrideContent$1 = new PushContentOverridersHolder$tryOverrideContent$1(this, continuationImpl);
        Object obj2 = pushContentOverridersHolder$tryOverrideContent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pushContentOverridersHolder$tryOverrideContent$1.label;
        if (i != 0) {
        }
    }
}
