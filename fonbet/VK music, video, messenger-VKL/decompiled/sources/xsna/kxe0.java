package xsna;

import androidx.compose.runtime.a;
import com.vk.core.view.components.rating.RatingBar$Size;
import com.vk.core.view.components.rating.a;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import ru.ok.gl.tf.Tensorflow;
import xsna.g8s;
import xsna.h8s;
import xsna.q630;
import xsna.s2x;

/* compiled from: RatingBarContent.kt */
/* loaded from: classes18.dex */
public final class kxe0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(1451791664);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1451791664, i, -1, "com.vk.design.demo.presentation.screens.DynamicViewContent (RatingBarContent.kt:251)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                wow wowVar = new wow(j5g.O0(RatingBar$Size.h()));
                M.R(wowVar);
                x = wowVar;
            }
            List<T> list = ((wow) x).b;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.k.b(RatingBar$Size.Medium);
                M.R(x2);
            }
            wh50 wh50Var = (wh50) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = androidx.compose.runtime.k.b(Boolean.TRUE);
                M.R(x3);
            }
            wh50 wh50Var2 = (wh50) x3;
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = androidx.compose.runtime.k.b(Boolean.TRUE);
                M.R(x4);
            }
            wh50 wh50Var3 = (wh50) x4;
            float f = kqu0.b;
            float f2 = kqu0.v;
            q630.a aVar2 = q630.a.a;
            rzo0.a(6, 0, M, "Dynamic", s200.E(aVar2, f, f2));
            q630 E = s200.E(aVar2, f, f2);
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = new acc0(4);
                M.R(x5);
            }
            izs izsVar = (izs) x5;
            Object x6 = M.x();
            if (x6 == c0012a) {
                x6 = new z63(wh50Var, wh50Var2, wh50Var3, 11);
                M.R(x6);
            }
            ae2.a(390, 0, M, izsVar, (izs) x6, E);
            RatingBar$Size ratingBar$Size = (RatingBar$Size) wh50Var.getValue();
            Object x7 = M.x();
            if (x7 == c0012a) {
                x7 = new y2x(1, wh50Var);
                M.R(x7);
            }
            y9i0.b("Size", list, ratingBar$Size, (izs) x7, null, M, 3126, 16);
            M = M;
            boolean booleanValue = ((Boolean) wh50Var2.getValue()).booleanValue();
            Object x8 = M.x();
            if (x8 == c0012a) {
                x8 = new j36(1, wh50Var2);
                M.R(x8);
            }
            zov0.b(booleanValue, "isEnabled", (izs) x8, null, null, false, false, M, Tensorflow.FRAME_WIDTH, 120);
            boolean booleanValue2 = ((Boolean) wh50Var3.getValue()).booleanValue();
            Object x9 = M.x();
            if (x9 == c0012a) {
                x9 = new bd2(1, wh50Var3);
                M.R(x9);
            }
            zov0.b(booleanValue2, "isInteractionEnabled", (izs) x9, null, null, false, false, M, Tensorflow.FRAME_WIDTH, 120);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new aad(i, 11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(2104388251);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2104388251, i, -1, "com.vk.design.demo.presentation.screens.StaticViewContent (RatingBarContent.kt:169)");
            }
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (x == obj) {
                x = pn00.k(new Pair("AsIs", new a.C0861a()), new Pair("Integer", new a.b()));
                M.R(x);
            }
            Map map = (Map) x;
            Object x2 = M.x();
            if (x2 == obj) {
                wow wowVar = new wow(j5g.O0(RatingBar$Size.h()));
                M.R(wowVar);
                x2 = wowVar;
            }
            List<T> list = ((wow) x2).b;
            Object x3 = M.x();
            if (x3 == obj) {
                x3 = androidx.compose.runtime.k.b("4.5");
                M.R(x3);
            }
            wh50 wh50Var = (wh50) x3;
            Object x4 = M.x();
            if (x4 == obj) {
                x4 = androidx.compose.runtime.k.b("AsIs");
                M.R(x4);
            }
            wh50 wh50Var2 = (wh50) x4;
            Object x5 = M.x();
            if (x5 == obj) {
                x5 = androidx.compose.runtime.k.b(RatingBar$Size.Medium);
                M.R(x5);
            }
            wh50 wh50Var3 = (wh50) x5;
            float f = kqu0.b;
            float f2 = kqu0.v;
            q630.a aVar2 = q630.a.a;
            rzo0.a(6, 0, M, "Static", s200.E(aVar2, f, f2));
            Object x6 = M.x();
            if (x6 == obj) {
                x6 = new c220(18);
                M.R(x6);
            }
            izs izsVar = (izs) x6;
            q630 E = s200.E(aVar2, f, f2);
            boolean y = M.y(map);
            Object x7 = M.x();
            if (y || x7 == obj) {
                hjj hjjVar = new hjj(map, wh50Var, wh50Var2, wh50Var3, 2);
                M.R(hjjVar);
                x7 = hjjVar;
            }
            ae2.a(6, 0, M, izsVar, (izs) x7, E);
            Object x8 = M.x();
            if (x8 == obj) {
                x8 = new av70(10);
                M.R(x8);
            }
            izs izsVar2 = (izs) x8;
            q630 E2 = s200.E(aVar2, f, f2);
            Object x9 = M.x();
            if (x9 == obj) {
                x9 = new hsc0(wh50Var3, 3);
                M.R(x9);
            }
            ae2.a(390, 0, M, izsVar2, (izs) x9, E2);
            String str = (String) wh50Var.getValue();
            Object x10 = M.x();
            if (x10 == obj) {
                x10 = new qt6(2, wh50Var);
                M.R(x10);
            }
            u2x a = g8s.b.a.a(s2x.a.C3649a.a(str, (izs) x10, null, null, null, M, 48, 32764), null, false, null, M, 24576, 14);
            M = M;
            nvu0.a(a, null, h8s.a.a("Rating", false, null, null, null, M, 196614, 30), null, null, M, 0, 26);
            List O0 = j5g.O0(map.keySet());
            String str2 = (String) wh50Var2.getValue();
            Object x11 = M.x();
            if (x11 == obj) {
                x11 = new b3x(1, wh50Var2);
                M.R(x11);
            }
            y9i0.b("Fill strategy", O0, str2, (izs) x11, null, M, 3078, 16);
            RatingBar$Size ratingBar$Size = (RatingBar$Size) wh50Var3.getValue();
            Object x12 = M.x();
            if (x12 == obj) {
                x12 = new qw30(wh50Var3, 26);
                M.R(x12);
            }
            y9i0.b("Size", list, ratingBar$Size, (izs) x12, null, M, 3126, 16);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new z2(i, 9);
        }
    }
}
