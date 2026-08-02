package xsna;

import com.vk.core.exceptions.DisposableException;
import com.vk.dto.music.MusicTrack;
import xsna.k840;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class fa implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fa(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((ja) this.c).n = false;
                break;
            case 1:
                ((l57) this.c).a();
                break;
            case 2:
                ((afb) this.c).b.d();
                break;
            case 3:
                ftb ftbVar = (ftb) this.c;
                ftbVar.g = null;
                ftbVar.e.V();
                break;
            case 4:
                ((gzs) this.c).invoke();
                break;
            case 5:
                ((bq60) this.c).a(yo60.e.a.a);
                break;
            case 6:
                MusicTrack musicTrack = (MusicTrack) this.c;
                MusicTrack a = kq40.a(musicTrack);
                r5v0 r5v0Var = k840.a.h;
                if (r5v0Var == null) {
                    r5v0Var = null;
                }
                r5v0Var.b(new ib50(musicTrack, a));
                break;
            case 7:
                ((oj50) this.c).onDestroy();
                break;
            case 8:
                yp80 yp80Var = (yp80) this.c;
                if (yp80Var != null) {
                    yp80Var.onError(new DisposableException());
                    break;
                }
                break;
            case 9:
                ((sr80) this.c).a();
                break;
            case 10:
                ((tca0) this.c).c.clear();
                break;
            default:
                ((arl0) this.c).E.a();
                break;
        }
    }
}
