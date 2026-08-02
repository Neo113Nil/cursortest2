package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.posting.additional_settings.data.AdditionalSettingsConfiguration;
import com.vk.newsfeed.posting.api.model.PhotoVideoDisplayMode;
import com.vk.newsfeed.posting.impl.domain.model.PhotoVideoAttachmentsCropData;
import com.vk.newsfeed.posting.impl.domain.model.attachments.PostingLinkDto;
import com.vk.newsfeed.posting.impl.presentation.model.CoauthorDto;
import com.vk.newsfeed.posting.privacy_picker.model.PrivacyPostType;
import java.util.Date;
import java.util.List;

/* compiled from: PublishData.kt */
/* loaded from: classes4.dex */
public final class pbe0 {
    public final UserId a;
    public final UserId b;
    public final String c;
    public final u0p d;
    public final String e;
    public final int f;
    public final long g;
    public final AdditionalSettingsConfiguration h;
    public final String i;
    public final Integer j;
    public final String k;
    public final PrivacyPostType l;
    public final PhotoVideoDisplayMode m;
    public final PhotoVideoAttachmentsCropData n;
    public final PostingLinkDto o;
    public final String p;
    public final boolean q;
    public final Date r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final List<CoauthorDto> v;
    public final String w;
    public final boolean x;
    public final boolean y;

    public pbe0(UserId userId, UserId userId2, String str, u0p u0pVar, String str2, int i, long j, AdditionalSettingsConfiguration additionalSettingsConfiguration, String str3, Integer num, String str4, PrivacyPostType privacyPostType, PhotoVideoDisplayMode photoVideoDisplayMode, PhotoVideoAttachmentsCropData photoVideoAttachmentsCropData, PostingLinkDto postingLinkDto, String str5, boolean z, Date date, boolean z2, boolean z3, boolean z4, List<CoauthorDto> list, String str6, boolean z5, boolean z6) {
        this.a = userId;
        this.b = userId2;
        this.c = str;
        this.d = u0pVar;
        this.e = str2;
        this.f = i;
        this.g = j;
        this.h = additionalSettingsConfiguration;
        this.i = str3;
        this.j = num;
        this.k = str4;
        this.l = privacyPostType;
        this.m = photoVideoDisplayMode;
        this.n = photoVideoAttachmentsCropData;
        this.o = postingLinkDto;
        this.p = str5;
        this.q = z;
        this.r = date;
        this.s = z2;
        this.t = z3;
        this.u = z4;
        this.v = list;
        this.w = str6;
        this.x = z5;
        this.y = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pbe0)) {
            return false;
        }
        pbe0 pbe0Var = (pbe0) obj;
        return epx.f(this.a, pbe0Var.a) && epx.f(this.b, pbe0Var.b) && epx.f(this.c, pbe0Var.c) && epx.f(this.d, pbe0Var.d) && epx.f(this.e, pbe0Var.e) && this.f == pbe0Var.f && this.g == pbe0Var.g && epx.f(this.h, pbe0Var.h) && epx.f(this.i, pbe0Var.i) && epx.f(this.j, pbe0Var.j) && epx.f(this.k, pbe0Var.k) && epx.f(this.l, pbe0Var.l) && this.m == pbe0Var.m && epx.f(this.n, pbe0Var.n) && epx.f(this.o, pbe0Var.o) && epx.f(this.p, pbe0Var.p) && this.q == pbe0Var.q && epx.f(this.r, pbe0Var.r) && this.s == pbe0Var.s && this.t == pbe0Var.t && this.u == pbe0Var.u && epx.f(this.v, pbe0Var.v) && epx.f(this.w, pbe0Var.w) && this.x == pbe0Var.x && this.y == pbe0Var.y;
    }

    public final int hashCode() {
        int a = urd0.a(bh10.a(Long.hashCode(this.a.b) * 31, 31, this.b.b), 31, this.c);
        u0p u0pVar = this.d;
        int hashCode = (a + (u0pVar == null ? 0 : u0pVar.hashCode())) * 31;
        String str = this.e;
        int a2 = bh10.a(shy.a(this.f, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.g);
        AdditionalSettingsConfiguration additionalSettingsConfiguration = this.h;
        int hashCode2 = (a2 + (additionalSettingsConfiguration == null ? 0 : additionalSettingsConfiguration.hashCode())) * 31;
        String str2 = this.i;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.j;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.k;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        PrivacyPostType privacyPostType = this.l;
        int hashCode6 = (hashCode5 + (privacyPostType == null ? 0 : privacyPostType.hashCode())) * 31;
        PhotoVideoDisplayMode photoVideoDisplayMode = this.m;
        int hashCode7 = (hashCode6 + (photoVideoDisplayMode == null ? 0 : photoVideoDisplayMode.hashCode())) * 31;
        PhotoVideoAttachmentsCropData photoVideoAttachmentsCropData = this.n;
        int hashCode8 = (hashCode7 + (photoVideoAttachmentsCropData == null ? 0 : photoVideoAttachmentsCropData.hashCode())) * 31;
        PostingLinkDto postingLinkDto = this.o;
        int hashCode9 = (hashCode8 + (postingLinkDto == null ? 0 : postingLinkDto.hashCode())) * 31;
        String str4 = this.p;
        int b = qoy.b((hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.q);
        Date date = this.r;
        int a3 = fw3.a(qoy.b(qoy.b(qoy.b((b + (date == null ? 0 : date.hashCode())) * 31, 31, this.s), 31, this.t), 31, this.u), 31, this.v);
        String str5 = this.w;
        return Boolean.hashCode(this.y) + qoy.b((a3 + (str5 != null ? str5.hashCode() : 0)) * 31, 31, this.x);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PublishData(wallOwnerId=");
        sb.append(this.a);
        sb.append(", authorId=");
        sb.append(this.b);
        sb.append(", postText=");
        sb.append(this.c);
        sb.append(", editPostData=");
        sb.append(this.d);
        sb.append(", preparedAttachments=");
        sb.append(this.e);
        sb.append(", placeId=");
        sb.append(this.f);
        sb.append(", postponePublishTimeSec=");
        sb.append(this.g);
        sb.append(", settings=");
        sb.append(this.h);
        sb.append(", entryPoint=");
        sb.append(this.i);
        sb.append(", creationSessionId=");
        sb.append(this.j);
        sb.append(", navScreen=");
        sb.append(this.k);
        sb.append(", privacyPostType=");
        sb.append(this.l);
        sb.append(", primaryAttachDisplayMode=");
        sb.append(this.m);
        sb.append(", cropData=");
        sb.append(this.n);
        sb.append(", link=");
        sb.append(this.o);
        sb.append(", actionButton=");
        sb.append(this.p);
        sb.append(", isActionButtonRemembered=");
        sb.append(this.q);
        sb.append(", openForAllDate=");
        sb.append(this.r);
        sb.append(", isSignEnabled=");
        sb.append(this.s);
        sb.append(", isSuggested=");
        sb.append(this.t);
        sb.append(", isCommunityAdmin=");
        sb.append(this.u);
        sb.append(", coauthors=");
        sb.append(this.v);
        sb.append(", donutTeaserText=");
        sb.append(this.w);
        sb.append(", saveDraft=");
        sb.append(this.x);
        sb.append(", isStoryAutorepost=");
        return defpackage.q0.a(sb, this.y, ')');
    }
}
