package defpackage;

import ru.yandex.taxi.widget.ModalView;

/* loaded from: classes10.dex */
public final class b030 extends cdj {
    public final /* synthetic */ ModalView a;

    public b030(ModalView modalView) {
        this.a = modalView;
    }

    @Override // defpackage.cdj
    public final void a() {
        this.a.dismiss();
    }

    @Override // defpackage.cdj
    public final boolean b() {
        boolean z;
        z = this.a.dismissOnTouchOutside;
        return z;
    }
}
