package xsna;

import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.d;
import com.vk.catalog.mvi.block.video.impl.di.CatalogVideoViewComponentImpl;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetComponent;
import com.vk.log.L;
import com.vk.pushes.fallback.ImSyncWorker;
import com.vk.video.kidsprofile.restricteduseractions.VideoRestrictedUserActionsComponent;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import xsna.ts80;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class fia implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fia(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ?? r1 = this.c;
                ?? r2 = this.d;
                qcy<Object>[] qcyVarArr = CatalogVideoViewComponentImpl.y;
                return new w3k0((VideoBottomSheetComponent) r1.getValue(), ((VideoRestrictedUserActionsComponent) r2.getValue()).e2());
            default:
                whe0 whe0Var = (whe0) this.c;
                akq akqVar = (akq) this.d;
                if (whe0Var.a) {
                    L.G("Fallback engine is already started");
                    return s3q0.a;
                }
                L.e("Fallback engine called to start periodic work");
                d.a a = new d.a(ImSyncWorker.class, 900000L, TimeUnit.MILLISECONDS).a("com.vk.android.push_fallback_task");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                androidx.work.d b = a.f(new p6j(new b560(null), NetworkType.CONNECTED, false, false, false, false, -1L, -1L, j5g.S0(linkedHashSet))).b();
                androidx.lifecycle.n<ts80.a> state = ((awx0) whe0Var.d.getValue()).e("pushes_fallback", ExistingPeriodicWorkPolicy.KEEP, b).getState();
                state.f(new jvx0(new uhe0(state, 0), new vhe0(whe0Var, b, akqVar)));
                return s3q0.a;
        }
    }
}
