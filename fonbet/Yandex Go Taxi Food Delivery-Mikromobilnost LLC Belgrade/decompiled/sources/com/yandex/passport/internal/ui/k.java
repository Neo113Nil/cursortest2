package com.yandex.passport.internal.ui;

import android.content.Context;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatDialog;
import com.yandex.passport.R;

/* loaded from: classes2.dex */
public abstract class k {
    public static AppCompatDialog a(Context context) {
        AppCompatDialog appCompatDialog = new AppCompatDialog(context);
        appCompatDialog.setContentView(R.layout.passport_progress_dialog);
        appCompatDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.show();
        appCompatDialog.getWindow().setAttributes(layoutParams);
        return appCompatDialog;
    }
}
