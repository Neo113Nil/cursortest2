package xsna;

import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Parcelable;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.upload.impl.tasks.cover.CoverVideoUploadTask;
import com.vkontakte.android.NetworkStateReceiver;
import com.vkontakte.android.R;
import java.io.File;
import java.util.Collections;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONObject;
import xsna.h3k;
import xsna.m7a0;

/* compiled from: VkUploadBridge.kt */
/* loaded from: classes7.dex */
public final class yxv0 implements baq0 {
    public final Object a;
    public final Object b;

    public yxv0(Lazy<? extends qga0> lazy, Lazy<? extends d7a0> lazy2) {
        this.a = lazy;
        this.b = lazy2;
    }

    @Override // xsna.baq0
    public final void a(String str) {
        if (BuildInfo.t()) {
            return;
        }
        o6r0 c = q6r0.c();
        c.d(str, false);
        c.commit();
    }

    @Override // xsna.baq0
    public final boolean b() {
        return Preference.j().getBoolean("compressPhotos", true);
    }

    @Override // xsna.baq0
    public final void c(String str, UserId userId, mp3 mp3Var, g84 g84Var) {
        com.vk.upload.impl.a.h(new com.vk.upload.impl.tasks.l(str, userId), new vxv0(0, mp3Var, g84Var));
    }

    @Override // xsna.baq0
    public final void d() {
        ysg0<h3k> ysg0Var = h3k.a;
        h3k.a.a(h3k.b.a.b);
    }

    @Override // xsna.baq0
    public final void e() {
        i0q0.f(new cy20(26));
    }

    @Override // xsna.baq0
    public final void f(Throwable th) {
        if (th instanceof CoverVideoUploadTask.VideoCompressException) {
            cvk.u(R.string.error_compress_vide_file, false);
        } else {
            cvk.u(R.string.error_on_live_cover_uploading, false);
        }
        h3k.a.a(h3k.b.c.b);
    }

    @Override // xsna.baq0
    public final void g() {
        wxl0.b.c();
    }

    @Override // xsna.baq0
    public final void h(int i) {
        wxl0 wxl0Var = wxl0.b;
        if (i != wxl0.j) {
            return;
        }
        wxl0.n = true;
        wxl0Var.b();
    }

    @Override // xsna.baq0
    public final Object i(ContinuationImpl continuationImpl) {
        return myc0.k(hqu0.b(), new wxv0(2, null), continuationImpl);
    }

    @Override // xsna.baq0
    public final void j() {
        i0q0.f(new kcc0(12));
    }

    @Override // xsna.baq0
    public final void k(Uri uri, UserId userId) {
        com.vk.upload.impl.a.i(new com.vk.upload.impl.tasks.u(uri.toString(), userId, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false, false, (String) null, 3968));
    }

    @Override // xsna.baq0
    public final void l(String str, RectF rectF, boolean z, Integer num) {
        wxl0 wxl0Var = wxl0.b;
        wxl0.m = z;
        wxl0.h = rectF;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        String b = r9r.b(context, Uri.parse(str));
        if (b == null) {
            return;
        }
        wxl0.g = new File(b);
        if (wxl0.l) {
            wxl0.d((File) wxl0.c.getValue(), wxl0.g, num);
        } else {
            wxl0Var.b();
        }
    }

    @Override // xsna.baq0
    public final void m() {
        wxl0.b.c();
    }

    @Override // xsna.baq0
    public final void n(Intent intent, boolean z) {
        intent.putExtra("reload_wall", z);
    }

    @Override // xsna.baq0
    public final void o() {
        wxl0 wxl0Var = wxl0.b;
        i0q0.f(new f84(20));
        wxl0Var.c();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.baq0
    public final void p(Integer num, String str) {
        ((d7a0) this.b.getValue()).a(str).a(new nt8(num != null ? Long.valueOf(num.intValue()) : null));
    }

    @Override // xsna.baq0
    public final Object q(boolean z, k2j0 k2j0Var) {
        Object k = myc0.k(hqu0.b(), new xxv0(z, null), k2j0Var);
        return k == CoroutineSingletons.COROUTINE_SUSPENDED ? k : s3q0.a;
    }

    @Override // xsna.baq0
    public final void r(boolean z, boolean z2, boolean z3) {
        wxl0 wxl0Var = wxl0.b;
        wxl0.a(z, z2, z3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.baq0
    public final void s(Photo photo) {
        ((qga0) this.a.getValue()).a().a(new m7a0.g(photo));
    }

    @Override // xsna.baq0
    public final Parcelable t(UserId userId, String str) {
        Object failure;
        try {
            failure = com.vk.upload.impl.a.j(new com.vk.upload.impl.tasks.x(str, userId));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (Parcelable) failure;
    }

    @Override // xsna.baq0
    public final void u(int i, UserId userId, String str) {
        com.vk.upload.impl.a.i(new ev6(Collections.singletonList(new rz40(i, userId, str)), ""));
    }

    @Override // xsna.baq0
    public final void v(JSONObject jSONObject) {
        h3k.a.a(new h3k.b.C2970b(jSONObject));
    }

    @Override // xsna.baq0
    public final void w(float f) {
        h3k.a.a(new h3k.a(f));
    }

    @Override // xsna.baq0
    public final boolean x() {
        return NetworkStateReceiver.b();
    }
}
