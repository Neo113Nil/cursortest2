package com.yandex.div2;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.yandex.div.data.Hashable;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.f0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.epx;
import xsna.fpf0;
import xsna.izs;

/* compiled from: DivActionSubmit.kt */
/* loaded from: classes8.dex */
public final class DivActionSubmit implements JSONSerializable, Hashable {
    public final Expression<String> a;
    public final List<DivAction> b;
    public final List<DivAction> c;
    public final Request d;
    public Integer e;

    /* compiled from: DivActionSubmit.kt */
    public static final class Request implements JSONSerializable, Hashable {
        public final List<a> a;
        public final Expression<Method> b;
        public final Expression<Uri> c;
        public Integer d;

        /* compiled from: DivActionSubmit.kt */
        public enum Method {
            GET("get"),
            POST("post"),
            PUT("put"),
            PATCH("patch"),
            DELETE("delete"),
            HEAD(TtmlNode.TAG_HEAD),
            OPTIONS(SignalingProtocol.KEY_OPTIONS);

            private final String value;
            public static final c Converter = new c();
            public static final izs<Method, String> TO_STRING = b.i;
            public static final izs<String, Method> FROM_STRING = a.i;

            /* compiled from: DivActionSubmit.kt */
            public static final class a extends Lambda implements izs<String, Method> {
                public static final a i = new a(1);

                @Override // xsna.izs
                public final Method invoke(String str) {
                    String str2 = str;
                    Method.Converter.getClass();
                    Method method = Method.GET;
                    if (epx.f(str2, method.value)) {
                        return method;
                    }
                    Method method2 = Method.POST;
                    if (epx.f(str2, method2.value)) {
                        return method2;
                    }
                    Method method3 = Method.PUT;
                    if (epx.f(str2, method3.value)) {
                        return method3;
                    }
                    Method method4 = Method.PATCH;
                    if (epx.f(str2, method4.value)) {
                        return method4;
                    }
                    Method method5 = Method.DELETE;
                    if (epx.f(str2, method5.value)) {
                        return method5;
                    }
                    Method method6 = Method.HEAD;
                    if (epx.f(str2, method6.value)) {
                        return method6;
                    }
                    Method method7 = Method.OPTIONS;
                    if (epx.f(str2, method7.value)) {
                        return method7;
                    }
                    return null;
                }
            }

            /* compiled from: DivActionSubmit.kt */
            public static final class b extends Lambda implements izs<Method, String> {
                public static final b i = new b(1);

                @Override // xsna.izs
                public final String invoke(Method method) {
                    Method.Converter.getClass();
                    return method.value;
                }
            }

            /* compiled from: DivActionSubmit.kt */
            public static final class c {
            }

            Method(String str) {
                this.value = str;
            }
        }

        /* compiled from: DivActionSubmit.kt */
        public static final class a implements JSONSerializable, Hashable {
            public final Expression<String> a;
            public final Expression<String> b;
            public Integer c;

            public a(Expression<String> expression, Expression<String> expression2) {
                this.a = expression;
                this.b = expression2;
            }

            @Override // com.yandex.div.data.Hashable
            public final int hash() {
                Integer num = this.c;
                if (num != null) {
                    return num.intValue();
                }
                int hashCode = this.b.hashCode() + this.a.hashCode() + fpf0.a(a.class).hashCode();
                this.c = Integer.valueOf(hashCode);
                return hashCode;
            }

            @Override // com.yandex.div.json.JSONSerializable
            public final JSONObject writeToJSON() {
                c0 c0Var = (c0) BuiltInParserKt.getBuiltInParserComponent().V0.getValue();
                ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
                c0Var.getClass();
                JSONObject jSONObject = new JSONObject();
                JsonExpressionParser.writeExpression(builtInParsingContext, jSONObject, "name", this.a);
                JsonExpressionParser.writeExpression(builtInParsingContext, jSONObject, "value", this.b);
                return jSONObject;
            }
        }

        static {
            Expression.Companion.constant$default(Expression.Companion, Method.POST, null, 2, null);
        }

        public Request(List<a> list, Expression<Method> expression, Expression<Uri> expression2) {
            this.a = list;
            this.b = expression;
            this.c = expression2;
        }

        @Override // com.yandex.div.data.Hashable
        public final int hash() {
            Integer num = this.d;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = fpf0.a(Request.class).hashCode();
            int i = 0;
            List<a> list = this.a;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    i += ((a) it.next()).hash();
                }
            }
            int hashCode2 = this.c.hashCode() + this.b.hashCode() + hashCode + i;
            this.d = Integer.valueOf(hashCode2);
            return hashCode2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public final JSONObject writeToJSON() {
            return ((f0.b) BuiltInParserKt.getBuiltInParserComponent().S0.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    public DivActionSubmit(Expression<String> expression, List<DivAction> list, List<DivAction> list2, Request request) {
        this.a = expression;
        this.b = list;
        this.c = list2;
        this.d = request;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        int i;
        Integer num = this.e;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.a.hashCode() + fpf0.a(DivActionSubmit.class).hashCode();
        int i2 = 0;
        List<DivAction> list = this.b;
        if (list != null) {
            Iterator<T> it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                i += ((DivAction) it.next()).hash();
            }
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        List<DivAction> list2 = this.c;
        if (list2 != null) {
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                i2 += ((DivAction) it2.next()).hash();
            }
        }
        int hash = this.d.hash() + i3 + i2;
        this.e = Integer.valueOf(hash);
        return hash;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((a0) BuiltInParserKt.getBuiltInParserComponent().P0.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
