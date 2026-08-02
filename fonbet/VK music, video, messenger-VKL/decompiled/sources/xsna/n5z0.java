package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class n5z0 extends m4z0 {
    public TextView m;
    public TextView n;

    @Override // xsna.e0z0
    public final void a(String str, String str2, String str3, String str4, ArrayList arrayList) {
        TextView textView = this.m;
        if (textView != null) {
            if (TextUtils.isEmpty(str)) {
                str = "Объявление скрыто";
            }
            textView.setText(str);
        }
        TextView textView2 = this.n;
        if (textView2 != null) {
            if (TextUtils.isEmpty(str2)) {
                str2 = "Мы используем ваши ответы, чтобы подбирать для вас подходящую рекламу";
            }
            textView2.setText(str2);
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = "Уточните причину";
        }
        this.f.setText(str3);
        if (TextUtils.isEmpty(str4)) {
            str4 = "Отправить";
        }
        Button button = this.d;
        button.setText(str4);
        b(arrayList);
        button.setOnClickListener(new mo3(this, 21));
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
        int i2 = ujz0Var.a.get(ujz0.v);
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
        LinearLayout a = io.reactivex.rxjava3.internal.operators.observable.q1.a(1, context);
        a.addView(this.g);
        ImageView imageView = new ImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i = ujz0.y;
        ujz0 ujz0Var = this.c;
        int i2 = ujz0Var.a.get(i);
        layoutParams.setMargins(i2, 0, i2, 0);
        layoutParams.gravity = 1;
        imageView.setLayoutParams(layoutParams);
        int i3 = ujz0.F;
        SparseIntArray sparseIntArray = ujz0Var.a;
        imageView.setImageBitmap(hpy0.a(context, "M28 4C41.2548 4 52 14.7452 52 28C52 41.2548 41.2548 52 28 52C14.7452 52 4 41.2548 4 28C4 14.7452 14.7452 4 28 4ZM28 7C16.402 7 7 16.402 7 28C7 39.598 16.402 49 28 49C39.598 49 49 39.598 49 28C49 16.402 39.598 7 28 7ZM36.9393 20.9393C37.5251 20.3536 38.4749 20.3536 39.0607 20.9393C39.6464 21.5251 39.6464 22.4749 39.0607 23.0607L25.0607 37.0607C24.4749 37.6464 23.5251 37.6464 22.9393 37.0607L15.9393 30.0607C15.3536 29.4749 15.3536 28.5251 15.9393 27.9393C16.5251 27.3536 17.4749 27.3536 18.0607 27.9393L24 33.8787L36.9393 20.9393Z", sparseIntArray.get(i3), -1));
        int i4 = rvy0.G;
        rvy0 rvy0Var = this.j;
        imageView.setColorFilter(rvy0Var.a.get(i4));
        a.addView(imageView);
        this.m = e(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        int i5 = sparseIntArray.get(i);
        layoutParams2.setMargins(i5, sparseIntArray.get(ujz0.n), i5, 0);
        this.m.setLayoutParams(layoutParams2);
        a.addView(this.m);
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        int i6 = sparseIntArray.get(i);
        layoutParams3.setMargins(i6, sparseIntArray.get(ujz0.i), i6, 0);
        textView.setLayoutParams(layoutParams3);
        textView.setTextAlignment(4);
        textView.setTextColor(rvy0Var.a.get(rvy0.v));
        textView.setTextSize(sparseIntArray.get(ujz0.S));
        this.n = textView;
        a.addView(textView);
        return a;
    }

    @Override // xsna.m4z0
    @NonNull
    public String getActionText() {
        return "Отправить";
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
