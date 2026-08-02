package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.posting.additional_settings.data.AdditionalSettingsConfiguration;
import com.vk.newsfeed.posting.api.model.PhotoVideoDisplayMode;
import com.vk.newsfeed.posting.impl.data.db.PostingDatabase;
import com.vk.newsfeed.posting.impl.domain.model.LinksParsingMetaData;
import com.vk.newsfeed.posting.impl.domain.model.PhotoVideoAttachmentsCropData;
import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;
import com.vk.newsfeed.posting.impl.domain.model.attachments.PostingArticleDto;
import com.vk.newsfeed.posting.impl.domain.model.attachments.PostingLinkDto;
import com.vk.newsfeed.posting.impl.domain.model.music.MusicAttachDto;
import com.vk.newsfeed.posting.impl.presentation.model.ActionButton;
import com.vk.newsfeed.posting.impl.presentation.model.CoauthorDto;
import com.vk.newsfeed.posting.impl.presentation.model.FileDto;
import com.vk.newsfeed.posting.impl.presentation.model.PhotoTagsData;
import com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPlaceDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPollDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingTextRestriction;
import com.vk.newsfeed.posting.privacy_picker.model.PrivacyPostType;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: DraftsRepository.kt */
/* loaded from: classes4.dex */
public final class gfo implements tkx {
    public final Context a;
    public final io.reactivex.rxjava3.core.w b;
    public final ConcurrentHashMap<UserId, Long> c;
    public final bpn0 d;

    public gfo(Context context) {
        io.reactivex.rxjava3.core.w c = asu0.a.c();
        this.a = context;
        this.b = c;
        this.c = new ConcurrentHashMap<>();
        this.d = new bpn0(new m2g(this, 13));
    }

    public static kec0 i(long j, UserId userId, PostEditableData postEditableData) {
        return new kec0(j, userId, postEditableData.c, postEditableData.i, postEditableData.k, postEditableData.j, postEditableData.n, postEditableData.o, postEditableData.e, postEditableData.f, postEditableData.g, postEditableData.h, postEditableData.l, postEditableData.m, postEditableData.p, postEditableData.r, postEditableData.q, postEditableData.t, Boolean.valueOf(postEditableData.v), postEditableData.x, postEditableData.y);
    }

    @Override // xsna.tkx
    public final long a(UserId userId) {
        return this.c.getOrDefault(userId, 0L).longValue();
    }

    @Override // xsna.cfc0
    public final io.reactivex.rxjava3.core.x<Long> b(UserId userId) {
        return new io.reactivex.rxjava3.internal.operators.single.v(new gdd(1, this, userId)).q(this.b);
    }

    @Override // xsna.tkx
    public final io.reactivex.rxjava3.internal.operators.single.f0 c(final UserId userId, final PostEditableData postEditableData) {
        return new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.efo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                gfo gfoVar = gfo.this;
                mec0 y = gfoVar.h().y();
                UserId userId2 = userId;
                Long c = y.c(userId2);
                long d = gfoVar.h().y().d(gfo.i(c != null ? c.longValue() : 0L, userId2, postEditableData));
                if (d > 0) {
                    gfoVar.c.put(userId2, Long.valueOf(d));
                }
                return Long.valueOf(d);
            }
        }).q(this.b);
    }

    @Override // xsna.cfc0
    public final boolean d(UserId userId) {
        return this.c.getOrDefault(userId, 0L).longValue() > 0;
    }

    @Override // xsna.tkx
    public final io.reactivex.rxjava3.internal.operators.single.f0 e(final long j, final UserId userId) {
        return new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.dfo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                gfo gfoVar = gfo.this;
                mec0 y = gfoVar.h().y();
                long j2 = j;
                UserId userId2 = userId;
                kec0 b = y.b(j2, userId2);
                if (b != null) {
                    gfoVar.c.put(userId2, Long.valueOf(j2));
                }
                if (b == null) {
                    return PostEditableData.D;
                }
                String str = b.c;
                PostingTextRestriction.Invisible invisible = PostingTextRestriction.Invisible.b;
                PostingPollDto postingPollDto = b.i;
                PostingPlaceDto postingPlaceDto = b.j;
                PostingArticleDto postingArticleDto = b.k;
                PostingLinkDto postingLinkDto = b.l;
                PrivacyPostType privacyPostType = b.d;
                PhotoVideoAttachmentsCropData photoVideoAttachmentsCropData = b.f;
                PhotoVideoDisplayMode photoVideoDisplayMode = b.e;
                MusicAttachDto musicAttachDto = b.m;
                FileDto fileDto = b.n;
                List<CoauthorDto> list = b.g;
                Date date = b.h;
                List<PostingAttachment> list2 = b.o;
                PhotoTagsData photoTagsData = b.p;
                AdditionalSettingsConfiguration additionalSettingsConfiguration = b.q;
                ActionButton actionButton = b.r;
                Boolean bool = b.s;
                return new PostEditableData(0, str, invisible, postingPollDto, postingPlaceDto, postingArticleDto, postingLinkDto, privacyPostType, photoVideoAttachmentsCropData, photoVideoDisplayMode, musicAttachDto, fileDto, list, date, list2, additionalSettingsConfiguration, photoTagsData, false, actionButton, null, bool != null ? bool.booleanValue() : false, new LinksParsingMetaData(null, null, null, null, 15, null), b.t, b.u, false, false, false, null, 251658240, null);
            }
        }).q(this.b);
    }

    @Override // xsna.tkx
    public final io.reactivex.rxjava3.internal.operators.single.f0 f(final long j, final UserId userId, final PostEditableData postEditableData) {
        return new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.ffo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                gfo gfoVar = gfo.this;
                mec0 y = gfoVar.h().y();
                long j2 = j;
                UserId userId2 = userId;
                long d = y.d(gfo.i(j2, userId2, postEditableData));
                if (d > 0) {
                    gfoVar.c.put(userId2, Long.valueOf(d));
                }
                return Long.valueOf(d);
            }
        }).q(this.b);
    }

    @Override // xsna.cfc0
    public final io.reactivex.rxjava3.core.a g(final long j, final UserId userId) {
        return new io.reactivex.rxjava3.internal.operators.completable.m(new Callable() { // from class: xsna.cfo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                gfo gfoVar = gfo.this;
                mec0 y = gfoVar.h().y();
                long j2 = j;
                UserId userId2 = userId;
                y.a(j2, userId2);
                return gfoVar.c.remove(userId2);
            }
        }).q(this.b);
    }

    public final PostingDatabase h() {
        return (PostingDatabase) this.d.getValue();
    }
}
