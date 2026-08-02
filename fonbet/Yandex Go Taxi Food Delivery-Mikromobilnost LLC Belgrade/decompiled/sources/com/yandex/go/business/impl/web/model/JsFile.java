package com.yandex.go.business.impl.web.model;

import com.yandex.go.business.impl.web.model.JsFile;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.qje;
import defpackage.sls;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/business/impl/web/model/JsFile;", "", "Companion", "$serializer", "com/yandex/go/business/impl/web/model/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class JsFile {
    public static final a Companion = new a();
    public final String a;
    public final String b;
    public final String c;
    public final i3y d;

    public /* synthetic */ JsFile(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, JsFile$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        final int i2 = 0;
        this.d = kotlin.a.a(new sls(this) { // from class: pax
            public final /* synthetic */ JsFile b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i2;
                JsFile jsFile = this.b;
                switch (i3) {
                }
                return cw4.a(cw4.d, jsFile.a, 0, 6);
            }
        });
    }

    public JsFile() {
        this.a = "";
        this.b = "";
        this.c = "";
        final int i = 1;
        this.d = kotlin.a.a(new sls(this) { // from class: pax
            public final /* synthetic */ JsFile b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i;
                JsFile jsFile = this.b;
                switch (i3) {
                }
                return cw4.a(cw4.d, jsFile.a, 0, 6);
            }
        });
    }
}
