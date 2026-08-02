package defpackage;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.b;
import com.yandex.go.superapp.discovery.map.impl.ui.base.SuperAppDiscoveryMapLifecycleAwareModalView;
import defpackage.bvo;
import defpackage.xw31;
import java.util.WeakHashMap;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes14.dex */
public final class bvo {
    public final SuperAppDiscoveryMapLifecycleAwareModalView a;
    public final sls b;
    public final sls c;
    public View d;

    public bvo(SuperAppDiscoveryMapLifecycleAwareModalView superAppDiscoveryMapLifecycleAwareModalView, sls slsVar, sls slsVar2) {
        this.a = superAppDiscoveryMapLifecycleAwareModalView;
        this.b = slsVar;
        this.c = slsVar2;
    }

    public final void a() {
        SuperAppDiscoveryMapLifecycleAwareModalView superAppDiscoveryMapLifecycleAwareModalView = this.a;
        superAppDiscoveryMapLifecycleAwareModalView.setClipToPadding(false);
        View view = new View(superAppDiscoveryMapLifecycleAwareModalView.getContext());
        view.setBackground(b());
        view.setVisibility(8);
        view.setTranslationZ(-1.0f);
        superAppDiscoveryMapLifecycleAwareModalView.addView(view, 0, new ViewGroup.LayoutParams(-1, 0));
        this.d = view;
    }

    public final GradientDrawable b() {
        int t = qje.t(xng0.bgMain, this.a.getContext());
        return new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.argb((int) (Color.alpha(t) * 1.0f), Color.red(t), Color.green(t), Color.blue(t)), Color.argb((int) (Color.alpha(t) * 0.0f), Color.red(t), Color.green(t), Color.blue(t))});
    }

    public final void c() {
        final View view = this.d;
        if (view != null) {
            WeakHashMap weakHashMap = b.a;
            SuperAppDiscoveryMapLifecycleAwareModalView superAppDiscoveryMapLifecycleAwareModalView = this.a;
            if (!superAppDiscoveryMapLifecycleAwareModalView.isLaidOut() || superAppDiscoveryMapLifecycleAwareModalView.isLayoutRequested()) {
                superAppDiscoveryMapLifecycleAwareModalView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.go.superapp.discovery.map.impl.ui.main.explorer.ExplorerTopFadeOverlay$updatePosition$lambda$0$$inlined$doOnLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        view2.removeOnLayoutChangeListener(this);
                        int intValue = ((Number) bvo.this.b.invoke()).intValue();
                        c.C(((Number) bvo.this.c.invoke()).intValue() + intValue, view);
                        xw31.L(-intValue, view);
                    }
                });
                return;
            }
            int intValue = ((Number) this.b.invoke()).intValue();
            c.D(view.getLayoutParams().width, ((Number) this.c.invoke()).intValue() + intValue, view);
            xw31.E(view, null, Integer.valueOf(-intValue), null, null);
        }
    }
}
