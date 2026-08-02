package sg.bigo.ads.dm;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.MotionEvent;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import sg.bigo.ads.common.utils.v;

/* loaded from: classes9.dex */
public class e extends WebView {
    private a a;
    private final Handler b;
    private Runnable c;
    protected volatile boolean j;

    public interface a {
        void a(MotionEvent motionEvent);
    }

    public e(Context context) {
        super(context);
        this.b = new Handler(Looper.getMainLooper());
        getSettings().setJavaScriptEnabled(true);
        getSettings().setDomStorageEnabled(true);
        getSettings().setMixedContentMode(0);
    }

    @Nullable
    public static e a(@NonNull Context context) {
        try {
            return new e(context.getApplicationContext());
        } catch (Exception e) {
            sg.bigo.ads.da.b.a(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, 10100, Log.getStackTraceString(e));
            return null;
        }
    }

    public static /* synthetic */ Runnable b(e eVar) {
        eVar.c = null;
        return null;
    }

    @Override // android.webkit.WebView
    public void destroy() {
        if (this.j) {
            return;
        }
        this.j = true;
        setWebChromeClient(null);
        setWebViewClient(null);
        Runnable runnable = new Runnable() { // from class: sg.bigo.ads.dm.e.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    e.this.stopLoading();
                    v.b(e.this);
                    e.this.removeAllViews();
                    e.super.destroy();
                } catch (Throwable unused) {
                }
                e.b(e.this);
            }
        };
        this.c = runnable;
        this.b.postDelayed(runnable, 100L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.a(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setOnWebViewTouchListener(a aVar) {
        this.a = aVar;
    }
}
