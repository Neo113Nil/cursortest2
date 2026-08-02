package com.yandex.go.payments.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.qje;
import defpackage.tt4;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/payments/data/model/BindGooglePayParams;", "", "Companion", "TokenizationType", "$serializer", "com/yandex/go/payments/data/model/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BindGooglePayParams {
    public static final c Companion = new c();
    public static final i3y[] e = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tt4(27))};
    public final String a;
    public final String b;
    public final String c;
    public final TokenizationType d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/payments/data/model/BindGooglePayParams$TokenizationType;", "", "Companion", "com/yandex/go/payments/data/model/d", "DIRECT", "GATEWAY", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class TokenizationType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ TokenizationType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final d Companion;
        public static final TokenizationType DIRECT;
        public static final TokenizationType GATEWAY;

        static {
            TokenizationType tokenizationType = new TokenizationType("DIRECT", 0);
            DIRECT = tokenizationType;
            TokenizationType tokenizationType2 = new TokenizationType("GATEWAY", 1);
            GATEWAY = tokenizationType2;
            TokenizationType[] tokenizationTypeArr = {tokenizationType, tokenizationType2};
            $VALUES = tokenizationTypeArr;
            $ENTRIES = kotlin.enums.a.a(tokenizationTypeArr);
            Companion = new d();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tt4(28));
        }

        public static TokenizationType valueOf(String str) {
            return (TokenizationType) Enum.valueOf(TokenizationType.class, str);
        }

        public static TokenizationType[] values() {
            return (TokenizationType[]) $VALUES.clone();
        }
    }

    public /* synthetic */ BindGooglePayParams(int i, String str, String str2, String str3, TokenizationType tokenizationType) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, BindGooglePayParams$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = tokenizationType;
    }

    public BindGooglePayParams(String str, String str2, String str3, TokenizationType tokenizationType) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = tokenizationType;
    }
}
