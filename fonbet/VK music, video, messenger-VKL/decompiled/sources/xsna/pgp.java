package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import xsna.ao50;
import xsna.kj50;

/* compiled from: EmptyMviViewController.kt */
/* loaded from: classes2.dex */
public abstract class pgp<S extends ao50, A extends kj50> extends ei6<S, A> {
    @Override // xsna.wn50
    public final View c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        boolean z;
        Context context = layoutInflater.getContext();
        tub tubVar = (tub) this;
        Context context2 = context;
        while (true) {
            z = context2 instanceof AppCompatActivity;
            if (z || !(context2 instanceof ContextWrapper)) {
                break;
            }
            context2 = ((ContextWrapper) context2).getBaseContext();
        }
        tubVar.e = (AppCompatActivity) (z ? (Activity) context2 : null);
        tubVar.d = new asm(context, tubVar.b);
        return null;
    }

    @Override // xsna.wn50
    public final void onDestroyView() {
        tub tubVar = (tub) this;
        tubVar.e = null;
        irb irbVar = tubVar.f;
        if (irbVar != null) {
            irbVar.a();
        }
        tubVar.f = null;
        asm asmVar = tubVar.d;
        if (asmVar != null) {
            asmVar.g();
        }
        tubVar.d = null;
        tubVar.g.e();
    }
}
