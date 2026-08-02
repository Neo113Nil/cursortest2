package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.stat.scheme.CommonUxpollsStat$TypeUxpollsEvent;
import kotlin.LazyThreadSafetyMode;
import xsna.itk0;

/* compiled from: VideoDynamicPollDelegate.kt */
/* loaded from: classes16.dex */
public final class kis0 {
    public final m2u0 a;
    public final lis0 b;
    public VideoFile c;
    public String d;
    public itk0.b e;
    public final Object f = msy.a(LazyThreadSafetyMode.NONE, new vxl0(4));

    public kis0(m2u0 m2u0Var, tkl tklVar, lis0 lis0Var) {
        this.a = m2u0Var;
        this.b = lis0Var;
        m2u0Var.g = new iis0(this);
    }

    public final void a() {
        this.d = null;
        this.e = null;
        this.c = null;
        this.b.a(itk0.a.a);
        this.a.b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void b(CommonUxpollsStat$TypeUxpollsEvent.EventType eventType) {
        mis0 mis0Var = (mis0) this.f.getValue();
        VideoFile videoFile = this.c;
        String r = videoFile != null ? videoFile.r() : null;
        String str = this.d;
        itk0.b bVar = this.e;
        mis0Var.c(eventType, bVar != null ? Integer.valueOf(bVar.a) : null, r, str);
    }
}
