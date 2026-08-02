package xsna;

import com.vk.log.L;
import com.vk.profile.community.catalog.impl.communities.CommunitiesCatalogFragment;
import com.vk.voip.ui.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.externcalls.sdk.audio.AdaptersKt;
import xsna.o0r0;

/* compiled from: BestFriendsConversationVh.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class tx6 extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tx6(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002d, code lost:
    
        if (com.vk.voip.ui.a.g == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        boolean z;
        switch (this.b) {
            case 0:
                rx6.h6((rx6) this.receiver);
                return s3q0.a;
            case 1:
                CommunitiesCatalogFragment communitiesCatalogFragment = (CommunitiesCatalogFragment) this.receiver;
                int i = CommunitiesCatalogFragment.T;
                communitiesCatalogFragment.getClass();
                cn o = o25.a().o();
                xwk.e().m(communitiesCatalogFragment.requireContext(), o.a, new o0r0.a(false, null, null, null, null, o.b, o.c, o.j, false, false, false, null, null, null, 65311));
                return s3q0.a;
            default:
                com.vk.voip.ui.a aVar = (com.vk.voip.ui.a) this.receiver;
                com.vk.voip.ui.a aVar2 = com.vk.voip.ui.a.a;
                aVar.getClass();
                int i2 = a.C2008a.$EnumSwitchMapping$1[com.vk.voip.ui.a.f.ordinal()];
                int i3 = 1;
                if (i2 != 1) {
                    z = false;
                    if (i2 == 2) {
                        break;
                    } else if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    L.p("OKVoipAudioManager", zhy0.a("playConnected: shouldEnabledLoudspeaker=", z));
                    if (z) {
                        com.vk.voip.ui.a.g();
                    } else {
                        com.vk.voip.ui.a.c.b(io.reactivex.rxjava3.kotlin.c.d(AdaptersKt.setSpeakerEnabledCompletable(com.vk.voip.ui.a.d.a(), true, true), new re0(28), new ev60(i3)));
                    }
                    return s3q0.a;
                }
                z = true;
                L.p("OKVoipAudioManager", zhy0.a("playConnected: shouldEnabledLoudspeaker=", z));
                if (z) {
                }
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tx6(CommunitiesCatalogFragment communitiesCatalogFragment) {
        super(0, communitiesCatalogFragment, CommunitiesCatalogFragment.class, "onAvatarClickAction", "onAvatarClickAction()V", 0);
        this.b = 1;
    }
}
