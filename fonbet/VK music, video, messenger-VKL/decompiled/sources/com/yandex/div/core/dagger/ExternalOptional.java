package com.yandex.div.core.dagger;

import xsna.jt80;
import xsna.zcl;

/* compiled from: ExternalOptional.kt */
/* loaded from: classes7.dex */
public final class ExternalOptional<T> {
    public static final Companion Companion = new Companion(null);
    private final jt80<T> optional;

    /* compiled from: ExternalOptional.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final <T> ExternalOptional<T> empty() {
            return new ExternalOptional<>(jt80.b);
        }

        public final <T> ExternalOptional<T> of(T t) {
            return new ExternalOptional<>(new jt80(t));
        }

        public final <T> ExternalOptional<T> ofNullable(T t) {
            return t != null ? of(t) : empty();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExternalOptional(jt80<? extends T> jt80Var) {
        this.optional = jt80Var;
    }

    public static final <T> ExternalOptional<T> empty() {
        return Companion.empty();
    }

    public static final <T> ExternalOptional<T> of(T t) {
        return Companion.of(t);
    }

    public final jt80<T> getOptional() {
        return this.optional;
    }
}
