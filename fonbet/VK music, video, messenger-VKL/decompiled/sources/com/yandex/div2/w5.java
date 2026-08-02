package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.don;
import xsna.okn;

/* compiled from: DivInputMaskTemplate.kt */
/* loaded from: classes8.dex */
public abstract class w5 implements JSONSerializable, JsonTemplate<s5> {

    /* compiled from: DivInputMaskTemplate.kt */
    public static final class a extends w5 {
        public final okn a;

        public a(okn oknVar) {
            this.a = oknVar;
        }
    }

    /* compiled from: DivInputMaskTemplate.kt */
    public static final class b extends w5 {
        public final p4 a;

        public b(p4 p4Var) {
            this.a = p4Var;
        }
    }

    /* compiled from: DivInputMaskTemplate.kt */
    public static final class c extends w5 {
        public final don a;

        public c(don donVar) {
            this.a = donVar;
        }
    }

    public final Object a() {
        if (this instanceof b) {
            return ((b) this).a;
        }
        if (this instanceof a) {
            return ((a) this).a;
        }
        if (this instanceof c) {
            return ((c) this).a;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((u5) BuiltInParserKt.getBuiltInParserComponent().t4.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
