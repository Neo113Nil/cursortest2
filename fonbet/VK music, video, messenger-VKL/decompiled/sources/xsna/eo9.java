package xsna;

import io.michaelrocks.libphonenumber.android.Phonemetadata$PhoneNumberDesc;
import java.util.regex.Matcher;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes13.dex */
public final class eo9 implements y5r {
    public final Object a;

    public /* synthetic */ eo9(Object obj) {
        this.a = obj;
    }

    @Override // xsna.y5r
    public void a() {
        ebs0 ebs0Var = ((sqt0) ((myd0) this.a).c).b;
        if (ebs0Var != null) {
            ebs0Var.bk(ass0.a);
        }
    }

    public boolean b(CharSequence charSequence, Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc) {
        String d = phonemetadata$PhoneNumberDesc.d();
        if (d.length() != 0) {
            Matcher matcher = ((rpf0) this.a).a(d).matcher(charSequence);
            return matcher.lookingAt() && matcher.matches();
        }
        return false;
    }

    public void c(int i) {
        qiu qiuVar = ((mjw0) this.a).h;
        qiuVar.f = i;
        qiuVar.b();
    }

    public eo9(vnv vnvVar) {
        exc0.i(vnvVar);
        this.a = vnvVar;
    }

    public eo9(lxa lxaVar) {
        io.reactivex.rxjava3.internal.operators.observable.y yVar = lxaVar.e;
        yVar.getClass();
        this.a = new io.reactivex.rxjava3.internal.operators.observable.y(yVar, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).U(new ql2(new wq3(8), 9));
    }

    public eo9(int i) {
        switch (i) {
            case 4:
                this.a = new rpf0(100);
                break;
            default:
                this.a = new yd10();
                break;
        }
    }
}
