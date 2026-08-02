package xsna;

import android.support.v4.media.session.PlaybackStateCompat;
import com.vk.dto.newsfeed.entries.Post;
import xsna.dv70;
import xsna.e4n;
import xsna.j0j;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ahe implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ahe(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                fhe fheVar = (fhe) obj;
                fheVar.b = null;
                fheVar.c = null;
                break;
            case 1:
                ((s0j) obj).C(j0j.c.b);
                break;
            case 2:
                ((e4n.a) obj).a();
                break;
            case 3:
                ((el50) obj).W().c(dv70.a.a);
                break;
            case 4:
                ((gzs) obj).invoke();
                break;
            case 5:
                ((e8u0) obj).d.invoke();
                break;
            default:
                ((Post) obj).l.Ab(PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID, false);
                break;
        }
    }
}
