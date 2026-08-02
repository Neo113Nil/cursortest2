package xsna;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.dto.user.UserProfile;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.user.presentation.feature.task_executors.UserProfileWallMviExternalEventsTaskExecutor$banAddedReceiver$1;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import xsna.awg0;
import xsna.ds60;
import xsna.epx;
import xsna.jm50;
import xsna.lwq0;
import xsna.uvq0;
import xsna.zou;

/* compiled from: UserProfileWallMviExternalEventsTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class uvq0 extends evg0<dwq0, on50, lwq0.a, lwq0, bwq0, svq0> {
    public final Lazy f;
    public final jq60 g;
    public final lql0 h;
    public final mql0 i;
    public final UserProfileWallMviExternalEventsTaskExecutor$banAddedReceiver$1 j;
    public final nql0 k;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r8v3, types: [com.vk.newsfeed.impl.user.presentation.feature.task_executors.UserProfileWallMviExternalEventsTaskExecutor$banAddedReceiver$1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public uvq0(es60 es60Var, h0b h0bVar, nn50 nn50Var) {
        super(r5, nn50Var);
        jm50.a aVar = jm50.a.a;
        Lazy<NewsFeedComponent> lazy = es60Var.e;
        this.f = lazy;
        this.g = new jq60(es60Var.d, lazy, es60Var.l, es60Var.h, aVar, new eht(this, h0bVar));
        this.h = new lql0(this, 2);
        this.i = new mql0(this, 2);
        this.j = new BroadcastReceiver() { // from class: com.vk.newsfeed.impl.user.presentation.feature.task_executors.UserProfileWallMviExternalEventsTaskExecutor$banAddedReceiver$1
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
                        uvq0.this.a(new lwq0.b.C3306b(userProfile.c, true));
                    }
                }
            }
        };
        this.k = new nql0(this, 2);
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        lwq0.a aVar = (lwq0.a) hn50Var;
        if (aVar instanceof lwq0.a.C3305a) {
            return this.g.d(((lwq0.a.C3305a) aVar).b);
        }
        if (aVar instanceof lwq0.a.c) {
            return awg0.a.b(this, new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.subjects.f(), new qtq0(new ujm0(this, 7), 1), io.reactivex.rxjava3.internal.functions.a.c), io.reactivex.rxjava3.internal.functions.a.d, new p98(this, 4)), new rrg(), null, null, 6);
        }
        if (!(aVar instanceof lwq0.a.b)) {
            if (aVar instanceof lwq0.a.d) {
                a(new mwq0(new ds60.b(new NewsfeedExternalAction.c.f0(((lwq0.a.d) aVar).b))));
                return null;
            }
            if (!(aVar instanceof lwq0.a.f) && !(aVar instanceof lwq0.a.e)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }

    public final NewsFeedComponent s() {
        return (NewsFeedComponent) this.f.getValue();
    }
}
