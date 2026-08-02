package xsna;

import android.content.Context;
import android.util.Size;
import com.vk.dto.common.id.UserId;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;
import xsna.ikv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class lhc implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ lhc(Context context, UserId userId, NewsEntry newsEntry) {
        this.c = userId;
        this.d = newsEntry;
        this.e = context;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((xe8) this.c).e((String) this.d, (String) this.e, false);
                break;
            default:
                UserId userId = (UserId) this.c;
                NewsEntry newsEntry = (NewsEntry) this.d;
                Context context = (Context) this.e;
                ce60.b.getClass();
                p870.f().d(103, Integer.MIN_VALUE, userId);
                p870.f().e(100, newsEntry);
                ikv0.a aVar = new ikv0.a(context);
                aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_filled_blue_24, (Integer) null, (Size) null, 14);
                aVar.u = new ikv0.d(context.getString(R.string.newsfeed_item_ignored_snackbar_message), (String) null, (ikv0.d.a) null, 6);
                aVar.n();
                break;
        }
    }

    public /* synthetic */ lhc(xe8 xe8Var, long j, String str, String str2) {
        this.c = xe8Var;
        this.d = str;
        this.e = str2;
    }
}
