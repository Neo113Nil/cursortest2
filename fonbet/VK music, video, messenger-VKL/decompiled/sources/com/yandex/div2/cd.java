package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.bd;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.aqn;
import xsna.epx;
import xsna.eqn;
import xsna.fqn;
import xsna.zpn;

/* compiled from: DivTooltipModeJsonParser.kt */
/* loaded from: classes8.dex */
public final class cd implements Serializer, Deserializer {
    public final fe a;

    public cd(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, bd bdVar) throws ParsingException {
        boolean z = bdVar instanceof bd.b;
        fe feVar = this.a;
        if (z) {
            fqn fqnVar = (fqn) feVar.P8.getValue();
            eqn eqnVar = ((bd.b) bdVar).b;
            fqnVar.getClass();
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "non_modal");
            return jSONObject;
        }
        if (!(bdVar instanceof bd.a)) {
            throw new NoWhenBranchMatchedException();
        }
        aqn aqnVar = (aqn) feVar.M8.getValue();
        zpn zpnVar = ((bd.a) bdVar).b;
        aqnVar.getClass();
        JSONObject jSONObject2 = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject2, "type", "modal");
        return jSONObject2;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        boolean f = epx.f(readString, "non_modal");
        fe feVar = this.a;
        if (f) {
            ((fqn) feVar.P8.getValue()).getClass();
            return new bd.b(new eqn());
        }
        if (epx.f(readString, "modal")) {
            ((aqn) feVar.M8.getValue()).getClass();
            return new bd.a(new zpn());
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        fd fdVar = orThrow instanceof fd ? (fd) orThrow : null;
        if (fdVar != null) {
            return ((ed) feVar.U8.getValue()).a(fdVar);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }
}
