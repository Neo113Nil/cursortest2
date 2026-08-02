package defpackage;

import androidx.core.view.OneShotPreDrawListener;
import androidx.transition.TransitionSet;
import com.yandex.div.core.view2.Div2View;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class obl {
    public final Div2View a;
    public final ArrayList b = new ArrayList();
    public boolean c;

    public obl(Div2View div2View) {
        this.a = div2View;
    }

    public final void a(TransitionSet transitionSet) {
        this.b.add(transitionSet);
        if (this.c) {
            return;
        }
        Div2View div2View = this.a;
        OneShotPreDrawListener.add(div2View, new do91(5, div2View, this));
        this.c = true;
    }
}
