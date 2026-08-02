package xsna;

import android.content.Context;
import com.vk.dto.newsfeed.exceptions.PostNotFoundException;
import com.vk.dto.shortvideo.ClipsAuthor;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class dxe implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Context c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ dxe(Context context, Context context2, ClipsAuthor clipsAuthor, String str, fxe fxeVar, izs izsVar) {
        this.e = fxeVar;
        this.c = context;
        this.d = str;
        this.f = context2;
        this.g = clipsAuthor;
        this.h = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.h;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        switch (i) {
            case 0:
                ((fxe) obj5).d(this.c, (Context) obj4, (ClipsAuthor) obj3, this.d, (izs) obj2);
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                break;
            default:
                yp80 yp80Var = (yp80) obj5;
                com.vk.newsfeed.impl.fragments.a aVar = (com.vk.newsfeed.impl.fragments.a) obj4;
                String str = (String) obj3;
                c9x0 c9x0Var = (c9x0) obj2;
                List list = (List) obj;
                boolean isEmpty = list.isEmpty();
                Context context = this.c;
                int i2 = 0;
                if (isEmpty) {
                    enj.q(R.string.post_not_found, 0, context);
                    if (yp80Var != null) {
                        yp80Var.onError(new PostNotFoundException());
                    }
                } else {
                    String str2 = this.d;
                    if (str2 == null || str2.length() == 0) {
                        NewsfeedRouter.E(aVar, context, (NewsEntry) list.get(0), null, str, null, c9x0Var, null, 84);
                    } else {
                        NewsEntry newsEntry = (NewsEntry) list.get(0);
                        bpn0 bpn0Var = cqm0.a;
                        try {
                            i2 = Integer.parseInt(str2);
                        } catch (Throwable unused) {
                        }
                        NewsfeedRouter.E(aVar, context, newsEntry, null, str, Integer.valueOf(i2), null, null, 100);
                    }
                }
                if (yp80Var != null) {
                    yp80Var.onSuccess();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ dxe(Context context, yp80 yp80Var, String str, com.vk.newsfeed.impl.fragments.a aVar, String str2, c9x0 c9x0Var) {
        this.c = context;
        this.e = yp80Var;
        this.d = str;
        this.f = aVar;
        this.g = str2;
        this.h = c9x0Var;
    }
}
