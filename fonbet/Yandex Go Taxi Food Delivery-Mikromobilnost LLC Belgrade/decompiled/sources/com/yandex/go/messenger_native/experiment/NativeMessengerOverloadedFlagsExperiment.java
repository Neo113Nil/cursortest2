package com.yandex.go.messenger_native.experiment;

import defpackage.d540;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.n96;
import defpackage.vn11;
import defpackage.xvz;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/messenger_native/experiment/NativeMessengerOverloadedFlagsExperiment;", "Lvn11;", "Ln96;", "Companion", "com/yandex/go/messenger_native/experiment/a", "OverloadedFlag", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class NativeMessengerOverloadedFlagsExperiment extends n96 implements vn11 {
    public static final a Companion = new a();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new d540(17))};
    public static final NativeMessengerOverloadedFlagsExperiment e = new NativeMessengerOverloadedFlagsExperiment(0);
    public final boolean b;
    public final List c;

    public /* synthetic */ NativeMessengerOverloadedFlagsExperiment(int i, boolean z, List list) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NativeMessengerOverloadedFlagsExperiment)) {
            return false;
        }
        NativeMessengerOverloadedFlagsExperiment nativeMessengerOverloadedFlagsExperiment = (NativeMessengerOverloadedFlagsExperiment) obj;
        return this.b == nativeMessengerOverloadedFlagsExperiment.b && jl40.l(this.c, nativeMessengerOverloadedFlagsExperiment.c);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.b) * 31;
        List list = this.c;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "NativeMessengerOverloadedFlagsExperiment(enabled=" + this.b + ", overloadedFlags=" + this.c + Extension.C_BRAKE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/messenger_native/experiment/NativeMessengerOverloadedFlagsExperiment$OverloadedFlag;", "", "Companion", "$serializer", "com/yandex/go/messenger_native/experiment/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes12.dex */
    public static final /* data */ class OverloadedFlag {
        public static final b Companion = new b();
        public final String a;
        public final boolean b;

        public /* synthetic */ OverloadedFlag(int i, String str, boolean z) {
            this.a = (i & 1) == 0 ? "none" : str;
            if ((i & 2) == 0) {
                this.b = false;
            } else {
                this.b = z;
            }
        }

        /* renamed from: a, reason: from getter */
        public final boolean getB() {
            return this.b;
        }

        /* renamed from: b, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OverloadedFlag)) {
                return false;
            }
            OverloadedFlag overloadedFlag = (OverloadedFlag) obj;
            return jl40.l(this.a, overloadedFlag.a) && this.b == overloadedFlag.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return xvz.k("OverloadedFlag(name=", this.a, ", flag=", this.b, Extension.C_BRAKE);
        }

        public OverloadedFlag() {
            this.a = "none";
            this.b = false;
        }
    }

    public NativeMessengerOverloadedFlagsExperiment(int i) {
        this.b = false;
        this.c = EmptyList.a;
    }

    public NativeMessengerOverloadedFlagsExperiment() {
        this(0);
    }
}
