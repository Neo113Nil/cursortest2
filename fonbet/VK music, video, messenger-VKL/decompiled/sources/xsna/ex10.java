package xsna;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: MediaRouteSelector.java */
/* loaded from: classes12.dex */
public final class ex10 {
    public static final ex10 c = new ex10(new Bundle(), null);
    public final Bundle a;
    public List<String> b;

    /* compiled from: MediaRouteSelector.java */
    public static final class a {
        public ArrayList<String> a;

        @NonNull
        public final ex10 a() {
            if (this.a == null) {
                return ex10.c;
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("controlCategories", this.a);
            return new ex10(bundle, this.a);
        }
    }

    public ex10(Bundle bundle, ArrayList arrayList) {
        this.a = bundle;
        this.b = arrayList;
    }

    @Nullable
    public static ex10 b(@Nullable Bundle bundle) {
        if (bundle != null) {
            return new ex10(bundle, null);
        }
        return null;
    }

    public final void a() {
        if (this.b == null) {
            ArrayList<String> stringArrayList = this.a.getStringArrayList("controlCategories");
            this.b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.b = Collections.EMPTY_LIST;
            }
        }
    }

    @NonNull
    public final ArrayList c() {
        a();
        return new ArrayList(this.b);
    }

    public final boolean d() {
        a();
        return this.b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ex10)) {
            return false;
        }
        ex10 ex10Var = (ex10) obj;
        a();
        ex10Var.a();
        return this.b.equals(ex10Var.b);
    }

    public final int hashCode() {
        a();
        return this.b.hashCode();
    }

    @NonNull
    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(c().toArray()) + " }";
    }
}
