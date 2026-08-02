package xsna;

import android.content.Context;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.feature.music.myaudio.MusicCollectionType;
import com.vk.catalog2.feature.music.offline.content.OfflineCatalogCategories;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.builders.MapBuilder;

/* compiled from: OfflineCatalogConfig.kt */
/* loaded from: classes16.dex */
public final class mt70 {
    public final String a;
    public final Map<CatalogDataType, List<String>> b;
    public final Map<String, Map<CatalogDataType, List<String>>> c;
    public final Context d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final List<MusicCollectionType> h;
    public final Map<String, Integer> i;
    public final int j;
    public final int k;
    public final boolean l;
    public final String m;
    public final boolean n;
    public final yp40 o;
    public final boolean p;
    public final boolean q;
    public final int r;

    public mt70(String str, MapBuilder mapBuilder, MapBuilder mapBuilder2, Context context, String str2, boolean z, boolean z2, ListBuilder listBuilder, LinkedHashMap linkedHashMap, int i, int i2, boolean z3, String str3, boolean z4, yp40 yp40Var, boolean z5, boolean z6, int i3) {
        this.a = str;
        this.b = mapBuilder;
        this.c = mapBuilder2;
        this.d = context;
        this.e = str2;
        this.f = z;
        this.g = z2;
        this.h = listBuilder;
        this.i = linkedHashMap;
        this.j = i;
        this.k = i2;
        this.l = z3;
        this.m = str3;
        this.n = z4;
        this.o = yp40Var;
        this.p = z5;
        this.q = z6;
        this.r = i3;
    }

    public final int a(String str) {
        Integer num = this.i.get(str);
        return num != null ? num.intValue() : this.j;
    }

    public final List<String> b(OfflineCatalogCategories offlineCatalogCategories) {
        List<String> list;
        CatalogDataType i = offlineCatalogCategories.i();
        Map<CatalogDataType, List<String>> map = this.c.get(offlineCatalogCategories.o());
        if (map != null && (list = map.get(i)) != null) {
            return list;
        }
        List<String> list2 = this.b.get(i);
        return list2 == null ? EmptyList.b : list2;
    }

    public final List<String> c(OfflineCatalogCategories offlineCatalogCategories) {
        Map<CatalogDataType, List<String>> map = this.c.get(offlineCatalogCategories.o());
        List<String> list = map != null ? map.get(offlineCatalogCategories.i()) : null;
        return list == null ? EmptyList.b : list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mt70)) {
            return false;
        }
        mt70 mt70Var = (mt70) obj;
        return epx.f(this.a, mt70Var.a) && epx.f(this.b, mt70Var.b) && epx.f(this.c, mt70Var.c) && epx.f(this.d, mt70Var.d) && epx.f(this.e, mt70Var.e) && this.f == mt70Var.f && this.g == mt70Var.g && epx.f(this.h, mt70Var.h) && epx.f(this.i, mt70Var.i) && this.j == mt70Var.j && this.k == mt70Var.k && this.l == mt70Var.l && epx.f(this.m, mt70Var.m) && this.n == mt70Var.n && epx.f(this.o, mt70Var.o) && this.p == mt70Var.p && this.q == mt70Var.q && this.r == mt70Var.r;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + v11.a(v11.a(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        String str = this.e;
        return Integer.hashCode(this.r) + qoy.b(qoy.b((this.o.hashCode() + qoy.b(urd0.a(qoy.b(shy.a(this.k, shy.a(this.j, v11.a(fw3.a(qoy.b(qoy.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31), 31), 31, this.l), 31, this.m), 31, this.n)) * 31, 31, this.p), 31, this.q);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OfflineCatalogConfig(blockId=");
        sb.append(this.a);
        sb.append(", itemIds=");
        sb.append(this.b);
        sb.append(", itemIdsBySectionId=");
        sb.append(this.c);
        sb.append(", context=");
        sb.append(this.d);
        sb.append(", url=");
        sb.append(this.e);
        sb.append(", redesignedBlocks=");
        sb.append(this.f);
        sb.append(", withoutActions=");
        sb.append(this.g);
        sb.append(", contentTypes=");
        sb.append(this.h);
        sb.append(", emptyPlaceholders=");
        sb.append(this.i);
        sb.append(", emptyPlaceholderFallbackRes=");
        sb.append(this.j);
        sb.append(", emptySearchPlaceholderRes=");
        sb.append(this.k);
        sb.append(", isSearch=");
        sb.append(this.l);
        sb.append(", searchQuery=");
        sb.append(this.m);
        sb.append(", isShowAllScreen=");
        sb.append(this.n);
        sb.append(", durationsData=");
        sb.append(this.o);
        sb.append(", isKidsContext=");
        sb.append(this.p);
        sb.append(", isNewDownloads=");
        sb.append(this.q);
        sb.append(", downloadedPodcastEpisodesCount=");
        return vu5.b(sb, this.r, ')');
    }
}
