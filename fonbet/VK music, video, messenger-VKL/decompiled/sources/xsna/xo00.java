package xsna;

import android.content.Context;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListSmallVh;
import com.vk.dto.common.VideoFile;
import kotlin.Pair;
import ru.ok.android.webrtc.mediarecord.VideoRecord;
import xsna.g7g0;
import xsna.wih0;
import xsna.wwu0;
import xsna.yt0;
import xsna.ztz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class xo00 implements gzs {
    public final /* synthetic */ int b = 2;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ xo00(VideoItemListSmallVh videoItemListSmallVh, Context context, VideoFile videoFile, com.vk.libvideo.design.view.overlay.b bVar) {
        this.c = videoItemListSmallVh;
        this.f = context;
        this.d = videoFile;
        this.e = bVar;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                zo00 zo00Var = (zo00) this.c;
                String str = (String) this.d;
                wih0.b.a aVar = (wih0.b.a) this.e;
                Context context = (Context) this.f;
                zo00Var.d.invoke(new yt0.h.a(new zt0(str, aVar.k)));
                b1r b1rVar = zo00Var.a;
                String str2 = aVar.g;
                if (str2 != null) {
                    b1rVar.a(context, str2);
                    break;
                } else {
                    break;
                }
            case 1:
                g7g0.a aVar2 = (g7g0.a) this.c;
                ma maVar = (ma) this.d;
                l22 l22Var = (l22) this.e;
                jl4 jl4Var = (jl4) this.f;
                String str3 = (String) aVar2.d.e.invoke();
                if (str3 != null) {
                    w25 w25Var = (w25) aVar2.d.c.invoke();
                    wdx0 wdx0Var = e370.f;
                    if (wdx0Var == null) {
                        wdx0Var = null;
                    }
                    wdx0Var.getClass();
                    wdx0 wdx0Var2 = e370.f;
                    if (wdx0Var2 == null) {
                        wdx0Var2 = null;
                    }
                    wdx0Var2.getClass();
                    wdx0 wdx0Var3 = e370.f;
                    if (wdx0Var3 == null) {
                        wdx0Var3 = null;
                    }
                    wdx0Var3.getClass();
                    Pair pair = myc0.f(w25Var.a) ? new Pair(w25Var.a, w25Var.c) : new Pair(null, null);
                    String str4 = (String) pair.d();
                    String str5 = (String) pair.g();
                    if (str4 == null) {
                        str4 = "";
                    }
                    wwu0 a = wwu0.a.a(str4, str5, aVar2.a, aVar2.b, h9r0.d, str3, null, aVar2.e, VideoRecord.DEFAULT_MAX_DIMENSION);
                    vdx0 vdx0Var = e370.e;
                    if (vdx0Var == null) {
                        vdx0Var = null;
                    }
                    io.reactivex.rxjava3.internal.operators.observable.m1 d = vdx0Var.a().d(a, null);
                    io.reactivex.rxjava3.disposables.c subscribe = (aVar2.f ? io.reactivex.rxjava3.core.q.I0(d, io.reactivex.rxjava3.core.q.T(ztz.b.a), new n8c0(new v3l(3), 4)) : d.U(new bj50(new xpt(26), 6))).subscribe(new afs(new jl6(aVar2, maVar, l22Var, 11), 21), new j720(new ysd(aVar2, jl4Var, maVar, 12), 8));
                    io.reactivex.rxjava3.disposables.b bVar = aVar2.c;
                    if (bVar != null) {
                        bVar.b(subscribe);
                    }
                    break;
                } else {
                    xgx0.a.getClass();
                    xgx0.g("empty url on auth request!");
                    break;
                }
            default:
                ((VideoItemListSmallVh) this.c).s.a((Context) this.f, (VideoFile) this.d, ((com.vk.libvideo.design.view.overlay.b) this.e).f, null, null);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ xo00(zo00 zo00Var, String str, wih0.b.a aVar, Context context) {
        this.c = zo00Var;
        this.d = str;
        this.e = aVar;
        this.f = context;
    }

    public /* synthetic */ xo00(g7g0.a aVar, g7g0 g7g0Var, ma maVar, l22 l22Var, jl4 jl4Var) {
        this.c = aVar;
        this.d = maVar;
        this.e = l22Var;
        this.f = jl4Var;
    }
}
