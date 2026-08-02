package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.CommonVideoStat$TypeScreenMode;
import com.vk.stat.scheme.CommonVideoStat$TypeVideoCardEvent;
import com.vk.stat.scheme.SchemeStat$EventItem;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.hzp0;

/* compiled from: VideoTopshelfUiViewedTimeChecker.kt */
/* loaded from: classes16.dex */
public final class glt0 extends c2q0<flt0> {
    public final izs<RecyclerView.e0, flt0> u;

    /* compiled from: VideoTopshelfUiViewedTimeChecker.kt */
    public static final class a extends d680<flt0> {
        @Override // xsna.d680
        public final List j(flt0 flt0Var) {
            flt0 flt0Var2 = flt0Var;
            SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CATALOG_ITEM, null, null, null, flt0Var2.b, null, 46, null);
            int i = flt0Var2.a;
            CommonVideoStat$TypeVideoCardEvent commonVideoStat$TypeVideoCardEvent = new CommonVideoStat$TypeVideoCardEvent(CommonVideoStat$TypeVideoCardEvent.EventType.SHOW, CommonVideoStat$TypeScreenMode.PREVIEW);
            UiTracker uiTracker = UiTracker.a;
            return Collections.singletonList(new hzp0.o0(schemeStat$EventItem, i, UiTracker.c(), commonVideoStat$TypeVideoCardEvent));
        }
    }

    /* compiled from: VideoTopshelfUiViewedTimeChecker.kt */
    public static final /* synthetic */ class b implements vtj, g0t {
        public final /* synthetic */ com.vk.metrics.eventtracking.b b;

        public b(com.vk.metrics.eventtracking.b bVar) {
            this.b = bVar;
        }

        @Override // xsna.vtj
        public final void a(IllegalStateException illegalStateException) {
            this.b.a(illegalStateException);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof vtj) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, this.b, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public glt0(RecyclerView recyclerView, izs<? super RecyclerView.e0, flt0> izsVar) {
        super(recyclerView, new a(), null, new b(com.vk.metrics.eventtracking.b.a), new q5u0(0.8f, 0.8f));
        this.u = izsVar;
    }

    @Override // xsna.c2q0, xsna.jm6
    public final Object c(RecyclerView.e0 e0Var) {
        return this.u.invoke(e0Var);
    }

    @Override // xsna.c2q0
    public final void l() {
        a();
    }
}
