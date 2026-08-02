package xsna;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Size;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.newsfeed.posting.additional_settings.domain.model.author.Publisher;
import com.vk.newsfeed.posting.impl.domain.model.EditingPost;
import com.vk.newsfeed.posting.impl.domain.model.PostEditingReason;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.StoryRepostData;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageIcon;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageText;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.story.viewer.api.StoryViewerRouter;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.fmc0;
import xsna.ikv0;

/* compiled from: PublishEffectsDelegate.kt */
/* loaded from: classes4.dex */
public final class rbe0 {
    public final PostingFragment a;
    public final PostingFragment.g b;
    public final rf20 c;
    public final NewsfeedRouter d;
    public final feo e;
    public final StoryViewerRouter f;
    public final Object g;
    public final Object h;
    public final Object i;

    public rbe0(PostingFragment postingFragment, PostingFragment.g gVar, rf20 rf20Var, NewsfeedRouter newsfeedRouter, feo feoVar, StoryViewerRouter storyViewerRouter) {
        this.a = postingFragment;
        this.b = gVar;
        this.c = rf20Var;
        this.d = newsfeedRouter;
        this.e = feoVar;
        this.f = storyViewerRouter;
        vv0 vv0Var = new vv0(29);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.g = msy.a(lazyThreadSafetyMode, vv0Var);
        this.h = msy.a(lazyThreadSafetyMode, new vex(this, 22));
        this.i = msy.a(lazyThreadSafetyMode, new qbe0(0));
    }

