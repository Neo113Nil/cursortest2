package xsna;

import com.vk.knet.core.http.HttpMethod;
import com.vk.knet.core.http.HttpProtocol;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import okhttp3.Protocol;
import okhttp3.m;
import okhttp3.p;
import okhttp3.t;

/* compiled from: OkHttpExt.kt */
/* loaded from: classes2.dex */
public final class wx70 {

    /* compiled from: OkHttpExt.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Protocol.values().length];
            try {
                iArr[Protocol.HTTP_1_0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Protocol.HTTP_1_1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Protocol.HTTP_2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Protocol.H2_PRIOR_KNOWLEDGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Protocol.SPDY_3.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Protocol.QUIC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(p.a aVar, ckv ckvVar) {
        String str;
        okhttp3.m mVar;
        HttpMethod httpMethod = ckvVar.a;
        dkv dkvVar = ckvVar.d;
        if (dkvVar == null || (str = dkvVar.getContentType()) == null) {
            str = "application/x-www-form-urlencoded;charset=utf-8";
        }
        httpMethod.getClass();
        if (httpMethod != HttpMethod.POST || dkvVar == null) {
            return;
        }
        t.a aVar2 = okhttp3.t.Companion;
        byte[] content = dkvVar.getContent();
        Pattern pattern = okhttp3.m.e;
        try {
            mVar = m.a.a(str);
        } catch (IllegalArgumentException unused) {
            mVar = null;
        }
        aVar.f("POST", t.a.d(aVar2, content, mVar, 0, 6));
    }

    public static final void b(p.a aVar, Map map) {
        if (map.isEmpty()) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                aVar.a(str, (String) it.next());
            }
        }
    }

    public static final HttpProtocol c(Protocol protocol) {
        switch (a.$EnumSwitchMapping$0[protocol.ordinal()]) {
            case 1:
                return HttpProtocol.HTTP_1_0;
            case 2:
                return HttpProtocol.HTTP_1_1;
            case 3:
                return HttpProtocol.HTTP_2;
            case 4:
                return HttpProtocol.HTTP_2;
            case 5:
                return HttpProtocol.SPDY;
            case 6:
                return HttpProtocol.QUIC;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
