package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class gj01 implements tls {
    public static final gj01 a = new gj01();

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return LayoutInflater.from(((ViewGroup) obj).getContext());
    }
}
