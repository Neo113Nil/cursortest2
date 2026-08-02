package com.yandex.go.shortcuts.dto.request;

import com.yandex.go.shortcuts.dto.response.StackCommon$StackItemType;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.s7s0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/request/StackItemTypeFeature;", "", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/request/t", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class StackItemTypeFeature {
    public static final t Companion = new t();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new s7s0(26))};
    public final StackCommon$StackItemType a;

    public /* synthetic */ StackItemTypeFeature(int i, StackCommon$StackItemType stackCommon$StackItemType) {
        if ((i & 1) == 0) {
            this.a = StackCommon$StackItemType.UNKNOWN;
        } else {
            this.a = stackCommon$StackItemType;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StackItemTypeFeature) && this.a == ((StackItemTypeFeature) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StackItemTypeFeature(type=" + this.a + Extension.C_BRAKE;
    }

    public StackItemTypeFeature(StackCommon$StackItemType stackCommon$StackItemType) {
        this.a = stackCommon$StackItemType;
    }

    public StackItemTypeFeature() {
        this(StackCommon$StackItemType.UNKNOWN);
    }
}
