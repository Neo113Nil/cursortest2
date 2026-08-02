package com.yandex.go.scooters.api.domain.model;

import defpackage.k4o;
import kotlin.Metadata;

/* loaded from: classes6.dex */
public final class ScootersSlowdown {
    public final int a;
    public final Reason b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/scooters/api/domain/model/ScootersSlowdown$Reason;", "", "", "reasonName", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "com/yandex/go/scooters/api/domain/model/a", "TRAINING_MODE", "RIDING_TOGETHER", "go-client-android.features.scooters:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Reason {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Reason[] $VALUES;
        public static final a Companion;
        public static final Reason RIDING_TOGETHER;
        public static final Reason TRAINING_MODE;
        private final String reasonName;

        static {
            Reason reason = new Reason("TRAINING_MODE", 0, "training_mode");
            TRAINING_MODE = reason;
            Reason reason2 = new Reason("RIDING_TOGETHER", 1, "riding_together");
            RIDING_TOGETHER = reason2;
            Reason[] reasonArr = {reason, reason2};
            $VALUES = reasonArr;
            $ENTRIES = kotlin.enums.a.a(reasonArr);
            Companion = new a();
        }

        public Reason(String str, int i, String str2) {
            this.reasonName = str2;
        }

        public static k4o a() {
            return $ENTRIES;
        }

        public static Reason valueOf(String str) {
            return (Reason) Enum.valueOf(Reason.class, str);
        }

        public static Reason[] values() {
            return (Reason[]) $VALUES.clone();
        }

        /* renamed from: b, reason: from getter */
        public final String getReasonName() {
            return this.reasonName;
        }
    }

    public /* synthetic */ ScootersSlowdown(Reason reason, int i) {
        this(0, (i & 2) != 0 ? null : reason);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return ScootersSlowdown.class.equals(obj != null ? obj.getClass() : null) && this.b == ((ScootersSlowdown) obj).b;
    }

    public final int hashCode() {
        Reason reason = this.b;
        if (reason != null) {
            return reason.hashCode();
        }
        return 0;
    }

    public ScootersSlowdown(int i, Reason reason) {
        this.a = i;
        this.b = reason;
    }

    public ScootersSlowdown() {
        this((Reason) null, 3);
    }
}
