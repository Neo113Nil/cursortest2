package xsna;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.util.ArrayMap;
import android.util.Log;
import android.util.TypedValue;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.internal.measurement.zznk;
import com.google.android.gms.tasks.Task;
import com.google.firebase.encoders.EncodingException;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.channels.api.ChannelEntryPoint;
import com.vk.channels.api.ChannelHistoryOpenMode;
import com.vk.core.fragments.FragmentImpl;
import com.vk.im.engine.models.messages.Msg;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vk.story.viewer.api.StoryViewerRouter;
import com.vkontakte.android.R;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.ok.android.commons.http.Http;
import xsna.rla;

/* compiled from: FollowingsUpdateBlockTransformer.kt */
@SuppressLint({"QueryPermissionsNeeded"})
/* loaded from: classes16.dex */
public final class m4s implements q701, xyv {
    public static final m4s b = new m4s();
    public static final jai c = new jai(1584368694, new tdi(0), false);
    public static final jai d = new jai(-1837142927, new j89(3), false);
    public static final jai e = new jai(-169542922, new j21(0, 5), false);
    public static final jai f = new jai(402377103, new j21(0, 6), false);
    public static final m4s g = new m4s();
    public static final gn30[] h = {new gn30((byte) -96, 31, true), new gn30((byte) -39, 255, false), new gn30((byte) -38, 65535, false), new gn30((byte) -37, 4294967295L, false)};
    public static final gn30[] i = {new gn30((byte) -112, 15, true), new gn30((byte) -36, 65535, false), new gn30((byte) -35, 4294967295L, false)};
    public static final gn30[] j = {new gn30(Byte.MIN_VALUE, 15, true), new gn30((byte) -34, 65535, false), new gn30((byte) -33, 4294967295L, false)};
    public static final Integer[] k;
    public static final /* synthetic */ m4s l;

    static {
        Integer valueOf = Integer.valueOf(R.color.vk_red);
        Integer valueOf2 = Integer.valueOf(R.color.vk_neon_pink);
        Integer valueOf3 = Integer.valueOf(R.color.vk_azure_A100);
        Integer valueOf4 = Integer.valueOf(R.color.vk_azure_350);
        Integer valueOf5 = Integer.valueOf(R.color.vk_gray_50);
        Integer valueOf6 = Integer.valueOf(R.color.vk_gray_700);
        Integer valueOf7 = Integer.valueOf(R.color.vk_green);
        Integer valueOf8 = Integer.valueOf(R.color.vk_lavender_300);
        Integer valueOf9 = Integer.valueOf(R.color.vk_red_light);
        Integer valueOf10 = Integer.valueOf(R.color.vk_orange);
        k = new Integer[]{valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf10, Integer.valueOf(R.color.vk_sky_300), Integer.valueOf(R.color.vk_turquoise), Integer.valueOf(R.color.vk_lavender_A700), Integer.valueOf(R.color.vk_blue_facebook), Integer.valueOf(R.color.vk_purple), Integer.valueOf(R.color.vk_yellow), Integer.valueOf(R.color.vk_white_blue32), Integer.valueOf(R.color.vk_yellow_overlight), Integer.valueOf(R.color.vk_mint_100), Integer.valueOf(R.color.vk_lavender_A100), Integer.valueOf(R.color.vk_mint_200), Integer.valueOf(R.color.vk_violet), Integer.valueOf(R.color.vk_raspberry_pink_light)};
        l = new m4s();
    }

    public static xy2 A(s101 s101Var, String str) {
        s101Var.getClass();
        ufx ufxVar = new ufx("notifications.hide", new pm0(24), new tf3(23));
        if (str != null) {
            ufx.n(ufxVar, "query", str, 0, 12);
        }
        return ufxVar;
    }

