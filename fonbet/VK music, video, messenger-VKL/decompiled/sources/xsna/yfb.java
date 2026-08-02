package xsna;

import android.content.Context;
import android.content.res.TypedArray;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import com.vk.dto.common.Image;
import com.vkontakte.android.R;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import org.json.JSONArray;

/* loaded from: classes11.dex */
public class yfb {
    public static final fro0 a = new fro0(0, new long[0], new Object[0]);
    public static yfb b;

    public static final iz2 A(xy2 xy2Var) {
        iz2 iz2Var = new iz2(xy2Var, xy2Var.d(), xy2Var.b());
        iz2Var.u(xy2Var.c());
        iz2Var.j.putAll(xy2Var.getParamsMap());
        return iz2Var;
    }

    public static final void B(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        if (i < 0 || byteBuffer2.remaining() < i || byteBuffer3.remaining() < i || byteBuffer.remaining() < i) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i2 = 0; i2 < i; i2++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static final byte[] C(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i3 < 0 || bArr.length - i3 < i || bArr2.length - i3 < i2) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            bArr3[i4] = (byte) (bArr[i4 + i] ^ bArr2[i4 + i2]);
        }
        return bArr3;
    }

    public static final byte[] D(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            return C(bArr, 0, 0, bArr2, bArr.length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    public static final Bundle a() {
        return new Bundle(0);
    }

    @ozl
    public static final Bundle b(Pair... pairArr) {
        Bundle bundle = new Bundle(pairArr.length);
        for (Pair pair : pairArr) {
            String str = (String) pair.d();
            Object g = pair.g();
            if (g == null) {
                bundle.putString(str, null);
            } else if (g instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) g).booleanValue());
            } else if (g instanceof Byte) {
                bundle.putByte(str, ((Number) g).byteValue());
            } else if (g instanceof Character) {
                bundle.putChar(str, ((Character) g).charValue());
            } else if (g instanceof Double) {
                bundle.putDouble(str, ((Number) g).doubleValue());
            } else if (g instanceof Float) {
                bundle.putFloat(str, ((Number) g).floatValue());
            } else if (g instanceof Integer) {
                bundle.putInt(str, ((Number) g).intValue());
            } else if (g instanceof Long) {
                bundle.putLong(str, ((Number) g).longValue());
            } else if (g instanceof Short) {
                bundle.putShort(str, ((Number) g).shortValue());
            } else if (g instanceof Bundle) {
                bundle.putBundle(str, (Bundle) g);
            } else if (g instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) g);
            } else if (g instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) g);
            } else if (g instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) g);
            } else if (g instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) g);
            } else if (g instanceof char[]) {
                bundle.putCharArray(str, (char[]) g);
            } else if (g instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) g);
            } else if (g instanceof float[]) {
                bundle.putFloatArray(str, (float[]) g);
            } else if (g instanceof int[]) {
                bundle.putIntArray(str, (int[]) g);
            } else if (g instanceof long[]) {
                bundle.putLongArray(str, (long[]) g);
            } else if (g instanceof short[]) {
                bundle.putShortArray(str, (short[]) g);
            } else if (g instanceof Object[]) {
                Class<?> componentType = g.getClass().getComponentType();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) g);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) g);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) g);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) g);
                }
            } else if (g instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) g);
            } else if (g instanceof IBinder) {
                bundle.putBinder(str, (IBinder) g);
            } else if (g instanceof Size) {
                bundle.putSize(str, (Size) g);
            } else {
                if (!(g instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + g.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                bundle.putSizeF(str, (SizeF) g);
            }
        }
        return bundle;
    }

    public static final void c(b9f0 b9f0Var, Throwable th) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            cancellationException = fsk.j("Channel was consumed, consumer had failed", th);
        }
        b9f0Var.b(cancellationException);
    }

    public static final void d(AutoCloseable autoCloseable, Throwable th) {
        boolean isTerminated;
        if (autoCloseable != null) {
            if (th != null) {
                try {
                    ryt0.a(autoCloseable);
                    return;
                } catch (Throwable th2) {
                    mnh0.d(th, th2);
                    return;
                }
            }
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
                return;
            }
            if (!(autoCloseable instanceof ExecutorService)) {
                if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                    return;
                } else {
                    if (!(autoCloseable instanceof MediaMetadataRetriever)) {
                        throw new IllegalArgumentException();
                    }
                    ((MediaMetadataRetriever) autoCloseable).release();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) autoCloseable;
            if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static byte[] e(byte[]... bArr) throws GeneralSecurityException {
        int i = 0;
        for (byte[] bArr2 : bArr) {
            if (i > Integer.MAX_VALUE - bArr2.length) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            i += bArr2.length;
        }
        byte[] bArr3 = new byte[i];
        int i2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, i2, bArr4.length);
            i2 += bArr4.length;
        }
        return bArr3;
    }

    public static final boolean f(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            i |= bArr[i2] ^ bArr2[i2];
        }
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Image g(String str) {
        String str2 = null;
        Object[] objArr = 0;
        if (str == null || drm0.N(str)) {
            return null;
        }
        return new Image(new JSONArray(str), str2, 2, objArr == true ? 1 : 0);
    }

    public static final dz2 x(xy2 xy2Var) {
        dz2 dz2Var = new dz2(xy2Var, xy2Var.d(), xy2Var.b());
        dz2Var.i = xy2Var.c();
        dz2Var.j.putAll(xy2Var.getParamsMap());
        return dz2Var;
    }

    public static final fz2 y(xy2 xy2Var, izs izsVar) {
        fz2 fz2Var = new fz2(xy2Var, izsVar, xy2Var.d(), xy2Var.b());
        fz2Var.i = xy2Var.c();
        fz2Var.j.putAll(xy2Var.getParamsMap());
        return fz2Var;
    }

    @ozl
    public static final hz2 z(xy2 xy2Var, izs izsVar) {
        hz2 hz2Var = new hz2(xy2Var.d(), xy2Var.b(), izsVar);
        hz2Var.i = xy2Var.c();
        hz2Var.j.putAll(xy2Var.getParamsMap());
        return hz2Var;
    }

    public int h(Context context) {
        return krv0.m(R.attr.vk_ui_icon_accent, context);
    }

    public Integer i() {
        return Integer.valueOf(R.drawable.vk_widgets_outline_button_bg);
    }

    public int j(Context context) {
        return krv0.m(R.attr.vk_ui_background_accent_themed, context);
    }

    public int k(Context context) {
        return krv0.m(R.attr.vk_ui_accent_blue, context);
    }

    public int l(Context context) {
        return krv0.m(R.attr.vk_ui_accent_gray, context);
    }

    public int m(Context context) {
        return krv0.m(R.attr.vk_ui_accent_green, context);
    }

    public int n(Context context) {
        return krv0.m(R.attr.vk_ui_accent_orange, context);
    }

    public int o(Context context) {
        return krv0.m(R.attr.vk_ui_accent_red, context);
    }

    public int p(Context context) {
        return krv0.m(R.attr.vk_ui_accent_violet, context);
    }

    public int q(Context context) {
        return krv0.m(R.attr.vk_ui_icon_tertiary, context);
    }

    public Integer r(Context context) {
        return Integer.valueOf(krv0.m(R.attr.vk_ui_separator_primary_alpha, context));
    }

    public int s(Context context) {
        return krv0.m(R.attr.vk_ui_text_primary, context);
    }

    public int t(Context context) {
        return krv0.m(R.attr.vk_ui_text_secondary, context);
    }

    public Integer u() {
        return Integer.valueOf(R.drawable.vk_superapp_widgets_background);
    }

    public int v(Context context) {
        return krv0.m(R.attr.vk_ui_background_content, context);
    }

    public int w(Context context) {
        return krv0.m(R.attr.vk_ui_text_secondary, context);
    }
}
