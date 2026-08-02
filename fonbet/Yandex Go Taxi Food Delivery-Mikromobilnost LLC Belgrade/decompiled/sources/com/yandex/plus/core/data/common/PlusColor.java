package com.yandex.plus.core.data.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.lfx;
import defpackage.oyr;
import defpackage.p53;
import defpackage.psq0;
import defpackage.qje;
import defpackage.qoi0;
import defpackage.sfc0;
import defpackage.ssp0;
import defpackage.unr0;
import defpackage.v1d0;
import defpackage.vfc;
import defpackage.yjd;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@gsq0
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\u0003\u0012\u0013\u0014B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0002\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/yandex/plus/core/data/common/PlusColor;", "Landroid/os/Parcelable;", "<init>", "()V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self", "(Lcom/yandex/plus/core/data/common/PlusColor;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "Color", "Gradient", "v1d0", "Lcom/yandex/plus/core/data/common/PlusColor$Color;", "Lcom/yandex/plus/core/data/common/PlusColor$Gradient;", "plus-core-common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class PlusColor implements Parcelable {
    public static final v1d0 Companion = new v1d0();
    private static final i3y $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new sfc0(28));

    public /* synthetic */ PlusColor(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new ssp0("com.yandex.plus.core.data.common.PlusColor", qoi0.a(PlusColor.class), new lfx[]{qoi0.a(Color.class), qoi0.a(Gradient.class)}, new KSerializer[]{a.a, c.a}, new Annotation[0]);
    }

    public static final /* synthetic */ void write$Self(PlusColor self, yjd output, SerialDescriptor serialDesc) {
    }

    @gsq0
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\tJ'\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0014J\u001a\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0014J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0014¨\u0006+"}, d2 = {"Lcom/yandex/plus/core/data/common/PlusColor$Color;", "Lcom/yandex/plus/core/data/common/PlusColor;", "", "color", "<init>", "(I)V", "seen0", "Lpsq0;", "serializationConstructorMarker", "(IILpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$plus_core_common_release", "(Lcom/yandex/plus/core/data/common/PlusColor$Color;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "copy", "(I)Lcom/yandex/plus/core/data/common/PlusColor$Color;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", CA20Status.STATUS_USER_I, "getColor", "Companion", "com/yandex/plus/core/data/common/a", "com/yandex/plus/core/data/common/b", "plus-core-common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Color extends PlusColor {
        private final int color;
        public static final b Companion = new b();
        public static final Parcelable.Creator<Color> CREATOR = new Creator();

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Color(int i, int i2, psq0 psq0Var) {
            super(i, psq0Var);
            if (1 != (i & 1)) {
                qje.Z(i, 1, a.a.getDescriptor());
                throw null;
            }
            this.color = i2;
        }

        public static /* synthetic */ Color copy$default(Color color, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = color.color;
            }
            return color.copy(i);
        }

        public static final /* synthetic */ void write$Self$plus_core_common_release(Color self, yjd output, SerialDescriptor serialDesc) {
            PlusColor.write$Self(self, output, serialDesc);
            output.A(0, self.color, serialDesc);
        }

        /* renamed from: component1, reason: from getter */
        public final int getColor() {
            return this.color;
        }

        public final Color copy(int color) {
            return new Color(color);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Color) && this.color == ((Color) other).color;
        }

        public final int getColor() {
            return this.color;
        }

        public int hashCode() {
            return Integer.hashCode(this.color);
        }

        public String toString() {
            return oyr.s(new StringBuilder("Color(color="), this.color, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.color);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Color> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Color createFromParcel(Parcel parcel) {
                return new Color(parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Color[] newArray(int i) {
                return new Color[i];
            }
        }

        public Color(int i) {
            super(null);
            this.color = i;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b#\u0010\u0016J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010\u001d¨\u0006."}, d2 = {"Lcom/yandex/plus/core/data/common/PlusColor$Gradient;", "Lcom/yandex/plus/core/data/common/PlusColor;", "", "Lcom/yandex/plus/core/data/common/PlusGradient;", "gradients", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/util/List;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$plus_core_common_release", "(Lcom/yandex/plus/core/data/common/PlusColor$Gradient;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/yandex/plus/core/data/common/PlusColor$Gradient;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getGradients", "Companion", "com/yandex/plus/core/data/common/c", "com/yandex/plus/core/data/common/d", "plus-core-common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Gradient extends PlusColor {
        private final List<PlusGradient> gradients;
        public static final d Companion = new d();
        public static final Parcelable.Creator<Gradient> CREATOR = new Creator();
        private static final i3y[] $childSerializers = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new sfc0(29))};

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Gradient(int i, List list, psq0 psq0Var) {
            super(i, psq0Var);
            if (1 != (i & 1)) {
                qje.Z(i, 1, c.a.getDescriptor());
                throw null;
            }
            this.gradients = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new p53(PlusGradient.Companion.serializer(), 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Gradient copy$default(Gradient gradient, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = gradient.gradients;
            }
            return gradient.copy(list);
        }

        public static final /* synthetic */ void write$Self$plus_core_common_release(Gradient self, yjd output, SerialDescriptor serialDesc) {
            PlusColor.write$Self(self, output, serialDesc);
            output.e(serialDesc, 0, (KSerializer) $childSerializers[0].getValue(), self.gradients);
        }

        public final List<PlusGradient> component1() {
            return this.gradients;
        }

        public final Gradient copy(List<? extends PlusGradient> gradients) {
            return new Gradient(gradients);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Gradient) && jl40.l(this.gradients, ((Gradient) other).gradients);
        }

        public final List<PlusGradient> getGradients() {
            return this.gradients;
        }

        public int hashCode() {
            return this.gradients.hashCode();
        }

        public String toString() {
            return unr0.t(new StringBuilder("Gradient(gradients="), this.gradients, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Iterator t = vfc.t(dest, this.gradients);
            while (t.hasNext()) {
                dest.writeParcelable((Parcelable) t.next(), flags);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Gradient> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Gradient createFromParcel(Parcel parcel) {
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = vfc.e(Gradient.class, parcel, arrayList, i, 1);
                }
                return new Gradient(arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Gradient[] newArray(int i) {
                return new Gradient[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Gradient(List<? extends PlusGradient> list) {
            super(null);
            this.gradients = list;
        }
    }

    private PlusColor() {
    }

    public /* synthetic */ PlusColor(int i, psq0 psq0Var) {
    }
}
