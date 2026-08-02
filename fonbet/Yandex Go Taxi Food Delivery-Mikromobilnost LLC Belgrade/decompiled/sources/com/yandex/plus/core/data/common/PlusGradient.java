package com.yandex.plus.core.data.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.e6m;
import defpackage.gsq0;
import defpackage.h6w;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.lfx;
import defpackage.p53;
import defpackage.psq0;
import defpackage.q2d0;
import defpackage.qje;
import defpackage.qoi0;
import defpackage.r2d0;
import defpackage.ssp0;
import defpackage.ta90;
import defpackage.unr0;
import defpackage.vfc;
import defpackage.yjd;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@gsq0
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00182\u00020\u0001:\u0003\u0019\u001a\u001bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013\u0082\u0001\u0002\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/yandex/plus/core/data/common/PlusGradient;", "Landroid/os/Parcelable;", "<init>", "()V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self", "(Lcom/yandex/plus/core/data/common/PlusGradient;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "getColors", "()Ljava/util/List;", "colors", "", "getPositions", "positions", "Companion", "Linear", "Radial", "r2d0", "Lcom/yandex/plus/core/data/common/PlusGradient$Linear;", "Lcom/yandex/plus/core/data/common/PlusGradient$Radial;", "plus-core-common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class PlusGradient implements Parcelable {
    public static final r2d0 Companion = new r2d0();
    private static final i3y $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new q2d0(0));

    public /* synthetic */ PlusGradient(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new ssp0("com.yandex.plus.core.data.common.PlusGradient", qoi0.a(PlusGradient.class), new lfx[]{qoi0.a(Linear.class), qoi0.a(Radial.class)}, new KSerializer[]{e.a, g.a}, new Annotation[0]);
    }

    public static final /* synthetic */ void write$Self(PlusGradient self, yjd output, SerialDescriptor serialDesc) {
    }

    public abstract List<Integer> getColors();

    public abstract List<Double> getPositions();

    @gsq0
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000245B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\"J:\u0010#\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b(\u0010\u0018J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b/\u0010\u001fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b0\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\"¨\u00066"}, d2 = {"Lcom/yandex/plus/core/data/common/PlusGradient$Linear;", "Lcom/yandex/plus/core/data/common/PlusGradient;", "", "", "colors", "", "positions", "angle", "<init>", "(Ljava/util/List;Ljava/util/List;D)V", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;DLpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$plus_core_common_release", "(Lcom/yandex/plus/core/data/common/PlusGradient$Linear;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/util/List;", "component2", "component3", "()D", "copy", "(Ljava/util/List;Ljava/util/List;D)Lcom/yandex/plus/core/data/common/PlusGradient$Linear;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getColors", "getPositions", CA20Status.STATUS_REQUEST_D, "getAngle", "Companion", "com/yandex/plus/core/data/common/e", "com/yandex/plus/core/data/common/f", "plus-core-common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Linear extends PlusGradient {
        private static final i3y[] $childSerializers;
        private final double angle;
        private final List<Integer> colors;
        private final List<Double> positions;
        public static final f Companion = new f();
        public static final Parcelable.Creator<Linear> CREATOR = new Creator();

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new q2d0(1)), kotlin.a.b(lazyThreadSafetyMode, new q2d0(2)), null};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Linear(int i, List list, List list2, double d, psq0 psq0Var) {
            super(i, psq0Var);
            if (7 != (i & 7)) {
                qje.Z(i, 7, e.a.getDescriptor());
                throw null;
            }
            this.colors = list;
            this.positions = list2;
            this.angle = d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new p53(h6w.a, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new p53(e6m.a, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Linear copy$default(Linear linear, List list, List list2, double d, int i, Object obj) {
            if ((i & 1) != 0) {
                list = linear.colors;
            }
            if ((i & 2) != 0) {
                list2 = linear.positions;
            }
            if ((i & 4) != 0) {
                d = linear.angle;
            }
            return linear.copy(list, list2, d);
        }

        public static final /* synthetic */ void write$Self$plus_core_common_release(Linear self, yjd output, SerialDescriptor serialDesc) {
            PlusGradient.write$Self(self, output, serialDesc);
            i3y[] i3yVarArr = $childSerializers;
            output.e(serialDesc, 0, (KSerializer) i3yVarArr[0].getValue(), self.getColors());
            output.e(serialDesc, 1, (KSerializer) i3yVarArr[1].getValue(), self.getPositions());
            output.E(serialDesc, 2, self.angle);
        }

        public final List<Integer> component1() {
            return this.colors;
        }

        public final List<Double> component2() {
            return this.positions;
        }

        /* renamed from: component3, reason: from getter */
        public final double getAngle() {
            return this.angle;
        }

        public final Linear copy(List<Integer> colors, List<Double> positions, double angle) {
            return new Linear(colors, positions, angle);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Linear)) {
                return false;
            }
            Linear linear = (Linear) other;
            return jl40.l(this.colors, linear.colors) && jl40.l(this.positions, linear.positions) && Double.compare(this.angle, linear.angle) == 0;
        }

        public final double getAngle() {
            return this.angle;
        }

        @Override // com.yandex.plus.core.data.common.PlusGradient
        public List<Integer> getColors() {
            return this.colors;
        }

        @Override // com.yandex.plus.core.data.common.PlusGradient
        public List<Double> getPositions() {
            return this.positions;
        }

        public int hashCode() {
            return Double.hashCode(this.angle) + unr0.c(this.colors.hashCode() * 31, 31, this.positions);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Linear(colors=");
            sb.append(this.colors);
            sb.append(", positions=");
            sb.append(this.positions);
            sb.append(", angle=");
            return unr0.q(sb, this.angle, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Iterator t = vfc.t(dest, this.colors);
            while (t.hasNext()) {
                dest.writeInt(((Number) t.next()).intValue());
            }
            Iterator t2 = vfc.t(dest, this.positions);
            while (t2.hasNext()) {
                dest.writeDouble(((Number) t2.next()).doubleValue());
            }
            dest.writeDouble(this.angle);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Linear> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Linear createFromParcel(Parcel parcel) {
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(Integer.valueOf(parcel.readInt()));
                }
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    arrayList2.add(Double.valueOf(parcel.readDouble()));
                }
                return new Linear(arrayList, arrayList2, parcel.readDouble());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Linear[] newArray(int i) {
                return new Linear[i];
            }
        }

        public Linear(List<Integer> list, List<Double> list2, double d) {
            super(null);
            this.colors = list;
            this.positions = list2;
            this.angle = d;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000289BK\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\n\u0010\u000bBg\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u001c\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003¢\u0006\u0004\b#\u0010$J\u001c\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003¢\u0006\u0004\b%\u0010$J\\\u0010&\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00072\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b+\u0010\u001aJ\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b2\u0010!R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b3\u0010!R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b5\u0010$R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b6\u0010$¨\u0006:"}, d2 = {"Lcom/yandex/plus/core/data/common/PlusGradient$Radial;", "Lcom/yandex/plus/core/data/common/PlusGradient;", "", "", "colors", "", "positions", "Lkotlin/Pair;", "radius", "center", "<init>", "(Ljava/util/List;Ljava/util/List;Lkotlin/Pair;Lkotlin/Pair;)V", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lkotlin/Pair;Lkotlin/Pair;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$plus_core_common_release", "(Lcom/yandex/plus/core/data/common/PlusGradient$Radial;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/util/List;", "component2", "component3", "()Lkotlin/Pair;", "component4", "copy", "(Ljava/util/List;Ljava/util/List;Lkotlin/Pair;Lkotlin/Pair;)Lcom/yandex/plus/core/data/common/PlusGradient$Radial;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getColors", "getPositions", "Lkotlin/Pair;", "getRadius", "getCenter", "Companion", "com/yandex/plus/core/data/common/g", "com/yandex/plus/core/data/common/h", "plus-core-common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Radial extends PlusGradient {
        private static final i3y[] $childSerializers;
        private final Pair<Double, Double> center;
        private final List<Integer> colors;
        private final List<Double> positions;
        private final Pair<Double, Double> radius;
        public static final h Companion = new h();
        public static final Parcelable.Creator<Radial> CREATOR = new Creator();

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new q2d0(3)), kotlin.a.b(lazyThreadSafetyMode, new q2d0(4)), kotlin.a.b(lazyThreadSafetyMode, new q2d0(5)), kotlin.a.b(lazyThreadSafetyMode, new q2d0(6))};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Radial(int i, List list, List list2, Pair pair, Pair pair2, psq0 psq0Var) {
            super(i, psq0Var);
            if (15 != (i & 15)) {
                qje.Z(i, 15, g.a.getDescriptor());
                throw null;
            }
            this.colors = list;
            this.positions = list2;
            this.radius = pair;
            this.center = pair2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new p53(h6w.a, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new p53(e6m.a, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
            e6m e6mVar = e6m.a;
            return new ta90(e6mVar, e6mVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
            e6m e6mVar = e6m.a;
            return new ta90(e6mVar, e6mVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Radial copy$default(Radial radial, List list, List list2, Pair pair, Pair pair2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = radial.colors;
            }
            if ((i & 2) != 0) {
                list2 = radial.positions;
            }
            if ((i & 4) != 0) {
                pair = radial.radius;
            }
            if ((i & 8) != 0) {
                pair2 = radial.center;
            }
            return radial.copy(list, list2, pair, pair2);
        }

        public static final /* synthetic */ void write$Self$plus_core_common_release(Radial self, yjd output, SerialDescriptor serialDesc) {
            PlusGradient.write$Self(self, output, serialDesc);
            i3y[] i3yVarArr = $childSerializers;
            output.e(serialDesc, 0, (KSerializer) i3yVarArr[0].getValue(), self.getColors());
            output.e(serialDesc, 1, (KSerializer) i3yVarArr[1].getValue(), self.getPositions());
            output.e(serialDesc, 2, (KSerializer) i3yVarArr[2].getValue(), self.radius);
            output.e(serialDesc, 3, (KSerializer) i3yVarArr[3].getValue(), self.center);
        }

        public final List<Integer> component1() {
            return this.colors;
        }

        public final List<Double> component2() {
            return this.positions;
        }

        public final Pair<Double, Double> component3() {
            return this.radius;
        }

        public final Pair<Double, Double> component4() {
            return this.center;
        }

        public final Radial copy(List<Integer> colors, List<Double> positions, Pair<Double, Double> radius, Pair<Double, Double> center) {
            return new Radial(colors, positions, radius, center);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Radial)) {
                return false;
            }
            Radial radial = (Radial) other;
            return jl40.l(this.colors, radial.colors) && jl40.l(this.positions, radial.positions) && jl40.l(this.radius, radial.radius) && jl40.l(this.center, radial.center);
        }

        public final Pair<Double, Double> getCenter() {
            return this.center;
        }

        @Override // com.yandex.plus.core.data.common.PlusGradient
        public List<Integer> getColors() {
            return this.colors;
        }

        @Override // com.yandex.plus.core.data.common.PlusGradient
        public List<Double> getPositions() {
            return this.positions;
        }

        public final Pair<Double, Double> getRadius() {
            return this.radius;
        }

        public int hashCode() {
            return this.center.hashCode() + ((this.radius.hashCode() + unr0.c(this.colors.hashCode() * 31, 31, this.positions)) * 31);
        }

        public String toString() {
            return "Radial(colors=" + this.colors + ", positions=" + this.positions + ", radius=" + this.radius + ", center=" + this.center + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Iterator t = vfc.t(dest, this.colors);
            while (t.hasNext()) {
                dest.writeInt(((Number) t.next()).intValue());
            }
            Iterator t2 = vfc.t(dest, this.positions);
            while (t2.hasNext()) {
                dest.writeDouble(((Number) t2.next()).doubleValue());
            }
            dest.writeSerializable(this.radius);
            dest.writeSerializable(this.center);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Radial> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Radial createFromParcel(Parcel parcel) {
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(Integer.valueOf(parcel.readInt()));
                }
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    arrayList2.add(Double.valueOf(parcel.readDouble()));
                }
                return new Radial(arrayList, arrayList2, (Pair) parcel.readSerializable(), (Pair) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Radial[] newArray(int i) {
                return new Radial[i];
            }
        }

        public Radial(List<Integer> list, List<Double> list2, Pair<Double, Double> pair, Pair<Double, Double> pair2) {
            super(null);
            this.colors = list;
            this.positions = list2;
            this.radius = pair;
            this.center = pair2;
        }
    }

    private PlusGradient() {
    }

    public /* synthetic */ PlusGradient(int i, psq0 psq0Var) {
    }
}
