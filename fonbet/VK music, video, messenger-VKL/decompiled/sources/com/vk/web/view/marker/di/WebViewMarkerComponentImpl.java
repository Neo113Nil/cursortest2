package com.vk.web.view.marker.di;

import com.vk.di.component.DiUnscopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.ajx0;
import xsna.b7m;
import xsna.cjx0;
import xsna.e7m;
import xsna.fp;
import xsna.fpf0;
import xsna.ltb0;
import xsna.nwy;
import xsna.pkd0;
import xsna.qcy;

/* compiled from: WebViewMarkerComponentImpl.kt */
/* loaded from: classes7.dex */
public final class WebViewMarkerComponentImpl implements WebViewMarkerComponent {
    public static final /* synthetic */ qcy<Object>[] c = {new PropertyReference1Impl(WebViewMarkerComponentImpl.class, "setting", "getSetting()Lcom/vk/web/view/marker/WebViewMarkerSetting;", 0), fp.c(0, WebViewMarkerComponentImpl.class, "viewProvider", "getViewProvider()Lcom/vk/web/view/marker/WebViewMarkerViewProvider;", fpf0.a)};
    public final nwy a = new nwy(new pkd0(15));
    public final nwy b = new nwy(new ltb0(21));

    /* compiled from: WebViewMarkerComponentImpl.kt */
    public static final class a implements b7m<WebViewMarkerComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new WebViewMarkerComponentImpl();
        }
    }

    @Override // com.vk.web.view.marker.di.WebViewMarkerComponent
    public final cjx0 Z() {
        qcy<Object> qcyVar = c[1];
        return (cjx0) this.b.c();
    }

    @Override // com.vk.web.view.marker.di.WebViewMarkerComponent
    public final ajx0 m7() {
        qcy<Object> qcyVar = c[0];
        return (ajx0) this.a.c();
    }
}
