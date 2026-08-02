package com.yandex.messaging.isolated;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import defpackage.nnm;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J*\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0014¨\u0006\""}, d2 = {"Lcom/yandex/messaging/isolated/IsolatedTranslatorConfig;", "Landroid/os/Parcelable;", "", "languageCode", "", "supportedLanguageCodes", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/yandex/messaging/isolated/IsolatedTranslatorConfig;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLanguageCode", "Ljava/util/List;", "getSupportedLanguageCodes", "messaging-core-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class IsolatedTranslatorConfig implements Parcelable {
    public static final Parcelable.Creator<IsolatedTranslatorConfig> CREATOR = new Creator();
    private final String languageCode;
    private final List<String> supportedLanguageCodes;

    public /* synthetic */ IsolatedTranslatorConfig(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? EmptyList.a : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IsolatedTranslatorConfig copy$default(IsolatedTranslatorConfig isolatedTranslatorConfig, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = isolatedTranslatorConfig.languageCode;
        }
        if ((i & 2) != 0) {
            list = isolatedTranslatorConfig.supportedLanguageCodes;
        }
        return isolatedTranslatorConfig.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLanguageCode() {
        return this.languageCode;
    }

    public final List<String> component2() {
        return this.supportedLanguageCodes;
    }

    public final IsolatedTranslatorConfig copy(String languageCode, List<String> supportedLanguageCodes) {
        return new IsolatedTranslatorConfig(languageCode, supportedLanguageCodes);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IsolatedTranslatorConfig)) {
            return false;
        }
        IsolatedTranslatorConfig isolatedTranslatorConfig = (IsolatedTranslatorConfig) other;
        return jl40.l(this.languageCode, isolatedTranslatorConfig.languageCode) && jl40.l(this.supportedLanguageCodes, isolatedTranslatorConfig.supportedLanguageCodes);
    }

    public final String getLanguageCode() {
        return this.languageCode;
    }

    public final List<String> getSupportedLanguageCodes() {
        return this.supportedLanguageCodes;
    }

    public int hashCode() {
        return this.supportedLanguageCodes.hashCode() + (this.languageCode.hashCode() * 31);
    }

    public String toString() {
        return nnm.h("IsolatedTranslatorConfig(languageCode=", this.languageCode, ", supportedLanguageCodes=", Extension.C_BRAKE, this.supportedLanguageCodes);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.languageCode);
        dest.writeStringList(this.supportedLanguageCodes);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IsolatedTranslatorConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IsolatedTranslatorConfig createFromParcel(Parcel parcel) {
            return new IsolatedTranslatorConfig(parcel.readString(), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IsolatedTranslatorConfig[] newArray(int i) {
            return new IsolatedTranslatorConfig[i];
        }
    }

    public IsolatedTranslatorConfig(String str, List<String> list) {
        this.languageCode = str;
        this.supportedLanguageCodes = list;
    }
}
