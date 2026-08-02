package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.p8;
import com.yandex.div2.rb;
import com.yandex.div2.u6;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.epx;

/* compiled from: DivTextGradientJsonParser.kt */
/* loaded from: classes8.dex */
public final class sb implements Serializer, Deserializer {
    public final fe a;

    public sb(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, rb rbVar) throws ParsingException {
        boolean z = rbVar instanceof rb.a;
        fe feVar = this.a;
        if (z) {
            return ((u6.a) feVar.P4.getValue()).serialize(parsingContext, ((rb.a) rbVar).b);
        }
        if (rbVar instanceof rb.b) {
            return ((p8.a) feVar.o6.getValue()).serialize(parsingContext, ((rb.b) rbVar).b);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        boolean f = epx.f(readString, "gradient");
        fe feVar = this.a;
        if (f) {
            return new rb.a(((u6.a) feVar.P4.getValue()).deserialize(parsingContext, jSONObject));
        }
        if (epx.f(readString, "radial_gradient")) {
            return new rb.b(((p8.a) feVar.o6.getValue()).deserialize(parsingContext, jSONObject));
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        vb vbVar = orThrow instanceof vb ? (vb) orThrow : null;
        if (vbVar != null) {
            return ((ub) feVar.c8.getValue()).resolve(parsingContext, vbVar, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }
}
