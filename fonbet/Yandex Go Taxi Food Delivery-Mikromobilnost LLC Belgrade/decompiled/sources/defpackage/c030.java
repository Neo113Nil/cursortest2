package defpackage;

import com.ybsdk.core.design.widget.ModalView;

/* loaded from: classes2.dex */
public final class c030 extends ddj {
    public final /* synthetic */ ModalView a;

    public c030(ModalView modalView) {
        this.a = modalView;
    }

    @Override // defpackage.ddj
    public final void a() {
        this.a.dismiss();
    }

    @Override // defpackage.ddj
    public final boolean b() {
        boolean z;
        z = this.a.dismissOnTouchOutside;
        return z;
    }
}
