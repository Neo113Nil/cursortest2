package xsna;

import android.app.Activity;
import android.graphics.PorterDuffColorFilter;
import com.vk.donut.video.model.domain.action.DonutVideoAction;
import com.vk.newsfeed.impl.presentation.from_notifications.presentation.fragment.PostsFromNotificationsFragment;
import com.vk.stickers.views.VKStickerImageView;
import java.util.Map;
import xsna.h120;
import xsna.h8z0;
import xsna.hjz0;
import xsna.nnq0;
import xsna.no90;
import xsna.s8z0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class ao90 implements io.reactivex.rxjava3.functions.l, ptk0, io.reactivex.rxjava3.functions.m, r580, h8z0.b, s8z0.a, yads.ng1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ao90(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.h8z0.b
    public void a() {
        xyy0 xyy0Var = (xyy0) this.c;
        hjz0.a aVar = xyy0Var.a;
        String str = xyy0Var.k.F;
        yil0.d(aVar);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (no90.b.C3407b) ((h2s) this.c).invoke(obj);
            case 1:
            case 4:
            case 6:
            case 9:
            default:
                return (whr0) ((ieo) this.c).invoke(obj);
            case 2:
                return (io.reactivex.rxjava3.core.e) ((iyd0) this.c).invoke(obj);
            case 3:
                return (Map) ((du0) this.c).invoke(obj);
            case 5:
                return ((nnq0.a) this.c).invoke(obj);
            case 7:
                return (io.reactivex.rxjava3.core.t) ((l5r0) this.c).invoke(obj);
            case 8:
                return (ncq0) ((l5r0) this.c).invoke(obj);
            case 10:
                return (h120.a) ((du0) this.c).invoke(obj);
            case 11:
                return (io.reactivex.rxjava3.core.t) ((iyd0) this.c).invoke(obj);
        }
    }

    public void b() {
        jgz0 jgz0Var = (jgz0) this.c;
        v1z0 v1z0Var = jgz0Var.k;
        if (v1z0Var != null) {
            tez0 tez0Var = jgz0Var.d;
            v1z0Var.c();
            v1z0Var.d.a(tez0Var);
            jgz0Var.k.d();
            jgz0Var.k = null;
        }
        jgz0Var.f.a.j = true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.r580
    public void c(DonutVideoAction donutVideoAction) {
        com.vk.libvideo.offline.ui.a aVar = (com.vk.libvideo.offline.ui.a) this.c;
        Activity b = enj.b(aVar.itemView);
        if (donutVideoAction == null || b == null) {
            return;
        }
        ((x4o) aVar.z.getValue()).a(donutVideoAction, b, null);
    }

    @Override // xsna.s8z0.a
    public void i(z9z0 z9z0Var) {
        ((w1z0) this.c).e = z9z0Var;
    }

    @Override // yads.ng1
    public void invoke(Object obj) {
        ((yads.nf2) obj).a((yads.sk3) this.c);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        iyd0 iyd0Var = (iyd0) this.c;
        PorterDuffColorFilter porterDuffColorFilter = VKStickerImageView.p;
        return ((Boolean) iyd0Var.invoke(obj)).booleanValue();
    }

    @Override // xsna.ptk0
    public void a(lm50 lm50Var) {
        ml50 ml50Var = ((PostsFromNotificationsFragment) this.c).T;
        s3q0 s3q0Var = s3q0.a;
        ((ul50) ml50Var.c).r(s3q0Var, (nwc0) lm50Var);
    }
}
