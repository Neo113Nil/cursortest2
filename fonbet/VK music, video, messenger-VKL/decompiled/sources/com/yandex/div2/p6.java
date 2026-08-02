package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.a;
import com.yandex.div2.c5;
import com.yandex.div2.eb;
import com.yandex.div2.f9;
import com.yandex.div2.ga;
import com.yandex.div2.h3;
import com.yandex.div2.i5;
import com.yandex.div2.jb;
import com.yandex.div2.l9;
import com.yandex.div2.n7;
import com.yandex.div2.na;
import com.yandex.div2.p5;
import com.yandex.div2.r5;
import com.yandex.div2.sd;
import com.yandex.div2.v2;
import com.yandex.div2.w4;
import com.yandex.div2.yb;
import com.yandex.div2.z4;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivJsonParser.kt */
/* loaded from: classes8.dex */
public final class p6 implements Serializer, Deserializer {
    public final fe a;

    public p6(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, a aVar) throws ParsingException {
        boolean z = aVar instanceof a.f;
        fe feVar = this.a;
        if (z) {
            return ((i5.h) feVar.X3.getValue()).serialize(parsingContext, ((a.f) aVar).c);
        }
        if (aVar instanceof a.d) {
            return ((z4.g) feVar.O3.getValue()).serialize(parsingContext, ((a.d) aVar).c);
        }
        if (aVar instanceof a.p) {
            return ((yb.k) feVar.u8.getValue()).serialize(parsingContext, ((a.p) aVar).c);
        }
        if (aVar instanceof a.k) {
            return ((l9.d) feVar.G6.getValue()).serialize(parsingContext, ((a.k) aVar).c);
        }
        if (aVar instanceof a.C2110a) {
            return ((v2.h) feVar.m2.getValue()).serialize(parsingContext, ((a.C2110a) aVar).c);
        }
        if (aVar instanceof a.e) {
            return ((c5.f) feVar.R3.getValue()).serialize(parsingContext, ((a.e) aVar).c);
        }
        if (aVar instanceof a.c) {
            return ((w4.h) feVar.L3.getValue()).serialize(parsingContext, ((a.c) aVar).c);
        }
        if (aVar instanceof a.i) {
            return ((n7.g) feVar.z5.getValue()).serialize(parsingContext, ((a.i) aVar).c);
        }
        if (aVar instanceof a.o) {
            return ((jb.d) feVar.O7.getValue()).serialize(parsingContext, ((a.o) aVar).c);
        }
        if (aVar instanceof a.m) {
            return ((na.e) feVar.q7.getValue()).serialize(parsingContext, ((a.m) aVar).c);
        }
        if (aVar instanceof a.b) {
            return ((h3.d) feVar.B2.getValue()).serialize(parsingContext, ((a.b) aVar).c);
        }
        if (aVar instanceof a.g) {
            return ((p5.e) feVar.d4.getValue()).serialize(parsingContext, ((a.g) aVar).c);
        }
        if (aVar instanceof a.l) {
            return ((ga.d) feVar.e7.getValue()).serialize(parsingContext, ((a.l) aVar).c);
        }
        if (aVar instanceof a.n) {
            return ((eb.d) feVar.L7.getValue()).serialize(parsingContext, ((a.n) aVar).c);
        }
        if (aVar instanceof a.h) {
            return ((r5.k) feVar.G4.getValue()).serialize(parsingContext, ((a.h) aVar).c);
        }
        if (aVar instanceof a.j) {
            return ((f9.f) feVar.A6.getValue()).serialize(parsingContext, ((a.j) aVar).c);
        }
        if (aVar instanceof a.q) {
            return ((sd.e) feVar.q9.getValue()).serialize(parsingContext, ((a.q) aVar).c);
        }
        throw new NoWhenBranchMatchedException();
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
            case -1349088399:
                if (readString.equals("custom")) {
                    return new a.b(((h3.d) feVar.B2.getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case -906021636:
                if (readString.equals("select")) {
                    return new a.j(((f9.f) feVar.A6.getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case -899647263:
                if (readString.equals("slider")) {
                    return new a.l(((ga.d) feVar.e7.getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case -889473228:
                if (readString.equals("switch")) {
                    return new a.n(((eb.d) feVar.L7.getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case -711999985:
                if (readString.equals("indicator")) {
                    return new a.g(((p5.e) feVar.d4.getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case -410956671:
                if (readString.equals("container")) {
                    return new a.C2110a(((v2.h) feVar.m2.getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case -196315310:
                if (readString.equals("gallery")) {
                    return new a.c(((w4.h) feVar.L3.getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 102340:
                if (readString.equals("gif")) {
                    return new a.d(((z4.g) feVar.O3.getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 3181382:
                if (readString.equals("grid")) {
                    return new a.e(((c5.f) feVar.R3.getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 3552126:
                if (readString.equals("tabs")) {
                    return new a.o(((jb.d) feVar.O7.getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 3556653:
                if (readString.equals("text")) {
                    return new a.p(((yb.k) feVar.u8.getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 100313435:
                if (readString.equals("image")) {
                    return new a.f(((i5.h) feVar.X3.getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 100358090:
                if (readString.equals("input")) {
                    return new a.h(((r5.k) feVar.G4.getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 106426307:
                if (readString.equals("pager")) {
                    return new a.i(((n7.g) feVar.z5.getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 109757585:
                if (readString.equals("state")) {
                    return new a.m(((na.e) feVar.q7.getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 112202875:
                if (readString.equals("video")) {
                    return new a.q(((sd.e) feVar.q9.getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 1732829925:
                if (readString.equals("separator")) {
                    return new a.k(((l9.d) feVar.G6.getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        nb nbVar = orThrow instanceof nb ? (nb) orThrow : null;
        if (nbVar != null) {
            return ((r6) feVar.B9.getValue()).resolve(parsingContext, nbVar, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }
}
