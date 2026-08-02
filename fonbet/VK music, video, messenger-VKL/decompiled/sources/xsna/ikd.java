package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkVideoAdInfo;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoAdsType;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.dto.common.id.UserId;
import xsna.g8d;

/* compiled from: ClipsBottomSheetParams.kt */
/* loaded from: classes17.dex */
public final class ikd {
    public final SdkVideoFile a;
    public final String b;
    public final boolean c;
    public final UserId d;
    public final dz20 e;
    public final g8d.a f;
    public final boolean g;
    public final sih0 h;
    public final boolean i;

    public ikd(SdkVideoFile sdkVideoFile, String str, boolean z, UserId userId, dz20 dz20Var, g8d.a aVar, boolean z2, sih0 sih0Var, boolean z3) {
        this.a = sdkVideoFile;
        this.b = str;
        this.c = z;
        this.d = userId;
        this.e = dz20Var;
        this.f = aVar;
        this.g = z2;
        this.h = sih0Var;
        this.i = z3;
    }

    public final boolean a() {
        SdkVideoAdInfo X0 = this.a.X0();
        if ((X0 != null ? X0.h : null) != SdkVideoAdsType.MAIL_SHORT_VIDEO_KNOWN_OWNER) {
            return false;
        }
        g8d.a aVar = this.f;
        g8d.a.C2925a c2925a = aVar instanceof g8d.a.C2925a ? (g8d.a.C2925a) aVar : null;
        return !((c2925a != null ? c2925a.a : null) instanceof ClipFeedTab.SingleAdv);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ikd)) {
            return false;
        }
        ikd ikdVar = (ikd) obj;
        return epx.f(this.a, ikdVar.a) && epx.f(this.b, ikdVar.b) && this.c == ikdVar.c && epx.f(this.d, ikdVar.d) && epx.f(this.e, ikdVar.e) && epx.f(this.f, ikdVar.f) && this.g == ikdVar.g && epx.f(this.h, ikdVar.h) && this.i == ikdVar.i;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int a = bh10.a(qoy.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d.b);
        dz20 dz20Var = this.e;
        int hashCode2 = (a + (dz20Var == null ? 0 : dz20Var.hashCode())) * 31;
        g8d.a aVar = this.f;
        int b = qoy.b((hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.g);
        sih0 sih0Var = this.h;
        return Boolean.hashCode(this.i) + ((b + (sih0Var != null ? sih0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsBottomSheetParams(video=");
        sb.append(this.a);
        sb.append(", ref=");
        sb.append(this.b);
        sb.append(", shouldNotifyVideoUpdates=");
        sb.append(this.c);
        sb.append(", targetId=");
        sb.append(this.d);
        sb.append(", stateCallback=");
        sb.append(this.e);
        sb.append(", source=");
        sb.append(this.f);
        sb.append(", isAnonymous=");
        sb.append(this.g);
        sb.append(", actionTracker=");
        sb.append(this.h);
        sb.append(", forceDarkTheme=");
        return defpackage.q0.a(sb, this.i, ')');
    }

    public /* synthetic */ ikd(SdkVideoFile sdkVideoFile, String str, UserId userId, dz20 dz20Var, g8d.a aVar, boolean z, sih0 sih0Var, boolean z2, int i) {
        this(sdkVideoFile, (i & 2) != 0 ? null : str, (i & 4) == 0, (i & 8) != 0 ? UserId.d : userId, (i & 16) != 0 ? null : dz20Var, (i & 32) != 0 ? null : aVar, (i & 64) != 0 ? false : z, (i & 128) != 0 ? null : sih0Var, (i & 256) != 0 ? true : z2);
    }
}
