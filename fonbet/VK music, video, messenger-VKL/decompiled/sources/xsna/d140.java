package xsna;

import android.content.Context;
import android.graphics.Insets;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.NumberPicker;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.lang.reflect.Field;
import java.util.concurrent.TimeUnit;
import xsna.d98;
import xsna.e3m;

/* compiled from: MsgTypePopup.kt */
/* loaded from: classes2.dex */
public final class d140 implements d98.b {
    public NumberPicker a;
    public boolean b;
    public final /* synthetic */ e140 c;

    public d140(e140 e140Var) {
        this.c = e140Var;
    }

    @Override // xsna.d98.b
    public final void B0(float f) {
        if (this.b) {
            return;
        }
        e140 e140Var = this.c;
        if (f4m.g(e140Var.k)) {
            d3m.c(e140Var.k, (r15 & 1) != 0 ? 300L : 200L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    @Override // xsna.d98.b
    public final int C0() {
        return 0;
    }

    @Override // xsna.d98.b
    public final void D0() {
        NumberPicker numberPicker = this.a;
        if (numberPicker == null) {
            numberPicker = null;
        }
        int value = numberPicker.getValue();
        cew.b.getClass();
        cew.h().edit().putInt("pref_message_expiration_option_index", value).apply();
        this.c.d();
    }

    @Override // xsna.d98.b
    public final void F0(FrameLayout frameLayout) {
        final e140 e140Var = this.c;
        View inflate = ((LayoutInflater) e140Var.c.getValue()).inflate(R.layout.vkim_msg_time_bottom_sheet_content, (ViewGroup) frameLayout, true);
        NumberPicker numberPicker = (NumberPicker) inflate.findViewById(R.id.number_picker);
        this.a = numberPicker;
        Context context = inflate.getContext();
        e3m.a aVar = e3m.a;
        Drawable a = m33.a(R.drawable.ic_time_picker_divider, context);
        if (!gz80.a(29)) {
            try {
                Field declaredField = NumberPicker.class.getDeclaredField("mSelectionDivider");
                declaredField.setAccessible(true);
                declaredField.set(numberPicker, a);
                Field declaredField2 = NumberPicker.class.getDeclaredField("mSelectionDividerHeight");
                declaredField2.setAccessible(true);
                declaredField2.set(numberPicker, Integer.valueOf(a.getIntrinsicHeight()));
            } catch (Exception unused) {
            }
        }
        NumberPicker numberPicker2 = this.a;
        if (numberPicker2 == null) {
            numberPicker2 = null;
        }
        numberPicker2.setMinValue(0);
        long[] jArr = e140Var.r;
        numberPicker2.setMaxValue(jArr.length - 1);
        int length = jArr.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            g6b g6bVar = e140Var.g;
            long j = jArr[i];
            Context context2 = (Context) g6bVar.b;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            strArr[i] = timeUnit.toSeconds(j) < 60 ? enj.f(R.plurals.duration_accessibility_seconds, (int) timeUnit.toSeconds(j), context2) : timeUnit.toMinutes(j) < 60 ? enj.f(R.plurals.duration_accessibility_minutes, (int) timeUnit.toMinutes(j), context2) : enj.f(R.plurals.duration_accessibility_hours, (int) timeUnit.toHours(j), context2);
        }
        numberPicker2.setDisplayedValues(strArr);
        cew.b.getClass();
        numberPicker2.setValue(cew.h().getInt("pref_message_expiration_option_index", 0));
        TextView textView = (TextView) inflate.findViewById(R.id.cancel_btn);
        textView.setTextColor(e140Var.t);
        bwt0.i0(textView, new b140(e140Var, 0));
        e140Var.u = textView;
        TextView textView2 = (TextView) inflate.findViewById(R.id.send_with_expiration_btn);
        textView2.setTextColor(e140Var.t);
        bwt0.i0(textView2, new ju(12, e140Var, this));
        e140Var.v = textView2;
        final ViewGroup viewGroup = (ViewGroup) inflate.findViewById(R.id.modal_window);
        inflate.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: xsna.c140
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                Insets mandatorySystemGestureInsets;
                int i2;
                e140 e140Var2 = e140Var;
                int i3 = e140Var2.a;
                int i4 = e140Var2.b;
                if (Build.VERSION.SDK_INT < 29) {
                    return windowInsets;
                }
                mandatorySystemGestureInsets = windowInsets.getMandatorySystemGestureInsets();
                i2 = mandatorySystemGestureInsets.bottom;
                int a2 = iah0.a(8) + i2;
                int i5 = ify.a;
                boolean e = ify.e(ify.c);
                ViewGroup viewGroup2 = viewGroup;
                if (e) {
                    if (viewGroup2 != null) {
                        f4m.v(i4 + a2, viewGroup2);
                    }
                    e140Var2.n = i3 + a2;
                    return windowInsets;
                }
                if (viewGroup2 != null) {
                    f4m.v(i4, viewGroup2);
                }
                e140Var2.n = i3;
                return windowInsets;
            }
        });
    }

    @Override // xsna.d98.b
    public final int G0() {
        return this.c.n;
    }

    @Override // xsna.d98.b
    public final boolean H0() {
        return true;
    }

    @Override // xsna.d98.b
    public final void a() {
        this.b = true;
        d3m.e(this.c.k, (r15 & 1) != 0 ? 300L : 200L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
    }

    @Override // xsna.d98.b
    public final void j() {
        this.b = false;
        this.c.d();
    }

    @Override // xsna.d98.b
    public final WindowManager.LayoutParams k() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, 2, 131072, 1);
        layoutParams.softInputMode = 1;
        return layoutParams;
    }

    @Override // xsna.d98.b
    public final void h() {
    }

    @Override // xsna.d98.b
    public final void i() {
    }

    @Override // xsna.d98.b
    public final void E0(FrameLayout frameLayout) {
    }
}
