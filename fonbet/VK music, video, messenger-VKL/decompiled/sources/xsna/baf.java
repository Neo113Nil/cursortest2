package xsna;

import android.widget.LinearLayout;
import com.vk.content.design.view.camera.ShutterButton;
import xsna.j40;

/* compiled from: ClipsTooltipsController.kt */
/* loaded from: classes16.dex */
public final class baf {
    public com.vk.core.tips.b b;
    public com.vk.core.tips.b c;
    public final j40 a = new j40();
    public boolean d = true;

    public final void a() {
        j40 j40Var = this.a;
        j40Var.a = null;
        j40.a poll = j40Var.b.poll();
        if (poll != null) {
            j40Var.a = poll;
            poll.c.invoke();
        }
        b();
        com.vk.core.tips.b bVar = this.c;
        if (bVar != null) {
            bVar.b(true);
            this.c = null;
        }
    }

    public final void b() {
        this.d = false;
        com.vk.core.tips.b bVar = this.b;
        if (bVar != null) {
            bVar.b(true);
        }
    }

    public final void c(LinearLayout linearLayout, ShutterButton shutterButton) {
        if (linearLayout != null) {
            if (!f4m.h(linearLayout)) {
                linearLayout.setTag(Integer.valueOf(linearLayout.getVisibility()));
                linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(new x9f(linearLayout, this, shutterButton));
                return;
            }
            com.vk.core.tips.b bVar = this.b;
            if (bVar != null) {
                bVar.b(true);
                this.b = null;
            }
            if (shutterButton != null) {
                shutterButton.postDelayed(new qe9(2, this, shutterButton), 300L);
            }
        }
    }
}
