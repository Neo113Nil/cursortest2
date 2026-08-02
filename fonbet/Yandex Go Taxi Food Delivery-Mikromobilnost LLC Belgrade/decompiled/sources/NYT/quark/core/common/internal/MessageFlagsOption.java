package NYT.quark.core.common.internal;

import NYT.quark.core.common.internal.EWrapperMessageFlag;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\u0002\u0018\u00002\u00020\u0001B\u000e\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003R\u0015\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"LNYT/quark/core/common/internal/MessageFlagsOption;", "", "value", "", "LNYT/quark/core/common/internal/EWrapperMessageFlag$Enum;", "()[LNYT/quark/core/common/internal/EWrapperMessageFlag$Enum;", "quark-core-common-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public @interface MessageFlagsOption {
    EWrapperMessageFlag.Enum[] value();
}
