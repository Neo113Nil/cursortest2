package com.yandex.div.internal.template;

import xsna.zcl;

/* compiled from: Field.kt */
/* loaded from: classes7.dex */
public abstract class Field<T> {
    public static final Companion Companion = new Companion(null);
    public final boolean overridable;
    public final int type;

    /* compiled from: Field.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final <T> Field<T> nullField(boolean z) {
            return z ? Placeholder.INSTANCE : Null.INSTANCE;
        }

        private Companion() {
        }
    }

    /* compiled from: Field.kt */
    public static final class Null extends Field<Object> {
        public static final Null INSTANCE = new Null();

        /* JADX WARN: Multi-variable type inference failed */
        private Null() {
            super(0, 0 == true ? 1 : 0, null);
        }
    }

    /* compiled from: Field.kt */
    public static final class Placeholder extends Field<Object> {
        public static final Placeholder INSTANCE = new Placeholder();

        private Placeholder() {
            super(1, 1 == true ? 1 : 0, null);
        }
    }

    /* compiled from: Field.kt */
    public static final class Reference<T> extends Field<T> {
        public final String reference;

        public Reference(boolean z, String str) {
            super(3, z, null);
            this.reference = str;
        }
    }

    /* compiled from: Field.kt */
    public static final class Value<T> extends Field<T> {
        public final T value;

        public Value(boolean z, T t) {
            super(2, z, null);
            this.value = t;
        }
    }

    public /* synthetic */ Field(int i, boolean z, zcl zclVar) {
        this(i, z);
    }

    private Field(int i, boolean z) {
        this.type = i;
        this.overridable = z;
    }
}
