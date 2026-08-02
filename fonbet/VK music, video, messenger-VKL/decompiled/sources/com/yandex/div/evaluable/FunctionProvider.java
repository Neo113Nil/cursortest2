package com.yandex.div.evaluable;

import java.util.List;

/* compiled from: FunctionProvider.kt */
/* loaded from: classes7.dex */
public interface FunctionProvider {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final FunctionProvider STUB = new FunctionProvider() { // from class: com.yandex.div.evaluable.FunctionProvider$Companion$STUB$1
        @Override // com.yandex.div.evaluable.FunctionProvider
        public Function get(String str, List<? extends EvaluableType> list) {
            return Function.STUB;
        }

        @Override // com.yandex.div.evaluable.FunctionProvider
        public Function getMethod(String str, List<? extends EvaluableType> list) {
            return Function.STUB;
        }
    };

    /* compiled from: FunctionProvider.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    Function get(String str, List<? extends EvaluableType> list);

    Function getMethod(String str, List<? extends EvaluableType> list);
}
