package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import xsna.j5k;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application.java */
/* loaded from: classes.dex */
public final class gl5 extends j5k.e.d.a {
    public final j5k.e.d.a.b a;
    public final List<j5k.c> b;
    public final List<j5k.c> c;
    public final Boolean d;
    public final j5k.e.d.a.c e;
    public final List<j5k.e.d.a.c> f;
    public final int g;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application.java */
    public static final class a extends j5k.e.d.a.AbstractC3097a {
        public j5k.e.d.a.b a;
        public List<j5k.c> b;
        public List<j5k.c> c;
        public Boolean d;
        public j5k.e.d.a.c e;
        public List<j5k.e.d.a.c> f;
        public int g;
        public byte h;
    }

    public gl5() {
        throw null;
    }

    public gl5(j5k.e.d.a.b bVar, List list, List list2, Boolean bool, j5k.e.d.a.c cVar, List list3, int i) {
        this.a = bVar;
        this.b = list;
        this.c = list2;
        this.d = bool;
        this.e = cVar;
        this.f = list3;
        this.g = i;
    }

    @Override // xsna.j5k.e.d.a
    @Nullable
    public final List<j5k.e.d.a.c> a() {
        return this.f;
    }

    @Override // xsna.j5k.e.d.a
    @Nullable
    public final Boolean b() {
        return this.d;
    }

    @Override // xsna.j5k.e.d.a
    @Nullable
    public final j5k.e.d.a.c c() {
        return this.e;
    }

    @Override // xsna.j5k.e.d.a
    @Nullable
    public final List<j5k.c> d() {
        return this.b;
    }

    @Override // xsna.j5k.e.d.a
    @NonNull
    public final j5k.e.d.a.b e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j5k.e.d.a)) {
            return false;
        }
        j5k.e.d.a aVar = (j5k.e.d.a) obj;
        if (!this.a.equals(aVar.e())) {
            return false;
        }
        List<j5k.c> list = this.b;
        if (list == null) {
            if (aVar.d() != null) {
                return false;
            }
        } else if (!list.equals(aVar.d())) {
            return false;
        }
        List<j5k.c> list2 = this.c;
        if (list2 == null) {
            if (aVar.f() != null) {
                return false;
            }
        } else if (!list2.equals(aVar.f())) {
            return false;
        }
        Boolean bool = this.d;
        if (bool == null) {
            if (aVar.b() != null) {
                return false;
            }
        } else if (!bool.equals(aVar.b())) {
            return false;
        }
        j5k.e.d.a.c cVar = this.e;
        if (cVar == null) {
            if (aVar.c() != null) {
                return false;
            }
        } else if (!cVar.equals(aVar.c())) {
            return false;
        }
        List<j5k.e.d.a.c> list3 = this.f;
        if (list3 == null) {
            if (aVar.a() != null) {
                return false;
            }
        } else if (!list3.equals(aVar.a())) {
            return false;
        }
        return this.g == aVar.g();
    }

    @Override // xsna.j5k.e.d.a
    @Nullable
    public final List<j5k.c> f() {
        return this.c;
    }

    @Override // xsna.j5k.e.d.a
    public final int g() {
        return this.g;
    }

    @Override // xsna.j5k.e.d.a
    public final a h() {
        a aVar = new a();
        aVar.a = this.a;
        aVar.b = this.b;
        aVar.c = this.c;
        aVar.d = this.d;
        aVar.e = this.e;
        aVar.f = this.f;
        aVar.g = this.g;
        aVar.h = (byte) 1;
        return aVar;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        List<j5k.c> list = this.b;
        int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List<j5k.c> list2 = this.c;
        int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.d;
        int hashCode4 = (hashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        j5k.e.d.a.c cVar = this.e;
        int hashCode5 = (hashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List<j5k.e.d.a.c> list3 = this.f;
        return ((hashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{execution=");
        sb.append(this.a);
        sb.append(", customAttributes=");
        sb.append(this.b);
        sb.append(", internalKeys=");
        sb.append(this.c);
        sb.append(", background=");
        sb.append(this.d);
        sb.append(", currentProcessDetails=");
        sb.append(this.e);
        sb.append(", appProcessDetails=");
        sb.append(this.f);
        sb.append(", uiOrientation=");
        return h5s.c(this.g, "}", sb);
    }
}
