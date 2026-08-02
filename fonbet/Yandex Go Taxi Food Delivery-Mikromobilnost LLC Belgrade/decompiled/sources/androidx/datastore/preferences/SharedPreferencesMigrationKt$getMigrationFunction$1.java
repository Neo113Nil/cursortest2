package androidx.datastore.preferences;

import defpackage.ez40;
import defpackage.kme0;
import defpackage.mme0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.upr0;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lupr0;", "sharedPrefs", "Lmme0;", "currentData", "<anonymous>", "(Lupr0;Lmme0;)Lmme0;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
final class SharedPreferencesMigrationKt$getMigrationFunction$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SharedPreferencesMigrationKt$getMigrationFunction$1 sharedPreferencesMigrationKt$getMigrationFunction$1 = new SharedPreferencesMigrationKt$getMigrationFunction$1(3, (Continuation) obj3);
        sharedPreferencesMigrationKt$getMigrationFunction$1.L$0 = (upr0) obj;
        sharedPreferencesMigrationKt$getMigrationFunction$1.L$1 = (mme0) obj2;
        return sharedPreferencesMigrationKt$getMigrationFunction$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        upr0 upr0Var = (upr0) this.L$0;
        mme0 mme0Var = (mme0) this.L$1;
        Set keySet = mme0Var.a().keySet();
        ArrayList arrayList = new ArrayList(tcc.n(keySet, 10));
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((kme0) it.next()).a);
        }
        LinkedHashMap a = upr0Var.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : a.entrySet()) {
            if (!arrayList.contains((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ez40 ez40Var = new ez40(new LinkedHashMap(mme0Var.a()), false);
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str = (String) entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof Boolean) {
                ez40Var.g(new kme0(str), value);
            } else if (value instanceof Float) {
                ez40Var.g(new kme0(str), value);
            } else if (value instanceof Integer) {
                ez40Var.g(new kme0(str), value);
            } else if (value instanceof Long) {
                ez40Var.g(new kme0(str), value);
            } else if (value instanceof String) {
                ez40Var.g(new kme0(str), value);
            } else if (value instanceof Set) {
                ez40Var.g(new kme0(str), (Set) value);
            }
        }
        return new ez40(new LinkedHashMap(ez40Var.a()), true);
    }
}
