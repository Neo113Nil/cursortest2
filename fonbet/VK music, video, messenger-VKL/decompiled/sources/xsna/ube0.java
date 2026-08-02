package xsna;

import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Size;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.newsfeed.posting.additional_settings.domain.model.author.WallOwner;
import com.vk.newsfeed.posting.api.model.PostingMetricsEntryPoint;
import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;
import com.vk.newsfeed.posting.impl.domain.model.LinksParsingMetaData;
import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;
import com.vk.newsfeed.posting.impl.domain.model.PostEditingReason;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingContext;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.domain.model.PublicationState;
import com.vk.newsfeed.posting.impl.domain.model.StoryRepostData;
import com.vk.newsfeed.posting.impl.domain.model.e;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageButton;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageIcon;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageText;
import com.vk.newsfeed.posting.impl.presentation.model.CoauthorDto;
import com.vk.newsfeed.posting.impl.presentation.model.GroupWallPostingSettings;
import com.vk.newsfeed.posting.impl.presentation.model.PhotoDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment;
import com.vk.newsfeed.posting.impl.presentation.model.PostingSettings;
import com.vk.newsfeed.posting.impl.presentation.model.UserWallPostingSettings;
import com.vk.newsfeed.posting.impl.presentation.model.VideoDto;
import com.vk.newsfeed.posting.privacy_picker.model.PrivacyPostType;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stickers.api.models.post.PostStickerStyle;
import com.vk.toggle.features.StoriesFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.c7g0;
import xsna.efc0;
import xsna.fmc0;

/* compiled from: PublishFeatureDelegate.kt */
/* loaded from: classes4.dex */
public final class ube0 {
    public final efc0.a a;
    public final hce0 b;
    public final qbm0 c;
    public final hdo d;
    public final ibc0 e;
    public final Object f;
    public final Object g;

