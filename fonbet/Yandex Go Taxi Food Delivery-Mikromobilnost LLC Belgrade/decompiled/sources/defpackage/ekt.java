package defpackage;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.foundation.c;
import androidx.compose.foundation.f;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.graphics.layer.a;
import androidx.compose.ui.input.pointer.g;
import androidx.compose.ui.unit.LayoutDirection;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes10.dex */
public final class ekt extends lqh implements pam {
    public final /* synthetic */ int c = 1;
    public final c w;
    public final f x;
    public Object y;

    public ekt(g gVar, c cVar, f fVar, j690 j690Var) {
        this.w = cVar;
        this.x = fVar;
        this.y = j690Var;
        E0(gVar);
    }

    public static boolean H0(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int save = canvas.save();
        canvas.rotate(f);
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public static boolean I0(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public RenderNode J0() {
        RenderNode renderNode = (RenderNode) this.y;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNode2 = new RenderNode("AndroidEdgeEffectOverscrollEffect");
        this.y = renderNode2;
        return renderNode2;
    }

    @Override // defpackage.pam
    public final void d(c1y c1yVar) {
        boolean z;
        char c;
        float f;
        boolean z2;
        float f2;
        float f3;
        int i = this.c;
        c cVar = this.w;
        f fVar = this.x;
        switch (i) {
            case 0:
                j690 j690Var = (j690) this.y;
                k28 k28Var = c1yVar.a;
                cVar.j(k28Var.c());
                if (cjs0.e(k28Var.c())) {
                    c1yVar.a();
                    return;
                }
                c1yVar.a();
                cVar.d.getValue();
                i28 q = k28Var.b.q();
                Canvas canvas = t72.a;
                Canvas canvas2 = ((s72) q).a;
                if (f.f(fVar.f)) {
                    EdgeEffect c2 = fVar.c();
                    float f4 = -Float.intBitsToFloat((int) (k28Var.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                    z = I0(270.0f, (Float.floatToRawIntBits(c1yVar.w0(j690Var.b(c1yVar.getLayoutDirection()))) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(f4) << 32), c2, canvas2);
                } else {
                    z = false;
                }
                if (f.f(fVar.d)) {
                    z = I0(0.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(c1yVar.w0(j690Var.d()))) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), fVar.e(), canvas2) || z;
                }
                if (f.f(fVar.g)) {
                    z = I0(90.0f, (((long) Float.floatToRawIntBits(c1yVar.w0(j690Var.c(c1yVar.getLayoutDirection())) + (-((float) m810.b(Float.intBitsToFloat((int) (k28Var.c() >> 32))))))) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (((long) Float.floatToRawIntBits(0.0f)) << 32), fVar.d(), canvas2) || z;
                }
                if (f.f(fVar.e)) {
                    EdgeEffect b = fVar.b();
                    z = I0(180.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (k28Var.c() >> 32)))) << 32) | (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (k28Var.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) + c1yVar.w0(j690Var.a()))) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), b, canvas2) || z;
                }
                if (z) {
                    cVar.e();
                    return;
                }
                return;
            default:
                k28 k28Var2 = c1yVar.a;
                cVar.j(k28Var2.c());
                i28 q2 = k28Var2.b.q();
                Canvas canvas3 = t72.a;
                Canvas canvas4 = ((s72) q2).a;
                cVar.d.getValue();
                if (cjs0.e(k28Var2.c())) {
                    c1yVar.a();
                    return;
                }
                if (!canvas4.isHardwareAccelerated()) {
                    EdgeEffect edgeEffect = fVar.d;
                    if (edgeEffect != null) {
                        edgeEffect.finish();
                    }
                    EdgeEffect edgeEffect2 = fVar.e;
                    if (edgeEffect2 != null) {
                        edgeEffect2.finish();
                    }
                    EdgeEffect edgeEffect3 = fVar.f;
                    if (edgeEffect3 != null) {
                        edgeEffect3.finish();
                    }
                    EdgeEffect edgeEffect4 = fVar.g;
                    if (edgeEffect4 != null) {
                        edgeEffect4.finish();
                    }
                    EdgeEffect edgeEffect5 = fVar.h;
                    if (edgeEffect5 != null) {
                        edgeEffect5.finish();
                    }
                    EdgeEffect edgeEffect6 = fVar.i;
                    if (edgeEffect6 != null) {
                        edgeEffect6.finish();
                    }
                    EdgeEffect edgeEffect7 = fVar.j;
                    if (edgeEffect7 != null) {
                        edgeEffect7.finish();
                    }
                    EdgeEffect edgeEffect8 = fVar.k;
                    if (edgeEffect8 != null) {
                        edgeEffect8.finish();
                    }
                    c1yVar.a();
                    return;
                }
                float w0 = c1yVar.w0(30.0f);
                boolean z3 = f.f(fVar.d) || f.g(fVar.h) || f.f(fVar.e) || f.g(fVar.i);
                boolean z4 = f.f(fVar.f) || f.g(fVar.j) || f.f(fVar.g) || f.g(fVar.k);
                if (z3 && z4) {
                    RenderNode J0 = J0();
                    c = HexString.CHAR_SPACE;
                    J0.setPosition(0, 0, canvas4.getWidth(), canvas4.getHeight());
                } else {
                    c = HexString.CHAR_SPACE;
                    if (z3) {
                        J0().setPosition(0, 0, (m810.b(w0) * 2) + canvas4.getWidth(), canvas4.getHeight());
                    } else {
                        if (!z4) {
                            c1yVar.a();
                            return;
                        }
                        J0().setPosition(0, 0, canvas4.getWidth(), (m810.b(w0) * 2) + canvas4.getHeight());
                    }
                }
                RecordingCanvas beginRecording = J0().beginRecording();
                if (f.g(fVar.j)) {
                    EdgeEffect edgeEffect9 = fVar.j;
                    if (edgeEffect9 == null) {
                        edgeEffect9 = fVar.a(Orientation.Horizontal);
                        fVar.j = edgeEffect9;
                    }
                    H0(90.0f, edgeEffect9, beginRecording);
                    edgeEffect9.finish();
                }
                if (f.f(fVar.f)) {
                    EdgeEffect c3 = fVar.c();
                    z2 = H0(270.0f, c3, beginRecording);
                    f = 1.0f;
                    if (f.g(fVar.f)) {
                        float intBitsToFloat = Float.intBitsToFloat((int) (cVar.d() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                        EdgeEffect edgeEffect10 = fVar.j;
                        if (edgeEffect10 == null) {
                            edgeEffect10 = fVar.a(Orientation.Horizontal);
                            fVar.j = edgeEffect10;
                        }
                        int i2 = Build.VERSION.SDK_INT;
                        float e = i2 >= 31 ? vm2.e(c3) : 0.0f;
                        float f5 = 1.0f - intBitsToFloat;
                        if (i2 >= 31) {
                            vm2.g(edgeEffect10, e, f5);
                        } else {
                            edgeEffect10.onPull(e, f5);
                        }
                    }
                } else {
                    f = 1.0f;
                    z2 = false;
                }
                if (f.g(fVar.h)) {
                    EdgeEffect edgeEffect11 = fVar.h;
                    if (edgeEffect11 == null) {
                        edgeEffect11 = fVar.a(Orientation.Vertical);
                        fVar.h = edgeEffect11;
                    }
                    H0(180.0f, edgeEffect11, beginRecording);
                    edgeEffect11.finish();
                }
                if (f.f(fVar.d)) {
                    EdgeEffect e2 = fVar.e();
                    z2 = H0(0.0f, e2, beginRecording) || z2;
                    if (f.g(fVar.d)) {
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (cVar.d() >> c));
                        EdgeEffect edgeEffect12 = fVar.h;
                        if (edgeEffect12 == null) {
                            edgeEffect12 = fVar.a(Orientation.Vertical);
                            fVar.h = edgeEffect12;
                        }
                        int i3 = Build.VERSION.SDK_INT;
                        float e3 = i3 >= 31 ? vm2.e(e2) : 0.0f;
                        if (i3 >= 31) {
                            vm2.g(edgeEffect12, e3, intBitsToFloat2);
                        } else {
                            edgeEffect12.onPull(e3, intBitsToFloat2);
                        }
                    }
                }
                if (f.g(fVar.k)) {
                    EdgeEffect edgeEffect13 = fVar.k;
                    if (edgeEffect13 == null) {
                        edgeEffect13 = fVar.a(Orientation.Horizontal);
                        fVar.k = edgeEffect13;
                    }
                    H0(270.0f, edgeEffect13, beginRecording);
                    edgeEffect13.finish();
                }
                if (f.f(fVar.g)) {
                    EdgeEffect d = fVar.d();
                    z2 = H0(90.0f, d, beginRecording) || z2;
                    if (f.g(fVar.g)) {
                        float intBitsToFloat3 = Float.intBitsToFloat((int) (cVar.d() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                        EdgeEffect edgeEffect14 = fVar.k;
                        if (edgeEffect14 == null) {
                            edgeEffect14 = fVar.a(Orientation.Horizontal);
                            fVar.k = edgeEffect14;
                        }
                        int i4 = Build.VERSION.SDK_INT;
                        float e4 = i4 >= 31 ? vm2.e(d) : 0.0f;
                        if (i4 >= 31) {
                            vm2.g(edgeEffect14, e4, intBitsToFloat3);
                        } else {
                            edgeEffect14.onPull(e4, intBitsToFloat3);
                        }
                    }
                }
                if (f.g(fVar.i)) {
                    EdgeEffect edgeEffect15 = fVar.i;
                    if (edgeEffect15 == null) {
                        edgeEffect15 = fVar.a(Orientation.Vertical);
                        fVar.i = edgeEffect15;
                    }
                    H0(0.0f, edgeEffect15, beginRecording);
                    edgeEffect15.finish();
                }
                if (f.f(fVar.e)) {
                    EdgeEffect b2 = fVar.b();
                    boolean z5 = H0(180.0f, b2, beginRecording) || z2;
                    if (f.g(fVar.e)) {
                        float intBitsToFloat4 = Float.intBitsToFloat((int) (cVar.d() >> c));
                        EdgeEffect edgeEffect16 = fVar.i;
                        if (edgeEffect16 == null) {
                            edgeEffect16 = fVar.a(Orientation.Vertical);
                            fVar.i = edgeEffect16;
                        }
                        int i5 = Build.VERSION.SDK_INT;
                        float e5 = i5 >= 31 ? vm2.e(b2) : 0.0f;
                        float f6 = f - intBitsToFloat4;
                        if (i5 >= 31) {
                            vm2.g(edgeEffect16, e5, f6);
                        } else {
                            edgeEffect16.onPull(e5, f6);
                        }
                    }
                    z2 = z5;
                }
                if (z2) {
                    cVar.e();
                }
                float f7 = z4 ? 0.0f : w0;
                if (z3) {
                    w0 = 0.0f;
                }
                LayoutDirection layoutDirection = c1yVar.getLayoutDirection();
                s72 s72Var = new s72();
                s72Var.a = beginRecording;
                long c4 = k28Var2.c();
                fwi r = k28Var2.b.r();
                LayoutDirection t = k28Var2.b.t();
                i28 q3 = k28Var2.b.q();
                long v = k28Var2.b.v();
                nfh nfhVar = k28Var2.b;
                a aVar = (a) nfhVar.b;
                nfhVar.B(c1yVar);
                nfhVar.D(layoutDirection);
                nfhVar.A(s72Var);
                nfhVar.E(c4);
                nfhVar.b = null;
                s72Var.save();
                try {
                    ((cot) k28Var2.b.a).n(f7, w0);
                    try {
                        c1yVar.a();
                        s72Var.n();
                        nfh nfhVar2 = k28Var2.b;
                        nfhVar2.B(r);
                        nfhVar2.D(t);
                        nfhVar2.A(q3);
                        nfhVar2.E(v);
                        nfhVar2.b = aVar;
                        J0().endRecording();
                        int save = canvas4.save();
                        canvas4.translate(f2, f3);
                        canvas4.drawRenderNode(J0());
                        canvas4.restoreToCount(save);
                        return;
                    } finally {
                        ((cot) k28Var2.b.a).n(-f7, -w0);
                    }
                } catch (Throwable th) {
                    s72Var.n();
                    nfh nfhVar3 = k28Var2.b;
                    nfhVar3.B(r);
                    nfhVar3.D(t);
                    nfhVar3.A(q3);
                    nfhVar3.E(v);
                    nfhVar3.b = aVar;
                    throw th;
                }
        }
    }

    public ekt(g gVar, c cVar, f fVar) {
        this.w = cVar;
        this.x = fVar;
        E0(gVar);
    }
}
