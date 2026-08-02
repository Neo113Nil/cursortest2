package xsna;

import android.os.Handler;
import android.os.Looper;
import com.vk.stories.design.view.stickers.selection.SelectionStickerView;
import com.vkontakte.android.data.b;
import java.util.concurrent.TimeUnit;
import xsna.b6l0;

/* compiled from: FullSearchRxHandler.kt */
/* loaded from: classes15.dex */
public final class fws {
    public final gws a;
    public final zvs b;
    public final syt c;
    public final irc0 d;
    public final io.reactivex.rxjava3.disposables.b e;
    public final SelectionStickerView.OpenFrom f;
    public final os30 g;
    public final qah0 h;
    public final ah7 i;
    public final gqh0 j;
    public final sy50 k;
    public final Handler l = new Handler(Looper.getMainLooper());
    public final io.reactivex.rxjava3.subjects.f<String> m = new io.reactivex.rxjava3.subjects.f<>();
    public final io.reactivex.rxjava3.subjects.f<s3q0> n;

    public fws(gws gwsVar, zvs zvsVar, syt sytVar, irc0 irc0Var, io.reactivex.rxjava3.disposables.b bVar, SelectionStickerView.OpenFrom openFrom, os30 os30Var, qah0 qah0Var, ah7 ah7Var, gqh0 gqh0Var, sy50 sy50Var) {
        this.a = gwsVar;
        this.b = zvsVar;
        this.c = sytVar;
        this.d = irc0Var;
        this.e = bVar;
        this.f = openFrom;
        this.g = os30Var;
        this.h = qah0Var;
        this.i = ah7Var;
        this.j = gqh0Var;
        this.k = sy50Var;
        io.reactivex.rxjava3.subjects.f<s3q0> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.n = fVar;
        hg1.e(bVar, fVar.y(400L, TimeUnit.MILLISECONDS).a0(asu0.a.d()).subscribe(new p41(new arf(this, 16), 27)));
    }

    public final void a() {
        final int i;
        if (this.f == SelectionStickerView.OpenFrom.STORY) {
            Handler handler = this.l;
            handler.removeCallbacksAndMessages(null);
            final String b = ((afi0) this.h.c).b();
            gws gwsVar = this.a;
            b6l0.a aVar = gwsVar.d;
            if (aVar != null) {
                i = aVar.c.size() + aVar.b.size();
            } else {
                i = 0;
            }
            final int size = gwsVar.e.c.size();
            if (b.length() > 0) {
                handler.postDelayed(new Runnable() { // from class: xsna.ews
                    @Override // java.lang.Runnable
                    public final void run() {
                        bpn0 bpn0Var = jcl0.a;
                        b.d a = io.reactivex.rxjava3.processors.b.a("search_sticker", "query", b);
                        a.b(Integer.valueOf(i), "result_size");
                        a.b(Integer.valueOf(size), "gif_result_size");
                        a.e();
                    }
                }, 800L);
            }
        }
    }
}
