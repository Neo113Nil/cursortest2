package xsna;

import com.vk.media.pipeline.di.MediaPipelineComponent;
import com.vk.media.pipeline.model.timeline.Timeline;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.yze;
import xsna.zze;

/* compiled from: ClipsPublishViewerOverlayMviReducer.kt */
/* loaded from: classes17.dex */
public final class xze extends dm50<c0f, yze, zze> {
    public final sze d;
    public final Object e;
    public final Object f;

    public xze(sze szeVar) {
        super(zze.b.b);
        this.d = szeVar;
        com.vk.movika.tools.controls.seekbar.n nVar = new com.vk.movika.tools.controls.seekbar.n(13);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.e = msy.a(lazyThreadSafetyMode, nVar);
        this.f = msy.a(lazyThreadSafetyMode, new zy(this, 27));
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.dm50
    public final zze c(zze zzeVar, yze yzeVar) {
        zze zzeVar2 = zzeVar;
        yze yzeVar2 = yzeVar;
        if (yzeVar2 instanceof yze.b) {
            yze.b bVar = (yze.b) yzeVar2;
            Timeline timeline = bVar.b;
            return new zze.a(timeline, 0L, false, TimeUnit.MICROSECONDS.toMillis(timeline.d), false, bVar.d, ((ztd) this.f.getValue()).a(bVar.c), false, bVar.e, bVar.f, bVar.g, ((MediaPipelineComponent) this.d.a.getValue()).Gd());
        }
        if (yzeVar2 instanceof yze.e) {
            yze.e eVar = (yze.e) yzeVar2;
            if (zzeVar2 instanceof zze.a) {
                return zze.a.a((zze.a) zzeVar2, eVar.b, false, eVar.c, 3965);
            }
        } else if (yzeVar2 instanceof yze.d) {
            if (zzeVar2 instanceof zze.a) {
                zze.a aVar = (zze.a) zzeVar2;
                aVar.j.a().resume();
                return zze.a.a(aVar, 0L, true, false, 4091);
            }
        } else if (yzeVar2 instanceof yze.c) {
            if (zzeVar2 instanceof zze.a) {
                zze.a aVar2 = (zze.a) zzeVar2;
                cv10 cv10Var = aVar2.j;
                cv10Var.a().pause();
                return zze.a.a(aVar2, cv10Var.a().getCurrentPosition(), false, false, 4089);
            }
        } else if (yzeVar2 instanceof yze.a) {
            yze.a aVar3 = (yze.a) yzeVar2;
            if (zzeVar2 instanceof zze.a) {
                aVar3.getClass();
                return zze.a.a((zze.a) zzeVar2, 0L, false, false, 4087);
            }
        } else {
            if (!(yzeVar2 instanceof yze.f)) {
                throw new NoWhenBranchMatchedException();
            }
            yze.f fVar = (yze.f) yzeVar2;
            if (zzeVar2 instanceof zze.a) {
                fVar.getClass();
                return zze.a.a((zze.a) zzeVar2, 0L, false, false, 4079);
            }
        }
        return zzeVar2;
    }

    @Override // xsna.dm50
    public final c0f d() {
        return new c0f(e(new wze(this, 0)));
    }

    @Override // xsna.dm50
    public final void h(zze zzeVar, c0f c0fVar) {
        f(c0fVar.a, zzeVar);
    }
}
