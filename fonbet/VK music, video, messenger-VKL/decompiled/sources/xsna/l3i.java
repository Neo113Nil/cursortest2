package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;

/* compiled from: CommunitySuggestionsRouter.kt */
/* loaded from: classes5.dex */
public interface l3i {
    void a(Context context, UserId userId, String str, String str2);

    /* compiled from: CommunitySuggestionsRouter.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final l3i STUB = new C3229a();

        public final l3i getSTUB() {
            return STUB;
        }

        /* compiled from: CommunitySuggestionsRouter.kt */
        /* renamed from: xsna.l3i$a$a, reason: collision with other inner class name */
        public static final class C3229a implements l3i {
            @Override // xsna.l3i
            public final void a(Context context, UserId userId, String str, String str2) {
            }
        }
    }
}
