package xsna;

import com.ironsource.B5;
import com.vk.push.core.remote.config.omicron.util.UrlEncoder;

/* compiled from: ChannelsRecommendationsVersionInteractorImpl.kt */
/* loaded from: classes.dex */
public final class eib {
    public final Object a;

    public eib(fjk0 fjk0Var) {
        this.a = fjk0Var;
    }

    public void a(Object obj, String str) {
        StringBuilder sb = (StringBuilder) this.a;
        if (sb.length() > 0) {
            sb.append('&');
        }
        sb.append(str);
        sb.append(B5.U);
        sb.append(UrlEncoder.encodeUtf8(obj));
    }

    public eib() {
        this.a = new StringBuilder();
    }
}
