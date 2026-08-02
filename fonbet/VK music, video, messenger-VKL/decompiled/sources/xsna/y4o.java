package xsna;

import android.content.Context;
import com.vk.donut.video.model.domain.action.DonutVideoAction;

/* compiled from: DonutVideoActionHandlerImpl.kt */
/* loaded from: classes18.dex */
public final class y4o implements s5t0 {
    public final /* synthetic */ DonutVideoAction.OpenPopUp a;
    public final /* synthetic */ z4o b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ a5o d;

    public y4o(DonutVideoAction.OpenPopUp openPopUp, z4o z4oVar, Context context, a5o a5oVar) {
        this.a = openPopUp;
        this.b = z4oVar;
        this.c = context;
        this.d = a5oVar;
    }

    @Override // xsna.s5t0
    public final void a() {
        DonutVideoAction donutVideoAction;
        DonutVideoAction.OpenPopUp.ActionButton actionButton = this.a.e;
        if (actionButton == null || (donutVideoAction = actionButton.c) == null) {
            return;
        }
        this.b.a(donutVideoAction, this.c, this.d);
    }
}
