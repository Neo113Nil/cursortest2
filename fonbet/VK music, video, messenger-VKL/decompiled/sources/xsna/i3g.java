package xsna;

import android.content.Context;
import com.vk.core.preference.Preference;
import com.vk.core.view.components.skeleton.VkTextSkeleton;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class i3g implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ i3g(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                return new d1g(context);
            case 1:
                o19.j(context).d(context);
                ky6 j = Preference.j();
                if (!j.contains("contacts_import_timestamp")) {
                    qaj0.c(j, "contacts_import_timestamp", Long.valueOf(System.currentTimeMillis()));
                }
                return s3q0.a;
            default:
                int i2 = VkTextSkeleton.j;
                return new com.vk.core.view.shimmer.b(context);
        }
    }
}
