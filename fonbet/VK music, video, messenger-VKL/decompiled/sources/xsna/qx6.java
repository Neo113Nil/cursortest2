package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.Window;
import com.vk.music.stickyplayer.StickyMusicPlayerBottomSheet;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class qx6 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ qx6(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Window window;
        int i = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                return new com.vk.im.ui.views.avatars.a(context, null, 6);
            default:
                int i2 = StickyMusicPlayerBottomSheet.c0;
                Activity h = e3m.h(context);
                if (h == null || (window = h.getWindow()) == null) {
                    return null;
                }
                return window.getDecorView();
        }
    }
}
