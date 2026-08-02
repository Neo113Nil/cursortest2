package xsna;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.my.target.common.MyTargetActivity;
import com.unity3d.services.UnityAdsConstants;
import java.net.URI;
import xsna.c1z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class tiz0 extends LinearLayout {
    public static final int o = View.generateViewId();
    public static final int p = View.generateViewId();
    public final c1z0 b;
    public final ImageButton c;
    public final LinearLayout d;
    public final TextView e;
    public final TextView f;
    public final FrameLayout g;
    public final View h;
    public final FrameLayout i;
    public final ImageButton j;
    public final RelativeLayout k;
    public final lyy0 l;
    public final ProgressBar m;
    public d n;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            webView.loadUrl(str);
            tiz0.this.e.setText(tiz0.a(str));
            return true;
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class b extends WebChromeClient {
        public b() {
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i) {
            tiz0 tiz0Var = tiz0.this;
            if (i < 100 && tiz0Var.m.getVisibility() == 8) {
                tiz0Var.m.setVisibility(0);
                tiz0Var.h.setVisibility(8);
            }
            tiz0Var.m.setProgress(i);
            if (i >= 100) {
                tiz0Var.m.setVisibility(8);
                tiz0Var.h.setVisibility(0);
            }
        }

        @Override // android.webkit.WebChromeClient
        public final void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
            tiz0 tiz0Var = tiz0.this;
            tiz0Var.f.setText(webView.getTitle());
            tiz0Var.f.setVisibility(0);
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            tiz0 tiz0Var = tiz0.this;
            if (view == tiz0Var.c) {
                d dVar = tiz0Var.n;
                if (dVar != null) {
                    dVar.a();
                    return;
                }
                return;
            }
            if (view == tiz0Var.j) {
                String url = tiz0Var.l.getUrl();
                if (TextUtils.isEmpty(url)) {
                    return;
                }
                try {
                    Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(url));
                    if (!(tiz0Var.getContext() instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    tiz0Var.getContext().startActivity(intent);
                } catch (Throwable unused) {
                    wga0.b("WebViewBrowser: Unable to open url ", url, null);
                }
            }
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public interface d {
        void a();
    }

    public tiz0(MyTargetActivity myTargetActivity) {
        super(myTargetActivity);
        this.k = new RelativeLayout(myTargetActivity);
        this.l = new lyy0(myTargetActivity);
        this.c = new ImageButton(myTargetActivity);
        this.d = new LinearLayout(myTargetActivity);
        this.e = new TextView(myTargetActivity);
        this.f = new TextView(myTargetActivity);
        this.g = new FrameLayout(myTargetActivity);
        this.i = new FrameLayout(myTargetActivity);
        this.j = new ImageButton(myTargetActivity);
        this.m = new ProgressBar(myTargetActivity, null, R.attr.progressBarStyleHorizontal);
        this.h = new View(myTargetActivity);
        this.b = new c1z0(myTargetActivity);
    }

    public static String a(String str) {
        try {
            URI uri = new URI(str);
            return uri.getScheme() + "://" + uri.getHost();
        } catch (Throwable th) {
            th.printStackTrace();
            return str;
        }
    }

    public final void b() {
        lyy0 lyy0Var = this.l;
        WebSettings settings = lyy0Var.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(true);
            settings.setBuiltInZoomControls(true);
            settings.setDisplayZoomControls(false);
            settings.setAllowFileAccessFromFileURLs(false);
            settings.setAllowUniversalAccessFromFileURLs(false);
            settings.setDomStorageEnabled(true);
        }
        lyy0Var.setWebViewClient(new a());
        lyy0Var.setWebChromeClient(new b());
        setOrientation(1);
        setGravity(16);
        c cVar = new c();
        lyy0Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        TypedValue typedValue = new TypedValue();
        c1z0 c1z0Var = this.b;
        int b2 = c1z0Var.b(50);
        if (getContext().getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            b2 = TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, b2);
        RelativeLayout relativeLayout = this.k;
        relativeLayout.setLayoutParams(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(b2, b2);
        FrameLayout frameLayout = this.g;
        frameLayout.setLayoutParams(layoutParams2);
        int i = o;
        frameLayout.setId(i);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams3.gravity = 17;
        ImageButton imageButton = this.c;
        imageButton.setLayoutParams(layoutParams3);
        int i2 = b2 / 4;
        float f = 2;
        int b3 = c1z0Var.b(f);
        Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setStrokeWidth(b3);
        paint.setAntiAlias(true);
        paint.setColor(-7829368);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setStyle(Paint.Style.STROKE);
        float f2 = i2;
        canvas.drawLine(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, f2, paint);
        canvas.drawLine(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paint);
        imageButton.setImageBitmap(createBitmap);
        imageButton.setContentDescription("Close");
        imageButton.setOnClickListener(cVar);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(b2, b2);
        layoutParams4.addRule(21);
        FrameLayout frameLayout2 = this.i;
        frameLayout2.setLayoutParams(layoutParams4);
        int i3 = p;
        frameLayout2.setId(i3);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams5.gravity = 17;
        ImageButton imageButton2 = this.j;
        imageButton2.setLayoutParams(layoutParams5);
        getContext();
        byte[] decode = Base64.decode("iVBORw0KGgoAAAANSUhEUgAAAGAAAABgCAQAAABIkb+zAAAAAmJLR0QAAKqNIzIAAAAJcEhZcwAACxMAAAsTAQCanBgAAAAHdElNRQfgAR0KGztQKbC4AAAA8UlEQVR42u2aQQ6EMAzE6IhH8wR+DfeVoCAySRfs82plQ0FNxTQBAAAAAMBXab0frFut4NIeBFTLX4lo4+ufJ+i1z8BI1//sHvz9HSCAAAIIIIAAAiqZo/bl0Vzdi7GECCCAAAJGDlg392wtr77/eEBufXeC/PreBGXoOxOUo+9LUJa+K0F5+p4EZeo7EpSrH5+gbP3oBOXrxyaoQj8yQTX6cQmq0o9KUJ1+TML89A+Ozot+1VznSkxkBBBAAAEEEEAAAQQQ4J8HeqPH3f3+UDMxS4iAgDXt5cVf7iruvVJx/Tuv0aWN//k9AAAAAAB8lx0xVUXCRDTw+wAAAABJRU5ErkJggg==", 0);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = 640;
        options.inTargetDensity = c1z0.a.b;
        imageButton2.setImageBitmap(BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
        imageButton2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageButton2.setContentDescription("Open outside");
        imageButton2.setOnClickListener(cVar);
        c1z0.h(imageButton, 0, -3355444);
        c1z0.h(imageButton2, 0, -3355444);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(15, -1);
        layoutParams6.addRule(1, i);
        layoutParams6.addRule(0, i3);
        LinearLayout linearLayout = this.d;
        linearLayout.setLayoutParams(layoutParams6);
        linearLayout.setOrientation(1);
        float f3 = 4;
        linearLayout.setPadding(c1z0Var.b(f3), c1z0Var.b(f3), c1z0Var.b(f3), c1z0Var.b(f3));
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, -2);
        TextView textView = this.f;
        textView.setVisibility(8);
        textView.setLayoutParams(layoutParams7);
        textView.setTextColor(-16777216);
        textView.setTextSize(2, 18.0f);
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MIDDLE;
        textView.setEllipsize(truncateAt);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-2, -2);
        TextView textView2 = this.e;
        textView2.setLayoutParams(layoutParams8);
        textView2.setSingleLine();
        textView2.setTextSize(2, 12.0f);
        textView2.setEllipsize(truncateAt);
        ClipDrawable clipDrawable = new ClipDrawable(new ColorDrawable(-16537100), 8388611, 1);
        ColorDrawable colorDrawable = new ColorDrawable(-1968642);
        ProgressBar progressBar = this.m;
        LayerDrawable layerDrawable = (LayerDrawable) progressBar.getProgressDrawable();
        layerDrawable.setDrawableByLayerId(R.id.background, colorDrawable);
        layerDrawable.setDrawableByLayerId(R.id.progress, clipDrawable);
        progressBar.setProgressDrawable(layerDrawable);
        progressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, c1z0Var.b(f)));
        progressBar.setProgress(0);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        frameLayout.addView(imageButton);
        frameLayout2.addView(imageButton2);
        relativeLayout.addView(frameLayout);
        relativeLayout.addView(linearLayout);
        relativeLayout.addView(frameLayout2);
        addView(relativeLayout);
        View view = this.h;
        view.setBackgroundColor(-5592406);
        ViewGroup.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-1, 1);
        view.setVisibility(8);
        view.setLayoutParams(layoutParams9);
        addView(progressBar);
        addView(view);
        addView(lyy0Var);
    }

    public void setListener(@Nullable d dVar) {
        this.n = dVar;
    }

    public void setUrl(@NonNull String str) {
        this.l.b(str);
        this.e.setText(a(str));
    }
}
