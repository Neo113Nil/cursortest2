package xsna;

import java.text.DecimalFormat;
import kotlin.LazyThreadSafetyMode;

/* compiled from: AdProductPriceMapper.kt */
/* loaded from: classes18.dex */
public final class oh0 {
    public final Object a;
    public final Object b;

    /* compiled from: AdProductPriceMapper.kt */
    public static final class a {
        public final int a;
        public final char b;

        public a(int i, char c) {
            this.a = i;
            this.b = c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Character.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "Postfix(divideTo=" + this.a + ", symbol=" + this.b + ')';
        }
    }

    /* compiled from: AdProductPriceMapper.kt */
    public static final class b {
        public final Long a;
        public final String b;

        public b(Long l, String str) {
            this.a = l;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            Long l = this.a;
            int hashCode = (l == null ? 0 : l.hashCode()) * 31;
            String str = this.b;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Price(value=");
            sb.append(this.a);
            sb.append(", price=");
            return ho8.a(sb, this.b, ')');
        }
    }

    public oh0() {
        com.vk.movika.sdk.base.model.props.a aVar = new com.vk.movika.sdk.base.model.props.a(1);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.a = msy.a(lazyThreadSafetyMode, aVar);
        this.b = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.model.props.c(1));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    public final b a(String str) {
        Long l;
        if (str != null && !drm0.N(str)) {
            StringBuilder sb = new StringBuilder();
            char[] charArray = str.toCharArray();
            int length = charArray.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    char c = charArray[i];
                    if (Character.isDigit(c)) {
                        sb.append(Character.getNumericValue(c));
                    } else if (!ro.j(c)) {
                        String sb2 = sb.toString();
                        if (sb2.length() == 0) {
                            sb2 = null;
                        }
                        if (sb2 != null) {
                            l = Long.valueOf(Long.parseLong(sb2));
                        }
                    }
                    i++;
                } else {
                    String sb3 = sb.toString();
                    if (sb3.length() == 0) {
                        sb3 = null;
                    }
                    if (sb3 != null) {
                        l = Long.valueOf(Long.parseLong(sb3));
                    }
                }
            }
        }
        l = null;
        if (l == null) {
            return null;
        }
        long longValue = l.longValue();
        a aVar = (100000 > longValue || longValue >= 100000000) ? (100000000 > longValue || longValue >= 100000000000L) ? null : new a(1000000000, 'B') : new a(1000000, 'M');
        if (longValue > 99999999999L) {
            return new b(Long.valueOf(longValue), null);
        }
        if (aVar == null) {
            return new b(Long.valueOf(longValue), fo8.a(((DecimalFormat) this.b.getValue()).format(longValue), " ₽"));
        }
        return new b(Long.valueOf(longValue), fo8.a(((DecimalFormat) this.a.getValue()).format(Float.valueOf(longValue / aVar.a)) + aVar.b, " ₽"));
    }
}
