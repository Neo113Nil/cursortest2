package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* loaded from: classes6.dex */
public final class l6 implements tls {
    public static final l6 a = new l6();

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return LayoutInflater.from(((ViewGroup) obj).getContext());
    }
}
