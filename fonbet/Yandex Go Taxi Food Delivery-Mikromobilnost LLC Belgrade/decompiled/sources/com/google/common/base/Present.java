package com.google.common.base;

import defpackage.x4e;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
final class Present<T> extends Optional<T> {
    private static final long serialVersionUID = 0;
    private final T reference;

    /* JADX WARN: Multi-variable type inference failed */
    public Present(Object obj) {
        this.reference = obj;
    }

    @Override // com.google.common.base.Optional
    public final Object b() {
        return this.reference;
    }

    @Override // com.google.common.base.Optional
    public final boolean c() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Present) {
            return this.reference.equals(((Present) obj).reference);
        }
        return false;
    }

    public final int hashCode() {
        return this.reference.hashCode() + 1502476572;
    }

    public final String toString() {
        return x4e.h(new StringBuilder("Optional.of("), this.reference, Extension.C_BRAKE);
    }
}
