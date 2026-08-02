package com.ybsdk.feature.card.internal.samsungpay;

import defpackage.g8e;
import defpackage.gzl0;
import defpackage.jl40;
import defpackage.jp8;
import defpackage.k4o;
import defpackage.nzs;
import defpackage.unr0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class SamsungPayState {
    public final InitializationResult a;
    public final gzl0 b;
    public final List c;
    public final boolean d;
    public final Set e;
    public final Map f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/feature/card/internal/samsungpay/SamsungPayState$AddCardResult;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "FAILED", "CANCEL", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AddCardResult {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ AddCardResult[] $VALUES;
        public static final AddCardResult SUCCESS = new AddCardResult("SUCCESS", 0);
        public static final AddCardResult FAILED = new AddCardResult("FAILED", 1);
        public static final AddCardResult CANCEL = new AddCardResult("CANCEL", 2);

        private static final /* synthetic */ AddCardResult[] $values() {
            return new AddCardResult[]{SUCCESS, FAILED, CANCEL};
        }

        static {
            AddCardResult[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private AddCardResult(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static AddCardResult valueOf(String str) {
            return (AddCardResult) Enum.valueOf(AddCardResult.class, str);
        }

        public static AddCardResult[] values() {
            return (AddCardResult[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ybsdk/feature/card/internal/samsungpay/SamsungPayState$InitializationResult;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_SUPPORTED", "NEED_UPDATE", "NEED_ACTIVATION", "READY", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InitializationResult {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ InitializationResult[] $VALUES;
        public static final InitializationResult NOT_SUPPORTED = new InitializationResult("NOT_SUPPORTED", 0);
        public static final InitializationResult NEED_UPDATE = new InitializationResult("NEED_UPDATE", 1);
        public static final InitializationResult NEED_ACTIVATION = new InitializationResult("NEED_ACTIVATION", 2);
        public static final InitializationResult READY = new InitializationResult("READY", 3);

        private static final /* synthetic */ InitializationResult[] $values() {
            return new InitializationResult[]{NOT_SUPPORTED, NEED_UPDATE, NEED_ACTIVATION, READY};
        }

        static {
            InitializationResult[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private InitializationResult(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static InitializationResult valueOf(String str) {
            return (InitializationResult) Enum.valueOf(InitializationResult.class, str);
        }

        public static InitializationResult[] values() {
            return (InitializationResult[]) $VALUES.clone();
        }
    }

    public SamsungPayState(InitializationResult initializationResult, gzl0 gzl0Var, List list, boolean z, Set set, Map map) {
        this.a = initializationResult;
        this.b = gzl0Var;
        this.c = list;
        this.d = z;
        this.e = set;
        this.f = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.Map] */
    public static SamsungPayState a(SamsungPayState samsungPayState, InitializationResult initializationResult, gzl0 gzl0Var, List list, boolean z, LinkedHashSet linkedHashSet, LinkedHashMap linkedHashMap, int i) {
        if ((i & 1) != 0) {
            initializationResult = samsungPayState.a;
        }
        InitializationResult initializationResult2 = initializationResult;
        if ((i & 2) != 0) {
            gzl0Var = samsungPayState.b;
        }
        gzl0 gzl0Var2 = gzl0Var;
        if ((i & 4) != 0) {
            list = samsungPayState.c;
        }
        List list2 = list;
        samsungPayState.getClass();
        if ((i & 16) != 0) {
            z = samsungPayState.d;
        }
        boolean z2 = z;
        LinkedHashSet linkedHashSet2 = linkedHashSet;
        if ((i & 32) != 0) {
            linkedHashSet2 = samsungPayState.e;
        }
        LinkedHashSet linkedHashSet3 = linkedHashSet2;
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        if ((i & 64) != 0) {
            linkedHashMap2 = samsungPayState.f;
        }
        samsungPayState.getClass();
        return new SamsungPayState(initializationResult2, gzl0Var2, list2, z2, linkedHashSet3, linkedHashMap2);
    }

    public final boolean b(String str, List list) {
        List list2 = this.c;
        if (list2 != null) {
            List list3 = list;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    if (list2.contains(((jp8) it.next()).b)) {
                        return true;
                    }
                }
            }
        }
        return this.e.contains(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SamsungPayState)) {
            return false;
        }
        SamsungPayState samsungPayState = (SamsungPayState) obj;
        return this.a == samsungPayState.a && jl40.l(this.b, samsungPayState.b) && jl40.l(this.c, samsungPayState.c) && this.d == samsungPayState.d && jl40.l(this.e, samsungPayState.e) && jl40.l(this.f, samsungPayState.f);
    }

    public final int hashCode() {
        InitializationResult initializationResult = this.a;
        int hashCode = (initializationResult == null ? 0 : initializationResult.hashCode()) * 31;
        gzl0 gzl0Var = this.b;
        int hashCode2 = (hashCode + (gzl0Var == null ? 0 : gzl0Var.hashCode())) * 31;
        List list = this.c;
        return this.f.hashCode() + g8e.e(this.e, unr0.e((hashCode2 + (list != null ? list.hashCode() : 0)) * 961, 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SamsungPayState(initializationResult=");
        sb.append(this.a);
        sb.append(", walletInfoResult=");
        sb.append(this.b);
        sb.append(", cardIds=");
        nzs.p(sb, this.c, ", cardInfoPayload=null, isSamsungPayTokenLoading=", this.d, ", justAddedCards=");
        sb.append(this.e);
        sb.append(", isCardAddedToSamsungPayCached=");
        sb.append(this.f);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public SamsungPayState() {
        this(0);
    }

    public /* synthetic */ SamsungPayState(int i) {
        this(null, null, null, false, EmptySet.a, kotlin.collections.b.f());
    }
}
