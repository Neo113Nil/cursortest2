package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.stories.model.StoryUploadParams;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.log.L;
import com.vk.media.MediaUtils;
import com.vk.media.model.CameraVideoEncoderParameters;
import com.vk.story.api.media.StoryMediaData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.u440;

/* compiled from: StoryEditorVideoDelegate.kt */
/* loaded from: classes16.dex */
public final class e2m0 extends o5p {
    public final n2m0 c;

    public e2m0(u440.b bVar, vf6 vf6Var, n2m0 n2m0Var) {
        super(bVar, vf6Var);
        this.c = n2m0Var;
    }

    public final StoryMediaData b(tam0 tam0Var, StoryUploadParams storyUploadParams) {
        MediaUtils.d e;
        mat0 d = tam0Var.d();
        CameraVideoEncoderParameters a = this.c.a(new p1d0(this, 17), tam0Var, true);
        if (a == null) {
            return null;
        }
        a.k = d != null ? d.c : 0L;
        txl0 txl0Var = tam0Var.v;
        if (txl0Var != null) {
            skd.k(a, txl0Var);
        }
        a.o = tam0Var.w;
        mat0 d2 = tam0Var.d();
        Integer valueOf = d2 != null ? Integer.valueOf(d2.b()) : null;
        if (valueOf != null) {
            com.vk.stories.b bVar = com.vk.stories.b.a;
            int intValue = valueOf.intValue();
            boolean e2 = tam0Var.e();
            bVar.getClass();
            e = com.vk.stories.b.d(intValue, e2);
        } else {
            com.vk.stories.b bVar2 = com.vk.stories.b.a;
            boolean e3 = tam0Var.e();
            bVar2.getClass();
            e = com.vk.stories.b.e(e3);
        }
        yo9 b = this.b.b(tam0Var, e);
        storyUploadParams.j = b != null ? (ClickableStickers) b.d : null;
        return new StoryMediaData(null, a, storyUploadParams, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00d7, code lost:
    
        if (r2.e == true) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00e0, code lost:
    
        if (r2.h == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00e7, code lost:
    
        if (r0.q() != false) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(tam0 tam0Var) {
        nov novVar;
        zcl0 zcl0Var = tam0Var.h;
        boolean u = zcl0Var.u();
        CopyOnWriteArrayList<nov> copyOnWriteArrayList = zcl0Var.a;
        if (!u) {
            L.l("StoryEditorVideoDelegate", "Something is wrong! Trying to call saveVideo on wrong currentStory");
            return;
        }
        boolean z = false;
        int i = 0;
        while (true) {
            if (i == copyOnWriteArrayList.size()) {
                novVar = null;
                break;
            } else {
                if (copyOnWriteArrayList.get(i) instanceof sov) {
                    novVar = copyOnWriteArrayList.get(i);
                    break;
                }
                i++;
            }
        }
        sov sovVar = (sov) novVar;
        g5g.D(copyOnWriteArrayList, true, new viu(23));
        CameraVideoEncoderParameters a = this.c.a(new orj0(this, 5), tam0Var, false);
        if (a == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<nov> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            nov next = it.next();
            if (next instanceof grt0) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<nov> it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            nov next2 = it2.next();
            if (next2 instanceof r4g0) {
                arrayList2.add(next2);
            }
        }
        if (!arrayList.isEmpty()) {
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (!((grt0) it3.next()).q()) {
                    }
                }
            }
            z = true;
            a.f = z;
            if (sovVar != null) {
                zcl0Var.a(sovVar);
            }
            a.v = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            a.o = tam0Var.w;
            bpn0 bpn0Var = qro0.a;
            qro0.a(new com.vk.movika.sdk.base.ui.p(20, a, this));
            return;
        }
        if (!arrayList2.isEmpty()) {
            if (!arrayList2.isEmpty()) {
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    if (!((r4g0) it4.next()).getVideo().q()) {
                    }
                }
            }
            z = true;
            a.f = z;
            if (sovVar != null) {
            }
            a.v = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            a.o = tam0Var.w;
            bpn0 bpn0Var2 = qro0.a;
            qro0.a(new com.vk.movika.sdk.base.ui.p(20, a, this));
            return;
        }
        mat0 d = tam0Var.d();
        if (d != null) {
        }
        txl0 txl0Var = tam0Var.v;
        if (txl0Var != null) {
        }
    }
}
