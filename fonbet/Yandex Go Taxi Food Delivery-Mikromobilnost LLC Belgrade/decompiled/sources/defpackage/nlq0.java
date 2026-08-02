package defpackage;

import ru.yandex.taxi.surge.dialog.selector.SelectorModalView;

/* loaded from: classes6.dex */
public final /* synthetic */ class nlq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SelectorModalView b;

    public /* synthetic */ nlq0(SelectorModalView selectorModalView, int i) {
        this.a = i;
        this.b = selectorModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        SelectorModalView selectorModalView = this.b;
        switch (i) {
            case 0:
                SelectorModalView.render$lambda$0$1(selectorModalView);
                break;
            default:
                SelectorModalView.onAttachedToWindow$lambda$0(selectorModalView);
                break;
        }
    }
}
