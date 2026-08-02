package xsna;

import android.content.Context;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.contacts.AndroidContact;
import com.vk.contacts.ContactsSource;
import com.vk.dto.common.ClipVideoFile;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import com.vk.friends.recommendations.impl.presentation.FriendsImportFragment;
import com.vk.log.L;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import xsna.tlo0;
import xsna.y6u0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class rvq implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ rvq(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = 10;
        switch (this.b) {
            case 0:
                y6u0 y6u0Var = new y6u0((Context) obj);
                tlo0.Companion.getClass();
                y6u0Var.setText(new tlo0.h("Цель «Собираю на новый iPad Pro с миру по нитке голому рубаха"));
                y6u0Var.setLeft(y6u0.a.C4083a.a);
                break;
            case 1:
                break;
            case 2:
                int i2 = FriendsImportFragment.a0;
                Collection<AndroidContact> values = com.vk.contacts.d.a.Y0(ContactsSource.CACHE).values();
                ArrayList arrayList = new ArrayList(c5g.u(values, 10));
                for (AndroidContact androidContact : values) {
                    arrayList.add(new t7j(androidContact.c, new ArrayList(androidContact.e)));
                }
                break;
            case 3:
                break;
            case 4:
                qgi0.r((tgi0) obj, "reorder_button");
                break;
            case 5:
                dh00 dh00Var = (dh00) obj;
                break;
            case 6:
                break;
            case 7:
                int i3 = MarketItemReviewsFragment.w0;
                qgi0.r((tgi0) obj, "toolbar_back");
                break;
            case 8:
                break;
            case 9:
                ck20.b = (gxo) obj;
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                qgi0.r((tgi0) obj, "downloads_button_test_tag");
                break;
            case 13:
                cvk.u(R.string.common_network_error, false);
                break;
            case 14:
                cvk.u(R.string.picker_loading_sticker_error, false);
                break;
            case 15:
                new io.reactivex.rxjava3.internal.operators.observable.i0(o25.a().m(true), new nq(new pqz(i), 19)).J(Boolean.FALSE).subscribe(new vk40(new boc(1, (gzs) obj), 8));
                break;
            case 16:
                break;
            case 17:
                qgi0.r((tgi0) obj, "people_search_filters_education_value");
                break;
            case 18:
                j7c0 j7c0Var = (j7c0) obj;
                break;
            case 19:
                j2r0 j2r0Var = qgj0.a;
                ClipVideoFile clipVideoFile = (ClipVideoFile) j5g.a0(qgj0.c((ShortVideoGetResponseDto) obj));
                break;
            case 20:
                L.i((Throwable) obj);
                break;
            case 21:
                break;
            case 22:
                Throwable th = (Throwable) obj;
                if (th instanceof VKApiExecutionException) {
                    j03.a.getClass();
                    j03.k((VKApiExecutionException) th);
                } else {
                    cvk.u(R.string.live_network_error_description, false);
                }
                break;
            case 23:
                break;
            case 24:
                tdu tduVar = (tdu) obj;
                tduVar.A(1.2f);
                tduVar.B(1.2f);
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                break;
            case 28:
                Throwable th2 = (Throwable) obj;
                j03.l(th2);
                com.vk.metrics.eventtracking.b.a.a(th2);
                break;
            default:
                com.vk.superapp.ui.a.S1().i((List) obj);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ rvq(Object obj, int i) {
        this.b = i;
    }
}
