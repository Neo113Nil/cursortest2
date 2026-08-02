package com.yandex.plus.pay.repository.api.model.offers;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.core.data.common.PlusColor;
import com.yandex.plus.core.data.common.PlusThemedColor;
import com.yandex.plus.core.data.common.PlusThemedImage;
import defpackage.auu0;
import defpackage.b64;
import defpackage.f3k0;
import defpackage.g3k0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.lfx;
import defpackage.p53;
import defpackage.psq0;
import defpackage.qje;
import defpackage.qoi0;
import defpackage.ssp0;
import defpackage.unr0;
import defpackage.vfc;
import defpackage.xpd0;
import defpackage.yjd;
import defpackage.zfj0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0003012B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J*\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001fJ\u0010\u0010%\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b%\u0010\u0018J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010!¨\u00063"}, d2 = {"Lcom/yandex/plus/pay/repository/api/model/offers/RichText;", "Landroid/os/Parcelable;", "", "text", "", "Lcom/yandex/plus/pay/repository/api/model/offers/RichText$Item;", "items", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$pay_sdk_domain_repository_api_release", "(Lcom/yandex/plus/pay/repository/api/model/offers/RichText;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/yandex/plus/pay/repository/api/model/offers/RichText;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "Ljava/util/List;", "getItems", "Companion", "Item", "f3k0", "g3k0", "pay-sdk-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RichText implements Parcelable {
    private final List<Item> items;
    private final String text;
    public static final g3k0 Companion = new g3k0();
    public static final Parcelable.Creator<RichText> CREATOR = new Creator();
    private static final i3y[] $childSerializers = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new zfj0(13))};

    public /* synthetic */ RichText(int i, String str, List list, psq0 psq0Var) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, f3k0.a.getDescriptor());
            throw null;
        }
        this.text = str;
        this.items = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new p53(Item.Companion.serializer(), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RichText copy$default(RichText richText, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = richText.text;
        }
        if ((i & 2) != 0) {
            list = richText.items;
        }
        return richText.copy(str, list);
    }

    public static final /* synthetic */ void write$Self$pay_sdk_domain_repository_api_release(RichText self, yjd output, SerialDescriptor serialDesc) {
        i3y[] i3yVarArr = $childSerializers;
        output.o(serialDesc, 0, self.text);
        output.e(serialDesc, 1, (KSerializer) i3yVarArr[1].getValue(), self.items);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final List<Item> component2() {
        return this.items;
    }

    public final RichText copy(String text, List<? extends Item> items) {
        return new RichText(text, items);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RichText)) {
            return false;
        }
        RichText richText = (RichText) other;
        return jl40.l(this.text, richText.text) && jl40.l(this.items, richText.items);
    }

    public final List<Item> getItems() {
        return this.items;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.items.hashCode() + (this.text.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RichText(text=");
        sb.append(this.text);
        sb.append(", items=");
        return unr0.t(sb, this.items, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.text);
        Iterator t = vfc.t(dest, this.items);
        while (t.hasNext()) {
            dest.writeParcelable((Parcelable) t.next(), flags);
        }
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00192\u00020\u0001:\u0006\u001a\u001b\u001c\u001d\u001e\u001fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013\u0082\u0001\u0005 !\"#$¨\u0006%"}, d2 = {"Lcom/yandex/plus/pay/repository/api/model/offers/RichText$Item;", "Landroid/os/Parcelable;", "<init>", "()V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self", "(Lcom/yandex/plus/pay/repository/api/model/offers/RichText$Item;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "getAltText", "()Ljava/lang/String;", "altText", "getKey", "key", "getData", Constants.KEY_DATA, "Companion", "TextColor", "Icon", "Link", "StrikeThrough", "Highlight", "com/yandex/plus/pay/repository/api/model/offers/a", "Lcom/yandex/plus/pay/repository/api/model/offers/RichText$Item$Highlight;", "Lcom/yandex/plus/pay/repository/api/model/offers/RichText$Item$Icon;", "Lcom/yandex/plus/pay/repository/api/model/offers/RichText$Item$Link;", "Lcom/yandex/plus/pay/repository/api/model/offers/RichText$Item$StrikeThrough;", "Lcom/yandex/plus/pay/repository/api/model/offers/RichText$Item$TextColor;", "pay-sdk-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @gsq0
    public static abstract class Item implements Parcelable {
        public static final a Companion = new a();
        private static final i3y $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new zfj0(14));

        public /* synthetic */ Item(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new ssp0("com.yandex.plus.pay.repository.api.model.offers.RichText.Item", qoi0.a(Item.class), new lfx[]{qoi0.a(Highlight.class), qoi0.a(Icon.class), qoi0.a(Link.class), qoi0.a(StrikeThrough.class), qoi0.a(TextColor.class)}, new KSerializer[]{b.a, d.a, f.a, h.a, j.a}, new Annotation[0]);
        }

        public static final /* synthetic */ void write$Self(Item self, yjd output, SerialDescriptor serialDesc) {
        }

        public abstract String getAltText();

        public abstract String getData();

        public abstract String getKey();

        @gsq0
        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ.\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b$\u0010\u0017J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u001e¨\u00061"}, d2 = {"Lcom/yandex/plus/pay/repository/api/model/offers/RichText$Item$Highlight;", "Lcom/yandex/plus/pay/repository/api/model/offers/RichText$Item;", "", "altText", "key", Constants.KEY_DATA, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$pay_sdk_domain_repository_api_release", "(Lcom/yandex/plus/pay/repository/api/model/offers/RichText$Item$Highlight;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/plus/pay/repository/api/model/offers/RichText$Item$Highlight;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAltText", "getKey", "getData", "Companion", "com/yandex/plus/pay/repository/api/model/offers/b", "com/yandex/plus/pay/repository/api/model/offers/c", "pay-sdk-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Highlight extends Item {
            private final String altText;
            private final String data;
            private final String key;
            public static final c Companion = new c();
            public static final Parcelable.Creator<Highlight> CREATOR = new Creator();

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Highlight(int i, String str, String str2, String str3, psq0 psq0Var) {
                super(i, psq0Var);
                if (7 != (i & 7)) {
                    qje.Z(i, 7, b.a.getDescriptor());
                    throw null;
                }
                this.altText = str;
                this.key = str2;
                this.data = str3;
            }

            public static /* synthetic */ Highlight copy$default(Highlight highlight, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = highlight.altText;
                }
                if ((i & 2) != 0) {
                    str2 = highlight.key;
                }
                if ((i & 4) != 0) {
                    str3 = highlight.data;
                }
                return highlight.copy(str, str2, str3);
            }

            public static final /* synthetic */ void write$Self$pay_sdk_domain_repository_api_release(Highlight self, yjd output, SerialDescriptor serialDesc) {
                Item.write$Self(self, output, serialDesc);
                output.o(serialDesc, 0, self.getAltText());
                output.o(serialDesc, 1, self.getKey());
                output.o(serialDesc, 2, self.getData());
            }

            /* renamed from: component1, reason: from getter */
            public final String getAltText() {
                return this.altText;
            }

            /* renamed from: component2, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            /* renamed from: component3, reason: from getter */
            public final String getData() {
                return this.data;
            }

            public final Highlight copy(String altText, String key, String data) {
                return new Highlight(altText, key, data);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Highlight)) {
                    return false;
                }
                Highlight highlight = (Highlight) other;
                return jl40.l(this.altText, highlight.altText) && jl40.l(this.key, highlight.key) && jl40.l(this.data, highlight.data);
            }

            @Override // com.yandex.plus.pay.repository.api.model.offers.RichText.Item
            public String getAltText() {
                return this.altText;
            }

            @Override // com.yandex.plus.pay.repository.api.model.offers.RichText.Item
            public String getData() {
                return this.data;
            }

            @Override // com.yandex.plus.pay.repository.api.model.offers.RichText.Item
            public String getKey() {
                return this.key;
            }

            public int hashCode() {
                return this.data.hashCode() + unr0.b(this.altText.hashCode() * 31, 31, this.key);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("Highlight(altText=");
                sb.append(this.altText);
                sb.append(", key=");
                sb.append(this.key);
                sb.append(", data=");
                return b64.p(sb, this.data, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeString(this.altText);
                dest.writeString(this.key);
                dest.writeString(this.data);
            }

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Highlight> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Highlight createFromParcel(Parcel parcel) {
                    return new Highlight(parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Highlight[] newArray(int i) {
                    return new Highlight[i];
                }
            }

            public Highlight(String str, String str2, String str3) {
                super(null);
                this.altText = str;
                this.key = str2;
                this.data = str3;
            }
        }

        @gsq0
        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000256B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0010\u0010#\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J:\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010 J\u0010\u0010(\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b(\u0010\u0019J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010 R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010 R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b1\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010$¨\u00067"}, d2 = {"Lcom/yandex/plus/pay/repository/api/model/offers/RichText$Item$Icon;", "Lcom/yandex/plus/pay/repository/api/model/offers/RichText$Item;", "", "altText", "key", Constants.KEY_DATA, "Lcom/yandex/plus/core/data/common/PlusThemedImage;", "image", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedImage;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedImage;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$pay_sdk_domain_repository_api_release", "(Lcom/yandex/plus/pay/repository/api/model/offers/RichText$Item$Icon;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/yandex/plus/core/data/common/PlusThemedImage;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedImage;)Lcom/yandex/plus/pay/repository/api/model/offers/RichText$Item$Icon;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAltText", "getKey", "getData", "Lcom/yandex/plus/core/data/common/PlusThemedImage;", "getImage", "Companion", "com/yandex/plus/pay/repository/api/model/offers/d", "com/yandex/plus/pay/repository/api/model/offers/e", "pay-sdk-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Icon extends Item {
            private final String altText;
            private final String data;
            private final PlusThemedImage image;
            private final String key;
            public static final e Companion = new e();
            public static final Parcelable.Creator<Icon> CREATOR = new Creator();

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Icon(int i, String str, String str2, String str3, PlusThemedImage plusThemedImage, psq0 psq0Var) {
                super(i, psq0Var);
                if (11 != (i & 11)) {
                    qje.Z(i, 11, d.a.getDescriptor());
                    throw null;
                }
                this.altText = str;
                this.key = str2;
                if ((i & 4) == 0) {
                    this.data = null;
                } else {
                    this.data = str3;
                }
                this.image = plusThemedImage;
            }

            public static /* synthetic */ Icon copy$default(Icon icon, String str, String str2, String str3, PlusThemedImage plusThemedImage, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = icon.altText;
                }
                if ((i & 2) != 0) {
                    str2 = icon.key;
                }
                if ((i & 4) != 0) {
                    str3 = icon.data;
                }
                if ((i & 8) != 0) {
                    plusThemedImage = icon.image;
                }
                return icon.copy(str, str2, str3, plusThemedImage);
            }

            public static final /* synthetic */ void write$Self$pay_sdk_domain_repository_api_release(Icon self, yjd output, SerialDescriptor serialDesc) {
                Item.write$Self(self, output, serialDesc);
                output.o(serialDesc, 0, self.getAltText());
                output.o(serialDesc, 1, self.getKey());
                if (output.F() || self.getData() != null) {
                    output.g(serialDesc, 2, auu0.a, self.getData());
                }
                output.e(serialDesc, 3, xpd0.a, self.image);
            }

            /* renamed from: component1, reason: from getter */
            public final String getAltText() {
                return this.altText;
            }

            /* renamed from: component2, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            /* renamed from: component3, reason: from getter */
            public final String getData() {
                return this.data;
            }

            /* renamed from: component4, reason: from getter */
            public final PlusThemedImage getImage() {
                return this.image;
            }

            public final Icon copy(String altText, String key, String data, PlusThemedImage image) {
                return new Icon(altText, key, data, image);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Icon)) {
                    return false;
                }
                Icon icon = (Icon) other;
                return jl40.l(this.altText, icon.altText) && jl40.l(this.key, icon.key) && jl40.l(this.data, icon.data) && jl40.l(this.image, icon.image);
            }

            @Override // com.yandex.plus.pay.repository.api.model.offers.RichText.Item
            public String getAltText() {
                return this.altText;
            }

            @Override // com.yandex.plus.pay.repository.api.model.offers.RichText.Item
            public String getData() {
                return this.data;
            }

            public final PlusThemedImage getImage() {
                return this.image;
            }

            @Override // com.yandex.plus.pay.repository.api.model.offers.RichText.Item
            public String getKey() {
                return this.key;
            }

            public int hashCode() {
                int b = unr0.b(this.altText.hashCode() * 31, 31, this.key);
                String str = this.data;
                return this.image.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31);
            }

            public String toString() {
                return "Icon(altText=" + this.altText + ", key=" + this.key + ", data=" + this.data + ", image=" + this.image + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeString(this.altText);
                dest.writeString(this.key);
                dest.writeString(this.data);
                dest.writeParcelable(this.image, flags);
            }

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Icon> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Icon createFromParcel(Parcel parcel) {
                    return new Icon(parcel.readString(), parcel.readString(), parcel.readString(), (PlusThemedImage) parcel.readParcelable(Icon.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Icon[] newArray(int i) {
                    return new Icon[i];
                }
            }

            public /* synthetic */ Icon(String str, String str2, String str3, PlusThemedImage plusThemedImage, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, (i & 4) != 0 ? null : str3, plusThemedImage);
            }

            public Icon(String str, String str2, String str3, PlusThemedImage plusThemedImage) {
                super(null);
                this.altText = str;
                this.key = str2;
                this.data = str3;
                this.image = plusThemedImage;
            }
        }

        @gsq0
        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000223B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ8\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001fJ\u0010\u0010&\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b&\u0010\u0018J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b/\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b0\u0010\u001f¨\u00064"}, d2 = {"Lcom/yandex/plus/pay/repository/api/model/offers/RichText$Item$Link;", "Lcom/yandex/plus/pay/repository/api/model/offers/RichText$Item;", "", "altText", "key", Constants.KEY_DATA, "link", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$pay_sdk_domain_repository_api_release", "(Lcom/yandex/plus/pay/repository/api/model/offers/RichText$Item$Link;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/plus/pay/repository/api/model/offers/RichText$Item$Link;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAltText", "getKey", "getData", "getLink", "Companion", "com/yandex/plus/pay/repository/api/model/offers/f", "com/yandex/plus/pay/repository/api/model/offers/g", "pay-sdk-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Link extends Item {
            private final String altText;
            private final String data;
            private final String key;
            private final String link;
            public static final g Companion = new g();
            public static final Parcelable.Creator<Link> CREATOR = new Creator();

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Link(int i, String str, String str2, String str3, String str4, psq0 psq0Var) {
                super(i, psq0Var);
                if (15 != (i & 15)) {
                    qje.Z(i, 15, f.a.getDescriptor());
                    throw null;
                }
                this.altText = str;
                this.key = str2;
                this.data = str3;
                this.link = str4;
            }

            public static /* synthetic */ Link copy$default(Link link, String str, String str2, String str3, String str4, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = link.altText;
                }
                if ((i & 2) != 0) {
                    str2 = link.key;
                }
                if ((i & 4) != 0) {
                    str3 = link.data;
                }
                if ((i & 8) != 0) {
                    str4 = link.link;
                }
                return link.copy(str, str2, str3, str4);
            }

            public static final /* synthetic */ void write$Self$pay_sdk_domain_repository_api_release(Link self, yjd output, SerialDescriptor serialDesc) {
                Item.write$Self(self, output, serialDesc);
                output.o(serialDesc, 0, self.getAltText());
                output.o(serialDesc, 1, self.getKey());
                output.o(serialDesc, 2, self.getData());
                output.o(serialDesc, 3, self.link);
            }

            /* renamed from: component1, reason: from getter */
            public final String getAltText() {
                return this.altText;
            }

            /* renamed from: component2, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            /* renamed from: component3, reason: from getter */
            public final String getData() {
                return this.data;
            }

            /* renamed from: component4, reason: from getter */
            public final String getLink() {
                return this.link;
            }

            public final Link copy(String altText, String key, String data, String link) {
                return new Link(altText, key, data, link);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Link)) {
                    return false;
                }
                Link link = (Link) other;
                return jl40.l(this.altText, link.altText) && jl40.l(this.key, link.key) && jl40.l(this.data, link.data) && jl40.l(this.link, link.link);
            }

            @Override // com.yandex.plus.pay.repository.api.model.offers.RichText.Item
            public String getAltText() {
                return this.altText;
            }

            @Override // com.yandex.plus.pay.repository.api.model.offers.RichText.Item
            public String getData() {
                return this.data;
            }

            @Override // com.yandex.plus.pay.repository.api.model.offers.RichText.Item
            public String getKey() {
                return this.key;
            }

            public final String getLink() {
                return this.link;
            }

            public int hashCode() {
                return this.link.hashCode() + unr0.b(unr0.b(this.altText.hashCode() * 31, 31, this.key), 31, this.data);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("Link(altText=");
                sb.append(this.altText);
                sb.append(", key=");
                sb.append(this.key);
                sb.append(", data=");
                sb.append(this.data);
                sb.append(", link=");
                return b64.p(sb, this.link, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeString(this.altText);
                dest.writeString(this.key);
                dest.writeString(this.data);
                dest.writeString(this.link);
            }

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Link> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Link createFromParcel(Parcel parcel) {
                    return new Link(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Link[] newArray(int i) {
                    return new Link[i];
                }
            }

            public Link(String str, String str2, String str3, String str4) {
                super(null);
                this.altText = str;
                this.key = str2;
                this.data = str3;
                this.link = str4;
            }
        }

        @gsq0
        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ.\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b$\u0010\u0017J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u001e¨\u00061"}, d2 = {"Lcom/yandex/plus/pay/repository/api/model/offers/RichText$Item$StrikeThrough;", "Lcom/yandex/plus/pay/repository/api/model/offers/RichText$Item;", "", "altText", "key", Constants.KEY_DATA, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$pay_sdk_domain_repository_api_release", "(Lcom/yandex/plus/pay/repository/api/model/offers/RichText$Item$StrikeThrough;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/plus/pay/repository/api/model/offers/RichText$Item$StrikeThrough;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAltText", "getKey", "getData", "Companion", "com/yandex/plus/pay/repository/api/model/offers/h", "com/yandex/plus/pay/repository/api/model/offers/i", "pay-sdk-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class StrikeThrough extends Item {
            private final String altText;
            private final String data;
            private final String key;
            public static final i Companion = new i();
            public static final Parcelable.Creator<StrikeThrough> CREATOR = new Creator();

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ StrikeThrough(int i, String str, String str2, String str3, psq0 psq0Var) {
                super(i, psq0Var);
                if (7 != (i & 7)) {
                    qje.Z(i, 7, h.a.getDescriptor());
                    throw null;
                }
                this.altText = str;
                this.key = str2;
                this.data = str3;
            }

            public static /* synthetic */ StrikeThrough copy$default(StrikeThrough strikeThrough, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = strikeThrough.altText;
                }
                if ((i & 2) != 0) {
                    str2 = strikeThrough.key;
                }
                if ((i & 4) != 0) {
                    str3 = strikeThrough.data;
                }
                return strikeThrough.copy(str, str2, str3);
            }

            public static final /* synthetic */ void write$Self$pay_sdk_domain_repository_api_release(StrikeThrough self, yjd output, SerialDescriptor serialDesc) {
                Item.write$Self(self, output, serialDesc);
                output.o(serialDesc, 0, self.getAltText());
                output.o(serialDesc, 1, self.getKey());
                output.o(serialDesc, 2, self.getData());
            }

            /* renamed from: component1, reason: from getter */
            public final String getAltText() {
                return this.altText;
            }

            /* renamed from: component2, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            /* renamed from: component3, reason: from getter */
            public final String getData() {
                return this.data;
            }

            public final StrikeThrough copy(String altText, String key, String data) {
                return new StrikeThrough(altText, key, data);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof StrikeThrough)) {
                    return false;
                }
                StrikeThrough strikeThrough = (StrikeThrough) other;
                return jl40.l(this.altText, strikeThrough.altText) && jl40.l(this.key, strikeThrough.key) && jl40.l(this.data, strikeThrough.data);
            }

            @Override // com.yandex.plus.pay.repository.api.model.offers.RichText.Item
            public String getAltText() {
                return this.altText;
            }

            @Override // com.yandex.plus.pay.repository.api.model.offers.RichText.Item
            public String getData() {
                return this.data;
            }

            @Override // com.yandex.plus.pay.repository.api.model.offers.RichText.Item
            public String getKey() {
                return this.key;
            }

            public int hashCode() {
                return this.data.hashCode() + unr0.b(this.altText.hashCode() * 31, 31, this.key);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("StrikeThrough(altText=");
                sb.append(this.altText);
                sb.append(", key=");
                sb.append(this.key);
                sb.append(", data=");
                return b64.p(sb, this.data, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeString(this.altText);
                dest.writeString(this.key);
                dest.writeString(this.data);
            }

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<StrikeThrough> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final StrikeThrough createFromParcel(Parcel parcel) {
                    return new StrikeThrough(parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final StrikeThrough[] newArray(int i) {
                    return new StrikeThrough[i];
                }
            }

            public StrikeThrough(String str, String str2, String str3) {
                super(null);
                this.altText = str;
                this.key = str2;
                this.data = str3;
            }
        }

        @gsq0
        @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000267B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nBI\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b$\u0010%J>\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010!J\u0010\u0010)\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b)\u0010\u001aJ\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010!R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010!R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b2\u0010!R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010%¨\u00068"}, d2 = {"Lcom/yandex/plus/pay/repository/api/model/offers/RichText$Item$TextColor;", "Lcom/yandex/plus/pay/repository/api/model/offers/RichText$Item;", "", "altText", "key", Constants.KEY_DATA, "Lcom/yandex/plus/core/data/common/PlusThemedColor;", "Lcom/yandex/plus/core/data/common/PlusColor;", "color", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedColor;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$pay_sdk_domain_repository_api_release", "(Lcom/yandex/plus/pay/repository/api/model/offers/RichText$Item$TextColor;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/yandex/plus/core/data/common/PlusThemedColor;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedColor;)Lcom/yandex/plus/pay/repository/api/model/offers/RichText$Item$TextColor;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAltText", "getKey", "getData", "Lcom/yandex/plus/core/data/common/PlusThemedColor;", "getColor", "Companion", "com/yandex/plus/pay/repository/api/model/offers/j", "com/yandex/plus/pay/repository/api/model/offers/k", "pay-sdk-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class TextColor extends Item {
            private final String altText;
            private final PlusThemedColor<PlusColor> color;
            private final String data;
            private final String key;
            public static final k Companion = new k();
            public static final Parcelable.Creator<TextColor> CREATOR = new Creator();
            private static final i3y[] $childSerializers = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new zfj0(15))};

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ TextColor(int i, String str, String str2, String str3, PlusThemedColor plusThemedColor, psq0 psq0Var) {
                super(i, psq0Var);
                if (15 != (i & 15)) {
                    qje.Z(i, 15, j.a.getDescriptor());
                    throw null;
                }
                this.altText = str;
                this.key = str2;
                this.data = str3;
                this.color = plusThemedColor;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return PlusThemedColor.Companion.serializer(PlusColor.Companion.serializer());
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ TextColor copy$default(TextColor textColor, String str, String str2, String str3, PlusThemedColor plusThemedColor, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = textColor.altText;
                }
                if ((i & 2) != 0) {
                    str2 = textColor.key;
                }
                if ((i & 4) != 0) {
                    str3 = textColor.data;
                }
                if ((i & 8) != 0) {
                    plusThemedColor = textColor.color;
                }
                return textColor.copy(str, str2, str3, plusThemedColor);
            }

            public static final /* synthetic */ void write$Self$pay_sdk_domain_repository_api_release(TextColor self, yjd output, SerialDescriptor serialDesc) {
                Item.write$Self(self, output, serialDesc);
                i3y[] i3yVarArr = $childSerializers;
                output.o(serialDesc, 0, self.getAltText());
                output.o(serialDesc, 1, self.getKey());
                output.o(serialDesc, 2, self.getData());
                output.e(serialDesc, 3, (KSerializer) i3yVarArr[3].getValue(), self.color);
            }

            /* renamed from: component1, reason: from getter */
            public final String getAltText() {
                return this.altText;
            }

            /* renamed from: component2, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            /* renamed from: component3, reason: from getter */
            public final String getData() {
                return this.data;
            }

            public final PlusThemedColor<PlusColor> component4() {
                return this.color;
            }

            public final TextColor copy(String altText, String key, String data, PlusThemedColor<PlusColor> color) {
                return new TextColor(altText, key, data, color);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TextColor)) {
                    return false;
                }
                TextColor textColor = (TextColor) other;
                return jl40.l(this.altText, textColor.altText) && jl40.l(this.key, textColor.key) && jl40.l(this.data, textColor.data) && jl40.l(this.color, textColor.color);
            }

            @Override // com.yandex.plus.pay.repository.api.model.offers.RichText.Item
            public String getAltText() {
                return this.altText;
            }

            public final PlusThemedColor<PlusColor> getColor() {
                return this.color;
            }

            @Override // com.yandex.plus.pay.repository.api.model.offers.RichText.Item
            public String getData() {
                return this.data;
            }

            @Override // com.yandex.plus.pay.repository.api.model.offers.RichText.Item
            public String getKey() {
                return this.key;
            }

            public int hashCode() {
                return this.color.hashCode() + unr0.b(unr0.b(this.altText.hashCode() * 31, 31, this.key), 31, this.data);
            }

            public String toString() {
                return "TextColor(altText=" + this.altText + ", key=" + this.key + ", data=" + this.data + ", color=" + this.color + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeString(this.altText);
                dest.writeString(this.key);
                dest.writeString(this.data);
                dest.writeParcelable(this.color, flags);
            }

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<TextColor> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final TextColor createFromParcel(Parcel parcel) {
                    return new TextColor(parcel.readString(), parcel.readString(), parcel.readString(), (PlusThemedColor) parcel.readParcelable(TextColor.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final TextColor[] newArray(int i) {
                    return new TextColor[i];
                }
            }

            public TextColor(String str, String str2, String str3, PlusThemedColor<PlusColor> plusThemedColor) {
                super(null);
                this.altText = str;
                this.key = str2;
                this.data = str3;
                this.color = plusThemedColor;
            }
        }

        private Item() {
        }

        public /* synthetic */ Item(int i, psq0 psq0Var) {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RichText> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RichText createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = vfc.e(RichText.class, parcel, arrayList, i, 1);
            }
            return new RichText(readString, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RichText[] newArray(int i) {
            return new RichText[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RichText(String str, List<? extends Item> list) {
        this.text = str;
        this.items = list;
    }
}
