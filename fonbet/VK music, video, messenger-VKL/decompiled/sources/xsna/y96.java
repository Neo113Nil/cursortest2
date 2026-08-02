package xsna;

import android.support.v4.media.session.PlaybackStateCompat;
import com.vk.dto.newsfeed.entries.Post;
import xsna.ea6;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class y96 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y96(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((ea6.c) this.c).c.getClass();
                break;
            case 1:
                i0q0.f(new mxj((ftp) this.c, 10));
                break;
            case 2:
                ((gzs) this.c).invoke();
                break;
            case 3:
                ((e8u0) this.c).d.invoke();
                break;
            default:
                ((Post) this.c).l.Ab(PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID, true);
                break;
        }
    }
}
