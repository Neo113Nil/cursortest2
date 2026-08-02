package xsna;

import android.view.View;
import androidx.media3.common.ParserException;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.vk.dto.music.MusicTrack;
import com.vk.music.offline.api.model.MusicOfflineCacheStorage;
import com.vkontakte.android.R;
import xsna.k840;
import xsna.lt70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class z1r implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ z1r(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b5  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        int i = this.b;
        boolean z2 = false;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                b2r b2rVar = (b2r) obj3;
                ho60 ho60Var = b2rVar.c;
                ho60Var.e.remove((qyp0) obj2);
                ho60Var.e.add((qyp0) obj);
                b2rVar.n();
                break;
            case 1:
                ((GaugeManager) obj3).lambda$stopCollectingGauges$4((String) obj2, (ApplicationProcessState) obj);
                break;
            case 2:
                MusicTrack musicTrack = (MusicTrack) obj3;
                sg40 sg40Var = (sg40) obj2;
                oya0 oya0Var = (oya0) obj;
                boolean S4 = musicTrack.S4();
                up40 up40Var = sg40Var.b;
                boolean booleanValue = up40Var.C(musicTrack).i().booleanValue();
                MusicOfflineCacheStorage d = sg40Var.e.d(musicTrack.Fb());
                Throwable cause = oya0Var != null ? oya0Var.a.getCause() : null;
                if (S4) {
                    ParserException parserException = cause instanceof ParserException ? (ParserException) cause : null;
                    if (parserException != null && parserException.contentIsMalformed) {
                        z = true;
                        if (S4) {
                            eqy<bek0> eqyVar = com.vk.toggle.d.a;
                            if (com.vk.toggle.d.T(k840.a.i.b())) {
                                z2 = true;
                            }
                        }
                        if ((S4 && !booleanValue) || z || z2) {
                            sg40Var.n.execute(new cy3(5, sg40Var, musicTrack));
                            new lt70.a(0, 0, 0, k840.a.i.b(), ((Boolean) sg40Var.o.getValue()).booleanValue(), 0, 0, 1).q();
                        }
                        new lt70.d(musicTrack, S4, booleanValue, d, oya0Var, S4 ? sg40Var.a.Z(musicTrack, up40Var.B(musicTrack)) : null).q();
                        break;
                    }
                }
                z = false;
                if (S4) {
                }
                if (S4) {
                    sg40Var.n.execute(new cy3(5, sg40Var, musicTrack));
                    new lt70.a(0, 0, 0, k840.a.i.b(), ((Boolean) sg40Var.o.getValue()).booleanValue(), 0, 0, 1).q();
                    new lt70.d(musicTrack, S4, booleanValue, d, oya0Var, S4 ? sg40Var.a.Z(musicTrack, up40Var.B(musicTrack)) : null).q();
                }
                sg40Var.n.execute(new cy3(5, sg40Var, musicTrack));
                new lt70.a(0, 0, 0, k840.a.i.b(), ((Boolean) sg40Var.o.getValue()).booleanValue(), 0, 0, 1).q();
                new lt70.d(musicTrack, S4, booleanValue, d, oya0Var, S4 ? sg40Var.a.Z(musicTrack, up40Var.B(musicTrack)) : null).q();
                break;
            default:
                ((cgq0) obj3).y.getClass();
                cvk.w(j03.g(((View) obj2).getContext(), (Throwable) obj, R.string.error), false);
                break;
        }
    }
}
