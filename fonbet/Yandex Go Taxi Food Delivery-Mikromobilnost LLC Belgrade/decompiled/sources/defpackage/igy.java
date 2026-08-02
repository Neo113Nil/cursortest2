package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* loaded from: classes4.dex */
public final class igy implements tls {
    public static final igy a = new igy();

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return LayoutInflater.from(((ViewGroup) obj).getContext());
    }
}
