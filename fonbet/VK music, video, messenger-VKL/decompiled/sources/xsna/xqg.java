package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.dto.profile.Address;

/* compiled from: CommunityAddressRouter.kt */
/* loaded from: classes.dex */
public interface xqg {
    static /* synthetic */ void b(xqg xqgVar, Context context, UserId userId, String str, Address address, Integer num, boolean z, Long l, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            address = null;
        }
        if ((i & 16) != 0) {
            num = null;
        }
        if ((i & 32) != 0) {
            z = false;
        }
        if ((i & 64) != 0) {
            l = null;
        }
        xqgVar.a(context, userId, str, address, num, z, l);
    }

    void a(Context context, UserId userId, String str, Address address, Integer num, boolean z, Long l);

    /* compiled from: CommunityAddressRouter.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final xqg STUB = new C4037a();

        public final xqg getSTUB() {
            return STUB;
        }

        /* compiled from: CommunityAddressRouter.kt */
        /* renamed from: xsna.xqg$a$a, reason: collision with other inner class name */
        public static final class C4037a implements xqg {
            @Override // xsna.xqg
            public final void a(Context context, UserId userId, String str, Address address, Integer num, boolean z, Long l) {
            }
        }
    }
}
