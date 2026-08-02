package xsna;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.TextView;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.auth.modal.base.ModalAuthHostActivity;
import com.vk.auth.validation.VkPhoneValidationErrorReason;
import com.vk.bridges.di.LinksBridgeComponent;
import com.vk.catalog2.common.dto.api.music.CatalogMusicTrackLocalState;
import com.vk.catalog2.common.ui.mvp.holder.container.PaginatedGridListVh;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicTrack;
import com.vk.catalog2.feature.music.holders.MusicTrackVh;
import com.vk.clips.sdk.target.impl.di.MyTargetComponentImpl;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.music.MusicTrack;
import com.vk.ecomm.market.album.MarketEditAlbumGoodsFragment;
import com.vk.ecomm.moderation.api.di.ModerationComponent;
import com.vk.mapper.newsfeed.di.NewsfeedMappersComponentImpl;
import com.vk.music.player.api.di.PlayerUIComponent;
import com.vk.music.snippet.api.di.AudioSnippetComponent;
import com.vk.music.snippet.ui.presentation.MusicSnippetsFragment;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.photos.root.presentation.a;
import com.vk.search.params.api.VkPeopleSearchParams;
import com.vk.video.playlist.playlistscreen.di.PlaylistScreenFragmentInternalComponent;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import xsna.k840;
import xsna.qpb0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class nly implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nly(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        CatalogMusicTrackLocalState catalogMusicTrackLocalState;
        switch (this.b) {
            case 0:
                return (TextView) ((oly) this.c).a.findViewById(R.id.nativeads_domain);
            case 1:
                List<xuy> f = ((xvy) this.c).j().f();
                ArrayList arrayList = new ArrayList();
                for (Object obj : f) {
                    xuy xuyVar = (xuy) obj;
                    if (Math.min(xuyVar.getSize() + xuyVar.getOffset(), r0.j().h()) - Math.max(xuyVar.getOffset(), r0.j().g()) >= 1.0f * xuyVar.getSize()) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            case 2:
                return new qq00((com.vk.clips.sdk.shared.item.market_ads.b) this.c);
            case 3:
                MarketEditAlbumGoodsFragment marketEditAlbumGoodsFragment = (MarketEditAlbumGoodsFragment) this.c;
                int i = MarketEditAlbumGoodsFragment.c1;
                marketEditAlbumGoodsFragment.kn().onBackPressed();
                return s3q0.a;
            case 4:
                dy10 dy10Var = (dy10) this.c;
                s750 s750Var = k840.a.e;
                return new vs4(s750Var != null ? s750Var : null, dy10Var.a);
            case 5:
                Throwable th = (Throwable) this.c;
                if (th == null || !epx.f(k720.S, th)) {
                    k720.S = th;
                    io.reactivex.rxjava3.subjects.h hVar = k720.I;
                    it80.b.getClass();
                    hVar.onNext(new it80(th));
                }
                return s3q0.a;
            case 6:
                ((po20) this.c).a.getClass();
                return com.vk.voip.ui.c.r.a();
            case 7:
                wv20 wv20Var = (wv20) this.c;
                wv20Var.g = !BuildInfo.s();
                com.vk.registration.funnels.b.a.getClass();
                com.vk.registration.funnels.b.r();
                Context context = wv20Var.a;
                if (BuildInfo.s()) {
                    context.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("vk://camera?section=qr")).setFlags(SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING));
                    s3q0 s3q0Var = s3q0.a;
                } else {
                    List<String> list = ModalAuthHostActivity.h;
                    Intent intent = new Intent(context, (Class<?>) ModalAuthHostActivity.class);
                    intent.setFlags(603979776);
                    intent.putExtra("open_camera", true);
                    context.startActivity(intent);
                }
                return s3q0.a;
            case 8:
                com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.b bVar = (com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.b) this.c;
                qcy<Object>[] qcyVarArr = com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.b.n1;
                return ((ModerationComponent) ((k7m) m7m.f(bVar)).mo408a(fpf0.a(ModerationComponent.class))).uf();
            case 9:
                return ((PlayerUIComponent) ((k7m) m7m.f((com.vk.catalog2.feature.music.configuration.b) this.c)).a(fpf0.a(PlayerUIComponent.class))).ub();
            case 10:
                ((rw40) this.c).y.V0();
                return s3q0.a;
            case 11:
                MusicSnippetsFragment musicSnippetsFragment = (MusicSnippetsFragment) this.c;
                int i2 = MusicSnippetsFragment.Y;
                return ((AudioSnippetComponent) m7m.d(musicSnippetsFragment).mo408a(fpf0.a(AudioSnippetComponent.class))).H3();
            case 12:
                return (TextView) ((a850) this.c).findViewById(R.id.tvArtistName);
            case 13:
                MusicTrack musicTrack = (MusicTrack) this.c;
                Serializer.c<MusicTrack> cVar = MusicTrack.CREATOR;
                return String.format(Locale.ENGLISH, "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(musicTrack.f / 60), Integer.valueOf(musicTrack.f % 60)}, 2));
            case 14:
                UIBlockMusicTrack uIBlockMusicTrack = ((MusicTrackVh) this.c).l;
                if (uIBlockMusicTrack != null && (catalogMusicTrackLocalState = uIBlockMusicTrack.C) != null) {
                    catalogMusicTrackLocalState.c = true;
                }
                return s3q0.a;
            case 15:
                MyTargetComponentImpl myTargetComponentImpl = (MyTargetComponentImpl) this.c;
                qcy<Object>[] qcyVarArr2 = MyTargetComponentImpl.f;
                nwy nwyVar = myTargetComponentImpl.a;
                qcy<Object> qcyVar = MyTargetComponentImpl.f[0];
                zix zixVar = (zix) nwyVar.c();
                if (zixVar != null) {
                    return zixVar.a();
                }
                return null;
            case 16:
                mo60 mo60Var = (mo60) this.c;
                return new tc60(mo60Var.b, (dui) mo60Var.T.getValue(), mo60Var.c);
            case 17:
                NewsfeedMappersComponentImpl newsfeedMappersComponentImpl = (NewsfeedMappersComponentImpl) this.c;
                qcy<Object>[] qcyVarArr3 = NewsfeedMappersComponentImpl.o;
                nwy nwyVar2 = newsfeedMappersComponentImpl.k;
                qcy<Object>[] qcyVarArr4 = NewsfeedMappersComponentImpl.o;
                qcy<Object> qcyVar2 = qcyVarArr4[7];
                u9x0 u9x0Var = (u9x0) nwyVar2.c();
                nwy nwyVar3 = newsfeedMappersComponentImpl.m;
                qcy<Object> qcyVar3 = qcyVarArr4[9];
                return new zj60(u9x0Var, (b590) nwyVar3.c());
            case 18:
                return ((LinksBridgeComponent) ((k7m) m7m.f((com.vk.newsfeed.impl.fragments.a) this.c)).a(fpf0.a(LinksBridgeComponent.class))).p();
            case 19:
                return (NewsFeedComponent) ((k7m) m7m.f((j070) this.c)).a(fpf0.a(NewsFeedComponent.class));
            case 20:
                com.vk.newsfeed.impl.recycler.decorations.components.on_media_like.a aVar = (com.vk.newsfeed.impl.recycler.decorations.components.on_media_like.a) this.c;
                aVar.d = false;
                aVar.q = false;
                aVar.p = false;
                aVar.s = 0;
                aVar.r = 0;
                return s3q0.a;
            case 21:
                return Integer.valueOf(((mc90) this.c).r());
            case 22:
                return Boolean.valueOf(((PaginatedGridListVh) this.c).p.h());
            case 23:
                return (TextView) ((rm90) this.c).itemView.findViewById(R.id.past_asr_title);
            case 24:
                return ((VkPeopleSearchParams) ((zak0) ((lv90) this.c).l1).getValue()).g;
            case 25:
                c4a0 c4a0Var = (c4a0) this.c;
                c4a0Var.c.invoke(VkPhoneValidationErrorReason.LATER);
                c4a0Var.e.a(new r090(com.vk.registration.funnels.b.a, 1));
                return s3q0.a;
            case 26:
                ((com.vk.photos.root.presentation.h) this.c).d.invoke(a.b.b);
                return s3q0.a;
            case 27:
                PlaylistScreenFragmentInternalComponent playlistScreenFragmentInternalComponent = (PlaylistScreenFragmentInternalComponent) this.c;
                PlaylistScreenFragmentInternalComponent.a aVar2 = PlaylistScreenFragmentInternalComponent.x;
                return playlistScreenFragmentInternalComponent.Ef().createView();
            case 28:
                ((mob0) this.c).g.f(qpb0.a.f.a);
                return s3q0.a;
            default:
                return ((ClipsViewerComponent) ((k7m) m7m.f((y1c0) this.c)).a(fpf0.a(ClipsViewerComponent.class))).J6();
        }
    }
}
