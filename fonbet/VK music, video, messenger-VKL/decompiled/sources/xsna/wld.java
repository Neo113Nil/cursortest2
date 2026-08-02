package xsna;

import android.graphics.Bitmap;
import android.util.Size;
import com.huawei.hms.health.aace;
import com.huawei.hms.hihealth.data.HealthKitApiInvoker;
import com.huawei.hms.hihealth.options.ActivityRecordReadOptions;
import com.huawei.hms.hihealth.result.ActivityRecordResult;
import com.vk.media.pipeline.di.MediaPipelineComponent;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import xsna.x4d0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class wld implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wld(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ActivityRecordResult aab;
        switch (this.b) {
            case 0:
                zld zldVar = (zld) this.c;
                Size size = (Size) this.d;
                List<uq10> c = zldVar.c((x4d0.a) zldVar.e);
                MediaPipelineComponent mediaPipelineComponent = zldVar.a.b;
                Bitmap a = mediaPipelineComponent.O9(((x4d0.a) zldVar.e).a, new apk(c, zldVar.b, mediaPipelineComponent.Gd())).a(TimeUnit.MILLISECONDS.toMicros(zldVar.n), new Size(size.getWidth(), size.getHeight()));
                Iterator<T> it = c.iterator();
                while (it.hasNext()) {
                    ((uq10) it.next()).e();
                }
                return new Pair(a, Long.valueOf(zldVar.n));
            default:
                aab = aace.aab((HealthKitApiInvoker) this.c, (ActivityRecordReadOptions) this.d);
                return aab;
        }
    }
}
