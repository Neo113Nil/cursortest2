package xsna;

import android.view.View;
import com.vk.core.view.search.RoundedSearchView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class l9a0 implements View.OnFocusChangeListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l9a0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                s1x s1xVar = (s1x) obj;
                if (z) {
                    s1xVar.invoke();
                    break;
                }
                break;
            default:
                RoundedSearchView roundedSearchView = (RoundedSearchView) obj;
                if (!z) {
                    int i2 = RoundedSearchView.k;
                    break;
                } else {
                    View.OnClickListener onClickListener = roundedSearchView.f;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        break;
                    }
                }
                break;
        }
    }
}
