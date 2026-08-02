package com.yandex.passport.internal.ui;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.yandex.passport.internal.ui.social.SocialBindingFragment;
import com.yandex.passport.internal.ui.social.SocialFragment;
import com.yandex.passport.internal.ui.social.mail.MailPasswordLoginFragment;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                ((BaseActivity) obj).lambda$showInvalidSignatureDialog$2(dialogInterface, i);
                break;
            case 1:
                ((YxAuthActivity) obj).finishAffinity();
                break;
            case 2:
                SocialBindingFragment.onErrorCode$lambda$3((SocialBindingFragment) obj, dialogInterface, i);
                break;
            case 3:
                SocialFragment.onErrorCode$lambda$2((FragmentActivity) obj, dialogInterface, i);
                break;
            default:
                ((MailPasswordLoginFragment) obj).authorize();
                break;
        }
    }
}
