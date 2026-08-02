package xsna;

import com.vk.core.preference.Preference;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class uex implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;

    public /* synthetic */ uex(int i) {
        this.b = i;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                int i = wex.D0;
                break;
            default:
                Preference.F(System.currentTimeMillis(), "story_viewer", "story_open_time");
                break;
        }
    }
}
