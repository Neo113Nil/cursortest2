package sg.bigo.ads.q;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;
import sg.bigo.ads.ai.o;
import sg.bigo.ads.controller.landing.LandingPageStyleConfig;

/* loaded from: classes9.dex */
public class e extends sg.bigo.ads.controller.landing.c {
    protected final LandingPageStyleConfig a;
    private o b;
    private View c;
    private ProgressBar d;
    private final int e;
    private boolean f;
    private boolean g;

    public e(@NonNull Activity activity) {
        super(activity);
        this.e = 5;
        this.f = false;
        this.g = true;
        Intent intent = activity.getIntent();
        this.a = intent == null ? null : (LandingPageStyleConfig) intent.getParcelableExtra("layout_style");
        sg.bigo.ads.api.core.b bVar = this.v;
        if (bVar != null) {
            this.b = bVar.e();
        }
    }

    private int A() {
        int a = a("video_play_page.loading_timing", "layer.loading_timing", "endpage.loading_timing");
        if (a == 2) {
            return 3;
        }
        if (a == 3) {
            return 5;
        }
        if (a != 4) {
            return a;
        }
        return 10;
    }

    private int a(String str, String str2, String str3) {
        int i;
        LandingPageStyleConfig landingPageStyleConfig;
        str.getClass();
        i = 2;
        switch (str) {
            case "video_play_page.webview2_force_time":
                break;
            case "video_play_page.loading_timing":
            case "video_play_page.is_loading":
                i = 1;
                break;
            default:
                i = 0;
                break;
        }
        o oVar = this.b;
        if (oVar != null && (landingPageStyleConfig = this.a) != null) {
            int i2 = landingPageStyleConfig.c;
            if (i2 == 0) {
                return oVar.a(str);
            }
            if (i2 == 1) {
                return oVar.a(str3);
            }
            if (i2 == 9 || i2 == 10) {
                return oVar.a(str2);
            }
        }
        return i;
    }

    private void g() {
        ViewStub viewStub;
        View view;
        if (!this.f && z()) {
            if ((this.c == null || this.d == null) && (viewStub = (ViewStub) q(R.id.bigo_web_loading_container)) != null) {
                View inflate = viewStub.inflate();
                this.c = inflate;
                if (inflate != null) {
                    this.d = (ProgressBar) inflate.findViewById(R.id.bigo_ad_webview_loading_progress);
                }
            }
            View view2 = this.c;
            if (view2 != null) {
                view2.setVisibility(0);
                ProgressBar progressBar = this.d;
                if (progressBar != null) {
                    progressBar.setProgress(5);
                }
            }
            int A = A();
            if (A > 1 && (view = this.c) != null) {
                view.postDelayed(new Runnable() { // from class: sg.bigo.ads.q.e.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (sg.bigo.ads.d.c.a(e.this.u)) {
                            return;
                        }
                        e.this.h();
                    }
                }, A * 1000);
            }
            this.f = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        View view = this.c;
        if (view != null) {
            this.f = false;
            view.setVisibility(8);
        }
    }

    private boolean z() {
        return 1 == a("video_play_page.is_loading", "layer.is_loading", "endpage.is_loading");
    }

    @Override // sg.bigo.ads.controller.landing.c, sg.bigo.ads.core.landing.WebViewActivityImpl
    public void b() {
        super.b();
        g();
        if (d()) {
            ProgressBar progressBar = this.A;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            ImageView imageView = this.C;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            TextView textView = this.z;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
    }

    @Override // sg.bigo.ads.controller.landing.c, sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void c(int i) {
        super.c(i);
        ProgressBar progressBar = this.d;
        if (progressBar == null || i <= 5) {
            return;
        }
        if (i > 95) {
            i = 95;
        }
        progressBar.setProgress(i);
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final boolean d() {
        return 1 == a("video_play_page.support_browser", "layer.support_browser", "endpage.support_browser");
    }

    @Override // sg.bigo.ads.controller.landing.c, sg.bigo.ads.core.landing.WebViewActivityImpl
    public void a(String str) {
        super.a(str);
        if (this.c == null || A() > 1) {
            return;
        }
        h();
    }

    @Override // sg.bigo.ads.controller.landing.c, sg.bigo.ads.core.landing.WebViewActivityImpl
    public void a(String str, boolean z) {
        g();
        super.a(str, z);
        if (this.g) {
            this.g = false;
            return;
        }
        this.y = true;
        r();
        int a = a("video_play_page.webview2_force_time", "layer.webview2_force_time", "endpage.webview2_force_time");
        if (a == 1 || a == 2 || a == 3 || a == 4) {
            this.x = a + 1;
        } else {
            this.x = 0;
        }
        y();
    }
}
