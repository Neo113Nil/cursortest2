package xsna;

import android.app.Activity;
import android.content.Context;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.api.di.VideoPlaylistReversionComponent;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetComponent;
import com.vk.libvideo.videobottomsheet.api.a;
import kotlin.LazyThreadSafetyMode;
import xsna.bea;
import xsna.fet0;

/* compiled from: PlaylistScreenEventHandler.kt */
/* loaded from: classes6.dex */
public final class ocb0 implements cga {
    public final int a;
    public final cga b;
    public final VideoBottomSheetComponent c;
    public final UserId d;
    public final com.vk.video.kidsprofile.restricteduseractions.a e;
    public final cpu f;
    public final g7s0 g;
    public final VideoPlaylistReversionComponent h;
    public final s0a i;
    public final Object j;
    public final Object k;
    public final Object l;

    public ocb0(int i, cga cgaVar, VideoBottomSheetComponent videoBottomSheetComponent, UserId userId, com.vk.video.kidsprofile.restricteduseractions.a aVar, cpu cpuVar, g7s0 g7s0Var, VideoPlaylistReversionComponent videoPlaylistReversionComponent, s0a s0aVar) {
        this.a = i;
        this.b = cgaVar;
        this.c = videoBottomSheetComponent;
        this.d = userId;
        this.e = aVar;
        this.f = cpuVar;
        this.g = g7s0Var;
        this.h = videoPlaylistReversionComponent;
        this.i = s0aVar;
        b990 b990Var = new b990(this, 2);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.j = msy.a(lazyThreadSafetyMode, b990Var);
        this.k = msy.a(lazyThreadSafetyMode, new tu80(this, 8));
        this.l = msy.a(lazyThreadSafetyMode, new dj60(this, 9));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.cga
    public final void a(Context context, bea beaVar) {
        Activity h;
        UserId userId = this.d;
        long j = userId.b;
        boolean z = beaVar instanceof bea.a;
        cga cgaVar = this.b;
        if (!z) {
            cgaVar.a(context, beaVar);
            return;
        }
        r1a r1aVar = ((bea.a) beaVar).a;
        boolean z2 = r1aVar instanceof fet0;
        int i = this.a;
        if (!z2) {
            if (!(r1aVar instanceof jcb0)) {
                cgaVar.a(context, beaVar);
                return;
            }
            this.h.X3(i, j);
            wjs0.a(new fwr0(i, j));
            wjs0.a(new iwr0(i, j));
            return;
        }
        fet0 fet0Var = (fet0) r1aVar;
        if (!(fet0Var instanceof fet0.e) || (h = e3m.h(context)) == null) {
            return;
        }
        fet0.e eVar = (fet0.e) fet0Var;
        VideoFile videoFile = eVar.a;
        a.c cVar = new a.c(Integer.valueOf(i), userId, userId, videoFile.x8(), false, eVar.b);
        a.InterfaceC1255a interfaceC1255a = (a.InterfaceC1255a) this.j.getValue();
        this.e.getClass();
        s6s0 a = interfaceC1255a.a(new a.InterfaceC1255a.C1256a(videoFile, cVar, null, true), new j6s0(videoFile.r(), this.i), new ai6(this.f, 8));
        boolean booleanValue = ((Boolean) this.l.getValue()).booleanValue();
        ?? r1 = this.k;
        if (booleanValue) {
            new w6s0(a, (y6s0) r1.getValue()).e(h);
        } else {
            new e6s0(h, a, (y6s0) r1.getValue()).c();
        }
    }
}
