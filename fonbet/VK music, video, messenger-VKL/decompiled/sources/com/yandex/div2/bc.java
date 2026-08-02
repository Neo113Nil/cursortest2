package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.dc;
import com.yandex.div2.m2;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.dpn;
import xsna.epx;
import xsna.fpn;

/* compiled from: DivTextRangeBackgroundJsonParser.kt */
/* loaded from: classes8.dex */
public final class bc implements Serializer, Deserializer {
    public final fe a;

    public bc(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, dc dcVar) throws ParsingException {
        boolean z = dcVar instanceof dc.b;
        fe feVar = this.a;
        if (!z) {
            if (dcVar instanceof dc.a) {
                return ((m2.b) feVar.b2.getValue()).serialize(parsingContext, ((dc.a) dcVar).a);
            }
            throw new NoWhenBranchMatchedException();
        }
        dpn dpnVar = (dpn) feVar.o7.getValue();
        fpn fpnVar = ((dc.b) dcVar).a;
        dpnVar.getClass();
        return dpn.b(parsingContext, fpnVar);
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
        dc dcVar = entityTemplate instanceof dc ? (dc) entityTemplate : null;
        if (dcVar != null) {
            if (dcVar instanceof dc.b) {
                readString = "solid";
            } else {
                if (!(dcVar instanceof dc.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                readString = "cloud";
            }
        }
        boolean f = epx.f(readString, "solid");
        fe feVar = this.a;
        if (f) {
            dpn dpnVar = (dpn) feVar.o7.getValue();
            if (dcVar != null) {
                if (dcVar instanceof dc.b) {
                    obj3 = ((dc.b) dcVar).a;
                } else {
                    if (!(dcVar instanceof dc.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    obj3 = ((dc.a) dcVar).a;
                }
                obj4 = obj3;
            }
            dpnVar.getClass();
            aVar = new dc.b(dpn.a(parsingContext, (fpn) obj4, jSONObject));
        } else {
            if (!epx.f(readString, "cloud")) {
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
            }
            m2.b bVar = (m2.b) feVar.b2.getValue();
            if (dcVar != null) {
                if (dcVar instanceof dc.b) {
                    obj2 = ((dc.b) dcVar).a;
                } else {
                    if (!(dcVar instanceof dc.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    obj2 = ((dc.a) dcVar).a;
                }
                obj4 = obj2;
            }
            aVar = new dc.a(bVar.deserialize(parsingContext, (n2) obj4, jSONObject));
        }
        return aVar;
    }
}
