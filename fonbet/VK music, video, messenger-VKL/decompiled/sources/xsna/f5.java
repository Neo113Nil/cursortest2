package xsna;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Paint;
import android.view.ViewGroup;
import com.unity3d.ads.core.data.datasource.AndroidAdQualityVersionDataSource;
import com.vk.ads.easypromote.api.di.EasyPromoteComponent;
import com.vk.biometrics.lock.api.di.BiometricsLockComponent;
import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.BiometricsLockPinFragment;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.clips.clipsaudio.views.ClipsAudioFragment;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.checklist.impl.presentation.CommunityCheckListFragment;
import com.vk.friends.groupinvite.api.di.InviteFriendsComponent;
import com.vk.im.channelcreation.impl.di.ChannelCreationInternalDiComponent;
import com.vk.im.reporters.api.util.PerformanceReporters;
import com.vk.im.ui.components.common.AvatarAction;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vkontakte.android.R;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import xsna.bph0;
import xsna.mme;
import xsna.ngd;
import xsna.r5;
import xsna.uxd0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class f5 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f5(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v70, types: [xsna.j8i, xsna.xwb$a] */
    @Override // xsna.gzs
    public final Object invoke() {
        String cachedVersion_delegate$lambda$4$lambda$3;
        switch (this.b) {
            case 0:
                r5.a aVar = (r5.a) this.c;
                Context context = aVar.c;
                r5 r5Var = aVar.h;
                ww50 v = s200.v(context);
                if (v != null) {
                    v.S(r5Var);
                }
                aVar.f.invoke();
                Dialog dialog = r5Var.s;
                nw20 nw20Var = dialog instanceof nw20 ? (nw20) dialog : null;
                if (nw20Var != null) {
                    int i = iah0.r(nw20Var.getContext()) ? 8388693 : 1;
                    ViewGroup viewGroup = nw20Var.i0;
                    f4m.m(i, viewGroup != null ? viewGroup : null);
                }
                return s3q0.a;
            case 1:
                ph phVar = (ph) this.c;
                qcy<Object>[] qcyVarArr = ph.n1;
                phVar.getFeature().C(bph0.g.b);
                return s3q0.a;
            case 2:
                return new nu(((zy0) this.c).a);
            case 3:
                return new b41((z31) this.c);
            case 4:
                jm1 jm1Var = (jm1) this.c;
                return jm1Var.c.inflate(R.layout.albums_empty_view_other_user, (ViewGroup) jm1Var, false);
            case 5:
                cachedVersion_delegate$lambda$4$lambda$3 = AndroidAdQualityVersionDataSource.cachedVersion_delegate$lambda$4$lambda$3((NoSuchMethodError) this.c);
                return cachedVersion_delegate$lambda$4$lambda$3;
            case 6:
                return ((y440) this.c).findViewById(R.id.story_editor_close_background_view);
            case 7:
                rul rulVar = (rul) this.c;
                Peer peer = rulVar.h;
                peer.getClass();
                return Boolean.valueOf(peer.Ab(Peer.Type.USER) && o25.b(rulVar.c));
            case 8:
                fxc0.B().d((VideoFile) this.c);
                return s3q0.a;
            case 9:
                ((uic) this.c).clear();
                return s3q0.a;
            case 10:
                BiometricsLockPinFragment biometricsLockPinFragment = (BiometricsLockPinFragment) this.c;
                int i2 = BiometricsLockPinFragment.c0;
                return ((BiometricsLockComponent) m7m.d(biometricsLockPinFragment).a(fpf0.a(BiometricsLockComponent.class))).H();
            case 11:
                return ((laa) this.c).j;
            case 12:
                ChannelCreationInternalDiComponent channelCreationInternalDiComponent = (ChannelCreationInternalDiComponent) this.c;
                qcy<Object>[] qcyVarArr2 = ChannelCreationInternalDiComponent.j;
                a1w a1wVar = q1w.a;
                return new ozo(a1wVar != null ? a1wVar : null, channelCreationInternalDiComponent.Df());
            case 13:
                ChannelFragment channelFragment = (ChannelFragment) this.c;
                return new adb(channelFragment.mo(), channelFragment.V);
            case 14:
                ((i9b) this.c).t.onNext(new uxd0.b(0));
                return s3q0.a;
            case 15:
                return i5s.a(new StringBuilder(), ((wgb) this.c).s, ": loader error, load pipe");
            case 16:
                ChatFragment chatFragment = (ChatFragment) this.c;
                ChatFragment.d dVar = ChatFragment.w1;
                Peer no = chatFragment.no();
                no.getClass();
                return no.Ab(Peer.Type.GROUP) ? PerformanceReporters.ChatType.GROUP_CHAT : PerformanceReporters.ChatType.CHAT;
            case 17:
                ((xwb) this.c).b.O(AvatarAction.REMOVE);
                return s3q0.a;
            case 18:
                ((bp50) this.c).a();
                return s3q0.a;
            case 19:
                return Integer.valueOf(krv0.m(R.attr.vk_ui_overlay_secondary, ((xad) this.c).itemView.getContext()));
            case 20:
                final ClipsAudioFragment clipsAudioFragment = (ClipsAudioFragment) this.c;
                int i3 = ClipsAudioFragment.Y;
                return new OneVideoPlayer.d() { // from class: xsna.vgd
                    @Override // one.video.player.OneVideoPlayer.d
                    public final void C(BaseVideoPlayer baseVideoPlayer, long j) {
                        int i4 = ClipsAudioFragment.Y;
                        xn50.a.c(ClipsAudioFragment.this, new ngd.o((int) j));
                    }
                };
            case 21:
                nwy nwyVar = ((ClipsViewerComponentImpl) ((k7m) m7m.f((com.vk.clips.viewer.impl.feed.view.subs.selector.b) this.c)).a(fpf0.a(ClipsViewerComponent.class))).L;
                qcy<Object> qcyVar = ClipsViewerComponentImpl.o0[24];
                return (l5f) nwyVar.c();
            case 22:
                return ((EasyPromoteComponent) ((yud) this.c).b.mo408a(fpf0.a(EasyPromoteComponent.class))).a();
            case 23:
                return t0e.Q4((t0e) this.c);
            case 24:
                return m33.a(R.drawable.highlight_radius_8_black, ((hge) this.c).f.getContext());
            case 25:
                mme.c cVar = (mme.c) this.c;
                ProfileFragmentProviderComponent profileFragmentProviderComponent = cVar.b;
                UserId userId = cVar.a;
                ProfileFragmentProviderComponent.Companion companion = ProfileFragmentProviderComponent.Companion;
                pwd0 ye = profileFragmentProviderComponent.ye(userId, null);
                ye.G("");
                ye.K(null);
                ye.y(null);
                ye.H(null);
                ye.A();
                ye.F();
                ye.s(false);
                return ye.f();
            case 26:
                utx0 utx0Var = (utx0) this.c;
                boolean booleanValue = utx0Var.g.getValue(utx0Var, utx0.h[2]).booleanValue();
                Paint paint = utx0Var.d.a;
                int i4 = booleanValue ? 30 : 0;
                return f5f.z(paint.getAlpha(), i4, ((long) Math.abs((i4 - r0) / 30)) * 250);
            case 27:
                jaf jafVar = (jaf) this.c;
                int i5 = ClipsWrapperFragment.Q0;
                return jafVar.getParent();
            case 28:
                return new s2g((r2g) this.c);
            default:
                CommunityCheckListFragment communityCheckListFragment = (CommunityCheckListFragment) this.c;
                int i6 = CommunityCheckListFragment.Y;
                return ((InviteFriendsComponent) m7m.d(communityCheckListFragment).mo408a(fpf0.a(InviteFriendsComponent.class))).a();
        }
    }

    public /* synthetic */ f5(f5f f5fVar, utx0 utx0Var) {
        this.b = 26;
        this.c = utx0Var;
    }
}
