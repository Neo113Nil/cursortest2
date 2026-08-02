package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetChallengeResponseDto;
import com.vk.api.generated.wall.dto.WallGetByIdResponseDto;
import com.vk.api.generated.wall.dto.WallWallItemDto;
import com.vk.bridges.ImageViewer;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.clips.edit.di.ClipEditComponent;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.data.CallProducerButton;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.dto.user.UserProfile;
import com.vk.im.ui.components.chat_profile.interactors.UserProfileAvatarsInteractor;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.a3p0;
import xsna.ej90;
import xsna.saj;
import xsna.wfu;
import xsna.wgb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class sx4 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ sx4(Post post, String str, ej90.b bVar, eax0 eax0Var) {
        this.b = 11;
        this.c = str;
        this.d = post;
        this.e = bVar;
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String R1;
        int i = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                tx4 tx4Var = (tx4) obj4;
                MusicTrack musicTrack = (MusicTrack) obj3;
                MusicTrack musicTrack2 = (MusicTrack) obj2;
                if (((Boolean) obj).booleanValue()) {
                    Iterator it = tx4Var.c.iterator();
                    while (it.hasNext()) {
                        ((lck0) it.next()).E(musicTrack, musicTrack2);
                    }
                }
                return s3q0.a;
            case 1:
                wgb wgbVar = (wgb) obj4;
                List list = (List) obj3;
                wgbVar.e(wgb.b.a((wgb.b) obj, null, null, list, ((scf0) obj2).a, false, false, false, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE));
                wgbVar.d();
                wgbVar.b.a(new vf1(4, wgbVar, list));
                return s3q0.a;
            case 2:
                return new wfu.a.C3931a((fde) obj4, new ild(((qra) ((hld) obj3).c.c).a((ShortVideoGetChallengeResponseDto) obj2)), (a3p0.a.C2519a) obj);
            case 3:
                LayoutInflater layoutInflater = (LayoutInflater) obj3;
                saj.a aVar = (saj.a) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                return ((saj) obj4).i ? new o270(layoutInflater.inflate(R.layout.vkim_contacts_no_results_v2, viewGroup, false), aVar) : new p270(layoutInflater.inflate(R.layout.vkim_contacts_no_results, viewGroup, false), aVar);
            case 4:
                k6u k6uVar = (k6u) obj3;
                d7u d7uVar = (d7u) obj2;
                if (((CallProducerButton) obj4) != null) {
                    k6uVar.Y(d7uVar);
                }
                return s3q0.a;
            case 5:
                amu amuVar = (amu) obj4;
                Context context = amuVar.b;
                View view = (View) obj3;
                ImageList imageList = (ImageList) obj2;
                Throwable th = (Throwable) obj;
                if (sp.m(th)) {
                    ImageViewer imageViewer = amuVar.h;
                    List singletonList = Collections.singletonList(rwv.c(imageList));
                    bpn0 bpn0Var = enj.a;
                    ImageViewer.b(imageViewer, 0, singletonList, e3m.h(context), new bmu(view), false, null, 496);
                } else if (th instanceof UserProfileAvatarsInteractor.NoAvatarsException) {
                    edw edwVar = edw.a;
                    edw.g(R.string.vkim_chat_profile_no_photos, context);
                } else {
                    zk70.e(th);
                }
                return s3q0.a;
            case 6:
                nk40 nk40Var = (nk40) obj4;
                String str = (String) obj2;
                nk40Var.getClass();
                return Boolean.valueOf(k5a.b((UIBlockList) obj, new l14(str, nk40Var, (MusicTrack) obj3, 7)));
            case 7:
                int i2 = adk0.q;
                zck0 zck0Var = new zck0(((ViewGroup) obj).getContext());
                zck0Var.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
                return new adk0(zck0Var, (bgy) obj4, (kck0) obj3, (wck0) obj2);
            case 8:
                cgq0 cgq0Var = (cgq0) obj4;
                ImageView imageView = (ImageView) obj3;
                UserProfile userProfile = (UserProfile) obj2;
                if (!((pxo0) cgq0Var.x.getValue()).a()) {
                    imageView.setEnabled(false);
                    cgq0Var.v6(imageView.getContext(), userProfile, imageView);
                }
                return s3q0.a;
            case 9:
                com.vk.profile.user.impl.ui.g gVar = (com.vk.profile.user.impl.ui.g) obj2;
                ExtendedUserProfile extendedUserProfile = (ExtendedUserProfile) obj;
                ((fpq0) obj4).getClass();
                if (((UserProfileAction.x) obj3).c) {
                    ExtendedUserProfile extendedUserProfile2 = gVar.j;
                    extendedUserProfile.v1 = extendedUserProfile2 != null ? extendedUserProfile2.v1 : null;
                }
                return extendedUserProfile;
            case 10:
                izs izsVar = (izs) obj3;
                PostingVisibilityMode postingVisibilityMode = (PostingVisibilityMode) obj;
                VideoFileOld copy = ((ClipVideoFile) obj4).copy();
                copy.x0 = ((ClipEditComponent) ((kzq0) obj2).c.getValue()).d6().b(postingVisibilityMode);
                izsVar.invoke(Boolean.valueOf(postingVisibilityMode == PostingVisibilityMode.ALL));
                wjs0.a(new fyr0(copy));
                return s3q0.a;
            default:
                String str2 = (String) obj4;
                Post post = (Post) obj3;
                ej90.b bVar = (ej90.b) obj2;
                List<WallWallItemDto> e = ((WallGetByIdResponseDto) obj).e();
                WallWallItemDto wallWallItemDto = e != null ? (WallWallItemDto) j5g.a0(e) : null;
                WallWallItemDto.WallWallpostFullDto wallWallpostFullDto = wallWallItemDto instanceof WallWallItemDto.WallWallpostFullDto ? (WallWallItemDto.WallWallpostFullDto) wallWallItemDto : null;
                if (wallWallpostFullDto != null && (R1 = wallWallpostFullDto.R1()) != null) {
                    str2 = R1;
                }
                eax0.x(post, str2, bVar);
                return post;
        }
    }

    public /* synthetic */ sx4(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
