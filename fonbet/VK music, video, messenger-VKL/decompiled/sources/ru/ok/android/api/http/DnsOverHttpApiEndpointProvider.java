package ru.ok.android.api.http;

import android.net.Uri;
import android.os.SystemClock;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.api.core.ApiUris;
import ru.ok.android.commons.os.AutoTraceCompat;
import xsna.asp;
import xsna.drm0;
import xsna.epx;
import xsna.s3q0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: DnsOverHttpApiEndpointProvider.kt */
/* loaded from: classes11.dex */
public final class DnsOverHttpApiEndpointProvider implements HttpApiEndpointProvider {
    private static final String API_ENDPOINT_KEY = "api._endpoint.ok.ru.";
    public static final Companion Companion = new Companion(null);
    private final CacheStrategy cacheStrategy;
    private final HttpApiEndpointProvider delegate;
    private volatile long expireRealtime;
    private final FallbackStrategy fallbackStrategy;
    private volatile Uri resolvedEndpoint;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DnsOverHttpApiEndpointProvider.kt */
    public static final class CacheStrategy {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CacheStrategy[] $VALUES;
        public static final CacheStrategy ONCE = new CacheStrategy("ONCE", 0);
        public static final CacheStrategy TTL = new CacheStrategy("TTL", 1);
        public static final CacheStrategy NEVER = new CacheStrategy("NEVER", 2);

        private static final /* synthetic */ CacheStrategy[] $values() {
            return new CacheStrategy[]{ONCE, TTL, NEVER};
        }

        static {
            CacheStrategy[] $values = $values();
            $VALUES = $values;
            $ENTRIES = new asp($values);
        }

        private CacheStrategy(String str, int i) {
        }

        public static zrp<CacheStrategy> getEntries() {
            return $ENTRIES;
        }

        public static CacheStrategy valueOf(String str) {
            return (CacheStrategy) Enum.valueOf(CacheStrategy.class, str);
        }

        public static CacheStrategy[] values() {
            return (CacheStrategy[]) $VALUES.clone();
        }
    }

    /* compiled from: DnsOverHttpApiEndpointProvider.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DnsOverHttpApiEndpointProvider.kt */
    public static final class FallbackStrategy {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ FallbackStrategy[] $VALUES;
        public static final FallbackStrategy REPORT = new FallbackStrategy("REPORT", 0);
        public static final FallbackStrategy ONCE = new FallbackStrategy("ONCE", 1);
        public static final FallbackStrategy FOREVER = new FallbackStrategy("FOREVER", 2);

        private static final /* synthetic */ FallbackStrategy[] $values() {
            return new FallbackStrategy[]{REPORT, ONCE, FOREVER};
        }

        static {
            FallbackStrategy[] $values = $values();
            $VALUES = $values;
            $ENTRIES = new asp($values);
        }

        private FallbackStrategy(String str, int i) {
        }

        public static zrp<FallbackStrategy> getEntries() {
            return $ENTRIES;
        }

        public static FallbackStrategy valueOf(String str) {
            return (FallbackStrategy) Enum.valueOf(FallbackStrategy.class, str);
        }

        public static FallbackStrategy[] values() {
            return (FallbackStrategy[]) $VALUES.clone();
        }
    }

