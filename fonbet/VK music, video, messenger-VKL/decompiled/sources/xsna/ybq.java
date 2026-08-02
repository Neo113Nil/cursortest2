package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tips.Tooltip;
import com.vk.core.tips.c;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.right.VkCellRight;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Good;
import com.vk.im.engine.models.messages.Msg;
import com.vk.photo.editor.PhotoEditorView;
import com.vk.search.params.api.VkPeopleSearchParams;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.MarketAttachment;
import one.video.ad.ux.controls.OneVideoAdBaseControls;
import one.video.ad.ux.controls.OneVideoAdControlsView;
import one.video.ad.ux.playpause.PlayPauseFrameView;
import xsna.c8p;
import xsna.e3m;
import xsna.nv90;
import xsna.ypq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class ybq implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ybq(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        int i2 = this.b;
        Object obj = this.c;
        switch (i2) {
            case 0:
                nv90.a aVar = ((zbq) obj).a;
                nv90 nv90Var = nv90.this;
                exh0 dialogNavigator = nv90Var.getDialogNavigator();
                if (dialogNavigator != null) {
                    VkPeopleSearchParams a = aVar.a();
                    c8p.a aVar2 = new c8p.a(nv90Var.getContext());
                    aVar2.f = a.g;
                    aVar2.g = a.b;
                    aVar2.h = dialogNavigator;
                    aVar2.e = "search_people_filter_education_param";
                    dw20 a2 = aVar2.a();
                    exh0 dialogNavigator2 = nv90Var.getDialogNavigator();
                    if (dialogNavigator2 != null) {
                        dialogNavigator2.a(a2);
                        break;
                    }
                }
                break;
            case 1:
                sx00 sx00Var = (sx00) obj;
                izs<Good, s3q0> izsVar = sx00Var.n;
                Good good = sx00Var.p;
                izsVar.invoke(good != null ? good : null);
                break;
            case 2:
                wz00 wz00Var = (wz00) obj;
                MarketAttachment marketAttachment = (MarketAttachment) wz00Var.C;
                if (marketAttachment != null) {
                    gd60.X0(hd60.a(), wz00Var.itemView.getContext(), ao8.s(marketAttachment.f), new pqq(null, null, null, null, 15), new ncb(wz00Var, 7), new k0j(wz00Var, 24), 32);
                    break;
                }
                break;
            case 3:
                wq30 wq30Var = (wq30) obj;
                pk30 pk30Var = wq30Var.u;
                br30 br30Var = wq30Var.t;
                Msg msg = br30Var != null ? br30Var.l : null;
                Attach attach = br30Var != null ? br30Var.n : null;
                if (pk30Var != null && msg != null && attach != null) {
                    pk30Var.R(attach, msg, br30Var != null ? br30Var.m : null);
                    break;
                }
                break;
            case 4:
                int i3 = OneVideoAdControlsView.A;
                OneVideoAdBaseControls.a listener = ((OneVideoAdControlsView) obj).getListener();
                if (listener != null) {
                    listener.d();
                    break;
                }
                break;
            case 5:
                PhotoEditorView.h((PhotoEditorView) obj);
                break;
            case 6:
                PlayPauseFrameView.a((PlayPauseFrameView) obj);
                break;
            case 7:
                gdn0 gdn0Var = (gdn0) obj;
                u7n0 u7n0Var = gdn0Var.m;
                Context context = view.getContext();
                Object obj2 = gdn0Var.l;
                u7n0Var.h0(context, (b9n0) (obj2 != null ? obj2 : null));
                break;
            case 8:
                b5p0 b5p0Var = (b5p0) obj;
                b5p0Var.h6();
                Rect rect = new Rect();
                b5p0Var.q.getGlobalVisibleRect(rect);
                float f = 2;
                rect.inset(-iah0.a(f), -iah0.a(f));
                gfx0 gfx0Var = e370.b;
                (gfx0Var != null ? gfx0Var : null).getClass();
                if (dhr0.M()) {
                    Context context2 = b5p0Var.itemView.getContext();
                    e3m.a aVar3 = e3m.a;
                    i = context2.getColor(R.color.vk_white_alpha15);
                } else {
                    i = 0;
                }
                b5p0Var.l = Tooltip.l(new Tooltip(b5p0Var.itemView.getContext(), "", "", Tooltip.WindowStyle.FULLSCREEN, null, null, null, 0, 0, null, 1.0f, null, 0, true, null, 0, false, new b290(b5p0Var, 26), null, new c.b(i), new cnw(b5p0Var, 8), new um3(b5p0Var, 9), new q3(b5p0Var, 14), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, 0, null, null, null, null, -8004624, 15), b5p0Var.p.getContext(), new RectF(rect), false, false, false, false, 252);
                break;
            case 9:
                Context mo2getContext = ((ypq0.b) obj).n.d.mo2getContext();
                if (mo2getContext != null) {
                    g2v.d().a().h(mo2getContext);
                    break;
                }
                break;
            default:
                int i4 = VkCellRight.z;
                ((VkCell.Right.ExtraAction.c) obj).b.invoke();
                break;
        }
    }
}
