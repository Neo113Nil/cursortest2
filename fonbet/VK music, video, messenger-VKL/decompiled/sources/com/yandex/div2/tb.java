package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.p8;
import com.yandex.div2.u6;
import com.yandex.div2.vb;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.epx;

/* compiled from: DivTextGradientJsonParser.kt */
/* loaded from: classes8.dex */
public final class tb implements Serializer, Deserializer {
    public final fe a;

    public tb(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, vb vbVar) throws ParsingException {
        boolean z = vbVar instanceof vb.a;
        fe feVar = this.a;
        if (z) {
            return ((u6.b) feVar.Q4.getValue()).serialize(parsingContext, ((vb.a) vbVar).a);
        }
        if (vbVar instanceof vb.b) {
            return ((p8.b) feVar.p6.getValue()).serialize(parsingContext, ((vb.b) vbVar).a);
        }
        throw new NoWhenBranchMatchedException();
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
        vb vbVar = entityTemplate instanceof vb ? (vb) entityTemplate : null;
        if (vbVar != null) {
            if (vbVar instanceof vb.a) {
                readString = "gradient";
            } else {
                if (!(vbVar instanceof vb.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                readString = "radial_gradient";
            }
        }
        boolean f = epx.f(readString, "gradient");
        fe feVar = this.a;
        if (f) {
            u6.b bVar2 = (u6.b) feVar.Q4.getValue();
            if (vbVar != null) {
                if (vbVar instanceof vb.a) {
                    obj3 = ((vb.a) vbVar).a;
                } else {
                    if (!(vbVar instanceof vb.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    obj3 = ((vb.b) vbVar).a;
                }
                obj4 = obj3;
            }
            bVar = new vb.a(bVar2.deserialize(parsingContext, (v6) obj4, jSONObject));
        } else {
            if (!epx.f(readString, "radial_gradient")) {
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
            }
            p8.b bVar3 = (p8.b) feVar.p6.getValue();
            if (vbVar != null) {
                if (vbVar instanceof vb.a) {
                    obj2 = ((vb.a) vbVar).a;
                } else {
                    if (!(vbVar instanceof vb.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    obj2 = ((vb.b) vbVar).a;
                }
                obj4 = obj2;
            }
            bVar = new vb.b(bVar3.deserialize(parsingContext, (x8) obj4, jSONObject));
        }
        return bVar;
    }
}
