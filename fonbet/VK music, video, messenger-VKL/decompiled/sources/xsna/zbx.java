package xsna;

import android.view.View;
import android.widget.FrameLayout;
import com.vk.toggle.features.StoriesFeatures;
import com.vkontakte.android.R;

/* compiled from: InteractiveStickersDelegate.kt */
/* loaded from: classes6.dex */
public final class zbx {
    public final uov a;
    public final d22 b;
    public final com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.a c;
    public final mbx d;
    public final e2f0 e;
    public final bpn0 f = new bpn0(new krh(this, 25));

    public zbx(mkm0 mkm0Var, d22 d22Var, w2l0 w2l0Var, f0q0 f0q0Var) {
        this.a = mkm0Var;
        this.b = d22Var;
        View[] d = awt0.d(mkm0Var.getView());
        int length = d.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (d[i].getId() == R.id.story_view_header) {
                break;
            } else {
                i++;
            }
        }
        Integer valueOf = i <= 0 ? null : Integer.valueOf(i);
        mkm0Var.getView().addView(a(), valueOf != null ? valueOf.intValue() : mkm0Var.getView().getChildCount());
        this.c = new com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.a(this.a, a(), new ifg(this, 25), w2l0Var);
        this.d = new mbx(this.a, a(), w2l0Var, new xrj(this, 14));
        StoriesFeatures storiesFeatures = StoriesFeatures.ST_REACTION_STICKER;
        storiesFeatures.getClass();
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        if (!bVar.a(storiesFeatures)) {
            StoriesFeatures storiesFeatures2 = StoriesFeatures.ST_REACTION_STICKER_VIEWER;
            storiesFeatures2.getClass();
            if (!bVar.a(storiesFeatures2)) {
                return;
            }
        }
        this.e = new e2f0(this.a, f0q0Var, a());
    }

    public final FrameLayout a() {
        return (FrameLayout) this.f.getValue();
    }
}
