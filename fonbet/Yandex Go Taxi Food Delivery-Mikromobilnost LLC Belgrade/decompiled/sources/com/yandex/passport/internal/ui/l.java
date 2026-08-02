package com.yandex.passport.internal.ui;

import android.content.DialogInterface;
import android.view.View;
import androidx.appcompat.app.AppCompatDialog;
import com.yandex.passport.internal.ModernAccount;

/* loaded from: classes2.dex */
public final /* synthetic */ class l implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                AppCompatDialog appCompatDialog = (AppCompatDialog) obj;
                DialogInterface.OnClickListener onClickListener = ((m) obj2).h;
                if (onClickListener != null) {
                    onClickListener.onClick(appCompatDialog, -1);
                }
                appCompatDialog.dismiss();
                break;
            case 1:
                AppCompatDialog appCompatDialog2 = (AppCompatDialog) obj;
                DialogInterface.OnClickListener onClickListener2 = ((m) obj2).j;
                if (onClickListener2 != null) {
                    onClickListener2.onClick(appCompatDialog2, -2);
                }
                appCompatDialog2.dismiss();
                break;
            default:
                AccountNotAuthorizedActivity.onCreate$lambda$3((AccountNotAuthorizedActivity) obj2, (ModernAccount) obj, view);
                break;
        }
    }
}
