package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import com.vkontakte.android.R;
import java.util.List;
import xsna.av20;
import xsna.dw20;

/* compiled from: CommunityIconLessBottomSheetMenu.kt */
/* loaded from: classes5.dex */
public abstract class o4h {
    public dw20 a;

    public abstract List<e520> a();

    public abstract String b();

    public abstract void c(e520 e520Var);

    public final void d(Context context) {
        o1e o1eVar = new o1e(this, 5);
        int f = e3m.f(R.attr.vk_ui_text_primary, context);
        int f2 = e3m.f(R.attr.vk_ui_background_negative, context);
        av20.a aVar = new av20.a();
        aVar.d(R.layout.actions_popup_item, LayoutInflater.from(context));
        aVar.d = new m4h(context, f2, f);
        aVar.e = new n4h(o1eVar);
        av20 b = aVar.b();
        b.setItems(a());
        this.a = ((dw20.b) dw20.a.k(new dw20.b(context, null), b, 4)).I0(b());
    }
}
