package xsna;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.vk.dto.common.id.UserId;
import com.vk.profile.community.suggestions.impl.ui.suggestions.CommunitySuggestionsFragment;
import xsna.b7h;

/* compiled from: CommunityLeaveDelegate.kt */
/* loaded from: classes5.dex */
public interface c7h {

    /* compiled from: CommunityLeaveDelegate.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final c7h STUB = new C2645a();

        /* compiled from: CommunityLeaveDelegate.kt */
        /* renamed from: xsna.c7h$a$a, reason: collision with other inner class name */
        public static final class C2645a implements c7h {
            @Override // xsna.c7h
            public final b7h b(Context context, Fragment fragment, b3i b3iVar, x2i x2iVar, wzs<? super UserId, ? super Integer, s3q0> wzsVar) {
                return b7h.a.a.getSTUB();
            }
        }

        public final c7h getSTUB() {
            return STUB;
        }
    }

    static /* synthetic */ b7h a(c7h c7hVar, Context context, Fragment fragment, b3i b3iVar, x2i x2iVar, CommunitySuggestionsFragment.d dVar, int i) {
        if ((i & 8) != 0) {
            x2iVar = null;
        }
        if ((i & 16) != 0) {
            dVar = null;
        }
        return c7hVar.b(context, fragment, b3iVar, x2iVar, dVar);
    }

    b7h b(Context context, Fragment fragment, b3i b3iVar, x2i x2iVar, wzs<? super UserId, ? super Integer, s3q0> wzsVar);
}
