package com.yandex.go.taxi.order.chat.api.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.qje;
import defpackage.vfc;
import defpackage.vix;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/chat/api/data/model/LanguageHint;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/chat/api/data/model/a", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LanguageHint {
    public static final a Companion = new a();
    public static final i3y[] d;
    public final String a;
    public final Set b;
    public final Set c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new vix(13)), kotlin.a.b(lazyThreadSafetyMode, new vix(14))};
    }

    public /* synthetic */ LanguageHint(int i, String str, Set set, Set set2) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, LanguageHint$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = set;
        this.c = set2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LanguageHint(appLanguage='");
        sb.append(this.a);
        sb.append("', systemLanguages=");
        sb.append(this.b);
        sb.append(", keyboardLanguages=");
        return vfc.q(sb, this.c, Extension.C_BRAKE);
    }

    public LanguageHint(String str, Set set, Set set2) {
        this.a = str;
        this.b = set;
        this.c = set2;
    }
}
