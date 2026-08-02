package xsna;

import com.vk.log.L;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class qao implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;

    public /* synthetic */ qao(int i) {
        this.b = i;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                cvk.w((String) obj, false);
                break;
            case 1:
                s3q0 s3q0Var = s3q0.a;
                break;
            default:
                L.p("vk", "Offline was set: " + ((Boolean) obj));
                break;
        }
    }
}
