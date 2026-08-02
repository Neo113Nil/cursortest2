package com.yandex.passport.sloth.url;

import android.net.Uri;
import android.os.Build;
import android.webkit.CookieManager;
import com.yandex.auth.LegacyAccountType;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.FrontendUrlType;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.sloth.SlothInvalidTokenException;
import com.yandex.passport.sloth.SlothMetricaEvent$Event;
import com.yandex.passport.sloth.a0;
import com.yandex.passport.sloth.c0;
import com.yandex.passport.sloth.command.data.SlothAccountType;
import com.yandex.passport.sloth.data.AccountForProfile;
import com.yandex.passport.sloth.data.SlothMode;
import com.yandex.passport.sloth.data.SlothParams;
import com.yandex.passport.sloth.data.SlothRegistrationType;
import com.yandex.passport.sloth.data.SlothTheme;
import com.yandex.passport.sloth.data.SlothVariant$BiometricVerification;
import com.yandex.passport.sloth.data.b0;
import com.yandex.passport.sloth.data.q;
import com.yandex.passport.sloth.data.r;
import com.yandex.passport.sloth.data.s;
import com.yandex.passport.sloth.data.t;
import com.yandex.passport.sloth.data.u;
import com.yandex.passport.sloth.data.w;
import com.yandex.passport.sloth.data.x;
import com.yandex.passport.sloth.data.y;
import com.yandex.passport.sloth.data.z;
import com.yandex.passport.sloth.dependencies.SlothLoginProperties;
import com.yandex.passport.sloth.n0;
import com.yandex.passport.sloth.v;
import com.yandex.passport.sloth.w0;
import com.yandex.passport.sloth.y0;
import com.yandex.passport.sloth.z0;
import defpackage.cvu0;
import defpackage.e2r;
import defpackage.evu0;
import defpackage.g8e;
import defpackage.iw00;
import defpackage.ixn;
import defpackage.j73;
import defpackage.ny61;
import defpackage.qrq0;
import defpackage.s5r;
import defpackage.tls;
import defpackage.unr0;
import defpackage.w511;
import defpackage.yw01;
import defpackage.zy11;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;
import ru.CryptoPro.JCP.Util.ClearCryptoProPrefs;

/* loaded from: classes2.dex */
public final class c {
    public final SlothParams a;
    public final com.yandex.passport.sloth.dependencies.h b;
    public final com.yandex.passport.common.ui.lang.b c;
    public final com.yandex.passport.internal.sloth.p d;
    public final com.yandex.passport.internal.sloth.f e;
    public final v f;
    public final y0 g;
    public final com.yandex.passport.internal.sloth.d h;
    public final com.yandex.passport.internal.sloth.c i;
    public final com.yandex.passport.sloth.e j;
    public final com.yandex.passport.sloth.dependencies.d k;
    public final d l;
    public final z0 m;

