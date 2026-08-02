package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.profile.community.details.api.CommunityAddContactsParams;
import com.vk.profile.community.details.api.di.links.data.LinkItemModel;
import java.util.List;

/* compiled from: CommunityDetailsRouter.kt */
/* loaded from: classes.dex */
public interface w1h {
    void a(Context context, List<LinkItemModel> list);

    void b(Context context, String str, String str2, ic icVar, com.vk.movika.sdk.base.observable.p pVar);

    void c(Context context, z63 z63Var);

    void d(Context context, UserId userId);

    void e(Context context, CommunityAddContactsParams communityAddContactsParams, UserId userId, String str, ng1 ng1Var);

    void f(Context context, UserId userId);

    /* compiled from: CommunityDetailsRouter.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final w1h STUB = new C3911a();

        public final w1h getSTUB() {
            return STUB;
        }

        /* compiled from: CommunityDetailsRouter.kt */
        /* renamed from: xsna.w1h$a$a, reason: collision with other inner class name */
        public static final class C3911a implements w1h {
            @Override // xsna.w1h
            public final void a(Context context, List<LinkItemModel> list) {
            }

            @Override // xsna.w1h
            public final void c(Context context, z63 z63Var) {
            }

            @Override // xsna.w1h
            public final void d(Context context, UserId userId) {
            }

            @Override // xsna.w1h
            public final void f(Context context, UserId userId) {
            }

            @Override // xsna.w1h
            public final void b(Context context, String str, String str2, ic icVar, com.vk.movika.sdk.base.observable.p pVar) {
            }

            @Override // xsna.w1h
            public final void e(Context context, CommunityAddContactsParams communityAddContactsParams, UserId userId, String str, ng1 ng1Var) {
            }
        }
    }
}
