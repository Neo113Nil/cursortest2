package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* loaded from: classes4.dex */
public final class jrc implements tls {
    public static final jrc a = new jrc();

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return LayoutInflater.from(((ViewGroup) obj).getContext());
    }
}
