package defpackage;

import com.apollographql.apollo3.api.c;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.plus.core.graphql.type.HORIZONTAL_RULE;
import com.yandex.plus.core.graphql.type.PLATFORM;
import com.yandex.plus.core.graphql.type.RestrictionMode;
import com.yandex.plus.core.graphql.type.THEME;
import com.yandex.plus.core.graphql.type.VERTICAL_RULE;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class foe implements b70 {
    public static final foe b = new foe(0);
    public static final foe c = new foe(1);
    public static final foe d = new foe(2);
    public static final foe e = new foe(3);
    public static final foe f = new foe(4);
    public static final foe g = new foe(5);
    public static final foe h = new foe(6);
    public static final foe i = new foe(7);
    public static final foe j = new foe(8);
    public final /* synthetic */ int a;

    public /* synthetic */ foe(int i2) {
        this.a = i2;
    }

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        switch (this.a) {
            case 0:
                eoe eoeVar = (eoe) obj;
                bfxVar.A1("accuracy");
                foe foeVar = l80.c;
                foeVar.a(bfxVar, cVar, Double.valueOf(eoeVar.a));
                bfxVar.A1("latitude");
                foeVar.a(bfxVar, cVar, Double.valueOf(eoeVar.b));
                bfxVar.A1("longitude");
                foeVar.a(bfxVar, cVar, Double.valueOf(eoeVar.c));
                break;
            case 1:
                bfxVar.r0(((HORIZONTAL_RULE) obj).getRawValue());
                break;
            case 2:
                n9z n9zVar = (n9z) obj;
                yf70 yf70Var = n9zVar.c;
                yf70 yf70Var2 = n9zVar.b;
                yf70 yf70Var3 = n9zVar.a;
                boolean z = yf70Var3 instanceof xf70;
                foe foeVar2 = b;
                if (z) {
                    bfxVar.A1("coordinates");
                    ep60 a = l80.a(foeVar2);
                    Object obj2 = ((xf70) yf70Var3).a;
                    if (obj2 == null) {
                        bfxVar.k2();
                    } else {
                        a.a(bfxVar, cVar, obj2);
                    }
                }
                if (yf70Var2 instanceof xf70) {
                    bfxVar.A1("geoId");
                    l80.k.a(bfxVar, cVar, ((xf70) yf70Var2).a);
                }
                if (yf70Var instanceof xf70) {
                    bfxVar.A1("geoPinPosition");
                    ep60 a2 = l80.a(foeVar2);
                    Object obj3 = ((xf70) yf70Var).a;
                    if (obj3 != null) {
                        a2.a(bfxVar, cVar, obj3);
                        break;
                    } else {
                        bfxVar.k2();
                        break;
                    }
                }
                break;
            case 3:
                bfxVar.r0(((PLATFORM) obj).getRawValue());
                break;
            case 4:
                bfxVar.r0(((RestrictionMode) obj).getRawValue());
                break;
            case 5:
                mlw0 mlw0Var = (mlw0) obj;
                if (mlw0Var.a() instanceof xf70) {
                    bfxVar.A1("app");
                    ep60 a3 = l80.a(g97.g);
                    Object obj4 = ((xf70) mlw0Var.a()).a;
                    if (obj4 == null) {
                        bfxVar.k2();
                    } else {
                        a3.a(bfxVar, cVar, obj4);
                    }
                }
                bfxVar.A1("type");
                foe foeVar3 = l80.a;
                bfxVar.r0(mlw0Var.b());
                break;
            case 6:
                bfxVar.r0(((THEME) obj).getRawValue());
                break;
            case 7:
                pax0 pax0Var = (pax0) obj;
                yf70 yf70Var4 = pax0Var.B;
                yf70 yf70Var5 = pax0Var.A;
                yf70 yf70Var6 = pax0Var.z;
                yf70 yf70Var7 = pax0Var.y;
                yf70 yf70Var8 = pax0Var.w;
                yf70 yf70Var9 = pax0Var.v;
                yf70 yf70Var10 = pax0Var.u;
                yf70 yf70Var11 = pax0Var.t;
                yf70 yf70Var12 = pax0Var.s;
                yf70 yf70Var13 = pax0Var.r;
                yf70 yf70Var14 = pax0Var.q;
                yf70 yf70Var15 = pax0Var.p;
                yf70 yf70Var16 = pax0Var.o;
                yf70 yf70Var17 = pax0Var.n;
                yf70 yf70Var18 = pax0Var.m;
                yf70 yf70Var19 = pax0Var.l;
                yf70 yf70Var20 = pax0Var.j;
                yf70 yf70Var21 = pax0Var.i;
                yf70 yf70Var22 = pax0Var.h;
                yf70 yf70Var23 = pax0Var.g;
                yf70 yf70Var24 = pax0Var.f;
                yf70 yf70Var25 = pax0Var.e;
                yf70 yf70Var26 = pax0Var.d;
                yf70 yf70Var27 = pax0Var.c;
                yf70 yf70Var28 = pax0Var.b;
                yf70 yf70Var29 = pax0Var.a;
                if (yf70Var29 instanceof xf70) {
                    bfxVar.A1("appMetricaUUID");
                    l80.i.a(bfxVar, cVar, ((xf70) yf70Var29).a);
                }
                if (yf70Var28 instanceof xf70) {
                    bfxVar.A1("appVersion");
                    l80.i.a(bfxVar, cVar, ((xf70) yf70Var28).a);
                }
                if (yf70Var27 instanceof xf70) {
                    bfxVar.A1("consumer");
                    l80.i.a(bfxVar, cVar, ((xf70) yf70Var27).a);
                }
                if (yf70Var26 instanceof xf70) {
                    bfxVar.A1("consumerType");
                    g97 g97Var = g97.b;
                    foe foeVar4 = l80.a;
                    Object obj5 = ((xf70) yf70Var26).a;
                    if (obj5 == null) {
                        bfxVar.k2();
                    } else {
                        g97Var.a(bfxVar, cVar, obj5);
                    }
                }
                if (yf70Var25 instanceof xf70) {
                    bfxVar.A1("device");
                    g97 g97Var2 = g97.h;
                    foe foeVar5 = l80.a;
                    Object obj6 = ((xf70) yf70Var25).a;
                    if (obj6 == null) {
                        bfxVar.k2();
                    } else {
                        g97Var2.a(bfxVar, cVar, obj6);
                    }
                }
                if (yf70Var24 instanceof xf70) {
                    bfxVar.A1("featureNames");
                    lqy lqyVar = new lqy(l80.a);
                    Object obj7 = ((xf70) yf70Var24).a;
                    if (obj7 == null) {
                        bfxVar.k2();
                    } else {
                        lqyVar.a(bfxVar, cVar, obj7);
                    }
                }
                if (yf70Var23 instanceof xf70) {
                    bfxVar.A1("flags");
                    lqy lqyVar2 = new lqy(l80.a);
                    Object obj8 = ((xf70) yf70Var23).a;
                    if (obj8 == null) {
                        bfxVar.k2();
                    } else {
                        lqyVar2.a(bfxVar, cVar, obj8);
                    }
                }
                if (yf70Var22 instanceof xf70) {
                    bfxVar.A1("geoId");
                    l80.k.a(bfxVar, cVar, ((xf70) yf70Var22).a);
                }
                if (yf70Var21 instanceof xf70) {
                    bfxVar.A1("inappCountryCode");
                    l80.i.a(bfxVar, cVar, ((xf70) yf70Var21).a);
                }
                if (yf70Var20 instanceof xf70) {
                    bfxVar.A1("isNativePaymentAvailable");
                    l80.l.a(bfxVar, cVar, ((xf70) yf70Var20).a);
                }
                bfxVar.A1("language");
                foe foeVar6 = l80.a;
                bfxVar.r0(pax0Var.k);
                if (yf70Var19 instanceof xf70) {
                    bfxVar.A1("layoutId");
                    l80.k.a(bfxVar, cVar, ((xf70) yf70Var19).a);
                }
                if (yf70Var18 instanceof xf70) {
                    bfxVar.A1("location");
                    ep60 a4 = l80.a(d);
                    Object obj9 = ((xf70) yf70Var18).a;
                    if (obj9 == null) {
                        bfxVar.k2();
                    } else {
                        a4.a(bfxVar, cVar, obj9);
                    }
                }
                if (yf70Var17 instanceof xf70) {
                    bfxVar.A1("loyaltyInfo");
                    lqy lqyVar3 = new lqy(l80.a(g97.l));
                    Object obj10 = ((xf70) yf70Var17).a;
                    if (obj10 == null) {
                        bfxVar.k2();
                    } else {
                        lqyVar3.a(bfxVar, cVar, obj10);
                    }
                }
                if (yf70Var16 instanceof xf70) {
                    bfxVar.A1(Constants.KEY_MESSAGE);
                    l80.i.a(bfxVar, cVar, ((xf70) yf70Var16).a);
                }
                if (yf70Var15 instanceof xf70) {
                    bfxVar.A1("overrideStartTime");
                    l80.m.a(bfxVar, cVar, ((xf70) yf70Var15).a);
                }
                if (yf70Var14 instanceof xf70) {
                    bfxVar.A1("overrideStopTime");
                    l80.m.a(bfxVar, cVar, ((xf70) yf70Var14).a);
                }
                if (yf70Var13 instanceof xf70) {
                    bfxVar.A1("place");
                    l80.i.a(bfxVar, cVar, ((xf70) yf70Var13).a);
                }
                if (yf70Var12 instanceof xf70) {
                    bfxVar.A1("platform");
                    foe foeVar7 = e;
                    Object obj11 = ((xf70) yf70Var12).a;
                    if (obj11 == null) {
                        bfxVar.k2();
                    } else {
                        foeVar7.a(bfxVar, cVar, obj11);
                    }
                }
                if (yf70Var11 instanceof xf70) {
                    bfxVar.A1("plus");
                    l80.l.a(bfxVar, cVar, ((xf70) yf70Var11).a);
                }
                if (yf70Var10 instanceof xf70) {
                    bfxVar.A1("restrictionMode");
                    foe foeVar8 = f;
                    Object obj12 = ((xf70) yf70Var10).a;
                    if (obj12 == null) {
                        bfxVar.k2();
                    } else {
                        foeVar8.a(bfxVar, cVar, obj12);
                    }
                }
                if (yf70Var9 instanceof xf70) {
                    bfxVar.A1("sdkVersion");
                    l80.i.a(bfxVar, cVar, ((xf70) yf70Var9).a);
                }
                if (yf70Var8 instanceof xf70) {
                    bfxVar.A1("segment");
                    l80.i.a(bfxVar, cVar, ((xf70) yf70Var8).a);
                }
                bfxVar.A1(Constants.KEY_SERVICE);
                bfxVar.r0(pax0Var.x);
                if (yf70Var7 instanceof xf70) {
                    bfxVar.A1("subscriptionResumed");
                    l80.l.a(bfxVar, cVar, ((xf70) yf70Var7).a);
                }
                if (yf70Var6 instanceof xf70) {
                    bfxVar.A1("target");
                    l80.i.a(bfxVar, cVar, ((xf70) yf70Var6).a);
                }
                if (yf70Var5 instanceof xf70) {
                    bfxVar.A1("testIds");
                    lqy lqyVar4 = new lqy(cVar.d(mlz.a));
                    Object obj13 = ((xf70) yf70Var5).a;
                    if (obj13 == null) {
                        bfxVar.k2();
                    } else {
                        lqyVar4.a(bfxVar, cVar, obj13);
                    }
                }
                if (yf70Var4 instanceof xf70) {
                    bfxVar.A1(DivkitThemeChangeListener.THEME_VARIABLE_NAME);
                    foe foeVar9 = h;
                    Object obj14 = ((xf70) yf70Var4).a;
                    if (obj14 != null) {
                        foeVar9.a(bfxVar, cVar, obj14);
                        break;
                    } else {
                        bfxVar.k2();
                        break;
                    }
                }
                break;
            case 8:
                bfxVar.r0(((VERTICAL_RULE) obj).getRawValue());
                break;
            case 9:
                bfxVar.n1(((Boolean) obj).booleanValue());
                break;
            case 10:
                bfxVar.Z0(((Number) obj).doubleValue());
                break;
            case 11:
                bfxVar.Y0(((Number) obj).intValue());
                break;
            case 12:
                bfxVar.X0(((Number) obj).longValue());
                break;
            case 13:
                bfxVar.r0((String) obj);
                break;
            case 14:
                qje.e0(bfxVar, (Map) obj);
                break;
            default:
                qje.e0(bfxVar, (Map) obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        HORIZONTAL_RULE horizontal_rule = null;
        int i2 = 0;
        switch (this.a) {
            case 0:
                throw new IllegalStateException("Input type used in output position");
            case 1:
                String nextString = xdxVar.nextString();
                HORIZONTAL_RULE.Companion.getClass();
                HORIZONTAL_RULE[] values = HORIZONTAL_RULE.values();
                int length = values.length;
                while (true) {
                    if (i2 < length) {
                        HORIZONTAL_RULE horizontal_rule2 = values[i2];
                        if (jl40.l(horizontal_rule2.getRawValue(), nextString)) {
                            horizontal_rule = horizontal_rule2;
                        } else {
                            i2++;
                        }
                    }
                }
                return horizontal_rule == null ? HORIZONTAL_RULE.UNKNOWN__ : horizontal_rule;
            case 2:
                throw new IllegalStateException("Input type used in output position");
            case 3:
                String nextString2 = xdxVar.nextString();
                PLATFORM.Companion.getClass();
                PLATFORM[] values2 = PLATFORM.values();
                int length2 = values2.length;
                while (true) {
                    if (i2 < length2) {
                        PLATFORM platform = values2[i2];
                        if (jl40.l(platform.getRawValue(), nextString2)) {
                            horizontal_rule = platform;
                        } else {
                            i2++;
                        }
                    }
                }
                return horizontal_rule == null ? PLATFORM.UNKNOWN__ : horizontal_rule;
            case 4:
                String nextString3 = xdxVar.nextString();
                RestrictionMode.Companion.getClass();
                RestrictionMode[] values3 = RestrictionMode.values();
                int length3 = values3.length;
                while (true) {
                    if (i2 < length3) {
                        RestrictionMode restrictionMode = values3[i2];
                        if (jl40.l(restrictionMode.getRawValue(), nextString3)) {
                            horizontal_rule = restrictionMode;
                        } else {
                            i2++;
                        }
                    }
                }
                return horizontal_rule == null ? RestrictionMode.UNKNOWN__ : horizontal_rule;
            case 5:
                throw new IllegalStateException("Input type used in output position");
            case 6:
                String nextString4 = xdxVar.nextString();
                THEME.Companion.getClass();
                THEME[] values4 = THEME.values();
                int length4 = values4.length;
                while (true) {
                    if (i2 < length4) {
                        THEME theme = values4[i2];
                        if (jl40.l(theme.getRawValue(), nextString4)) {
                            horizontal_rule = theme;
                        } else {
                            i2++;
                        }
                    }
                }
                return horizontal_rule == null ? THEME.UNKNOWN__ : horizontal_rule;
            case 7:
                throw new IllegalStateException("Input type used in output position");
            case 8:
                String nextString5 = xdxVar.nextString();
                VERTICAL_RULE.Companion.getClass();
                VERTICAL_RULE[] values5 = VERTICAL_RULE.values();
                int length5 = values5.length;
                while (true) {
                    if (i2 < length5) {
                        VERTICAL_RULE vertical_rule = values5[i2];
                        if (jl40.l(vertical_rule.getRawValue(), nextString5)) {
                            horizontal_rule = vertical_rule;
                        } else {
                            i2++;
                        }
                    }
                }
                return horizontal_rule == null ? VERTICAL_RULE.UNKNOWN__ : horizontal_rule;
            case 9:
                return Boolean.valueOf(xdxVar.nextBoolean());
            case 10:
                return Double.valueOf(xdxVar.nextDouble());
            case 11:
                return Integer.valueOf(xdxVar.nextInt());
            case 12:
                return Long.valueOf(xdxVar.nextLong());
            case 13:
                return xdxVar.nextString();
            case 14:
                xdxVar.u();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (xdxVar.hasNext()) {
                    String nextName = xdxVar.nextName();
                    Object L = qje.L(xdxVar);
                    if (L != null) {
                        linkedHashMap.put(nextName, L);
                    }
                }
                xdxVar.y();
                return linkedHashMap;
            default:
                xdxVar.u();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (xdxVar.hasNext()) {
                    String nextName2 = xdxVar.nextName();
                    String nextString6 = xdxVar.nextString();
                    if (nextString6 != null) {
                    }
                }
                xdxVar.y();
                return linkedHashMap2;
        }
    }
}
