package com.yandex.plus.pay.internal.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.core.data.common.PlusColor;
import com.yandex.plus.core.data.common.PlusThemedColor;
import com.yandex.plus.core.data.common.PlusThemedImage;
import com.yandex.plus.pay.api.model.PlusPayLegalInfo;
import defpackage.auu0;
import defpackage.b64;
import defpackage.bbd0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.lfx;
import defpackage.p53;
import defpackage.psq0;
import defpackage.qje;
import defpackage.qoi0;
import defpackage.ssp0;
import defpackage.tcc;
import defpackage.unr0;
import defpackage.vfc;
import defpackage.w511;
import defpackage.xpd0;
import defpackage.yjd;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00030/1B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J*\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001fJ\u0010\u0010%\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b%\u0010\u0018J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010!¨\u00062"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayRichText;", "Landroid/os/Parcelable;", "", "text", "", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item;", "items", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/internal/model/PlusPayRichText;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/yandex/plus/pay/internal/model/PlusPayRichText;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "Ljava/util/List;", "getItems", "Companion", "Item", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PlusPayRichText implements Parcelable {
    private final List<Item> items;
    private final String text;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<PlusPayRichText> CREATOR = new Creator();
    private static final i3y[] $childSerializers = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new bbd0(12))};

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00102\u00020\u0001:\u0007\n\u000b\f\r\u000e\u000f\u0010R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005\u0082\u0001\u0006\u0011\u0012\u0013\u0014\u0015\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item;", "Landroid/os/Parcelable;", "altText", "", "getAltText", "()Ljava/lang/String;", "key", "getKey", Constants.KEY_DATA, "getData", "TextColor", "Icon", "Link", "Strikethrough", "Highlight", "Text", "Companion", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Highlight;", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Icon;", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Link;", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Strikethrough;", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Text;", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$TextColor;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @gsq0
    public interface Item extends Parcelable {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            public final KSerializer serializer() {
                return new ssp0("com.yandex.plus.pay.internal.model.PlusPayRichText.Item", qoi0.a(Item.class), new lfx[]{qoi0.a(Highlight.class), qoi0.a(Icon.class), qoi0.a(Link.class), qoi0.a(Strikethrough.class), qoi0.a(Text.class), qoi0.a(TextColor.class)}, new KSerializer[]{PlusPayRichText$Item$Highlight$$serializer.INSTANCE, PlusPayRichText$Item$Icon$$serializer.INSTANCE, PlusPayRichText$Item$Link$$serializer.INSTANCE, PlusPayRichText$Item$Strikethrough$$serializer.INSTANCE, PlusPayRichText$Item$Text$$serializer.INSTANCE, PlusPayRichText$Item$TextColor$$serializer.INSTANCE}, new Annotation[0]);
            }
        }

        String getAltText();

        String getData();

        String getKey();

        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ0\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b$\u0010\u0017J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u001e¨\u00060"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Highlight;", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item;", "", "altText", "key", Constants.KEY_DATA, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Highlight;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Highlight;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAltText", "getKey", "getData", "Companion", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @gsq0
        public static final /* data */ class Highlight implements Item {
            private final String altText;
            private final String data;
            private final String key;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final Parcelable.Creator<Highlight> CREATOR = new Creator();

            public /* synthetic */ Highlight(int i, String str, String str2, String str3, psq0 psq0Var) {
                if (6 != (i & 6)) {
                    qje.Z(i, 6, PlusPayRichText$Item$Highlight$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                if ((i & 1) == 0) {
                    this.altText = null;
                } else {
                    this.altText = str;
                }
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

            public static final /* synthetic */ void write$Self$pay_sdk_release(Highlight self, yjd output, SerialDescriptor serialDesc) {
                if (output.F() || self.getAltText() != null) {
                    output.g(serialDesc, 0, auu0.a, self.getAltText());
                }
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

            @Override // com.yandex.plus.pay.internal.model.PlusPayRichText.Item
            public String getAltText() {
                return this.altText;
            }

            @Override // com.yandex.plus.pay.internal.model.PlusPayRichText.Item
            public String getData() {
                return this.data;
            }

            @Override // com.yandex.plus.pay.internal.model.PlusPayRichText.Item
            public String getKey() {
                return this.key;
            }

            public int hashCode() {
                String str = this.altText;
                return this.data.hashCode() + unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.key);
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

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Highlight$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Highlight;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public final KSerializer serializer() {
                    return PlusPayRichText$Item$Highlight$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
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
                this.altText = str;
                this.key = str2;
                this.data = str3;
            }

            public /* synthetic */ Highlight(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, str2, str3);
            }
        }

        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0010\u0010#\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J:\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010 J\u0010\u0010(\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b(\u0010\u0019J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010 R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010 R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b1\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010$¨\u00066"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Icon;", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item;", "", "altText", "key", Constants.KEY_DATA, "Lcom/yandex/plus/core/data/common/PlusThemedImage;", "image", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedImage;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedImage;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Icon;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/yandex/plus/core/data/common/PlusThemedImage;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedImage;)Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Icon;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAltText", "getKey", "getData", "Lcom/yandex/plus/core/data/common/PlusThemedImage;", "getImage", "Companion", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @gsq0
        public static final /* data */ class Icon implements Item {
            private final String altText;
            private final String data;
            private final PlusThemedImage image;
            private final String key;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final Parcelable.Creator<Icon> CREATOR = new Creator();

            public /* synthetic */ Icon(int i, String str, String str2, String str3, PlusThemedImage plusThemedImage, psq0 psq0Var) {
                if (11 != (i & 11)) {
                    qje.Z(i, 11, PlusPayRichText$Item$Icon$$serializer.INSTANCE.getDescriptor());
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

            public static final /* synthetic */ void write$Self$pay_sdk_release(Icon self, yjd output, SerialDescriptor serialDesc) {
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

            @Override // com.yandex.plus.pay.internal.model.PlusPayRichText.Item
            public String getAltText() {
                return this.altText;
            }

            @Override // com.yandex.plus.pay.internal.model.PlusPayRichText.Item
            public String getData() {
                return this.data;
            }

            public final PlusThemedImage getImage() {
                return this.image;
            }

            @Override // com.yandex.plus.pay.internal.model.PlusPayRichText.Item
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

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Icon$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Icon;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public final KSerializer serializer() {
                    return PlusPayRichText$Item$Icon$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
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

            public Icon(String str, String str2, String str3, PlusThemedImage plusThemedImage) {
                this.altText = str;
                this.key = str2;
                this.data = str3;
                this.image = plusThemedImage;
            }

            public /* synthetic */ Icon(String str, String str2, String str3, PlusThemedImage plusThemedImage, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, (i & 4) != 0 ? null : str3, plusThemedImage);
            }
        }

        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ:\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001fJ\u0010\u0010&\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b&\u0010\u0018J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b/\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b0\u0010\u001f¨\u00063"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Link;", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item;", "", "altText", "key", Constants.KEY_DATA, "link", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Link;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Link;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAltText", "getKey", "getData", "getLink", "Companion", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @gsq0
        public static final /* data */ class Link implements Item {
            private final String altText;
            private final String data;
            private final String key;
            private final String link;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final Parcelable.Creator<Link> CREATOR = new Creator();

            public /* synthetic */ Link(int i, String str, String str2, String str3, String str4, psq0 psq0Var) {
                if (14 != (i & 14)) {
                    qje.Z(i, 14, PlusPayRichText$Item$Link$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                if ((i & 1) == 0) {
                    this.altText = null;
                } else {
                    this.altText = str;
                }
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

            public static final /* synthetic */ void write$Self$pay_sdk_release(Link self, yjd output, SerialDescriptor serialDesc) {
                if (output.F() || self.getAltText() != null) {
                    output.g(serialDesc, 0, auu0.a, self.getAltText());
                }
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

            @Override // com.yandex.plus.pay.internal.model.PlusPayRichText.Item
            public String getAltText() {
                return this.altText;
            }

            @Override // com.yandex.plus.pay.internal.model.PlusPayRichText.Item
            public String getData() {
                return this.data;
            }

            @Override // com.yandex.plus.pay.internal.model.PlusPayRichText.Item
            public String getKey() {
                return this.key;
            }

            public final String getLink() {
                return this.link;
            }

            public int hashCode() {
                String str = this.altText;
                return this.link.hashCode() + unr0.b(unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.key), 31, this.data);
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

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Link$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Link;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public final KSerializer serializer() {
                    return PlusPayRichText$Item$Link$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
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
                this.altText = str;
                this.key = str2;
                this.data = str3;
                this.link = str4;
            }

            public /* synthetic */ Link(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, str2, str3, str4);
            }
        }

        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ0\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b$\u0010\u0017J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u001e¨\u00060"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Strikethrough;", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item;", "", "altText", "key", Constants.KEY_DATA, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Strikethrough;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Strikethrough;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAltText", "getKey", "getData", "Companion", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @gsq0
        public static final /* data */ class Strikethrough implements Item {
            private final String altText;
            private final String data;
            private final String key;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final Parcelable.Creator<Strikethrough> CREATOR = new Creator();

            public /* synthetic */ Strikethrough(int i, String str, String str2, String str3, psq0 psq0Var) {
                if (6 != (i & 6)) {
                    qje.Z(i, 6, PlusPayRichText$Item$Strikethrough$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                if ((i & 1) == 0) {
                    this.altText = null;
                } else {
                    this.altText = str;
                }
                this.key = str2;
                this.data = str3;
            }

            public static /* synthetic */ Strikethrough copy$default(Strikethrough strikethrough, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = strikethrough.altText;
                }
                if ((i & 2) != 0) {
                    str2 = strikethrough.key;
                }
                if ((i & 4) != 0) {
                    str3 = strikethrough.data;
                }
                return strikethrough.copy(str, str2, str3);
            }

            public static final /* synthetic */ void write$Self$pay_sdk_release(Strikethrough self, yjd output, SerialDescriptor serialDesc) {
                if (output.F() || self.getAltText() != null) {
                    output.g(serialDesc, 0, auu0.a, self.getAltText());
                }
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

            public final Strikethrough copy(String altText, String key, String data) {
                return new Strikethrough(altText, key, data);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Strikethrough)) {
                    return false;
                }
                Strikethrough strikethrough = (Strikethrough) other;
                return jl40.l(this.altText, strikethrough.altText) && jl40.l(this.key, strikethrough.key) && jl40.l(this.data, strikethrough.data);
            }

            @Override // com.yandex.plus.pay.internal.model.PlusPayRichText.Item
            public String getAltText() {
                return this.altText;
            }

            @Override // com.yandex.plus.pay.internal.model.PlusPayRichText.Item
            public String getData() {
                return this.data;
            }

            @Override // com.yandex.plus.pay.internal.model.PlusPayRichText.Item
            public String getKey() {
                return this.key;
            }

            public int hashCode() {
                String str = this.altText;
                return this.data.hashCode() + unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.key);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("Strikethrough(altText=");
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

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Strikethrough$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Strikethrough;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public final KSerializer serializer() {
                    return PlusPayRichText$Item$Strikethrough$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Strikethrough> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Strikethrough createFromParcel(Parcel parcel) {
                    return new Strikethrough(parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Strikethrough[] newArray(int i) {
                    return new Strikethrough[i];
                }
            }

            public Strikethrough(String str, String str2, String str3) {
                this.altText = str;
                this.key = str2;
                this.data = str3;
            }

            public /* synthetic */ Strikethrough(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, str2, str3);
            }
        }

        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ0\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b$\u0010\u0017J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u001e¨\u00060"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Text;", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item;", "", "altText", "key", Constants.KEY_DATA, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Text;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Text;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAltText", "getKey", "getData", "Companion", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @gsq0
        public static final /* data */ class Text implements Item {
            private final String altText;
            private final String data;
            private final String key;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final Parcelable.Creator<Text> CREATOR = new Creator();

            public /* synthetic */ Text(int i, String str, String str2, String str3, psq0 psq0Var) {
                if (6 != (i & 6)) {
                    qje.Z(i, 6, PlusPayRichText$Item$Text$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                if ((i & 1) == 0) {
                    this.altText = null;
                } else {
                    this.altText = str;
                }
                this.key = str2;
                this.data = str3;
            }

            public static /* synthetic */ Text copy$default(Text text, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = text.altText;
                }
                if ((i & 2) != 0) {
                    str2 = text.key;
                }
                if ((i & 4) != 0) {
                    str3 = text.data;
                }
                return text.copy(str, str2, str3);
            }

            public static final /* synthetic */ void write$Self$pay_sdk_release(Text self, yjd output, SerialDescriptor serialDesc) {
                if (output.F() || self.getAltText() != null) {
                    output.g(serialDesc, 0, auu0.a, self.getAltText());
                }
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

            public final Text copy(String altText, String key, String data) {
                return new Text(altText, key, data);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Text)) {
                    return false;
                }
                Text text = (Text) other;
                return jl40.l(this.altText, text.altText) && jl40.l(this.key, text.key) && jl40.l(this.data, text.data);
            }

            @Override // com.yandex.plus.pay.internal.model.PlusPayRichText.Item
            public String getAltText() {
                return this.altText;
            }

            @Override // com.yandex.plus.pay.internal.model.PlusPayRichText.Item
            public String getData() {
                return this.data;
            }

            @Override // com.yandex.plus.pay.internal.model.PlusPayRichText.Item
            public String getKey() {
                return this.key;
            }

            public int hashCode() {
                String str = this.altText;
                return this.data.hashCode() + unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.key);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("Text(altText=");
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

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Text$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$Text;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public final KSerializer serializer() {
                    return PlusPayRichText$Item$Text$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Text> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Text createFromParcel(Parcel parcel) {
                    return new Text(parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Text[] newArray(int i) {
                    return new Text[i];
                }
            }

            public Text(String str, String str2, String str3) {
                this.altText = str;
                this.key = str2;
                this.data = str3;
            }

            public /* synthetic */ Text(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, str2, str3);
            }
        }

        @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nBI\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b$\u0010%J>\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010!J\u0010\u0010)\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b)\u0010\u001aJ\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010!R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010!R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b2\u0010!R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010%¨\u00067"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$TextColor;", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item;", "", "altText", "key", Constants.KEY_DATA, "Lcom/yandex/plus/core/data/common/PlusThemedColor;", "Lcom/yandex/plus/core/data/common/PlusColor;", "color", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedColor;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$TextColor;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/yandex/plus/core/data/common/PlusThemedColor;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedColor;)Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$TextColor;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAltText", "getKey", "getData", "Lcom/yandex/plus/core/data/common/PlusThemedColor;", "getColor", "Companion", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @gsq0
        public static final /* data */ class TextColor implements Item {
            private final String altText;
            private final PlusThemedColor<PlusColor> color;
            private final String data;
            private final String key;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final Parcelable.Creator<TextColor> CREATOR = new Creator();
            private static final i3y[] $childSerializers = {null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new bbd0(13))};

            public /* synthetic */ TextColor(int i, String str, String str2, String str3, PlusThemedColor plusThemedColor, psq0 psq0Var) {
                if (15 != (i & 15)) {
                    qje.Z(i, 15, PlusPayRichText$Item$TextColor$$serializer.INSTANCE.getDescriptor());
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

            public static final /* synthetic */ void write$Self$pay_sdk_release(TextColor self, yjd output, SerialDescriptor serialDesc) {
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

            @Override // com.yandex.plus.pay.internal.model.PlusPayRichText.Item
            public String getAltText() {
                return this.altText;
            }

            public final PlusThemedColor<PlusColor> getColor() {
                return this.color;
            }

            @Override // com.yandex.plus.pay.internal.model.PlusPayRichText.Item
            public String getData() {
                return this.data;
            }

            @Override // com.yandex.plus.pay.internal.model.PlusPayRichText.Item
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

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$TextColor$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Item$TextColor;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public final KSerializer serializer() {
                    return PlusPayRichText$Item$TextColor$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
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
                this.altText = str;
                this.key = str2;
                this.data = str3;
                this.color = plusThemedColor;
            }
        }
    }

    public /* synthetic */ PlusPayRichText(int i, String str, List list, psq0 psq0Var) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, PlusPayRichText$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.text = str;
        this.items = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new p53(Item.INSTANCE.serializer(), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlusPayRichText copy$default(PlusPayRichText plusPayRichText, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = plusPayRichText.text;
        }
        if ((i & 2) != 0) {
            list = plusPayRichText.items;
        }
        return plusPayRichText.copy(str, list);
    }

    public static final /* synthetic */ void write$Self$pay_sdk_release(PlusPayRichText self, yjd output, SerialDescriptor serialDesc) {
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

    public final PlusPayRichText copy(String text, List<? extends Item> items) {
        return new PlusPayRichText(text, items);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlusPayRichText)) {
            return false;
        }
        PlusPayRichText plusPayRichText = (PlusPayRichText) other;
        return jl40.l(this.text, plusPayRichText.text) && jl40.l(this.items, plusPayRichText.items);
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
        StringBuilder sb = new StringBuilder("PlusPayRichText(text=");
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\u0005J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayRichText$Companion;", "", "<init>", "()V", "fromString", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText;", "string", "", "fromLegalInfo", "legalsInfo", "Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo;", "empty", "serializer", "Lkotlinx/serialization/KSerializer;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PlusPayRichText empty() {
            return fromString("");
        }

        public final PlusPayRichText fromLegalInfo(PlusPayLegalInfo legalsInfo) {
            Item text;
            String text2 = legalsInfo.getText();
            List<PlusPayLegalInfo.Item> items = legalsInfo.getItems();
            ArrayList arrayList = new ArrayList(tcc.n(items, 10));
            for (PlusPayLegalInfo.Item item : items) {
                if (item instanceof PlusPayLegalInfo.Item.Link) {
                    PlusPayLegalInfo.Item.Link link = (PlusPayLegalInfo.Item.Link) item;
                    text = new Item.Link((String) null, link.getKey(), link.getText(), link.getLink(), 1, (DefaultConstructorMarker) null);
                } else {
                    if (!(item instanceof PlusPayLegalInfo.Item.Text)) {
                        w511.b();
                        return null;
                    }
                    PlusPayLegalInfo.Item.Text text3 = (PlusPayLegalInfo.Item.Text) item;
                    text = new Item.Text((String) null, text3.getKey(), text3.getText(), 1, (DefaultConstructorMarker) null);
                }
                arrayList.add(text);
            }
            return new PlusPayRichText(text2, arrayList);
        }

        public final PlusPayRichText fromString(String string) {
            return new PlusPayRichText(string, EmptyList.a);
        }

        public final KSerializer serializer() {
            return PlusPayRichText$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PlusPayRichText> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusPayRichText createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = vfc.e(PlusPayRichText.class, parcel, arrayList, i, 1);
            }
            return new PlusPayRichText(readString, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusPayRichText[] newArray(int i) {
            return new PlusPayRichText[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlusPayRichText(String str, List<? extends Item> list) {
        this.text = str;
        this.items = list;
    }
}
