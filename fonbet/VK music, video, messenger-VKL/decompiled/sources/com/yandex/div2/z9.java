package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.orn;

/* compiled from: DivSizeTemplate.kt */
/* loaded from: classes8.dex */
public abstract class z9 implements JSONSerializable, JsonTemplate<v9> {

    /* compiled from: DivSizeTemplate.kt */
    public static final class a extends z9 {
        public final s4 a;

        public a(s4 s4Var) {
            this.a = s4Var;
        }
    }

    /* compiled from: DivSizeTemplate.kt */
    public static final class b extends z9 {
        public final y6 a;

        public b(y6 y6Var) {
            this.a = y6Var;
        }
    }

    /* compiled from: DivSizeTemplate.kt */
    public static final class c extends z9 {
        public final orn a;

        public c(orn ornVar) {
            this.a = ornVar;
        }
    }

    public final Object a() {
        if (this instanceof a) {
            return ((a) this).a;
        }
        if (this instanceof b) {
            return ((b) this).a;
        }
        if (this instanceof c) {
            return ((c) this).a;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((x9) BuiltInParserKt.getBuiltInParserComponent().Z6.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
