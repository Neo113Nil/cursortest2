package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkVideoAdsType;
import com.vkontakte.android.R;
import xsna.g1n;
import xsna.tlo0;

/* compiled from: DisclaimerMapper.kt */
/* loaded from: classes17.dex */
public final class b1n {
    public static g1n a(b1n b1nVar, tgg tggVar, boolean z, boolean z2, int i) {
        g1n.a bVar;
        if ((i & 4) != 0) {
            z2 = false;
        }
        boolean z3 = (i & 8) != 0;
        StringBuilder sb = new StringBuilder();
        String str = tggVar.a;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append(' ');
        String str2 = tggVar.e;
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        String obj = drm0.p0(sb.toString()).toString();
        String str3 = null;
        if (!myc0.f(obj)) {
            obj = null;
        }
        if (z2 || tggVar.g != SdkVideoAdsType.MAIL_SHORT_VIDEO_KNOWN_OWNER) {
            boolean z4 = obj != null;
            String str4 = tggVar.c;
            if (str4 != null) {
                if (!myc0.f(str4)) {
                    str4 = null;
                }
                if (str4 != null) {
                    str3 = z4 ? " · ".concat(str4) : str4;
                }
            }
        } else {
            str3 = "";
        }
        if (str3 != null) {
            bVar = new g1n.a.b(oq.d(tlo0.Companion, (obj != null ? obj : "").concat(str3)));
        } else if (myc0.f(obj) && !z3) {
            bVar = new g1n.a.b(oq.d(tlo0.Companion, obj != null ? obj : ""));
        } else if (myc0.f(obj)) {
            tlo0.Companion.getClass();
            bVar = new g1n.a.C2909a(e43.l(new tlo0.h(obj + " · "), new tlo0.f(R.string.clip_ads_disclaimer_stub)));
        } else {
            bVar = new g1n.a.b(tq.h(tlo0.Companion, R.string.clip_ads_disclaimer_stub));
        }
        return new g1n(bVar, z);
    }
}
