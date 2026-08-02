package defpackage;

import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes12.dex */
public final /* synthetic */ class f7m implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ListItemComponent b;

    public /* synthetic */ f7m(ListItemComponent listItemComponent, int i) {
        this.a = i;
        this.b = listItemComponent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ListItemComponent listItemComponent = this.b;
        switch (i) {
            case 0:
                xw31.w(listItemComponent);
                break;
            default:
                xw31.w(listItemComponent);
                break;
        }
    }
}
