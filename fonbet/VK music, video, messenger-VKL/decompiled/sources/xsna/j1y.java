package xsna;

import android.app.Activity;
import com.vk.external.miniapp.net.app.WebAdConfig;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class j1y implements gzs {
    public final /* synthetic */ n1y b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ long d;
    public final /* synthetic */ List e;
    public final /* synthetic */ WebAdConfig f;

    public /* synthetic */ j1y(long j, Activity activity, WebAdConfig webAdConfig, List list, n1y n1yVar) {
        this.b = n1yVar;
        this.c = activity;
        this.d = j;
        this.e = list;
        this.f = webAdConfig;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        this.b.m(this.c, this.d, this.e, this.f);
        return s3q0.a;
    }
}
