package xsna;

import com.vk.donut.video.model.domain.action.DonutVideoAction;
import com.vk.donut.video.model.domain.video.DonutVideoModel;
import com.vk.donut.video.model.presentation.cardsize.DonutVideoCardSource;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.a0o;
import xsna.w4o;

/* compiled from: DonutVideoUiModelProviderImpl.kt */
/* loaded from: classes.dex */
public final class m5o implements l5o {
    public final f5o a;
    public final a2o b;
    public final bpn0 c = new bpn0(new u35(2));

    public m5o(f5o f5oVar, w4o w4oVar, a2o a2oVar) {
        this.a = f5oVar;
        this.b = a2oVar;
    }

    @Override // xsna.l5o
    public final DonutVideoUiModel a(DonutVideoModel donutVideoModel, DonutVideoCardSource donutVideoCardSource) {
        DonutVideoAction donutVideoAction;
        DonutVideoAction.OpenPopUp.ActionButton actionButton;
        String e;
        if (!this.a.a() || donutVideoModel == null) {
            return null;
        }
        DonutVideoModel.Restriction f = donutVideoModel.f();
        DonutVideoModel.Popup e2 = donutVideoModel.e();
        if (f != null) {
            donutVideoAction = new DonutVideoAction.OpenUrl(f.d());
        } else if (e2 != null) {
            int i = a0o.a.$EnumSwitchMapping$0[e2.e().ordinal()];
            if (i != 1 && i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            String title = e2.getTitle();
            String f2 = e2.f();
            String a1 = donutVideoModel.a1();
            DonutVideoModel.Popup.PopupAction d = e2.d();
            if (d == null) {
                actionButton = null;
            } else {
                DonutVideoModel.Popup.PopupAction.ActionType d2 = d.d();
                String url = d.getUrl();
                int i2 = w4o.a.$EnumSwitchMapping$0[d2.ordinal()];
                actionButton = new DonutVideoAction.OpenPopUp.ActionButton(d.getTitle(), (i2 != 1 || url == null) ? i2 == 2 ? new DonutVideoAction.OpenVideoEditScreen(a1) : null : new DonutVideoAction.OpenUrl(url));
            }
            donutVideoAction = new DonutVideoAction.OpenPopUp(R.drawable.vk_icon_illustration_donut_logo_confetti_120h, title, f2, actionButton);
        } else {
            donutVideoAction = null;
        }
        DonutVideoCardSource donutVideoCardSource2 = DonutVideoCardSource.PLAYER;
        bpn0 bpn0Var = this.c;
        a2o a2oVar = this.b;
        if (donutVideoCardSource == donutVideoCardSource2 && donutVideoModel.f() != null) {
            DonutVideoModel.Chip d3 = donutVideoModel.d();
            DonutVideoModel.Restriction f3 = donutVideoModel.f();
            if (f3 == null || (e = f3.getTitle()) == null) {
                e = d3.e();
            }
            return new DonutVideoUiModel(new DonutVideoUiModel.PreviewBadge(e, ((Boolean) bpn0Var.getValue()).booleanValue() ? a2oVar.parse(e) : null, d3.d(), donutVideoAction), null);
        }
        if (donutVideoCardSource != DonutVideoCardSource.LARGE_CARD || donutVideoModel.f() == null || donutVideoModel.g()) {
            DonutVideoModel.Chip d4 = donutVideoModel.d();
            String e3 = d4.e();
            return new DonutVideoUiModel(null, new DonutVideoUiModel.DescriptionChip(e3, ((Boolean) bpn0Var.getValue()).booleanValue() ? a2oVar.parse(e3) : null, d4.d(), donutVideoAction));
        }
        DonutVideoModel.Chip d5 = donutVideoModel.d();
        String e4 = d5.e();
        return new DonutVideoUiModel(new DonutVideoUiModel.PreviewBadge(e4, ((Boolean) bpn0Var.getValue()).booleanValue() ? a2oVar.parse(e4) : null, d5.d(), donutVideoAction), null);
    }
}
