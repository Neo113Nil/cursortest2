package xsna;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.feature.music.dto.ui.UiBlockInteractiveVkMix;
import xsna.wln0;

/* compiled from: SwitchableTextDelegate.kt */
/* loaded from: classes16.dex */
public final class yiq<T extends View> extends rmn0 {
    public final T b;
    public final boolean c;
    public final l4v0 d;
    public final aud e;
    public final wln0.a f;

    public yiq(ViewGroup viewGroup, boolean z, l4v0 l4v0Var, aud audVar, wln0.a aVar) {
        this.b = viewGroup;
        this.c = z;
        this.d = l4v0Var;
        this.e = audVar;
        this.f = aVar;
    }

    @Override // xsna.rmn0
    public final void a(int i) {
        UIBlockPlaceholder uIBlockPlaceholder;
        r80 a;
        aud audVar = this.e;
        if (audVar.b()) {
            l4v0 l4v0Var = this.d;
            String str = (l4v0Var == null || (a = l4v0Var.a()) == null) ? null : (String) a.a;
            UiBlockInteractiveVkMix a2 = audVar.a();
            boolean z = !(epx.f(str, (a2 == null || (uIBlockPlaceholder = a2.D) == null) ? null : uIBlockPlaceholder.z) ^ this.c);
            on2 on2Var = this.a;
            ValueAnimator a3 = on2Var != null ? on2Var.a(this.b, z, this.f, i) : null;
            if (a3 != null) {
                a3.start();
            }
        }
    }
}