    /* compiled from: PublishFeatureDelegate.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            Throwable th2 = th;
            efc0.a aVar = ((ube0) this.receiver).a;
            aVar.a(new com.vk.newsfeed.posting.impl.domain.model.q(th2));
            aVar.e(new fmc0.m.b(ube0.b(th2)));
            aVar.a(new e.g(PublicationState.Failure));
            return s3q0.a;
        }
    }

    public ube0(efc0.a aVar, hce0 hce0Var, qbm0 qbm0Var, sp spVar, hdo hdoVar, ibc0 ibc0Var) {
        this.a = aVar;
        this.b = hce0Var;
        this.c = qbm0Var;
        this.d = hdoVar;
        this.e = ibc0Var;
        i13 i13Var = new i13(24);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f = msy.a(lazyThreadSafetyMode, i13Var);
        this.g = msy.a(lazyThreadSafetyMode, new pr0(29));
    }

    public static Throwable b(Throwable th) {
        List<VKApiExecutionException> v;
        VKApiExecutionException vKApiExecutionException;
        Throwable b;
        VKApiExecutionException vKApiExecutionException2 = null;
        VKApiExecutionException vKApiExecutionException3 = th instanceof VKApiExecutionException ? (VKApiExecutionException) th : null;
        if (vKApiExecutionException3 == null) {
            Throwable cause = th.getCause();
            if (cause instanceof VKApiExecutionException) {
                vKApiExecutionException2 = (VKApiExecutionException) cause;
            }
        } else {
            vKApiExecutionException2 = vKApiExecutionException3;
        }
        return (vKApiExecutionException2 == null || vKApiExecutionException2.s() != Integer.MIN_VALUE || (v = vKApiExecutionException2.v()) == null || (vKApiExecutionException = (VKApiExecutionException) j5g.a0(v)) == null || (b = b(vKApiExecutionException)) == null) ? th : b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
    
        if ((r5 != null ? r5.c : null) == com.vk.newsfeed.posting.impl.presentation.model.GroupPrivacyType.OPEN) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0095, code lost:
    
        r3 = r2.o;
        r4 = r2.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0099, code lost:
    
        if (r3 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009d, code lost:
    
        r2 = xsna.epx.f(r10, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a1, code lost:
    
        if (r11 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a3, code lost:
    
        r3 = r10.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a7, code lost:
    
        if (r3 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ad, code lost:
    
        if (r3.isEmpty() == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b0, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b3, code lost:
    
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b5, code lost:
    
        if (r4 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00bb, code lost:
    
        if (r4.isEmpty() == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00be, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c1, code lost:
    
        if (r2 != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c3, code lost:
    
        if (r11 == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c5, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c6, code lost:
    
        if (r3 == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c8, code lost:
    
        if (r5 != false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ca, code lost:
    
        if (r6 == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00cc, code lost:
    
        r2 = r10.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d0, code lost:
    
        if (r2 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d6, code lost:
    
        if (r2.isEmpty() == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00da, code lost:
    
        if (r4 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e0, code lost:
    
        if (r4.isEmpty() == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e4, code lost:
    
        r3 = xsna.p4g.a;
        r2 = r2.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f0, code lost:
    
        if (r2.hasNext() == false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f2, code lost:
    
        r3 = r2.next();
        r5 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0100, code lost:
    
        if (r5.isEmpty() == false) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0103, code lost:
    
        r5 = r5.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x010b, code lost:
    
        if (r5.hasNext() == false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0122, code lost:
    
        if (xsna.epx.f(((com.vk.newsfeed.posting.impl.presentation.model.CoauthorDto) r3).b.b, ((com.vk.newsfeed.posting.impl.presentation.model.CoauthorDto) r5.next()).b.b) == false) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0124, code lost:
    
        r7.e(new xsna.fmc0.p(new com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage.AlertDialog(new com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageText.ResText(com.vkontakte.android.R.string.coauthor_restriction_save_confirm_dialog_title), new com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageText.ResText(com.vkontakte.android.R.string.coauthor_restriction_save_confirm_dialog_subtitle), new com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageButton(new com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageText.ResText(com.vkontakte.android.R.string.coauthor_restriction_privacy_dialog_save), com.vk.newsfeed.posting.impl.domain.model.PostingAction.Publish.PublishPost.b, null, false, 12, null), new com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageButton(new com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageText.ResText(com.vkontakte.android.R.string.coauthor_restriction_privacy_dialog_cancel), null, null, false, 14, null), null, 16, null)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x016d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00c0, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00b2, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x016e, code lost:
    
        c(r26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0171, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0093, code lost:
    
        if (r4.b == false) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v20, types: [com.vk.dto.common.Attachment] */
    /* JADX WARN: Type inference failed for: r3v22, types: [com.vk.dto.common.Attachment] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(PostingState postingState, PostingAction.Publish publish) {
        ?? r3;
        Object obj;
        ?? nb;
        Object obj2;
        ?? nb2;
        boolean equals = publish.equals(PostingAction.Publish.PublishPostClicked.b);
        ibc0 ibc0Var = this.e;
        boolean z = false;
        efc0.a aVar = this.a;
        if (!equals) {
            if (publish.equals(PostingAction.Publish.PublishPost.b)) {
                c(postingState);
                return;
            }
            if (publish.equals(PostingAction.Publish.DraftClicked.b)) {
                if (postingState instanceof PostingState.Editing) {
                    PostingState.Editing editing = (PostingState.Editing) postingState;
                    if (editing.i.o != null) {
                        aVar.e(new fmc0.p(new PostingUserMessage.Snackbar(new PostingUserMessageIcon(R.drawable.vk_icon_error_outline_28, R.attr.vk_ui_icon_warning), new PostingUserMessageText.ResText(R.string.new_post_draft_postpone_error), null, 4, null)));
                        return;
                    } else if (tuk0.b(editing, false)) {
                        d(editing, false, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.POSTING_2));
                        return;
                    } else {
                        ibc0Var.i().b();
                        aVar.e(new fmc0.j.c(editing.h, false, false));
                        return;
                    }
                }
                return;
            }
            if (publish instanceof PostingAction.Publish.SaveDraft) {
                boolean z2 = ((PostingAction.Publish.SaveDraft) publish).b;
                if (postingState instanceof PostingState.Editing) {
                    PostingState.Editing editing2 = (PostingState.Editing) postingState;
                    ActionsAvailabilityState.Availability availability = editing2.l.g;
                    if (!(availability instanceof ActionsAvailabilityState.Availability.NotAvailable)) {
                        d(editing2, z2, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.POSTING_1));
                        return;
                    }
                    PostingUserMessage postingUserMessage = ((ActionsAvailabilityState.Availability.NotAvailable) availability).b;
                    if (postingUserMessage != null) {
                        aVar.e(new fmc0.p(postingUserMessage));
                        return;
                    }
                    return;
                }
                return;
            }
            if (!(publish instanceof PostingAction.Publish.PublishStoryRepost)) {
                throw new NoWhenBranchMatchedException();
            }
            PostingAction.Publish.PublishStoryRepost publishStoryRepost = (PostingAction.Publish.PublishStoryRepost) publish;
            d2y d2yVar = new d2y(this, 25);
            tbe0 tbe0Var = new tbe0(this, 0);
            n3b0 n3b0Var = new n3b0(this, 5);
            StoryRepostData storyRepostData = publishStoryRepost.c;
            List<PostingAttachment> list = storyRepostData.d;
            try {
                aVar.e(fmc0.m.e.a);
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                com.vk.metrics.eventtracking.b.a.a(th);
            }
            Post post = publishStoryRepost.b;
            StoriesFeatures storiesFeatures = StoriesFeatures.ST_POST_AUTOREPOST_GRID;
            storiesFeatures.getClass();
            if (com.vk.toggle.b.A.a(storiesFeatures)) {
                ArrayList<EntryAttachment> arrayList = post.z;
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                for (EntryAttachment entryAttachment : arrayList) {
                    Attachment attachment = entryAttachment.b;
                    if (attachment instanceof PhotoAttachment) {
                        PhotoAttachment photoAttachment = attachment != null ? (PhotoAttachment) attachment : null;
                        if (photoAttachment != null) {
                            if (list != null) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = it.next();
                                    PostingAttachment postingAttachment = (PostingAttachment) obj2;
                                    if (postingAttachment instanceof PhotoDto) {
                                        Parcelable parcelable = ((PhotoDto) postingAttachment).f.h;
                                        if ((parcelable instanceof PhotoAttachment) && photoAttachment.l.c == ((PhotoAttachment) parcelable).f) {
                                            break;
                                        }
                                    }
                                }
                                PostingAttachment postingAttachment2 = (PostingAttachment) obj2;
                                if (postingAttachment2 != null && (nb2 = postingAttachment2.nb()) != 0) {
                                    photoAttachment = nb2;
                                }
                            }
                            entryAttachment = EntryAttachment.a(entryAttachment, photoAttachment);
                        }
                    } else if (attachment instanceof VideoAttachment) {
                        VideoAttachment videoAttachment = attachment != null ? (VideoAttachment) attachment : null;
                        if (videoAttachment != null) {
                            if (list != null) {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        obj = null;
                                        break;
                                    }
                                    obj = it2.next();
                                    PostingAttachment postingAttachment3 = (PostingAttachment) obj;
                                    if (postingAttachment3 instanceof VideoDto) {
                                        VideoDto videoDto = (VideoDto) postingAttachment3;
                                        if ((videoDto.f.h instanceof VideoFileOld) && videoAttachment.k.o0() == ((VideoFileOld) videoDto.f.h).c) {
                                            break;
                                        }
                                    }
                                }
                                PostingAttachment postingAttachment4 = (PostingAttachment) obj;
                                if (postingAttachment4 != null && (nb = postingAttachment4.nb()) != 0) {
                                    videoAttachment = nb;
                                }
                            }
                            entryAttachment = EntryAttachment.a(entryAttachment, videoAttachment);
                        }
                    }
                    arrayList2.add(entryAttachment);
                }
                post = Post.Nb(post, null, null, 0, null, 0, null, new ArrayList(arrayList2), null, null, -16385);
            }
            StoriesFeatures storiesFeatures2 = StoriesFeatures.ST_POST_AUTOREPOST_GRID;
            storiesFeatures2.getClass();
            PostStickerStyle postStickerStyle = com.vk.toggle.b.A.a(storiesFeatures2) ? PostStickerStyle.MINIATURE : null;
            qbm0 qbm0Var = this.c;
            u7c0 a2 = qbm0Var.b.a(qbm0Var.a, post, new Size(1080, 1920), postStickerStyle);
            if (list != null) {
                List<PostingAttachment> list2 = list;
                r3 = new ArrayList(c5g.u(list2, 10));
                for (PostingAttachment postingAttachment5 : list2) {
                    r3.add(new pbm0(postingAttachment5.nb(), new com.vk.movika.sdk.base.flow.binding.g(25, postingAttachment5, qbm0Var), postingAttachment5 instanceof VideoDto));
                }
            } else {
                r3 = EmptyList.b;
            }
            List list3 = r3;
            PrivacyPostType privacyPostType = storyRepostData.c;
            qbm0Var.c.getValue().b(new c7g0.b(a2, list3, n3b0Var, d2yVar, tbe0Var, (privacyPostType.equals(PrivacyPostType.FriendsOnly.b) ? StoryPrivacyType.FRIENDS : privacyPostType.equals(PrivacyPostType.BestFriends.b) ? StoryPrivacyType.BEST_FRIENDS : StoryPrivacyType.ALL).j()));
            return;
        }
        if (!(postingState instanceof PostingState.Editing)) {
            return;
        }
        PostingState.Editing editing3 = (PostingState.Editing) postingState;
        PostingContext postingContext = editing3.c;
        PostEditingReason postEditingReason = editing3.h;
        PostingSettings postingSettings = editing3.d;
        PostEditableData postEditableData = editing3.j;
        PostEditableData postEditableData2 = editing3.i;
        boolean z3 = postEditingReason instanceof PostEditingReason.EditExistingPost;
        if (z3) {
            boolean f = epx.f(postEditableData, postEditableData2);
            boolean z4 = (((PostEditingReason.EditExistingPost) postEditingReason).b && postingSettings.d()) ? false : true;
            if (f && z4) {
                ibc0Var.h().d();
                aVar.e(new fmc0.j.c(postEditingReason, false, false));
                return;
            }
        }
        List<CoauthorDto> list4 = postEditableData2.n;
        boolean z5 = list4 == null || list4.isEmpty();
        boolean z6 = z3 || (postEditingReason instanceof PostEditingReason.EditLocalDraft) || (postEditingReason instanceof PostEditingReason.EditRemoteDraft);
        if (z5 || !z6) {
            c(postingState);
        } else {
            if (!fkq0.b(postingContext.b.b)) {
                UserWallPostingSettings userWallPostingSettings = postingSettings.g;
                if (userWallPostingSettings != null) {
                }
                aVar.e(new fmc0.p(new PostingUserMessage.Snackbar(new PostingUserMessageIcon(R.drawable.vk_icon_lock_outline_28, R.attr.vk_ui_icon_accent_themed), new PostingUserMessageText.ResText(fkq0.b(postingContext.b.b) ? R.string.coauthor_restriction_profile_community_editing : R.string.coauthor_restriction_profile_editing), new PostingUserMessageButton(new PostingUserMessageText.ResText(R.string.coauthor_restriction_profile_button), PostingAction.Editing.MakeProfileOpen.b, null, false, 12, null))));
                return;
            }
            GroupWallPostingSettings groupWallPostingSettings = postingSettings.h;
        }
    }

    public final void c(PostingState postingState) {
        if (postingState instanceof PostingState.Editing) {
            PostingAction.Stats.SendWaitingAnalytics sendWaitingAnalytics = PostingAction.Stats.SendWaitingAnalytics.b;
            efc0.a aVar = this.a;
            aVar.d(sendWaitingAnalytics);
            PostingState.Editing editing = (PostingState.Editing) postingState;
            LinksParsingMetaData linksParsingMetaData = editing.i.w;
            WallOwner wallOwner = editing.c.b;
            PostingMetricsEntryPoint postingMetricsEntryPoint = editing.b.b;
            aVar.a(new com.vk.newsfeed.posting.impl.domain.model.r(SystemClock.elapsedRealtime()));
            aVar.a(new e.g(PublicationState.InProgress));
            String a2 = com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.POSTING_2);
            hce0 hce0Var = this.b;
            aVar.a.e.b(hce0Var.b.a(hce0Var.c(editing, this.e, a2)).subscribe(new cx00(new l17(this, wallOwner, postingMetricsEntryPoint, linksParsingMetaData, postingState, 2), 18), new c2y(new a(1, this, ube0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0), 23)));
        }
    }

    public final void d(PostingState.Editing editing, boolean z, String str) {
        e.g gVar = new e.g(PublicationState.InProgress);
        efc0.a aVar = this.a;
        aVar.a(gVar);
        if (z) {
            aVar.e(fmc0.m.c.a);
        }
        ibc0 ibc0Var = this.e;
        hce0 hce0Var = this.b;
        pbe0 c = hce0Var.c(editing, ibc0Var, str);
        int i = 10;
        aVar.a.e.b(hce0Var.b.a(new pbe0(c.a, c.b, c.c, c.d, c.e, c.f, c.g, c.h, c.i, c.j, c.k, c.l, c.m, c.n, c.o, c.p, c.q, c.r, c.s, c.t, c.u, c.v, c.w, true, c.y)).subscribe(new d750(new mm1(26, editing, this), i), new ox80(new ie90(this, i), 7)));
    }
}
