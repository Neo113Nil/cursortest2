package defpackage;

import androidx.compose.ui.semantics.f;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes11.dex */
public final /* synthetic */ class oau implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ CharSequence b;

    public /* synthetic */ oau(int i, CharSequence charSequence) {
        this.a = i;
        this.b = charSequence;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        CharSequence charSequence = this.b;
        switch (i) {
            case 0:
                mnq0 mnq0Var = (mnq0) obj;
                f.l(mnq0Var, charSequence.toString());
                f.d(mnq0Var);
                break;
            case 1:
                mnq0 mnq0Var2 = (mnq0) obj;
                f.d(mnq0Var2);
                f.l(mnq0Var2, charSequence.toString());
                break;
            case 2:
                ((RobotoTextView) obj).setText(charSequence);
                break;
            case 3:
                f.l((mnq0) obj, charSequence.toString());
                break;
            case 4:
                f.l((mnq0) obj, charSequence.toString());
                break;
            case 5:
                d6w d6wVar = (d6w) obj;
                break;
            case 6:
                f.l((mnq0) obj, charSequence.toString());
                break;
            default:
                mnq0 mnq0Var3 = (mnq0) obj;
                f.p(mnq0Var3, 0);
                f.l(mnq0Var3, charSequence.toString());
                f.f(mnq0Var3, null, new k801(25));
                break;
        }
        return zy11Var;
    }
}
