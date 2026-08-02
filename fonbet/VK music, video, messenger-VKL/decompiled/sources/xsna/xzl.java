package xsna;

import com.vkontakte.android.data.b;
import java.io.File;
import kotlin.text.Regex;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class xzl implements Runnable {
    public final /* synthetic */ int b;

    public /* synthetic */ xzl(int i) {
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                com.vkontakte.android.data.b.h().c();
                com.vkontakte.android.data.b.h().h.clear();
                com.vkontakte.android.data.b.h().i.clear();
                com.vkontakte.android.data.b.h().j.clear();
                com.vkontakte.android.data.b.h().l.clear();
                com.vkontakte.android.data.b.h().k.clear();
                try {
                    Regex regex = com.vk.core.files.a.a;
                    vhk0.b(new File(e43.a.getFilesDir(), com.vkontakte.android.data.b.j("analytics.log")));
                    vhk0.b(new File(e43.a.getFilesDir(), com.vkontakte.android.data.b.j("analytics_collapsed.log")));
                    vhk0.b(new File(e43.a.getFilesDir(), com.vkontakte.android.data.b.j("analytics_events.log")));
                    vhk0.b(new File(e43.a.getFilesDir(), com.vkontakte.android.data.b.j("analytics_corrupted_events.log")));
                    break;
                } catch (Exception e) {
                    com.vk.metrics.eventtracking.b.a.a(e);
                    return;
                }
            case 1:
                k720 k720Var = k720.a;
                k720.U();
                break;
            default:
                com.mbridge.msdk.config.component.common.util.d.b();
                break;
        }
    }

    public /* synthetic */ xzl(b.i iVar) {
        this.b = 0;
    }
}
