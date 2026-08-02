package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.models.offline.VideoScreenMode;
import com.vk.libvideo.videobottomsheet.api.a;
import com.vk.video.ui.share.api.VideoShareComponent;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;

/* compiled from: VideoBottomSheetParamsFactoryDefault.kt */
/* loaded from: classes3.dex */
public final class t6s0 implements a.InterfaceC1255a {
    public final Object a;
    public final ArrayList b;
    public final Object c;

    public t6s0(Lazy lazy, ArrayList arrayList, Lazy lazy2) {
        this.a = lazy;
        this.b = arrayList;
        this.c = lazy2;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.libvideo.videobottomsheet.api.a.InterfaceC1255a
    public final s6s0 a(a.InterfaceC1255a.C1256a c1256a, s60 s60Var, izs<? super UserId, Boolean> izsVar) {
        rcg0 rcg0Var;
        UserId userId;
        boolean z;
        VideoFile videoFile = c1256a.a;
        a.c cVar = c1256a.b;
        rcg0 rcg0Var2 = c1256a.c;
        Integer num = cVar.a;
        UserId userId2 = cVar.b;
        boolean z2 = num != null && num.intValue() > 0;
        String str = cVar.d;
        UserId userId3 = userId2 == null ? cVar.c : userId2;
        boolean z3 = cVar.e;
        String str2 = cVar.f;
        if (videoFile.O9() && (drm0.D(str2, "video/liked", false) || drm0.D(str2, "my/liked", false))) {
            rcg0Var = rcg0Var2;
            userId = userId3;
            z = true;
        } else {
            rcg0Var = rcg0Var2;
            userId = userId3;
            z = false;
        }
        boolean z4 = z2 && userId2 != null && izsVar.invoke(userId2).booleanValue();
        Integer num2 = cVar.a;
        VideoScreenMode videoScreenMode = VideoScreenMode.PREVIEW;
        hfs0 hfs0Var = (hfs0) this.c.getValue();
        String str3 = z2 ? "VIDEO_PLAYLIST" : "CATALOG";
        boolean z5 = c1256a.d;
        VideoShareComponent videoShareComponent = (VideoShareComponent) this.a.getValue();
        s6s0 s6s0Var = new s6s0(videoFile, str, userId, null, z4, null, z3, false, z, num2, null, s60Var, str3, false, rcg0Var, false, videoScreenMode, z5, hfs0Var, videoShareComponent != null ? videoShareComponent.S() : null, null, false, 408524720);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            s6s0Var = ((r6s0) it.next()).a(s6s0Var);
        }
        return s6s0Var;
    }
}
