package defpackage;

import android.content.res.ColorStateList;
import android.widget.TextView;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes14.dex */
public final class gjk0 extends qpk0 {
    public static final /* synthetic */ int T = 0;
    public final TextView R;
    public kdc S;

    public gjk0(TextView textView) {
        super(textView);
        this.R = textView;
    }

    @Override // defpackage.xwy0, defpackage.nwy0
    public final void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        kdc kdcVar = this.S;
        if (kdcVar != null) {
            TextView textView = this.R;
            textView.setBackgroundTintList(ColorStateList.valueOf(s8o.m(kdcVar, textView.getContext())));
        }
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        fjk0 fjk0Var = (fjk0) obj;
        this.S = fjk0Var.b;
        String str = fjk0Var.c;
        TextView textView = this.R;
        textView.setText(str);
        kdc kdcVar = this.S;
        if (kdcVar != null) {
            textView.setBackgroundTintList(ColorStateList.valueOf(s8o.m(kdcVar, textView.getContext())));
        }
    }
}
