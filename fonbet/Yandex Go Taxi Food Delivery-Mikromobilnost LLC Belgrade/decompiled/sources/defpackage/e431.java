package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes14.dex */
public final class e431 implements jt31 {
    @Override // defpackage.jt31
    public final void c(float f, View view) {
        view.setTranslationX(((-f) * view.getWidth()) / 5.55f);
        view.setTranslationY(tje.w(18, view.getContext()) * Math.abs(f) * Math.abs(f));
        ViewGroup viewGroup = (ViewGroup) view;
        viewGroup.findViewById(b9h0.first_frame).setImportantForAccessibility(f == 0.0f ? 1 : 2);
        viewGroup.setRotation(f * 4.0f);
    }
}
