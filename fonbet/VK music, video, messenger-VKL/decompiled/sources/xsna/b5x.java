package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: InspectableView.kt */
/* loaded from: classes18.dex */
public interface b5x {

    /* compiled from: InspectableView.kt */
    public interface a {
        b getKey();
    }

    /* compiled from: InspectableView.kt */
    public interface b {

        /* compiled from: InspectableView.kt */
        public static final class a implements b {
            public static final a a = new a();
        }

        /* compiled from: InspectableView.kt */
        /* renamed from: xsna.b5x$b$b, reason: collision with other inner class name */
        public static final class C2589b implements b {
            public static final C2589b a = new C2589b();
        }
    }

    /* compiled from: InspectableView.kt */
    public static final class c {
        public final String a;
        public final String b;
        public final Integer c;
        public final String d;
        public final b5x e;
        public final Map<b, a> f;
        public final List<String> g;

        public c() {
            this(null, null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static c a(c cVar, Integer num, LinkedHashMap linkedHashMap, int i) {
            String str = cVar.a;
            String str2 = cVar.b;
            if ((i & 8) != 0) {
                num = cVar.c;
            }
            Integer num2 = num;
            String str3 = cVar.d;
            b5x b5xVar = cVar.e;
            Map map = linkedHashMap;
            if ((i & 256) != 0) {
                map = cVar.f;
            }
            return new c(str, str2, num2, str3, b5xVar, map, cVar.g);
        }

        public final c b(p6g p6gVar) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(this.f);
            linkedHashMap.put(p6gVar.getKey(), p6gVar);
            return a(this, null, linkedHashMap, 767);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d) && epx.f(this.e, cVar.e) && epx.f(this.f, cVar.f) && epx.f(this.g, cVar.g);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 961;
            Integer num = this.c;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 961;
            String str3 = this.d;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            b5x b5xVar = this.e;
            int a = v11.a((hashCode4 + (b5xVar == null ? 0 : b5xVar.hashCode())) * 961, 31, this.f);
            List<String> list = this.g;
            return a + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(originalClassName=");
            sb.append(this.a);
            sb.append(", instanceClassName=");
            sb.append(this.b);
            sb.append(", composableName=null, definedInLayoutId=");
            sb.append(this.c);
            sb.append(", initInClass=null, definedInFile=");
            sb.append(this.d);
            sb.append(", view=");
            sb.append(this.e);
            sb.append(", debug=null, issues=");
            sb.append(this.f);
            sb.append(", annotations=");
            return ms9.a(')', sb, this.g);
        }

        public c(String str, String str2, Integer num, String str3, b5x b5xVar, Map map, List list) {
            this.a = str;
            this.b = str2;
            this.c = num;
            this.d = str3;
            this.e = b5xVar;
            this.f = map;
            this.g = list;
        }

        public /* synthetic */ c(String str, String str2, String str3, b5x b5xVar, ArrayList arrayList, int i) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, null, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : b5xVar, new HashMap(), (i & 512) != 0 ? null : arrayList);
        }
    }

    c getDesignInspectorParams();

    void setDesignInspectorParams(c cVar);
}
