package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivAppearanceTransitionTemplate.kt */
/* loaded from: classes8.dex */
public abstract class i1 implements JSONSerializable, JsonTemplate<e1> {

    /* compiled from: DivAppearanceTransitionTemplate.kt */
    public static final class a extends i1 {
        public final d4 a;

        public a(d4 d4Var) {
            this.a = d4Var;
        }
    }

    /* compiled from: DivAppearanceTransitionTemplate.kt */
    public static final class b extends i1 {
        public final d9 a;

        public b(d9 d9Var) {
            this.a = d9Var;
        }
    }

    /* compiled from: DivAppearanceTransitionTemplate.kt */
    public static final class c extends i1 {
        public final d1 a;

        public c(d1 d1Var) {
            this.a = d1Var;
        }
    }

    /* compiled from: DivAppearanceTransitionTemplate.kt */
    public static final class d extends i1 {
        public final ea a;

        public d(ea eaVar) {
            this.a = eaVar;
        }
    }

    public final Object a() {
        if (this instanceof c) {
            return ((c) this).a;
        }
        if (this instanceof a) {
            return ((a) this).a;
        }
        if (this instanceof b) {
            return ((b) this).a;
        }
        if (this instanceof d) {
            return ((d) this).a;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((g1) BuiltInParserKt.getBuiltInParserComponent().A1.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
