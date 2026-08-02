package yads;

import com.unity3d.ads.BuildConfig;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes10.dex */
public final class av {
    public static String a(yu yuVar) {
        if (yuVar instanceof uu) {
            String str = ((uu) yuVar).a.h;
            return str == null ? "unknown" : str;
        }
        if (yuVar instanceof vu) {
            return BuildConfig.FLAVOR;
        }
        if (yuVar instanceof wu) {
            return "empty";
        }
        if (yuVar instanceof xu) {
            return "error";
        }
        throw new NoWhenBranchMatchedException();
    }
}
