package com.yandex.fintechsdk.adapters.flex.sdk.impl.action;

import defpackage.ig5;
import defpackage.jl40;
import defpackage.kr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/action/CustomAction;", "Lig5;", "T", "Lkr;", "action", "", "type", "<init>", "(Lig5;Ljava/lang/String;)V", "component1", "()Lig5;", "component2", "()Ljava/lang/String;", "copy", "(Lig5;Ljava/lang/String;)Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/action/CustomAction;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lig5;", "getAction", "Ljava/lang/String;", "getType", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CustomAction<T extends ig5> extends kr {
    private final T action;
    private final String type;

    public CustomAction(T t, String str) {
        this.action = t;
        this.type = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomAction copy$default(CustomAction customAction, ig5 ig5Var, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            ig5Var = customAction.action;
        }
        if ((i & 2) != 0) {
            str = customAction.type;
        }
        return customAction.copy(ig5Var, str);
    }

    public final T component1() {
        return this.action;
    }

    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final CustomAction<T> copy(T action, String type) {
        return new CustomAction<>(action, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomAction)) {
            return false;
        }
        CustomAction customAction = (CustomAction) other;
        return jl40.l(this.action, customAction.action) && jl40.l(this.type, customAction.type);
    }

    public final T getAction() {
        return this.action;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode() + (this.action.hashCode() * 31);
    }

    public String toString() {
        return "CustomAction(action=" + this.action + ", type=" + this.type + Extension.C_BRAKE;
    }
}
