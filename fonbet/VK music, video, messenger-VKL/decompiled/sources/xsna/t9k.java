package xsna;

import android.view.View;
import android.widget.TextView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vkontakte.android.api.ExtendedUserProfile;

/* compiled from: CreateQuestionPresenter.kt */
/* loaded from: classes5.dex */
public final class t9k implements gm6 {
    public final com.vk.profile.questions.impl.b b;
    public final ExtendedUserProfile c;
    public final int d;
    public int e;
    public String f = "";
    public boolean g;

    public t9k(com.vk.profile.questions.impl.b bVar, ExtendedUserProfile extendedUserProfile, int i) {
        this.b = bVar;
        this.c = extendedUserProfile;
        this.d = i;
    }

    @Override // xsna.gm6
    public final boolean a0() {
        return false;
    }

    public final void b() {
        boolean z = this.e >= this.d;
        boolean z2 = !drm0.N(this.f);
        com.vk.profile.questions.impl.b bVar = this.b;
        VkButton vkButton = bVar.k1;
        if (vkButton == null) {
            vkButton = null;
        }
        vkButton.setEnabled(z2);
        boolean z3 = this.f.length() == 0;
        VkInputSelect vkInputSelect = bVar.n1;
        if (vkInputSelect == null) {
            vkInputSelect = null;
        }
        vkInputSelect.setGravity(z3 ? 8388611 : 17);
        TextView textView = bVar.o1;
        if (textView == null) {
            textView = null;
        }
        bwt0.p0(textView, z3);
        View view = bVar.m1;
        bwt0.p0(view != null ? view : null, z);
    }

    @Override // xsna.gm6
    public final void onStart() {
        b();
    }

    @Override // xsna.gm6
    public final void d() {
    }

    @Override // xsna.cc6
    public final void onDestroy() {
    }

    @Override // xsna.gm6
    public final void onDestroyView() {
    }

    @Override // xsna.cc6
    public final void onPause() {
    }

    @Override // xsna.cc6
    public final void onResume() {
    }

    @Override // xsna.gm6
    public final void onStop() {
    }
}
