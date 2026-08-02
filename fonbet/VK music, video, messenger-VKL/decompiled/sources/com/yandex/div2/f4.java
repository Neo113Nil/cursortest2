package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.e4;
import com.yandex.div2.s1;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.eln;
import xsna.epx;
import xsna.fln;

/* compiled from: DivFilterJsonParser.kt */
/* loaded from: classes8.dex */
public final class f4 implements Serializer, Deserializer {
    public final fe a;

    public f4(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, e4 e4Var) throws ParsingException {
        boolean z = e4Var instanceof e4.a;
        fe feVar = this.a;
        if (z) {
            s1.a aVar = (s1.a) feVar.I1.getValue();
            r1 r1Var = ((e4.a) e4Var).b;
            aVar.getClass();
            return s1.a.b(parsingContext, r1Var);
        }
        if (!(e4Var instanceof e4.b)) {
            throw new NoWhenBranchMatchedException();
        }
        fln flnVar = (fln) feVar.h3.getValue();
        eln elnVar = ((e4.b) e4Var).b;
        flnVar.getClass();
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "rtl_mirror");
        return jSONObject;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        boolean f = epx.f(readString, "blur");
        fe feVar = this.a;
        if (f) {
            ((s1.a) feVar.I1.getValue()).getClass();
            return new e4.a(s1.a.a(parsingContext, jSONObject));
        }
        if (epx.f(readString, "rtl_mirror")) {
            ((fln) feVar.h3.getValue()).getClass();
            return new e4.b(new eln());
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        i4 i4Var = orThrow instanceof i4 ? (i4) orThrow : null;
        if (i4Var != null) {
            return ((h4) feVar.m3.getValue()).resolve(parsingContext, i4Var, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }
}
