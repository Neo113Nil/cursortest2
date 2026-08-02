package xsna;

import android.content.Context;
import android.util.Size;
import com.vk.catalog2.feature.music.dto.ui.UIBlockAudioBookPerson;
import com.vk.content.design.view.photo.flow.PhotoFlowSkeletonView;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.audiobook.AudioBookPerson;
import com.vk.dto.podcast.Podcast;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.ui.views.InfoBarView;
import com.vk.mediapicker.impl.presentation.mvi.MediaPickerMviState;
import com.vk.music.podcast.impl.ui.offlinepage.presentation.feature.OfflinePodcastEpisodesMviState;
import com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.domain.PostingAuthorLoadException;
import com.vk.photos.root.presentation.a;
import com.vk.settings.impl.presentation.base.fragment.settings.RedesignNotificationSettingsFragment;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.bex0;
import xsna.c910;
import xsna.gm50;
import xsna.ikv0;
import xsna.isc0;
import xsna.j0e0;
import xsna.m7a0;
import xsna.nn20;
import xsna.nqc0;
import xsna.p1v;
import xsna.phg0;
import xsna.pqc0;
import xsna.qn60;
import xsna.tlz;
import xsna.vzi0;
import xsna.xcc0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class v4w implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v4w(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0261, code lost:
    
        if (r4 == true) goto L75;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        izs<? super InfoBar, s3q0> izsVar;
        boolean equals;
        nqc0 nqc0Var;
        int i = this.b;
        int i2 = 6;
        boolean z = true;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                z4w z4wVar = (z4w) obj2;
                z4wVar.dismiss();
                if (((Boolean) obj).booleanValue()) {
                    ikv0.a aVar = new ikv0.a(z4wVar.getContext());
                    aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_positive), (Size) null, 12);
                    aVar.u = new ikv0.d(z4wVar.getContext().getString(R.string.vkim_contacts_invite_by_phone_number_success_snackbar), (String) null, (ikv0.d.a) null, 6);
                    aVar.n();
                } else {
                    z4wVar.a();
                }
                return s3q0.a;
            case 1:
                InfoBarView infoBarView = (InfoBarView) obj2;
                InfoBar infoBar = infoBarView.z;
                if (infoBar != null && (izsVar = infoBarView.E) != null) {
                    izsVar.invoke(infoBar);
                }
                return s3q0.a;
            case 2:
                ((mbx) obj2).b();
                return s3q0.a;
            case 3:
                bex0.a.a(((y2y) obj2).a, JsApiMethodType.IN_APP_PURCHASE, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
                return s3q0.a;
            case 4:
                ((qlz) obj2).T(new tlz.c((List) obj));
                return s3q0.a;
            case 5:
                f910 f910Var = (f910) obj2;
                c910.b bVar = (c910.b) obj;
                f910Var.p.setVisibility(0);
                ((wak0) f910Var.t).C(1);
                VkSpinner vkSpinner = f910Var.l;
                if (vkSpinner != null) {
                    vkSpinner.setVisibility(8);
                }
                gm50.a.a(f910Var, bVar.a, new l2i(f910Var, 28));
                return s3q0.a;
            case 6:
                return MediaPickerMviState.a((MediaPickerMviState) ((com.vk.mediapicker.impl.presentation.mvi.b) obj2).b.getCurrentState(), 0, null, false, EmptyList.b, null, 47);
            case 7:
                ((zak0) ((nn20.a) obj2).b).setValue((String) obj);
                return s3q0.a;
            case 8:
                r840 r840Var = (r840) obj2;
                ec40 ec40Var = (ec40) r840Var.l;
                if (ec40Var != null && ec40Var.j) {
                    r840Var.n.b(ec40Var);
                }
                return s3q0.a;
            case 9:
                return new UIBlockAudioBookPerson(((bi20) obj2).b(), (AudioBookPerson) obj, null, 4, null);
            case 10:
                iui iuiVar = (iui) obj;
                iuiVar.a = new com.vk.movika.tools.controls.seekbar.k(iuiVar.a(new pg60(((wg60) obj2).e, new rr60())), i2);
                return s3q0.a;
            case 11:
                p1v p1vVar = (p1v) obj;
                return p1vVar instanceof p1v.a ? ((io.reactivex.rxjava3.core.x) obj2).w() : p1vVar instanceof p1v.c ? io.reactivex.rxjava3.core.q.T(((p1v.c) p1vVar).a) : io.reactivex.rxjava3.internal.operators.observable.l1.b;
            case 12:
                lu60 lu60Var = (lu60) obj2;
                qn60.c cVar = (qn60.c) obj;
                return new j170(cVar.a, cVar.b, lu60Var.a(), lu60Var.b(), false, false);
            case 13:
                ((qe70) obj2).o.b(vzi0.a.a);
                return s3q0.a;
            case 14:
                ib50 ib50Var = (ib50) obj2;
                OfflinePodcastEpisodesMviState offlinePodcastEpisodesMviState = (OfflinePodcastEpisodesMviState) obj;
                String Fb = ib50Var.a.Fb();
                DownloadingState downloadingState = ib50Var.a.J;
                DownloadingState downloadingState2 = offlinePodcastEpisodesMviState.o().get(Fb);
                if (downloadingState2 != null) {
                    if (!(downloadingState2 instanceof DownloadingState.Downloading) || !(downloadingState instanceof DownloadingState.Downloading)) {
                        equals = downloadingState2.getClass().equals(downloadingState.getClass());
                        break;
                    } else if (Math.abs(((DownloadingState.Downloading) downloadingState2).b - ((DownloadingState.Downloading) downloadingState).b) >= 0.02d) {
                        equals = false;
                        break;
                    } else {
                        equals = true;
                        break;
                    }
                }
                z = false;
                return z ? offlinePodcastEpisodesMviState : offlinePodcastEpisodesMviState.j(pn00.o(offlinePodcastEpisodesMviState.o(), new Pair(Fb, downloadingState)));
            case 15:
                com.vk.photos.root.photoflow.presentation.j jVar = (com.vk.photos.root.photoflow.presentation.j) obj2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                PhotoFlowSkeletonView photoFlowSkeletonView = jVar.h;
                ShimmerFrameLayout shimmerFrameLayout = photoFlowSkeletonView.b;
                bwt0.p0(photoFlowSkeletonView, booleanValue);
                if (booleanValue) {
                    shimmerFrameLayout.c();
                } else {
                    shimmerFrameLayout.a();
                }
                bwt0.p0(jVar.i, !booleanValue);
                return s3q0.a;
            case 16:
                ((com.vk.photos.root.presentation.b) obj2).C(new a.j(((m7a0.f) obj).a));
                return s3q0.a;
            case 17:
                Podcast podcast = (Podcast) obj2;
                w9y w9yVar = (w9y) obj;
                w9yVar.c(Integer.valueOf(podcast.b), "id");
                w9yVar.d(Long.valueOf(podcast.c.b), "owner_id");
                w9yVar.e(podcast.d, "podcast_title");
                w9yVar.c(Integer.valueOf(podcast.e), "playlist_id");
                w9yVar.e(podcast.f, "thumbs");
                w9yVar.g(SignalingProtocol.KEY_PERMISSIONS, podcast.g);
                w9yVar.b(Boolean.valueOf(podcast.h), "subtitle_badge");
                w9yVar.e(podcast.i, "subtitle");
                w9yVar.b(Boolean.valueOf(podcast.k), "can_subscribe");
                w9yVar.b(Boolean.valueOf(podcast.l), "is_subscribed");
                w9yVar.e(podcast.m, "track_code");
                w9yVar.b(Boolean.valueOf(podcast.n), "is_explicit");
                w9yVar.e(podcast.j, "group_category");
                return s3q0.a;
            case 18:
                iui iuiVar2 = (iui) obj;
                iuiVar2.a = new wi4(iuiVar2.a(new smf0(((s5c0) obj2).d, new rr60())), iuiVar2.a(new o1c0()), iuiVar2.a(new l5c0()), 2);
                return s3q0.a;
            case 19:
                oqc0 oqc0Var = (oqc0) obj2;
                Throwable th = (Throwable) obj;
                if (th instanceof PostingAuthorLoadException) {
                    xcc0 d = ((PostingAuthorLoadException) th).d();
                    if (epx.f(d, xcc0.b.a)) {
                        nqc0Var = nqc0.b.a;
                    } else if (epx.f(d, xcc0.a.a)) {
                        nqc0Var = nqc0.a.a;
                    } else {
                        if (!(d instanceof xcc0.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        nqc0Var = nqc0.c.a;
                    }
                } else {
                    nqc0Var = nqc0.c.a;
                }
                oqc0Var.T(new pqc0.a(nqc0Var));
                return s3q0.a;
            case 20:
                ((isc0.b) obj2).b.f.a.f(new vxf0());
                return s3q0.a;
            case 21:
                c0e0 c0e0Var = (c0e0) obj2;
                int i3 = c0e0.m1;
                gm50.a.a(c0e0Var, ((j0e0.a) obj).a, new eiz(c0e0Var, 25));
                return s3q0.a;
            case 22:
                ((bye0) obj2).l.a(chg0.a);
                return s3q0.a;
            case 23:
                RedesignNotificationSettingsFragment.a aVar2 = RedesignNotificationSettingsFragment.Y;
                ((RedesignNotificationSettingsFragment) obj2).getFeature().C(new vf70(((Integer) obj).intValue()));
                return s3q0.a;
            case 24:
                x8c x8cVar = (x8c) obj2;
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    ((lq40) x8cVar.b).G((Playlist) it.next(), false);
                }
                return s3q0.a;
            case 25:
                ((ohg0) obj2).T((phg0.c) obj);
                return s3q0.a;
            case 26:
                ((zak0) ((sjg0) obj2).y).setValue((VkCell.Left.Main.Size) obj);
                return s3q0.a;
            case 27:
                huh0.b((Context) obj2);
                return s3q0.a;
            case 28:
                g9i0 g9i0Var = (g9i0) obj2;
                g9i0Var.a.Y0(g9i0Var.c.getItem(((Integer) obj).intValue()).a);
                return s3q0.a;
            default:
                bei0 bei0Var = (bei0) obj2;
                wh50 wh50Var = bei0Var.j;
                xwr xwrVar = (xwr) obj;
                if (!xwrVar.s0() && ((Boolean) ((zak0) wh50Var).getValue()).booleanValue()) {
                    bei0Var.i();
                }
                ((zak0) wh50Var).setValue(Boolean.valueOf(xwrVar.s0()));
                return s3q0.a;
        }
    }

    public /* synthetic */ v4w(huh0 huh0Var, Context context) {
        this.b = 27;
        this.c = context;
    }
}
