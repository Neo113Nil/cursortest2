package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ComposePathEffect;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import com.vk.avatar.api.border.AvatarBorderType;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VKAvatarBorderItem.kt */
/* loaded from: classes15.dex */
public final class r9r0 {
    public final Path a;
    public final PathEffect b;
    public final zp5 c;
    public final AvatarBorderType d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public float i;
    public float j;
    public float k;

    /* compiled from: VKAvatarBorderItem.kt */
    public static final class a {
        public float a;
        public float b;

        public a() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.a, aVar.a) == 0 && Float.compare(this.b, aVar.b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CircularRotatingProgress(rotationDegrees=");
            sb.append(this.a);
            sb.append(", progress=");
            return xq.c(')', this.b, sb);
        }

        public a(int i) {
            this.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
    }

    /* compiled from: VKAvatarBorderItem.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AvatarBorderType.values().length];
            try {
                iArr[AvatarBorderType.SQUARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AvatarBorderType.CIRCLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AvatarBorderType.HEXAGON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public r9r0(Path path, PathEffect pathEffect, zp5 zp5Var, AvatarBorderType avatarBorderType) {
        this.a = path;
        this.b = pathEffect;
        this.c = zp5Var;
        this.d = avatarBorderType;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.e = msy.a(lazyThreadSafetyMode, new dac0(this, 25));
        this.f = msy.a(lazyThreadSafetyMode, new hri0(this, 11));
        this.g = msy.a(lazyThreadSafetyMode, new mll0(this, 9));
        this.h = msy.a(lazyThreadSafetyMode, new pm60(13));
        this.j = 1.0f;
        this.k = 1.0f;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    public final PathEffect a(float f) {
        PathEffect pathEffect = this.b;
        if (f >= 1.0f) {
            return pathEffect;
        }
        ?? r1 = this.h;
        float[] fArr = (float[]) r1.getValue();
        ?? r4 = this.e;
        fArr[1] = ((Number) r4.getValue()).floatValue() * (1.0f - f);
        ((float[]) r1.getValue())[2] = ((Number) r4.getValue()).floatValue() * f;
        DashPathEffect dashPathEffect = new DashPathEffect((float[]) r1.getValue(), c() ? this.i : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        return pathEffect == null ? dashPathEffect : new ComposePathEffect(dashPathEffect, pathEffect);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void b(Context context, Canvas canvas) {
        float f = this.k;
        Path path = this.a;
        if (f == 1.0f) {
            Paint c = x9.c(true);
            zp5 zp5Var = this.c;
            c.setStrokeWidth(zp5Var.a);
            c.setStyle(zp5Var.c);
            zp5Var.b.a(c);
            c.setPathEffect(a(this.j));
            canvas.drawPath(path, c);
            return;
        }
        if (f != 1.0f) {
            canvas.save();
            Matrix matrix = new Matrix();
            ?? r3 = this.g;
            matrix.setScale(f, f, ((RectF) r3.getValue()).centerX(), ((RectF) r3.getValue()).centerY());
            canvas.setMatrix(matrix);
        }
        canvas.drawPath(path, (Paint) this.f.getValue());
        if (f == 1.0f) {
            return;
        }
        canvas.restore();
    }

    public final boolean c() {
        int i = b.$EnumSwitchMapping$0[this.d.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2 || i == 3) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r9r0)) {
            return false;
        }
        r9r0 r9r0Var = (r9r0) obj;
        return epx.f(this.a, r9r0Var.a) && epx.f(this.b, r9r0Var.b) && epx.f(this.c, r9r0Var.c) && this.d == r9r0Var.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        PathEffect pathEffect = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (pathEffect == null ? 0 : pathEffect.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "VKAvatarBorderItem(path=" + this.a + ", pathEffect=" + this.b + ", stroke=" + this.c + ", borderType=" + this.d + ')';
    }
}
