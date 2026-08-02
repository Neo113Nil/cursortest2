package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* loaded from: classes11.dex */
public final class je01 implements tls {
    public static final je01 a = new je01();

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return LayoutInflater.from(((ViewGroup) obj).getContext());
    }
}
