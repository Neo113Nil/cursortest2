package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import com.yandex.go.experiment.UserPhotoUploadingExperiment;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import kotlin.Result;

/* loaded from: classes.dex */
public final class d9v {
    public final Context a;
    public final wq21 b;
    public final ocv c;

    public d9v(Context context, wq21 wq21Var, ocv ocvVar) {
        this.a = context;
        this.b = wq21Var;
        this.c = ocvVar;
    }

    public static Bitmap c(ContentResolver contentResolver, Uri uri) {
        Bitmap decodeStream;
        Object invoke;
        InputStream openInputStream = contentResolver.openInputStream(uri);
        Matrix matrix = null;
        if (openInputStream != null) {
            try {
                decodeStream = BitmapFactory.decodeStream(openInputStream);
                openInputStream.close();
            } finally {
            }
        } else {
            decodeStream = null;
        }
        if (decodeStream == null) {
            ny61.g(unr0.n(uri, "Nullable bitmap from uri="));
            return null;
        }
        jiu jiuVar = new jiu(16);
        openInputStream = contentResolver.openInputStream(uri);
        if (openInputStream != null) {
            try {
                invoke = jiuVar.invoke(openInputStream);
                openInputStream.close();
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        } else {
            invoke = null;
        }
        Integer num = (Integer) invoke;
        switch (num != null ? num.intValue() : 0) {
            case 2:
                matrix = new Matrix();
                matrix.setScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix = new Matrix();
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix = new Matrix();
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix = new Matrix();
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix = new Matrix();
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix = new Matrix();
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix = new Matrix();
                matrix.setRotate(-90.0f);
                break;
        }
        Matrix matrix2 = matrix;
        if (matrix2 != null) {
            Bitmap createBitmap = Bitmap.createBitmap(decodeStream, 0, 0, decodeStream.getWidth(), decodeStream.getHeight(), matrix2, true);
            decodeStream.recycle();
            if (createBitmap != null) {
                return createBitmap;
            }
        }
        return decodeStream;
    }

    public final c9v a(Uri uri, ncv ncvVar) {
        Bitmap c = c(this.a.getContentResolver(), uri);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int b = ncvVar.b();
        int i = 1;
        while (b >= 0) {
            byteArrayOutputStream.reset();
            c.compress(Bitmap.CompressFormat.JPEG, b, byteArrayOutputStream);
            if (byteArrayOutputStream.size() <= ncvVar.a()) {
                break;
            }
            b -= 10;
            i++;
        }
        return new c9v(0, byteArrayOutputStream.toByteArray(), new iwd(i, byteArrayOutputStream.size()));
    }

    public final byte[] b(tls tlsVar, Uri uri) {
        Object failure;
        wq21 wq21Var = this.b;
        try {
            ocv ocvVar = this.c;
            double d = ((UserPhotoUploadingExperiment) wq21Var.a().b()).d;
            double d2 = ((UserPhotoUploadingExperiment) wq21Var.a().b()).e;
            ocvVar.getClass();
            int a = m810.a(d2 * 100.0d);
            if (a < 0 || a >= 100) {
                a = 90;
            }
            c9v a2 = a(uri, new ncv((long) (d * 1048576.0d), a));
            tlsVar.invoke(a2.m());
            failure = a2.k();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a3 = Result.a(failure);
        if (a3 != null) {
            k791.b(a3);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (byte[]) failure;
    }
}
