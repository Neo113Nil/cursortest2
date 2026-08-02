package one.video.calls.sdk.upload;

import android.content.Intent;
import android.os.Build;
import androidx.core.app.SafeJobIntentService;
import io.reactivex.rxjava3.internal.operators.single.v;
import java.io.File;
import xsna.c8s;
import xsna.lax;
import xsna.xar;

/* loaded from: classes8.dex */
public final class FileUploadService extends SafeJobIntentService {
    public static final a c = new a();

    public static final class a {
        public static final void a(a aVar, String str) {
            aVar.getClass();
            xar.a aVar2 = xar.b;
            (aVar2 != null ? aVar2.a : xar.a).log("FileUploadService", str);
        }
    }

    @Override // androidx.core.app.JobIntentService
    public final void onHandleWork(Intent intent) {
        Object parcelableExtra;
        if (Build.VERSION.SDK_INT >= 34) {
            parcelableExtra = lax.a(intent);
        } else {
            parcelableExtra = intent.getParcelableExtra("eventKey");
            if (!FileUploadEvent.class.isInstance(parcelableExtra)) {
                parcelableExtra = null;
            }
        }
        if (parcelableExtra == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        FileUploadEvent fileUploadEvent = (FileUploadEvent) parcelableExtra;
        File file = new File(fileUploadEvent.b);
        xar.a aVar = xar.b;
        new v(new c8s(fileUploadEvent.c, file, new b(aVar != null ? aVar.a : xar.a), 0)).q(io.reactivex.rxjava3.schedulers.a.b()).d(new e(file, fileUploadEvent), new f(file, fileUploadEvent));
    }
}
