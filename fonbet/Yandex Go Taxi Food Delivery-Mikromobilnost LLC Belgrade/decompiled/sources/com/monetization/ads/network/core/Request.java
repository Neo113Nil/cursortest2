package com.monetization.ads.network.core;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import defpackage.ab71;
import defpackage.dy61;
import defpackage.et81;
import defpackage.g8e;
import defpackage.gb81;
import defpackage.km81;
import defpackage.nv71;
import defpackage.ny61;
import defpackage.wf81;
import defpackage.zs71;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCP.tools.LicenseUtility;
import yads.jk3;
import yads.kk;

/* loaded from: classes7.dex */
public abstract class Request<T> implements Comparable<Request<T>> {
    private et81 mCacheEntry;
    private boolean mCanceled;
    private final int mDefaultTrafficStatsTag;
    private wf81 mErrorListener;
    private final zs71 mEventLog;
    private final Object mLock;
    private final int mMethod;
    private h mRequestCompleteListener;
    private dy61 mRequestQueue;
    private boolean mResponseDelivered;
    private ab71 mRetryPolicy;
    private Integer mSequence;
    private boolean mShouldCache;
    private boolean mShouldRetryConnectionErrors;
    private boolean mShouldRetryServerErrors;
    private Object mTag;
    private final String mUrl;

    public Request(int i, String str, wf81 wf81Var) {
        this.mEventLog = zs71.c ? new zs71() : null;
        this.mLock = new Object();
        this.mShouldCache = true;
        this.mCanceled = false;
        this.mResponseDelivered = false;
        this.mShouldRetryServerErrors = false;
        this.mShouldRetryConnectionErrors = false;
        this.mCacheEntry = null;
        this.mMethod = i;
        this.mUrl = str;
        this.mErrorListener = wf81Var;
        setRetryPolicy(new nv71());
        this.mDefaultTrafficStatsTag = findDefaultTrafficStatsTag(str);
    }

