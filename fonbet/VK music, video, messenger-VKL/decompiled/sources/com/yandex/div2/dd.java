package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.fd;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.bqn;
import xsna.dqn;
import xsna.epx;
import xsna.gqn;
import xsna.iqn;

/* compiled from: DivTooltipModeJsonParser.kt */
/* loaded from: classes8.dex */
public final class dd implements Serializer, Deserializer {
    public final fe a;

    public dd(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, fd fdVar) throws ParsingException {
        boolean z = fdVar instanceof fd.b;
        fe feVar = this.a;
        if (z) {
            gqn gqnVar = (gqn) feVar.Q8.getValue();
            iqn iqnVar = ((fd.b) fdVar).a;
            gqnVar.getClass();
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "non_modal");
            return jSONObject;
        }
        if (!(fdVar instanceof fd.a)) {
            throw new NoWhenBranchMatchedException();
        }
        bqn bqnVar = (bqn) feVar.N8.getValue();
        dqn dqnVar = ((fd.a) fdVar).a;
        bqnVar.getClass();
        JSONObject jSONObject2 = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject2, "type", "modal");
        return jSONObject2;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        Object aVar;
        Object obj2;
        Object obj3;
        JSONObject jSONObject = (JSONObject) obj;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate<?> entityTemplate = parsingContext.getTemplates().get(readString);
        Object obj4 = null;
        fd fdVar = entityTemplate instanceof fd ? (fd) entityTemplate : null;
        if (fdVar != null) {
            if (fdVar instanceof fd.b) {
                readString = "non_modal";
            } else {
                if (!(fdVar instanceof fd.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                readString = "modal";
            }
        }
        boolean f = epx.f(readString, "non_modal");
        fe feVar = this.a;
        if (f) {
            gqn gqnVar = (gqn) feVar.Q8.getValue();
            if (fdVar != null) {
                if (fdVar instanceof fd.b) {
                    obj3 = ((fd.b) fdVar).a;
                } else {
                    if (!(fdVar instanceof fd.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    obj3 = ((fd.a) fdVar).a;
                }
                obj4 = obj3;
            }
            gqnVar.getClass();
            aVar = new fd.b(new iqn());
        } else {
            if (!epx.f(readString, "modal")) {
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
            }
            bqn bqnVar = (bqn) feVar.N8.getValue();
            if (fdVar != null) {
                if (fdVar instanceof fd.b) {
                    obj2 = ((fd.b) fdVar).a;
                } else {
                    if (!(fdVar instanceof fd.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    obj2 = ((fd.a) fdVar).a;
                }
                obj4 = obj2;
            }
            bqnVar.getClass();
            aVar = new fd.a(new dqn());
        }
        return aVar;
    }
}
