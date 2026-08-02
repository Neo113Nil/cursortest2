package xsna;

import android.content.SharedPreferences;
import android.os.Handler;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;
import com.ironsource.C4382j6;
import com.vk.id.captcha.web.VKCaptchaWebViewActivity;
import com.vk.im.ui.fragments.ImSelectDonutContactsFragment;
import com.vk.log.L;
import com.vk.utils.log.LogUploader;
import com.vkontakte.android.R;
import java.io.File;
import java.lang.ref.WeakReference;
import okhttp3.Interceptor;
import ru.ok.android.webrtc.SharedPeerConnectionFactory;
import ru.ok.media.StreamingLaunchScheduler;
import xsna.ci9;
import xsna.f6q0;
import xsna.n6q0;
import xsna.skm0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class vk9 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vk9(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() {
        f6q0.b.a aVar;
        r2 = null;
        String str = null;
        switch (this.b) {
            case 0:
                mk9 mk9Var = (mk9) this.c;
                nap.b();
                ci9.b bVar = mk9Var.A;
                if (bVar != null) {
                    bVar.j();
                    return;
                }
                return;
            case 1:
                com.vk.channels.impl.comments.e eVar = (com.vk.channels.impl.comments.e) this.c;
                ner0 ner0Var = eVar.i;
                if (ner0Var != null) {
                    if (ner0Var.isShowing()) {
                        return;
                    }
                    ner0Var.show();
                    return;
                } else {
                    ner0 ner0Var2 = new ner0(eVar.h);
                    ner0Var2.setMessage(ner0Var2.getContext().getString(R.string.vk_loading));
                    ner0Var2.setCancelable(true);
                    ner0Var2.setCanceledOnTouchOutside(false);
                    ner0Var2.show();
                    eVar.i = ner0Var2;
                    return;
                }
            case 2:
                LogUploader.a aVar2 = (LogUploader.a) this.c;
                LogUploader logUploader = LogUploader.a;
                synchronized (logUploader) {
                    LogUploader.b bVar2 = LogUploader.b;
                    bVar2.b(null);
                    SharedPreferences sharedPreferences = bVar2.a;
                    sharedPreferences.edit().putBoolean("log_collector_is_app_sent_key", false).apply();
                    sharedPreferences.edit().putBoolean("log_collector_is_net_sent_key", false).apply();
                    logUploader.c(aVar2);
                }
                return;
            case 3:
                okhttp3.d dVar = (okhttp3.d) this.c;
                L.G("NetworkRequestInterceptor", "request canceled " + dVar.request().a);
                dVar.cancel();
                return;
            case 4:
                View view = ((ImSelectDonutContactsFragment) this.c).S;
                bwt0.p0(view != null ? view : null, false);
                return;
            case 5:
                f6q0 f6q0Var = (f6q0) this.c;
                if (hew.h != null) {
                    return;
                }
                WeakReference<AppCompatActivity> weakReference = hew.f;
                AppCompatActivity appCompatActivity = weakReference != null ? weakReference.get() : null;
                if (appCompatActivity == null || appCompatActivity.isFinishing() || appCompatActivity.isDestroyed()) {
                    return;
                }
                hew hewVar = hew.b;
                hewVar.getClass();
                ((InputMethodManager) appCompatActivity.getSystemService("input_method")).hideSoftInputFromWindow(appCompatActivity.getWindow().getDecorView().getWindowToken(), 0);
                n6q0.a aVar3 = new n6q0.a();
                f6q0.b bVar3 = f6q0Var.a;
                String str2 = bVar3 != null ? bVar3.b : null;
                if (str2 == null) {
                    str2 = "";
                }
                aVar3.a = str2;
                if (bVar3 != null && (aVar = bVar3.d) != null) {
                    str = aVar.a;
                }
                String str3 = str != null ? str : "";
                btm btmVar = new btm(appCompatActivity, 14);
                aVar3.b = str3;
                aVar3.c = btmVar;
                er6 er6Var = hew.c;
                aVar3.g = er6Var != null ? ((Boolean) er6Var.invoke()).booleanValue() : false;
                aVar3.f = new vg0(18);
                hew.h = aVar3.f(appCompatActivity);
                d6q0.b(hewVar);
                b8u0 b8u0Var = hew.d;
                if (b8u0Var != null) {
                    b8u0Var.c();
                }
                f370 f370Var = hew.e;
                if (f370Var != null) {
                    f370Var.b(new cu1(15));
                }
                appCompatActivity.getOnBackPressedDispatcher().a(appCompatActivity, new gew(true));
                return;
            case 6:
                ((g4) this.c).invoke();
                return;
            case 7:
                j240 j240Var = ((w140) this.c).b;
                synchronized (j240Var) {
                    j240Var.c = h240.d;
                    new File(dgn0.d().getFilesDir(), "MultiAccountId.txt").delete();
                }
                return;
            case 8:
                ?? r0 = ((e3e0) this.c).c;
                if (((ProgressBar) r0.getValue()).isAttachedToWindow()) {
                    ((ProgressBar) r0.getValue()).setVisibility(0);
                    return;
                }
                return;
            case 9:
                ((SharedPeerConnectionFactory) this.c).b();
                return;
            case 10:
                ((EditText) this.c).requestFocus();
                return;
            case 11:
                ((skm0.a) this.c).w();
                return;
            case 12:
                ((StreamingLaunchScheduler) this.c).onOfflineTimeout();
                return;
            case 13:
                VKCaptchaWebViewActivity vKCaptchaWebViewActivity = (VKCaptchaWebViewActivity) this.c;
                Handler handler = vKCaptchaWebViewActivity.f;
                int i = VKCaptchaWebViewActivity.m;
                if (((sey0) vKCaptchaWebViewActivity.h.getValue()).a()) {
                    handler.post(new cc3(8, vKCaptchaWebViewActivity.getIntent().getStringExtra("VK_CAPTCHA_URL_KEY"), (Object) vKCaptchaWebViewActivity));
                    return;
                } else {
                    handler.post(new yh9(vKCaptchaWebViewActivity, 13));
                    return;
                }
            case 14:
                ((com.vk.superapp.ui.b) this.c).tn();
                return;
            default:
                C4382j6.b((C4382j6) this.c);
                return;
        }
    }

    public /* synthetic */ vk9(h3j h3jVar, Interceptor.a aVar, okhttp3.d dVar) {
        this.b = 3;
        this.c = dVar;
    }
}
