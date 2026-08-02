package xsna;

import android.content.Context;
import com.vk.dto.market.catalog.CatalogMarketCategoryContext;
import com.vk.dto.market.catalog.CatalogMarketFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: OpenMarketCatalogFilterDialogParams.kt */
/* loaded from: classes18.dex */
public final class kr80 {
    public final Context a;
    public final CatalogMarketFilter b;
    public final Object c;
    public final ArrayList d;
    public final b e;
    public final String f;
    public final String g;

    /* compiled from: OpenMarketCatalogFilterDialogParams.kt */
    public static final class a {
        public final CatalogMarketCategoryContext.Context a;
        public final CatalogMarketCategoryContext.Context b;
        public final List<List<Integer>> c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(CatalogMarketCategoryContext.Context context, CatalogMarketCategoryContext.Context context2, List<? extends List<Integer>> list) {
            this.a = context;
            this.b = context2;
            this.c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CategoryMapping(from=");
            sb.append(this.a);
            sb.append(", to=");
            sb.append(this.b);
            sb.append(", mappings=");
            return ms9.a(')', sb, this.c);
        }
    }

    /* compiled from: OpenMarketCatalogFilterDialogParams.kt */
    public static final class b {
        public final String a;
        public final double b;
        public final double c;

        public b(String str, double d, double d2) {
            this.a = str;
            this.b = d;
            this.c = d2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && Double.compare(this.b, bVar.b) == 0 && Double.compare(this.c, bVar.c) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.c) + zjh0.b(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Location(name=");
            sb.append(this.a);
            sb.append(", latitude=");
            sb.append(this.b);
            sb.append(", longitude=");
            return ojp0.a(sb, this.c, ')');
        }
    }

    public kr80(Context context, CatalogMarketFilter catalogMarketFilter, Map map, ArrayList arrayList, b bVar, String str, String str2) {
        this.a = context;
        this.b = catalogMarketFilter;
        this.c = map;
        this.d = arrayList;
        this.e = bVar;
        this.f = str;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kr80)) {
            return false;
        }
        kr80 kr80Var = (kr80) obj;
        return epx.f(this.a, kr80Var.a) && epx.f(this.b, kr80Var.b) && this.c.equals(kr80Var.c) && this.d.equals(kr80Var.d) && epx.f(this.e, kr80Var.e) && epx.f(this.f, kr80Var.f) && epx.f(this.g, kr80Var.g);
    }

    public final int hashCode() {
        int a2 = qr.a(this.d, vul0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31);
        b bVar = this.e;
        return this.g.hashCode() + urd0.a((a2 + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenMarketCatalogFilterDialogParams(ctx=");
        sb.append(this.a);
        sb.append(", currentFilter=");
        sb.append(this.b);
        sb.append(", categoriesTrees=");
        sb.append(this.c);
        sb.append(", categoryMappings=");
        sb.append(this.d);
        sb.append(", location=");
        sb.append(this.e);
        sb.append(", entryPointToken=");
        sb.append(this.f);
        sb.append(", sourceBlockId=");
        return ho8.a(sb, this.g, ')');
    }
}
