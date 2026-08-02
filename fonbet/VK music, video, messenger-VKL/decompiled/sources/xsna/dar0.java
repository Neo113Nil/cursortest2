package xsna;

import android.view.View;
import com.vk.avatar.api.VKAvatarView;

/* compiled from: View.kt */
/* loaded from: classes15.dex */
public final class dar0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ VKAvatarView b;
    public final /* synthetic */ i700 c;
    public final /* synthetic */ k9r0 d;

    public dar0(VKAvatarView vKAvatarView, i700 i700Var, k9r0 k9r0Var) {
        this.b = vKAvatarView;
        this.c = i700Var;
        this.d = k9r0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        int i9 = this.d.c;
        int i10 = VKAvatarView.r;
        this.b.W0(this.c, null, i9);
    }
}
