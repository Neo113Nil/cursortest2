package xsna;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.Hb;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.PostDonut;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.polls.Poll;
import com.vk.dto.polls.PollOption;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.newsfeed.posting.additional_settings.domain.model.author.Publisher;
import com.vk.newsfeed.posting.additional_settings.domain.model.author.Signer;
import com.vk.newsfeed.posting.additional_settings.domain.model.author.WallOwner;
import com.vk.newsfeed.posting.api.model.PostingMediaEntryPoint;
import com.vk.newsfeed.posting.impl.domain.model.EditingPost;
import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;
import com.vk.newsfeed.posting.impl.domain.model.PostEditingReason;
import com.vk.newsfeed.posting.impl.domain.model.PostSigner;
import com.vk.newsfeed.posting.impl.domain.model.PostType;
import com.vk.newsfeed.posting.impl.presentation.base.view.steps.PollEditorUiConfig;
import com.vk.newsfeed.posting.impl.presentation.model.PollAnswerDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPollDto;
import com.vk.newsfeed.posting.poll_editor.presentation.base.fragment.PollEditorModalBottomSheet;
import com.vk.newsfeed.posting.poll_editor.presentation.model.PollEditorMode;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PostingContext;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.vhc0;
import xsna.zwc0;

/* compiled from: PostingRouterImpl.kt */
/* loaded from: classes4.dex */
public final class klc0 implements hbc0 {
    public static Pair b() {
        return new Pair(Long.valueOf(System.currentTimeMillis()), Long.valueOf(SystemClock.elapsedRealtime()));
    }

