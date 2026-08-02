package xsna;

import android.support.v4.media.session.PlaybackStateCompat;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.stickers.StickerStockItemWithStickerId;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class zm80 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zm80(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((dn80) this.c).h.b(if5.a);
                break;
            case 1:
                uhj0 uhj0Var = (uhj0) this.c;
                io.reactivex.rxjava3.disposables.c cVar = uhj0Var.s;
                if (cVar != null) {
                    uhj0Var.q.a(cVar);
                }
                uhj0Var.s = null;
                break;
            case 2:
                s5n0 s5n0Var = (s5n0) this.c;
                List<StickerStockItemWithStickerId> a = s5n0Var.c.a(s5n0Var.d);
                if (a != null) {
                    s5n0Var.a(a);
                    break;
                }
                break;
            case 3:
                g7q0 g7q0Var = (g7q0) this.c;
                g7q0Var.b.B(false);
                g7q0Var.a2();
                break;
            case 4:
                ((e8u0) this.c).d.invoke();
                break;
            default:
                ((Post) this.c).l.Ab(PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID, true);
                break;
        }
    }
}
