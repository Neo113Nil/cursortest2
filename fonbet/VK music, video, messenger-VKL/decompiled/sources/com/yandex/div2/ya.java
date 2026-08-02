package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.xa;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.epx;
import xsna.lpn;
import xsna.mpn;
import xsna.qpn;
import xsna.rpn;

/* compiled from: DivStrokeStyleJsonParser.kt */
/* loaded from: classes8.dex */
public final class ya implements Serializer, Deserializer {
    public final fe a;

    public ya(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, xa xaVar) throws ParsingException {
        boolean z = xaVar instanceof xa.b;
        fe feVar = this.a;
        if (z) {
            rpn rpnVar = (rpn) feVar.C7.getValue();
            qpn qpnVar = ((xa.b) xaVar).b;
            rpnVar.getClass();
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "solid");
            return jSONObject;
        }
        if (!(xaVar instanceof xa.a)) {
            throw new NoWhenBranchMatchedException();
        }
        mpn mpnVar = (mpn) feVar.z7.getValue();
        lpn lpnVar = ((xa.a) xaVar).b;
        mpnVar.getClass();
        JSONObject jSONObject2 = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject2, "type", "dashed");
        return jSONObject2;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        boolean f = epx.f(readString, "solid");
        fe feVar = this.a;
        if (f) {
            ((rpn) feVar.C7.getValue()).getClass();
            return new xa.b(new qpn());
        }
        if (epx.f(readString, "dashed")) {
            ((mpn) feVar.z7.getValue()).getClass();
            return new xa.a(new lpn());
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        bb bbVar = orThrow instanceof bb ? (bb) orThrow : null;
        if (bbVar != null) {
            return ((ab) feVar.H7.getValue()).a(bbVar);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }
}
