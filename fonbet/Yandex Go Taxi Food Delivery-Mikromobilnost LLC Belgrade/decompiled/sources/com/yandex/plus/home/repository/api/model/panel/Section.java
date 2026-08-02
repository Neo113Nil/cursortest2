package com.yandex.plus.home.repository.api.model.panel;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.unr0;
import defpackage.vfc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001:\u00011B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJH\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0018J\u0010\u0010#\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b#\u0010\u0010J\u001a\u0010&\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u001dR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b0\u0010\u001f¨\u00062"}, d2 = {"Lcom/yandex/plus/home/repository/api/model/panel/Section;", "Landroid/os/Parcelable;", "", "id", "name", "Lcom/yandex/plus/home/repository/api/model/panel/Section$Type;", "type", "", "hasHeavyShortcuts", "", "Lcom/yandex/plus/home/repository/api/model/panel/Shortcut;", "shortcuts", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/home/repository/api/model/panel/Section$Type;ZLjava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/yandex/plus/home/repository/api/model/panel/Section$Type;", "component4", "()Z", "component5", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/home/repository/api/model/panel/Section$Type;ZLjava/util/List;)Lcom/yandex/plus/home/repository/api/model/panel/Section;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getName", "Lcom/yandex/plus/home/repository/api/model/panel/Section$Type;", "getType", "Z", "getHasHeavyShortcuts", "Ljava/util/List;", "getShortcuts", "Type", "plus-home-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class Section implements Parcelable {
    public static final Parcelable.Creator<Section> CREATOR = new Creator();
    private final boolean hasHeavyShortcuts;
    private final String id;
    private final String name;
    private final List<Shortcut> shortcuts;
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/plus/home/repository/api/model/panel/Section$Type;", "", "PLUS_CARD", "DAILY_FULL", "DAILY_MINI", "plus-home-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type DAILY_FULL;
        public static final Type DAILY_MINI;
        public static final Type PLUS_CARD;

        static {
            Type type = new Type("PLUS_CARD", 0);
            PLUS_CARD = type;
            Type type2 = new Type("DAILY_FULL", 1);
            DAILY_FULL = type2;
            Type type3 = new Type("DAILY_MINI", 2);
            DAILY_MINI = type3;
            Type[] typeArr = {type, type2, type3};
            $VALUES = typeArr;
            $ENTRIES = a.a(typeArr);
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Section(String str, String str2, Type type, boolean z, List<? extends Shortcut> list) {
        this.id = str;
        this.name = str2;
        this.type = type;
        this.hasHeavyShortcuts = z;
        this.shortcuts = list;
    }

    public static /* synthetic */ Section copy$default(Section section, String str, String str2, Type type, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = section.id;
        }
        if ((i & 2) != 0) {
            str2 = section.name;
        }
        if ((i & 4) != 0) {
            type = section.type;
        }
        if ((i & 8) != 0) {
            z = section.hasHeavyShortcuts;
        }
        if ((i & 16) != 0) {
            list = section.shortcuts;
        }
        List list2 = list;
        Type type2 = type;
        return section.copy(str, str2, type2, z, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getHasHeavyShortcuts() {
        return this.hasHeavyShortcuts;
    }

    public final List<Shortcut> component5() {
        return this.shortcuts;
    }

    public final Section copy(String id, String name, Type type, boolean hasHeavyShortcuts, List<? extends Shortcut> shortcuts) {
        return new Section(id, name, type, hasHeavyShortcuts, shortcuts);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Section)) {
            return false;
        }
        Section section = (Section) other;
        return jl40.l(this.id, section.id) && jl40.l(this.name, section.name) && this.type == section.type && this.hasHeavyShortcuts == section.hasHeavyShortcuts && jl40.l(this.shortcuts, section.shortcuts);
    }

    public final boolean getHasHeavyShortcuts() {
        return this.hasHeavyShortcuts;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final List<Shortcut> getShortcuts() {
        return this.shortcuts;
    }

    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        return this.shortcuts.hashCode() + unr0.e((this.type.hashCode() + unr0.b(this.id.hashCode() * 31, 31, this.name)) * 31, 31, this.hasHeavyShortcuts);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Section(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", hasHeavyShortcuts=");
        sb.append(this.hasHeavyShortcuts);
        sb.append(", shortcuts=");
        return unr0.t(sb, this.shortcuts, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.name);
        dest.writeString(this.type.name());
        dest.writeInt(this.hasHeavyShortcuts ? 1 : 0);
        Iterator t = vfc.t(dest, this.shortcuts);
        while (t.hasNext()) {
            dest.writeParcelable((Parcelable) t.next(), flags);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Section> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Section createFromParcel(Parcel parcel) {
            int i;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Type valueOf = Type.valueOf(parcel.readString());
            int i2 = 0;
            boolean z = true;
            if (parcel.readInt() != 0) {
                i = 1;
            } else {
                i = 1;
                z = false;
            }
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (i2 != readInt) {
                i2 = vfc.e(Section.class, parcel, arrayList, i2, i);
            }
            return new Section(readString, readString2, valueOf, z, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Section[] newArray(int i) {
            return new Section[i];
        }
    }
}
