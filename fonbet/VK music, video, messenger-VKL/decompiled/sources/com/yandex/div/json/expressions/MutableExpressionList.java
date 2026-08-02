package com.yandex.div.json.expressions;

import com.yandex.div.core.CompositeDisposable;
import com.yandex.div.core.Disposable;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.c5g;
import xsna.epx;
import xsna.izs;
import xsna.j5g;
import xsna.s3q0;

/* compiled from: ExpressionList.kt */
/* loaded from: classes7.dex */
public final class MutableExpressionList<T> implements ExpressionList<T> {
    private final List<Expression<T>> expressions;
    private final String key;
    private List<? extends T> lastValidValuesList;
    private final ListValidator<T> listValidator;
    private final ParsingErrorLogger logger;

    /* JADX WARN: Multi-variable type inference failed */
    public MutableExpressionList(String str, List<? extends Expression<T>> list, ListValidator<T> listValidator, ParsingErrorLogger parsingErrorLogger) {
        this.key = str;
        this.expressions = list;
        this.listValidator = listValidator;
        this.logger = parsingErrorLogger;
    }

    private final List<T> tryResolve(ExpressionResolver expressionResolver) {
        List<Expression<T>> list = this.expressions;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Expression) it.next()).evaluate(expressionResolver));
        }
        if (this.listValidator.isValid(arrayList)) {
            return arrayList;
        }
        throw ParsingExceptionKt.invalidValue(this.key, arrayList);
    }

    public boolean equals(Object obj) {
        return (obj instanceof MutableExpressionList) && epx.f(this.expressions, ((MutableExpressionList) obj).expressions);
    }

    @Override // com.yandex.div.json.expressions.ExpressionList
    public List<T> evaluate(ExpressionResolver expressionResolver) {
        try {
            List<T> tryResolve = tryResolve(expressionResolver);
            this.lastValidValuesList = tryResolve;
            return tryResolve;
        } catch (ParsingException e) {
            this.logger.logError(e);
            List<? extends T> list = this.lastValidValuesList;
            if (list != null) {
                return list;
            }
            throw e;
        }
    }

    public final List<Expression<T>> getExpressionsInternal() {
        return this.expressions;
    }

    public int hashCode() {
        return this.expressions.hashCode() * 16;
    }

    @Override // com.yandex.div.json.expressions.ExpressionList
    public Disposable observe(final ExpressionResolver expressionResolver, final izs<? super List<? extends T>, s3q0> izsVar) {
        izs<T, s3q0> izsVar2 = new izs<T, s3q0>() { // from class: com.yandex.div.json.expressions.MutableExpressionList$observe$itemCallback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Object obj) {
                invoke2((MutableExpressionList$observe$itemCallback$1<T>) obj);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(T t) {
                izsVar.invoke(this.evaluate(expressionResolver));
            }
        };
        if (this.expressions.size() == 1) {
            return ((Expression) j5g.Y(this.expressions)).observe(expressionResolver, izsVar2);
        }
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        Iterator<T> it = this.expressions.iterator();
        while (it.hasNext()) {
            compositeDisposable.add(((Expression) it.next()).observe(expressionResolver, izsVar2));
        }
        return compositeDisposable;
    }
}
