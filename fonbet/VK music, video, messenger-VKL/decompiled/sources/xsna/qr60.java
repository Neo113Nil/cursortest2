package xsna;

import com.vk.dto.newsfeed.activities.Activity;
import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* compiled from: NewsfeedListPatch.kt */
/* loaded from: classes4.dex */
public interface qr60 extends yl50 {

    /* compiled from: NewsfeedListPatch.kt */
    public interface a extends qr60 {

        /* compiled from: NewsfeedListPatch.kt */
        /* renamed from: xsna.qr60$a$a, reason: collision with other inner class name */
        public static final class C3569a implements a {
            public final Map<Pair<Long, Integer>, Activity> a;

            /* JADX WARN: Multi-variable type inference failed */
            public C3569a(Map<Pair<Long, Integer>, ? extends Activity> map) {
                this.a = map;
            }
        }

        /* compiled from: NewsfeedListPatch.kt */
        public static final class b implements a {
            public static final b a = new b();
        }

        /* compiled from: NewsfeedListPatch.kt */
        public static final class c implements a {
            public final ArrayList a;
            public final og50 b;
            public final boolean c;
            public final Map<Pair<Long, Integer>, Activity> d;

            public c() {
                throw null;
            }

            public c(ArrayList arrayList, og50 og50Var, boolean z, Map map, int i) {
                z = (i & 4) != 0 ? false : z;
                map = (i & 8) != 0 ? null : map;
                this.a = arrayList;
                this.b = og50Var;
                this.c = z;
                this.d = map;
            }
        }

        /* compiled from: NewsfeedListPatch.kt */
        public static final class d implements a {
            public final boolean a;

            public d(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.a == ((d) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("LoaderPatch(isVisible="), this.a, ')');
            }
        }

        /* compiled from: NewsfeedListPatch.kt */
        public static final class e implements a {
            public final ListLoadingState a;

            public e(ListLoadingState listLoadingState) {
                this.a = listLoadingState;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && this.a == ((e) obj).a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "LoadingStatePatch(loadingState=" + this.a + ')';
            }
        }

        /* compiled from: NewsfeedListPatch.kt */
        public static final class f implements a {
            public final List<ol60> a;
            public final c9x b;
            public final String c;

            /* JADX WARN: Multi-variable type inference failed */
            public f(List<? extends ol60> list, c9x c9xVar, String str) {
                this.a = list;
                this.b = c9xVar;
                this.c = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return epx.f(this.a, fVar.a) && epx.f(this.b, fVar.b) && epx.f(this.c, fVar.c);
            }

            public final int hashCode() {
                int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
                String str = this.c;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("PageLoaded(items=NewsfeedHolderUiDto@");
                List<ol60> list = this.a;
                sb.append(h2v.d(System.identityHashCode(list)));
                sb.append('[');
                sb.append(list.size());
                sb.append("], offsets=NewsfeedHolderOffsets@");
                c9x c9xVar = this.b;
                sb.append(h2v.d(System.identityHashCode(c9xVar)));
                sb.append('[');
                sb.append(c9xVar.e);
                sb.append("], nextFrom=");
                return ho8.a(sb, this.c, ')');
            }
        }

        /* compiled from: NewsfeedListPatch.kt */
        public static final class g implements a {
            public final List<ol60> a;
            public final c9x b;
            public final String c;
            public final boolean d;
            public final boolean e;
            public final Integer f;
            public final a9q0 g;

            public g() {
                throw null;
            }

            public g(List list, c9x c9xVar, String str, boolean z, boolean z2, Integer num, a9q0 a9q0Var, int i) {
                num = (i & 32) != 0 ? null : num;
                a9q0Var = (i & 64) != 0 ? null : a9q0Var;
                this.a = list;
                this.b = c9xVar;
                this.c = str;
                this.d = z;
                this.e = z2;
                this.f = num;
                this.g = a9q0Var;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Reloaded(items=NewsfeedHolderUiDto@");
                List<ol60> list = this.a;
                sb.append(h2v.d(System.identityHashCode(list)));
                sb.append('[');
                sb.append(list.size());
                sb.append("], offsets=NewsfeedHolderOffsets@");
                c9x c9xVar = this.b;
                sb.append(h2v.d(System.identityHashCode(c9xVar)));
                sb.append('[');
                sb.append(c9xVar.e);
                sb.append("], nextFrom=");
                sb.append(this.c);
                sb.append(", shouldScrollToTop=");
                sb.append(this.d);
                sb.append(", shouldRestoreScroll=");
                sb.append(this.e);
                sb.append(", scrollToPosition=");
                sb.append(this.f);
                sb.append(", reason=");
                sb.append(this.g);
                sb.append(')');
                return sb.toString();
            }
        }

        /* compiled from: NewsfeedListPatch.kt */
        public static final class h implements a {
            public final LinkedHashMap a;

            public h(LinkedHashMap linkedHashMap) {
                this.a = linkedHashMap;
            }
        }
    }
}
