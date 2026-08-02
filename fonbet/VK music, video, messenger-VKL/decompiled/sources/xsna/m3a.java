package xsna;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetUserSettingsSettingsIdsDto;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.view.CommunityReviewsView;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.log.L;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileState;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.attachments.DonutLinkAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vkontakte.android.data.b;
import java.util.Collections;
import java.util.List;

/* compiled from: CatalogClickEvents.kt */
/* loaded from: classes16.dex */
public final class m3a implements gn60, s980, a0i, b9w0 {
    public Object b;

    public /* synthetic */ m3a(Object obj) {
        this.b = obj;
    }

    @Override // xsna.s980
    public boolean E8(Attachment attachment, NewsEntry newsEntry) {
        return ((s980) this.b).E8(attachment, newsEntry);
    }

    @Override // xsna.s980
    public void Hh(View view, u1c0 u1c0Var, NewsEntry newsEntry, Attachment attachment) {
        Context context = view.getContext();
        if (!(attachment instanceof DonutLinkAttachment)) {
            ((s980) this.b).Hh(view, u1c0Var, newsEntry, attachment);
            return;
        }
        DonutLinkAttachment donutLinkAttachment = (DonutLinkAttachment) attachment;
        di60.w(donutLinkAttachment.l.c, context, null, null, null, null, 62);
        UserId userId = donutLinkAttachment.g;
        b.d dVar = new b.d("donut_click_pay");
        dVar.b("snippet_comment", "source");
        dVar.b(userId, "owner_id");
        dVar.e();
    }

    @Override // xsna.s980
    public void Mg(View view, u1c0 u1c0Var, NewsEntry newsEntry, Attachment attachment) {
        Context context = view.getContext();
        if (!(attachment instanceof DonutLinkAttachment)) {
            ((s980) this.b).Mg(view, u1c0Var, newsEntry, attachment);
            return;
        }
        DonutLinkAttachment donutLinkAttachment = (DonutLinkAttachment) attachment;
        di60.w(donutLinkAttachment.m, context, null, null, null, null, 62);
        UserId userId = donutLinkAttachment.g;
        b.d dVar = new b.d("donut_snippet_click");
        dVar.b("snippet_comment", "source");
        dVar.b(userId, "owner_id");
        dVar.e();
    }

    @Override // xsna.b9w0
    public void b(int i) {
        gdl0 gdl0Var = (gdl0) this.b;
        hgh0 hgh0Var = gdl0Var.e;
        if (hgh0Var == null) {
            hgh0Var = null;
        }
        hgh0Var.onPageSelected((gdl0Var.h + i) - gdl0Var.f);
    }

    @Override // xsna.a0i
    public void c(zzh zzhVar) {
        a0i<? super zzh> a0iVar = ((CommunityReviewsView) this.b).e;
        if (a0iVar != null) {
            a0iVar.c(zzhVar);
        }
    }

    @Override // xsna.s980
    public void d9(NewsEntry newsEntry, NewsEntry newsEntry2, int i, int i2) {
        ((s980) this.b).d9(newsEntry, newsEntry2, i, i2);
    }

    public io.reactivex.rxjava3.internal.operators.observable.j1 e(UserId userId) {
        return rsg0.y0(yfb.x(mgj0.h((ngj0) this.b, Collections.singletonList(ShortVideoGetUserSettingsSettingsIdsDto.AVAILABLE_ATTACHES), fkq0.a(userId), 4)), null, null, 3).U(new e10(new lt0(15), 11));
    }

    public ExtendedCommunityProfile g() {
        return ((CommunityProfileState) ((com.vk.profile.community.impl.ui.profile.a) this.b).h.c).b;
    }

    public UserId h() {
        return ((com.vk.profile.community.impl.ui.profile.a) this.b).i.a;
    }

    public void i(Runnable runnable) {
        try {
            ((Handler) this.b).post(runnable);
        } catch (Exception e) {
            L.g("post task failure", e);
        }
    }

    public void j(l3a l3aVar) {
        ((io.reactivex.rxjava3.subjects.f) this.b).onNext(l3aVar);
    }

    @Override // xsna.gn60
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public List x(mds0 mds0Var, wm60 wm60Var) {
        VerifyInfo verifyInfo;
        Owner owner;
        Owner owner2;
        NewsEntry newsEntry = mds0Var.a;
        VideoAttachment videoAttachment = mds0Var.c;
        int i = mds0Var.d;
        VideoFile videoFile = videoAttachment.k;
        ClipVideoFile clipVideoFile = videoFile instanceof ClipVideoFile ? (ClipVideoFile) videoFile : null;
        Post R = di60.R(newsEntry);
        return Collections.singletonList(new fad((efd) j5g.Y(((dfd) this.b).x(mds0Var, wm60Var)), clipVideoFile, R, !epx.f((clipVideoFile == null || (owner2 = clipVideoFile.v0) == null) ? null : owner2.b, (R == null || (owner = R.o) == null) ? null : owner.b), clipVideoFile != null ? clipVideoFile.p0 : null, clipVideoFile != null ? clipVideoFile.q0 : null, (clipVideoFile == null || (verifyInfo = clipVideoFile.o0) == null) ? false : di60.A(verifyInfo), i));
    }

    @Override // xsna.s980
    public boolean u9(View view, u1c0 u1c0Var, NewsEntry newsEntry, Attachment attachment) {
        return ((s980) this.b).u9(view, u1c0Var, newsEntry, attachment);
    }

    public m3a(String str) {
        HandlerThread handlerThread = new HandlerThread(str, 10);
        handlerThread.start();
        this.b = new Handler(handlerThread.getLooper());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m3a(int i) {
        this(new fa60());
        switch (i) {
            case 2:
                this.b = new dfd();
                break;
            case 3:
                break;
            default:
                this.b = new io.reactivex.rxjava3.subjects.f();
                break;
        }
    }

    @Override // xsna.s980
    public void r8(NewsEntry newsEntry) {
    }

    @Override // xsna.hi60
    public void sa(NewsfeedExternalAction newsfeedExternalAction) {
    }

    @Override // xsna.s980
    public void U5(NewsEntry newsEntry, boolean z, int i) {
    }
}
