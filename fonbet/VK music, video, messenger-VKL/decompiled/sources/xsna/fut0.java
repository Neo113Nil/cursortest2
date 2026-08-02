package xsna;

import android.text.TextUtils;
import android.view.View;
import com.vkontakte.android.R;
import xsna.iut0;

/* compiled from: ViewCompat.java */
/* loaded from: classes11.dex */
public final class fut0 extends iut0.b<CharSequence> {
    public fut0() {
        super(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    @Override // xsna.iut0.b
    public final CharSequence a(View view) {
        return iut0.h.b(view);
    }

    @Override // xsna.iut0.b
    public final void b(View view, CharSequence charSequence) {
        iut0.h.g(view, charSequence);
    }

    @Override // xsna.iut0.b
    public final boolean e(CharSequence charSequence, CharSequence charSequence2) {
        return !TextUtils.equals(charSequence, charSequence2);
    }
}
