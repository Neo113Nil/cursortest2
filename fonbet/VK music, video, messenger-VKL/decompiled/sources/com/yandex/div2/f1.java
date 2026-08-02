package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.c1;
import com.yandex.div2.c4;
import com.yandex.div2.c9;
import com.yandex.div2.da;
import com.yandex.div2.e1;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivAppearanceTransitionJsonParser.kt */
/* loaded from: classes8.dex */
public final class f1 implements Serializer, Deserializer {
    public final fe a;

    public f1(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, e1 e1Var) throws ParsingException {
        boolean z = e1Var instanceof e1.c;
        fe feVar = this.a;
        if (z) {
            return ((c1.a) feVar.w1.getValue()).serialize(parsingContext, ((e1.c) e1Var).b);
        }
        if (e1Var instanceof e1.a) {
            c4.b bVar = (c4.b) feVar.e3.getValue();
            b4 b4Var = ((e1.a) e1Var).b;
            bVar.getClass();
            return c4.b.b(parsingContext, b4Var);
        }
        if (!(e1Var instanceof e1.b)) {
            if (e1Var instanceof e1.d) {
                return ((da.c) feVar.b7.getValue()).serialize(parsingContext, ((e1.d) e1Var).b);
            }
            throw new NoWhenBranchMatchedException();
        }
        c9.b bVar2 = (c9.b) feVar.x6.getValue();
        b9 b9Var = ((e1.b) e1Var).b;
        bVar2.getClass();
        return c9.b.b(parsingContext, b9Var);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        int hashCode = readString.hashCode();
        fe feVar = this.a;
        switch (hashCode) {
            case 113762:
                if (readString.equals("set")) {
                    return new e1.c(((c1.a) feVar.w1.getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 3135100:
                if (readString.equals("fade")) {
                    ((c4.b) feVar.e3.getValue()).getClass();
                    return new e1.a(c4.b.a(parsingContext, jSONObject));
                }
                break;
            case 109250890:
                if (readString.equals("scale")) {
                    ((c9.b) feVar.x6.getValue()).getClass();
                    return new e1.b(c9.b.a(parsingContext, jSONObject));
                }
                break;
            case 109526449:
                if (readString.equals("slide")) {
                    return new e1.d(((da.c) feVar.b7.getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        i1 i1Var = orThrow instanceof i1 ? (i1) orThrow : null;
        if (i1Var != null) {
            return ((h1) feVar.B1.getValue()).resolve(parsingContext, i1Var, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }
}
