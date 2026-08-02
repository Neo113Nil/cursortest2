package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.vk.bridges.di.BridgeComponent;
import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.catalog.mvi.section.di.CatalogComponent;
import com.vk.catalog.mvi.section.screen.impl.ui.CatalogSectionScreenFragment;
import com.vk.catalog2.common.ui.core.view.CatalogRecyclerPaginatedView;
import com.vk.catalog2.common.ui.mvp.clip.ClipMusicTemplatesCatalogFragment;
import com.vk.channels.impl.channel_screen.profile.ChannelProfileFragment;
import com.vk.clips.playlists.di.ClipsPlaylistsComponent;
import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.arguments.ClipsWrapperInputArguments;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridCommonClipsListFragment;
import com.vk.common.links.LaunchContext;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import kotlin.collections.EmptySet;
import xsna.a3p0;
import xsna.dzc;
import xsna.khw0;
import xsna.q0e.b;
import xsna.whg;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class q implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d9, code lost:
    
        if (r1.containsKey("ClipsWrapperFragment.params") == true) goto L33;
     */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v39, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v81, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v17, types: [com.vk.core.serialize.Serializer$StreamParcelableAdapter, com.vk.voip.userid.CallsUserId] */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        dw20 dw20Var;
        a3p0.a.C2519a c2519a;
        a3p0.a.C2519a c2519a2;
        int i = this.b;
        r4 = null;
        Long l = null;
        Object obj = this.c;
        switch (i) {
            case 0:
                u uVar = (u) obj;
                Bundle arguments = uVar.getArguments();
                String string = arguments != null ? arguments.getString("aplus_url") : null;
                String str = string != null ? string : "";
                String str2 = !drm0.N(str) ? str : null;
                if (str2 != null) {
                    maz e = xwk.d().e();
                    Context context = e43.a;
                    maz.c(e, context != null ? context : null, str2, LaunchContext.A, null, null, 24);
                    uVar.dismiss();
                }
                return s3q0.a;
            case 1:
                com.vk.photos.root.albumdetails.presentation.c cVar = (com.vk.photos.root.albumdetails.presentation.c) obj;
                cVar.g.x();
                cVar.g.j();
                cVar.b(null, cVar.j);
                return s3q0.a;
            case 2:
                f12 f12Var = (f12) obj;
                Object value = ((zak0) f12Var.m).getValue();
                if (value != null) {
                    return value;
                }
                float floatValue = ((vak0) f12Var.j).getFloatValue();
                wh50 wh50Var = f12Var.g;
                if (Float.isNaN(floatValue)) {
                    return ((zak0) wh50Var).getValue();
                }
                zak0 zak0Var = (zak0) wh50Var;
                float c = f12Var.c().c(zak0Var.getValue());
                if (Float.isNaN(c) || floatValue == c) {
                    return zak0Var.getValue();
                }
                Object a = f12Var.c().a(floatValue);
                return a == null ? zak0Var.getValue() : a;
            case 3:
                ((bq3) obj).f.c();
                return s3q0.a;
            case 4:
                return ((aw3) obj).b.findViewById(R.id.asr_stop);
            case 5:
                aqw.o((q7v0) ((iq5) obj).r.getValue(), "story:repost:change_avatar", new i60(2));
                return s3q0.a;
            case 6:
                ((eo2) obj).invoke();
                return s3q0.a;
            case 7:
                return go9.b("UPLOAD_TRACE upload: fallback URL available: ", (String) obj);
            case 8:
                lj8 lj8Var = (lj8) obj;
                p5h0 p5h0Var = new p5h0((ViewGroup) lj8Var.b);
                p5h0Var.c = new cs2(lj8Var, 3);
                return p5h0Var;
            case 9:
                return (Boolean) ((c39) obj).a.invoke();
            case 10:
                return CatalogRecyclerPaginatedView.A((CatalogRecyclerPaginatedView) obj);
            case 11:
                CatalogComponent catalogComponent = (CatalogComponent) ((CatalogSectionScreenFragment) obj).N.getValue();
                return catalogComponent.i8(catalogComponent.Ze());
            case 12:
                int i2 = ChannelProfileFragment.e0;
                return new ucb(new il1((ChannelProfileFragment) obj, 10));
            case 13:
                ChatFragment chatFragment = (ChatFragment) obj;
                com.vk.im.ui.components.msg_list.a aVar = chatFragment.H0;
                if (aVar == null) {
                    aVar = null;
                }
                View view = aVar.g;
                if (view == null) {
                    return null;
                }
                Rect C = bwt0.C(view);
                int i3 = C.top;
                b26 b26Var = chatFragment.L0;
                C.top = (b26Var != null ? b26Var : null).e() + i3;
                return C;
            case 14:
                ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) obj;
                int i4 = ClipFeedListFragment.a2;
                return new xe90(clipFeedListFragment.po(), new po1(clipFeedListFragment, 16), new ix2(clipFeedListFragment, 19));
            case 15:
                return new dzc.b((dzc) obj);
            case 16:
                return o1d.y((o1d) obj);
            case 17:
                ((w2d) obj).b.a(ClipItemViewEvent.k.b);
                return s3q0.a;
            case 18:
                int i5 = ClipMusicTemplatesCatalogFragment.U;
                return ((CameraClipsComponent) m7m.d((ClipMusicTemplatesCatalogFragment) obj).a(fpf0.a(CameraClipsComponent.class))).c4();
            case 19:
                WeakReference<dw20> weakReference = ((nad) obj).g;
                if (weakReference != null && (dw20Var = weakReference.get()) != null) {
                    dw20Var.hide();
                }
                return s3q0.a;
            case 20:
                return Integer.valueOf((int) ((bzd) obj).n.n());
            case 21:
                q0e q0eVar = (q0e) obj;
                return new oyd(q0eVar.d, q0eVar.f, q0eVar.e, q0eVar.c, q0eVar.new b());
            case 22:
                int i6 = ClipsGridCommonClipsListFragment.q0;
                return (ClipsPlaylistsComponent) m7m.d((ClipsGridCommonClipsListFragment) obj).mo408a(fpf0.a(ClipsPlaylistsComponent.class));
            case 23:
                gde gdeVar = (gde) obj;
                if (g620.f().k0().a(gdeVar.p.getContext())) {
                    return s3q0.a;
                }
                MusicTrack musicTrack = gdeVar.t;
                if (musicTrack == null) {
                    return s3q0.a;
                }
                Activity h = e3m.h(gdeVar.p.getContext());
                if (h == null) {
                    return s3q0.a;
                }
                ic40.r(lyd.g().w(), h, MusicBottomSheetLaunchPoint.App.b, musicTrack, gdeVar.n, null, false, false, null, null, 496);
                return s3q0.a;
            case 24:
                afe afeVar = (afe) obj;
                ?? r1 = afeVar.u;
                a3p0.a aVar2 = afeVar.H;
                String str3 = (aVar2 == null || (c2519a2 = aVar2.e) == null) ? null : c2519a2.a;
                if (aVar2 != null && (c2519a = aVar2.e) != null) {
                    l = c2519a.g;
                }
                if (str3 == null) {
                    ((BridgeComponent) r1.getValue()).x().e().e().b();
                } else {
                    ((BridgeComponent) r1.getValue()).x().e().e().a(l != null ? l.longValue() : 0L, str3);
                }
                ClipGridParams.Data.Hashtag hashtag = afeVar.I;
                if (hashtag != null) {
                    afeVar.g(hashtag);
                }
                return s3q0.a;
            case 25:
                Bundle a2 = ((roe) obj).a();
                if (a2 == null || !a2.getBoolean("ClipsOwnerSwipeFragment.is_main_feed", false)) {
                    ClipsWrapperInputArguments.r.getClass();
                    if (a2 != null) {
                        break;
                    }
                }
                r2 = true;
                return Boolean.valueOf(r2);
            case 26:
                ClipsViewerComponentImpl clipsViewerComponentImpl = (ClipsViewerComponentImpl) obj;
                qcy<Object>[] qcyVarArr = ClipsViewerComponentImpl.o0;
                return new yme(clipsViewerComponentImpl.Ba(), clipsViewerComponentImpl.b.getExperiments().c0());
            case 27:
                int i7 = ClipsWrapperFragment.Q0;
                return ((ClipsWrapperFragment) obj).io().Df();
            case 28:
                ClipsWrapperInputArguments.a aVar3 = ClipsWrapperInputArguments.r;
                Bundle a3 = ((ClipsWrapperInputArguments) obj).a();
                aVar3.getClass();
                return Boolean.valueOf(a3 != null ? a3.getBoolean("ClipsWrapperFragment.in_wrapper_activity", false) : false);
            default:
                whg.q qVar = (whg.q) obj;
                khw0 a4 = a201.b().a();
                t49 t49Var = qVar.a;
                String str4 = t49Var.c;
                String Db = t49Var.d.Db();
                zqk0 zqk0Var = new zqk0(null, 0L, str4, str4, Db == null ? "" : Db, false, false, EmptySet.b, false, null, null, null, new xmw0(t49Var.a.getStringValue(), t49Var.b), 0, false, null, null, null, qVar.b, false, false, 3661313);
                VoipCallSource voipCallSource = qVar.c;
                if (voipCallSource == null) {
                    voipCallSource = new VoipCallSource(MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.HISTORY, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL_LIST);
                }
                a4.d(new khw0.a(zqk0Var, voipCallSource, null, null, null, 28));
                return s3q0.a;
        }
    }
}
