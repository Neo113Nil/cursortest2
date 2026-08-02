package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import com.vk.libvideo.bottomsheet.notifications.SubscriptionAction;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import xsna.av20;
import xsna.dw20;

/* compiled from: NotificationsSubscriptionsBottomSheet.kt */
/* loaded from: classes2.dex */
public final class ik70 extends kq6 {
    public final Context c;
    public final List<sym0> d;
    public final izs<SubscriptionAction, s3q0> e;
    public final int f;
    public final p7x g;
    public final izs<String, s3q0> h;

    /* compiled from: NotificationsSubscriptionsBottomSheet.kt */
    public static final class a {
        public final SubscriptionAction a;
        public final int b;
        public final Integer c;
        public final int d;
        public final Integer e;
        public final boolean f;

        public a(SubscriptionAction subscriptionAction, int i, Integer num, int i2, Integer num2, boolean z) {
            this.a = subscriptionAction;
            this.b = i;
            this.c = num;
            this.d = i2;
            this.e = num2;
            this.f = z;
        }
    }

    public ik70(Context context, List list, izs izsVar, yad yadVar, int i) {
        p7x p7xVar = new p7x(13);
        izs c3vVar = (i & 32) != 0 ? new c3v(8) : yadVar;
        this.c = context;
        this.d = list;
        this.e = izsVar;
        this.f = R.string.notifications_subscribe;
        this.g = p7xVar;
        this.h = c3vVar;
    }

    @Override // xsna.kq6
    public final dw20 a() {
        List<sym0> list = this.d;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (sym0 sym0Var : list) {
            arrayList.add(new a(sym0Var.a, sym0Var.b, sym0Var.c, sym0Var.d, sym0Var.e, sym0Var.f));
        }
        av20.a aVar = new av20.a();
        Context context = this.c;
        aVar.d(R.layout.video_modal_menu_item, LayoutInflater.from(context));
        aVar.d = new jk70(context);
        aVar.c(new coj(this, 4));
        av20 b = aVar.b();
        b.setItems(arrayList);
        dw20.b bVar = new dw20.b(context, null);
        bVar.v0(this.f);
        bVar.z0(8388611);
        bVar.A0(Integer.valueOf(R.style.VkUiTypography_FootnoteMedium));
        bVar.y0(dhr0.t.c(R.attr.vk_ui_text_subhead));
        bVar.a0(new hk70(this, 0));
        bVar.d0(new by20(this, 12));
        dw20.a.k(bVar, b, 4);
        return bVar.f0(new hs00(this, 12)).l(e3m.f(R.attr.vk_ui_background_modal, context)).I0("video_notifications_subscription");
    }
}
