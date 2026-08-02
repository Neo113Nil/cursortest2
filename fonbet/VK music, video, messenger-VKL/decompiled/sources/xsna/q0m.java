package xsna;

import com.vkontakte.android.data.b;

/* compiled from: DeprecatedNewsfeedInteractionAnalyticsFacade.kt */
/* loaded from: classes4.dex */
public final class q0m implements zl60 {
    @Override // xsna.zl60
    public final void a(Integer num) {
        b.d dVar = new b.d("user_action");
        dVar.b("fresh_news", "action_type");
        dVar.b("show", "action_param");
        dVar.b(num, "list_id");
        dVar.e();
    }
}
