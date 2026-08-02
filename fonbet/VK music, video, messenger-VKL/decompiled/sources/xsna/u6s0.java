package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.models.offline.VideoScreenMode;
import com.vk.libvideo.videobottomsheet.api.a;
import com.vk.video.ui.share.api.VideoShareComponent;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;

/* compiled from: VideoBottomSheetParamsFactoryDefault.kt */
/* loaded from: classes16.dex */
public final class u6s0 implements a.InterfaceC1255a {
    public final Lazy<VideoShareComponent> a;
    public final List<r6s0> b;
    public final Lazy<hfs0> c;

    /* JADX WARN: Multi-variable type inference failed */
    public u6s0(Lazy<? extends VideoShareComponent> lazy, List<? extends r6s0> list, Lazy<? extends hfs0> lazy2) {
        this.a = lazy;
        this.b = list;
        this.c = lazy2;
    }

    @Override // com.vk.libvideo.videobottomsheet.api.a.InterfaceC1255a
    public final s6s0 a(a.InterfaceC1255a.C1256a c1256a, s60 s60Var, izs<? super UserId, Boolean> izsVar) {
        rcg0 rcg0Var;
        UserId userId;
        boolean z;
        VideoShareComponent value;
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
        com.vk.video.ui.share.api.b bVar = null;
        Lazy<hfs0> lazy = this.c;
        hfs0 value2 = lazy != null ? lazy.getValue() : null;
        String str3 = z2 ? "VIDEO_PLAYLIST" : "CATALOG";
        boolean z5 = c1256a.d;
        Lazy<VideoShareComponent> lazy2 = this.a;
        if (lazy2 != null && (value = lazy2.getValue()) != null) {
            bVar = value.S();
        }
        s6s0 s6s0Var = new s6s0(videoFile, str, userId, null, z4, null, z3, false, z, num2, null, s60Var, str3, false, rcg0Var, false, videoScreenMode, z5, value2, bVar, null, false, 408524720);
        Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            s6s0Var = ((r6s0) it.next()).a(s6s0Var);
        }
        return s6s0Var;
    }
}
