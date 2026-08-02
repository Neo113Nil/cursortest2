package xsna;

import android.media.MediaPlayer;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.api.generated.polls.dto.PollsPollExtendedDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.VideoFile;
import com.vk.ecomm.market.api.bus.MarketEventGoodCreated;
import com.vk.log.L;
import com.vk.movika.impl.view.full.extend_seekbar.InteractiveExtendSeekBarView;
import com.vk.movika.tools.controls.seekbar.DefaultSeekBarView;
import com.vk.newsfeed.impl.requests.WallWithCounters;
import com.vk.posting.presentation.video.h;
import com.vk.search.params.impl.presentation.modal.database.mvi.model.SearchDatabaseState;
import com.vk.storycamera.screen.StoryGalleryActivity;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.video.design.view.VideoControlsBarView;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import com.vk.voip.ui.history.past.presentation.base.fragment.VoipPastCallsFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.io.FileDescriptor;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import xsna.brw0;
import xsna.cca0;
import xsna.cvw0;
import xsna.dbe0;
import xsna.g2s0;
import xsna.gm50;
import xsna.oxb0;
import xsna.pnb0;
import xsna.qn60;
import xsna.qr9;
import xsna.uue0;
import xsna.zmw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class fda0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fda0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Long l;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((kca0) obj2).a.getFeature().C(new cca0.g((qba0) obj));
                return s3q0.a;
            case 1:
                ((job0) obj2).a.b(new pnb0.c.j((VKApiExecutionException) obj, 0));
                return s3q0.a;
            case 2:
                ((mxb0) obj2).T(new oxb0.a((nyb0) obj));
                return s3q0.a;
            case 3:
                m1c0 m1c0Var = (m1c0) ((j1c0) obj2).C;
                if (m1c0Var != null) {
                    p870.f().e(151, m1c0Var.h);
                }
                return s3q0.a;
            case 4:
                return PublishState.a((PublishState) obj, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, false, false, false, ((dbe0.b.C2718b) ((dbe0.b) obj2)).b, null, null, null, false, null, null, false, false, null, false, false, null, false, false, false, false, -33554433, 2047);
            case 5:
                ((zak0) ((uue0) obj2).c).setValue((uue0.a) obj);
                return s3q0.a;
            case 6:
                ((sph0) obj2).getClass();
                return ((SearchDatabaseState.a.d) ((SearchDatabaseState) ((mph0) obj)).e).b;
            case 7:
                f3i0 f3i0Var = (f3i0) obj2;
                long longValue = ((Long) obj).longValue();
                DefaultSeekBarView defaultSeekBarView = f3i0Var.k;
                defaultSeekBarView.setCurrent(longValue);
                f3i0Var.f.e(defaultSeekBarView, longValue);
                InteractiveExtendSeekBarView interactiveExtendSeekBarView = f3i0Var.b.N;
                ocx ocxVar = f3i0Var.i;
                long longValue2 = (ocxVar == null || (l = ocxVar.k) == null) ? 0L : l.longValue();
                long a = po10.a(f3i0Var.a.l.e, 0L);
                InteractiveExtendSeekBarView.a aVar = new InteractiveExtendSeekBarView.a(longValue, longValue2, a);
                if (!aVar.equals(interactiveExtendSeekBarView.h) || a == longValue) {
                    interactiveExtendSeekBarView.a(aVar);
                }
                return s3q0.a;
            case 8:
                Throwable th = (Throwable) obj;
                xhj0 xhj0Var = ((uhj0) obj2).k;
                (xhj0Var != null ? xhj0Var : null).d(R.string.action_link_general_error_description);
                L.i(th);
                return s3q0.a;
            case 9:
                ofk0 ofk0Var = (ofk0) obj2;
                MediaPlayer mediaPlayer = ofk0Var.i;
                try {
                    mediaPlayer.setDataSource((FileDescriptor) obj);
                    mediaPlayer.prepareAsync();
                } catch (Exception e) {
                    par0.a.getClass();
                    par0.d(e);
                    ofk0Var.b(new qr9.d(ofk0Var.b));
                }
                return s3q0.a;
            case 10:
                L.g("Can't ban author of question", (Throwable) obj);
                ((sbl0) obj2).b();
                return s3q0.a;
            case 11:
                aml0 aml0Var = (aml0) obj2;
                ay00 ay00Var = (ay00) obj;
                if (aml0Var.c) {
                    LinkedHashMap linkedHashMap = aml0Var.d;
                    if ((ay00Var instanceof iu00) || (ay00Var instanceof gu00) || (ay00Var instanceof hu00) || (ay00Var instanceof ju00) || (ay00Var instanceof ku00) || (ay00Var instanceof fu00)) {
                        if (!linkedHashMap.containsKey("reload_key")) {
                            linkedHashMap.put("update_cart_key", ay00Var);
                        }
                    } else if ((ay00Var instanceof MarketEventGoodCreated) || (ay00Var instanceof iy00) || (ay00Var instanceof cy00) || (ay00Var instanceof dy00)) {
                        linkedHashMap.clear();
                        linkedHashMap.put("reload_key", ay00Var);
                    } else if ((ay00Var instanceof hy00) && !linkedHashMap.containsKey("reload_key")) {
                        linkedHashMap.put("update_bookmarks_key", ay00Var);
                    }
                } else {
                    aml0Var.a(ay00Var);
                }
                return s3q0.a;
            case 12:
                StoryGalleryActivity storyGalleryActivity = (StoryGalleryActivity) obj2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                WeakReference<View> weakReference = StoryGalleryActivity.F;
                if (!booleanValue) {
                    eqy<bek0> eqyVar = com.vk.toggle.d.a;
                }
                storyGalleryActivity.finish();
                return s3q0.a;
            case 13:
                return fub0.a((fub0) ((zgm0) obj2).c.e.getValue(), (PollsPollExtendedDto) obj);
            case 14:
                yan0 yan0Var = ((com.vk.superapp.ui.a) obj2).D;
                fpx0 fpx0Var = yan0Var.b;
                if (fpx0Var != null) {
                    fpx0Var.a();
                }
                yan0Var.b = null;
                return s3q0.a;
            case 15:
                ((fpq0) obj2).o.b(((ExtendedUserProfile) obj).a.c);
                return s3q0.a;
            case 16:
                ((vrq0) obj2).z.B();
                return s3q0.a;
            case 17:
                ((lsq0) obj2).t();
                return s3q0.a;
            case 18:
                WallWithCounters wallWithCounters = (WallWithCounters) obj2;
                qn60.c cVar = (qn60.c) obj;
                return new hxq0(cVar.a, cVar.b, wallWithCounters, wallWithCounters.i());
            case 19:
                g2s0.a aVar2 = (g2s0.a) obj2;
                io.reactivex.rxjava3.disposables.c cVar2 = (io.reactivex.rxjava3.disposables.c) obj;
                io.reactivex.rxjava3.disposables.c cVar3 = aVar2.t;
                if (cVar3 != null) {
                    cVar3.dispose();
                }
                aVar2.t = cVar2;
                return s3q0.a;
            case 20:
                VideoControlsBarView videoControlsBarView = (VideoControlsBarView) obj2;
                VideoControlsBarView.a aVar3 = videoControlsBarView.b;
                if (aVar3 != null) {
                    aVar3.d();
                }
                VideoFile videoFile = videoControlsBarView.l;
                if (videoFile == null) {
                    return s3q0.a;
                }
                if (!fxc0.B().b0().e(videoFile) && o25.a().b()) {
                    Set<View> set = g6z.a;
                    g6z.c(videoControlsBarView.c, videoControlsBarView.d, videoFile.O9(), true, 48);
                }
                return s3q0.a;
            case 21:
                com.vk.posting.presentation.video.f fVar = (com.vk.posting.presentation.video.f) obj2;
                h.a aVar4 = (h.a) obj;
                gm50.a.a(fVar, aVar4.a, new iyd0(fVar, 18));
                gm50.a.a(fVar, aVar4.b, new b8j0(fVar, 16));
                gm50.a.a(fVar, aVar4.c, new e9i0(fVar, 22));
                return s3q0.a;
            case 22:
                ihu0 ihu0Var = (ihu0) obj2;
                if (((Boolean) obj).booleanValue()) {
                    xc80 xc80Var = ihu0Var.d;
                    fvv0 fvv0Var = ihu0Var.e;
                    xc80Var.s();
                    ihu0Var.b.a(new cck0(ihu0Var, 19));
                    String string = ((ggu0) ihu0Var.h.c).b.getString(fvv0Var.h() ? R.string.vk_apps_games_deleted_game : R.string.vk_apps_app_uninstalled);
                    SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                    (superappUiRouterBridge != null ? superappUiRouterBridge : null).j(string);
                    if (fvv0Var.h()) {
                        ihu0Var.y(false);
                    }
                    i0q0.d(50L, new ic3(ihu0Var, 13));
                }
                return s3q0.a;
            case 23:
                ((izs) obj).invoke((ikv0) obj2);
                return s3q0.a;
            case 24:
                ((yuv0) obj2).b.n(JsApiMethodType.SHOW_INVITE_BOX, com.vk.movika.sdk.android.defaultplayer.interactive.c.b("success", true));
                return s3q0.a;
            case 25:
                Pair pair = (Pair) obj;
                boolean booleanValue2 = ((Boolean) pair.d()).booleanValue();
                String str = (String) pair.g();
                TextView textView = ((mkw0) obj2).c;
                textView.setVisibility(booleanValue2 ? 0 : 8);
                if (booleanValue2) {
                    textView.setText(str);
                }
                return s3q0.a;
            case 26:
                zmw0.a aVar5 = (zmw0.a) obj2;
                izs<mlp, s3q0> izsVar = aVar5.h;
                Handler handler = bnw0.a;
                izsVar.invoke(bnw0.b(aVar5, (List) obj));
                return s3q0.a;
            case 27:
                ((pqw0) obj2).k.b(brw0.a.a);
                L.C("VoipInviteToScheduledCallFeature", (Throwable) obj);
                return s3q0.a;
            case 28:
                VoipPastCallsFragment voipPastCallsFragment = (VoipPastCallsFragment) obj2;
                cvw0.a aVar6 = (cvw0.a) obj;
                VoipPastCallsFragment.b bVar = voipPastCallsFragment.Q;
                sp.g((bVar != null ? bVar : null).b, 1);
                gm50.a.a(voipPastCallsFragment, aVar6.a, new b3m0(voipPastCallsFragment, 25));
                gm50.a.a(voipPastCallsFragment, aVar6.b, new ykt0(voipPastCallsFragment, 10));
                return s3q0.a;
            default:
                return new f0x0((ViewGroup) obj, ((uzw0) obj2).i);
        }
    }
}
