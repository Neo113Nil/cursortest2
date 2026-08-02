package xsna;

import com.vk.dto.common.Source;
import com.vk.im.engine.models.account.PrivacySetting;
import java.util.Collections;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AccountGetCallsPrivacySettingCmd.kt */
/* loaded from: classes2.dex */
public final class co extends le6<xpp<PrivacySetting>> {
    public final Source b;
    public final boolean c;

    /* compiled from: AccountGetCallsPrivacySettingCmd.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Source.values().length];
            try {
                iArr[Source.CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Source.NETWORK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Source.ACTUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public co() {
        this(Source.CACHE, false);
    }

    @Override // xsna.le6
    public final xpp<PrivacySetting> e(w2w w2wVar) {
        int i = a.$EnumSwitchMapping$0[this.b.ordinal()];
        if (i == 1) {
            return new xpp<>(w2wVar.I0().r().f(), false);
        }
        if (i != 2 && i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        for (PrivacySetting privacySetting : (Iterable) bz2.c(new jo(Collections.singletonList("calls"), this.c), "AccountGetCallsPrivacySettingCmd.AccountGetPrivacySettingsApiCmd")) {
            if (epx.f(privacySetting.b, "calls")) {
                w2wVar.I0().r().e(privacySetting);
                return new xpp<>(privacySetting, false);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof co)) {
            return false;
        }
        co coVar = (co) obj;
        return this.b == coVar.b && this.c == coVar.c;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountGetCallsPrivacySettingCmd(source=");
        sb.append(this.b);
        sb.append(", awaitNetwork=");
        return defpackage.q0.a(sb, this.c, ')');
    }

    public co(Source source, boolean z) {
        this.b = source;
        this.c = z;
    }
}
