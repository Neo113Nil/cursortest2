package xsna;

import android.text.TextUtils;
import android.view.View;
import com.vkontakte.android.R;
import xsna.iut0;

/* compiled from: ViewCompat.java */
/* loaded from: classes11.dex */
public final class gut0 extends iut0.b<CharSequence> {
    public gut0() {
        super(R.id.tag_state_description, CharSequence.class, 64, 30);
    }

    @Override // xsna.iut0.b
    public final CharSequence a(View view) {
        return iut0.j.b(view);
    }

    @Override // xsna.iut0.b
    public final void b(View view, CharSequence charSequence) {
        iut0.j.d(view, charSequence);
    }

    @Override // xsna.iut0.b
    public final boolean e(CharSequence charSequence, CharSequence charSequence2) {
        return !TextUtils.equals(charSequence, charSequence2);
    }
}
