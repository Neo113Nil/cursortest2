package xsna;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.huawei.hms.health.aace;
import com.huawei.hms.hihealth.data.HealthKitApiInvoker;
import com.huawei.hms.hihealth.options.ActivityRecordDeleteOptions;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class qgd implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qgd(int i, Object obj, Object obj2) {
        this.b = i;
        this.d = obj;
        this.c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Void aab;
        switch (this.b) {
            case 0:
                return gbr.b(((rgd) this.d).a, (Uri) this.c, true);
            case 1:
                androidx.media3.datasource.b bVar = (androidx.media3.datasource.b) this.d;
                Uri uri = (Uri) this.c;
                androidx.media3.datasource.a createDataSource = bVar.b.createDataSource();
                BitmapFactory.Options options = bVar.c;
                try {
                    evk evkVar = new evk(uri);
                    androidx.media3.datasource.c cVar = (androidx.media3.datasource.c) createDataSource;
                    cVar.open(evkVar);
                    byte[] bArr = new byte[1024];
                    int i = 0;
                    int i2 = 0;
                    while (i != -1) {
                        if (i2 == bArr.length) {
                            bArr = Arrays.copyOf(bArr, bArr.length * 2);
                        }
                        i = cVar.read(bArr, i2, bArr.length - i2);
                        if (i != -1) {
                            i2 += i;
                        }
                    }
                    byte[] copyOf = Arrays.copyOf(bArr, i2);
                    Bitmap a = jd7.a(copyOf, copyOf.length, 4096, options);
                    cVar.close();
                    return a;
                } catch (Throwable th) {
                    ((androidx.media3.datasource.c) createDataSource).close();
                    throw th;
                }
            case 2:
                vh40 vh40Var = (vh40) this.d;
                List list = (List) this.c;
                sg40 sg40Var = vh40Var.c;
                sg40Var.n.execute(new z3l(sg40Var, o25.a().c(), list, null, 1));
                return s3q0.a;
            default:
                aab = aace.aab((HealthKitApiInvoker) this.d, (ActivityRecordDeleteOptions) this.c);
                return aab;
        }
    }
}
