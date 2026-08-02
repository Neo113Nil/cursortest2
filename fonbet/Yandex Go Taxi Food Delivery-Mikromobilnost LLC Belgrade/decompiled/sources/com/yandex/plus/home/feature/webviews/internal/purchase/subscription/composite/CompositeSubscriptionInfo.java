package com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.home.feature.webviews.internalapi.subscription.SubscriptionInfoError;
import com.yandex.plus.home.repository.api.model.webconfig.SubscriptionConfiguration;
import defpackage.b64;
import defpackage.gsd;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.j0v0;
import defpackage.jl40;
import defpackage.kpd;
import defpackage.oo31;
import defpackage.p53;
import defpackage.psq0;
import defpackage.qje;
import defpackage.qoi0;
import defpackage.unr0;
import defpackage.v5e0;
import defpackage.vfc;
import defpackage.yjd;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\f\rR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0002\u000e\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lcom/yandex/plus/home/feature/webviews/internal/purchase/subscription/composite/CompositeSubscriptionInfo;", "Lj0v0;", "Landroid/os/Parcelable;", "", "Lcom/yandex/plus/home/feature/webviews/internal/purchase/subscription/composite/CompositeSubscriptionProduct;", "getProducts", "()Ljava/util/List;", "products", "Lcom/yandex/plus/home/feature/webviews/internalapi/subscription/SubscriptionInfoError;", "getError", "()Lcom/yandex/plus/home/feature/webviews/internalapi/subscription/SubscriptionInfoError;", "error", "Home", "Stories", "Lcom/yandex/plus/home/feature/webviews/internal/purchase/subscription/composite/CompositeSubscriptionInfo$Home;", "Lcom/yandex/plus/home/feature/webviews/internal/purchase/subscription/composite/CompositeSubscriptionInfo$Stories;", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface CompositeSubscriptionInfo extends j0v0, Parcelable {
    @Override // defpackage.j0v0
    /* synthetic */ SubscriptionConfiguration getConfig();

    SubscriptionInfoError getError();

    List<CompositeSubscriptionProduct> getProducts();

    @gsq0
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000289B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b$\u0010%J8\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b+\u0010\u001aJ\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010!R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b4\u0010#R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b6\u0010%¨\u0006:"}, d2 = {"Lcom/yandex/plus/home/feature/webviews/internal/purchase/subscription/composite/CompositeSubscriptionInfo$Home;", "Lcom/yandex/plus/home/feature/webviews/internal/purchase/subscription/composite/CompositeSubscriptionInfo;", "Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration;", ConfigConstants.CONFIG, "", "Lcom/yandex/plus/home/feature/webviews/internal/purchase/subscription/composite/CompositeSubscriptionProduct;", "products", "Lcom/yandex/plus/home/feature/webviews/internalapi/subscription/SubscriptionInfoError;", "error", "<init>", "(Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration;Ljava/util/List;Lcom/yandex/plus/home/feature/webviews/internalapi/subscription/SubscriptionInfoError;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration;Ljava/util/List;Lcom/yandex/plus/home/feature/webviews/internalapi/subscription/SubscriptionInfoError;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$plus_home_feature_webviews_release", "(Lcom/yandex/plus/home/feature/webviews/internal/purchase/subscription/composite/CompositeSubscriptionInfo$Home;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration;", "component2", "()Ljava/util/List;", "component3", "()Lcom/yandex/plus/home/feature/webviews/internalapi/subscription/SubscriptionInfoError;", "copy", "(Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration;Ljava/util/List;Lcom/yandex/plus/home/feature/webviews/internalapi/subscription/SubscriptionInfoError;)Lcom/yandex/plus/home/feature/webviews/internal/purchase/subscription/composite/CompositeSubscriptionInfo$Home;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration;", "getConfig", "Ljava/util/List;", "getProducts", "Lcom/yandex/plus/home/feature/webviews/internalapi/subscription/SubscriptionInfoError;", "getError", "Companion", "com/yandex/plus/home/feature/webviews/internal/purchase/subscription/composite/a", "com/yandex/plus/home/feature/webviews/internal/purchase/subscription/composite/b", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Home implements CompositeSubscriptionInfo {
        private static final i3y[] $childSerializers;
        private final SubscriptionConfiguration config;
        private final SubscriptionInfoError error;
        private final List<CompositeSubscriptionProduct> products;
        public static final b Companion = new b();
        public static final Parcelable.Creator<Home> CREATOR = new Creator();

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new kpd(5)), kotlin.a.b(lazyThreadSafetyMode, new kpd(6))};
        }

        public /* synthetic */ Home(int i, SubscriptionConfiguration subscriptionConfiguration, List list, SubscriptionInfoError subscriptionInfoError, psq0 psq0Var) {
            if (7 != (i & 7)) {
                qje.Z(i, 7, a.a.getDescriptor());
                throw null;
            }
            this.config = subscriptionConfiguration;
            this.products = list;
            this.error = subscriptionInfoError;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new p53(gsd.a, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new v5e0(qoi0.a(SubscriptionInfoError.class), new Annotation[0]);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Home copy$default(Home home, SubscriptionConfiguration subscriptionConfiguration, List list, SubscriptionInfoError subscriptionInfoError, int i, Object obj) {
            if ((i & 1) != 0) {
                subscriptionConfiguration = home.config;
            }
            if ((i & 2) != 0) {
                list = home.products;
            }
            if ((i & 4) != 0) {
                subscriptionInfoError = home.error;
            }
            return home.copy(subscriptionConfiguration, list, subscriptionInfoError);
        }

        public static final /* synthetic */ void write$Self$plus_home_feature_webviews_release(Home self, yjd output, SerialDescriptor serialDesc) {
            i3y[] i3yVarArr = $childSerializers;
            output.g(serialDesc, 0, com.yandex.plus.home.repository.api.model.webconfig.a.a, self.getConfig());
            output.e(serialDesc, 1, (KSerializer) i3yVarArr[1].getValue(), self.getProducts());
            output.g(serialDesc, 2, (KSerializer) i3yVarArr[2].getValue(), self.getError());
        }

        /* renamed from: component1, reason: from getter */
        public final SubscriptionConfiguration getConfig() {
            return this.config;
        }

        public final List<CompositeSubscriptionProduct> component2() {
            return this.products;
        }

        /* renamed from: component3, reason: from getter */
        public final SubscriptionInfoError getError() {
            return this.error;
        }

        public final Home copy(SubscriptionConfiguration config, List<CompositeSubscriptionProduct> products, SubscriptionInfoError error) {
            return new Home(config, products, error);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Home)) {
                return false;
            }
            Home home = (Home) other;
            return jl40.l(this.config, home.config) && jl40.l(this.products, home.products) && jl40.l(this.error, home.error);
        }

        @Override // com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.CompositeSubscriptionInfo, defpackage.j0v0
        public SubscriptionConfiguration getConfig() {
            return this.config;
        }

        @Override // com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.CompositeSubscriptionInfo
        public SubscriptionInfoError getError() {
            return this.error;
        }

        @Override // com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.CompositeSubscriptionInfo
        public List<CompositeSubscriptionProduct> getProducts() {
            return this.products;
        }

        public int hashCode() {
            SubscriptionConfiguration subscriptionConfiguration = this.config;
            int c = unr0.c((subscriptionConfiguration == null ? 0 : subscriptionConfiguration.hashCode()) * 31, 31, this.products);
            SubscriptionInfoError subscriptionInfoError = this.error;
            return c + (subscriptionInfoError != null ? subscriptionInfoError.hashCode() : 0);
        }

        public String toString() {
            return "Home(config=" + this.config + ", products=" + this.products + ", error=" + this.error + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.config, flags);
            Iterator t = vfc.t(dest, this.products);
            while (t.hasNext()) {
                ((CompositeSubscriptionProduct) t.next()).writeToParcel(dest, flags);
            }
            dest.writeParcelable(this.error, flags);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Home> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Home createFromParcel(Parcel parcel) {
                SubscriptionConfiguration subscriptionConfiguration = (SubscriptionConfiguration) parcel.readParcelable(Home.class.getClassLoader());
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = oo31.d(CompositeSubscriptionProduct.CREATOR, parcel, arrayList, i, 1);
                }
                return new Home(subscriptionConfiguration, arrayList, (SubscriptionInfoError) parcel.readParcelable(Home.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Home[] newArray(int i) {
                return new Home[i];
            }
        }

        public Home(SubscriptionConfiguration subscriptionConfiguration, List<CompositeSubscriptionProduct> list, SubscriptionInfoError subscriptionInfoError) {
            this.config = subscriptionConfiguration;
            this.products = list;
            this.error = subscriptionInfoError;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<=B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBI\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010 \u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\r¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b(\u0010)JB\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b,\u0010)J\u0010\u0010-\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b-\u0010\u001cJ\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b1\u00102R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010#R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b6\u0010%R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b8\u0010'R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b:\u0010)¨\u0006>"}, d2 = {"Lcom/yandex/plus/home/feature/webviews/internal/purchase/subscription/composite/CompositeSubscriptionInfo$Stories;", "Lcom/yandex/plus/home/feature/webviews/internal/purchase/subscription/composite/CompositeSubscriptionInfo;", "Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration;", ConfigConstants.CONFIG, "", "Lcom/yandex/plus/home/feature/webviews/internal/purchase/subscription/composite/CompositeSubscriptionProduct;", "products", "Lcom/yandex/plus/home/feature/webviews/internalapi/subscription/SubscriptionInfoError;", "error", "", "storyId", "<init>", "(Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration;Ljava/util/List;Lcom/yandex/plus/home/feature/webviews/internalapi/subscription/SubscriptionInfoError;Ljava/lang/String;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration;Ljava/util/List;Lcom/yandex/plus/home/feature/webviews/internalapi/subscription/SubscriptionInfoError;Ljava/lang/String;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$plus_home_feature_webviews_release", "(Lcom/yandex/plus/home/feature/webviews/internal/purchase/subscription/composite/CompositeSubscriptionInfo$Stories;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration;", "component2", "()Ljava/util/List;", "component3", "()Lcom/yandex/plus/home/feature/webviews/internalapi/subscription/SubscriptionInfoError;", "component4", "()Ljava/lang/String;", "copy", "(Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration;Ljava/util/List;Lcom/yandex/plus/home/feature/webviews/internalapi/subscription/SubscriptionInfoError;Ljava/lang/String;)Lcom/yandex/plus/home/feature/webviews/internal/purchase/subscription/composite/CompositeSubscriptionInfo$Stories;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration;", "getConfig", "Ljava/util/List;", "getProducts", "Lcom/yandex/plus/home/feature/webviews/internalapi/subscription/SubscriptionInfoError;", "getError", "Ljava/lang/String;", "getStoryId", "Companion", "com/yandex/plus/home/feature/webviews/internal/purchase/subscription/composite/c", "com/yandex/plus/home/feature/webviews/internal/purchase/subscription/composite/d", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Stories implements CompositeSubscriptionInfo {
        private static final i3y[] $childSerializers;
        private final SubscriptionConfiguration config;
        private final SubscriptionInfoError error;
        private final List<CompositeSubscriptionProduct> products;
        private final String storyId;
        public static final d Companion = new d();
        public static final Parcelable.Creator<Stories> CREATOR = new Creator();

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new kpd(7)), kotlin.a.b(lazyThreadSafetyMode, new kpd(8)), null};
        }

        public /* synthetic */ Stories(int i, SubscriptionConfiguration subscriptionConfiguration, List list, SubscriptionInfoError subscriptionInfoError, String str, psq0 psq0Var) {
            if (15 != (i & 15)) {
                qje.Z(i, 15, c.a.getDescriptor());
                throw null;
            }
            this.config = subscriptionConfiguration;
            this.products = list;
            this.error = subscriptionInfoError;
            this.storyId = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new p53(gsd.a, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new v5e0(qoi0.a(SubscriptionInfoError.class), new Annotation[0]);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Stories copy$default(Stories stories, SubscriptionConfiguration subscriptionConfiguration, List list, SubscriptionInfoError subscriptionInfoError, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                subscriptionConfiguration = stories.config;
            }
            if ((i & 2) != 0) {
                list = stories.products;
            }
            if ((i & 4) != 0) {
                subscriptionInfoError = stories.error;
            }
            if ((i & 8) != 0) {
                str = stories.storyId;
            }
            return stories.copy(subscriptionConfiguration, list, subscriptionInfoError, str);
        }

        public static final /* synthetic */ void write$Self$plus_home_feature_webviews_release(Stories self, yjd output, SerialDescriptor serialDesc) {
            i3y[] i3yVarArr = $childSerializers;
            output.g(serialDesc, 0, com.yandex.plus.home.repository.api.model.webconfig.a.a, self.getConfig());
            output.e(serialDesc, 1, (KSerializer) i3yVarArr[1].getValue(), self.getProducts());
            output.g(serialDesc, 2, (KSerializer) i3yVarArr[2].getValue(), self.getError());
            output.o(serialDesc, 3, self.storyId);
        }

        /* renamed from: component1, reason: from getter */
        public final SubscriptionConfiguration getConfig() {
            return this.config;
        }

        public final List<CompositeSubscriptionProduct> component2() {
            return this.products;
        }

        /* renamed from: component3, reason: from getter */
        public final SubscriptionInfoError getError() {
            return this.error;
        }

        /* renamed from: component4, reason: from getter */
        public final String getStoryId() {
            return this.storyId;
        }

        public final Stories copy(SubscriptionConfiguration config, List<CompositeSubscriptionProduct> products, SubscriptionInfoError error, String storyId) {
            return new Stories(config, products, error, storyId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Stories)) {
                return false;
            }
            Stories stories = (Stories) other;
            return jl40.l(this.config, stories.config) && jl40.l(this.products, stories.products) && jl40.l(this.error, stories.error) && jl40.l(this.storyId, stories.storyId);
        }

        @Override // com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.CompositeSubscriptionInfo, defpackage.j0v0
        public SubscriptionConfiguration getConfig() {
            return this.config;
        }

        @Override // com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.CompositeSubscriptionInfo
        public SubscriptionInfoError getError() {
            return this.error;
        }

        @Override // com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.CompositeSubscriptionInfo
        public List<CompositeSubscriptionProduct> getProducts() {
            return this.products;
        }

        public final String getStoryId() {
            return this.storyId;
        }

        public int hashCode() {
            SubscriptionConfiguration subscriptionConfiguration = this.config;
            int c = unr0.c((subscriptionConfiguration == null ? 0 : subscriptionConfiguration.hashCode()) * 31, 31, this.products);
            SubscriptionInfoError subscriptionInfoError = this.error;
            return this.storyId.hashCode() + ((c + (subscriptionInfoError != null ? subscriptionInfoError.hashCode() : 0)) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Stories(config=");
            sb.append(this.config);
            sb.append(", products=");
            sb.append(this.products);
            sb.append(", error=");
            sb.append(this.error);
            sb.append(", storyId=");
            return b64.p(sb, this.storyId, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.config, flags);
            Iterator t = vfc.t(dest, this.products);
            while (t.hasNext()) {
                ((CompositeSubscriptionProduct) t.next()).writeToParcel(dest, flags);
            }
            dest.writeParcelable(this.error, flags);
            dest.writeString(this.storyId);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Stories> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Stories createFromParcel(Parcel parcel) {
                SubscriptionConfiguration subscriptionConfiguration = (SubscriptionConfiguration) parcel.readParcelable(Stories.class.getClassLoader());
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = oo31.d(CompositeSubscriptionProduct.CREATOR, parcel, arrayList, i, 1);
                }
                return new Stories(subscriptionConfiguration, arrayList, (SubscriptionInfoError) parcel.readParcelable(Stories.class.getClassLoader()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Stories[] newArray(int i) {
                return new Stories[i];
            }
        }

        public Stories(SubscriptionConfiguration subscriptionConfiguration, List<CompositeSubscriptionProduct> list, SubscriptionInfoError subscriptionInfoError, String str) {
            this.config = subscriptionConfiguration;
            this.products = list;
            this.error = subscriptionInfoError;
            this.storyId = str;
        }
    }
}
