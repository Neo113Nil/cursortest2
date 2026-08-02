package com.yandex.div2;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.yandex.div.data.Hashable;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.k3;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import xsna.fpf0;

/* compiled from: DivData.kt */
/* loaded from: classes8.dex */
public final class j3 implements JSONSerializable, Hashable {
    public static final a j = new a();
    public final List<t4> a;
    public final String b;
    public final List<b> c;
    public final List<xc> d;
    public final Expression<DivTransitionSelector> e;
    public final List<DivTrigger> f;
    public final List<md> g;
    public final List<Exception> h;
    public Integer i;

    /* compiled from: DivData.kt */
    public static final class a {
    }

    /* compiled from: DivData.kt */
    public static final class b implements JSONSerializable, Hashable {
        public final com.yandex.div2.a a;
        public final long b;
        public Integer c;

        public b(long j, com.yandex.div2.a aVar) {
            this.a = aVar;
            this.b = j;
        }

        @Override // com.yandex.div.data.Hashable
        public final int hash() {
            Integer num = this.c;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = Long.hashCode(this.b) + this.a.hash() + fpf0.a(b.class).hashCode();
            this.c = Integer.valueOf(hashCode);
            return hashCode;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public final JSONObject writeToJSON() {
            l3 l3Var = (l3) BuiltInParserKt.getBuiltInParserComponent().G2.getValue();
            ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
            l3Var.getClass();
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(builtInParsingContext, jSONObject, TtmlNode.TAG_DIV, this.a, l3Var.a.z9);
            JsonPropertyParser.write(builtInParsingContext, jSONObject, "state_id", Long.valueOf(this.b));
            return jSONObject;
        }
    }

    static {
        Expression.Companion.constant$default(Expression.Companion, DivTransitionSelector.NONE, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j3(List<t4> list, String str, List<b> list2, List<xc> list3, Expression<DivTransitionSelector> expression, List<DivTrigger> list4, List<? extends md> list5, List<? extends Exception> list6) {
        this.a = list;
        this.b = str;
        this.c = list2;
        this.d = list3;
        this.e = expression;
        this.f = list4;
        this.g = list5;
        this.h = list6;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        int i;
        int i2;
        int i3;
        Integer num = this.i;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = fpf0.a(j3.class).hashCode();
        int i4 = 0;
        List<t4> list = this.a;
        if (list != null) {
            Iterator<T> it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                i += ((t4) it.next()).hash();
            }
        } else {
            i = 0;
        }
        int hashCode2 = this.b.hashCode() + hashCode + i;
        Iterator<T> it2 = this.c.iterator();
        int i5 = 0;
        while (it2.hasNext()) {
            i5 += ((b) it2.next()).hash();
        }
        int i6 = hashCode2 + i5;
        List<xc> list2 = this.d;
        if (list2 != null) {
            Iterator<T> it3 = list2.iterator();
            i2 = 0;
            while (it3.hasNext()) {
                i2 += ((xc) it3.next()).hash();
            }
        } else {
            i2 = 0;
        }
        int hashCode3 = this.e.hashCode() + i6 + i2;
        List<DivTrigger> list3 = this.f;
        if (list3 != null) {
            Iterator<T> it4 = list3.iterator();
            i3 = 0;
            while (it4.hasNext()) {
                i3 += ((DivTrigger) it4.next()).hash();
            }
        } else {
            i3 = 0;
        }
        int i7 = hashCode3 + i3;
        List<md> list4 = this.g;
        if (list4 != null) {
            Iterator<T> it5 = list4.iterator();
            while (it5.hasNext()) {
                i4 += ((md) it5.next()).hash();
            }
        }
        int i8 = i7 + i4;
        this.i = Integer.valueOf(i8);
        return i8;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((k3.b) BuiltInParserKt.getBuiltInParserComponent().E2.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
