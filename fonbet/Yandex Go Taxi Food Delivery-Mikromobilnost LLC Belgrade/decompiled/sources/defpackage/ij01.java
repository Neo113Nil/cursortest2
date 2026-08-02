package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class ij01 implements tls {
    public static final ij01 a = new ij01();

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return LayoutInflater.from(((ViewGroup) obj).getContext());
    }
}
