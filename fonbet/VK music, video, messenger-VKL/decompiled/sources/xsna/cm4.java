package xsna;

import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.stickers.StickerStockItemWithStickerId;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.List;
import xsna.a3i;
import xsna.c2n;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class cm4 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cm4(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((em4) this.c).e.dispose();
                break;
            case 1:
                ((uv4) this.c).f = false;
                break;
            case 2:
                ((com.vk.music.notifications.restriction.a) this.c).d.b(null);
                break;
            case 3:
                x2i x2iVar = ((s6h) this.c).f;
                if (x2iVar != null) {
                    x2iVar.mn(a3i.a.a);
                    break;
                }
                break;
            case 4:
                ((p9k) this.c).d.e();
                break;
            case 5:
                c2n c2nVar = (c2n) this.c;
                c2n.a aVar = c2nVar.c;
                UiTrackingScreen uiTrackingScreen = c2nVar.e;
                boolean z = false;
                if (uiTrackingScreen != null) {
                    MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.CLIPS;
                    MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen2 = uiTrackingScreen.a;
                    if (mobileOfficialAppsCoreNavStat$EventScreen != mobileOfficialAppsCoreNavStat$EventScreen2 || uiTrackingScreen.f != null) {
                        z = c2nVar.a.contains(mobileOfficialAppsCoreNavStat$EventScreen2);
                    }
                }
                aVar.b(new c2n.b(z));
                break;
            case 6:
                ((w920) this.c).q.compareAndSet(true, false);
                break;
            case 7:
                q5n0 q5n0Var = (q5n0) this.c;
                Integer num = q5n0Var.h;
                if (num != null) {
                    List<StickerStockItemWithStickerId> a = q5n0Var.e.a(num.intValue());
                    if (a != null) {
                        q5n0Var.a(a);
                        break;
                    }
                }
                break;
            case 8:
                ((ihu0) this.c).i = false;
                break;
            default:
                eax0.w((Post) this.c);
                break;
        }
    }

    public /* synthetic */ cm4(eax0 eax0Var, Post post) {
        this.b = 9;
        this.c = post;
    }
}
