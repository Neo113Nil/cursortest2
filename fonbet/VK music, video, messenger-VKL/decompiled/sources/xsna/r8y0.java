package xsna;

import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;

/* compiled from: LinkScheme.kt */
/* loaded from: classes2.dex */
public final class r8y0 extends Lambda implements gzs<Regex> {
    public static final r8y0 i = new r8y0(0);

    @Override // xsna.gzs
    public final Regex invoke() {
        return new Regex("(^|[a-z0-9.\\-]*\\.)(vk|vkontakte)\\.(com|ru|me)");
    }
}
