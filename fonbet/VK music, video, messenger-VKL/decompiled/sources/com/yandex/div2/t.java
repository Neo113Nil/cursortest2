package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.bqk0;
import xsna.pkp;

/* compiled from: DivActionScrollDestinationTemplate.kt */
/* loaded from: classes8.dex */
public abstract class t implements JSONSerializable, JsonTemplate<p> {

    /* compiled from: DivActionScrollDestinationTemplate.kt */
    public static final class a extends t {
        public final pkp a;

        public a(pkp pkpVar) {
            this.a = pkpVar;
        }
    }

    /* compiled from: DivActionScrollDestinationTemplate.kt */
    public static final class b extends t {
        public final ee a;

        public b(ee eeVar) {
            this.a = eeVar;
        }
    }

    /* compiled from: DivActionScrollDestinationTemplate.kt */
    public static final class c extends t {
        public final ie a;

        public c(ie ieVar) {
            this.a = ieVar;
        }
    }

    /* compiled from: DivActionScrollDestinationTemplate.kt */
    public static final class d extends t {
        public final bqk0 a;

        public d(bqk0 bqk0Var) {
            this.a = bqk0Var;
        }
    }

    public final Object a() {
        if (this instanceof c) {
            return ((c) this).a;
        }
        if (this instanceof b) {
            return ((b) this).a;
        }
        if (this instanceof d) {
            return ((d) this).a;
        }
        if (this instanceof a) {
            return ((a) this).a;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((r) BuiltInParserKt.getBuiltInParserComponent().y0.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
