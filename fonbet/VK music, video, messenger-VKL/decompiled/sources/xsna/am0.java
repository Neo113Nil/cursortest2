package xsna;

import android.graphics.Bitmap;
import com.vk.api.generated.audioBooks.dto.AudioBooksBoolResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.biometrics.lock.impl.presentation.base.mvi.setup.e;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.onlinebooking.impl.services.presentation.model.BookingServicesScreenState;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.e;
import com.vk.im.engine.models.messages.CnvMsgId;
import com.vk.im.engine.models.users.User;
import com.vk.im.engine.models.users.UserDeactivationStatus;
import com.vk.im.ui.components.attaches_history.attaches.pagination.PageLoadingState;
import com.vk.im.ui.components.contacts.ContactsListFactory;
import com.vk.im.ui.components.contacts.SortOrder;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.log.L;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.ButtonPanelPosting;
import com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.e;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import xsna.it80;
import xsna.kb7;
import xsna.npb;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class am0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ am0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = 1;
        switch (this.b) {
            case 0:
                L.i((Throwable) obj);
                return s3q0.a;
            case 1:
                it80.b.getClass();
                return it80.a.a();
            case 2:
                return ((kw8) obj).e(new lt0(i));
            case 3:
                return Float.valueOf(1.0f);
            case 4:
                return Boolean.valueOf(((AudioBooksBoolResponseDto) obj).d() == BaseBoolIntDto.YES);
            case 5:
                par0 par0Var = par0.a;
                String str = "Error in AuthHelper: " + ((Throwable) obj).getMessage();
                par0Var.getClass();
                par0.b(str);
                return s3q0.a;
            case 6:
                return Boolean.valueOf(((PageLoadingState) obj).Cb());
            case 7:
                bn40.c((Throwable) obj, new Object[0]);
                return s3q0.a;
            case 8:
                return Boolean.valueOf(((User) obj).k != UserDeactivationStatus.DELETED);
            case 9:
                xgx0.a.getClass();
                xgx0.d((Throwable) obj);
                return s3q0.a;
            case 10:
                tj50.a aVar = (tj50.a) obj;
                f87 f87Var = f87.b;
                ao8 ao8Var = ao8.d;
                return new e.b(aVar.a(f87Var, ao8Var), aVar.a(g87.b, ao8Var));
            case 11:
                return kb7.c.a;
            case 12:
                return (is7) obj;
            case 13:
                return Boolean.valueOf(((BookingServicesScreenState.ServiceWrapper) obj).c);
            case 14:
                List list = (List) obj;
                boolean z = list.size() > 12;
                if (z) {
                    list = rdi.A(list.size() - 1, list);
                }
                List list2 = list;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                int i2 = 0;
                for (Object obj2 : list2) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        e43.t();
                        throw null;
                    }
                    arrayList.add(new e.b((MediaStoreEntry) obj2, false, i2, list.size()));
                    i2 = i3;
                }
                ArrayList arrayList2 = new ArrayList(arrayList);
                if (z) {
                    arrayList2.add(new e.a.b(ButtonPanelPosting.MORE_ATTACHMENT_BUTTON_TYPE));
                }
                return arrayList2;
            case 15:
                List list3 = (List) obj;
                UserProfile b = o25.a().o().b();
                Set singleton = Collections.singleton(b.c);
                List list4 = list3;
                ArrayList arrayList3 = new ArrayList(c5g.u(list4, 10));
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    arrayList3.add(fkq0.e(((Group) it.next()).c));
                }
                LinkedHashSet j = izi0.j(singleton, arrayList3);
                z20 z20Var = new z20("video.getUpcomingLives", i);
                z20Var.M("owner_ids", j5g.O0(j));
                return rsg0.w0(z20Var).l(new g7(new ut6(2, b, list3), 6));
            case 16:
                ((pvw0) obj).Y();
                return s3q0.a;
            case 17:
                return (CnvMsgId) obj;
            case 18:
                int i4 = kwg0.a;
                new jwg0("ecb").accept((Throwable) obj);
                return s3q0.a;
            case 19:
                return ((wfb) obj).a;
            case 20:
                return npb.a.a;
            case 21:
                return s3q0.a;
            case 22:
                return Float.valueOf(sa30.E(((Float) obj).floatValue(), new k9x(-1, 1, 1), new k9x(0, 100, 1)));
            case 23:
                qgi0.r((tgi0) obj, "BOOKING_BANNER_CLOSE_ICON");
                return s3q0.a;
            case 24:
                rzh rzhVar = (rzh) obj;
                return new e.j.b(rzhVar.d, rzhVar.e, rzhVar.l);
            case 25:
                return ((ztg) obj).g;
            case 26:
                Bitmap bitmap = (Bitmap) obj;
                SoftReference<Bitmap> softReference = VideoTextureView.r;
                VideoTextureView.r = bitmap != null ? new SoftReference<>(bitmap) : null;
                return s3q0.a;
            case 27:
                return s3q0.a;
            case 28:
                qgi0.r((tgi0) obj, "ActionButtonTitle");
                return s3q0.a;
            default:
                ContactsListFactory contactsListFactory = ContactsListFactory.CREATE_CONVERSATION_VKME;
                return new ldj(((x8j) obj).a, SortOrder.BY_CONTACT_NAME);
        }
    }
}
