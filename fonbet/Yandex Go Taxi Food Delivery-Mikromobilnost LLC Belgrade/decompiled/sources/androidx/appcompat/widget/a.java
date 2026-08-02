package androidx.appcompat.widget;

import android.view.ViewParent;
import androidx.cursoradapter.widget.CursorAdapter;

/* loaded from: classes10.dex */
public final class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((AbsActionBarView) obj).showOverflowMenu();
                break;
            case 1:
                ViewParent parent = ((ForwardingListener) obj).mSrc.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                CursorAdapter cursorAdapter = ((SearchView) obj).mSuggestionsAdapter;
                if (cursorAdapter instanceof SuggestionsAdapter) {
                    cursorAdapter.changeCursor(null);
                    break;
                }
                break;
        }
    }
}
