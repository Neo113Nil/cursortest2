package ru.ok.android.sdk;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.sdk.AbstractWidgetActivity;

/* compiled from: OkPostingActivity.kt */
/* loaded from: classes9.dex */
public final class OkPostingActivity extends AbstractWidgetActivity {
    private HashMap _$_findViewCache;

    @SuppressLint({"SetJavaScriptEnabled"})
    private final void prepareWebView() {
        WebView webView = (WebView) findViewById(R.id.web_view);
        webView.setWebViewClient(new AbstractWidgetActivity.OkWidgetViewClient(this));
        webView.getSettings().setJavaScriptEnabled(true);
    }

    @Override // ru.ok.android.sdk.AbstractWidgetActivity
    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // ru.ok.android.sdk.AbstractWidgetActivity
    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // ru.ok.android.sdk.AbstractWidgetActivity
    public int getCancelledMessageId() {
        return R.string.posting_canceled;
    }

    @Override // ru.ok.android.sdk.AbstractWidgetActivity
    public String getWidgetId() {
        return "WidgetMediatopicPost";
    }

    @Override // ru.ok.android.sdk.AbstractWidgetActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        prepareWebView();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            HashMap<String, String> args = getArgs();
            String string = extras.getString(SharedKt.PARAM_ATTACHMENT);
            if (string == null) {
                string = "{}";
            }
            args.put("st.attachment", string);
            getArgs().put("st.utext", extras.getBoolean(SharedKt.PARAM_USER_TEXT_ENABLE, false) ? "on" : "off");
        }
        ((WebView) findViewById(R.id.web_view)).loadUrl(prepareUrl(null));
    }

    @Override // ru.ok.android.sdk.AbstractWidgetActivity
    public void processResult(String str) {
        Intent intent = new Intent();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if ("error".equals(jSONObject.getString("type"))) {
                intent.putExtra("error", jSONObject.getString("message"));
            } else {
                intent.putExtra("result", jSONObject.toString());
            }
        } catch (JSONException unused) {
            intent.putExtra("error", str);
        }
        setResult(-1, intent);
        finish();
    }
}
