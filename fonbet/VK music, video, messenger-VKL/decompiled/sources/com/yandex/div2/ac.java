package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.m2;
import com.yandex.div2.zb;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.bpn;
import xsna.cpn;
import xsna.epx;

/* compiled from: DivTextRangeBackgroundJsonParser.kt */
/* loaded from: classes8.dex */
public final class ac implements Serializer, Deserializer {
    public final fe a;

    public ac(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, zb zbVar) throws ParsingException {
        boolean z = zbVar instanceof zb.b;
        fe feVar = this.a;
        if (!z) {
            if (zbVar instanceof zb.a) {
                return ((m2.a) feVar.a2.getValue()).serialize(parsingContext, ((zb.a) zbVar).b);
            }
            throw new NoWhenBranchMatchedException();
        }
        cpn cpnVar = (cpn) feVar.n7.getValue();
        bpn bpnVar = ((zb.b) zbVar).b;
        cpnVar.getClass();
        return cpn.b(parsingContext, bpnVar);
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        boolean f = epx.f(readString, "solid");
        fe feVar = this.a;
        if (f) {
            ((cpn) feVar.n7.getValue()).getClass();
            return new zb.b(cpn.a(parsingContext, jSONObject));
        }
        if (epx.f(readString, "cloud")) {
            return new zb.a(((m2.a) feVar.a2.getValue()).deserialize(parsingContext, jSONObject));
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        dc dcVar = orThrow instanceof dc ? (dc) orThrow : null;
        if (dcVar != null) {
            return ((cc) feVar.f8.getValue()).resolve(parsingContext, dcVar, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }
}
