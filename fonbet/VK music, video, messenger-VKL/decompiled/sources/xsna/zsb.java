package xsna;

import xsna.pvc0;
import xsna.r4n0;
import xsna.x8a0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class zsb implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zsb(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ftb ftbVar = (ftb) this.c;
                ftbVar.l = null;
                ftbVar.e.r0();
                break;
            case 1:
                ((com.vk.movika.sdk.base.ui.f) this.c).invoke();
                break;
            case 2:
                ((com.vk.im.ui.components.msg_list.c) this.c).j = false;
                break;
            case 3:
                ((o8a0) this.c).i.b(x8a0.b.a);
                break;
            case 4:
                ((com.vk.im.popup.a) this.c).dismiss();
                break;
            case 5:
                ((pvc0.a) this.c).a();
                break;
            case 6:
                ((b2e0) this.c).a();
                break;
            case 7:
                ((azl0) this.c).h.e();
                break;
            default:
                ((r4n0.a) this.c).a();
                break;
        }
    }
}
