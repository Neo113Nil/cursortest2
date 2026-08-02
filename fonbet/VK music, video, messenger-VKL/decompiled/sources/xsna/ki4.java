package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.vk.billing.StorePurchasesManager;
import com.vk.billing.f;
import com.vk.catalog2.feature.music.holders.audiobook.AudioBookPersonInfoVh;
import com.vk.clips.sdk.shared.api.domain.HashtagParseMode;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.dto.common.AttachmentWithMedia;
import com.vk.dto.common.NotificationImage;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.photo.Photo;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.dto.shortvideo.ClipsChallenge;
import com.vk.dto.shortvideo.ClipsHashtagChallenge;
import com.vk.dto.tags.Tag;
import com.vk.ecomm.market.album.GoodAlbumEditFlowEntity;
import com.vk.ecomm.market.album.MarketEditAlbumGoodsFragment;
import com.vk.im.engine.models.messages.Msg;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.pushes.bridgeimpl.PushBridgeType;
import com.vk.qrcode.d;
import com.vk.unitylevelplay.impl.UnityLevelPlayFeatureImpl;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.text.Regex;
import xsna.e3m;
import xsna.g650;
import xsna.gv30;
import xsna.hl10;
import xsna.xod;
import xsna.z8u0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ki4 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ki4(Activity activity, com.vk.qrcode.c cVar, d.b bVar, cme0 cme0Var) {
        this.b = 6;
        this.c = activity;
        this.d = cVar;
        this.e = bVar;
    }

    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        NotificationImage notificationImage;
        List<String> b;
        m68 m68Var;
        AttachmentWithMedia attachmentWithMedia;
        int i = this.b;
        boolean z = false;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                TextView textView = (TextView) obj3;
                String str2 = (String) obj2;
                TextView textView2 = ((AudioBookPersonInfoVh) obj4).k;
                if (textView2 != null) {
                    f4m.E(textView2, !brm0.w(textView.getLayout().getText().toString(), str2, true));
                }
                return s3q0.a;
            case 1:
                ((izs) obj4).invoke(((mqd) obj3).getUnformattedText());
                dw20 dw20Var = ((iqd) obj2).d;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                return s3q0.a;
            case 2:
                lxf lxfVar = (lxf) obj4;
                Msg msg = (Msg) obj3;
                com.vk.im.engine.models.dialogs.a aVar = (com.vk.im.engine.models.dialogs.a) obj2;
                Peer peer = lxfVar.d;
                w2w w2wVar = lxfVar.c;
                long j = peer.b;
                int i2 = lxfVar.e;
                gv30.a aVar2 = new gv30.a();
                aVar2.a = j;
                aVar2.a();
                aVar2.b();
                aVar2.d = gkx0.d;
                aVar2.d(i2);
                gv30 gv30Var = new gv30(aVar2);
                boolean z2 = lxfVar.f;
                new zd20(gv30Var, new utb(w2wVar.I0(), w2wVar.getExperiments()), false, z2).a(w2wVar);
                if (msg == null) {
                    long j2 = peer.b;
                    gv30.a aVar3 = new gv30.a();
                    aVar3.a = j2;
                    aVar3.a();
                    aVar3.b();
                    aVar3.e = 1;
                    aVar3.d(Integer.MAX_VALUE);
                    new zd20(new gv30(aVar3), new utb(w2wVar.I0(), w2wVar.getExperiments()), false, z2).a(w2wVar);
                } else {
                    new com.vk.im.engine.internal.merge.messages.b(lxfVar.d, msg, false, true, 48).o(w2wVar);
                }
                return (List) new wfm(aVar, null).o(w2wVar);
            case 3:
                mge0 mge0Var = (mge0) obj4;
                Activity activity = (Activity) obj3;
                jx2 jx2Var = new jx2(new wil0(null, null, null, mge0Var.getType(), mge0Var.getId(), (String) obj, mge0Var.n()), new f.a(activity, (StorePurchasesManager.a) obj2, mge0Var));
                jx2Var.g = activity;
                jx2Var.a();
                return s3q0.a;
            case 4:
                GoodAlbumEditFlowEntity goodAlbumEditFlowEntity = (GoodAlbumEditFlowEntity) obj3;
                int i3 = MarketEditAlbumGoodsFragment.c1;
                UserId userId = goodAlbumEditFlowEntity.b;
                int intValue = ((Integer) obj2).intValue();
                List<Long> list = goodAlbumEditFlowEntity.i;
                ((MarketEditAlbumGoodsFragment) obj4).getClass();
                return MarketEditAlbumGoodsFragment.Jo(userId, intValue, list);
            case 5:
                ((j650) obj4).c.invoke(new g650.d.c(((pck0) obj3).b.a, ((nbk0) obj2).b, false, 8));
                return s3q0.a;
            case 6:
                Activity activity2 = (Activity) obj4;
                d.b bVar = (d.b) obj2;
                ClipsHashtagChallenge clipsHashtagChallenge = (ClipsHashtagChallenge) obj;
                com.vk.qrcode.d dVar = com.vk.qrcode.d.b;
                com.vk.qrcode.k kVar = new com.vk.qrcode.k();
                StringBuilder sb = new StringBuilder("#");
                hl10 b2 = ((Regex) laz.C.getValue()).b(((com.vk.qrcode.c) obj3).r());
                sb.append((b2 == null || (b = b2.b()) == null) ? null : (String) ((hl10.a) b).get(1));
                ClipGridParams.OnlyId.Hashtag hashtag = new ClipGridParams.OnlyId.Hashtag(sb.toString());
                ClipsChallenge clipsChallenge = clipsHashtagChallenge != null ? clipsHashtagChallenge.c : null;
                com.vk.movika.sdk.base.ui.k kVar2 = new com.vk.movika.sdk.base.ui.k(20, activity2, hashtag);
                Long l = clipsHashtagChallenge != null ? clipsHashtagChallenge.b : null;
                ibr0 pe = ((ClipsViewerComponent) ((k7m) m7m.f(kVar)).a(fpf0.a(ClipsViewerComponent.class))).pe();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(String.format(enj.h(activity2.getResources(), R.plurals.clips_grid_create_counter, l != null ? l.longValue() : 0L, Long.valueOf(l != null ? l.longValue() : 0L)), Arrays.copyOf(new Object[]{l}, 1)));
                sb2.append(y8g0.e(R.string.clips_grid_videos_with_hashtag));
                String sb3 = sb2.toString();
                Integer valueOf = (clipsChallenge != null ? clipsChallenge.e : null) == null ? Integer.valueOf(R.drawable.img_hashtag_placeholder) : null;
                e3m.a aVar4 = e3m.a;
                Drawable a = m33.a(R.drawable.vk_icon_clip_circle_fill_violet_28, activity2);
                String Cb = (clipsChallenge == null || (notificationImage = clipsChallenge.e) == null) ? null : notificationImage.Cb(e3m.a(R.dimen.modal_bottom_sheet_image_size, activity2));
                if (clipsChallenge == null || (str = clipsChallenge.b) == null) {
                    str = "";
                }
                com.vk.qrcode.d.k(dVar, activity2, bVar, null, Cb, valueOf, null, a, hashtag.b, sb3, xod.a.a(pe, str, HashtagParseMode.DEFAULT, false, 4), 2, null, new Pair(activity2.getString(R.string.clips_open), kVar2), null, null, null, null, null, 2048712);
                return s3q0.a;
            case 7:
                a630.d1(((huh0) obj4).e, (Context) obj3, (MusicTrack) obj2, true);
                return s3q0.a;
            case 8:
                x0o0 x0o0Var = (x0o0) obj4;
                Photo photo = (Photo) obj3;
                gzs gzsVar = (gzs) obj2;
                List<Tag> list2 = (List) obj;
                Photo photo2 = x0o0Var.l;
                if (photo2 != null && photo2.c == photo.c) {
                    d390 d390Var = x0o0Var.k;
                    if (d390Var != null) {
                        d390Var.k(list2, false);
                    }
                    z8u0.d dVar2 = x0o0Var.j;
                    if (dVar2 != null && (attachmentWithMedia = (m68Var = dVar2.a).G) != null) {
                        m68Var.b(attachmentWithMedia, m68Var.H);
                    }
                }
                gzsVar.invoke();
                return s3q0.a;
            case 9:
                UnityLevelPlayFeatureImpl unityLevelPlayFeatureImpl = (UnityLevelPlayFeatureImpl) obj4;
                Activity activity3 = (Activity) obj3;
                f7c f7cVar = (f7c) obj2;
                g2q0 g2q0Var = (g2q0) obj;
                if (g2q0Var == null) {
                    unityLevelPlayFeatureImpl.e(activity3, f7cVar);
                } else {
                    f7cVar.invoke(Integer.valueOf(g2q0Var.a), "UnityLevelPlay. Consent form error: " + g2q0Var.b);
                }
                return s3q0.a;
            case 10:
                return nnq0.D((nnq0) obj4, (uu50) obj3, (ExtendedUserProfile) obj2);
            default:
                rmr0 rmr0Var = (rmr0) obj4;
                Set<String> set = ((krg0) obj3).b;
                qmr0 qmr0Var = (qmr0) obj2;
                if (((Boolean) obj).booleanValue()) {
                    int g = rmr0Var.g();
                    if (set.contains("any")) {
                        z = true;
                    } else if (g == PushBridgeType.GOOGLE.h()) {
                        z = set.contains(AndroidStaticDeviceInfoDataSource.STORE_GOOGLE);
                    } else if (g == PushBridgeType.HUAWEI.h()) {
                        z = set.contains("huawei");
                    } else if (g == PushBridgeType.EMPTY.h()) {
                        z = set.contains("empty");
                    }
                    if (z) {
                        qmr0Var.b = (esg0) qmr0Var.g.getValue();
                        L l2 = L.a;
                        l2.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.LogType logType = L.LogType.w;
                            StringBuilder b3 = ji.b(g, "[Vendor] RuStore override: ", " -> ");
                            rmr0 rmr0Var2 = qmr0Var.b;
                            b3.append((rmr0Var2 != null ? rmr0Var2 : null).g());
                            L.u(l2, logType, new Object[]{b3.toString()});
                        }
                    } else {
                        L l3 = L.a;
                        l3.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l3, L.LogType.w, new Object[]{"[Vendor] RuStore available, not overriding engine=" + g + ", mode=" + set});
                        }
                    }
                } else {
                    L l4 = L.a;
                    l4.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l4, L.LogType.w, new Object[]{"[Vendor] RuStore unavailable, keeping vendor: " + rmr0Var.g()});
                    }
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ ki4(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
