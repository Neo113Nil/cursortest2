package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.profile.CommunityInternalMenu$Companion$MenuItemType;
import java.util.List;

/* compiled from: CommunityInternalMenu.kt */
/* loaded from: classes18.dex */
public final class z4h {
    public final List<a> a;
    public final boolean b;
    public final boolean c;
    public final Integer d;

    /* compiled from: CommunityInternalMenu.kt */
    public static final class a {
        public final int a;
        public final String b;
        public final String c;
        public final String d;
        public final Image e;
        public final int f;
        public final CommunityInternalMenu$Companion$MenuItemType g;
        public final boolean h;
        public final String i;

        public /* synthetic */ a(int i, String str, String str2, String str3, Image image, int i2, CommunityInternalMenu$Companion$MenuItemType communityInternalMenu$Companion$MenuItemType, boolean z, int i3) {
            this(i, str, str2, str3, image, i2, communityInternalMenu$Companion$MenuItemType, (i3 & 128) != 0 ? false : z, (String) null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && this.f == aVar.f && this.g == aVar.g && this.h == aVar.h && epx.f(this.i, aVar.i);
        }

        public final int hashCode() {
            int a = urd0.a(Integer.hashCode(this.a) * 31, 31, this.b);
            String str = this.c;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Image image = this.e;
            int b = qoy.b((this.g.hashCode() + shy.a(this.f, (hashCode2 + (image == null ? 0 : image.hashCode())) * 31, 31)) * 31, 31, this.h);
            String str3 = this.i;
            return b + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MenuItem(id=");
            sb.append(this.a);
            sb.append(", type=");
            sb.append(this.b);
            sb.append(", title=");
            sb.append(this.c);
            sb.append(", link=");
            sb.append(this.d);
            sb.append(", cover=");
            sb.append(this.e);
            sb.append(", counter=");
            sb.append(this.f);
            sb.append(", specialType=");
            sb.append(this.g);
            sb.append(", isHidden=");
            sb.append(this.h);
            sb.append(", appId=");
            return ho8.a(sb, this.i, ')');
        }

        public a(int i, String str, String str2, String str3, Image image, int i2, CommunityInternalMenu$Companion$MenuItemType communityInternalMenu$Companion$MenuItemType, boolean z, String str4) {
            this.a = i;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = image;
            this.f = i2;
            this.g = communityInternalMenu$Companion$MenuItemType;
            this.h = z;
            this.i = str4;
        }
    }

    public z4h(List<a> list, boolean z, boolean z2, Integer num) {
        this.a = list;
        this.b = z;
        this.c = z2;
        this.d = num;
    }

    public static z4h a(z4h z4hVar, List list, int i) {
        if ((i & 1) != 0) {
            list = z4hVar.a;
        }
        boolean z = (i & 2) != 0 ? z4hVar.b : true;
        boolean z2 = z4hVar.c;
        Integer num = z4hVar.d;
        z4hVar.getClass();
        return new z4h(list, z, z2, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4h)) {
            return false;
        }
        z4h z4hVar = (z4h) obj;
        return epx.f(this.a, z4hVar.a) && this.b == z4hVar.b && this.c == z4hVar.c && epx.f(this.d, z4hVar.d);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Integer num = this.d;
        return b + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityInternalMenu(items=");
        sb.append(this.a);
        sb.append(", isHidden=");
        sb.append(this.b);
        sb.append(", canAdd=");
        sb.append(this.c);
        sb.append(", maxItems=");
        return uqi.b(sb, this.d, ')');
    }
}
