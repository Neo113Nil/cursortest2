package xsna;

import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.Image;
import kotlin.LazyThreadSafetyMode;
import one.video.exo.offline.DownloadInfo;

/* compiled from: DownloadedVideoViewState.kt */
/* loaded from: classes16.dex */
public final class cco {
    public final String a;
    public final l8s0 b;
    public final String c;
    public final String d;
    public final String e;
    public final Image f;
    public final float g;
    public final mno0 h;
    public final tlo0 i;
    public final b j;
    public final a k;
    public final pdt0 l;
    public final boolean m;
    public final boolean n;
    public final DownloadInfo.State o;

    /* compiled from: DownloadedVideoViewState.kt */
    public static final class a {
        public final DonutVideoUiModel.PreviewBadge a;
        public final Object b = msy.a(LazyThreadSafetyMode.NONE, new te0(12));

        public a(DonutVideoUiModel.PreviewBadge previewBadge) {
            this.a = previewBadge;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "DonutBadgeViewState(badgeUiModel=" + this.a + ')';
        }
    }

    /* compiled from: DownloadedVideoViewState.kt */
    public static final class b {
        public final DonutVideoUiModel.DescriptionChip a;
        public final Object b = msy.a(LazyThreadSafetyMode.NONE, new te0(12));

        public b(DonutVideoUiModel.DescriptionChip descriptionChip) {
            this.a = descriptionChip;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "DonutChipViewState(chipUiModel=" + this.a + ')';
        }
    }

    public cco(String str, l8s0 l8s0Var, String str2, String str3, String str4, Image image, float f, mno0 mno0Var, tlo0 tlo0Var, b bVar, a aVar, pdt0 pdt0Var, boolean z, boolean z2, DownloadInfo.State state) {
        this.a = str;
        this.b = l8s0Var;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = image;
        this.g = f;
        this.h = mno0Var;
        this.i = tlo0Var;
        this.j = bVar;
        this.k = aVar;
        this.l = pdt0Var;
        this.m = z;
        this.n = z2;
        this.o = state;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cco)) {
            return false;
        }
        cco ccoVar = (cco) obj;
        return epx.f(this.a, ccoVar.a) && epx.f(this.b, ccoVar.b) && epx.f(this.c, ccoVar.c) && epx.f(this.d, ccoVar.d) && epx.f(this.e, ccoVar.e) && epx.f(this.f, ccoVar.f) && Float.compare(this.g, ccoVar.g) == 0 && epx.f(this.h, ccoVar.h) && epx.f(this.i, ccoVar.i) && epx.f(this.j, ccoVar.j) && epx.f(this.k, ccoVar.k) && epx.f(this.l, ccoVar.l) && this.m == ccoVar.m && this.n == ccoVar.n && this.o == ccoVar.o;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        int a3 = com.vk.movika.sdk.base.model.history.b.a((this.h.hashCode() + io.reactivex.rxjava3.subjects.b.a(this.g, fq.b(this.f, (a2 + (str == null ? 0 : str.hashCode())) * 31, 31), 31)) * 31, 31, this.i);
        b bVar = this.j;
        int hashCode = (a3 + (bVar == null ? 0 : bVar.a.hashCode())) * 31;
        a aVar = this.k;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.a.hashCode())) * 31;
        pdt0 pdt0Var = this.l;
        return this.o.hashCode() + qoy.b(qoy.b((hashCode2 + (pdt0Var != null ? pdt0Var.hashCode() : 0)) * 31, 31, this.m), 31, this.n);
    }

    public final String toString() {
        return "DownloadedVideoViewState(videoId=" + this.a + ", videoCardSize=" + this.b + ", videoTitle=" + this.c + ", videoOwnerName=" + this.d + ", videoOwnerAvatarUrl=" + this.e + ", videoImage=" + this.f + ", videoProgress=" + this.g + ", videoViewCount=" + this.h + ", videoDuration=" + this.i + ", donutChipState=" + this.j + ", donutBadgeState=" + this.k + ", videoRestrictionType=" + this.l + ", isMusicVideoFile=" + this.m + ", isVideoOwnerVerified=" + this.n + ", downloadProgressState=" + this.o + ')';
    }
}
