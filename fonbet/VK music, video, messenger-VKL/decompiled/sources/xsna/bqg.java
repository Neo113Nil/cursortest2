package xsna;

import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.viewstate.OrdersListItem;
import com.vk.newsfeed.posting.privacy_picker.presentation.PrivacyViewState;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class bqg implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ bqg(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((com.vk.profile.community.details.impl.contacts.h) this.d).k((eqg) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 1:
                izs izsVar = (izs) this.c;
                fpa fpaVar = (fpa) this.d;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1009403172, intValue, -1, "com.vk.clips.upload.ui.impl.compose.features.delayed_publish.DelayedPublishDialogsHelper.openDateChangeModal.<anonymous>.<anonymous>.<anonymous> (DelayedPublishDialogsHelper.kt:39)");
                    }
                    zsl.a.a(new d5f(izsVar, fpaVar, ref$ObjectRef, 3), new com.vk.newsfeed.common.recycler.holders.attachments.a(12, izsVar, ref$ObjectRef), aVar, 384);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                de00.a((v6p0) this.d, (q630) this.e, (jai) this.c, (androidx.compose.runtime.a) obj, ne7.I(385));
                break;
            case 3:
                ((Integer) obj2).getClass();
                tv80.a((OrdersListItem.Order.a) this.d, (gzs) this.e, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                com.vk.newsfeed.posting.privacy_picker.presentation.b.f((PrivacyViewState.Type) this.d, (izs) this.c, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(385));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((clm0) this.d).T0((zkm0) this.e, (gzs) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                yvn0.a((List) this.d, (izs) this.c, (gzs) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                e6p0 e6p0Var = (e6p0) this.d;
                q630 q630Var = (q630) this.e;
                gzs gzsVar = (gzs) this.c;
                ((Integer) obj2).getClass();
                e6p0Var.c(ne7.I(1), (androidx.compose.runtime.a) obj, gzsVar, q630Var);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ bqg(Object obj, izs izsVar, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = izsVar;
        this.e = obj2;
    }

    public /* synthetic */ bqg(izs izsVar, fpa fpaVar, Ref$ObjectRef ref$ObjectRef) {
        this.b = 1;
        this.c = izsVar;
        this.d = fpaVar;
        this.e = ref$ObjectRef;
    }
}
