package xsna;

import android.app.Notification;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.auth.modal.qrwithcode.QrWithCodeAuthModal;
import com.vk.auth.validation.VkPhoneValidationErrorReason;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarSearchQueryVh;
import com.vk.catalog2.feature.music.ui.holder.MusicCatalogRootVh;
import com.vk.catalog2.feature.search.holders.SearchSpellcheckVh;
import com.vk.common.links.LaunchContext;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.ecomm.reviews.ui.reviewheader.ReviewHeaderView;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;
import com.vk.music.playlist.ModernPlaylistModel;
import com.vk.newsfeed.posting.impl.domain.model.ImageCropArea;
import com.vk.reefton.ReefEvent;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.search.fragment.RestoreSearchFragment;
import com.vk.sharing.core.view.k;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.superapp.api.internal.requests.qr.ProcessAuthCode$Companion$Action;
import com.vk.video.ui.upload.impl.settings.presentation.fragment.SettingsFragment;
import com.vk.video.ui.upload.impl.settings.presentation.fragment.SettingsFragmentInternalComponent;
import com.vkontakte.android.R;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.opentelemetry.api.trace.SpanKind;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.ala0;
import xsna.ay40;
import xsna.b230;
import xsna.bhg0;
import xsna.ee80;
import xsna.gp20;
import xsna.hic0;
import xsna.iv20;
import xsna.tj50;
import xsna.u1a0;
import xsna.yx40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class wq20 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wq20(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x0382, code lost:
    
        if (xsna.epx.f(r1, r2 != null ? r2.b : null) != false) goto L133;
     */
    /* JADX WARN: Type inference failed for: r2v58, types: [com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder, xsna.n0i0] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = 8;
        int i3 = 12;
        boolean z = true;
        int i4 = 0;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                yq20 yq20Var = (yq20) obj2;
                gp20.a aVar = (gp20.a) obj;
                ApiApplication apiApplication = aVar.a.f;
                sq20 sq20Var = yq20Var.K;
                List<gp20> currentList = sq20Var.getCurrentList();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : currentList) {
                    gp20 gp20Var = (gp20) obj3;
                    if (gp20Var instanceof gp20.a) {
                        ApiApplication apiApplication2 = ((gp20.a) gp20Var).a.f;
                        if (!epx.f(apiApplication2 != null ? apiApplication2.b : null, apiApplication != null ? apiApplication.b : null)) {
                            arrayList.add(obj3);
                        }
                    }
                    if (gp20Var instanceof gp20.b) {
                        arrayList.add(obj3);
                    }
                }
                r4 = (arrayList.size() == 1 && (j5g.b0(0, arrayList) instanceof gp20.b)) ? 1 : 0;
                if (arrayList.isEmpty() || r4 != 0) {
                    nbf0 nbf0Var = yq20Var.G;
                    if (nbf0Var != null) {
                        nbf0Var.c = new cta(yq20Var, arrayList, aVar, 2);
                    }
                    sq20Var.notifyItemRemoved(0);
                } else {
                    sq20Var.submitList(arrayList);
                    yq20.b7(apiApplication);
                }
                return s3q0.a;
            case 1:
                return new b230.a(((tj50.a) obj).a(new q130((r130) obj2, i4), ao8.d));
            case 2:
                ModernPlaylistModel.M((ModernPlaylistModel) obj2, null, (List) obj, 1);
                return s3q0.a;
            case 3:
                rx30 rx30Var = (rx30) obj2;
                int i5 = iur0.y;
                return new iur0(rx30Var.i.inflate(R.layout.vkim_msg_search_msg, (ViewGroup) obj, false), rx30Var.h);
            case 4:
                MusicCatalogRootVh musicCatalogRootVh = (MusicCatalogRootVh) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    VkTopBarSearchQueryVh vkTopBarSearchQueryVh = musicCatalogRootVh.C;
                    l7v b = pla.e().b();
                    VkTopBar vkTopBar = vkTopBarSearchQueryVh.l;
                    if (vkTopBar != null) {
                        vkTopBar.getGlobalVisibleRect(new Rect());
                        h7v.d(b, vkTopBar, "audio:following_updates", new cbt0(vkTopBar, 7), new hfm0(b, 22), 16);
                    }
                    musicCatalogRootVh.Q.dispose();
                }
                return s3q0.a;
            case 5:
                fr40 fr40Var = (fr40) obj2;
                ee80 ee80Var = (ee80) obj;
                int i6 = fr40.j1;
                if (ee80Var instanceof ee80.a) {
                    fr40Var.hide();
                } else {
                    if (!(ee80Var instanceof ee80.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Uri.Builder buildUpon = Uri.parse(((ee80.b) ee80Var).a).buildUpon();
                    Bundle arguments = fr40Var.getArguments();
                    maz.c(xwk.d().e(), fr40Var.requireContext(), buildUpon.appendQueryParameter(CommonUrlParts.REQUEST_ID, arguments != null ? arguments.getString("KEY_REQUEST_ID") : null).build().toString(), LaunchContext.A, null, null, 24);
                    fr40Var.hide();
                }
                return s3q0.a;
            case 6:
                ay40.a aVar2 = (ay40.a) obj2;
                Pair pair = (Pair) obj;
                Bitmap bitmap = (Bitmap) pair.d();
                Throwable th = (Throwable) pair.g();
                NotificationCompat.h hVar = aVar2.b;
                if (bitmap != null) {
                    aVar2.c.invoke(hVar, bitmap);
                }
                Notification c = hVar.c();
                aVar2.d.invoke(c);
                return new yx40.a(c, th);
            case 7:
                Playlist playlist = (Playlist) obj;
                ((com.vk.music.playlist.display.data.a) obj2).getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (MusicTrack musicTrack : playlist.y) {
                    int i7 = musicTrack.A;
                    if (i7 != -1 && !linkedHashMap.containsKey(String.valueOf(i7))) {
                        linkedHashMap.put(String.valueOf(musicTrack.A), musicTrack.Fb());
                    }
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    linkedHashMap2.put(entry.getValue(), entry.getKey());
                }
                return new hqz(Playlist.zb(playlist, null, null, EmptyList.b, null, -8388609, 255), playlist.y, linkedHashMap2);
            case 8:
                return w060.b0((bi20) obj2, (MusicTrack) obj, null, 12);
            case 9:
                io.reactivex.rxjava3.core.w wVar = (io.reactivex.rxjava3.core.w) obj2;
                ce60 ce60Var = ce60.b;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ce60Var.getClass();
                return ce60.h(0, wVar, booleanValue).L(new pb(new q130(wVar, i2), 27), false);
            case 10:
                cp70 cp70Var = (cp70) obj2;
                Throwable th2 = (Throwable) obj;
                inr0 inr0Var = cp70Var.E;
                inr0Var.getClass();
                com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
                inr0Var.d(new u0d(bVar, 5));
                if (th2 instanceof VKApiExecutionException) {
                    VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th2;
                    if (f35.b(vKApiExecutionException)) {
                        inr0Var.d(new tr9(bVar));
                    } else if (f35.c(vKApiExecutionException)) {
                        inr0Var.d(new e27(bVar, 3));
                    }
                }
                cp70Var.e.getClass();
                return s3q0.a;
            case 11:
                a880 a880Var = (a880) obj2;
                pyp0 pyp0Var = (pyp0) obj;
                a880Var.getClass();
                if (pyp0Var instanceof a880) {
                    a880 a880Var2 = (a880) pyp0Var;
                    b880 b880Var = a880Var2.j;
                    Integer valueOf = b880Var != null ? Integer.valueOf(b880Var.c) : null;
                    b880 b880Var2 = a880Var.j;
                    if (epx.f(valueOf, b880Var2 != null ? Integer.valueOf(b880Var2.c) : null)) {
                        b880 b880Var3 = a880Var2.j;
                        UserId userId = b880Var3 != null ? b880Var3.b : null;
                        b880 b880Var4 = a880Var.j;
                        break;
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 12:
                okhttp3.p pVar = (okhttp3.p) obj2;
                phk0 phk0Var = (phk0) obj;
                phk0Var.setAttribute("http.method", pVar.b);
                okhttp3.l lVar = pVar.a;
                phk0Var.setAttribute("url.full", lVar.i);
                phk0Var.setAttribute("server.address", lVar.d);
                phk0Var.d(SpanKind.CLIENT);
                return s3q0.a;
            case 13:
                int i8 = u1a0.A1;
                ((u1a0) obj2).Yn(u1a0.b.PROGRESS);
                return s3q0.a;
            case 14:
                ((x3a0) obj2).B.invoke(VkPhoneValidationErrorReason.API);
                return s3q0.a;
            case 15:
                return Boolean.valueOf(agc0.a(((hic0.c) obj2).b, (ImageCropArea) obj));
            case 16:
                ala0 ala0Var = (ala0) obj2;
                ((zak0) ala0Var.o).setValue((ala0.c) ala0Var.h.get((String) obj));
                return s3q0.a;
            case 17:
                StringBuilder sb = (StringBuilder) obj2;
                j7c0 j7c0Var = (j7c0) obj;
                ChannelMsgSendConfig channelMsgSendConfig = j7c0Var.a;
                Boolean p = channelMsgSendConfig.p();
                if (p != null) {
                    sb.append("is_ad=" + p.booleanValue());
                }
                String str = j7c0Var.c;
                if (str != null) {
                    sb.append("&ord_pred_id=".concat(str));
                }
                String j = channelMsgSendConfig.j();
                if (j != null) {
                    sb.append("&erid=".concat(j));
                }
                return s3q0.a;
            case 18:
                iui iuiVar = (iui) obj;
                iuiVar.a = new com.vk.movika.tools.controls.seekbar.p(iuiVar.a(new etc0(((ftc0) obj2).d, new rr60())), i2);
                return s3q0.a;
            case 19:
                z9d0 z9d0Var = (z9d0) obj2;
                return new u6d0(z9d0Var.i, z9d0Var.j, z9d0Var.k, z9d0Var.l, (ViewGroup) obj);
            case 20:
                QrWithCodeAuthModal qrWithCodeAuthModal = (QrWithCodeAuthModal) obj2;
                com.vk.auth.modal.qrwithcode.a aVar3 = qrWithCodeAuthModal.g;
                if (aVar3 == null) {
                    aVar3 = null;
                }
                UserId userId2 = qrWithCodeAuthModal.G;
                QrWithCodeAuthModal qrWithCodeAuthModal2 = aVar3.h;
                if (aVar3.n == null) {
                    com.vk.registration.funnels.b bVar2 = com.vk.registration.funnels.b.a;
                    iv20.b bVar3 = aVar3.d;
                    if (bVar3 == null) {
                        bVar3 = null;
                    }
                    String str2 = bVar3.f;
                    SchemeStatSak$EventScreen u5 = qrWithCodeAuthModal2.u5();
                    bVar2.getClass();
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(com.vk.registration.funnels.b.d(SchemeStatSak$RegistrationFieldItem.Name.QR_CODE_ID, str2));
                    RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                    frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.QR_CODE_CANCEL_TAP, arrayList2, null, u5, null, null, null, 244);
                    io.reactivex.rxjava3.disposables.c cVar = aVar3.m;
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    aVar3.m = null;
                    qrWithCodeAuthModal2.f(true);
                    ProcessAuthCode$Companion$Action processAuthCode$Companion$Action = ProcessAuthCode$Companion$Action.DENY;
                    iv20.b bVar4 = aVar3.d;
                    kgd0 kgd0Var = new kgd0(processAuthCode$Companion$Action, (bVar4 != null ? bVar4 : null).e, true ^ (bVar4 != null ? bVar4 : null).j);
                    kgd0Var.p = userId2;
                    aVar3.n = rdx0.u(kgd0Var).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new wnt(new n3b0(aVar3, 6), 25), new c120(new zb60(aVar3, 16), 21));
                }
                return s3q0.a;
            case 21:
                com.vk.reefton.trackers.h hVar2 = (com.vk.reefton.trackers.h) obj2;
                ReefEvent reefEvent = (ReefEvent) obj;
                if (reefEvent instanceof ReefEvent.x) {
                    if (!epx.f(null, ((ReefEvent.x) reefEvent).c)) {
                        com.vk.reefton.trackers.h.m = TrafficStats.getUidRxBytes(hVar2.e.b.i());
                        hVar2.j = k560.a(hVar2.j, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 33529855);
                    }
                } else if (reefEvent instanceof ReefEvent.f) {
                    long j2 = ((ReefEvent.f) reefEvent).b;
                    Long l = hVar2.j.n;
                    long longValue = l != null ? l.longValue() : 0L;
                    Long l2 = hVar2.j.o;
                    hVar2.j = k560.a(hVar2.j, null, null, null, null, null, null, false, null, null, null, null, null, null, Long.valueOf(longValue + j2), Long.valueOf((l2 != null ? l2.longValue() : 0L) + j2), null, null, null, null, null, null, null, null, null, false, 33529855);
                }
                return s3q0.a;
            case 22:
                k1g0 k1g0Var = (k1g0) obj2;
                s1q s1qVar = k1g0Var.b;
                List<ol60> c2 = pn60.c(k1g0Var.c, (Post) obj, null, null, 14);
                for (ol60 ol60Var : c2) {
                    if (ol60Var instanceof z1c0) {
                        u1c0 u1c0Var = ((z1c0) ol60Var).h;
                        if (u1c0Var instanceof iko0) {
                            ((iko0) u1c0Var).s = s1qVar;
                        }
                        ol60 ol60Var2 = u1c0Var.h;
                        if (ol60Var2 instanceof dio0) {
                            u1c0Var.h = dio0.i((dio0) ol60Var2, s1qVar, 0, 0, 16776191);
                        }
                    }
                }
                return c2;
            case 23:
                int i9 = RestoreSearchFragment.h0;
                ((RestoreSearchFragment) obj2).jo();
                return s3q0.a;
            case 24:
                etv0 etv0Var = (etv0) obj;
                eig0<bhg0> eig0Var = ((ReviewHeaderView) obj2).j;
                if (eig0Var != null) {
                    eig0Var.a(bhg0.d.a);
                }
                etv0Var.b(false);
                return s3q0.a;
            case 25:
                return new p6h0((ViewGroup) obj, ((u6h0) obj2).i);
            case 26:
                ((tdu) obj).n(((Number) ((c1h) obj2).x.getValue()).floatValue());
                return s3q0.a;
            case 27:
                o0i0 o0i0Var = (o0i0) obj2;
                SearchSpellcheckVh.a aVar4 = (SearchSpellcheckVh.a) obj;
                if (aVar4 instanceof SearchSpellcheckVh.a.C0525a) {
                    o0i0Var.b.jn(((SearchSpellcheckVh.a.C0525a) aVar4).a, true);
                } else {
                    if (!(aVar4 instanceof SearchSpellcheckVh.a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    o0i0Var.r();
                    o0i0.p(o0i0Var, ((SearchSpellcheckVh.a.b) aVar4).a, null, true, null, 10);
                }
                return s3q0.a;
            case 28:
                qcy<Object>[] qcyVarArr = SettingsFragment.Q;
                SettingsFragmentInternalComponent eo = ((SettingsFragment) obj2).eo();
                eo.getClass();
                return new cn50(up2.d(new y4(20, (gzs) obj, eo), new scb0(eo, r4), new tti(new nq1(eo, i3))));
            default:
                k.a aVar5 = (k.a) obj2;
                if (aVar5 != null) {
                    aVar5.a();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ wq20(w060 w060Var, bi20 bi20Var) {
        this.b = 8;
        this.c = bi20Var;
    }
}
