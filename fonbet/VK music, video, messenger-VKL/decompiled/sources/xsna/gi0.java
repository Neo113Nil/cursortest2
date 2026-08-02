package xsna;

import com.vk.external.miniapp.net.ad.AdvertisementType;

/* compiled from: SuperappAdBridge.kt */
/* loaded from: classes6.dex */
public abstract class gi0 {

    /* compiled from: SuperappAdBridge.kt */
    public static final class a extends gi0 {
        public final int a;
        public final String b;
        public final AdvertisementType c;
        public final int d;

        public a(int i, String str, AdvertisementType advertisementType, int i2) {
            this.a = i;
            this.b = str;
            this.c = advertisementType;
            this.d = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d;
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.a) * 31;
            String str = this.b;
            return Integer.hashCode(this.d) + ((this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            return "Id(id=" + this.a + ", tag=" + this.b + ", adType=" + this.c + ", adSource=" + ((Object) kq01.s(this.d)) + ')';
        }
    }

    /* compiled from: SuperappAdBridge.kt */
    public static final class b extends gi0 {
        public static final b a = new b();
    }
}
