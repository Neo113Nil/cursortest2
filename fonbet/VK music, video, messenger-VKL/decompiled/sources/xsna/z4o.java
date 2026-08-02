package xsna;

import android.content.Context;
import com.vk.com.vk.donut.popup.api.model.VideoPopupArgs;
import com.vk.common.links.LaunchContext;
import com.vk.donut.video.model.domain.action.DonutVideoAction;
import com.vk.video.ui.upload.api.di.UploadComponent;
import com.vk.video.ui.upload.api.router.PublishArguments;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.a5o;

/* compiled from: DonutVideoActionHandlerImpl.kt */
/* loaded from: classes.dex */
public final class z4o implements x4o {
    public final h1o a;
    public final maz b;
    public final UploadComponent c;
    public final qeq0 d;

    public z4o(h1o h1oVar, maz mazVar, r5t0 r5t0Var, UploadComponent uploadComponent, qeq0 qeq0Var) {
        this.a = h1oVar;
        this.b = mazVar;
        this.c = uploadComponent;
        this.d = qeq0Var;
    }

    @Override // xsna.x4o
    public final void a(DonutVideoAction donutVideoAction, Context context, a5o a5oVar) {
        List<req0> list;
        a5o.a a;
        if (donutVideoAction instanceof DonutVideoAction.OpenPopUp) {
            DonutVideoAction.OpenPopUp openPopUp = (DonutVideoAction.OpenPopUp) donutVideoAction;
            int e = openPopUp.e();
            String title = openPopUp.getTitle();
            String f = openPopUp.f();
            DonutVideoAction.OpenPopUp.ActionButton d = openPopUp.d();
            this.a.a(context, new VideoPopupArgs(e, title, f, d != null ? d.getTitle() : null), a5oVar != null ? a5oVar.b() : false, new y4o(openPopUp, this, context, a5oVar));
            return;
        }
        if (!(donutVideoAction instanceof DonutVideoAction.OpenUrl)) {
            if (!(donutVideoAction instanceof DonutVideoAction.OpenVideoEditScreen)) {
                throw new NoWhenBranchMatchedException();
            }
            this.c.a().a(xa4.L(context), new PublishArguments.Edit(((DonutVideoAction.OpenVideoEditScreen) donutVideoAction).a1(), PublishArguments.Edit.PreOpenedMenu.PRIVACY_WATCH));
            return;
        }
        DonutVideoAction.OpenUrl openUrl = (DonutVideoAction.OpenUrl) donutVideoAction;
        if (a5oVar == null || (a = a5oVar.a()) == null || (list = e43.l(new req0("screen", a.b()), new req0("source", a.a()))) == null) {
            list = EmptyList.b;
        }
        String a2 = this.d.a(openUrl.getUrl(), list);
        LaunchContext launchContext = LaunchContext.A;
        maz.c(this.b, context, a2, LaunchContext.b.a(), null, null, 24);
    }
}
