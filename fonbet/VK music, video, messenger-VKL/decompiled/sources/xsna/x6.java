package xsna;

import android.content.Context;
import com.vk.common.links.LaunchContext;
import com.vk.donut.video.model.domain.analytics.source.DonutVideoClickSource;
import com.vk.donut.video.model.domain.analytics.source.DonutVideoScreenSource;
import com.vk.donut.video.model.domain.video.DonutVideoModel;

/* compiled from: AboutVideoDonutActionHandlerImpl.kt */
/* loaded from: classes18.dex */
public final class x6 implements w6 {
    public final maz a;
    public final f5o b;
    public final qeq0 c;

    public x6(maz mazVar, f5o f5oVar, qeq0 qeq0Var) {
        this.a = mazVar;
        this.b = f5oVar;
        this.c = qeq0Var;
    }

    @Override // xsna.w6
    public final void a(Context context, DonutVideoModel donutVideoModel) {
        DonutVideoModel.Restriction restriction;
        if (donutVideoModel == null || (restriction = donutVideoModel.g) == null) {
            return;
        }
        maz.c(this.a, context, this.c.a(restriction.c, e43.l(new req0("screen", DonutVideoScreenSource.VK_VIDEO.h()), new req0("source", DonutVideoClickSource.DESCRIPTION.h()))), LaunchContext.A, null, null, 24);
    }

    @Override // xsna.w6
    public final boolean b(DonutVideoModel donutVideoModel) {
        if (this.b.a()) {
            return (donutVideoModel != null ? donutVideoModel.g : null) != null;
        }
        return false;
    }
}
