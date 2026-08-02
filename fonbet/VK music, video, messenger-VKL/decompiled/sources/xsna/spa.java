package xsna;

import android.content.Context;
import android.view.View;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeObsceneWord;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.dw20;

/* compiled from: CensoredSpan.kt */
/* loaded from: classes16.dex */
public final class spa extends qaz {
    public int m;
    public String n;

    /* JADX WARN: Type inference failed for: r11v18, types: [T, xsna.dw20] */
    /* JADX WARN: Type inference failed for: r11v8, types: [T, xsna.dw20] */
    @Override // xsna.qaz, xsna.rku0
    public final void f(Context context, View view) {
        Integer valueOf = Integer.valueOf(R.attr.vk_ui_icon_accent);
        if (context == null) {
            return;
        }
        if (this.c != null) {
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = new dw20.b(context, null).M(R.drawable.vk_icon_rude_message_outline_56, valueOf).v0(R.string.obscene_warning_title).r0(R.string.obscene_reveal_message).h0(R.string.obscene_reveal_button, new p5(6, this, ref$ObjectRef)).I0(null);
        } else {
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            ref$ObjectRef2.element = new dw20.b(context, null).M(R.drawable.vk_icon_rude_message_outline_56, valueOf).v0(R.string.obscene_warning_title).r0(R.string.obscene_warning_message).h0(R.string.obscene_warning_button, new h9(ref$ObjectRef2, 11)).I0(null);
        }
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), new MobileOfficialAppsFeedStat$TypeObsceneWord(this.n), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }

    @Override // xsna.qaz, xsna.rku0
    public final void a(Context context, View view) {
    }
}
