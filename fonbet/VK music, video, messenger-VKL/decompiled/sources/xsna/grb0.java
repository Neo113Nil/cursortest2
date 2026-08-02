package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.stickers.api.styles.StickerCommonStyle;
import com.vkontakte.android.attachments.PollAttachment;
import java.util.ArrayList;
import xsna.hpb0;

/* compiled from: PollEditorRequestStrategy.kt */
/* loaded from: classes17.dex */
public final class grb0 {
    public final long a;
    public final Long b;
    public final String c;
    public final ArrayList d;
    public final UserId e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final int j;
    public final Integer k;
    public final StickerCommonStyle l;
    public final String m;
    public final PollAttachment n;
    public final hpb0.a o;

    public grb0(long j, Long l, String str, ArrayList arrayList, UserId userId, boolean z, boolean z2, boolean z3, int i, int i2, Integer num, StickerCommonStyle stickerCommonStyle, String str2, PollAttachment pollAttachment, hpb0.a aVar) {
        this.a = j;
        this.b = l;
        this.c = str;
        this.d = arrayList;
        this.e = userId;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = i;
        this.j = i2;
        this.k = num;
        this.l = stickerCommonStyle;
        this.m = str2;
        this.n = pollAttachment;
        this.o = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof grb0)) {
            return false;
        }
        grb0 grb0Var = (grb0) obj;
        return this.a == grb0Var.a && epx.f(this.b, grb0Var.b) && epx.f(this.c, grb0Var.c) && this.d.equals(grb0Var.d) && epx.f(this.e, grb0Var.e) && this.f == grb0Var.f && this.g == grb0Var.g && this.h == grb0Var.h && this.i == grb0Var.i && this.j == grb0Var.j && epx.f(this.k, grb0Var.k) && this.l == grb0Var.l && epx.f(this.m, grb0Var.m) && epx.f(this.n, grb0Var.n) && epx.f(this.o, grb0Var.o);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        Long l = this.b;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.c;
        int a = shy.a(this.j, shy.a(this.i, qoy.b(qoy.b(qoy.b(bh10.a(qr.a(this.d, (hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.e.b), 31, this.f), 31, this.g), 31, this.h), 31), 31);
        Integer num = this.k;
        int hashCode3 = (a + (num == null ? 0 : num.hashCode())) * 31;
        StickerCommonStyle stickerCommonStyle = this.l;
        int a2 = urd0.a((hashCode3 + (stickerCommonStyle == null ? 0 : stickerCommonStyle.hashCode())) * 31, 31, this.m);
        PollAttachment pollAttachment = this.n;
        int hashCode4 = (a2 + (pollAttachment == null ? 0 : pollAttachment.f.hashCode())) * 31;
        hpb0.a aVar = this.o;
        return hashCode4 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "PollRequestConfig(pollLifeTimeSec=" + this.a + ", date=" + this.b + ", question=" + this.c + ", options=" + this.d + ", ownerId=" + this.e + ", isAnonymous=" + this.f + ", isMultivariants=" + this.g + ", disableUnvote=" + this.h + ", backgroundId=" + this.i + ", photoId=" + this.j + ", color=" + this.k + ", style=" + this.l + ", ref=" + this.m + ", stablePoll=" + this.n + ", editResult=" + this.o + ')';
    }
}
