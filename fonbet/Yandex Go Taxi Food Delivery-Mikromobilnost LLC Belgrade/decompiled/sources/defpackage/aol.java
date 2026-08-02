package defpackage;

import android.view.View;
import com.yandex.div.core.c;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.x;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes11.dex */
public final class aol implements q4l {
    public final /* synthetic */ x a;
    public final /* synthetic */ Div2View b;
    public final /* synthetic */ rvo c;
    public final /* synthetic */ ynl d;
    public final /* synthetic */ View e;

    public aol(x xVar, Div2View div2View, rvo rvoVar, ynl ynlVar, View view) {
        this.a = xVar;
        this.b = div2View;
        this.c = rvoVar;
        this.d = ynlVar;
        this.e = view;
    }

    @Override // defpackage.q4l
    public final void b() {
        this.e.setVisibility(4);
    }

    @Override // defpackage.q4l
    public final void c() {
        c.c(this.a.w, this.b, this.c, this.d.E, MediaStreamTrack.VIDEO_TRACK_KIND);
    }

    @Override // defpackage.q4l
    public final void e() {
        c.c(this.a.w, this.b, this.c, this.d.n, MediaStreamTrack.VIDEO_TRACK_KIND);
    }

    @Override // defpackage.q4l
    public final void f() {
        c.c(this.a.w, this.b, this.c, this.d.j, MediaStreamTrack.VIDEO_TRACK_KIND);
    }

    @Override // defpackage.q4l
    public final void g() {
        c.c(this.a.w, this.b, this.c, this.d.p, MediaStreamTrack.VIDEO_TRACK_KIND);
    }

    @Override // defpackage.q4l
    public final void onPause() {
        c.c(this.a.w, this.b, this.c, this.d.y, MediaStreamTrack.VIDEO_TRACK_KIND);
    }
}
