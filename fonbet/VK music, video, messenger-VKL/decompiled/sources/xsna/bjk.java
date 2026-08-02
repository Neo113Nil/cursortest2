package xsna;

import android.app.Activity;
import android.content.Intent;
import android.util.SparseArray;
import android.view.ViewGroup;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.photo.ImageCropData;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.settings.impl.presentation.filtered.NewsfeedFilteredSourcesFragment;
import com.vk.lists.DefaultErrorView;
import com.vk.log.L;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlaySource;
import com.vk.music.playlist.display.domain.e;
import com.vk.music.podcast.impl.ui.episode.PodcastEpisodeFragment;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.newsfeed.api.posting.viewpresenter.PreviewRatio;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerSelectedItem;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.superapp.api.dto.app.catalog.SectionButton;
import com.vk.voip.ui.onboarding.features.FeatureId;
import com.vkontakte.android.R;
import java.security.MessageDigest;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.commons.http.Http;
import ru.ok.proto.rtmp.amf.AmfConstants;
import xsna.cp20;
import xsna.dw20;
import xsna.it80;
import xsna.kyu;
import xsna.orx;
import xsna.qn60;
import xsna.qr60;
import xsna.ro20;
import xsna.suq;
import xsna.ur20;
import xsna.x7a;
import xsna.y5c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class bjk implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bjk(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v107, types: [T, xsna.dw20] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Intent intent;
        List<NewsEntry> list;
        int i = this.b;
        int i2 = 14;
        String str = null;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ImageCropData imageCropData = (ImageCropData) obj2;
                ImageCropData imageCropData2 = (ImageCropData) obj;
                return Boolean.valueOf(epx.f(imageCropData2.b(), imageCropData.b()) && Math.abs((((float) imageCropData2.c()) / ((float) imageCropData2.a())) - (((float) imageCropData.c()) / ((float) imageCropData.a()))) <= 0.04f);
            case 1:
                ((hpm) obj2).Z((com.vk.im.engine.models.dialogs.b) obj);
                return s3q0.a;
            case 2:
                ((com.vk.music.playlist.display.domain.b) obj2).T(new e.m((Playlist) obj));
                return s3q0.a;
            case 3:
                int i3 = g1p.j1;
                L.g("Error on get rooms request", (Throwable) obj);
                ((g1p) obj2).tn();
                return s3q0.a;
            case 4:
                fcp fcpVar = (fcp) obj2;
                fcpVar.G0(fcpVar.H, (vgg) obj);
                return s3q0.a;
            case 5:
                return ((jqp) obj2).a.d().b().d((List) obj);
            case 6:
                NewsEntry newsEntry = (NewsEntry) obj2;
                u1c0 u1c0Var = (u1c0) obj;
                NewsEntry newsEntry2 = u1c0Var.b;
                NewsEntry newsEntry3 = u1c0Var.a;
                NewsEntry newsEntry4 = epx.f(newsEntry2, newsEntry) ? newsEntry : u1c0Var.b;
                if (!epx.f(newsEntry3, newsEntry)) {
                    newsEntry = newsEntry3;
                }
                return lbs.b(u1c0Var, newsEntry, newsEntry4, Http.StatusCode.SEE_OTHER);
            case 7:
                Object obj3 = ((b2q) obj2).o;
                Object obj4 = obj3;
                if (obj3 == null) {
                    obj4 = null;
                }
                d2q d2qVar = (d2q) obj4;
                d2qVar.getClass();
                r55 r55Var = r55.a;
                umu0 umu0Var = r55.g;
                (umu0Var != null ? umu0Var : null).m.a(d2qVar.b);
                return s3q0.a;
            case 8:
                Post post = (Post) obj;
                post.N.e = false;
                List<ol60> c = pn60.c(((t7q) obj2).b, post, null, null, 14);
                for (ol60 ol60Var : c) {
                    if (ol60Var instanceof z1c0) {
                        u1c0 u1c0Var2 = ((z1c0) ol60Var).h;
                        if (u1c0Var2 instanceof iko0) {
                            ((iko0) u1c0Var2).q = false;
                        }
                    }
                }
                return c;
            case 9:
                return (io.reactivex.rxjava3.core.x) obj2;
            case 10:
                b6r b6rVar = (b6r) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    it80.b.getClass();
                    return it80.a.a();
                }
                it80.a aVar = it80.b;
                FeatureId featureId = b6rVar.a;
                suq suqVar = new suq(featureId, b6rVar.a(featureId), new suq.c.a(R.string.voip_feature_onboarding_reactions_title, R.string.voip_feature_onboarding_reactions_subtitle, R.color.vk_lavender_A400, R.color.vk_lavender_A700, Integer.valueOf(R.drawable.vk_icon_hand_heart_outline_28), null));
                aVar.getClass();
                return new it80(suqVar);
            case 11:
                c4s c4sVar = (c4s) obj2;
                UsersUserFullDto usersUserFullDto = (UsersUserFullDto) j5g.a0((List) obj);
                c4sVar.e(true, usersUserFullDto != null ? usersUserFullDto.f3() : null);
                return s3q0.a;
            case 12:
                avu avuVar = (avu) obj2;
                bvu bvuVar = avuVar.m;
                if (bvuVar != null) {
                    avuVar.l.invoke(bvuVar.b);
                }
                return s3q0.a;
            case 13:
                kyu.b bVar = (kyu.b) obj2;
                k8r0 k8r0Var = bVar.o;
                SectionButton sectionButton = ((x7a.b) bVar.getItem()).g.d;
                k8r0Var.f(sectionButton != null ? sectionButton.c : null, ((x7a.b) bVar.getItem()).g.b.b, ((x7a.b) bVar.getItem()).e, null);
                return s3q0.a;
            case 14:
                return uyh0.a((uyh0) obj, false, false, ((orx.d.f) obj2).b, null, 11);
            case 15:
                UserId userId = (UserId) obj2;
                l0y l0yVar = (l0y) obj;
                if (l0yVar.a) {
                    xg5.a().D().G0(userId);
                } else if (l0yVar.b) {
                    cvk.u(R.string.community_user_already_member, false);
                } else {
                    cvk.u(R.string.error, false);
                }
                return s3q0.a;
            case 16:
                return new j210((ViewGroup) obj, ((n310) obj2).i);
            case 17:
                mo10 mo10Var = (mo10) obj2;
                jo10 jo10Var = mo10Var.g;
                hb0<String> hb0Var = mo10Var.d;
                jo10Var.getClass();
                par0.a.getClass();
                par0.a("DefaultClientSeamlessInstallFlow tryToOpenRustoreSeamlessInstall");
                String str2 = ((String) obj) + jo10.c;
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    messageDigest.update(str2.getBytes(emb.b));
                    byte[] digest = messageDigest.digest();
                    char[] cArr = new char[digest.length * 2];
                    int length = digest.length;
                    for (int i4 = 0; i4 < length; i4++) {
                        byte b = digest[i4];
                        int i5 = i4 * 2;
                        char[] cArr2 = jo10.b;
                        cArr[i5] = cArr2[(b & 255) >>> 4];
                        cArr[i5 + 1] = cArr2[(b & AmfConstants.TYPE_XML_DOCUMENT_MARKER) == true ? 1 : 0];
                    }
                    str = new String(cArr);
                } catch (Exception unused) {
                }
                if (str != null) {
                    try {
                        hb0Var.a(str);
                        par0.a.getClass();
                        par0.a("DefaultClientSeamlessInstallFlow Seamless install with token started");
                        jo10Var.a.c();
                    } catch (Exception unused2) {
                        par0.a.getClass();
                        par0.a("DefaultClientSeamlessInstallFlow Error starting seamless install with token");
                    }
                    return s3q0.a;
                }
                par0.a.getClass();
                par0.a("DefaultClientSeamlessInstallFlow error hashing token for rustore seamless install");
                mo10Var.b(true);
                return s3q0.a;
            case 18:
                ((w920) obj2).k.b((io.reactivex.rxjava3.disposables.c) obj);
                return s3q0.a;
            case 19:
                vo20 vo20Var = (vo20) obj2;
                ro20 ro20Var = vo20Var.q.c;
                ro20.a aVar2 = ro20Var instanceof ro20.a ? (ro20.a) ro20Var : null;
                if (aVar2 != null ? aVar2.c.c : false) {
                    c63 c63Var = c63.a;
                    Activity b2 = c63.b();
                    if (b2 != null && (intent = b2.getIntent()) != null) {
                        intent.addFlags(805306368);
                        vo20Var.a.startActivity(intent);
                    }
                    no20 no20Var = vo20Var.s;
                    vfk vfkVar = new vfk(vo20Var, 29);
                    no20Var.getClass();
                    Activity b3 = c63.b();
                    if (b3 == null) {
                        vfkVar.invoke(Boolean.TRUE);
                    } else {
                        List<brj0> l = e43.l(new brj0(0, 0, null, R.string.mini_app_call_finish_call_option_only_me, null, false, false, null, 0, null, null, null, null, null, 131062), new brj0(1, 0, null, R.string.mini_app_call_call_option_for_all, null, false, false, null, 0, null, null, null, null, null, 131062));
                        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                        ref$ObjectRef.element = new dw20.b(b3, null).P(l, new wqb(i2, vfkVar, ref$ObjectRef)).I0(null);
                    }
                } else {
                    cp20.a aVar3 = cp20.a.a;
                    if (vo20Var.r) {
                        vo20Var.p.onNext(aVar3);
                    }
                }
                return s3q0.a;
            case 20:
                ((nr20) obj2).T(ur20.a.C3816a.b);
                return s3q0.a;
            case 21:
                int intValue = ((Integer) obj).intValue();
                f440 f440Var = ((y440) obj2).S;
                if (f440Var != null) {
                    f440Var.F6(intValue);
                }
                return s3q0.a;
            case 22:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                DefaultErrorView defaultErrorView = ((NewsfeedFilteredSourcesFragment) obj2).V;
                (defaultErrorView != null ? defaultErrorView : null).setVisibility(booleanValue ? 0 : 8);
                return s3q0.a;
            case 23:
                dv60 dv60Var = (dv60) obj2;
                lu60 lu60Var = (lu60) obj;
                SparseArray<lu60> sparseArray = ((qz60) dv60Var.b.getCurrentState()).h.a;
                u4q0 u4q0Var = zik0.a;
                lu60 lu60Var2 = sparseArray.get(0);
                if (lu60Var2 == null || (list = lu60Var2.a()) == null) {
                    list = EmptyList.b;
                }
                dv60Var.v(j5g.u0(list, lu60Var.a()));
                return s3q0.a;
            case 24:
                qn60.c cVar = (qn60.c) obj;
                return new kv60(new qr60.a.c(cVar.a, cVar.b, true, (Map) obj2, 16));
            case 25:
                ((y5c.a) obj2).a();
                return s3q0.a;
            case 26:
                Object obj5 = ((vl90) obj2).o;
                ((tl90) (obj5 != null ? obj5 : null)).r();
                return s3q0.a;
            case 27:
                PodcastEpisodeFragment podcastEpisodeFragment = (PodcastEpisodeFragment) obj2;
                MusicTrack musicTrack = (MusicTrack) obj;
                int i6 = PodcastEpisodeFragment.u0;
                com.vk.music.podcast.impl.ui.episode.b bVar2 = (com.vk.music.podcast.impl.ui.episode.b) podcastEpisodeFragment.S;
                if (bVar2 != null) {
                    bVar2.l.N0(new lqk0((StartPlaySource) null, musicTrack, podcastEpisodeFragment.s0, bVar2.n().Eb(64), 0, (ShuffleMode) null, (PlayRequestTrigger) null, (AdsAudioPixelsContainer) null, 0L, 1009));
                }
                return s3q0.a;
            case 28:
                ((enc0) obj2).U.invoke(new PostingAction.MediaPicker.Selection.RemoveFromSelected((MediaPickerSelectedItem) obj));
                return s3q0.a;
            default:
                PreviewRatio previewRatio = (PreviewRatio) obj2;
                PreviewRatio previewRatio2 = (PreviewRatio) obj;
                return Boolean.valueOf(Math.abs((((float) previewRatio2.b()) / ((float) previewRatio2.a())) - (((float) previewRatio.b()) / ((float) previewRatio.a()))) <= 0.04f);
        }
    }
}
