package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import xsna.ao50;
import xsna.kj50;

/* compiled from: MviView.kt */
/* loaded from: classes2.dex */
public interface wn50<VS extends ao50, A extends kj50> {
    io.reactivex.rxjava3.subjects.f E();

    View c(LayoutInflater layoutInflater, ViewGroup viewGroup);

    void j(yn50 yn50Var);

    void l(VS vs);

    void onDestroyView();
}
