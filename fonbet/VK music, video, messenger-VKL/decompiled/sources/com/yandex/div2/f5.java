package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.g5;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import xsna.fpf0;

/* compiled from: DivImageBackground.kt */
/* loaded from: classes8.dex */
public final class f5 implements JSONSerializable, Hashable {
    public final Expression<Double> a;
    public final Expression<DivAlignmentHorizontal> b;
    public final Expression<DivAlignmentVertical> c;
    public final List<e4> d;
    public final Expression<Uri> e;
    public final Expression<Boolean> f;
    public final Expression<DivImageScale> g;
    public Integer h;

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        Expression.Companion.constant$default(companion, DivAlignmentHorizontal.CENTER, null, 2, null);
        Expression.Companion.constant$default(companion, DivAlignmentVertical.CENTER, null, 2, null);
        Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        Expression.Companion.constant$default(companion, DivImageScale.FILL, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f5(Expression<Double> expression, Expression<DivAlignmentHorizontal> expression2, Expression<DivAlignmentVertical> expression3, List<? extends e4> list, Expression<Uri> expression4, Expression<Boolean> expression5, Expression<DivImageScale> expression6) {
        this.a = expression;
        this.b = expression2;
        this.c = expression3;
        this.d = list;
        this.e = expression4;
        this.f = expression5;
        this.g = expression6;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.h;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.c.hashCode() + this.b.hashCode() + this.a.hashCode() + fpf0.a(f5.class).hashCode();
        int i = 0;
        List<e4> list = this.d;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                i += ((e4) it.next()).hash();
            }
        }
        int hashCode2 = this.g.hashCode() + this.f.hashCode() + this.e.hashCode() + hashCode + i;
        this.h = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((g5.d) BuiltInParserKt.getBuiltInParserComponent().U3.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
