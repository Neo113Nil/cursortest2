package com.yandex.passport.internal.config;

import android.content.Context;
import android.content.SharedPreferences;
import com.yandex.passport.common.core.Environment;
import defpackage.i3y;
import defpackage.sls;

/* loaded from: classes8.dex */
public final class e {
    public final Context a;
    public final i3y b;
    public final i3y c;
    public final i3y d;

    public e(Context context) {
        this.a = context;
        final int i = 0;
        this.b = kotlin.a.a(new sls(this) { // from class: com.yandex.passport.internal.config.c
            public final /* synthetic */ e b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                e eVar = this.b;
                switch (i2) {
                    case 0:
                        return eVar.a.getSharedPreferences(e.a(Environment.PRODUCTION), 0);
                    case 1:
                        return eVar.a.getSharedPreferences(e.a(Environment.TESTING), 0);
                    default:
                        return eVar.a.getSharedPreferences(e.a(Environment.RC), 0);
                }
            }
        });
        final int i2 = 1;
        this.c = kotlin.a.a(new sls(this) { // from class: com.yandex.passport.internal.config.c
            public final /* synthetic */ e b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                e eVar = this.b;
                switch (i22) {
                    case 0:
                        return eVar.a.getSharedPreferences(e.a(Environment.PRODUCTION), 0);
                    case 1:
                        return eVar.a.getSharedPreferences(e.a(Environment.TESTING), 0);
                    default:
                        return eVar.a.getSharedPreferences(e.a(Environment.RC), 0);
                }
            }
        });
        final int i3 = 2;
        this.d = kotlin.a.a(new sls(this) { // from class: com.yandex.passport.internal.config.c
            public final /* synthetic */ e b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i3;
                e eVar = this.b;
                switch (i22) {
                    case 0:
                        return eVar.a.getSharedPreferences(e.a(Environment.PRODUCTION), 0);
                    case 1:
                        return eVar.a.getSharedPreferences(e.a(Environment.TESTING), 0);
                    default:
                        return eVar.a.getSharedPreferences(e.a(Environment.RC), 0);
                }
            }
        });
    }

    public static String a(Environment environment) {
        return "config_" + environment.getInteger();
    }

    public final SharedPreferences b(Environment environment) {
        int i = d.a[environment.ordinal()];
        if (i == 1) {
            return (SharedPreferences) this.b.getValue();
        }
        if (i == 2) {
            return (SharedPreferences) this.c.getValue();
        }
        if (i != 3) {
            return null;
        }
        return (SharedPreferences) this.d.getValue();
    }
}
