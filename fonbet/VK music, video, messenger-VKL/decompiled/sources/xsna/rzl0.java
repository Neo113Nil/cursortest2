package xsna;

import android.content.Context;
import android.util.TypedValue;
import androidx.lifecycle.Lifecycle;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.catalog2.common.ui.holders.search.FilterParameters;
import com.vk.catalog2.common.ui.holders.search.SearchFilterVh;
import com.vk.catalog2.common.ui.mvp.holder.clip.VideoCatalogSearchRootVh;
import com.vk.catalog2.common.ui.mvp.holder.header.ToolbarVh;
import com.vk.catalog2.common.ui.mvp.holder.header.VkSearchViewVh;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.StoryMusicInfo;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.im.engine.models.attaches.AttachWall;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.im.engine.models.reporters.DialogsFilterChangeSource;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import com.vk.search.model.VideoSearchFiltersImpl;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stickers.api.styles.MusicStickerStyle;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.i;
import com.vk.superapp.api.dto.story.actions.WebActionAudioTrack;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.bridges.dto.analytics.MiniAppSettingsBoxAction;
import com.vk.superapp.bridges.dto.analytics.MiniAppSettingsBoxType;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.video.profile.presentation.VideoProfileSource;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.player.controllers.MiniPlayerControllersWrapper;
import com.vk.vmoji.character.VmojiCharacterFragment;
import com.vkontakte.android.R;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.bcw0;
import xsna.bsm;
import xsna.c9t0;
import xsna.e6p0;
import xsna.e6w0;
import xsna.edw0;
import xsna.gm50;
import xsna.k9t0;
import xsna.khm0;
import xsna.ncp0;
import xsna.qtk0;
import xsna.tbw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class rzl0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rzl0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x0346, code lost:
    
        if ((r2 instanceof xsna.pwr0) != false) goto L146;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v33, types: [com.vk.catalog2.common.ui.holders.header.TopBarVh$a, java.lang.Object] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        dcn dcnVar;
        hj0 e;
        VideoRestriction O;
        String str;
        int i = 1;
        switch (this.b) {
            case 0:
                WebActionAudioTrack webActionAudioTrack = (WebActionAudioTrack) this.c;
                MusicTrack musicTrack = (MusicTrack) obj;
                TypedValue typedValue = krv0.a;
                Context s = krv0.b != null ? dhr0.s() : null;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                int millis = (int) timeUnit.toMillis(webActionAudioTrack.g);
                long millis2 = timeUnit.toMillis(16L);
                long j = musicTrack.c0;
                if (millis2 > j) {
                    millis2 = j;
                }
                int i2 = millis + ((int) millis2);
                String str2 = musicTrack.i;
                if (str2 == null) {
                    str2 = "";
                }
                return new o7m0(s, new StoryMusicInfo(musicTrack, str2, millis, i2, 0, null, false, i2, false, false, null, false, true, 2368, null), MusicStickerStyle.Album);
            case 1:
                ((x3m0) this.c).m.d(((bcw0.a) obj).a);
                return s3q0.a;
            case 2:
                mfm0 mfm0Var = (mfm0) this.c;
                khm0.f fVar = (khm0.f) obj;
                int i3 = 16;
                gm50.a.a(mfm0Var, fVar.a, new j5b0(mfm0Var, i3));
                gm50.a.a(mfm0Var, fVar.b, new mdm0(mfm0Var, i));
                gm50.a.a(mfm0Var, fVar.c, new n3b0(mfm0Var, i3));
                gm50.a.a(mfm0Var, fVar.d, new q9i0(mfm0Var, 7));
                gm50.a.a(mfm0Var, fVar.e, new hb40(mfm0Var, 22));
                return s3q0.a;
            case 3:
                ((com.vk.stories.design.view.stats.tabs.viewers.mvi.b) this.c).m.b(new i.c(null, null, tq.h(tlo0.Companion, R.string.story_statistics_viewers_snackbar_error)));
                return s3q0.a;
            case 4:
                fmm0 fmm0Var = (fmm0) this.c;
                int intValue = ((Integer) obj).intValue();
                if (intValue == R.id.music_action_add_to_my_music) {
                    uov uovVar = fmm0Var.b;
                    StoryEntry currentStory = uovVar.getCurrentStory();
                    if (currentStory != null) {
                        fmm0Var.d.M(currentStory, uovVar.getViewEntryPoint(), uovVar.getAnalyticsParams().c);
                    }
                    dcn dcnVar2 = fmm0Var.g;
                    if (dcnVar2 != null) {
                        dcnVar2.dismiss();
                    }
                } else if (intValue == R.id.music_action_remove_from_my_music && (dcnVar = fmm0Var.g) != null) {
                    dcnVar.dismiss();
                }
                return Boolean.FALSE;
            case 5:
                ((k7f) this.c).invoke((SdkClipVideoFile) ((SdkVideoFile) obj));
                return s3q0.a;
            case 6:
                ((rg50) this.c).C(((Integer) obj).intValue());
                return s3q0.a;
            case 7:
                String str3 = (String) obj;
                ?? r1 = ((ToolbarVh) this.c).q;
                if (r1 != 0) {
                    r1.setSearchQuery(str3);
                }
                return s3q0.a;
            case 8:
                l6p0 l6p0Var = (l6p0) obj;
                ((zak0) ((e6p0) this.c).p).setValue(l6p0Var);
                int i4 = e6p0.a.$EnumSwitchMapping$0[l6p0Var.ordinal()];
                if (i4 == 1) {
                    h6v0 h6v0Var = h6v0.a;
                    h6v0.b(true);
                } else {
                    if (i4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h6v0 h6v0Var2 = h6v0.a;
                    h6v0.b(false);
                }
                return s3q0.a;
            case 9:
                izs izsVar = (izs) this.c;
                Integer num = (Integer) obj;
                num.intValue();
                ncp0 ncp0Var = (ncp0) izsVar.invoke(num);
                if (ncp0Var instanceof ncp0.a) {
                    return Integer.valueOf(((ncp0.a) ncp0Var).a);
                }
                if (!(ncp0Var instanceof ncp0.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((ncp0.b) ncp0Var).getClass();
                return null;
            case 10:
                return Boolean.valueOf(((AttachWall) obj).q != ((s7q0) this.c).c);
            case 11:
                r0e0 r0e0Var = ((vnq0) this.c).a;
                bwr0 bwr0Var = (bwr0) obj;
                if (bwr0Var instanceof wxr0) {
                    r3 = ((wxr0) bwr0Var).a.C2();
                } else {
                    if (!(bwr0Var instanceof qwr0) && !(bwr0Var instanceof uxr0)) {
                        if (!(bwr0Var instanceof fyr0)) {
                            if (!(bwr0Var instanceof twr0)) {
                                if (!(bwr0Var instanceof rwr0)) {
                                    break;
                                } else {
                                    r3 = epx.f(((rwr0) bwr0Var).a, r0e0Var.a());
                                }
                            } else {
                                r3 = epx.f(((twr0) bwr0Var).a, r0e0Var.a());
                            }
                        } else {
                            r3 = ((fyr0) bwr0Var).a.C2();
                        }
                    }
                    r3 = true;
                }
                return Boolean.valueOf(r3);
            case 12:
                UserProfileFragment userProfileFragment = (UserProfileFragment) this.c;
                int i5 = UserProfileFragment.p0;
                UiTrackingScreen uiTrackingScreen = UiTracker.j.b;
                if ((uiTrackingScreen != null ? uiTrackingScreen.a : null) == MobileOfficialAppsCoreNavStat$EventScreen.PROFILE && userProfileFragment.getViewLifecycleOwner().getLifecycle().getCurrentState().a(Lifecycle.State.RESUMED)) {
                    com.vk.profile.user.impl.ui.i iVar = userProfileFragment.Q;
                    (iVar != null ? iVar : null).i.b();
                } else {
                    com.vk.profile.user.impl.ui.i iVar2 = userProfileFragment.Q;
                    (iVar2 != null ? iVar2 : null).i.a();
                }
                return s3q0.a;
            case 13:
                ((tuq0) this.c).g.clear();
                return s3q0.a;
            case 14:
                ber0 ber0Var = (ber0) this.c;
                Throwable th = (Throwable) obj;
                if (th instanceof VKApiExecutionException) {
                    VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
                    if (vKApiExecutionException.s() == 15 && vKApiExecutionException.C() == 1189) {
                        Context context = ((ggu0) ber0Var.d.c).b;
                        SuperappUiRouterBridge.a.b bVar = SuperappUiRouterBridge.a.b.a;
                        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                        (superappUiRouterBridge != null ? superappUiRouterBridge : null).g0(bVar, new der0(context, ber0Var));
                        tau0 d = ber0Var.a.d();
                        if (d != null) {
                            d.e(MiniAppSettingsBoxType.SETTINGS_BOX_ALLOW_GLOBAL_NOTIFICATIONS, MiniAppSettingsBoxAction.SHOW);
                        }
                    }
                }
                ber0Var.c.A(JsApiMethodType.ALLOW_NOTIFICATIONS, th);
                return s3q0.a;
            case 15:
                bsm.h hVar = ((gqr0) this.c).n;
                if (hVar != null && (e = hVar.e()) != null) {
                    DialogsFilter dialogsFilter = DialogsFilter.ARCHIVE;
                    vtm vtmVar = ((lj0) e).a;
                    DialogsFilterChangeSource dialogsFilterChangeSource = DialogsFilterChangeSource.LIST_WITH_ITEMS;
                    xtm xtmVar = vtmVar.F;
                    if (xtmVar != null) {
                        xtmVar.b(dialogsFilter, dialogsFilterChangeSource);
                    }
                }
                return s3q0.a;
            case 16:
                VideoCatalogSearchRootVh videoCatalogSearchRootVh = (VideoCatalogSearchRootVh) this.c;
                l3a l3aVar = (l3a) obj;
                int i6 = VideoCatalogSearchRootVh.S;
                if ((l3aVar instanceof SearchFilterVh.a.C0488a ? (SearchFilterVh.a.C0488a) l3aVar : null) != null) {
                    String str4 = ((SearchFilterVh.a.C0488a) l3aVar).a;
                    VideoSearchFiltersImpl videoSearchFiltersImpl = videoCatalogSearchRootVh.D;
                    FilterParameters.Companion.getClass();
                    int i7 = VideoCatalogSearchRootVh.b.$EnumSwitchMapping$0[FilterParameters.a.a(str4).ordinal()];
                    if (i7 == 1) {
                        videoSearchFiltersImpl.j = null;
                        videoCatalogSearchRootVh.H.P1(videoCatalogSearchRootVh.b.getString(R.string.video_search_hint));
                        videoCatalogSearchRootVh.E.n(videoSearchFiltersImpl);
                    } else if (i7 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return s3q0.a;
            case 17:
                VideoFile videoFile = (VideoFile) this.c;
                if ((((bwr0) obj) instanceof ayr0) && !fxc0.B().c(videoFile)) {
                    r3 = true;
                }
                return Boolean.valueOf(r3);
            case 18:
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                MiniPlayerControllersWrapper miniPlayerControllersWrapper = videoMinimizableDiscoveryFragment.X;
                if (miniPlayerControllersWrapper != null) {
                    miniPlayerControllersWrapper.Wf(booleanValue);
                }
                return s3q0.a;
            case 19:
                o9t0 o9t0Var = (o9t0) this.c;
                c9t0 c9t0Var = (c9t0) obj;
                boolean z = o9t0Var.b;
                ou1 ou1Var = o9t0Var.e;
                if (c9t0Var instanceof c9t0.a) {
                    return new k9t0.b(null, z, false, true, false, fkq0.b((UserId) ou1Var.invoke(c9t0Var)), true, false);
                }
                if (!(c9t0Var instanceof c9t0.e)) {
                    if (c9t0Var instanceof c9t0.c) {
                        return new k9t0.b(o25.a().b() ? String.valueOf(fkq0.a(((c9t0.c) c9t0Var).e).b) : null, z, false, c9t0Var.b instanceof VideoProfileSource.OwnProfile, false, false, false, true);
                    }
                    if (!(c9t0Var instanceof c9t0.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    boolean z2 = ((c9t0.d) c9t0Var).c instanceof VideoProfileSource.OwnProfile;
                    return new k9t0.a(z, z2, z2, fkq0.b((UserId) ou1Var.invoke(c9t0Var)));
                }
                c9t0.e eVar = (c9t0.e) c9t0Var;
                VideoProfileSource videoProfileSource = eVar.c;
                qtk0<u490> qtk0Var = eVar.e;
                if (qtk0Var instanceof qtk0.b) {
                    boolean z3 = videoProfileSource instanceof VideoProfileSource.OwnProfile;
                    return new k9t0.a(z, z3, z3, fkq0.b((UserId) ou1Var.invoke(c9t0Var)));
                }
                if (qtk0Var instanceof qtk0.a) {
                    return new k9t0.b(((u490) ((qtk0.a) qtk0Var).a).c, z, videoProfileSource instanceof VideoProfileSource.ForeignProfile, videoProfileSource instanceof VideoProfileSource.OwnProfile, true, fkq0.b((UserId) ou1Var.invoke(c9t0Var)), false, false);
                }
                throw new NoWhenBranchMatchedException();
            case 20:
                VideoFile videoFile2 = ((VideoView) this.c).C;
                if (videoFile2 != null && (O = videoFile2.O()) != null && (str = O.j) != null) {
                    com.vk.music.notifications.inapp.b.f(new qst0(str), null, null, 14);
                }
                return s3q0.a;
            case 21:
                dbs0 dbs0Var = (dbs0) obj;
                ebs0 ebs0Var = ((sqt0) this.c).b;
                if (ebs0Var != null) {
                    ebs0Var.bk(dbs0Var);
                }
                return s3q0.a;
            case 22:
                gzs gzsVar = (gzs) this.c;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 23:
                equ0 equ0Var = (equ0) this.c;
                if (((sxp) obj) instanceof m380) {
                    equ0Var.X0();
                }
                return s3q0.a;
            case 24:
                return m8v0.B((m8v0) this.c);
            case 25:
                ((VkSearchViewVh.a) this.c).a.invoke();
                return s3q0.a;
            case 26:
                ((mov0) this.c).e((Throwable) obj);
                return s3q0.a;
            case 27:
                ((VmojiCharacterFragment.c) this.c).invoke(e6w0.g.b);
                return s3q0.a;
            case 28:
                tbw0 tbw0Var = (tbw0) this.c;
                tbw0.b bVar2 = tbw0.o;
                tbw0.d dVar = tbw0Var.m;
                qcy<?>[] qcyVarArr = tbw0.p;
                boolean booleanValue2 = dVar.getValue(tbw0Var, qcyVarArr[0]).booleanValue();
                boolean z4 = tbw0Var.j;
                boolean booleanValue3 = tbw0Var.n.getValue(tbw0Var, qcyVarArr[1]).booleanValue();
                bVar2.getClass();
                if (booleanValue2 && (z4 || !booleanValue3)) {
                    r3 = true;
                }
                return new zbw0(r3);
            default:
                ((bdw0) this.c).T(new edw0.b.a(true));
                return s3q0.a;
        }
    }
}
