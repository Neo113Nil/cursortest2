package com.yandex.go.dto.response;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.lq;
import defpackage.unr0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"com/yandex/go/dto/response/Action$RouteInput", "Lcom/yandex/go/dto/response/q1;", "Companion", "AdditionalAction", "AdditionalActionType", "$serializer", "com/yandex/go/dto/response/p0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Action$RouteInput extends q1 {
    public static final p0 Companion = new p0();
    public final String a;
    public final String b;
    public final AdditionalAction c;
    public final String d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/dto/response/Action$RouteInput$AdditionalActionType;", "", "Companion", "com/yandex/go/dto/response/o0", "PREORDER", "ORDER_TO_ANOTHER", JCP.RAW_PREFIX, "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes12.dex */
    public static final class AdditionalActionType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ AdditionalActionType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final o0 Companion;
        public static final AdditionalActionType NONE;
        public static final AdditionalActionType ORDER_TO_ANOTHER;
        public static final AdditionalActionType PREORDER;

        static {
            AdditionalActionType additionalActionType = new AdditionalActionType("PREORDER", 0);
            PREORDER = additionalActionType;
            AdditionalActionType additionalActionType2 = new AdditionalActionType("ORDER_TO_ANOTHER", 1);
            ORDER_TO_ANOTHER = additionalActionType2;
            AdditionalActionType additionalActionType3 = new AdditionalActionType(JCP.RAW_PREFIX, 2);
            NONE = additionalActionType3;
            AdditionalActionType[] additionalActionTypeArr = {additionalActionType, additionalActionType2, additionalActionType3};
            $VALUES = additionalActionTypeArr;
            $ENTRIES = kotlin.enums.a.a(additionalActionTypeArr);
            Companion = new o0();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new lq(3));
        }

        public static AdditionalActionType valueOf(String str) {
            return (AdditionalActionType) Enum.valueOf(AdditionalActionType.class, str);
        }

        public static AdditionalActionType[] values() {
            return (AdditionalActionType[]) $VALUES.clone();
        }
    }

    public Action$RouteInput(int i, String str, String str2, AdditionalAction additionalAction) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = new AdditionalAction(0);
        } else {
            this.c = additionalAction;
        }
        this.d = null;
    }

    public static Action$RouteInput b(Action$RouteInput action$RouteInput, String str, String str2, AdditionalAction additionalAction, String str3, int i) {
        if ((i & 1) != 0) {
            str = action$RouteInput.a;
        }
        if ((i & 2) != 0) {
            str2 = action$RouteInput.b;
        }
        if ((i & 4) != 0) {
            additionalAction = action$RouteInput.c;
        }
        if ((i & 8) != 0) {
            str3 = action$RouteInput.d;
        }
        action$RouteInput.getClass();
        return new Action$RouteInput(str, str2, additionalAction, str3);
    }

    @Override // com.yandex.go.dto.response.q1
    public final ActionType a() {
        return ActionType.ROUTE_INPUT;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Action$RouteInput)) {
            return false;
        }
        Action$RouteInput action$RouteInput = (Action$RouteInput) obj;
        return jl40.l(this.a, action$RouteInput.a) && jl40.l(this.b, action$RouteInput.b) && jl40.l(this.c, action$RouteInput.c) && jl40.l(this.d, action$RouteInput.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31;
        String str = this.d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("RouteInput(suggestMode=", this.a, ", tariffClass=", this.b, ", additionalAction=");
        v.append(this.c);
        v.append(", transitionName=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/dto/response/Action$RouteInput$AdditionalAction;", "", "Companion", "$serializer", "com/yandex/go/dto/response/n0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes12.dex */
    public static final /* data */ class AdditionalAction {
        public static final n0 Companion = new n0();
        public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new lq(2))};
        public final AdditionalActionType a;

        public /* synthetic */ AdditionalAction(int i, AdditionalActionType additionalActionType) {
            if ((i & 1) == 0) {
                this.a = AdditionalActionType.NONE;
            } else {
                this.a = additionalActionType;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AdditionalAction) && this.a == ((AdditionalAction) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "AdditionalAction(additionalActionType=" + this.a + Extension.C_BRAKE;
        }

        public AdditionalAction() {
            this(0);
        }

        public AdditionalAction(AdditionalActionType additionalActionType) {
            this.a = additionalActionType;
        }

        public /* synthetic */ AdditionalAction(int i) {
            this(AdditionalActionType.NONE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Action$RouteInput() {
        this((String) null, (String) (0 == true ? 1 : 0), (AdditionalAction) (0 == true ? 1 : 0), 15);
    }

    public Action$RouteInput(String str, String str2, AdditionalAction additionalAction, String str3) {
        this.a = str;
        this.b = str2;
        this.c = additionalAction;
        this.d = str3;
    }

    public /* synthetic */ Action$RouteInput(String str, String str2, AdditionalAction additionalAction, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new AdditionalAction(0) : additionalAction, (String) null);
    }
}
