package xsna;

import android.app.job.JobInfo;
import android.net.NetworkRequest;

/* compiled from: SystemJobInfoConverterExt.kt */
/* loaded from: classes12.dex */
public final class rqn0 {
    public static final void a(JobInfo.Builder builder, NetworkRequest networkRequest) {
        builder.setRequiredNetwork(networkRequest);
    }
}
