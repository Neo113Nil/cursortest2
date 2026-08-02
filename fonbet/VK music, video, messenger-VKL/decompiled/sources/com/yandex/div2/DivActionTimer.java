package com.yandex.div2;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.i0;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.epx;
import xsna.fpf0;
import xsna.izs;

/* compiled from: DivActionTimer.kt */
/* loaded from: classes8.dex */
public final class DivActionTimer implements JSONSerializable, Hashable {
    public final Expression<Action> a;
    public final Expression<String> b;
    public Integer c;

    /* compiled from: DivActionTimer.kt */
    public enum Action {
        START("start"),
        STOP("stop"),
        PAUSE("pause"),
        RESUME(CampaignEx.JSON_NATIVE_VIDEO_RESUME),
        CANCEL("cancel"),
        RESET("reset");

        private final String value;
        public static final c Converter = new c();
        public static final izs<Action, String> TO_STRING = b.i;
        public static final izs<String, Action> FROM_STRING = a.i;

        /* compiled from: DivActionTimer.kt */
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
                Action action2 = Action.STOP;
                if (epx.f(str2, action2.value)) {
                    return action2;
                }
                Action action3 = Action.PAUSE;
                if (epx.f(str2, action3.value)) {
                    return action3;
                }
                Action action4 = Action.RESUME;
                if (epx.f(str2, action4.value)) {
                    return action4;
                }
                Action action5 = Action.CANCEL;
                if (epx.f(str2, action5.value)) {
                    return action5;
                }
                Action action6 = Action.RESET;
                if (epx.f(str2, action6.value)) {
                    return action6;
                }
                return null;
            }
        }

        /* compiled from: DivActionTimer.kt */
        public static final class b extends Lambda implements izs<Action, String> {
            public static final b i = new b(1);

            @Override // xsna.izs
            public final String invoke(Action action) {
                Action.Converter.getClass();
                return action.value;
            }
        }

        /* compiled from: DivActionTimer.kt */
        public static final class c {
        }

        Action(String str) {
            this.value = str;
        }
    }

    public DivActionTimer(Expression<Action> expression, Expression<String> expression2) {
        this.a = expression;
        this.b = expression2;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.b.hashCode() + this.a.hashCode() + fpf0.a(DivActionTimer.class).hashCode();
        this.c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        i0.b bVar = (i0.b) BuiltInParserKt.getBuiltInParserComponent().Y0.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        bVar.getClass();
        return i0.b.b(builtInParsingContext, this);
    }
}