    public c(SlothParams slothParams, com.yandex.passport.sloth.dependencies.h hVar, com.yandex.passport.common.ui.lang.b bVar, com.yandex.passport.internal.sloth.p pVar, com.yandex.passport.internal.sloth.f fVar, v vVar, y0 y0Var, com.yandex.passport.internal.sloth.d dVar, com.yandex.passport.internal.sloth.c cVar, com.yandex.passport.sloth.e eVar, com.yandex.passport.sloth.dependencies.d dVar2, d dVar3, z0 z0Var) {
        this.a = slothParams;
        this.b = hVar;
        this.c = bVar;
        this.d = pVar;
        this.e = fVar;
        this.f = vVar;
        this.g = y0Var;
        this.h = dVar;
        this.i = cVar;
        this.j = eVar;
        this.k = dVar2;
        this.l = dVar3;
        this.m = z0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, Uri uri, Uid uid, ContinuationImpl continuationImpl) {
        SlothInitialUrlProvider$requireAuthCodeUrl$1 slothInitialUrlProvider$requireAuthCodeUrl$1;
        int i;
        Object a;
        com.yandex.passport.common.url.b bVar;
        cVar.getClass();
        if (continuationImpl instanceof SlothInitialUrlProvider$requireAuthCodeUrl$1) {
            slothInitialUrlProvider$requireAuthCodeUrl$1 = (SlothInitialUrlProvider$requireAuthCodeUrl$1) continuationImpl;
            int i2 = slothInitialUrlProvider$requireAuthCodeUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                slothInitialUrlProvider$requireAuthCodeUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = slothInitialUrlProvider$requireAuthCodeUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = slothInitialUrlProvider$requireAuthCodeUrl$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.sloth.dependencies.h hVar = cVar.b;
                    com.yandex.passport.common.url.b.Companion.getClass();
                    String uri2 = uri.toString();
                    slothInitialUrlProvider$requireAuthCodeUrl$1.label = 1;
                    a = ((com.yandex.passport.internal.sloth.o) hVar).a(uid, uri2, slothInitialUrlProvider$requireAuthCodeUrl$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                if (a instanceof Result.Failure) {
                    a = null;
                }
                bVar = (com.yandex.passport.common.url.b) a;
                if (bVar == null) {
                    return bVar.a;
                }
                return null;
            }
        }
        slothInitialUrlProvider$requireAuthCodeUrl$1 = new SlothInitialUrlProvider$requireAuthCodeUrl$1(cVar, continuationImpl);
        Object obj2 = slothInitialUrlProvider$requireAuthCodeUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = slothInitialUrlProvider$requireAuthCodeUrl$1.label;
        if (i != 0) {
        }
        if (a instanceof Result.Failure) {
        }
        bVar = (com.yandex.passport.common.url.b) a;
        if (bVar == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
    
        if (r6.c(r7, r0) == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
    
        if (r7 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(c cVar, Uri uri, Uid uid, ContinuationImpl continuationImpl) {
        SlothInitialUrlProvider$requireAuthQrUrl$1 slothInitialUrlProvider$requireAuthQrUrl$1;
        int i;
        Object b;
        com.yandex.passport.common.url.b bVar;
        cVar.getClass();
        if (continuationImpl instanceof SlothInitialUrlProvider$requireAuthQrUrl$1) {
            slothInitialUrlProvider$requireAuthQrUrl$1 = (SlothInitialUrlProvider$requireAuthQrUrl$1) continuationImpl;
            int i2 = slothInitialUrlProvider$requireAuthQrUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                slothInitialUrlProvider$requireAuthQrUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = slothInitialUrlProvider$requireAuthQrUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = slothInitialUrlProvider$requireAuthQrUrl$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.sloth.dependencies.h hVar = cVar.b;
                    com.yandex.passport.common.url.b.Companion.getClass();
                    String uri2 = uri.toString();
                    if (uid != null) {
                        slothInitialUrlProvider$requireAuthQrUrl$1.L$0 = cVar;
                        slothInitialUrlProvider$requireAuthQrUrl$1.L$1 = uid;
                        slothInitialUrlProvider$requireAuthQrUrl$1.label = 1;
                        b = ((com.yandex.passport.internal.sloth.o) hVar).b(uid, uri2, slothInitialUrlProvider$requireAuthQrUrl$1);
                    }
                    return null;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    bVar = null;
                    if (bVar != null) {
                        return bVar.a;
                    }
                    return null;
                }
                uid = (Uid) slothInitialUrlProvider$requireAuthQrUrl$1.L$1;
                cVar = (c) slothInitialUrlProvider$requireAuthQrUrl$1.L$0;
                kotlin.b.b(obj);
                b = ((Result) obj).getValue();
                if (Result.a(b) != null) {
                    String str = ((com.yandex.passport.common.url.b) b).a;
                    if (str != null) {
                        bVar = new com.yandex.passport.common.url.b(str);
                        if (bVar != null) {
                        }
                        return null;
                    }
                } else {
                    v vVar = cVar.f;
                    c0 c0Var = new c0(uid);
                    slothInitialUrlProvider$requireAuthQrUrl$1.L$0 = null;
                    slothInitialUrlProvider$requireAuthQrUrl$1.L$1 = null;
                    slothInitialUrlProvider$requireAuthQrUrl$1.label = 2;
                }
                bVar = null;
                if (bVar != null) {
                }
                return null;
            }
        }
        slothInitialUrlProvider$requireAuthQrUrl$1 = new SlothInitialUrlProvider$requireAuthQrUrl$1(cVar, continuationImpl);
        Object obj2 = slothInitialUrlProvider$requireAuthQrUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = slothInitialUrlProvider$requireAuthQrUrl$1.label;
        if (i != 0) {
        }
        if (Result.a(b) != null) {
        }
        bVar = null;
        if (bVar != null) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(c cVar, com.yandex.passport.sloth.data.n nVar, ContinuationImpl continuationImpl) {
        SlothInitialUrlProvider$requireAuthSdkUrl$1 slothInitialUrlProvider$requireAuthSdkUrl$1;
        int i;
        Object c;
        cVar.getClass();
        if (continuationImpl instanceof SlothInitialUrlProvider$requireAuthSdkUrl$1) {
            slothInitialUrlProvider$requireAuthSdkUrl$1 = (SlothInitialUrlProvider$requireAuthSdkUrl$1) continuationImpl;
            int i2 = slothInitialUrlProvider$requireAuthSdkUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                slothInitialUrlProvider$requireAuthSdkUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = slothInitialUrlProvider$requireAuthSdkUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = slothInitialUrlProvider$requireAuthSdkUrl$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.sloth.dependencies.h hVar = cVar.b;
                    slothInitialUrlProvider$requireAuthSdkUrl$1.L$0 = cVar;
                    slothInitialUrlProvider$requireAuthSdkUrl$1.L$1 = nVar;
                    slothInitialUrlProvider$requireAuthSdkUrl$1.label = 1;
                    c = ((com.yandex.passport.internal.sloth.o) hVar).c(nVar, slothInitialUrlProvider$requireAuthSdkUrl$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return "";
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nVar = (com.yandex.passport.sloth.data.n) slothInitialUrlProvider$requireAuthSdkUrl$1.L$1;
                    cVar = (c) slothInitialUrlProvider$requireAuthSdkUrl$1.L$0;
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                if (Result.a(c) != null) {
                    return ((com.yandex.passport.common.url.b) c).a;
                }
                v vVar = cVar.f;
                c0 c0Var = new c0(nVar.x);
                slothInitialUrlProvider$requireAuthSdkUrl$1.L$0 = null;
                slothInitialUrlProvider$requireAuthSdkUrl$1.L$1 = null;
                slothInitialUrlProvider$requireAuthSdkUrl$1.label = 2;
                return vVar.c(c0Var, slothInitialUrlProvider$requireAuthSdkUrl$1) == coroutineSingletons ? coroutineSingletons : "";
            }
        }
        slothInitialUrlProvider$requireAuthSdkUrl$1 = new SlothInitialUrlProvider$requireAuthSdkUrl$1(cVar, continuationImpl);
        Object obj2 = slothInitialUrlProvider$requireAuthSdkUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = slothInitialUrlProvider$requireAuthSdkUrl$1.label;
        if (i != 0) {
        }
        if (Result.a(c) != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(c cVar, Uri uri, Uid uid, ContinuationImpl continuationImpl) {
        SlothInitialUrlProvider$requireAuthUrlAccountDeleteForever$1 slothInitialUrlProvider$requireAuthUrlAccountDeleteForever$1;
        int i;
        Object d;
        Uid uid2;
        Throwable a;
        cVar.getClass();
        if (continuationImpl instanceof SlothInitialUrlProvider$requireAuthUrlAccountDeleteForever$1) {
            slothInitialUrlProvider$requireAuthUrlAccountDeleteForever$1 = (SlothInitialUrlProvider$requireAuthUrlAccountDeleteForever$1) continuationImpl;
            int i2 = slothInitialUrlProvider$requireAuthUrlAccountDeleteForever$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                slothInitialUrlProvider$requireAuthUrlAccountDeleteForever$1.label = i2 - Integer.MIN_VALUE;
                SlothInitialUrlProvider$requireAuthUrlAccountDeleteForever$1 slothInitialUrlProvider$requireAuthUrlAccountDeleteForever$12 = slothInitialUrlProvider$requireAuthUrlAccountDeleteForever$1;
                Object obj = slothInitialUrlProvider$requireAuthUrlAccountDeleteForever$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = slothInitialUrlProvider$requireAuthUrlAccountDeleteForever$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.sloth.dependencies.h hVar = cVar.b;
                    Locale b = ((com.yandex.passport.internal.ui.lang.a) cVar.c).b();
                    com.yandex.passport.common.url.b.Companion.getClass();
                    String uri2 = uri.toString();
                    FrontendUrlType frontendUrlType = FrontendUrlType.ID;
                    slothInitialUrlProvider$requireAuthUrlAccountDeleteForever$12.L$0 = cVar;
                    slothInitialUrlProvider$requireAuthUrlAccountDeleteForever$12.L$1 = uid;
                    slothInitialUrlProvider$requireAuthUrlAccountDeleteForever$12.label = 1;
                    d = ((com.yandex.passport.internal.sloth.o) hVar).d(uid, b, uri2, frontendUrlType, slothInitialUrlProvider$requireAuthUrlAccountDeleteForever$12);
                    if (d != coroutineSingletons) {
                        uid2 = uid;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        kotlin.b.b(obj);
                        return "";
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uid2 = (Uid) slothInitialUrlProvider$requireAuthUrlAccountDeleteForever$12.L$1;
                cVar = (c) slothInitialUrlProvider$requireAuthUrlAccountDeleteForever$12.L$0;
                kotlin.b.b(obj);
                d = ((Result) obj).getValue();
                a = Result.a(d);
                if (a != null) {
                    return ((com.yandex.passport.common.url.b) d).a;
                }
                if (a instanceof SlothInvalidTokenException) {
                    v vVar = cVar.f;
                    c0 c0Var = new c0(uid2);
                    slothInitialUrlProvider$requireAuthUrlAccountDeleteForever$12.L$0 = null;
                    slothInitialUrlProvider$requireAuthUrlAccountDeleteForever$12.L$1 = null;
                    slothInitialUrlProvider$requireAuthUrlAccountDeleteForever$12.label = 2;
                    if (vVar.c(c0Var, slothInitialUrlProvider$requireAuthUrlAccountDeleteForever$12) != coroutineSingletons) {
                        return "";
                    }
                } else {
                    v vVar2 = cVar.f;
                    a0 a0Var = new a0(a, a.toString());
                    slothInitialUrlProvider$requireAuthUrlAccountDeleteForever$12.L$0 = null;
                    slothInitialUrlProvider$requireAuthUrlAccountDeleteForever$12.L$1 = null;
                    slothInitialUrlProvider$requireAuthUrlAccountDeleteForever$12.label = 3;
                    if (vVar2.c(a0Var, slothInitialUrlProvider$requireAuthUrlAccountDeleteForever$12) != coroutineSingletons) {
                        return "";
                    }
                }
                return coroutineSingletons;
            }
        }
        slothInitialUrlProvider$requireAuthUrlAccountDeleteForever$1 = new SlothInitialUrlProvider$requireAuthUrlAccountDeleteForever$1(cVar, continuationImpl);
        SlothInitialUrlProvider$requireAuthUrlAccountDeleteForever$1 slothInitialUrlProvider$requireAuthUrlAccountDeleteForever$122 = slothInitialUrlProvider$requireAuthUrlAccountDeleteForever$1;
        Object obj2 = slothInitialUrlProvider$requireAuthUrlAccountDeleteForever$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = slothInitialUrlProvider$requireAuthUrlAccountDeleteForever$122.label;
        if (i != 0) {
        }
        a = Result.a(d);
        if (a != null) {
        }
    }

    public static Uri.Builder p(Uri.Builder builder, Environment environment) {
        String authority = builder.build().getAuthority();
        if (authority != null) {
            int i = b.a[environment.ordinal()];
            if (i == 1) {
                return q(builder, authority, "-rc");
            }
            if (i == 2) {
                return q(builder, authority, "-test");
            }
        }
        return builder;
    }

    public static final Uri.Builder q(Uri.Builder builder, String str, String str2) {
        return cvu0.x(str, "passport.", false) ? builder.authority(cvu0.v(str, "passport.", unr0.l('.', "passport", str2), false)) : builder;
    }

    public static final String t(Uid uid) {
        StringBuilder sb = new StringBuilder();
        sb.append(uid.getEnvironment().getInteger());
        sb.append(':');
        sb.append(uid.getValue());
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0093 A[LOOP:0: B:11:0x008d->B:13:0x0093, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, ContinuationImpl continuationImpl) {
        SlothInitialUrlProvider$baseUriBuilder$1 slothInitialUrlProvider$baseUriBuilder$1;
        int i;
        Uri.Builder buildUpon;
        Uri.Builder builder;
        if (continuationImpl instanceof SlothInitialUrlProvider$baseUriBuilder$1) {
            slothInitialUrlProvider$baseUriBuilder$1 = (SlothInitialUrlProvider$baseUriBuilder$1) continuationImpl;
            int i2 = slothInitialUrlProvider$baseUriBuilder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                slothInitialUrlProvider$baseUriBuilder$1.label = i2 - Integer.MIN_VALUE;
                Object obj = slothInitialUrlProvider$baseUriBuilder$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = slothInitialUrlProvider$baseUriBuilder$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!cvu0.x(com.yandex.passport.common.url.b.j(str), "http", false)) {
                        return Uri.parse(str).buildUpon();
                    }
                    Locale a = ((com.yandex.passport.internal.ui.lang.a) this.c).a();
                    buildUpon = Uri.parse(str).buildUpon();
                    int i3 = com.yandex.passport.common.ui.lang.a.a;
                    buildUpon.appendQueryParameter("lang", a.getLanguage());
                    buildUpon.appendQueryParameter("locale", a.getCountry());
                    slothInitialUrlProvider$baseUriBuilder$1.L$0 = buildUpon;
                    slothInitialUrlProvider$baseUriBuilder$1.L$1 = buildUpon;
                    slothInitialUrlProvider$baseUriBuilder$1.label = 1;
                    obj = this.l.a(slothInitialUrlProvider$baseUriBuilder$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                    builder = buildUpon;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    builder = (Uri.Builder) slothInitialUrlProvider$baseUriBuilder$1.L$1;
                    buildUpon = (Uri.Builder) slothInitialUrlProvider$baseUriBuilder$1.L$0;
                    kotlin.b.b(obj);
                }
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                return buildUpon;
            }
        }
        slothInitialUrlProvider$baseUriBuilder$1 = new SlothInitialUrlProvider$baseUriBuilder$1(this, continuationImpl);
        Object obj3 = slothInitialUrlProvider$baseUriBuilder$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = slothInitialUrlProvider$baseUriBuilder$1.label;
        if (i != 0) {
        }
        while (r7.hasNext()) {
        }
        return buildUpon;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
    
        if (r7 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007c, code lost:
    
        if (r10 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009e, code lost:
    
        if (r7 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Uri uri, Uid uid, boolean z, FrontendUrlType frontendUrlType, ContinuationImpl continuationImpl) {
        SlothInitialUrlProvider$defaultInjectCookieOrAuthUrl$1 slothInitialUrlProvider$defaultInjectCookieOrAuthUrl$1;
        int i;
        Object u;
        Object l;
        Object u2;
        if (continuationImpl instanceof SlothInitialUrlProvider$defaultInjectCookieOrAuthUrl$1) {
            slothInitialUrlProvider$defaultInjectCookieOrAuthUrl$1 = (SlothInitialUrlProvider$defaultInjectCookieOrAuthUrl$1) continuationImpl;
            int i2 = slothInitialUrlProvider$defaultInjectCookieOrAuthUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                slothInitialUrlProvider$defaultInjectCookieOrAuthUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = slothInitialUrlProvider$defaultInjectCookieOrAuthUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = slothInitialUrlProvider$defaultInjectCookieOrAuthUrl$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (z) {
                        com.yandex.passport.common.url.b.Companion.getClass();
                        String uri2 = uri.toString();
                        slothInitialUrlProvider$defaultInjectCookieOrAuthUrl$1.L$0 = this;
                        slothInitialUrlProvider$defaultInjectCookieOrAuthUrl$1.L$1 = uri;
                        slothInitialUrlProvider$defaultInjectCookieOrAuthUrl$1.L$2 = uid;
                        slothInitialUrlProvider$defaultInjectCookieOrAuthUrl$1.L$3 = frontendUrlType;
                        slothInitialUrlProvider$defaultInjectCookieOrAuthUrl$1.label = 1;
                        l = l(uid, uri2, slothInitialUrlProvider$defaultInjectCookieOrAuthUrl$1);
                    } else {
                        slothInitialUrlProvider$defaultInjectCookieOrAuthUrl$1.label = 3;
                        u = u(uri, uid, frontendUrlType, slothInitialUrlProvider$defaultInjectCookieOrAuthUrl$1);
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj);
                        u2 = ((com.yandex.passport.common.url.b) obj).a;
                        return (String) u2;
                    }
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    u = ((com.yandex.passport.common.url.b) obj).a;
                    return (String) u;
                }
                frontendUrlType = (FrontendUrlType) slothInitialUrlProvider$defaultInjectCookieOrAuthUrl$1.L$3;
                uid = (Uid) slothInitialUrlProvider$defaultInjectCookieOrAuthUrl$1.L$2;
                uri = (Uri) slothInitialUrlProvider$defaultInjectCookieOrAuthUrl$1.L$1;
                this = (c) slothInitialUrlProvider$defaultInjectCookieOrAuthUrl$1.L$0;
                kotlin.b.b(obj);
                com.yandex.passport.common.url.b bVar = (com.yandex.passport.common.url.b) obj;
                l = bVar != null ? bVar.a : null;
                String str = (String) l;
                if (str != null) {
                    return str;
                }
                slothInitialUrlProvider$defaultInjectCookieOrAuthUrl$1.L$0 = null;
                slothInitialUrlProvider$defaultInjectCookieOrAuthUrl$1.L$1 = null;
                slothInitialUrlProvider$defaultInjectCookieOrAuthUrl$1.L$2 = null;
                slothInitialUrlProvider$defaultInjectCookieOrAuthUrl$1.L$3 = null;
                slothInitialUrlProvider$defaultInjectCookieOrAuthUrl$1.label = 2;
                u2 = this.u(uri, uid, frontendUrlType, slothInitialUrlProvider$defaultInjectCookieOrAuthUrl$1);
            }
        }
        slothInitialUrlProvider$defaultInjectCookieOrAuthUrl$1 = new SlothInitialUrlProvider$defaultInjectCookieOrAuthUrl$1(this, continuationImpl);
        Object obj2 = slothInitialUrlProvider$defaultInjectCookieOrAuthUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = slothInitialUrlProvider$defaultInjectCookieOrAuthUrl$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(com.yandex.passport.sloth.data.c0 c0Var, ContinuationImpl continuationImpl) {
        SlothInitialUrlProvider$getBaseUriBuilder$1 slothInitialUrlProvider$getBaseUriBuilder$1;
        Environment environment;
        if (continuationImpl instanceof SlothInitialUrlProvider$getBaseUriBuilder$1) {
            slothInitialUrlProvider$getBaseUriBuilder$1 = (SlothInitialUrlProvider$getBaseUriBuilder$1) continuationImpl;
            int i = slothInitialUrlProvider$getBaseUriBuilder$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                slothInitialUrlProvider$getBaseUriBuilder$1.label = i - Integer.MIN_VALUE;
                Object obj = slothInitialUrlProvider$getBaseUriBuilder$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (slothInitialUrlProvider$getBaseUriBuilder$1.label) {
                    case 0:
                        kotlin.b.b(obj);
                        boolean z = c0Var instanceof s;
                        com.yandex.passport.internal.sloth.f fVar = this.e;
                        SlothParams slothParams = this.a;
                        if (z) {
                            Environment environment2 = slothParams.getEnvironment();
                            String c = fVar.c(environment2, new Long(((s) c0Var).b));
                            slothInitialUrlProvider$getBaseUriBuilder$1.L$0 = environment2;
                            slothInitialUrlProvider$getBaseUriBuilder$1.L$1 = this;
                            slothInitialUrlProvider$getBaseUriBuilder$1.label = 1;
                            Object e = e(c, slothInitialUrlProvider$getBaseUriBuilder$1);
                            if (e != coroutineSingletons) {
                                obj = e;
                                environment = environment2;
                                break;
                            }
                        } else if (c0Var instanceof w) {
                            slothInitialUrlProvider$getBaseUriBuilder$1.label = 2;
                            Object r = r((w) c0Var, slothInitialUrlProvider$getBaseUriBuilder$1);
                            if (r != coroutineSingletons) {
                                return r;
                            }
                        } else if ((c0Var instanceof t) || (c0Var instanceof x) || (c0Var instanceof z) || (c0Var instanceof com.yandex.passport.sloth.data.n)) {
                            slothInitialUrlProvider$getBaseUriBuilder$1.label = 3;
                            Object i2 = i(slothInitialUrlProvider$getBaseUriBuilder$1);
                            if (i2 != coroutineSingletons) {
                                return i2;
                            }
                        } else if (c0Var instanceof com.yandex.passport.sloth.data.p) {
                            slothInitialUrlProvider$getBaseUriBuilder$1.label = 4;
                            Object n = n((com.yandex.passport.sloth.data.p) c0Var, slothInitialUrlProvider$getBaseUriBuilder$1);
                            if (n != coroutineSingletons) {
                                return n;
                            }
                        } else if (c0Var instanceof com.yandex.passport.sloth.data.a0) {
                            Environment environment3 = slothParams.getEnvironment();
                            Long l = ((com.yandex.passport.sloth.data.a0) c0Var).w;
                            String str = ((com.yandex.passport.internal.network.l) fVar.a).l(environment3, l != null ? l.longValue() : 0L).a;
                            slothInitialUrlProvider$getBaseUriBuilder$1.label = 5;
                            Object e2 = e(str, slothInitialUrlProvider$getBaseUriBuilder$1);
                            if (e2 != coroutineSingletons) {
                                return e2;
                            }
                        } else if (c0Var instanceof com.yandex.passport.sloth.data.j) {
                            String str2 = ((com.yandex.passport.sloth.data.j) c0Var).a;
                            slothInitialUrlProvider$getBaseUriBuilder$1.label = 6;
                            Object e3 = e(str2, slothInitialUrlProvider$getBaseUriBuilder$1);
                            if (e3 != coroutineSingletons) {
                                return e3;
                            }
                        } else if (c0Var instanceof com.yandex.passport.sloth.data.o) {
                            String str3 = ((com.yandex.passport.sloth.data.o) c0Var).a;
                            slothInitialUrlProvider$getBaseUriBuilder$1.label = 7;
                            Object e4 = e(str3, slothInitialUrlProvider$getBaseUriBuilder$1);
                            if (e4 != coroutineSingletons) {
                                return e4;
                            }
                        } else {
                            if (c0Var instanceof com.yandex.passport.sloth.data.k) {
                                return Uri.parse(((com.yandex.passport.sloth.data.k) c0Var).a).buildUpon();
                            }
                            if (c0Var instanceof u) {
                                return Uri.parse(((u) c0Var).c).buildUpon();
                            }
                            if (c0Var instanceof b0) {
                                return Uri.parse(((b0) c0Var).a).buildUpon();
                            }
                            if (c0Var instanceof com.yandex.passport.sloth.data.l) {
                                return Uri.parse(((com.yandex.passport.sloth.data.l) c0Var).a).buildUpon();
                            }
                            if (c0Var instanceof com.yandex.passport.sloth.data.i) {
                                String a = fVar.a(slothParams.getEnvironment(), ((com.yandex.passport.sloth.data.i) c0Var).b);
                                slothInitialUrlProvider$getBaseUriBuilder$1.label = 8;
                                Object e5 = e(a, slothInitialUrlProvider$getBaseUriBuilder$1);
                                if (e5 != coroutineSingletons) {
                                    return e5;
                                }
                            } else if (c0Var instanceof com.yandex.passport.sloth.data.m) {
                                Environment environment4 = slothParams.getEnvironment();
                                String str4 = ((com.yandex.passport.sloth.data.m) c0Var).b;
                                ((com.yandex.passport.internal.network.l) fVar.a).getClass();
                                String b = com.yandex.passport.common.url.b.b(String.format(com.yandex.passport.internal.network.l.g(environment4), Arrays.copyOf(new Object[]{ClearCryptoProPrefs.COUNTRY}, 1)).concat("/am/push/qrbezqrlogin"), new Pair("BrowserName", str4));
                                slothInitialUrlProvider$getBaseUriBuilder$1.label = 9;
                                Object e6 = e(b, slothInitialUrlProvider$getBaseUriBuilder$1);
                                if (e6 != coroutineSingletons) {
                                    return e6;
                                }
                            } else if (c0Var instanceof r) {
                                String str5 = ((r) c0Var).a;
                                slothInitialUrlProvider$getBaseUriBuilder$1.label = 10;
                                Object e7 = e(str5, slothInitialUrlProvider$getBaseUriBuilder$1);
                                if (e7 != coroutineSingletons) {
                                    return e7;
                                }
                            } else if (c0Var instanceof q) {
                                String e8 = fVar.e(slothParams.getEnvironment(), ((q) c0Var).b);
                                slothInitialUrlProvider$getBaseUriBuilder$1.label = 11;
                                Object e9 = e(e8, slothInitialUrlProvider$getBaseUriBuilder$1);
                                if (e9 != coroutineSingletons) {
                                    return e9;
                                }
                            } else if (c0Var instanceof y) {
                                slothInitialUrlProvider$getBaseUriBuilder$1.label = 12;
                                Object x = x((y) c0Var, slothInitialUrlProvider$getBaseUriBuilder$1);
                                if (x != coroutineSingletons) {
                                    return x;
                                }
                            } else if (c0Var instanceof SlothVariant$BiometricVerification) {
                                String g = fVar.g(slothParams.getEnvironment());
                                slothInitialUrlProvider$getBaseUriBuilder$1.label = 13;
                                Object e10 = e(g, slothInitialUrlProvider$getBaseUriBuilder$1);
                                if (e10 != coroutineSingletons) {
                                    return e10;
                                }
                            } else {
                                if (!(c0Var instanceof com.yandex.passport.sloth.data.v)) {
                                    w511.b();
                                    return null;
                                }
                                String f = fVar.f(slothParams.getEnvironment(), ((com.yandex.passport.sloth.data.v) c0Var).c);
                                slothInitialUrlProvider$getBaseUriBuilder$1.label = 14;
                                Object e11 = e(f, slothInitialUrlProvider$getBaseUriBuilder$1);
                                if (e11 != coroutineSingletons) {
                                    return e11;
                                }
                            }
                        }
                        return coroutineSingletons;
                    case 1:
                        this = (c) slothInitialUrlProvider$getBaseUriBuilder$1.L$1;
                        environment = (Environment) slothInitialUrlProvider$getBaseUriBuilder$1.L$0;
                        kotlin.b.b(obj);
                        break;
                    case 2:
                        kotlin.b.b(obj);
                        return obj;
                    case 3:
                        kotlin.b.b(obj);
                        return obj;
                    case 4:
                        kotlin.b.b(obj);
                        return obj;
                    case 5:
                        kotlin.b.b(obj);
                        return obj;
                    case 6:
                        kotlin.b.b(obj);
                        return obj;
                    case 7:
                        kotlin.b.b(obj);
                        return obj;
                    case 8:
                        kotlin.b.b(obj);
                        return obj;
                    case 9:
                        kotlin.b.b(obj);
                        return obj;
                    case 10:
                        kotlin.b.b(obj);
                        return obj;
                    case 11:
                        kotlin.b.b(obj);
                        return obj;
                    case 12:
                        kotlin.b.b(obj);
                        return obj;
                    case 13:
                        kotlin.b.b(obj);
                        return obj;
                    case 14:
                        kotlin.b.b(obj);
                        return obj;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
                this.getClass();
                return p((Uri.Builder) obj, environment);
            }
        }
        slothInitialUrlProvider$getBaseUriBuilder$1 = new SlothInitialUrlProvider$getBaseUriBuilder$1(this, continuationImpl);
        Object obj2 = slothInitialUrlProvider$getBaseUriBuilder$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (slothInitialUrlProvider$getBaseUriBuilder$1.label) {
        }
        this.getClass();
        return p((Uri.Builder) obj2, environment);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(SlothTheme slothTheme, String str, ContinuationImpl continuationImpl) {
        SlothInitialUrlProvider$getBaseUriParams$1 slothInitialUrlProvider$getBaseUriParams$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        String str2;
        c cVar;
        int i2;
        Pair[] pairArr;
        Object obj2;
        Pair[] pairArr2;
        String str3;
        String str4;
        int i3;
        Pair[] pairArr3;
        Pair[] pairArr4;
        if (continuationImpl instanceof SlothInitialUrlProvider$getBaseUriParams$1) {
            slothInitialUrlProvider$getBaseUriParams$1 = (SlothInitialUrlProvider$getBaseUriParams$1) continuationImpl;
            int i4 = slothInitialUrlProvider$getBaseUriParams$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                slothInitialUrlProvider$getBaseUriParams$1.label = i4 - Integer.MIN_VALUE;
                obj = slothInitialUrlProvider$getBaseUriParams$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = slothInitialUrlProvider$getBaseUriParams$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Pair[] pairArr5 = new Pair[5];
                    pairArr5[0] = new Pair(DivkitThemeChangeListener.THEME_VARIABLE_NAME, com.yandex.passport.internal.ui.sloth.e.i(slothTheme));
                    pairArr5[1] = new Pair("source", str);
                    pairArr5[2] = new Pair("device_name", Build.MODEL);
                    slothInitialUrlProvider$getBaseUriParams$1.L$0 = this;
                    slothInitialUrlProvider$getBaseUriParams$1.L$1 = pairArr5;
                    slothInitialUrlProvider$getBaseUriParams$1.L$2 = pairArr5;
                    str2 = "uuid";
                    slothInitialUrlProvider$getBaseUriParams$1.L$3 = "uuid";
                    slothInitialUrlProvider$getBaseUriParams$1.I$0 = 3;
                    slothInitialUrlProvider$getBaseUriParams$1.label = 1;
                    Object b = this.d.b(slothInitialUrlProvider$getBaseUriParams$1);
                    if (b != coroutineSingletons) {
                        cVar = this;
                        i2 = 3;
                        pairArr = pairArr5;
                        obj2 = b;
                        pairArr2 = pairArr;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = slothInitialUrlProvider$getBaseUriParams$1.I$0;
                    str4 = (String) slothInitialUrlProvider$getBaseUriParams$1.L$2;
                    pairArr3 = (Pair[]) slothInitialUrlProvider$getBaseUriParams$1.L$1;
                    pairArr4 = (Pair[]) slothInitialUrlProvider$getBaseUriParams$1.L$0;
                    kotlin.b.b(obj);
                    pairArr3[i3] = new Pair(str4, obj);
                    return j73.v(pairArr4);
                }
                i2 = slothInitialUrlProvider$getBaseUriParams$1.I$0;
                str2 = (String) slothInitialUrlProvider$getBaseUriParams$1.L$3;
                pairArr = (Pair[]) slothInitialUrlProvider$getBaseUriParams$1.L$2;
                pairArr2 = (Pair[]) slothInitialUrlProvider$getBaseUriParams$1.L$1;
                cVar = (c) slothInitialUrlProvider$getBaseUriParams$1.L$0;
                kotlin.b.b(obj);
                com.yandex.passport.common.value.b bVar = (com.yandex.passport.common.value.b) obj;
                obj2 = bVar != null ? bVar.a : null;
                str3 = (String) obj2;
                if (str3 == null) {
                    str3 = null;
                }
                pairArr[i2] = new Pair(str2, str3);
                com.yandex.passport.internal.sloth.c cVar2 = cVar.i;
                slothInitialUrlProvider$getBaseUriParams$1.L$0 = pairArr2;
                slothInitialUrlProvider$getBaseUriParams$1.L$1 = pairArr2;
                str4 = "connection_type";
                slothInitialUrlProvider$getBaseUriParams$1.L$2 = "connection_type";
                slothInitialUrlProvider$getBaseUriParams$1.L$3 = null;
                slothInitialUrlProvider$getBaseUriParams$1.I$0 = 4;
                slothInitialUrlProvider$getBaseUriParams$1.label = 2;
                obj = cVar2.b(slothInitialUrlProvider$getBaseUriParams$1);
                if (obj != coroutineSingletons) {
                    i3 = 4;
                    pairArr3 = pairArr2;
                    pairArr4 = pairArr3;
                    pairArr3[i3] = new Pair(str4, obj);
                    return j73.v(pairArr4);
                }
                return coroutineSingletons;
            }
        }
        slothInitialUrlProvider$getBaseUriParams$1 = new SlothInitialUrlProvider$getBaseUriParams$1(this, continuationImpl);
        obj = slothInitialUrlProvider$getBaseUriParams$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = slothInitialUrlProvider$getBaseUriParams$1.label;
        if (i != 0) {
        }
        str3 = (String) obj2;
        if (str3 == null) {
        }
        pairArr[i2] = new Pair(str2, str3);
        com.yandex.passport.internal.sloth.c cVar22 = cVar.i;
        slothInitialUrlProvider$getBaseUriParams$1.L$0 = pairArr2;
        slothInitialUrlProvider$getBaseUriParams$1.L$1 = pairArr2;
        str4 = "connection_type";
        slothInitialUrlProvider$getBaseUriParams$1.L$2 = "connection_type";
        slothInitialUrlProvider$getBaseUriParams$1.L$3 = null;
        slothInitialUrlProvider$getBaseUriParams$1.I$0 = 4;
        slothInitialUrlProvider$getBaseUriParams$1.label = 2;
        obj = cVar22.b(slothInitialUrlProvider$getBaseUriParams$1);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(ContinuationImpl continuationImpl) {
        SlothInitialUrlProvider$getPatchedUriBuilder$1 slothInitialUrlProvider$getPatchedUriBuilder$1;
        int i;
        Environment environment;
        if (continuationImpl instanceof SlothInitialUrlProvider$getPatchedUriBuilder$1) {
            slothInitialUrlProvider$getPatchedUriBuilder$1 = (SlothInitialUrlProvider$getPatchedUriBuilder$1) continuationImpl;
            int i2 = slothInitialUrlProvider$getPatchedUriBuilder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                slothInitialUrlProvider$getPatchedUriBuilder$1.label = i2 - Integer.MIN_VALUE;
                Object obj = slothInitialUrlProvider$getPatchedUriBuilder$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = slothInitialUrlProvider$getPatchedUriBuilder$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Environment environment2 = this.a.getEnvironment();
                    String c = this.e.c(environment2, null);
                    slothInitialUrlProvider$getPatchedUriBuilder$1.L$0 = environment2;
                    slothInitialUrlProvider$getPatchedUriBuilder$1.L$1 = this;
                    slothInitialUrlProvider$getPatchedUriBuilder$1.label = 1;
                    Object e = e(c, slothInitialUrlProvider$getPatchedUriBuilder$1);
                    if (e == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    environment = environment2;
                    obj = e;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (c) slothInitialUrlProvider$getPatchedUriBuilder$1.L$1;
                    environment = (Environment) slothInitialUrlProvider$getPatchedUriBuilder$1.L$0;
                    kotlin.b.b(obj);
                }
                this.getClass();
                return p((Uri.Builder) obj, environment);
            }
        }
        slothInitialUrlProvider$getPatchedUriBuilder$1 = new SlothInitialUrlProvider$getPatchedUriBuilder$1(this, continuationImpl);
        Object obj2 = slothInitialUrlProvider$getPatchedUriBuilder$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = slothInitialUrlProvider$getPatchedUriBuilder$1.label;
        if (i != 0) {
        }
        this.getClass();
        return p((Uri.Builder) obj2, environment);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0052, code lost:
    
        if (r12 == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00f5 A[LOOP:0: B:12:0x00ef->B:14:0x00f5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Comparable j(com.yandex.passport.sloth.data.c0 c0Var, ContinuationImpl continuationImpl) {
        SlothInitialUrlProvider$getUri$1 slothInitialUrlProvider$getUri$1;
        int i;
        Uri.Builder builder;
        String testId;
        String scheme;
        Uri.Builder builder2;
        s5r s5rVar;
        if (continuationImpl instanceof SlothInitialUrlProvider$getUri$1) {
            slothInitialUrlProvider$getUri$1 = (SlothInitialUrlProvider$getUri$1) continuationImpl;
            int i2 = slothInitialUrlProvider$getUri$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                slothInitialUrlProvider$getUri$1.label = i2 - Integer.MIN_VALUE;
                Object obj = slothInitialUrlProvider$getUri$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = slothInitialUrlProvider$getUri$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    slothInitialUrlProvider$getUri$1.L$0 = this;
                    slothInitialUrlProvider$getUri$1.L$1 = c0Var;
                    slothInitialUrlProvider$getUri$1.label = 1;
                    obj = g(c0Var, slothInitialUrlProvider$getUri$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        builder2 = (Uri.Builder) slothInitialUrlProvider$getUri$1.L$0;
                        kotlin.b.b(obj);
                        s5rVar = new s5r(kotlin.sequences.b.h(new yw01((qrq0) obj, new com.yandex.passport.internal.core.announcing.f(25)), new com.yandex.passport.internal.core.announcing.f(26)));
                        while (s5rVar.hasNext()) {
                            Pair pair = (Pair) s5rVar.next();
                            builder2.appendQueryParameter((String) pair.getFirst(), (String) pair.getSecond());
                        }
                        Uri build = builder2.build();
                        LogLevel logLevel = LogLevel.DEBUG;
                        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(logLevel, null, "Built Uri " + build, 10);
                        }
                        return build;
                    }
                    c0Var = (com.yandex.passport.sloth.data.c0) slothInitialUrlProvider$getUri$1.L$1;
                    this = (c) slothInitialUrlProvider$getUri$1.L$0;
                    kotlin.b.b(obj);
                }
                builder = (Uri.Builder) obj;
                if (!this.a.getCommonWebProperties().getIsClearCookiesBeforeAuthorization() || this.k.j) {
                    com.yandex.passport.sloth.e eVar = this.j;
                    ((CookieManager) eVar.a.getValue()).removeAllCookies(null);
                    ((CookieManager) eVar.a.getValue()).flush();
                    builder.build();
                    LogLevel logLevel2 = LogLevel.DEBUG;
                    com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(logLevel2, null, "Cookies was cleared", 10);
                    }
                }
                testId = this.a.getCommonWebProperties().getTestId();
                if (testId != null && !evu0.J(testId)) {
                    builder.appendQueryParameter("test-id", testId);
                }
                scheme = builder.build().getScheme();
                if (scheme != null || !cvu0.x(scheme, "http", false)) {
                    return builder.build();
                }
                slothInitialUrlProvider$getUri$1.L$0 = builder;
                slothInitialUrlProvider$getUri$1.L$1 = null;
                slothInitialUrlProvider$getUri$1.label = 2;
                Object k = this.k(c0Var, slothInitialUrlProvider$getUri$1);
                if (k != coroutineSingletons) {
                    obj = k;
                    builder2 = builder;
                    s5rVar = new s5r(kotlin.sequences.b.h(new yw01((qrq0) obj, new com.yandex.passport.internal.core.announcing.f(25)), new com.yandex.passport.internal.core.announcing.f(26)));
                    while (s5rVar.hasNext()) {
                    }
                    Uri build2 = builder2.build();
                    LogLevel logLevel3 = LogLevel.DEBUG;
                    com.yandex.passport.common.logger.c cVar3 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    }
                    return build2;
                }
                return coroutineSingletons;
            }
        }
        slothInitialUrlProvider$getUri$1 = new SlothInitialUrlProvider$getUri$1(this, continuationImpl);
        Object obj2 = slothInitialUrlProvider$getUri$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = slothInitialUrlProvider$getUri$1.label;
        if (i != 0) {
        }
        builder = (Uri.Builder) obj2;
        if (!this.a.getCommonWebProperties().getIsClearCookiesBeforeAuthorization()) {
        }
        com.yandex.passport.sloth.e eVar2 = this.j;
        ((CookieManager) eVar2.a.getValue()).removeAllCookies(null);
        ((CookieManager) eVar2.a.getValue()).flush();
        builder.build();
        LogLevel logLevel22 = LogLevel.DEBUG;
        com.yandex.passport.common.logger.c cVar22 = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
        }
        testId = this.a.getCommonWebProperties().getTestId();
        if (testId != null) {
            builder.appendQueryParameter("test-id", testId);
        }
        scheme = builder.build().getScheme();
        if (scheme != null) {
        }
        return builder.build();
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0246, code lost:
    
        if (r2 == r4) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0266, code lost:
    
        if (r2 == r4) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0282, code lost:
    
        if (r2 == r4) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x029d, code lost:
    
        if (r2 == r4) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0302, code lost:
    
        if (r2 == r4) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x03c2, code lost:
    
        if (r2 == r4) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(com.yandex.passport.sloth.data.c0 c0Var, ContinuationImpl continuationImpl) {
        SlothInitialUrlProvider$getUriParams$1 slothInitialUrlProvider$getUriParams$1;
        int i;
        Object obj;
        com.yandex.passport.sloth.data.c0 c0Var2;
        Object obj2;
        Object obj3;
        qrq0 qrq0Var;
        Object obj4;
        Object obj5;
        e2r p;
        SlothRegistrationType slothRegistrationType;
        qrq0 qrq0Var2;
        c cVar = this;
        com.yandex.passport.sloth.data.c0 c0Var3 = c0Var;
        if (continuationImpl instanceof SlothInitialUrlProvider$getUriParams$1) {
            slothInitialUrlProvider$getUriParams$1 = (SlothInitialUrlProvider$getUriParams$1) continuationImpl;
            int i2 = slothInitialUrlProvider$getUriParams$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                slothInitialUrlProvider$getUriParams$1.label = i2 - Integer.MIN_VALUE;
                Object obj6 = slothInitialUrlProvider$getUriParams$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = slothInitialUrlProvider$getUriParams$1.label;
                qrq0 qrq0Var3 = ixn.a;
                switch (i) {
                    case 0:
                        kotlin.b.b(obj6);
                        if (c0Var3 instanceof com.yandex.passport.sloth.data.j) {
                            SlothTheme slothTheme = ((com.yandex.passport.sloth.data.j) c0Var3).c;
                            slothInitialUrlProvider$getUriParams$1.L$0 = cVar;
                            slothInitialUrlProvider$getUriParams$1.L$1 = c0Var3;
                            slothInitialUrlProvider$getUriParams$1.L$2 = c0Var3;
                            slothInitialUrlProvider$getUriParams$1.label = 1;
                            Object h = cVar.h(slothTheme, "account_upgrade", slothInitialUrlProvider$getUriParams$1);
                            if (h != coroutineSingletons) {
                                obj5 = h;
                                c0Var2 = c0Var3;
                                p = kotlin.sequences.b.p((qrq0) obj5, j73.v(new Pair[]{new Pair("nosocial", Boolean.TRUE), new Pair("force_required_upgrade", new Integer(com.yandex.passport.internal.ui.c.o(((com.yandex.passport.sloth.data.j) c0Var3).w)))}));
                                com.yandex.passport.sloth.data.c0 c0Var4 = c0Var2;
                                qrq0Var = p;
                                c0Var3 = c0Var4;
                                cVar.getClass();
                                if (c0Var3 instanceof com.yandex.passport.sloth.data.p) {
                                    qrq0Var2 = j73.v(new Pair[]{new Pair(LegacyAccountType.STRING_LOGIN, ((com.yandex.passport.sloth.data.p) c0Var3).a)});
                                } else if (c0Var3 instanceof s) {
                                    s sVar = (s) c0Var3;
                                    qrq0Var2 = j73.v(new Pair[]{new Pair("uid", Long.valueOf(sVar.a.getValue())), new Pair("phone", sVar.c), new Pair("editable", Boolean.valueOf(sVar.w))});
                                } else {
                                    if (!(c0Var3 instanceof com.yandex.passport.sloth.data.n) && !(c0Var3 instanceof t) && !(c0Var3 instanceof w)) {
                                        if (c0Var3 instanceof x) {
                                            x xVar = (x) c0Var3;
                                            qrq0Var2 = j73.v(new Pair[]{new Pair("uid", Long.valueOf(xVar.b.getValue())), new Pair(LegacyAccountType.STRING_LOGIN, xVar.a), new Pair("editable", Boolean.valueOf(xVar.c))});
                                        } else if (c0Var3 instanceof z) {
                                            z zVar = (z) c0Var3;
                                            qrq0Var2 = j73.v(new Pair[]{new Pair("firstName", zVar.c), new Pair("lastName", zVar.w), new Pair("email", zVar.b), new Pair("phone", zVar.a)});
                                        } else if (c0Var3 instanceof com.yandex.passport.sloth.data.a0) {
                                            qrq0Var2 = j73.v(new Pair[]{new Pair("webview", ConstantDeviceInfo.APP_PLATFORM)});
                                        } else if (!(c0Var3 instanceof y) && !(c0Var3 instanceof com.yandex.passport.sloth.data.j) && !(c0Var3 instanceof u) && !(c0Var3 instanceof b0) && !(c0Var3 instanceof com.yandex.passport.sloth.data.k) && !(c0Var3 instanceof com.yandex.passport.sloth.data.l) && !(c0Var3 instanceof com.yandex.passport.sloth.data.m) && !(c0Var3 instanceof com.yandex.passport.sloth.data.o) && !(c0Var3 instanceof r) && !(c0Var3 instanceof com.yandex.passport.sloth.data.i) && !(c0Var3 instanceof q) && !(c0Var3 instanceof SlothVariant$BiometricVerification) && !(c0Var3 instanceof com.yandex.passport.sloth.data.v)) {
                                            w511.b();
                                            return null;
                                        }
                                    }
                                    qrq0Var2 = qrq0Var3;
                                }
                                if (!(c0Var3 instanceof com.yandex.passport.sloth.data.l) && !(c0Var3 instanceof y)) {
                                    qrq0Var3 = j73.v(new Pair[]{new Pair("mode", c0Var3.getMode().getValue())});
                                }
                                return kotlin.sequences.b.p(qrq0Var, kotlin.sequences.b.p(qrq0Var2, qrq0Var3));
                            }
                        } else if (c0Var3 instanceof com.yandex.passport.sloth.data.g) {
                            com.yandex.passport.sloth.data.g gVar = (com.yandex.passport.sloth.data.g) c0Var3;
                            SlothTheme theme = gVar.c().getTheme();
                            String source = gVar.c().getSource();
                            slothInitialUrlProvider$getUriParams$1.L$0 = cVar;
                            slothInitialUrlProvider$getUriParams$1.L$1 = c0Var3;
                            slothInitialUrlProvider$getUriParams$1.L$2 = c0Var3;
                            slothInitialUrlProvider$getUriParams$1.label = 2;
                            Object h2 = cVar.h(theme, source, slothInitialUrlProvider$getUriParams$1);
                            if (h2 != coroutineSingletons) {
                                obj4 = h2;
                                c0Var2 = c0Var3;
                                qrq0 qrq0Var4 = (qrq0) obj4;
                                SlothLoginProperties c = ((com.yandex.passport.sloth.data.g) c0Var3).c();
                                cVar.getClass();
                                Pair pair = new Pair("nosocial", Boolean.valueOf(!c.isSocialAuthorizationEnabled()));
                                Pair pair2 = new Pair("auth_type", kotlin.collections.a.X(kotlin.collections.a.M(c.getSupportedAccountTypes()), ",", null, null, new com.yandex.passport.internal.core.announcing.f(28), 30));
                                slothRegistrationType = cVar.g.a.a;
                                if (slothRegistrationType == SlothRegistrationType.Portal && c.getSupportedAccountTypes().contains(SlothAccountType.LITE)) {
                                    slothRegistrationType = SlothRegistrationType.Neophonish;
                                }
                                p = kotlin.sequences.b.p(qrq0Var4, j73.v(new Pair[]{pair, pair2, new Pair("reg_type", slothRegistrationType), new Pair("noreturn", Integer.valueOf(com.yandex.passport.internal.ui.c.o(c.isNoReturnToHost()))), new Pair("enable_2fa", Boolean.valueOf(c.isEnable2fa())), new Pair("additional_action_request", c.getAdditionalActionRequest()), new Pair("cus_location", c.getCusLocation())}));
                                com.yandex.passport.sloth.data.c0 c0Var42 = c0Var2;
                                qrq0Var = p;
                                c0Var3 = c0Var42;
                                cVar.getClass();
                                if (c0Var3 instanceof com.yandex.passport.sloth.data.p) {
                                }
                                if (!(c0Var3 instanceof com.yandex.passport.sloth.data.l)) {
                                    qrq0Var3 = j73.v(new Pair[]{new Pair("mode", c0Var3.getMode().getValue())});
                                }
                                return kotlin.sequences.b.p(qrq0Var, kotlin.sequences.b.p(qrq0Var2, qrq0Var3));
                            }
                        } else if (c0Var3 instanceof com.yandex.passport.sloth.data.o) {
                            SlothTheme slothTheme2 = ((com.yandex.passport.sloth.data.o) c0Var3).c;
                            slothInitialUrlProvider$getUriParams$1.L$0 = cVar;
                            slothInitialUrlProvider$getUriParams$1.L$1 = c0Var3;
                            slothInitialUrlProvider$getUriParams$1.label = 3;
                            obj6 = cVar.h(slothTheme2, "bear", slothInitialUrlProvider$getUriParams$1);
                            break;
                        } else if (c0Var3 instanceof com.yandex.passport.sloth.data.h) {
                            SlothTheme theme2 = ((com.yandex.passport.sloth.data.h) c0Var3).getTheme();
                            slothInitialUrlProvider$getUriParams$1.L$0 = cVar;
                            slothInitialUrlProvider$getUriParams$1.L$1 = c0Var3;
                            slothInitialUrlProvider$getUriParams$1.label = 4;
                            obj6 = cVar.h(theme2, "webcard", slothInitialUrlProvider$getUriParams$1);
                            break;
                        } else if (c0Var3 instanceof com.yandex.passport.sloth.data.k) {
                            SlothTheme slothTheme3 = ((com.yandex.passport.sloth.data.k) c0Var3).c;
                            slothInitialUrlProvider$getUriParams$1.L$0 = cVar;
                            slothInitialUrlProvider$getUriParams$1.L$1 = c0Var3;
                            slothInitialUrlProvider$getUriParams$1.label = 5;
                            obj6 = cVar.h(slothTheme3, "webcard", slothInitialUrlProvider$getUriParams$1);
                            break;
                        } else {
                            if (!(c0Var3 instanceof com.yandex.passport.sloth.data.n)) {
                                if (!(c0Var3 instanceof com.yandex.passport.sloth.data.l) && !(c0Var3 instanceof com.yandex.passport.sloth.data.m)) {
                                    if (c0Var3 instanceof com.yandex.passport.sloth.data.a0) {
                                        SlothTheme slothTheme4 = ((com.yandex.passport.sloth.data.a0) c0Var3).a;
                                        slothInitialUrlProvider$getUriParams$1.L$0 = cVar;
                                        slothInitialUrlProvider$getUriParams$1.L$1 = c0Var3;
                                        slothInitialUrlProvider$getUriParams$1.L$2 = c0Var3;
                                        slothInitialUrlProvider$getUriParams$1.label = 7;
                                        Object h3 = cVar.h(slothTheme4, "user_menu", slothInitialUrlProvider$getUriParams$1);
                                        if (h3 != coroutineSingletons) {
                                            obj3 = h3;
                                            c0Var2 = c0Var3;
                                            p = kotlin.sequences.b.p((qrq0) obj3, new yw01(iw00.w(((com.yandex.passport.sloth.data.a0) c0Var3).b), new com.yandex.passport.internal.core.announcing.f(27)));
                                            com.yandex.passport.sloth.data.c0 c0Var422 = c0Var2;
                                            qrq0Var = p;
                                            c0Var3 = c0Var422;
                                            cVar.getClass();
                                            if (c0Var3 instanceof com.yandex.passport.sloth.data.p) {
                                            }
                                            if (!(c0Var3 instanceof com.yandex.passport.sloth.data.l)) {
                                            }
                                            return kotlin.sequences.b.p(qrq0Var, kotlin.sequences.b.p(qrq0Var2, qrq0Var3));
                                        }
                                    } else if (c0Var3 instanceof com.yandex.passport.sloth.data.i) {
                                        SlothTheme slothTheme5 = ((com.yandex.passport.sloth.data.i) c0Var3).c;
                                        slothInitialUrlProvider$getUriParams$1.L$0 = cVar;
                                        slothInitialUrlProvider$getUriParams$1.L$1 = c0Var3;
                                        slothInitialUrlProvider$getUriParams$1.label = 8;
                                        obj6 = cVar.h(slothTheme5, "account_delete_forever", slothInitialUrlProvider$getUriParams$1);
                                        break;
                                    } else if (!(c0Var3 instanceof r)) {
                                        if (c0Var3 instanceof q) {
                                            SlothTheme slothTheme6 = ((q) c0Var3).c;
                                            slothInitialUrlProvider$getUriParams$1.L$0 = cVar;
                                            slothInitialUrlProvider$getUriParams$1.L$1 = c0Var3;
                                            slothInitialUrlProvider$getUriParams$1.L$2 = c0Var3;
                                            slothInitialUrlProvider$getUriParams$1.label = 9;
                                            Object h4 = cVar.h(slothTheme6, "managing_plus_devices", slothInitialUrlProvider$getUriParams$1);
                                            if (h4 != coroutineSingletons) {
                                                obj2 = h4;
                                                c0Var2 = c0Var3;
                                                q qVar = (q) c0Var3;
                                                p = kotlin.sequences.b.p((qrq0) obj2, j73.v(new Pair[]{new Pair(Constants.KEY_SERVICE, qVar.w), new Pair("brand", qVar.x)}));
                                                com.yandex.passport.sloth.data.c0 c0Var4222 = c0Var2;
                                                qrq0Var = p;
                                                c0Var3 = c0Var4222;
                                                cVar.getClass();
                                                if (c0Var3 instanceof com.yandex.passport.sloth.data.p) {
                                                }
                                                if (!(c0Var3 instanceof com.yandex.passport.sloth.data.l)) {
                                                }
                                                return kotlin.sequences.b.p(qrq0Var, kotlin.sequences.b.p(qrq0Var2, qrq0Var3));
                                            }
                                        } else if (!(c0Var3 instanceof y)) {
                                            if (c0Var3 instanceof SlothVariant$BiometricVerification) {
                                                SlothTheme theme3 = ((SlothVariant$BiometricVerification) c0Var3).getTheme();
                                                slothInitialUrlProvider$getUriParams$1.L$0 = cVar;
                                                slothInitialUrlProvider$getUriParams$1.L$1 = c0Var3;
                                                slothInitialUrlProvider$getUriParams$1.L$2 = c0Var3;
                                                slothInitialUrlProvider$getUriParams$1.label = 10;
                                                Object h5 = cVar.h(theme3, "biometric_verification", slothInitialUrlProvider$getUriParams$1);
                                                if (h5 != coroutineSingletons) {
                                                    obj = h5;
                                                    c0Var2 = c0Var3;
                                                    SlothVariant$BiometricVerification slothVariant$BiometricVerification = (SlothVariant$BiometricVerification) c0Var3;
                                                    p = kotlin.sequences.b.p((qrq0) obj, j73.v(new Pair[]{new Pair("biometric_session_id", slothVariant$BiometricVerification.getBiometricSessionId()), new Pair("service_id", slothVariant$BiometricVerification.getServiceId()), new Pair("scheme", slothVariant$BiometricVerification.getScheme())}));
                                                    com.yandex.passport.sloth.data.c0 c0Var42222 = c0Var2;
                                                    qrq0Var = p;
                                                    c0Var3 = c0Var42222;
                                                    cVar.getClass();
                                                    if (c0Var3 instanceof com.yandex.passport.sloth.data.p) {
                                                    }
                                                    if (!(c0Var3 instanceof com.yandex.passport.sloth.data.l)) {
                                                    }
                                                    return kotlin.sequences.b.p(qrq0Var, kotlin.sequences.b.p(qrq0Var2, qrq0Var3));
                                                }
                                            } else {
                                                if (!(c0Var3 instanceof com.yandex.passport.sloth.data.v)) {
                                                    w511.b();
                                                    return null;
                                                }
                                                SlothTheme slothTheme7 = ((com.yandex.passport.sloth.data.v) c0Var3).b;
                                                slothInitialUrlProvider$getUriParams$1.L$0 = cVar;
                                                slothInitialUrlProvider$getUriParams$1.L$1 = c0Var3;
                                                slothInitialUrlProvider$getUriParams$1.label = 11;
                                                obj6 = cVar.h(slothTheme7, "register_webauthn", slothInitialUrlProvider$getUriParams$1);
                                                break;
                                            }
                                        }
                                    }
                                }
                                qrq0Var = qrq0Var3;
                                cVar.getClass();
                                if (c0Var3 instanceof com.yandex.passport.sloth.data.p) {
                                }
                                if (!(c0Var3 instanceof com.yandex.passport.sloth.data.l)) {
                                }
                                return kotlin.sequences.b.p(qrq0Var, kotlin.sequences.b.p(qrq0Var2, qrq0Var3));
                            }
                            SlothTheme slothTheme8 = SlothTheme.LIGHT;
                            slothInitialUrlProvider$getUriParams$1.L$0 = cVar;
                            slothInitialUrlProvider$getUriParams$1.L$1 = c0Var3;
                            slothInitialUrlProvider$getUriParams$1.label = 6;
                            obj6 = cVar.h(slothTheme8, "auth_sdk", slothInitialUrlProvider$getUriParams$1);
                            break;
                        }
                        return coroutineSingletons;
                    case 1:
                        com.yandex.passport.sloth.data.c0 c0Var5 = (com.yandex.passport.sloth.data.c0) slothInitialUrlProvider$getUriParams$1.L$2;
                        com.yandex.passport.sloth.data.c0 c0Var6 = (com.yandex.passport.sloth.data.c0) slothInitialUrlProvider$getUriParams$1.L$1;
                        c cVar2 = (c) slothInitialUrlProvider$getUriParams$1.L$0;
                        kotlin.b.b(obj6);
                        c0Var3 = c0Var5;
                        cVar = cVar2;
                        obj5 = obj6;
                        c0Var2 = c0Var6;
                        p = kotlin.sequences.b.p((qrq0) obj5, j73.v(new Pair[]{new Pair("nosocial", Boolean.TRUE), new Pair("force_required_upgrade", new Integer(com.yandex.passport.internal.ui.c.o(((com.yandex.passport.sloth.data.j) c0Var3).w)))}));
                        com.yandex.passport.sloth.data.c0 c0Var422222 = c0Var2;
                        qrq0Var = p;
                        c0Var3 = c0Var422222;
                        cVar.getClass();
                        if (c0Var3 instanceof com.yandex.passport.sloth.data.p) {
                        }
                        if (!(c0Var3 instanceof com.yandex.passport.sloth.data.l)) {
                        }
                        return kotlin.sequences.b.p(qrq0Var, kotlin.sequences.b.p(qrq0Var2, qrq0Var3));
                    case 2:
                        com.yandex.passport.sloth.data.c0 c0Var7 = (com.yandex.passport.sloth.data.c0) slothInitialUrlProvider$getUriParams$1.L$2;
                        com.yandex.passport.sloth.data.c0 c0Var8 = (com.yandex.passport.sloth.data.c0) slothInitialUrlProvider$getUriParams$1.L$1;
                        c cVar3 = (c) slothInitialUrlProvider$getUriParams$1.L$0;
                        kotlin.b.b(obj6);
                        c0Var3 = c0Var7;
                        cVar = cVar3;
                        obj4 = obj6;
                        c0Var2 = c0Var8;
                        qrq0 qrq0Var42 = (qrq0) obj4;
                        SlothLoginProperties c2 = ((com.yandex.passport.sloth.data.g) c0Var3).c();
                        cVar.getClass();
                        Pair pair3 = new Pair("nosocial", Boolean.valueOf(!c2.isSocialAuthorizationEnabled()));
                        Pair pair22 = new Pair("auth_type", kotlin.collections.a.X(kotlin.collections.a.M(c2.getSupportedAccountTypes()), ",", null, null, new com.yandex.passport.internal.core.announcing.f(28), 30));
                        slothRegistrationType = cVar.g.a.a;
                        if (slothRegistrationType == SlothRegistrationType.Portal) {
                            slothRegistrationType = SlothRegistrationType.Neophonish;
                            break;
                        }
                        p = kotlin.sequences.b.p(qrq0Var42, j73.v(new Pair[]{pair3, pair22, new Pair("reg_type", slothRegistrationType), new Pair("noreturn", Integer.valueOf(com.yandex.passport.internal.ui.c.o(c2.isNoReturnToHost()))), new Pair("enable_2fa", Boolean.valueOf(c2.isEnable2fa())), new Pair("additional_action_request", c2.getAdditionalActionRequest()), new Pair("cus_location", c2.getCusLocation())}));
                        com.yandex.passport.sloth.data.c0 c0Var4222222 = c0Var2;
                        qrq0Var = p;
                        c0Var3 = c0Var4222222;
                        cVar.getClass();
                        if (c0Var3 instanceof com.yandex.passport.sloth.data.p) {
                        }
                        if (!(c0Var3 instanceof com.yandex.passport.sloth.data.l)) {
                        }
                        return kotlin.sequences.b.p(qrq0Var, kotlin.sequences.b.p(qrq0Var2, qrq0Var3));
                    case 3:
                        com.yandex.passport.sloth.data.c0 c0Var9 = (com.yandex.passport.sloth.data.c0) slothInitialUrlProvider$getUriParams$1.L$1;
                        c cVar4 = (c) slothInitialUrlProvider$getUriParams$1.L$0;
                        kotlin.b.b(obj6);
                        c0Var3 = c0Var9;
                        cVar = cVar4;
                        qrq0Var = (qrq0) obj6;
                        cVar.getClass();
                        if (c0Var3 instanceof com.yandex.passport.sloth.data.p) {
                        }
                        if (!(c0Var3 instanceof com.yandex.passport.sloth.data.l)) {
                        }
                        return kotlin.sequences.b.p(qrq0Var, kotlin.sequences.b.p(qrq0Var2, qrq0Var3));
                    case 4:
                        com.yandex.passport.sloth.data.c0 c0Var10 = (com.yandex.passport.sloth.data.c0) slothInitialUrlProvider$getUriParams$1.L$1;
                        c cVar5 = (c) slothInitialUrlProvider$getUriParams$1.L$0;
                        kotlin.b.b(obj6);
                        c0Var3 = c0Var10;
                        cVar = cVar5;
                        qrq0Var = (qrq0) obj6;
                        cVar.getClass();
                        if (c0Var3 instanceof com.yandex.passport.sloth.data.p) {
                        }
                        if (!(c0Var3 instanceof com.yandex.passport.sloth.data.l)) {
                        }
                        return kotlin.sequences.b.p(qrq0Var, kotlin.sequences.b.p(qrq0Var2, qrq0Var3));
                    case 5:
                        com.yandex.passport.sloth.data.c0 c0Var11 = (com.yandex.passport.sloth.data.c0) slothInitialUrlProvider$getUriParams$1.L$1;
                        c cVar6 = (c) slothInitialUrlProvider$getUriParams$1.L$0;
                        kotlin.b.b(obj6);
                        c0Var3 = c0Var11;
                        cVar = cVar6;
                        qrq0Var = (qrq0) obj6;
                        cVar.getClass();
                        if (c0Var3 instanceof com.yandex.passport.sloth.data.p) {
                        }
                        if (!(c0Var3 instanceof com.yandex.passport.sloth.data.l)) {
                        }
                        return kotlin.sequences.b.p(qrq0Var, kotlin.sequences.b.p(qrq0Var2, qrq0Var3));
                    case 6:
                        com.yandex.passport.sloth.data.c0 c0Var12 = (com.yandex.passport.sloth.data.c0) slothInitialUrlProvider$getUriParams$1.L$1;
                        c cVar7 = (c) slothInitialUrlProvider$getUriParams$1.L$0;
                        kotlin.b.b(obj6);
                        c0Var3 = c0Var12;
                        cVar = cVar7;
                        qrq0Var = (qrq0) obj6;
                        cVar.getClass();
                        if (c0Var3 instanceof com.yandex.passport.sloth.data.p) {
                        }
                        if (!(c0Var3 instanceof com.yandex.passport.sloth.data.l)) {
                        }
                        return kotlin.sequences.b.p(qrq0Var, kotlin.sequences.b.p(qrq0Var2, qrq0Var3));
                    case 7:
                        com.yandex.passport.sloth.data.c0 c0Var13 = (com.yandex.passport.sloth.data.c0) slothInitialUrlProvider$getUriParams$1.L$2;
                        com.yandex.passport.sloth.data.c0 c0Var14 = (com.yandex.passport.sloth.data.c0) slothInitialUrlProvider$getUriParams$1.L$1;
                        c cVar8 = (c) slothInitialUrlProvider$getUriParams$1.L$0;
                        kotlin.b.b(obj6);
                        c0Var3 = c0Var13;
                        cVar = cVar8;
                        obj3 = obj6;
                        c0Var2 = c0Var14;
                        p = kotlin.sequences.b.p((qrq0) obj3, new yw01(iw00.w(((com.yandex.passport.sloth.data.a0) c0Var3).b), new com.yandex.passport.internal.core.announcing.f(27)));
                        com.yandex.passport.sloth.data.c0 c0Var42222222 = c0Var2;
                        qrq0Var = p;
                        c0Var3 = c0Var42222222;
                        cVar.getClass();
                        if (c0Var3 instanceof com.yandex.passport.sloth.data.p) {
                        }
                        if (!(c0Var3 instanceof com.yandex.passport.sloth.data.l)) {
                        }
                        return kotlin.sequences.b.p(qrq0Var, kotlin.sequences.b.p(qrq0Var2, qrq0Var3));
                    case 8:
                        com.yandex.passport.sloth.data.c0 c0Var15 = (com.yandex.passport.sloth.data.c0) slothInitialUrlProvider$getUriParams$1.L$1;
                        c cVar9 = (c) slothInitialUrlProvider$getUriParams$1.L$0;
                        kotlin.b.b(obj6);
                        c0Var3 = c0Var15;
                        cVar = cVar9;
                        qrq0Var = (qrq0) obj6;
                        cVar.getClass();
                        if (c0Var3 instanceof com.yandex.passport.sloth.data.p) {
                        }
                        if (!(c0Var3 instanceof com.yandex.passport.sloth.data.l)) {
                        }
                        return kotlin.sequences.b.p(qrq0Var, kotlin.sequences.b.p(qrq0Var2, qrq0Var3));
                    case 9:
                        com.yandex.passport.sloth.data.c0 c0Var16 = (com.yandex.passport.sloth.data.c0) slothInitialUrlProvider$getUriParams$1.L$2;
                        com.yandex.passport.sloth.data.c0 c0Var17 = (com.yandex.passport.sloth.data.c0) slothInitialUrlProvider$getUriParams$1.L$1;
                        c cVar10 = (c) slothInitialUrlProvider$getUriParams$1.L$0;
                        kotlin.b.b(obj6);
                        c0Var3 = c0Var16;
                        cVar = cVar10;
                        obj2 = obj6;
                        c0Var2 = c0Var17;
                        q qVar2 = (q) c0Var3;
                        p = kotlin.sequences.b.p((qrq0) obj2, j73.v(new Pair[]{new Pair(Constants.KEY_SERVICE, qVar2.w), new Pair("brand", qVar2.x)}));
                        com.yandex.passport.sloth.data.c0 c0Var422222222 = c0Var2;
                        qrq0Var = p;
                        c0Var3 = c0Var422222222;
                        cVar.getClass();
                        if (c0Var3 instanceof com.yandex.passport.sloth.data.p) {
                        }
                        if (!(c0Var3 instanceof com.yandex.passport.sloth.data.l)) {
                        }
                        return kotlin.sequences.b.p(qrq0Var, kotlin.sequences.b.p(qrq0Var2, qrq0Var3));
                    case 10:
                        com.yandex.passport.sloth.data.c0 c0Var18 = (com.yandex.passport.sloth.data.c0) slothInitialUrlProvider$getUriParams$1.L$2;
                        com.yandex.passport.sloth.data.c0 c0Var19 = (com.yandex.passport.sloth.data.c0) slothInitialUrlProvider$getUriParams$1.L$1;
                        c cVar11 = (c) slothInitialUrlProvider$getUriParams$1.L$0;
                        kotlin.b.b(obj6);
                        c0Var3 = c0Var18;
                        cVar = cVar11;
                        obj = obj6;
                        c0Var2 = c0Var19;
                        SlothVariant$BiometricVerification slothVariant$BiometricVerification2 = (SlothVariant$BiometricVerification) c0Var3;
                        p = kotlin.sequences.b.p((qrq0) obj, j73.v(new Pair[]{new Pair("biometric_session_id", slothVariant$BiometricVerification2.getBiometricSessionId()), new Pair("service_id", slothVariant$BiometricVerification2.getServiceId()), new Pair("scheme", slothVariant$BiometricVerification2.getScheme())}));
                        com.yandex.passport.sloth.data.c0 c0Var4222222222 = c0Var2;
                        qrq0Var = p;
                        c0Var3 = c0Var4222222222;
                        cVar.getClass();
                        if (c0Var3 instanceof com.yandex.passport.sloth.data.p) {
                        }
                        if (!(c0Var3 instanceof com.yandex.passport.sloth.data.l)) {
                        }
                        return kotlin.sequences.b.p(qrq0Var, kotlin.sequences.b.p(qrq0Var2, qrq0Var3));
                    case 11:
                        com.yandex.passport.sloth.data.c0 c0Var20 = (com.yandex.passport.sloth.data.c0) slothInitialUrlProvider$getUriParams$1.L$1;
                        c cVar12 = (c) slothInitialUrlProvider$getUriParams$1.L$0;
                        kotlin.b.b(obj6);
                        c0Var3 = c0Var20;
                        cVar = cVar12;
                        qrq0Var = (qrq0) obj6;
                        cVar.getClass();
                        if (c0Var3 instanceof com.yandex.passport.sloth.data.p) {
                        }
                        if (!(c0Var3 instanceof com.yandex.passport.sloth.data.l)) {
                        }
                        return kotlin.sequences.b.p(qrq0Var, kotlin.sequences.b.p(qrq0Var2, qrq0Var3));
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        slothInitialUrlProvider$getUriParams$1 = new SlothInitialUrlProvider$getUriParams$1(cVar, continuationImpl);
        Object obj62 = slothInitialUrlProvider$getUriParams$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = slothInitialUrlProvider$getUriParams$1.label;
        qrq0 qrq0Var32 = ixn.a;
        switch (i) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b4, code lost:
    
        if (r6.c(r8, r0) == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b6, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005f, code lost:
    
        if (r9 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Uid uid, String str, ContinuationImpl continuationImpl) {
        SlothInitialUrlProvider$injectCookie$1 slothInitialUrlProvider$injectCookie$1;
        int i;
        Object a;
        Throwable a2;
        String str2;
        com.yandex.passport.common.url.b bVar;
        if (continuationImpl instanceof SlothInitialUrlProvider$injectCookie$1) {
            slothInitialUrlProvider$injectCookie$1 = (SlothInitialUrlProvider$injectCookie$1) continuationImpl;
            int i2 = slothInitialUrlProvider$injectCookie$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                slothInitialUrlProvider$injectCookie$1.label = i2 - Integer.MIN_VALUE;
                Object obj = slothInitialUrlProvider$injectCookie$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = slothInitialUrlProvider$injectCookie$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String g = com.yandex.passport.common.url.b.g(str);
                    slothInitialUrlProvider$injectCookie$1.L$0 = this;
                    slothInitialUrlProvider$injectCookie$1.L$1 = uid;
                    slothInitialUrlProvider$injectCookie$1.L$2 = str;
                    slothInitialUrlProvider$injectCookie$1.label = 1;
                    a = this.h.a(uid, g, slothInitialUrlProvider$injectCookie$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        str2 = "";
                        bVar = str2 == null ? new com.yandex.passport.common.url.b(str2) : null;
                        if (bVar != null) {
                            return bVar.a;
                        }
                        return null;
                    }
                    str = (String) slothInitialUrlProvider$injectCookie$1.L$2;
                    uid = (Uid) slothInitialUrlProvider$injectCookie$1.L$1;
                    this = (c) slothInitialUrlProvider$injectCookie$1.L$0;
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                a2 = Result.a(a);
                if (a2 != null) {
                    com.yandex.passport.sloth.e eVar = this.j;
                    List list = ((com.yandex.passport.sloth.dependencies.a) a).a;
                    eVar.getClass();
                    com.yandex.passport.sloth.e.a(str, list);
                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "url " + ((Object) com.yandex.passport.common.url.b.l(str)), 8);
                    }
                    bVar = new com.yandex.passport.common.url.b(str);
                    if (bVar != null) {
                    }
                } else if (a2 instanceof SlothInvalidTokenException) {
                    v vVar = this.f;
                    c0 c0Var = new c0(uid);
                    slothInitialUrlProvider$injectCookie$1.L$0 = null;
                    slothInitialUrlProvider$injectCookie$1.L$1 = null;
                    slothInitialUrlProvider$injectCookie$1.L$2 = null;
                    slothInitialUrlProvider$injectCookie$1.label = 2;
                } else {
                    str2 = null;
                    if (str2 == null) {
                    }
                    if (bVar != null) {
                    }
                }
            }
        }
        slothInitialUrlProvider$injectCookie$1 = new SlothInitialUrlProvider$injectCookie$1(this, continuationImpl);
        Object obj2 = slothInitialUrlProvider$injectCookie$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = slothInitialUrlProvider$injectCookie$1.label;
        if (i != 0) {
        }
        a2 = Result.a(a);
        if (a2 != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0065, code lost:
    
        if (r12 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0056, code lost:
    
        if (r7 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
    
        if (r12 == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(Uid uid, String str, boolean z, tls tlsVar, ContinuationImpl continuationImpl) {
        SlothInitialUrlProvider$injectCookieOrAuthUrl$1 slothInitialUrlProvider$injectCookieOrAuthUrl$1;
        int i;
        Object l;
        if (continuationImpl instanceof SlothInitialUrlProvider$injectCookieOrAuthUrl$1) {
            slothInitialUrlProvider$injectCookieOrAuthUrl$1 = (SlothInitialUrlProvider$injectCookieOrAuthUrl$1) continuationImpl;
            int i2 = slothInitialUrlProvider$injectCookieOrAuthUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                slothInitialUrlProvider$injectCookieOrAuthUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = slothInitialUrlProvider$injectCookieOrAuthUrl$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = slothInitialUrlProvider$injectCookieOrAuthUrl$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (z) {
                        slothInitialUrlProvider$injectCookieOrAuthUrl$1.L$0 = tlsVar;
                        slothInitialUrlProvider$injectCookieOrAuthUrl$1.label = 1;
                        l = l(uid, str, slothInitialUrlProvider$injectCookieOrAuthUrl$1);
                    } else {
                        slothInitialUrlProvider$injectCookieOrAuthUrl$1.label = 3;
                        obj = tlsVar.invoke(slothInitialUrlProvider$injectCookieOrAuthUrl$1);
                    }
                    return obj2;
                }
                if (i == 1) {
                    tlsVar = (tls) slothInitialUrlProvider$injectCookieOrAuthUrl$1.L$0;
                    kotlin.b.b(obj);
                    com.yandex.passport.common.url.b bVar = (com.yandex.passport.common.url.b) obj;
                    l = bVar != null ? bVar.a : null;
                    String str2 = (String) l;
                    if (str2 != null) {
                        return str2;
                    }
                    slothInitialUrlProvider$injectCookieOrAuthUrl$1.L$0 = null;
                    slothInitialUrlProvider$injectCookieOrAuthUrl$1.label = 2;
                    obj = tlsVar.invoke(slothInitialUrlProvider$injectCookieOrAuthUrl$1);
                } else if (i == 2) {
                    kotlin.b.b(obj);
                    com.yandex.passport.common.url.b bVar2 = (com.yandex.passport.common.url.b) obj;
                    if (bVar2 != null) {
                        return bVar2.a;
                    }
                } else {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    com.yandex.passport.common.url.b bVar3 = (com.yandex.passport.common.url.b) obj;
                    if (bVar3 != null) {
                        return bVar3.a;
                    }
                }
                return null;
            }
        }
        slothInitialUrlProvider$injectCookieOrAuthUrl$1 = new SlothInitialUrlProvider$injectCookieOrAuthUrl$1(this, continuationImpl);
        Object obj3 = slothInitialUrlProvider$injectCookieOrAuthUrl$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = slothInitialUrlProvider$injectCookieOrAuthUrl$1.label;
        if (i != 0) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(com.yandex.passport.sloth.data.p pVar, ContinuationImpl continuationImpl) {
        SlothInitialUrlProvider$loginBaseUrlBuilder$1 slothInitialUrlProvider$loginBaseUrlBuilder$1;
        int i;
        String str;
        if (continuationImpl instanceof SlothInitialUrlProvider$loginBaseUrlBuilder$1) {
            slothInitialUrlProvider$loginBaseUrlBuilder$1 = (SlothInitialUrlProvider$loginBaseUrlBuilder$1) continuationImpl;
            int i2 = slothInitialUrlProvider$loginBaseUrlBuilder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                slothInitialUrlProvider$loginBaseUrlBuilder$1.label = i2 - Integer.MIN_VALUE;
                Object obj = slothInitialUrlProvider$loginBaseUrlBuilder$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = slothInitialUrlProvider$loginBaseUrlBuilder$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    slothInitialUrlProvider$loginBaseUrlBuilder$1.L$0 = pVar;
                    slothInitialUrlProvider$loginBaseUrlBuilder$1.label = 1;
                    obj = i(slothInitialUrlProvider$loginBaseUrlBuilder$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pVar = (com.yandex.passport.sloth.data.p) slothInitialUrlProvider$loginBaseUrlBuilder$1.L$0;
                    kotlin.b.b(obj);
                }
                Uri.Builder builder = (Uri.Builder) obj;
                str = pVar.w;
                if (str != null) {
                    Uri parse = Uri.parse(str);
                    builder.encodedPath(parse.getEncodedPath()).encodedQuery(parse.getEncodedQuery());
                }
                return builder;
            }
        }
        slothInitialUrlProvider$loginBaseUrlBuilder$1 = new SlothInitialUrlProvider$loginBaseUrlBuilder$1(this, continuationImpl);
        Object obj3 = slothInitialUrlProvider$loginBaseUrlBuilder$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = slothInitialUrlProvider$loginBaseUrlBuilder$1.label;
        if (i != 0) {
        }
        Uri.Builder builder2 = (Uri.Builder) obj3;
        str = pVar.w;
        if (str != null) {
        }
        return builder2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ea, code lost:
    
        if (r11 == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ed, code lost:
    
        r11 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0116, code lost:
    
        if (r11 != r1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0114, code lost:
    
        if (r11 == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b0, code lost:
    
        if (r7 != r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(com.yandex.passport.sloth.data.c0 c0Var, ContinuationImpl continuationImpl) {
        SlothInitialUrlProvider$navigateToInitialUrl$1 slothInitialUrlProvider$navigateToInitialUrl$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        c cVar;
        Object b;
        Object y;
        com.yandex.passport.sloth.data.c0 c0Var2;
        c cVar2;
        String str;
        Object emit;
        if (continuationImpl instanceof SlothInitialUrlProvider$navigateToInitialUrl$1) {
            slothInitialUrlProvider$navigateToInitialUrl$1 = (SlothInitialUrlProvider$navigateToInitialUrl$1) continuationImpl;
            int i2 = slothInitialUrlProvider$navigateToInitialUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                slothInitialUrlProvider$navigateToInitialUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = slothInitialUrlProvider$navigateToInitialUrl$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = slothInitialUrlProvider$navigateToInitialUrl$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    slothInitialUrlProvider$navigateToInitialUrl$1.L$0 = this;
                    slothInitialUrlProvider$navigateToInitialUrl$1.L$1 = c0Var;
                    slothInitialUrlProvider$navigateToInitialUrl$1.L$2 = this;
                    slothInitialUrlProvider$navigateToInitialUrl$1.label = 1;
                    obj = j(c0Var, slothInitialUrlProvider$navigateToInitialUrl$1);
                    if (obj != coroutineSingletons) {
                        cVar = this;
                    }
                }
                if (i == 1) {
                    this = (c) slothInitialUrlProvider$navigateToInitialUrl$1.L$2;
                    c0Var = (com.yandex.passport.sloth.data.c0) slothInitialUrlProvider$navigateToInitialUrl$1.L$1;
                    cVar = (c) slothInitialUrlProvider$navigateToInitialUrl$1.L$0;
                    kotlin.b.b(obj);
                } else {
                    if (i == 2) {
                        this = (c) slothInitialUrlProvider$navigateToInitialUrl$1.L$3;
                        Object obj2 = slothInitialUrlProvider$navigateToInitialUrl$1.L$2;
                        com.yandex.passport.sloth.data.c0 c0Var3 = (com.yandex.passport.sloth.data.c0) slothInitialUrlProvider$navigateToInitialUrl$1.L$1;
                        c cVar3 = (c) slothInitialUrlProvider$navigateToInitialUrl$1.L$0;
                        kotlin.b.b(obj);
                        obj = obj2;
                        c0Var = c0Var3;
                        cVar = cVar3;
                        slothInitialUrlProvider$navigateToInitialUrl$1.L$0 = cVar;
                        slothInitialUrlProvider$navigateToInitialUrl$1.L$1 = c0Var;
                        slothInitialUrlProvider$navigateToInitialUrl$1.L$2 = null;
                        slothInitialUrlProvider$navigateToInitialUrl$1.L$3 = null;
                        slothInitialUrlProvider$navigateToInitialUrl$1.label = 3;
                        y = this.y((Uri) obj, c0Var, slothInitialUrlProvider$navigateToInitialUrl$1);
                        if (y != coroutineSingletons) {
                            c0Var2 = c0Var;
                            cVar2 = cVar;
                            str = (String) y;
                            if (str != null) {
                            }
                        }
                    }
                    if (i != 3) {
                        if (i == 4) {
                            kotlin.b.b(obj);
                            return zy11Var;
                        }
                        if (i == 5) {
                            kotlin.b.b(obj);
                            return zy11Var;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c0Var2 = (com.yandex.passport.sloth.data.c0) slothInitialUrlProvider$navigateToInitialUrl$1.L$1;
                    cVar2 = (c) slothInitialUrlProvider$navigateToInitialUrl$1.L$0;
                    kotlin.b.b(obj);
                    com.yandex.passport.common.url.b bVar = (com.yandex.passport.common.url.b) obj;
                    y = bVar != null ? bVar.a : null;
                    str = (String) y;
                    if (str != null) {
                        v vVar = cVar2.f;
                        com.yandex.passport.sloth.o oVar = new com.yandex.passport.sloth.o(false, cVar2.a.getCommonWebProperties().getIgnoreBackToNativeFallback());
                        slothInitialUrlProvider$navigateToInitialUrl$1.L$0 = null;
                        slothInitialUrlProvider$navigateToInitialUrl$1.L$1 = null;
                        slothInitialUrlProvider$navigateToInitialUrl$1.label = 5;
                        return vVar.b(oVar, slothInitialUrlProvider$navigateToInitialUrl$1) == coroutineSingletons ? coroutineSingletons : zy11Var;
                    }
                    slothInitialUrlProvider$navigateToInitialUrl$1.L$0 = cVar2;
                    slothInitialUrlProvider$navigateToInitialUrl$1.L$1 = null;
                    slothInitialUrlProvider$navigateToInitialUrl$1.label = 4;
                    cVar2.getClass();
                    SlothMode mode = c0Var2.getMode();
                    SlothMode slothMode = SlothMode.AuthQrWithoutQr;
                    v vVar2 = cVar2.f;
                    if (mode == slothMode) {
                        emit = vVar2.d(new com.yandex.passport.sloth.w(str), slothInitialUrlProvider$navigateToInitialUrl$1);
                    } else {
                        vVar2.a.a(new n0(SlothMetricaEvent$Event.NAVIGATE_URL, g8e.z("url", w0.a(str))));
                        emit = vVar2.b.emit(new com.yandex.passport.common.url.b(str), slothInitialUrlProvider$navigateToInitialUrl$1);
                        if (emit != coroutineSingletons) {
                            emit = zy11Var;
                        }
                    }
                }
                slothInitialUrlProvider$navigateToInitialUrl$1.L$0 = cVar;
                slothInitialUrlProvider$navigateToInitialUrl$1.L$1 = c0Var;
                slothInitialUrlProvider$navigateToInitialUrl$1.L$2 = obj;
                slothInitialUrlProvider$navigateToInitialUrl$1.L$3 = this;
                slothInitialUrlProvider$navigateToInitialUrl$1.label = 2;
                b = cVar.f.b(new com.yandex.passport.sloth.n(false), slothInitialUrlProvider$navigateToInitialUrl$1);
                if (b != coroutineSingletons) {
                    b = zy11Var;
                }
            }
        }
        slothInitialUrlProvider$navigateToInitialUrl$1 = new SlothInitialUrlProvider$navigateToInitialUrl$1(this, continuationImpl);
        Object obj3 = slothInitialUrlProvider$navigateToInitialUrl$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = slothInitialUrlProvider$navigateToInitialUrl$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        slothInitialUrlProvider$navigateToInitialUrl$1.L$0 = cVar;
        slothInitialUrlProvider$navigateToInitialUrl$1.L$1 = c0Var;
        slothInitialUrlProvider$navigateToInitialUrl$1.L$2 = obj3;
        slothInitialUrlProvider$navigateToInitialUrl$1.L$3 = this;
        slothInitialUrlProvider$navigateToInitialUrl$1.label = 2;
        b = cVar.f.b(new com.yandex.passport.sloth.n(false), slothInitialUrlProvider$navigateToInitialUrl$1);
        if (b != coroutineSingletons) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0074, code lost:
    
        if (r13 == r1) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(w wVar, ContinuationImpl continuationImpl) {
        SlothInitialUrlProvider$registrationBaseUrlBuilder$1 slothInitialUrlProvider$registrationBaseUrlBuilder$1;
        int i;
        Uri.Builder builder;
        String str;
        AccountForProfile accountForProfile;
        c cVar;
        Throwable th;
        TimeoutCancellationException e;
        String uri;
        Object a;
        String str2;
        Object obj;
        Result.Failure failure;
        Object obj2;
        Throwable a2;
        Uri.Builder builder2;
        try {
            if (continuationImpl instanceof SlothInitialUrlProvider$registrationBaseUrlBuilder$1) {
                slothInitialUrlProvider$registrationBaseUrlBuilder$1 = (SlothInitialUrlProvider$registrationBaseUrlBuilder$1) continuationImpl;
                int i2 = slothInitialUrlProvider$registrationBaseUrlBuilder$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    slothInitialUrlProvider$registrationBaseUrlBuilder$1.label = i2 - Integer.MIN_VALUE;
                    Object obj3 = slothInitialUrlProvider$registrationBaseUrlBuilder$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = slothInitialUrlProvider$registrationBaseUrlBuilder$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj3);
                        slothInitialUrlProvider$registrationBaseUrlBuilder$1.L$0 = this;
                        slothInitialUrlProvider$registrationBaseUrlBuilder$1.L$1 = wVar;
                        slothInitialUrlProvider$registrationBaseUrlBuilder$1.label = 1;
                        obj3 = i(slothInitialUrlProvider$registrationBaseUrlBuilder$1);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                builder2 = (Uri.Builder) slothInitialUrlProvider$registrationBaseUrlBuilder$1.L$0;
                                kotlin.b.b(obj3);
                                new Uri.Builder();
                                return builder2;
                            }
                            str2 = (String) slothInitialUrlProvider$registrationBaseUrlBuilder$1.L$3;
                            accountForProfile = (AccountForProfile) slothInitialUrlProvider$registrationBaseUrlBuilder$1.L$2;
                            builder = (Uri.Builder) slothInitialUrlProvider$registrationBaseUrlBuilder$1.L$1;
                            cVar = (c) slothInitialUrlProvider$registrationBaseUrlBuilder$1.L$0;
                            try {
                                kotlin.b.b(obj3);
                                obj = ((Result) obj3).getValue();
                                kotlin.b.b(obj);
                                com.yandex.passport.sloth.e eVar = cVar.j;
                                List list = ((com.yandex.passport.sloth.dependencies.a) obj).a;
                                eVar.getClass();
                                com.yandex.passport.sloth.e.a(str2, list);
                                builder.appendQueryParameter("create_profile", "true");
                                cVar.s(true, accountForProfile);
                                obj2 = zy11.a;
                            } catch (TimeoutCancellationException e2) {
                                e = e2;
                                failure = new Result.Failure(e);
                                obj2 = failure;
                                a2 = Result.a(obj2);
                                if (a2 != null) {
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                failure = new Result.Failure(th);
                                obj2 = failure;
                                a2 = Result.a(obj2);
                                if (a2 != null) {
                                }
                            }
                            a2 = Result.a(obj2);
                            if (a2 != null) {
                                return builder;
                            }
                            com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.c(LogLevel.ERROR, null, "An error occurred injecting cookies for profile creation: " + a2, 8);
                            }
                            cVar.s(false, accountForProfile);
                            v vVar = cVar.f;
                            a0 a0Var = new a0(a2, "registrationUrlBuilder");
                            slothInitialUrlProvider$registrationBaseUrlBuilder$1.L$0 = builder;
                            slothInitialUrlProvider$registrationBaseUrlBuilder$1.L$1 = null;
                            slothInitialUrlProvider$registrationBaseUrlBuilder$1.L$2 = null;
                            slothInitialUrlProvider$registrationBaseUrlBuilder$1.L$3 = null;
                            slothInitialUrlProvider$registrationBaseUrlBuilder$1.label = 3;
                            if (vVar.c(a0Var, slothInitialUrlProvider$registrationBaseUrlBuilder$1) != coroutineSingletons) {
                                builder2 = builder;
                                new Uri.Builder();
                                return builder2;
                            }
                            return coroutineSingletons;
                        }
                        wVar = (w) slothInitialUrlProvider$registrationBaseUrlBuilder$1.L$1;
                        this = (c) slothInitialUrlProvider$registrationBaseUrlBuilder$1.L$0;
                        kotlin.b.b(obj3);
                    }
                    builder = (Uri.Builder) obj3;
                    str = wVar.w;
                    if (str != null) {
                        Uri parse = Uri.parse(str);
                        builder.encodedPath(parse.getEncodedPath()).encodedQuery(parse.getEncodedQuery());
                    }
                    accountForProfile = wVar.c;
                    if (accountForProfile != null) {
                        return builder;
                    }
                    try {
                        com.yandex.passport.common.url.a aVar = com.yandex.passport.common.url.b.Companion;
                        Uri build = builder.build();
                        aVar.getClass();
                        uri = build.toString();
                        com.yandex.passport.internal.sloth.d dVar = this.h;
                        Uid uid = accountForProfile.getUid();
                        String g = com.yandex.passport.common.url.b.g(uri);
                        slothInitialUrlProvider$registrationBaseUrlBuilder$1.L$0 = this;
                        slothInitialUrlProvider$registrationBaseUrlBuilder$1.L$1 = builder;
                        slothInitialUrlProvider$registrationBaseUrlBuilder$1.L$2 = accountForProfile;
                        slothInitialUrlProvider$registrationBaseUrlBuilder$1.L$3 = uri;
                        slothInitialUrlProvider$registrationBaseUrlBuilder$1.label = 2;
                        a = dVar.a(uid, g, slothInitialUrlProvider$registrationBaseUrlBuilder$1);
                    } catch (TimeoutCancellationException e3) {
                        cVar = this;
                        e = e3;
                        failure = new Result.Failure(e);
                        obj2 = failure;
                        a2 = Result.a(obj2);
                        if (a2 != null) {
                        }
                    } catch (Throwable th3) {
                        cVar = this;
                        th = th3;
                        failure = new Result.Failure(th);
                        obj2 = failure;
                        a2 = Result.a(obj2);
                        if (a2 != null) {
                        }
                    }
                    if (a != coroutineSingletons) {
                        cVar = this;
                        str2 = uri;
                        obj = a;
                        kotlin.b.b(obj);
                        com.yandex.passport.sloth.e eVar2 = cVar.j;
                        List list2 = ((com.yandex.passport.sloth.dependencies.a) obj).a;
                        eVar2.getClass();
                        com.yandex.passport.sloth.e.a(str2, list2);
                        builder.appendQueryParameter("create_profile", "true");
                        cVar.s(true, accountForProfile);
                        obj2 = zy11.a;
                        a2 = Result.a(obj2);
                        if (a2 != null) {
                        }
                    }
                    return coroutineSingletons;
                }
            }
            if (i != 0) {
            }
            builder = (Uri.Builder) obj3;
            str = wVar.w;
            if (str != null) {
            }
            accountForProfile = wVar.c;
            if (accountForProfile != null) {
            }
        } catch (CancellationException e4) {
            throw e4;
        }
        slothInitialUrlProvider$registrationBaseUrlBuilder$1 = new SlothInitialUrlProvider$registrationBaseUrlBuilder$1(this, continuationImpl);
        Object obj32 = slothInitialUrlProvider$registrationBaseUrlBuilder$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = slothInitialUrlProvider$registrationBaseUrlBuilder$1.label;
    }

    public final void s(boolean z, AccountForProfile accountForProfile) {
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("success", String.valueOf(z));
        mapBuilder.put("uid", t(accountForProfile.getUid()));
        Uid muid = accountForProfile.getMuid();
        if (muid != null) {
            mapBuilder.put("muid", t(muid));
        }
        MapBuilder j = mapBuilder.j();
        com.yandex.passport.internal.sloth.m mVar = (com.yandex.passport.internal.sloth.m) this.m.a;
        if (mVar.a()) {
            mVar.a.a("create_master_profile.cookie_injected", j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(Uri uri, Uid uid, FrontendUrlType frontendUrlType, ContinuationImpl continuationImpl) {
        SlothInitialUrlProvider$requireAuthUrl$1 slothInitialUrlProvider$requireAuthUrl$1;
        int i;
        Object d;
        Uid uid2;
        if (continuationImpl instanceof SlothInitialUrlProvider$requireAuthUrl$1) {
            slothInitialUrlProvider$requireAuthUrl$1 = (SlothInitialUrlProvider$requireAuthUrl$1) continuationImpl;
            int i2 = slothInitialUrlProvider$requireAuthUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                slothInitialUrlProvider$requireAuthUrl$1.label = i2 - Integer.MIN_VALUE;
                SlothInitialUrlProvider$requireAuthUrl$1 slothInitialUrlProvider$requireAuthUrl$12 = slothInitialUrlProvider$requireAuthUrl$1;
                Object obj = slothInitialUrlProvider$requireAuthUrl$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = slothInitialUrlProvider$requireAuthUrl$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Locale b = ((com.yandex.passport.internal.ui.lang.a) this.c).b();
                    com.yandex.passport.common.url.b.Companion.getClass();
                    String uri2 = uri.toString();
                    slothInitialUrlProvider$requireAuthUrl$12.L$0 = this;
                    slothInitialUrlProvider$requireAuthUrl$12.L$1 = uid;
                    slothInitialUrlProvider$requireAuthUrl$12.label = 1;
                    d = ((com.yandex.passport.internal.sloth.o) this.b).d(uid, b, uri2, frontendUrlType, slothInitialUrlProvider$requireAuthUrl$12);
                    if (d != coroutineSingletons) {
                        uid2 = uid;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return "";
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uid2 = (Uid) slothInitialUrlProvider$requireAuthUrl$12.L$1;
                this = (c) slothInitialUrlProvider$requireAuthUrl$12.L$0;
                kotlin.b.b(obj);
                d = ((Result) obj).getValue();
                if (Result.a(d) != null) {
                    return ((com.yandex.passport.common.url.b) d).a;
                }
                v vVar = this.f;
                c0 c0Var = new c0(uid2);
                slothInitialUrlProvider$requireAuthUrl$12.L$0 = null;
                slothInitialUrlProvider$requireAuthUrl$12.L$1 = null;
                slothInitialUrlProvider$requireAuthUrl$12.label = 2;
                return vVar.c(c0Var, slothInitialUrlProvider$requireAuthUrl$12) == coroutineSingletons ? coroutineSingletons : "";
            }
        }
        slothInitialUrlProvider$requireAuthUrl$1 = new SlothInitialUrlProvider$requireAuthUrl$1(this, continuationImpl);
        SlothInitialUrlProvider$requireAuthUrl$1 slothInitialUrlProvider$requireAuthUrl$122 = slothInitialUrlProvider$requireAuthUrl$1;
        Object obj2 = slothInitialUrlProvider$requireAuthUrl$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = slothInitialUrlProvider$requireAuthUrl$122.label;
        if (i != 0) {
        }
        if (Result.a(d) != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (r10 == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Uri uri, Uid uid, FrontendUrlType frontendUrlType, ContinuationImpl continuationImpl) {
        SlothInitialUrlProvider$requireAuthUrlWithFailed$1 slothInitialUrlProvider$requireAuthUrlWithFailed$1;
        int i;
        Object d;
        Throwable a;
        if (continuationImpl instanceof SlothInitialUrlProvider$requireAuthUrlWithFailed$1) {
            slothInitialUrlProvider$requireAuthUrlWithFailed$1 = (SlothInitialUrlProvider$requireAuthUrlWithFailed$1) continuationImpl;
            int i2 = slothInitialUrlProvider$requireAuthUrlWithFailed$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                slothInitialUrlProvider$requireAuthUrlWithFailed$1.label = i2 - Integer.MIN_VALUE;
                SlothInitialUrlProvider$requireAuthUrlWithFailed$1 slothInitialUrlProvider$requireAuthUrlWithFailed$12 = slothInitialUrlProvider$requireAuthUrlWithFailed$1;
                Object obj = slothInitialUrlProvider$requireAuthUrlWithFailed$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = slothInitialUrlProvider$requireAuthUrlWithFailed$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Locale b = ((com.yandex.passport.internal.ui.lang.a) this.c).b();
                    com.yandex.passport.common.url.b.Companion.getClass();
                    String uri2 = uri.toString();
                    slothInitialUrlProvider$requireAuthUrlWithFailed$12.L$0 = this;
                    slothInitialUrlProvider$requireAuthUrlWithFailed$12.label = 1;
                    d = ((com.yandex.passport.internal.sloth.o) this.b).d(uid, b, uri2, frontendUrlType, slothInitialUrlProvider$requireAuthUrlWithFailed$12);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return "";
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (c) slothInitialUrlProvider$requireAuthUrlWithFailed$12.L$0;
                    kotlin.b.b(obj);
                    d = ((Result) obj).getValue();
                }
                a = Result.a(d);
                if (a != null) {
                    return ((com.yandex.passport.common.url.b) d).a;
                }
                v vVar = this.f;
                a0 a0Var = new a0(a, "invalid master token");
                slothInitialUrlProvider$requireAuthUrlWithFailed$12.L$0 = null;
                slothInitialUrlProvider$requireAuthUrlWithFailed$12.label = 2;
                return vVar.c(a0Var, slothInitialUrlProvider$requireAuthUrlWithFailed$12) == coroutineSingletons ? coroutineSingletons : "";
            }
        }
        slothInitialUrlProvider$requireAuthUrlWithFailed$1 = new SlothInitialUrlProvider$requireAuthUrlWithFailed$1(this, continuationImpl);
        SlothInitialUrlProvider$requireAuthUrlWithFailed$1 slothInitialUrlProvider$requireAuthUrlWithFailed$122 = slothInitialUrlProvider$requireAuthUrlWithFailed$1;
        Object obj2 = slothInitialUrlProvider$requireAuthUrlWithFailed$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = slothInitialUrlProvider$requireAuthUrlWithFailed$122.label;
        if (i != 0) {
        }
        a = Result.a(d);
        if (a != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x008a, code lost:
    
        if (r13 == r0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w(Uri uri, Uid uid, ContinuationImpl continuationImpl) {
        SlothInitialUrlProvider$requireUserMenuUrl$1 slothInitialUrlProvider$requireUserMenuUrl$1;
        int i;
        Object d;
        Throwable a;
        if (continuationImpl instanceof SlothInitialUrlProvider$requireUserMenuUrl$1) {
            slothInitialUrlProvider$requireUserMenuUrl$1 = (SlothInitialUrlProvider$requireUserMenuUrl$1) continuationImpl;
            int i2 = slothInitialUrlProvider$requireUserMenuUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                slothInitialUrlProvider$requireUserMenuUrl$1.label = i2 - Integer.MIN_VALUE;
                SlothInitialUrlProvider$requireUserMenuUrl$1 slothInitialUrlProvider$requireUserMenuUrl$12 = slothInitialUrlProvider$requireUserMenuUrl$1;
                Object obj = slothInitialUrlProvider$requireUserMenuUrl$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = slothInitialUrlProvider$requireUserMenuUrl$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (uid == null) {
                        com.yandex.passport.common.url.b.Companion.getClass();
                        return com.yandex.passport.common.url.b.b(uri.toString(), new Pair("deauthorize", "true"));
                    }
                    Locale b = ((com.yandex.passport.internal.ui.lang.a) this.c).b();
                    com.yandex.passport.common.url.b.Companion.getClass();
                    String uri2 = uri.toString();
                    FrontendUrlType frontendUrlType = FrontendUrlType.PASSPORT;
                    slothInitialUrlProvider$requireUserMenuUrl$12.L$0 = this;
                    slothInitialUrlProvider$requireUserMenuUrl$12.L$1 = uri;
                    slothInitialUrlProvider$requireUserMenuUrl$12.label = 1;
                    d = ((com.yandex.passport.internal.sloth.o) this.b).d(uid, b, uri2, frontendUrlType, slothInitialUrlProvider$requireUserMenuUrl$12);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return "";
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uri = (Uri) slothInitialUrlProvider$requireUserMenuUrl$12.L$1;
                    this = (c) slothInitialUrlProvider$requireUserMenuUrl$12.L$0;
                    kotlin.b.b(obj);
                    d = ((Result) obj).getValue();
                }
                a = Result.a(d);
                if (a != null) {
                    return ((com.yandex.passport.common.url.b) d).a;
                }
                if (!(a instanceof IOException)) {
                    this.getClass();
                    com.yandex.passport.common.url.b.Companion.getClass();
                    return com.yandex.passport.common.url.b.b(uri.toString(), new Pair("deauthorize", "true"));
                }
                v vVar = this.f;
                com.yandex.passport.sloth.m mVar = new com.yandex.passport.sloth.m(Collections.singletonList(new com.yandex.passport.sloth.k("lost_connection")));
                slothInitialUrlProvider$requireUserMenuUrl$12.L$0 = null;
                slothInitialUrlProvider$requireUserMenuUrl$12.L$1 = null;
                slothInitialUrlProvider$requireUserMenuUrl$12.label = 2;
                return vVar.d(mVar, slothInitialUrlProvider$requireUserMenuUrl$12) == coroutineSingletons ? coroutineSingletons : "";
            }
        }
        slothInitialUrlProvider$requireUserMenuUrl$1 = new SlothInitialUrlProvider$requireUserMenuUrl$1(this, continuationImpl);
        SlothInitialUrlProvider$requireUserMenuUrl$1 slothInitialUrlProvider$requireUserMenuUrl$122 = slothInitialUrlProvider$requireUserMenuUrl$1;
        Object obj2 = slothInitialUrlProvider$requireUserMenuUrl$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = slothInitialUrlProvider$requireUserMenuUrl$122.label;
        if (i != 0) {
        }
        a = Result.a(d);
        if (a != null) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:(1:(1:(3:13|14|15)(2:17|18))(6:19|20|21|22|23|(1:31)(3:25|(1:27)|28)))(5:33|34|35|36|(3:38|23|(0)(0))(3:39|(5:41|21|22|23|(0)(0))|30)))(3:50|51|52))(4:69|70|71|(2:73|30))|53|(2:54|(2:56|(2:58|59)(1:66))(2:67|68))|(3:61|(3:63|36|(0)(0))|30)(2:64|65)))|86|6|7|(0)(0)|53|(3:54|(0)(0)|66)|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01ae, code lost:
    
        if (r12.c(r13, r0) == r1) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x004d, code lost:
    
        r12 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x004e, code lost:
    
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0049, code lost:
    
        r12 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x004a, code lost:
    
        r5 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0124 A[Catch: all -> 0x0066, TimeoutCancellationException -> 0x006a, CancellationException -> 0x0169, TRY_LEAVE, TryCatch #4 {CancellationException -> 0x0169, blocks: (B:20:0x0044, B:21:0x0146, B:35:0x0061, B:36:0x0109, B:39:0x0124, B:51:0x007a, B:53:0x00b1, B:54:0x00ca, B:56:0x00d0, B:61:0x00f3, B:64:0x0159, B:65:0x0160, B:71:0x008b), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d0 A[Catch: all -> 0x00ec, TimeoutCancellationException -> 0x00ee, CancellationException -> 0x0169, TryCatch #4 {CancellationException -> 0x0169, blocks: (B:20:0x0044, B:21:0x0146, B:35:0x0061, B:36:0x0109, B:39:0x0124, B:51:0x007a, B:53:0x00b1, B:54:0x00ca, B:56:0x00d0, B:61:0x00f3, B:64:0x0159, B:65:0x0160, B:71:0x008b), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f3 A[Catch: all -> 0x00ec, TimeoutCancellationException -> 0x00ee, CancellationException -> 0x0169, TRY_LEAVE, TryCatch #4 {CancellationException -> 0x0169, blocks: (B:20:0x0044, B:21:0x0146, B:35:0x0061, B:36:0x0109, B:39:0x0124, B:51:0x007a, B:53:0x00b1, B:54:0x00ca, B:56:0x00d0, B:61:0x00f3, B:64:0x0159, B:65:0x0160, B:71:0x008b), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0159 A[Catch: all -> 0x00ec, TimeoutCancellationException -> 0x00ee, CancellationException -> 0x0169, TRY_ENTER, TryCatch #4 {CancellationException -> 0x0169, blocks: (B:20:0x0044, B:21:0x0146, B:35:0x0061, B:36:0x0109, B:39:0x0124, B:51:0x007a, B:53:0x00b1, B:54:0x00ca, B:56:0x00d0, B:61:0x00f3, B:64:0x0159, B:65:0x0160, B:71:0x008b), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r12v22, types: [android.net.Uri$Builder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(y yVar, ContinuationImpl continuationImpl) {
        SlothInitialUrlProvider$switchMasterUrlBuilder$1 slothInitialUrlProvider$switchMasterUrlBuilder$1;
        ?? r2;
        c cVar;
        Object failure;
        y yVar2;
        Object obj;
        Throwable a;
        String d;
        Object a2;
        Iterator it;
        String str;
        Uid uid;
        String str2;
        ?? appendQueryParameter;
        Uri.Builder builder;
        try {
            if (continuationImpl instanceof SlothInitialUrlProvider$switchMasterUrlBuilder$1) {
                slothInitialUrlProvider$switchMasterUrlBuilder$1 = (SlothInitialUrlProvider$switchMasterUrlBuilder$1) continuationImpl;
                int i = slothInitialUrlProvider$switchMasterUrlBuilder$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    slothInitialUrlProvider$switchMasterUrlBuilder$1.label = i - Integer.MIN_VALUE;
                    Object obj2 = slothInitialUrlProvider$switchMasterUrlBuilder$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    r2 = slothInitialUrlProvider$switchMasterUrlBuilder$1.label;
                    if (r2 != 0) {
                        kotlin.b.b(obj2);
                        try {
                            d = this.e.d(this.a.getEnvironment(), yVar.c);
                            com.yandex.passport.internal.sloth.d dVar = this.h;
                            Uid uid2 = yVar.a;
                            String g = com.yandex.passport.common.url.b.g(d);
                            slothInitialUrlProvider$switchMasterUrlBuilder$1.L$0 = this;
                            slothInitialUrlProvider$switchMasterUrlBuilder$1.L$1 = yVar;
                            slothInitialUrlProvider$switchMasterUrlBuilder$1.L$2 = d;
                            slothInitialUrlProvider$switchMasterUrlBuilder$1.label = 1;
                            a2 = dVar.a(uid2, g, slothInitialUrlProvider$switchMasterUrlBuilder$1);
                        } catch (TimeoutCancellationException e) {
                            cVar = this;
                            e = e;
                            failure = new Result.Failure(e);
                            yVar2 = yVar;
                            obj = failure;
                            a = Result.a(obj);
                            if (a == null) {
                            }
                        } catch (Throwable th) {
                            cVar = this;
                            th = th;
                            failure = new Result.Failure(th);
                            yVar2 = yVar;
                            obj = failure;
                            a = Result.a(obj);
                            if (a == null) {
                            }
                        }
                        if (a2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else if (r2 == 1) {
                        String str3 = (String) slothInitialUrlProvider$switchMasterUrlBuilder$1.L$2;
                        yVar = (y) slothInitialUrlProvider$switchMasterUrlBuilder$1.L$1;
                        c cVar2 = (c) slothInitialUrlProvider$switchMasterUrlBuilder$1.L$0;
                        kotlin.b.b(obj2);
                        Object value = ((Result) obj2).getValue();
                        d = str3;
                        this = cVar2;
                        a2 = value;
                    } else if (r2 == 2) {
                        str2 = (String) slothInitialUrlProvider$switchMasterUrlBuilder$1.L$3;
                        uid = (Uid) slothInitialUrlProvider$switchMasterUrlBuilder$1.L$2;
                        yVar2 = (y) slothInitialUrlProvider$switchMasterUrlBuilder$1.L$1;
                        cVar = (c) slothInitialUrlProvider$switchMasterUrlBuilder$1.L$0;
                        try {
                            kotlin.b.b(obj2);
                            appendQueryParameter = ((Uri.Builder) obj2).appendQueryParameter("uid", String.valueOf(uid.getValue())).appendQueryParameter("yu", str2);
                        } catch (TimeoutCancellationException e2) {
                            e = e2;
                            yVar = yVar2;
                            failure = new Result.Failure(e);
                            yVar2 = yVar;
                            obj = failure;
                            a = Result.a(obj);
                            if (a == null) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            yVar = yVar2;
                            failure = new Result.Failure(th);
                            yVar2 = yVar;
                            obj = failure;
                            a = Result.a(obj);
                            if (a == null) {
                            }
                        }
                        if (!yVar2.w) {
                            String b = cVar.e.b(cVar.a.getEnvironment(), yVar2.c);
                            slothInitialUrlProvider$switchMasterUrlBuilder$1.L$0 = cVar;
                            slothInitialUrlProvider$switchMasterUrlBuilder$1.L$1 = yVar2;
                            slothInitialUrlProvider$switchMasterUrlBuilder$1.L$2 = appendQueryParameter;
                            slothInitialUrlProvider$switchMasterUrlBuilder$1.L$3 = null;
                            slothInitialUrlProvider$switchMasterUrlBuilder$1.label = 3;
                            obj2 = cVar.e(b, slothInitialUrlProvider$switchMasterUrlBuilder$1);
                            if (obj2 != coroutineSingletons) {
                                yVar = yVar2;
                                r2 = cVar;
                                builder = appendQueryParameter;
                                cVar = r2;
                                yVar2 = yVar;
                                obj = ((Uri.Builder) obj2).appendQueryParameter("retpath", builder.build().toString());
                                a = Result.a(obj);
                                if (a == null) {
                                }
                            }
                            return coroutineSingletons;
                        }
                        obj = appendQueryParameter;
                        a = Result.a(obj);
                        if (a == null) {
                        }
                    } else {
                        if (r2 != 3) {
                            if (r2 == 4) {
                                kotlin.b.b(obj2);
                                return new Uri.Builder();
                            }
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Uri.Builder builder2 = (Uri.Builder) slothInitialUrlProvider$switchMasterUrlBuilder$1.L$2;
                        yVar = (y) slothInitialUrlProvider$switchMasterUrlBuilder$1.L$1;
                        c cVar3 = (c) slothInitialUrlProvider$switchMasterUrlBuilder$1.L$0;
                        kotlin.b.b(obj2);
                        r2 = cVar3;
                        builder = builder2;
                        cVar = r2;
                        yVar2 = yVar;
                        obj = ((Uri.Builder) obj2).appendQueryParameter("retpath", builder.build().toString());
                        a = Result.a(obj);
                        if (a == null) {
                            return obj;
                        }
                        com.yandex.passport.common.logger.c cVar4 = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(LogLevel.ERROR, null, "A problem occured in switchMasterUrlBuilder: " + a, 8);
                        }
                        v vVar = cVar.f;
                        c0 c0Var = new c0(yVar2.b);
                        slothInitialUrlProvider$switchMasterUrlBuilder$1.L$0 = null;
                        slothInitialUrlProvider$switchMasterUrlBuilder$1.L$1 = null;
                        slothInitialUrlProvider$switchMasterUrlBuilder$1.L$2 = null;
                        slothInitialUrlProvider$switchMasterUrlBuilder$1.L$3 = null;
                        slothInitialUrlProvider$switchMasterUrlBuilder$1.label = 4;
                    }
                    kotlin.b.b(a2);
                    com.yandex.passport.sloth.dependencies.a aVar = (com.yandex.passport.sloth.dependencies.a) a2;
                    com.yandex.passport.sloth.e eVar = this.j;
                    List list = aVar.a;
                    eVar.getClass();
                    com.yandex.passport.sloth.e.a(d, list);
                    Uid uid3 = yVar.b;
                    it = aVar.a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            str = null;
                            break;
                        }
                        String str4 = (String) it.next();
                        this.j.getClass();
                        str = com.yandex.passport.sloth.e.b(str4, "yandexuid");
                        if (str != null) {
                            break;
                        }
                    }
                    if (str != null) {
                        throw new IllegalStateException("No yandexuid cookie found in provided cookies.");
                    }
                    slothInitialUrlProvider$switchMasterUrlBuilder$1.L$0 = this;
                    slothInitialUrlProvider$switchMasterUrlBuilder$1.L$1 = yVar;
                    slothInitialUrlProvider$switchMasterUrlBuilder$1.L$2 = uid3;
                    slothInitialUrlProvider$switchMasterUrlBuilder$1.L$3 = str;
                    slothInitialUrlProvider$switchMasterUrlBuilder$1.label = 2;
                    obj2 = this.e(d, slothInitialUrlProvider$switchMasterUrlBuilder$1);
                    if (obj2 != coroutineSingletons) {
                        cVar = this;
                        yVar2 = yVar;
                        uid = uid3;
                        str2 = str;
                        appendQueryParameter = ((Uri.Builder) obj2).appendQueryParameter("uid", String.valueOf(uid.getValue())).appendQueryParameter("yu", str2);
                        if (!yVar2.w) {
                        }
                    }
                    return coroutineSingletons;
                }
            }
            if (r2 != 0) {
            }
            kotlin.b.b(a2);
            com.yandex.passport.sloth.dependencies.a aVar2 = (com.yandex.passport.sloth.dependencies.a) a2;
            com.yandex.passport.sloth.e eVar2 = this.j;
            List list2 = aVar2.a;
            eVar2.getClass();
            com.yandex.passport.sloth.e.a(d, list2);
            Uid uid32 = yVar.b;
            it = aVar2.a.iterator();
            while (true) {
                if (it.hasNext()) {
                }
            }
            if (str != null) {
            }
        } catch (CancellationException e3) {
            throw e3;
        }
        slothInitialUrlProvider$switchMasterUrlBuilder$1 = new SlothInitialUrlProvider$switchMasterUrlBuilder$1(this, continuationImpl);
        Object obj22 = slothInitialUrlProvider$switchMasterUrlBuilder$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        r2 = slothInitialUrlProvider$switchMasterUrlBuilder$1.label;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0209, code lost:
    
        if (r1 != r7) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x015a, code lost:
    
        if (r9 == r7) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0178, code lost:
    
        if (r9 == r7) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0221, code lost:
    
        if (r9 == r7) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x023d, code lost:
    
        if (r9 == r7) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x02fa, code lost:
    
        if (r9 == r7) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x03ed, code lost:
    
        if (r1 == r7) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0408, code lost:
    
        if (r9 == r7) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0420, code lost:
    
        if (r9 == r7) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0448, code lost:
    
        if (r9 == r7) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0460, code lost:
    
        if (r9 == r7) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x03ba, code lost:
    
        if (r1 != r7) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x035a, code lost:
    
        if (r1 != r7) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02e3, code lost:
    
        if (r1 != r7) goto L133;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r9v34, types: [java.lang.Object, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r9v38 */
    /* JADX WARN: Type inference failed for: r9v45, types: [java.lang.Object, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r9v49 */
    /* JADX WARN: Type inference failed for: r9v53, types: [java.lang.Object, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r9v57 */
    /* JADX WARN: Type inference failed for: r9v58, types: [java.lang.Object, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r9v62 */
    /* JADX WARN: Type inference failed for: r9v75 */
    /* JADX WARN: Type inference failed for: r9v76 */
    /* JADX WARN: Type inference failed for: r9v77 */
    /* JADX WARN: Type inference failed for: r9v78 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y(Uri uri, com.yandex.passport.sloth.data.c0 c0Var, ContinuationImpl continuationImpl) {
        SlothInitialUrlProvider$transform$1 slothInitialUrlProvider$transform$1;
        SlothInitialUrlProvider$transform$1 slothInitialUrlProvider$transform$12;
        c cVar;
        Object u;
        Object u2;
        Object v;
        Object f;
        Object f2;
        Uid uid;
        Uri uri2;
        c cVar2;
        Object e;
        Uid uid2;
        Uri uri3;
        c cVar3;
        Object w;
        Object failure;
        Object obj;
        Uri uri4;
        Uid uid3;
        c cVar4;
        Object f3;
        Object u3;
        Object failure2;
        Object obj2;
        Uri uri5;
        Uid uid4;
        c cVar5;
        Object f4;
        Object f5;
        ?? r9;
        String str;
        ?? r92;
        String str2;
        ?? r93;
        String str3;
        ?? r94;
        String str4;
        if (continuationImpl instanceof SlothInitialUrlProvider$transform$1) {
            slothInitialUrlProvider$transform$1 = (SlothInitialUrlProvider$transform$1) continuationImpl;
            int i = slothInitialUrlProvider$transform$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                slothInitialUrlProvider$transform$1.label = i - Integer.MIN_VALUE;
                slothInitialUrlProvider$transform$12 = slothInitialUrlProvider$transform$1;
                Object obj3 = slothInitialUrlProvider$transform$12.result;
                Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                Object obj5 = null;
                switch (slothInitialUrlProvider$transform$12.label) {
                    case 0:
                        kotlin.b.b(obj3);
                        boolean z = c0Var instanceof com.yandex.passport.sloth.data.j;
                        com.yandex.passport.sloth.dependencies.d dVar = this.k;
                        if (z) {
                            Uid uid5 = ((com.yandex.passport.sloth.data.j) c0Var).b;
                            boolean z2 = dVar.b;
                            FrontendUrlType frontendUrlType = FrontendUrlType.PASSPORT;
                            slothInitialUrlProvider$transform$12.label = 1;
                            f5 = f(uri, uid5, z2, frontendUrlType, slothInitialUrlProvider$transform$12);
                            break;
                        } else {
                            cVar = this;
                            Object obj6 = null;
                            if (c0Var instanceof s) {
                                Uid uid6 = ((s) c0Var).a;
                                boolean z3 = dVar.c;
                                FrontendUrlType frontendUrlType2 = FrontendUrlType.PASSPORT;
                                slothInitialUrlProvider$transform$12.label = 2;
                                f4 = cVar.f(uri, uid6, z3, frontendUrlType2, slothInitialUrlProvider$transform$12);
                                break;
                            } else {
                                boolean z4 = c0Var instanceof com.yandex.passport.sloth.data.k;
                                com.yandex.passport.sloth.dependencies.h hVar = cVar.b;
                                if (z4) {
                                    Uid uid7 = ((com.yandex.passport.sloth.data.k) c0Var).b;
                                    com.yandex.passport.common.url.b.Companion.getClass();
                                    String uri6 = uri.toString();
                                    slothInitialUrlProvider$transform$12.L$0 = cVar;
                                    slothInitialUrlProvider$transform$12.L$1 = uri;
                                    slothInitialUrlProvider$transform$12.L$2 = c0Var;
                                    slothInitialUrlProvider$transform$12.L$3 = cVar;
                                    slothInitialUrlProvider$transform$12.L$4 = uid7;
                                    slothInitialUrlProvider$transform$12.label = 3;
                                    com.yandex.passport.internal.sloth.o oVar = (com.yandex.passport.internal.sloth.o) hVar;
                                    oVar.getClass();
                                    try {
                                        failure2 = new com.yandex.passport.common.url.b(oVar.g.b(uid7.getValue(), uri6).toString());
                                    } catch (TimeoutCancellationException e2) {
                                        failure2 = new Result.Failure(e2);
                                    } catch (CancellationException e3) {
                                        throw e3;
                                    } catch (Throwable th) {
                                        failure2 = new Result.Failure(th);
                                    }
                                    obj2 = failure2;
                                    if (obj2 != obj4) {
                                        uri5 = uri;
                                        uid4 = uid7;
                                        cVar5 = cVar;
                                        r9 = obj6;
                                        if (obj2 instanceof Result.Failure) {
                                            obj2 = r9;
                                        }
                                        com.yandex.passport.common.url.b bVar = (com.yandex.passport.common.url.b) obj2;
                                        str = bVar == null ? bVar.a : r9;
                                        if (str == null) {
                                            com.yandex.passport.common.url.b.Companion.getClass();
                                            str = uri5.toString();
                                        }
                                        boolean z5 = cVar5.k.d;
                                        SlothInitialUrlProvider$transform$2 slothInitialUrlProvider$transform$2 = new SlothInitialUrlProvider$transform$2(uri5, c0Var, cVar5, r9);
                                        slothInitialUrlProvider$transform$12.L$0 = r9;
                                        slothInitialUrlProvider$transform$12.L$1 = r9;
                                        slothInitialUrlProvider$transform$12.L$2 = r9;
                                        slothInitialUrlProvider$transform$12.L$3 = r9;
                                        slothInitialUrlProvider$transform$12.L$4 = r9;
                                        slothInitialUrlProvider$transform$12.label = 4;
                                        obj5 = cVar.m(uid4, str, z5, slothInitialUrlProvider$transform$2, slothInitialUrlProvider$transform$12);
                                        break;
                                    }
                                } else if (c0Var instanceof com.yandex.passport.sloth.data.l) {
                                    Uid uid8 = ((com.yandex.passport.sloth.data.l) c0Var).b;
                                    FrontendUrlType frontendUrlType3 = FrontendUrlType.PASSPORT;
                                    slothInitialUrlProvider$transform$12.label = 5;
                                    u3 = cVar.u(uri, uid8, frontendUrlType3, slothInitialUrlProvider$transform$12);
                                    break;
                                } else if (c0Var instanceof com.yandex.passport.sloth.data.m) {
                                    Uid uid9 = ((com.yandex.passport.sloth.data.m) c0Var).a;
                                    if (uid9 == null) {
                                        com.yandex.passport.common.url.b.Companion.getClass();
                                        return uri.toString();
                                    }
                                    boolean z6 = dVar.e;
                                    FrontendUrlType frontendUrlType4 = FrontendUrlType.PASSPORT;
                                    slothInitialUrlProvider$transform$12.label = 6;
                                    f3 = cVar.f(uri, uid9, z6, frontendUrlType4, slothInitialUrlProvider$transform$12);
                                    break;
                                } else if (c0Var instanceof b0) {
                                    Uid uid10 = ((b0) c0Var).b;
                                    com.yandex.passport.common.url.b.Companion.getClass();
                                    String uri7 = uri.toString();
                                    slothInitialUrlProvider$transform$12.L$0 = cVar;
                                    slothInitialUrlProvider$transform$12.L$1 = uri;
                                    slothInitialUrlProvider$transform$12.L$2 = c0Var;
                                    slothInitialUrlProvider$transform$12.L$3 = cVar;
                                    slothInitialUrlProvider$transform$12.L$4 = uid10;
                                    slothInitialUrlProvider$transform$12.label = 7;
                                    com.yandex.passport.internal.sloth.o oVar2 = (com.yandex.passport.internal.sloth.o) hVar;
                                    oVar2.getClass();
                                    try {
                                        failure = new com.yandex.passport.common.url.b(com.yandex.passport.common.url.b.k(oVar2.g.a(uid10.getValue(), Uri.parse(uri7).toString()).toString()));
                                    } catch (TimeoutCancellationException e4) {
                                        failure = new Result.Failure(e4);
                                    } catch (CancellationException e5) {
                                        throw e5;
                                    } catch (Throwable th2) {
                                        failure = new Result.Failure(th2);
                                    }
                                    obj = failure;
                                    if (obj != obj4) {
                                        uri4 = uri;
                                        uid3 = uid10;
                                        cVar4 = cVar;
                                        r92 = obj6;
                                        if (obj instanceof Result.Failure) {
                                            obj = r92;
                                        }
                                        com.yandex.passport.common.url.b bVar2 = (com.yandex.passport.common.url.b) obj;
                                        str2 = bVar2 == null ? bVar2.a : r92;
                                        if (str2 == null) {
                                            com.yandex.passport.common.url.b.Companion.getClass();
                                            str2 = uri4.toString();
                                        }
                                        boolean z7 = cVar4.k.f;
                                        SlothInitialUrlProvider$transform$4 slothInitialUrlProvider$transform$4 = new SlothInitialUrlProvider$transform$4(uri4, c0Var, cVar4, r92);
                                        slothInitialUrlProvider$transform$12.L$0 = r92;
                                        slothInitialUrlProvider$transform$12.L$1 = r92;
                                        slothInitialUrlProvider$transform$12.L$2 = r92;
                                        slothInitialUrlProvider$transform$12.L$3 = r92;
                                        slothInitialUrlProvider$transform$12.L$4 = r92;
                                        slothInitialUrlProvider$transform$12.label = 8;
                                        obj5 = cVar.m(uid3, str2, z7, slothInitialUrlProvider$transform$4, slothInitialUrlProvider$transform$12);
                                        break;
                                    }
                                } else if (c0Var instanceof com.yandex.passport.sloth.data.a0) {
                                    Uid uid11 = ((com.yandex.passport.sloth.data.a0) c0Var).c;
                                    slothInitialUrlProvider$transform$12.label = 9;
                                    w = cVar.w(uri, uid11, slothInitialUrlProvider$transform$12);
                                    break;
                                } else if (c0Var instanceof u) {
                                    u uVar = (u) c0Var;
                                    Uid uid12 = uVar.w;
                                    slothInitialUrlProvider$transform$12.L$0 = cVar;
                                    slothInitialUrlProvider$transform$12.L$1 = uri;
                                    slothInitialUrlProvider$transform$12.L$2 = c0Var;
                                    slothInitialUrlProvider$transform$12.L$3 = cVar;
                                    slothInitialUrlProvider$transform$12.L$4 = uid12;
                                    slothInitialUrlProvider$transform$12.label = 10;
                                    e = ((com.yandex.passport.internal.sloth.o) hVar).e(uVar, slothInitialUrlProvider$transform$12);
                                    if (e != obj4) {
                                        uid2 = uid12;
                                        uri3 = uri;
                                        cVar3 = cVar;
                                        r93 = obj6;
                                        if (e instanceof Result.Failure) {
                                            e = r93;
                                        }
                                        com.yandex.passport.common.url.b bVar3 = (com.yandex.passport.common.url.b) e;
                                        str3 = bVar3 == null ? bVar3.a : r93;
                                        if (str3 == null) {
                                            com.yandex.passport.common.url.b.Companion.getClass();
                                            str3 = uri3.toString();
                                        }
                                        boolean z8 = cVar3.k.f;
                                        SlothInitialUrlProvider$transform$5 slothInitialUrlProvider$transform$5 = new SlothInitialUrlProvider$transform$5(uri3, c0Var, cVar3, r93);
                                        slothInitialUrlProvider$transform$12.L$0 = r93;
                                        slothInitialUrlProvider$transform$12.L$1 = r93;
                                        slothInitialUrlProvider$transform$12.L$2 = r93;
                                        slothInitialUrlProvider$transform$12.L$3 = r93;
                                        slothInitialUrlProvider$transform$12.L$4 = r93;
                                        slothInitialUrlProvider$transform$12.label = 11;
                                        obj5 = cVar.m(uid2, str3, z8, slothInitialUrlProvider$transform$5, slothInitialUrlProvider$transform$12);
                                        break;
                                    }
                                } else if (c0Var instanceof com.yandex.passport.sloth.data.n) {
                                    com.yandex.passport.sloth.data.n nVar = (com.yandex.passport.sloth.data.n) c0Var;
                                    Uid uid13 = nVar.x;
                                    slothInitialUrlProvider$transform$12.L$0 = cVar;
                                    slothInitialUrlProvider$transform$12.L$1 = uri;
                                    slothInitialUrlProvider$transform$12.L$2 = c0Var;
                                    slothInitialUrlProvider$transform$12.L$3 = cVar;
                                    slothInitialUrlProvider$transform$12.L$4 = uid13;
                                    slothInitialUrlProvider$transform$12.label = 12;
                                    f2 = ((com.yandex.passport.internal.sloth.o) hVar).f(nVar, slothInitialUrlProvider$transform$12);
                                    if (f2 != obj4) {
                                        uid = uid13;
                                        uri2 = uri;
                                        cVar2 = cVar;
                                        r94 = obj6;
                                        if (f2 instanceof Result.Failure) {
                                            f2 = r94;
                                        }
                                        com.yandex.passport.common.url.b bVar4 = (com.yandex.passport.common.url.b) f2;
                                        str4 = bVar4 == null ? bVar4.a : r94;
                                        if (str4 == null) {
                                            com.yandex.passport.common.url.b.Companion.getClass();
                                            str4 = uri2.toString();
                                        }
                                        boolean z9 = cVar2.k.g;
                                        SlothInitialUrlProvider$transform$6 slothInitialUrlProvider$transform$6 = new SlothInitialUrlProvider$transform$6(cVar2, c0Var, r94);
                                        slothInitialUrlProvider$transform$12.L$0 = r94;
                                        slothInitialUrlProvider$transform$12.L$1 = r94;
                                        slothInitialUrlProvider$transform$12.L$2 = r94;
                                        slothInitialUrlProvider$transform$12.L$3 = r94;
                                        slothInitialUrlProvider$transform$12.L$4 = r94;
                                        slothInitialUrlProvider$transform$12.label = 13;
                                        obj5 = cVar.m(uid, str4, z9, slothInitialUrlProvider$transform$6, slothInitialUrlProvider$transform$12);
                                        break;
                                    }
                                } else {
                                    if ((c0Var instanceof com.yandex.passport.sloth.data.g) || (c0Var instanceof com.yandex.passport.sloth.data.o)) {
                                        com.yandex.passport.common.url.b.Companion.getClass();
                                        return uri.toString();
                                    }
                                    if (c0Var instanceof com.yandex.passport.sloth.data.i) {
                                        Uid uid14 = ((com.yandex.passport.sloth.data.i) c0Var).a;
                                        com.yandex.passport.common.url.b.Companion.getClass();
                                        String uri8 = uri.toString();
                                        boolean z10 = dVar.i;
                                        SlothInitialUrlProvider$transform$7 slothInitialUrlProvider$transform$7 = new SlothInitialUrlProvider$transform$7(uri, c0Var, cVar, null);
                                        slothInitialUrlProvider$transform$12.label = 14;
                                        obj5 = cVar.m(uid14, uri8, z10, slothInitialUrlProvider$transform$7, slothInitialUrlProvider$transform$12);
                                        break;
                                    } else if (c0Var instanceof r) {
                                        Uid uid15 = ((r) c0Var).b;
                                        boolean z11 = dVar.h;
                                        FrontendUrlType frontendUrlType5 = FrontendUrlType.PASSPORT;
                                        slothInitialUrlProvider$transform$12.label = 15;
                                        f = cVar.f(uri, uid15, z11, frontendUrlType5, slothInitialUrlProvider$transform$12);
                                        break;
                                    } else if (c0Var instanceof q) {
                                        Uid uid16 = ((q) c0Var).a;
                                        FrontendUrlType frontendUrlType6 = FrontendUrlType.ID;
                                        slothInitialUrlProvider$transform$12.label = 16;
                                        v = cVar.v(uri, uid16, frontendUrlType6, slothInitialUrlProvider$transform$12);
                                        break;
                                    } else {
                                        if (c0Var instanceof y) {
                                            com.yandex.passport.common.url.b.Companion.getClass();
                                            return uri.toString();
                                        }
                                        if (c0Var instanceof SlothVariant$BiometricVerification) {
                                            Uid uid17 = ((SlothVariant$BiometricVerification) c0Var).getUid();
                                            FrontendUrlType frontendUrlType7 = FrontendUrlType.ID;
                                            slothInitialUrlProvider$transform$12.label = 17;
                                            u2 = cVar.u(uri, uid17, frontendUrlType7, slothInitialUrlProvider$transform$12);
                                            break;
                                        } else {
                                            if (!(c0Var instanceof com.yandex.passport.sloth.data.v)) {
                                                w511.b();
                                                return null;
                                            }
                                            Uid uid18 = ((com.yandex.passport.sloth.data.v) c0Var).a;
                                            FrontendUrlType frontendUrlType8 = FrontendUrlType.PASSPORT;
                                            slothInitialUrlProvider$transform$12.label = 18;
                                            u = cVar.u(uri, uid18, frontendUrlType8, slothInitialUrlProvider$transform$12);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        return obj4;
                    case 1:
                        kotlin.b.b(obj3);
                        f5 = ((com.yandex.passport.common.url.b) obj3).a;
                        return (String) f5;
                    case 2:
                        kotlin.b.b(obj3);
                        f4 = ((com.yandex.passport.common.url.b) obj3).a;
                        return (String) f4;
                    case 3:
                        Uid uid19 = (Uid) slothInitialUrlProvider$transform$12.L$4;
                        c cVar6 = (c) slothInitialUrlProvider$transform$12.L$3;
                        c0Var = (com.yandex.passport.sloth.data.c0) slothInitialUrlProvider$transform$12.L$2;
                        uri5 = (Uri) slothInitialUrlProvider$transform$12.L$1;
                        c cVar7 = (c) slothInitialUrlProvider$transform$12.L$0;
                        kotlin.b.b(obj3);
                        obj2 = ((Result) obj3).getValue();
                        uid4 = uid19;
                        r9 = 0;
                        cVar = cVar6;
                        cVar5 = cVar7;
                        if (obj2 instanceof Result.Failure) {
                        }
                        com.yandex.passport.common.url.b bVar5 = (com.yandex.passport.common.url.b) obj2;
                        if (bVar5 == null) {
                        }
                        if (str == null) {
                        }
                        boolean z52 = cVar5.k.d;
                        SlothInitialUrlProvider$transform$2 slothInitialUrlProvider$transform$22 = new SlothInitialUrlProvider$transform$2(uri5, c0Var, cVar5, r9);
                        slothInitialUrlProvider$transform$12.L$0 = r9;
                        slothInitialUrlProvider$transform$12.L$1 = r9;
                        slothInitialUrlProvider$transform$12.L$2 = r9;
                        slothInitialUrlProvider$transform$12.L$3 = r9;
                        slothInitialUrlProvider$transform$12.L$4 = r9;
                        slothInitialUrlProvider$transform$12.label = 4;
                        obj5 = cVar.m(uid4, str, z52, slothInitialUrlProvider$transform$22, slothInitialUrlProvider$transform$12);
                        break;
                    case 4:
                        kotlin.b.b(obj3);
                        com.yandex.passport.common.url.b bVar6 = (com.yandex.passport.common.url.b) obj3;
                        if (bVar6 != null) {
                            obj5 = bVar6.a;
                        }
                        return (String) obj5;
                    case 5:
                        kotlin.b.b(obj3);
                        u3 = ((com.yandex.passport.common.url.b) obj3).a;
                        return (String) u3;
                    case 6:
                        kotlin.b.b(obj3);
                        f3 = ((com.yandex.passport.common.url.b) obj3).a;
                        return (String) f3;
                    case 7:
                        Uid uid20 = (Uid) slothInitialUrlProvider$transform$12.L$4;
                        c cVar8 = (c) slothInitialUrlProvider$transform$12.L$3;
                        c0Var = (com.yandex.passport.sloth.data.c0) slothInitialUrlProvider$transform$12.L$2;
                        uri4 = (Uri) slothInitialUrlProvider$transform$12.L$1;
                        c cVar9 = (c) slothInitialUrlProvider$transform$12.L$0;
                        kotlin.b.b(obj3);
                        obj = ((Result) obj3).getValue();
                        uid3 = uid20;
                        r92 = 0;
                        cVar = cVar8;
                        cVar4 = cVar9;
                        if (obj instanceof Result.Failure) {
                        }
                        com.yandex.passport.common.url.b bVar22 = (com.yandex.passport.common.url.b) obj;
                        if (bVar22 == null) {
                        }
                        if (str2 == null) {
                        }
                        boolean z72 = cVar4.k.f;
                        SlothInitialUrlProvider$transform$4 slothInitialUrlProvider$transform$42 = new SlothInitialUrlProvider$transform$4(uri4, c0Var, cVar4, r92);
                        slothInitialUrlProvider$transform$12.L$0 = r92;
                        slothInitialUrlProvider$transform$12.L$1 = r92;
                        slothInitialUrlProvider$transform$12.L$2 = r92;
                        slothInitialUrlProvider$transform$12.L$3 = r92;
                        slothInitialUrlProvider$transform$12.L$4 = r92;
                        slothInitialUrlProvider$transform$12.label = 8;
                        obj5 = cVar.m(uid3, str2, z72, slothInitialUrlProvider$transform$42, slothInitialUrlProvider$transform$12);
                        break;
                    case 8:
                        kotlin.b.b(obj3);
                        com.yandex.passport.common.url.b bVar7 = (com.yandex.passport.common.url.b) obj3;
                        if (bVar7 != null) {
                            obj5 = bVar7.a;
                        }
                        return (String) obj5;
                    case 9:
                        kotlin.b.b(obj3);
                        w = ((com.yandex.passport.common.url.b) obj3).a;
                        return (String) w;
                    case 10:
                        Uid uid21 = (Uid) slothInitialUrlProvider$transform$12.L$4;
                        c cVar10 = (c) slothInitialUrlProvider$transform$12.L$3;
                        c0Var = (com.yandex.passport.sloth.data.c0) slothInitialUrlProvider$transform$12.L$2;
                        uri3 = (Uri) slothInitialUrlProvider$transform$12.L$1;
                        c cVar11 = (c) slothInitialUrlProvider$transform$12.L$0;
                        kotlin.b.b(obj3);
                        e = ((Result) obj3).getValue();
                        uid2 = uid21;
                        r93 = 0;
                        cVar = cVar10;
                        cVar3 = cVar11;
                        if (e instanceof Result.Failure) {
                        }
                        com.yandex.passport.common.url.b bVar32 = (com.yandex.passport.common.url.b) e;
                        if (bVar32 == null) {
                        }
                        if (str3 == null) {
                        }
                        boolean z82 = cVar3.k.f;
                        SlothInitialUrlProvider$transform$5 slothInitialUrlProvider$transform$52 = new SlothInitialUrlProvider$transform$5(uri3, c0Var, cVar3, r93);
                        slothInitialUrlProvider$transform$12.L$0 = r93;
                        slothInitialUrlProvider$transform$12.L$1 = r93;
                        slothInitialUrlProvider$transform$12.L$2 = r93;
                        slothInitialUrlProvider$transform$12.L$3 = r93;
                        slothInitialUrlProvider$transform$12.L$4 = r93;
                        slothInitialUrlProvider$transform$12.label = 11;
                        obj5 = cVar.m(uid2, str3, z82, slothInitialUrlProvider$transform$52, slothInitialUrlProvider$transform$12);
                        break;
                    case 11:
                        kotlin.b.b(obj3);
                        com.yandex.passport.common.url.b bVar8 = (com.yandex.passport.common.url.b) obj3;
                        if (bVar8 != null) {
                            obj5 = bVar8.a;
                        }
                        return (String) obj5;
                    case 12:
                        Uid uid22 = (Uid) slothInitialUrlProvider$transform$12.L$4;
                        c cVar12 = (c) slothInitialUrlProvider$transform$12.L$3;
                        c0Var = (com.yandex.passport.sloth.data.c0) slothInitialUrlProvider$transform$12.L$2;
                        uri2 = (Uri) slothInitialUrlProvider$transform$12.L$1;
                        c cVar13 = (c) slothInitialUrlProvider$transform$12.L$0;
                        kotlin.b.b(obj3);
                        f2 = ((Result) obj3).getValue();
                        uid = uid22;
                        r94 = 0;
                        cVar = cVar12;
                        cVar2 = cVar13;
                        if (f2 instanceof Result.Failure) {
                        }
                        com.yandex.passport.common.url.b bVar42 = (com.yandex.passport.common.url.b) f2;
                        if (bVar42 == null) {
                        }
                        if (str4 == null) {
                        }
                        boolean z92 = cVar2.k.g;
                        SlothInitialUrlProvider$transform$6 slothInitialUrlProvider$transform$62 = new SlothInitialUrlProvider$transform$6(cVar2, c0Var, r94);
                        slothInitialUrlProvider$transform$12.L$0 = r94;
                        slothInitialUrlProvider$transform$12.L$1 = r94;
                        slothInitialUrlProvider$transform$12.L$2 = r94;
                        slothInitialUrlProvider$transform$12.L$3 = r94;
                        slothInitialUrlProvider$transform$12.L$4 = r94;
                        slothInitialUrlProvider$transform$12.label = 13;
                        obj5 = cVar.m(uid, str4, z92, slothInitialUrlProvider$transform$62, slothInitialUrlProvider$transform$12);
                        break;
                    case 13:
                        kotlin.b.b(obj3);
                        com.yandex.passport.common.url.b bVar9 = (com.yandex.passport.common.url.b) obj3;
                        if (bVar9 != null) {
                            obj5 = bVar9.a;
                        }
                        return (String) obj5;
                    case 14:
                        kotlin.b.b(obj3);
                        com.yandex.passport.common.url.b bVar10 = (com.yandex.passport.common.url.b) obj3;
                        if (bVar10 != null) {
                            obj5 = bVar10.a;
                        }
                        return (String) obj5;
                    case 15:
                        kotlin.b.b(obj3);
                        f = ((com.yandex.passport.common.url.b) obj3).a;
                        return (String) f;
                    case 16:
                        kotlin.b.b(obj3);
                        v = ((com.yandex.passport.common.url.b) obj3).a;
                        return (String) v;
                    case 17:
                        kotlin.b.b(obj3);
                        u2 = ((com.yandex.passport.common.url.b) obj3).a;
                        return (String) u2;
                    case 18:
                        kotlin.b.b(obj3);
                        u = ((com.yandex.passport.common.url.b) obj3).a;
                        return (String) u;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        slothInitialUrlProvider$transform$1 = new SlothInitialUrlProvider$transform$1(this, continuationImpl);
        slothInitialUrlProvider$transform$12 = slothInitialUrlProvider$transform$1;
        Object obj32 = slothInitialUrlProvider$transform$12.result;
        Object obj42 = CoroutineSingletons.COROUTINE_SUSPENDED;
        Object obj52 = null;
        switch (slothInitialUrlProvider$transform$12.label) {
        }
    }
}
