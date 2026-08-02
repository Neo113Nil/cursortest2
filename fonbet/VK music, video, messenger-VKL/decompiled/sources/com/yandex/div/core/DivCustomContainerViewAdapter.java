package com.yandex.div.core;

import android.view.View;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.g3;

/* compiled from: DivCustomContainerViewAdapter.kt */
/* loaded from: classes7.dex */
public interface DivCustomContainerViewAdapter {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final DivCustomContainerViewAdapter STUB = new DivCustomContainerViewAdapter() { // from class: com.yandex.div.core.DivCustomContainerViewAdapter$Companion$STUB$1
        @Override // com.yandex.div.core.DivCustomContainerViewAdapter
        public View createView(g3 g3Var, Div2View div2View, ExpressionResolver expressionResolver, DivStatePath divStatePath) {
            throw new UnsupportedOperationException();
        }

        @Override // com.yandex.div.core.DivCustomContainerViewAdapter
        public boolean isCustomTypeSupported(String str) {
            return false;
        }

        @Override // com.yandex.div.core.DivCustomContainerViewAdapter
        public DivPreloader.PreloadReference preload(g3 g3Var, DivPreloader.Callback callback) {
            return DivPreloader.PreloadReference.Companion.getEMPTY();
        }

        @Override // com.yandex.div.core.DivCustomContainerViewAdapter
        public void release(View view, g3 g3Var) {
        }

        @Override // com.yandex.div.core.DivCustomContainerViewAdapter
        public void bindView(View view, g3 g3Var, Div2View div2View, ExpressionResolver expressionResolver, DivStatePath divStatePath) {
        }
    };

    /* compiled from: DivCustomContainerViewAdapter.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void bindView(View view, g3 g3Var, Div2View div2View, ExpressionResolver expressionResolver, DivStatePath divStatePath);

    View createView(g3 g3Var, Div2View div2View, ExpressionResolver expressionResolver, DivStatePath divStatePath);

    boolean isCustomTypeSupported(String str);

    default DivPreloader.PreloadReference preload(g3 g3Var, DivPreloader.Callback callback) {
        return DivPreloader.PreloadReference.Companion.getEMPTY();
    }

    void release(View view, g3 g3Var);
}
