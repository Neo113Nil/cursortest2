package xsna;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import com.vk.instantjobs.services.JobsForegroundService;
import java.util.HashMap;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class xyx implements gzs {
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;

    public /* synthetic */ xyx(Context context, int i) {
        this.b = context;
        this.c = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        boolean z = JobsForegroundService.f;
        HashMap<Integer, JobsForegroundService.a> hashMap = JobsForegroundService.i;
        int i = this.c;
        if (hashMap.remove(Integer.valueOf(i)) != null) {
            boolean isEmpty = hashMap.isEmpty();
            Context context = this.b;
            if (isEmpty) {
                Intent intent = new Intent(context, (Class<?>) JobsForegroundService.class);
                if (JobsForegroundService.f) {
                    JobsForegroundService.g = true;
                } else {
                    context.stopService(intent);
                }
                JobsForegroundService.j = 0;
            } else if (i == JobsForegroundService.j) {
                Map.Entry<Integer, JobsForegroundService.a> next = hashMap.entrySet().iterator().next();
                int intValue = next.getKey().intValue();
                JobsForegroundService.a value = next.getValue();
                JobsForegroundService.b.b(context, intValue, value.a, value.b);
                JobsForegroundService.j = intValue;
            } else {
                ((NotificationManager) context.getSystemService("notification")).cancel(i);
            }
        }
        return s3q0.a;
    }
}
