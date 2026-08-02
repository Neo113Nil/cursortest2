package xsna;

import com.vk.dto.common.ImageSizeKey;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.games.model.GamesHeaderSectionInfo;
import com.vk.games.presentation.catalog.model.SectionTypePrefixKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import xsna.p7t;

/* compiled from: GamesCatalogSectionData.kt */
/* loaded from: classes17.dex */
public abstract class udt implements dct {

    /* compiled from: GamesCatalogSectionData.kt */
    public static final class a extends udt {
        public final String a;
        public final g6t b;
        public final String c;
        public final String d;

        public a(String str, g6t g6tVar) {
            this.a = str;
            this.b = g6tVar;
            StringBuilder sb = new StringBuilder();
            sb.append(SectionTypePrefixKey.ACHIEVEMENT_BANNER_SECTION.h());
            sb.append('_');
            sb.append(g6tVar.a);
            sb.append('_');
            String b = vu5.b(sb, g6tVar.b, '_');
            this.c = b;
            this.d = b;
        }

        @Override // xsna.dct
        public final String F() {
            return this.c;
        }

        @Override // xsna.dct
        public final String a() {
            return this.d;
        }

        @Override // xsna.mhp0
        public final String b() {
            return this.a;
        }

        @Override // xsna.mhp0
        public final List<Long> c() {
            return null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "AchievementBannerSection(sectionTrackCode=" + this.a + ", data=" + this.b + ')';
        }
    }

    /* compiled from: GamesCatalogSectionData.kt */
    public static final class b extends udt implements xsx0 {
        public final String a;
        public final xdt b;
        public final ArrayList c;
        public final ArrayList d;
        public final String e;
        public final String f;

