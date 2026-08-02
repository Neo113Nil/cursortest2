package com.yandex.passport.sloth.dependencies;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.passport.sloth.command.data.SlothAccountType;
import com.yandex.passport.sloth.data.SlothTheme;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import java.util.EnumSet;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0010\u0010#\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b'\u0010\u001fJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001dJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001dJ\u0080\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001dJ\u0010\u0010-\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b-\u0010\u001bJ\u001a\u00100\u001a\u00020\u00042\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b\u0005\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b\u0006\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b\u0007\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b5\u0010\u001dR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b7\u0010$R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\b9\u0010&R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b\u000e\u0010\u001fR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u00102\u001a\u0004\b:\u0010\u001dR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\b;\u0010\u001d¨\u0006<"}, d2 = {"Lcom/yandex/passport/sloth/dependencies/SlothLoginProperties;", "Landroid/os/Parcelable;", "", "source", "", "isSocialAuthorizationEnabled", "isNoReturnToHost", "isEnable2fa", "additionalActionRequest", "Lcom/yandex/passport/sloth/data/SlothTheme;", DivkitThemeChangeListener.THEME_VARIABLE_NAME, "Ljava/util/EnumSet;", "Lcom/yandex/passport/sloth/command/data/SlothAccountType;", "supportedAccountTypes", "isLoginFlow", "origin", "cusLocation", "<init>", "(Ljava/lang/String;ZZZLjava/lang/String;Lcom/yandex/passport/sloth/data/SlothTheme;Ljava/util/EnumSet;ZLjava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "component5", "component6", "()Lcom/yandex/passport/sloth/data/SlothTheme;", "component7", "()Ljava/util/EnumSet;", "component8", "component9", "component10", "copy", "(Ljava/lang/String;ZZZLjava/lang/String;Lcom/yandex/passport/sloth/data/SlothTheme;Ljava/util/EnumSet;ZLjava/lang/String;Ljava/lang/String;)Lcom/yandex/passport/sloth/dependencies/SlothLoginProperties;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSource", "Z", "getAdditionalActionRequest", "Lcom/yandex/passport/sloth/data/SlothTheme;", "getTheme", "Ljava/util/EnumSet;", "getSupportedAccountTypes", "getOrigin", "getCusLocation", "passport-sloth_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SlothLoginProperties implements Parcelable {
    public static final Parcelable.Creator<SlothLoginProperties> CREATOR = new Creator();
    private final String additionalActionRequest;
    private final String cusLocation;
    private final boolean isEnable2fa;
    private final boolean isLoginFlow;
    private final boolean isNoReturnToHost;
    private final boolean isSocialAuthorizationEnabled;
    private final String origin;
    private final String source;
    private final EnumSet<SlothAccountType> supportedAccountTypes;
    private final SlothTheme theme;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ SlothLoginProperties(java.lang.String r14, boolean r15, boolean r16, boolean r17, java.lang.String r18, com.yandex.passport.sloth.data.SlothTheme r19, java.util.EnumSet r20, boolean r21, java.lang.String r22, java.lang.String r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
            r13 = this;
            r0 = r24
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L9
            r1 = 0
            r10 = r1
            goto Lb
        L9:
            r10 = r21
        Lb:
            r1 = r0 & 256(0x100, float:3.59E-43)
            r2 = 0
            if (r1 == 0) goto L12
            r11 = r2
            goto L14
        L12:
            r11 = r22
        L14:
            r0 = r0 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L27
            r12 = r2
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r2 = r13
            goto L36
        L27:
            r12 = r23
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
        L36:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.passport.sloth.dependencies.SlothLoginProperties.<init>(java.lang.String, boolean, boolean, boolean, java.lang.String, com.yandex.passport.sloth.data.SlothTheme, java.util.EnumSet, boolean, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ SlothLoginProperties copy$default(SlothLoginProperties slothLoginProperties, String str, boolean z, boolean z2, boolean z3, String str2, SlothTheme slothTheme, EnumSet enumSet, boolean z4, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = slothLoginProperties.source;
        }
        if ((i & 2) != 0) {
            z = slothLoginProperties.isSocialAuthorizationEnabled;
        }
        if ((i & 4) != 0) {
            z2 = slothLoginProperties.isNoReturnToHost;
        }
        if ((i & 8) != 0) {
            z3 = slothLoginProperties.isEnable2fa;
        }
        if ((i & 16) != 0) {
            str2 = slothLoginProperties.additionalActionRequest;
        }
        if ((i & 32) != 0) {
            slothTheme = slothLoginProperties.theme;
        }
        if ((i & 64) != 0) {
            enumSet = slothLoginProperties.supportedAccountTypes;
        }
        if ((i & 128) != 0) {
            z4 = slothLoginProperties.isLoginFlow;
        }
        if ((i & 256) != 0) {
            str3 = slothLoginProperties.origin;
        }
        if ((i & 512) != 0) {
            str4 = slothLoginProperties.cusLocation;
        }
        String str5 = str3;
        String str6 = str4;
        EnumSet enumSet2 = enumSet;
        boolean z5 = z4;
        String str7 = str2;
        SlothTheme slothTheme2 = slothTheme;
        return slothLoginProperties.copy(str, z, z2, z3, str7, slothTheme2, enumSet2, z5, str5, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component10, reason: from getter */
    public final String getCusLocation() {
        return this.cusLocation;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsSocialAuthorizationEnabled() {
        return this.isSocialAuthorizationEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsNoReturnToHost() {
        return this.isNoReturnToHost;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsEnable2fa() {
        return this.isEnable2fa;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAdditionalActionRequest() {
        return this.additionalActionRequest;
    }

    /* renamed from: component6, reason: from getter */
    public final SlothTheme getTheme() {
        return this.theme;
    }

    public final EnumSet<SlothAccountType> component7() {
        return this.supportedAccountTypes;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsLoginFlow() {
        return this.isLoginFlow;
    }

    /* renamed from: component9, reason: from getter */
    public final String getOrigin() {
        return this.origin;
    }

    public final SlothLoginProperties copy(String source, boolean isSocialAuthorizationEnabled, boolean isNoReturnToHost, boolean isEnable2fa, String additionalActionRequest, SlothTheme theme, EnumSet<SlothAccountType> supportedAccountTypes, boolean isLoginFlow, String origin, String cusLocation) {
        return new SlothLoginProperties(source, isSocialAuthorizationEnabled, isNoReturnToHost, isEnable2fa, additionalActionRequest, theme, supportedAccountTypes, isLoginFlow, origin, cusLocation);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SlothLoginProperties)) {
            return false;
        }
        SlothLoginProperties slothLoginProperties = (SlothLoginProperties) other;
        return jl40.l(this.source, slothLoginProperties.source) && this.isSocialAuthorizationEnabled == slothLoginProperties.isSocialAuthorizationEnabled && this.isNoReturnToHost == slothLoginProperties.isNoReturnToHost && this.isEnable2fa == slothLoginProperties.isEnable2fa && jl40.l(this.additionalActionRequest, slothLoginProperties.additionalActionRequest) && this.theme == slothLoginProperties.theme && jl40.l(this.supportedAccountTypes, slothLoginProperties.supportedAccountTypes) && this.isLoginFlow == slothLoginProperties.isLoginFlow && jl40.l(this.origin, slothLoginProperties.origin) && jl40.l(this.cusLocation, slothLoginProperties.cusLocation);
    }

    public final String getAdditionalActionRequest() {
        return this.additionalActionRequest;
    }

    public final String getCusLocation() {
        return this.cusLocation;
    }

    public final String getOrigin() {
        return this.origin;
    }

    public final String getSource() {
        return this.source;
    }

    public final EnumSet<SlothAccountType> getSupportedAccountTypes() {
        return this.supportedAccountTypes;
    }

    public final SlothTheme getTheme() {
        return this.theme;
    }

    public int hashCode() {
        int e = unr0.e(unr0.e(unr0.e(this.source.hashCode() * 31, 31, this.isSocialAuthorizationEnabled), 31, this.isNoReturnToHost), 31, this.isEnable2fa);
        String str = this.additionalActionRequest;
        int e2 = unr0.e((this.supportedAccountTypes.hashCode() + ((this.theme.hashCode() + ((e + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31, this.isLoginFlow);
        String str2 = this.origin;
        int hashCode = (e2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cusLocation;
        return hashCode + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean isEnable2fa() {
        return this.isEnable2fa;
    }

    public final boolean isLoginFlow() {
        return this.isLoginFlow;
    }

    public final boolean isNoReturnToHost() {
        return this.isNoReturnToHost;
    }

    public final boolean isSocialAuthorizationEnabled() {
        return this.isSocialAuthorizationEnabled;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SlothLoginProperties(source=");
        sb.append(this.source);
        sb.append(", isSocialAuthorizationEnabled=");
        sb.append(this.isSocialAuthorizationEnabled);
        sb.append(", isNoReturnToHost=");
        sb.append(this.isNoReturnToHost);
        sb.append(", isEnable2fa=");
        sb.append(this.isEnable2fa);
        sb.append(", additionalActionRequest=");
        sb.append(this.additionalActionRequest);
        sb.append(", theme=");
        sb.append(this.theme);
        sb.append(", supportedAccountTypes=");
        sb.append(this.supportedAccountTypes);
        sb.append(", isLoginFlow=");
        sb.append(this.isLoginFlow);
        sb.append(", origin=");
        sb.append(this.origin);
        sb.append(", cusLocation=");
        return b64.p(sb, this.cusLocation, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.source);
        dest.writeInt(this.isSocialAuthorizationEnabled ? 1 : 0);
        dest.writeInt(this.isNoReturnToHost ? 1 : 0);
        dest.writeInt(this.isEnable2fa ? 1 : 0);
        dest.writeString(this.additionalActionRequest);
        dest.writeString(this.theme.name());
        dest.writeSerializable(this.supportedAccountTypes);
        dest.writeInt(this.isLoginFlow ? 1 : 0);
        dest.writeString(this.origin);
        dest.writeString(this.cusLocation);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SlothLoginProperties> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SlothLoginProperties createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            String readString = parcel.readString();
            boolean z4 = false;
            boolean z5 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z4 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z5 = z;
            }
            if (parcel.readInt() != 0) {
                z3 = z2;
            } else {
                z3 = z2;
                z2 = z;
            }
            String readString2 = parcel.readString();
            SlothTheme valueOf = SlothTheme.valueOf(parcel.readString());
            EnumSet enumSet = (EnumSet) parcel.readSerializable();
            if (parcel.readInt() != 0) {
                z = z3;
            }
            return new SlothLoginProperties(readString, z4, z5, z2, readString2, valueOf, enumSet, z, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SlothLoginProperties[] newArray(int i) {
            return new SlothLoginProperties[i];
        }
    }

    public SlothLoginProperties(String str, boolean z, boolean z2, boolean z3, String str2, SlothTheme slothTheme, EnumSet<SlothAccountType> enumSet, boolean z4, String str3, String str4) {
        this.source = str;
        this.isSocialAuthorizationEnabled = z;
        this.isNoReturnToHost = z2;
        this.isEnable2fa = z3;
        this.additionalActionRequest = str2;
        this.theme = slothTheme;
        this.supportedAccountTypes = enumSet;
        this.isLoginFlow = z4;
        this.origin = str3;
        this.cusLocation = str4;
    }
}
