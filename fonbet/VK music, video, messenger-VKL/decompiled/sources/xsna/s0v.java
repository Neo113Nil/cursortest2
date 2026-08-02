package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.EmptySet;
import xsna.va0;

/* compiled from: HealthPermissionsRequestAppContract.kt */
/* loaded from: classes12.dex */
public final class s0v extends va0<Set<? extends String>, Set<? extends String>> {
    public final String a = "com.google.android.apps.healthdata";

    @Override // xsna.va0
    public final Intent a(Context context, Set<? extends String> set) {
        Set<? extends String> set2 = set;
        ulp0 ulp0Var = new ulp0(new i5g(set2), q0v.i);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        rli0.z(ulp0Var, arrayList);
        set2.size();
        Intent intent = new Intent("androidx.health.ACTION_REQUEST_PERMISSIONS");
        intent.putParcelableArrayListExtra("requested_permissions_string", arrayList);
        String str = this.a;
        if (str.length() > 0) {
            intent.setPackage(str);
        }
        return intent;
    }

    @Override // xsna.va0
    public final /* bridge */ /* synthetic */ va0.a<Set<? extends String>> b(Context context, Set<? extends String> set) {
        return null;
    }

    @Override // xsna.va0
    public final Set<? extends String> c(int i, Intent intent) {
        Set<? extends String> set;
        ArrayList parcelableArrayListExtra;
        if (intent == null || (parcelableArrayListExtra = intent.getParcelableArrayListExtra("granted_permissions_string")) == null || (set = rli0.C(new ulp0(new i5g(parcelableArrayListExtra), r0v.i))) == null) {
            set = EmptySet.b;
        }
        set.size();
        return set;
    }
}
