package com.yandex.go.taxi.order.chat.api.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.tc01;
import java.util.Collection;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/chat/api/data/model/TranslationSettings;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/chat/api/data/model/k", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TranslationSettings {
    public static final k Companion = new k();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tc01(23))};
    public final String a;
    public final Collection b;

    public /* synthetic */ TranslationSettings(int i, String str, Collection collection) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = collection;
        }
    }

    public final String toString() {
        return "TranslationSettings(toLang='" + this.a + "', doNotTranslateLangs=" + this.b + Extension.C_BRAKE;
    }

    public TranslationSettings(String str, Collection collection) {
        this.a = str;
        this.b = collection;
    }

    public TranslationSettings() {
        this("", EmptyList.a);
    }
}
