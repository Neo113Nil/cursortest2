package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.a;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes12.dex */
public final class kqo implements yp2 {
    public static final long e;
    public static final ua90 f;
    public final tfu a;
    public final i3y b;
    public final i3y c;
    public final i3y d;

    static {
        long j = ldc.m;
        int i = up2.c;
        e = j;
        f = new ua90(0);
    }

    public kqo(final wvy0 wvy0Var, tfu tfuVar) {
        this.a = tfuVar;
        final int i = 0;
        this.b = a.a(new sls(this) { // from class: jqo
            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                wvy0 wvy0Var2 = wvy0Var;
                switch (i2) {
                    case 0:
                        return kqo.b(kotlin.collections.a.m0((List) wvy0Var2.d.getValue(), (List) wvy0Var2.b.getValue()));
                    case 1:
                        return kqo.b((List) wvy0Var2.e.getValue());
                    default:
                        return kqo.b((List) wvy0Var2.c.getValue());
                }
            }
        });
        final int i2 = 1;
        this.c = a.a(new sls(this) { // from class: jqo
            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                wvy0 wvy0Var2 = wvy0Var;
                switch (i22) {
                    case 0:
                        return kqo.b(kotlin.collections.a.m0((List) wvy0Var2.d.getValue(), (List) wvy0Var2.b.getValue()));
                    case 1:
                        return kqo.b((List) wvy0Var2.e.getValue());
                    default:
                        return kqo.b((List) wvy0Var2.c.getValue());
                }
            }
        });
        final int i3 = 2;
        this.d = a.a(new sls(this) { // from class: jqo
            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i3;
                wvy0 wvy0Var2 = wvy0Var;
                switch (i22) {
                    case 0:
                        return kqo.b(kotlin.collections.a.m0((List) wvy0Var2.d.getValue(), (List) wvy0Var2.b.getValue()));
                    case 1:
                        return kqo.b((List) wvy0Var2.e.getValue());
                    default:
                        return kqo.b((List) wvy0Var2.c.getValue());
                }
            }
        });
    }

    public static MapBuilder b(List list) {
        MapBuilder mapBuilder = new MapBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yfu yfuVar = (yfu) it.next();
            String str = yfuVar.b;
            long j = e;
            wp2 a = f.a(str, new up2(j));
            if (jl40.l(a, new up2(j))) {
                a = null;
            }
            if (a != null) {
                Iterator it2 = yfuVar.a.iterator();
                while (it2.hasNext()) {
                    mapBuilder.put(zoy0.m((String) it2.next()), a);
                }
            }
        }
        return mapBuilder.j();
    }

    @Override // defpackage.yp2
    public final wp2 a(String str, wp2 wp2Var) {
        wp2 wp2Var2 = null;
        tfu tfuVar = this.a;
        if (str == null) {
            return tfuVar.a(null, wp2Var);
        }
        String m = zoy0.m(str);
        if (jl40.l(wp2Var, tp2.a) || wp2Var == AppColor$Palette.Text || wp2Var == AppColor$Palette.TextMinor || wp2Var == AppColor$Palette.TextInvert || wp2Var == AppColor$Palette.TextOnControl) {
            wp2Var2 = (wp2) ((Map) this.b.getValue()).get(m);
        } else if (wp2Var == AppColor$Palette.Control || wp2Var == AppColor$Palette.ControlMinor) {
            wp2Var2 = (wp2) ((Map) this.c.getValue()).get(m);
        } else if (wp2Var == AppColor$Palette.Background || wp2Var == AppColor$Palette.BgMinor) {
            wp2Var2 = (wp2) ((Map) this.d.getValue()).get(m);
        }
        return wp2Var2 == null ? tfuVar.a(str, wp2Var) : wp2Var2;
    }
}
