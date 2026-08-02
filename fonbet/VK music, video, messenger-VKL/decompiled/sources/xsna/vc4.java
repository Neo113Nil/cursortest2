package xsna;

import android.text.Editable;
import android.view.View;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemSliderVh;
import com.vk.donut.video.model.domain.analytics.source.DonutVideoClickSource;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.data.PrivacySetting;
import com.vkontakte.android.R;
import xsna.h7u0;
import xsna.wc4;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class vc4 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vc4(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 1;
        switch (this.b) {
            case 0:
                ((wc4.a) this.c).l.invoke(((s10) this.d).d);
                break;
            case 1:
                z4w z4wVar = (z4w) this.c;
                Peer peer = (Peer) this.d;
                Editable text = z4wVar.c.getText();
                StringBuilder sb = new StringBuilder();
                int length = text.length();
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    char charAt = text.charAt(i3);
                    if (Character.isDigit(charAt) || charAt == '+') {
                        sb.append(charAt);
                    }
                }
                String obj = sb.toString();
                if (peer != null) {
                    z4wVar.hide();
                    tol tolVar = new tol(z4wVar, obj, peer, 2);
                    a1w a1wVar = q1w.a;
                    (a1wVar != null ? a1wVar : null).r().getClass();
                    int i4 = h7u0.p;
                    h7u0.a c = h7u0.b.c(z4wVar.getContext());
                    c.g0(R.string.vkim_invite_share_msgs_title);
                    c.a.f = z4wVar.getContext().getString(R.string.vkim_invite_share_msgs_description, 250);
                    c.c = false;
                    c.c0(R.string.vkim_invite_share_msgs_yes, new hqd(tolVar, i));
                    c.W(R.string.vkim_invite_share_msgs_no, new w4w(tolVar, i2));
                    c.m();
                    break;
                } else {
                    ycj ycjVar = new ycj(obj, Source.CACHE, false, true, true, null, null, 100);
                    a1w a1wVar2 = q1w.a;
                    io.reactivex.rxjava3.internal.operators.single.c C = (a1wVar2 != null ? a1wVar2 : null).C(z4wVar, ycjVar);
                    asu0 asu0Var = asu0.a;
                    int i5 = 12;
                    z4wVar.e.b(C.q(asu0Var.c()).m(asu0Var.d()).h(new ov2(new ugm(z4wVar, i5), 25)).subscribe(new pv2(new ll1(i5, z4wVar, obj), 21)));
                    break;
                }
                break;
            case 2:
                View view2 = (View) this.c;
                rkq0 rkq0Var = (rkq0) this.d;
                Object tag = view2.getTag();
                PrivacySetting privacySetting = tag instanceof PrivacySetting ? (PrivacySetting) tag : null;
                if (privacySetting != null) {
                    rkq0Var.f = new axf0(rkq0Var, view2, privacySetting, i);
                    dw20 dw20Var = rkq0Var.b;
                    if (dw20Var != null) {
                        dw20Var.hide();
                        break;
                    }
                }
                break;
            default:
                ((VideoItemSliderVh) this.c).j(((DonutVideoUiModel.PreviewBadge) this.d).e, DonutVideoClickSource.PAYWALL);
                break;
        }
    }
}
