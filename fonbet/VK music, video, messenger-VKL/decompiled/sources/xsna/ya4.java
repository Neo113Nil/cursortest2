package xsna;

import android.content.Context;
import com.vk.audience.api.domain.tracking.AudienceResearchTrackerCodes;
import com.vk.dto.newsfeed.entries.Post;
import com.vkontakte.android.R;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.ikv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class ya4 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ya4(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                za4 za4Var = (za4) this.c;
                AudienceResearchTrackerCodes audienceResearchTrackerCodes = (AudienceResearchTrackerCodes) this.d;
                za4Var.a.p(new tkv("https://" + audienceResearchTrackerCodes.h() + ".ms.dzen.ru", false, 4));
                break;
            case 1:
                Post post = (Post) this.c;
                Context context = (Context) this.d;
                post.l.Ab(562949953421312L, false);
                ce60.b.getClass();
                p870.f().e(153, post);
                ikv0.a aVar = new ikv0.a(context);
                aVar.t = ikv0.c.f.a;
                aVar.u = new ikv0.d(context.getString(R.string.wall_removed_from_main), (String) null, (ikv0.d.a) null, 6);
                aVar.n();
                break;
            default:
                x8m0 x8m0Var = (x8m0) this.c;
                sht0 sht0Var = (sht0) this.d;
                CopyOnWriteArrayList<sht0> copyOnWriteArrayList = x8m0Var.e;
                copyOnWriteArrayList.add(sht0Var);
                if (copyOnWriteArrayList.size() > ((Number) x8m0Var.b.getValue()).intValue()) {
                    g5g.H(copyOnWriteArrayList);
                }
                x8m0Var.d();
                break;
        }
    }
}
