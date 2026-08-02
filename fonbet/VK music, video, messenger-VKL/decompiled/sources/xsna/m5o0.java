package xsna;

import android.content.Context;
import android.os.Bundle;
import com.vk.accountmanager.domain.interactor.VkAccountAuthenticatorService;
import com.vk.feed.design.view.newsfeed.ads_carousel.VkFeedOverlayProductCarousel;
import com.vk.im.ui.components.contacts.ContactsListFactory;
import com.vk.im.ui.fragments.ContactsListFragmentRedesign;
import com.vk.libvideo.embedded_players.ui.fragments.VideoEmbedFragment;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.b4;
import xsna.gpp0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class m5o0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m5o0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                int i2 = zfp0.x1;
                break;
            case 3:
                ((gpp0.a) obj).l.d(b4.s.a);
                break;
            case 4:
                dw20 dw20Var = (dw20) ((Ref$ObjectRef) obj).element;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                break;
            case 5:
                int i3 = UserProfileFragment.p0;
                break;
            case 6:
                break;
            case 7:
                qcy<Object>[] qcyVarArr = qyr0.m1;
                break;
            case 8:
                int i4 = VideoEmbedFragment.q0;
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                int i5 = VkAccountAuthenticatorService.c;
                break;
            case 12:
                ((com.vk.superapp.browser.ui.a) obj).tn();
                break;
            case 13:
                equ0 equ0Var = (equ0) obj;
                equ0Var.j.getClass();
                Context context = equ0Var.m;
                if (context == null) {
                    context = null;
                }
                bc6 L = xa4.L(context);
                ContactsListFragmentRedesign.a aVar = new ContactsListFragmentRedesign.a();
                ContactsListFactory contactsListFactory = ContactsListFactory.CONTACTS_LIST_VKAPP;
                Bundle bundle = aVar.j;
                bundle.putSerializable("factory", contactsListFactory);
                aVar.s(true);
                aVar.y(R.attr.im_ic_back_toolbar);
                bundle.putString("force_entry_point_for_new", null);
                bundle.putString("force_entry_point_for_create_contact", "contact_list_vk_create_contact");
                aVar.m(L);
                break;
            case 14:
                int i6 = VkFeedOverlayProductCarousel.A;
                break;
            case 15:
                com.vk.core.compose.component.datetime.m mVar = ((com.vk.core.compose.component.datetime.n) obj).a;
                mVar.a().a();
                s3q0 s3q0Var = s3q0.a;
                ((zak0) mVar.a).setValue(mVar.a());
                break;
            case 16:
                ((oyw0) obj).e.invoke();
                break;
            case 17:
                ((o4x0) obj).c.O0();
                break;
            default:
                tkx0 tkx0Var = (tkx0) ((xkx0) obj).a;
                if (tkx0Var != null) {
                    tkx0Var.e();
                }
                break;
        }
        return s3q0.a;
    }
}
