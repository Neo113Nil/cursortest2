package xsna;

import android.content.Context;
import com.vk.catalog2.common.dto.api.CatalogButtonFilters;
import com.vk.catalog2.common.dto.api.CatalogButtonSearchMode;
import com.vk.catalog2.common.dto.api.CatalogCatalog;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.catalog2.common.dto.api.badge.CatalogBadge;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import com.vk.catalog2.common.dto.api.style.SearchModeActionStyle;
import com.vk.catalog2.feature.music.offline.content.OfflineCatalogCategories;
import com.vk.dto.common.Image;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.p4g;
import xsna.yym0;

/* compiled from: OfflineMusicCatalogBlockGenerator.kt */
/* loaded from: classes16.dex */
public final class lu70 {
    public final g950 a;
    public final gzs<Boolean> b;
    public final gzs<Boolean> c;
    public final gzs<Boolean> d;
    public final gzs<Boolean> e;
    public final bpn0 f = new bpn0(new ku70(0));

    /* compiled from: OfflineMusicCatalogBlockGenerator.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OfflineCatalogCategories.values().length];
            try {
                iArr[OfflineCatalogCategories.All.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OfflineCatalogCategories.Tracks.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OfflineCatalogCategories.AutoDownload.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OfflineCatalogCategories.Albums.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OfflineCatalogCategories.Playlists.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OfflineCatalogCategories.Podcasts.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[OfflineCatalogCategories.Audiobooks.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public lu70(g950 g950Var, gzs gzsVar, gzs gzsVar2, gzs gzsVar3, gzs gzsVar4) {
        this.a = g950Var;
        this.b = gzsVar;
        this.c = gzsVar2;
        this.d = gzsVar3;
        this.e = gzsVar4;
    }

    public static CatalogSection a(mt70 mt70Var) {
        ArrayList a2 = new v150(mt70Var.g, true, 6).a(mt70Var);
        String string = mt70Var.d.getString(R.string.music_title_albums);
        EmptyList emptyList = EmptyList.b;
        return new CatalogSection("synthetic_offline_music_album_all", null, string, null, null, null, emptyList, a2, emptyList, null, null, null, null, null, 15360, null);
    }

    public static ArrayList c(mt70 mt70Var) {
        v150 v150Var = new v150(false, false, 14);
        List<String> list = mt70Var.b.get(CatalogDataType.DATA_TYPE_MUSIC_PLAYLISTS);
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list);
        return arrayList.isEmpty() ? new ArrayList() : e43.o(v150Var.b(mt70Var.a, arrayList, mt70Var.p));
    }

    public static ArrayList d(mt70 mt70Var) {
        List<String> list = mt70Var.b.get(CatalogDataType.DATA_TYPE_MUSIC_TRACKS);
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list);
        return arrayList.isEmpty() ? new ArrayList() : e43.o(ho50.b(mt70Var.a, arrayList, mt70Var.p));
    }

    public static /* synthetic */ CatalogSection g(lu70 lu70Var, mt70 mt70Var, String str, int i) {
        if ((i & 2) != 0) {
            str = "synthetic_offline_section";
        }
        return lu70Var.f(mt70Var, str, null);
    }

    public static CatalogSection h(mt70 mt70Var) {
        ArrayList a2 = new v150(mt70Var.g, true, 6).a(mt70Var);
        String string = mt70Var.d.getString(R.string.catalog_offline_playlists_header);
        EmptyList emptyList = EmptyList.b;
        return new CatalogSection("synthetic_offline_music_playlist_all", null, string, null, null, null, emptyList, a2, emptyList, null, null, null, null, null, 15360, null);
    }

    public static boolean k(mt70 mt70Var) {
        if (mt70Var.b.get(CatalogDataType.DATA_TYPE_MUSIC_TRACKS) != null) {
            return !r1.isEmpty();
        }
        return false;
    }

    public static boolean l(mt70 mt70Var) {
        List<String> list = mt70Var.b.get(CatalogDataType.DATA_TYPE_MUSIC_PLAYLISTS);
        return ((list == null || !(list.isEmpty() ^ true)) && mt70Var.c(OfflineCatalogCategories.Playlists).isEmpty() && mt70Var.c(OfflineCatalogCategories.Albums).isEmpty()) ? false : true;
    }

