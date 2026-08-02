package com.ybsdk.api.pro.entities;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.api.entities.YBProduct;
import com.ybsdk.network.dto.CreateApplicationWithProductJsonAdapter;
import defpackage.jl40;
import defpackage.oo31;
import defpackage.si;
import defpackage.tcc;
import defpackage.unr0;
import defpackage.vfc;
import defpackage.xj1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ4\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\"\u0010\u0016J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u001c¨\u0006."}, d2 = {"Lcom/ybsdk/api/pro/entities/YBProSdkAgreement;", "Landroid/os/Parcelable;", "Lcom/ybsdk/api/pro/entities/YBProSdkAgreementId;", "id", "", "Lcom/ybsdk/api/pro/entities/YBProSdkAccessor;", "accessors", "Lcom/ybsdk/api/entities/YBProduct;", CreateApplicationWithProductJsonAdapter.productKey, "<init>", "(Lcom/ybsdk/api/pro/entities/YBProSdkAgreementId;Ljava/util/List;Lcom/ybsdk/api/entities/YBProduct;)V", "Lxj1;", "entity", "(Lxj1;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/api/pro/entities/YBProSdkAgreementId;", "component2", "()Ljava/util/List;", "component3", "()Lcom/ybsdk/api/entities/YBProduct;", "copy", "(Lcom/ybsdk/api/pro/entities/YBProSdkAgreementId;Ljava/util/List;Lcom/ybsdk/api/entities/YBProduct;)Lcom/ybsdk/api/pro/entities/YBProSdkAgreement;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/api/pro/entities/YBProSdkAgreementId;", "getId", "Ljava/util/List;", "getAccessors", "Lcom/ybsdk/api/entities/YBProduct;", "getProduct", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class YBProSdkAgreement implements Parcelable {
    public static final Parcelable.Creator<YBProSdkAgreement> CREATOR = new Creator();
    private final List<YBProSdkAccessor> accessors;
    private final YBProSdkAgreementId id;
    private final YBProduct product;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public YBProSdkAgreement(xj1 xj1Var) {
        this(r0, r2, xj1Var.c);
        YBProSdkAgreementId yBProSdkAgreementId = new YBProSdkAgreementId(xj1Var.a);
        List list = xj1Var.b;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new YBProSdkAccessor((si) it.next()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ YBProSdkAgreement copy$default(YBProSdkAgreement yBProSdkAgreement, YBProSdkAgreementId yBProSdkAgreementId, List list, YBProduct yBProduct, int i, Object obj) {
        if ((i & 1) != 0) {
            yBProSdkAgreementId = yBProSdkAgreement.id;
        }
        if ((i & 2) != 0) {
            list = yBProSdkAgreement.accessors;
        }
        if ((i & 4) != 0) {
            yBProduct = yBProSdkAgreement.product;
        }
        return yBProSdkAgreement.copy(yBProSdkAgreementId, list, yBProduct);
    }

    /* renamed from: component1, reason: from getter */
    public final YBProSdkAgreementId getId() {
        return this.id;
    }

    public final List<YBProSdkAccessor> component2() {
        return this.accessors;
    }

    /* renamed from: component3, reason: from getter */
    public final YBProduct getProduct() {
        return this.product;
    }

    public final YBProSdkAgreement copy(YBProSdkAgreementId id, List<YBProSdkAccessor> accessors, YBProduct product) {
        return new YBProSdkAgreement(id, accessors, product);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof YBProSdkAgreement)) {
            return false;
        }
        YBProSdkAgreement yBProSdkAgreement = (YBProSdkAgreement) other;
        return jl40.l(this.id, yBProSdkAgreement.id) && jl40.l(this.accessors, yBProSdkAgreement.accessors) && this.product == yBProSdkAgreement.product;
    }

    public final List<YBProSdkAccessor> getAccessors() {
        return this.accessors;
    }

    public final YBProSdkAgreementId getId() {
        return this.id;
    }

    public final YBProduct getProduct() {
        return this.product;
    }

    public int hashCode() {
        return this.product.hashCode() + unr0.c(this.id.hashCode() * 31, 31, this.accessors);
    }

    public String toString() {
        return "YBProSdkAgreement(id=" + this.id + ", accessors=" + this.accessors + ", product=" + this.product + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        this.id.writeToParcel(dest, flags);
        Iterator t = vfc.t(dest, this.accessors);
        while (t.hasNext()) {
            ((YBProSdkAccessor) t.next()).writeToParcel(dest, flags);
        }
        dest.writeString(this.product.name());
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<YBProSdkAgreement> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final YBProSdkAgreement createFromParcel(Parcel parcel) {
            YBProSdkAgreementId createFromParcel = YBProSdkAgreementId.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = oo31.d(YBProSdkAccessor.CREATOR, parcel, arrayList, i, 1);
            }
            return new YBProSdkAgreement(createFromParcel, arrayList, YBProduct.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final YBProSdkAgreement[] newArray(int i) {
            return new YBProSdkAgreement[i];
        }
    }

    public YBProSdkAgreement(YBProSdkAgreementId yBProSdkAgreementId, List<YBProSdkAccessor> list, YBProduct yBProduct) {
        this.id = yBProSdkAgreementId;
        this.accessors = list;
        this.product = yBProduct;
    }
}
