package androidx.appcompat.widget;

/* loaded from: classes.dex */
public final class h implements Runnable {
    public final /* synthetic */ i a;

    public h(i iVar) {
        this.a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DropDownListView dropDownListView = this.a.c;
        if (dropDownListView != null) {
            dropDownListView.setListSelectionHidden(true);
            dropDownListView.requestLayout();
        }
    }
}
