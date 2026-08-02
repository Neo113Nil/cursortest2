package xsna;

import com.vk.dto.common.Image;
import com.vk.ecomm.categories.api.MarketBridgeCategory;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: CategoriesState.kt */
/* loaded from: classes18.dex */
public interface z890 {
    public static final a a = a.a;

    /* compiled from: CategoriesState.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final b b = new b("", EmptyList.b);
    }

    /* compiled from: CategoriesState.kt */
    public static final class b implements z890 {
        public final String b;
        public final List c;

        public b(String str, List list) {
            this.b = str;
            this.c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        @Override // xsna.z890
        public final String getTitle() {
            return this.b;
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ContentEntryList(title=");
            sb.append(this.b);
            sb.append(", content=");
            return jr.a(')', sb, this.c);
        }
    }

    /* compiled from: CategoriesState.kt */
    public static final class c implements z890 {
        public final String b;
        public final int c;
        public final List d;

        public c(String str, int i, List list) {
            this.b = str;
            this.c = i;
            this.d = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.b, cVar.b) && this.c == cVar.c && epx.f(this.d, cVar.d);
        }

        @Override // xsna.z890
        public final String getTitle() {
            return this.b;
        }

        public final int hashCode() {
            return this.d.hashCode() + shy.a(this.c, this.b.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ContentTabs(title=");
            sb.append(this.b);
            sb.append(", selectedTab=");
            sb.append(this.c);
            sb.append(", content=");
            return jr.a(')', sb, this.d);
        }
    }

    /* compiled from: CategoriesState.kt */
    public static final class d {
        public final MarketBridgeCategory a;
        public final String b;
        public final Image c;

        public d(MarketBridgeCategory marketBridgeCategory, String str, Image image) {
            this.a = marketBridgeCategory;
            this.b = str;
            this.c = image;
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
            int a = urd0.a(this.a.hashCode() * 31, 31, this.b);
            Image image = this.c;
            return a + (image == null ? 0 : image.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Entry(source=");
            sb.append(this.a);
            sb.append(", title=");
            sb.append(this.b);
            sb.append(", icon=");
            return er.d(sb, this.c, ')');
        }
    }

    /* compiled from: CategoriesState.kt */
    public static final class e {
        public final String a;
        public final ArrayList b;

        public e(String str, ArrayList arrayList) {
            this.a = str;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && this.b.equals(eVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Tab(title=");
            sb.append(this.a);
            sb.append(", content=");
            return bo.c(')', sb, this.b);
        }
    }

    String getTitle();
}
