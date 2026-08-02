package xsna;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.common.links.LaunchContext;
import com.vk.core.apps.BuildInfo;
import com.vk.video.growth.api.data.VideoGrowthAppStore;
import com.vk.video.growth.api.data.VideoGrowthVideoParams;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Triple;

/* compiled from: VideoStandaloneAppLauncherImpl.kt */
/* loaded from: classes6.dex */
public final class jit0 implements hit0 {
    public final Object a;
    public final sos0 b;
    public final String c = i5s.a(new StringBuilder("vkvideo://"), a0a.d, "/video");

    /* compiled from: VideoStandaloneAppLauncherImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoGrowthAppStore.values().length];
            try {
                iArr[VideoGrowthAppStore.RUSTORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoGrowthAppStore.GOOGLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public jit0(Lazy<? extends qdz> lazy, sos0 sos0Var) {
        this.a = lazy;
        this.b = sos0Var;
    }

    public static void e(jit0 jit0Var, Context context, VideoGrowthVideoParams videoGrowthVideoParams, Map map, iit0 iit0Var, String str, int i) {
        String str2;
        String str3;
        Uri parse;
        if ((i & 4) != 0) {
            map = null;
        }
        gzs gzsVar = iit0Var;
        if ((i & 8) != 0) {
            gzsVar = new gzr0(2);
        }
        if ((i & 16) != 0) {
            str = null;
        }
        if (str != null) {
            Uri.Builder appendPath = new Uri.Builder().scheme("vkvideo").authority("vkvideo.ru").appendPath(str);
            if ((videoGrowthVideoParams != null ? videoGrowthVideoParams.b : null) != null) {
                Triple p = m4s.p(videoGrowthVideoParams.c);
                Uri.Builder appendQueryParameter = appendPath.appendPath("videos").appendQueryParameter("video_id", videoGrowthVideoParams.b);
                StringBuilder sb = new StringBuilder();
                sb.append(((Number) p.i()).longValue());
                sb.append('h');
                sb.append(((Number) p.j()).longValue());
                sb.append('m');
                sb.append(((Number) p.k()).longValue());
                appendQueryParameter.appendQueryParameter("t", sb.toString());
            }
            str2 = appendPath.toString();
        } else if ((videoGrowthVideoParams != null ? videoGrowthVideoParams.b : null) != null) {
            Triple p2 = m4s.p(videoGrowthVideoParams.c);
            String str4 = videoGrowthVideoParams.b;
            boolean z = videoGrowthVideoParams.d;
            StringBuilder sb2 = new StringBuilder("vkvideo://");
            n6j.b(sb2, a0a.d, "/video", str4, "?t=");
            sb2.append(((Number) p2.i()).longValue());
            sb2.append('h');
            sb2.append(((Number) p2.j()).longValue());
            sb2.append('m');
            sb2.append(((Number) p2.k()).longValue());
            sb2.append("s&download=");
            sb2.append(z);
            str2 = sb2.toString();
        } else {
            str2 = jit0Var.c;
        }
        if (map != null) {
            Uri.Builder buildUpon = Uri.parse(str2).buildUpon();
            for (Map.Entry entry : map.entrySet()) {
                buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            str3 = buildUpon.toString();
        } else {
            str3 = null;
        }
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
        if (str3 == null || (parse = Uri.parse(str3)) == null) {
            parse = Uri.parse(str2);
        }
        intent.setData(parse);
        intent.setComponent(new ComponentName("com.vk.vkvideo", "com.vk.video.features.links.VkVideoLinkRedirActivity"));
        intent.putExtra("com.vk.EXTRA_REDIRECTED", true);
        intent.putExtra("com.vk.EXTRA_REDIRECT_SOURCE_PACKAGE", context.getApplicationContext().getPackageName());
        intent.setFlags(268435456);
        Context context2 = e43.a;
        if ((context2 != null ? context2 : null).getPackageManager().resolveActivity(intent, 0) == null) {
            gzsVar.invoke();
            return;
        }
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            com.vk.metrics.eventtracking.b.a.a(e);
            gzsVar.invoke();
        }
    }

    @Override // xsna.hit0
    public final void a(Context context, VideoGrowthVideoParams videoGrowthVideoParams, Map<String, String> map) {
        e(this, context, videoGrowthVideoParams, map, null, null, 24);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [xsna.iit0] */
    @Override // xsna.hit0
    public final void b(final Context context, final String str, final VideoGrowthAppStore videoGrowthAppStore, final VideoGrowthVideoParams videoGrowthVideoParams, final String str2) {
        if (!dy2.i("com.vk.vkvideo")) {
            d(context, str, videoGrowthAppStore, videoGrowthVideoParams, str2);
        } else {
            this.b.a(str);
            e(this, context, videoGrowthVideoParams, null, new gzs() { // from class: xsna.iit0
                @Override // xsna.gzs
                public final Object invoke() {
                    jit0.this.d(context, str, videoGrowthAppStore, videoGrowthVideoParams, str2);
                    return s3q0.a;
                }
            }, str2, 4);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void c(Context context, String str, VideoGrowthVideoParams videoGrowthVideoParams, String str2) {
        String str3;
        String builder;
        maz e = ((qdz) this.a.getValue()).e();
        if (str2 != null) {
            Uri.Builder appendQueryParameter = Uri.parse(str).buildUpon().appendQueryParameter("author", str2);
            if ((videoGrowthVideoParams != null ? videoGrowthVideoParams.b : null) != null) {
                Triple p = m4s.p(videoGrowthVideoParams.c);
                Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("video", "video" + videoGrowthVideoParams.b);
                StringBuilder sb = new StringBuilder();
                sb.append(((Number) p.i()).longValue());
                sb.append('h');
                sb.append(((Number) p.j()).longValue());
                sb.append('m');
                sb.append(((Number) p.k()).longValue());
                sb.append('s');
                appendQueryParameter2.appendQueryParameter("time", sb.toString()).toString();
            }
            builder = appendQueryParameter.toString();
        } else {
            if ((videoGrowthVideoParams != null ? videoGrowthVideoParams.b : null) == null) {
                str3 = str;
                maz.c(e, context, str3, new LaunchContext(false, false, false, null, null, null, null, null, null, null, null, true, false, false, null, null, null, null, null, false, false, null, null, null, 67098623), null, null, 24);
            }
            Triple p2 = m4s.p(videoGrowthVideoParams.c);
            Uri.Builder appendQueryParameter3 = Uri.parse(str).buildUpon().appendQueryParameter("param", "video" + videoGrowthVideoParams.b);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(((Number) p2.i()).longValue());
            sb2.append('h');
            sb2.append(((Number) p2.j()).longValue());
            sb2.append('m');
            sb2.append(((Number) p2.k()).longValue());
            sb2.append('s');
            builder = appendQueryParameter3.appendQueryParameter("time", sb2.toString()).toString();
        }
        str3 = builder;
        maz.c(e, context, str3, new LaunchContext(false, false, false, null, null, null, null, null, null, null, null, true, false, false, null, null, null, null, null, false, false, null, null, null, 67098623), null, null, 24);
    }

    public final void d(Context context, String str, VideoGrowthAppStore videoGrowthAppStore, VideoGrowthVideoParams videoGrowthVideoParams, String str2) {
        int i = a.$EnumSwitchMapping$0[videoGrowthAppStore.ordinal()];
        sos0 sos0Var = this.b;
        if (i == 1) {
            sos0Var.c(str);
            if (!((Boolean) git0.b.getValue()).booleanValue()) {
                c(context, str, videoGrowthVideoParams, str2);
                s3q0 s3q0Var = s3q0.a;
                return;
            } else {
                git0.a(str);
                c(context, "https://adv.rustore.ru/app/com.vk.vkvideo?rpartner_id=vknt_vkvid", videoGrowthVideoParams, str2);
                s3q0 s3q0Var2 = s3q0.a;
                return;
            }
        }
        if (i != 2) {
            sos0Var.c(str);
            c(context, str, videoGrowthVideoParams, str2);
            return;
        }
        sos0Var.c(str);
        if (!((Boolean) git0.a.getValue()).booleanValue() || !BuildInfo.j()) {
            c(context, str, videoGrowthVideoParams, str2);
            s3q0 s3q0Var3 = s3q0.a;
            return;
        }
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
        intent.setPackage("com.android.vending");
        intent.setData(Uri.parse("https://play.google.com/d?id=com.vk.vkvideo&referrer=".concat(str)));
        intent.putExtra("overlay", true);
        intent.putExtra("callerId", "com.vkontakte.android");
        Activity h = e3m.h(context);
        if (intent.resolveActivity(context.getPackageManager()) == null || h == null) {
            c(context, str, videoGrowthVideoParams, str2);
            s3q0 s3q0Var4 = s3q0.a;
        } else {
            git0.a(str);
            h.startActivityForResult(intent, 0);
        }
    }
}
