package xsna;

import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Image;
import com.vk.dto.shortvideo.ClipGridParams;
import java.util.List;
import kotlin.Pair;
import xsna.a3p0;

/* compiled from: GridLoadStrategy.kt */
/* loaded from: classes17.dex */
public abstract class wfu {
    public final wee a;

    public wfu(wee weeVar) {
        this.a = weeVar;
    }

    public abstract void a(a aVar, List<ClipGridParams.Data.Profile> list);

    public abstract io.reactivex.rxjava3.core.x<a> b();

    /* compiled from: GridLoadStrategy.kt */
    public static abstract class a {

        /* compiled from: GridLoadStrategy.kt */
        /* renamed from: xsna.wfu$a$a, reason: collision with other inner class name */
        public static final class C3931a extends a {
            public final fde a;
            public final ild b;
            public final a3p0.a.C2519a c;

            public C3931a(fde fdeVar, ild ildVar, a3p0.a.C2519a c2519a) {
                this.a = fdeVar;
                this.b = ildVar;
                this.c = c2519a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3931a)) {
                    return false;
                }
                C3931a c3931a = (C3931a) obj;
                return epx.f(this.a, c3931a.a) && epx.f(this.b, c3931a.b) && epx.f(this.c, c3931a.c);
            }

            public final int hashCode() {
                int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
                a3p0.a.C2519a c2519a = this.c;
                return hashCode + (c2519a == null ? 0 : c2519a.hashCode());
            }

            public final String toString() {
                return "CommonGridData(clipsHeader=" + this.a + ", challenge=" + this.b + ", trendsBanner=" + this.c + ')';
            }
        }

        /* compiled from: GridLoadStrategy.kt */
        public static final class b extends a {
            public final nee a;
            public final List<Pair<ClipVideoFile, ceq0>> b;
            public final List<Pair<ClipVideoFile, ceq0>> c;
            public final List<tce> d;

            /* JADX WARN: Multi-variable type inference failed */
            public b(nee neeVar, List<? extends Pair<ClipVideoFile, ? extends ceq0>> list, List<? extends Pair<ClipVideoFile, ? extends ceq0>> list2, List<tce> list3) {
                this.a = neeVar;
                this.b = list;
                this.c = list2;
                this.d = list3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + fw3.a(fw3.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OwnerGridData(remoteData=");
                sb.append(this.a);
                sb.append(", localList=");
                sb.append(this.b);
                sb.append(", localDelayedList=");
                sb.append(this.c);
                sb.append(", drafts=");
                return ms9.a(')', sb, this.d);
            }
        }

        /* compiled from: GridLoadStrategy.kt */
        public static final class c extends a {
            public final jpe a;

            public c(jpe jpeVar) {
                this.a = jpeVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "PageGridData(clipsPage=" + this.a + ')';
            }
        }

        /* compiled from: GridLoadStrategy.kt */
        public static final class d extends a {
            public final String a;
            public final String b;
            public final Image c;

            public d(String str, String str2, Image image) {
                this.a = str;
                this.b = str2;
                this.c = image;
            }

            public final Image a() {
                return this.c;
            }

            public final String b() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c);
            }

            public final int hashCode() {
                String str = this.a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                Image image = this.c;
                return hashCode2 + (image != null ? image.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("StubData(title=");
                sb.append(this.a);
                sb.append(", id=");
                sb.append(this.b);
                sb.append(", image=");
                return er.d(sb, this.c, ')');
            }

            public d() {
                this(null, null, null);
            }
        }
    }
}
