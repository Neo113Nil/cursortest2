package xsna;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.vkontakte.android.R;

/* compiled from: MultiPickerOnTabSelectedListener.kt */
/* loaded from: classes18.dex */
public final class w540 implements TabLayout.d {
    public final Context b;
    public final q8 c;

    public w540(Context context, q8 q8Var) {
        this.b = context;
        this.c = q8Var;
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void Wd(TabLayout.g gVar) {
        a(gVar, R.attr.vk_ui_text_primary);
    }

    public final void a(TabLayout.g gVar, int i) {
        View view;
        TextView textView;
        if ((gVar != null ? gVar.f : null) == null || (view = gVar.f) == null || (textView = (TextView) view.findViewById(R.id.title)) == null) {
            return;
        }
        textView.setTypeface(null, 1);
        textView.setTextColor(e3m.f(i, this.b));
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void hl(TabLayout.g gVar) {
        if ((gVar != null ? gVar.f : null) != null) {
            this.c.invoke(gVar.h);
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void za(TabLayout.g gVar) {
        a(gVar, R.attr.vk_ui_text_secondary);
    }
}
