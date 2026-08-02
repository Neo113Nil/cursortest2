package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import xsna.j5k;

/* compiled from: AutoValue_CrashlyticsReport_FilesPayload.java */
/* loaded from: classes.dex */
public final class zk5 extends j5k.d {
    public final List<j5k.d.b> a;
    public final String b;

    /* compiled from: AutoValue_CrashlyticsReport_FilesPayload.java */
    /* loaded from: classes13.dex */
    public static final class a extends j5k.d.a {
        public List<j5k.d.b> a;
        public String b;

        public final zk5 a() {
            List<j5k.d.b> list = this.a;
            if (list != null) {
                return new zk5(list, this.b);
            }
            throw new IllegalStateException("Missing required properties: files");
        }

        public final a b(List list) {
            if (list == null) {
                throw new NullPointerException("Null files");
            }
            this.a = list;
            return this;
        }

        public final a c(String str) {
            this.b = str;
            return this;
        }
    }

    public zk5() {
        throw null;
    }

    public zk5(List list, String str) {
        this.a = list;
        this.b = str;
    }

    @Override // xsna.j5k.d
    @NonNull
    public final List<j5k.d.b> a() {
        return this.a;
    }

    @Override // xsna.j5k.d
    @Nullable
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j5k.d)) {
            return false;
        }
        j5k.d dVar = (j5k.d) obj;
        if (!this.a.equals(dVar.a())) {
            return false;
        }
        String str = this.b;
        return str == null ? dVar.b() == null : str.equals(dVar.b());
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilesPayload{files=");
        sb.append(this.a);
        sb.append(", orgId=");
        return i5s.a(sb, this.b, "}");
    }
}
