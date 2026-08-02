package xsna;

import android.os.Parcelable;
import android.view.ViewGroup;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.dto.common.VideoFile;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.newsfeed.posting.additional_settings.domain.model.AdditionalSettingsState;
import com.vk.superapp.browser.internal.ui.menu.action.i;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.bbv0;
import xsna.cos;
import xsna.jge;
import xsna.jke;
import xsna.l1j;
import xsna.q4r;
import xsna.s4r;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class d40 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ d40(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Float f;
        switch (this.b) {
            case 0:
                x30 x30Var = (x30) obj;
                String str = x30Var.a;
                ArrayList arrayList = x30Var.b;
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new i.b((WebApiApplication) it.next()));
                }
                return new Pair(str, arrayList2);
            case 1:
                AdditionalSettingsState.Data data = (AdditionalSettingsState.Data) obj;
                if (data.h && data.m) {
                    r1 = true;
                }
                return Boolean.valueOf(r1);
            case 2:
                tdu tduVar = (tdu) obj;
                tduVar.A(1.2f);
                tduVar.B(1.2f);
                return s3q0.a;
            case 3:
                return s3q0.a;
            case 4:
                qgi0.n((tgi0) obj, 0);
                return s3q0.a;
            case 5:
                float f2 = CameraUIView.w1;
                ((gzs) obj).invoke();
                return s3q0.a;
            case 6:
                return s3q0.a;
            case 7:
                Map.Entry entry = (Map.Entry) obj;
                Msg msg = (Msg) entry.getKey();
                id20 id20Var = (id20) entry.getValue();
                if (msg.Nb() && (f = id20Var.b) != null) {
                    float floatValue = f.floatValue();
                    if (!(msg instanceof MsgFromChannel) || !((MsgFromChannel) msg).M || Float.compare(floatValue, 0.95f) >= 0) {
                        r1 = true;
                    }
                }
                return Boolean.valueOf(r1);
            case 8:
                Parcelable.Creator<ChannelMsgSendConfig> creator = ChannelMsgSendConfig.CREATOR;
                return ChannelMsgSendConfig.a.a(((MsgFromChannel) obj).Q);
            case 9:
                bbv0.g.getClass();
                bbv0.a.c((Throwable) obj);
                return s3q0.a;
            case 10:
                return Integer.valueOf(((zgd) obj).c);
            case 11:
                return ((jge.b) obj).a;
            case 12:
                return jke.b.a;
            case 13:
                String j1 = ((VideoFile) obj).j1();
                return j1 != null ? j1 : "Unavailable";
            case 14:
                j03.l((Throwable) obj);
                return s3q0.a;
            case 15:
                return Float.valueOf(sa30.E(((Float) obj).floatValue(), new k9x(0, 100, 1), new k9x(-1, 1, 1)));
            case 16:
                return Boolean.valueOf(((cbg) obj).c == 424);
            case 17:
                qgi0.r((tgi0) obj, "communities_catalog_top_bar_search_container");
                return s3q0.a;
            case 18:
                return Boolean.valueOf(((twg) obj).h);
            case 19:
                return s3q0.a;
            case 20:
                return s3q0.a;
            case 21:
                return new zr8(R.layout.vk_buttons_components_view_holder, (ViewGroup) obj);
            case 22:
                return Boolean.valueOf(((l1j.f) obj).e);
            case 23:
                return Boolean.valueOf(!((HashSet) obj).isEmpty());
            case 24:
                return 2;
            case 25:
                return null;
            case 26:
                q4r q4rVar = (q4r) obj;
                if (q4rVar instanceof q4r.a) {
                    return ((q4r.a) q4rVar).c;
                }
                if ((q4rVar instanceof q4r.b) || (q4rVar instanceof q4r.c) || (q4rVar instanceof q4r.d)) {
                    return s4r.a.a;
                }
                throw new NoWhenBranchMatchedException();
            case 27:
                return new cos.c(((tj50.a) obj).a(nns.b, ao8.d));
            case 28:
                ((vgg) obj).c();
                return s3q0.a;
            default:
                return Boolean.valueOf(((BaseOkResponseDto) obj) == BaseOkResponseDto.OK);
        }
    }
}
