package xsna;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import com.facebook.common.internal.ImmutableList;
import java.io.OutputStream;

/* compiled from: SimpleImageTranscoder.kt */
/* loaded from: classes12.dex */
public final class zqj0 implements fmw {
    public final boolean a;
    public final int b;

    /* compiled from: SimpleImageTranscoder.kt */
    public static final class a {
    }

    public zqj0(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    @Override // xsna.fmw
    public final boolean canResize(rip ripVar, eng0 eng0Var, x9g0 x9g0Var) {
        if (eng0Var == null) {
            eng0Var = eng0.c;
        }
        return this.a && k15.p(eng0Var, x9g0Var, ripVar, this.b) > 1;
    }

    @Override // xsna.fmw
    public final boolean canTranscode(siw siwVar) {
        return siwVar == hgl.k || siwVar == hgl.a;
    }

    @Override // xsna.fmw
    public final String getIdentifier() {
        return "SimpleImageTranscoder";
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // xsna.fmw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final emw transcode(rip ripVar, OutputStream outputStream, eng0 eng0Var, x9g0 x9g0Var, siw siwVar, Integer num, ColorSpace colorSpace) {
        Matrix matrix;
        Bitmap bitmap;
        Integer num2 = 85;
        eng0 eng0Var2 = eng0Var == null ? eng0.c : eng0Var;
        int p = !this.a ? 1 : k15.p(eng0Var2, x9g0Var, ripVar, this.b);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = p;
        if (colorSpace != null) {
            options.inPreferredColorSpace = colorSpace;
        }
        try {
            Matrix matrix2 = null;
            Bitmap decodeStream = BitmapFactory.decodeStream(ripVar.p(), null, options);
            if (decodeStream == null) {
                ahq.d("SimpleImageTranscoder", "Couldn't decode the EncodedImage InputStream ! ");
                return new emw(2);
            }
            ImmutableList<Integer> immutableList = y0y.a;
            ripVar.y();
            try {
                try {
                    if (immutableList.contains(Integer.valueOf(ripVar.e))) {
                        int a2 = y0y.a(eng0Var2, ripVar);
                        Matrix matrix3 = new Matrix();
                        if (a2 == 2) {
                            matrix3.setScale(-1.0f, 1.0f);
                        } else if (a2 == 7) {
                            matrix3.setRotate(-90.0f);
                            matrix3.postScale(-1.0f, 1.0f);
                        } else if (a2 == 4) {
                            matrix3.setRotate(180.0f);
                            matrix3.postScale(-1.0f, 1.0f);
                        } else if (a2 == 5) {
                            matrix3.setRotate(90.0f);
                            matrix3.postScale(-1.0f, 1.0f);
                        }
                        matrix = matrix3;
                        if (matrix == null) {
                            try {
                                bitmap = Bitmap.createBitmap(decodeStream, 0, 0, decodeStream.getWidth(), decodeStream.getHeight(), matrix, false);
                            } catch (OutOfMemoryError e) {
                                e = e;
                                bitmap = decodeStream;
                                ahq.e("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                                emw emwVar = new emw(2);
                                bitmap.recycle();
                                decodeStream.recycle();
                                return emwVar;
                            } catch (Throwable th) {
                                th = th;
                                bitmap = decodeStream;
                                bitmap.recycle();
                                decodeStream.recycle();
                                throw th;
                            }
                        } else {
                            bitmap = decodeStream;
                        }
                        bitmap.compress(Bitmap.CompressFormat.JPEG, num2.intValue(), outputStream);
                        emw emwVar2 = new emw(p > 1 ? 0 : 1);
                        bitmap.recycle();
                        decodeStream.recycle();
                        return emwVar2;
                    }
                    int b = y0y.b(eng0Var2, ripVar);
                    if (b != 0) {
                        matrix2 = new Matrix();
                        matrix2.setRotate(b);
                    }
                    bitmap.compress(Bitmap.CompressFormat.JPEG, num2.intValue(), outputStream);
                    emw emwVar22 = new emw(p > 1 ? 0 : 1);
                    bitmap.recycle();
                    decodeStream.recycle();
                    return emwVar22;
                } catch (OutOfMemoryError e2) {
                    e = e2;
                    ahq.e("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                    emw emwVar3 = new emw(2);
                    bitmap.recycle();
                    decodeStream.recycle();
                    return emwVar3;
                }
            } catch (Throwable th2) {
                th = th2;
                bitmap.recycle();
                decodeStream.recycle();
                throw th;
            }
            matrix = matrix2;
            if (matrix == null) {
            }
        } catch (OutOfMemoryError e3) {
            ahq.e("SimpleImageTranscoder", "Out-Of-Memory during transcode", e3);
            return new emw(2);
        }
    }
}
