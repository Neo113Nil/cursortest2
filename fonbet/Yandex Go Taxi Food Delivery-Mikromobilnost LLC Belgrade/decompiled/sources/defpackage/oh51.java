package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes10.dex */
public final class oh51 extends FragmentManager.a {
    public final /* synthetic */ Ref$ObjectRef a;
    public final /* synthetic */ ph51 b;

    public oh51(Ref$ObjectRef ref$ObjectRef, ph51 ph51Var) {
        this.a = ref$ObjectRef;
        this.b = ph51Var;
    }

    @Override // androidx.fragment.app.FragmentManager.a
    public final void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        new adr(view, new wp01(this.a, this.b, this));
    }
}
