package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.h;
import com.yandex.div2.i0;
import com.yandex.div2.k0;
import com.yandex.div2.n;
import com.yandex.div2.q0;
import com.yandex.div2.s0;
import com.yandex.div2.v;
import com.yandex.div2.y;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.bkn;
import xsna.ckn;
import xsna.djn;
import xsna.hhn;
import xsna.hjn;
import xsna.ihn;
import xsna.iin;
import xsna.ijn;
import xsna.jin;
import xsna.mjn;
import xsna.nhn;
import xsna.njn;
import xsna.rhn;
import xsna.shn;
import xsna.sjn;
import xsna.tin;
import xsna.xhn;
import xsna.xjn;
import xsna.yin;

/* compiled from: DivActionTypedJsonParser.kt */
/* loaded from: classes8.dex */
public final class l0 implements Serializer, Deserializer {
    public final fe a;

    public l0(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, k0 k0Var) throws ParsingException {
        boolean z = k0Var instanceof k0.a;
        fe feVar = this.a;
        if (z) {
            return ((h.c) feVar.K.getValue()).serialize(parsingContext, ((k0.a) k0Var).b);
        }
        if (k0Var instanceof k0.b) {
            ihn ihnVar = (ihn) feVar.N.getValue();
            hhn hhnVar = ((k0.b) k0Var).b;
            ihnVar.getClass();
            return ihn.a(parsingContext, hhnVar);
        }
        if (k0Var instanceof k0.c) {
            return ((nhn) feVar.Q.getValue()).serialize(parsingContext, ((k0.c) k0Var).b);
        }
        if (k0Var instanceof k0.d) {
            shn shnVar = (shn) feVar.T.getValue();
            rhn rhnVar = ((k0.d) k0Var).b;
            shnVar.getClass();
            return shn.b(parsingContext, rhnVar);
        }
        if (k0Var instanceof k0.e) {
            return ((xhn) feVar.W.getValue()).serialize(parsingContext, ((k0.e) k0Var).b);
        }
        if (k0Var instanceof k0.f) {
            jin jinVar = (jin) feVar.Z.getValue();
            iin iinVar = ((k0.f) k0Var).b;
            jinVar.getClass();
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "clear_focus");
            return jSONObject;
        }
        if (k0Var instanceof k0.g) {
            return ((tin) feVar.f0.getValue()).serialize(parsingContext, ((k0.g) k0Var).b);
        }
        if (k0Var instanceof k0.h) {
            return ((yin) feVar.i0.getValue()).serialize(parsingContext, ((k0.h) k0Var).b);
        }
        if (k0Var instanceof k0.i) {
            return ((djn) feVar.l0.getValue()).serialize(parsingContext, ((k0.i) k0Var).b);
        }
        if (k0Var instanceof k0.j) {
            ijn ijnVar = (ijn) feVar.o0.getValue();
            hjn hjnVar = ((k0.j) k0Var).b;
            ijnVar.getClass();
            return ijn.a(parsingContext, hjnVar);
        }
        if (k0Var instanceof k0.k) {
            njn njnVar = (njn) feVar.r0.getValue();
            mjn mjnVar = ((k0.k) k0Var).b;
            njnVar.getClass();
            return njn.a(parsingContext, mjnVar);
        }
        if (k0Var instanceof k0.l) {
            n.b bVar = (n.b) feVar.u0.getValue();
            DivActionScrollBy divActionScrollBy = ((k0.l) k0Var).b;
            bVar.getClass();
            return n.b.b(parsingContext, divActionScrollBy);
        }
        if (k0Var instanceof k0.m) {
            return ((v.a) feVar.A0.getValue()).serialize(parsingContext, ((k0.m) k0Var).b);
        }
        if (k0Var instanceof k0.n) {
            y.a aVar = (y.a) feVar.D0.getValue();
            x xVar = ((k0.n) k0Var).b;
            aVar.getClass();
            return y.a.b(parsingContext, xVar);
        }
        if (k0Var instanceof k0.o) {
            return ((sjn) feVar.G0.getValue()).serialize(parsingContext, ((k0.o) k0Var).b);
        }
        if (k0Var instanceof k0.p) {
            return ((xjn) feVar.J0.getValue()).serialize(parsingContext, ((k0.p) k0Var).b);
        }
        if (k0Var instanceof k0.q) {
            ckn cknVar = (ckn) feVar.M0.getValue();
            bkn bknVar = ((k0.q) k0Var).b;
            cknVar.getClass();
            return ckn.b(parsingContext, bknVar);
        }
        if (k0Var instanceof k0.r) {
            return ((a0) feVar.P0.getValue()).serialize(parsingContext, ((k0.r) k0Var).b);
        }
        if (k0Var instanceof k0.s) {
            i0.b bVar2 = (i0.b) feVar.Y0.getValue();
            DivActionTimer divActionTimer = ((k0.s) k0Var).b;
            bVar2.getClass();
            return i0.b.b(parsingContext, divActionTimer);
        }
        if (k0Var instanceof k0.t) {
            return ((q0.a) feVar.e1.getValue()).serialize(parsingContext, ((k0.t) k0Var).b);
        }
        if (!(k0Var instanceof k0.u)) {
            throw new NoWhenBranchMatchedException();
        }
        s0.b bVar3 = (s0.b) feVar.h1.getValue();
        DivActionVideo divActionVideo = ((k0.u) k0Var).b;
        bVar3.getClass();
        return s0.b.b(parsingContext, divActionVideo);
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
            case -1623648839:
                if (readString.equals("set_variable")) {
                    return new k0.p(((xjn) feVar.J0.getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case -1623635702:
                if (readString.equals("animator_start")) {
                    return new k0.a(((h.c) feVar.K.getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case -1254965146:
                if (readString.equals("clear_focus")) {
                    ((jin) feVar.Z.getValue()).getClass();
                    return new k0.f(new iin());
                }
                break;
            case -1160753574:
                if (readString.equals("animator_stop")) {
                    ((ihn) feVar.N.getValue()).getClass();
                    return new k0.b(new hhn((String) JsonPropertyParser.read(parsingContext, jSONObject, "animator_id")));
                }
                break;
            case -891535336:
                if (readString.equals("submit")) {
                    return new k0.r(((a0) feVar.P0.getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case -796594542:
                if (readString.equals("set_stored_value")) {
                    return new k0.o(((sjn) feVar.G0.getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case -404256420:
                if (readString.equals("copy_to_clipboard")) {
                    return new k0.g(((tin) feVar.f0.getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case -326583939:
                if (readString.equals("update_structure")) {
                    return new k0.t(((q0.a) feVar.e1.getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 10055918:
                if (readString.equals("array_set_value")) {
                    return new k0.e(((xhn) feVar.W.getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 110364485:
                if (readString.equals("timer")) {
                    ((i0.b) feVar.Y0.getValue()).getClass();
                    return new k0.s(i0.b.a(parsingContext, jSONObject));
                }
                break;
            case 112202875:
                if (readString.equals("video")) {
                    ((s0.b) feVar.h1.getValue()).getClass();
                    return new k0.u(s0.b.a(parsingContext, jSONObject));
                }
                break;
            case 203934236:
                if (readString.equals("array_remove_value")) {
                    ((shn) feVar.T.getValue()).getClass();
                    return new k0.d(shn.a(parsingContext, jSONObject));
                }
                break;
            case 301532353:
                if (readString.equals("show_tooltip")) {
                    ((ckn) feVar.M0.getValue()).getClass();
                    return new k0.q(ckn.a(parsingContext, jSONObject));
                }
                break;
            case 417790729:
                if (readString.equals("scroll_by")) {
                    ((n.b) feVar.u0.getValue()).getClass();
                    return new k0.l(n.b.a(parsingContext, jSONObject));
                }
                break;
            case 417791277:
                if (readString.equals("scroll_to")) {
                    return new k0.m(((v.a) feVar.A0.getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 932090484:
                if (readString.equals("set_state")) {
                    ((y.a) feVar.D0.getValue()).getClass();
                    return new k0.n(y.a.a(parsingContext, jSONObject));
                }
                break;
            case 1427818632:
                if (readString.equals("download")) {
                    return new k0.i(((djn) feVar.l0.getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 1550697109:
                if (readString.equals("focus_element")) {
                    ((ijn) feVar.o0.getValue()).getClass();
                    return new k0.j(new hjn(JsonExpressionParser.readExpression(parsingContext, jSONObject, "element_id", TypeHelpersKt.TYPE_HELPER_STRING)));
                }
                break;
            case 1587919371:
                if (readString.equals("dict_set_value")) {
                    return new k0.h(((yin) feVar.i0.getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 1715728902:
                if (readString.equals("hide_tooltip")) {
                    ((njn) feVar.r0.getValue()).getClass();
                    return new k0.k(new mjn(JsonExpressionParser.readExpression(parsingContext, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING)));
                }
                break;
            case 1811437713:
                if (readString.equals("array_insert_value")) {
                    return new k0.c(((nhn) feVar.Q.getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        o0 o0Var = orThrow instanceof o0 ? (o0) orThrow : null;
        if (o0Var != null) {
            return ((n0) feVar.d1.getValue()).resolve(parsingContext, o0Var, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }
}
