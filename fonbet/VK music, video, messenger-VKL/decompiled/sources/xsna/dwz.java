package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.voip.ui.actions.menu.fragments.VoipMainMenuActionsFragment;
import com.vkontakte.android.R;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class dwz implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dwz(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return ((ewz) obj2).h((Context) obj, false);
            case 1:
                int i2 = VoipMainMenuActionsFragment.V;
                return (ViewGroup) ((LayoutInflater) obj2).inflate(R.layout.voip_call_view_slide_up_menu_actions_view, (ViewGroup) obj, false);
            default:
                return com.vungle.ads.internal.executor.g.a((Callable) obj2, (gzs) obj);
        }
    }

    public /* synthetic */ dwz(VoipMainMenuActionsFragment voipMainMenuActionsFragment, LayoutInflater layoutInflater, FrameLayout frameLayout) {
        this.b = 1;
        this.c = layoutInflater;
        this.d = frameLayout;
    }
}
