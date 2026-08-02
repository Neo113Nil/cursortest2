package defpackage;

import android.animation.AnimatorInflater;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.qr.payments.internal.screens.list.presentation.view.SelectorListView;
import com.ybsdk.feature.qr.payments.internal.utils.DrawableSize;
import com.ybsdk.feature.settings.api.SettingsTheme;
import com.ybsdk.feature.settings.internal.view.SettingsThemeView;
import com.ybsdk.widgets.common.checkbox.CheckBoxView;
import com.ybsdk.widgets.common.g;
import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import defpackage.tls;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final /* synthetic */ class ms3 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ n70 b;
    public final /* synthetic */ tls c;

    public /* synthetic */ ms3(int i, n70 n70Var, tls tlsVar) {
        this.a = i;
        this.b = n70Var;
        this.c = tlsVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 10;
        int i3 = 8;
        zy11 zy11Var = zy11.a;
        final tls tlsVar = this.c;
        n70 n70Var = this.b;
        switch (i) {
            case 0:
                uz51 uz51Var = (uz51) n70Var.N;
                v4b1.k(((ks3) n70Var.Z()).c, uz51Var.c, null, null, 6);
                AppCompatImageView appCompatImageView = uz51Var.b;
                appCompatImageView.setContentDescription(n70Var.P.getString(dzh0.ybsdk_settings_accessibility_bank_delete, Arrays.copyOf(new Object[]{((ks3) n70Var.Z()).b}, 1)));
                tja1.b(appCompatImageView);
                appCompatImageView.setOnClickListener(new os3(0, n70Var, tlsVar));
                ShimmerFrameLayout shimmerFrameLayout = uz51Var.a;
                exa1.e(shimmerFrameLayout, new od8(2));
                int i4 = ps3.a[((ks3) n70Var.Z()).e.ordinal()];
                if (i4 == 1) {
                    shimmerFrameLayout.stopShimmer();
                } else {
                    if (i4 != 2) {
                        w511.b();
                        return null;
                    }
                    shimmerFrameLayout.startShimmer();
                }
                uz51Var.d.setText(((ks3) n70Var.Z()).b);
                return zy11Var;
            case 1:
                CalendarDayView calendarDayView = ((y161) n70Var.N).a;
                if7 if7Var = (if7) n70Var.Z();
                if (if7Var instanceof gf7) {
                    calendarDayView.render(null);
                    calendarDayView.setOnClickListener(null);
                } else {
                    if (!(if7Var instanceof hf7)) {
                        w511.b();
                        return null;
                    }
                    final ze7 ze7Var = ((hf7) if7Var).a;
                    calendarDayView.render(ze7Var);
                    calendarDayView.setOnClickListener(new View.OnClickListener() { // from class: com.ybsdk.widgets.common.rangedatepicker.a
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ((RangeDatePickerCalendarView$calendarAdapter$2) tls.this).invoke(ze7Var.a);
                        }
                    });
                }
                return zy11Var;
            case 2:
                zo31 zo31Var = n70Var.N;
                Context context = n70Var.P;
                ((v661) zo31Var).a.setOnClickListener(new os3(1, n70Var, tlsVar));
                v661 v661Var = (v661) n70Var.N;
                v661Var.a.setTag(((qsz0) n70Var.Z()).c.name());
                rbv rbvVar = ((qsz0) n70Var.Z()).e;
                ImageView imageView = v661Var.a;
                v4b1.k(rbvVar, imageView, null, null, 6);
                Text text = ((qsz0) n70Var.Z()).f;
                if (text != null) {
                    imageView.setContentDescription(d.a(context, text));
                }
                imageView.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, smg0.ybsdk_click_scale_animator));
                return zy11Var;
            case 3:
                n261 n261Var = (n261) n70Var.N;
                xty0.d(n261Var.d, ((v6r0) n70Var.Z()).b);
                xty0.d(n261Var.c, ((v6r0) n70Var.Z()).c);
                v4b1.k(((v6r0) n70Var.Z()).d, n261Var.b, null, null, 6);
                n261Var.a.setOnClickListener(new os3(6, n70Var, tlsVar));
                return zy11Var;
            case 4:
                q261 q261Var = (q261) n70Var.N;
                c9r0 c9r0Var = (c9r0) n70Var.Z();
                TextView textView = q261Var.c;
                Text text2 = c9r0Var.b;
                ConstraintLayout constraintLayout = q261Var.a;
                textView.setText(d.a(constraintLayout.getContext(), text2));
                c9r0 c9r0Var2 = (c9r0) n70Var.Z();
                TextView textView2 = q261Var.b;
                Text text3 = c9r0Var2.c;
                textView2.setText(text3 != null ? d.a(constraintLayout.getContext(), text3) : null);
                c9r0 c9r0Var3 = (c9r0) n70Var.Z();
                a5p0 a5p0Var = (c9r0Var3.f && c9r0Var3.d) ? new a5p0(23, tlsVar, c9r0Var3) : null;
                constraintLayout.setOnClickListener(a5p0Var != null ? new eaj0(16, a5p0Var) : null);
                return zy11Var;
            case 5:
                w261 w261Var = (w261) n70Var.N;
                CheckBoxView checkBox = w261Var.c.getCheckBox();
                SettingsTheme settingsTheme = ((fer0) n70Var.Z()).b;
                SettingsTheme settingsTheme2 = SettingsTheme.LIGHT;
                checkBox.setChecked(settingsTheme == settingsTheme2);
                SettingsThemeView settingsThemeView = w261Var.b;
                SettingsThemeView settingsThemeView2 = w261Var.c;
                SettingsThemeView settingsThemeView3 = w261Var.d;
                CheckBoxView checkBox2 = settingsThemeView.getCheckBox();
                SettingsTheme settingsTheme3 = ((fer0) n70Var.Z()).b;
                SettingsTheme settingsTheme4 = SettingsTheme.DARK;
                checkBox2.setChecked(settingsTheme3 == settingsTheme4);
                CheckBoxView checkBox3 = settingsThemeView3.getCheckBox();
                SettingsTheme settingsTheme5 = ((fer0) n70Var.Z()).b;
                SettingsTheme settingsTheme6 = SettingsTheme.SYSTEM;
                checkBox3.setChecked(settingsTheme5 == settingsTheme6);
                settingsThemeView2.setA11yText(((fer0) n70Var.Z()).b == settingsTheme2);
                settingsThemeView.setA11yText(((fer0) n70Var.Z()).b == settingsTheme4);
                settingsThemeView3.setA11yText(((fer0) n70Var.Z()).b == settingsTheme6);
                settingsThemeView2.setOnCheckedListener(new uwl0(i3, tlsVar));
                settingsThemeView.setOnCheckedListener(new uwl0(9, tlsVar));
                settingsThemeView3.setOnCheckedListener(new uwl0(i2, tlsVar));
                return zy11Var;
            case 6:
                ((oa61) n70Var.N).b.render(((r9u0) n70Var.Z()).a);
                ((oa61) n70Var.N).b.setOnClickListener(new os3(7, n70Var, tlsVar));
                return zy11Var;
            case 7:
                SelectorListView selectorListView = ((k461) n70Var.N).a;
                selectorListView.render(new llq0(((llq0) n70Var.Z()).a));
                selectorListView.setOnSelectorClickListener(new uwl0(17, tlsVar));
                return zy11Var;
            case 8:
                zo31 zo31Var2 = n70Var.N;
                Context context2 = n70Var.P;
                x461 x461Var = (x461) zo31Var2;
                if (((p0v0) n70Var.Z()).d == null) {
                    x461Var.c.setBackgroundDrawable(pic.a(context2, ((p0v0) n70Var.Z()).b, context2.getResources().getDimensionPixelSize(vvg0.ybsdk_clickable_icon_size), DrawableSize.SMALL));
                } else {
                    v4b1.k(((p0v0) n70Var.Z()).d, x461Var.c, null, null, 6);
                }
                AppCompatImageView appCompatImageView2 = x461Var.e;
                TextView textView3 = x461Var.b;
                appCompatImageView2.setContentDescription(context2.getString(dzh0.ybsdk_settings_accessibility_bank_delete, Arrays.copyOf(new Object[]{((p0v0) n70Var.Z()).b}, 1)));
                tja1.b(appCompatImageView2);
                appCompatImageView2.setOnClickListener(new os3(8, n70Var, tlsVar));
                ShimmerFrameLayout shimmerFrameLayout2 = x461Var.a;
                exa1.e(shimmerFrameLayout2, new od8(2));
                int i5 = c1v0.a[((p0v0) n70Var.Z()).e.ordinal()];
                if (i5 == 1) {
                    shimmerFrameLayout2.stopShimmer();
                } else {
                    if (i5 != 2) {
                        w511.b();
                        return null;
                    }
                    shimmerFrameLayout2.startShimmer();
                }
                x461Var.d.setText(((p0v0) n70Var.Z()).b);
                textView3.setText(((p0v0) n70Var.Z()).c);
                String str = ((p0v0) n70Var.Z()).c;
                if (str != null && str.length() > 0) {
                    i3 = 0;
                }
                textView3.setVisibility(i3);
                return zy11Var;
            case 9:
                return g.a((g) obj, ((la21) n70Var.Z()).a.d, null, false, ((la21) n70Var.Z()).a.f, ((la21) n70Var.Z()).a.b, null, rtu.a(tlsVar, d.a(((b361) n70Var.N).a.getContext(), ((la21) n70Var.Z()).a.c).toString()), ((la21) n70Var.Z()).a.e, null, null, null, false, null, null, false, 0, false, 0, 0, null, null, null, 33554214);
            default:
                d361 d361Var = (d361) n70Var.N;
                d361Var.b.setText(((tb21) n70Var.Z()).a);
                d361Var.b.setOnClickListener(new os3(10, n70Var, tlsVar));
                return zy11Var;
        }
    }
}
