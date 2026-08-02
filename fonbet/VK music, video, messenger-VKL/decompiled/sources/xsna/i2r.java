package xsna;

import com.vk.newsfeed.api.NewsfeedRouter;

/* compiled from: FeedPlaceHandler.kt */
/* loaded from: classes7.dex */
public final class i2r implements fhd0, lao0 {
    public final NewsfeedRouter a;

    public i2r(NewsfeedRouter newsfeedRouter) {
        this.a = newsfeedRouter;
    }

    @Override // xsna.g9l
    public final void a(fgx fgxVar) {
        int i;
        String c = fgxVar.c("placeId");
        bpn0 bpn0Var = cqm0.a;
        try {
            i = Integer.parseInt(c);
        } catch (Throwable unused) {
            i = 0;
        }
        this.a.J(i, fgxVar.e);
        blk.P(fgxVar).onSuccess();
    }
}
