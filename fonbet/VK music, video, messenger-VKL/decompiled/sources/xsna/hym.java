package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.Ad;
import com.vk.dto.common.actions.Action;
import com.vk.dto.newsfeed.entries.Digest;
import com.vk.feed.design.view.newsfeed.digest.header.FeedDigestHeader;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.common.PostActions;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;

/* compiled from: DigestHeaderHolder.kt */
/* loaded from: classes4.dex */
public final class hym extends qi6<Digest> {
    public static final /* synthetic */ int E = 0;
    public final FeedDigestHeader C;
    public final Object D;

    public hym(ViewGroup viewGroup) {
        super(R.layout.news_digest_header_multiline, viewGroup);
        getContext();
        View view = this.itemView;
        FeedDigestHeader feedDigestHeader = view instanceof FeedDigestHeader ? (FeedDigestHeader) view : null;
        this.C = feedDigestHeader;
        this.D = msy.a(LazyThreadSafetyMode.NONE, new b1j(this, 11));
        if (feedDigestHeader != null) {
            feedDigestHeader.setOnHeaderClickListener(new bzj(this, 5));
        }
    }

    public static final void R6(hym hymVar) {
        s980 s980Var;
        hymVar.getClass();
        if (jjc.b()) {
            return;
        }
        u1c0 J0 = hymVar.J0();
        int i = J0 != null ? J0.k : 0;
        Digest q6 = hymVar.q6();
        if (q6 == null || (s980Var = hymVar.y) == null) {
            return;
        }
        s980Var.d9(q6, hymVar.t6(), PostActions.ACTION_IGNORE.h(), i);
    }

    public static final void T6(hym hymVar) {
        Digest.Header header;
        Digest.Button button;
        Action action;
        hymVar.getClass();
        if (jjc.b()) {
            return;
        }
        Digest q6 = hymVar.q6();
        if (q6 == null || (header = q6.k) == null || (button = header.f) == null || (action = button.c) == null) {
            hymVar.U6();
        } else {
            hd60.a().v(action, hymVar.itemView.getContext(), (r20 & 4) != 0 ? null : null, (r20 & 8) != 0 ? null : null, (r20 & 16) != 0 ? null : null, (r20 & 32) != 0 ? null : null, null, (r20 & 128) != 0 ? null : 423);
        }
    }

    @Override // xsna.qi6
    public final void E6(Digest digest) {
        Digest.Button button;
        Digest digest2 = digest;
        FeedDigestHeader feedDigestHeader = this.C;
        if (feedDigestHeader == null) {
            return;
        }
        String str = digest2.i;
        Digest.Header header = digest2.k;
        boolean f = epx.f(str, Ad.d);
        Digest.Footer footer = digest2.l;
        boolean f2 = f | epx.f(footer != null ? footer.b : null, "button");
        String str2 = header != null ? header.d : null;
        String str3 = header != null ? header.e : null;
        feedDigestHeader.setTitle(new FeedDigestHeader.c(header != null ? header.c : null, (str3 == null || str3.length() == 0) ? 2 : 1, (str2 == null || str2.length() == 0) ? null : new FeedDigestHeader.c.a.C1046a(str2)));
        feedDigestHeader.setSubtitle((str3 == null || str3.length() == 0) ? null : new FeedDigestHeader.b(str3));
        feedDigestHeader.setShowBottomDivider(f2);
        if (header != null && (button = header.f) != null) {
            feedDigestHeader.setRight(new FeedDigestHeader.a.C1045a(button.b, new d94(0, this, hym.class, "onShowAllClicked", "onShowAllClicked()V", 0, 3)));
        } else if ((digest2.n & 1) != 0) {
            feedDigestHeader.setRight(new FeedDigestHeader.a.b(new gym(0, this, hym.class, "onHideButtonClick", "onHideButtonClick()V", 0, 0), this.itemView.getContext().getString(R.string.hide_not_interesting)));
        } else {
            feedDigestHeader.setRight((FeedDigestHeader.a) null);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void U6() {
        Digest q6;
        String str;
        Digest q62;
        if (jjc.b() || (q6 = q6()) == null || (str = q6.j) == null || str.length() == 0 || (q62 = q6()) == null) {
            return;
        }
        NewsfeedRouter newsfeedRouter = (NewsfeedRouter) this.D.getValue();
        Context context = this.itemView.getContext();
        ArrayList arrayList = q62.q;
        String str2 = this.u;
        Digest.Header header = q62.k;
        NewsfeedRouter.b(newsfeedRouter, context, str, arrayList, header != null ? header.c : "", str2, 16);
        s3q0 s3q0Var = s3q0.a;
    }
}
