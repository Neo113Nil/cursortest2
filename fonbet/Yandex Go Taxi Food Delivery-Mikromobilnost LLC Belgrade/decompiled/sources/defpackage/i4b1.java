package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import com.google.mlkit.common.MlKitException;
import com.ybsdk.core.common.domain.entities.BalanceEntity;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.network.dto.BalanceResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import kotlin.Result;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class i4b1 {
    public static ByteBuffer a(xzv xzvVar) {
        int i = xzvVar.g;
        int i2 = 0;
        if (i != -1) {
            if (i == 17) {
                ByteBuffer byteBuffer = xzvVar.b;
                cvw.l(byteBuffer);
                return byteBuffer;
            }
            if (i == 35) {
                Image.Plane[] a = xzvVar.a();
                cvw.l(a);
                return f(a, xzvVar.d, xzvVar.e);
            }
            if (i != 842094169) {
                throw new MlKitException("Unsupported image format", 13);
            }
            ByteBuffer byteBuffer2 = xzvVar.b;
            cvw.l(byteBuffer2);
            return g(byteBuffer2, false);
        }
        Bitmap bitmap = xzvVar.a;
        cvw.l(bitmap);
        if (bitmap.getConfig() == Bitmap.Config.HARDWARE) {
            bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, bitmap.isMutable());
        }
        Bitmap bitmap2 = bitmap;
        int width = bitmap2.getWidth();
        int height = bitmap2.getHeight();
        int i3 = width * height;
        int[] iArr = new int[i3];
        bitmap2.getPixels(iArr, 0, width, 0, 0, width, height);
        int ceil = (int) Math.ceil(height / 2.0d);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((ceil + ceil) * ((int) Math.ceil(width / 2.0d))) + i3);
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < height) {
            int i7 = i2;
            while (i7 < width) {
                int i8 = iArr[i6];
                int i9 = i8 >> 16;
                int i10 = i8 >> 8;
                int i11 = i8 & 255;
                int i12 = i5 + 1;
                int i13 = i9 & 255;
                int i14 = i10 & 255;
                allocateDirect.put(i5, (byte) Math.min(255, (b64.b(i11, 25, (i14 * HProv.PP_SECURITY_LEVEL) + (i13 * 66), 128) >> 8) + 16));
                if (i4 % 2 == 0 && i6 % 2 == 0) {
                    int i15 = ((((i13 * 112) - (i14 * 94)) - (i11 * 18)) + 128) >> 8;
                    int i16 = (((((i13 * (-38)) - (i14 * 74)) + (i11 * 112)) + 128) >> 8) + 128;
                    int i17 = i3 + 1;
                    allocateDirect.put(i3, (byte) Math.min(255, i15 + 128));
                    i3 += 2;
                    allocateDirect.put(i17, (byte) Math.min(255, i16));
                }
                i6++;
                i7++;
                i5 = i12;
            }
            i4++;
            i2 = 0;
        }
        return allocateDirect;
    }

    public static final cho0 b(rqr0 rqr0Var, sqr0 sqr0Var) {
        bho0 bho0Var;
        CharSequence charSequence;
        oqr0 oqr0Var;
        CharSequence charSequence2 = null;
        if (sqr0Var != null) {
            qqr0 qqr0Var = sqr0Var.e;
            pqr0 pqr0Var = qqr0Var != null ? qqr0Var.b : null;
            if (pqr0Var == null) {
                pqr0Var = null;
            }
            bho0Var = new bho0(sqr0Var.a, sqr0Var.b, qqr0Var != null ? qqr0Var.a : null, sqr0Var.c, sqr0Var.d, pqr0Var != null ? pqr0Var.a : null);
        } else {
            bho0Var = null;
        }
        if (rqr0Var == null || (charSequence = rqr0Var.a) == null) {
            charSequence = "";
        }
        CharSequence charSequence3 = charSequence;
        CharSequence charSequence4 = rqr0Var != null ? rqr0Var.b : null;
        String str = rqr0Var != null ? rqr0Var.c : null;
        if (rqr0Var != null && (oqr0Var = rqr0Var.d) != null) {
            charSequence2 = oqr0Var.a;
        }
        return new cho0(charSequence3, charSequence4, str, charSequence2, bho0Var);
    }

    public static Bitmap c(ByteBuffer byteBuffer, int i, int i2, int i3) {
        byte[] bArr;
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            bArr = byteBuffer.array();
        } else {
            byteBuffer.rewind();
            int limit = byteBuffer.limit();
            byte[] bArr2 = new byte[limit];
            byteBuffer.get(bArr2, 0, limit);
            bArr = bArr2;
        }
        byte[] i4 = i(i, i2, bArr);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(i4, 0, i4.length);
        return h(decodeByteArray, i3, decodeByteArray.getWidth(), decodeByteArray.getHeight());
    }

    public static final Object d(BalanceResponse balanceResponse, Context context, w530 w530Var) {
        if (balanceResponse.getMoney() == null || balanceResponse.getPlus() == null || balanceResponse.getCashback() == null) {
            i5z0.a.d("failed to get balance response", new Object[0]);
            return new Result.Failure(new Exception("get_balance error"));
        }
        String formattedBalance = balanceResponse.getMoney().getFormattedBalance(w530Var);
        BigDecimal amount = balanceResponse.getPlus().getAmount();
        String p = g8e.p(w530.a(w530Var, amount, null, false, null, false, 62), " ", context.getResources().getQuantityString(gwh0.ybsdk_dashboard_plus_points, balanceResponse.getPlus().getAmount().intValue(), w530.a(w530Var, amount, null, false, null, false, 62)));
        return new BalanceEntity(new MoneyEntity(balanceResponse.getMoney().getAmount(), balanceResponse.getMoney().getCurrency(), formattedBalance), new MoneyEntity(balanceResponse.getPlus().getAmount(), balanceResponse.getPlus().getCurrency(), p), new MoneyEntity(balanceResponse.getCashback().getAmount(), balanceResponse.getCashback().getCurrency(), p));
    }

    public static final eho0 e(srr0 srr0Var) {
        if (srr0Var instanceof prr0) {
            prr0 prr0Var = (prr0) srr0Var;
            CharSequence charSequence = prr0Var.a;
            if (charSequence != null) {
                CharSequence charSequence2 = prr0Var.b;
                String str = prr0Var.c;
                oqr0 oqr0Var = prr0Var.d;
                return new aho0(charSequence, charSequence2, oqr0Var != null ? oqr0Var.a : null, str);
            }
        } else {
            if (!(srr0Var instanceof rrr0)) {
                if (srr0Var instanceof qrr0) {
                    qrr0 qrr0Var = (qrr0) srr0Var;
                    return b(qrr0Var.a, qrr0Var.b);
                }
                w511.b();
                return null;
            }
            rrr0 rrr0Var = (rrr0) srr0Var;
            CharSequence charSequence3 = rrr0Var.a;
            if (charSequence3 != null) {
                return new dho0(charSequence3, rrr0Var.b, null, rrr0Var.e, rrr0Var.d);
            }
        }
        return null;
    }

    public static ByteBuffer f(Image.Plane[] planeArr, int i, int i2) {
        int i3 = i * i2;
        int i4 = i3 / 4;
        byte[] bArr = new byte[i4 + i4 + i3];
        ByteBuffer buffer = planeArr[1].getBuffer();
        ByteBuffer buffer2 = planeArr[2].getBuffer();
        int position = buffer2.position();
        int limit = buffer.limit();
        buffer2.position(position + 1);
        buffer.limit(limit - 1);
        int i5 = (i3 + i3) / 4;
        boolean z = buffer2.remaining() == i5 + (-2) && buffer2.compareTo(buffer) == 0;
        buffer2.position(position);
        buffer.limit(limit);
        if (z) {
            planeArr[0].getBuffer().get(bArr, 0, i3);
            ByteBuffer buffer3 = planeArr[1].getBuffer();
            planeArr[2].getBuffer().get(bArr, i3, 1);
            buffer3.get(bArr, i3 + 1, i5 - 1);
        } else {
            j(planeArr[0], i, i2, bArr, 0, 1);
            j(planeArr[1], i, i2, bArr, i3 + 1, 2);
            j(planeArr[2], i, i2, bArr, i3, 2);
        }
        return ByteBuffer.wrap(bArr);
    }

    public static ByteBuffer g(ByteBuffer byteBuffer, boolean z) {
        int i;
        byteBuffer.rewind();
        int limit = byteBuffer.limit();
        int i2 = limit / 6;
        ByteBuffer allocate = z ? ByteBuffer.allocate(limit) : ByteBuffer.allocateDirect(limit);
        int i3 = 0;
        while (true) {
            i = i2 * 4;
            if (i3 >= i) {
                break;
            }
            allocate.put(i3, byteBuffer.get(i3));
            i3++;
        }
        for (int i4 = 0; i4 < i2 + i2; i4++) {
            allocate.put(i + i4, byteBuffer.get((i4 / 2) + ((i4 % 2) * i2) + i));
        }
        return allocate;
    }

    public static Bitmap h(Bitmap bitmap, int i, int i2, int i3) {
        if (i == 0) {
            return Bitmap.createBitmap(bitmap, 0, 0, i2, i3);
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        return Bitmap.createBitmap(bitmap, 0, 0, i2, i3, matrix, true);
    }

    public static byte[] i(int i, int i2, byte[] bArr) {
        YuvImage yuvImage = new YuvImage(bArr, 17, i, i2, null);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                yuvImage.compressToJpeg(new Rect(0, 0, i, i2), 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (IOException e) {
            throw new MlKitException(13, e, "Image conversion error from NV21 format");
        }
    }

    public static final void j(Image.Plane plane, int i, int i2, byte[] bArr, int i3, int i4) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int rowStride = ((plane.getRowStride() + buffer.limit()) - 1) / plane.getRowStride();
        if (rowStride == 0) {
            return;
        }
        int i5 = i / (i2 / rowStride);
        int i6 = 0;
        for (int i7 = 0; i7 < rowStride; i7++) {
            int i8 = i6;
            for (int i9 = 0; i9 < i5; i9++) {
                bArr[i3] = buffer.get(i8);
                i3 += i4;
                i8 += plane.getPixelStride();
            }
            i6 += plane.getRowStride();
        }
    }
}
