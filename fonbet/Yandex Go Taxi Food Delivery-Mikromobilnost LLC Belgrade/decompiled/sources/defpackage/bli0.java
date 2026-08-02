package defpackage;

import androidx.compose.ui.graphics.d;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.j;
import com.yandex.go.summary.ui.compose.expanded.content.tariffcard.animations.a;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes14.dex */
public abstract class bli0 {
    public static final f530 a(f530 f530Var, m3u0 m3u0Var, fid fidVar, int i, int i2) {
        float f = (i2 & 2) != 0 ? 1.0f : 3.27f;
        int i3 = (i & 112) ^ 48;
        boolean z = ((i3 > 32 && ((bts) fidVar).k(m3u0Var)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && fidVar.b(f)) || (i & 384) == 256);
        bts btsVar = (bts) fidVar;
        Object Q = btsVar.Q();
        o430 o430Var = did.a;
        if (z || Q == o430Var) {
            Q = new qjf0(m3u0Var, f, 1);
            btsVar.o0(Q);
        }
        f530 a = d.a(f530Var, (tls) Q);
        boolean z2 = (i3 > 32 && btsVar.k(m3u0Var)) || (i & 48) == 32;
        Object Q2 = btsVar.Q();
        if (z2 || Q2 == o430Var) {
            Q2 = new a(m3u0Var);
            btsVar.o0(Q2);
        }
        return exw0.a(a, zy11.a, (PointerInputEventHandler) Q2);
    }

    public static final f530 b(f530 f530Var, m3u0 m3u0Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        int a = (int) (((k651) btsVar.m(j.u)).a() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        boolean c = ((((i & 112) ^ 48) > 32 && btsVar.k(m3u0Var)) || (i & 48) == 32) | btsVar.c(a);
        Object Q = btsVar.Q();
        if (c || Q == did.a) {
            Q = new ali0(a, m3u0Var);
            btsVar.o0(Q);
        }
        return kp50.F(f530Var, (zls) Q);
    }

    public static final f530 c(f530 f530Var, m3u0 m3u0Var, fid fidVar, int i) {
        boolean z = ((((i & 896) ^ 384) > 256 && fidVar.b(0.3f)) || (i & 384) == 256) | ((((i & 112) ^ 48) > 32 && ((bts) fidVar).k(m3u0Var)) || (i & 48) == 32);
        bts btsVar = (bts) fidVar;
        Object Q = btsVar.Q();
        if (z || Q == did.a) {
            Q = new xo1(m3u0Var, 13);
            btsVar.o0(Q);
        }
        return d.a(f530Var, (tls) Q);
    }
}
