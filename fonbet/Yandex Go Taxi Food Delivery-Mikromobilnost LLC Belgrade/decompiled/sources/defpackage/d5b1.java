package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Point;
import android.net.Uri;
import android.util.Pair;
import androidx.compose.animation.g;
import androidx.compose.animation.k;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.exifinterface.media.a;
import com.google.ar.core.ImageMetadata;
import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import com.yandex.images.utils.ScaleMode;
import defpackage.qip0;
import defpackage.zy11;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.scroll.Anchor;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes11.dex */
public abstract class d5b1 {
    public static final void a(qip0 qip0Var, Anchor anchor, f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(541655777);
        int i2 = (btsVar.k(qip0Var) ? 4 : 2) | i | (btsVar.k(f530Var) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new uyo0(8, anchor);
                btsVar.o0(Q);
            }
            tls tlsVar = (tls) Q;
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = new ani0();
                btsVar.o0(Q2);
            }
            ani0 ani0Var = (ani0) Q2;
            ani0Var.a = qip0Var == null ? (qip0) ani0Var.a : qip0Var;
            Object Q3 = btsVar.Q();
            if (Q3 == o430Var) {
                Q3 = new teb(20);
                btsVar.o0(Q3);
            }
            g.e(qip0Var != null, fnq0.a(f530Var, (tls) Q3), k.q(1, tlsVar, null), k.v(1, tlsVar, null), null, wwg.S(-666599495, true, new y740(24, ani0Var, anchor), btsVar), btsVar, ImageMetadata.EDGE_MODE, 16);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new qeg0(qip0Var, anchor, f530Var, i, 21);
        }
    }

    public static final void b(String str, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(819404893);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.k(str) ? 4 : 2);
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            byk0 d = ((YandexShapes) btsVar.m(qm51.a)).d();
            c530 c530Var = c530.a;
            f530 d2 = ooc.d(an91.n(m4m0.b(ymb1.l(c530Var, d), ((el51) btsVar.m(gl51.a)).h(), qke.q), 9.0f, 9.0f, 12.0f, 9.0f), null, 3);
            z910 d3 = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d4 = b.d(btsVar, d2);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, d3);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            wls wlsVar3 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar3);
            }
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d4);
            lhl0 a = khl0.a(lr20.a, x4c.D, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d5 = b.d(btsVar, c530Var);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a);
            qje.W(btsVar, wlsVar2, o2);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar, hashCode2, wlsVar3);
            }
            qje.W(btsVar, wlsVar4, d5);
            s3b1.f(new cuj0(pzg0.scroll_tag_warning, null, null, null, 30), null, null, btsVar, 0, 6);
            ymb1.f(str, null, ldc.f, null, null, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar, (i2 & 14) | 384, 0, 65530);
            btsVar = btsVar;
            btsVar.t(true);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new qpm0(str, i, 3);
        }
    }

    public static final void c(final qip0 qip0Var, Anchor anchor, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1336078114);
        int i2 = 4;
        int i3 = (btsVar.k(qip0Var) ? 4 : 2) | i | (btsVar.c(anchor.ordinal()) ? 32 : 16);
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = ly3.i(btsVar);
            }
            zx40 zx40Var = (zx40) Q;
            boolean z = (i3 & 14) == 4;
            Object Q2 = btsVar.Q();
            if (z || Q2 == o430Var) {
                Q2 = new sls() { // from class: ru.yandex.logistics.sdk.cargo_form.impl.ui.scroll.a
                    @Override // defpackage.sls
                    public final Object invoke() {
                        qip0 qip0Var2 = qip0.this;
                        ((ScrollTagStateHolder$getAllAppropriateTags$1$1) qip0Var2.c).invoke(qip0Var2.a);
                        return zy11.a;
                    }
                };
                btsVar.o0(Q2);
            }
            c530 c530Var = c530.a;
            f530 o = an91.o(q791.b(c530Var, zx40Var, null, false, null, null, (sls) Q2, 28), 0.0f, 0.0f, 8.0f, 0.0f, 11);
            sic a = qic.a(lr20.c, x4c.I, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d = b.d(btsVar, o);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o2);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d);
            if (anchor == Anchor.TOP) {
                btsVar.e0(1215080760);
                d(6, 0, btsVar, ira1.i(c530Var, 180.0f));
                btsVar.t(false);
            } else {
                btsVar.e0(1215132654);
                btsVar.t(false);
            }
            b(qip0Var.b, btsVar, 0);
            if (anchor == Anchor.BOTTOM) {
                btsVar.e0(1215208077);
                d(0, 1, btsVar, null);
                btsVar.t(false);
            } else {
                btsVar.e0(1215239790);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new c1p0(qip0Var, anchor, i, i2);
        }
    }

    public static final void d(int i, int i2, fid fidVar, f530 f530Var) {
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1347534331);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (btsVar.V(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                f530Var = c530.a;
            }
            s3b1.f(new cuj0(pzg0.scroll_tag_tail, null, null, new zez0(((el51) btsVar.m(gl51.a)).h()), 22), sm91.f(an91.m(f530Var, 13.0f, 0.0f, 2), 0.0f, -1.0f, 1), null, btsVar, 0, 4);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new pta(f530Var, i, i2, 3);
        }
    }

    public static void e(Matrix matrix, Bitmap bitmap, int i) {
        if (i != 2) {
            if (i != 7) {
                if (i != 4) {
                    if (i != 5) {
                        return;
                    }
                }
            }
            matrix.postScale(1.0f, -1.0f);
            matrix.postTranslate(0.0f, bitmap.getHeight());
            return;
        }
        matrix.postScale(-1.0f, 1.0f);
        matrix.postTranslate(bitmap.getWidth(), 0.0f);
    }

    public static Bitmap f(int i, int i2, byte[] bArr) {
        int i3 = 1;
        if (i != -1 && i2 != -1) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            Point point = new Point(options.outWidth, options.outHeight);
            i3 = l(point.x, point.y, i, i2);
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inSampleSize = i3;
        return g(bArr, options2);
    }

    public static Bitmap g(byte[] bArr, BitmapFactory.Options options) {
        Bitmap createBitmap;
        try {
            int i = 0;
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (decodeByteArray == null) {
                throw new IOException("Couldn't decode, possible OOM");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                i = new a(byteArrayInputStream).d(0, "Orientation");
            } catch (IOException unused) {
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
            byteArrayInputStream.close();
            Matrix matrix = new Matrix();
            e(matrix, decodeByteArray, i);
            switch (i) {
                case 3:
                case 4:
                    matrix.postRotate(180.0f);
                    matrix.postTranslate(decodeByteArray.getWidth(), decodeByteArray.getHeight());
                    break;
                case 5:
                case 6:
                    matrix.postRotate(90.0f);
                    matrix.postTranslate(decodeByteArray.getHeight(), 0.0f);
                    break;
                case 7:
                case 8:
                    matrix.postRotate(270.0f);
                    matrix.postTranslate(0.0f, decodeByteArray.getWidth());
                    break;
            }
            return (matrix.isIdentity() || (createBitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, true)) == null) ? decodeByteArray : createBitmap;
        } catch (OutOfMemoryError e) {
            dac.g("Out of memory while decoding bitmap", e);
            return null;
        }
    }

    public static Bitmap h(Context context, Uri uri, int i, int i2, ScaleMode scaleMode) {
        int i3;
        try {
            Pair i4 = i(context, uri, i, i2);
            switch (((Integer) i4.second).intValue()) {
                case 3:
                case 4:
                    i3 = SubsamplingScaleImageView.ORIENTATION_180;
                    break;
                case 5:
                case 6:
                    i3 = 90;
                    break;
                case 7:
                case 8:
                    i3 = SubsamplingScaleImageView.ORIENTATION_270;
                    break;
                default:
                    i3 = 0;
                    break;
            }
            int i5 = i3;
            Matrix matrix = new Matrix();
            e(matrix, (Bitmap) i4.first, ((Integer) i4.second).intValue());
            Bitmap bitmap = (Bitmap) i4.first;
            if (scaleMode == null) {
                scaleMode = ScaleMode.CENTER_CROP;
            }
            return s0z0.b(bitmap, i, i2, i5, matrix, scaleMode);
        } catch (OutOfMemoryError e) {
            dac.g("Out of memory while extracting thumbnail", e);
            return null;
        }
    }

    public static Pair i(Context context, Uri uri, int i, int i2) {
        int i3;
        try {
            int k = k(context, uri);
            if (i == -1 || i2 == -1) {
                i3 = 1;
            } else {
                Point j = j(context, uri, k);
                i3 = l(j.x, j.y, i, i2);
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = i3;
            Bitmap decodeFile = "file".equals(uri.getScheme()) ? BitmapFactory.decodeFile(uri.getPath(), options) : BitmapFactory.decodeStream(context.getContentResolver().openInputStream(uri), null, options);
            if (decodeFile != null) {
                return new Pair(decodeFile, Integer.valueOf(k));
            }
            throw new IOException("Couldn't decode");
        } catch (OutOfMemoryError e) {
            dac.g("Out of memory while decoding bitmap", e);
            return null;
        }
    }

    public static Point j(Context context, Uri uri, int i) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        boolean z = true;
        options.inJustDecodeBounds = true;
        InputStream openInputStream = context.getContentResolver().openInputStream(uri);
        try {
            if (openInputStream == null) {
                throw new IOException("Can't read " + uri);
            }
            z83.d(openInputStream, "unable to open stream for uri: " + uri);
            BitmapFactory.decodeStream(new BufferedInputStream(openInputStream), null, options);
            if (options.outHeight < 0 || options.outWidth < 0) {
                throw new IOException("Failed to get image size for uri: " + uri);
            }
            if (i != 5 && i != 6 && i != 7 && i != 8) {
                z = false;
            }
            if (z) {
                Point point = new Point(options.outHeight, options.outWidth);
                openInputStream.close();
                return point;
            }
            Point point2 = new Point(options.outWidth, options.outHeight);
            openInputStream.close();
            return point2;
        } catch (Throwable th) {
            if (openInputStream != null) {
                try {
                    openInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static int k(Context context, Uri uri) {
        InputStream openInputStream = context.getContentResolver().openInputStream(uri);
        try {
            if (openInputStream == null) {
                throw new IOException("Unable open input stream for getting orientation");
            }
            int i = 0;
            try {
                i = new a(openInputStream).d(0, "Orientation");
            } catch (IOException unused) {
            }
            openInputStream.close();
            return i;
        } catch (Throwable th) {
            if (openInputStream != null) {
                try {
                    openInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static int l(int i, int i2, int i3, int i4) {
        if (i3 == -1 || i4 == -1) {
            return 1;
        }
        int min = Math.min(i2 / i4, i / i3);
        return Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
    }
}
