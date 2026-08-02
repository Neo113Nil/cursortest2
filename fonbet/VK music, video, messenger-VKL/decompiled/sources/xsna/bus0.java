package xsna;

import android.content.Context;
import com.vkontakte.android.R;

/* compiled from: VideoMinimizableDiscoveryBottomSheetHost.kt */
/* loaded from: classes7.dex */
public final class bus0 implements h88 {
    public final i6m0 a;
    public final Context b;

    public bus0(i6m0 i6m0Var, Context context) {
        this.a = i6m0Var;
        this.b = context;
    }

    @Override // xsna.h88
    public final Integer a() {
        if (((Boolean) this.a.invoke()).booleanValue()) {
            return Integer.valueOf(this.b.getResources().getDimensionPixelSize(R.dimen.video_additional_info_container_width));
        }
        return null;
    }

    @Override // xsna.h88
    public final boolean b() {
        return !((Boolean) this.a.invoke()).booleanValue();
    }

    @Override // xsna.h88
    public final uts0 c(Context context, com.vk.core.ui.bottomsheet.internal.b bVar) {
        return new uts0(context, bVar, new hbj0(this, 20));
    }
}
