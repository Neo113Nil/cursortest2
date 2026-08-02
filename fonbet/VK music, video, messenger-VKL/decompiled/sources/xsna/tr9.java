package xsna;

import com.vk.common.links.LaunchContext;
import com.vk.music.fragment.impl.MusicCatalogFragment;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.superapp.multiaccount.api.MultiAccountEntryPoint;
import com.vkontakte.android.data.PostInteract;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CaptionHolderV2.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class tr9 extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tr9(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ur9 ur9Var = (ur9) this.receiver;
                int i = ur9.H;
                sr9 sr9Var = (sr9) ur9Var.C;
                if (sr9Var != null) {
                    maz.c(xwk.d().e(), ur9Var.itemView.getContext(), sr9Var.j, LaunchContext.A, null, null, 24);
                    PostInteract postInteract = ur9Var.w;
                    if (postInteract != null) {
                        postInteract.zb(PostInteract.Type.caption_link_click);
                    }
                }
                break;
            case 1:
                ((io.reactivex.rxjava3.core.r) this.receiver).onComplete();
                break;
            case 2:
                MusicCatalogFragment musicCatalogFragment = (MusicCatalogFragment) this.receiver;
                if (((hlu0) musicCatalogFragment.S.getValue()).a()) {
                    ((jlu0) musicCatalogFragment.T.getValue()).e(musicCatalogFragment, MultiAccountEntryPoint.LongTap.d);
                }
                break;
            default:
                ((com.vk.registration.funnels.b) this.receiver).getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.ALERT_SMS_ALREADY_SEND, null, null, null, null, null, null, 254);
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tr9(Object obj) {
        super(0, obj, com.vk.registration.funnels.b.class, "onVerificationSmsAlreadySent", "onVerificationSmsAlreadySent()V", 0);
        this.b = 3;
    }
}
