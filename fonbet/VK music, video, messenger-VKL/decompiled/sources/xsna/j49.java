package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.compose.component.modal.SheetValue;
import com.vk.libvideo.design.compose.base.timeline.TimelineViewState;
import com.vk.log.L;
import com.vk.voip.api.id.CallId;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import xsna.pg00;
import xsna.qg00;
import xsna.uc50;
import xsna.wzm0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class j49 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ j49(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                q49 q49Var = (q49) this.c;
                String str = (String) this.d;
                CallId callId = (CallId) this.e;
                StringBuilder sb = new StringBuilder("callLifecycleListeners: ");
                CopyOnWriteArraySet<g49> copyOnWriteArraySet = q49Var.b;
                L.e("CallLifecycleListenerProxy", fw3.d(copyOnWriteArraySet, sb));
                Iterator<g49> it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    it.next().k(callId, str);
                }
                return s3q0.a;
            case 1:
                Throwable th = (Throwable) this.c;
                vop vopVar = (vop) this.d;
                vgg vggVar = (vgg) this.e;
                if ((th instanceof VKApiExecutionException) && ((VKApiExecutionException) th).s() == 1000) {
                    cop copVar = (cop) vopVar.a;
                    if (copVar != null) {
                        copVar.ud();
                    }
                } else {
                    Throwable th2 = vggVar.a;
                    a35.a(vggVar);
                    vggVar.d(new ig1(12, th2, vopVar));
                }
                return s3q0.a;
            case 2:
                fdj0 fdj0Var = (fdj0) this.c;
                yvj yvjVar = (yvj) this.d;
                gzs gzsVar = (gzs) this.e;
                if (fdj0Var.b.c.invoke(SheetValue.Hidden).booleanValue()) {
                    myc0.h(yvjVar, null, null, new kix(fdj0Var, null), 3).E(new n9(10, fdj0Var, gzsVar));
                }
                return s3q0.a;
            case 3:
                izs izsVar = (izs) this.c;
                pg00.b bVar = (pg00.b) this.d;
                wh50 wh50Var = (wh50) this.e;
                izsVar.invoke(new qg00.c(bVar.a, bVar.d));
                wh50Var.setValue(Boolean.FALSE);
                return s3q0.a;
            case 4:
                wzm0 wzm0Var = (wzm0) this.c;
                izs izsVar2 = (izs) this.d;
                uc50.b bVar2 = (uc50.b) this.e;
                wzm0.a aVar = wzm0Var instanceof wzm0.a ? (wzm0.a) wzm0Var : null;
                if (aVar != null && aVar.b != null) {
                    izsVar2.invoke(bVar2.a);
                }
                return s3q0.a;
            case 5:
                return ((String) this.d) + ": " + ((Throwable) this.c) + " - " + ((mla) this.e);
            default:
                wh50 wh50Var2 = (wh50) this.c;
                TimelineViewState timelineViewState = (TimelineViewState) this.d;
                wh50 wh50Var3 = (wh50) this.e;
                Long l = (Long) wh50Var2.getValue();
                long e = l != null ? com.vk.libvideo.design.compose.base.timeline.a.e(l.longValue(), timelineViewState.c) : timelineViewState.a.getValue().longValue();
                izs izsVar3 = (izs) timelineViewState.a().h();
                if (izsVar3 != null) {
                    izsVar3.invoke(Long.valueOf(e));
                }
                wh50Var3.setValue(qgo.OnlyPreviewBehind);
                return s3q0.a;
        }
    }

    public /* synthetic */ j49(String str, Throwable th, mla mlaVar) {
        this.b = 5;
        this.d = str;
        this.c = th;
        this.e = mlaVar;
    }
}
