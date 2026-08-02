package com.yandex.div.core.dagger;

import com.yandex.div.core.view2.state.DivJoinedStateSwitcher;
import com.yandex.div.core.view2.state.DivMultipleStateSwitcher;
import com.yandex.div.core.view2.state.DivStateSwitcher;
import xsna.e9e0;

/* compiled from: Div2ViewModule.kt */
/* loaded from: classes7.dex */
public interface Div2ViewModule {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: Div2ViewModule.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final DivStateSwitcher provideStateSwitcher(boolean z, e9e0<DivJoinedStateSwitcher> e9e0Var, e9e0<DivMultipleStateSwitcher> e9e0Var2) {
            return z ? e9e0Var2.get() : e9e0Var.get();
        }
    }

    static DivStateSwitcher provideStateSwitcher(boolean z, e9e0<DivJoinedStateSwitcher> e9e0Var, e9e0<DivMultipleStateSwitcher> e9e0Var2) {
        return Companion.provideStateSwitcher(z, e9e0Var, e9e0Var2);
    }
}
