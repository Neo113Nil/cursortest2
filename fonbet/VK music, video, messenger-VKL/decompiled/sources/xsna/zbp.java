package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import xsna.ybp;

/* compiled from: EmailActualizationRouter.kt */
/* loaded from: classes18.dex */
public interface zbp {

    /* compiled from: EmailActualizationRouter.kt */
    public static final class b {
    }

    void a(Context context, String str, boolean z);

    io.reactivex.rxjava3.core.x b(UserId userId, String str, String str2);

    /* compiled from: EmailActualizationRouter.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();

        public final zbp getSTUB() {
            return new C4173a();
        }

        /* compiled from: EmailActualizationRouter.kt */
        /* renamed from: xsna.zbp$a$a, reason: collision with other inner class name */
        public static final class C4173a implements zbp {
            @Override // xsna.zbp
            public final io.reactivex.rxjava3.core.x b(UserId userId, String str, String str2) {
                return io.reactivex.rxjava3.core.x.k(ybp.a.a);
            }

            @Override // xsna.zbp
            public final void a(Context context, String str, boolean z) {
            }
        }
    }
}
