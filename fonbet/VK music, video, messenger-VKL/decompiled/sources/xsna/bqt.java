package xsna;

import android.view.ViewGroup;
import com.vk.api.generated.account.dto.AccountGetBalanceResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.store.dto.StoreNewItemsDto;
import com.vk.dto.common.Attachment;
import com.vk.dto.photo.Photo;
import com.vk.log.L;
import com.vk.newsfeed.api.data.discover.NewsEntriesContainer;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.superapp.api.dto.auth.VkAuthValidatePhoneResult;
import com.vkontakte.android.attachments.PrettyCardAttachment;
import java.util.ArrayList;
import java.util.List;
import xsna.dug0;
import xsna.go20;
import xsna.mbv;
import xsna.t9j0;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class bqt implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ bqt(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = 25;
        switch (this.b) {
            case 0:
                return Integer.valueOf(((AccountGetBalanceResponseDto) obj).d());
            case 1:
                return (mbv.e) obj;
            case 2:
                ((ojt) obj).b = 100;
                return s3q0.a;
            case 3:
                return new bs00((ViewGroup) obj);
            case 4:
                return (t610) obj;
            case 5:
                return Boolean.valueOf(com.vk.newsfeed.posting.market_picker.presentation.base.view.f.g((Photo) obj));
            case 6:
                ((zak0) go20.o).setValue((go20.b) obj);
                return s3q0.a;
            case 7:
                qgi0.u((tgi0) obj);
                return s3q0.a;
            case 8:
                return j5g.H0(j5g.S((List) obj, 0), 30);
            case 9:
                return io.reactivex.rxjava3.internal.operators.observable.g0.b;
            case 10:
                qgi0.r((tgi0) obj, "MusicPickerPreviewCellDeleteButton");
                return s3q0.a;
            case 11:
                return Boolean.valueOf(((sy40) obj).e.f);
            case 12:
                yk60.n.set(false);
                yk60.b(yk60.a, null, 3);
                return s3q0.a;
            case 13:
                return new tvf0((NewsEntriesContainer) obj, null);
            case 14:
                return Boolean.valueOf(((nov) obj) instanceof xlo0);
            case 15:
                new dqu();
                List<GroupsGroupFullDto> d = ((GroupsGetByIdObjectResponseDto) obj).d();
                if (d != null) {
                    return dqu.a((GroupsGroupFullDto) j5g.Y(d));
                }
                throw new IllegalArgumentException("Required value was null.");
            case 16:
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.c = ((VkAuthValidatePhoneResult) obj).b;
                return s3q0.a;
            case 17:
                qyg0 V0 = ((hyg0) obj).V0("DELETE FROM photo_params where id NOT IN (SELECT id from photo_params ORDER BY id DESC LIMIT 10)");
                try {
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            case 18:
                return Boolean.valueOf(((Attachment) obj) instanceof PrettyCardAttachment);
            case 19:
                L.i((Throwable) obj);
                return s3q0.a;
            case 20:
                return Integer.valueOf(((PostingState.Editing) obj).d.l);
            case 21:
                return Boolean.FALSE;
            case 22:
                return s3q0.a;
            case 23:
                qgi0.r((tgi0) obj, "storefront_service_title");
                return s3q0.a;
            case 24:
                return new t9j0.b(((tj50.a) obj).a(new gky(i), ao8.d));
            case 25:
                StoreNewItemsDto storeNewItemsDto = (StoreNewItemsDto) obj;
                t6g0 t6g0Var = t6g0.b;
                kcl0 d2 = t6g0.d();
                Integer l = storeNewItemsDto.l();
                d2.t(l != null ? l.intValue() : 0);
                BaseBoolIntDto e = storeNewItemsDto.e();
                d2.E(e != null ? e.i() : 0);
                d2.U0();
                return s3q0.a;
            case 26:
                return ((xwl0) obj).b;
            case 27:
                suu suuVar = new suu();
                ArrayList arrayList = ((gl10) obj).a;
                arrayList.add(suuVar);
                jx6 jx6Var = new jx6(bpo0.c, suuVar);
                ArrayList arrayList2 = suuVar.a;
                arrayList2.add(jx6Var);
                int i2 = 26;
                jx6Var.f(new fo20(i2));
                i090 i090Var = new i090();
                arrayList2.add(i090Var);
                i090Var.f(new oey(28));
                s3q0 s3q0Var = s3q0.a;
                uuu uuuVar = new uuu();
                arrayList.add(uuuVar);
                jgd0 jgd0Var = new jgd0(bpo0.c, uuuVar);
                ArrayList arrayList3 = uuuVar.a;
                arrayList3.add(jgd0Var);
                jgd0Var.f(new gky(i2));
                i090 i090Var2 = new i090();
                arrayList3.add(i090Var2);
                i090Var2.f(new f6w(i));
                s3q0 s3q0Var2 = s3q0.a;
                tuu tuuVar = new tuu();
                arrayList.add(tuuVar);
                int i3 = btm0.c;
                id3 id3Var = tuuVar.a;
                hd3.a(id3Var, i3);
                hd3.b(id3Var, "⚠️");
                s3q0 s3q0Var3 = s3q0.a;
                j090 j090Var = new j090();
                arrayList.add(j090Var);
                int i4 = btm0.a;
                id3 id3Var2 = j090Var.a;
                hd3.a(id3Var2, i4);
                hd3.b(id3Var2, "🤔");
                s3q0 s3q0Var4 = s3q0.a;
                return s3q0.a;
            case 28:
                return Boolean.valueOf(((dug0.c) obj).c());
            default:
                Throwable th2 = (Throwable) obj;
                String message = th2.getMessage();
                if (message == null) {
                    message = "TaskTimeInQueueReporter error";
                }
                L.j(th2, "TaskTimeInQueueReporter", message);
                return s3q0.a;
        }
    }

    public /* synthetic */ bqt(com.vk.newsfeed.posting.market_picker.presentation.base.view.f fVar) {
        this.b = 5;
    }
}
