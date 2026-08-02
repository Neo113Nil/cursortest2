package xsna;

import android.graphics.Bitmap;
import android.view.View;
import com.vk.api.generated.groups.dto.GroupsGetVideoLivesResponseDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.auth.loginconfirmation.VkLoginConfirmationStatusType;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchAuthorsListVh;
import com.vk.catalog2.feature.music.holders.vkmix.MusicVkMixVh;
import com.vk.catalog2.feature.music.holders.vkmix.SimpleMusicVkMixVh;
import com.vk.dto.common.data.VKList;
import com.vk.dto.newsfeed.Flags;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.dto.user.UserProfile;
import com.vk.friends.discover.UsersDiscoverFragment;
import com.vk.friends.discover.UsersDiscoverListView;
import com.vk.im.engine.models.events.OnCacheInvalidateEvent;
import com.vk.libvideo.impl.di.VideoApiHelperComponentImpl;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.view.MusicRoundPlayView;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.voip.ui.settings.participants_view.CallSettingsItem;
import com.vk.voip.ui.settings.participants_view.j;
import java.io.OutputStream;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$FloatRef;
import xsna.gm50;
import xsna.imw0;
import xsna.p7w0;
import xsna.pvc0;
import xsna.r4n0;
import xsna.tra0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class fuc0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fuc0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = 2;
        int i3 = 4;
        Object[] objArr = 0;
        int i4 = 1;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                Post post = (Post) obj2;
                Flags flags = post.l;
                UserProfile userProfile = (UserProfile) j5g.a0((VKList) obj);
                flags.Ab(70368744177664L, epx.f(userProfile != null ? userProfile.c : null, post.o.b));
                post.l.Ab(549755813888L, true);
                ce60.b.getClass();
                p870.f().e(156, post);
                break;
            case 1:
                pvc0.b bVar = (pvc0.b) obj2;
                pvc0.b.a(bVar, new k7z(pvc0.this, 29));
                break;
            case 2:
                e5d0 e5d0Var = (e5d0) obj2;
                sxp sxpVar = (sxp) obj;
                if ((sxpVar instanceof OnCacheInvalidateEvent) || (sxpVar instanceof p680)) {
                    e5d0Var.X0();
                } else if ((sxpVar instanceof ka80) && ((ka80) sxpVar).c.Bb(e5d0Var.i) != null) {
                    e5d0Var.X0();
                }
                break;
            case 3:
                w8d0 w8d0Var = (w8d0) obj2;
                rry rryVar = (rry) obj;
                rry.d(rryVar, w8d0Var.e0().a.size(), new bnc0(w8d0Var, i4), new jai(-1445771293, new u8d0(w8d0Var, objArr == true ? 1 : 0), true), 12);
                if (w8d0Var.e0().c) {
                    rry.j(rryVar, new kpr(19), new jai(323904407, new wg2(w8d0Var, i2), true), 5);
                }
                if (w8d0Var.e0().d) {
                    rry.j(rryVar, new b4r(27), new jai(-48377394, new x95(w8d0Var, i3), true), 5);
                }
                break;
            case 4:
                ((o5e0) obj2).b.onNext((i5e0) obj);
                break;
            case 5:
                ((Bitmap) obj2).compress(Bitmap.CompressFormat.PNG, 100, (OutputStream) obj);
                break;
            case 6:
                break;
            case 7:
                u1h0 u1h0Var = (u1h0) obj2;
                break;
            case 8:
                ((SearchAuthorsListVh.d) obj2).b.invoke();
                break;
            case 9:
                break;
            case 10:
                SimpleMusicVkMixVh simpleMusicVkMixVh = (SimpleMusicVkMixVh) obj2;
                ((View) obj).performHapticFeedback(0);
                MusicRoundPlayView musicRoundPlayView = simpleMusicVkMixVh.m;
                if (musicRoundPlayView == null) {
                    musicRoundPlayView = null;
                }
                MusicVkMixVh.h(simpleMusicVkMixVh, musicRoundPlayView.a(), null, new p1d0(simpleMusicVkMixVh, 14), 2);
                break;
            case 11:
                ((Ref$FloatRef) obj2).element = ((Float) obj).floatValue();
                break;
            case 12:
                com.vk.stories.design.view.stats.tabs.viewers.mvi.d dVar = (com.vk.stories.design.view.stats.tabs.viewers.mvi.d) obj2;
                StoryEntry storyEntry = (StoryEntry) obj;
                com.vk.lists.c cVar = dVar.i;
                eim0 eim0Var = dVar.h;
                int i5 = eim0Var.h;
                int i6 = storyEntry.c;
                if (i5 != i6) {
                    eim0Var.g = storyEntry.d;
                    eim0Var.h = i6;
                    cVar.o();
                    cVar.p(false);
                }
                break;
            case 13:
                StoryEntry storyEntry2 = (StoryEntry) obj2;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.LogType logType = L.LogType.d;
                    StringBuilder sb = new StringBuilder("error preload video=");
                    sb.append(storyEntry2.Kb());
                    sb.append(" | owner=");
                    StoryOwner storyOwner = storyEntry2.l0;
                    sb.append(storyOwner != null ? storyOwner.Db() : null);
                    L.u(l, logType, new Object[]{sb.toString()});
                }
                break;
            case 14:
                gzm0 gzm0Var = (gzm0) obj2;
                L.G(ms9.b("error: ", (Throwable) obj));
                gzm0Var.b.ko(gzm0Var.f);
                break;
            case 15:
                r4n0.b bVar2 = (r4n0.b) obj2;
                r4n0.b.a(bVar2, new afl0(r4n0.this, i3));
                break;
            case 16:
                ((zak0) ((e6p0) obj2).e).setValue((tho0) obj);
                break;
            case 17:
                tra0.a.x((tra0.a) obj, (tra0) obj2, 0, 0);
                break;
            case 18:
                jmq0 jmq0Var = (jmq0) obj2;
                jmq0Var.e.G();
                u5p0 u5p0Var = jmq0Var.i;
                if (u5p0Var == null) {
                    u5p0Var = null;
                }
                u5p0Var.invoke(new UserProfileAction.x(null, 15));
                break;
            case 19:
                ((mtq0) obj2).n.a(UserProfileAction.u.a.C1699a.b);
                break;
            case 20:
                UsersDiscoverListView usersDiscoverListView = ((UsersDiscoverFragment) obj2).U;
                if (usersDiscoverListView != null) {
                    usersDiscoverListView.a();
                }
                break;
            case 21:
                break;
            case 22:
                tvr0 tvr0Var = (tvr0) obj2;
                T t = tvr0Var.l;
                izs<? super com.vk.voip.ui.settings.participants_view.j, s3q0> izsVar = tvr0Var.m;
                if (t != 0 && izsVar != null) {
                    izsVar.invoke(new j.k(((CallSettingsItem.i) t).a));
                }
                break;
            case 23:
                VideoApiHelperComponentImpl.d dVar2 = ((com.vk.libvideo.a) obj2).c;
                List<VideoVideoFullDto> d = ((GroupsGetVideoLivesResponseDto) obj).d();
                EmptyList emptyList = EmptyList.b;
                break;
            case 24:
                hjs0 hjs0Var = (hjs0) obj2;
                List<atp> list = hjs0Var.a;
                ((nvy) obj).e(list.size(), new kjs0(new ltl0(9), list), new ljs0(list), new jai(802480018, new mjs0(list, hjs0Var), true));
                break;
            case 25:
                break;
            case 26:
                gzs gzsVar = (gzs) obj2;
                xgx0.a.getClass();
                xgx0.d((Throwable) obj);
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                break;
            case 27:
                vgg vggVar = (vgg) obj;
                Throwable th = vggVar.a;
                v2v0 v2v0Var = (v2v0) ((a3v0) obj2).a;
                if (v2v0Var != null) {
                    v2v0Var.oa(VkLoginConfirmationStatusType.ERROR_ALLOW);
                }
                par0.a.getClass();
                par0.d(th);
                vggVar.c();
                break;
            case 28:
                ((m6w0) obj2).T((p7w0.d.b) obj);
                break;
            default:
                ylw0 ylw0Var = (ylw0) obj2;
                int i7 = ylw0.x1;
                gm50.a.a(ylw0Var, ((imw0.b) obj).a, new rtg0(ylw0Var, 28));
                break;
        }
        return s3q0.a;
    }
}
