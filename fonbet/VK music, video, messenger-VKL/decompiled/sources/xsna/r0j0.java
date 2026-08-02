package xsna;

import android.view.View;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import ru.mail.libverify.notifications.SettingsActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class r0j0 implements u080 {
    public final /* synthetic */ int b;

    public /* synthetic */ r0j0(int i) {
        this.b = i;
    }

    @Override // xsna.u080
    public final bqx0 b(View view, bqx0 bqx0Var) {
        bqx0 a;
        switch (this.b) {
            case 0:
                a = SettingsActivity.a(view, bqx0Var);
                return a;
            default:
                int i = VideoCatalogRootVh.M0;
                h4x i2 = bqx0Var.a.i(130);
                view.setPadding(i2.a, 0, i2.c, i2.d);
                return bqx0Var;
        }
    }
}
