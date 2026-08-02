package com.yandex.plus.core.data.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.auu0;
import defpackage.b64;
import defpackage.bbd0;
import defpackage.gsq0;
import defpackage.h6w;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.o4o;
import defpackage.psq0;
import defpackage.qje;
import defpackage.qoi0;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.v5e0;
import defpackage.yjd;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0002\t\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/yandex/plus/core/data/pay/PlusSelectPaymentMethodState;", "Landroid/os/Parcelable;", "Terminal", "NonTerminal", "Started", "NonTerminalError", "Success", "Cancel", "Error", "Lcom/yandex/plus/core/data/pay/PlusSelectPaymentMethodState$NonTerminal;", "Lcom/yandex/plus/core/data/pay/PlusSelectPaymentMethodState$Terminal;", "psdk-adapter-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface PlusSelectPaymentMethodState extends Parcelable {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lcom/yandex/plus/core/data/pay/PlusSelectPaymentMethodState$NonTerminal;", "Lcom/yandex/plus/core/data/pay/PlusSelectPaymentMethodState;", "Lcom/yandex/plus/core/data/pay/PlusSelectPaymentMethodState$NonTerminalError;", "Lcom/yandex/plus/core/data/pay/PlusSelectPaymentMethodState$Started;", "psdk-adapter-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface NonTerminal extends PlusSelectPaymentMethodState {
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcom/yandex/plus/core/data/pay/PlusSelectPaymentMethodState$Terminal;", "Lcom/yandex/plus/core/data/pay/PlusSelectPaymentMethodState;", "Lcom/yandex/plus/core/data/pay/PlusSelectPaymentMethodState$Cancel;", "Lcom/yandex/plus/core/data/pay/PlusSelectPaymentMethodState$Error;", "Lcom/yandex/plus/core/data/pay/PlusSelectPaymentMethodState$Success;", "psdk-adapter-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Terminal extends PlusSelectPaymentMethodState {
    }

    @gsq0
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\r¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/plus/core/data/pay/PlusSelectPaymentMethodState$Cancel;", "Lcom/yandex/plus/core/data/pay/PlusSelectPaymentMethodState$Terminal;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "psdk-adapter-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Cancel implements Terminal {
        public static final Cancel INSTANCE = new Cancel();
        public static final Parcelable.Creator<Cancel> CREATOR = new Creator();
        private static final /* synthetic */ i3y $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new bbd0(20));

        private Cancel() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new o4o("com.yandex.plus.core.data.pay.PlusSelectPaymentMethodState.Cancel", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Cancel> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Cancel createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Cancel.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Cancel[] newArray(int i) {
                return new Cancel[i];
            }
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000278B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010 J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010 JF\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010 J\u0010\u0010)\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b)\u0010\u0019J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010\"R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b3\u0010 R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b4\u0010 R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b5\u0010 ¨\u00069"}, d2 = {"Lcom/yandex/plus/core/data/pay/PlusSelectPaymentMethodState$Error;", "Lcom/yandex/plus/core/data/pay/PlusSelectPaymentMethodState$Terminal;", "", Constants.KEY_MESSAGE, "", AuthSdkActivity.RESPONSE_TYPE_CODE, ACSPConstants.STATUS, "kind", "trigger", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$psdk_adapter_api_release", "(Lcom/yandex/plus/core/data/pay/PlusSelectPaymentMethodState$Error;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/plus/core/data/pay/PlusSelectPaymentMethodState$Error;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "Ljava/lang/Integer;", "getCode", "getStatus", "getKind", "getTrigger", "Companion", "com/yandex/plus/core/data/pay/c", "com/yandex/plus/core/data/pay/d", "psdk-adapter-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Error implements Terminal {
        private final Integer code;
        private final String kind;
        private final String message;
        private final String status;
        private final String trigger;
        public static final d Companion = new d();
        public static final Parcelable.Creator<Error> CREATOR = new Creator();

        public /* synthetic */ Error(int i, String str, Integer num, String str2, String str3, String str4, psq0 psq0Var) {
            if (31 != (i & 31)) {
                qje.Z(i, 31, c.a.getDescriptor());
                throw null;
            }
            this.message = str;
            this.code = num;
            this.status = str2;
            this.kind = str3;
            this.trigger = str4;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, Integer num, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = error.message;
            }
            if ((i & 2) != 0) {
                num = error.code;
            }
            if ((i & 4) != 0) {
                str2 = error.status;
            }
            if ((i & 8) != 0) {
                str3 = error.kind;
            }
            if ((i & 16) != 0) {
                str4 = error.trigger;
            }
            String str5 = str4;
            String str6 = str2;
            return error.copy(str, num, str6, str3, str5);
        }

        public static final /* synthetic */ void write$Self$psdk_adapter_api_release(Error self, yjd output, SerialDescriptor serialDesc) {
            output.o(serialDesc, 0, self.message);
            output.g(serialDesc, 1, h6w.a, self.code);
            output.g(serialDesc, 2, auu0.a, self.status);
            output.o(serialDesc, 3, self.kind);
            output.o(serialDesc, 4, self.trigger);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getCode() {
            return this.code;
        }

        /* renamed from: component3, reason: from getter */
        public final String getStatus() {
            return this.status;
        }

        /* renamed from: component4, reason: from getter */
        public final String getKind() {
            return this.kind;
        }

        /* renamed from: component5, reason: from getter */
        public final String getTrigger() {
            return this.trigger;
        }

        public final Error copy(String message, Integer code, String status, String kind, String trigger) {
            return new Error(message, code, status, kind, trigger);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return jl40.l(this.message, error.message) && jl40.l(this.code, error.code) && jl40.l(this.status, error.status) && jl40.l(this.kind, error.kind) && jl40.l(this.trigger, error.trigger);
        }

        public final Integer getCode() {
            return this.code;
        }

        public final String getKind() {
            return this.kind;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getStatus() {
            return this.status;
        }

        public final String getTrigger() {
            return this.trigger;
        }

        public int hashCode() {
            int hashCode = this.message.hashCode() * 31;
            Integer num = this.code;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.status;
            return this.trigger.hashCode() + unr0.b((hashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.kind);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Error(message=");
            sb.append(this.message);
            sb.append(", code=");
            sb.append(this.code);
            sb.append(", status=");
            sb.append(this.status);
            sb.append(", kind=");
            sb.append(this.kind);
            sb.append(", trigger=");
            return b64.p(sb, this.trigger, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.message);
            Integer num = this.code;
            if (num == null) {
                dest.writeInt(0);
            } else {
                tse0.v(dest, 1, num);
            }
            dest.writeString(this.status);
            dest.writeString(this.kind);
            dest.writeString(this.trigger);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Error> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Error createFromParcel(Parcel parcel) {
                return new Error(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Error[] newArray(int i) {
                return new Error[i];
            }
        }

        public Error(String str, Integer num, String str2, String str3, String str4) {
            this.message = str;
            this.code = num;
            this.status = str2;
            this.kind = str3;
            this.trigger = str4;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000278B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010 J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010 JF\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010 J\u0010\u0010)\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b)\u0010\u0019J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010\"R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b3\u0010 R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b4\u0010 R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b5\u0010 ¨\u00069"}, d2 = {"Lcom/yandex/plus/core/data/pay/PlusSelectPaymentMethodState$NonTerminalError;", "Lcom/yandex/plus/core/data/pay/PlusSelectPaymentMethodState$NonTerminal;", "", Constants.KEY_MESSAGE, "", AuthSdkActivity.RESPONSE_TYPE_CODE, ACSPConstants.STATUS, "kind", "trigger", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$psdk_adapter_api_release", "(Lcom/yandex/plus/core/data/pay/PlusSelectPaymentMethodState$NonTerminalError;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/plus/core/data/pay/PlusSelectPaymentMethodState$NonTerminalError;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "Ljava/lang/Integer;", "getCode", "getStatus", "getKind", "getTrigger", "Companion", "com/yandex/plus/core/data/pay/e", "com/yandex/plus/core/data/pay/f", "psdk-adapter-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NonTerminalError implements NonTerminal {
        private final Integer code;
        private final String kind;
        private final String message;
        private final String status;
        private final String trigger;
        public static final f Companion = new f();
        public static final Parcelable.Creator<NonTerminalError> CREATOR = new Creator();

        public /* synthetic */ NonTerminalError(int i, String str, Integer num, String str2, String str3, String str4, psq0 psq0Var) {
            if (31 != (i & 31)) {
                qje.Z(i, 31, e.a.getDescriptor());
                throw null;
            }
            this.message = str;
            this.code = num;
            this.status = str2;
            this.kind = str3;
            this.trigger = str4;
        }

        public static /* synthetic */ NonTerminalError copy$default(NonTerminalError nonTerminalError, String str, Integer num, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = nonTerminalError.message;
            }
            if ((i & 2) != 0) {
                num = nonTerminalError.code;
            }
            if ((i & 4) != 0) {
                str2 = nonTerminalError.status;
            }
            if ((i & 8) != 0) {
                str3 = nonTerminalError.kind;
            }
            if ((i & 16) != 0) {
                str4 = nonTerminalError.trigger;
            }
            String str5 = str4;
            String str6 = str2;
            return nonTerminalError.copy(str, num, str6, str3, str5);
        }

        public static final /* synthetic */ void write$Self$psdk_adapter_api_release(NonTerminalError self, yjd output, SerialDescriptor serialDesc) {
            output.o(serialDesc, 0, self.message);
            output.g(serialDesc, 1, h6w.a, self.code);
            output.g(serialDesc, 2, auu0.a, self.status);
            output.o(serialDesc, 3, self.kind);
            output.o(serialDesc, 4, self.trigger);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getCode() {
            return this.code;
        }

        /* renamed from: component3, reason: from getter */
        public final String getStatus() {
            return this.status;
        }

        /* renamed from: component4, reason: from getter */
        public final String getKind() {
            return this.kind;
        }

        /* renamed from: component5, reason: from getter */
        public final String getTrigger() {
            return this.trigger;
        }

        public final NonTerminalError copy(String message, Integer code, String status, String kind, String trigger) {
            return new NonTerminalError(message, code, status, kind, trigger);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NonTerminalError)) {
                return false;
            }
            NonTerminalError nonTerminalError = (NonTerminalError) other;
            return jl40.l(this.message, nonTerminalError.message) && jl40.l(this.code, nonTerminalError.code) && jl40.l(this.status, nonTerminalError.status) && jl40.l(this.kind, nonTerminalError.kind) && jl40.l(this.trigger, nonTerminalError.trigger);
        }

        public final Integer getCode() {
            return this.code;
        }

        public final String getKind() {
            return this.kind;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getStatus() {
            return this.status;
        }

        public final String getTrigger() {
            return this.trigger;
        }

        public int hashCode() {
            int hashCode = this.message.hashCode() * 31;
            Integer num = this.code;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.status;
            return this.trigger.hashCode() + unr0.b((hashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.kind);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("NonTerminalError(message=");
            sb.append(this.message);
            sb.append(", code=");
            sb.append(this.code);
            sb.append(", status=");
            sb.append(this.status);
            sb.append(", kind=");
            sb.append(this.kind);
            sb.append(", trigger=");
            return b64.p(sb, this.trigger, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.message);
            Integer num = this.code;
            if (num == null) {
                dest.writeInt(0);
            } else {
                tse0.v(dest, 1, num);
            }
            dest.writeString(this.status);
            dest.writeString(this.kind);
            dest.writeString(this.trigger);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<NonTerminalError> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NonTerminalError createFromParcel(Parcel parcel) {
                return new NonTerminalError(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NonTerminalError[] newArray(int i) {
                return new NonTerminalError[i];
            }
        }

        public NonTerminalError(String str, Integer num, String str2, String str3, String str4) {
            this.message = str;
            this.code = num;
            this.status = str2;
            this.kind = str3;
            this.trigger = str4;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\r¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/plus/core/data/pay/PlusSelectPaymentMethodState$Started;", "Lcom/yandex/plus/core/data/pay/PlusSelectPaymentMethodState$NonTerminal;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "psdk-adapter-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Started implements NonTerminal {
        public static final Started INSTANCE = new Started();
        public static final Parcelable.Creator<Started> CREATOR = new Creator();
        private static final /* synthetic */ i3y $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new bbd0(21));

        private Started() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new o4o("com.yandex.plus.core.data.pay.PlusSelectPaymentMethodState.Started", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Started> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Started createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Started.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Started[] newArray(int i) {
                return new Started[i];
            }
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J$\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b$\u0010\u0017J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010 ¨\u00061"}, d2 = {"Lcom/yandex/plus/core/data/pay/PlusSelectPaymentMethodState$Success;", "Lcom/yandex/plus/core/data/pay/PlusSelectPaymentMethodState$Terminal;", "", "selectButtonText", "Lcom/yandex/plus/core/data/pay/PlusPaymentMethod;", "paymentMethod", "<init>", "(Ljava/lang/String;Lcom/yandex/plus/core/data/pay/PlusPaymentMethod;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/yandex/plus/core/data/pay/PlusPaymentMethod;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$psdk_adapter_api_release", "(Lcom/yandex/plus/core/data/pay/PlusSelectPaymentMethodState$Success;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/yandex/plus/core/data/pay/PlusPaymentMethod;", "copy", "(Ljava/lang/String;Lcom/yandex/plus/core/data/pay/PlusPaymentMethod;)Lcom/yandex/plus/core/data/pay/PlusSelectPaymentMethodState$Success;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSelectButtonText", "Lcom/yandex/plus/core/data/pay/PlusPaymentMethod;", "getPaymentMethod", "Companion", "com/yandex/plus/core/data/pay/g", "com/yandex/plus/core/data/pay/h", "psdk-adapter-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Success implements Terminal {
        private final PlusPaymentMethod paymentMethod;
        private final String selectButtonText;
        public static final h Companion = new h();
        public static final Parcelable.Creator<Success> CREATOR = new Creator();
        private static final i3y[] $childSerializers = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new bbd0(22))};

        public /* synthetic */ Success(int i, String str, PlusPaymentMethod plusPaymentMethod, psq0 psq0Var) {
            if (3 != (i & 3)) {
                qje.Z(i, 3, g.a.getDescriptor());
                throw null;
            }
            this.selectButtonText = str;
            this.paymentMethod = plusPaymentMethod;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new v5e0(qoi0.a(PlusPaymentMethod.class), new Annotation[0]);
        }

        public static /* synthetic */ Success copy$default(Success success, String str, PlusPaymentMethod plusPaymentMethod, int i, Object obj) {
            if ((i & 1) != 0) {
                str = success.selectButtonText;
            }
            if ((i & 2) != 0) {
                plusPaymentMethod = success.paymentMethod;
            }
            return success.copy(str, plusPaymentMethod);
        }

        public static final /* synthetic */ void write$Self$psdk_adapter_api_release(Success self, yjd output, SerialDescriptor serialDesc) {
            i3y[] i3yVarArr = $childSerializers;
            output.o(serialDesc, 0, self.selectButtonText);
            output.e(serialDesc, 1, (KSerializer) i3yVarArr[1].getValue(), self.paymentMethod);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSelectButtonText() {
            return this.selectButtonText;
        }

        /* renamed from: component2, reason: from getter */
        public final PlusPaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        public final Success copy(String selectButtonText, PlusPaymentMethod paymentMethod) {
            return new Success(selectButtonText, paymentMethod);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return jl40.l(this.selectButtonText, success.selectButtonText) && jl40.l(this.paymentMethod, success.paymentMethod);
        }

        public final PlusPaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        public final String getSelectButtonText() {
            return this.selectButtonText;
        }

        public int hashCode() {
            return this.paymentMethod.hashCode() + (this.selectButtonText.hashCode() * 31);
        }

        public String toString() {
            return "Success(selectButtonText=" + this.selectButtonText + ", paymentMethod=" + this.paymentMethod + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.selectButtonText);
            dest.writeParcelable(this.paymentMethod, flags);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Success> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Success createFromParcel(Parcel parcel) {
                return new Success(parcel.readString(), (PlusPaymentMethod) parcel.readParcelable(Success.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Success[] newArray(int i) {
                return new Success[i];
            }
        }

        public Success(String str, PlusPaymentMethod plusPaymentMethod) {
            this.selectButtonText = str;
            this.paymentMethod = plusPaymentMethod;
        }
    }
}
