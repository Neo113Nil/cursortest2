package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.vk.core.fragments.FragmentImpl;

/* compiled from: ActivityLauncher.kt */
/* loaded from: classes3.dex */
public final class jbs implements u90 {
    public final FragmentImpl a;

    public jbs(FragmentImpl fragmentImpl) {
        this.a = fragmentImpl;
    }

    @Override // xsna.u90
    public final Context B() {
        return this.a.kn();
    }

    @Override // xsna.u90
    public final void D(Intent intent, int i, Bundle bundle) {
        FragmentImpl fragmentImpl = this.a;
        LayoutInflater.Factory activity = fragmentImpl.getActivity();
        ey50 ey50Var = activity instanceof ey50 ? (ey50) activity : null;
        ww50<?> Y = ey50Var != null ? ey50Var.Y() : null;
        if (Y == null || !Y.q(i, intent, fragmentImpl)) {
            fragmentImpl.startActivityForResult(intent, i, bundle);
        }
    }

    @Override // xsna.u90
    public final void E(Intent intent) {
        FragmentImpl fragmentImpl = this.a;
        LayoutInflater.Factory activity = fragmentImpl.getActivity();
        ey50 ey50Var = activity instanceof ey50 ? (ey50) activity : null;
        ww50<?> Y = ey50Var != null ? ey50Var.Y() : null;
        if (Y == null || !Y.r(intent)) {
            fragmentImpl.startActivity(intent, null);
        }
    }
}
