package xsna;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.avatar.impl.border.item.path.VKAvatarBorderPathBuilder;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.p9r0;
import xsna.yp5;

/* compiled from: VKAvatarBorderMapper.kt */
/* loaded from: classes15.dex */
public final class t9r0 {
    public final Object a;
    public final Object b;

    /* compiled from: VKAvatarBorderMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AvatarBorderType.values().length];
            try {
                iArr[AvatarBorderType.SQUARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public t9r0(q9r0 q9r0Var, s9r0 s9r0Var) {
        k0m0 k0m0Var = new k0m0(2);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.a = msy.a(lazyThreadSafetyMode, k0m0Var);
        this.b = msy.a(lazyThreadSafetyMode, new qc00(15));
    }

    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object, kotlin.Lazy] */
    public final r9r0 a(u9r0 u9r0Var, Context context, float f, float f2, Paint.Style style, p9r0 p9r0Var) {
        float f3;
        yp5 aVar;
        double d;
        double d2;
        int i = u9r0Var.a;
        AvatarBorderType avatarBorderType = u9r0Var.c;
        float f4 = i;
        if (p9r0Var instanceof p9r0.c) {
            aVar = new yp5.b(((p9r0.c) p9r0Var).a);
            f3 = 2.0f;
        } else if (p9r0Var instanceof p9r0.a) {
            p9r0.a aVar2 = (p9r0.a) p9r0Var;
            double d3 = (90.0f - aVar2.a) % 360.0d;
            if (d3 != ConnectivityTracker.DEFAULT_UPLINK_BITRATE && Math.signum(d3) != Math.signum(360.0d)) {
                d3 += 360.0d;
            }
            double radians = Math.toRadians(d3);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double abs = Math.abs(cos);
            double abs2 = Math.abs(sin);
            if (abs > abs2) {
                d = cos;
                f3 = 2.0f;
                d2 = f / abs;
            } else {
                d = cos;
                f3 = 2.0f;
                d2 = f / abs2;
            }
            double d4 = d2 * d;
            double d5 = d2 * sin;
            double d6 = f4 / 2;
            aVar = new yp5.a(new LinearGradient((float) ((-d4) + d6), (float) (d5 + d6), (float) (d4 + d6), (float) ((-d5) + d6), s9r0.a(aVar2.b), aVar2.c, Shader.TileMode.MIRROR));
        } else {
            f3 = 2.0f;
            if (p9r0Var instanceof p9r0.b) {
                p9r0.b bVar = (p9r0.b) p9r0Var;
                float f5 = f4 / 2.0f;
                aVar = new yp5.a(new RadialGradient(f5, f5, f, s9r0.a(bVar.a), bVar.b, Shader.TileMode.CLAMP));
            } else {
                if (!(p9r0Var instanceof p9r0.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                p9r0.d dVar = (p9r0.d) p9r0Var;
                float f6 = f4 / 2.0f;
                SweepGradient sweepGradient = new SweepGradient(f6, f6, s9r0.a(dVar.b), dVar.c);
                Matrix matrix = new Matrix();
                matrix.setRotate(dVar.a - 90.0f, f6, f6);
                sweepGradient.setLocalMatrix(matrix);
                aVar = new yp5.a(sweepGradient);
            }
        }
        float f7 = u9r0Var.a / f3;
        return new r9r0((a.$EnumSwitchMapping$0[avatarBorderType.ordinal()] == 1 ? (VKAvatarBorderPathBuilder) this.b.getValue() : (VKAvatarBorderPathBuilder) this.a.getValue()).a(f7, f7, f, VKAvatarBorderPathBuilder.PathPurpose.DRAW_BORDER), null, new zp5(f2, aVar, style), avatarBorderType);
    }
}
