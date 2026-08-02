package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.PropertyReference1Impl;

/* compiled from: AutoPlayNow.kt */
/* loaded from: classes2.dex */
public final class xh5 {
    public static final /* synthetic */ qcy<Object>[] f = {new PropertyReference1Impl(xh5.class, "surface", "getSurface()Lcom/vk/libvideo/design/view/videotexture/VideoTextureView;", 0), fp.c(0, xh5.class, "vh", "getVh()Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", fpf0.a)};
    public final yg5 a;
    public final com.vk.libvideo.autoplay.a b;
    public final ent0 c;
    public final nl d;
    public final nl e;

    public xh5(yg5 yg5Var, com.vk.libvideo.autoplay.a aVar, VideoTextureView videoTextureView, RecyclerView.e0 e0Var, ent0 ent0Var) {
        this.a = yg5Var;
        this.b = aVar;
        this.c = ent0Var;
        this.d = new nl(videoTextureView);
        this.e = new nl(e0Var);
    }

    public final yg5 a() {
        return this.a;
    }

    public final dnt0 b() {
        mnt0 c;
        Object d = d();
        ent0 ent0Var = d instanceof ent0 ? (ent0) d : null;
        if (ent0Var != null && (c = x5t0.c(ent0Var)) != null) {
            return c;
        }
        ent0 ent0Var2 = this.c;
        if (ent0Var2 != null) {
            return ent0Var2.q3();
        }
        return null;
    }

    public final VideoTextureView c() {
        qcy<Object> qcyVar = f[0];
        return (VideoTextureView) ((WeakReference) this.d.b).get();
    }

    public final RecyclerView.e0 d() {
        qcy<Object> qcyVar = f[1];
        return (RecyclerView.e0) ((WeakReference) this.e.b).get();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!xh5.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        xh5 xh5Var = (xh5) obj;
        return epx.f(this.a, xh5Var.a) && epx.f(this.b, xh5Var.b) && epx.f(c(), xh5Var.c()) && epx.f(d(), xh5Var.d());
    }

    public final int hashCode() {
        yg5 yg5Var = this.a;
        return this.b.hashCode() + ((yg5Var != null ? yg5Var.hashCode() : 0) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{autoPlay=");
        sb.append(this.a);
        sb.append(",pos=");
        RecyclerView.e0 d = d();
        sb.append(d != null ? Integer.valueOf(d.getAdapterPosition()) : null);
        sb.append(",config=");
        sb.append(this.b);
        sb.append(",surface=");
        VideoTextureView c = c();
        return uqi.b(sb, c != null ? Integer.valueOf(c.hashCode()) : null, '}');
    }
}
