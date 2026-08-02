package com.yandex.div.core;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div2.j3;

/* compiled from: DivDataChangeListener.kt */
/* loaded from: classes7.dex */
public interface DivDataChangeListener {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final DivDataChangeListener STUB = new DivDataChangeListener() { // from class: com.yandex.div.core.DivDataChangeListener$Companion$STUB$1
        @Override // com.yandex.div.core.DivDataChangeListener
        public void afterAnimatedDataChange(Div2View div2View, j3 j3Var) {
        }

        @Override // com.yandex.div.core.DivDataChangeListener
        public void beforeAnimatedDataChange(Div2View div2View, j3 j3Var) {
        }
    };

    /* compiled from: DivDataChangeListener.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void afterAnimatedDataChange(Div2View div2View, j3 j3Var);

    void beforeAnimatedDataChange(Div2View div2View, j3 j3Var);
}
