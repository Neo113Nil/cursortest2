package xsna;

import android.content.Context;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.vk.attachpicker.impl.fragment.AttachMusicFragment;
import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.d;
import com.vk.bridges.di.BridgeComponent;
import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.channels.api.Channel;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.clips.coauthors.di.ClipsCoauthorsComponent;
import com.vk.clips.entrypoints.di.ClipsEntryPointsComponent;
import com.vk.clips.viewer.impl.adapters.ClipVideoFileAdapter;
import com.vk.clips.viewer.impl.adapters.GeoPlaceWrapper;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.dto.geo.GeoPlace;
import com.vk.dto.stories.model.clickable.ClickableGeo;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.ecomm.cart.impl.cart.CartFragment;
import com.vk.ecomm.catalog.impl.catalog.root.ClassifiedsCatalogRootVh;
import com.vk.im.engine.models.channels.ChannelType;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.models.groups.MemberStatus;
import com.vk.im.ui.fragments.ChatMakeLinkFragment;
import com.vk.music.fragment.api.di.MusicFragmentComponent;
import com.vk.newsfeed.impl.fragments.BottomSheetCommentsFragment;
import com.vk.photos.ui.album_list.AlbumsListFragment;
import com.vk.topics.impl.fragments.BoardTopicsFragment;
import com.vk.video.ui.upload.impl.attachedclips.presentation.feature.entity.ClipState;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.fragment.AlbumChooseFragmentInternalComponent;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Pair;
import xsna.du;
import xsna.nzl;
import xsna.t5e;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class mh implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mh(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v37, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        List<ClickableSticker> list;
        GeoPlace geoPlace;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                qcy<Object>[] qcyVarArr = ph.n1;
                ((ph) obj).dismiss();
                return s3q0.a;
            case 1:
                StringBuilder sb = new StringBuilder("Delete action ");
                du.c cVar = (du.c) ((du) obj);
                sb.append((Object) b70.c(cVar.a().c()));
                sb.append(" due to unrecoverable error on ");
                sb.append(cVar.a().d());
                sb.append(" attempt.");
                return sb.toString();
            case 2:
                Pattern pattern = ln0.h1;
                FragmentActivity activity = ((ln0) obj).getActivity();
                if (activity != null) {
                    activity.finish();
                }
                return s3q0.a;
            case 3:
                nwy nwyVar = ((AlbumChooseFragmentInternalComponent) obj).c;
                qcy<Object> qcyVar = AlbumChooseFragmentInternalComponent.h[1];
                return new hn1((cde0) nwyVar.c());
            case 4:
                int i2 = AlbumsListFragment.a0;
                ((AlbumsListFragment) obj).finish();
                return s3q0.a;
            case 5:
                e12 e12Var = (e12) obj;
                return new Pair(e12Var.e(), e12Var.g.getValue());
            case 6:
                return ((ds3) obj).f;
            case 7:
                int i3 = AttachMusicFragment.I0;
                return ((MusicFragmentComponent) m7m.d((AttachMusicFragment) obj).a(fpf0.a(MusicFragmentComponent.class))).Y1();
            case 8:
                return ((b94) obj).b;
            case 9:
                ((io.reactivex.rxjava3.disposables.c) obj).dispose();
                return s3q0.a;
            case 10:
                return u86.I((y440) obj);
            case 11:
                ((com.vk.biometrics.lock.impl.presentation.base.mvi.pin.b) obj).T(d.C0427d.b);
                return s3q0.a;
            case 12:
                int i4 = BoardTopicsFragment.S0;
                h3p0.b((BoardTopicsFragment) obj);
                return s3q0.a;
            case 13:
                gzs gzsVar = (gzs) ((zak0) ((co7) obj).b).getValue();
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 14:
                nzl.a aVar = BottomSheetCommentsFragment.f1;
                Context mo2getContext = ((BottomSheetCommentsFragment) obj).mo2getContext();
                if (mo2getContext != null) {
                    return n34.k(mo2getContext);
                }
                return null;
            case 15:
                qcy<Object>[] qcyVarArr2 = CartFragment.Y;
                return ((BridgeComponent) ((k7m) m7m.f((CartFragment) obj)).a(fpf0.a(BridgeComponent.class))).p();
            case 16:
                ChannelFragment channelFragment = (ChannelFragment) obj;
                int i5 = ChannelFragment.a1;
                MemberStatus.a aVar2 = MemberStatus.Companion;
                Group b = channelFragment.no().b();
                Integer valueOf = b != null ? Integer.valueOf(b.p) : null;
                aVar2.getClass();
                MemberStatus a = MemberStatus.a.a(valueOf);
                Channel b2 = channelFragment.lo().b();
                return Boolean.valueOf((b2 != null ? b2.z : null) == ChannelType.COMMUNITY_CHANNEL && a == MemberStatus.MEMBER);
            case 17:
                return i5s.a(new StringBuilder(), ((wgb) obj).s, " created");
            case 18:
                qcy<Object>[] qcyVarArr3 = ChatMakeLinkFragment.U;
                ((ChatMakeLinkFragment) obj).kn().onBackPressed();
                return s3q0.a;
            case 19:
                ClassifiedsCatalogRootVh classifiedsCatalogRootVh = (ClassifiedsCatalogRootVh) obj;
                mzp0 mzp0Var = classifiedsCatalogRootVh.H;
                if (mzp0Var != null) {
                    mzp0Var.a();
                }
                classifiedsCatalogRootVh.z.d();
                return s3q0.a;
            case 20:
                int i6 = ClipFeedListFragment.a2;
                return (ClipsEntryPointsComponent) m7m.d((ClipFeedListFragment) obj).mo408a(fpf0.a(ClipsEntryPointsComponent.class));
            case 21:
                return (ClipsCoauthorsComponent) ((k7m) m7m.f((o1d) obj)).mo408a(fpf0.a(ClipsCoauthorsComponent.class));
            case 22:
                return (TextView) ((q8d) obj).b().findViewById(R.id.video_single_clip_views);
            case 23:
                tad tadVar = (tad) obj;
                com.vk.movika.sdk.base.observable.q qVar = new com.vk.movika.sdk.base.observable.q(tadVar, 22);
                tb tbVar = new tb(tadVar, 29);
                defpackage.i iVar = new defpackage.i(tadVar, 20);
                vad vadVar = new vad();
                vadVar.x0(qid0.class, new uad(qVar, tbVar, iVar, vadVar, 0));
                vadVar.x0(trv0.class, new qd1(6, qVar, tbVar));
                vadVar.x0(sbk0.class, new mu1(8, qVar, tbVar));
                return vadVar;
            case 24:
                return Boolean.valueOf(!((ClipState) obj).c.N1.isEmpty());
            case 25:
                ClickableStickers clickableStickers = ((ClipVideoFileAdapter) obj).m.C1;
                if (clickableStickers == null || (list = clickableStickers.d) == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof ClickableGeo) {
                        arrayList.add(obj2);
                    }
                }
                ClickableGeo clickableGeo = (ClickableGeo) j5g.a0(arrayList);
                if (clickableGeo == null || (geoPlace = clickableGeo.g) == null) {
                    return null;
                }
                return new GeoPlaceWrapper(geoPlace);
            case 26:
                return ((CameraClipsComponent) ((k7m) m7m.f((vod) obj)).a(fpf0.a(CameraClipsComponent.class))).p9();
            case 27:
                return Boolean.valueOf(((ytd) obj).a.j());
            case 28:
                ((com.vk.clips.favorites.impl.ui.folders.picker.b) obj).j.d(t5e.r.a, null);
                return s3q0.a;
            default:
                u7e u7eVar = (u7e) obj;
                q7e q7eVar = u7eVar.b;
                return new r8e(q7eVar.c, q7eVar.d, new defpackage.e(u7eVar, 21), u7eVar.f, new defpackage.f(u7eVar, 17), q7eVar.r.d, (y5e) u7eVar.e.getValue(), u7eVar.c, q7eVar.r.e);
        }
    }
}
