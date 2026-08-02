package com.yandex.messaging.navigation.lib;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J0\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0011J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u0013R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0016¨\u0006%"}, d2 = {"Lcom/yandex/messaging/navigation/lib/Screen;", "Landroid/os/Parcelable;", "", "key", "className", "Landroid/os/Bundle;", "args", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Landroid/os/Bundle;", "copy", "(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Lcom/yandex/messaging/navigation/lib/Screen;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getKey", "getClassName", "Landroid/os/Bundle;", "getArgs", "navigation-lib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class Screen implements Parcelable {
    public static final Parcelable.Creator<Screen> CREATOR = new Creator();
    private final Bundle args;
    private final String className;
    private final String key;

    public Screen(String str, String str2, Bundle bundle) {
        this.key = str;
        this.className = str2;
        this.args = bundle;
    }

    public static /* synthetic */ Screen copy$default(Screen screen, String str, String str2, Bundle bundle, int i, Object obj) {
        if ((i & 1) != 0) {
            str = screen.key;
        }
        if ((i & 2) != 0) {
            str2 = screen.className;
        }
        if ((i & 4) != 0) {
            bundle = screen.args;
        }
        return screen.copy(str, str2, bundle);
    }

    /* renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component2, reason: from getter */
    public final String getClassName() {
        return this.className;
    }

    /* renamed from: component3, reason: from getter */
    public final Bundle getArgs() {
        return this.args;
    }

    public final Screen copy(String key, String className, Bundle args) {
        return new Screen(key, className, args);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Screen)) {
            return false;
        }
        Screen screen = (Screen) other;
        return jl40.l(this.key, screen.key) && jl40.l(this.className, screen.className) && jl40.l(this.args, screen.args);
    }

    public final Bundle getArgs() {
        return this.args;
    }

    public final String getClassName() {
        return this.className;
    }

    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        int b = unr0.b(this.key.hashCode() * 31, 31, this.className);
        Bundle bundle = this.args;
        return b + (bundle == null ? 0 : bundle.hashCode());
    }

    public String toString() {
        String str = this.key;
        String str2 = this.className;
        Bundle bundle = this.args;
        StringBuilder v = b64.v("Screen(key=", str, ", className=", str2, ", args=");
        v.append(bundle);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.key);
        dest.writeString(this.className);
        dest.writeBundle(this.args);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Screen> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Screen createFromParcel(Parcel parcel) {
            return new Screen(parcel.readString(), parcel.readString(), parcel.readBundle(Screen.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Screen[] newArray(int i) {
            return new Screen[i];
        }
    }

    public /* synthetic */ Screen(String str, String str2, Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : bundle);
    }
}
