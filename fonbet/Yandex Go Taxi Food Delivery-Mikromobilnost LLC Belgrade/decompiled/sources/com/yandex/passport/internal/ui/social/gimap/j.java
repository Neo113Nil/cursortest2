package com.yandex.passport.internal.ui.social.gimap;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.passport.internal.ui.social.mail.MailPasswordLoginFragment;

/* loaded from: classes2.dex */
public final /* synthetic */ class j implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ViewGroup) obj).invalidate();
                break;
            default:
                MailPasswordLoginFragment.onCreateView$lambda$0((MailPasswordLoginFragment) obj, view, z);
                break;
        }
    }
}
