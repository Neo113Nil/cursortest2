package ru.ok.android.sdk;

import android.view.View;
import java.util.HashMap;

/* compiled from: OkAppSuggestActivity.kt */
/* loaded from: classes9.dex */
public final class OkAppSuggestActivity extends OkAppInviteActivity {
    private HashMap _$_findViewCache;

    @Override // ru.ok.android.sdk.OkAppInviteActivity, ru.ok.android.sdk.AbstractWidgetActivity
    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // ru.ok.android.sdk.OkAppInviteActivity, ru.ok.android.sdk.AbstractWidgetActivity
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

    @Override // ru.ok.android.sdk.OkAppInviteActivity, ru.ok.android.sdk.AbstractWidgetActivity
    public int getCancelledMessageId() {
        return R.string.suggest_canceled;
    }

    @Override // ru.ok.android.sdk.OkAppInviteActivity, ru.ok.android.sdk.AbstractWidgetActivity
    public String getWidgetId() {
        return "WidgetSuggest";
    }
}
