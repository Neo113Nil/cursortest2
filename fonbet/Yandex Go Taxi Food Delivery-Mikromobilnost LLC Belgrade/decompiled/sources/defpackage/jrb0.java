package defpackage;

import android.util.Log;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class jrb0 {

    public static class a {
        public String a;
        public Long b;
        public Boolean c;
    }

    public static class b {
        public String a;
        public Double b;
        public Double c;
    }

    public static class c {
        public String a;
    }

    public static class d {
        public byte[] a;
        public String b;
    }

    public static class e {
        public String a;
        public String b;
    }

    public static class f {
        public String a;
        public Long b;
    }

    public static class g {
        public Long a;
    }

    public static class h {
        public String a;
        public Long b;
        public Long c;
        public Long d;
        public String e;
        public Boolean f;
        public Long g;
        public Long h;
        public Long i;
        public Long j;
        public Long k;
        public Boolean l;
    }

    public static class i {
        public Long a;
        public Long b;
        public String c;
        public byte[] d;
    }

    public static class j {
        public Long a;
        public Long b;
        public Long c;
    }

    public static class k {
        public Long a;
    }

    public static class l {
        public String a;
        public Long b;
        public String c;
        public Long d;
        public Long e;
        public Long f;
        public String g;
        public Long h;
        public Long i;
        public Long j;
        public Long k;
        public Double l;
        public Double m;
        public Long n;
        public Long o;
        public Boolean p;
    }

    public static HashMap a(Throwable th) {
        HashMap hashMap = new HashMap();
        hashMap.put(Constants.KEY_MESSAGE, th.toString());
        hashMap.put(AuthSdkActivity.RESPONSE_TYPE_CODE, th.getClass().getSimpleName());
        hashMap.put("details", "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return hashMap;
    }
}
