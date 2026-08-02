package xsna;

import com.vk.api.generated.wall.dto.WallAttachmentsActionButtonDto;
import com.vk.api.generated.wall.dto.WallPostingSettingsActionButtonVkTicketDto;
import com.vk.dto.hints.HintId;
import com.vk.newsfeed.posting.additional_settings.domain.model.author.WallOwner;
import com.vk.newsfeed.posting.impl.presentation.model.ActionButton;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.iy;
import xsna.ly;
import xsna.my;
import xsna.nw;

/* compiled from: ActionButtonsFeature.kt */
/* loaded from: classes4.dex */
public final class ay extends wk50<oy, my, nw, iy> {
    public final wj50<ly> f;
    public final q1t g;
    public final ibc0 h;
    public final WallOwner i;
    public final ud80 j;

    public ay(ky kyVar, nw nwVar, f4z f4zVar, q1t q1tVar, ibc0 ibc0Var, WallOwner wallOwner, ud80 ud80Var) {
        super(nwVar, kyVar);
        this.f = f4zVar;
        this.g = q1tVar;
        this.h = ibc0Var;
        this.i = wallOwner;
        this.j = ud80Var;
    }

    @Override // xsna.wk50
    public final void N(my myVar, nw nwVar) {
        String url;
        my myVar2 = myVar;
        nw nwVar2 = nwVar;
        if (nwVar2 instanceof nw.b) {
            V(myVar2);
            return;
        }
        boolean z = nwVar2 instanceof nw.e;
        wj50<ly> wj50Var = this.f;
        if (!z) {
            if (nwVar2 instanceof nw.a) {
                wj50Var.b(ly.a.a);
                return;
            } else if (nwVar2 instanceof nw.d) {
                wj50Var.b(new ly.c(((nw.d) nwVar2).b));
                return;
            } else {
                if (!(nwVar2 instanceof nw.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                U(myVar2);
                return;
            }
        }
        nw.e eVar = (nw.e) nwVar2;
        if (myVar2 instanceof my.a) {
            ActionButton actionButton = eVar.b;
            if ((actionButton != null ? actionButton.f : null) != ActionButton.Type.VkTicket) {
                T(new iy.a(actionButton));
            } else {
                WallPostingSettingsActionButtonVkTicketDto g = actionButton.b.g();
                if (g != null && (url = g.getUrl()) != null) {
                    this.h.u().u(kbc0.g(actionButton, this.i.b.b));
                    wj50Var.b(new ly.b(url));
                    zx zxVar = new zx(this, 0);
                    q1t q1tVar = this.g;
                    q1tVar.b = actionButton;
                    r3y.c("tickets_posting_select");
                    r3y.a("tickets_posting_select", new i2s0(1, zxVar, q1tVar));
                }
            }
        }
        U(myVar2);
    }

    public final void U(my myVar) {
        if (myVar instanceof my.a) {
            hy hyVar = ((my.a) myVar).d;
            ud80 ud80Var = this.j;
            ud80Var.getClass();
            if (hyVar.a) {
                ud80Var.a.b(HintId.FEED_POSTING_VK_TICKET_ACTION_BUTTON_SELECTION.getId());
            }
            V(myVar);
        }
    }

    public final void V(my myVar) {
        Object obj;
        WallPostingSettingsActionButtonVkTicketDto g;
        if (myVar instanceof my.a) {
            List<ActionButton> list = ((my.a) myVar).b;
            ud80 ud80Var = this.j;
            ud80Var.getClass();
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((ActionButton) obj).f == ActionButton.Type.VkTicket) {
                        break;
                    }
                }
            }
            ActionButton actionButton = (ActionButton) obj;
            WallAttachmentsActionButtonDto wallAttachmentsActionButtonDto = actionButton != null ? actionButton.b : null;
            HintId hintId = HintId.FEED_POSTING_VK_TICKET_ACTION_BUTTON;
            HintId hintId2 = HintId.FEED_POSTING_VK_TICKET_ACTION_BUTTON_SELECTION;
            h7v h7vVar = ud80Var.a;
            boolean m = h7vVar.m(hintId);
            boolean m2 = h7vVar.m(hintId2);
            boolean z = false;
            boolean f = (wallAttachmentsActionButtonDto == null || (g = wallAttachmentsActionButtonDto.g()) == null) ? false : epx.f(g.d(), Boolean.TRUE);
            if (!m && m2 && f) {
                z = true;
            }
            T(new iy.b(new hy(z)));
        }
    }

    @Override // xsna.wk50, xsna.g4z
    public final void onDestroy() {
        super.onDestroy();
        this.g.getClass();
        r3y.c("tickets_posting_select");
    }
}
