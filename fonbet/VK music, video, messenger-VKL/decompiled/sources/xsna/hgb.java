package xsna;

import com.vk.channels.impl.list.g;
import com.vk.music.bottomsheets.tracker.MusicBottomSheetActionTracker;
import ru.ok.android.webrtc.utils.PreferencesHelper;
import xsna.tww0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class hgb implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hgb(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((com.vk.channels.impl.list.b) this.c).n(new g.h(g.h.a.b.a));
                break;
            case 1:
                ic20 ic20Var = (ic20) this.c;
                if (ic20Var.j) {
                    ic20Var.h.a(0);
                    break;
                }
                break;
            case 2:
                PreferencesHelper.a((PreferencesHelper) this.c);
                break;
            case 3:
                MusicBottomSheetActionTracker musicBottomSheetActionTracker = ((xfp0) this.c).f;
                if (musicBottomSheetActionTracker != null) {
                    musicBottomSheetActionTracker.b(MusicBottomSheetActionTracker.Action.RemoveFromMyMusic);
                    break;
                }
                break;
            case 4:
                ((mcs0) this.c).l = false;
                break;
            default:
                ((pww0) this.c).T(tww0.l.a.b);
                break;
        }
    }
}
