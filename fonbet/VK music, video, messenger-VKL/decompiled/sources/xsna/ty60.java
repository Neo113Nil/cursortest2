package xsna;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.dto.stories.model.GetStoriesResponse;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import xsna.ey60;
import xsna.jm50;
import xsna.qn60;
import xsna.qr60;
import xsna.vx60;

/* compiled from: NewsfeedSearchStoriesTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class ty60 extends evg0<xx60, on50, ey60.c, ey60, vx60, sx60> {
    public final ca90 f;
    public final qn60 g;
    public final pn60 h;
    public final cs60 i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ty60(es60 es60Var, ca90 ca90Var, yt60 yt60Var, nn50 nn50Var) {
        super(r0, nn50Var);
        jm50.a aVar = jm50.a.a;
        this.f = ca90Var;
        qn60 qn60Var = es60Var.a;
        this.g = qn60Var;
        pn60 pn60Var = es60Var.b;
        this.h = pn60Var;
        this.i = new cs60(qn60Var, pn60Var, aVar, new eht(this, yt60Var));
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        ey60.c cVar = (ey60.c) hn50Var;
        if (cVar instanceof ey60.c.a) {
            this.i.s(((ey60.c.a) cVar).b);
            return null;
        }
        boolean z = cVar instanceof ly60;
        nn50<State, TaskId, OutTask, Patch, Event> nn50Var = this.b;
        if (!z) {
            if (!(cVar instanceof ky60)) {
                throw new NoWhenBranchMatchedException();
            }
            ry60 ry60Var = ((ky60) cVar).b;
            Object b = io.reactivex.rxjava3.internal.operators.mixed.n.b(this.g.f(new zyi0(ry60Var, this.h)));
            if (!(b instanceof Result.Failure)) {
                qn60.c cVar2 = (qn60.c) b;
                nn50Var.e(new ux60(new qr60.a.c(cVar2.a, cVar2.b, false, null, 24)));
            }
            Throwable a = Result.a(b);
            if (a != null) {
                com.vk.metrics.eventtracking.b.a.a(a);
            }
            e(new vx60.c(ry60Var != null ? ry60Var.c : null, ry60Var));
            return null;
        }
        final String str = ((ly60) cVar).b;
        if (str == null || str.length() == 0) {
            return null;
        }
        n().a(gkf.b);
        String str2 = ((xx60) nn50Var.getCurrentState()).h;
        int i = this.f.a;
        cub0 cub0Var = new cub0("stories.search");
        s3q0 s3q0Var = s3q0.a;
        cub0Var.K(CampaignEx.JSON_KEY_AD_Q, str);
        cub0Var.C(1, "extended");
        cub0Var.C(i, "count");
        if (str2 != null) {
            cub0Var.K("situational_suggest_id", str2);
        }
        cub0Var.K("fields", "name,screen_name,photo_base,sex,verified,can_write_private_message,first_name_gen,last_name_gen,first_name_dat,last_name_dat,friend_status,is_member,can_upload_story,member_status,can_comment,balance");
        return g(rsg0.W(cub0Var, 7), new d120(this, 7), new io.reactivex.rxjava3.functions.f() { // from class: xsna.sy60
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                GetStoriesResponse getStoriesResponse = (GetStoriesResponse) obj;
                this.a(new ky60(getStoriesResponse.c.isEmpty() ? null : new ry60(getStoriesResponse, y8g0.e(R.string.story_search_stories_block_title), str)));
            }
        });
    }
}
