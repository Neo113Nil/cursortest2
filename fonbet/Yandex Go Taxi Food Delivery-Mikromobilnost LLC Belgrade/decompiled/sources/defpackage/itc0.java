package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import com.yandex.plus.core.graphql.type.WIDGET_TYPE;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class itc0 implements b70 {
    public static final List a = scc.g("widgetId", "contentDescription", "templates", "strictAction", "displayWidgetRules", "type", "textWidget", "balanceWidget", "buttonWidget", "switchWidget", "iconWidget");

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        return new defpackage.rsc0(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static rsc0 c(xdx xdxVar, c cVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        WIDGET_TYPE widget_type;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        String str = null;
        lsc0 lsc0Var = null;
        List list = null;
        osc0 osc0Var = null;
        msc0 msc0Var = null;
        WIDGET_TYPE widget_type2 = null;
        qsc0 qsc0Var = null;
        jsc0 jsc0Var = null;
        ksc0 ksc0Var = null;
        psc0 psc0Var = null;
        nsc0 nsc0Var = null;
        while (true) {
            switch (xdxVar.h2(a)) {
                case 0:
                    foe foeVar = l80.a;
                    str = xdxVar.nextString();
                    break;
                case 1:
                    ftc0 ftc0Var = ftc0.a;
                    foe foeVar2 = l80.a;
                    ep60 ep60Var = new ep60(ftc0Var, true);
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        obj2 = null;
                    } else {
                        obj2 = ep60Var.b(xdxVar, cVar);
                    }
                    lsc0Var = (lsc0) obj2;
                    break;
                case 2:
                    lqy lqyVar = new lqy(l80.a);
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        obj3 = null;
                    } else {
                        obj3 = lqyVar.b(xdxVar, cVar);
                    }
                    list = (List) obj3;
                    break;
                case 3:
                    jtc0 jtc0Var = jtc0.a;
                    foe foeVar3 = l80.a;
                    ep60 ep60Var2 = new ep60(jtc0Var, true);
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        obj4 = null;
                    } else {
                        obj4 = ep60Var2.b(xdxVar, cVar);
                    }
                    osc0Var = (osc0) obj4;
                    break;
                case 4:
                    gtc0 gtc0Var = gtc0.a;
                    foe foeVar4 = l80.a;
                    msc0Var = (msc0) new ep60(gtc0Var, true).b(xdxVar, cVar);
                    break;
                case 5:
                    String nextString = xdxVar.nextString();
                    WIDGET_TYPE.Companion.getClass();
                    WIDGET_TYPE[] values = WIDGET_TYPE.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            widget_type = values[i];
                            int i2 = i;
                            if (!jl40.l(widget_type.getRawValue(), nextString)) {
                                i = i2 + 1;
                            }
                        } else {
                            widget_type = null;
                        }
                    }
                    if (widget_type != null) {
                        widget_type2 = widget_type;
                        break;
                    } else {
                        widget_type2 = WIDGET_TYPE.UNKNOWN__;
                        break;
                    }
                case 6:
                    ltc0 ltc0Var = ltc0.a;
                    foe foeVar5 = l80.a;
                    ep60 ep60Var3 = new ep60(ltc0Var, true);
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        obj5 = null;
                    } else {
                        obj5 = ep60Var3.b(xdxVar, cVar);
                    }
                    qsc0Var = (qsc0) obj5;
                    break;
                case 7:
                    dtc0 dtc0Var = dtc0.a;
                    foe foeVar6 = l80.a;
                    ep60 ep60Var4 = new ep60(dtc0Var, true);
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        obj6 = null;
                    } else {
                        obj6 = ep60Var4.b(xdxVar, cVar);
                    }
                    jsc0Var = (jsc0) obj6;
                    break;
                case 8:
                    etc0 etc0Var = etc0.a;
                    foe foeVar7 = l80.a;
                    ep60 ep60Var5 = new ep60(etc0Var, true);
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        obj7 = null;
                    } else {
                        obj7 = ep60Var5.b(xdxVar, cVar);
                    }
                    ksc0Var = (ksc0) obj7;
                    break;
                case 9:
                    ktc0 ktc0Var = ktc0.a;
                    foe foeVar8 = l80.a;
                    ep60 ep60Var6 = new ep60(ktc0Var, true);
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        obj8 = null;
                    } else {
                        obj8 = ep60Var6.b(xdxVar, cVar);
                    }
                    psc0Var = (psc0) obj8;
                    break;
                case 10:
                    htc0 htc0Var = htc0.a;
                    foe foeVar9 = l80.a;
                    ep60 ep60Var7 = new ep60(htc0Var, true);
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        obj = null;
                    } else {
                        obj = ep60Var7.b(xdxVar, cVar);
                    }
                    nsc0Var = (nsc0) obj;
                    break;
            }
        }
    }
}
