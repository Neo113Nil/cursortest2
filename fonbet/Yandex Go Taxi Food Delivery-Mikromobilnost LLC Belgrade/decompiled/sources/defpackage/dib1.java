package defpackage;

import com.yandex.go.design.compose.button.ButtonStyle;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.map_common.MapControllerExtensionsKt$listenCameraState$$inlined$simpleCallbackApiToFlow$1;

/* loaded from: classes6.dex */
public abstract class dib1 {
    public static final void a(f530 f530Var, paa paaVar, z0a0 z0a0Var, String str, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-443804612);
        int i2 = (btsVar.k(paaVar) ? 32 : 16) | i | (btsVar.k(z0a0Var) ? 256 : 128) | (btsVar.k(str) ? 2048 : 1024) | (btsVar.e(tlsVar) ? 16384 : 8192);
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            dta1.a(ljs0.c(f530Var, 1.0f), false, null, false, false, wwg.S(-2015113536, true, new o7a(paaVar, tlsVar, z0a0Var, str), btsVar), btsVar, 199680, 22);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new b0((Object) f530Var, (Object) paaVar, (Object) z0a0Var, (Object) str, (Object) tlsVar, i, 4);
        }
    }

    public static final void b(f530 f530Var, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(370984122);
        if (btsVar.V(i & 1, (i & 3) != 2)) {
            ButtonStyle buttonStyle = ButtonStyle.Minor;
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = new bgc(12);
                btsVar.o0(Q);
            }
            u4d.a.getClass();
            f530Var2 = f530Var;
            d17.c(f530Var2, false, null, buttonStyle, null, (sls) Q, u4d.b, btsVar, 1772598, 20);
        } else {
            f530Var2 = f530Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new os(f530Var2, i, 11);
        }
    }

    public static final tpr c(ah00 ah00Var) {
        return e.o(e.g(new MapControllerExtensionsKt$listenCameraState$$inlined$simpleCallbackApiToFlow$1(new bh00(ah00Var, 0), null)));
    }

    public static final String d(tnx tnxVar) {
        if (tnxVar.equals(qnx.b)) {
            return "PASSPORT_MAIN_PAGE_PHOTO";
        }
        if (tnxVar.equals(snx.b)) {
            return "CLIENT_WITH_PASSPORT_PHOTO";
        }
        if (tnxVar.equals(rnx.b)) {
            return "PASSPORT_REGISTRATION_PAGE_PHOTO";
        }
        if (tnxVar instanceof pnx) {
            return ((pnx) tnxVar).b;
        }
        w511.b();
        return null;
    }
}
