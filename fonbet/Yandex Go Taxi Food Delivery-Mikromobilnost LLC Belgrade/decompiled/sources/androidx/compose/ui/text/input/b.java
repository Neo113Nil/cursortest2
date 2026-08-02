package androidx.compose.ui.text.input;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import defpackage.f0w;
import defpackage.i3y;
import defpackage.sls;
import defpackage.va90;
import kotlin.LazyThreadSafetyMode;

/* loaded from: classes.dex */
public final class b implements f0w {
    public final View a;
    public final i3y b = kotlin.a.b(LazyThreadSafetyMode.NONE, new sls() { // from class: androidx.compose.ui.text.input.InputMethodManagerImpl$imm$2
        {
            super(0);
        }

        @Override // defpackage.sls
        public final Object invoke() {
            return (InputMethodManager) b.this.a.getContext().getSystemService("input_method");
        }
    });
    public final va90 c;

    public b(View view) {
        this.a = view;
        this.c = new va90(view);
    }
}
