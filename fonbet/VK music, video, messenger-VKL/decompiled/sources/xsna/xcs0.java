package xsna;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.pgt0;
import xsna.zct0;

/* compiled from: VideoCompleteView.kt */
/* loaded from: classes2.dex */
public final class xcs0 extends qqy<a> {
    public final c c;
    public final boolean d;
    public final gzs<qul> e;
    public final Object f;
    public final Object g;
    public final Object h;

    /* compiled from: VideoCompleteView.kt */
    public static final class a {
        public final boolean a;
        public final View.OnClickListener b;
        public final List<hfz> c;
        public final vwr0 d;
        public final com.vk.libvideo.design.view.endview.a e;

        /* JADX WARN: Multi-variable type inference failed */
        public a(boolean z, View.OnClickListener onClickListener, List<? extends hfz> list, vwr0 vwr0Var, com.vk.libvideo.design.view.endview.a aVar) {
            this.a = z;
            this.b = onClickListener;
            this.c = list;
            this.d = vwr0Var;
            this.e = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e);
        }

        public final int hashCode() {
            int hashCode = (this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31;
            List<hfz> list = this.c;
            return this.e.hashCode() + ((this.d.hashCode() + ((hashCode + (list == null ? 0 : list.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            return "Data(isActionLinkVideoType=" + this.a + ", listener=" + this.b + ", similarVideos=" + this.c + ", videoActionCompleteDataMapper=" + this.d + ", videoEndDataMapper=" + this.e + ')';
        }
    }

    /* compiled from: VideoCompleteView.kt */
    public static abstract class b {

        /* compiled from: VideoCompleteView.kt */
        public static final class a extends b {
            public static final a a = new a();
        }

        /* compiled from: VideoCompleteView.kt */
        /* renamed from: xsna.xcs0$b$b, reason: collision with other inner class name */
        public static final class C3996b extends b {
            public static final C3996b a = new C3996b();
        }

        /* compiled from: VideoCompleteView.kt */
        public static final class c extends b {
            public static final c a = new c();
        }
    }

    /* compiled from: VideoCompleteView.kt */
    public static final class c {
        public final boolean a;

        public c(boolean z) {
            this.a = z;
        }
    }

    public xcs0() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xcs0(Context context, c cVar, uh80 uh80Var, int i) {
        super(context);
        cVar = (i & 8) != 0 ? null : cVar;
        uh80Var = (i & 32) != 0 ? null : uh80Var;
        this.c = cVar;
        this.d = true;
        this.e = uh80Var;
        wcs0 wcs0Var = new wcs0(this, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f = msy.a(lazyThreadSafetyMode, wcs0Var);
        this.g = msy.a(lazyThreadSafetyMode, new icn0(this, 7));
        this.h = msy.a(lazyThreadSafetyMode, new qjo0(this, 6));
        this.b.getClass();
        if (vsy.d()) {
            b();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final xwr0 getVideoActionCompleteView() {
        return (xwr0) this.g.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final zct0 getVideoReplayCompleteView() {
        return (zct0) this.f.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final pgt0 getVideoSimilarCompleteView() {
        return (pgt0) this.h.getValue();
    }

    @Override // xsna.qqy
    public final void b() {
        zct0 zct0Var = new zct0(getContext());
        zct0Var.setId(R.id.video_replay_complete);
        zct0Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        zct0Var.setVisibility(8);
        addView(zct0Var);
        xwr0 xwr0Var = new xwr0(getContext());
        xwr0Var.setId(R.id.video_action_complete_view);
        xwr0Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        xwr0Var.setVisibility(8);
        addView(xwr0Var);
        c cVar = this.c;
        if (cVar != null) {
            pgt0 pgt0Var = new pgt0(getContext(), cVar.a, this.d, this.e);
            pgt0Var.setId(R.id.video_end_view_with_similar);
            pgt0Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            pgt0Var.setVisibility(8);
            addView(pgt0Var);
        }
    }

    @Override // xsna.qqy
    public final void c(a aVar) {
        pgt0 videoSimilarCompleteView;
        a aVar2 = aVar;
        View.OnClickListener onClickListener = aVar2.b;
        List list = aVar2.c;
        if (list == null) {
            list = EmptyList.b;
        }
        getVideoReplayCompleteView().a(new zct0.a(onClickListener));
        getVideoActionCompleteView().a(aVar2.d);
        c cVar = this.c;
        if (cVar != null && (videoSimilarCompleteView = getVideoSimilarCompleteView()) != null) {
            videoSimilarCompleteView.t.b(new pgt0.a(aVar2.e, onClickListener, list));
        }
        Object obj = cVar != null ? b.c.a : aVar2.a ? b.a.a : b.C3996b.a;
        getVideoReplayCompleteView().setVisibility(epx.f(obj, b.C3996b.a) ? 0 : 8);
        getVideoActionCompleteView().setVisibility(epx.f(obj, b.a.a) ? 0 : 8);
        pgt0 videoSimilarCompleteView2 = getVideoSimilarCompleteView();
        if (videoSimilarCompleteView2 != null) {
            videoSimilarCompleteView2.setVisibility(epx.f(obj, b.c.a) ? 0 : 8);
        }
    }

    public final c getWithSimilar() {
        return this.c;
    }
}
