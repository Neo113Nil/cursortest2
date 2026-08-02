package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* loaded from: classes11.dex */
public final class cgs implements tls {
    public static final cgs a = new cgs();

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return LayoutInflater.from(((ViewGroup) obj).getContext());
    }
}
