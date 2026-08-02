package com.yandex.div.internal.parser;

import xsna.izs;

/* compiled from: TypeHelpers.kt */
/* loaded from: classes7.dex */
public interface TypeHelper<T> {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: TypeHelpers.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final <T> TypeHelper<T> from(final T t, final izs<Object, Boolean> izsVar) {
            return new TypeHelper<T>(t, izsVar) { // from class: com.yandex.div.internal.parser.TypeHelper$Companion$from$1
                final /* synthetic */ izs<Object, Boolean> $validator;
                private final T typeDefault;

                {
                    this.$validator = izsVar;
                    this.typeDefault = t;
                }

                @Override // com.yandex.div.internal.parser.TypeHelper
                public T getTypeDefault() {
                    return this.typeDefault;
                }

                @Override // com.yandex.div.internal.parser.TypeHelper
                public boolean isTypeValid(Object obj) {
                    return this.$validator.invoke(obj).booleanValue();
                }
            };
        }
    }

    T getTypeDefault();

    boolean isTypeValid(Object obj);
}
