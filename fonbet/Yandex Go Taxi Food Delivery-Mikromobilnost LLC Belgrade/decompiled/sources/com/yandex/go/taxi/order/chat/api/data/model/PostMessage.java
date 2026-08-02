package com.yandex.go.taxi.order.chat.api.data.model;

import defpackage.gsq0;
import defpackage.qje;
import defpackage.zzs;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/chat/api/data/model/PostMessage;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/chat/api/data/model/f", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PostMessage {
    public static final f Companion = new f();
    public final String a;
    public final zzs b;
    public final String c;
    public final LanguageHint d;

    public /* synthetic */ PostMessage(int i, String str, zzs zzsVar, String str2, LanguageHint languageHint) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, PostMessage$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = zzsVar;
        this.c = str2;
        this.d = languageHint;
    }

    public final String toString() {
        return "PostMessage(suggestionAlias=" + this.a + ", location=" + this.b + ", text=" + this.c + ", languageHint=" + this.d + Extension.C_BRAKE;
    }

    public PostMessage(String str, zzs zzsVar, String str2, LanguageHint languageHint) {
        this.a = str;
        this.b = zzsVar;
        this.c = str2;
        this.d = languageHint;
    }
}