        public b(String str, xdt xdtVar, ArrayList arrayList) {
            WebApiApplication webApiApplication;
            WebApiApplication webApiApplication2;
            this.a = str;
            this.b = xdtVar;
            this.c = arrayList;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sbt sbtVar = ((s90) it.next()).a;
                Long valueOf = (sbtVar == null || (webApiApplication2 = sbtVar.a) == null) ? null : Long.valueOf(webApiApplication2.b);
                if (valueOf != null) {
                    arrayList2.add(valueOf);
                }
            }
            this.d = arrayList2;
            StringBuilder sb = new StringBuilder();
            sb.append(SectionTypePrefixKey.ACTIVITY_SECTION.h());
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                sb.append('_');
                sb.append(((s90) this.c.get(i)).c.a);
                sb.append('_');
                sb.append(((s90) this.c.get(i)).h);
                sb.append('_');
                sbt sbtVar2 = ((s90) this.c.get(i)).a;
                sb.append((sbtVar2 == null || (webApiApplication = sbtVar2.a) == null) ? 0L : webApiApplication.b);
            }
            sb.append('_');
            this.e = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(SectionTypePrefixKey.ACTIVITY_SECTION.h());
            for (s90 s90Var : this.c) {
                sb2.append('_');
                sb2.append(s90Var.k);
            }
            this.f = sb2.toString();
            SectionTypePrefixKey.HEADER.getClass();
            SectionTypePrefixKey.ACTIVITY_SECTION.getClass();
        }

        @Override // xsna.dct
        public final String F() {
            return this.f;
        }

        @Override // xsna.dct
        public final String a() {
            return this.e;
        }

        @Override // xsna.mhp0
        public final String b() {
            return this.a;
        }

        @Override // xsna.mhp0
        public final List<Long> c() {
            return this.d;
        }

        @Override // xsna.xsx0
        public final xdt d() {
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
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            xdt xdtVar = this.b;
            return this.c.hashCode() + ((hashCode + (xdtVar == null ? 0 : xdtVar.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ActivitySection(sectionTrackCode=");
            sb.append(this.a);
            sb.append(", headerInfo=");
            sb.append(this.b);
            sb.append(", items=");
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.c);
        }
    }

    /* compiled from: GamesCatalogSectionData.kt */
    public static final class c extends udt {
        public final String a;
        public final xdt b;
        public final c7t c;
        public final List<Long> d;
        public final String e;
        public final String f;

        public c(String str, xdt xdtVar, c7t c7tVar) {
            this.a = str;
            this.b = xdtVar;
            this.c = c7tVar;
            sbt sbtVar = c7tVar.d;
            this.d = Collections.singletonList(Long.valueOf(sbtVar.a.b));
            StringBuilder sb = new StringBuilder();
            sb.append(SectionTypePrefixKey.GAME_FOR_YOU_LIST_DATA.h());
            sb.append('_');
            String a = vu5.a('_', sbtVar.a.b, sb);
            this.e = a;
            this.f = a;
        }

        @Override // xsna.dct
        public final String F() {
            return this.e;
        }

        @Override // xsna.dct
        public final String a() {
            return this.f;
        }

        @Override // xsna.mhp0
        public final String b() {
            return this.a;
        }

        @Override // xsna.mhp0
        public final List<Long> c() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            xdt xdtVar = this.b;
            return this.c.hashCode() + ((hashCode + (xdtVar == null ? 0 : xdtVar.hashCode())) * 31);
        }

        public final String toString() {
            return "GameForYouListData(sectionTrackCode=" + this.a + ", headerInfoModel=" + this.b + ", game=" + this.c + ')';
        }
    }

    /* compiled from: GamesCatalogSectionData.kt */
    public static final class d extends udt {
        public final String a;
        public final ArrayList b;
        public final ArrayList c;
        public final String d;
        public final String e;

        public d(String str, ArrayList arrayList) {
            this.a = str;
            this.b = arrayList;
            ArrayList arrayList2 = new ArrayList(c5g.u(new wow(arrayList), 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(Long.valueOf(((l6t) it.next()).d.a.b));
            }
            this.c = arrayList2;
            StringBuilder sb = new StringBuilder();
            sb.append(SectionTypePrefixKey.HORIZONAL_BANNER_SECTION.h());
            sb.append('_');
            ArrayList arrayList3 = this.b;
            int size = arrayList3.size();
            for (int i = 0; i < size; i++) {
                sb.append('_');
                sb.append(((l6t) arrayList3.get(i)).d.a.b);
            }
            sb.append('_');
            this.d = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(SectionTypePrefixKey.HORIZONAL_BANNER_SECTION.h());
            sb2.append('_');
            Long[] lArr = (Long[]) this.c.toArray(new Long[0]);
            sb2.append(Objects.hash(Arrays.copyOf(lArr, lArr.length)));
            this.e = sb2.toString();
        }

        @Override // xsna.dct
        public final String F() {
            return this.e;
        }

        @Override // xsna.dct
        public final String a() {
            return this.d;
        }

        @Override // xsna.mhp0
        public final String b() {
            return this.a;
        }

        @Override // xsna.mhp0
        public final List<Long> c() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HorizontalBannerSection(sectionTrackCode=");
            sb.append(this.a);
            sb.append(", data=");
            return bo.c(')', sb, this.b);
        }
    }

    /* compiled from: GamesCatalogSectionData.kt */
    public static final class e extends udt implements xsx0 {
        public final String a;
        public final xdt b;
        public final List c;
        public final ArrayList d;
        public final String e;
        public final String f;

        public e(String str, xdt xdtVar, List list) {
            this.a = str;
            this.b = xdtVar;
            this.c = list;
            ArrayList arrayList = new ArrayList(c5g.u(new wow(list), 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((g7t) it.next()).d.a.b));
            }
            this.d = arrayList;
            StringBuilder sb = new StringBuilder();
            SectionTypePrefixKey sectionTypePrefixKey = SectionTypePrefixKey.HORIZONTAL_GAMES_LIST_DATA;
            sb.append(sectionTypePrefixKey.h());
            sb.append('_');
            Long[] lArr = (Long[]) arrayList.toArray(new Long[0]);
            sb.append(Objects.hash(Arrays.copyOf(lArr, lArr.length)));
            this.e = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(sectionTypePrefixKey.h());
            sb2.append('_');
            xdt xdtVar2 = this.b;
            String str2 = xdtVar2 != null ? xdtVar2.c : null;
            sb2.append(str2 == null ? "" : str2);
            sb2.append('_');
            xdt xdtVar3 = this.b;
            sb2.append((xdtVar3 == null || !xdtVar3.d) ? ImageSizeKey.SIZE_KEY_UNDEFINED : '1');
            List list2 = this.c;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                sb2.append('_');
                sb2.append(((g7t) list2.get(i)).a);
            }
            sb2.append('_');
            this.f = sb2.toString();
            SectionTypePrefixKey.HEADER.getClass();
            SectionTypePrefixKey.HORIZONTAL_GAMES_LIST_DATA.getClass();
        }

        @Override // xsna.dct
        public final String F() {
            return this.e;
        }

        @Override // xsna.dct
        public final String a() {
            return this.f;
        }

        @Override // xsna.mhp0
        public final String b() {
            return this.a;
        }

        @Override // xsna.mhp0
        public final List<Long> c() {
            return this.d;
        }

        @Override // xsna.xsx0
        public final xdt d() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            xdt xdtVar = this.b;
            return this.c.hashCode() + ((hashCode + (xdtVar == null ? 0 : xdtVar.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HorizontalGamesListData(sectionTrackCode=");
            sb.append(this.a);
            sb.append(", headerInfo=");
            sb.append(this.b);
            sb.append(", data=");
            return jr.a(')', sb, this.c);
        }
    }

    /* compiled from: GamesCatalogSectionData.kt */
    public static final class f extends udt implements xsx0 {
        public final String a;
        public final xdt b;
        public final List<r7t> c;
        public final ArrayList d;
        public final String e;
        public final String f;

        public f(String str, xdt xdtVar, List<r7t> list) {
            this.a = str;
            this.b = xdtVar;
            this.c = list;
            List<r7t> list2 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((r7t) it.next()).d.a.b));
            }
            this.d = arrayList;
            StringBuilder sb = new StringBuilder();
            sb.append(SectionTypePrefixKey.NOTIFICATION_SECTION.h());
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                sb.append('_');
                sb.append(this.c.get(i).e.a);
                sb.append('_');
                sb.append(this.c.get(i).g);
                sb.append('_');
                sb.append(this.c.get(i).d.a.b);
            }
            sb.append('_');
            this.e = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(SectionTypePrefixKey.NOTIFICATION_SECTION.h());
            for (r7t r7tVar : this.c) {
                sb2.append('_');
                sb2.append(r7tVar.n);
            }
            this.f = sb2.toString();
            SectionTypePrefixKey.HEADER.getClass();
            SectionTypePrefixKey.NOTIFICATION_SECTION.getClass();
        }

        @Override // xsna.dct
        public final String F() {
            return this.f;
        }

        @Override // xsna.dct
        public final String a() {
            return this.e;
        }

        @Override // xsna.mhp0
        public final String b() {
            return this.a;
        }

        @Override // xsna.mhp0
        public final List<Long> c() {
            return this.d;
        }

        @Override // xsna.xsx0
        public final xdt d() {
            return this.b;
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
            int hashCode = this.a.hashCode() * 31;
            xdt xdtVar = this.b;
            return this.c.hashCode() + ((hashCode + (xdtVar == null ? 0 : xdtVar.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationSection(sectionTrackCode=");
            sb.append(this.a);
            sb.append(", headerInfo=");
            sb.append(this.b);
            sb.append(", items=");
            return ms9.a(')', sb, this.c);
        }
    }

    /* compiled from: GamesCatalogSectionData.kt */
    public static final class g extends udt {
        public final String a;
        public final w7t b;
        public final List<Long> c;
        public final String d;
        public final String e;

        public g(String str, w7t w7tVar) {
            WebApiApplication webApiApplication;
            WebApiApplication webApiApplication2;
            this.a = str;
            this.b = w7tVar;
            sbt sbtVar = w7tVar.a;
            this.c = (sbtVar == null || (webApiApplication2 = sbtVar.a) == null) ? null : Collections.singletonList(Long.valueOf(webApiApplication2.b));
            StringBuilder sb = new StringBuilder();
            sb.append(SectionTypePrefixKey.PROMO_BANNER_SECTION.h());
            sb.append('_');
            sb.append(w7tVar.d);
            sb.append('_');
            if (sbtVar != null && (webApiApplication = sbtVar.a) != null) {
                long j = webApiApplication.b;
                sb.append('_');
                sb.append(j);
            }
            sb.append('_');
            String sb2 = sb.toString();
            this.d = sb2;
            this.e = sb2;
        }

        @Override // xsna.dct
        public final String F() {
            return this.d;
        }

        @Override // xsna.dct
        public final String a() {
            return this.e;
        }

        @Override // xsna.mhp0
        public final String b() {
            return this.a;
        }

        @Override // xsna.mhp0
        public final List<Long> c() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return epx.f(this.a, gVar.a) && epx.f(this.b, gVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "PromoBannerSection(sectionTrackCode=" + this.a + ", data=" + this.b + ')';
        }
    }

    /* compiled from: GamesCatalogSectionData.kt */
    public static abstract class h extends udt implements xsx0 {
        public final String a;
        public final xdt b;
        public final List c;
        public final p7t d;

        /* compiled from: GamesCatalogSectionData.kt */
        public static final class a extends h {
            public final String e;
            public final xdt f;
            public final List g;
            public final ArrayList h;
            public final String i;
            public final String j;

            public a(String str, xdt xdtVar, List list) {
                super(str, xdtVar, list, p7t.a.b.d);
                this.e = str;
                this.f = xdtVar;
                this.g = list;
                ArrayList arrayList = new ArrayList(c5g.u(new wow(list), 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((h8t) it.next()).d.a.b));
                }
                this.h = arrayList;
                StringBuilder sb = new StringBuilder();
                SectionTypePrefixKey sectionTypePrefixKey = SectionTypePrefixKey.GAMES_CATEGORY_SECTION_DATA;
                sb.append(sectionTypePrefixKey.h());
                sb.append('_');
                Long[] lArr = (Long[]) arrayList.toArray(new Long[0]);
                sb.append(Objects.hash(Arrays.copyOf(lArr, lArr.length)));
                this.i = sb.toString();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(sectionTypePrefixKey.h());
                sb2.append('_');
                xdt xdtVar2 = this.f;
                String str2 = xdtVar2 != null ? xdtVar2.c : null;
                sb2.append(str2 == null ? "" : str2);
                sb2.append('_');
                xdt xdtVar3 = this.f;
                sb2.append((xdtVar3 == null || !xdtVar3.d) ? ImageSizeKey.SIZE_KEY_UNDEFINED : '1');
                List list2 = this.g;
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    sb2.append('_');
                    sb2.append(((h8t) list2.get(i)).d.a.b);
                }
                sb2.append('_');
                this.j = sb2.toString();
                SectionTypePrefixKey.HEADER.getClass();
                SectionTypePrefixKey.GAMES_CATEGORY_SECTION_DATA.getClass();
            }

            @Override // xsna.dct
            public final String F() {
                return this.i;
            }

            @Override // xsna.dct
            public final String a() {
                return this.j;
            }

            @Override // xsna.udt.h, xsna.mhp0
            public final String b() {
                return this.e;
            }

            @Override // xsna.mhp0
            public final List<Long> c() {
                return this.h;
            }

            @Override // xsna.udt.h, xsna.xsx0
            public final xdt d() {
                return this.f;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g);
            }

            @Override // xsna.udt.h
            public final List f() {
                return this.g;
            }

            public final int hashCode() {
                int hashCode = this.e.hashCode() * 31;
                xdt xdtVar = this.f;
                return this.g.hashCode() + ((hashCode + (xdtVar == null ? 0 : xdtVar.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("CategorySection(sectionTrackCode=");
                sb.append(this.e);
                sb.append(", headerInfo=");
                sb.append(this.f);
                sb.append(", items=");
                return jr.a(')', sb, this.g);
            }
        }

        /* compiled from: GamesCatalogSectionData.kt */
        public static final class b extends h {
            public final String e;
            public final xdt f;
            public final ArrayList g;
            public final ArrayList h;
            public final String i;
            public final String j;

            public b(String str, xdt xdtVar, ArrayList arrayList) {
                super(str, xdtVar, arrayList, p7t.a.C3495a.d);
                this.e = str;
                this.f = xdtVar;
                this.g = arrayList;
                ArrayList arrayList2 = new ArrayList(c5g.u(new wow(arrayList), 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Long.valueOf(((h8t) it.next()).d.a.b));
                }
                this.h = arrayList2;
                StringBuilder sb = new StringBuilder();
                SectionTypePrefixKey sectionTypePrefixKey = SectionTypePrefixKey.CUSTOM_COLLECTION_GAMES_LIST_DATA;
                sb.append(sectionTypePrefixKey.h());
                sb.append('_');
                Long[] lArr = (Long[]) arrayList2.toArray(new Long[0]);
                sb.append(Objects.hash(Arrays.copyOf(lArr, lArr.length)));
                this.i = sb.toString();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(sectionTypePrefixKey.h());
                sb2.append('_');
                xdt xdtVar2 = this.f;
                String str2 = xdtVar2 != null ? xdtVar2.c : null;
                sb2.append(str2 == null ? "" : str2);
                sb2.append('_');
                xdt xdtVar3 = this.f;
                sb2.append((xdtVar3 == null || !xdtVar3.d) ? ImageSizeKey.SIZE_KEY_UNDEFINED : '1');
                ArrayList arrayList3 = this.g;
                int size = arrayList3.size();
                for (int i = 0; i < size; i++) {
                    sb2.append('_');
                    sb2.append(((h8t) arrayList3.get(i)).d.a.b);
                }
                sb2.append('_');
                this.j = sb2.toString();
                SectionTypePrefixKey.HEADER.getClass();
                SectionTypePrefixKey.CUSTOM_COLLECTION_GAMES_LIST_DATA.getClass();
            }

            @Override // xsna.dct
            public final String F() {
                return this.i;
            }

            @Override // xsna.dct
            public final String a() {
                return this.j;
            }

            @Override // xsna.udt.h, xsna.mhp0
            public final String b() {
                return this.e;
            }

            @Override // xsna.mhp0
            public final List<Long> c() {
                return this.h;
            }

            @Override // xsna.udt.h, xsna.xsx0
            public final xdt d() {
                return this.f;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f) && epx.f(this.g, bVar.g);
            }

            @Override // xsna.udt.h
            public final List f() {
                return this.g;
            }

            public final int hashCode() {
                int hashCode = this.e.hashCode() * 31;
                xdt xdtVar = this.f;
                return this.g.hashCode() + ((hashCode + (xdtVar == null ? 0 : xdtVar.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("CustomCollectionGamesListData(sectionTrackCode=");
                sb.append(this.e);
                sb.append(", headerInfo=");
                sb.append(this.f);
                sb.append(", items=");
                return bo.c(')', sb, this.g);
            }
        }

        /* compiled from: GamesCatalogSectionData.kt */
        public static final class c extends h {
            public final String e;
            public final xdt f;
            public final List g;
            public final m8t h;
            public final GamesHeaderSectionInfo i;
            public final ArrayList j;
            public final String k;
            public final String l;

            public c(String str, xdt xdtVar, List list, m8t m8tVar, GamesHeaderSectionInfo gamesHeaderSectionInfo) {
                super(str, xdtVar, list, p7t.a.b.d);
                this.e = str;
                this.f = xdtVar;
                this.g = list;
                this.h = m8tVar;
                this.i = gamesHeaderSectionInfo;
                ArrayList arrayList = new ArrayList(c5g.u(new wow(list), 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((h8t) it.next()).d.a.b));
                }
                this.j = arrayList;
                StringBuilder sb = new StringBuilder();
                SectionTypePrefixKey sectionTypePrefixKey = SectionTypePrefixKey.GAMES_ACHIEVEMENT_BLOCK_DATA;
                sb.append(sectionTypePrefixKey.h());
                sb.append('_');
                sb.append(this.h.d);
                sb.append('_');
                sb.append(this.h.e);
                Long[] lArr = (Long[]) arrayList.toArray(new Long[0]);
                sb.append(Objects.hash(Arrays.copyOf(lArr, lArr.length)));
                this.k = sb.toString();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(sectionTypePrefixKey.h());
                sb2.append('_');
                sb2.append(this.h.d);
                sb2.append('_');
                sb2.append(this.h.e);
                sb2.append('_');
                List list2 = this.g;
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    sb2.append('_');
                    sb2.append(((h8t) list2.get(i)).d.a.b);
                }
                sb2.append('_');
                this.l = sb2.toString();
                SectionTypePrefixKey.HEADER.getClass();
                SectionTypePrefixKey.GAMES_ACHIEVEMENT_BLOCK_DATA.getClass();
            }

            @Override // xsna.dct
            public final String F() {
                return this.k;
            }

            @Override // xsna.dct
            public final String a() {
                return this.l;
            }

            @Override // xsna.udt.h, xsna.mhp0
            public final String b() {
                return this.e;
            }

            @Override // xsna.mhp0
            public final List<Long> c() {
                return this.j;
            }

            @Override // xsna.udt.h, xsna.xsx0
            public final xdt d() {
                return this.f;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return epx.f(this.e, cVar.e) && epx.f(this.f, cVar.f) && epx.f(this.g, cVar.g) && epx.f(this.h, cVar.h) && epx.f(this.i, cVar.i);
            }

            @Override // xsna.udt.h
            public final List f() {
                return this.g;
            }

            public final int hashCode() {
                int hashCode = this.e.hashCode() * 31;
                xdt xdtVar = this.f;
                int hashCode2 = (this.h.hashCode() + fw3.a((hashCode + (xdtVar == null ? 0 : xdtVar.hashCode())) * 31, 31, this.g)) * 31;
                GamesHeaderSectionInfo gamesHeaderSectionInfo = this.i;
                return hashCode2 + (gamesHeaderSectionInfo != null ? gamesHeaderSectionInfo.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("GamesAchievementsBlockData(sectionTrackCode=");
                sb.append(this.e);
                sb.append(", headerInfo=");
                sb.append(this.f);
                sb.append(", items=");
                mr.c(", data=", sb, this.g);
                sb.append(this.h);
                sb.append(", sectionInfo=");
                sb.append(this.i);
                sb.append(')');
                return sb.toString();
            }
        }

        /* compiled from: GamesCatalogSectionData.kt */
        public static final class d extends h {
            public final String e;
            public final xdt f;
            public final List g;
            public final ArrayList h;
            public final String i;
            public final String j;

            public d(String str, xdt xdtVar, List list) {
                super(str, xdtVar, list, p7t.a.b.d);
                this.e = str;
                this.f = xdtVar;
                this.g = list;
                ArrayList arrayList = new ArrayList(c5g.u(new wow(list), 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((h8t) it.next()).d.a.b));
                }
                this.h = arrayList;
                StringBuilder sb = new StringBuilder();
                SectionTypePrefixKey sectionTypePrefixKey = SectionTypePrefixKey.GAMES_SELECTION_LIST_DATA;
                sb.append(sectionTypePrefixKey.h());
                sb.append('_');
                Long[] lArr = (Long[]) arrayList.toArray(new Long[0]);
                sb.append(Objects.hash(Arrays.copyOf(lArr, lArr.length)));
                this.i = sb.toString();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(sectionTypePrefixKey.h());
                sb2.append('_');
                xdt xdtVar2 = this.f;
                String str2 = xdtVar2 != null ? xdtVar2.c : null;
                sb2.append(str2 == null ? "" : str2);
                sb2.append('_');
                xdt xdtVar3 = this.f;
                sb2.append((xdtVar3 == null || !xdtVar3.d) ? ImageSizeKey.SIZE_KEY_UNDEFINED : '1');
                List list2 = this.g;
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    sb2.append('_');
                    sb2.append(((h8t) list2.get(i)).d.a.b);
                }
                sb2.append('_');
                this.j = sb2.toString();
                SectionTypePrefixKey.HEADER.getClass();
                SectionTypePrefixKey.GAMES_SELECTION_LIST_DATA.getClass();
            }

            @Override // xsna.dct
            public final String F() {
                return this.i;
            }

            @Override // xsna.dct
            public final String a() {
                return this.j;
            }

            @Override // xsna.udt.h, xsna.mhp0
            public final String b() {
                return this.e;
            }

            @Override // xsna.mhp0
            public final List<Long> c() {
                return this.h;
            }

            @Override // xsna.udt.h, xsna.xsx0
            public final xdt d() {
                return this.f;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return epx.f(this.e, dVar.e) && epx.f(this.f, dVar.f) && epx.f(this.g, dVar.g);
            }

            @Override // xsna.udt.h
            public final List f() {
                return this.g;
            }

            public final int hashCode() {
                int hashCode = this.e.hashCode() * 31;
                xdt xdtVar = this.f;
                return this.g.hashCode() + ((hashCode + (xdtVar == null ? 0 : xdtVar.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("GamesSelectionListData(sectionTrackCode=");
                sb.append(this.e);
                sb.append(", headerInfo=");
                sb.append(this.f);
                sb.append(", items=");
                return jr.a(')', sb, this.g);
            }
        }

        /* compiled from: GamesCatalogSectionData.kt */
        public static final class e extends h {
            public final String e;
            public final xdt f;
            public final List g;
            public final ArrayList h;
            public final String i;
            public final String j;

            public e(String str, xdt xdtVar, List list) {
                super(str, xdtVar, list, p7t.a.b.d);
                this.e = str;
                this.f = xdtVar;
                this.g = list;
                ArrayList arrayList = new ArrayList(c5g.u(new wow(list), 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((h8t) it.next()).d.a.b));
                }
                this.h = arrayList;
                StringBuilder sb = new StringBuilder();
                SectionTypePrefixKey sectionTypePrefixKey = SectionTypePrefixKey.GAMES_VERTICAL_HALF_LIST_DATA;
                sb.append(sectionTypePrefixKey.h());
                sb.append('_');
                Long[] lArr = (Long[]) arrayList.toArray(new Long[0]);
                sb.append(Objects.hash(Arrays.copyOf(lArr, lArr.length)));
                this.i = sb.toString();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(sectionTypePrefixKey.h());
                sb2.append('_');
                xdt xdtVar2 = this.f;
                String str2 = xdtVar2 != null ? xdtVar2.c : null;
                sb2.append(str2 == null ? "" : str2);
                sb2.append('_');
                xdt xdtVar3 = this.f;
                sb2.append((xdtVar3 == null || !xdtVar3.d) ? ImageSizeKey.SIZE_KEY_UNDEFINED : '1');
                List list2 = this.g;
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    sb2.append('_');
                    sb2.append(((h8t) list2.get(i)).d.a.b);
                }
                sb2.append('_');
                this.j = sb2.toString();
                SectionTypePrefixKey.HEADER.getClass();
                SectionTypePrefixKey.GAMES_VERTICAL_HALF_LIST_DATA.getClass();
            }

            @Override // xsna.dct
            public final String F() {
                return this.i;
            }

            @Override // xsna.dct
            public final String a() {
                return this.j;
            }

            @Override // xsna.udt.h, xsna.mhp0
            public final String b() {
                return this.e;
            }

            @Override // xsna.mhp0
            public final List<Long> c() {
                return this.h;
            }

            @Override // xsna.udt.h, xsna.xsx0
            public final xdt d() {
                return this.f;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return epx.f(this.e, eVar.e) && epx.f(this.f, eVar.f) && epx.f(this.g, eVar.g);
            }

            @Override // xsna.udt.h
            public final List f() {
                return this.g;
            }

            public final int hashCode() {
                int hashCode = this.e.hashCode() * 31;
                xdt xdtVar = this.f;
                return this.g.hashCode() + ((hashCode + (xdtVar == null ? 0 : xdtVar.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("GamesVerticalHalfCardsListData(sectionTrackCode=");
                sb.append(this.e);
                sb.append(", headerInfo=");
                sb.append(this.f);
                sb.append(", items=");
                return jr.a(')', sb, this.g);
            }
        }

        /* compiled from: GamesCatalogSectionData.kt */
        public static final class f extends h {
            public final String e;
            public final xdt f;
            public final List g;
            public final ArrayList h;
            public final String i;
            public final String j;

            public f(String str, xdt xdtVar, List list) {
                super(str, xdtVar, list, p7t.a.b.d);
                this.e = str;
                this.f = xdtVar;
                this.g = list;
                ArrayList arrayList = new ArrayList(c5g.u(new wow(list), 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((h8t) it.next()).d.a.b));
                }
                this.h = arrayList;
                StringBuilder sb = new StringBuilder();
                SectionTypePrefixKey sectionTypePrefixKey = SectionTypePrefixKey.GAMES_VERTICAL_LIST_DATA;
                sb.append(sectionTypePrefixKey.h());
                sb.append('_');
                Long[] lArr = (Long[]) arrayList.toArray(new Long[0]);
                sb.append(Objects.hash(Arrays.copyOf(lArr, lArr.length)));
                this.i = sb.toString();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(sectionTypePrefixKey.h());
                sb2.append('_');
                xdt xdtVar2 = this.f;
                String str2 = xdtVar2 != null ? xdtVar2.c : null;
                sb2.append(str2 == null ? "" : str2);
                sb2.append('_');
                xdt xdtVar3 = this.f;
                sb2.append((xdtVar3 == null || !xdtVar3.d) ? ImageSizeKey.SIZE_KEY_UNDEFINED : '1');
                List list2 = this.g;
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    sb2.append('_');
                    sb2.append(((h8t) list2.get(i)).d.a.b);
                }
                sb2.append('_');
                this.j = sb2.toString();
                SectionTypePrefixKey.HEADER.getClass();
                SectionTypePrefixKey.GAMES_VERTICAL_LIST_DATA.getClass();
            }

            @Override // xsna.dct
            public final String F() {
                return this.i;
            }

            @Override // xsna.dct
            public final String a() {
                return this.j;
            }

            @Override // xsna.udt.h, xsna.mhp0
            public final String b() {
                return this.e;
            }

            @Override // xsna.mhp0
            public final List<Long> c() {
                return this.h;
            }

            @Override // xsna.udt.h, xsna.xsx0
            public final xdt d() {
                return this.f;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return epx.f(this.e, fVar.e) && epx.f(this.f, fVar.f) && epx.f(this.g, fVar.g);
            }

            @Override // xsna.udt.h
            public final List f() {
                return this.g;
            }

            public final int hashCode() {
                int hashCode = this.e.hashCode() * 31;
                xdt xdtVar = this.f;
                return this.g.hashCode() + ((hashCode + (xdtVar == null ? 0 : xdtVar.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("GamesVerticalListData(sectionTrackCode=");
                sb.append(this.e);
                sb.append(", headerInfo=");
                sb.append(this.f);
                sb.append(", items=");
                return jr.a(')', sb, this.g);
            }
        }

        public h(String str, xdt xdtVar, List list, p7t p7tVar) {
            this.a = str;
            this.b = xdtVar;
            this.c = list;
            this.d = p7tVar;
        }

        @Override // xsna.mhp0
        public String b() {
            return this.a;
        }

        @Override // xsna.xsx0
        public xdt d() {
            return this.b;
        }

        public List f() {
            return this.c;
        }
    }

    public final String e(int i, boolean z) {
        if (z) {
            return F();
        }
        return a() + i;
    }
}
