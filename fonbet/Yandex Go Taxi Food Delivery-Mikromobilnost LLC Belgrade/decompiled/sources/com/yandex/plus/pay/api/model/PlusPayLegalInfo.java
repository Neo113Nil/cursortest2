package com.yandex.plus.pay.api.model;

import android.os.Parcel;
import android.os.Parcelable;
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
import defpackage.unr0;
import defpackage.vfc;
import defpackage.yjd;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000301/B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J*\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001fJ\u0010\u0010%\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b%\u0010\u0018J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010!¨\u00062"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo;", "Landroid/os/Parcelable;", "", "text", "", "Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo$Item;", "items", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "Ljava/util/List;", "getItems", "Companion", "Item", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PlusPayLegalInfo implements Parcelable {
    private final List<Item> items;
    private final String text;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<PlusPayLegalInfo> CREATOR = new Creator();
    private static final i3y[] $childSerializers = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new bbd0(6))};

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00152\u00020\u0001:\u0003\u0016\u0017\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0002\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo$Item;", "Landroid/os/Parcelable;", "<init>", "()V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self", "(Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo$Item;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "getKey", "()Ljava/lang/String;", "key", "Companion", "Link", "Text", "Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo$Item$Link;", "Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo$Item$Text;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @gsq0
    public static abstract class Item implements Parcelable {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final i3y $cachedSerializer$delegate = a.b(LazyThreadSafetyMode.PUBLICATION, new bbd0(7));

        public /* synthetic */ Item(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new ssp0("com.yandex.plus.pay.api.model.PlusPayLegalInfo.Item", qoi0.a(Item.class), new lfx[]{qoi0.a(Link.class), qoi0.a(Text.class)}, new KSerializer[]{PlusPayLegalInfo$Item$Link$$serializer.INSTANCE, PlusPayLegalInfo$Item$Text$$serializer.INSTANCE}, new Annotation[0]);
        }

        public static final /* synthetic */ void write$Self(Item self, yjd output, SerialDescriptor serialDesc) {
        }

        public abstract String getKey();

        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ.\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b$\u0010\u0017J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u001e¨\u00060"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo$Item$Link;", "Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo$Item;", "", "key", "text", "link", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo$Item$Link;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo$Item$Link;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getKey", "getText", "getLink", "Companion", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @gsq0
        public static final /* data */ class Link extends Item {
            private final String key;
            private final String link;
            private final String text;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final Parcelable.Creator<Link> CREATOR = new Creator();

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Link(int i, String str, String str2, String str3, psq0 psq0Var) {
                super(i, psq0Var);
                if (7 != (i & 7)) {
                    qje.Z(i, 7, PlusPayLegalInfo$Item$Link$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.key = str;
                this.text = str2;
                this.link = str3;
            }

            public static /* synthetic */ Link copy$default(Link link, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = link.key;
                }
                if ((i & 2) != 0) {
                    str2 = link.text;
                }
                if ((i & 4) != 0) {
                    str3 = link.link;
                }
                return link.copy(str, str2, str3);
            }

            public static final /* synthetic */ void write$Self$pay_sdk_release(Link self, yjd output, SerialDescriptor serialDesc) {
                Item.write$Self(self, output, serialDesc);
                output.o(serialDesc, 0, self.getKey());
                output.o(serialDesc, 1, self.text);
                output.o(serialDesc, 2, self.link);
            }

            /* renamed from: component1, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            /* renamed from: component2, reason: from getter */
            public final String getText() {
                return this.text;
            }

            /* renamed from: component3, reason: from getter */
            public final String getLink() {
                return this.link;
            }

            public final Link copy(String key, String text, String link) {
                return new Link(key, text, link);
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
                return jl40.l(this.key, link.key) && jl40.l(this.text, link.text) && jl40.l(this.link, link.link);
            }

            @Override // com.yandex.plus.pay.api.model.PlusPayLegalInfo.Item
            public String getKey() {
                return this.key;
            }

            public final String getLink() {
                return this.link;
            }

            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                return this.link.hashCode() + unr0.b(this.key.hashCode() * 31, 31, this.text);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("Link(key=");
                sb.append(this.key);
                sb.append(", text=");
                sb.append(this.text);
                sb.append(", link=");
                return b64.p(sb, this.link, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeString(this.key);
                dest.writeString(this.text);
                dest.writeString(this.link);
            }

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo$Item$Link$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo$Item$Link;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public final KSerializer serializer() {
                    return PlusPayLegalInfo$Item$Link$$serializer.INSTANCE;
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
                    return new Link(parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Link[] newArray(int i) {
                    return new Link[i];
                }
            }

            public Link(String str, String str2, String str3) {
                super(null);
                this.key = str;
                this.text = str2;
                this.link = str3;
            }
        }

        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ$\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001dJ\u0010\u0010\"\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\"\u0010\u0016J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u001d¨\u0006-"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo$Item$Text;", "Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo$Item;", "", "key", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo$Item$Text;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo$Item$Text;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getKey", "getText", "Companion", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @gsq0
        public static final /* data */ class Text extends Item {
            private final String key;
            private final String text;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final Parcelable.Creator<Text> CREATOR = new Creator();

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Text(int i, String str, String str2, psq0 psq0Var) {
                super(i, psq0Var);
                if (3 != (i & 3)) {
                    qje.Z(i, 3, PlusPayLegalInfo$Item$Text$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.key = str;
                this.text = str2;
            }

            public static /* synthetic */ Text copy$default(Text text, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = text.key;
                }
                if ((i & 2) != 0) {
                    str2 = text.text;
                }
                return text.copy(str, str2);
            }

            public static final /* synthetic */ void write$Self$pay_sdk_release(Text self, yjd output, SerialDescriptor serialDesc) {
                Item.write$Self(self, output, serialDesc);
                output.o(serialDesc, 0, self.getKey());
                output.o(serialDesc, 1, self.text);
            }

            /* renamed from: component1, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            /* renamed from: component2, reason: from getter */
            public final String getText() {
                return this.text;
            }

            public final Text copy(String key, String text) {
                return new Text(key, text);
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
                return jl40.l(this.key, text.key) && jl40.l(this.text, text.text);
            }

            @Override // com.yandex.plus.pay.api.model.PlusPayLegalInfo.Item
            public String getKey() {
                return this.key;
            }

            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                return this.text.hashCode() + (this.key.hashCode() * 31);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("Text(key=");
                sb.append(this.key);
                sb.append(", text=");
                return b64.p(sb, this.text, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeString(this.key);
                dest.writeString(this.text);
            }

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo$Item$Text$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo$Item$Text;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public final KSerializer serializer() {
                    return PlusPayLegalInfo$Item$Text$$serializer.INSTANCE;
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
                    return new Text(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Text[] newArray(int i) {
                    return new Text[i];
                }
            }

            public Text(String str, String str2) {
                super(null);
                this.key = str;
                this.text = str2;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo$Item$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo$Item;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return (KSerializer) Item.$cachedSerializer$delegate.getValue();
            }

            public final KSerializer serializer() {
                return get$cachedSerializer();
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private Item() {
        }

        public /* synthetic */ Item(int i, psq0 psq0Var) {
        }
    }

    public /* synthetic */ PlusPayLegalInfo(int i, String str, List list, psq0 psq0Var) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, PlusPayLegalInfo$$serializer.INSTANCE.getDescriptor());
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
    public static /* synthetic */ PlusPayLegalInfo copy$default(PlusPayLegalInfo plusPayLegalInfo, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = plusPayLegalInfo.text;
        }
        if ((i & 2) != 0) {
            list = plusPayLegalInfo.items;
        }
        return plusPayLegalInfo.copy(str, list);
    }

    public static final /* synthetic */ void write$Self$pay_sdk_release(PlusPayLegalInfo self, yjd output, SerialDescriptor serialDesc) {
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

    public final PlusPayLegalInfo copy(String text, List<? extends Item> items) {
        return new PlusPayLegalInfo(text, items);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlusPayLegalInfo)) {
            return false;
        }
        PlusPayLegalInfo plusPayLegalInfo = (PlusPayLegalInfo) other;
        return jl40.l(this.text, plusPayLegalInfo.text) && jl40.l(this.items, plusPayLegalInfo.items);
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
        StringBuilder sb = new StringBuilder("PlusPayLegalInfo(text=");
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

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer serializer() {
            return PlusPayLegalInfo$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PlusPayLegalInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusPayLegalInfo createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = vfc.e(PlusPayLegalInfo.class, parcel, arrayList, i, 1);
            }
            return new PlusPayLegalInfo(readString, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusPayLegalInfo[] newArray(int i) {
            return new PlusPayLegalInfo[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlusPayLegalInfo(String str, List<? extends Item> list) {
        this.text = str;
        this.items = list;
    }
}
