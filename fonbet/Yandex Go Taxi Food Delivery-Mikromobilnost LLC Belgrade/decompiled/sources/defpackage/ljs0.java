package defpackage;

import androidx.compose.foundation.layout.Direction;
import androidx.compose.ui.platform.m;
import defpackage.g131;
import defpackage.n;
import defpackage.v2w;
import defpackage.zy11;
import ru.CryptoPro.JCSP.api.bio.CspBioProgressConstants;

/* loaded from: classes.dex */
public abstract class ljs0 {
    public static final k3r a;
    public static final k3r b;
    public static final k3r c;
    public static final cb51 d;
    public static final cb51 e;
    public static final cb51 f;
    public static final cb51 g;
    public static final cb51 h;
    public static final cb51 i;

    static {
        Direction direction = Direction.Horizontal;
        a = new k3r(direction, 1.0f);
        Direction direction2 = Direction.Vertical;
        b = new k3r(direction2, 1.0f);
        Direction direction3 = Direction.Both;
        c = new k3r(direction3, 1.0f);
        so5 so5Var = x4c.H;
        int i2 = 13;
        d = new cb51(direction, false, new jid(i2, so5Var), so5Var);
        so5 so5Var2 = x4c.G;
        e = new cb51(direction, false, new jid(i2, so5Var2), so5Var2);
        to5 to5Var = x4c.E;
        int i3 = 14;
        f = new cb51(direction2, false, new jid(i3, to5Var), to5Var);
        to5 to5Var2 = x4c.D;
        g = new cb51(direction2, false, new jid(i3, to5Var2), to5Var2);
        uo5 uo5Var = x4c.y;
        int i4 = 15;
        h = new cb51(direction3, false, new jid(i4, uo5Var), uo5Var);
        uo5 uo5Var2 = x4c.b;
        i = new cb51(direction3, false, new jid(i4, uo5Var2), uo5Var2);
    }

    public static final f530 a(f530 f530Var, float f2, float f3) {
        return f530Var.k(new g421(f2, f3));
    }

    public static /* synthetic */ f530 b(f530 f530Var, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return a(f530Var, f2, f3);
    }

    public static final f530 c(f530 f530Var, float f2) {
        return f530Var.k(f2 == 1.0f ? a : new k3r(Direction.Horizontal, f2));
    }

