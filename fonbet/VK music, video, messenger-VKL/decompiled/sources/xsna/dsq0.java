package xsna;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.user.UserProfile;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.user.presentation.feature.task_executors.UserProfileMainWallMviExternalEventsTaskExecutor$banAddedReceiver$1;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import xsna.awg0;
import xsna.bwq0;
import xsna.ds60;
import xsna.dsq0;
import xsna.epx;
import xsna.jm50;
import xsna.lwq0;
import xsna.qn60;
import xsna.qr60;
import xsna.zou;

/* compiled from: UserProfileMainWallMviExternalEventsTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class dsq0 extends evg0<dwq0, on50, lwq0.a, lwq0, bwq0, svq0> {
    public final es60 f;
    public final a5i g;
    public final jq60 h;
    public final yrq0 i;
    public final li60 j;
    public final UserProfileMainWallMviExternalEventsTaskExecutor$banAddedReceiver$1 k;
    public final mi60 l;
    public final zrq0 m;
    public final asq0 n;
    public final bsq0 o;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r8v1, types: [xsna.yrq0] */
    /* JADX WARN: Type inference failed for: r8v3, types: [com.vk.newsfeed.impl.user.presentation.feature.task_executors.UserProfileMainWallMviExternalEventsTaskExecutor$banAddedReceiver$1] */
    /* JADX WARN: Type inference failed for: r8v5, types: [xsna.zrq0] */
    /* JADX WARN: Type inference failed for: r8v6, types: [xsna.asq0] */
    /* JADX WARN: Type inference failed for: r8v7, types: [xsna.bsq0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dsq0(es60 es60Var, a5i a5iVar, h0b h0bVar, nn50 nn50Var) {
        super(r5, nn50Var);
        jm50.a aVar = jm50.a.a;
        this.f = es60Var;
        this.g = a5iVar;
        this.h = new jq60(es60Var.d, es60Var.e, es60Var.l, es60Var.h, aVar, new eht(this, h0bVar));
        this.i = new bd70() { // from class: xsna.yrq0
            @Override // xsna.bd70
            public final void x0(int i, int i2, Object obj) {
                dsq0.this.a(new lwq0.b.C3306b(((Post) obj).o.b, false));
            }
        };
        this.j = new li60(this, 1);
        this.k = new BroadcastReceiver() { // from class: com.vk.newsfeed.impl.user.presentation.feature.task_executors.UserProfileMainWallMviExternalEventsTaskExecutor$banAddedReceiver$1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                Parcelable parcelable;
                Object parcelableExtra;
                if (epx.f(intent != null ? intent.getAction() : null, zou.a)) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelableExtra = intent.getParcelableExtra(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE, UserProfile.class);
                        parcelable = (Parcelable) parcelableExtra;
                    } else {
                        Parcelable parcelableExtra2 = intent.getParcelableExtra(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
                        parcelable = (UserProfile) (parcelableExtra2 instanceof UserProfile ? parcelableExtra2 : null);
                    }
                    UserProfile userProfile = (UserProfile) parcelable;
                    if (userProfile != null) {
                        dsq0.this.a(new lwq0.b.C3306b(userProfile.c, true));
                    }
                }
            }
        };
        this.l = new mi60(this, 1);
        this.m = new bd70() { // from class: xsna.zrq0
            @Override // xsna.bd70
            public final void x0(int i, int i2, Object obj) {
                dsq0.this.a(lwq0.a.f.b);
            }
        };
        this.n = new bd70() { // from class: xsna.asq0
            @Override // xsna.bd70
            public final void x0(int i, int i2, Object obj) {
                dsq0.this.a(new lwq0.a.e((NewsEntry) obj));
            }
        };
        this.o = new bd70() { // from class: xsna.bsq0
            @Override // xsna.bd70
            public final void x0(int i, int i2, Object obj) {
                dsq0.this.a(lwq0.c.e.b);
            }
        };
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        lwq0.a aVar = (lwq0.a) hn50Var;
        if (aVar instanceof lwq0.a.C3305a) {
            return this.h.d(((lwq0.a.C3305a) aVar).b);
        }
        if (aVar instanceof lwq0.a.c) {
            return awg0.a.b(this, new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.subjects.f(), new whm0(new n9m0(this, 11), 5), io.reactivex.rxjava3.internal.functions.a.c), io.reactivex.rxjava3.internal.functions.a.d, new ph8(this, 6)), new csq0(), null, null, 6);
        }
        if (aVar instanceof lwq0.a.b) {
            return awg0.a.b(this, this.g.a(), new pq60(2), null, new vk40(this, 26), 2);
        }
        if (aVar instanceof lwq0.a.d) {
            a(new mwq0(new ds60.b(new NewsfeedExternalAction.c.r(((lwq0.a.d) aVar).b))));
            return null;
        }
        if (aVar instanceof lwq0.a.f) {
            a(lwq0.c.e.b);
            return null;
        }
        if (!(aVar instanceof lwq0.a.e)) {
            throw new NoWhenBranchMatchedException();
        }
        NewsEntry newsEntry = ((lwq0.a.e) aVar).b;
        if (!na60.e(newsEntry)) {
            return null;
        }
        Integer valueOf = Integer.valueOf(di60.u(newsEntry));
        if (!na60.f(newsEntry)) {
            valueOf = null;
        }
        es60 es60Var = this.f;
        Object b = io.reactivex.rxjava3.internal.operators.mixed.n.b(es60Var.a.f(new u0p0(newsEntry, es60Var.b)));
        if (!(b instanceof Result.Failure)) {
            qn60.c cVar = (qn60.c) b;
            this.b.e(new awq0(new qr60.a.c(cVar.a, cVar.b, false, null, 24)));
        }
        Throwable a = Result.a(b);
        if (a != null) {
            com.vk.metrics.eventtracking.b.a.a(a);
        }
        e(new bwq0.a.j(valueOf));
        return null;
    }

    public final NewsFeedComponent s() {
        return this.f.e.getValue();
    }
}
