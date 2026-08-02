package xsna;

import android.content.Context;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.owners.dto.OwnersAddToMainTabItemTypeDto;
import com.vk.api.generated.owners.dto.OwnersPinToMainTabItemTypeDto;
import com.vk.api.generated.owners.dto.OwnersRemoveFromMainTabItemTypeDto;
import com.vk.api.generated.owners.dto.OwnersUnpinFromMainTabItemTypeDto;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Good;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.photo.Photo;
import com.vk.dto.reactions.ItemReactions;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.dto.user.ObsceneTextFilter;
import com.vk.dto.user.UserProfile;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.newsfeed.common.domain.model.AddLikeAction;
import com.vk.newsfeed.common.domain.model.LikableItemType;
import com.vk.newsfeed.impl.domain.model.ActionWithOfflineSupportType;
import com.vkontakte.android.attachments.MarketAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PostInteractorWithOfflineSupport.kt */
/* loaded from: classes4.dex */
public final class h4c0 implements d4c0 {
    public final cax0 a;
    public final v30 b;
    public final f4c0 c;
    public final d2f0 d = new d2f0();
    public final CopyOnWriteArrayList<Long> e = new CopyOnWriteArrayList<>();
    public volatile boolean f;

    /* compiled from: PostInteractorWithOfflineSupport.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ActionWithOfflineSupportType.values().length];
            try {
                iArr[ActionWithOfflineSupportType.ADD_LIKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ActionWithOfflineSupportType.DELETE_LIKE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public h4c0(eax0 eax0Var, v30 v30Var, w50 w50Var, f4c0 f4c0Var) {
        this.a = eax0Var;
        this.b = v30Var;
        this.c = f4c0Var;
        w50Var.a();
    }

    @Override // xsna.d4c0
    public final io.reactivex.rxjava3.core.x<Post> a(Post post, String str, ObsceneTextFilter obsceneTextFilter, String str2) {
        return this.a.a(post, str, obsceneTextFilter, str2);
    }

    @Override // xsna.d4c0
    public final io.reactivex.rxjava3.core.a b(String str, UserId userId, OwnersPinToMainTabItemTypeDto ownersPinToMainTabItemTypeDto) {
        return this.a.b(str, userId, ownersPinToMainTabItemTypeDto);
    }

    @Override // xsna.d4c0
    public final io.reactivex.rxjava3.core.a c(String str, UserId userId, OwnersUnpinFromMainTabItemTypeDto ownersUnpinFromMainTabItemTypeDto) {
        return this.a.c(str, userId, ownersUnpinFromMainTabItemTypeDto);
    }

    @Override // xsna.d4c0
    public final io.reactivex.rxjava3.core.a d(Post post) {
        return this.a.d(post);
    }

    @Override // xsna.d4c0
    public final io.reactivex.rxjava3.core.x<Post> e(Post post, z6c0 z6c0Var) {
        return this.a.e(post, z6c0Var);
    }

    @Override // xsna.d4c0
    public final io.reactivex.rxjava3.core.a f(String str, UserId userId, OwnersAddToMainTabItemTypeDto ownersAddToMainTabItemTypeDto) {
        return this.a.f(str, userId, ownersAddToMainTabItemTypeDto);
    }

    @Override // xsna.d4c0
    public final io.reactivex.rxjava3.core.a g(Post post) {
        return this.a.g(post);
    }

    @Override // xsna.d4c0
    public final io.reactivex.rxjava3.core.a h(NewsEntry newsEntry, z6c0 z6c0Var) {
        return this.a.h(newsEntry, z6c0Var);
    }

    @Override // xsna.d4c0
    public final io.reactivex.rxjava3.core.a i(String str, UserId userId, OwnersRemoveFromMainTabItemTypeDto ownersRemoveFromMainTabItemTypeDto) {
        return this.a.i(str, userId, ownersRemoveFromMainTabItemTypeDto);
    }

    @Override // xsna.d4c0
    public final io.reactivex.rxjava3.core.x<BaseOkResponseDto> j(UserId userId, UserId userId2) {
        return this.a.j(userId, userId2);
    }

    @Override // xsna.d4c0
    public final io.reactivex.rxjava3.core.a k(UserId userId, String str) {
        return this.a.k(userId, str);
    }

    @Override // xsna.d4c0
    public final io.reactivex.rxjava3.core.a l(int i, UserId userId, UserId userId2) {
        return this.a.l(i, userId, userId2);
    }

    @Override // xsna.d4c0
    public final io.reactivex.rxjava3.core.x<List<Post>> m(List<String> list) {
        return this.a.m(list);
    }

    @Override // xsna.d4c0
    public final io.reactivex.rxjava3.core.a n(int i, UserId userId, UserId userId2) {
        return this.a.n(i, userId, userId2);
    }

    @Override // xsna.d4c0
    public final io.reactivex.rxjava3.core.a o(UserId userId, String str) {
        return this.a.o(userId, str);
    }

    @Override // xsna.d4c0
    public final io.reactivex.rxjava3.core.x p(String str, Post post) {
        return this.a.p(str, post);
    }

    @Override // xsna.d4c0
    public final io.reactivex.rxjava3.core.a q(Post post) {
        return this.a.q(post);
    }

    @Override // xsna.d4c0
    public final io.reactivex.rxjava3.core.a r(Post post) {
        return this.a.r(post);
    }

    @Override // xsna.d4c0
    public final io.reactivex.rxjava3.core.a s(Post post) {
        return this.a.s(post);
    }

    @Override // xsna.d4c0
    public final io.reactivex.rxjava3.core.a t(Post post) {
        return this.a.t(post);
    }

    @Override // xsna.d4c0
    public final io.reactivex.rxjava3.core.x u(String str, Post post) {
        return this.a.u(str, post);
    }

    @Override // xsna.d4c0
    public final io.reactivex.rxjava3.core.x<VKList<UserProfile>> v(UserId userId, UserId userId2) {
        return this.a.v(userId, userId2);
    }

    @Override // xsna.d4c0
    public final void w(Context context, String str) {
        this.c.w(context, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x04f5  */
    @Override // xsna.d4c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final io.reactivex.rxjava3.disposables.c x(final l6z l6zVar, final mm1 mm1Var, final d9j d9jVar) {
        AddLikeAction.TriggerType triggerType;
        int i;
        Object addLikeAction;
        VideoFile videoFile;
        Photo photo;
        Object obj;
        Object dvlVar;
        VideoFile videoFile2;
        Photo photo2;
        PhotoAttachment Mb;
        Photo photo3;
        L l = L.a;
        l.getClass();
        LoggerOutputTarget loggerOutputTarget = LoggerOutputTarget.NONE;
        if (!L.m(loggerOutputTarget)) {
            L.u(l, L.LogType.i, new Object[]{"Offline:PostInteractorWithOfflineSupport", "Like call."});
        }
        if (this.f) {
            l.getClass();
            if (!L.m(loggerOutputTarget)) {
                L.u(l, L.LogType.w, new Object[]{"Offline:PostInteractorWithOfflineSupport", "Use network fallback."});
            }
            return this.c.x(l6zVar, mm1Var, d9jVar);
        }
        if (!o25.a().b()) {
            d9jVar.invoke(new IllegalStateException("User is not logged in"));
            l.getClass();
            if (!L.m(loggerOutputTarget)) {
                L.u(l, L.LogType.e, new Object[]{"Offline:PostInteractorWithOfflineSupport", "Like called but user is logged out."});
            }
            return EmptyDisposable.INSTANCE;
        }
        c6z c6zVar = l6zVar.a;
        ReactionMeta reactionMeta = l6zVar.c;
        c6zVar.T9();
        o2f0 o2f0Var = c6zVar instanceof o2f0 ? (o2f0) c6zVar : null;
        ItemReactions K = o2f0Var != null ? o2f0Var.K() : null;
        Integer num = K != null ? K.e : null;
        if (num != null && o2f0Var != null) {
            o2f0Var.e(num.intValue());
        }
        Integer valueOf = reactionMeta != null ? Integer.valueOf(reactionMeta.getId()) : null;
        if (valueOf != null && o2f0Var != null) {
            o2f0Var.e(valueOf.intValue());
        }
        c6zVar.J();
        d2f0 d2f0Var = this.d;
        c6z c6zVar2 = l6zVar.a;
        boolean z = l6zVar.b;
        ReactionMeta reactionMeta2 = l6zVar.c;
        d2f0Var.getClass();
        d2f0.a(c6zVar2, z, reactionMeta2);
        l6zVar.a.J();
        ce60.b.getClass();
        p870.f().d(102, 100, (NewsEntry) l6zVar.a);
        c6z c6zVar3 = l6zVar.a;
        if ((c6zVar3 instanceof Photos) && (Mb = ((Photos) c6zVar3).Mb()) != null && (photo3 = Mb.l) != null) {
            p870.f().e(113, photo3);
        }
        if (!this.e.addIfAbsent(Long.valueOf(l6zVar.a.hashCode()))) {
            l.getClass();
            if (!L.m(loggerOutputTarget)) {
                L.u(l, L.LogType.i, new Object[]{"Offline:PostInteractorWithOfflineSupport", "This like is already being processed."});
            }
            return EmptyDisposable.INSTANCE;
        }
        String str = l6zVar.f;
        c6z c6zVar4 = l6zVar.a;
        AddLikeAction.TriggerType triggerType2 = AddLikeAction.TriggerType.BUTTON;
        if (!epx.f(str, triggerType2.h())) {
            triggerType2 = AddLikeAction.TriggerType.DOUBLE_TAP;
            if (!epx.f(str, triggerType2.h())) {
                triggerType2 = AddLikeAction.TriggerType.REACTIONS_MODAL;
                if (!epx.f(str, triggerType2.h())) {
                    triggerType2 = AddLikeAction.TriggerType.REACTIONS_POPUP;
                    if (!epx.f(str, triggerType2.h())) {
                        triggerType = null;
                        ActionWithOfflineSupportType actionWithOfflineSupportType = !l6zVar.b ? ActionWithOfflineSupportType.ADD_LIKE : ActionWithOfflineSupportType.DELETE_LIKE;
                        i = a.$EnumSwitchMapping$0[actionWithOfflineSupportType.ordinal()];
                        if (i == 1) {
                            if (i != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            String str2 = l6zVar.d;
                            String str3 = l6zVar.e;
                            if (str3 == null) {
                                str3 = l6zVar.a.r();
                            }
                            String str4 = str3;
                            if (c6zVar4 instanceof Post) {
                                Post post = (Post) c6zVar4;
                                boolean hc = post.hc();
                                int i2 = post.n;
                                ArrayList<EntryAttachment> arrayList = post.z;
                                if (hc) {
                                    if (post.u == null) {
                                        l.getClass();
                                        if (!L.m(loggerOutputTarget)) {
                                            L.u(l, L.LogType.w, new Object[]{"Offline:PostInteractorWithOfflineSupport", "Likable is comment but has no reply ID."});
                                        }
                                        obj = null;
                                    } else {
                                        dvlVar = new dvl(LikableItemType.COMMENT, r5.intValue(), post.m, null, str2, str4);
                                    }
                                } else if (post.lc()) {
                                    EntryAttachment entryAttachment = (EntryAttachment) j5g.a0(arrayList);
                                    Attachment attachment = entryAttachment != null ? entryAttachment.b : null;
                                    if (attachment != null && arrayList.size() == 1 && (attachment instanceof MarketAttachment)) {
                                        Good good = ((MarketAttachment) attachment).f;
                                        dvlVar = new dvl(LikableItemType.MARKET, good.b, good.c, null, str2, str4);
                                    } else {
                                        l.getClass();
                                        if (!L.m(loggerOutputTarget)) {
                                            L.u(l, L.LogType.e, new Object[]{"Offline:PostInteractorWithOfflineSupport", "Can't like post as market because it does not satisfy the contract: " + post});
                                        }
                                        dvlVar = new dvl(LikableItemType.POST, i2, post.m, null, str2, str4);
                                    }
                                } else {
                                    dvlVar = new dvl(LikableItemType.POST, i2, post.m, null, str2, str4);
                                }
                                obj = dvlVar;
                            } else if (c6zVar4 instanceof Photos) {
                                Photos photos = (Photos) c6zVar4;
                                PhotoAttachment Mb2 = photos.Mb();
                                if (Mb2 == null || (photo2 = Mb2.l) == null) {
                                    l.getClass();
                                    if (!L.m(loggerOutputTarget)) {
                                        L.u(l, L.LogType.w, new Object[]{"Offline:PostInteractorWithOfflineSupport", efz.b(photos.n, ") but first photo is null.", new StringBuilder("Likable is photos (sourceId="))});
                                    }
                                    obj = null;
                                } else {
                                    dvlVar = new dvl(LikableItemType.PHOTO, photo2.c, photo2.e, null, str2, str4);
                                    obj = dvlVar;
                                }
                            } else if (c6zVar4 instanceof Videos) {
                                Videos videos = (Videos) c6zVar4;
                                VideoAttachment Nb = videos.Nb();
                                if (Nb == null || (videoFile2 = Nb.k) == null) {
                                    l.getClass();
                                    if (!L.m(loggerOutputTarget)) {
                                        L.u(l, L.LogType.w, new Object[]{"Offline:PostInteractorWithOfflineSupport", efz.b(videos.l, ") but first video is null.", new StringBuilder("Likable is videos (sourceId="))});
                                    }
                                    obj = null;
                                } else {
                                    dvlVar = new dvl(LikableItemType.VIDEO, videoFile2.o0(), videoFile2.I0(), null, str2, str4);
                                    obj = dvlVar;
                                }
                            } else if (c6zVar4 instanceof PromoPost) {
                                dvlVar = new dvl(LikableItemType.POST, r2.n, ((PromoPost) c6zVar4).n.m, null, str2, str4);
                                obj = dvlVar;
                            } else {
                                l.getClass();
                                if (!L.m(loggerOutputTarget)) {
                                    L.u(l, L.LogType.w, new Object[]{"Offline:PostInteractorWithOfflineSupport", i5s.a(new StringBuilder("Likable ("), c6zVar4 instanceof VideoFile ? "video file" : "unknown type", ") is not supported.")});
                                }
                                obj = null;
                            }
                            if (obj == null) {
                                v30 v30Var = this.b;
                                v30Var.getClass();
                                return new io.reactivex.rxjava3.internal.operators.single.v(new t30(v30Var, obj, actionWithOfflineSupportType, 0)).q(v30Var.d).q(io.reactivex.rxjava3.schedulers.a.b()).m(io.reactivex.rxjava3.android.schedulers.a.b()).h(new afs(new com.vk.movika.sdk.base.logic.processor.d(26, this, l6zVar), 17)).n(new io.reactivex.rxjava3.core.b0() { // from class: xsna.g4c0
                                    @Override // io.reactivex.rxjava3.core.b0
                                    public final void subscribe(io.reactivex.rxjava3.core.z zVar) {
                                        h4c0.this.c.x(l6zVar, mm1Var, d9jVar);
                                    }
                                }).subscribe(new zyu(new qt5(this, l6zVar, mm1Var), 20), new o060(new k220(12), 7));
                            }
                            l.getClass();
                            if (!L.m(loggerOutputTarget)) {
                                L.u(l, L.LogType.w, new Object[]{"Offline:PostInteractorWithOfflineSupport", "No like action to be saved."});
                            }
                            return EmptyDisposable.INSTANCE;
                        }
                        ReactionMeta reactionMeta3 = l6zVar.c;
                        Integer valueOf2 = reactionMeta3 != null ? Integer.valueOf(reactionMeta3.getId()) : null;
                        String str5 = l6zVar.d;
                        Integer num2 = valueOf2;
                        String str6 = l6zVar.e;
                        if (str6 == null) {
                            str6 = l6zVar.a.r();
                        }
                        String str7 = str6;
                        if (c6zVar4 instanceof Post) {
                            Post post2 = (Post) c6zVar4;
                            boolean hc2 = post2.hc();
                            int i3 = post2.n;
                            ArrayList<EntryAttachment> arrayList2 = post2.z;
                            if (hc2) {
                                if (post2.u == null) {
                                    l.getClass();
                                    if (!L.m(loggerOutputTarget)) {
                                        L.u(l, L.LogType.w, new Object[]{"Offline:PostInteractorWithOfflineSupport", "Likable is comment but has no reply ID."});
                                    }
                                    obj = null;
                                } else {
                                    addLikeAction = new AddLikeAction(LikableItemType.COMMENT, r3.intValue(), post2.m, num2, null, str5, str7, triggerType);
                                }
                            } else if (post2.lc()) {
                                EntryAttachment entryAttachment2 = (EntryAttachment) j5g.a0(arrayList2);
                                Attachment attachment2 = entryAttachment2 != null ? entryAttachment2.b : null;
                                if (attachment2 != null && arrayList2.size() == 1 && (attachment2 instanceof MarketAttachment)) {
                                    Good good2 = ((MarketAttachment) attachment2).f;
                                    addLikeAction = new AddLikeAction(LikableItemType.MARKET, good2.b, good2.c, num2, null, str5, str7, triggerType);
                                } else {
                                    l.getClass();
                                    if (!L.m(loggerOutputTarget)) {
                                        L.u(l, L.LogType.e, new Object[]{"Offline:PostInteractorWithOfflineSupport", "Can't like post as market because it does not satisfy the contract: " + post2});
                                    }
                                    addLikeAction = new AddLikeAction(LikableItemType.POST, i3, post2.m, num2, null, str5, str7, triggerType);
                                }
                            } else {
                                addLikeAction = new AddLikeAction(LikableItemType.POST, i3, post2.m, num2, null, str5, str7, triggerType);
                            }
                            obj = addLikeAction;
                        } else if (c6zVar4 instanceof Photos) {
                            Photos photos2 = (Photos) c6zVar4;
                            PhotoAttachment Mb3 = photos2.Mb();
                            if (Mb3 == null || (photo = Mb3.l) == null) {
                                l.getClass();
                                if (!L.m(loggerOutputTarget)) {
                                    L.u(l, L.LogType.w, new Object[]{"Offline:PostInteractorWithOfflineSupport", efz.b(photos2.n, ") but first photo is null.", new StringBuilder("Likable is photos (sourceId="))});
                                }
                                obj = null;
                            } else {
                                addLikeAction = new AddLikeAction(LikableItemType.PHOTO, photo.c, photo.e, num2, photo.v, str5, str7, triggerType);
                                obj = addLikeAction;
                            }
                        } else if (c6zVar4 instanceof Videos) {
                            Videos videos2 = (Videos) c6zVar4;
                            VideoAttachment Nb2 = videos2.Nb();
                            if (Nb2 == null || (videoFile = Nb2.k) == null) {
                                l.getClass();
                                if (!L.m(loggerOutputTarget)) {
                                    L.u(l, L.LogType.w, new Object[]{"Offline:PostInteractorWithOfflineSupport", efz.b(videos2.l, ") but first video is null.", new StringBuilder("Likable is videos (sourceId="))});
                                }
                                obj = null;
                            } else {
                                addLikeAction = new AddLikeAction(LikableItemType.VIDEO, videoFile.o0(), videoFile.I0(), num2, videoFile.C1(), str5, str7, triggerType);
                                obj = addLikeAction;
                            }
                        } else if (c6zVar4 instanceof PromoPost) {
                            addLikeAction = new AddLikeAction(LikableItemType.POST, r2.n, ((PromoPost) c6zVar4).n.m, num2, null, str5, str7, triggerType);
                            obj = addLikeAction;
                        } else {
                            l.getClass();
                            if (!L.m(loggerOutputTarget)) {
                                L.u(l, L.LogType.w, new Object[]{"Offline:PostInteractorWithOfflineSupport", i5s.a(new StringBuilder("Likable ("), c6zVar4 instanceof VideoFile ? "video file" : "unknown type", ") is not supported.")});
                            }
                            obj = null;
                        }
                        if (obj == null) {
                        }
                    }
                }
            }
        }
        triggerType = triggerType2;
        if (!l6zVar.b) {
        }
        i = a.$EnumSwitchMapping$0[actionWithOfflineSupportType.ordinal()];
        if (i == 1) {
        }
    }

    @Override // xsna.d4c0
    public final io.reactivex.rxjava3.core.x y(String str, Post post) {
        return this.a.p(str, post);
    }
}