    public static final f530 e(f530 f530Var, final float f2) {
        return f530Var.k(new ijs0(0.0f, f2, 0.0f, f2, true, m.b ? new tls() { // from class: androidx.compose.foundation.layout.SizeKt$height-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                ((v2w) obj).getClass();
                return zy11.a;
            }
        } : m.a(), 5));
    }

    public static final f530 f(f530 f530Var, final float f2, final float f3) {
        return f530Var.k(new ijs0(0.0f, f2, 0.0f, f3, true, m.b ? new tls() { // from class: androidx.compose.foundation.layout.SizeKt$heightIn-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                v2w v2wVar = (v2w) obj;
                v2wVar.getClass();
                g131 g131Var = v2wVar.a;
                n.x(f2, g131Var, "min");
                n.x(f3, g131Var, CspBioProgressConstants.MAX);
                return zy11.a;
            }
        } : m.a(), 5));
    }

    public static /* synthetic */ f530 g(f530 f530Var, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return f(f530Var, f2, f3);
    }

    public static final f530 h(f530 f530Var, final float f2) {
        return f530Var.k(new ijs0(0.0f, f2, 0.0f, f2, false, m.b ? new tls() { // from class: androidx.compose.foundation.layout.SizeKt$requiredHeight-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                ((v2w) obj).getClass();
                return zy11.a;
            }
        } : m.a(), 5));
    }

    public static final f530 i(f530 f530Var, final float f2) {
        return f530Var.k(new ijs0(f2, f2, f2, f2, false, m.b ? new tls() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSize-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                ((v2w) obj).getClass();
                return zy11.a;
            }
        } : m.a()));
    }

    public static final f530 j(f530 f530Var, final float f2, final float f3) {
        return f530Var.k(new ijs0(f2, f3, f2, f3, false, m.b ? new tls() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSize-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                v2w v2wVar = (v2w) obj;
                v2wVar.getClass();
                g131 g131Var = v2wVar.a;
                n.x(f2, g131Var, "width");
                n.x(f3, g131Var, "height");
                return zy11.a;
            }
        } : m.a()));
    }

    public static f530 k(f530 f530Var, final float f2, float f3, float f4, float f5, int i2) {
        final float f6 = (i2 & 2) != 0 ? Float.NaN : f3;
        final float f7 = (i2 & 4) != 0 ? Float.NaN : f4;
        final float f8 = (i2 & 8) != 0 ? Float.NaN : f5;
        return f530Var.k(new ijs0(f2, f6, f7, f8, false, m.b ? new tls() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSizeIn-qDBjuR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                v2w v2wVar = (v2w) obj;
                v2wVar.getClass();
                g131 g131Var = v2wVar.a;
                n.x(f2, g131Var, "minWidth");
                n.x(f6, g131Var, "minHeight");
                n.x(f7, g131Var, "maxWidth");
                n.x(f8, g131Var, "maxHeight");
                return zy11.a;
            }
        } : m.a()));
    }

    public static final f530 l(f530 f530Var, final float f2) {
        return f530Var.k(new ijs0(f2, 0.0f, f2, 0.0f, false, m.b ? new tls() { // from class: androidx.compose.foundation.layout.SizeKt$requiredWidth-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                ((v2w) obj).getClass();
                return zy11.a;
            }
        } : m.a(), 10));
    }

    public static final f530 m(f530 f530Var, final float f2) {
        return f530Var.k(new ijs0(f2, f2, f2, f2, true, m.b ? new tls() { // from class: androidx.compose.foundation.layout.SizeKt$size-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                ((v2w) obj).getClass();
                return zy11.a;
            }
        } : m.a()));
    }

    public static final f530 n(f530 f530Var, final float f2, final float f3) {
        return f530Var.k(new ijs0(f2, f3, f2, f3, true, m.b ? new tls() { // from class: androidx.compose.foundation.layout.SizeKt$size-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                v2w v2wVar = (v2w) obj;
                v2wVar.getClass();
                g131 g131Var = v2wVar.a;
                n.x(f2, g131Var, "width");
                n.x(f3, g131Var, "height");
                return zy11.a;
            }
        } : m.a()));
    }

    public static final f530 o(f530 f530Var, final float f2, final float f3, final float f4, final float f5) {
        return f530Var.k(new ijs0(f2, f3, f4, f5, true, m.b ? new tls() { // from class: androidx.compose.foundation.layout.SizeKt$sizeIn-qDBjuR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                v2w v2wVar = (v2w) obj;
                v2wVar.getClass();
                g131 g131Var = v2wVar.a;
                n.x(f2, g131Var, "minWidth");
                n.x(f3, g131Var, "minHeight");
                n.x(f4, g131Var, "maxWidth");
                n.x(f5, g131Var, "maxHeight");
                return zy11.a;
            }
        } : m.a()));
    }

    public static /* synthetic */ f530 p(f530 f530Var, float f2, float f3, float f4, float f5, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        if ((i2 & 4) != 0) {
            f4 = Float.NaN;
        }
        if ((i2 & 8) != 0) {
            f5 = Float.NaN;
        }
        return o(f530Var, f2, f3, f4, f5);
    }

    public static final f530 q(f530 f530Var, final float f2) {
        return f530Var.k(new ijs0(f2, 0.0f, f2, 0.0f, true, m.b ? new tls() { // from class: androidx.compose.foundation.layout.SizeKt$width-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                ((v2w) obj).getClass();
                return zy11.a;
            }
        } : m.a(), 10));
    }

    public static final f530 r(f530 f530Var, final float f2, final float f3) {
        return f530Var.k(new ijs0(f2, 0.0f, f3, 0.0f, true, m.b ? new tls() { // from class: androidx.compose.foundation.layout.SizeKt$widthIn-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                v2w v2wVar = (v2w) obj;
                v2wVar.getClass();
                g131 g131Var = v2wVar.a;
                n.x(f2, g131Var, "min");
                n.x(f3, g131Var, CspBioProgressConstants.MAX);
                return zy11.a;
            }
        } : m.a(), 10));
    }

    public static /* synthetic */ f530 s(f530 f530Var, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return r(f530Var, f2, f3);
    }

    public static final f530 t(f530 f530Var, to5 to5Var, boolean z) {
        return f530Var.k((!jl40.l(to5Var, x4c.E) || z) ? (!jl40.l(to5Var, x4c.D) || z) ? new cb51(Direction.Vertical, z, new jid(14, to5Var), to5Var) : g : f);
    }

    public static /* synthetic */ f530 u(f530 f530Var, to5 to5Var, int i2) {
        if ((i2 & 1) != 0) {
            to5Var = x4c.E;
        }
        return t(f530Var, to5Var, false);
    }

    public static f530 v(f530 f530Var, uo5 uo5Var, int i2) {
        uo5 uo5Var2 = x4c.y;
        if ((i2 & 1) != 0) {
            uo5Var = uo5Var2;
        }
        boolean z = (i2 & 2) == 0;
        return f530Var.k((!uo5Var.equals(uo5Var2) || z) ? (!uo5Var.equals(x4c.b) || z) ? new cb51(Direction.Both, z, new jid(15, uo5Var), uo5Var) : i : h);
    }

    public static f530 w(f530 f530Var, int i2) {
        so5 so5Var = x4c.I;
        so5 so5Var2 = x4c.H;
        if ((i2 & 1) != 0) {
            so5Var = so5Var2;
        }
        return f530Var.k(so5Var.equals(so5Var2) ? d : so5Var.equals(x4c.G) ? e : new cb51(Direction.Horizontal, false, new jid(13, so5Var), so5Var));
    }
}
