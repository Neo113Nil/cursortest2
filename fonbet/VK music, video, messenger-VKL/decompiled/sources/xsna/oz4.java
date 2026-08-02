package xsna;

import com.vk.im.engine.models.MsgRequestStatus;
import com.vk.im.ui.fragments.ImRequestsFragment;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AudioTrackTranscoder.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class oz4 extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oz4(Object obj, int i) {
        super(0, obj, kfp0.class, "drain", "drain()V", 0);
        this.b = i;
        switch (i) {
            case 1:
                super(0, obj, com.vk.registration.funnels.b.class, "onWhiteLabelItsNotMyAccount", "onWhiteLabelItsNotMyAccount()V", 0);
                break;
            case 2:
                super(0, obj, zqh0.class, "notifyRequestFinished", "notifyRequestFinished()V", 0);
                break;
            case 3:
                super(0, obj, ImRequestsFragment.class, "launchDeclineAll", "launchDeclineAll()V", 0);
                break;
            case 4:
                super(0, obj, h7p0.class, "drawerIconLongClick", "drawerIconLongClick()V", 0);
                break;
            default:
                break;
        }
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((kfp0) this.receiver).a();
                break;
            case 1:
                ((com.vk.registration.funnels.b) this.receiver).getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.ITS_NOT_MY_ACCOUNT, null, null, null, null, null, null, 254);
                break;
            case 2:
                ((zqh0) this.receiver).c();
                break;
            case 3:
                ImRequestsFragment imRequestsFragment = (ImRequestsFragment) this.receiver;
                qcy<Object>[] qcyVarArr = ImRequestsFragment.Z;
                imRequestsFragment.getClass();
                io.reactivex.rxjava3.internal.operators.single.c C = imRequestsFragment.P.C(imRequestsFragment, new zv30(MsgRequestStatus.REJECTED));
                asu0 asu0Var = asu0.a;
                imRequestsFragment.N.b(io.reactivex.rxjava3.kotlin.c.h(new io.reactivex.rxjava3.internal.operators.single.n(new io.reactivex.rxjava3.internal.operators.single.j(C.q(asu0Var.c()).m(asu0Var.d()), new sd6(imRequestsFragment, 4)), new k41(new l2k(imRequestsFragment, 20), 24)), new u19(zk70.a, 3), null, 2));
                break;
            default:
                ((h7p0) this.receiver).b();
                break;
        }
        return s3q0.a;
    }
}
