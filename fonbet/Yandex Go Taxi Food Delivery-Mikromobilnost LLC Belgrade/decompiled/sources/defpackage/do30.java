package defpackage;

import ru.yandex.taxi.masstransit.main.ui.modal.MtMainFlexModalView;

/* loaded from: classes6.dex */
public final /* synthetic */ class do30 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MtMainFlexModalView b;

    public /* synthetic */ do30(MtMainFlexModalView mtMainFlexModalView, int i) {
        this.a = i;
        this.b = mtMainFlexModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        MtMainFlexModalView mtMainFlexModalView = this.b;
        switch (i) {
            case 0:
                MtMainFlexModalView.updateCurrentBackground$lambda$0(mtMainFlexModalView);
                break;
            case 1:
                MtMainFlexModalView.onAttachedToWindow$lambda$2(mtMainFlexModalView);
                break;
            case 2:
                mtMainFlexModalView.updateExpandedSheetScrim();
                break;
            case 3:
                mtMainFlexModalView.onBackPressed();
                break;
            case 4:
                mtMainFlexModalView.scrimAfterUserExpand = false;
                mtMainFlexModalView.userSheetGestureInProgress = false;
                mtMainFlexModalView.updateExpandedSheetScrim();
                break;
            case 5:
                mtMainFlexModalView.updateSheetOverHeaderZOrder();
                break;
            default:
                mtMainFlexModalView.updateExpandedSheetScrim();
                break;
        }
    }
}
