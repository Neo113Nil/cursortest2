package com.yandex.plus.home.api.config;

import defpackage.vuu0;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import java.io.Serializable;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0016\u0018\u00002\u00020\u0001R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR$\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR$\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0004\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\bR$\u0010\u001f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u000b\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u000f¨\u0006\""}, d2 = {"Lcom/yandex/plus/home/api/config/PlusHomeBundle;", "Ljava/io/Serializable;", "", "settingId", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "p", "(Ljava/lang/String;)V", "", "isSettingTurnedOn", "Ljava/lang/Boolean;", CoreConstants.PushMessage.PROCESSING_MIN_TIME, "()Ljava/lang/Boolean;", "q", "(Ljava/lang/Boolean;)V", "homeUrl", "c", "m", "homeAuthCallbackUrl", "b", "l", "storiesUrl", CoreConstants.PushMessage.SERVICE_TYPE, "s", "storiesAuthCallbackUrl", "h", "r", "activeTrackId", "a", "k", "hostPayResult", "f", "n", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public class PlusHomeBundle implements Serializable {
    private static final long serialVersionUID = 1;
    private String activeTrackId;
    private String homeAuthCallbackUrl;
    private String homeUrl;
    private Boolean hostPayResult;
    private Boolean isSettingTurnedOn;
    private String settingId;
    private String storiesAuthCallbackUrl;
    private String storiesUrl;

    public PlusHomeBundle(int i) {
        this.settingId = null;
        this.isSettingTurnedOn = null;
        this.homeUrl = null;
        this.homeAuthCallbackUrl = null;
        this.storiesUrl = null;
        this.storiesAuthCallbackUrl = null;
        this.activeTrackId = null;
        this.hostPayResult = null;
    }

    /* renamed from: a, reason: from getter */
    public final String getActiveTrackId() {
        return this.activeTrackId;
    }

    /* renamed from: b, reason: from getter */
    public final String getHomeAuthCallbackUrl() {
        return this.homeAuthCallbackUrl;
    }

    /* renamed from: c, reason: from getter */
    public final String getHomeUrl() {
        return this.homeUrl;
    }

    /* renamed from: f, reason: from getter */
    public final Boolean getHostPayResult() {
        return this.hostPayResult;
    }

    /* renamed from: g, reason: from getter */
    public final String getSettingId() {
        return this.settingId;
    }

    /* renamed from: h, reason: from getter */
    public final String getStoriesAuthCallbackUrl() {
        return this.storiesAuthCallbackUrl;
    }

    /* renamed from: i, reason: from getter */
    public final String getStoriesUrl() {
        return this.storiesUrl;
    }

    /* renamed from: j, reason: from getter */
    public final Boolean getIsSettingTurnedOn() {
        return this.isSettingTurnedOn;
    }

    public final void k(String str) {
        this.activeTrackId = str;
    }

    public final void l(String str) {
        this.homeAuthCallbackUrl = str;
    }

    public final void m(String str) {
        this.homeUrl = str;
    }

    public final void n(Boolean bool) {
        this.hostPayResult = bool;
    }

    public final void p(String str) {
        this.settingId = str;
    }

    public final void q(Boolean bool) {
        this.isSettingTurnedOn = bool;
    }

    public final void r(String str) {
        this.storiesAuthCallbackUrl = str;
    }

    public final void s(String str) {
        this.storiesUrl = str;
    }

    public final String toString() {
        return vuu0.c("PlusHomeBundle(\n                settingId=" + this.settingId + " \n                isSettingTurnedOn=" + this.isSettingTurnedOn + " \n                homeUrl=" + this.homeUrl + " \n                homeAuthCallbackUrl=" + this.homeAuthCallbackUrl + " \n                storiesUrl=" + this.storiesUrl + " \n                storiesAuthCallbackUrl=" + this.storiesAuthCallbackUrl + "\n                activeTrackId=" + this.activeTrackId + "\n                hostPayResult=" + this.hostPayResult + "\n        )");
    }

    public PlusHomeBundle() {
        this(0);
    }
}
