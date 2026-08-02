package com.yandex.go.platform.di;

import android.app.Activity;
import android.content.Context;
import android.webkit.WebView;
import com.yandex.go.platform.js_api.JsNativeApi;
import com.yandex.go.platform.js_api.f;
import com.yandex.go.platform.js_api.g;
import com.yandex.go.platform.js_api.h;
import defpackage.b60;
import defpackage.blv;
import defpackage.ccp0;
import defpackage.ci41;
import defpackage.d5c;
import defpackage.fk;
import defpackage.gyc;
import defpackage.i32;
import defpackage.i3y;
import defpackage.io9;
import defpackage.ivc0;
import defpackage.kb;
import defpackage.l50;
import defpackage.lb20;
import defpackage.obx;
import defpackage.pa50;
import defpackage.pbx;
import defpackage.qbx;
import defpackage.sls;
import defpackage.sma0;
import defpackage.ss2;
import defpackage.t3g;
import defpackage.tse;
import defpackage.uax;
import defpackage.vr;
import defpackage.zch;
import java.util.List;

/* loaded from: classes13.dex */
public final class a {
    public final t3g a;
    public final i3y b;
    public final kb e;
    public final com.yandex.go.platform.js_api.c f;
    public final i3y h;
    public final i3y c = kotlin.a.a(new sls() { // from class: com.yandex.go.platform.di.JsNativeComponent$paymentsHandler$2
        {
            super(0);
        }

        @Override // defpackage.sls
        public final Object invoke() {
            t3g t3gVar = a.this.a;
            return new f((sma0) t3gVar.m, (i32) t3gVar.d);
        }
    });
    public final i3y d = kotlin.a.a(new sls() { // from class: com.yandex.go.platform.di.JsNativeComponent$storageHandler$2
        {
            super(0);
        }

        @Override // defpackage.sls
        public final Object invoke() {
            return new pbx(new io9(new vr((Context) a.this.a.f, 15)));
        }
    });
    public final i3y g = kotlin.a.a(new sls() { // from class: com.yandex.go.platform.di.JsNativeComponent$jsSharingHandler$2
        {
            super(0);
        }

        @Override // defpackage.sls
        public final Object invoke() {
            t3g t3gVar = a.this.a;
            return new obx((Activity) t3gVar.e, (lb20) t3gVar.c);
        }
    });
    public final i3y i = kotlin.a.a(new sls() { // from class: com.yandex.go.platform.di.JsNativeComponent$jsNavigationHandler$2
        {
            super(0);
        }

        @Override // defpackage.sls
        public final Object invoke() {
            t3g t3gVar = a.this.a;
            return new uax((Activity) t3gVar.e, (sls) t3gVar.q, (pa50) t3gVar.x);
        }
    });
    public final i3y j = kotlin.a.a(new sls() { // from class: com.yandex.go.platform.di.JsNativeComponent$contactPickerHandler$2
        {
            super(0);
        }

        @Override // defpackage.sls
        public final Object invoke() {
            t3g t3gVar = a.this.a;
            return new com.yandex.go.platform.js_api.contact.b(new gyc((b60) t3gVar.h), (l50) t3gVar.a, (Context) t3gVar.f);
        }
    });
    public final i3y k = kotlin.a.a(new sls() { // from class: com.yandex.go.platform.di.JsNativeComponent$jsNativeApi$2
        {
            super(0);
        }

        @Override // defpackage.sls
        public final Object invoke() {
            a aVar = a.this;
            tse tseVar = (tse) aVar.a.b;
            com.yandex.go.platform.js_api.contact.b bVar = (com.yandex.go.platform.js_api.contact.b) aVar.j.getValue();
            g gVar = (g) a.this.b.getValue();
            a aVar2 = a.this;
            fk fkVar = (fk) aVar2.a.j;
            f fVar = (f) aVar2.c.getValue();
            pbx pbxVar = (pbx) a.this.d.getValue();
            obx obxVar = (obx) a.this.g.getValue();
            h hVar = (h) a.this.h.getValue();
            uax uaxVar = (uax) a.this.i.getValue();
            a aVar3 = a.this;
            com.yandex.go.platform.js_api.c cVar = aVar3.f;
            t3g t3gVar = aVar3.a;
            WebView webView = (WebView) t3gVar.g;
            zch zchVar = (zch) t3gVar.l;
            i32 i32Var = (i32) t3gVar.d;
            kb kbVar = aVar3.e;
            ss2 ss2Var = (ss2) t3gVar.k;
            lb20 lb20Var = (lb20) t3gVar.c;
            return new JsNativeApi((Activity) t3gVar.e, tseVar, bVar, gVar, fkVar, fVar, pbxVar, uaxVar, obxVar, hVar, cVar, webView, zchVar, i32Var, kbVar, ss2Var, (com.yandex.taxi.go_platform.delegates.c) t3gVar.n, lb20Var, (blv) t3gVar.o, (com.yandex.go.platform.sdk.models.a) t3gVar.p, (ivc0) t3gVar.r, (d5c) t3gVar.s, (ccp0) t3gVar.u, (List) t3gVar.v);
        }
    });
    public final i3y l = kotlin.a.a(new sls() { // from class: com.yandex.go.platform.di.JsNativeComponent$jsWebApi$2
        {
            super(0);
        }

        @Override // defpackage.sls
        public final Object invoke() {
            return new qbx((WebView) a.this.a.g);
        }
    });

    public a(final com.yandex.go.platform.utils.a aVar, t3g t3gVar) {
        this.a = t3gVar;
        this.b = kotlin.a.a(new sls(this) { // from class: com.yandex.go.platform.di.JsNativeComponent$jsPermissionsHandler$2
            final /* synthetic */ a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                com.yandex.go.platform.utils.a aVar2 = aVar;
                t3g t3gVar2 = this.this$0.a;
                return new g(aVar2, (fk) t3gVar2.j, (lb20) t3gVar2.c);
            }
        });
        this.e = (kb) t3gVar.i;
        this.f = new com.yandex.go.platform.js_api.c((ci41) t3gVar.t);
        this.h = kotlin.a.a(new sls() { // from class: com.yandex.go.platform.di.JsNativeComponent$jsSavingHandler$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                t3g t3gVar2 = a.this.a;
                return new h((Activity) t3gVar2.e, (lb20) t3gVar2.c, (String) t3gVar2.w);
            }
        });
    }
}
