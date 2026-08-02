package xsna;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;

/* compiled from: PermissionHost.kt */
/* loaded from: classes4.dex */
public final class ebs implements xx90 {
    public final Fragment a;
    public final Integer b;

    public ebs(Fragment fragment, Integer num) {
        this.a = fragment;
        this.b = num;
    }

    @Override // xsna.xx90
    public final Activity a() {
        return this.a.getActivity();
    }

    @Override // xsna.xx90
    public final Context b() {
        Integer num;
        Fragment fragment = this.a;
        Context mo2getContext = fragment.mo2getContext();
        l7s l7sVar = (mo2getContext == null || (num = this.b) == null) ? null : new l7s(mo2getContext, num.intValue());
        return l7sVar != null ? l7sVar : fragment.mo2getContext();
    }
}
