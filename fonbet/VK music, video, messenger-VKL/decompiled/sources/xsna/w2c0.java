package xsna;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.newsfeed_post.presentation.feature.task_executors.PostExternalEventsMviTaskExecutor$receiver$1;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import xsna.awg0;
import xsna.jm50;
import xsna.t5c0;
import xsna.w2c0;

/* compiled from: PostExternalEventsMviTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class w2c0 extends evg0<m5c0, on50, t5c0.c, t5c0, h5c0, d5c0> {
    public static final String[] j = {"com.vkontakte.android.STICKERS_ANIMATION_ENABLED_CHANGED", "android.net.conn.CONNECTIVITY_CHANGE", "com.vkontakte.android.ACTION_GROUP_STATUS_CHANGED", "com.vkontakte.android.ACTION_FRIEND_STATUS_CHANGED", "com.vkontakte.android.DONUT_SUBSCRIPTION_PAID"};
    public final Lazy f;
    public final jq60 g;
    public final PostExternalEventsMviTaskExecutor$receiver$1 h;
    public final v2c0 i;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.vk.newsfeed.impl.newsfeed_post.presentation.feature.task_executors.PostExternalEventsMviTaskExecutor$receiver$1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w2c0(es60 es60Var, g5c0 g5c0Var, nn50 nn50Var) {
        super(r5, nn50Var);
        jm50.a aVar = jm50.a.a;
        Lazy<NewsFeedComponent> lazy = es60Var.e;
        this.f = lazy;
        this.g = new jq60(es60Var.d, lazy, es60Var.l, es60Var.h, aVar, new eht(this, g5c0Var));
        this.h = new BroadcastReceiver() { // from class: com.vk.newsfeed.impl.newsfeed_post.presentation.feature.task_executors.PostExternalEventsMviTaskExecutor$receiver$1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                UserId userId;
                String action = intent.getAction();
                if (action != null) {
                    int hashCode = action.hashCode();
                    w2c0 w2c0Var = w2c0.this;
                    if (hashCode != -611648706) {
                        if (hashCode == 3866578) {
                            if (action.equals("com.vkontakte.android.DONUT_SUBSCRIPTION_PAID") && (userId = (UserId) intent.getParcelableExtra("id")) != null) {
                                w2c0Var.a(new t5c0.b.f(userId));
                                return;
                            }
                            return;
                        }
                        if (hashCode != 1832049201 || !action.equals("com.vkontakte.android.ACTION_GROUP_STATUS_CHANGED")) {
                            return;
                        }
                    } else if (!action.equals("com.vkontakte.android.ACTION_FRIEND_STATUS_CHANGED")) {
                        return;
                    }
                    UserId userId2 = (UserId) intent.getParcelableExtra("id");
                    Bundle extras = intent.getExtras();
                    Integer valueOf = extras != null ? Integer.valueOf(extras.getInt("status")) : null;
                    if (userId2 == null || valueOf == null) {
                        return;
                    }
                    w2c0Var.a(new t5c0.b.d(valueOf.intValue()));
                }
            }
        };
        this.i = new v2c0(this);
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        t5c0.c cVar = (t5c0.c) hn50Var;
        if (cVar instanceof t5c0.c.a) {
            return this.g.d(((t5c0.c.a) cVar).b);
        }
        if (!(cVar instanceof t5c0.c.b)) {
            throw new NoWhenBranchMatchedException();
        }
        return awg0.a.b(this, new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.subjects.f(), new j990(new hs00(this, 20), 2), io.reactivex.rxjava3.internal.functions.a.c), io.reactivex.rxjava3.internal.functions.a.d, new uy3(this, 7)), new u2c0(), null, null, 6);
    }
}
