package xsna;

import android.content.Context;
import android.view.View;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class hop implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ kop c;

    public /* synthetic */ hop(kop kopVar, int i) {
        this.b = i;
        this.c = kopVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                kop kopVar = this.c;
                otu0 un = kopVar.un();
                Context requireContext = kopVar.requireContext();
                SchemeStatSak$EventScreen schemeStatSak$EventScreen = SchemeStatSak$EventScreen.START_WITH_PHONE;
                un.getClass();
                otu0.b(requireContext, schemeStatSak$EventScreen);
                break;
            default:
                elu0 elu0Var = (elu0) this.c;
                otu0 un2 = elu0Var.un();
                Context requireContext2 = elu0Var.requireContext();
                SchemeStatSak$EventScreen schemeStatSak$EventScreen2 = SchemeStatSak$EventScreen.START_WITH_PHONE;
                un2.getClass();
                otu0.b(requireContext2, schemeStatSak$EventScreen2);
                break;
        }
    }
}
