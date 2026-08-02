package xsna;

import org.msgpack.core.MessageTypeCastException;
import org.msgpack.value.ValueType;

/* compiled from: AbstractImmutableValue.java */
/* loaded from: classes8.dex */
public abstract class re implements rpw {
    @Override // xsna.kjr0
    public final boolean A() {
        return h().h();
    }

    @Override // xsna.kjr0
    public final boolean B() {
        ValueType h = h();
        h.getClass();
        return h == ValueType.NIL;
    }

    @Override // xsna.kjr0
    public final boolean D() {
        ValueType h = h();
        h.getClass();
        return h == ValueType.EXTENSION;
    }

    @Override // xsna.kjr0
    public final boolean E() {
        ValueType h = h();
        h.getClass();
        return h == ValueType.INTEGER;
    }

    @Override // xsna.kjr0
    public final boolean F() {
        ValueType h = h();
        h.getClass();
        return h == ValueType.MAP;
    }

    @Override // xsna.kjr0
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public vnw m() {
        throw new MessageTypeCastException();
    }

    @Override // xsna.kjr0
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public ynw k() {
        throw new MessageTypeCastException();
    }

    @Override // xsna.kjr0
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public bow y() {
        throw new MessageTypeCastException();
    }

    @Override // xsna.kjr0
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public low v() {
        throw new MessageTypeCastException();
    }

    @Override // xsna.kjr0
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public fow G() {
        throw new MessageTypeCastException();
    }

    @Override // xsna.kjr0
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public mpw x() {
        throw new MessageTypeCastException();
    }

    @Override // xsna.kjr0
    public final boolean i() {
        ValueType h = h();
        h.getClass();
        return h == ValueType.STRING;
    }

    @Override // xsna.kjr0
    public final boolean j() {
        ValueType h = h();
        h.getClass();
        return h == ValueType.FLOAT;
    }

    @Override // xsna.kjr0
    public final boolean l() {
        ValueType h = h();
        h.getClass();
        return h == ValueType.ARRAY;
    }

    @Override // xsna.kjr0
    public final boolean q() {
        ValueType h = h();
        h.getClass();
        return h == ValueType.BINARY;
    }

    @Override // xsna.kjr0
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public sow g() {
        throw new MessageTypeCastException();
    }

    @Override // xsna.kjr0
    public final boolean w() {
        ValueType h = h();
        h.getClass();
        return h == ValueType.BOOLEAN;
    }

    @Override // xsna.kjr0
    public cpw d() {
        throw new MessageTypeCastException();
    }
}
