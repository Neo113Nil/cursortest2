package xsna;

import com.vk.api.generated.video.dto.VideoCreateCommentScreenModeDto;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.api.data.VideoStatistic;
import java.util.List;

/* compiled from: VideoCommentsRepository.kt */
/* loaded from: classes4.dex */
public final class pak {
    public final String a;
    public final Integer b;
    public final Integer c;
    public final List<Attachment> d;
    public final int e;
    public final UserId f;
    public final String g;
    public final String h;
    public final String i;
    public final VideoStatistic j;
    public final UserId k;
    public final VideoCreateCommentScreenModeDto l;

    /* JADX WARN: Multi-variable type inference failed */
    public pak(String str, Integer num, Integer num2, List<? extends Attachment> list, int i, UserId userId, String str2, String str3, String str4, VideoStatistic videoStatistic, UserId userId2, VideoCreateCommentScreenModeDto videoCreateCommentScreenModeDto) {
        this.a = str;
        this.b = num;
        this.c = num2;
        this.d = list;
        this.e = i;
        this.f = userId;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = videoStatistic;
        this.k = userId2;
        this.l = videoCreateCommentScreenModeDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pak)) {
            return false;
        }
        pak pakVar = (pak) obj;
        return epx.f(this.a, pakVar.a) && epx.f(this.b, pakVar.b) && epx.f(this.c, pakVar.c) && epx.f(this.d, pakVar.d) && this.e == pakVar.e && epx.f(this.f, pakVar.f) && epx.f(this.g, pakVar.g) && epx.f(this.h, pakVar.h) && epx.f(this.i, pakVar.i) && epx.f(this.j, pakVar.j) && epx.f(this.k, pakVar.k) && this.l == pakVar.l;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int a = bh10.a(shy.a(this.e, fw3.a((hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.d), 31), 31, this.f.b);
        String str = this.g;
        int hashCode3 = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        VideoStatistic videoStatistic = this.j;
        int hashCode6 = (hashCode5 + (videoStatistic == null ? 0 : videoStatistic.hashCode())) * 31;
        UserId userId = this.k;
        int hashCode7 = (hashCode6 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        VideoCreateCommentScreenModeDto videoCreateCommentScreenModeDto = this.l;
        return hashCode7 + (videoCreateCommentScreenModeDto != null ? videoCreateCommentScreenModeDto.hashCode() : 0);
    }

    public final String toString() {
        return "CreateVideoCommentParams(txt=" + this.a + ", replyToCommentId=" + this.b + ", commentId=" + this.c + ", attrs=" + this.d + ", videoId=" + this.e + ", ownerId=" + this.f + ", accessKey=" + this.g + ", ref=" + this.h + ", trackCode=" + this.i + ", videoStatistic=" + this.j + ", fromGroup=" + this.k + ", screenMode=" + this.l + ')';
    }
}
