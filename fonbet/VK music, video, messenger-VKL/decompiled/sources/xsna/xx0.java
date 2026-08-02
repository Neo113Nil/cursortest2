package xsna;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.clips.sdk.shared.api.nps.api.condition.SdkExternalNpsCondition;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.dto.attaches.AttachWithImage;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.data.VKList;
import com.vk.dto.photo.Photo;
import com.vk.ecomm.onlinebooking.impl.services.presentation.model.BookingServicesScreenState;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.profile.community.suggestions.impl.ui.suggestions.CommunitySuggestionsViewState;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.FwdMessagesAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.data.b;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import xsna.c8x0;
import xsna.dug0;
import xsna.ek1;
import xsna.it80;
import xsna.q2j;
import xsna.qdd;
import xsna.r6k;
import xsna.tj50;
import xsna.va9;
import xsna.ywa;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class xx0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ xx0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        byte b = 0;
        switch (this.b) {
            case 0:
                ((Boolean) obj).booleanValue();
                return s3q0.a;
            case 1:
                tj50.a aVar = (tj50.a) obj;
                return new ek1.a(aVar.e(uj1.b), aVar.e(vj1.b), aVar.a(wj1.b, ao8.d));
            case 2:
                it80.b.getClass();
                return it80.a.a();
            case 3:
                return (AttachWithImage) ca3.b(new PhotoAttachment(new Photo((Image) obj)));
            case 4:
                return ((BookingServicesScreenState.ServiceWrapper) obj).b;
            case 5:
                return Boolean.valueOf(((c8x0) obj) instanceof c8x0.c);
            case 6:
                return ((va9.g) obj).a;
            case 7:
                ((b.d) obj).b("video", "story_type");
                return s3q0.a;
            case 8:
                return Boolean.TRUE;
            case 9:
                ((pvw0) obj).o();
                return s3q0.a;
            case 10:
                return com.vk.channels.impl.channel_screen.send_msg.a.O((FwdMessagesAttachment) ((Attachment) obj));
            case 11:
                return new vub(0);
            case 12:
                SdkExternalNpsCondition sdkExternalNpsCondition = (SdkExternalNpsCondition) obj;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"CLIPS_NPS", "poll is completed; " + sdkExternalNpsCondition});
                }
                return s3q0.a;
            case 13:
                int a = ((ery) obj).a() / 3;
                Integer valueOf = a > 0 ? Integer.valueOf(a) : null;
                return new tfu(n34.a(valueOf != null ? valueOf.intValue() : 1));
            case 14:
                qdd.c cVar = (qdd.c) obj;
                if (cVar instanceof qdd.c.b) {
                    return ((qdd.c.b) cVar).a;
                }
                if (cVar instanceof qdd.c.C3559c) {
                    return ((qdd.c.C3559c) cVar).a;
                }
                if (cVar instanceof qdd.c.a) {
                    throw ((qdd.c.a) cVar).a;
                }
                if (cVar instanceof qdd.c.d) {
                    throw new IllegalStateException("Uninitialized state should not be here");
                }
                throw new NoWhenBranchMatchedException();
            case 15:
                return new VkAvatar((Context) obj, null, 6, 0);
            case 16:
                return ((dug0.c) obj).c;
            case 17:
                return Boolean.valueOf(!(((tqf) obj).c instanceof FeedItem.Pagination.b));
            case 18:
                TextView textView = (TextView) obj;
                textView.setTextAppearance(R.style.VkUiTypography_Caption1);
                textView.setTextColor(e3m.f(R.attr.vk_ui_text_primary, textView.getContext()));
                textView.setTextSize(12.0f);
                textView.setMaxLines(5);
                return s3q0.a;
            case 19:
                Photo photo = (Photo) j5g.a0((VKList) obj);
                return photo == null ? io.reactivex.rxjava3.core.q.H(new NoSuchElementException()) : rsg0.y0(new rea0(photo.e, photo.c), null, null, 3);
            case 20:
                return s3q0.a;
            case 21:
                tj50.a aVar2 = (tj50.a) obj;
                int i = 19;
                pf pfVar = new pf(i);
                ao8 ao8Var = ao8.d;
                int i2 = 25;
                int i3 = 2;
                return new CommunitySuggestionsViewState.a(aVar2.a(pfVar, ao8Var), aVar2.a(new rf(i2), ao8Var), tj50.a.d(aVar2, new gv3(12), new oa(17), new e69(b, i3)), tj50.a.d(aVar2, new qt0(i), new tb4(14), new k3i(b)), tj50.a.d(aVar2, new am0(i2), new ci3(16), new z2(i3)));
            case 22:
                return s3q0.a;
            case 23:
                return Boolean.valueOf(((q2j.c) obj).d);
            case 24:
                ywa.a aVar3 = (ywa.a) obj;
                return new r6k.a(aVar3.a, aVar3.b);
            case 25:
                qgi0.r((tgi0) obj, "errorDescription");
                return s3q0.a;
            case 26:
                return w6a0.a;
            case 27:
                return s3q0.a;
            case 28:
                return new xu80((ViewGroup) obj);
            default:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return e3m.e(R.attr.im_ic_return_to_dialog, (Context) obj);
        }
    }

    public /* synthetic */ xx0(com.vk.channels.impl.channel_screen.send_msg.a aVar) {
        this.b = 10;
    }
}
