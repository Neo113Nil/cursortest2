package xsna;

import com.vk.voip.ui.groupcalls.GroupCallViewModel;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class yza implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ gzs c;

    public /* synthetic */ yza(int i, gzs gzsVar) {
        this.b = i;
        this.c = gzsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.invoke();
                ((ikv0) obj).a();
                return s3q0.a;
            case 1:
                return new it80(GroupCallViewModel.h.get(this.c.invoke()));
            default:
                this.c.invoke();
                return s3q0.a;
        }
    }
}
