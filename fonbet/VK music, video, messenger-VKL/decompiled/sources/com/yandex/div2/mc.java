package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.ic;
import com.yandex.div2.qc;
import com.yandex.div2.tc;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.epx;

/* compiled from: DivTextRangeMaskJsonParser.kt */
/* loaded from: classes8.dex */
public final class mc implements Serializer, Deserializer {
    public final fe a;

    public mc(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, ic icVar) throws ParsingException {
        boolean z = icVar instanceof ic.a;
        fe feVar = this.a;
        if (z) {
            return ((qc.a) feVar.l8.getValue()).serialize(parsingContext, ((ic.a) icVar).b);
        }
        if (!(icVar instanceof ic.b)) {
            throw new NoWhenBranchMatchedException();
        }
        tc.a aVar = (tc.a) feVar.o8.getValue();
        sc scVar = ((ic.b) icVar).b;
        aVar.getClass();
        return tc.a.b(parsingContext, scVar);
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        boolean f = epx.f(readString, "particles");
        fe feVar = this.a;
        if (f) {
            return new ic.a(((qc.a) feVar.l8.getValue()).deserialize(parsingContext, jSONObject));
        }
        if (epx.f(readString, "solid")) {
            ((tc.a) feVar.o8.getValue()).getClass();
            return new ic.b(tc.a.a(parsingContext, jSONObject));
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        vc vcVar = orThrow instanceof vc ? (vc) orThrow : null;
        if (vcVar != null) {
            return ((oc) feVar.t8.getValue()).resolve(parsingContext, vcVar, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }
}
