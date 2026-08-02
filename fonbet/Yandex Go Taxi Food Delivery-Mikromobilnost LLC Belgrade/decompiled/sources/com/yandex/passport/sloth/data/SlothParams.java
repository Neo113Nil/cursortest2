package com.yandex.passport.sloth.data;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.properties.CommonWebProperties;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import com.yandex.passport.sloth.dependencies.SlothLoginProperties;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.qv10;
import defpackage.uw51;
import defpackage.w511;
import defpackage.wwg;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 22\u00020\u0001:\u00013B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ:\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b#\u0010\u0016J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001d\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b/\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010\u001d¨\u00064"}, d2 = {"Lcom/yandex/passport/sloth/data/SlothParams;", "Landroid/os/Parcelable;", "Lcom/yandex/passport/sloth/data/c0;", "variant", "Lcom/yandex/passport/common/core/Environment;", WebViewActivity.KEY_ENVIRONMENT, "secondaryEnvironment", "Lcom/yandex/passport/common/properties/CommonWebProperties;", "commonWebProperties", "<init>", "(Lcom/yandex/passport/sloth/data/c0;Lcom/yandex/passport/common/core/Environment;Lcom/yandex/passport/common/core/Environment;Lcom/yandex/passport/common/properties/CommonWebProperties;)V", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/passport/sloth/data/c0;", "component2", "()Lcom/yandex/passport/common/core/Environment;", "component3", "component4", "()Lcom/yandex/passport/common/properties/CommonWebProperties;", "copy", "(Lcom/yandex/passport/sloth/data/c0;Lcom/yandex/passport/common/core/Environment;Lcom/yandex/passport/common/core/Environment;Lcom/yandex/passport/common/properties/CommonWebProperties;)Lcom/yandex/passport/sloth/data/SlothParams;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/passport/sloth/data/c0;", "getVariant", "getVariant$annotations", "()V", "Lcom/yandex/passport/common/core/Environment;", "getEnvironment", "getSecondaryEnvironment", "Lcom/yandex/passport/common/properties/CommonWebProperties;", "getCommonWebProperties", "Companion", "com/yandex/passport/sloth/data/c", "passport-sloth_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SlothParams implements Parcelable {
    public static final String KEY_SLOTH_PARAMS = "SlothParams";
    private final CommonWebProperties commonWebProperties;
    private final Environment environment;
    private final Environment secondaryEnvironment;
    private final c0 variant;
    public static final c Companion = new c();
    public static final Parcelable.Creator<SlothParams> CREATOR = new Creator();

    public /* synthetic */ SlothParams(c0 c0Var, Environment environment, Environment environment2, CommonWebProperties commonWebProperties, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c0Var, (i & 2) != 0 ? Environment.PRODUCTION : environment, (i & 4) != 0 ? null : environment2, (i & 8) != 0 ? new CommonWebProperties(false, null, false, false, 15, null) : commonWebProperties);
    }

    public static /* synthetic */ SlothParams copy$default(SlothParams slothParams, c0 c0Var, Environment environment, Environment environment2, CommonWebProperties commonWebProperties, int i, Object obj) {
        if ((i & 1) != 0) {
            c0Var = slothParams.variant;
        }
        if ((i & 2) != 0) {
            environment = slothParams.environment;
        }
        if ((i & 4) != 0) {
            environment2 = slothParams.secondaryEnvironment;
        }
        if ((i & 8) != 0) {
            commonWebProperties = slothParams.commonWebProperties;
        }
        return slothParams.copy(c0Var, environment, environment2, commonWebProperties);
    }

    public static /* synthetic */ void getVariant$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final c0 getVariant() {
        return this.variant;
    }

    /* renamed from: component2, reason: from getter */
    public final Environment getEnvironment() {
        return this.environment;
    }

    /* renamed from: component3, reason: from getter */
    public final Environment getSecondaryEnvironment() {
        return this.secondaryEnvironment;
    }

    /* renamed from: component4, reason: from getter */
    public final CommonWebProperties getCommonWebProperties() {
        return this.commonWebProperties;
    }

    public final SlothParams copy(c0 variant, Environment environment, Environment secondaryEnvironment, CommonWebProperties commonWebProperties) {
        return new SlothParams(variant, environment, secondaryEnvironment, commonWebProperties);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SlothParams)) {
            return false;
        }
        SlothParams slothParams = (SlothParams) other;
        return jl40.l(this.variant, slothParams.variant) && this.environment == slothParams.environment && this.secondaryEnvironment == slothParams.secondaryEnvironment && jl40.l(this.commonWebProperties, slothParams.commonWebProperties);
    }

    public final CommonWebProperties getCommonWebProperties() {
        return this.commonWebProperties;
    }

    public final Environment getEnvironment() {
        return this.environment;
    }

    public final Environment getSecondaryEnvironment() {
        return this.secondaryEnvironment;
    }

    public final c0 getVariant() {
        return this.variant;
    }

    public int hashCode() {
        int hashCode = (this.environment.hashCode() + (this.variant.hashCode() * 31)) * 31;
        Environment environment = this.secondaryEnvironment;
        return this.commonWebProperties.hashCode() + ((hashCode + (environment == null ? 0 : environment.hashCode())) * 31);
    }

    public final Bundle toBundle() {
        return wwg.g(new Pair(KEY_SLOTH_PARAMS, this));
    }

    public String toString() {
        return "SlothParams(variant=" + this.variant + ", environment=" + this.environment + ", secondaryEnvironment=" + this.secondaryEnvironment + ", commonWebProperties=" + this.commonWebProperties + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        c0 c0Var = this.variant;
        if (c0Var instanceof p) {
            dest.writeInt(0);
            p pVar = (p) c0Var;
            dest.writeString(pVar.a);
            dest.writeParcelable(pVar.b, flags);
            dest.writeInt(com.yandex.passport.internal.ui.c.o(pVar.c));
        } else if (c0Var instanceof w) {
            w wVar = (w) c0Var;
            dest.writeParcelable(wVar.a, flags);
            dest.writeInt(com.yandex.passport.internal.ui.c.o(wVar.b));
            dest.writeParcelable(wVar.c, flags);
        } else if (c0Var instanceof s) {
            s sVar = (s) c0Var;
            dest.writeParcelable(sVar.a, flags);
            dest.writeLong(sVar.b);
            dest.writeString(sVar.c);
            dest.writeInt(com.yandex.passport.internal.ui.c.o(sVar.w));
            dest.writeParcelable(sVar.x, flags);
        } else if (c0Var instanceof z) {
            z zVar = (z) c0Var;
            dest.writeString(zVar.a);
            dest.writeString(zVar.b);
            dest.writeString(zVar.c);
            dest.writeString(zVar.w);
            dest.writeParcelable(zVar.x, flags);
        } else if (c0Var instanceof t) {
            dest.writeParcelable(((t) c0Var).a, flags);
        } else if (c0Var instanceof x) {
            x xVar = (x) c0Var;
            dest.writeString(xVar.a);
            dest.writeParcelable(xVar.b, flags);
            dest.writeInt(com.yandex.passport.internal.ui.c.o(xVar.c));
            dest.writeParcelable(xVar.w, flags);
        } else if (c0Var instanceof j) {
            dest.writeInt(6);
            j jVar = (j) c0Var;
            dest.writeString(jVar.a);
            dest.writeParcelable(jVar.b, flags);
            dest.writeSerializable(jVar.c);
        } else if (c0Var instanceof o) {
            dest.writeInt(7);
            o oVar = (o) c0Var;
            dest.writeString(oVar.a);
            dest.writeParcelable(oVar.b, flags);
            dest.writeSerializable(oVar.c);
        } else if (c0Var instanceof k) {
            dest.writeInt(8);
            k kVar = (k) c0Var;
            dest.writeString(kVar.a);
            dest.writeParcelable(kVar.b, flags);
            dest.writeSerializable(kVar.c);
        } else if (c0Var instanceof u) {
            dest.writeInt(18);
            u uVar = (u) c0Var;
            dest.writeString(uVar.a);
            dest.writeParcelable(uVar.b, 0);
            dest.writeString(uVar.c);
            dest.writeParcelable(uVar.w, flags);
            dest.writeSerializable(uVar.x);
            dest.writeInt(uVar.y);
        } else if (c0Var instanceof b0) {
            dest.writeInt(9);
            b0 b0Var = (b0) c0Var;
            dest.writeString(b0Var.a);
            dest.writeParcelable(b0Var.b, flags);
            dest.writeSerializable(b0Var.c);
            dest.writeSerializable(b0Var.w);
        } else if (c0Var instanceof n) {
            dest.writeInt(10);
            n nVar = (n) c0Var;
            dest.writeString(nVar.a);
            dest.writeString(nVar.b);
            dest.writeParcelable(nVar.c, flags);
            dest.writeInt(com.yandex.passport.internal.ui.c.o(nVar.w));
            dest.writeParcelable(nVar.x, flags);
            dest.writeString(nVar.y);
            dest.writeString(nVar.z);
            dest.writeString(nVar.A);
        } else if (c0Var instanceof l) {
            dest.writeInt(11);
            l lVar = (l) c0Var;
            dest.writeString(lVar.a);
            dest.writeParcelable(lVar.b, flags);
        } else if (c0Var instanceof a0) {
            dest.writeInt(12);
            a0 a0Var = (a0) c0Var;
            dest.writeSerializable(a0Var.a);
            Iterator x = qv10.x(a0Var.b, dest);
            while (x.hasNext()) {
                Map.Entry entry = (Map.Entry) x.next();
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                dest.writeString(str);
                dest.writeString(str2);
            }
            dest.writeParcelable(a0Var.c, flags);
            Long l = a0Var.w;
            dest.writeLong(l != null ? l.longValue() : 0L);
        } else if (c0Var instanceof i) {
            dest.writeInt(14);
            i iVar = (i) c0Var;
            dest.writeParcelable(iVar.a, flags);
            dest.writeLong(iVar.b);
            dest.writeSerializable(iVar.c);
        } else if (c0Var instanceof m) {
            dest.writeInt(13);
            m mVar = (m) c0Var;
            dest.writeParcelable(mVar.a, flags);
            dest.writeString(mVar.b);
        } else if (c0Var instanceof r) {
            dest.writeInt(15);
            r rVar = (r) c0Var;
            dest.writeString(rVar.a);
            dest.writeParcelable(rVar.b, flags);
            dest.writeString(rVar.c);
        } else if (c0Var instanceof q) {
            dest.writeInt(16);
            q qVar = (q) c0Var;
            dest.writeParcelable(qVar.a, flags);
            dest.writeLong(qVar.b);
            dest.writeSerializable(qVar.c);
            dest.writeString(qVar.w);
            dest.writeString(qVar.x);
        } else if (c0Var instanceof y) {
            dest.writeInt(17);
            y yVar = (y) c0Var;
            dest.writeParcelable(yVar.a, flags);
            dest.writeParcelable(yVar.b, flags);
            dest.writeLong(yVar.c);
            dest.writeInt(com.yandex.passport.internal.ui.c.o(yVar.w));
            dest.writeSerializable(yVar.x);
        } else if (c0Var instanceof SlothVariant$BiometricVerification) {
            dest.writeInt(19);
            SlothVariant$BiometricVerification slothVariant$BiometricVerification = (SlothVariant$BiometricVerification) c0Var;
            dest.writeParcelable(slothVariant$BiometricVerification.getUid(), flags);
            dest.writeSerializable(slothVariant$BiometricVerification.getTheme());
            dest.writeString(slothVariant$BiometricVerification.getBiometricSessionId());
            dest.writeString(slothVariant$BiometricVerification.getServiceId());
            dest.writeString(slothVariant$BiometricVerification.getScheme());
        } else {
            if (!(c0Var instanceof v)) {
                w511.b();
                return;
            }
            v vVar = (v) c0Var;
            dest.writeParcelable(vVar.a, flags);
            dest.writeSerializable(vVar.b);
            dest.writeLong(vVar.c);
        }
        dest.writeParcelable(this.environment, flags);
        dest.writeParcelable(this.secondaryEnvironment, flags);
        dest.writeParcelable(this.commonWebProperties, flags);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SlothParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SlothParams createFromParcel(Parcel parcel) {
            c0 pVar;
            boolean z;
            c0 sVar;
            c0 jVar;
            int readInt = parcel.readInt();
            switch (readInt) {
                case 0:
                    String readString = parcel.readString();
                    Parcelable readParcelable = parcel.readParcelable(SlothLoginProperties.class.getClassLoader());
                    if (readParcelable != null) {
                        pVar = new p(readString, (SlothLoginProperties) readParcelable, parcel.readInt() != 0, null);
                        break;
                    } else {
                        ny61.r(uw51.k(new StringBuilder("No data for "), SlothLoginProperties.class));
                        break;
                    }
                case 1:
                    Parcelable readParcelable2 = parcel.readParcelable(SlothLoginProperties.class.getClassLoader());
                    if (readParcelable2 != null) {
                        SlothLoginProperties slothLoginProperties = (SlothLoginProperties) readParcelable2;
                        z = parcel.readInt() != 0;
                        Parcelable readParcelable3 = parcel.readParcelable(AccountForProfile.class.getClassLoader());
                        if (readParcelable3 != null) {
                            pVar = new w(slothLoginProperties, z, (AccountForProfile) readParcelable3, null);
                            break;
                        } else {
                            ny61.r(uw51.k(new StringBuilder("No data for "), AccountForProfile.class));
                            break;
                        }
                    } else {
                        ny61.r(uw51.k(new StringBuilder("No data for "), SlothLoginProperties.class));
                        break;
                    }
                case 2:
                    Parcelable readParcelable4 = parcel.readParcelable(Uid.class.getClassLoader());
                    if (readParcelable4 != null) {
                        Uid uid = (Uid) readParcelable4;
                        long readLong = parcel.readLong();
                        String readString2 = parcel.readString();
                        boolean z2 = parcel.readInt() != 0;
                        Parcelable readParcelable5 = parcel.readParcelable(SlothLoginProperties.class.getClassLoader());
                        if (readParcelable5 != null) {
                            sVar = new s(uid, readLong, readString2, z2, (SlothLoginProperties) readParcelable5);
                            pVar = sVar;
                            break;
                        } else {
                            ny61.r(uw51.k(new StringBuilder("No data for "), SlothLoginProperties.class));
                            break;
                        }
                    } else {
                        ny61.r(uw51.k(new StringBuilder("No data for "), Uid.class));
                        break;
                    }
                case 3:
                    String readString3 = parcel.readString();
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    String readString6 = parcel.readString();
                    Parcelable readParcelable6 = parcel.readParcelable(SlothLoginProperties.class.getClassLoader());
                    if (readParcelable6 != null) {
                        sVar = new z(readString3, readString4, readString5, readString6, (SlothLoginProperties) readParcelable6);
                        pVar = sVar;
                        break;
                    } else {
                        ny61.r(uw51.k(new StringBuilder("No data for "), SlothLoginProperties.class));
                        break;
                    }
                case 4:
                    Parcelable readParcelable7 = parcel.readParcelable(SlothLoginProperties.class.getClassLoader());
                    if (readParcelable7 != null) {
                        pVar = new t((SlothLoginProperties) readParcelable7);
                        break;
                    } else {
                        ny61.r(uw51.k(new StringBuilder("No data for "), SlothLoginProperties.class));
                        break;
                    }
                case 5:
                    String readString7 = parcel.readString();
                    Parcelable readParcelable8 = parcel.readParcelable(Uid.class.getClassLoader());
                    if (readParcelable8 != null) {
                        Uid uid2 = (Uid) readParcelable8;
                        z = parcel.readInt() != 0;
                        Parcelable readParcelable9 = parcel.readParcelable(SlothLoginProperties.class.getClassLoader());
                        if (readParcelable9 != null) {
                            pVar = new x(readString7, uid2, z, (SlothLoginProperties) readParcelable9);
                            break;
                        } else {
                            ny61.r(uw51.k(new StringBuilder("No data for "), SlothLoginProperties.class));
                            break;
                        }
                    } else {
                        ny61.r(uw51.k(new StringBuilder("No data for "), Uid.class));
                        break;
                    }
                case 6:
                    String m = com.yandex.passport.internal.ui.sloth.e.m(parcel);
                    Parcelable readParcelable10 = parcel.readParcelable(Uid.class.getClassLoader());
                    if (readParcelable10 != null) {
                        Uid uid3 = (Uid) readParcelable10;
                        Serializable readSerializable = parcel.readSerializable();
                        if (!(readSerializable instanceof SlothTheme)) {
                            readSerializable = null;
                        }
                        SlothTheme slothTheme = (SlothTheme) readSerializable;
                        if (slothTheme != null) {
                            jVar = new j(m, uid3, slothTheme, false);
                            pVar = jVar;
                            break;
                        } else {
                            ny61.r(uw51.k(new StringBuilder("No data for "), SlothTheme.class));
                            break;
                        }
                    } else {
                        ny61.r(uw51.k(new StringBuilder("No data for "), Uid.class));
                        break;
                    }
                case 7:
                    String m2 = com.yandex.passport.internal.ui.sloth.e.m(parcel);
                    Parcelable readParcelable11 = parcel.readParcelable(Uid.class.getClassLoader());
                    if (readParcelable11 != null) {
                        Uid uid4 = (Uid) readParcelable11;
                        Serializable readSerializable2 = parcel.readSerializable();
                        if (!(readSerializable2 instanceof SlothTheme)) {
                            readSerializable2 = null;
                        }
                        SlothTheme slothTheme2 = (SlothTheme) readSerializable2;
                        if (slothTheme2 != null) {
                            jVar = new o(m2, uid4, slothTheme2);
                            pVar = jVar;
                            break;
                        } else {
                            ny61.r(uw51.k(new StringBuilder("No data for "), SlothTheme.class));
                            break;
                        }
                    } else {
                        ny61.r(uw51.k(new StringBuilder("No data for "), Uid.class));
                        break;
                    }
                case 8:
                    String m3 = com.yandex.passport.internal.ui.sloth.e.m(parcel);
                    Parcelable readParcelable12 = parcel.readParcelable(Uid.class.getClassLoader());
                    if (readParcelable12 != null) {
                        Uid uid5 = (Uid) readParcelable12;
                        Serializable readSerializable3 = parcel.readSerializable();
                        if (!(readSerializable3 instanceof SlothTheme)) {
                            readSerializable3 = null;
                        }
                        SlothTheme slothTheme3 = (SlothTheme) readSerializable3;
                        if (slothTheme3 != null) {
                            jVar = new k(m3, uid5, slothTheme3);
                            pVar = jVar;
                            break;
                        } else {
                            ny61.r(uw51.k(new StringBuilder("No data for "), SlothTheme.class));
                            break;
                        }
                    } else {
                        ny61.r(uw51.k(new StringBuilder("No data for "), Uid.class));
                        break;
                    }
                case 9:
                    String m4 = com.yandex.passport.internal.ui.sloth.e.m(parcel);
                    Parcelable readParcelable13 = parcel.readParcelable(Uid.class.getClassLoader());
                    if (readParcelable13 != null) {
                        Uid uid6 = (Uid) readParcelable13;
                        Serializable readSerializable4 = parcel.readSerializable();
                        if (!(readSerializable4 instanceof SlothTheme)) {
                            readSerializable4 = null;
                        }
                        SlothTheme slothTheme4 = (SlothTheme) readSerializable4;
                        if (slothTheme4 != null) {
                            Serializable readSerializable5 = parcel.readSerializable();
                            if (!(readSerializable5 instanceof PushType)) {
                                readSerializable5 = null;
                            }
                            PushType pushType = (PushType) readSerializable5;
                            if (pushType != null) {
                                jVar = new b0(m4, uid6, slothTheme4, pushType);
                                pVar = jVar;
                                break;
                            } else {
                                ny61.r(uw51.k(new StringBuilder("No data for "), PushType.class));
                                break;
                            }
                        } else {
                            ny61.r(uw51.k(new StringBuilder("No data for "), SlothTheme.class));
                            break;
                        }
                    } else {
                        ny61.r(uw51.k(new StringBuilder("No data for "), Uid.class));
                        break;
                    }
                case 10:
                    String m5 = com.yandex.passport.internal.ui.sloth.e.m(parcel);
                    String m6 = com.yandex.passport.internal.ui.sloth.e.m(parcel);
                    Parcelable readParcelable14 = parcel.readParcelable(SlothLoginProperties.class.getClassLoader());
                    if (readParcelable14 != null) {
                        SlothLoginProperties slothLoginProperties2 = (SlothLoginProperties) readParcelable14;
                        z = parcel.readInt() != 0;
                        Parcelable readParcelable15 = parcel.readParcelable(Uid.class.getClassLoader());
                        if (readParcelable15 != null) {
                            sVar = new n(m5, m6, slothLoginProperties2, z, (Uid) readParcelable15, parcel.readString(), parcel.readString(), com.yandex.passport.internal.ui.sloth.e.m(parcel));
                            pVar = sVar;
                            break;
                        } else {
                            ny61.r(uw51.k(new StringBuilder("No data for "), Uid.class));
                            break;
                        }
                    } else {
                        ny61.r(uw51.k(new StringBuilder("No data for "), SlothLoginProperties.class));
                        break;
                    }
                case 11:
                    String m7 = com.yandex.passport.internal.ui.sloth.e.m(parcel);
                    Parcelable readParcelable16 = parcel.readParcelable(Uid.class.getClassLoader());
                    if (readParcelable16 != null) {
                        jVar = new l((Uid) readParcelable16, m7);
                        pVar = jVar;
                        break;
                    } else {
                        ny61.r(uw51.k(new StringBuilder("No data for "), Uid.class));
                        break;
                    }
                case 12:
                    Serializable readSerializable6 = parcel.readSerializable();
                    if (!(readSerializable6 instanceof SlothTheme)) {
                        readSerializable6 = null;
                    }
                    SlothTheme slothTheme5 = (SlothTheme) readSerializable6;
                    if (slothTheme5 != null) {
                        int readInt2 = parcel.readInt();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (int i = 0; i < readInt2; i++) {
                            String readString8 = parcel.readString();
                            String readString9 = parcel.readString();
                            if (readString8 != null && readString9 != null) {
                                linkedHashMap.put(readString8, readString9);
                            }
                        }
                        Parcelable readParcelable17 = parcel.readParcelable(Uid.class.getClassLoader());
                        if (readParcelable17 != null) {
                            jVar = new a0(slothTheme5, linkedHashMap, (Uid) readParcelable17, Long.valueOf(parcel.readLong()));
                            pVar = jVar;
                            break;
                        } else {
                            ny61.r(uw51.k(new StringBuilder("No data for "), Uid.class));
                            break;
                        }
                    } else {
                        ny61.r(uw51.k(new StringBuilder("No data for "), SlothTheme.class));
                        break;
                    }
                    break;
                case 13:
                    jVar = new m((Uid) parcel.readParcelable(Uid.class.getClassLoader()), com.yandex.passport.internal.ui.sloth.e.m(parcel));
                    pVar = jVar;
                    break;
                case 14:
                    Parcelable readParcelable18 = parcel.readParcelable(Uid.class.getClassLoader());
                    if (readParcelable18 != null) {
                        Uid uid7 = (Uid) readParcelable18;
                        long readLong2 = parcel.readLong();
                        Serializable readSerializable7 = parcel.readSerializable();
                        if (!(readSerializable7 instanceof SlothTheme)) {
                            readSerializable7 = null;
                        }
                        SlothTheme slothTheme6 = (SlothTheme) readSerializable7;
                        if (slothTheme6 != null) {
                            jVar = new i(readLong2, uid7, slothTheme6);
                            pVar = jVar;
                            break;
                        } else {
                            ny61.r(uw51.k(new StringBuilder("No data for "), SlothTheme.class));
                            break;
                        }
                    } else {
                        ny61.r(uw51.k(new StringBuilder("No data for "), Uid.class));
                        break;
                    }
                case 15:
                    String m8 = com.yandex.passport.internal.ui.sloth.e.m(parcel);
                    Parcelable readParcelable19 = parcel.readParcelable(Uid.class.getClassLoader());
                    if (readParcelable19 != null) {
                        jVar = new r(m8, (Uid) readParcelable19, com.yandex.passport.internal.ui.sloth.e.m(parcel));
                        pVar = jVar;
                        break;
                    } else {
                        ny61.r(uw51.k(new StringBuilder("No data for "), Uid.class));
                        break;
                    }
                case 16:
                    Parcelable readParcelable20 = parcel.readParcelable(Uid.class.getClassLoader());
                    if (readParcelable20 != null) {
                        Uid uid8 = (Uid) readParcelable20;
                        long readLong3 = parcel.readLong();
                        Serializable readSerializable8 = parcel.readSerializable();
                        if (!(readSerializable8 instanceof SlothTheme)) {
                            readSerializable8 = null;
                        }
                        SlothTheme slothTheme7 = (SlothTheme) readSerializable8;
                        if (slothTheme7 != null) {
                            sVar = new q(uid8, readLong3, slothTheme7, com.yandex.passport.internal.ui.sloth.e.m(parcel), com.yandex.passport.internal.ui.sloth.e.m(parcel));
                            pVar = sVar;
                            break;
                        } else {
                            ny61.r(uw51.k(new StringBuilder("No data for "), SlothTheme.class));
                            break;
                        }
                    } else {
                        ny61.r(uw51.k(new StringBuilder("No data for "), Uid.class));
                        break;
                    }
                case 17:
                    Parcelable readParcelable21 = parcel.readParcelable(Uid.class.getClassLoader());
                    if (readParcelable21 != null) {
                        Uid uid9 = (Uid) readParcelable21;
                        Parcelable readParcelable22 = parcel.readParcelable(Uid.class.getClassLoader());
                        if (readParcelable22 != null) {
                            Uid uid10 = (Uid) readParcelable22;
                            long readLong4 = parcel.readLong();
                            boolean z3 = parcel.readInt() != 0;
                            Serializable readSerializable9 = parcel.readSerializable();
                            if (!(readSerializable9 instanceof SlothTheme)) {
                                readSerializable9 = null;
                            }
                            SlothTheme slothTheme8 = (SlothTheme) readSerializable9;
                            if (slothTheme8 != null) {
                                pVar = new y(uid9, uid10, readLong4, z3, slothTheme8);
                                break;
                            } else {
                                ny61.r(uw51.k(new StringBuilder("No data for "), SlothTheme.class));
                                break;
                            }
                        } else {
                            ny61.r(uw51.k(new StringBuilder("No data for "), Uid.class));
                            break;
                        }
                    } else {
                        ny61.r(uw51.k(new StringBuilder("No data for "), Uid.class));
                        break;
                    }
                case 18:
                    String m9 = com.yandex.passport.internal.ui.sloth.e.m(parcel);
                    Parcelable readParcelable23 = parcel.readParcelable(PicturePushState.class.getClassLoader());
                    if (readParcelable23 != null) {
                        PicturePushState picturePushState = (PicturePushState) readParcelable23;
                        String m10 = com.yandex.passport.internal.ui.sloth.e.m(parcel);
                        Parcelable readParcelable24 = parcel.readParcelable(Uid.class.getClassLoader());
                        if (readParcelable24 != null) {
                            Uid uid11 = (Uid) readParcelable24;
                            Serializable readSerializable10 = parcel.readSerializable();
                            if (!(readSerializable10 instanceof SlothTheme)) {
                                readSerializable10 = null;
                            }
                            SlothTheme slothTheme9 = (SlothTheme) readSerializable10;
                            if (slothTheme9 != null) {
                                sVar = new u(m9, picturePushState, m10, uid11, slothTheme9, parcel.readInt());
                                pVar = sVar;
                                break;
                            } else {
                                ny61.r(uw51.k(new StringBuilder("No data for "), SlothTheme.class));
                                break;
                            }
                        } else {
                            ny61.r(uw51.k(new StringBuilder("No data for "), Uid.class));
                            break;
                        }
                    } else {
                        ny61.r(uw51.k(new StringBuilder("No data for "), PicturePushState.class));
                        break;
                    }
                case 19:
                    Parcelable readParcelable25 = parcel.readParcelable(Uid.class.getClassLoader());
                    if (readParcelable25 != null) {
                        Uid uid12 = (Uid) readParcelable25;
                        Serializable readSerializable11 = parcel.readSerializable();
                        if (!(readSerializable11 instanceof SlothTheme)) {
                            readSerializable11 = null;
                        }
                        SlothTheme slothTheme10 = (SlothTheme) readSerializable11;
                        if (slothTheme10 != null) {
                            sVar = new SlothVariant$BiometricVerification(uid12, slothTheme10, com.yandex.passport.internal.ui.sloth.e.m(parcel), com.yandex.passport.internal.ui.sloth.e.m(parcel), com.yandex.passport.internal.ui.sloth.e.m(parcel));
                            pVar = sVar;
                            break;
                        } else {
                            ny61.r(uw51.k(new StringBuilder("No data for "), SlothTheme.class));
                            break;
                        }
                    } else {
                        ny61.r(uw51.k(new StringBuilder("No data for "), Uid.class));
                        break;
                    }
                case 20:
                    Parcelable readParcelable26 = parcel.readParcelable(Uid.class.getClassLoader());
                    if (readParcelable26 != null) {
                        Uid uid13 = (Uid) readParcelable26;
                        Serializable readSerializable12 = parcel.readSerializable();
                        if (!(readSerializable12 instanceof SlothTheme)) {
                            readSerializable12 = null;
                        }
                        SlothTheme slothTheme11 = (SlothTheme) readSerializable12;
                        if (slothTheme11 != null) {
                            pVar = new v(parcel.readLong(), uid13, slothTheme11);
                            break;
                        } else {
                            ny61.r(uw51.k(new StringBuilder("No data for "), SlothTheme.class));
                            break;
                        }
                    } else {
                        ny61.r(uw51.k(new StringBuilder("No data for "), Uid.class));
                        break;
                    }
                default:
                    ny61.r(qv10.g(readInt, "Wrong variant code "));
                    break;
            }
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SlothParams[] newArray(int i) {
            return new SlothParams[i];
        }
    }

    public SlothParams(c0 c0Var, Environment environment, Environment environment2, CommonWebProperties commonWebProperties) {
        this.variant = c0Var;
        this.environment = environment;
        this.secondaryEnvironment = environment2;
        this.commonWebProperties = commonWebProperties;
    }
}
