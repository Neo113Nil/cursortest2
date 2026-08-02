package xsna;

import android.text.TextUtils;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.mlkit.vision.common.internal.a;
import com.vk.log.L;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes.dex */
public final class ey2 implements b9i, wal0 {
    public static final int[] b = new int[0];
    public static final long[] c = new long[0];
    public static final Object[] d = new Object[0];
    public static final /* synthetic */ ey2 e = new ey2();

    public static final int b(int i, int i2, int[] iArr) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static final int d(long[] jArr, int i, long j) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    public static final int e(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final long f() {
        return Thread.currentThread().getId();
    }

    @NonNull
    public static ApiException g(@NonNull Status status) {
        return status.d != null ? new ResolvableApiException(status) : new ApiException(status);
    }

    public static final void h(TextView textView, tlo0 tlo0Var) {
        textView.setText(tlo0Var != null ? tlo0Var.b(textView.getResources()) : null);
    }

    public static final void i(TextView textView, CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(charSequence);
        }
    }

    @Override // xsna.wal0
    public void a(Throwable th, String... strArr) {
        L.j(th, strArr);
    }

    @Override // xsna.b9i
    public Object c(lcg0 lcg0Var) {
        return new com.google.mlkit.vision.common.internal.a(lcg0Var.g(toe0.a(a.C0149a.class)));
    }
}