    public static final xpx B(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(872812965, 0, -1, "com.vk.donut.price.core.template.compose.provider.style.inverse.rememberInverseDonutPriceItemStyleProvider (InverseDonutPriceItemStyleProvider.kt:64)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
        }
        ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        TypedValue typedValue = krv0.a;
        boolean f2 = epx.f(krv0.i((Context) aVar.r(AndroidCompositionLocals_androidKt.b)), Boolean.TRUE);
        boolean l2 = aVar.l(false) | aVar.J(ylu0Var) | aVar.l(f2);
        Object x = aVar.x();
        if (l2 || x == a.C0011a.a) {
            x = new xpx(ylu0Var, f2);
            aVar.R(x);
        }
        xpx xpxVar = (xpx) x;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return xpxVar;
    }

    public static final khh0 C(izs izsVar, androidx.compose.runtime.a aVar, int i2) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-180460798, i2, -1, "androidx.compose.foundation.gestures.rememberScrollableState (ScrollableState.kt:169)");
        }
        wh50 c2 = androidx.compose.runtime.k.c(izsVar, aVar, i2 & 14);
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            bml bmlVar = new bml(new lhh0(0, c2));
            aVar.R(bmlVar);
            x = bmlVar;
        }
        khh0 khh0Var = (khh0) x;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return khh0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01d9 A[EDGE_INSN: B:43:0x01d9->B:40:0x01d9 BREAK  A[LOOP:0: B:2:0x0005->B:42:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static rla.b D(rla.a aVar, pi0 pi0Var, xq xqVar) throws Throwable {
        int i2;
        rla.b bVar;
        rla.b bVar2;
        URL url;
        int i3 = 5;
        rla.a aVar2 = aVar;
        do {
            int i4 = i3;
            rla rlaVar = (rla) pi0Var.c;
            URL url2 = aVar2.a;
            if (Log.isLoggable("TRuntime.".concat("CctTransportBackend"), 4)) {
                String.format("Making request to: %s", url2);
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) url2.openConnection();
            httpURLConnection.setConnectTimeout(30000);
            httpURLConnection.setReadTimeout(rlaVar.g);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.3.0 android/");
            httpURLConnection.setRequestProperty(Http.Header.CONTENT_ENCODING, Http.ContentEncoding.GZIP);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setRequestProperty("Accept-Encoding", Http.ContentEncoding.GZIP);
            String str = aVar2.c;
            if (str != null) {
                httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
            }
            try {
                OutputStream outputStream = httpURLConnection.getOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                    try {
                        u8y u8yVar = rlaVar.a;
                        rk5 rk5Var = aVar2.b;
                        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                        v8y v8yVar = (v8y) u8yVar.b;
                        i2 = i4;
                        try {
                            oby obyVar = new oby(bufferedWriter, v8yVar.a, v8yVar.b, v8yVar.c, v8yVar.d);
                            obyVar.a(rk5Var);
                            obyVar.c();
                            obyVar.b.flush();
                            try {
                                gZIPOutputStream.close();
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                    } catch (EncodingException e2) {
                                        e = e2;
                                        b200.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
                                        bVar = new rla.b(400, null, 0L);
                                        bVar2 = bVar;
                                        url = bVar2.b;
                                        if (url != null) {
                                        }
                                        if (aVar2 == null) {
                                        }
                                        return bVar2;
                                    } catch (ConnectException e3) {
                                        e = e3;
                                        b200.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
                                        bVar = new rla.b(500, null, 0L);
                                        bVar2 = bVar;
                                        url = bVar2.b;
                                        if (url != null) {
                                        }
                                        if (aVar2 == null) {
                                        }
                                        return bVar2;
                                    } catch (UnknownHostException e4) {
                                        e = e4;
                                        b200.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
                                        bVar = new rla.b(500, null, 0L);
                                        bVar2 = bVar;
                                        url = bVar2.b;
                                        if (url != null) {
                                        }
                                        if (aVar2 == null) {
                                        }
                                        return bVar2;
                                    } catch (IOException e5) {
                                        e = e5;
                                        b200.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
                                        bVar = new rla.b(400, null, 0L);
                                        bVar2 = bVar;
                                        url = bVar2.b;
                                        if (url != null) {
                                        }
                                        if (aVar2 == null) {
                                        }
                                        return bVar2;
                                    }
                                }
                                int responseCode = httpURLConnection.getResponseCode();
                                Integer valueOf = Integer.valueOf(responseCode);
                                if (Log.isLoggable("TRuntime.".concat("CctTransportBackend"), 4)) {
                                    String.format("Status Code: %d", valueOf);
                                }
                                b200.a(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                                b200.a(httpURLConnection.getHeaderField(Http.Header.CONTENT_ENCODING), "CctTransportBackend", "Content-Encoding: %s");
                                if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                                    bVar2 = new rla.b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                                } else if (responseCode != 200) {
                                    bVar2 = new rla.b(responseCode, null, 0L);
                                } else {
                                    InputStream inputStream = httpURLConnection.getInputStream();
                                    try {
                                        InputStream gZIPInputStream = Http.ContentEncoding.GZIP.equals(httpURLConnection.getHeaderField(Http.Header.CONTENT_ENCODING)) ? new GZIPInputStream(inputStream) : inputStream;
                                        try {
                                            rla.b bVar3 = new rla.b(responseCode, null, r000.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).a);
                                            if (gZIPInputStream != null) {
                                                gZIPInputStream.close();
                                            }
                                            if (inputStream != null) {
                                                inputStream.close();
                                            }
                                            bVar2 = bVar3;
                                        } catch (Throwable th) {
                                            if (gZIPInputStream == null) {
                                                throw th;
                                            }
                                            try {
                                                gZIPInputStream.close();
                                                throw th;
                                            } catch (Throwable th2) {
                                                th.addSuppressed(th2);
                                                throw th;
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                Throwable th4 = th;
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                    } catch (Throwable th5) {
                                        th4.addSuppressed(th5);
                                    }
                                }
                                throw th4;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            Throwable th7 = th;
                            try {
                                gZIPOutputStream.close();
                            } catch (Throwable th8) {
                                th7.addSuppressed(th8);
                            }
                            throw th7;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        i2 = i4;
                    }
                } catch (Throwable th10) {
                    th = th10;
                    i2 = i4;
                }
            } catch (EncodingException e6) {
                e = e6;
                i2 = i4;
                b200.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
                bVar = new rla.b(400, null, 0L);
                bVar2 = bVar;
                url = bVar2.b;
                if (url != null) {
                }
                if (aVar2 == null) {
                }
                return bVar2;
            } catch (ConnectException e7) {
                e = e7;
                i2 = i4;
                b200.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
                bVar = new rla.b(500, null, 0L);
                bVar2 = bVar;
                url = bVar2.b;
                if (url != null) {
                }
                if (aVar2 == null) {
                }
                return bVar2;
            } catch (UnknownHostException e8) {
                e = e8;
                i2 = i4;
                b200.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
                bVar = new rla.b(500, null, 0L);
                bVar2 = bVar;
                url = bVar2.b;
                if (url != null) {
                }
                if (aVar2 == null) {
                }
                return bVar2;
            } catch (IOException e9) {
                e = e9;
                i2 = i4;
                b200.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
                bVar = new rla.b(400, null, 0L);
                bVar2 = bVar;
                url = bVar2.b;
                if (url != null) {
                }
                if (aVar2 == null) {
                }
                return bVar2;
            }
            url = bVar2.b;
            if (url != null) {
                b200.a(url, "CctTransportBackend", "Following redirect to: %s");
                aVar2 = new rla.a(url, aVar2.b, aVar2.c);
            } else {
                aVar2 = null;
            }
            if (aVar2 == null) {
                break;
            }
            i3 = i2 - 1;
        } while (i3 >= 1);
        return bVar2;
    }

    public static final io.reactivex.rxjava3.core.x E(Task task) {
        return task.isComplete() ? new io.reactivex.rxjava3.internal.operators.single.v(new ps60(task, 1)) : new io.reactivex.rxjava3.internal.operators.single.b(new e4r(new m2l0(task, 6), 1));
    }

    public static final io.reactivex.rxjava3.core.x F(Task task, Executor executor) {
        return task.isComplete() ? new io.reactivex.rxjava3.internal.operators.single.v(new ps60(task, 1)) : new io.reactivex.rxjava3.internal.operators.single.b(new e4r(new o6i0(2, task, executor), 1));
    }

    public static final int G(String str) {
        int hashCode = str.length() == 0 ? 0 : ((str.hashCode() % 24) + 24) % 24;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return context.getColor(k[hashCode].intValue());
    }

    public static final Object n(Task task) {
        if (!task.isComplete()) {
            throw new IllegalStateException("Task " + task + " not complete");
        }
        if (task.isCanceled()) {
            throw new CancellationException("Task " + task + " was cancelled normally");
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        Object result = task.getResult();
        if (result != null) {
            return result;
        }
        throw new IllegalStateException("Task " + task + " returned empty result");
    }

    public static void o(int i2, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException(lhg.a(i2, "Illegal sinceBitIndex value: "));
        }
        if (i3 > 63) {
            throw new IllegalArgumentException(lhg.a(i3, "Illegal tillBitIndex value: "));
        }
        if (i2 <= i3) {
            return;
        }
        throw new IllegalArgumentException("Illegal sinceBitIndex/tillBitIndex values: " + i2 + '/' + i3);
    }

    public static final Triple p(long j2) {
        if (j2 < 1) {
            return new Triple(0L, 0L, 0L);
        }
        long j3 = j2 / 1000;
        long j4 = 60;
        long j5 = j3 / j4;
        return new Triple(Long.valueOf(j5 / j4), Long.valueOf(j5 % j4), Long.valueOf(j3 % j4));
    }

    public static long q(int i2, int i3) {
        o(i2, i3);
        long j2 = 0;
        if (i2 <= i3) {
            while (true) {
                j2 |= 1 << i2;
                if (i2 == i3) {
                    break;
                }
                i2++;
            }
        }
        return j2;
    }

    public static final List r(Context context, double d2, double d3) {
        Pair pair = new Pair(Uri.parse("yandexmaps://maps.yandex.ru/?rtext=~" + d2 + ',' + d3), "yandex_maps");
        StringBuilder a = lby.a("yandexnavi://build_route_on_map?lat_to=", d2, "&lon_to=");
        a.append(d3);
        Pair[] pairArr = {pair, new Pair(Uri.parse(a.toString()), "yandex_navigator"), new Pair(Uri.parse("dgis://2gis.ru/routeSearch/rsType/ctx/to/" + d3 + ',' + d2), "2gis"), new Pair(Uri.parse("petalmaps://route?daddr=" + d2 + ',' + d3 + "&type=walk"), "huawei_maps")};
        ArrayMap arrayMap = new ArrayMap(5);
        PackageManager packageManager = context.getPackageManager();
        for (int i2 = 0; i2 < 4; i2++) {
            Pair pair2 = pairArr[i2];
            Uri uri = (Uri) pair2.d();
            String str = (String) pair2.g();
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, uri);
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 131072)) {
                arrayMap.put(s(resolveInfo), new Triple(intent, resolveInfo, str));
            }
        }
        Intent intent2 = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("https://www.google.com/maps/dir/?api=1&destination=" + d2 + ',' + d3));
        for (ResolveInfo resolveInfo2 : packageManager.queryIntentActivities(intent2, 65536)) {
            arrayMap.put(s(resolveInfo2), new Triple(intent2, resolveInfo2, "google_map"));
        }
        Intent intent3 = new Intent("com.mapswithme.maps.pro.action.BUILD_ROUTE");
        intent3.setPackage("com.mapswithme.maps.pro");
        ResolveInfo resolveInfo3 = (ResolveInfo) j5g.a0(packageManager.queryIntentActivities(intent3, 0));
        if (resolveInfo3 != null) {
            intent3.putExtra("lat_to", d2);
            intent3.putExtra("lon_to", d3);
            String s = s(resolveInfo3);
            if (!arrayMap.containsKey(s)) {
                arrayMap.put(s, new Triple(intent3, resolveInfo3, "mapsme"));
            }
        }
        if (arrayMap.isEmpty()) {
            return null;
        }
        return j5g.O0(arrayMap.values());
    }

    public static final String s(ResolveInfo resolveInfo) {
        try {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return ComponentName.createRelative(activityInfo.packageName, activityInfo.name).flattenToShortString();
        } catch (Throwable unused) {
            return resolveInfo.toString();
        }
    }

    public static final yn20 t() {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-511873968, 0, -1, "com.vk.core.compose.component.defaults.<get-VkSliderDefault> (VkSliderDefault.kt:66)");
        }
        yn20 yn20Var = yn20.a;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return yn20Var;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    public static final n9l u(a550 a550Var, zk40 zk40Var, pga0 pga0Var, StoryViewerRouter storyViewerRouter, ie7 ie7Var, mh70 mh70Var, NewsfeedRouter newsfeedRouter, zb70 zb70Var, ProfileFragmentProviderComponent profileFragmentProviderComponent, wro wroVar) {
        sp spVar = new sp(13);
        zq90.b = new xnd(true);
        zq90.a = spVar;
        n9l n9lVar = new n9l(0);
        k9l k9lVar = new k9l();
        n9l.b(n9lVar.b, n9lVar.c((j9l) k9l.a.getValue()), new bpn0(new iz3(new wr(21), 7)));
        n9l n9lVar2 = new n9l(0);
        n9lVar2.d(k9lVar.a("/trends"), new op0(newsfeedRouter, 19));
        n9lVar2.d(k9lVar.a(DomExceptionUtils.SEPARATOR), new uyw(newsfeedRouter, zb70Var, wroVar));
        n9lVar2.d(k9lVar.b("/([a-zA-Z0-_9]+)"), new sf3(15));
        j9l a = k9lVar.a("/feed");
        com.vk.movika.sdk.base.ui.p0 p0Var = new com.vk.movika.sdk.base.ui.p0(n9lVar2, 23);
        uq90 uq90Var = a.a;
        n9l.b(n9lVar.c, j9l.a(a, new uq90(uq90Var.a, uq90Var.b + n9lVar.e)), new bpn0(new ac(p0Var, 29)));
        n9lVar.d(k9lVar.b("/place(?<placeId>[-0-9]+)"), new tp1(newsfeedRouter, 14));
        n9lVar.d(k9lVar.b("/wall(?<postId>[-0-9]+_[0-9]+)_r(?<replyId>[0-9]+)"), new e7(newsfeedRouter, 28));
        n9lVar.d(k9lVar.b("/wall(?<userId>[-0-9]+)"), new bk1(newsfeedRouter, 20));
        n9lVar.d(k9lVar.b("/wall(?<userId>[-0-9]+)"), new g7(profileFragmentProviderComponent, 22));
        n9lVar.d(k9lVar.b("/wall(?<postIdLong>(?<userId>[-0-9]+)_(?<postIdShort>[0-9]+))"), new h7(newsfeedRouter, 24));
        n9lVar.d(k9lVar.b("/music/playlist/(?<uid>-?[0-9]+)_(?<albumId>[0-9-]+)_?(?<accessKey>[0-9a-z]*)"), new rt0(a550Var, 17));
        n9lVar.d(k9lVar.a("/music"), new n7(zk40Var, 29));
        n9lVar.d(k9lVar.b("/album(?<userId>[-0-9]+)_(?<albumId>[-0-9]+)"), new pm0(18));
        n9lVar.d(k9lVar.b("/(albums)(?<userId>[-\\d]+)?"), new ql2(pga0Var, 21));
        n9lVar.d(k9lVar.a("/photos_archive"), new np1(pga0Var, 24));
        n9lVar.d(k9lVar.b("/photo(?<photoId>[-_0-9]+)"), new io.reactivex.rxjava3.subjects.b(22));
        n9lVar.d(k9lVar.b("/(photos)(?<userId>[-\\d]+)?"), new mau(pga0Var, 2));
        n9lVar.d(k9lVar.a("/photos_settings"), new nm3(pga0Var, 14));
        int i2 = 17;
        n9lVar.d(k9lVar.a("/new_story_picker"), new p11(i2));
        n9lVar.d(k9lVar.a("/stories_archive"), new to(i2));
        n9lVar.d(k9lVar.a("/story_discover"), new pa(storyViewerRouter, 21));
        n9lVar.d(k9lVar.b("/story(?<id>[-0-9]+_[0-9]+)"), new qa(storyViewerRouter, 25));
        n9lVar.d(k9lVar.a("/new_post"), new dt(14));
        n9lVar.d(k9lVar.a("/search"), new nsn(1, zk40Var, newsfeedRouter));
        n9lVar.d(k9lVar.a("/settings"), new px5(ie7Var, mh70Var));
        return n9lVar;
    }

    public static boolean v(s410 s410Var, Integer num, Integer num2, int i2) {
        if ((i2 & 4) != 0) {
            num = null;
        }
        if ((i2 & 8) != 0) {
            num2 = null;
        }
        Integer num3 = s410Var.a;
        Integer num4 = s410Var.b;
        if (num4 == null && num3 == null) {
            return true;
        }
        if (num == null && num2 == null) {
            return false;
        }
        return num2 == null ? epx.f(num, num3) && num4 == null : (num2.equals(num4) && epx.f(num, num3)) || num2.equals(null);
    }

    public static final boolean w(int i2, int i3, x9g0 x9g0Var) {
        return x9g0Var == null ? ((float) ((int) (((float) i2) * 1.3333334f))) >= 2048.0f && ((int) (((float) i3) * 1.3333334f)) >= 2048 : ((int) (((float) i2) * 1.3333334f)) >= x9g0Var.a && ((int) (((float) i3) * 1.3333334f)) >= x9g0Var.b;
    }

    public static final boolean x(rip ripVar, x9g0 x9g0Var) {
        if (ripVar == null) {
            return false;
        }
        ripVar.y();
        int i2 = ripVar.d;
        if (i2 == 90 || i2 == 270) {
            ripVar.y();
            int i3 = ripVar.g;
            ripVar.y();
            return w(i3, ripVar.f, x9g0Var);
        }
        ripVar.y();
        int i4 = ripVar.f;
        ripVar.y();
        return w(i4, ripVar.g, x9g0Var);
    }

    public static void y(FragmentActivity fragmentActivity, izs izsVar) {
        myc0.h(g5z.a(fragmentActivity), EmptyCoroutineContext.b, null, new abs(izsVar, null), 2);
    }

    public static void z(FragmentImpl fragmentImpl, izs izsVar) {
        myc0.h(g5z.a(fragmentImpl), EmptyCoroutineContext.b, null, new yas(izsVar, null), 2);
    }

    @Override // xsna.xyv
    public /* bridge */ /* synthetic */ Intent a(Context context, long j2, ChannelHistoryOpenMode channelHistoryOpenMode, Long l2, Class cls) {
        return null;
    }

    @Override // xsna.xyv
    public io.reactivex.rxjava3.core.a f(jbs jbsVar, long j2, int i2) {
        return io.reactivex.rxjava3.internal.operators.completable.i.b;
    }

    @Override // xsna.xyv
    public io.reactivex.rxjava3.core.a l(bc6 bc6Var, Msg msg) {
        return io.reactivex.rxjava3.internal.operators.completable.i.b;
    }

    @Override // xsna.xyv
    public io.reactivex.rxjava3.core.a m(long j2, jbs jbsVar) {
        return io.reactivex.rxjava3.internal.operators.completable.i.b;
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Boolean.valueOf(zznk.zzc());
    }

    @Override // xsna.xyv
    public void g(Context context) {
    }

    @Override // xsna.xyv
    public void k(jbs jbsVar) {
    }

    @Override // xsna.xyv
    public void h(bc6 bc6Var, long j2) {
    }

    @Override // xsna.xyv
    public void j(u90 u90Var, long j2) {
    }

    @Override // xsna.xyv
    public void b(Context context, long j2, int i2, ChannelHistoryOpenMode channelHistoryOpenMode) {
    }

    @Override // xsna.xyv
    public void c(Context context, long j2, ChannelHistoryOpenMode channelHistoryOpenMode, ChannelEntryPoint channelEntryPoint) {
    }

    @Override // xsna.xyv
    public void d(Context context, long j2, int i2, Integer num) {
    }
}
