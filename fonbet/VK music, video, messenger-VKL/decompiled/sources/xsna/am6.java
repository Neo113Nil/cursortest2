package xsna;

import android.widget.TextView;
import com.android.billingclient.api.AccountIdentifiers;
import com.android.billingclient.api.Purchase;
import com.vk.core.view.fresco.VKEnhancedImageView;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.music.MusicTrack;
import com.vk.libvideo.design.view.movika.InteractiveDurationView;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.StartPlaySource;
import com.vk.music.player.StartPlayVkMixSource;
import com.vk.music.player.playback.PlaybackQueueConfig;
import com.vk.music.player.playback.c;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.text.Regex;
import xsna.bm6;
import xsna.g2s0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class am6 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ am6(VideoFile videoFile, qps0 qps0Var, boolean z) {
        this.b = 4;
        this.d = videoFile;
        this.e = qps0Var;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.b) {
            case 0:
                com.vk.lists.c cVar = (com.vk.lists.c) this.d;
                Set<UserId> set = ((bm6) this.e).d;
                VKList vKList = (VKList) obj;
                boolean z2 = this.c || cVar.i() == 0;
                if (z2) {
                    set.clear();
                }
                cVar.l(vKList.i());
                boolean z3 = (cVar.j() == null || cVar.i() >= vKList.i() || vKList.isEmpty()) ? false : true;
                cVar.r(z3);
                return new bm6.a(bm6.b(set, vKList), vKList, z2, z3);
            case 1:
                com.vk.music.player.playback.c cVar2 = (com.vk.music.player.playback.c) this.d;
                ke4 ke4Var = (ke4) this.e;
                ixa0 ixa0Var = (ixa0) obj;
                com.vk.music.player.playback.e eVar = ixa0Var.a;
                PlayerTrack playerTrack = ixa0Var.b;
                cVar2.s = new c.a(playerTrack != null ? playerTrack.e : 0L, playerTrack != null ? playerTrack.f : null, playerTrack != null);
                cVar2.h = eVar;
                cVar2.n = ixa0Var.c;
                cVar2.o = new ArrayList(ixa0Var.d);
                cVar2.m.putAll(ixa0Var.e);
                PlaybackQueueConfig.a aVar = PlaybackQueueConfig.Companion;
                MusicTrack musicTrack = playerTrack != null ? playerTrack.b : null;
                StartPlaySource startPlaySource = eVar.a;
                aVar.getClass();
                cVar2.w = (musicTrack == null || !musicTrack.Vb()) ? (musicTrack == null || !musicTrack.Wb()) ? startPlaySource == null ? PlaybackQueueConfig.MUSIC_WITHOUT_SOURCE_CONFIG : startPlaySource instanceof StartPlayVkMixSource ? PlaybackQueueConfig.VK_MIX_CONFIG : PlaybackQueueConfig.MUSIC_CONFIG : PlaybackQueueConfig.RADIO_CONFIG : PlaybackQueueConfig.PODCAST_CONFIG;
                cVar2.u = cVar2.g.a(playerTrack != null ? playerTrack.b : null, eVar);
                cVar2.z(new q6h(this.c, ke4Var, ixa0Var, 1));
                return s3q0.a;
            case 2:
                ner0 ner0Var = (ner0) this.d;
                com.vk.billing.h hVar = (com.vk.billing.h) this.e;
                Purchase purchase = (Purchase) obj;
                boolean z4 = this.c;
                try {
                } catch (Exception e) {
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.w(l, L.LogType.e, e, new Object[]{"Billing : PurchasesManager", "Error during restore inapp #processRestore"}, null, null, 24);
                    }
                    if (z4) {
                        cvk.u(R.string.error_purchasing, false);
                    }
                    com.vk.metrics.eventtracking.b.a.a(e);
                    z1u0.a(ner0Var);
                } finally {
                }
                if (purchase == null) {
                    if (z4) {
                        z1u0.a(ner0Var);
                    }
                    return s3q0.a;
                }
                hVar.i = "inapp";
                L l2 = L.a;
                l2.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l2, L.LogType.d, new Object[]{"Billing : PurchasesManager", "processRestore: lastData:" + purchase + " with product " + hVar.i});
                }
                String developerPayload = purchase.getDeveloperPayload();
                if (developerPayload.length() == 0) {
                    AccountIdentifiers accountIdentifiers = purchase.getAccountIdentifiers();
                    if (accountIdentifiers == null || (developerPayload = accountIdentifiers.getObfuscatedAccountId()) == null) {
                        developerPayload = "";
                    }
                    z = true;
                } else {
                    z = false;
                }
                String[] strArr = (String[]) new Regex(StringUtils.COMMA).j(0, developerPayload).toArray(new String[0]);
                if (strArr.length < 3) {
                    throw new IllegalStateException("Invalid id: ".concat(developerPayload).toString());
                }
                SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem = new SchemeStat$TypeDevNullItem(DevNullEventKey.BILLING_PURCHASE_RESTORATION.h(), null, String.valueOf(z), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -6, 3, null);
                l5m l5mVar = new l5m(null, null, 3);
                l5mVar.g = schemeStat$TypeDevNullItem;
                l5mVar.q();
                hVar.j(new AtomicInteger(1), Integer.parseInt(strArr[2]), purchase, ner0Var, z4);
                return s3q0.a;
            case 3:
                g2s0.a aVar2 = (g2s0.a) this.d;
                ImageList imageList = (ImageList) this.e;
                VKEnhancedImageView vKEnhancedImageView = aVar2.l;
                InteractiveDurationView interactiveDurationView = aVar2.n;
                TextView textView = aVar2.m;
                vKEnhancedImageView.setVisibility(0);
                if (this.c) {
                    f4m.j(textView);
                    interactiveDurationView.setVisibility(0);
                } else {
                    textView.setVisibility(0);
                    f4m.j(interactiveDurationView);
                }
                f4m.j(aVar2.s);
                vKEnhancedImageView.clear();
                vKEnhancedImageView.setPlaceholder(aVar2.u);
                vKEnhancedImageView.setEmptyPlaceholder(aVar2.v);
                vKEnhancedImageView.setRemoteImage(imageList);
                return s3q0.a;
            default:
                dwj dwjVar = (dwj) obj;
                return dwjVar.m(myc0.h(dwjVar.getScope(), null, null, new pps0((VideoFile) this.d, (qps0) this.e, this.c, null), 3));
        }
    }

    public /* synthetic */ am6(Object obj, boolean z, Object obj2, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
        this.e = obj2;
    }

    public /* synthetic */ am6(boolean z, Object obj, Object obj2, int i) {
        this.b = i;
        this.c = z;
        this.d = obj;
        this.e = obj2;
    }
}
