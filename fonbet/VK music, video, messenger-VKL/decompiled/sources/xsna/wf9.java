package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import com.facebook.soloader.MinElf;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.stickers.dto.StickersUnSubscribePackAuthorRefDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.fragments.internal.stack.FStack;
import com.vk.dto.articles.Article;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.hints.HintId;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.user.UserProfile;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.geo.impl.model.CameraBounds;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.api.di.NewsfeedRouterComponent;
import com.vk.profile.user.impl.ui.edit.cover.crop.CoverCropActivity;
import com.vk.search.params.impl.presentation.modal.education.mvi.model.a;
import com.vk.search.params.impl.presentation.modal.education.mvi.model.c;
import com.vk.stickers.details.fragment.StickerDetailsFragment;
import com.vk.tabbar.core.api.domain.TabbarState;
import com.vkontakte.android.attachments.NarrativeAttachment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.c8p;
import xsna.o0r0;
import xsna.q2b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class wf9 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ wf9(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                fh50 fh50Var = (fh50) obj;
                StringBuilder sb = new StringBuilder("unlock ");
                sb.append((CameraBounds) obj3);
                sb.append(" by ");
                sb.append(obj2);
                sb.append(", locks count = ");
                sb.append(fh50Var != null ? Integer.valueOf(fh50Var.b) : null);
                return sb.toString();
            case 1:
                return (q2b.b) ((l7r0) obj3).d((ij20) obj2, (q2b.a) obj);
            case 2:
                kbj0.e(((yah) obj3).d, (Context) obj2, new NarrativeAttachment((Narrative) obj), false, null, false, null, 60);
                return s3q0.a;
            case 3:
                agw agwVar = (agw) obj3;
                RectF rectF = (RectF) obj2;
                ls5 ls5Var = (ls5) obj;
                int i2 = CoverCropActivity.w;
                if (agwVar == null) {
                    return null;
                }
                if (rectF == null) {
                    return agwVar;
                }
                Bitmap a = ba2.a(agwVar);
                ls5Var.getClass();
                return new aa2(ls5.a(a, rectF));
            case 4:
                c8p c8pVar = (c8p) obj2;
                c.f fVar = (c.f) obj;
                c8p.b bVar = c8p.n1;
                dw20 dw20Var = (dw20) ((Ref$ObjectRef) obj3).element;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                c8pVar.getFeature().C(new a.i(fVar.a));
                return s3q0.a;
            case 5:
                FStack fStack = (FStack) obj3;
                FragmentEntry fragmentEntry = (FragmentEntry) obj2;
                com.vk.core.fragments.b bVar2 = (com.vk.core.fragments.b) obj;
                while (!fStack.c.isEmpty() && !epx.f(fStack.Cb(), fragmentEntry)) {
                    bVar2.K(fStack.Cb());
                    fStack.Ab();
                }
                return s3q0.a;
            case 6:
                eme0 eme0Var = (eme0) obj3;
                Activity activity = (Activity) obj;
                qkd0 qkd0Var = eme0Var.j;
                if (qkd0Var != null) {
                    qkd0Var.invoke();
                }
                if (obj2 instanceof UserProfile) {
                    xwk.e().m(activity, ((UserProfile) obj2).c, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                } else if (obj2 instanceof Group) {
                    xwk.e().m(activity, fkq0.e(((Group) obj2).c), new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                } else if (obj2 instanceof Post) {
                    NewsfeedRouter.E(((NewsfeedRouterComponent) ((k7m) m7m.f(com.vk.qrcode.d.b)).a(fpf0.a(NewsfeedRouterComponent.class))).l0(), activity, (NewsEntry) obj2, null, null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                } else if (obj2 instanceof Article) {
                    bpn0 bpn0Var = vtk0.c;
                    ((gq3) (bpn0Var != null ? bpn0Var : null).getValue()).b(activity, (Article) obj2);
                } else if (obj2 instanceof UsersUserFullDto) {
                    xwk.e().m(activity, ((UsersUserFullDto) obj2).s1(), new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                } else if (obj2 instanceof GroupsGroupFullDto) {
                    xwk.e().m(activity, fkq0.e(((GroupsGroupFullDto) obj2).P0()), new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                } else {
                    xwk.d().e().a(activity, eme0Var.r());
                }
                return s3q0.a;
            case 7:
                StickerStockItem stickerStockItem = (StickerStockItem) obj2;
                StickersUnSubscribePackAuthorRefDto stickersUnSubscribePackAuthorRefDto = (StickersUnSubscribePackAuthorRefDto) obj;
                int i3 = StickerDetailsFragment.h0;
                i3l0 i3l0Var = (i3l0) ((StickerDetailsFragment) obj3).S;
                if (i3l0Var != null) {
                    i3l0Var.W5(stickerStockItem, stickersUnSubscribePackAuthorRefDto);
                }
                return s3q0.a;
            case 8:
                vvn0 vvn0Var = (vvn0) obj3;
                UserId userId = (UserId) obj;
                wtn0 wtn0Var = vvn0Var.a;
                wtn0Var.d(TabbarState.a(wtn0Var.c(), (List) obj2), false);
                io.reactivex.rxjava3.subjects.f<s3q0> fVar2 = vvn0Var.j;
                s3q0 s3q0Var = s3q0.a;
                fVar2.onNext(s3q0Var);
                if (userId != null) {
                    wtn0Var.h(HintId.GROUP_MANAGED_GROUP.getId());
                }
                return s3q0Var;
            default:
                kbj0.e(((xsq0) obj3).a.d, (Context) obj2, new NarrativeAttachment((Narrative) obj), false, null, false, null, 60);
                return s3q0.a;
        }
    }
}
