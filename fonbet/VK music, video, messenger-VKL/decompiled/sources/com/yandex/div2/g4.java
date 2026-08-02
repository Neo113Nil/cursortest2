package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.i4;
import com.yandex.div2.s1;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.epx;
import xsna.gln;
import xsna.iln;

/* compiled from: DivFilterJsonParser.kt */
/* loaded from: classes8.dex */
public final class g4 implements Serializer, Deserializer {
    public final fe a;

    public g4(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, i4 i4Var) throws ParsingException {
        boolean z = i4Var instanceof i4.a;
        fe feVar = this.a;
        if (z) {
            s1.b bVar = (s1.b) feVar.J1.getValue();
            t1 t1Var = ((i4.a) i4Var).a;
            bVar.getClass();
            return s1.b.b(parsingContext, t1Var);
        }
        if (!(i4Var instanceof i4.b)) {
            throw new NoWhenBranchMatchedException();
        }
        gln glnVar = (gln) feVar.i3.getValue();
        iln ilnVar = ((i4.b) i4Var).a;
        glnVar.getClass();
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "rtl_mirror");
        return jSONObject;
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
        i4 i4Var = entityTemplate instanceof i4 ? (i4) entityTemplate : null;
        if (i4Var != null) {
            if (i4Var instanceof i4.a) {
                readString = "blur";
            } else {
                if (!(i4Var instanceof i4.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                readString = "rtl_mirror";
            }
        }
        boolean f = epx.f(readString, "blur");
        fe feVar = this.a;
        if (f) {
            s1.b bVar2 = (s1.b) feVar.J1.getValue();
            if (i4Var != null) {
                if (i4Var instanceof i4.a) {
                    obj3 = ((i4.a) i4Var).a;
                } else {
                    if (!(i4Var instanceof i4.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    obj3 = ((i4.b) i4Var).a;
                }
                obj4 = obj3;
            }
            bVar2.getClass();
            bVar = new i4.a(s1.b.a(parsingContext, (t1) obj4, jSONObject));
        } else {
            if (!epx.f(readString, "rtl_mirror")) {
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
            }
            gln glnVar = (gln) feVar.i3.getValue();
            if (i4Var != null) {
                if (i4Var instanceof i4.a) {
                    obj2 = ((i4.a) i4Var).a;
                } else {
                    if (!(i4Var instanceof i4.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    obj2 = ((i4.b) i4Var).a;
                }
                obj4 = obj2;
            }
            glnVar.getClass();
            bVar = new i4.b(new iln());
        }
        return bVar;
    }
}
