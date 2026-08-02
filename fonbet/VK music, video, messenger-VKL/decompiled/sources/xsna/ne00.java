package xsna;

import android.widget.FrameLayout;
import com.vk.voip.ui.groupcalls.grid.GroupCallGridContainerView;
import com.vk.voip.ui.groupcalls.list.ListGroupCallView;

/* compiled from: MainMenuAnimationHelper.kt */
/* loaded from: classes7.dex */
public final class ne00 implements qa9 {
    public static final float d = cn70.a() * 25.0f;
    public static final float e = cn70.a() * 96.0f;
    public static final int f = cn70.b(110);
    public static final int g = cn70.b(108);
    public final ListGroupCallView b;
    public final GroupCallGridContainerView c;

    public ne00(ListGroupCallView listGroupCallView, GroupCallGridContainerView groupCallGridContainerView) {
        this.b = listGroupCallView;
        this.c = groupCallGridContainerView;
    }

    @Override // xsna.qa9
    public final void a(float f2) {
        ListGroupCallView listGroupCallView = this.b;
        nfw0 nfw0Var = listGroupCallView.x;
        float f3 = 1 - f2;
        float f4 = e * f3;
        float f5 = f * f3;
        float f6 = g * f3;
        float f7 = d * f3;
        com.vk.voip.ui.groupcalls.grid.a aVar = this.c.d;
        if (aVar.G.b.a().b) {
            aVar.C.setTranslationY(f7);
        }
        if (nfw0Var.b.a().b) {
            listGroupCallView.L.setTranslationY(f7);
        }
        FrameLayout frameLayout = listGroupCallView.E;
        if (nfw0Var.b.a().b) {
            listGroupCallView.K.setTranslationY(f5);
            frameLayout.setTranslationY(f6);
        } else {
            frameLayout.setTranslationY(f4);
        }
        listGroupCallView.f5();
    }
}
