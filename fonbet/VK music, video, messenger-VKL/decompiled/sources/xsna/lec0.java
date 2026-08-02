package xsna;

import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.newsfeed.api.posting.dto.PostingOrd;
import com.vk.newsfeed.api.posting.viewpresenter.CropsForRatio;
import com.vk.sharing.api.dto.Target;
import com.vkontakte.android.attachments.GeoAttachment;
import java.util.Date;
import java.util.List;

/* compiled from: PostingDraft.kt */
/* loaded from: classes4.dex */
public final class lec0 {
    public final long a;
    public final UserId b;
    public final Date c;
    public final String d;
    public final List<Attachment> e;
    public final GeoAttachment f;
    public final String g;
    public final Integer h;
    public final UserId i;
    public final String j;
    public final Integer k;
    public final Target l;
    public final Date m;
    public final boolean n;
    public final boolean o;
    public final PostingVisibilityMode p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final Integer t;
    public final Boolean u;
    public final PostingOrd v;
    public final CropsForRatio w;

    /* JADX WARN: Multi-variable type inference failed */
    public lec0(long j, UserId userId, Date date, String str, List<? extends Attachment> list, GeoAttachment geoAttachment, String str2, Integer num, UserId userId2, String str3, Integer num2, Target target, Date date2, boolean z, boolean z2, PostingVisibilityMode postingVisibilityMode, boolean z3, boolean z4, boolean z5, Integer num3, Boolean bool, PostingOrd postingOrd, CropsForRatio cropsForRatio) {
        this.a = j;
        this.b = userId;
        this.c = date;
        this.d = str;
        this.e = list;
        this.f = geoAttachment;
        this.g = str2;
        this.h = num;
        this.i = userId2;
        this.j = str3;
        this.k = num2;
        this.l = target;
        this.m = date2;
        this.n = z;
        this.o = z2;
        this.p = postingVisibilityMode;
        this.q = z3;
        this.r = z4;
        this.s = z5;
        this.t = num3;
        this.u = bool;
        this.v = postingOrd;
        this.w = cropsForRatio;
    }
}