    public static void d(Context context, boolean z, int i, Object... objArr) {
        if (!z) {
            cvk.v(i, Arrays.copyOf(objArr, objArr.length));
            return;
        }
        ikv0.a aVar = new ikv0.a(context);
        aVar.t = ikv0.c.f.a;
        aVar.u = new ikv0.d(context.getString(i, Arrays.copyOf(objArr, objArr.length)), (String) null, (ikv0.d.a) null, 6);
        aVar.n();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void a() {
        ((Handler) this.g.getValue()).removeCallbacksAndMessages(null);
        qv20.b((Dialog) this.h.getValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (r8 != null) goto L20;
     */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(fmc0.m mVar) {
        PostingCreationEntryPoint postingCreationEntryPoint;
        Bundle arguments;
        Context mo2getContext;
        String string;
        if (mVar.equals(fmc0.m.c.a)) {
            c();
            return;
        }
        boolean z = mVar instanceof fmc0.m.g;
        Integer num = null;
        PostingFragment.g gVar = this.b;
        PostingFragment postingFragment = this.a;
        if (!z) {
            if (mVar instanceof fmc0.m.a) {
                fmc0.m.a aVar = (fmc0.m.a) mVar;
                a();
                Context mo2getContext2 = postingFragment.mo2getContext();
                if (mo2getContext2 != null) {
                    boolean z2 = aVar.a;
                    int i = z2 ? R.string.new_post_draft_updated : R.string.new_post_draft_saved;
                    ikv0.d.a aVar2 = !z2 ? new ikv0.d.a(mo2getContext2.getString(R.string.new_post_show_drafts), null, new sc5(this, aVar, mo2getContext2, 4), Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) : null;
                    ikv0.a aVar3 = new ikv0.a(mo2getContext2);
                    aVar3.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_outline_24, Integer.valueOf(R.attr.vk_ui_icon_positive), (Size) null, 12);
                    aVar3.u = new ikv0.d(mo2getContext2.getString(i), (String) null, aVar2, 2);
                    aVar3.e = 2000L;
                    aVar3.o = Integer.valueOf(cn70.b(24));
                    aVar3.n();
                }
                gVar.invoke(new PostingAction.Navigation.Close(false, false, false, 4, null));
                return;
            }
            if (mVar instanceof fmc0.m.b) {
                fmc0.m.b bVar = (fmc0.m.b) mVar;
                a();
                Context mo2getContext3 = postingFragment.mo2getContext();
                if (mo2getContext3 == null) {
                    return;
                }
                com.vk.core.utils.newtork.b.a.getClass();
                gVar.invoke(new PostingAction.ShowMessage(new PostingUserMessage.Snackbar(new PostingUserMessageIcon(R.drawable.vk_icon_error_outline_28, R.attr.vk_ui_icon_negative), new PostingUserMessageText.StringText(com.vk.core.utils.newtork.b.d() ? j03.g(mo2getContext3, bVar.a, R.string.error) : mo2getContext3.getString(R.string.posting_common_network_error)), null, 4, null), null, 0, 0, 0, 0, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, null));
                return;
            }
            if (mVar.equals(fmc0.m.e.a)) {
                c();
                return;
            }
            if (mVar instanceof fmc0.m.f) {
                fmc0.m.f fVar = (fmc0.m.f) mVar;
                a();
                Context mo2getContext4 = postingFragment.mo2getContext();
                if (mo2getContext4 == null) {
                    return;
                }
                ikv0.a aVar4 = new ikv0.a(mo2getContext4);
                aVar4.t = ikv0.c.f.a;
                aVar4.u = new ikv0.d(mo2getContext4.getString(R.string.story_post_repost_done), (String) null, (ikv0.d.a) null, 6);
                aVar4.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, mo2getContext4.getString(R.string.story_post_repost_action_open), new defpackage.l(this, fVar, mo2getContext4, 5));
                aVar4.h = new lxz(this, 23);
                aVar4.n();
                return;
            }
            if (!mVar.equals(fmc0.m.d.a)) {
                throw new NoWhenBranchMatchedException();
            }
            a();
            Context mo2getContext5 = postingFragment.mo2getContext();
            if (mo2getContext5 == null) {
                return;
            }
            ikv0.a aVar5 = new ikv0.a(mo2getContext5);
            aVar5.t = ikv0.c.b.a;
            aVar5.u = new ikv0.d(mo2getContext5.getString(R.string.story_post_repost_error), (String) null, (ikv0.d.a) null, 6);
            aVar5.h = new w620(this, 22);
            aVar5.n();
            return;
        }
        fmc0.m.g gVar2 = (fmc0.m.g) mVar;
        a();
        NewsEntry newsEntry = gVar2.f;
        boolean z3 = newsEntry instanceof Post;
        Post post = z3 ? (Post) newsEntry : null;
        Bundle arguments2 = postingFragment.getArguments();
        if (arguments2 != null && (string = arguments2.getString("creation_entry_point")) != null) {
            PostingCreationEntryPoint.Companion.getClass();
            postingCreationEntryPoint = PostingCreationEntryPoint.a.a(string);
        }
        postingCreationEntryPoint = PostingCreationEntryPoint.Other;
        if (post != null) {
            Integer valueOf = Integer.valueOf(post.r);
            if (post.oc()) {
                num = valueOf;
            }
        }
        boolean z4 = gVar2.e;
        boolean z5 = gVar2.b;
        if (z4 && (mo2getContext = postingFragment.mo2getContext()) != null) {
            boolean z6 = gVar2.d;
            if (gVar2.a) {
                if (z5 && gVar2.c) {
                    d(mo2getContext, z6, R.string.wall_ok_redesigned, new Object[0]);
                } else {
                    d(mo2getContext, z6, R.string.post_edit_saved, new Object[0]);
                }
            } else if (num != null) {
                d(mo2getContext, z6, R.string.wall_postponed, pvo0.i(false, num.intValue(), false, false));
            } else if (z5) {
                d(mo2getContext, z6, R.string.posting_post_postponed, new Object[0]);
            } else {
                d(mo2getContext, z6, R.string.wall_ok_redesigned, new Object[0]);
            }
        }
        PostEditingReason postEditingReason = gVar2.g;
        boolean z7 = (postEditingReason instanceof PostEditingReason.EditExistingPost) || (postEditingReason instanceof PostEditingReason.EditRemoteDraft);
        int i2 = gVar2.h;
        p870 f = p870.f();
        if (!z7 || i2 <= 0) {
            f.e(105, newsEntry);
            if (((Boolean) this.i.getValue()).booleanValue() && post != null) {
                f.e(157, new kb60(postingCreationEntryPoint.name(), post));
            }
        } else {
            Publisher publisher = gVar2.i;
            Object obj = publisher != null ? publisher.b : 0;
            if ((!postEditingReason.Ja() || obj.equals(this.c.invoke())) && !(postEditingReason instanceof PostEditingReason.EditRemoteDraft)) {
                f.e(101, newsEntry);
            } else {
                EditingPost editingPost = gVar2.j;
                if (editingPost != null) {
                    f.e(152, new NewsfeedExternalAction.c.w(editingPost.c, editingPost.d, editingPost.f, editingPost.e, editingPost.g, editingPost.h));
                }
                f.e(105, newsEntry);
            }
        }
        if (post != null && (arguments = postingFragment.getArguments()) != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("ownerId", post.m.b);
            bundle.putInt("postId", post.n);
            s3q0 s3q0Var = s3q0.a;
            arguments.putBundle("SHOW_NEW_POST_BOX_DATA", bundle);
        }
        StoryRepostData storyRepostData = gVar2.k;
        if (storyRepostData == null || !z3) {
            gVar.invoke(new PostingAction.Navigation.Close(false, false, false, 4, null));
        } else {
            gVar.invoke(new PostingAction.Publish.PublishStoryRepost((Post) newsEntry, storyRepostData));
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    public final void c() {
        PostingFragment postingFragment = this.a;
        if (postingFragment.isRemoving() || postingFragment.isDetached() || postingFragment.isStateSaved() || ((Dialog) this.h.getValue()).isShowing()) {
            return;
        }
        ?? r0 = this.g;
        ((Handler) r0.getValue()).removeCallbacksAndMessages(null);
        ((Handler) r0.getValue()).postDelayed(new ov(this, 12), 300L);
    }
}
