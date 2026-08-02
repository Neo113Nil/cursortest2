package com.yandex.passport.internal.ui;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDialog;

/* loaded from: classes2.dex */
public final class m {
    public final Context a;
    public boolean b;
    public boolean c;
    public DialogInterface.OnCancelListener d;
    public String e;
    public String f;
    public CharSequence g;
    public DialogInterface.OnClickListener h;
    public CharSequence i;
    public DialogInterface.OnClickListener j;
    public final int k;

    public m(Context context, int i) {
        this.b = true;
        this.c = true;
        this.a = context;
        this.k = i;
    }

    public final AppCompatDialog a() {
        AppCompatDialog appCompatDialog = new AppCompatDialog(this.a);
        appCompatDialog.setOnCancelListener(this.d);
        appCompatDialog.setCancelable(this.b);
        appCompatDialog.setCanceledOnTouchOutside(this.c);
        appCompatDialog.setContentView(this.k);
        appCompatDialog.getWindow().setBackgroundDrawableResource(R.color.transparent);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.show();
        appCompatDialog.getWindow().setAttributes(layoutParams);
        Button button = (Button) appCompatDialog.findViewById(com.yandex.passport.R.id.button_dialog_negative);
        Button button2 = (Button) appCompatDialog.findViewById(com.yandex.passport.R.id.button_dialog_positive);
        TextView textView = (TextView) appCompatDialog.findViewById(com.yandex.passport.R.id.text_dialog_message);
        TextView textView2 = (TextView) appCompatDialog.findViewById(com.yandex.passport.R.id.text_dialog_title);
        button2.setOnClickListener(new l(0, this, appCompatDialog));
        button.setOnClickListener(new l(1, this, appCompatDialog));
        textView2.setVisibility(TextUtils.isEmpty(this.e) ? 8 : 0);
        textView2.setText(this.e);
        textView.setVisibility(0);
        textView.setText(this.f);
        button2.setVisibility(TextUtils.isEmpty(this.g) ? 8 : 0);
        button2.setText(this.g);
        button.setVisibility(TextUtils.isEmpty(this.i) ? 8 : 0);
        button.setText(this.i);
        return appCompatDialog;
    }

    public final void b() {
        this.b = false;
    }

    public final void c() {
        this.c = false;
    }

    public final void d(int i) {
        this.f = this.a.getString(i);
    }

    public final void e(int i, DialogInterface.OnClickListener onClickListener) {
        this.g = this.a.getText(i);
        this.h = onClickListener;
    }

    public final void f(int i) {
        this.e = this.a.getString(i);
    }

    public m(Context context) {
        this(context, com.yandex.passport.R.layout.passport_warning_dialog);
    }
}
