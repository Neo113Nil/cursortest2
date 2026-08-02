package xsna;

import com.vk.core.compose.component.image.badge.BadgeAlignment;

/* compiled from: Badge.kt */
/* loaded from: classes17.dex */
public interface iy5 extends m2k0 {

    /* compiled from: Badge.kt */
    public static final class a {
        public static long a(iy5 iy5Var, long j, float f) {
            long d = iy5Var.d(j);
            float b = (uco.b(j) / 2.0f) - ((uco.b(d) / 2.0f) - f);
            float c = (uco.c(j) / 2.0f) - ((uco.c(d) / 2.0f) - f);
            BadgeAlignment alignment = iy5Var.getAlignment();
            if (alignment == BadgeAlignment.BottomLeft || alignment == BadgeAlignment.TopLeft) {
                c = -c;
            }
            BadgeAlignment alignment2 = iy5Var.getAlignment();
            if (alignment2 == BadgeAlignment.TopLeft || alignment2 == BadgeAlignment.TopRight) {
                b = -b;
            }
            return (Float.floatToRawIntBits(c) << 32) | (Float.floatToRawIntBits(b) & 4294967295L);
        }

        public static long b(iy5 iy5Var, long j, boolean z, androidx.compose.runtime.a aVar, int i) {
            long g;
            aVar.K(1069850685);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1069850685, i, -1, "com.vk.core.compose.component.image.badge.Badge.calculatePosition (Badge.kt:24)");
            }
            if (z) {
                aVar.K(1629328612);
                g = iy5Var.f((i & 14) | ((i >> 3) & 112), j, aVar);
                aVar.j();
            } else {
                aVar.K(1629330405);
                g = iy5Var.g((i & 14) | ((i >> 3) & 112), j, aVar);
                aVar.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
            return g;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x00c1  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static long c(iy5 iy5Var, long j, androidx.compose.runtime.a aVar, int i) {
            int i2;
            float f;
            aVar.K(2006672345);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2006672345, i, -1, "com.vk.core.compose.component.image.badge.Badge.calculatePositionForAvatar (Badge.kt:32)");
            }
            float e = xcv0.e(j);
            aVar.K(-873679570);
            f870.A().getClass();
            if (pco.a(e, 36) < 0) {
                i2 = 1;
            } else {
                if (pco.a(e, 80) < 0) {
                    f = 2;
                    long a = xcv0.a(e);
                    float f2 = 0.7f * e;
                    float f3 = f * 2;
                    long b = byc0.b(uco.c(a) + f2 + f3, uco.b(a) + f2 + f3);
                    long a2 = xcv0.a(e);
                    long b2 = byc0.b((uco.c(b) - uco.c(a2)) / 2.0f, (uco.b(b) - uco.b(a2)) / 2.0f);
                    BadgeAlignment alignment = iy5Var.getAlignment();
                    float c = (alignment != BadgeAlignment.BottomLeft || alignment == BadgeAlignment.TopLeft) ? -uco.c(b2) : uco.c(b2);
                    BadgeAlignment alignment2 = iy5Var.getAlignment();
                    long floatToRawIntBits = (Float.floatToRawIntBits(c) << 32) | (Float.floatToRawIntBits((alignment2 != BadgeAlignment.TopLeft || alignment2 == BadgeAlignment.TopRight) ? -uco.b(b2) : uco.b(b2)) & 4294967295L);
                    aVar.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar.j();
                    return floatToRawIntBits;
                }
                i2 = 3;
            }
            f = i2;
            long a3 = xcv0.a(e);
            float f22 = 0.7f * e;
            float f32 = f * 2;
            long b3 = byc0.b(uco.c(a3) + f22 + f32, uco.b(a3) + f22 + f32);
            long a22 = xcv0.a(e);
            long b22 = byc0.b((uco.c(b3) - uco.c(a22)) / 2.0f, (uco.b(b3) - uco.b(a22)) / 2.0f);
            BadgeAlignment alignment3 = iy5Var.getAlignment();
            if (alignment3 != BadgeAlignment.BottomLeft) {
            }
            BadgeAlignment alignment22 = iy5Var.getAlignment();
            if (alignment22 != BadgeAlignment.TopLeft) {
            }
            long floatToRawIntBits2 = (Float.floatToRawIntBits(c) << 32) | (Float.floatToRawIntBits((alignment22 != BadgeAlignment.TopLeft || alignment22 == BadgeAlignment.TopRight) ? -uco.b(b22) : uco.b(b22)) & 4294967295L);
            aVar.j();
            if (androidx.compose.runtime.b.d()) {
            }
            aVar.j();
            return floatToRawIntBits2;
        }

        public static long d(iy5 iy5Var, long j, androidx.compose.runtime.a aVar, int i) {
            aVar.K(313263854);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(313263854, i, -1, "com.vk.core.compose.component.image.badge.Badge.calculatePositionForPicture (Badge.kt:49)");
            }
            long e = iy5Var.e(pco.a(Math.min(uco.c(j), uco.b(j)), (float) 72) < 0 ? 3 : 4, j);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
            return e;
        }

        public static void e(int i, androidx.compose.runtime.a aVar) {
            aVar.K(-729010291);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-729010291, i, -1, "com.vk.core.compose.component.image.slot.SlotContent.provideClipShape (SlotContent.kt:30)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
        }
    }

    long e(float f, long j);

    long f(int i, long j, androidx.compose.runtime.a aVar);

    long g(int i, long j, androidx.compose.runtime.a aVar);
}
