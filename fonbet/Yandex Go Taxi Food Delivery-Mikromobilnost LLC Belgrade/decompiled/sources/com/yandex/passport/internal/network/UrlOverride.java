package com.yandex.passport.internal.network;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.PassportUrlType;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.api.o2;
import com.yandex.passport.api.p2;
import com.yandex.passport.api.t0;
import defpackage.evu0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0002\u001d\u001eB'\u0012\u001e\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018R2\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0004\u0012\u00020\u00070\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/yandex/passport/internal/network/UrlOverride;", "Lcom/yandex/passport/api/p2;", "Landroid/os/Parcelable;", "", "Lkotlin/Pair;", "Lcom/yandex/passport/api/PassportUrlType;", "Lcom/yandex/passport/api/t0;", "", "overrides", "<init>", "(Ljava/util/Map;)V", "spec", "Lcom/yandex/passport/common/url/b;", "get-PHNIuII", "(Lkotlin/Pair;)Ljava/lang/String;", "get", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Ljava/util/Map;", "getOverrides", "()Ljava/util/Map;", "Companion", "a", "com/yandex/passport/internal/network/p", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UrlOverride implements p2, Parcelable {
    public static final int $stable = 8;
    private final Map<Pair<PassportUrlType, t0>, String> overrides;
    public static final p Companion = new p();
    public static final Parcelable.Creator<UrlOverride> CREATOR = new Creator();

    public static final class a implements o2 {
        public final LinkedHashMap a = new LinkedHashMap();

        @Override // com.yandex.passport.api.p2
        public final Map getOverrides() {
            return this.a;
        }
    }

    public UrlOverride(Map<Pair<PassportUrlType, t0>, String> map) {
        this.overrides = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: get-PHNIuII, reason: not valid java name */
    public final String m306getPHNIuII(Pair<? extends PassportUrlType, ? extends t0> spec) {
        String str = getOverrides().get(spec);
        if (str != null) {
            if (evu0.J(str)) {
                str = null;
            }
            if (str != null) {
                if (!evu0.y(str, "://", false)) {
                    str = "https://".concat(str);
                }
                com.yandex.passport.common.url.b bVar = new com.yandex.passport.common.url.b(str);
                if (!com.yandex.passport.common.url.b.m(str)) {
                    bVar = null;
                }
                if (bVar != null) {
                    return bVar.a;
                }
            }
        }
        return null;
    }

    @Override // com.yandex.passport.api.p2
    public Map<Pair<PassportUrlType, t0>, String> getOverrides() {
        return this.overrides;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Companion.getClass();
        dest.writeInt(getOverrides().size());
        for (Map.Entry<Pair<PassportUrlType, t0>, String> entry : getOverrides().entrySet()) {
            Pair<PassportUrlType, t0> key = entry.getKey();
            String value = entry.getValue();
            dest.writeString(((PassportUrlType) key.c()).name());
            dest.writeInt(((t0) key.f()).getInteger());
            dest.writeString(value);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UrlOverride> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UrlOverride createFromParcel(Parcel parcel) {
            UrlOverride.Companion.getClass();
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (int i = 0; i < readInt; i++) {
                PassportUrlType valueOf = PassportUrlType.valueOf(parcel.readString());
                PassportEnvironmentImpl from = PassportEnvironmentImpl.from(parcel.readInt());
                linkedHashMap.put(new Pair(valueOf, from), parcel.readString());
            }
            return new UrlOverride(kotlin.collections.b.t(linkedHashMap));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UrlOverride[] newArray(int i) {
            return new UrlOverride[i];
        }
    }
}
