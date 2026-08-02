package xsna;

import android.content.res.Resources;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.log.L;
import com.vkontakte.android.R;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: EmojiTreeNew.java */
/* loaded from: classes.dex */
public final class hep {
    public final Cloneable a;

    public hep() {
        mk5 mk5Var = new mk5();
        this.a = mk5Var;
        mk5Var.g(0);
        mk5Var.e(115L);
        mk5Var.setInterpolator(new ilq());
        mk5Var.c(new vko0());
    }

    @Nullable
    public gep a(int i, int i2, @NonNull CharSequence charSequence) {
        long[] jArr;
        int i3;
        long[] jArr2 = (long[]) this.a;
        int i4 = i;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        while (i5 >= 0 && i5 < jArr2.length && i4 < i2) {
            char charAt = charSequence.charAt(i4);
            int i11 = i5 + 1;
            int i12 = (((int) jArr2[i5]) + i11) - 1;
            while (true) {
                if (i11 > i12) {
                    jArr = jArr2;
                    i3 = -(i11 + 1);
                    break;
                }
                i3 = ((i12 - i11) >>> 1) + i11;
                jArr = jArr2;
                char c = (char) (jArr2[i3] & 65535);
                if (c >= charAt) {
                    if (c <= charAt) {
                        break;
                    }
                    i12 = i3 - 1;
                } else {
                    i11 = i3 + 1;
                }
                jArr2 = jArr;
            }
            if (i3 <= 0) {
                break;
            }
            i6++;
            long j = jArr[i3];
            int i13 = (int) ((j >>> 48) & 65535);
            if (i13 == 65535) {
                i13 = -1;
            }
            int i14 = (int) ((j >>> 40) & 255);
            if (i14 == 255) {
                i14 = -1;
            }
            int i15 = (int) ((j >>> 32) & 255);
            if (i15 == 255) {
                i15 = -1;
            }
            int i16 = i13;
            int i17 = (int) ((j >>> 24) & 255);
            if (i17 == 255) {
                i17 = -1;
            }
            if (i14 != -1 && i15 != -1 && i17 != -1) {
                i7 += i6;
                i9 = i15;
                i10 = i17;
                i8 = i14;
                i6 = 0;
            }
            i4++;
            jArr2 = jArr;
            i5 = i16;
        }
        if (i8 == -1 || i9 == -1 || i10 == -1) {
            return null;
        }
        return new gep(i8, i9, i10, i7);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Cloneable, long[]] */
    public hep(Resources resources) throws IOException {
        try {
            InputStream openRawResource = resources.openRawResource(R.raw.emoji);
            try {
                byte[] bArr = new byte[4];
                openRawResource.read(bArr);
                int i = 0;
                this.a = new long[(bArr[3] & 255) | (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8)];
                byte[] bArr2 = new byte[openRawResource.available() & (-8)];
                int i2 = 0;
                while (true) {
                    int read = openRawResource.read(bArr2);
                    if (read != -1) {
                        int i3 = read / 8;
                        int i4 = i;
                        while (i4 < i3) {
                            int i5 = i4 * 8;
                            int i6 = i2;
                            ((long[]) this.a)[i2 + i4] = ((bArr2[i5 + 1] & 255) << 48) | (bArr2[i5] << 56) | ((bArr2[i5 + 2] & 255) << 40) | ((bArr2[i5 + 3] & 255) << 32) | ((bArr2[i5 + 4] & 255) << 24) | ((bArr2[i5 + 5] & 255) << 16) | ((bArr2[i5 + 6] & 255) << 8) | (bArr2[i5 + 7] & 255);
                            i4++;
                            i2 = i6;
                        }
                        i2 += i3;
                        i = 0;
                    } else {
                        openRawResource.close();
                        return;
                    }
                }
            } finally {
            }
        } catch (IOException e) {
            L.i(e);
            throw e;
        }
    }
}
