package defpackage;

import java.util.Iterator;
import ru.yandex.taxi.design.ChipsState;
import ru.yandex.taxi.requirements.models.domain.RequirementBubbleAction;
import ru.yandex.taxi.requirements.models.net.experiment.RequirementBubbleDto;
import ru.yandex.taxi.requirements.models.net.experiment.c;

/* loaded from: classes6.dex */
public final class hnj0 {
    public final k7x0 a;
    public final bqj0 b;
    public final q6c0 c;
    public final yj70 d;
    public final yli e;
    public final k3i f;
    public final chi g;
    public final ibn h;
    public final uih i;
    public final a9w j;

    public hnj0(k7x0 k7x0Var, bqj0 bqj0Var, q6c0 q6c0Var, yj70 yj70Var, yli yliVar, k3i k3iVar, chi chiVar, ibn ibnVar, uih uihVar, a9w a9wVar) {
        this.a = k7x0Var;
        this.b = bqj0Var;
        this.c = q6c0Var;
        this.d = yj70Var;
        this.e = yliVar;
        this.f = k3iVar;
        this.g = chiVar;
        this.h = ibnVar;
        this.i = uihVar;
        this.j = a9wVar;
    }

    public static /* synthetic */ zqb b(hnj0 hnj0Var, String str, String str2, String str3, RequirementBubbleDto.RequirementBubbleActionDto requirementBubbleActionDto, String str4, pex0 pex0Var, int i) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            requirementBubbleActionDto = RequirementBubbleDto.RequirementBubbleActionDto.DEFAULT;
        }
        return hnj0Var.a(str, str2, str5, requirementBubbleActionDto, str4, null, pex0Var);
    }

    public static ndj0 e(hnj0 hnj0Var, String str, RequirementBubbleAction requirementBubbleAction, zqb zqbVar) {
        hnj0Var.getClass();
        return new ndj0(str, "", requirementBubbleAction == RequirementBubbleAction.COMPOUND_OPTIONS, 0, zqbVar, requirementBubbleAction, null);
    }

    public static ndj0 f(hnj0 hnj0Var, String str, String str2, String str3, int i, String str4, RequirementBubbleAction requirementBubbleAction, int i2) {
        String str5 = (i2 & 4) != 0 ? "" : str3;
        int i3 = (i2 & 8) != 0 ? 0 : i;
        RequirementBubbleAction requirementBubbleAction2 = (i2 & 32) != 0 ? RequirementBubbleAction.CLOSE : requirementBubbleAction;
        tqb tqbVar = (i2 & 64) != 0 ? rqb.a : qqb.a;
        hnj0Var.getClass();
        return new ndj0(str, str5, i3, new zqb(ChipsState.WARNING, str2, str4, tqbVar, 12), requirementBubbleAction2);
    }

    public static ndj0 g(hnj0 hnj0Var, c cVar, String str, RequirementBubbleDto requirementBubbleDto, String str2, RequirementBubbleAction requirementBubbleAction, int i) {
        String str3 = (i & 4) != 0 ? requirementBubbleDto.d : str2;
        RequirementBubbleAction requirementBubbleAction2 = (i & 32) != 0 ? RequirementBubbleAction.CLOSE : requirementBubbleAction;
        tqb tqbVar = (i & 64) != 0 ? rqb.a : qqb.a;
        hnj0Var.getClass();
        String Y = d6z.Y(cVar, str3);
        bqj0 bqj0Var = hnj0Var.b;
        String b = bqj0Var.b(cVar, requirementBubbleDto, str);
        if (b == null) {
            b = bqj0Var.c(Y);
        }
        return new ndj0(str, "", 0, new zqb(ChipsState.WARNING, Y, b, tqbVar, 12), requirementBubbleAction2);
    }

    public static ndj0 h(hnj0 hnj0Var, c cVar, String str, String str2) {
        hnj0Var.getClass();
        return f(hnj0Var, str, d6z.Y(cVar, str2), "", 0, null, null, 96);
    }

    public final zqb a(String str, String str2, String str3, RequirementBubbleDto.RequirementBubbleActionDto requirementBubbleActionDto, String str4, String str5, pex0 pex0Var) {
        Object obj;
        int i = gnj0.a[requirementBubbleActionDto.ordinal()];
        qqb qqbVar = qqb.a;
        if (i == 1) {
            return new zqb(ChipsState.DEFAULT, str, c(str2), str3, qqbVar);
        }
        if (i == 2 || i == 3) {
            return new zqb(ChipsState.DEFAULT, str, c(str2), str3, qqbVar);
        }
        zqb zqbVar = null;
        if (i != 4) {
            if (i == 5) {
                return new zqb(ChipsState.DEFAULT, str, c(str2), str3, rqb.a);
            }
            w511.b();
            return null;
        }
        if (str5 != null) {
            Iterator it = pex0Var.f().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (jl40.l(((lmw0) obj).getName(), str4)) {
                    break;
                }
            }
            jmw0 jmw0Var = obj instanceof jmw0 ? (jmw0) obj : null;
            if (jmw0Var != null) {
                ejj0 p = jmw0Var.p(str5);
                kf70 kf70Var = p != null ? p.l : null;
                if70 if70Var = kf70Var instanceof if70 ? (if70) kf70Var : null;
                if (if70Var != null) {
                    int i2 = if70Var.a;
                    zqbVar = new zqb(ChipsState.DEFAULT, str, (String) null, new sqb(jmw0Var.q(new if70(i2 + 1)) != null, jmw0Var.q(new if70(i2 + (-1))) != null), 24);
                }
            }
        }
        if (zqbVar == null) {
            return new zqb(ChipsState.DEFAULT, str, c(str2), str3, qqbVar);
        }
        return zqbVar;
    }

    public final String c(String str) {
        if (str.length() == 0) {
            return null;
        }
        return ((m7x0) this.a).a(str);
    }

    public final ndj0 d(c cVar, String str, RequirementBubbleDto requirementBubbleDto, String str2, int i, pex0 pex0Var) {
        RequirementBubbleAction requirementBubbleAction;
        String str3;
        RequirementBubbleDto.RequirementBubbleActionDto requirementBubbleActionDto = requirementBubbleDto.g;
        String str4 = requirementBubbleDto.b;
        int i2 = gnj0.a[requirementBubbleActionDto.ordinal()];
        String str5 = null;
        if (i2 == 1) {
            requirementBubbleAction = RequirementBubbleAction.INTERCITY_CONTACT;
        } else if (i2 == 2) {
            requirementBubbleAction = RequirementBubbleAction.PREORDER;
        } else if (i2 == 3) {
            requirementBubbleAction = RequirementBubbleAction.COMPOUND_OPTIONS;
        } else if (i2 == 4) {
            requirementBubbleAction = RequirementBubbleAction.COUNTER_PLUS;
        } else {
            if (i2 != 5) {
                w511.b();
                return null;
            }
            requirementBubbleAction = RequirementBubbleAction.CLOSE;
        }
        RequirementBubbleAction requirementBubbleAction2 = requirementBubbleAction;
        RequirementBubbleAction requirementBubbleAction3 = requirementBubbleAction2 == RequirementBubbleAction.COUNTER_PLUS ? RequirementBubbleAction.COUNTER_MINUS : null;
        String Y = d6z.Y(cVar, str4);
        String str6 = requirementBubbleDto.a;
        bqj0 bqj0Var = this.b;
        bqj0Var.getClass();
        String str7 = requirementBubbleDto.c;
        if (str7 != null) {
            str5 = d6z.Y(cVar, str7);
            str3 = str;
        } else {
            String Y2 = d6z.Y(cVar, str4);
            if (evu0.J(Y2)) {
                Y2 = null;
            }
            str3 = str;
            if (Y2 == null) {
                Y2 = bqj0Var.d(str3);
            }
            if (Y2 != null) {
                str5 = g8e.p(((avj0) bqj0Var.b).h(kyh0.supported_requirement_prefix), " ", Y2);
            }
        }
        return new ndj0(str, str2, requirementBubbleAction2 == RequirementBubbleAction.COMPOUND_OPTIONS, i, a(Y, str6, str5, requirementBubbleDto.g, str3, str2, pex0Var), requirementBubbleAction2, requirementBubbleAction3);
    }
}
