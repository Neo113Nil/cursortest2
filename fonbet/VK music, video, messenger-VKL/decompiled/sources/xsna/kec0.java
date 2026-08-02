package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.posting.additional_settings.data.AdditionalSettingsConfiguration;
import com.vk.newsfeed.posting.api.model.PhotoVideoDisplayMode;
import com.vk.newsfeed.posting.impl.domain.model.PhotoVideoAttachmentsCropData;
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
import com.vk.newsfeed.posting.privacy_picker.model.PrivacyPostType;
import java.util.Date;
import java.util.List;

/* compiled from: PostingDraft.kt */
/* loaded from: classes4.dex */
public final class kec0 {
    public final long a;
    public final UserId b;
    public final String c;
    public final PrivacyPostType d;
    public final PhotoVideoDisplayMode e;
    public final PhotoVideoAttachmentsCropData f;
    public final List<CoauthorDto> g;
    public final Date h;
    public final PostingPollDto i;
    public final PostingPlaceDto j;
    public final PostingArticleDto k;
    public final PostingLinkDto l;
    public final MusicAttachDto m;
    public final FileDto n;
    public final List<PostingAttachment> o;
    public final PhotoTagsData p;
    public final AdditionalSettingsConfiguration q;
    public final ActionButton r;
    public final Boolean s;
    public final Date t;
    public final String u;

    /* JADX WARN: Multi-variable type inference failed */
    public kec0(long j, UserId userId, String str, PrivacyPostType privacyPostType, PhotoVideoDisplayMode photoVideoDisplayMode, PhotoVideoAttachmentsCropData photoVideoAttachmentsCropData, List<CoauthorDto> list, Date date, PostingPollDto postingPollDto, PostingPlaceDto postingPlaceDto, PostingArticleDto postingArticleDto, PostingLinkDto postingLinkDto, MusicAttachDto musicAttachDto, FileDto fileDto, List<? extends PostingAttachment> list2, PhotoTagsData photoTagsData, AdditionalSettingsConfiguration additionalSettingsConfiguration, ActionButton actionButton, Boolean bool, Date date2, String str2) {
        this.a = j;
        this.b = userId;
        this.c = str;
        this.d = privacyPostType;
        this.e = photoVideoDisplayMode;
        this.f = photoVideoAttachmentsCropData;
        this.g = list;
        this.h = date;
        this.i = postingPollDto;
        this.j = postingPlaceDto;
        this.k = postingArticleDto;
        this.l = postingLinkDto;
        this.m = musicAttachDto;
        this.n = fileDto;
        this.o = list2;
        this.p = photoTagsData;
        this.q = additionalSettingsConfiguration;
        this.r = actionButton;
        this.s = bool;
        this.t = date2;
        this.u = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kec0)) {
            return false;
        }
        kec0 kec0Var = (kec0) obj;
        return this.a == kec0Var.a && epx.f(this.b, kec0Var.b) && epx.f(this.c, kec0Var.c) && epx.f(this.d, kec0Var.d) && this.e == kec0Var.e && epx.f(this.f, kec0Var.f) && epx.f(this.g, kec0Var.g) && epx.f(this.h, kec0Var.h) && epx.f(this.i, kec0Var.i) && epx.f(this.j, kec0Var.j) && epx.f(this.k, kec0Var.k) && epx.f(this.l, kec0Var.l) && epx.f(this.m, kec0Var.m) && epx.f(this.n, kec0Var.n) && epx.f(this.o, kec0Var.o) && epx.f(this.p, kec0Var.p) && epx.f(this.q, kec0Var.q) && epx.f(this.r, kec0Var.r) && epx.f(this.s, kec0Var.s) && epx.f(this.t, kec0Var.t) && epx.f(this.u, kec0Var.u);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + urd0.a(bh10.a(Long.hashCode(this.a) * 31, 31, this.b.b), 31, this.c)) * 31)) * 31)) * 31;
        List<CoauthorDto> list = this.g;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Date date = this.h;
        int hashCode3 = (hashCode2 + (date == null ? 0 : date.hashCode())) * 31;
        PostingPollDto postingPollDto = this.i;
        int hashCode4 = (hashCode3 + (postingPollDto == null ? 0 : postingPollDto.hashCode())) * 31;
        PostingPlaceDto postingPlaceDto = this.j;
        int hashCode5 = (hashCode4 + (postingPlaceDto == null ? 0 : postingPlaceDto.hashCode())) * 31;
        PostingArticleDto postingArticleDto = this.k;
        int hashCode6 = (hashCode5 + (postingArticleDto == null ? 0 : postingArticleDto.hashCode())) * 31;
        PostingLinkDto postingLinkDto = this.l;
        int hashCode7 = (hashCode6 + (postingLinkDto == null ? 0 : postingLinkDto.hashCode())) * 31;
        MusicAttachDto musicAttachDto = this.m;
        int hashCode8 = (hashCode7 + (musicAttachDto == null ? 0 : musicAttachDto.hashCode())) * 31;
        FileDto fileDto = this.n;
        int a = fw3.a((hashCode8 + (fileDto == null ? 0 : fileDto.hashCode())) * 31, 31, this.o);
        PhotoTagsData photoTagsData = this.p;
        int hashCode9 = (a + (photoTagsData == null ? 0 : photoTagsData.hashCode())) * 31;
        AdditionalSettingsConfiguration additionalSettingsConfiguration = this.q;
        int hashCode10 = (hashCode9 + (additionalSettingsConfiguration == null ? 0 : additionalSettingsConfiguration.hashCode())) * 31;
        ActionButton actionButton = this.r;
        int hashCode11 = (hashCode10 + (actionButton == null ? 0 : actionButton.hashCode())) * 31;
        Boolean bool = this.s;
        int hashCode12 = (hashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        Date date2 = this.t;
        int hashCode13 = (hashCode12 + (date2 == null ? 0 : date2.hashCode())) * 31;
        String str = this.u;
        return hashCode13 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostingDraft(id=");
        sb.append(this.a);
        sb.append(", userId=");
        sb.append(this.b);
        sb.append(", text=");
        sb.append(this.c);
        sb.append(", privacySettingsType=");
        sb.append(this.d);
        sb.append(", photoVideoDisplayMode=");
        sb.append(this.e);
        sb.append(", photoVideoCropData=");
        sb.append(this.f);
        sb.append(", coauthors=");
        sb.append(this.g);
        sb.append(", postponePublishDate=");
        sb.append(this.h);
        sb.append(", poll=");
        sb.append(this.i);
        sb.append(", place=");
        sb.append(this.j);
        sb.append(", article=");
        sb.append(this.k);
        sb.append(", link=");
        sb.append(this.l);
        sb.append(", music=");
        sb.append(this.m);
        sb.append(", file=");
        sb.append(this.n);
        sb.append(", attachments=");
        sb.append(this.o);
        sb.append(", photoTags=");
        sb.append(this.p);
        sb.append(", settings=");
        sb.append(this.q);
        sb.append(", actionButton=");
        sb.append(this.r);
        sb.append(", rememberActionButton=");
        sb.append(this.s);
        sb.append(", openForAllDate=");
        sb.append(this.t);
        sb.append(", donutTeaserText=");
        return ho8.a(sb, this.u, ')');
    }
}
