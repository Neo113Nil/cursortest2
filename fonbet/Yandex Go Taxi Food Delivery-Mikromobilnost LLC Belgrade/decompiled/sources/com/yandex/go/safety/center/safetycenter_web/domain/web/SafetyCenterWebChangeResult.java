package com.yandex.go.safety.center.safetycenter_web.domain.web;

import defpackage.b7l0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.qje;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/safety/center/safetycenter_web/domain/web/SafetyCenterWebChangeResult;", "", "Companion", "Result", "$serializer", "com/yandex/go/safety/center/safetycenter_web/domain/web/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SafetyCenterWebChangeResult {
    public static final a Companion = new a();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new b7l0(17))};
    public final Result a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/safety/center/safetycenter_web/domain/web/SafetyCenterWebChangeResult$Result;", "", "Companion", "com/yandex/go/safety/center/safetycenter_web/domain/web/b", "UNCHANGED", "CHANGED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Result {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Result[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final Result CHANGED;
        public static final b Companion;
        public static final Result UNCHANGED;

        static {
            Result result = new Result("UNCHANGED", 0);
            UNCHANGED = result;
            Result result2 = new Result("CHANGED", 1);
            CHANGED = result2;
            Result[] resultArr = {result, result2};
            $VALUES = resultArr;
            $ENTRIES = kotlin.enums.a.a(resultArr);
            Companion = new b();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new b7l0(18));
        }

        public static Result valueOf(String str) {
            return (Result) Enum.valueOf(Result.class, str);
        }

        public static Result[] values() {
            return (Result[]) $VALUES.clone();
        }
    }

    public /* synthetic */ SafetyCenterWebChangeResult(int i, Result result) {
        if (1 == (i & 1)) {
            this.a = result;
        } else {
            qje.Z(i, 1, SafetyCenterWebChangeResult$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SafetyCenterWebChangeResult) && this.a == ((SafetyCenterWebChangeResult) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SafetyCenterWebChangeResult(result=" + this.a + Extension.C_BRAKE;
    }

    public SafetyCenterWebChangeResult(Result result) {
        this.a = result;
    }
}
