package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class l6z0 extends m4z0 {
    public TextView m;

    @Override // xsna.e0z0
    public final void a(String str, String str2, String str3, String str4, ArrayList arrayList) {
        TextView textView = this.m;
        if (textView != null) {
            if (TextUtils.isEmpty(str)) {
                str = "Жалоба";
            }
            textView.setText(str);
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = "Уточните причину";
        }
        this.f.setText(str3);
        if (TextUtils.isEmpty(str4)) {
            str4 = "Отправить жалобу";
        }
        Button button = this.d;
        button.setText(str4);
        b(arrayList);
        button.setOnClickListener(new yg1(this, 13));
        try {
            j7z0 j7z0Var = new j7z0(this, getContext());
            this.b = new WeakReference(j7z0Var);
            j7z0Var.show();
        } catch (Throwable th) {
            th.printStackTrace();
            gu8.e(null, "AdChoicesOptionsController: Unable to start adchoices dialog");
            m();
        }
    }

    @Override // xsna.m4z0
    public final LinearLayout.LayoutParams d() {
        int i = ujz0.d;
        ujz0 ujz0Var = this.c;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, ujz0Var.a.get(i));
        int i2 = ujz0Var.a.get(ujz0.g);
        int i3 = ujz0Var.a.get(ujz0.r);
        layoutParams.setMargins(i3, i2, i3, 0);
        return layoutParams;
    }

    @Override // xsna.e0z0
    public final void dismiss() {
        j7z0 j7z0Var;
        WeakReference weakReference = this.b;
        if (weakReference == null || (j7z0Var = (j7z0) weakReference.get()) == null) {
            return;
        }
        j7z0Var.dismiss();
    }

    @Override // xsna.m4z0
    public final LinearLayout f(Context context) {
        LinearLayout a = io.reactivex.rxjava3.internal.operators.observable.q1.a(0, context);
        a.addView(this.g);
        this.m = e(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        this.m.setLayoutParams(layoutParams);
        a.addView(this.m);
        return a;
    }

    @Override // xsna.m4z0
    @NonNull
    public String getActionText() {
        return "Объявление скрыто";
    }

    @Override // xsna.m4z0, android.view.View.OnClickListener
    public final void onClick(View view) {
        mau mauVar;
        super.onClick(view);
        if (view != this.g || (mauVar = this.l.f) == null) {
            return;
        }
        ((pdz0) mauVar.c).resume();
    }
}
