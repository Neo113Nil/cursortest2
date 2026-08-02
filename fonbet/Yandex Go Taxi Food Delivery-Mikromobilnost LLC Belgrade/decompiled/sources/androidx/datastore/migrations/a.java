package androidx.datastore.migrations;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.acb1;
import defpackage.i3y;
import defpackage.ny61;
import defpackage.oog;
import defpackage.qpr0;
import defpackage.upr0;
import defpackage.vn20;
import defpackage.wls;
import defpackage.zls;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class a implements oog {
    public final wls a;
    public final zls b;
    public final Context c;
    public final String d;
    public final i3y e;
    public final Set f;

    public a(Context context, String str, wls wlsVar, zls zlsVar) {
        int i = qpr0.a;
        vn20 vn20Var = new vn20(context, str, 1);
        this.a = wlsVar;
        this.b = zlsVar;
        this.c = context;
        this.d = str;
        this.e = kotlin.a.a(vn20Var);
        this.f = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        if (((android.content.SharedPreferences) r5.getValue()).getAll().isEmpty() == false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.oog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, Continuation continuation) {
        SharedPreferencesMigration$shouldMigrate$1 sharedPreferencesMigration$shouldMigrate$1;
        Object obj2;
        int i;
        if (continuation instanceof SharedPreferencesMigration$shouldMigrate$1) {
            sharedPreferencesMigration$shouldMigrate$1 = (SharedPreferencesMigration$shouldMigrate$1) continuation;
            int i2 = sharedPreferencesMigration$shouldMigrate$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sharedPreferencesMigration$shouldMigrate$1.label = i2 - Integer.MIN_VALUE;
                obj2 = sharedPreferencesMigration$shouldMigrate$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sharedPreferencesMigration$shouldMigrate$1.label;
                boolean z = true;
                if (i != 0) {
                    b.b(obj2);
                    sharedPreferencesMigration$shouldMigrate$1.label = 1;
                    obj2 = this.a.invoke(obj, sharedPreferencesMigration$shouldMigrate$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj2);
                }
                if (((Boolean) obj2).booleanValue()) {
                    return Boolean.FALSE;
                }
                i3y i3yVar = this.e;
                Set set = this.f;
                if (set != null) {
                    Set set2 = set;
                    SharedPreferences sharedPreferences = (SharedPreferences) i3yVar.getValue();
                    if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                        Iterator it = set2.iterator();
                        while (it.hasNext()) {
                            if (sharedPreferences.contains((String) it.next())) {
                                break;
                            }
                        }
                    }
                    z = false;
                    return Boolean.valueOf(z);
                }
            }
        }
        sharedPreferencesMigration$shouldMigrate$1 = new SharedPreferencesMigration$shouldMigrate$1(this, (ContinuationImpl) continuation);
        obj2 = sharedPreferencesMigration$shouldMigrate$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sharedPreferencesMigration$shouldMigrate$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        if (((Boolean) obj2).booleanValue()) {
        }
    }

    @Override // defpackage.oog
    public final void b() {
        Context context;
        String str;
        i3y i3yVar = this.e;
        SharedPreferences.Editor edit = ((SharedPreferences) i3yVar.getValue()).edit();
        Set set = this.f;
        if (set == null) {
            edit.clear();
        } else {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                edit.remove((String) it.next());
            }
        }
        if (!edit.commit()) {
            ny61.v("Unable to delete migrated keys from SharedPreferences.");
            return;
        }
        if (((SharedPreferences) i3yVar.getValue()).getAll().isEmpty() && (context = this.c) != null && (str = this.d) != null) {
            acb1.d(context, str);
        }
        if (set != null) {
            set.clear();
        }
    }

    @Override // defpackage.oog
    public final Object c(Object obj, Continuation continuation) {
        return this.b.invoke(new upr0((SharedPreferences) this.e.getValue(), this.f), obj, continuation);
    }
}
