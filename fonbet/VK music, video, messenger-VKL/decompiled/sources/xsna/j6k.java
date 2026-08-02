package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.SocialButtonType;
import com.vk.ecomm.moderation.api.restrictions.ModerationRestriction;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.offline.api.model.MusicOfflineCacheStorage;
import com.vk.onboardingpromo.impl.ui.entity.a;
import com.vk.photos.ui.editalbum.domain.g;
import com.vk.photos.ui.editalbum.presentation.CreateAlbumFragment;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.ajw0;
import xsna.b910;
import xsna.ge20;
import xsna.zhw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class j6k implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ j6k(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        ajw0 ajw0Var;
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                g.k kVar = (g.k) obj3;
                CreateAlbumFragment createAlbumFragment = (CreateAlbumFragment) obj2;
                FragmentActivity fragmentActivity = (FragmentActivity) obj;
                int i2 = CreateAlbumFragment.Z;
                com.vk.photos.ui.editalbum.domain.g gVar = kVar.c;
                j7k0 j7k0Var = kVar.a;
                if (epx.f(gVar, g.e.a)) {
                    ((oga0) createAlbumFragment.V.getValue()).l(fragmentActivity);
                } else {
                    gzs<s3q0> gzsVar = j7k0Var.e;
                    if (gzsVar != null) {
                        gzsVar.invoke();
                    }
                }
                j7k0Var.getClass();
                return s3q0.a;
            case 1:
                wzv wzvVar = (wzv) obj3;
                String str = (String) obj2;
                return Boolean.valueOf(xwk.d().e().l(wzvVar.b, str, new LaunchContext(false, false, false, (String) obj, null, null, null, null, str, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108599), null, zp80.a(wzvVar.b, str)));
            case 2:
                j810 j810Var = (j810) obj3;
                if (j810Var.m.b((c530) obj2, (ModerationRestriction) obj)) {
                    return s3q0.a;
                }
                g810 g810Var = j810Var.o;
                if (g810Var != null) {
                    j810Var.l.invoke(new b910.c(g810Var.b));
                }
                return s3q0.a;
            case 3:
                return (ge20.c) ((l7r0) obj3).d((ij20) obj2, (ge20.b) obj);
            case 4:
                ((Runnable) obj3).run();
                ((gzs) obj2).invoke();
                ((Runnable) obj).run();
                return s3q0.a;
            case 5:
                ((izs) obj3).invoke(new a.d((qg80) obj2, ((mc90) obj).r()));
                return s3q0.a;
            case 6:
                qgp0 qgp0Var = (qgp0) obj3;
                String str2 = (String) obj2;
                MusicOfflineCacheStorage musicOfflineCacheStorage = (MusicOfflineCacheStorage) obj;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", "mid=" + str2 + " storage=" + musicOfflineCacheStorage});
                }
                qgp0Var.b.o(str2, musicOfflineCacheStorage.name());
                return s3q0.a;
            default:
                zhw0 zhw0Var = (zhw0) obj3;
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                zhw0Var.c0((UserId) obj2, (yiw0) obj, new ptl0(ref$ObjectRef, 20));
                SocialButtonType socialButtonType = (SocialButtonType) ref$ObjectRef.element;
                if (socialButtonType != null) {
                    int i3 = zhw0.b.$EnumSwitchMapping$0[socialButtonType.ordinal()];
                    if (i3 == 1) {
                        ajw0Var = ajw0.a.C2547a.a;
                    } else {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ajw0Var = ajw0.a.b.a;
                    }
                    zhw0Var.l.b(ajw0Var);
                }
                return s3q0.a;
        }
    }
}
