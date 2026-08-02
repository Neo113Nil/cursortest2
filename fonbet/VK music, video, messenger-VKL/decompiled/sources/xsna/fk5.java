package xsna;

import android.graphics.Bitmap;
import android.net.Uri;
import com.vk.dto.common.TimelineThumbs;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.ui.preview.VideoSeekPreviewImage;
import com.vk.stickers.autosuggest.AutoSuggestStickersPopupWindow;
import java.util.List;
import xsna.r070;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class fk5 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fk5(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [xsna.bim0] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        List<String> list;
        int i = this.b;
        int i2 = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                ((AutoSuggestStickersPopupWindow) obj2).e.n(i2);
                return s3q0.a;
            case 1:
                ((uj60) obj2).a(new r070.j.b(i2));
                return s3q0.a;
            case 2:
                UserId userId = (UserId) obj2;
                qyg0 V0 = ((hyg0) obj).V0("SELECT * FROM story_statistics_viewers_meta WHERE owner_id = ? AND story_id = ? LIMIT 1");
                try {
                    bpn0 bpn0Var = bfm0.a;
                    V0.bindLong(1, userId.b);
                    V0.bindLong(2, i2);
                    return V0.step() ? new bim0(new UserId(V0.getLong(egi.k(V0, "owner_id"))), (int) V0.getLong(egi.k(V0, "story_id")), (int) V0.getLong(egi.k(V0, "viewsCount")), (int) V0.getLong(egi.k(V0, "answersCount")), (int) V0.getLong(egi.k(V0, "reactionsCount")), (int) V0.getLong(egi.k(V0, "new_reactions"))) : null;
                } finally {
                    V0.close();
                }
            default:
                Boolean bool = (Boolean) obj;
                TimelineThumbs timelineThumbs = ((VideoSeekPreviewImage) obj2).E;
                if (timelineThumbs != null && (list = timelineThumbs.i) != null) {
                    r1 = (String) j5g.b0(i2, list);
                }
                Bitmap k = mcr0.k(r1);
                return k != null ? io.reactivex.rxjava3.core.q.T(k) : bool.booleanValue() ? mcr0.h(Uri.parse(r1)).h0(2L) : io.reactivex.rxjava3.core.q.H(new VideoSeekPreviewImage.a());
        }
    }
}
