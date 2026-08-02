package com.yandex.go.safety.center.api;

import com.yandex.go.safety.center.api.SafetyCenterConfig;
import com.yandex.go.safety.center.api.Sharing;
import com.yandex.go.safety.center.api.TrustedContacts;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.sls;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/safety/center/api/SafetyCenterConfig;", "", "Companion", "$serializer", "com/yandex/go/safety/center/api/f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SafetyCenterConfig {
    public static final f Companion = new f();
    public final Sharing a;
    public final String b;
    public final String c;
    public final i3y d;

    public /* synthetic */ SafetyCenterConfig(int i, Sharing sharing, String str, String str2) {
        final int i2 = 0;
        this.a = (i & 1) == 0 ? new Sharing(0) : sharing;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        this.d = kotlin.a.a(new sls(this) { // from class: rql0
            public final /* synthetic */ SafetyCenterConfig b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i2;
                SafetyCenterConfig safetyCenterConfig = this.b;
                switch (i3) {
                    case 0:
                        Sharing sharing2 = safetyCenterConfig.a;
                        return new TrustedContacts(sharing2.a, sharing2.b);
                    default:
                        Sharing sharing3 = safetyCenterConfig.a;
                        return new TrustedContacts(sharing3.a, sharing3.b);
                }
            }
        });
    }

    public SafetyCenterConfig() {
        this.a = new Sharing(0);
        this.b = "";
        this.c = "";
        final int i = 1;
        this.d = kotlin.a.a(new sls(this) { // from class: rql0
            public final /* synthetic */ SafetyCenterConfig b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i;
                SafetyCenterConfig safetyCenterConfig = this.b;
                switch (i3) {
                    case 0:
                        Sharing sharing2 = safetyCenterConfig.a;
                        return new TrustedContacts(sharing2.a, sharing2.b);
                    default:
                        Sharing sharing3 = safetyCenterConfig.a;
                        return new TrustedContacts(sharing3.a, sharing3.b);
                }
            }
        });
    }
}
