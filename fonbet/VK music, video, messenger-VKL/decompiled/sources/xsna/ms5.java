package xsna;

import android.content.Context;
import com.vk.im.ui.views.avatars.AvatarView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class ms5 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ ms5(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                AvatarView.a aVar = AvatarView.y;
                return new ur5(context, cn70.b(56));
            default:
                return new a1g(context);
        }
    }
}
