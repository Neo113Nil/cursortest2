package xsna;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.newsfeed.impl.presentation.newsfeed_backstage.task_executors.NewsfeedExternalEventsTaskExecutor$updatePhotoReceiver$1;
import com.vk.story.api.di.StoriesComponent;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.awg0;
import xsna.cn;
import xsna.ds60;
import xsna.epx;
import xsna.jm50;
import xsna.ni60;
import xsna.o25;
import xsna.qz60;
import xsna.r070;
import xsna.xh60;

/* compiled from: NewsfeedExternalEventsTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class ni60 extends evg0<qz60, on50, r070.d, r070, jv60, xh60> {
    public final jq60 f;
    public final Lazy g;
    public final Lazy h;
    public final Object i;
    public final ji60 j;
    public final ki60 k;
    public final li60 l;
    public final mi60 m;
    public final NewsfeedExternalEventsTaskExecutor$updatePhotoReceiver$1 n;
    public final qg50 o;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r8v4, types: [xsna.ji60] */
    /* JADX WARN: Type inference failed for: r8v5, types: [xsna.ki60] */
    /* JADX WARN: Type inference failed for: r8v8, types: [com.vk.newsfeed.impl.presentation.newsfeed_backstage.task_executors.NewsfeedExternalEventsTaskExecutor$updatePhotoReceiver$1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ni60(es60 es60Var, ot60 ot60Var, nn50 nn50Var) {
        super(r5, nn50Var);
        jm50.a aVar = jm50.a.a;
        this.f = new jq60(es60Var.d, es60Var.e, es60Var.l, es60Var.h, aVar, new eht(this, ot60Var));
        this.g = es60Var.h;
        this.h = es60Var.e;
        this.i = msy.a(LazyThreadSafetyMode.NONE, new p5y(this, 15));
        this.j = new bd70() { // from class: xsna.ji60
            @Override // xsna.bd70
            public final void x0(int i, int i2, Object obj) {
                xh60.h.f fVar = xh60.h.f.a;
                ni60 ni60Var = ni60.this;
                ni60Var.c(fVar);
                ni60Var.c(new bi60((zjm0) obj, ((qz60) ni60Var.b.getCurrentState()).f));
            }
        };
        this.k = new bd70() { // from class: xsna.ki60
            @Override // xsna.bd70
            public final void x0(int i, int i2, Object obj) {
                ni60 ni60Var = ni60.this;
                ni60Var.c(new xh60.h.e((List) obj, ((qz60) ni60Var.b.getCurrentState()).f));
            }
        };
        this.l = new li60(this, 0);
        this.m = new mi60(this, 0);
        this.n = new BroadcastReceiver() { // from class: com.vk.newsfeed.impl.presentation.newsfeed_backstage.task_executors.NewsfeedExternalEventsTaskExecutor$updatePhotoReceiver$1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                String action = intent.getAction();
                if (action != null && action.hashCode() == -443120485 && action.equals("com.vkontakte.android.ACTION_PROFILE_UPDATED")) {
                    UserId userId = (UserId) intent.getParcelableExtra("uid");
                    if (userId == null) {
                        userId = UserId.d;
                    }
                    cn o = o25.a().o();
                    if (epx.f(userId, o.a)) {
                        UserProfile b = o.b();
                        ni60 ni60Var = ni60.this;
                        ni60Var.c(new xh60.h.i(b, ((qz60) ni60Var.b.getCurrentState()).f));
                    }
                }
            }
        };
        int[] iArr = p9x.a;
        qg50 qg50Var = new qg50(3);
        qg50Var.g(Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE);
        qg50Var.g(108);
        qg50Var.g(127);
        this.o = qg50Var;
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        r070.d dVar = (r070.d) hn50Var;
        boolean z = dVar instanceof r070.d.a;
        jq60 jq60Var = this.f;
        if (z) {
            return jq60Var.d(ds60.a.C2747a.b);
        }
        if (dVar instanceof r070.d.b) {
            return jq60Var.d(ds60.a.b.b);
        }
        if (!(dVar instanceof r070.d.c)) {
            throw new NoWhenBranchMatchedException();
        }
        return awg0.a.b(this, new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.subjects.f(), new f2u(new uh40(this, 1), 8), io.reactivex.rxjava3.internal.functions.a.c), io.reactivex.rxjava3.internal.functions.a.d, new sh1(this, 2)), new g2u(), null, null, 6);
    }

    public final p870 s() {
        return ((StoriesComponent) this.g.getValue()).w();
    }
}
