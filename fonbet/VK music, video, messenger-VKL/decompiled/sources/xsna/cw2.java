package xsna;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.vk.antispam.SpammerModel;
import kotlin.collections.EmptyList;

/* compiled from: AntispamRouter.kt */
/* loaded from: classes14.dex */
public interface cw2 {
    tv2 a(Bundle bundle);

    void b(FragmentManager fragmentManager, Context context, SpammerModel spammerModel);

    /* compiled from: AntispamRouter.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();

        public final cw2 getSTUB() {
            return new C2690a();
        }

        /* compiled from: AntispamRouter.kt */
        /* renamed from: xsna.cw2$a$a, reason: collision with other inner class name */
        public static final class C2690a implements cw2 {
            @Override // xsna.cw2
            public final tv2 a(Bundle bundle) {
                return new tv2(EmptyList.b);
            }

            @Override // xsna.cw2
            public final void b(FragmentManager fragmentManager, Context context, SpammerModel spammerModel) {
            }
        }
    }
}
