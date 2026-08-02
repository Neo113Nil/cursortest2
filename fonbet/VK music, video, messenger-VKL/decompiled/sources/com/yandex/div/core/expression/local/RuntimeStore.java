package com.yandex.div.core.expression.local;

import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.expression.ExpressionsRuntime;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.a;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import xsna.gzs;
import xsna.ikn;
import xsna.izs;
import xsna.s3q0;

/* compiled from: RuntimeStore.kt */
/* loaded from: classes7.dex */
public interface RuntimeStore {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: RuntimeStore.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final RuntimeStore EMPTY = new RuntimeStore() { // from class: com.yandex.div.core.expression.local.RuntimeStore$Companion$EMPTY$1
            private final Void throwException() {
                throw new IllegalStateException("Trying to use RuntimeStore before initializing.");
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            public /* bridge */ /* synthetic */ ExpressionsRuntime getOrCreateRuntime(DivStatePath divStatePath, a aVar, ExpressionResolver expressionResolver) {
                return (ExpressionsRuntime) m115getOrCreateRuntime(divStatePath, aVar, expressionResolver);
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            public /* bridge */ /* synthetic */ ExpressionResolver getOrPutItemBuilderResolver(String str, ExpressionResolver expressionResolver, gzs gzsVar) {
                return (ExpressionResolver) m116getOrPutItemBuilderResolver(str, expressionResolver, (gzs<? extends ExpressionResolver>) gzsVar);
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            public ExpressionsRuntime getRootRuntime() {
                throwException();
                throw new KotlinNothingValueException();
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            public /* bridge */ /* synthetic */ ExpressionsRuntime getRuntimeWithOrNull(ExpressionResolver expressionResolver) {
                return (ExpressionsRuntime) m117getRuntimeWithOrNull(expressionResolver);
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            public Map<String, ExpressionsRuntime> getUniquePathsAndRuntimes() {
                throwException();
                throw new KotlinNothingValueException();
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            public /* bridge */ /* synthetic */ ExpressionsRuntime resolveRuntimeWith(DivViewFacade divViewFacade, DivStatePath divStatePath, a aVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
                return (ExpressionsRuntime) m118resolveRuntimeWith(divViewFacade, divStatePath, aVar, expressionResolver, expressionResolver2);
            }

            /* renamed from: getOrCreateRuntime, reason: collision with other method in class */
            public Void m115getOrCreateRuntime(DivStatePath divStatePath, a aVar, ExpressionResolver expressionResolver) {
                throw new IllegalStateException();
            }

            /* renamed from: getOrPutItemBuilderResolver, reason: collision with other method in class */
            public Void m116getOrPutItemBuilderResolver(String str, ExpressionResolver expressionResolver, gzs<? extends ExpressionResolver> gzsVar) {
                throwException();
                throw new KotlinNothingValueException();
            }

            /* renamed from: getRuntimeWithOrNull, reason: collision with other method in class */
            public Void m117getRuntimeWithOrNull(ExpressionResolver expressionResolver) {
                throwException();
                throw new KotlinNothingValueException();
            }

            /* renamed from: resolveRuntimeWith, reason: collision with other method in class */
            public Void m118resolveRuntimeWith(DivViewFacade divViewFacade, DivStatePath divStatePath, a aVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
                throwException();
                throw new KotlinNothingValueException();
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            public void updateSubscriptions() {
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            public void cleanupRuntimes(DivViewFacade divViewFacade) {
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            public void clearBindings(DivViewFacade divViewFacade) {
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            public void onDetachedFromWindow(DivViewFacade divViewFacade) {
            }

            @Override // com.yandex.div.core.expression.local.RuntimeStore
            public void traverseFrom(ExpressionsRuntime expressionsRuntime, DivStatePath divStatePath, izs<? super ExpressionsRuntime, s3q0> izsVar) {
            }
        };

        private Companion() {
        }

        public final RuntimeStore getEMPTY() {
            return EMPTY;
        }
    }

    void cleanupRuntimes(DivViewFacade divViewFacade);

    void clearBindings(DivViewFacade divViewFacade);

    ExpressionsRuntime getOrCreateRuntime(DivStatePath divStatePath, a aVar, ExpressionResolver expressionResolver);

    ExpressionResolver getOrPutItemBuilderResolver(String str, ExpressionResolver expressionResolver, gzs<? extends ExpressionResolver> gzsVar);

    ExpressionsRuntime getRootRuntime();

    ExpressionsRuntime getRuntimeWithOrNull(ExpressionResolver expressionResolver);

    Map<String, ExpressionsRuntime> getUniquePathsAndRuntimes();

    void onDetachedFromWindow(DivViewFacade divViewFacade);

    ExpressionsRuntime resolveRuntimeWith(DivViewFacade divViewFacade, DivStatePath divStatePath, a aVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2);

    void traverseFrom(ExpressionsRuntime expressionsRuntime, DivStatePath divStatePath, izs<? super ExpressionsRuntime, s3q0> izsVar);

    void updateSubscriptions();

    default void showWarningIfNeeded(ikn iknVar) {
    }
}
