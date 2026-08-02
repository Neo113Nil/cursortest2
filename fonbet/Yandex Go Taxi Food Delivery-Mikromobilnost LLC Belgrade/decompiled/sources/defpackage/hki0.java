package defpackage;

import android.app.Activity;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.messaging.analytics.fps.a;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes15.dex */
public abstract class hki0 extends RecyclerView.g {
    public final a a;

    public hki0(Activity activity) {
        this.a = new a(activity);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        super.onScrollStateChanged(recyclerView, i);
        a aVar = this.a;
        if (i != 0) {
            if (aVar.b) {
                return;
            }
            boolean a = aVar.a();
            z83.i();
            z83.i();
            if (aVar.b || a) {
                return;
            }
            aVar.b = true;
            aVar.j.postFrameCallback(aVar.k);
            return;
        }
        if (aVar.b) {
            dfs b = aVar.b();
            if (b != null) {
                jki0 jki0Var = ((iki0) this).b;
                x22 x22Var = jki0Var.c;
                String str = jki0Var.a;
                Pair pair = new Pair("fps", Integer.valueOf(b.a));
                Pair pair2 = new Pair("fpsLite", Integer.valueOf(b.b));
                Pair pair3 = new Pair("framesCount", Integer.valueOf(b.c));
                long j = b.f;
                x22Var.reportEvent(str, b.i(pair, pair2, pair3, new Pair("longestFrameTime", Long.valueOf(j)), new Pair("criticalFramesCount", Integer.valueOf(b.e)), new Pair("longestFrameTime", Long.valueOf(j)), new Pair("refreshRate", Integer.valueOf(b.g)), new Pair("hostName", jki0Var.d), new Pair("connectionStatus", Integer.valueOf(jki0Var.e.a().a))));
            }
            aVar.b();
            aVar.c = 0L;
            aVar.d = 0;
            aVar.e = 0;
            aVar.b = false;
            aVar.f = 0;
            aVar.g = 0L;
            aVar.h = 0L;
            aVar.i = 0L;
        }
    }
}
