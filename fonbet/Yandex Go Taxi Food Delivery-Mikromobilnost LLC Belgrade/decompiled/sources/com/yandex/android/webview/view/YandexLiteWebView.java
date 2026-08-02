package com.yandex.android.webview.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import defpackage.bvb;
import defpackage.by60;
import defpackage.m070;
import defpackage.nhs0;
import defpackage.nr41;
import defpackage.ny61;
import defpackage.u690;
import defpackage.v690;
import defpackage.yz60;
import defpackage.z83;
import defpackage.zz60;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public class YandexLiteWebView extends WebView {
    private boolean mCanSetOnLongClickListener;
    private int mContentHeight;
    private GestureDetector mGestureDetector;
    private boolean mIsDestroyed;
    private v690 mLongClickHandler;
    private by60 mOnContentHeightChangedCallback;
    private yz60 mOnOverScrollListener;
    private final nhs0 mOnScrollListeners;
    private u690 mPageClickSource;
    private v690 mSingleClickHandler;

    public YandexLiteWebView(Context context) {
        super(context);
        this.mOnScrollListeners = new nhs0();
        this.mCanSetOnLongClickListener = false;
        init();
    }

    private boolean canCallSuper() {
        return true;
    }

    private boolean checkDestroyed() {
        if (!isDestroyed()) {
            return false;
        }
        z83.j("Stop touching me after destroying.");
        return true;
    }

    private u690 getPageClickSource() {
        u690 u690Var = this.mPageClickSource;
        if (u690Var != null) {
            return u690Var;
        }
        nr41 nr41Var = new nr41(4, this);
        this.mPageClickSource = nr41Var;
        return nr41Var;
    }

    private void init() {
        setFocusableInTouchMode(true);
        setFocusable(true);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setBuiltInZoomControls(true);
        getSettings().setDisplayZoomControls(false);
        getSettings().setDomStorageEnabled(true);
    }

    private void updateGestureDetector() {
        if (this.mSingleClickHandler == null && this.mLongClickHandler == null) {
            this.mGestureDetector = null;
            return;
        }
        GestureDetector gestureDetector = new GestureDetector(getContext(), new GestureDetector.OnGestureListener() { // from class: com.yandex.android.webview.view.YandexLiteWebView.2
            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onDown(MotionEvent motionEvent) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent motionEvent) {
                if (YandexLiteWebView.this.mLongClickHandler == null) {
                    return;
                }
                ((YandexLiteWebView) ((nr41) YandexLiteWebView.this.mLongClickHandler.a).b).isDestroyed();
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public void onShowPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                if (YandexLiteWebView.this.mSingleClickHandler == null) {
                    return false;
                }
                ((YandexLiteWebView) ((nr41) YandexLiteWebView.this.mSingleClickHandler.a).b).isDestroyed();
                return true;
            }
        });
        this.mGestureDetector = gestureDetector;
        gestureDetector.setIsLongpressEnabled(this.mLongClickHandler != null);
    }

    public void addOnScrollListener(m070 m070Var) {
        ArrayList arrayList = this.mOnScrollListeners.a;
        if (m070Var == null || arrayList.contains(m070Var)) {
            return;
        }
        arrayList.add(m070Var);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        if (checkDestroyed()) {
            return;
        }
        this.mIsDestroyed = true;
        if (this.mLongClickHandler != null) {
            this.mLongClickHandler = null;
        }
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this);
        }
        setWebChromeClient(null);
        setWebViewClient(null);
        setOnContentHeightChangedCallback(null);
        nhs0 nhs0Var = this.mOnScrollListeners;
        nhs0Var.getClass();
        int i = nhs0Var.b;
        ArrayList arrayList = nhs0Var.a;
        if (i == 0) {
            arrayList.clear();
        } else {
            int size = arrayList.size();
            nhs0Var.c = (size != 0) | nhs0Var.c;
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.set(i2, null);
            }
        }
        setOnOverScrollListener(null);
        loadUrl("about:blank");
        stopLoading();
        onPause();
        clearHistory();
        setVisibility(8);
        removeAllViews();
        destroyDrawingCache();
        super.destroy();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.mGestureDetector;
        if (gestureDetector == null || !gestureDetector.onTouchEvent(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            return true;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        try {
            obtain.setAction(3);
            super.dispatchTouchEvent(obtain);
            return true;
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchWindowVisibilityChanged(int i) {
        try {
            super.dispatchWindowVisibilityChanged(i);
        } catch (NullPointerException unused) {
        }
    }

    @Override // android.webkit.WebView
    public WebView.HitTestResult getHitTestResult() {
        if (isDestroyed()) {
            return null;
        }
        try {
            return super.getHitTestResult();
        } catch (NullPointerException e) {
            z83.k(null, e);
            return null;
        }
    }

    @Override // android.view.View
    public void invalidate() {
        int contentHeight;
        super.invalidate();
        if (isDestroyed() || (contentHeight = getContentHeight()) == this.mContentHeight) {
            return;
        }
        this.mContentHeight = contentHeight;
    }

    public boolean isDestroyed() {
        return this.mIsDestroyed;
    }

    @Override // android.webkit.WebView
    public void loadData(String str, String str2, String str3) {
        if (canCallSuper()) {
            super.loadData(str, str2, str3);
        }
        this.mContentHeight = 0;
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (canCallSuper()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
        this.mContentHeight = 0;
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        if (canCallSuper()) {
            try {
                super.loadUrl(str, map);
            } catch (UnsupportedOperationException unused) {
                super.loadUrl(str, new HashMap(map));
            }
        }
        this.mContentHeight = 0;
    }

    @Override // android.webkit.WebView, android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.onOverScrolled(i, i2, z, z2);
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        if (canCallSuper()) {
            super.onScrollChanged(i, i2, i3, i4);
            getContentHeight();
            getScale();
            getHeight();
            bvb bvbVar = (bvb) this.mOnScrollListeners.iterator();
            if (bvbVar.hasNext()) {
                bvbVar.next().getClass();
                ny61.u();
            }
        }
    }

    @Override // android.webkit.WebView
    public void pauseTimers() {
        if (canCallSuper()) {
            super.pauseTimers();
        }
    }

    @Override // android.webkit.WebView
    public void reload() {
        if (canCallSuper()) {
            super.reload();
        }
    }

    public void removeOnScrollListener(m070 m070Var) {
        int indexOf;
        nhs0 nhs0Var = this.mOnScrollListeners;
        ArrayList arrayList = nhs0Var.a;
        if (m070Var == null || (indexOf = arrayList.indexOf(m070Var)) == -1) {
            return;
        }
        if (nhs0Var.b == 0) {
            arrayList.remove(indexOf);
        } else {
            nhs0Var.c = true;
            arrayList.set(indexOf, null);
        }
    }

    public void setCanSetOnLongClickListener(boolean z) {
        this.mCanSetOnLongClickListener = z;
    }

    @Override // android.view.View
    public void setLongClickable(boolean z) {
        super.setLongClickable(z);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        z83.j("You do not want to use this");
    }

    public void setOnContentHeightChangedCallback(by60 by60Var) {
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        z83.h("You probably want setPageLongClickListener() instead", this.mCanSetOnLongClickListener);
        super.setOnLongClickListener(onLongClickListener);
    }

    public void setOnOverScrollListener(yz60 yz60Var) {
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        z83.j("You do not want to use this");
    }

    public void setPageLongClickListener(zz60 zz60Var) {
        if (zz60Var != null) {
            this.mLongClickHandler = new v690(getPageClickSource());
            super.setLongClickable(false);
        } else {
            this.mLongClickHandler = null;
            super.setLongClickable(true);
        }
        updateGestureDetector();
    }

    public void setPageSingleClickListener(zz60 zz60Var) {
        if (zz60Var != null) {
            this.mSingleClickHandler = new v690(getPageClickSource());
        } else {
            this.mSingleClickHandler = null;
        }
        updateGestureDetector();
    }

    public YandexLiteWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mOnScrollListeners = new nhs0();
        this.mCanSetOnLongClickListener = false;
        init();
    }

    public YandexLiteWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mOnScrollListeners = new nhs0();
        this.mCanSetOnLongClickListener = false;
        init();
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        if (canCallSuper()) {
            super.loadUrl(str);
        }
        this.mContentHeight = 0;
    }

    public YandexLiteWebView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mOnScrollListeners = new nhs0();
        this.mCanSetOnLongClickListener = false;
        init();
    }

    public YandexLiteWebView(Context context, AttributeSet attributeSet, int i, boolean z) {
        super(context, attributeSet, i, z);
        this.mOnScrollListeners = new nhs0();
        this.mCanSetOnLongClickListener = false;
        init();
    }
}
