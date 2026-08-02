package xsna;

import android.support.v4.media.session.PlaybackStateCompat;
import com.vk.dto.newsfeed.entries.Post;
import xsna.qr60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class czw implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ czw(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((dzw) this.c).b.invoke(new qr60.a.d(false));
                break;
            case 1:
                ((e8u0) this.c).d.invoke();
                break;
            default:
                ((Post) this.c).l.Ab(PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID, false);
                break;
        }
    }
}