    private byte[] encodeParameters(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey() == null || entry.getValue() == null) {
                    throw new IllegalArgumentException(String.format("Request#getParams() or Request#getPostParams() returned a map containing a null key or value: (%s, %s). All keys and values must be non-null.", entry.getKey(), entry.getValue()));
                }
                sb.append(URLEncoder.encode(entry.getKey(), str));
                sb.append('=');
                sb.append(URLEncoder.encode(entry.getValue(), str));
                sb.append('&');
            }
            return sb.toString().getBytes(str);
        } catch (UnsupportedEncodingException e) {
            ny61.n(g8e.o("Encoding not supported: ", str), e);
            return null;
        }
    }

    private static int findDefaultTrafficStatsTag(String str) {
        Uri parse;
        String host;
        if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    public void addMarker(String str) {
        if (zs71.c) {
            zs71 zs71Var = this.mEventLog;
            Thread.currentThread().getId();
            zs71Var.a();
        }
    }

    public void cancel() {
        synchronized (this.mLock) {
            this.mCanceled = true;
            this.mErrorListener = null;
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(Request<T> request) {
        int ordinal;
        int ordinal2;
        i priority = getPriority();
        i priority2 = request.getPriority();
        if (priority == priority2) {
            ordinal = this.mSequence.intValue();
            ordinal2 = request.mSequence.intValue();
        } else {
            ordinal = priority2.ordinal();
            ordinal2 = priority.ordinal();
        }
        return ordinal - ordinal2;
    }

    public void deliverError(jk3 jk3Var) {
        wf81 wf81Var;
        synchronized (this.mLock) {
            wf81Var = this.mErrorListener;
        }
        if (wf81Var != null) {
            wf81Var.j(jk3Var);
        }
    }

    public abstract void deliverResponse(T t);

    public void finish(String str) {
        dy61 dy61Var = this.mRequestQueue;
        if (dy61Var != null) {
            synchronized (dy61Var.b) {
                dy61Var.b.remove(this);
            }
            synchronized (dy61Var.j) {
                Iterator it = dy61Var.j.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
            dy61Var.c(this, 5);
        }
        if (zs71.c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new g(this, str, id));
                return;
            }
            this.mEventLog.a();
            zs71 zs71Var = this.mEventLog;
            toString();
            zs71Var.b();
        }
    }

    public byte[] getBody() throws kk {
        Map<String, String> params = getParams();
        if (params == null || params.size() <= 0) {
            return null;
        }
        return encodeParameters(params, getParamsEncoding());
    }

    public String getBodyContentType() {
        return "application/x-www-form-urlencoded; charset=" + getParamsEncoding();
    }

    public et81 getCacheEntry() {
        return this.mCacheEntry;
    }

    public String getCacheKey() {
        String url = getUrl();
        int method = getMethod();
        if (method == 0 || method == -1) {
            return url;
        }
        return Integer.toString(method) + LicenseUtility.SEPARATOR + url;
    }

    public Map<String, String> getHeaders() throws kk {
        return Collections.EMPTY_MAP;
    }

    public int getMethod() {
        return this.mMethod;
    }

    public Map<String, String> getParams() throws kk {
        return null;
    }

    public String getParamsEncoding() {
        return "UTF-8";
    }

    @Deprecated
    public byte[] getPostBody() throws kk {
        Map<String, String> postParams = getPostParams();
        if (postParams == null || postParams.size() <= 0) {
            return null;
        }
        return encodeParameters(postParams, getPostParamsEncoding());
    }

    @Deprecated
    public Map<String, String> getPostParams() throws kk {
        return getParams();
    }

    @Deprecated
    public String getPostParamsEncoding() {
        return getParamsEncoding();
    }

    public i getPriority() {
        return i.NORMAL;
    }

    public ab71 getRetryPolicy() {
        return this.mRetryPolicy;
    }

    public Object getTag() {
        return this.mTag;
    }

    public final int getTimeoutMs() {
        return ((nv71) getRetryPolicy()).a;
    }

    public int getTrafficStatsTag() {
        return this.mDefaultTrafficStatsTag;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public boolean hasHadResponseDelivered() {
        boolean z;
        synchronized (this.mLock) {
            z = this.mResponseDelivered;
        }
        return z;
    }

    public boolean isCanceled() {
        boolean z;
        synchronized (this.mLock) {
            z = this.mCanceled;
        }
        return z;
    }

    public void markDelivered() {
        synchronized (this.mLock) {
            this.mResponseDelivered = true;
        }
    }

    public void notifyListenerResponseNotUsable() {
        h hVar;
        synchronized (this.mLock) {
            hVar = this.mRequestCompleteListener;
        }
        if (hVar != null) {
            ((j) hVar).b(this);
        }
    }

    public void notifyListenerResponseReceived(km81 km81Var) {
        h hVar;
        synchronized (this.mLock) {
            hVar = this.mRequestCompleteListener;
        }
        if (hVar != null) {
            ((j) hVar).a(this, km81Var);
        }
    }

    public jk3 parseNetworkError(jk3 jk3Var) {
        return jk3Var;
    }

    public abstract km81 parseNetworkResponse(gb81 gb81Var);

    public void sendEvent(int i) {
        dy61 dy61Var = this.mRequestQueue;
        if (dy61Var != null) {
            dy61Var.c(this, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Request<?> setCacheEntry(et81 et81Var) {
        this.mCacheEntry = et81Var;
        return this;
    }

    public void setNetworkRequestCompleteListener(h hVar) {
        synchronized (this.mLock) {
            this.mRequestCompleteListener = hVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Request<?> setRequestQueue(dy61 dy61Var) {
        this.mRequestQueue = dy61Var;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Request<?> setRetryPolicy(ab71 ab71Var) {
        this.mRetryPolicy = ab71Var;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Request<?> setSequence(int i) {
        this.mSequence = Integer.valueOf(i);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Request<?> setShouldCache(boolean z) {
        this.mShouldCache = z;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Request<?> setShouldRetryConnectionErrors(boolean z) {
        this.mShouldRetryConnectionErrors = z;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Request<?> setShouldRetryServerErrors(boolean z) {
        this.mShouldRetryServerErrors = z;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Request<?> setTag(Object obj) {
        this.mTag = obj;
        return this;
    }

    public final boolean shouldCache() {
        return this.mShouldCache;
    }

    public final boolean shouldRetryConnectionErrors() {
        return this.mShouldRetryConnectionErrors;
    }

    public final boolean shouldRetryServerErrors() {
        return this.mShouldRetryServerErrors;
    }

    public String toString() {
        String str = HexString.STR_0x + Integer.toHexString(getTrafficStatsTag());
        StringBuilder sb = new StringBuilder();
        sb.append(isCanceled() ? "[X] " : "[ ] ");
        sb.append(getUrl());
        sb.append(" ");
        sb.append(str);
        sb.append(" ");
        sb.append(getPriority());
        sb.append(" ");
        sb.append(this.mSequence);
        return sb.toString();
    }
}
