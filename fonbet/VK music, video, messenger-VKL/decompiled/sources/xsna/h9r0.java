package xsna;

import com.vk.api.sdk.auth.VKScope;
import java.util.Collection;
import java.util.HashSet;

/* compiled from: VKAuthParams.kt */
/* loaded from: classes15.dex */
public final class h9r0 {
    public static final String d = zr.a("https://", "oauth.".concat(a0a.d), "/blank.html");
    public final int a;
    public final String b;
    public final HashSet c;

    public h9r0(int i, String str, Collection<? extends VKScope> collection) {
        this.a = i;
        this.b = str;
        if (i == 0) {
            throw new IllegalStateException("AppId is empty! Find out how to get your appId at https://vk.com/dev/access_token");
        }
        this.c = new HashSet(collection);
    }
}
