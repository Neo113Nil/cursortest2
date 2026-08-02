package androidx.appcompat.widget;

/* loaded from: classes10.dex */
public final class g implements Runnable {
    public final /* synthetic */ DropDownListView a;

    public g(DropDownListView dropDownListView) {
        this.a = dropDownListView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DropDownListView dropDownListView = this.a;
        dropDownListView.mResolveHoverRunnable = null;
        dropDownListView.drawableStateChanged();
    }
}
