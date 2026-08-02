package xsna;

import android.content.Context;
import android.media.AudioManager;
import com.vk.log.L;
import com.vk.profile.community.catalog.impl.communities.CommunitiesCatalogFragment;
import com.vk.superapp.multiaccount.api.MultiAccountEntryPoint;
import com.vkontakte.android.actionlinks.views.fragments.ItemsDialogWrapper;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.vvr0;

/* compiled from: CommunitiesCatalogFragment.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class xng extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xng(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                CommunitiesCatalogFragment communitiesCatalogFragment = (CommunitiesCatalogFragment) this.receiver;
                if (((hlu0) communitiesCatalogFragment.Q.getValue()).a()) {
                    ((jlu0) communitiesCatalogFragment.R.getValue()).e(communitiesCatalogFragment, MultiAccountEntryPoint.LongTap.d);
                }
                return s3q0.a;
            case 1:
                ((ItemsDialogWrapper) this.receiver).dismiss();
                return s3q0.a;
            case 2:
                com.vk.voip.ui.a aVar = (com.vk.voip.ui.a) this.receiver;
                com.vk.voip.ui.a aVar2 = com.vk.voip.ui.a.a;
                aVar.getClass();
                L.p("OKVoipAudioManager", "playIncoming: isGlobalDndEnabled=" + lsn.b());
                if (lsn.b()) {
                    com.vk.voip.ui.a.k();
                } else {
                    com.vk.voip.ui.c.b.getClass();
                    com.vk.voip.ui.c.p.getClass();
                    Context context = e43.a;
                    if (context == null) {
                        context = null;
                    }
                    int ringerMode = ((AudioManager) context.getSystemService("audio")).getRingerMode();
                    L.p("OKVoipAudioManager", lhg.a(ringerMode, "playIncoming: ringerMode="));
                    if (ringerMode == 0) {
                        com.vk.voip.ui.a.k();
                    } else if (ringerMode == 1) {
                        bpn0 bpn0Var = vvr0.a;
                        vvr0.h(vvr0.a.CALL_RINGING);
                        com.vk.voip.ui.a.k();
                    } else if (ringerMode == 2) {
                        bpn0 bpn0Var2 = vvr0.a;
                        vvr0.h(vvr0.a.CALL_RINGING);
                        L.p("OKVoipAudioManager", "normalRinging");
                        z99 d = com.vk.voip.ui.a.d();
                        z99.a(d, d.b.a(), null, 10);
                    }
                }
                return s3q0.a;
            default:
                return Boolean.valueOf(((mkr0) this.receiver).D());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xng(CommunitiesCatalogFragment communitiesCatalogFragment) {
        super(0, communitiesCatalogFragment, CommunitiesCatalogFragment.class, "onAvatarLongClickAction", "onAvatarLongClickAction()V", 0);
        this.b = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xng(Object obj) {
        super(0, obj, mkr0.class, "canLoadMoreChannels", "canLoadMoreChannels()Z", 0);
        this.b = 3;
    }
}
