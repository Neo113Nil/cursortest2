package com.yandex.plus.pay.internal.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bbd0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.o4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayUpsaleStep;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Companion", "CHECKOUT", "UPSALE", "PRESALE", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusPayUpsaleStep implements Parcelable {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlusPayUpsaleStep[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final Parcelable.Creator<PlusPayUpsaleStep> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final PlusPayUpsaleStep CHECKOUT = new PlusPayUpsaleStep("CHECKOUT", 0);
    public static final PlusPayUpsaleStep UPSALE = new PlusPayUpsaleStep("UPSALE", 1);
    public static final PlusPayUpsaleStep PRESALE = new PlusPayUpsaleStep("PRESALE", 2);

    private static final /* synthetic */ PlusPayUpsaleStep[] $values() {
        return new PlusPayUpsaleStep[]{CHECKOUT, UPSALE, PRESALE};
    }

    static {
        PlusPayUpsaleStep[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
        INSTANCE = new Companion(null);
        CREATOR = new Parcelable.Creator<PlusPayUpsaleStep>() { // from class: com.yandex.plus.pay.internal.model.PlusPayUpsaleStep.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PlusPayUpsaleStep createFromParcel(Parcel parcel) {
                return PlusPayUpsaleStep.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PlusPayUpsaleStep[] newArray(int i) {
                return new PlusPayUpsaleStep[i];
            }
        };
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new bbd0(18));
    }

    private PlusPayUpsaleStep(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _init_$_anonymous_() {
        return new o4o("com.yandex.plus.pay.internal.model.PlusPayUpsaleStep", (Enum[]) values());
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static PlusPayUpsaleStep valueOf(String str) {
        return (PlusPayUpsaleStep) Enum.valueOf(PlusPayUpsaleStep.class, str);
    }

    public static PlusPayUpsaleStep[] values() {
        return (PlusPayUpsaleStep[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name());
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayUpsaleStep$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/yandex/plus/pay/internal/model/PlusPayUpsaleStep;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) PlusPayUpsaleStep.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
