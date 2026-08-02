package xsna;

import android.content.Context;
import com.vk.core.preference.Preference;
import com.vk.superapp.multiaccount.api.MultiAccountComponent;
import java.util.Set;
import kotlin.collections.EmptySet;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class i250 implements Runnable {
    public final /* synthetic */ int b;

    public /* synthetic */ i250(int i) {
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                Preference preference = Preference.a;
                for (String str : Preference.u(EmptySet.b, "music_prefers_list_name", "music_prefers_names")) {
                    int i = 1;
                    String b = go9.b("music_prefs_", (String) j5g.i0(drm0.b0(str, new char[]{'_'}, 0, 6)));
                    Set<String> keySet = Preference.f(str).getAll().keySet();
                    if (!keySet.isEmpty()) {
                        Context context = e43.a;
                        if (context == null) {
                            context = null;
                        }
                        qaj0.b(context, new sjy(str, b, keySet, i));
                        Preference.B(str);
                    }
                }
                break;
            default:
                ((MultiAccountComponent) ((k7m) m7m.f(gex0.b)).a(fpf0.a(MultiAccountComponent.class))).c().c();
                break;
        }
    }
}
