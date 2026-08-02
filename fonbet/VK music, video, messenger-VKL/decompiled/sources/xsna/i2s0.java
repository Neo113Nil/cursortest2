package xsna;

import android.content.Context;
import android.util.Size;
import android.view.View;
import com.vk.api.generated.vmoji.dto.VmojiPurchaseProductResponseDto;
import com.vk.api.generated.wall.dto.WallActionButtonVkTicketDto;
import com.vk.common.api.generated.GsonHolder;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.ui.components.attaches_history.attaches.model.simple.SimpleAttachesState;
import com.vk.log.L;
import com.vk.newsfeed.posting.impl.presentation.model.ActionButton;
import com.vk.voip.ui.scheduled.creation.ui.VoipScheduleCallViewState;
import com.vk.voip.ui.scheduled.creation.ui.fragment.VoipCreateScheduleCallFragment;
import com.vkontakte.android.R;
import org.json.JSONObject;
import xsna.gm50;
import xsna.ikv0;
import xsna.o9w0;
import xsna.pgw0;
import xsna.sgw0;
import xsna.tlo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class i2s0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i2s0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                j2s0 j2s0Var = (j2s0) obj3;
                Context context = j2s0Var.t;
                AttachVideo attachVideo = (AttachVideo) obj2;
                if (((Boolean) obj).booleanValue()) {
                    l2s0 l2s0Var = j2s0Var.u;
                    l2s0Var.b.onNext(new yka0(attachVideo, 19).invoke((SimpleAttachesState) l2s0Var.b.P0()));
                    tlo0.h d = oq.d(tlo0.Companion, context.getString(R.string.vkim_video_added, attachVideo.getTitle()));
                    ikv0.a aVar = new ikv0.a(context);
                    aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_positive), (Size) null, 12);
                    aVar.u = new ikv0.d(new ikv0.d.c(tlo0.b.a(d, context).toString()), (ikv0.d.b) null, (ikv0.d.a) null, 6);
                    aVar.n();
                } else {
                    tlo0.h d2 = oq.d(tlo0.Companion, context.getString(R.string.vkim_video_cannot_be_added, attachVideo.getTitle()));
                    ikv0.a aVar2 = new ikv0.a(context);
                    float f = 28;
                    aVar2.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_triangle_outline_56, Integer.valueOf(R.attr.vk_ui_icon_negative), new Size(iah0.a(f), iah0.a(f)), 8);
                    aVar2.u = new ikv0.d(new ikv0.d.c(tlo0.b.a(d2, context).toString()), (ikv0.d.b) null, (ikv0.d.a) null, 6);
                    aVar2.n();
                }
                break;
            case 1:
                izs izsVar = (izs) obj3;
                q1t q1tVar = (q1t) obj2;
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject != null) {
                    WallActionButtonVkTicketDto wallActionButtonVkTicketDto = (WallActionButtonVkTicketDto) GsonHolder.a().fromJson(jSONObject.toString(), WallActionButtonVkTicketDto.class);
                    ActionButton actionButton = (ActionButton) q1tVar.b;
                    izsVar.invoke(new ActionButton((actionButton != null ? actionButton : null).b, wallActionButtonVkTicketDto));
                    r3y.c("tickets_posting_select");
                    break;
                }
                break;
            case 2:
                r9w0 r9w0Var = (r9w0) obj3;
                o9w0 o9w0Var = (o9w0) obj2;
                VmojiPurchaseProductResponseDto vmojiPurchaseProductResponseDto = (VmojiPurchaseProductResponseDto) obj;
                if (vmojiPurchaseProductResponseDto.e() != null) {
                    r9w0Var.U(vmojiPurchaseProductResponseDto, ((o9w0.b) o9w0Var).b);
                } else {
                    aaw0 aaw0Var = r9w0Var.g;
                    gd0 gd0Var = new gd0(20, r9w0Var, o9w0Var);
                    View view = aaw0Var.a.getView();
                    if (view != null) {
                        view.post(new vv6(aaw0Var, vmojiPurchaseProductResponseDto, gd0Var, 2));
                    }
                }
                break;
            case 3:
                mgw0 mgw0Var = (mgw0) obj3;
                L.i((Throwable) obj);
                mgw0Var.k = null;
                mgw0Var.j.b(sgw0.a.a);
                mgw0Var.T(new pgw0.h((String) obj2, true, false));
                break;
            default:
                int i2 = VoipCreateScheduleCallFragment.S;
                gm50.a.a((VoipCreateScheduleCallFragment) obj3, ((VoipScheduleCallViewState.a) obj).a, new lyl0((View) obj2, 22));
                break;
        }
        return s3q0.a;
    }
}
