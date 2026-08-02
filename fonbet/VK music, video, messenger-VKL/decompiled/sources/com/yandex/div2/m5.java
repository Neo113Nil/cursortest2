package com.yandex.div2;

import com.unity3d.ads.BuildConfig;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.o5;
import com.yandex.div2.q3;
import com.yandex.div2.ta;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.epx;

/* compiled from: DivIndicatorItemPlacementJsonParser.kt */
/* loaded from: classes8.dex */
public final class m5 implements Serializer, Deserializer {
    public final fe a;

    public m5(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, o5 o5Var) throws ParsingException {
        boolean z = o5Var instanceof o5.a;
        fe feVar = this.a;
        if (z) {
            return ((q3.b) feVar.K2.getValue()).serialize(parsingContext, ((o5.a) o5Var).a);
        }
        if (o5Var instanceof o5.b) {
            return ((ta.b) feVar.x7.getValue()).serialize(parsingContext, ((o5.b) o5Var).a);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        Object bVar;
        JSONSerializable jSONSerializable;
        JSONSerializable jSONSerializable2;
        JSONObject jSONObject = (JSONObject) obj;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate<?> entityTemplate = parsingContext.getTemplates().get(readString);
        JSONSerializable jSONSerializable3 = null;
        o5 o5Var = entityTemplate instanceof o5 ? (o5) entityTemplate : null;
        if (o5Var != null) {
            if (o5Var instanceof o5.a) {
                readString = BuildConfig.FLAVOR;
            } else {
                if (!(o5Var instanceof o5.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                readString = "stretch";
            }
        }
        boolean f = epx.f(readString, BuildConfig.FLAVOR);
        fe feVar = this.a;
        if (f) {
            q3.b bVar2 = (q3.b) feVar.K2.getValue();
            if (o5Var == null) {
                jSONSerializable2 = null;
            } else if (o5Var instanceof o5.a) {
                jSONSerializable2 = ((o5.a) o5Var).a;
            } else {
                if (!(o5Var instanceof o5.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                jSONSerializable2 = ((o5.b) o5Var).a;
            }
            r3 r3Var = (r3) jSONSerializable2;
            bVar2.getClass();
            bVar = new o5.a(new r3(JsonFieldParser.readOptionalField(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "space_between_centers", parsingContext.getAllowPropertyOverride(), r3Var != null ? r3Var.a : null, bVar2.a.x3)));
        } else {
            if (!epx.f(readString, "stretch")) {
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
            }
            ta.b bVar3 = (ta.b) feVar.x7.getValue();
            if (o5Var != null) {
                if (o5Var instanceof o5.a) {
                    jSONSerializable = ((o5.a) o5Var).a;
                } else {
                    if (!(o5Var instanceof o5.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jSONSerializable = ((o5.b) o5Var).a;
                }
                jSONSerializable3 = jSONSerializable;
            }
            bVar = new o5.b(bVar3.deserialize(parsingContext, (ua) jSONSerializable3, jSONObject));
        }
        return bVar;
    }
}
