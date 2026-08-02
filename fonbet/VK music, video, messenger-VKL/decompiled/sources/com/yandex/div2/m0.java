package com.yandex.div2;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.h;
import com.yandex.div2.i0;
import com.yandex.div2.n;
import com.yandex.div2.o0;
import com.yandex.div2.q0;
import com.yandex.div2.s0;
import com.yandex.div2.v;
import com.yandex.div2.y;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.ain;
import xsna.akn;
import xsna.bjn;
import xsna.dkn;
import xsna.ejn;
import xsna.fkn;
import xsna.gjn;
import xsna.gkn;
import xsna.jhn;
import xsna.jjn;
import xsna.kin;
import xsna.lhn;
import xsna.ljn;
import xsna.min;
import xsna.ohn;
import xsna.ojn;
import xsna.qhn;
import xsna.qjn;
import xsna.sin;
import xsna.thn;
import xsna.tjn;
import xsna.uin;
import xsna.vhn;
import xsna.vjn;
import xsna.win;
import xsna.yhn;
import xsna.yjn;
import xsna.zin;

/* compiled from: DivActionTypedJsonParser.kt */
/* loaded from: classes8.dex */
public final class m0 implements Serializer, Deserializer {
    public final fe a;

    public m0(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, o0 o0Var) throws ParsingException {
        boolean z = o0Var instanceof o0.a;
        fe feVar = this.a;
        if (z) {
            return ((h.d) feVar.L.getValue()).serialize(parsingContext, ((o0.a) o0Var).a);
        }
        if (o0Var instanceof o0.b) {
            jhn jhnVar = (jhn) feVar.O.getValue();
            lhn lhnVar = ((o0.b) o0Var).a;
            jhnVar.getClass();
            return jhn.a(parsingContext, lhnVar);
        }
        if (o0Var instanceof o0.c) {
            return ((ohn) feVar.R.getValue()).serialize(parsingContext, ((o0.c) o0Var).a);
        }
        if (o0Var instanceof o0.d) {
            thn thnVar = (thn) feVar.U.getValue();
            vhn vhnVar = ((o0.d) o0Var).a;
            thnVar.getClass();
            return thn.b(parsingContext, vhnVar);
        }
        if (o0Var instanceof o0.e) {
            return ((yhn) feVar.X.getValue()).serialize(parsingContext, ((o0.e) o0Var).a);
        }
        if (o0Var instanceof o0.f) {
            kin kinVar = (kin) feVar.a0.getValue();
            min minVar = ((o0.f) o0Var).a;
            kinVar.getClass();
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "clear_focus");
            return jSONObject;
        }
        if (o0Var instanceof o0.g) {
            return ((uin) feVar.g0.getValue()).serialize(parsingContext, ((o0.g) o0Var).a);
        }
        if (o0Var instanceof o0.h) {
            return ((zin) feVar.j0.getValue()).serialize(parsingContext, ((o0.h) o0Var).a);
        }
        if (o0Var instanceof o0.i) {
            return ((ejn) feVar.m0.getValue()).serialize(parsingContext, ((o0.i) o0Var).a);
        }
        if (o0Var instanceof o0.j) {
            jjn jjnVar = (jjn) feVar.p0.getValue();
            ljn ljnVar = ((o0.j) o0Var).a;
            jjnVar.getClass();
            return jjn.a(parsingContext, ljnVar);
        }
        if (o0Var instanceof o0.k) {
            ojn ojnVar = (ojn) feVar.s0.getValue();
            qjn qjnVar = ((o0.k) o0Var).a;
            ojnVar.getClass();
            return ojn.a(parsingContext, qjnVar);
        }
        if (o0Var instanceof o0.l) {
            n.c cVar = (n.c) feVar.v0.getValue();
            o oVar = ((o0.l) o0Var).a;
            cVar.getClass();
            return n.c.b(parsingContext, oVar);
        }
        if (o0Var instanceof o0.m) {
            return ((v.b) feVar.B0.getValue()).serialize(parsingContext, ((o0.m) o0Var).a);
        }
        if (o0Var instanceof o0.n) {
            y.b bVar = (y.b) feVar.E0.getValue();
            z zVar = ((o0.n) o0Var).a;
            bVar.getClass();
            return y.b.b(parsingContext, zVar);
        }
        if (o0Var instanceof o0.o) {
            return ((tjn) feVar.H0.getValue()).serialize(parsingContext, ((o0.o) o0Var).a);
        }
        if (o0Var instanceof o0.p) {
            return ((yjn) feVar.K0.getValue()).serialize(parsingContext, ((o0.p) o0Var).a);
        }
        if (o0Var instanceof o0.q) {
            dkn dknVar = (dkn) feVar.N0.getValue();
            fkn fknVar = ((o0.q) o0Var).a;
            dknVar.getClass();
            return dkn.b(parsingContext, fknVar);
        }
        if (o0Var instanceof o0.r) {
            return ((gkn) feVar.Q0.getValue()).serialize(parsingContext, ((o0.r) o0Var).a);
        }
        if (o0Var instanceof o0.s) {
            i0.c cVar2 = (i0.c) feVar.Z0.getValue();
            j0 j0Var = ((o0.s) o0Var).a;
            cVar2.getClass();
            return i0.c.b(parsingContext, j0Var);
        }
        if (o0Var instanceof o0.t) {
            return ((q0.b) feVar.f1.getValue()).serialize(parsingContext, ((o0.t) o0Var).a);
        }
        if (!(o0Var instanceof o0.u)) {
            throw new NoWhenBranchMatchedException();
        }
        s0.c cVar3 = (s0.c) feVar.i1.getValue();
        t0 t0Var = ((o0.u) o0Var).a;
        cVar3.getClass();
        return s0.c.b(parsingContext, t0Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        String str;
        Object gVar;
        boolean z;
        Field<sin> field;
        JSONObject jSONObject = (JSONObject) obj;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate<?> entityTemplate = parsingContext.getTemplates().get(readString);
        o0 o0Var = entityTemplate instanceof o0 ? (o0) entityTemplate : null;
        if (o0Var == null) {
            str = readString;
        } else if (o0Var instanceof o0.a) {
            str = "animator_start";
        } else if (o0Var instanceof o0.b) {
            str = "animator_stop";
        } else if (o0Var instanceof o0.c) {
            str = "array_insert_value";
        } else if (o0Var instanceof o0.d) {
            str = "array_remove_value";
        } else if (o0Var instanceof o0.e) {
            str = "array_set_value";
        } else if (o0Var instanceof o0.f) {
            str = "clear_focus";
        } else if (o0Var instanceof o0.g) {
            str = "copy_to_clipboard";
        } else if (o0Var instanceof o0.h) {
            str = "dict_set_value";
        } else if (o0Var instanceof o0.i) {
            str = "download";
        } else if (o0Var instanceof o0.j) {
            str = "focus_element";
        } else if (o0Var instanceof o0.k) {
            str = "hide_tooltip";
        } else if (o0Var instanceof o0.l) {
            str = "scroll_by";
        } else if (o0Var instanceof o0.m) {
            str = "scroll_to";
        } else if (o0Var instanceof o0.n) {
            str = "set_state";
        } else if (o0Var instanceof o0.o) {
            str = "set_stored_value";
        } else if (o0Var instanceof o0.p) {
            str = "set_variable";
        } else if (o0Var instanceof o0.q) {
            str = "show_tooltip";
        } else if (o0Var instanceof o0.r) {
            str = "submit";
        } else if (o0Var instanceof o0.s) {
            str = "timer";
        } else if (o0Var instanceof o0.t) {
            str = "update_structure";
        } else {
            if (!(o0Var instanceof o0.u)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "video";
        }
        int hashCode = str.hashCode();
        o0 o0Var2 = o0Var;
        fe feVar = this.a;
        switch (hashCode) {
            case -1623648839:
                if (str.equals("set_variable")) {
                    return new o0.p(((yjn) feVar.K0.getValue()).deserialize(parsingContext, (akn) (o0Var2 != null ? o0Var2.a() : null), jSONObject));
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", str);
            case -1623635702:
                if (str.equals("animator_start")) {
                    return new o0.a(((h.d) feVar.L.getValue()).deserialize(parsingContext, (i) (o0Var2 != null ? o0Var2.a() : null), jSONObject));
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", str);
            case -1254965146:
                if (str.equals("clear_focus")) {
                    kin kinVar = (kin) feVar.a0.getValue();
                    kinVar.getClass();
                    return new o0.f(new min());
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", str);
            case -1160753574:
                if (str.equals("animator_stop")) {
                    jhn jhnVar = (jhn) feVar.O.getValue();
                    lhn lhnVar = (lhn) (o0Var2 != null ? o0Var2.a() : null);
                    jhnVar.getClass();
                    return new o0.b(new lhn(JsonFieldParser.readField(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "animator_id", parsingContext.getAllowPropertyOverride(), lhnVar != null ? lhnVar.a : null)));
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", str);
            case -891535336:
                if (str.equals("submit")) {
                    return new o0.r(((gkn) feVar.Q0.getValue()).deserialize(parsingContext, (g0) (o0Var2 != null ? o0Var2.a() : null), jSONObject));
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", str);
            case -796594542:
                if (str.equals("set_stored_value")) {
                    return new o0.o(((tjn) feVar.H0.getValue()).deserialize(parsingContext, (vjn) (o0Var2 != null ? o0Var2.a() : null), jSONObject));
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", str);
            case -404256420:
                if (str.equals("copy_to_clipboard")) {
                    uin uinVar = (uin) feVar.g0.getValue();
                    win winVar = (win) (o0Var2 != null ? o0Var2.a() : null);
                    uinVar.getClass();
                    boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
                    ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
                    if (winVar != null) {
                        field = winVar.a;
                        z = allowPropertyOverride;
                    } else {
                        z = allowPropertyOverride;
                        field = null;
                    }
                    gVar = new o0.g(new win(JsonFieldParser.readField(restrictPropertyOverride, jSONObject, HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT, z, field, uinVar.a.d0)));
                    return gVar;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", str);
            case -326583939:
                if (str.equals("update_structure")) {
                    return new o0.t(((q0.b) feVar.f1.getValue()).deserialize(parsingContext, (r0) (o0Var2 != null ? o0Var2.a() : null), jSONObject));
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", str);
            case 10055918:
                if (str.equals("array_set_value")) {
                    return new o0.e(((yhn) feVar.X.getValue()).deserialize(parsingContext, (ain) (o0Var2 != null ? o0Var2.a() : null), jSONObject));
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", str);
            case 110364485:
                if (str.equals("timer")) {
                    i0.c cVar = (i0.c) feVar.Z0.getValue();
                    Object a = o0Var2 != null ? o0Var2.a() : null;
                    cVar.getClass();
                    return new o0.s(i0.c.a(parsingContext, (j0) a, jSONObject));
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", str);
            case 112202875:
                if (str.equals("video")) {
                    s0.c cVar2 = (s0.c) feVar.i1.getValue();
                    Object a2 = o0Var2 != null ? o0Var2.a() : null;
                    cVar2.getClass();
                    return new o0.u(s0.c.a(parsingContext, (t0) a2, jSONObject));
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", str);
            case 203934236:
                if (str.equals("array_remove_value")) {
                    thn thnVar = (thn) feVar.U.getValue();
                    Object a3 = o0Var2 != null ? o0Var2.a() : null;
                    thnVar.getClass();
                    return new o0.d(thn.a(parsingContext, (vhn) a3, jSONObject));
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", str);
            case 301532353:
                if (str.equals("show_tooltip")) {
                    dkn dknVar = (dkn) feVar.N0.getValue();
                    Object a4 = o0Var2 != null ? o0Var2.a() : null;
                    dknVar.getClass();
                    return new o0.q(dkn.a(parsingContext, (fkn) a4, jSONObject));
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", str);
            case 417790729:
                if (str.equals("scroll_by")) {
                    n.c cVar3 = (n.c) feVar.v0.getValue();
                    Object a5 = o0Var2 != null ? o0Var2.a() : null;
                    cVar3.getClass();
                    return new o0.l(n.c.a(parsingContext, (o) a5, jSONObject));
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", str);
            case 417791277:
                if (str.equals("scroll_to")) {
                    return new o0.m(((v.b) feVar.B0.getValue()).deserialize(parsingContext, (w) (o0Var2 != null ? o0Var2.a() : null), jSONObject));
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", str);
            case 932090484:
                if (str.equals("set_state")) {
                    y.b bVar = (y.b) feVar.E0.getValue();
                    Object a6 = o0Var2 != null ? o0Var2.a() : null;
                    bVar.getClass();
                    return new o0.n(y.b.a(parsingContext, (z) a6, jSONObject));
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", str);
            case 1427818632:
                if (str.equals("download")) {
                    return new o0.i(((ejn) feVar.m0.getValue()).deserialize(parsingContext, (gjn) (o0Var2 != null ? o0Var2.a() : null), jSONObject));
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", str);
            case 1550697109:
                if (str.equals("focus_element")) {
                    jjn jjnVar = (jjn) feVar.p0.getValue();
                    ljn ljnVar = (ljn) (o0Var2 != null ? o0Var2.a() : null);
                    jjnVar.getClass();
                    gVar = new o0.j(new ljn(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "element_id", TypeHelpersKt.TYPE_HELPER_STRING, parsingContext.getAllowPropertyOverride(), ljnVar != null ? ljnVar.a : null)));
                    return gVar;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", str);
            case 1587919371:
                if (str.equals("dict_set_value")) {
                    return new o0.h(((zin) feVar.j0.getValue()).deserialize(parsingContext, (bjn) (o0Var2 != null ? o0Var2.a() : null), jSONObject));
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", str);
            case 1715728902:
                if (str.equals("hide_tooltip")) {
                    ojn ojnVar = (ojn) feVar.s0.getValue();
                    qjn qjnVar = (qjn) (o0Var2 != null ? o0Var2.a() : null);
                    ojnVar.getClass();
                    gVar = new o0.k(new qjn(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING, parsingContext.getAllowPropertyOverride(), qjnVar != null ? qjnVar.a : null)));
                    return gVar;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", str);
            case 1811437713:
                if (str.equals("array_insert_value")) {
                    return new o0.c(((ohn) feVar.R.getValue()).deserialize(parsingContext, (qhn) (o0Var2 != null ? o0Var2.a() : null), jSONObject));
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", str);
            default:
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", str);
        }
    }
}
