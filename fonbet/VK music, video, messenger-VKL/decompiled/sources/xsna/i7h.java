package xsna;

import android.content.Context;
import android.util.Size;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.profile.community.subscription.api.tracker.SubscriptionEvent;
import com.vkontakte.android.R;
import java.util.List;
import xsna.ikv0;
import xsna.k840;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class i7h implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ i7h(Object obj, Object obj2, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        boolean z = this.c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                oap oapVar = (oap) obj3;
                j7h j7hVar = (j7h) obj2;
                if (xus.h(oapVar) == 5) {
                    int i2 = dpu.a;
                    o1e0.a.a(new a9l(2));
                }
                xus.u(oapVar, 0);
                e4h h0 = j7hVar.c.h0();
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                h0.h(xus.h(oapVar), context, xus.t(oapVar));
                if (z) {
                    Context context2 = j7hVar.a;
                    ikv0.a aVar = new ikv0.a(context2);
                    aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_dismiss_substract_24, Integer.valueOf(R.attr.vk_ui_background_negative), (Size) null, 12);
                    aVar.u = new ikv0.d(context2.getString(R.string.invitation_decliend_message), (String) null, (ikv0.d.a) null, 6);
                    aVar.n();
                }
                b3i b3iVar = j7hVar.e;
                if (b3iVar != null) {
                    b3iVar.a(SubscriptionEvent.LEAVE_GROUP_OUT);
                }
                wzs<UserId, Integer, s3q0> wzsVar = j7hVar.f;
                if (wzsVar != null) {
                    wzsVar.invoke(xus.t(oapVar), Integer.valueOf(xus.h(oapVar)));
                }
                break;
            default:
                xfp0 xfp0Var = (xfp0) obj3;
                MusicTrack musicTrack = (MusicTrack) obj2;
                List<String> list = (List) obj;
                a630 a630Var = xfp0Var.h;
                itg0.i(3, a630Var.q1(musicTrack, z).F(new be50(new een0(2, xfp0Var, musicTrack), 19)), new w2j0(xfp0Var, 9), null, null);
                if (musicTrack.S4() || musicTrack.Pb()) {
                    ms1 ms1Var = new ms1(a630Var, new t66(k840.a.i));
                    Context context3 = e43.a;
                    ms1Var.W(context3 != null ? context3 : null, musicTrack, true, list);
                }
                break;
        }
        return s3q0.a;
    }
}
