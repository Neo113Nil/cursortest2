package xsna;

import android.content.Context;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;

/* compiled from: CommunitiesCatalogRouter.kt */
/* loaded from: classes5.dex */
public interface gog {
    void a(Context context, String str, String str2, boolean z);

    void b(Context context, UserId userId, String str, boolean z);

    Class<? extends FragmentImpl> c();

    /* compiled from: CommunitiesCatalogRouter.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final gog STUB = new C2952a();

        public final gog getSTUB() {
            return STUB;
        }

        /* compiled from: CommunitiesCatalogRouter.kt */
        /* renamed from: xsna.gog$a$a, reason: collision with other inner class name */
        public static final class C2952a implements gog {
            @Override // xsna.gog
            public final Class<? extends FragmentImpl> c() {
                return FragmentImpl.class;
            }

            @Override // xsna.gog
            public final void a(Context context, String str, String str2, boolean z) {
            }

            @Override // xsna.gog
            public final void b(Context context, UserId userId, String str, boolean z) {
            }
        }
    }
}
