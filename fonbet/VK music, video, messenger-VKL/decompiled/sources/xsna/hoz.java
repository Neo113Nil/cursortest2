package xsna;

import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.clips.design.view.feed.item.owner.ClipSubscribeBtnView;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: LivesVerticalFeedDelegate.kt */
/* loaded from: classes3.dex */
public final class hoz {
    public final Object a;
    public Object b;
    public Object c;
    public Object d;

    public hoz(wmf wmfVar) {
        this.a = wmfVar;
    }

    public io.reactivex.rxjava3.internal.operators.single.y a(int i, UserId userId, long j, UserId userId2, String str, Integer num, List list) {
        ((yd10) this.a).getClass();
        tfx tfxVar = new tfx("market.createItemReviewComment", new br(20), new cr(16));
        tfx.l(tfxVar, "review_id", i, 0, 0, 12);
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.m(tfxVar, "item_id", j, 0L, 8);
        tfx.n(tfxVar, "author_id", userId2, 0L, 0L, 12);
        if (str != null) {
            tfx.o(tfxVar, "text", str, 0, 0, 12);
        }
        if (num != null) {
            tfx.l(tfxVar, "reply_to_comment", num.intValue(), 0, 0, 8);
        }
        if (list != null) {
            tfxVar.i("attachments", list);
        }
        return rsg0.w0(yfb.x(tfxVar)).l(new jo3(a310.b, 22));
    }

    public io.reactivex.rxjava3.internal.operators.observable.b1 b(int i, int i2, long j, UserId userId) {
        ((yd10) this.a).getClass();
        tfx tfxVar = new tfx("market.deleteItemReviewComment", new qr(19), new rr(20));
        tfx.l(tfxVar, "review_id", i, 0, 0, 12);
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "item_id", i2, 0, 0, 8);
        tfx.m(tfxVar, "comment_id", j, 0L, 12);
        return rsg0.Z(yfb.x(tfxVar));
    }

    public void c(piz pizVar, wjk0 wjk0Var, VideoFile videoFile, boolean z) {
        wmf wmfVar = (wmf) this.a;
        this.d = wjk0Var;
        pizVar.setLoaderColor(R.color.vk_white_alpha60);
        pizVar.v1();
        uoc M1 = pizVar.M1();
        if (M1 != null) {
            M1.k1(videoFile);
            M1.Z3(z);
            toc delegator = M1.getDelegator();
            delegator.j(wmfVar);
            this.c = delegator;
        }
        vcd e3 = pizVar.e3();
        if (e3 != null) {
            e3.n3((!videoFile.h1() || videoFile.U() || videoFile.I0() == o25.a().c()) ? false : true);
            ucd c = g620.f().Z().c(e3, wmfVar);
            if (c != null) {
                ((ClipSubscribeBtnView.a) c).d = new mgz(pizVar, 2);
                e3.setPresenter(c);
            } else {
                c = null;
            }
            this.b = c;
        }
    }

    public io.reactivex.rxjava3.internal.operators.observable.b1 d(int i, int i2, long j, UserId userId) {
        ((yd10) this.a).getClass();
        tfx tfxVar = new tfx("market.restoreItemReviewComment", new dq(19), new com.vk.movika.sdk.base.model.n(17));
        tfx.l(tfxVar, "review_id", i, 0, 0, 12);
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "item_id", i2, 0, 0, 8);
        tfx.m(tfxVar, "comment_id", j, 0L, 12);
        return rsg0.Z(yfb.x(tfxVar));
    }

    public hoz(o210 o210Var, qob qobVar) {
        this.a = new yd10();
        this.b = o210Var;
        this.c = qobVar;
        List l = e43.l(UsersFieldsDto.IS_NFT, UsersFieldsDto.VERIFIED, UsersFieldsDto.IS_VERIFIED, UsersFieldsDto.TRENDING, UsersFieldsDto.FIRST_NAME_DAT, UsersFieldsDto.LAST_NAME_DAT, UsersFieldsDto.PHOTO_BASE);
        ArrayList arrayList = new ArrayList(c5g.u(l, 10));
        Iterator it = l.iterator();
        while (it.hasNext()) {
            arrayList.add(((UsersFieldsDto) it.next()).i());
        }
        this.d = arrayList;
    }
}
