package xsna;

import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.clips.upload.vk.api.navigation.preview.ClipPreviewInputParams;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipPreview;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipPublishItem;
import kotlin.NoWhenBranchMatchedException;
import xsna.lze;
import xsna.t3d0;
import xsna.yze;
import xsna.zze;

/* compiled from: ClipsPublishViewerOverlayFeature.kt */
/* loaded from: classes17.dex */
public final class tze extends wk50<c0f, zze, lze, yze> {
    public final f4z f;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public tze(ClipPreviewInputParams clipPreviewInputParams, cv10 cv10Var, sze szeVar) {
        super(new lze.d(clipPreviewInputParams, cv10Var, ((CameraClipsComponent) szeVar.c.getValue()).c4().b()), new xze(szeVar));
        this.f = new f4z();
    }

    public static void V(MobileOfficialAppsClipsStat$TypeClipPreview.EventType eventType, MobileOfficialAppsClipsStat$ClipsCreateContext mobileOfficialAppsClipsStat$ClipsCreateContext) {
        UiTracker uiTracker = UiTracker.a;
        new kze(UiTracker.c(), new MobileOfficialAppsClipsStat$TypeClipPublishItem(MobileOfficialAppsClipsStat$TypeClipPublishItem.EventType.TYPE_CLIP_PREVIEW, mobileOfficialAppsClipsStat$ClipsCreateContext, null, null, null, null, null, null, null, new MobileOfficialAppsClipsStat$TypeClipPreview(eventType), null, 1532, null)).q();
    }

    @Override // xsna.wk50
    public final void N(zze zzeVar, lze lzeVar) {
        zze.a aVar;
        zze zzeVar2 = zzeVar;
        lze lzeVar2 = lzeVar;
        if (lzeVar2 instanceof lze.d) {
            asu0.a.getClass();
            asu0.n().execute(new h(4, (lze.d) lzeVar2, this));
            return;
        }
        if (lzeVar2 instanceof lze.k) {
            ((lze.k) lzeVar2).getClass();
            T(new yze.e(0L, true));
            return;
        }
        if (lzeVar2 instanceof lze.h) {
            if (zzeVar2 instanceof zze.a) {
                zze.a aVar2 = (zze.a) zzeVar2;
                if (aVar2.f) {
                    T(aVar2.d ? yze.c.b : yze.d.b);
                    return;
                }
                return;
            }
            return;
        }
        if (lzeVar2 instanceof lze.g) {
            T(yze.c.b);
            return;
        }
        if (lzeVar2 instanceof lze.i) {
            lze.i iVar = (lze.i) lzeVar2;
            aVar = zzeVar2 instanceof zze.a ? (zze.a) zzeVar2 : null;
            if (aVar == null || aVar.d) {
                T(new yze.e(iVar.b, false));
                return;
            }
            return;
        }
        boolean z = lzeVar2 instanceof lze.j;
        f4z f4zVar = this.f;
        if (z) {
            aVar = zzeVar2 instanceof zze.a ? (zze.a) zzeVar2 : null;
            if (aVar != null) {
                V(MobileOfficialAppsClipsStat$TypeClipPreview.EventType.PREVIEW_CLOSE, aVar.k);
            }
            f4zVar.b(t3d0.c.a);
            return;
        }
        if (lzeVar2 instanceof lze.f) {
            aVar = zzeVar2 instanceof zze.a ? (zze.a) zzeVar2 : null;
            if (aVar != null) {
                V(MobileOfficialAppsClipsStat$TypeClipPreview.EventType.PREVIEW_CLOSE, aVar.k);
            }
            f4zVar.b(t3d0.b.a);
            return;
        }
        if (lzeVar2 instanceof lze.e) {
            aVar = zzeVar2 instanceof zze.a ? (zze.a) zzeVar2 : null;
            if (aVar != null) {
                V(MobileOfficialAppsClipsStat$TypeClipPreview.EventType.PREVIEW_CLOSE, aVar.k);
            }
            f4zVar.b(t3d0.a.a);
            return;
        }
        if (lzeVar2 instanceof lze.a) {
            aVar = zzeVar2 instanceof zze.a ? (zze.a) zzeVar2 : null;
            if (aVar == null || aVar.e != 0) {
                T(new yze.a());
                return;
            }
            return;
        }
        if (lzeVar2 instanceof lze.b) {
            T(yze.c.b);
            return;
        }
        if (lzeVar2 instanceof lze.c) {
            T(yze.d.b);
            return;
        }
        if (lzeVar2 instanceof lze.m) {
            ((lze.m) lzeVar2).getClass();
            T(new yze.f());
            aVar = zzeVar2 instanceof zze.a ? (zze.a) zzeVar2 : null;
            if (aVar == null || aVar.f) {
                return;
            }
            T(yze.d.b);
            return;
        }
        if (!(lzeVar2 instanceof lze.l)) {
            throw new NoWhenBranchMatchedException();
        }
        lze.l lVar = (lze.l) lzeVar2;
        if (zzeVar2 instanceof zze.a) {
            if (((zze.a) zzeVar2).d) {
                T(yze.c.b);
            }
            T(new yze.e((long) (r7.e * lVar.b), true));
        }
    }

    public final wj50<t3d0> U() {
        return this.f;
    }
}
