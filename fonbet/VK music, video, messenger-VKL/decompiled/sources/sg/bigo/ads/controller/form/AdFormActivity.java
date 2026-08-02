package sg.bigo.ads.controller.form;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.Locale;
import java.util.Map;
import ru.ok.tracer.base.ucum.UcumUtils;
import sg.bigo.ads.R;
import sg.bigo.ads.ai.e;
import sg.bigo.ads.common.form.a;
import sg.bigo.ads.common.form.render.b;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.common.utils.t;
import sg.bigo.ads.common.utils.v;
import sg.bigo.ads.controller.landing.d;
import sg.bigo.ads.d.c;

/* loaded from: classes9.dex */
public class AdFormActivity extends Activity implements b.a {

    @Nullable
    private c<?, ?> a;
    private int b;
    private int c;
    private boolean d;
    private int e;
    private Map<String, Object> f;
    private sg.bigo.ads.common.form.c g;

    @NonNull
    public static Intent a(Context context) {
        Intent intent = new Intent(context, (Class<?>) AdFormActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        return intent;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            View currentFocus = getCurrentFocus();
            if ((currentFocus instanceof EditText) && !v.a(currentFocus, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                currentFocus.clearFocus();
                try {
                    ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(getWindow().getDecorView().getWindowToken(), 0);
                } catch (Throwable unused) {
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.d) {
            super.onBackPressed();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [sg.bigo.ads.api.core.b] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [sg.bigo.ads.api.core.b] */
    /* JADX WARN: Type inference failed for: r8v3 */
    @Override // android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        Object obj;
        c<?, ?> cVar;
        FrameLayout frameLayout;
        char c;
        char c2;
        Locale locale;
        super.onCreate(bundle);
        try {
            this.b = getIntent().getIntExtra("ad_identifier", -1);
            this.e = getIntent().getIntExtra("open_form_time", 0);
            c<?, ?> b = d.b(this.b);
            this.a = b;
            if (b == null) {
                finish();
                return;
            }
            int hashCode = b.f().hashCode();
            this.c = hashCode;
            this.f = a.a(hashCode);
            setContentView(R.layout.bigo_ad_activity_form);
            Window window = getWindow();
            if (window != null) {
                t.a(window);
            }
            View findViewById = findViewById(R.id.bigo_ad_btn_close);
            if (findViewById != null) {
                findViewById.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.controller.form.AdFormActivity.1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AdFormActivity.this.finish();
                    }
                });
            }
            FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.inter_main);
            if (frameLayout2 == null || (cVar = this.a) == null) {
                return;
            }
            e g = cVar.f().g();
            String e = g.e();
            a.a = e;
            switch (e.hashCode()) {
                case 3121:
                    frameLayout = frameLayout2;
                    if (e.equals("ar")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3201:
                    frameLayout = frameLayout2;
                    if (e.equals(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR)) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 3246:
                    frameLayout = frameLayout2;
                    if (e.equals("es")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 3259:
                    frameLayout = frameLayout2;
                    if (e.equals("fa")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3276:
                    frameLayout = frameLayout2;
                    if (e.equals("fr")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case 3325:
                    frameLayout = frameLayout2;
                    if (e.equals("he")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 3329:
                    frameLayout = frameLayout2;
                    if (e.equals("hi")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 3355:
                    frameLayout = frameLayout2;
                    if (e.equals("id")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 3383:
                    frameLayout = frameLayout2;
                    if (e.equals("ja")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 3428:
                    frameLayout = frameLayout2;
                    if (e.equals("ko")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case 3494:
                    if (e.equals(UcumUtils.UCUM_MILLISECODS)) {
                        c2 = 6;
                        frameLayout = frameLayout2;
                        c = c2;
                        break;
                    }
                    frameLayout = frameLayout2;
                    c = 65535;
                    break;
                case 3588:
                    if (e.equals("pt")) {
                        c2 = 7;
                        frameLayout = frameLayout2;
                        c = c2;
                        break;
                    }
                    frameLayout = frameLayout2;
                    c = 65535;
                    break;
                case 3651:
                    if (e.equals("ru")) {
                        c2 = '\b';
                        frameLayout = frameLayout2;
                        c = c2;
                        break;
                    }
                    frameLayout = frameLayout2;
                    c = 65535;
                    break;
                case 3700:
                    if (e.equals("th")) {
                        c2 = '\n';
                        frameLayout = frameLayout2;
                        c = c2;
                        break;
                    }
                    frameLayout = frameLayout2;
                    c = 65535;
                    break;
                case 3710:
                    if (e.equals("tr")) {
                        c2 = '\t';
                        frameLayout = frameLayout2;
                        c = c2;
                        break;
                    }
                    frameLayout = frameLayout2;
                    c = 65535;
                    break;
                case 3749:
                    if (e.equals("uz")) {
                        c2 = 11;
                        frameLayout = frameLayout2;
                        c = c2;
                        break;
                    }
                    frameLayout = frameLayout2;
                    c = 65535;
                    break;
                case 3763:
                    if (e.equals("vi")) {
                        c2 = '\f';
                        frameLayout = frameLayout2;
                        c = c2;
                        break;
                    }
                    frameLayout = frameLayout2;
                    c = 65535;
                    break;
                default:
                    frameLayout = frameLayout2;
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    locale = new Locale("ar", "");
                    break;
                case 1:
                    locale = new Locale("es", "");
                    break;
                case 2:
                    locale = new Locale("fa", "");
                    break;
                case 3:
                    locale = new Locale("he", "");
                    break;
                case 4:
                    locale = new Locale("hi", "");
                    break;
                case 5:
                    locale = new Locale("id", "");
                    break;
                case 6:
                    locale = new Locale(UcumUtils.UCUM_MILLISECODS, "");
                    break;
                case 7:
                    locale = new Locale("pt", "");
                    break;
                case '\b':
                    locale = new Locale("ru", "");
                    break;
                case '\t':
                    locale = new Locale("tr", "");
                    break;
                case '\n':
                    locale = new Locale("th", "");
                    break;
                case 11:
                    locale = new Locale("uz", "");
                    break;
                case '\f':
                    locale = new Locale("vi", "");
                    break;
                case '\r':
                    locale = Locale.GERMAN;
                    break;
                case 14:
                    locale = Locale.JAPANESE;
                    break;
                case 15:
                    locale = Locale.KOREAN;
                    break;
                case 16:
                    locale = Locale.FRENCH;
                    break;
                default:
                    locale = Locale.ENGLISH;
                    break;
            }
            a.b = locale;
            boolean z = this.a.j;
            this.d = z;
            sg.bigo.ads.common.form.c a = sg.bigo.ads.common.form.c.a(this, g, this.f, z, this.e, this.c, this);
            this.g = a;
            obj = null;
            try {
                v.a(a.b, frameLayout, null, -1);
                this.g.c.c();
            } catch (Throwable th) {
                th = th;
                c<?, ?> cVar2 = this.a;
                sg.bigo.ads.da.b.a((sg.bigo.ads.api.core.b) (cVar2 != null ? cVar2.f() : obj), IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, 10221, Log.getStackTraceString(th));
                finish();
            }
        } catch (Throwable th2) {
            th = th2;
            obj = null;
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        sg.bigo.ads.common.form.c cVar;
        b bVar;
        super.onDestroy();
        try {
            if (this.a != null && (cVar = this.g) != null && (bVar = cVar.a) != null) {
                Map<String, Object> a = a.a(bVar.b, bVar.c.b(), bVar.c.a());
                boolean z = this.d;
                if (!z) {
                    a.a(this.c, a);
                } else if (z) {
                    a.a(this.c, 3);
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // sg.bigo.ads.common.form.render.b.a
    public final void a() {
        this.d = true;
        c<?, ?> cVar = this.a;
        if (cVar != null) {
            cVar.j = true;
        }
    }

    @Override // sg.bigo.ads.common.form.render.b.a
    public final void a(String str) {
        if (r.a((CharSequence) str)) {
            return;
        }
        d.a(this, this, str, this.a);
    }
}
