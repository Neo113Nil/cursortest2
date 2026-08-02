package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.platform.m;
import defpackage.g131;
import defpackage.v2w;
import defpackage.zy11;

/* loaded from: classes.dex */
public abstract class lrv {
    public static final qwd a = new qwd(new i2v(11));

    public static final f530 a(f530 f530Var, final h8w h8wVar, final jrv jrvVar) {
        if (jrvVar == null) {
            return f530Var;
        }
        if (jrvVar instanceof prv) {
            return f530Var.k(new nrv(h8wVar, (prv) jrvVar));
        }
        return b.a(f530Var, m.b ? new tls() { // from class: androidx.compose.foundation.IndicationKt$indication$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                v2w v2wVar = (v2w) obj;
                v2wVar.getClass();
                g131 g131Var = v2wVar.a;
                g131Var.b("interactionSource", h8wVar);
                g131Var.b("indication", jrvVar);
                return zy11.a;
            }
        } : m.a(), new ctq(jrvVar, h8wVar));
    }
}
