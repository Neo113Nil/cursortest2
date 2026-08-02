package kotlin.enums;

import java.io.Serializable;
import java.lang.Enum;
import xsna.asp;

/* compiled from: EnumEntriesSerializationProxy.kt */
/* loaded from: classes8.dex */
public final class EnumEntriesSerializationProxy<E extends Enum<E>> implements Serializable {
    private static final long serialVersionUID = 0;
    private final Class<E> c;

    public EnumEntriesSerializationProxy(E[] eArr) {
        this.c = (Class<E>) eArr.getClass().getComponentType();
    }

    private final Object readResolve() {
        return new asp(this.c.getEnumConstants());
    }
}
