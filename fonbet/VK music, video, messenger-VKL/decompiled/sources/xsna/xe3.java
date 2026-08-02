package xsna;

import com.vk.dto.common.data.ApiApplication;

/* compiled from: AppsGetCollectionApps.kt */
/* loaded from: classes14.dex */
public final class xe3 extends tug0<ApiApplication, a> {

    /* compiled from: AppsGetCollectionApps.kt */
    public static final class a {
        public final long a;
        public final String b;

        public a(long j, String str) {
            this.a = j;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.a) * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CollectionData(id=");
            sb.append(this.a);
            sb.append(", title=");
            return ho8.a(sb, this.b, ')');
        }
    }
}
