package xsna;

import android.os.Handler;
import com.vkontakte.android.MainActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class mco implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mco(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                one.video.exo.offline.g gVar = (one.video.exo.offline.g) this.c;
                gVar.a.a();
                Handler handler = gVar.b;
                mco mcoVar = gVar.c;
                handler.removeCallbacks(mcoVar);
                handler.postDelayed(mcoVar, 1000L);
                break;
            default:
                ((crw) ((MainActivity) this.c).z.getValue()).onCreate();
                break;
        }
    }
}
