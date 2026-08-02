package xsna;

import kotlin.LazyThreadSafetyMode;
import kotlin.text.Regex;

/* compiled from: DeepLinkRouteFactory.kt */
/* loaded from: classes4.dex */
public final class k9l {
    public static final Object a = msy.a(LazyThreadSafetyMode.NONE, new sv0(12));

    public final j9l a(String str) {
        if (drm0.N(str)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return new j9l(new uq90(str, brm0.y(brm0.y(new Regex(":([a-zA-Z0-9]+)").g(str, "(?<$1>[^/]+)"), "/*/", "/(?:.+/)?"), "*", ".*")));
    }

    public final j9l b(String str) {
        if (drm0.N(str)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return new j9l(new uq90(null, str));
    }
}
