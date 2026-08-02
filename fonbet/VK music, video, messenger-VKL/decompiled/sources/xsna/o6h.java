package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.profile.community.suggestions.impl.ui.suggestions.CommunitySuggestionsFragment;
import xsna.n6h;

/* compiled from: CommunityJoinDelegate.kt */
/* loaded from: classes5.dex */
public interface o6h {

    /* compiled from: CommunityJoinDelegate.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final o6h STUB = new C3441a();

        /* compiled from: CommunityJoinDelegate.kt */
        /* renamed from: xsna.o6h$a$a, reason: collision with other inner class name */
        public static final class C3441a implements o6h {
            @Override // xsna.o6h
            public final n6h b(Context context, b3i b3iVar, zzx zzxVar, x2i x2iVar, wzs<? super UserId, ? super Integer, s3q0> wzsVar) {
                return n6h.a.a.getSTUB();
            }
        }

        public final o6h getSTUB() {
            return STUB;
        }
    }

    static /* synthetic */ n6h a(o6h o6hVar, Context context, b3i b3iVar, zzx zzxVar, x2i x2iVar, CommunitySuggestionsFragment.c cVar, int i) {
        if ((i & 4) != 0) {
            zzxVar = null;
        }
        if ((i & 8) != 0) {
            x2iVar = null;
        }
        if ((i & 16) != 0) {
            cVar = null;
        }
        return o6hVar.b(context, b3iVar, zzxVar, x2iVar, cVar);
    }

    n6h b(Context context, b3i b3iVar, zzx zzxVar, x2i x2iVar, wzs<? super UserId, ? super Integer, s3q0> wzsVar);
}
