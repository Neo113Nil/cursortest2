package xsna;

import android.view.View;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: ChatsListSelectorController.kt */
/* loaded from: classes2.dex */
public final class vzb {
    public final View a;
    public final View b;
    public final View c;
    public final TextView d;
    public final View e;
    public final TextView f;
    public final View g;
    public int h;

    public vzb(View view) {
        this.a = view;
        View findViewById = view.findViewById(R.id.settings_chats_list_2_lines);
        this.b = findViewById;
        this.c = view.findViewById(R.id.settings_chats_list_2_stroke);
        this.d = (TextView) view.findViewById(R.id.settings_chats_list_2_lines_title);
        View findViewById2 = view.findViewById(R.id.settings_chats_list_3_lines);
        this.e = findViewById2;
        this.f = (TextView) view.findViewById(R.id.settings_chats_list_3_lines_title);
        this.g = view.findViewById(R.id.settings_chats_list_3_stroke);
        zdw zdwVar = i7o0.b;
        (zdwVar == null ? null : zdwVar).u.getClass();
        this.h = cew.h().getInt("pref_dialogs_list_lines_number", 3);
        b();
        findViewById.setOnClickListener(new yb(this, 3));
        findViewById2.setOnClickListener(new uzb(this, 0));
    }

    public final void a(int i) {
        this.h = i;
        b();
        zdw zdwVar = i7o0.b;
        if (zdwVar == null) {
            zdwVar = null;
        }
        zdwVar.u.getClass();
        cew.h().edit().putInt("pref_dialogs_list_lines_number", i).apply();
        cew.g.onNext(Integer.valueOf(i));
    }

    public final void b() {
        int i = this.h;
        int i2 = R.attr.vk_legacy_text_primary;
        int i3 = R.attr.vk_legacy_accent;
        jno0.c(this.d, i == 2 ? R.attr.vk_legacy_accent : R.attr.vk_legacy_text_primary);
        if (this.h == 3) {
            i2 = R.attr.vk_legacy_accent;
        }
        jno0.c(this.f, i2);
        int i4 = this.h == 2 ? R.attr.vk_legacy_accent : R.attr.vk_legacy_background_keyboard;
        qcy<Object>[] qcyVarArr = bwt0.a;
        dhr0.f0(R.drawable.bg_square_rounded_20, i4, this.c);
        if (this.h != 3) {
            i3 = R.attr.vk_legacy_background_keyboard;
        }
        dhr0.f0(R.drawable.bg_square_rounded_20, i3, this.g);
    }
}