    /* compiled from: DnsOverHttpApiEndpointProvider.kt */
    /* loaded from: classes9.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[FallbackStrategy.values().length];
            try {
                iArr[FallbackStrategy.REPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FallbackStrategy.ONCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FallbackStrategy.FOREVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CacheStrategy.values().length];
            try {
                iArr2[CacheStrategy.ONCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CacheStrategy.TTL.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CacheStrategy.NEVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public DnsOverHttpApiEndpointProvider(HttpApiEndpointProvider httpApiEndpointProvider, CacheStrategy cacheStrategy, FallbackStrategy fallbackStrategy) {
        this.delegate = httpApiEndpointProvider;
        this.cacheStrategy = cacheStrategy;
        this.fallbackStrategy = fallbackStrategy;
        this.expireRealtime = Long.MIN_VALUE;
    }

    private final boolean urlsEqual(Uri uri, Uri uri2) {
        String uri3 = uri.toString();
        String uri4 = uri2.toString();
        if (uri3.equals(uri4)) {
            return true;
        }
        int H = drm0.G(uri3, '/') ? drm0.H(uri3) : uri3.length();
        return H == (drm0.G(uri4, '/') ? drm0.H(uri4) : uri4.length()) && uri3.regionMatches(0, uri4, 0, H);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        if (r3.regionMatches(0, r0, 0, r4) != false) goto L19;
     */
    @Override // ru.ok.android.api.http.HttpApiEndpointProvider
    @AutoTraceCompat
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Uri getApiEndpoint(String str) {
        Uri apiEndpoint = this.delegate.getApiEndpoint(str);
        if (!str.equals("api")) {
            return apiEndpoint;
        }
        Uri http_uri_api_default = ApiUris.INSTANCE.getHTTP_URI_API_DEFAULT();
        String uri = apiEndpoint.toString();
        String uri2 = http_uri_api_default.toString();
        if (!uri.equals(uri2)) {
            int H = drm0.G(uri, '/') ? drm0.H(uri) : uri.length();
            if (H == (drm0.G(uri2, '/') ? drm0.H(uri2) : uri2.length())) {
            }
        }
        if (SystemClock.elapsedRealtime() > this.expireRealtime) {
            synchronized (this) {
                try {
                    if (SystemClock.elapsedRealtime() > this.expireRealtime) {
                        long j = Long.MAX_VALUE;
                        try {
                            String obj = drm0.p0(GoogleDns.resolve$default(GoogleDns.INSTANCE, API_ENDPOINT_KEY, 16, null, 4, null).getDataUnquoted()).toString();
                            if (drm0.E(obj, ' ')) {
                                obj = obj.substring(drm0.P(obj, ' ', 0, 6) + 1);
                            }
                            if (drm0.G(obj, '/')) {
                                obj = obj.substring(0, drm0.H(obj));
                            }
                            Uri parse = Uri.parse(obj);
                            this.resolvedEndpoint = parse;
                            int i = WhenMappings.$EnumSwitchMapping$1[this.cacheStrategy.ordinal()];
                            if (i != 1) {
                                if (i == 2) {
                                    j = SystemClock.elapsedRealtime() + r0.getTtlMillis();
                                } else {
                                    if (i != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    j = Long.MIN_VALUE;
                                }
                            }
                            this.expireRealtime = j;
                            return parse;
                        } catch (Exception e) {
                            int i2 = WhenMappings.$EnumSwitchMapping$0[this.fallbackStrategy.ordinal()];
                            if (i2 == 1) {
                                throw e;
                            }
                            if (i2 == 2) {
                                j = Long.MIN_VALUE;
                            } else if (i2 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.expireRealtime = j;
                            Uri uri3 = this.resolvedEndpoint;
                            return uri3 == null ? apiEndpoint : uri3;
                        }
                    }
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        Uri uri4 = this.resolvedEndpoint;
        return uri4 == null ? apiEndpoint : uri4;
    }

    public /* synthetic */ DnsOverHttpApiEndpointProvider(HttpApiEndpointProvider httpApiEndpointProvider, CacheStrategy cacheStrategy, FallbackStrategy fallbackStrategy, int i, zcl zclVar) {
        this(httpApiEndpointProvider, (i & 2) != 0 ? CacheStrategy.TTL : cacheStrategy, (i & 4) != 0 ? FallbackStrategy.ONCE : fallbackStrategy);
    }

    private final boolean urlsEqual(String str, String str2) {
        if (epx.f(str, str2)) {
            return true;
        }
        int H = drm0.G(str, '/') ? drm0.H(str) : str.length();
        return H == (drm0.G(str2, '/') ? drm0.H(str2) : str2.length()) && str.regionMatches(0, str2, 0, H);
    }
}
