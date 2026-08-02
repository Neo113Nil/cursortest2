package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ads.core.data.repository.AndroidMediationRepository;
import com.vk.bridges.di.BridgeComponent;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.camera.clips.drafts.sync.impl.di.ClipsDraftSyncComponentImpl;
import com.vk.clips.favorites.api.di.ClipsFavoritesComponent;
import com.vk.clips.sdk.models.SdkCompilation;
import com.vk.clips.viewer.impl.adapters.ClipVideoFileAdapter;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.dto.clips.model.ClipsEditorInitParams;
import com.vk.dto.compilation.Compilation;
import com.vk.ecomm.cart.impl.cart.CartFragment;
import com.vk.ecomm.cart.impl.cart.ui.emptycart.EmptyCartFragment;
import com.vk.ecomm.catalog.impl.catalog.root.ClassifiedsCatalogRootVh;
import com.vk.ecomm.onlinebooking.impl.masters.presentation.BookingMastersScreenFragmentMvi2;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import com.vk.im.ui.components.viewcontrollers.msg_send.MsgSendHidePopupsReason;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.profile.community.impl.ui.profile.CommunityProfileFragment;
import com.vk.queue.di.QueueSyncComponent;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.topics.api.di.TopicsComponent;
import com.vk.topics.impl.fragments.BoardTopicsFragment;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.fragment.AlbumChooseFragmentInternalComponent;
import com.vk.video.ui.upload.impl.publish.presentation.author.fragment.AuthorModalInternalComponent;
import com.vkontakte.android.R;
import gatewayprotocol.v1.ClientInfoOuterClass;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.go5;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class in0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ in0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v37, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        ClientInfoOuterClass.MediationProvider _get_mediationProvider_$lambda$0;
        int i = 3;
        int i2 = 0;
        switch (this.b) {
            case 0:
                ln0 ln0Var = (ln0) this.c;
                Pattern pattern = ln0.h1;
                FragmentActivity activity = ln0Var.getActivity();
                if (activity != null) {
                    activity.finish();
                }
                return s3q0.a;
            case 1:
                AlbumChooseFragmentInternalComponent albumChooseFragmentInternalComponent = (AlbumChooseFragmentInternalComponent) this.c;
                AlbumChooseFragmentInternalComponent.a aVar = AlbumChooseFragmentInternalComponent.g;
                nwy nwyVar = albumChooseFragmentInternalComponent.e;
                qcy<Object> qcyVar = AlbumChooseFragmentInternalComponent.h[3];
                return ((g7s0) nwyVar.c()).J();
            case 2:
                return ((f12) this.c).c();
            case 3:
                _get_mediationProvider_$lambda$0 = AndroidMediationRepository._get_mediationProvider_$lambda$0((AndroidMediationRepository) this.c);
                return _get_mediationProvider_$lambda$0;
            case 4:
                return ((AuthorModalInternalComponent) this.c).b.h4();
            case 5:
                v3p v3pVar = ((fg5) this.c).d;
                v3pVar.c(false);
                v3pVar.b().b(go5.a.a);
                return s3q0.a;
            case 6:
                r46 r46Var = (r46) this.c;
                int i3 = 5;
                r46Var.L(new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(r46Var.d.F(r46Var, new wrm(r46Var.c.f, false, "ProfileInfoModel")), new tz(new iz0(r46Var, i), i)), new q46(r46Var, i2)), new m5(r46Var, 4), new defpackage.x(new ix2(r46Var, i3), i3));
                return s3q0.a;
            case 7:
                return (ViewGroup) ((y440) this.c).findViewById(R.id.fl_top_buttons_panel);
            case 8:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.c;
                ref$BooleanRef.element = true ^ ref$BooleanRef.element;
                fxc0.B().T().C(ref$BooleanRef.element);
                nf9.f();
                return s3q0.a;
            case 9:
                return ((StoryViewerComponent) ((k7m) m7m.f((cv6) this.c)).a(fpf0.a(StoryViewerComponent.class))).Me();
            case 10:
                BoardTopicsFragment boardTopicsFragment = (BoardTopicsFragment) this.c;
                int i4 = BoardTopicsFragment.S0;
                return ((TopicsComponent) m7m.d(boardTopicsFragment).a(fpf0.a(TopicsComponent.class))).fe().a();
            case 11:
                BookingMastersScreenFragmentMvi2 bookingMastersScreenFragmentMvi2 = (BookingMastersScreenFragmentMvi2) this.c;
                qcy<Object>[] qcyVarArr = BookingMastersScreenFragmentMvi2.S;
                return new ar7((BookingScreenParams) bookingMastersScreenFragmentMvi2.N.getValue());
            case 12:
                mu7 mu7Var = (mu7) this.c;
                return gu7.a(mu7Var.getCurrentState(), mu7Var.k());
            case 13:
                CartFragment cartFragment = (CartFragment) this.c;
                qcy<Object>[] qcyVarArr2 = CartFragment.Y;
                UUID uuid = cartFragment.Q;
                if (uuid == null) {
                    uuid = null;
                }
                EmptyCartFragment.a aVar2 = new EmptyCartFragment.a(EmptyCartFragment.class, null, null);
                aVar2.j.putString("KEY_CART_STARTED_SINGLE_SESSION_UUID", uuid.toString());
                return aVar2.f();
            case 14:
                ikv0 ikv0Var = (ikv0) this.c;
                if (ikv0Var != null) {
                    ikv0Var.a();
                }
                return s3q0.a;
            case 15:
                imv imvVar = ((ChatFragment) this.c).J0;
                (imvVar != null ? imvVar : null).h(MsgSendHidePopupsReason.OTHER);
                return s3q0.a;
            case 16:
                return Boolean.valueOf(((ClassifiedsCatalogRootVh) this.c).m.b.b.c(false));
            case 17:
                ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) this.c;
                int i5 = ClipFeedListFragment.a2;
                return new o6e(clipFeedListFragment.getViewLifecycleOwner(), new yxc(clipFeedListFragment, i2));
            case 18:
                m4 m4Var = ((nzc) this.c).b;
                if (m4Var != null) {
                    m4Var.invoke();
                }
                return s3q0.a;
            case 19:
                return (ClipsFavoritesComponent) ((k7m) m7m.f((o1d) this.c)).mo408a(fpf0.a(ClipsFavoritesComponent.class));
            case 20:
                return (TextView) ((q8d) this.c).b().findViewById(R.id.video_single_clip_song_name);
            case 21:
                List<Compilation> list = ((ClipVideoFileAdapter) this.c).m.F1;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (Compilation compilation : list) {
                    arrayList.add(new SdkCompilation(compilation.c, compilation));
                }
                return arrayList;
            case 22:
                ClipsDraftSyncComponentImpl clipsDraftSyncComponentImpl = (ClipsDraftSyncComponentImpl) this.c;
                return new ytd(clipsDraftSyncComponentImpl.a.getExperiments(), ClipsDraftPersistentStore.b, clipsDraftSyncComponentImpl.b);
            case 23:
                bzd bzdVar = (bzd) this.c;
                bzdVar.d.d();
                gzd gzdVar = (gzd) bzdVar.m.getValue();
                com.vk.clips.editor.state.model.a g = bzdVar.g();
                ClipsEditorInitParams clipsEditorInitParams = bzdVar.b;
                gzdVar.a(g, clipsEditorInitParams.c);
                if (bzdVar.j() != null) {
                    boolean z = clipsEditorInitParams.b.f;
                }
                return s3q0.a;
            case 24:
                return new y5e(((u7e) this.c).a.a.b);
            case 25:
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) this.c;
                int i6 = ClipsWrapperFragment.Q0;
                ouf oufVar = (ouf) clipsWrapperFragment.u0.getValue();
                String d = clipsWrapperFragment.po().d();
                ?? r3 = clipsWrapperFragment.U;
                nie nieVar = new nie(d, (urf) r3.getValue());
                String d2 = clipsWrapperFragment.po().d();
                urf urfVar = (urf) r3.getValue();
                soe soeVar = (soe) clipsWrapperFragment.W.getValue();
                ((Boolean) clipsWrapperFragment.po().q.getValue()).getClass();
                return new sqf(clipsWrapperFragment, oufVar, nieVar, new ufe(d2, urfVar, soeVar), new dge(clipsWrapperFragment.po().d(), (urf) r3.getValue()), clipsWrapperFragment.po(), new ClipsWrapperFragment.f(0, clipsWrapperFragment, ClipsWrapperFragment.class, CampaignEx.JSON_NATIVE_VIDEO_CLOSE, "close()Z", 8));
            case 26:
                return ((BridgeComponent) this.c).s();
            case 27:
                return ((QueueSyncComponent) this.c).H4();
            case 28:
                com.vk.profile.community.impl.ui.profile.f fVar = ((CommunityProfileFragment) this.c).S;
                return Boolean.valueOf((fVar != null ? fVar : null).c());
            default:
                h4i h4iVar = (h4i) this.c;
                return Boolean.valueOf(h4iVar.b.getValue().floatValue() >= 1.0f && h4iVar.e.getValue().booleanValue() && !h4iVar.c.getValue().booleanValue());
        }
    }
}
