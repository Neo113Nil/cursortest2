package xsna;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingOptionsItemDto;
import com.vk.auth.validation.internal.PhoneValidationContract$ValidationDialogMetaInfo;
import com.vk.catalog2.feature.music.holders.playlist.MusicPlaylistVkTileVh;
import com.vk.clips.design.view.component.button.ClipActionButton;
import com.vk.core.files.ExternalDirType;
import com.vk.core.files.a;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.GroupMarketInfo;
import com.vk.dto.music.Playlist;
import com.vk.dto.photo.Photo;
import com.vk.dto.polls.Poll;
import com.vk.feed.blacklist.impl.presentation.blacklist.BlacklistFragment;
import com.vk.feed.blacklist.impl.presentation.blacklist.a;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.design.view.download.DownloadingView;
import com.vk.newsfeed.posting.impl.presentation.model.DonutLevel;
import com.vk.photo.editor.features.markup.draw.model.stat.DrawStatEvent;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import com.vk.stat.scheme.CommonEcommStat$TypeAvitoIntegrationBadgeViewItem;
import com.vk.stat.scheme.CommonEcommStat$TypeAvitoIntegrationViewItem;
import com.vk.stat.scheme.CommonEcommStat$TypeEcommViewItem;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$GraffityEvent;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$PhotoParams;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.voip.OKVoipEngine;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Regex;
import one.video.player.OneVideoPlayer;
import org.json.JSONObject;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.b9a0;
import xsna.hzp0;
import xsna.nw;
import xsna.o9t;
import xsna.oe30;
import xsna.q7t;
import xsna.xu;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class pw implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pw(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        xdw0 xdw0Var;
        int i = 5;
        switch (this.b) {
            case 0:
                ((izs) this.c).invoke(new nw.e(((xu.a) this.d).b));
                return s3q0.a;
            case 1:
                com.vk.feed.blacklist.impl.presentation.blacklist.c cVar = (com.vk.feed.blacklist.impl.presentation.blacklist.c) this.c;
                ge7 ge7Var = (ge7) this.d;
                t34 t34Var = cVar.o;
                if (t34Var != null) {
                    a.d dVar = new a.d(ge7Var.a);
                    BlacklistFragment blacklistFragment = (BlacklistFragment) t34Var.c;
                    int i2 = BlacklistFragment.V;
                    blacklistFragment.getFeature().C(dVar);
                }
                return s3q0.a;
            case 2:
                v19 v19Var = (v19) this.c;
                com.vk.movika.sdk.base.model.e eVar = (com.vk.movika.sdk.base.model.e) this.d;
                com.vk.contacts.d.a.I0(true);
                io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new t19());
                asu0 asu0Var = asu0.a;
                v19Var.c.b(io.reactivex.rxjava3.kotlin.c.e(vVar.q(asu0Var.c()).m(asu0Var.d()), new u19(L.a, 0), new r9(eVar, 11)));
                return s3q0.a;
            case 3:
                c0a c0aVar = (c0a) this.c;
                Context context = (Context) this.d;
                List<VideoUrl> list = zhr0.a;
                fbr0 fbr0Var = new fbr0(context, (gzs) c0aVar.b);
                fbr0Var.d();
                c0aVar.c = fbr0Var;
                return s3q0.a;
            case 4:
                g1d g1dVar = (g1d) this.c;
                x6d x6dVar = (x6d) this.d;
                ClipActionButton clipActionButton = new ClipActionButton(g1dVar.l.getContext());
                jjc.g(clipActionButton, new l00(x6dVar, 19));
                return clipActionButton;
            case 5:
                ndr0 ndr0Var = (ndr0) this.c;
                CommunityAddressesFragment communityAddressesFragment = (CommunityAddressesFragment) this.d;
                ndr0Var.m(true);
                vqg vqgVar = communityAddressesFragment.A0;
                (vqgVar != null ? vqgVar : null).b();
                return s3q0.a;
            case 6:
                ExtendedCommunityProfile extendedCommunityProfile = (ExtendedCommunityProfile) this.c;
                GroupMarketInfo.MarketAvitoBadge marketAvitoBadge = (GroupMarketInfo.MarketAvitoBadge) this.d;
                UserId userId = extendedCommunityProfile.a.c;
                GroupMarketInfo.MarketAvitoBadge.Status status = marketAvitoBadge.d;
                Integer valueOf = status != null ? Integer.valueOf(status.h()) : null;
                new hzp0.q(new SchemeStat$EventItem(SchemeStat$EventItem.Type.GROUP, null, null, null, null, null, 62, null), new CommonEcommStat$TypeEcommViewItem(CommonEcommStat$TypeEcommViewItem.Type.TYPE_AVITO_INTEGRATION_VIEW, new CommonEcommStat$TypeAvitoIntegrationViewItem(CommonEcommStat$TypeAvitoIntegrationViewItem.Type.TYPE_AVITO_INTEGRATION_BADGE_VIEW, userId != null ? fkq0.a(userId).b : UserId.d.b, new CommonEcommStat$TypeAvitoIntegrationBadgeViewItem((valueOf != null && valueOf.intValue() == 0) ? CommonEcommStat$TypeAvitoIntegrationBadgeViewItem.EventType.ACTIVE : (valueOf != null && valueOf.intValue() == 1) ? CommonEcommStat$TypeAvitoIntegrationBadgeViewItem.EventType.BROKEN : (valueOf != null && valueOf.intValue() == 2) ? CommonEcommStat$TypeAvitoIntegrationBadgeViewItem.EventType.PENDING : CommonEcommStat$TypeAvitoIntegrationBadgeViewItem.EventType.BROKEN, null, null), null, 8, null), null, 4, null)).a();
                return s3q0.a;
            case 7:
                com.vk.im.ui.components.contacts.a aVar = (com.vk.im.ui.components.contacts.a) this.c;
                CharSequence charSequence = (CharSequence) this.d;
                Peer peer = aVar.E;
                int i3 = aVar.t;
                aVar.I0(io.reactivex.rxjava3.kotlin.c.h(aVar.i.C("ContactsListComponent", new a9j(i3, i3 == 3 ? 50 : 10, peer, cqm0.m(charSequence.toString()))).q(asu0.a.c()), null, new rmg(aVar, i), 1));
                return s3q0.a;
            case 8:
                ((izs) this.c).invoke((DonutLevel) this.d);
                return s3q0.a;
            case 9:
                return b7q.j((b7q) this.c, (defpackage.e0) this.d);
            case 10:
                fpr fprVar = (fpr) this.c;
                return new apr(fprVar.b, fprVar.c, (ndc0) this.d, fprVar.d);
            case 11:
                one.video.player.j jVar = (one.video.player.j) this.c;
                OneVideoPlayer oneVideoPlayer = (OneVideoPlayer) this.d;
                Iterator<OneVideoPlayer.c> it = jVar.b.iterator();
                while (it.hasNext()) {
                    it.next().s(oneVideoPlayer);
                }
                return s3q0.a;
            case 12:
                ((cgt) this.c).d.invoke(new q7t.b(((r7t) this.d).i));
                return s3q0.a;
            case 13:
                View view = (View) this.c;
                llu lluVar = (llu) this.d;
                lluVar.e(view.getContext(), lluVar.i, lluVar.j, lluVar.g, lluVar.h);
                return s3q0.a;
            case 14:
                ((w6x) this.c).e.u(((u6x) this.d).d);
                return s3q0.a;
            case 15:
                g48 g48Var = (g48) this.d;
                izs izsVar = (izs) this.c;
                if (g48Var.a.b) {
                    izsVar.invoke(sqx.b);
                } else {
                    izsVar.invoke(uqx.b);
                }
                return s3q0.a;
            case 16:
                ((z520) this.c).b.t((Photo) this.d);
                return s3q0.a;
            case 17:
                ((izs) this.c).invoke(new oe30.a(((se30) this.d).b));
                return s3q0.a;
            case 18:
                ((sc60) this.c).a.notifyItemRangeInserted(0, ((List) this.d).size());
                return s3q0.a;
            case 19:
                io70 io70Var = (io70) this.c;
                String str = (String) this.d;
                dhw0 dhw0Var = OKVoipEngine.B;
                if (dhw0Var == null || (xdw0Var = dhw0Var.A) == null) {
                    return s3q0.a;
                }
                L.A("OKVoipCallInfoManager", tdj.a(new StringBuilder("anonym secret hash updated oldValue = "), xdw0Var.g, " newValue = ", str));
                io70Var.b.invoke(dhw0.a(dhw0Var, null, 0L, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, xdw0.a(xdw0Var, null, str, 191), null, false, false, 0, null, false, false, false, false, null, null, -67108865, ApiInvocationException.ErrorCodes.IDS_BLOCKED));
                return s3q0.a;
            case 20:
                ((izs) this.c).invoke((NotificationsNotificationSettingOptionsItemDto) this.d);
                return s3q0.a;
            case 21:
                wzs wzsVar = (wzs) this.c;
                com.vk.ecomm.orders.impl.common.ui.model.a aVar2 = (com.vk.ecomm.orders.impl.common.ui.model.a) this.d;
                wzsVar.invoke(aVar2.b, aVar2.c);
                return s3q0.a;
            case 22:
                ((k4a0) this.c).c.d((PhoneValidationContract$ValidationDialogMetaInfo) this.d);
                return s3q0.a;
            case 23:
                o6a0 o6a0Var = (o6a0) this.c;
                DrawStatEvent.d dVar2 = (DrawStatEvent.d) this.d;
                MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem.MediaType c = o6a0Var.c();
                String a = o6a0Var.b.a();
                MobileOfficialAppsCorePhotoEditorStat$GraffityEvent mobileOfficialAppsCorePhotoEditorStat$GraffityEvent = MobileOfficialAppsCorePhotoEditorStat$GraffityEvent.SAVE_GRAFFITY;
                Boolean valueOf2 = Boolean.valueOf(!dVar2.a.isEmpty());
                ArrayList arrayList = dVar2.a;
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(pio.a((DrawStatEvent.b) it2.next()));
                }
                return new MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem(c, a, null, null, null, null, null, null, null, null, mobileOfficialAppsCorePhotoEditorStat$GraffityEvent, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, new MobileOfficialAppsCorePhotoEditorStat$PhotoParams(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, valueOf2, arrayList2, null, null, null, null, null, 2097151999, null), 31736, 0 == true ? 1 : 0);
            case 24:
                ((com.vk.photos.root.photoflow.presentation.b) this.c).h.b(new b9a0.d.a((List) this.d));
                return s3q0.a;
            case 25:
                t8b0 t8b0Var = (t8b0) this.c;
                MusicPlaylistVkTileVh.b bVar = (MusicPlaylistVkTileVh.b) this.d;
                DownloadingView downloadingView = new DownloadingView(t8b0Var.a.getContext(), null, 6);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(cn70.b(16), cn70.b(16));
                layoutParams.setMarginEnd(cn70.b(4));
                downloadingView.setLayoutParams(layoutParams);
                abg0 abg0Var = dhr0.t;
                downloadingView.setTint(abg0Var.c(R.attr.vk_ui_track_buffer));
                downloadingView.setDownloadingTint(abg0Var.c(R.attr.vk_ui_track_buffer));
                downloadingView.setDownloadedIcon(R.drawable.vk_icon_arrow_down_circle_16);
                downloadingView.b = false;
                downloadingView.setOnClickListener(new a11(bVar, i));
                downloadingView.setVisibility(8);
                return downloadingView;
            case 26:
                ubb0 ubb0Var = (ubb0) this.c;
                UserId userId2 = (UserId) this.d;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", efz.b(userId2.b, " query playlists", new StringBuilder("uid="))});
                }
                List<uab0> i4 = ubb0Var.c.i(String.valueOf(userId2.b));
                ArrayList arrayList3 = new ArrayList(c5g.u(i4, 10));
                for (uab0 uab0Var : i4) {
                    Playlist playlist = new Playlist(new JSONObject(uab0Var.e));
                    playlist.H = uab0Var.d;
                    arrayList3.add(playlist);
                }
                return arrayList3;
            case 27:
                b7d0 b7d0Var = (b7d0) this.c;
                mkl mklVar = (mkl) this.d;
                ine0 ine0Var = b7d0Var.F;
                Context context2 = b7d0Var.itemView.getContext();
                ine0Var.getClass();
                bpn0 bpn0Var = csb0.a;
                Poll poll = (Poll) mklVar.b;
                ((ClipboardManager) context2.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(context2.getString(R.string.poll_link), csb0.a(poll.b, poll.c, poll.j)));
                cvk.u(R.string.poll_link_copied, false);
                return s3q0.a;
            case 28:
                ((izs) this.c).invoke(new o9t.m(x7t.a((w7t) this.d)));
                return s3q0.a;
            default:
                ImageView imageView = (ImageView) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                Regex regex = com.vk.core.files.a.a;
                String str2 = com.vk.core.files.a.w() + ".".concat("png");
                seq seqVar = com.vk.core.files.a.b;
                Context context3 = e43.a;
                ExternalDirType externalDirType = ExternalDirType.IMAGES;
                seqVar.getClass();
                Uri c2 = seq.c(context3, str2, externalDirType);
                OutputStream c3 = a.c.c(imageView.getContext(), c2);
                if (c3 == null) {
                    throw new NullPointerException(io.reactivex.rxjava3.subjects.c.c("Uri outputstream is null ", c2, '!'));
                }
                com.vk.core.files.a.H(bitmap, c3);
                return c2;
        }
    }

    public /* synthetic */ pw(g48 g48Var, izs izsVar) {
        this.b = 15;
        this.d = g48Var;
        this.c = izsVar;
    }
}
