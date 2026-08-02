package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.bb;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.epx;
import xsna.npn;
import xsna.ppn;
import xsna.spn;
import xsna.upn;

/* compiled from: DivStrokeStyleJsonParser.kt */
/* loaded from: classes8.dex */
public final class za implements Serializer, Deserializer {
    public final fe a;

    public za(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, bb bbVar) throws ParsingException {
        boolean z = bbVar instanceof bb.b;
        fe feVar = this.a;
        if (z) {
            spn spnVar = (spn) feVar.D7.getValue();
            upn upnVar = ((bb.b) bbVar).a;
            spnVar.getClass();
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "solid");
            return jSONObject;
        }
        if (!(bbVar instanceof bb.a)) {
            throw new NoWhenBranchMatchedException();
        }
        npn npnVar = (npn) feVar.A7.getValue();
        ppn ppnVar = ((bb.a) bbVar).a;
        npnVar.getClass();
        JSONObject jSONObject2 = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject2, "type", "dashed");
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
        bb bbVar = entityTemplate instanceof bb ? (bb) entityTemplate : null;
        if (bbVar != null) {
            if (bbVar instanceof bb.b) {
                readString = "solid";
            } else {
                if (!(bbVar instanceof bb.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                readString = "dashed";
            }
        }
        boolean f = epx.f(readString, "solid");
        fe feVar = this.a;
        if (f) {
            spn spnVar = (spn) feVar.D7.getValue();
            if (bbVar != null) {
                if (bbVar instanceof bb.b) {
                    obj3 = ((bb.b) bbVar).a;
                } else {
                    if (!(bbVar instanceof bb.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    obj3 = ((bb.a) bbVar).a;
                }
                obj4 = obj3;
            }
            spnVar.getClass();
            aVar = new bb.b(new upn());
        } else {
            if (!epx.f(readString, "dashed")) {
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
            }
            npn npnVar = (npn) feVar.A7.getValue();
            if (bbVar != null) {
                if (bbVar instanceof bb.b) {
                    obj2 = ((bb.b) bbVar).a;
                } else {
                    if (!(bbVar instanceof bb.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    obj2 = ((bb.a) bbVar).a;
                }
                obj4 = obj2;
            }
            npnVar.getClass();
            aVar = new bb.a(new ppn());
        }
        return aVar;
    }
}
