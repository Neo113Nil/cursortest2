package xsna;

import android.text.Editable;
import android.text.TextWatcher;
import com.vk.search.ui.api.SearchQuery;
import xsna.vrh0;

/* compiled from: TextView.kt */
/* loaded from: classes5.dex */
public final class fmg implements TextWatcher {
    public final /* synthetic */ emg b;

    public fmg(emg emgVar) {
        this.b = emgVar;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        vrh0.a aVar = this.b.d;
        if (aVar != null) {
            String obj = charSequence != null ? charSequence.toString() : null;
            if (obj == null) {
                obj = "";
            }
            aVar.b(new SearchQuery(obj, null, null, null, 14, null));
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
