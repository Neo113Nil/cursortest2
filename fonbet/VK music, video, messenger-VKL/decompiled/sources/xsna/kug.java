package xsna;

import com.vk.community.design.compose.components.channel.MediaType;
import com.vk.dto.common.Image;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CommunityChannelItemModel.kt */
/* loaded from: classes5.dex */
public final class kug extends s4h {
    public static final kug d = new kug(0);
    public final String b;
    public final List<a> c;

    /* compiled from: CommunityChannelItemModel.kt */
    public static final class a {
        public final int a;
        public final String b;
        public final List<b> c;
        public final int d;
        public final String e;
        public final yua f;

        public a(int i, String str, ArrayList arrayList, int i2, String str2, yua yuaVar) {
            this.a = i;
            this.b = str;
            this.c = arrayList;
            this.d = i2;
            this.e = str2;
            this.f = yuaVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f);
        }

        public final int hashCode() {
            int a = urd0.a(Integer.hashCode(this.a) * 31, 31, this.b);
            List<b> list = this.c;
            return this.f.hashCode() + urd0.a(shy.a(this.d, (a + (list == null ? 0 : list.hashCode())) * 31, 31), 31, this.e);
        }

        public final String toString() {
            return "ChannelMessagePreview(id=" + this.a + ", text=" + this.b + ", mediaInfoList=" + this.c + ", countMedia=" + this.d + ", messageUrl=" + this.e + ", dateCaption=" + this.f + ')';
        }
    }

    /* compiled from: CommunityChannelItemModel.kt */
    public static final class b {
        public final Image a;
        public final MediaType b;
        public final float c;

        public b(Image image, MediaType mediaType, float f) {
            this.a = image;
            this.b = mediaType;
            this.c = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b && Float.compare(this.c, bVar.c) == 0;
        }

        public final int hashCode() {
            Image image = this.a;
            return Float.hashCode(this.c) + ((this.b.hashCode() + ((image == null ? 0 : image.hashCode()) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MediaInfo(imageMedia=");
            sb.append(this.a);
            sb.append(", mediaType=");
            sb.append(this.b);
            sb.append(", aspectRatio=");
            return xq.c(')', this.c, sb);
        }
    }

    public kug() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kug)) {
            return false;
        }
        kug kugVar = (kug) obj;
        return epx.f(this.b, kugVar.b) && epx.f(this.c, kugVar.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        List<a> list = this.c;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityChannelItemModel(url=");
        sb.append(this.b);
        sb.append(", messagePreviews=");
        return ms9.a(')', sb, this.c);
    }

    public kug(String str, ArrayList arrayList) {
        this.b = str;
        this.c = arrayList;
    }

    public /* synthetic */ kug(int i) {
        this("", null);
    }
}
