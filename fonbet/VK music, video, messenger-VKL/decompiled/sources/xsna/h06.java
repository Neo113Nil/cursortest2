package xsna;

import com.vk.catalog2.common.ui.mvp.holder.video.showcase.GenreActionsViewHolder;
import com.vk.channels.impl.channel_screen.footer.BanReasonBottomSheet;
import xsna.ve10;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class h06 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ h06(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                BanReasonBottomSheet.a aVar = BanReasonBottomSheet.g1;
                ((BanReasonBottomSheet) obj5).co((BanReasonBottomSheet.Params) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 1:
                yp7 yp7Var = (yp7) obj5;
                com.vk.ecomm.onlinebooking.impl.edit.q qVar = (com.vk.ecomm.onlinebooking.impl.edit.q) obj4;
                izs<? super com.vk.ecomm.onlinebooking.impl.edit.a, s3q0> izsVar = (izs) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1231056455, intValue, -1, "com.vk.ecomm.onlinebooking.impl.edit.ui.BookingEditScreenMviView.ThemedContent.<anonymous> (BookingEditScreenMviView.kt:98)");
                    }
                    yp7Var.i(qVar, izsVar, aVar2, 512);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                ojj.d((izs) obj5, (hpd0) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((GenreActionsViewHolder) obj5).a((GenreActionsViewHolder.a) obj4, (gzs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((fe10) obj5).h((ve10.a.C3884a) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((be70) obj5).m((ce70) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 6:
                ((Integer) obj2).getClass();
                ((mf70) obj5).j((nf70) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            default:
                ((Integer) obj2).getClass();
                ((gmh0) obj5).i((rmh0) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ h06(yp7 yp7Var, com.vk.ecomm.onlinebooking.impl.edit.q qVar, izs izsVar) {
        this.b = 1;
        this.c = yp7Var;
        this.d = qVar;
        this.e = izsVar;
    }
}
