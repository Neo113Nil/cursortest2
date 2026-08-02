package com.yandex.div.json.expressions;

import com.yandex.div.core.Disposable;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingException;
import java.util.List;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;

/* compiled from: ExpressionResolver.kt */
/* loaded from: classes7.dex */
public interface ExpressionResolver {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final ExpressionResolver EMPTY = new ExpressionResolver() { // from class: com.yandex.div.json.expressions.ExpressionResolver$Companion$EMPTY$1
        @Override // com.yandex.div.json.expressions.ExpressionResolver
        public <R, T> T get(String str, String str2, Evaluable evaluable, izs<? super R, ? extends T> izsVar, ValueValidator<T> valueValidator, TypeHelper<T> typeHelper, ParsingErrorLogger parsingErrorLogger) {
            return null;
        }

        @Override // com.yandex.div.json.expressions.ExpressionResolver
        public Disposable subscribeToExpression(String str, List<String> list, gzs<s3q0> gzsVar) {
            return Disposable.NULL;
        }
    };

    /* compiled from: ExpressionResolver.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    <R, T> T get(String str, String str2, Evaluable evaluable, izs<? super R, ? extends T> izsVar, ValueValidator<T> valueValidator, TypeHelper<T> typeHelper, ParsingErrorLogger parsingErrorLogger);

    Disposable subscribeToExpression(String str, List<String> list, gzs<s3q0> gzsVar);

    default void notifyResolveFailed(ParsingException parsingException) {
    }
}
