package com.yandex.go.flex.main_screen.shared_data;

import defpackage.gsq0;
import defpackage.zzs;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/main_screen/shared_data/ExpectedDestination;", "", "Companion", "$serializer", "com/yandex/go/flex/main_screen/shared_data/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ExpectedDestination {
    public static final a Companion = new a();
    public final zzs a;
    public final String b;
    public final String c;

    public /* synthetic */ ExpectedDestination(int i, zzs zzsVar, String str, String str2) {
        if ((i & 1) == 0) {
            this.a = new zzs(0.0d, 0.0d, 0, null, null, 24);
        } else {
            this.a = zzsVar;
        }
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
    }

    public ExpectedDestination() {
        this.a = new zzs(0.0d, 0.0d, 0, null, null, 24);
        this.b = "";
        this.c = "";
    }
}
