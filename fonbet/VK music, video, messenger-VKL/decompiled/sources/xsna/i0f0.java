package xsna;

import android.content.Context;
import com.vk.core.view.components.skeleton.VkSkeleton;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class i0f0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ i0f0(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                return m33.a(R.drawable.bg_snippet_border_8dp, context);
            default:
                int i2 = VkSkeleton.i;
                return new com.vk.core.view.shimmer.b(context);
        }
    }
}
