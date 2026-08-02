package xsna;

import android.app.Dialog;
import android.content.Context;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.gy50;
import xsna.lox0;
import xsna.mox0;
import xsna.o960;
import xsna.wtw0;
import xsna.xcw0;
import xsna.xtw0;
import xsna.xyw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class ljw0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ljw0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((mjw0) obj2).S0.a(gy50.c.a);
                return s3q0.a;
            case 1:
                ((nrw0) obj2).q(xcw0.v.a);
                return s3q0.a;
            case 2:
                wtw0 wtw0Var = (wtw0) obj;
                xtw0 xtw0Var = ((qtw0) obj2).k1;
                if (xtw0Var != null) {
                    Context context = xtw0Var.a;
                    if (wtw0Var instanceof wtw0.a) {
                        xtw0Var.a(new xtw0.a(R.drawable.vk_icon_microphone_slash_outline_28, context.getString(R.string.voip_participant_settings_mute_microphone_notification, ((wtw0.a) wtw0Var).a)));
                    } else {
                        if (!(wtw0Var instanceof wtw0.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        xtw0Var.a(new xtw0.a(R.drawable.vk_icon_videocam_slash_outline_28, context.getString(R.string.voip_participant_settings_turn_off_camera_notification, ((wtw0.b) wtw0Var).a)));
                    }
                }
                return s3q0.a;
            case 3:
                d2x0 d2x0Var = (d2x0) obj2;
                int i2 = d2x0.j1;
                if (!(((xyw0) obj) instanceof xyw0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                Dialog dialog = d2x0Var.s;
                nw20 nw20Var = dialog instanceof nw20 ? (nw20) dialog : null;
                if (nw20Var != null) {
                    nw20Var.cancel();
                }
                return s3q0.a;
            default:
                lox0 lox0Var = (lox0) obj;
                iox0 iox0Var = ((kox0) obj2).d;
                iox0Var.getClass();
                if (lox0Var instanceof lox0.b) {
                    ArrayList arrayList = new ArrayList();
                    for (int i3 = 0; i3 < 8; i3++) {
                        arrayList.add(o960.a.a);
                    }
                    return new mox0.a.AbstractC3359a.b(arrayList);
                }
                if (!(lox0Var instanceof lox0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                List<qnx0> list = ((lox0.a) lox0Var).b;
                List singletonList = Collections.singletonList(new o960.b(iox0Var.a.getString(R.string.vk_setting_widget_fragment_tab_title_v6)));
                List<qnx0> list2 = list;
                ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new k960((qnx0) it.next()));
                }
                return new mox0.a.AbstractC3359a.C3360a(j5g.u0(arrayList2, singletonList));
        }
    }
}
