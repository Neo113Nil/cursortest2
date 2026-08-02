package xsna;

import android.view.View;
import android.widget.EditText;
import com.vkontakte.android.R;

/* compiled from: VoipCallsJoinToCallByPasswordView.kt */
/* loaded from: classes7.dex */
public final class olw0 implements gm50 {
    public final View b;
    public final ykw0 c;
    public final hij0 d;
    public final EditText e;
    public final EditText f;
    public final View g;
    public final mlw0 h;
    public final nlw0 i;

    public olw0(View view, ykw0 ykw0Var, hij0 hij0Var) {
        this.b = view;
        this.c = ykw0Var;
        this.d = hij0Var;
        EditText editText = (EditText) view.findViewById(R.id.input_link);
        this.e = editText;
        EditText editText2 = (EditText) view.findViewById(R.id.input_password);
        this.f = editText2;
        View findViewById = view.findViewById(R.id.join_btn);
        this.g = findViewById;
        mlw0 mlw0Var = new mlw0(this);
        this.h = mlw0Var;
        nlw0 nlw0Var = new nlw0(this);
        this.i = nlw0Var;
        editText.addTextChangedListener(mlw0Var);
        editText2.addTextChangedListener(nlw0Var);
        findViewById.setOnClickListener(new w16(this, 15));
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.c;
    }
}
