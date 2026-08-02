package xsna;

import com.vk.im.engine.models.im_item.ImItemType;

/* compiled from: ImItemHistory.kt */
/* loaded from: classes2.dex */
public final class b5w {
    public final long a;
    public final ImItemType b;
    public String c = "";

    /* compiled from: ImItemHistory.kt */
    public static final class a {
        public static b5w a(long j) {
            return new b5w(j, ImItemType.CHANNEL);
        }

        public static b5w b(long j) {
            return new b5w(j, ImItemType.DIALOG);
        }
    }

    public b5w(long j, ImItemType imItemType) {
        this.a = j;
        this.b = imItemType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b5w)) {
            return false;
        }
        b5w b5wVar = (b5w) obj;
        return this.a == b5wVar.a && this.b == b5wVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ImItemComposedId(id=" + this.a + ", type=" + this.b + ')';
    }
}
