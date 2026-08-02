package xsna;

import android.graphics.Bitmap;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class l6m implements Runnable {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l6m(androidx.profileinstaller.b bVar, int i, Object obj) {
        this.d = bVar;
        this.c = i;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                androidx.profileinstaller.b bVar = (androidx.profileinstaller.b) this.d;
                bVar.c.a(this.c, this.e);
                break;
            default:
                com.vungle.ads.internal.util.i.a((com.vungle.ads.internal.util.j) this.d, (Bitmap) this.e, this.c);
                break;
        }
    }

    public /* synthetic */ l6m(com.vungle.ads.internal.util.j jVar, Bitmap bitmap, int i) {
        this.d = jVar;
        this.e = bitmap;
        this.c = i;
    }
}
