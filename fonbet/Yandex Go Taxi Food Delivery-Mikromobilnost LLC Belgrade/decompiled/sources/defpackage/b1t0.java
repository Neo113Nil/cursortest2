package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* loaded from: classes4.dex */
public final class b1t0 implements tls {
    public static final b1t0 a = new b1t0();

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return LayoutInflater.from(((ViewGroup) obj).getContext());
    }
}
