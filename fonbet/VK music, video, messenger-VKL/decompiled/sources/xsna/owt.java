package xsna;

import com.vk.api.generated.video.dto.VideoGetCommentsExtendedSortDto;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.api.data.VideoStatistic;

/* compiled from: VideoCommentsRepository.kt */
/* loaded from: classes4.dex */
public final class owt {
    public final int a;
    public final UserId b;
    public final String c;
    public final Integer d;
    public final Integer e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final Integer i;
    public final VideoGetCommentsExtendedSortDto j;
    public final VideoStatistic k;

    public /* synthetic */ owt(int i, UserId userId, String str, Integer num, Integer num2, int i2, Integer num3, VideoGetCommentsExtendedSortDto videoGetCommentsExtendedSortDto, VideoStatistic videoStatistic, int i3) {
        this(i, userId, str, num, (i3 & 16) != 0 ? null : num2, false, true, (i3 & 128) != 0 ? 1 : i2, (i3 & 256) != 0 ? null : num3, (i3 & 512) != 0 ? null : videoGetCommentsExtendedSortDto, videoStatistic);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof owt)) {
            return false;
        }
        owt owtVar = (owt) obj;
        return this.a == owtVar.a && epx.f(this.b, owtVar.b) && epx.f(this.c, owtVar.c) && epx.f(this.d, owtVar.d) && epx.f(this.e, owtVar.e) && this.f == owtVar.f && this.g == owtVar.g && this.h == owtVar.h && epx.f(this.i, owtVar.i) && this.j == owtVar.j && epx.f(this.k, owtVar.k);
    }

    public final int hashCode() {
        int a = bh10.a(Integer.hashCode(this.a) * 31, 31, this.b.b);
        String str = this.c;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int a2 = shy.a(this.h, qoy.b(qoy.b((hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.f), 31, this.g), 31);
        Integer num3 = this.i;
        int hashCode3 = (a2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        VideoGetCommentsExtendedSortDto videoGetCommentsExtendedSortDto = this.j;
        int hashCode4 = (hashCode3 + (videoGetCommentsExtendedSortDto == null ? 0 : videoGetCommentsExtendedSortDto.hashCode())) * 31;
        VideoStatistic videoStatistic = this.k;
        return hashCode4 + (videoStatistic != null ? videoStatistic.hashCode() : 0);
    }

    public final String toString() {
        return "GetVideoCommentsParams(videoId=" + this.a + ", ownerId=" + this.b + ", accessKey=" + this.c + ", startCommentId=" + this.d + ", commentId=" + this.e + ", isNeedReverse=" + this.f + ", needLikes=" + this.g + ", count=" + this.h + ", offset=" + this.i + ", sort=" + this.j + ", videoStatistic=" + this.k + ')';
    }

    public owt(int i, UserId userId, String str, Integer num, Integer num2, boolean z, boolean z2, int i2, Integer num3, VideoGetCommentsExtendedSortDto videoGetCommentsExtendedSortDto, VideoStatistic videoStatistic) {
        this.a = i;
        this.b = userId;
        this.c = str;
        this.d = num;
        this.e = num2;
        this.f = z;
        this.g = z2;
        this.h = i2;
        this.i = num3;
        this.j = videoGetCommentsExtendedSortDto;
        this.k = videoStatistic;
    }
}
