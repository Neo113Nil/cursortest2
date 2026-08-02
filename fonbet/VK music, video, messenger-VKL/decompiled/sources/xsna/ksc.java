package xsna;

import com.vk.clips.viewer.edit.presentation.model.coauthors.CoauthorsBannerVS;
import java.util.ArrayList;

/* compiled from: ClipEditSdkCoauthorsVS.kt */
/* loaded from: classes17.dex */
public interface ksc {

    /* compiled from: ClipEditSdkCoauthorsVS.kt */
    public static final class a implements ksc {
        public final boolean a;
        public final CoauthorsBannerVS b;

        public a(boolean z, CoauthorsBannerVS coauthorsBannerVS) {
            this.a = z;
            this.b = coauthorsBannerVS;
        }

        @Override // xsna.ksc
        public final boolean a() {
            return this.a;
        }

        @Override // xsna.ksc
        public final CoauthorsBannerVS b() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.a) * 31;
            CoauthorsBannerVS coauthorsBannerVS = this.b;
            return hashCode + (coauthorsBannerVS == null ? 0 : coauthorsBannerVS.hashCode());
        }

        public final String toString() {
            return "Empty(isCoauthorsRedesign=" + this.a + ", restrictionVS=" + this.b + ')';
        }
    }

    /* compiled from: ClipEditSdkCoauthorsVS.kt */
    public static final class b implements ksc {
        public final boolean a;
        public final CoauthorsBannerVS b;
        public final ArrayList c;

        public b(boolean z, CoauthorsBannerVS coauthorsBannerVS, ArrayList arrayList) {
            this.a = z;
            this.b = coauthorsBannerVS;
            this.c = arrayList;
        }

        @Override // xsna.ksc
        public final boolean a() {
            return this.a;
        }

        @Override // xsna.ksc
        public final CoauthorsBannerVS b() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c.equals(bVar.c);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.a) * 31;
            CoauthorsBannerVS coauthorsBannerVS = this.b;
            return this.c.hashCode() + ((hashCode + (coauthorsBannerVS == null ? 0 : coauthorsBannerVS.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Multiple(isCoauthorsRedesign=");
            sb.append(this.a);
            sb.append(", restrictionVS=");
            sb.append(this.b);
            sb.append(", coauthors=");
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.c);
        }
    }

    /* compiled from: ClipEditSdkCoauthorsVS.kt */
    public static final class c implements ksc {
        public final boolean a;
        public final CoauthorsBannerVS b;
        public final pyf c;

        public c(boolean z, CoauthorsBannerVS coauthorsBannerVS, pyf pyfVar) {
            this.a = z;
            this.b = coauthorsBannerVS;
            this.c = pyfVar;
        }

        @Override // xsna.ksc
        public final boolean a() {
            return this.a;
        }

        @Override // xsna.ksc
        public final CoauthorsBannerVS b() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b && epx.f(this.c, cVar.c);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.a) * 31;
            CoauthorsBannerVS coauthorsBannerVS = this.b;
            return this.c.hashCode() + ((hashCode + (coauthorsBannerVS == null ? 0 : coauthorsBannerVS.hashCode())) * 31);
        }

        public final String toString() {
            return "Single(isCoauthorsRedesign=" + this.a + ", restrictionVS=" + this.b + ", coauthor=" + this.c + ')';
        }
    }

    boolean a();

    CoauthorsBannerVS b();
}
