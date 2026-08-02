package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.airbnb.lottie.parser.moshi.JsonReader$Token;
import com.airbnb.lottie.parser.moshi.a;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.payment.sdk.ui.view.card.CvnInputViewImpl;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import ru.CryptoPro.JCSP.JCSP;

/* loaded from: classes10.dex */
public final class dn60 implements ow01, bwy0, m131, mvo, sm60, do71, dan, pjb1 {
    public static final float[] c = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f, 1.0E11f, 1.0E12f, 1.0E13f, 1.0E14f, 1.0E15f, 1.0E16f, 1.0E17f, 1.0E18f, 1.0E19f, 1.0E20f, 1.0E21f, 1.0E22f, 1.0E23f, 1.0E24f, 1.0E25f, 1.0E26f, 1.0E27f, 1.0E28f, 1.0E29f, 1.0E30f, 1.0E31f, 1.0E32f, 1.0E33f, 1.0E34f, 1.0E35f, 1.0E36f, 1.0E37f, 1.0E38f};
    public static final float[] w = {1.0f, 0.1f, 0.01f, 0.001f, 1.0E-4f, 1.0E-5f, 1.0E-6f, 1.0E-7f, 1.0E-8f, 1.0E-9f, 1.0E-10f, 1.0E-11f, 1.0E-12f, 1.0E-13f, 1.0E-14f, 1.0E-15f, 1.0E-16f, 1.0E-17f, 1.0E-18f, 1.0E-19f, 1.0E-20f, 1.0E-21f, 1.0E-22f, 1.0E-23f, 1.0E-24f, 1.0E-25f, 1.0E-26f, 1.0E-27f, 1.0E-28f, 1.0E-29f, 1.0E-30f, 1.0E-31f, 1.0E-32f, 1.0E-33f, 1.0E-34f, 1.0E-35f, 1.0E-36f, 1.0E-37f, 1.0E-38f};
    public final /* synthetic */ int a;
    public int b;

    public dn60(int i) {
        this.a = i;
        switch (i) {
            case 3:
                this.b = t0i0.GoPlatform_Theme_Payments_Custom;
                break;
        }
    }

    @Override // defpackage.ow01
    public Bitmap A(Bitmap bitmap) {
        int i = this.b;
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        paint.setColor(-1);
        paint.setAlpha(255);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.preScale(i / bitmap.getWidth(), i / bitmap.getHeight());
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(i / 2.0f, i / 2.0f, i / 2.0f, paint);
        bitmap.recycle();
        return createBitmap;
    }

    public CvnInputViewImpl B(Context context) {
        return new CvnInputViewImpl(new ContextThemeWrapper(context, this.b), null, 0, 6, null);
    }

    public int C() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x008a A[EDGE_INSN: B:117:0x008a->B:47:0x008a BREAK  A[LOOP:0: B:10:0x0034->B:17:0x0083], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float D(int i, int i2, String str) {
        boolean z;
        int i3;
        int i4;
        boolean z2;
        int i5;
        int i6;
        int i7;
        float f;
        char charAt;
        int i8;
        boolean z3;
        boolean z4;
        char charAt2;
        this.b = i;
        if (i >= i2) {
            return Float.NaN;
        }
        char charAt3 = str.charAt(i);
        if (charAt3 == '+') {
            z = false;
        } else {
            if (charAt3 != '-') {
                z = false;
                int i9 = this.b;
                long j = 0;
                i3 = 0;
                i4 = 0;
                int i10 = 0;
                z2 = false;
                int i11 = 0;
                while (true) {
                    i5 = this.b;
                    if (i5 >= i2) {
                        break;
                    }
                    char charAt4 = str.charAt(i5);
                    if (charAt4 == '0') {
                        if (i3 == 0) {
                            i10++;
                        } else {
                            i4++;
                        }
                    } else if (charAt4 >= '1' && charAt4 <= '9') {
                        int i12 = i3 + i4;
                        while (i4 > 0) {
                            if (j > 922337203685477580L) {
                                return Float.NaN;
                            }
                            j *= 10;
                            i4--;
                        }
                        if (j > 922337203685477580L) {
                            return Float.NaN;
                        }
                        j = (j * 10) + (charAt4 - '0');
                        i3 = i12 + 1;
                        if (j < 0) {
                            return Float.NaN;
                        }
                    } else {
                        if (charAt4 != '.' || z2) {
                            break;
                        }
                        i11 = this.b - i9;
                        z2 = true;
                    }
                    this.b++;
                }
                if (!z2 && this.b == i11 + 1) {
                    return Float.NaN;
                }
                if (i3 == 0) {
                    if (i10 == 0) {
                        return Float.NaN;
                    }
                    i3 = 1;
                }
                if (z2) {
                    i4 = (i11 - i10) - i3;
                }
                i6 = this.b;
                if (i6 < i2 && ((charAt = str.charAt(i6)) == 'E' || charAt == 'e')) {
                    i8 = this.b + 1;
                    this.b = i8;
                    if (i8 != i2) {
                        return Float.NaN;
                    }
                    char charAt5 = str.charAt(i8);
                    if (charAt5 == '+') {
                        z3 = false;
                    } else if (charAt5 != '-') {
                        switch (charAt5) {
                            case '0':
                            case '1':
                            case '2':
                            case SAFETY_TIPS_VALUE:
                            case '4':
                            case '5':
                            case '6':
                            case SODA_DE_DE_VALUE:
                            case '8':
                            case SODA_ES_ES_VALUE:
                                z3 = false;
                                z4 = false;
                                break;
                            default:
                                this.b--;
                                z4 = true;
                                z3 = false;
                                break;
                        }
                        if (!z4) {
                            int i13 = this.b;
                            int i14 = 0;
                            while (true) {
                                int i15 = this.b;
                                if (i15 < i2 && (charAt2 = str.charAt(i15)) >= '0' && charAt2 <= '9') {
                                    if (i14 > 922337203685477580L) {
                                        return Float.NaN;
                                    }
                                    i14 = (i14 * 10) + (charAt2 - '0');
                                    this.b++;
                                }
                            }
                            if (this.b == i13) {
                                return Float.NaN;
                            }
                            i4 = z3 ? i4 - i14 : i4 + i14;
                        }
                    } else {
                        z3 = true;
                    }
                    this.b++;
                    z4 = false;
                    if (!z4) {
                    }
                }
                i7 = i3 + i4;
                if (i7 <= 39 || i7 < -44) {
                    return Float.NaN;
                }
                float f2 = j;
                if (j != 0) {
                    if (i4 > 0) {
                        f = c[i4];
                    } else if (i4 < 0) {
                        if (i4 < -38) {
                            f2 = (float) (f2 * 1.0E-20d);
                            i4 += 20;
                        }
                        f = w[-i4];
                    }
                    f2 *= f;
                }
                return z ? -f2 : f2;
            }
            z = true;
        }
        this.b++;
        int i92 = this.b;
        long j2 = 0;
        i3 = 0;
        i4 = 0;
        int i102 = 0;
        z2 = false;
        int i112 = 0;
        while (true) {
            i5 = this.b;
            if (i5 >= i2) {
            }
            this.b++;
        }
        if (!z2) {
        }
        if (i3 == 0) {
        }
        if (z2) {
        }
        i6 = this.b;
        if (i6 < i2) {
            i8 = this.b + 1;
            this.b = i8;
            if (i8 != i2) {
            }
        }
        i7 = i3 + i4;
        if (i7 <= 39) {
        }
        return Float.NaN;
    }

    @Override // defpackage.do71
    public TextView a(View view) {
        View findViewWithTag = view.findViewWithTag("body_" + this.b);
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // defpackage.do71
    public CheckBox b(View view) {
        View findViewWithTag = view.findViewWithTag("mute_button_" + this.b);
        if (findViewWithTag instanceof CheckBox) {
            return (CheckBox) findViewWithTag;
        }
        return null;
    }

    @Override // defpackage.do71
    public TextView c(View view) {
        View findViewWithTag = view.findViewWithTag("price_" + this.b);
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // defpackage.mvo
    public b231 d(Map map) {
        return (b231) new w40(new o6w(this.b)).a;
    }

    @Override // defpackage.do71
    public CustomizableMediaView e(View view) {
        View findViewWithTag = view.findViewWithTag("media_" + this.b);
        if (findViewWithTag instanceof CustomizableMediaView) {
            return (CustomizableMediaView) findViewWithTag;
        }
        return null;
    }

    @Override // defpackage.do71
    public TextView f(View view) {
        View findViewWithTag = view.findViewWithTag("warning_" + this.b);
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // defpackage.do71
    public TextView g(View view) {
        View findViewWithTag = view.findViewWithTag("call_to_action_" + this.b);
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // defpackage.do71
    public TextView h(View view) {
        View findViewWithTag = view.findViewWithTag("age_" + this.b);
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // defpackage.dan
    public int i(Context context, String str) {
        return this.b;
    }

    @Override // defpackage.do71
    public ImageView j(View view) {
        View findViewWithTag = view.findViewWithTag("favicon_" + this.b);
        if (findViewWithTag instanceof ImageView) {
            return (ImageView) findViewWithTag;
        }
        return null;
    }

    @Override // defpackage.do71
    public View k(View view, String str) {
        View findViewWithTag = view.findViewWithTag(str + "_" + this.b);
        if (findViewWithTag != null) {
            return findViewWithTag;
        }
        return null;
    }

    @Override // defpackage.bwy0
    public int l() {
        switch (this.a) {
            case 3:
                break;
            case 9:
                break;
        }
        return this.b;
    }

    @Override // defpackage.do71
    public TextView m(View view) {
        View findViewWithTag = view.findViewWithTag("title_" + this.b);
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // defpackage.do71
    public View n(View view) {
        View findViewWithTag = view.findViewWithTag("rating_" + this.b);
        if (findViewWithTag != null) {
            return findViewWithTag;
        }
        return null;
    }

    @Override // defpackage.do71
    public ImageView o(View view) {
        View findViewWithTag = view.findViewWithTag("feedback_" + this.b);
        if (findViewWithTag instanceof ImageView) {
            return (ImageView) findViewWithTag;
        }
        return null;
    }

    @Override // defpackage.do71
    public ProgressBar p(View view) {
        return (ProgressBar) view.findViewWithTag("video_progress_" + this.b);
    }

    @Override // defpackage.sm60
    public String q() {
        switch (this.a) {
            case 7:
                return oyr.m(this.b, " digits", new StringBuilder("expected at least "));
            default:
                return oyr.m(this.b, " digits", new StringBuilder("expected at most "));
        }
    }

    @Override // defpackage.do71
    public TextView r(View view) {
        View findViewWithTag = view.findViewWithTag("domain_" + this.b);
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // defpackage.pjb1
    public mvt0 s(mvt0 mvt0Var) {
        int i = this.b;
        if (mvt0Var == null) {
            return null;
        }
        return mvt0.b(mvt0Var.g(), 6, i, mvt0Var.a(), mvt0Var.i(), mvt0Var.e(), mvt0Var.d());
    }

    @Override // defpackage.do71
    public ImageView t(View view) {
        View findViewWithTag = view.findViewWithTag("icon_" + this.b);
        if (findViewWithTag instanceof ImageView) {
            return (ImageView) findViewWithTag;
        }
        return null;
    }

    @Override // defpackage.do71
    public TextView u(View view) {
        View findViewWithTag = view.findViewWithTag("sponsored_" + this.b);
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // defpackage.dan
    public int v(Context context, String str, boolean z) {
        return 0;
    }

    @Override // defpackage.do71
    public TextView w(View view) {
        View findViewWithTag = view.findViewWithTag("review_count_" + this.b);
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // defpackage.m131
    public Object x(a aVar, float f) {
        int i;
        int i2;
        int argb;
        float f2;
        ArrayList arrayList = new ArrayList();
        int i3 = 1;
        int i4 = 0;
        boolean z = aVar.k() == JsonReader$Token.BEGIN_ARRAY;
        if (z) {
            aVar.a();
        }
        while (aVar.hasNext()) {
            arrayList.add(Float.valueOf((float) aVar.nextDouble()));
        }
        int i5 = 2;
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.b = 2;
        }
        if (z) {
            aVar.d();
        }
        if (this.b == -1) {
            this.b = arrayList.size() / 4;
        }
        int i6 = this.b;
        float[] fArr = new float[i6];
        int[] iArr = new int[i6];
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i = this.b * 4;
            if (i7 >= i) {
                break;
            }
            int i10 = i7 / 4;
            double floatValue = ((Float) arrayList.get(i7)).floatValue();
            int i11 = i4;
            int i12 = i7 % 4;
            if (i12 == 0) {
                if (i10 > 0) {
                    float f3 = (float) floatValue;
                    if (fArr[i10 - 1] >= f3) {
                        fArr[i10] = f3 + 0.01f;
                    }
                }
                fArr[i10] = (float) floatValue;
            } else if (i12 == i3) {
                i8 = (int) (floatValue * 255.0d);
            } else if (i12 == 2) {
                i9 = (int) (floatValue * 255.0d);
            } else if (i12 == 3) {
                iArr[i10] = Color.argb(255, i8, i9, (int) (floatValue * 255.0d));
            }
            i7++;
            i4 = i11;
            i3 = 1;
        }
        int i13 = i4;
        ext extVar = new ext(iArr, fArr);
        if (arrayList.size() <= i) {
            return extVar;
        }
        int size = (arrayList.size() - i) / 2;
        float[] fArr2 = new float[size];
        float[] fArr3 = new float[size];
        int i14 = i13;
        while (i < arrayList.size()) {
            if (i % 2 == 0) {
                fArr2[i14] = ((Float) arrayList.get(i)).floatValue();
            } else {
                fArr3[i14] = ((Float) arrayList.get(i)).floatValue();
                i14++;
            }
            i++;
        }
        float[] fArr4 = extVar.a;
        if (fArr4.length == 0) {
            fArr4 = fArr2;
        } else if (size != 0) {
            int length = fArr4.length + size;
            float[] fArr5 = new float[length];
            int i15 = i13;
            int i16 = i15;
            int i17 = i16;
            int i18 = i17;
            while (i15 < length) {
                float f4 = i17 < fArr4.length ? fArr4[i17] : Float.NaN;
                float f5 = i18 < size ? fArr2[i18] : Float.NaN;
                if (Float.isNaN(f5) || f4 < f5) {
                    fArr5[i15] = f4;
                    i17++;
                } else if (Float.isNaN(f4) || f5 < f4) {
                    fArr5[i15] = f5;
                    i18++;
                } else {
                    fArr5[i15] = f4;
                    i17++;
                    i18++;
                    i16++;
                }
                i15++;
            }
            fArr4 = i16 == 0 ? fArr5 : Arrays.copyOf(fArr5, length - i16);
        }
        int length2 = fArr4.length;
        int[] iArr2 = new int[length2];
        int i19 = i13;
        while (i19 < length2) {
            float f6 = fArr4[i19];
            int binarySearch = Arrays.binarySearch(fArr, f6);
            int binarySearch2 = Arrays.binarySearch(fArr2, f6);
            if (binarySearch < 0 || binarySearch2 > 0) {
                if (binarySearch2 < 0) {
                    binarySearch2 = -(binarySearch2 + 1);
                }
                float f7 = fArr3[binarySearch2];
                if (i6 >= i5 && f6 != fArr[i13]) {
                    for (int i20 = 1; i20 < i6; i20++) {
                        float f8 = fArr[i20];
                        if (f8 >= f6 || i20 == i6 - 1) {
                            if (i20 != i6 - 1 || f6 < f8) {
                                int i21 = i20 - 1;
                                float f9 = fArr[i21];
                                int c2 = xss.c((f6 - f9) / (f8 - f9), iArr[i21], iArr[i20]);
                                i2 = Color.argb((int) (f7 * 255.0f), Color.red(c2), Color.green(c2), Color.blue(c2));
                            } else {
                                i2 = Color.argb((int) (f7 * 255.0f), Color.red(iArr[i20]), Color.green(iArr[i20]), Color.blue(iArr[i20]));
                            }
                        }
                    }
                    ny61.g("Unreachable code.");
                    return null;
                }
                i2 = iArr[i13];
                iArr2[i19] = i2;
            } else {
                int i22 = iArr[binarySearch];
                if (size >= i5 && f6 > fArr2[i13]) {
                    for (int i23 = 1; i23 < size; i23++) {
                        float f10 = fArr2[i23];
                        if (f10 >= f6 || i23 == size - 1) {
                            if (f10 <= f6) {
                                f2 = fArr3[i23];
                            } else {
                                int i24 = i23 - 1;
                                float f11 = fArr2[i24];
                                f2 = ti20.f(fArr3[i24], fArr3[i23], (f6 - f11) / (f10 - f11));
                            }
                            argb = Color.argb((int) (f2 * 255.0f), Color.red(i22), Color.green(i22), Color.blue(i22));
                        }
                    }
                    ny61.g("Unreachable code.");
                    return null;
                }
                argb = Color.argb((int) (fArr3[i13] * 255.0f), Color.red(i22), Color.green(i22), Color.blue(i22));
                iArr2[i19] = argb;
            }
            i19++;
            i5 = 2;
        }
        return new ext(iArr2, fArr4);
    }

    public byte[] y(byte[] bArr, byte[] bArr2, byte[] bArr3, PublicKey publicKey) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr2.length + bArr3.length);
            try {
                byteArrayOutputStream.write(bArr2);
                byteArrayOutputStream.write(bArr3);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                cipher.init(1, publicKey);
                byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
                try {
                    byteArrayOutputStream.write(ByteBuffer.allocate(4).putInt(this.b).array());
                    byteArrayOutputStream.write(cipher.doFinal(byteArray));
                    SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, JCSP.AES_NAME);
                    Cipher cipher2 = Cipher.getInstance(AESEncrypter.DEFAULT_ALGORITHM);
                    cipher2.init(1, secretKeySpec, new IvParameterSpec(bArr3));
                    byteArrayOutputStream.write(cipher2.doFinal(bArr));
                    byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray2;
                } finally {
                }
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // defpackage.ow01
    public String z() {
        return oyr.i(this.b, "CircleTransformation ");
    }

    public /* synthetic */ dn60(int i, int i2, byte b) {
        this.a = i2;
        this.b = i;
    }

    public dn60(int i, int i2) {
        this.a = 12;
        this.b = i2;
    }

    public dn60(Context context, o3x0 o3x0Var) {
        int i;
        this.a = 14;
        if (vng.y(context)) {
            i = o3x0Var.b;
        } else {
            i = o3x0Var.a;
        }
        this.b = i;
    }

    public dn60(b3a0 b3a0Var) {
        int i;
        this.a = 9;
        if (b3a0Var.a) {
            i = q0i0.PaymentSdkTheme_Dark;
        } else {
            i = q0i0.PaymentSdkTheme_Light;
        }
        this.b = i;
    }
}
