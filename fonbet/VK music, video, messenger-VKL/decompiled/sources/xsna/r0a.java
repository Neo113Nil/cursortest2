package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.dynamic_loader.DynamicTask;
import com.vk.im.reporters.api.msg.OpenMessagesHistoryReporter;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Result;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import ru.ok.face.mesh.FaceMeshRegressorRecurrent;
import ru.ok.gl.tf.factory.CatMeshFactory;
import ru.ok.gleffects.EffectRegistry;
import xsna.god0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class r0a implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ r0a(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object failure;
        int i = this.b;
        boolean z = false;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((CatMeshFactory) obj3).lambda$create$2((FaceMeshRegressorRecurrent) obj2, (Runnable) obj);
                return;
            case 1:
                b.a aVar = (b.a) obj;
                ((ViewGroup) obj3).endViewTransition((View) obj2);
                aVar.c.a.c(aVar);
                return;
            case 2:
                DynamicTask dynamicTask = (DynamicTask) obj3;
                io.reactivex.rxjava3.subjects.d dVar = (io.reactivex.rxjava3.subjects.d) obj2;
                Integer num = (Integer) obj;
                ReentrantLock reentrantLock = com.vk.core.dynamic_loader.b.l;
                reentrantLock.lock();
                try {
                    com.vk.core.dynamic_loader.b.i(num.intValue() + 1, dynamicTask, dVar);
                    s3q0 s3q0Var = s3q0.a;
                    return;
                } finally {
                    reentrantLock.unlock();
                }
            case 3:
                RecyclerView.l lVar = (RecyclerView.l) obj2;
                final gzs gzsVar = (gzs) obj;
                ((a4r) obj3).e(false);
                if (lVar != null) {
                    lVar.o(new RecyclerView.l.a() { // from class: xsna.z3r
                        @Override // androidx.recyclerview.widget.RecyclerView.l.a
                        public final void a() {
                            gzs.this.invoke();
                        }
                    });
                    return;
                } else {
                    gzsVar.invoke();
                    return;
                }
            case 4:
                u6x u6xVar = (u6x) obj3;
                w6x w6xVar = (w6x) obj2;
                u6xVar.k(w6xVar, BatchApiRequest.FIELD_NAME_ON_ERROR, new og1(w6xVar, u6xVar, (Throwable) obj, 3));
                return;
            case 5:
                com.vk.media.ok.b bVar = (com.vk.media.ok.b) obj;
                if (((EffectRegistry) obj3).duetEffect((Long) obj2)) {
                    bVar.H.resetEffectToInitialState();
                    ArrayList arrayList = new ArrayList();
                    if (bVar.o() || bVar.q()) {
                        bVar.queueEvent(new jx70(bVar, arrayList, z));
                        return;
                    }
                    return;
                }
                return;
            case 6:
                nr80 nr80Var = (nr80) obj3;
                mdz<OpenMessagesHistoryReporter.Span> mdzVar = (mdz) obj;
                try {
                    failure = null;
                    pr80 pr80Var = obj2 instanceof pr80 ? (pr80) obj2 : null;
                    if (pr80Var != null) {
                        nr80Var.x(mdzVar, pr80Var);
                        failure = s3q0.a;
                    }
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    L.j(a, "Failed to send analytics event");
                    return;
                }
                return;
            case 7:
                List<? extends vcr<?>> list = (List) obj2;
                god0.a aVar2 = (god0.a) obj;
                aod0 aod0Var = (aod0) ((Ref$ObjectRef) obj3).element;
                if (aod0Var.h == list) {
                    aod0Var.notifyDataSetChanged();
                } else {
                    aod0Var.setItems(list);
                }
                aVar2.a(list);
                return;
            default:
                fdf0 fdf0Var = (fdf0) obj3;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) obj;
                int v = linearLayoutManager.v();
                int x = linearLayoutManager.x();
                fdf0Var.getClass();
                fdf0.K0(new Ref$IntRef(), x, fdf0Var, v, (RecyclerView) obj2);
                return;
        }
    }
}
