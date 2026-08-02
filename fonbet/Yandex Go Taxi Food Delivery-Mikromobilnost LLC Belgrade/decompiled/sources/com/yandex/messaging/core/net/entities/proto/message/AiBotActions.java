package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.xuf0;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ \u0010\u000b\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R \u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/AiBotActions;", "", "aiBotActions", "", "Lcom/yandex/messaging/core/net/entities/proto/message/AiBotAction;", "<init>", "([Lcom/yandex/messaging/core/net/entities/proto/message/AiBotAction;)V", "getAiBotActions", "()[Lcom/yandex/messaging/core/net/entities/proto/message/AiBotAction;", "[Lcom/yandex/messaging/core/net/entities/proto/message/AiBotAction;", "component1", "copy", "([Lcom/yandex/messaging/core/net/entities/proto/message/AiBotAction;)Lcom/yandex/messaging/core/net/entities/proto/message/AiBotActions;", "equals", "", "other", "hashCode", "", "toString", "", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class AiBotActions {

    @xuf0(tag = 1)
    private final AiBotAction[] aiBotActions;

    public /* synthetic */ AiBotActions(AiBotAction[] aiBotActionArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : aiBotActionArr);
    }

    public static /* synthetic */ AiBotActions copy$default(AiBotActions aiBotActions, AiBotAction[] aiBotActionArr, int i, Object obj) {
        if ((i & 1) != 0) {
            aiBotActionArr = aiBotActions.aiBotActions;
        }
        return aiBotActions.copy(aiBotActionArr);
    }

    /* renamed from: component1, reason: from getter */
    public final AiBotAction[] getAiBotActions() {
        return this.aiBotActions;
    }

    public final AiBotActions copy(@Json(name = "ActionButtons") AiBotAction[] aiBotActions) {
        return new AiBotActions(aiBotActions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AiBotActions) && jl40.l(this.aiBotActions, ((AiBotActions) other).aiBotActions);
    }

    public final AiBotAction[] getAiBotActions() {
        return this.aiBotActions;
    }

    public int hashCode() {
        AiBotAction[] aiBotActionArr = this.aiBotActions;
        if (aiBotActionArr == null) {
            return 0;
        }
        return Arrays.hashCode(aiBotActionArr);
    }

    public String toString() {
        return oyr.p("AiBotActions(aiBotActions=", Arrays.toString(this.aiBotActions), Extension.C_BRAKE);
    }

    public AiBotActions(@Json(name = "ActionButtons") AiBotAction[] aiBotActionArr) {
        this.aiBotActions = aiBotActionArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AiBotActions() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
