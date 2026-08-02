package xsna;

import io.opentelemetry.api.common.AttributeType;

/* compiled from: InternalAttributeKeyImpl.java */
/* loaded from: classes11.dex */
public final class xfx<T> implements i94<T> {
    public final AttributeType a;
    public final String b;
    public final int c;

    public xfx(AttributeType attributeType, String str) {
        if (attributeType == null) {
            throw new NullPointerException("Null type");
        }
        this.a = attributeType;
        this.b = str;
        this.c = ((attributeType.hashCode() ^ 1000003) * 1000003) ^ str.hashCode();
    }

    public static xfx a(AttributeType attributeType, String str) {
        if (str == null) {
            str = "";
        }
        return new xfx(attributeType, str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xfx) {
            xfx xfxVar = (xfx) obj;
            if (this.a.equals(xfxVar.a) && this.b.equals(xfxVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.i94
    public final String getKey() {
        return this.b;
    }

    @Override // xsna.i94
    public final AttributeType getType() {
        return this.a;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return this.b;
    }
}
