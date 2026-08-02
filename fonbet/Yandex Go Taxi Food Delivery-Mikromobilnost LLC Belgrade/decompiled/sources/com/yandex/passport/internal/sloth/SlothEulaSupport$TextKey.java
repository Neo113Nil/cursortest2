package com.yandex.passport.internal.sloth;

import defpackage.gw00;
import defpackage.k4o;
import defpackage.tcc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"com/yandex/passport/internal/sloth/SlothEulaSupport$TextKey", "", "Lcom/yandex/passport/internal/sloth/SlothEulaSupport$TextKey;", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "com/yandex/passport/internal/sloth/i", "RegFormat", "UserAgreementText", "UserAgreementUrl", "PrivacyPolicyText", "PrivacyPolicyUrl", "TaxiAgreementText", "TaxiAgreementUrl", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SlothEulaSupport$TextKey {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SlothEulaSupport$TextKey[] $VALUES;
    public static final i Companion;
    public static final SlothEulaSupport$TextKey PrivacyPolicyText;
    public static final SlothEulaSupport$TextKey PrivacyPolicyUrl;
    public static final SlothEulaSupport$TextKey RegFormat;
    public static final SlothEulaSupport$TextKey TaxiAgreementText;
    public static final SlothEulaSupport$TextKey TaxiAgreementUrl;
    public static final SlothEulaSupport$TextKey UserAgreementText;
    public static final SlothEulaSupport$TextKey UserAgreementUrl;
    private static final Set<String> allValues;
    private static final Map<String, SlothEulaSupport$TextKey> mapping;
    private final String value;

    static {
        SlothEulaSupport$TextKey slothEulaSupport$TextKey = new SlothEulaSupport$TextKey("RegFormat", 0, "regFormat");
        RegFormat = slothEulaSupport$TextKey;
        SlothEulaSupport$TextKey slothEulaSupport$TextKey2 = new SlothEulaSupport$TextKey("UserAgreementText", 1, "userAgreementText");
        UserAgreementText = slothEulaSupport$TextKey2;
        SlothEulaSupport$TextKey slothEulaSupport$TextKey3 = new SlothEulaSupport$TextKey("UserAgreementUrl", 2, "userAgreementUrl");
        UserAgreementUrl = slothEulaSupport$TextKey3;
        SlothEulaSupport$TextKey slothEulaSupport$TextKey4 = new SlothEulaSupport$TextKey("PrivacyPolicyText", 3, "privacyPolicyText");
        PrivacyPolicyText = slothEulaSupport$TextKey4;
        SlothEulaSupport$TextKey slothEulaSupport$TextKey5 = new SlothEulaSupport$TextKey("PrivacyPolicyUrl", 4, "privacyPolicyUrl");
        PrivacyPolicyUrl = slothEulaSupport$TextKey5;
        SlothEulaSupport$TextKey slothEulaSupport$TextKey6 = new SlothEulaSupport$TextKey("TaxiAgreementText", 5, "taxiAgreementText");
        TaxiAgreementText = slothEulaSupport$TextKey6;
        SlothEulaSupport$TextKey slothEulaSupport$TextKey7 = new SlothEulaSupport$TextKey("TaxiAgreementUrl", 6, "taxiAgreementUrl");
        TaxiAgreementUrl = slothEulaSupport$TextKey7;
        SlothEulaSupport$TextKey[] slothEulaSupport$TextKeyArr = {slothEulaSupport$TextKey, slothEulaSupport$TextKey2, slothEulaSupport$TextKey3, slothEulaSupport$TextKey4, slothEulaSupport$TextKey5, slothEulaSupport$TextKey6, slothEulaSupport$TextKey7};
        $VALUES = slothEulaSupport$TextKeyArr;
        k4o a = kotlin.enums.a.a(slothEulaSupport$TextKeyArr);
        $ENTRIES = a;
        Companion = new i();
        int d = gw00.d(tcc.n(a, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(d < 16 ? 16 : d);
        for (Object obj : a) {
            linkedHashMap.put(((SlothEulaSupport$TextKey) obj).value, obj);
        }
        mapping = linkedHashMap;
        k4o k4oVar = $ENTRIES;
        ArrayList arrayList = new ArrayList(tcc.n(k4oVar, 10));
        Iterator<E> it = k4oVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((SlothEulaSupport$TextKey) it.next()).value);
        }
        allValues = kotlin.collections.a.N0(arrayList);
    }

    public SlothEulaSupport$TextKey(String str, int i, String str2) {
        this.value = str2;
    }

    public static SlothEulaSupport$TextKey valueOf(String str) {
        return (SlothEulaSupport$TextKey) Enum.valueOf(SlothEulaSupport$TextKey.class, str);
    }

    public static SlothEulaSupport$TextKey[] values() {
        return (SlothEulaSupport$TextKey[]) $VALUES.clone();
    }
}
