package com.yandex.div2;

import com.unity3d.ads.BuildConfig;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.k5;
import com.yandex.div2.q3;
import com.yandex.div2.ta;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.epx;

/* compiled from: DivIndicatorItemPlacementJsonParser.kt */
/* loaded from: classes8.dex */
public final class l5 implements Serializer, Deserializer {
    public final fe a;

    public l5(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, k5 k5Var) throws ParsingException {
        boolean z = k5Var instanceof k5.a;
        fe feVar = this.a;
        if (z) {
            return ((q3.a) feVar.J2.getValue()).serialize(parsingContext, ((k5.a) k5Var).b);
        }
        if (k5Var instanceof k5.b) {
            return ((ta.a) feVar.w7.getValue()).serialize(parsingContext, ((k5.b) k5Var).b);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        boolean f = epx.f(readString, BuildConfig.FLAVOR);
        fe feVar = this.a;
        if (f) {
            return new k5.a(((q3.a) feVar.J2.getValue()).deserialize(parsingContext, jSONObject));
        }
        if (epx.f(readString, "stretch")) {
            return new k5.b(((ta.a) feVar.w7.getValue()).deserialize(parsingContext, jSONObject));
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        o5 o5Var = orThrow instanceof o5 ? (o5) orThrow : null;
        if (o5Var != null) {
            return ((n5) feVar.c4.getValue()).resolve(parsingContext, o5Var, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }
}
