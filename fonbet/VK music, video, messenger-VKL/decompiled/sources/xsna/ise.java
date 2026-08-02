package xsna;

import java.util.List;
import xsna.tlo0;

/* compiled from: ClipsPlaylistsFolderItemVs.kt */
/* loaded from: classes16.dex */
public interface ise {

    /* compiled from: ClipsPlaylistsFolderItemVs.kt */
    public static final class a implements ise {
        public final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        @Override // xsna.ise
        public final int getId() {
            return -1;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("CreateItem(isEnabled="), this.a, ')');
        }
    }

    /* compiled from: ClipsPlaylistsFolderItemVs.kt */
    public static final class b implements ise {
        public final int a;
        public final List b;
        public final tlo0.h c;
        public final jqe d;

        public b(int i, List list, tlo0.h hVar, jqe jqeVar) {
            this.a = i;
            this.b = list;
            this.c = hVar;
            this.d = jqeVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && epx.f(this.b, bVar.b) && this.c.equals(bVar.c) && this.d.equals(bVar.d);
        }

        @Override // xsna.ise
        public final int getId() {
            return this.a;
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + fw3.a(Integer.hashCode(this.a) * 31, 31, this.b)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Folder(id=");
            sb.append(this.a);
            sb.append(", cover=");
            mr.c(", title=", sb, this.b);
            sb.append((Object) qow.b(this.c));
            sb.append(", iconState=");
            sb.append(this.d);
            sb.append(')');
            return sb.toString();
        }
    }

    int getId();
}
