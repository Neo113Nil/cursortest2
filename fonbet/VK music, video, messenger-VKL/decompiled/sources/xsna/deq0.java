package xsna;

import android.content.Context;
import android.util.SparseArray;
import androidx.compose.runtime.a;
import com.vk.catalog.mvi.block.video.impl.upload.video.bottomsheet.UploadingVideoBottomSheetState;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.libvideo.upload.api.VideoUploadEvent;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoUploadClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: UploadingVideoBottomSheet.kt */
/* loaded from: classes16.dex */
public final class deq0 extends jmu0 {
    public final dot0 h1;
    public final int i1;
    public final utk0 j1 = vtk0.a(new UploadingVideoBottomSheetState(false));

    /* compiled from: UploadingVideoBottomSheet.kt */
    @b6l(c = "com.vk.catalog.mvi.block.video.impl.upload.video.bottomsheet.UploadingVideoBottomSheet$1", f = "UploadingVideoBottomSheet.kt", l = {41}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        /* compiled from: UploadingVideoBottomSheet.kt */
        /* renamed from: xsna.deq0$a$a, reason: collision with other inner class name */
        public static final class C2726a<T> implements lsr {
            public final /* synthetic */ deq0 b;

            public C2726a(deq0 deq0Var) {
                this.b = deq0Var;
            }

            @Override // xsna.lsr
            public final Object emit(Object obj, spj spjVar) {
                deq0.eo(this.b, (List) obj);
                return s3q0.a;
            }
        }

        public a(spj<? super a> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return deq0.this.new a(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                deq0 deq0Var = deq0.this;
                SparseArray<VideoUploadEvent> e = deq0Var.h1.e();
                u4q0 u4q0Var = zik0.a;
                deq0.eo(deq0Var, j5g.O0(new yik0(e)));
                nb9 a = cdn.a(deq0.this.h1.b());
                C2726a c2726a = new C2726a(deq0.this);
                this.label = 1;
                if (a.collect(c2726a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    /* compiled from: UploadingVideoBottomSheet.kt */
    public static final class b extends kmu0 {
        public final dot0 h;
        public final int i;

        public b(Context context, dot0 dot0Var, int i) {
            super(context, tzp0.a(null, 3));
            this.h = dot0Var;
            this.i = i;
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            deq0 deq0Var = new deq0(this.h, this.i);
            p0(0);
            m0(0);
            n0(0);
            o0(0);
            return deq0Var;
        }
    }

    public deq0(dot0 dot0Var, int i) {
        this.h1 = dot0Var;
        this.i1 = i;
        myc0.h(g5z.a(this), null, null, new a(null), 3);
    }

    public static final void eo(deq0 deq0Var, List list) {
        Object obj;
        deq0Var.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((VideoUploadEvent) obj2).b.b == deq0Var.i1) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((VideoUploadEvent) obj) instanceof VideoUploadEvent.Fail) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        boolean z = obj != null;
        if (z != ((UploadingVideoBottomSheetState) deq0Var.j1.getValue()).b) {
            myc0.h(g5z.a(deq0Var), null, null, new eeq0(deq0Var, z, null), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void fo(MobileOfficialAppsVideoStat$TypeVideoUploadClick.EventType eventType) {
        UiTracker uiTracker = UiTracker.a;
        new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, null, null, null, null, null, 62, null), new MobileOfficialAppsVideoStat$TypeVideoUploadClick(eventType, null, 2, 0 == true ? 1 : 0), 2)).q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.jmu0
    public final void co(int i, androidx.compose.runtime.a aVar) {
        aVar.K(1566946947);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1566946947, 8, -1, "com.vk.catalog.mvi.block.video.impl.upload.video.bottomsheet.UploadingVideoBottomSheet.ThemedContent (UploadingVideoBottomSheet.kt:59)");
        }
        wh50 u = nr2.u(this.j1, aVar);
        UploadingVideoBottomSheetState uploadingVideoBottomSheetState = (UploadingVideoBottomSheetState) u.getValue();
        boolean J = aVar.J(u) | aVar.y(this);
        Object x = aVar.x();
        if (J || x == a.C0011a.a) {
            x = new ume0(7, this, u);
            aVar.R(x);
        }
        feq0.a(uploadingVideoBottomSheetState, (gzs) x, aVar, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
    }
}