    public static CatalogFilterData p(Context context, String str) {
        return new CatalogFilterData("offline_music_replacement_old_first", context.getString(R.string.catalog_offline_old_replacement), null, epx.f(str, "offline_music_replacement_old_first"), null, null, null, null, null, 480, null);
    }

    public static CatalogFilterData q(Context context, String str) {
        return new CatalogFilterData("offline_music_replacement_name", context.getString(R.string.catalog_offline_name_replacement_redesign), null, epx.f(str, "offline_music_replacement_name"), null, null, null, null, null, 480, null);
    }

    public final List<CatalogBlock> b(mt70 mt70Var) {
        pt70 pt70Var;
        boolean k = k(mt70Var);
        boolean z = mt70Var.f;
        boolean z2 = mt70Var.q;
        if (!k && !l(mt70Var)) {
            if (z2) {
                Collection<Map<CatalogDataType, List<String>>> values = mt70Var.c.values();
                if (!(values instanceof Collection) || !values.isEmpty()) {
                    Iterator<T> it = values.iterator();
                    while (it.hasNext()) {
                        Collection values2 = ((Map) it.next()).values();
                        if (!(values2 instanceof Collection) || !values2.isEmpty()) {
                            Iterator it2 = values2.iterator();
                            while (it2.hasNext()) {
                                if (!((List) it2.next()).isEmpty()) {
                                }
                            }
                        }
                    }
                }
            }
            com.vk.core.utils.newtork.b.a.getClass();
            boolean d = com.vk.core.utils.newtork.b.d();
            ArrayList arrayList = new ArrayList();
            if (z2) {
                arrayList.add(i(z ? null : OfflineCatalogCategories.All.o(), new yym0.a(d, d)));
                boolean c = this.a.c();
                if (!z && (c || d)) {
                    arrayList.add(new cq40());
                }
            } else {
                arrayList.add(i(null, new yym0.a(false, false)));
            }
            ot70[] ot70VarArr = (ot70[]) arrayList.toArray(new ot70[0]);
            pt70Var = new pt70((ot70[]) Arrays.copyOf(ot70VarArr, ot70VarArr.length));
            return pt70Var.a(mt70Var);
        }
        ArrayList arrayList2 = new ArrayList();
        if (z) {
            arrayList2.add(new v150(mt70Var.h, false, mt70Var.g, true));
            arrayList2.add(new ho50());
        } else {
            ot70 td50Var = new td50(mt70Var.l);
            if (z2) {
                if (!k(mt70Var)) {
                    td50Var = i(OfflineCatalogCategories.All.o(), new yym0.a(true, true));
                }
                ot70[] ot70VarArr2 = {td50Var, new wt70(CatalogDataType.DATA_TYPE_MUSIC_PLAYLISTS), new cq40()};
                p4g.a aVar = p4g.a;
                g5g.A(arrayList2, ot70VarArr2);
            } else {
                ot70[] ot70VarArr3 = {new v150(true, false, 6), td50Var};
                p4g.a aVar2 = p4g.a;
                g5g.A(arrayList2, ot70VarArr3);
            }
        }
        ot70[] ot70VarArr4 = (ot70[]) arrayList2.toArray(new ot70[0]);
        pt70Var = new pt70((ot70[]) Arrays.copyOf(ot70VarArr4, ot70VarArr4.length));
        return pt70Var.a(mt70Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
    public final CatalogCatalog e(mt70 mt70Var) {
        List singletonList;
        List list;
        if (mt70Var.q && mt70Var.l) {
            OfflineCatalogCategories.Companion.getClass();
            list = OfflineCatalogCategories.sortedForSearchSections;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((OfflineCatalogCategories) obj).r().invoke().booleanValue()) {
                    arrayList.add(obj);
                }
            }
            singletonList = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                OfflineCatalogCategories offlineCatalogCategories = (OfflineCatalogCategories) it.next();
                singletonList.add(f(mt70Var, offlineCatalogCategories.n(), Integer.valueOf(offlineCatalogCategories.p())));
            }
        } else {
            singletonList = Collections.singletonList(g(this, mt70Var, null, 6));
        }
        return new CatalogCatalog(singletonList, "synthetic_offline_section", null, null, null, null, false, 96, null);
    }

    public final CatalogSection f(mt70 mt70Var, String str, Integer num) {
        Integer num2;
        String str2;
        List<CatalogBlock> b;
        boolean z;
        List list;
        List l;
        ot70 pt70Var;
        boolean z2;
        Object obj;
        boolean z3 = mt70Var.q;
        Context context = mt70Var.d;
        if (num == null) {
            Iterator<E> it = OfflineCatalogCategories.l().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (epx.f(((OfflineCatalogCategories) obj).o(), str)) {
                    break;
                }
            }
            OfflineCatalogCategories offlineCatalogCategories = (OfflineCatalogCategories) obj;
            num2 = offlineCatalogCategories != null ? Integer.valueOf(offlineCatalogCategories.k()) : null;
        } else {
            num2 = num;
        }
        if (num2 == null || (str2 = context.getString(num2.intValue())) == null) {
            str2 = "Offline Music";
        }
        String str3 = str2;
        List<String> list2 = s9a.a;
        if (z3 && !mt70Var.f) {
            OfflineCatalogCategories.Companion.getClass();
            OfflineCatalogCategories a2 = OfflineCatalogCategories.c.a(str);
            switch (a2 == null ? -1 : a.$EnumSwitchMapping$0[a2.ordinal()]) {
                case -1:
                    b = b(mt70Var);
                    break;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                    if (!epx.f(a2.n(), str)) {
                        b = b(mt70Var);
                        break;
                    } else {
                        if (k(mt70Var) || l(mt70Var) || m(mt70Var) || j(mt70Var)) {
                            ot70[] ot70VarArr = (ot70[]) rl3.I(new ot70[]{new td50(mt70Var.l), new rt70(), new st70(), new qt70()}).toArray(new ot70[0]);
                            pt70Var = new pt70((ot70[]) Arrays.copyOf(ot70VarArr, ot70VarArr.length));
                        } else {
                            pt70Var = i(str, new yym0.a(true, true));
                        }
                        b = pt70Var.a(mt70Var);
                        break;
                    }
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    if (!n(a2, mt70Var)) {
                        b = new com.vk.catalog2.feature.music.offline.content.b(str, a2).a(mt70Var);
                        break;
                    } else {
                        boolean f = epx.f(str, a2.n());
                        if (!f) {
                            com.vk.core.utils.newtork.b.a.getClass();
                            if (!com.vk.core.utils.newtork.b.d()) {
                                z2 = false;
                                b = i(str, new yym0.a(z2, f)).a(mt70Var);
                                break;
                            }
                        }
                        z2 = true;
                        b = i(str, new yym0.a(z2, f)).a(mt70Var);
                    }
            }
        } else {
            b = b(mt70Var);
        }
        List<CatalogBlock> list3 = b;
        boolean z4 = z3 && mt70Var.n;
        OfflineCatalogCategories.Companion.getClass();
        OfflineCatalogCategories a3 = OfflineCatalogCategories.c.a(str);
        if (a3 == OfflineCatalogCategories.AutoDownload) {
            list = EmptyList.b;
        } else {
            if (mt70Var.m.length() == 0) {
                if (a3 != null ? n(a3, mt70Var) : false) {
                    z = true;
                    if (z4 || z) {
                        list = EmptyList.b;
                    } else {
                        String str4 = mt70Var.a;
                        switch (a3 != null ? a.$EnumSwitchMapping$0[a3.ordinal()] : -1) {
                            case -1:
                            case 1:
                            case 2:
                            case 4:
                                if (!((Boolean) this.f.getValue()).booleanValue()) {
                                    l = e43.l(o(context, str4), p(context, str4), q(context, str4), new CatalogFilterData("offline_music_replacement_artist", context.getString(R.string.catalog_offline_artist_replacement_redesign), null, epx.f(str4, "offline_music_replacement_artist"), null, null, null, null, null, 480, null));
                                    break;
                                } else {
                                    int i = 480;
                                    zcl zclVar = null;
                                    String str5 = null;
                                    Image image = null;
                                    CatalogBadge catalogBadge = null;
                                    String str6 = null;
                                    String str7 = null;
                                    CatalogFilterData.FromType fromType = null;
                                    l = e43.l(new CatalogFilterData("offline_music_replacement_default", context.getString(R.string.catalog_offline_default_replacement_redesign), str5, epx.f(str4, "offline_music_replacement_default"), image, catalogBadge, str6, str7, fromType, i, zclVar), o(context, str4), p(context, str4), q(context, str4), new CatalogFilterData("offline_music_replacement_artist", context.getString(R.string.catalog_offline_artist_replacement_redesign), str5, epx.f(str4, "offline_music_replacement_artist"), image, catalogBadge, str6, str7, fromType, i, zclVar));
                                    break;
                                }
                            case 0:
                            default:
                                throw new NoWhenBranchMatchedException();
                            case 3:
                                l = EmptyList.b;
                                break;
                            case 5:
                                int i2 = 480;
                                zcl zclVar2 = null;
                                String str8 = null;
                                Image image2 = null;
                                CatalogBadge catalogBadge2 = null;
                                String str9 = null;
                                String str10 = null;
                                CatalogFilterData.FromType fromType2 = null;
                                l = e43.l(o(context, str4), p(context, str4), new CatalogFilterData("offline_music_replacement_by_user", context.getString(R.string.catalog_offline_by_user_replacement_redesign), str8, epx.f(str4, "offline_music_replacement_by_user"), image2, catalogBadge2, str9, str10, fromType2, i2, zclVar2), new CatalogFilterData("offline_music_replacement_added", context.getString(R.string.catalog_offline_added_replacement_redesign), str8, epx.f(str4, "offline_music_replacement_added"), image2, catalogBadge2, str9, str10, fromType2, i2, zclVar2), q(context, str4));
                                break;
                            case 6:
                            case 7:
                                l = e43.l(o(context, str4), p(context, str4), q(context, str4));
                                break;
                        }
                        list = e43.l(new CatalogButtonFilters("select_sorting", null, "synthetic_offline_tracks", "", l, null, null, 96, null), new CatalogButtonSearchMode("search_mode", null, str, null, str, null, null, null, SearchModeActionStyle.Style.AfterToolbar.i(), 224, null));
                    }
                }
            }
            z = false;
            if (z4) {
            }
            list = EmptyList.b;
        }
        return new CatalogSection(str, null, str3, null, null, null, list2, list3, list, null, null, null, null, null, 15360, null);
    }

    public final ot70 i(String str, yym0.a aVar) {
        return this.a.c() ? new com.vk.catalog2.feature.music.offline.content.a(str, this.e.invoke().booleanValue()) : new yym0(aVar);
    }

    public final boolean j(mt70 mt70Var) {
        return this.b.invoke().booleanValue() && !mt70Var.c(OfflineCatalogCategories.Audiobooks).isEmpty();
    }

    public final boolean m(mt70 mt70Var) {
        return this.c.invoke().booleanValue() && !mt70Var.c(OfflineCatalogCategories.Podcasts).isEmpty();
    }

    public final boolean n(OfflineCatalogCategories offlineCatalogCategories, mt70 mt70Var) {
        switch (a.$EnumSwitchMapping$0[offlineCatalogCategories.ordinal()]) {
            case 1:
                return (k(mt70Var) || l(mt70Var)) ? false : true;
            case 2:
                return !k(mt70Var);
            case 3:
                return !this.d.invoke().booleanValue() || mt70Var.c(OfflineCatalogCategories.AutoDownload).isEmpty();
            case 4:
                return mt70Var.c(OfflineCatalogCategories.Albums).isEmpty();
            case 5:
                return mt70Var.c(OfflineCatalogCategories.Playlists).isEmpty();
            case 6:
                return !m(mt70Var);
            case 7:
                return !j(mt70Var);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final CatalogFilterData o(Context context, String str) {
        if (((Boolean) this.f.getValue()).booleanValue()) {
            return new CatalogFilterData("offline_music_replacement_new_first", context.getString(R.string.catalog_offline_new_replacement), null, epx.f(str, "offline_music_replacement_new_first"), null, null, null, null, null, 480, null);
        }
        return new CatalogFilterData("offline_music_replacement_default", context.getString(R.string.catalog_offline_new_replacement), null, epx.f(str, "offline_music_replacement_default"), null, null, null, null, null, 480, null);
    }
}
