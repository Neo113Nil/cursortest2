package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.huawei.hms.health.aacg;
import com.huawei.hms.hihealth.data.HealthKitApiInvoker;
import com.vk.core.files.ExternalDirType;
import com.vk.core.files.a;
import com.vk.httpexecutor.api.NetworkClient;
import java.io.OutputStream;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.text.Regex;
import xsna.mqa0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class iqa0 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ iqa0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        List aab;
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                if (((NetworkClient) ((mqa0) obj2).b.getValue()).a((String) obj) != null) {
                    return s3q0.a;
                }
                throw new mqa0.a();
            case 1:
                Bitmap bitmap = (Bitmap) obj;
                int i2 = c2x0.o1;
                Regex regex = com.vk.core.files.a.a;
                String str = com.vk.core.files.a.w() + ".".concat("png");
                seq seqVar = com.vk.core.files.a.b;
                Context context = e43.a;
                ExternalDirType externalDirType = ExternalDirType.IMAGES;
                seqVar.getClass();
                Uri c = seq.c(context, str, externalDirType);
                OutputStream c2 = a.c.c(((c2x0) obj2).requireContext(), c);
                if (c2 == null) {
                    throw new NullPointerException(io.reactivex.rxjava3.subjects.c.c("Uri outputstream is null ", c, '!'));
                }
                com.vk.core.files.a.H(bitmap, c2);
                return c;
            default:
                aab = aacg.aab((HealthKitApiInvoker) obj2, (String) obj);
                return aab;
        }
    }
}
