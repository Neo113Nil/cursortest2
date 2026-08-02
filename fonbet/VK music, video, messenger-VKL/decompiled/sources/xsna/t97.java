package xsna;

import androidx.fragment.app.Fragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.external.miniapp.net.app.WebApiApplication;
import javax.crypto.Cipher;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class t97 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ t97(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                final y97 y97Var = (y97) this.c;
                final Fragment fragment = (Fragment) this.d;
                final t6e0 t6e0Var = (t6e0) this.e;
                final n47 n47Var = (n47) this.f;
                final Cipher cipher = (Cipher) obj;
                return new io.reactivex.rxjava3.internal.operators.single.b(new io.reactivex.rxjava3.core.a0(y97Var, fragment, t6e0Var, cipher, n47Var) { // from class: xsna.v97
                    public final /* synthetic */ Fragment b;
                    public final /* synthetic */ t6e0 c;
                    public final /* synthetic */ Cipher d;
                    public final /* synthetic */ n47 e;

                    {
                        this.b = fragment;
                        this.c = t6e0Var;
                        this.d = cipher;
                        this.e = n47Var;
                    }

                    @Override // io.reactivex.rxjava3.core.a0
                    public final void subscribe(io.reactivex.rxjava3.core.y yVar) {
                        yVar.i(y97.a(this.b, this.c, this.d, this.e, new c95(1, yVar, io.reactivex.rxjava3.core.y.class, "onSuccess", "onSuccess(Ljava/lang/Object;)V", 0, 1)));
                    }
                });
            default:
                WebApiApplication webApiApplication = (WebApiApplication) this.c;
                nr4.b().b(new jbs((FragmentImpl) obj), chx0.b(webApiApplication), (String) this.d, (q7j0) this.e, (String) this.f);
                return s3q0.a;
        }
    }
}
