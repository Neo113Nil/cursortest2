package xsna;

import com.vk.profile.community.impl.ui.profile.state.MarketInfoBlockModel;
import com.vk.toggle.features.ComFeatures;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: CommunityPriorityBlockDataModel.kt */
/* loaded from: classes5.dex */
public interface ddh {

    /* compiled from: CommunityPriorityBlockDataModel.kt */
    public static final class a implements ddh {
        public final List<o9h> a;
        public final List<lsh> b;
        public final MarketInfoBlockModel c;
        public final String d;
        public final String e;
        public final Integer f;
        public final e11 g;
        public final String h;

        public a() {
            this(null, null, null, null, null, null, 255);
        }

        public static a a(a aVar, List list, List list2, String str, Integer num, String str2, int i) {
            if ((i & 1) != 0) {
                list = aVar.a;
            }
            List list3 = list;
            if ((i & 2) != 0) {
                list2 = aVar.b;
            }
            List list4 = list2;
            MarketInfoBlockModel marketInfoBlockModel = aVar.c;
            if ((i & 8) != 0) {
                str = aVar.d;
            }
            String str3 = str;
            String str4 = aVar.e;
            if ((i & 32) != 0) {
                num = aVar.f;
            }
            Integer num2 = num;
            e11 e11Var = aVar.g;
            if ((i & 128) != 0) {
                str2 = aVar.h;
            }
            return new a(list3, list4, marketInfoBlockModel, str3, str4, num2, e11Var, str2);
        }

        public final boolean b() {
            String str = this.d;
            return str != null && str.length() > 0;
        }

        public final boolean c() {
            ComFeatures comFeatures = ComFeatures.COM_PB_GOODS_ALBUMS;
            comFeatures.getClass();
            return !com.vk.toggle.b.A.a(comFeatures) && b();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h);
        }

        public final int hashCode() {
            int a = fw3.a(this.a.hashCode() * 31, 31, this.b);
            MarketInfoBlockModel marketInfoBlockModel = this.c;
            int hashCode = (a + (marketInfoBlockModel == null ? 0 : marketInfoBlockModel.hashCode())) * 31;
            String str = this.d;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.f;
            int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            e11 e11Var = this.g;
            int hashCode5 = (hashCode4 + (e11Var == null ? 0 : e11Var.hashCode())) * 31;
            String str3 = this.h;
            return hashCode5 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MarketGoodsContent(items=");
            sb.append(this.a);
            sb.append(", albums=");
            sb.append(this.b);
            sb.append(", infoBlock=");
            sb.append(this.c);
            sb.append(", editUrl=");
            sb.append(this.d);
            sb.append(", viewSettingsUrl=");
            sb.append(this.e);
            sb.append(", itemsInCart=");
            sb.append(this.f);
            sb.append(", adsPromote=");
            sb.append(this.g);
            sb.append(", nextFrom=");
            return ho8.a(sb, this.h, ')');
        }

        public a(List<o9h> list, List<lsh> list2, MarketInfoBlockModel marketInfoBlockModel, String str, String str2, Integer num, e11 e11Var, String str3) {
            this.a = list;
            this.b = list2;
            this.c = marketInfoBlockModel;
            this.d = str;
            this.e = str2;
            this.f = num;
            this.g = e11Var;
            this.h = str3;
        }

        public a(List list, List list2, MarketInfoBlockModel marketInfoBlockModel, String str, e11 e11Var, String str2, int i) {
            this((i & 1) != 0 ? EmptyList.b : list, (i & 2) != 0 ? EmptyList.b : list2, (i & 4) != 0 ? null : marketInfoBlockModel, null, (i & 16) != 0 ? null : str, null, (i & 64) != 0 ? null : e11Var, (i & 128) != 0 ? null : str2);
        }
    }

    /* compiled from: CommunityPriorityBlockDataModel.kt */
    public static final class b implements ddh {
        public final List<p9h> a;
        public final String b;
        public final e11 c;
        public final String d;
        public final boolean e;

        public b() {
            this((List) null, (e11) null, (String) null, false, 63);
        }

        public static b a(b bVar, List list, String str, String str2, int i) {
            if ((i & 1) != 0) {
                list = bVar.a;
            }
            List list2 = list;
            if ((i & 2) != 0) {
                str = bVar.b;
            }
            String str3 = str;
            e11 e11Var = bVar.c;
            if ((i & 16) != 0) {
                str2 = bVar.d;
            }
            return new b(list2, str3, e11Var, str2, bVar.e);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && this.e == bVar.e;
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 961;
            e11 e11Var = this.c;
            int hashCode3 = (hashCode2 + (e11Var == null ? 0 : e11Var.hashCode())) * 31;
            String str2 = this.d;
            return Boolean.hashCode(this.e) + ((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MarketServicesContent(items=");
            sb.append(this.a);
            sb.append(", editUrl=");
            sb.append(this.b);
            sb.append(", itemsInCart=null, adsPromote=");
            sb.append(this.c);
            sb.append(", nextFrom=");
            sb.append(this.d);
            sb.append(", isListViewType=");
            return defpackage.q0.a(sb, this.e, ')');
        }

        public b(List list, String str, e11 e11Var, String str2, boolean z) {
            this.a = list;
            this.b = str;
            this.c = e11Var;
            this.d = str2;
            this.e = z;
        }

        public b(List list, e11 e11Var, String str, boolean z, int i) {
            this((i & 1) != 0 ? EmptyList.b : list, (String) null, (i & 8) != 0 ? null : e11Var, (i & 16) != 0 ? null : str, (i & 32) != 0 ? false : z);
        }
    }
}
