package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.s0;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.epx;
import xsna.fpf0;
import xsna.izs;

/* compiled from: DivActionVideo.kt */
/* loaded from: classes8.dex */
public final class DivActionVideo implements JSONSerializable, Hashable {
    public final Expression<Action> a;
    public final Expression<String> b;
    public Integer c;

    /* compiled from: DivActionVideo.kt */
    public enum Action {
        START("start"),
        PAUSE("pause");

        private final String value;
        public static final c Converter = new c();
        public static final izs<Action, String> TO_STRING = b.i;
        public static final izs<String, Action> FROM_STRING = a.i;

        /* compiled from: DivActionVideo.kt */
        public static final class a extends Lambda implements izs<String, Action> {
            public static final a i = new a(1);

            @Override // xsna.izs
            public final Action invoke(String str) {
                String str2 = str;
                Action.Converter.getClass();
                Action action = Action.START;
                if (epx.f(str2, action.value)) {
                    return action;
                }
                Action action2 = Action.PAUSE;
                if (epx.f(str2, action2.value)) {
                    return action2;
                }
                return null;
            }
        }

        /* compiled from: DivActionVideo.kt */
        public static final class b extends Lambda implements izs<Action, String> {
            public static final b i = new b(1);

            @Override // xsna.izs
            public final String invoke(Action action) {
                Action.Converter.getClass();
                return action.value;
            }
        }

        /* compiled from: DivActionVideo.kt */
        public static final class c {
        }

        Action(String str) {
            this.value = str;
        }
    }

    public DivActionVideo(Expression<Action> expression, Expression<String> expression2) {
        this.a = expression;
        this.b = expression2;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.b.hashCode() + this.a.hashCode() + fpf0.a(DivActionVideo.class).hashCode();
        this.c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        s0.b bVar = (s0.b) BuiltInParserKt.getBuiltInParserComponent().h1.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        bVar.getClass();
        return s0.b.b(builtInParsingContext, this);
    }
}
