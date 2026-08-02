package xsna;

import android.net.Uri;
import com.unity3d.services.UnityAdsConstants;
import com.vk.auth.api.models.AuthResult;
import com.vk.auth.main.AuthModel;
import com.vk.catalog.mvi.block.video.impl.video.list.c;
import com.vk.dto.masks.Mask;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedVideosSourceArgs;
import com.vk.voip.ui.scheduled.callslist.VoipScheduledCallsFragment;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.Collection;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.us2;
import xsna.v7h0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class hmj0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hmj0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01fa  */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        ljo0 ljo0Var;
        androidx.compose.ui.graphics.a k;
        sjo0 sjo0Var;
        kjo0 kjo0Var;
        switch (this.b) {
            case 0:
                Uri uri = (Uri) this.c;
                AuthModel authModel = (AuthModel) this.d;
                AuthResult authResult = (AuthResult) obj;
                if (uri != null) {
                    authModel.h(authResult, uri);
                }
                break;
            case 1:
                rjo0 rjo0Var = (rjo0) this.c;
                us2.d dVar = (us2.d) this.d;
                tdu tduVar = (tdu) obj;
                us2 us2Var = rjo0Var.b;
                wh50 wh50Var = rjo0Var.a;
                ljo0 ljo0Var2 = (ljo0) ((zak0) wh50Var).getValue();
                if (epx.f(us2Var, (ljo0Var2 == null || (kjo0Var = ljo0Var2.a) == null) ? null : kjo0Var.a) && (ljo0Var = (ljo0) ((zak0) wh50Var).getValue()) != null) {
                    m540 m540Var = ljo0Var.b;
                    us2.d c = rjo0.c(dVar, ljo0Var);
                    if (c != null) {
                        int i = c.c;
                        int i2 = c.b;
                        k = ljo0Var.k(i2, i);
                        zhf0 b = ljo0Var.b(i2);
                        k.e(((Float.floatToRawIntBits(m540Var.d(i2) == m540Var.d(i - 1) ? Math.min(ljo0Var.b(r5).a, b.a) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(b.b) & 4294967295L)) ^ (-9223372034707292160L));
                        sjo0Var = k != null ? new sjo0(k) : null;
                        if (sjo0Var != null) {
                            tduVar.X(sjo0Var);
                            tduVar.f(true);
                        }
                        break;
                    }
                }
                k = null;
                if (k != null) {
                }
                if (sjo0Var != null) {
                }
                break;
            case 2:
                izs izsVar = (izs) this.c;
                lbq0 lbq0Var = (lbq0) this.d;
                izsVar.invoke((Throwable) obj);
                lbq0Var.d = false;
                break;
            case 3:
                ((slq0) this.c).a(new UserProfileAction.s.c.a.f(new si60((olq0) this.d, 12)));
                break;
            case 4:
                ((mtq0) this.c).n.a((UserProfileAction) this.d);
                break;
            case 5:
                com.vk.video.ui.discovery.minimizable.related_videos.c cVar = (com.vk.video.ui.discovery.minimizable.related_videos.c) this.c;
                VideoDiscoveryRelatedVideosSourceArgs.Playlist playlist = (VideoDiscoveryRelatedVideosSourceArgs.Playlist) this.d;
                rbt0 rbt0Var = (rbt0) obj;
                Integer num = playlist.g;
                int intValue = num != null ? num.intValue() : playlist.c;
                cVar.getClass();
                break;
            case 6:
                kts0 kts0Var = (kts0) this.c;
                Collection<j0l0> collection = (Collection) this.d;
                SQLiteStatement g = kts0Var.b.b().g("\n                REPLACE INTO video_message_stencil(id, raw_path, start_date_ms, end_date_ms)\n                VALUES(?,?,?,?)\n                ");
                for (j0l0 j0l0Var : collection) {
                    g.clearBindings();
                    g.bindLong(1, j0l0Var.a);
                    g.bindString(2, j0l0Var.b);
                    g.bindLong(3, j0l0Var.c);
                    g.bindLong(4, j0l0Var.d);
                    g.executeInsert();
                }
                break;
            case 7:
                pbt0 pbt0Var = (pbt0) this.c;
                mbt0 mbt0Var = (mbt0) this.d;
                com.vk.libvideo.design.view.overlay.b bVar = (com.vk.libvideo.design.view.overlay.b) obj;
                boolean z = bVar.c;
                com.vk.libvideo.design.view.overlay.b a = com.vk.libvideo.design.view.overlay.b.a(bVar, 463);
                if (!bVar.d || z) {
                    if (z) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            case 8:
                izs izsVar2 = (izs) this.c;
                vst0 vst0Var = (vst0) this.d;
                ((Boolean) obj).getClass();
                izsVar2.invoke(new c.d(vst0Var.b));
                break;
            case 9:
                ((vnw0) this.c).a.a((Mask) this.d, (String) obj);
                break;
            case 10:
                tzq0 tzq0Var = (tzq0) this.c;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.d;
                tzq0Var.invoke((mvo0) obj);
                dw20 dw20Var = (dw20) ref$ObjectRef.element;
                if (dw20Var != null) {
                    dw20Var.tn();
                }
                break;
            default:
                VoipScheduledCallsFragment voipScheduledCallsFragment = (VoipScheduledCallsFragment) this.c;
                VoipScheduledCallsFragment.b bVar2 = (VoipScheduledCallsFragment.b) this.d;
                int i3 = VoipScheduledCallsFragment.c0;
                voipScheduledCallsFragment.fo((v7h0.b) obj, bVar2);
                break;
        }
        return s3q0.a;
    }
}
