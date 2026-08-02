package xsna;

import android.app.Activity;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class wc00 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Activity c;

    public /* synthetic */ wc00(Activity activity, int i) {
        this.b = i;
        this.c = activity;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Activity activity = this.c;
        switch (i) {
            case 0:
                activity.finish();
                return s3q0.a;
            default:
                int i2 = VideoCatalogRootVh.M0;
                return s200.v(activity);
        }
    }
}
