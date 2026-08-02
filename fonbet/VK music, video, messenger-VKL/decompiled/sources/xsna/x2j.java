package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import xsna.dw20;

/* compiled from: ConfirmUnsubscribeBottomSheet.kt */
/* loaded from: classes2.dex */
public final class x2j extends kq6 {
    public final Context c;
    public final String d;
    public final SchemeStat$EventItem e;
    public final ura f;

    public x2j(Context context, String str, SchemeStat$EventItem schemeStat$EventItem, ura uraVar) {
        this.c = context;
        this.d = str;
        this.e = schemeStat$EventItem;
        this.f = uraVar;
    }

    @Override // xsna.kq6
    public final dw20 a() {
        dw20.b bVar = new dw20.b(this.c, tzp0.a(this.e, 2));
        dhr0.a.getClass();
        View inflate = LayoutInflater.from(dhr0.E()).inflate(R.layout.video_unsubscribe_confirm_bottom_sheet, (ViewGroup) null, false);
        ((TextView) inflate.findViewById(R.id.unsubscribe_title)).setText(this.d);
        hvt0.a(R.id.unsubscribe_text, inflate, new nvg(this, 8));
        hvt0.a(R.id.cancel, inflate, new jm0(this, 19));
        return bVar.D0(inflate, false).a0(new h20(this, 23)).P0().I0(null);
    }
}
