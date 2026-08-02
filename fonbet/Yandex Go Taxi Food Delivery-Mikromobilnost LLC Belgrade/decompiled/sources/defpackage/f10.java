package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class f10 implements tls {
    public static final f10 a = new f10();

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return LayoutInflater.from(((ViewGroup) obj).getContext());
    }
}
