package xsna;

import com.vk.music.fragment.impl.MusicCatalogFragment;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.o0r0;

/* compiled from: MusicCatalogFragment.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class dd40 extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b = 0;

    public /* synthetic */ dd40(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                MusicCatalogFragment musicCatalogFragment = (MusicCatalogFragment) this.receiver;
                int i = MusicCatalogFragment.W;
                musicCatalogFragment.getClass();
                cn o = o25.a().o();
                xwk.e().m(musicCatalogFragment.requireContext(), o.a, new o0r0.a(false, null, null, null, null, o.b, o.c, o.j, false, false, false, null, null, null, 65311));
                break;
            default:
                ((com.vk.registration.funnels.b) this.receiver).getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.SELECT_AUTH_BY_PASSWORD, null, null, null, null, null, null, 254);
                break;
        }
        return s3q0.a;
    }

    public dd40(Object obj) {
        super(0, obj, com.vk.registration.funnels.b.class, "onSelectAuthByPassword", "onSelectAuthByPassword()V", 0);
    }
}
