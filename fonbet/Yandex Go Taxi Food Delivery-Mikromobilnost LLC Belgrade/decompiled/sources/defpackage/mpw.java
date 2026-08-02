package defpackage;

import ru.yandex.taxi.widget.ModalView;

/* loaded from: classes14.dex */
public final /* synthetic */ class mpw implements qdj {
    public final /* synthetic */ int a;
    public final /* synthetic */ ModalView b;

    public /* synthetic */ mpw(ModalView modalView, int i) {
        this.a = i;
        this.b = modalView;
    }

    @Override // defpackage.qdj
    public final void dismiss() {
        int i = this.a;
        ModalView modalView = this.b;
        switch (i) {
            case 0:
                modalView.dismiss();
                break;
            default:
                modalView.dismiss();
                break;
        }
    }
}
