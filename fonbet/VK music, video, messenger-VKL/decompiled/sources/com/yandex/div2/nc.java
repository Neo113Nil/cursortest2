package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.qc;
import com.yandex.div2.tc;
import com.yandex.div2.vc;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.epx;

/* compiled from: DivTextRangeMaskJsonParser.kt */
/* loaded from: classes8.dex */
public final class nc implements Serializer, Deserializer {
    public final fe a;

    public nc(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, vc vcVar) throws ParsingException {
        boolean z = vcVar instanceof vc.a;
        fe feVar = this.a;
        if (z) {
            return ((qc.b) feVar.m8.getValue()).serialize(parsingContext, ((vc.a) vcVar).a);
        }
        if (!(vcVar instanceof vc.b)) {
            throw new NoWhenBranchMatchedException();
        }
        tc.b bVar = (tc.b) feVar.p8.getValue();
        uc ucVar = ((vc.b) vcVar).a;
        bVar.getClass();
        return tc.b.b(parsingContext, ucVar);
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        Object bVar;
        Object obj2;
        Object obj3;
        JSONObject jSONObject = (JSONObject) obj;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate<?> entityTemplate = parsingContext.getTemplates().get(readString);
        Object obj4 = null;
        vc vcVar = entityTemplate instanceof vc ? (vc) entityTemplate : null;
        if (vcVar != null) {
            if (vcVar instanceof vc.a) {
                readString = "particles";
            } else {
                if (!(vcVar instanceof vc.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                readString = "solid";
            }
        }
        boolean f = epx.f(readString, "particles");
        fe feVar = this.a;
        if (f) {
            qc.b bVar2 = (qc.b) feVar.m8.getValue();
            if (vcVar != null) {
                if (vcVar instanceof vc.a) {
                    obj3 = ((vc.a) vcVar).a;
                } else {
                    if (!(vcVar instanceof vc.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    obj3 = ((vc.b) vcVar).a;
                }
                obj4 = obj3;
            }
            bVar = new vc.a(bVar2.deserialize(parsingContext, (rc) obj4, jSONObject));
        } else {
            if (!epx.f(readString, "solid")) {
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
            }
            tc.b bVar3 = (tc.b) feVar.p8.getValue();
            if (vcVar != null) {
                if (vcVar instanceof vc.a) {
                    obj2 = ((vc.a) vcVar).a;
                } else {
                    if (!(vcVar instanceof vc.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    obj2 = ((vc.b) vcVar).a;
                }
                obj4 = obj2;
            }
            bVar3.getClass();
            bVar = new vc.b(tc.b.a(parsingContext, (uc) obj4, jSONObject));
        }
        return bVar;
    }
}
