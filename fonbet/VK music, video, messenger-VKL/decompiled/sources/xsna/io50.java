package xsna;

import android.net.Uri;
import android.os.SystemClock;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.api.http.DnsOverHttpApiEndpointProvider;
import ru.ok.android.api.http.HttpApiEndpointProvider;
import xsna.ui80;

/* compiled from: MyCdnHttpApiEndpointProvider.kt */
/* loaded from: classes11.dex */
public final class io50 implements HttpApiEndpointProvider {
    public static final Uri f = Uri.parse("https://api.mycdn.me");
    public final ui80.a a;
    public final DnsOverHttpApiEndpointProvider.CacheStrategy b;
    public final DnsOverHttpApiEndpointProvider.FallbackStrategy c;
    public volatile long d = Long.MIN_VALUE;
    public volatile Uri e;

    /* compiled from: MyCdnHttpApiEndpointProvider.kt */
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DnsOverHttpApiEndpointProvider.FallbackStrategy.values().length];
            try {
                iArr[DnsOverHttpApiEndpointProvider.FallbackStrategy.REPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DnsOverHttpApiEndpointProvider.FallbackStrategy.ONCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DnsOverHttpApiEndpointProvider.FallbackStrategy.FOREVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DnsOverHttpApiEndpointProvider.CacheStrategy.values().length];
            try {
                iArr2[DnsOverHttpApiEndpointProvider.CacheStrategy.ONCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[DnsOverHttpApiEndpointProvider.CacheStrategy.TTL.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[DnsOverHttpApiEndpointProvider.CacheStrategy.NEVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public io50(ui80.a aVar, DnsOverHttpApiEndpointProvider.CacheStrategy cacheStrategy, DnsOverHttpApiEndpointProvider.FallbackStrategy fallbackStrategy) {
        this.a = aVar;
        this.b = cacheStrategy;
        this.c = fallbackStrategy;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        if (r1.regionMatches(0, r13, 0, r2) != false) goto L19;
     */
    @Override // ru.ok.android.api.http.HttpApiEndpointProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Uri getApiEndpoint(String str) {
        Uri apiEndpoint = this.a.getApiEndpoint(str);
        if (!str.equals("api")) {
            return apiEndpoint;
        }
        Uri uri = f;
        String uri2 = apiEndpoint.toString();
        String uri3 = uri.toString();
        if (!uri2.equals(uri3)) {
            int H = drm0.G(uri2, '/') ? drm0.H(uri2) : uri2.length();
            if (H == (drm0.G(uri3, '/') ? drm0.H(uri3) : uri3.length())) {
            }
        }
        if (SystemClock.elapsedRealtime() > this.d) {
            synchronized (this) {
                try {
                    if (SystemClock.elapsedRealtime() > this.d) {
                        long j = Long.MAX_VALUE;
                        try {
                            String obj = drm0.p0(e9u.a().a()).toString();
                            if (drm0.E(obj, ' ')) {
                                obj = obj.substring(drm0.P(obj, ' ', 0, 6) + 1);
                            }
                            if (drm0.G(obj, '/')) {
                                obj = obj.substring(0, drm0.H(obj));
                            }
                            Uri parse = Uri.parse(obj);
                            this.e = parse;
                            int i = a.$EnumSwitchMapping$1[this.b.ordinal()];
                            if (i != 1) {
                                if (i == 2) {
                                    j = SystemClock.elapsedRealtime() + r0.b();
                                } else {
                                    if (i != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    j = Long.MIN_VALUE;
                                }
                            }
                            this.d = j;
                            return parse;
                        } catch (Exception e) {
                            int i2 = a.$EnumSwitchMapping$0[this.c.ordinal()];
                            if (i2 == 1) {
                                throw e;
                            }
                            if (i2 == 2) {
                                j = Long.MIN_VALUE;
                            } else if (i2 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.d = j;
                            Uri uri4 = this.e;
                            return uri4 == null ? apiEndpoint : uri4;
                        }
                    }
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        Uri uri5 = this.e;
        return uri5 == null ? apiEndpoint : uri5;
    }
}
