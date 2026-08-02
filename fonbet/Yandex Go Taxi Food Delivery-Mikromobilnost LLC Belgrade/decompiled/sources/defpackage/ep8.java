package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes13.dex */
public final class ep8 implements tls {
    public static final ep8 a = new ep8();

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        View view = new View(((ViewGroup) obj).getContext());
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        view.setImportantForAccessibility(2);
        return view;
    }
}
