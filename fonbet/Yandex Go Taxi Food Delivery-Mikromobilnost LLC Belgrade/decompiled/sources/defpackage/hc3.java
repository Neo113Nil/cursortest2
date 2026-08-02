package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import okhttp3.OkHttpClient;

/* loaded from: classes15.dex */
public final class hc3 {
    public final Fragment a;
    public final fc3 b;
    public final FragmentActivity c;
    public final o3 d;
    public final q4g e;
    public final p1b f;

    public hc3(Fragment fragment, fc3 fc3Var, t6f0 t6f0Var, ew2 ew2Var, OkHttpClient okHttpClient) {
        this.a = fragment;
        this.b = fc3Var;
        FragmentActivity requireActivity = fragment.requireActivity();
        this.c = requireActivity;
        this.d = new o3(fragment);
        this.e = new q4g(requireActivity, ew2Var, t6f0Var, okHttpClient);
        this.f = new p1b(fragment);
    }
}
