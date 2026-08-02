package xsna;

import android.content.Intent;
import android.view.ViewGroup;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.core.view.ProgressButton;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.dto.clips.exceptions.ClipNotFoundException;
import com.vk.dto.music.MusicDynamicRestriction;
import com.vk.home.HomeFragment2;
import com.vk.im.ui.components.viewcontrollers.msg_list_empty.b;
import com.vk.media.MediaFilteringStrategy;
import com.vk.newsfeed.impl.presentation.postponed.presentation.fragment.PostponedPostsFragment;
import com.vk.newsfeed.impl.recycler.decorations.components.on_media_like.OnMediaUiComponentAnimationDelegate;
import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import com.vk.profile.core.content.ProfileOnboardingBanner;
import com.vk.profile.user.impl.ui.b;
import com.vk.stickers.settings.b;
import com.vk.superapp.browser.internal.ui.menu.action.j;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.NewsfeedSettingsFragment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.b7c0;
import xsna.cf70;
import xsna.dda0;
import xsna.dz40;
import xsna.e9j0;
import xsna.gbc0;
import xsna.gm50;
import xsna.nnj0;
import xsna.o880;
import xsna.p4g;
import xsna.q55;
import xsna.qs80;
import xsna.tj50;
import xsna.tzp0;
import xsna.wi50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class nl30 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nl30(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ru40 ru40Var;
        int i = 5;
        int i2 = 25;
        int i3 = 14;
        Object[] objArr = 0;
        int i4 = 1;
        switch (this.b) {
            case 0:
                com.vk.im.ui.components.viewcontrollers.msg_list_empty.a aVar = (com.vk.im.ui.components.viewcontrollers.msg_list_empty.a) this.c;
                aVar.e(new b.f(aVar.a.getString(R.string.vkm_how_to_create_post_link)));
                return s3q0.a;
            case 1:
                Intent intent = (Intent) obj;
                int i5 = ((u440) this.c).j.x().k.j ? 111 : Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE;
                intent.putExtra("camera_enabled", false);
                intent.putExtra("media_type", i5);
                intent.putExtra("video_max_length_ms", TimeUnit.MINUTES.toMillis(3L));
                intent.putExtra("video_filtering_mode", MediaFilteringStrategy.VIDEO_AVC);
                intent.putExtra("selection_limit", 1);
                intent.putExtra("long_previews", true);
                intent.putExtra("short_divider", true);
                intent.putExtra("prevent_styling_photo", false);
                intent.putExtra("single_mode", true);
                return s3q0.a;
            case 2:
                ((qd40) this.c).getClass();
                return s3q0.a;
            case 3:
                MusicDynamicRestriction musicDynamicRestriction = (MusicDynamicRestriction) this.c;
                w9y w9yVar = (w9y) obj;
                w9yVar.e(musicDynamicRestriction.b, "title");
                w9yVar.e(musicDynamicRestriction.h, "text");
                w9yVar.e(musicDynamicRestriction.c.Gb(), "icons");
                w9yVar.e(musicDynamicRestriction.d, "text");
                w9y w9yVar2 = new w9y();
                w9yVar2.e(musicDynamicRestriction.e, "title");
                w9y w9yVar3 = new w9y();
                w9yVar3.e(musicDynamicRestriction.f, "url");
                w9yVar3.e(musicDynamicRestriction.g, "type");
                s3q0 s3q0Var = s3q0.a;
                w9yVar2.e(w9yVar3.a, "action");
                w9yVar.e(w9yVar2.a, "button");
                return s3q0.a;
            case 4:
                rt40 rt40Var = (rt40) this.c;
                tzp0.c.a aVar2 = rt40.s1;
                if (((MusicDto) obj).l && (ru40Var = rt40Var.k1) != null) {
                    ru40Var.i();
                }
                return s3q0.a;
            case 5:
                tj50.a aVar3 = (tj50.a) obj;
                djb0 djb0Var = ((my40) this.c).g;
                djb0Var.getClass();
                yib0 yib0Var = yib0.b;
                ao8 ao8Var = ao8.d;
                int i6 = 12;
                return new dz40.p(new dz40.f(aVar3.a(yib0Var, ao8Var), aVar3.a(zib0.b, ao8Var), aVar3.a(ajb0.b, ao8Var), aVar3.a(bjb0.b, ao8Var), aVar3.a(new kpr(17), ao8Var), aVar3.a(new zsw(i6), ao8Var), aVar3.a(new b4r(i2), ao8Var), aVar3.a(new uuz(i6), ao8Var), aVar3.a(cjb0.b, ao8Var)), aVar3.a(new uib0(1, djb0Var, djb0.class, "composeCovers", "composeCovers(Lcom/vk/music/stickyplayer/mvi/MusicPlayerState;)Lcom/vk/music/stickyplayer/mvi/MusicPlayerViewState$Covers;", 0), ao8Var), aVar3.a(new xmz(22), ao8Var), aVar3.a(new h2w(djb0Var, 20), ao8Var), aVar3.a(new oi40(7), ao8Var), aVar3.a(new vib0(1, djb0Var, djb0.class, "composeChips", "composeChips-SLYZRjA(Lcom/vk/music/stickyplayer/mvi/MusicPlayerState;)Ljava/util/Set;", 0), ao8Var), new dz40.m(aVar3.a(new per(21), ao8Var), aVar3.a(new viu(i3), ao8Var)), aVar3.a(new wib0(1, djb0Var, djb0.class, "composePlaybackQueue", "composePlaybackQueue(Lcom/vk/music/stickyplayer/mvi/MusicPlayerState;)Lcom/vk/music/stickyplayer/mvi/MusicPlayerViewState$PlaybackQueueData$Podcast;", 0), ao8Var), aVar3.a(xib0.b, ao8Var), aVar3.a(tib0.b, ao8Var));
            case 6:
                ((wi50) this.c).c(null);
                return s3q0.a;
            case 7:
                vbv vbvVar = ((ec60) this.c).h;
                if (vbvVar != null) {
                    NewsfeedSettingsFragment.a aVar4 = new NewsfeedSettingsFragment.a();
                    HomeFragment2 homeFragment2 = vbvVar.a;
                    aVar4.l(homeFragment2);
                    VkContextMenu vkContextMenu = homeFragment2.Y;
                    if (vkContextMenu != null) {
                        vkContextMenu.b();
                    }
                }
                return s3q0.a;
            case 8:
                ((fx60) this.c).a((ey60) obj);
                return s3q0.a;
            case 9:
                ((qe70) this.c).T(cf70.j.b);
                return s3q0.a;
            case 10:
                com.vk.newsfeed.impl.recycler.decorations.components.on_media_like.a aVar5 = (com.vk.newsfeed.impl.recycler.decorations.components.on_media_like.a) this.c;
                OnMediaUiComponentAnimationDelegate onMediaUiComponentAnimationDelegate = aVar5.y;
                o880 o880Var = (o880) obj;
                if (o880Var instanceof o880.b) {
                    boolean z = ((o880.b) o880Var).a;
                    if (z && aVar5.d) {
                        OnMediaUiComponentAnimationDelegate.c(onMediaUiComponentAnimationDelegate, OnMediaUiComponentAnimationDelegate.AnimationType.DISAPPEAR, new da50(aVar5, i), 2);
                    } else if (!z && !aVar5.d) {
                        OnMediaUiComponentAnimationDelegate.c(onMediaUiComponentAnimationDelegate, OnMediaUiComponentAnimationDelegate.AnimationType.APPEAR, new f880(aVar5, objArr == true ? 1 : 0), 2);
                    }
                } else {
                    if (!(o880Var instanceof o880.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    onMediaUiComponentAnimationDelegate.b(((o880.a) o880Var).a, true);
                }
                return s3q0.a;
            case 11:
                return new rm90((ViewGroup) obj, ((vm90) this.c).i);
            case 12:
                return Boolean.valueOf(((ckv) obj) == ((ckv) this.c));
            case 13:
                ((hca0) this.c).j.b(new dda0.d((Throwable) obj));
                return s3q0.a;
            case 14:
                ((l6c0) this.c).c(z4c0.a);
                return s3q0.a;
            case 15:
                f7c0 f7c0Var = (f7c0) this.c;
                e7c0 e7c0Var = f7c0Var.m;
                b7c0.e eVar = f7c0Var.n;
                e7c0Var.h((eVar != null ? eVar : null).b);
                return s3q0.a;
            case 16:
                ArrayList arrayList = (ArrayList) this.c;
                gbc0.a aVar6 = (gbc0.a) obj;
                int i7 = aVar6.a;
                int i8 = aVar6.b;
                if (i7 != 0 && i8 != 0) {
                    StringBuilder a = vq.a("photo", i8, '_');
                    a.append(aVar6.a);
                    a.append('_');
                    a.append(aVar6.c);
                    arrayList.add(a.toString());
                }
                return arrayList;
            case 17:
                PostponedPostsFragment postponedPostsFragment = (PostponedPostsFragment) this.c;
                gom0 gom0Var = (gom0) obj;
                qcy<Object>[] qcyVarArr = PostponedPostsFragment.q0;
                gom0.a(gom0Var, orc0.b, new aza(postponedPostsFragment, 8));
                int i9 = 6;
                gom0.a(gom0Var, prc0.b, new y5(postponedPostsFragment, i9));
                gom0.a(gom0Var, qrc0.b, new z5(postponedPostsFragment, i9));
                gom0.a(gom0Var, rrc0.b, new m00(postponedPostsFragment, i));
                gom0.a(gom0Var, src0.b, new w5h(postponedPostsFragment, i9));
                return s3q0.a;
            case 18:
                List<UsersUserFullDto> list = (List) obj;
                j2r0 j2r0Var = ((aed0) this.c).f;
                ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
                for (UsersUserFullDto usersUserFullDto : list) {
                    j2r0Var.getClass();
                    arrayList2.add(j2r0.a(usersUserFullDto));
                }
                return arrayList2;
            case 19:
                gzs<s3q0> gzsVar = ((ProfileOnboardingBanner) this.c).c;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 20:
                c5e0 c5e0Var = (c5e0) this.c;
                if (((Boolean) obj).booleanValue()) {
                    izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar = c5e0Var.e;
                    (izsVar != null ? izsVar : null).invoke(b.b0.b);
                }
                return s3q0.a;
            case 21:
                j.a aVar7 = (j.a) this.c;
                com.vk.superapp.browser.internal.ui.menu.action.i iVar = aVar7.m;
                if (iVar != null) {
                    aVar7.l.e(iVar);
                }
                return s3q0.a;
            case 22:
                io.reactivex.rxjava3.core.w wVar = (io.reactivex.rxjava3.core.w) this.c;
                Throwable th = (Throwable) obj;
                if (!h03.a(th)) {
                    return io.reactivex.rxjava3.core.q.H(th);
                }
                com.vk.core.utils.newtork.b.a.getClass();
                return com.vk.core.utils.newtork.b.f().a0(wVar);
            case 23:
                ixi0 ixi0Var = (ixi0) this.c;
                int i10 = r9i0.j1;
                ixi0Var.j = (Integer) obj;
                return s3q0.a;
            case 24:
                w8j0 w8j0Var = (w8j0) this.c;
                e9j0.a aVar8 = (e9j0.a) obj;
                gm50.a.a(w8j0Var, aVar8.a, new ie90(w8j0Var, i3));
                gm50.a.a(w8j0Var, aVar8.b, new lxh0(w8j0Var, i4));
                gm50.a.a(w8j0Var, aVar8.c, new o440(w8j0Var, i2));
                return s3q0.a;
            case 25:
                ((znj0) this.c).j(new nnj0.c((String) obj));
                return s3q0.a;
            case 26:
                yp80 yp80Var = (yp80) this.c;
                qs80 qs80Var = (qs80) obj;
                if (qs80Var instanceof qs80.c) {
                    if (yp80Var != null) {
                        yp80Var.onSuccess();
                    }
                } else if (qs80Var instanceof qs80.a) {
                    enj.q(R.string.clip_load_failed_error_toast_text, 0, vx2.d.getContext());
                    if (yp80Var != null) {
                        yp80Var.onError(new ClipNotFoundException(((qs80.a) qs80Var).a));
                    }
                } else if (yp80Var != null) {
                    yp80Var.U();
                }
                return s3q0.a;
            case 27:
                o6k0 o6k0Var = (o6k0) this.c;
                c0c c0cVar = (c0c) obj;
                q55 q55Var = q55.a;
                List y0 = j5g.y0(q55.b);
                q55.b bVar = new q55.b(par0.a);
                p4g.a aVar9 = p4g.a;
                Iterator it = y0.iterator();
                while (it.hasNext()) {
                    try {
                        ((s25) it.next()).b(c0cVar.a);
                        s3q0 s3q0Var2 = s3q0.a;
                    } catch (Throwable th2) {
                        bVar.invoke(th2);
                    }
                }
                l6k0 l6k0Var = (l6k0) o6k0Var.a;
                if (l6k0Var != null) {
                    l6k0Var.onSuccess();
                }
                return s3q0.a;
            case 28:
                return new pux0((ViewGroup) obj, (k8l0) this.c);
            default:
                fcl0 fcl0Var = (fcl0) this.c;
                ProgressButton progressButton = fcl0Var.m;
                progressButton.S(true);
                progressButton.setEnabled(false);
                fcl0Var.l.a.c.invoke(b.k.b);
                return s3q0.a;
        }
    }

    public /* synthetic */ nl30(wi50 wi50Var, wi50.a aVar) {
        this.b = 6;
        this.c = wi50Var;
    }
}
