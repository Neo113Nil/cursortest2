package com.yandex.passport.internal.ui;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.yandex.passport.internal.ui.authbytrack.AuthByTrackActivity;
import com.yandex.passport.internal.ui.challenge.delete.DeleteForeverActivity;
import com.yandex.passport.internal.ui.social.SocialFragment;
import com.yandex.passport.internal.ui.tv.AuthInWebViewFragment;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((BaseActivity) obj).lambda$showInvalidSignatureDialog$3(dialogInterface);
                break;
            case 1:
                AuthByTrackActivity.showErrorDialog$lambda$7((AuthByTrackActivity) obj, dialogInterface);
                break;
            case 2:
                DeleteForeverActivity.showPhonishDialog$lambda$7((DeleteForeverActivity) obj, dialogInterface);
                break;
            case 3:
                SocialFragment.onErrorCode$lambda$3((FragmentActivity) obj, dialogInterface);
                break;
            default:
                ((AuthInWebViewFragment) obj).finishCancelled();
                break;
        }
    }
}
