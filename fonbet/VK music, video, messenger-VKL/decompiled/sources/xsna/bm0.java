package xsna;

import android.text.Editable;
import android.text.TextWatcher;
import com.vkontakte.android.actionlinks.views.fragments.add.AddLinkPresenter;
import com.vkontakte.android.actionlinks.views.holders.search.ItemSearch$ItemSearchListener$Mode;

/* compiled from: TextView.kt */
/* loaded from: classes7.dex */
public final class bm0 implements TextWatcher {
    public final /* synthetic */ cm0 b;

    public bm0(cm0 cm0Var) {
        this.b = cm0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (xsna.brm0.B(r1, "@", false) == false) goto L7;
     */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        AddLinkPresenter.c cVar;
        String valueOf = String.valueOf(charSequence);
        boolean z = valueOf.length() == 0;
        AddLinkPresenter addLinkPresenter = this.b.d;
        if (addLinkPresenter == null || (cVar = addLinkPresenter.o) == null) {
            return;
        }
        cVar.a(valueOf, z ? ItemSearch$ItemSearchListener$Mode.LINK : ItemSearch$ItemSearchListener$Mode.USER);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
