package xsna;

import android.view.View;
import android.widget.TextView;
import com.vk.superapp.ui.widgets.miniwidgets.MiniWidgetItem;
import com.vk.superapp.ui.widgets.miniwidgets.SettingsMiniWidget;
import com.vkontakte.android.R;

/* compiled from: SettingsMiniWidgetHolder.kt */
/* loaded from: classes6.dex */
public final class z2j0 extends ucn0<bjf0> {
    public final jr20 p;
    public final TextView q;

    public z2j0(View view, jr20 jr20Var) {
        super(view, null);
        this.p = jr20Var;
        TextView textView = (TextView) this.itemView.findViewById(R.id.title);
        this.q = textView;
        bwt0.i0(view, new q9i0(this, 1));
        bwt0.k0(view, new hb40(this, 18));
        textView.setTextSize(1, 13.0f);
    }

    @Override // xsna.hf6
    public final void W5(zif0 zif0Var) {
        MiniWidgetItem miniWidgetItem = ((bjf0) zif0Var).a;
        if (miniWidgetItem instanceof SettingsMiniWidget) {
            SettingsMiniWidget settingsMiniWidget = (SettingsMiniWidget) miniWidgetItem;
            String str = settingsMiniWidget.m;
            TextView textView = this.q;
            textView.setText(str);
            textView.setContentDescription(brm0.y(settingsMiniWidget.m, "\n", ""));
        }
    }
}
