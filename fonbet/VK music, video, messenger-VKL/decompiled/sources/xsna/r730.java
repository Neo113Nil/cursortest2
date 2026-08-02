package xsna;

import android.text.TextUtils;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.vk.dto.common.id.UserId;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: MoneySendRequest.kt */
/* loaded from: classes15.dex */
public final class r730 extends xsg0 {

    /* compiled from: MoneySendRequest.kt */
    public static abstract class a {

        /* compiled from: MoneySendRequest.kt */
        /* renamed from: xsna.r730$a$a, reason: collision with other inner class name */
        public static final class C3597a extends a {
            public static final C3597a a = new C3597a();
        }

        /* compiled from: MoneySendRequest.kt */
        public static final class c extends a {
            public static final c a = new c();
        }

        /* compiled from: MoneySendRequest.kt */
        public static final class b extends a {
            public final String a;

            public b(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("SelectedCard(card="), this.a, ')');
            }

            public b() {
                this("");
            }
        }
    }

    public r730(UserId userId, int i, String str, String str2, int i2, boolean z, a aVar) {
        super("money.sendRequest");
        F(userId, "receiver_id");
        C(i, "amount");
        K("message", str);
        if (!TextUtils.isEmpty(str2)) {
            K(InAppPurchaseMetaData.KEY_CURRENCY, str2);
        }
        C(i2, "total_amount");
        K("pin_message", z ? "1" : "0");
        if (aVar instanceof a.b) {
            K("accept_card", ((a.b) aVar).a);
        } else if (aVar instanceof a.c) {
            R("accept_vkpay", true);
        } else if (!(aVar instanceof a.C3597a)) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
