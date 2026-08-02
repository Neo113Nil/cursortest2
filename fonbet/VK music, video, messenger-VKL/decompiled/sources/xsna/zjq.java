package xsna;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import androidx.work.c;
import androidx.work.d;
import com.google.android.gms.internal.measurement.zzor;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.api.ui.VideoTransitionSource;
import com.vk.pending.PendingDocumentAttachment;
import com.vk.push.pushsdk.work.multiprocess.MultiProcessWorker;
import com.vk.voip.OKVoipEngine;
import com.vkontakte.android.attachments.DocumentAttachment;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;

/* compiled from: FallbackImageLoader.kt */
@ozl
/* loaded from: classes8.dex */
public final class zjq implements akw, q701, uan, gn60 {
    public static se8 c;
    public static pd8 d;
    public static boolean e;
    public static j100 g;
    public static final zjq b = new zjq();
    public static final /* synthetic */ zjq f = new zjq();

    public static final c.a d(boolean z, gzs gzsVar) {
        return z ? new c.a(MultiProcessWorker.class) : (c.a) gzsVar.invoke();
    }

    public static final d.a e(boolean z, long j, TimeUnit timeUnit, wzs wzsVar) {
        return z ? new d.a(MultiProcessWorker.class, j, timeUnit) : (d.a) wzsVar.invoke(Long.valueOf(j), timeUnit);
    }

    public static final VideoTransitionSource f(View view) {
        Rect b2 = f4m.b(view);
        return new VideoTransitionSource(b2.left, b2.top, view.getWidth(), view.getHeight(), b2.bottom - b2.top);
    }

    public static long g(long j, boolean z) {
        return z ? l5g.c(14, j, 0.64f) : j;
    }

    public static float h(float f2, float f3, float f4, float f5) {
        return (float) Math.hypot(f4 - f2, f5 - f3);
    }

    public static final Object j(Optional optional) {
        return optional.orElse(null);
    }

    public static final boolean k(VideoFile videoFile) {
        Long z7 = videoFile.z7();
        if (!videoFile.p2()) {
            return false;
        }
        if (z7 == null) {
            return true;
        }
        long longValue = z7.longValue();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(videoFile.b0() * 1000);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(longValue);
        return !c09.c(calendar, calendar2);
    }

    public static float l(float f2, float f3, float f4) {
        return (f4 * f3) + ((1.0f - f4) * f2);
    }

    public static final Rect m(l9x l9xVar) {
        return new Rect(l9xVar.a, l9xVar.b, l9xVar.c, l9xVar.d);
    }

    @ozl
    public static final Rect n(zhf0 zhf0Var) {
        return new Rect((int) zhf0Var.a, (int) zhf0Var.b, (int) zhf0Var.c, (int) zhf0Var.d);
    }

    public static final RectF o(zhf0 zhf0Var) {
        return new RectF(zhf0Var.a, zhf0Var.b, zhf0Var.c, zhf0Var.d);
    }

    public static final zhf0 p(RectF rectF) {
        return new zhf0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // xsna.akw
    public Future b(Context context, Uri uri) {
        PackageInfo packageInfo;
        y7g0 b2 = com.bumptech.glide.a.a(context).f.b(context);
        b2.getClass();
        i7g0 a = new i7g0(b2.b, b2, b2.c).a(y7g0.l);
        i7g0 z = a.z(uri);
        if ("android.resource".equals(uri.getScheme())) {
            Context context2 = a.s;
            i7g0 i7g0Var = (i7g0) z.q(context2.getTheme());
            ConcurrentHashMap concurrentHashMap = dd3.a;
            String packageName = context2.getPackageName();
            ConcurrentHashMap concurrentHashMap2 = dd3.a;
            ady adyVar = (ady) concurrentHashMap2.get(packageName);
            if (adyVar == null) {
                try {
                    packageInfo = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0);
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.e("AppVersionSignature", "Cannot resolve info for" + context2.getPackageName(), e2);
                    packageInfo = null;
                }
                qp70 qp70Var = new qp70(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
                ady adyVar2 = (ady) concurrentHashMap2.putIfAbsent(packageName, qp70Var);
                adyVar = adyVar2 == null ? qp70Var : adyVar2;
            }
            z = i7g0Var.o(new ac2(context2.getResources().getConfiguration().uiMode & 48, adyVar));
        }
        s7g0 s7g0Var = new s7g0();
        z.y(s7g0Var, s7g0Var, u3q.b);
        return s7g0Var;
    }

    @Override // xsna.uan
    public File c(ady adyVar) {
        return null;
    }

    public synchronized pd8 i() {
        if (d == null) {
            OKVoipEngine.b.getClass();
            io70 x = OKVoipEngine.x();
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            qas qasVar = new qas(x, context);
            te0 te0Var = new te0(5);
            eqt eqtVar = new eqt();
            synchronized (this) {
                d = new pd8(c, qasVar, te0Var, eqtVar);
            }
        }
        return d;
    }

    public List q(int i, Pair pair, wm60 wm60Var) {
        ArrayList arrayList;
        ImageSize imageSize;
        DocumentAttachment documentAttachment = (DocumentAttachment) pair.d();
        int intValue = ((Number) pair.g()).intValue();
        if (documentAttachment instanceof PendingDocumentAttachment) {
            arrayList = null;
            imageSize = new ImageSize(documentAttachment.h, documentAttachment.l, documentAttachment.m, null, (char) 0, false, 56, null);
        } else {
            Image image = documentAttachment.s;
            arrayList = image != null ? image.b : null;
            imageSize = null;
        }
        String str = documentAttachment.i;
        return Collections.singletonList(new stj0(new mun(documentAttachment, str, str != null ? str.toUpperCase(Locale.ROOT) : null, documentAttachment.x5(), documentAttachment.n, imageSize, arrayList), documentAttachment.s, documentAttachment.x5(), documentAttachment.V0(), intValue));
    }

    @Override // xsna.gn60
    public /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return q(0, pair, bp5Var);
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Integer.valueOf((int) zzor.zzc());
    }

    @Override // xsna.uan
    public void a(ady adyVar, com.vk.movika.sdk.base.model.l lVar) {
    }
}
