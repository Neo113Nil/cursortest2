package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo;
import com.unity3d.services.UnityAdsConstants;
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;

/* compiled from: AnimatedImageCompositor.java */
/* loaded from: classes12.dex */
public final class qk2 {
    public final bj2 a;
    public final b b;
    public final Paint c;
    public final boolean d;

    /* compiled from: AnimatedImageCompositor.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.NOT_REQUIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.ABORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[c.SKIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: AnimatedImageCompositor.java */
    public interface b {
        uvf<Bitmap> a(int i);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AnimatedImageCompositor.java */
    public static final class c {
        private static final /* synthetic */ c[] $VALUES;
        public static final c ABORT;
        public static final c NOT_REQUIRED;
        public static final c REQUIRED;
        public static final c SKIP;

        static {
            c cVar = new c("REQUIRED", 0);
            REQUIRED = cVar;
            c cVar2 = new c("NOT_REQUIRED", 1);
            NOT_REQUIRED = cVar2;
            c cVar3 = new c(BatchApiRequest.FIELD_VALUE_ON_ERROR_SKIP, 2);
            SKIP = cVar3;
            c cVar4 = new c("ABORT", 3);
            ABORT = cVar4;
            $VALUES = new c[]{cVar, cVar2, cVar3, cVar4};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    public qk2(bj2 bj2Var, boolean z, b bVar) {
        this.a = bj2Var;
        this.b = bVar;
        this.d = z;
        Paint paint = new Paint();
        this.c = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final void a(Canvas canvas, AnimatedDrawableFrameInfo animatedDrawableFrameInfo) {
        canvas.drawRect(animatedDrawableFrameInfo.a, animatedDrawableFrameInfo.b, r0 + animatedDrawableFrameInfo.c, r1 + animatedDrawableFrameInfo.d, this.c);
    }

    public final boolean b(AnimatedDrawableFrameInfo animatedDrawableFrameInfo) {
        if (animatedDrawableFrameInfo.a != 0 || animatedDrawableFrameInfo.b != 0) {
            return false;
        }
        int i = animatedDrawableFrameInfo.c;
        dj2 dj2Var = (dj2) this.a;
        return i == dj2Var.d.width() && animatedDrawableFrameInfo.d == dj2Var.d.height();
    }

    public final boolean c(int i) {
        if (i == 0) {
            return true;
        }
        bj2 bj2Var = this.a;
        AnimatedDrawableFrameInfo animatedDrawableFrameInfo = ((dj2) bj2Var).g[i];
        AnimatedDrawableFrameInfo animatedDrawableFrameInfo2 = ((dj2) bj2Var).g[i - 1];
        if (animatedDrawableFrameInfo.e == AnimatedDrawableFrameInfo.BlendOperation.NO_BLEND && b(animatedDrawableFrameInfo)) {
            return true;
        }
        return animatedDrawableFrameInfo2.f == AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_BACKGROUND && b(animatedDrawableFrameInfo2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d1, code lost:
    
        r5 = r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i, Bitmap bitmap) {
        bj2 bj2Var = this.a;
        boolean z = this.d;
        if (z) {
            Canvas canvas = new Canvas(bitmap);
            dj2 dj2Var = (dj2) bj2Var;
            pk2 pk2Var = dj2Var.c;
            vk2 v = pk2Var.v(i);
            AnimatedDrawableFrameInfo y = pk2Var.y(i);
            AnimatedDrawableFrameInfo y2 = i != 0 ? pk2Var.y(i - 1) : null;
            try {
                if (v.getWidth() > 0 && v.getHeight() > 0) {
                    if (pk2Var.x()) {
                        dj2Var.h(canvas, v, y, y2);
                    } else {
                        dj2Var.g(canvas, v, y, y2);
                    }
                    v.dispose();
                    return;
                }
                return;
            } finally {
                v.dispose();
            }
        }
        Canvas canvas2 = new Canvas(bitmap);
        int i2 = 0;
        canvas2.drawColor(0, PorterDuff.Mode.SRC);
        if (!c(i)) {
            int i3 = i - 1;
            while (true) {
                if (i3 < 0) {
                    break;
                }
                dj2 dj2Var2 = (dj2) bj2Var;
                AnimatedDrawableFrameInfo animatedDrawableFrameInfo = dj2Var2.g[i3];
                AnimatedDrawableFrameInfo.DisposalMethod disposalMethod = animatedDrawableFrameInfo.f;
                int i4 = a.a[(disposalMethod == AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_DO_NOT ? c.REQUIRED : disposalMethod == AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_BACKGROUND ? b(animatedDrawableFrameInfo) ? c.NOT_REQUIRED : c.REQUIRED : disposalMethod == AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_PREVIOUS ? c.SKIP : c.ABORT).ordinal()];
                if (i4 == 1) {
                    AnimatedDrawableFrameInfo animatedDrawableFrameInfo2 = dj2Var2.g[i3];
                    uvf<Bitmap> a2 = this.b.a(i3);
                    if (a2 != null) {
                        try {
                            canvas2.drawBitmap(a2.r(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Paint) null);
                            if (animatedDrawableFrameInfo2.f == AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_BACKGROUND) {
                                a(canvas2, animatedDrawableFrameInfo2);
                            }
                            i2 = i3 + 1;
                        } finally {
                            if (!z) {
                                a2.close();
                            }
                        }
                    } else if (c(i3)) {
                        break;
                    } else {
                        i3--;
                    }
                } else if (i4 == 2) {
                    i2 = i3 + 1;
                    break;
                } else if (i4 == 3) {
                    break;
                } else {
                    i3--;
                }
            }
        } else {
            i2 = i;
        }
        while (i2 < i) {
            dj2 dj2Var3 = (dj2) bj2Var;
            AnimatedDrawableFrameInfo animatedDrawableFrameInfo3 = dj2Var3.g[i2];
            AnimatedDrawableFrameInfo.DisposalMethod disposalMethod2 = animatedDrawableFrameInfo3.f;
            if (disposalMethod2 != AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_PREVIOUS) {
                if (animatedDrawableFrameInfo3.e == AnimatedDrawableFrameInfo.BlendOperation.NO_BLEND) {
                    a(canvas2, animatedDrawableFrameInfo3);
                }
                dj2Var3.d(canvas2, i2);
                if (disposalMethod2 == AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_BACKGROUND) {
                    a(canvas2, animatedDrawableFrameInfo3);
                }
            }
            i2++;
        }
        dj2 dj2Var4 = (dj2) bj2Var;
        AnimatedDrawableFrameInfo animatedDrawableFrameInfo4 = dj2Var4.g[i];
        if (animatedDrawableFrameInfo4.e == AnimatedDrawableFrameInfo.BlendOperation.NO_BLEND) {
            a(canvas2, animatedDrawableFrameInfo4);
        }
        dj2Var4.d(canvas2, i);
        wk2 wk2Var = dj2Var4.b;
    }
}
