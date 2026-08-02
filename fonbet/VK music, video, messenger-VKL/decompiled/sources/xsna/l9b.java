package xsna;

import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.jne0;

/* compiled from: ChannelProfileInfoModel.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class l9b extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l9b(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
        this.b = 3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                i9b.a((i9b) this.receiver);
                break;
            case 1:
                ((com.vk.newsfeed.posting.market_picker.presentation.base.view.e) this.receiver).q.setAlpha(1.0f);
                break;
            case 2:
                ((com.vk.registration.funnels.b) this.receiver).getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.INPUT_CODE_INTERACTION, null, null, null, null, null, null, 254);
                break;
            default:
                ((vvw0) this.receiver).C(jne0.b.b);
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9b(Object obj, int i) {
        super(0, obj, i9b.class, "disableNotifications", "disableNotifications()V", 0);
        this.b = i;
        switch (i) {
            case 1:
                super(0, obj, com.vk.newsfeed.posting.market_picker.presentation.base.view.e.class, "onShowAnimation", "onShowAnimation()V", 0);
                break;
            case 2:
                super(0, obj, com.vk.registration.funnels.b.class, "onInputCodeInteraction", "onInputCodeInteraction()V", 0);
                break;
            default:
                break;
        }
    }
}
