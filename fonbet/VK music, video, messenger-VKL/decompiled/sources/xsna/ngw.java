package xsna;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import com.vk.core.view.search.RoundedSearchView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class ngw implements TextView.OnEditorActionListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ngw(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        int i2 = this.b;
        Object obj = this.c;
        switch (i2) {
            case 0:
                ogw ogwVar = (ogw) obj;
                if (i != 4) {
                    return false;
                }
                ogwVar.c.a(ogwVar.d.getText().toString());
                return true;
            default:
                RoundedSearchView roundedSearchView = (RoundedSearchView) obj;
                if (i != 3) {
                    int i3 = RoundedSearchView.k;
                    return false;
                }
                izs<? super String, s3q0> izsVar = roundedSearchView.g;
                if (izsVar != null) {
                    izsVar.invoke(roundedSearchView.getQuery());
                }
                EditText editText = roundedSearchView.d;
                mhy.d(editText);
                if (editText != null) {
                    editText.clearFocus();
                }
                return true;
        }
    }
}
