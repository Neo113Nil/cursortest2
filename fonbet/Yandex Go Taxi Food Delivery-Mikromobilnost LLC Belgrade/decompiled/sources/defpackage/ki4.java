package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import com.yandex.plus.core.graphql.type.BackgroundGradientTvTypeView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class ki4 implements b70 {
    public static final ki4 a = new ki4();
    public static final List b = scc.g("angle", "colors", "relativeCenter", "relativeRadius", "type");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        di4 di4Var = (di4) obj;
        bfxVar.A1("angle");
        l80.c.a(bfxVar, cVar, Double.valueOf(di4Var.a));
        bfxVar.A1("colors");
        ep60 a2 = l80.a(mi4.a);
        ArrayList arrayList = di4Var.b;
        bfxVar.l();
        for (Object obj2 : arrayList) {
            if (obj2 == null) {
                bfxVar.k2();
            } else {
                a2.a(bfxVar, cVar, obj2);
            }
        }
        bfxVar.j();
        bfxVar.A1("relativeCenter");
        ep60 a3 = l80.a(ni4.a);
        fi4 fi4Var = di4Var.c;
        if (fi4Var == null) {
            bfxVar.k2();
        } else {
            a3.a(bfxVar, cVar, fi4Var);
        }
        bfxVar.A1("relativeRadius");
        ep60 a4 = l80.a(oi4.a);
        gi4 gi4Var = di4Var.d;
        if (gi4Var == null) {
            bfxVar.k2();
        } else {
            a4.a(bfxVar, cVar, gi4Var);
        }
        bfxVar.A1("type");
        bfxVar.r0(di4Var.e.getRawValue());
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        BackgroundGradientTvTypeView backgroundGradientTvTypeView;
        Object obj;
        Object obj2;
        Object b2;
        Double d = null;
        ArrayList arrayList = null;
        fi4 fi4Var = null;
        gi4 gi4Var = null;
        BackgroundGradientTvTypeView backgroundGradientTvTypeView2 = null;
        while (true) {
            int h2 = xdxVar.h2(b);
            if (h2 == 0) {
                d = (Double) l80.c.b(xdxVar, cVar);
            } else if (h2 == 1) {
                ep60 a2 = l80.a(mi4.a);
                arrayList = oyr.z(xdxVar);
                while (xdxVar.hasNext()) {
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        b2 = null;
                    } else {
                        b2 = a2.b(xdxVar, cVar);
                    }
                    arrayList.add(b2);
                }
                xdxVar.j();
            } else if (h2 == 2) {
                ep60 a3 = l80.a(ni4.a);
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    obj2 = null;
                } else {
                    obj2 = a3.b(xdxVar, cVar);
                }
                fi4Var = (fi4) obj2;
            } else if (h2 == 3) {
                ep60 a4 = l80.a(oi4.a);
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    obj = null;
                } else {
                    obj = a4.b(xdxVar, cVar);
                }
                gi4Var = (gi4) obj;
            } else {
                if (h2 != 4) {
                    return new di4(d.doubleValue(), arrayList, fi4Var, gi4Var, backgroundGradientTvTypeView2);
                }
                String nextString = xdxVar.nextString();
                BackgroundGradientTvTypeView.Companion.getClass();
                BackgroundGradientTvTypeView[] values = BackgroundGradientTvTypeView.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        backgroundGradientTvTypeView = null;
                        break;
                    }
                    backgroundGradientTvTypeView = values[i];
                    if (jl40.l(backgroundGradientTvTypeView.getRawValue(), nextString)) {
                        break;
                    }
                    i++;
                }
                backgroundGradientTvTypeView2 = backgroundGradientTvTypeView == null ? BackgroundGradientTvTypeView.UNKNOWN__ : backgroundGradientTvTypeView;
            }
        }
    }
}
