package xsna;

import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.presentation.model.PhotoDto;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vkontakte.android.attachments.PhotoAttachment;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.gy50;

/* compiled from: ImagePostingHolder.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class xkw extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xkw(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ykw ykwVar = (ykw) this.receiver;
                PhotoAttachment photoAttachment = ykwVar.j;
                PhotoDto a = photoAttachment != null ? com.vk.newsfeed.posting.impl.presentation.model.a.a(photoAttachment) : null;
                if (a != null) {
                    ykwVar.f.invoke(new PostingAction.Navigation.OpenCropPhotoEditor(a));
                }
                break;
            case 1:
                ((cxu0) this.receiver).getClass();
                break;
            case 2:
                ((com.vk.registration.funnels.b) this.receiver).getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.CALLIN_LIBVERIFY_STARTED, null, null, null, null, null, null, 254);
                break;
            case 3:
                ((com.vk.voip.ui.c) this.receiver).getClass();
                com.vk.voip.ui.c.S0(gy50.f.a);
                break;
            default:
                mjw0 mjw0Var = (mjw0) this.receiver;
                int i = mjw0.m1;
                mjw0Var.s();
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xkw(Object obj, int i) {
        super(0, obj, cxu0.class, "yellowBright", "yellowBright()Landroid/graphics/drawable/Drawable;", 0);
        this.b = i;
        switch (i) {
            case 2:
                super(0, obj, com.vk.registration.funnels.b.class, "onLibverifyCallInStarted", "onLibverifyCallInStarted()V", 0);
                break;
            case 3:
                super(0, obj, com.vk.voip.ui.c.class, "openBeautyFilter", "openBeautyFilter()V", 0);
                break;
            default:
                break;
        }
    }
}
