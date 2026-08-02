package defpackage;

import ru.yandex.taxi.widget.EditRoutePointModalView;

/* loaded from: classes14.dex */
public final /* synthetic */ class knn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditRoutePointModalView b;

    public /* synthetic */ knn(EditRoutePointModalView editRoutePointModalView, int i) {
        this.a = i;
        this.b = editRoutePointModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        EditRoutePointModalView editRoutePointModalView = this.b;
        switch (i) {
            case 0:
                EditRoutePointModalView.lambda$1$0(editRoutePointModalView);
                break;
            default:
                EditRoutePointModalView.lambda$0$0(editRoutePointModalView);
                break;
        }
    }
}
