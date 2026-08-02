package com.yandex.div.internal.viewpool;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import xsna.cti;
import xsna.imi0;
import xsna.lmi0;
import xsna.ozl;
import xsna.shy;
import xsna.sp;
import xsna.vu5;
import xsna.zcl;

/* compiled from: ViewPreCreationProfile.kt */
@imi0
/* loaded from: classes7.dex */
public final class PreCreationModel {
    public static final Companion Companion = new Companion(null);
    private final int capacity;
    private final int max;
    private final int min;

    /* compiled from: ViewPreCreationProfile.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final KSerializer<PreCreationModel> serializer() {
            return PreCreationModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public PreCreationModel(int i, int i2, int i3) {
        this.capacity = i;
        this.min = i2;
        this.max = i3;
    }

    public static final /* synthetic */ void write$Self(PreCreationModel preCreationModel, cti ctiVar, SerialDescriptor serialDescriptor) {
        ctiVar.M(0, preCreationModel.capacity, serialDescriptor);
        if (ctiVar.z() || preCreationModel.min != 0) {
            ctiVar.M(1, preCreationModel.min, serialDescriptor);
        }
        if (!ctiVar.z() && preCreationModel.max == Integer.MAX_VALUE) {
            return;
        }
        ctiVar.M(2, preCreationModel.max, serialDescriptor);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreCreationModel)) {
            return false;
        }
        PreCreationModel preCreationModel = (PreCreationModel) obj;
        return this.capacity == preCreationModel.capacity && this.min == preCreationModel.min && this.max == preCreationModel.max;
    }

    public final int getCapacity() {
        return this.capacity;
    }

    public int hashCode() {
        return Integer.hashCode(this.max) + shy.a(this.min, Integer.hashCode(this.capacity) * 31, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PreCreationModel(capacity=");
        sb.append(this.capacity);
        sb.append(", min=");
        sb.append(this.min);
        sb.append(", max=");
        return vu5.b(sb, this.max, ')');
    }

    @ozl
    public /* synthetic */ PreCreationModel(int i, int i2, int i3, int i4, lmi0 lmi0Var) {
        if (1 != (i & 1)) {
            sp.x(i, 1, PreCreationModel$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.capacity = i2;
        if ((i & 2) == 0) {
            this.min = 0;
        } else {
            this.min = i3;
        }
        if ((i & 4) == 0) {
            this.max = Integer.MAX_VALUE;
        } else {
            this.max = i4;
        }
    }

    public /* synthetic */ PreCreationModel(int i, int i2, int i3, int i4, zcl zclVar) {
        this(i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? Integer.MAX_VALUE : i3);
    }
}
