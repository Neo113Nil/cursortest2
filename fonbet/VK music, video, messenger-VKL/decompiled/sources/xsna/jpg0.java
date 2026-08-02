package xsna;

import android.media.RouteListingPreference;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: RouteListingPreference.java */
/* loaded from: classes12.dex */
public final class jpg0 {

    @NonNull
    public final List<c> a;
    public final boolean b;

    /* compiled from: RouteListingPreference.java */
    public static class a {
        @NonNull
        public static RouteListingPreference a(jpg0 jpg0Var) {
            ArrayList arrayList = new ArrayList();
            for (c cVar : jpg0Var.a) {
                arrayList.add(new RouteListingPreference.Item.Builder(cVar.a).setFlags(0).setSubText(0).setCustomSubtextMessage(null).setSelectionBehavior(cVar.b).build());
            }
            return new RouteListingPreference.Builder().setItems(arrayList).setLinkedItemComponentName(null).setUseSystemOrdering(jpg0Var.b).build();
        }
    }

    /* compiled from: RouteListingPreference.java */
    public static final class b {
        public List<c> a;
        public boolean b;
    }

    /* compiled from: RouteListingPreference.java */
    public static final class c {

        @NonNull
        public final String a;
        public final int b;

        /* compiled from: RouteListingPreference.java */
        public static final class a {
            public final String a;
            public final int b;

            public a(@NonNull String str) {
                obr.b(!TextUtils.isEmpty(str));
                this.a = str;
                this.b = 1;
            }
        }

        public c(@NonNull a aVar) {
            this.a = aVar.a;
            this.b = aVar.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a.equals(cVar.a) && this.b == cVar.b && TextUtils.equals(null, null);
        }

        public final int hashCode() {
            return Objects.hash(this.a, Integer.valueOf(this.b), 0, 0, null);
        }
    }

    public jpg0(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpg0)) {
            return false;
        }
        jpg0 jpg0Var = (jpg0) obj;
        return this.a.equals(jpg0Var.a) && this.b == jpg0Var.b;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Boolean.valueOf(this.b), null);
    }
}