    @Override // xsna.hbc0
    public final void a(Context context, vhc0 vhc0Var, int i) {
        String str;
        long j;
        PostSigner postSigner;
        Integer num;
        Parcelable editExistingPost;
        if (vhc0Var instanceof vhc0.a) {
            vhc0.a aVar = (vhc0.a) vhc0Var;
            PostEditableData a = llc0.a(aVar, context);
            Pair b = b();
            long longValue = ((Number) b.d()).longValue();
            long longValue2 = ((Number) b.g()).longValue();
            int i2 = ufc0.m;
            UserId userId = aVar.a;
            long j2 = aVar.b;
            PostingCreationEntryPoint postingCreationEntryPoint = aVar.c;
            boolean z = aVar.e;
            Integer num2 = aVar.g;
            ufc0 ufc0Var = new ufc0();
            PostEditingReason.EditLocalDraft editLocalDraft = new PostEditingReason.EditLocalDraft(z);
            Bundle bundle = ufc0Var.j;
            bundle.putParcelable("editing_reason", editLocalDraft);
            if (a != null) {
                bundle.putParcelable("post_data_for_editing", a);
            }
            bundle.putLong("draft_id_for_editing", j2);
            bundle.putParcelable("owner", new WallOwner(userId));
            bundle.putString("creation_entry_point", postingCreationEntryPoint.toString());
            if (num2 != null) {
                bundle.putInt("publish_suggest_id", num2.intValue());
            }
            bundle.putLong("startScreenTime", longValue);
            bundle.putLong("startScreenElapsedTime", longValue2);
            if (i == -1) {
                ufc0Var.k(context);
                return;
            } else {
                ufc0Var.i(xa4.L(context), i);
                return;
            }
        }
        if (!(vhc0Var instanceof vhc0.c)) {
            if (!(vhc0Var instanceof vhc0.d)) {
                if (!(vhc0Var instanceof vhc0.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                vhc0.b bVar = (vhc0.b) vhc0Var;
                xhy xhyVar = bVar.b;
                Poll poll = bVar.a;
                int i3 = poll.b;
                String str2 = poll.d;
                List<PollOption> list = poll.f;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (PollOption pollOption : list) {
                    arrayList.add(new PollAnswerDto(pollOption.b, pollOption.c));
                }
                boolean z2 = poll.i;
                boolean Ib = poll.Ib();
                boolean Ab = poll.Ab();
                long j3 = poll.k;
                PostingPollDto postingPollDto = new PostingPollDto(i3, null, str2, arrayList, z2, Ib, Ab, j3 > 0, j3 * 1000, true, false, 2, null);
                new PollEditorModalBottomSheet.a(context, poll.c, postingPollDto, postingPollDto, PollEditorMode.Edit.b, new PollEditorUiConfig(0, 0, 0, 0, 0, 0, 0, 127, null), SystemClock.elapsedRealtime(), new jlc0(xhyVar, this, bVar)).a().Wn(((FragmentActivity) e3m.h(context)).getSupportFragmentManager(), null);
                return;
            }
            vhc0.d dVar = (vhc0.d) vhc0Var;
            PostEditableData a2 = llc0.a(dVar, context);
            if (a2 == null) {
                return;
            }
            Pair b2 = b();
            long longValue3 = ((Number) b2.d()).longValue();
            long longValue4 = ((Number) b2.g()).longValue();
            zwc0 zwc0Var = dVar.b;
            zwc0.a aVar2 = zwc0Var.a;
            if (aVar2 instanceof zwc0.a.C4207a) {
                str = ((zwc0.a.C4207a) aVar2).b;
            } else if (aVar2 instanceof zwc0.a.b) {
                str = ((zwc0.a.b) aVar2).b;
            } else {
                if (aVar2 != null) {
                    throw new NoWhenBranchMatchedException();
                }
                str = null;
            }
            int i4 = ufc0.m;
            UserId userId2 = dVar.a;
            PostingCreationEntryPoint postingCreationEntryPoint2 = dVar.c;
            boolean z3 = zwc0Var.f;
            PostingMediaEntryPoint postingMediaEntryPoint = dVar.e;
            Integer num3 = dVar.f;
            boolean z4 = dVar.h;
            String str3 = dVar.i;
            boolean z5 = dVar.k;
            ufc0 ufc0Var2 = new ufc0();
            PostEditingReason.NewPost newPost = new PostEditingReason.NewPost(z3);
            Bundle bundle2 = ufc0Var2.j;
            bundle2.putParcelable("editing_reason", newPost);
            bundle2.putParcelable("post_data_for_editing", a2);
            bundle2.putString("creation_entry_point", postingCreationEntryPoint2.toString());
            bundle2.putParcelable("owner", new WallOwner(userId2));
            bundle2.putString("author_name", str);
            bundle2.putString("media_entry_point", postingMediaEntryPoint.name());
            bundle2.putBoolean("is_posting_success_toast_required", z4);
            bundle2.putString("business_onboarding_tooltip", str3);
            bundle2.putBoolean("is_coauthors_allowed", z5);
            if (num3 != null) {
                bundle2.putInt("publish_suggest_id", num3.intValue());
            }
            bundle2.putBoolean("is_opened_from_miniapp", dVar.g);
            bundle2.putLong("startScreenTime", longValue3);
            bundle2.putLong("startScreenElapsedTime", longValue4);
            if (i == -1) {
                ufc0Var2.k(context);
                return;
            } else {
                ufc0Var2.i(xa4.L(context), i);
                return;
            }
        }
        vhc0.c cVar = (vhc0.c) vhc0Var;
        PostEditableData a3 = llc0.a(cVar, context);
        if (a3 == null) {
            return;
        }
        Pair b3 = b();
        long longValue5 = ((Number) b3.d()).longValue();
        long longValue6 = ((Number) b3.g()).longValue();
        NewsEntry newsEntry = cVar.b;
        Post post = newsEntry instanceof Post ? (Post) newsEntry : null;
        if (post == null) {
            return;
        }
        PostType postType = epx.f(post.t, "suggest") ? PostType.Suggest : PostType.Regular;
        UserId userId3 = post.m;
        int i5 = post.n;
        boolean oc = post.oc();
        boolean rc = post.rc();
        boolean Z1 = post.Z1();
        boolean o1 = post.o1();
        Owner owner = post.q;
        if (owner != null) {
            j = longValue6;
            postSigner = new PostSigner(owner.b, owner.h, owner.i);
        } else {
            j = longValue6;
            postSigner = null;
        }
        PostDonut postDonut = post.R;
        EditingPost editingPost = new EditingPost(postType, userId3, i5, rc, oc, Z1, o1, postSigner, (postDonut != null ? postDonut.d : null) != null ? MobileOfficialAppsFeedStat$PostingContext.PostType.POST_DONUT : post.hc() ? MobileOfficialAppsFeedStat$PostingContext.PostType.COMMENT : post.oc() ? MobileOfficialAppsFeedStat$PostingContext.PostType.POSTPONED : post.rc() ? MobileOfficialAppsFeedStat$PostingContext.PostType.SUGGESTED : MobileOfficialAppsFeedStat$PostingContext.PostType.REGULAR, post.L.b);
        int i6 = ufc0.m;
        UserId userId4 = cVar.a;
        if (userId4 == null) {
            userId4 = post.m;
        }
        WallOwner wallOwner = new WallOwner(userId4);
        Owner owner2 = post.o;
        UserId userId5 = owner2.b;
        String str4 = owner2.h;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = owner2.i;
        if (str5 == null) {
            str5 = "";
        }
        Publisher publisher = new Publisher(userId5, str4, str5);
        PostingCreationEntryPoint postingCreationEntryPoint3 = cVar.c;
        Integer num4 = cVar.e;
        ufc0 ufc0Var3 = new ufc0();
        if (editingPost.g) {
            num = num4;
            editExistingPost = new PostEditingReason.EditRemoteDraft(false);
        } else {
            num = num4;
            editExistingPost = new PostEditingReason.EditExistingPost(editingPost.b == PostType.Suggest);
        }
        Bundle bundle3 = ufc0Var3.j;
        bundle3.putParcelable("editing_reason", editExistingPost);
        bundle3.putParcelable("post_data_for_editing", a3);
        bundle3.putParcelable("owner", wallOwner);
        bundle3.putParcelable(Hb.b, publisher);
        bundle3.putString("creation_entry_point", postingCreationEntryPoint3.toString());
        bundle3.putParcelable("editing_post", editingPost);
        PostSigner postSigner2 = editingPost.i;
        if (postSigner2 != null) {
            UserId userId6 = postSigner2.b;
            if (fkq0.d(userId6)) {
                String str6 = postSigner2.c;
                if (str6 == null) {
                    str6 = "";
                }
                String str7 = postSigner2.d;
                if (str7 == null) {
                    str7 = "";
                }
                bundle3.putParcelable("signer", new Signer(userId6, str6, str7));
            }
        }
        if (num != null) {
            bundle3.putInt("publish_suggest_id", num.intValue());
        }
        bundle3.putBoolean("is_opened_from_miniapp", cVar.g);
        bundle3.putBoolean("is_opened_from_archive", cVar.h);
        bundle3.putLong("startScreenTime", longValue5);
        bundle3.putLong("startScreenElapsedTime", j);
        if (i == -1) {
            ufc0Var3.k(context);
        } else {
            ufc0Var3.i(xa4.L(context), i);
        }
    }
}
