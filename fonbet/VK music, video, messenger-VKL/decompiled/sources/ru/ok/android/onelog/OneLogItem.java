package ru.ok.android.onelog;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import defpackage.k0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import xsna.lhg;
import xsna.xy9;

/* loaded from: classes9.dex */
public final class OneLogItem implements Parcelable, Serializable {
    public static final Parcelable.Creator<OneLogItem> CREATOR = new Creator(0);
    public static final int TYPE_DURATION_SUCCESS = 0;
    public static final int TYPE_FAILURE = 2;
    public static final int TYPE_NOP = -1;
    public static final int TYPE_SUCCESS = 1;

    @NonNull
    private final String collector;
    private final int count;

    @NonNull
    private final List<String> customKeys;

    @NonNull
    private final List<String> customValues;

    @NonNull
    private final List<String> data;

    @NonNull
    private final List<String> groups;

    @Nullable
    private final String network;

    @NonNull
    private final String operation;
    private final long time;
    private final long timestamp;
    private final int type;

    @Nullable
    private final String uid;

    public static final class Builder {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private static volatile NetworkClassProvider networkClassProvider;
        private static volatile UserIdProvider userIdProvider;

        @Nullable
        private String collector;
        private int count;

        @Nullable
        private ArrayList<String> customKeys;

        @Nullable
        private ArrayList<String> customValues;

        @Nullable
        private ArrayList<String> data;

        @Nullable
        private ArrayList<String> groups;

        @Nullable
        private String network;
        private boolean networkIsSet;

        @Nullable
        private String operation;
        private long time;
        private int type;

        @Nullable
        private String uid;
        private boolean uidIsSet;

        public /* synthetic */ Builder(int i) {
            this();
        }

        private String buildNetworkClass() {
            if (this.networkIsSet) {
                return this.network;
            }
            NetworkClassProvider networkClassProvider2 = networkClassProvider;
            if (networkClassProvider2 != null) {
                return networkClassProvider2.getNetworkClass();
            }
            return null;
        }

        private String buildUserId() {
            if (this.uidIsSet) {
                return this.uid;
            }
            UserIdProvider userIdProvider2 = userIdProvider;
            if (userIdProvider2 != null) {
                return userIdProvider2.getUserId();
            }
            return null;
        }

        @Nullable
        private static <T> ArrayList<T> copyNullableList(@Nullable List<T> list) {
            if (list == null || list.size() == 0) {
                return null;
            }
            return new ArrayList<>(list);
        }

        private void init() {
            this.collector = null;
            this.type = -1;
            this.operation = null;
            this.count = 1;
            this.time = 0L;
            this.uid = null;
            this.uidIsSet = false;
            this.network = null;
            this.networkIsSet = false;
            this.groups = null;
            this.data = null;
            this.customKeys = null;
            this.customValues = null;
        }

        @NonNull
        private static <T> List<T> moveNonNullList(@Nullable List<T> list) {
            return list == null ? Collections.EMPTY_LIST : list;
        }

        public static void setNetworkClassProvider(@NonNull NetworkClassProvider networkClassProvider2) {
            networkClassProvider = networkClassProvider2;
        }

        public static void setUserIdProvider(@NonNull UserIdProvider userIdProvider2) {
            userIdProvider = userIdProvider2;
        }

        @Nullable
        private static ArrayList<String> withParam(@Nullable ArrayList<String> arrayList, int i, @Nullable String str) {
            if (str == null) {
                if (arrayList != null && arrayList.size() > i && arrayList.get(i) != null) {
                    arrayList.set(i, null);
                    while (xy9.b(1, arrayList) == null) {
                        arrayList.remove(arrayList.size() - 1);
                    }
                }
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            arrayList.ensureCapacity(i + 1);
            while (arrayList.size() <= i) {
                arrayList.add(null);
            }
            arrayList.set(i, str);
            return arrayList;
        }

        @NonNull
        public OneLogItem build() {
            String str = this.collector;
            int i = this.type;
            String str2 = this.operation;
            int i2 = this.count;
            long j = this.time;
            String buildUserId = buildUserId();
            String buildNetworkClass = buildNetworkClass();
            List moveNonNullList = moveNonNullList(this.groups);
            List moveNonNullList2 = moveNonNullList(this.data);
            List moveNonNullList3 = moveNonNullList(this.customKeys);
            List moveNonNullList4 = moveNonNullList(this.customValues);
            init();
            if (str == null) {
                throw new IllegalStateException("Collector not set");
            }
            if (str2 != null) {
                return new OneLogItem(str, i, str2, i2, j, buildUserId, buildNetworkClass, moveNonNullList, moveNonNullList2, moveNonNullList3, moveNonNullList4, 0);
            }
            throw new IllegalStateException("Operation not set");
        }

        @NonNull
        public Builder incCount(int i) {
            if (i < 1) {
                throw new IllegalArgumentException(lhg.a(i, "Illegal count "));
            }
            this.count += i;
            return this;
        }

        @NonNull
        public Builder incTime(long j) {
            if (j < 0) {
                throw new IllegalArgumentException(k0.a(j, "Illegal time "));
            }
            this.time += j;
            return this;
        }

        public void log() {
            build().log();
        }

        @NonNull
        public Builder setCollector(@Nullable Object obj) {
            return setCollector(obj != null ? obj.toString() : null);
        }

        @NonNull
        public Builder setCount(int i) {
            if (i < 1) {
                throw new IllegalArgumentException(lhg.a(i, "Illegal count "));
            }
            this.count = i;
            return this;
        }

        @NonNull
        public Builder setCustom(@NonNull Object obj, @Nullable Object obj2) {
            return setCustom(obj.toString(), obj2 != null ? obj2.toString() : null);
        }

        @NonNull
        public Builder setDatum(int i, @Nullable Object obj) {
            return setDatum(i, obj != null ? obj.toString() : null);
        }

        @NonNull
        public Builder setGroup(int i, @Nullable Object obj) {
            return setGroup(i, obj != null ? obj.toString() : null);
        }

        @NonNull
        public Builder setNetwork(@Nullable String str) {
            this.network = str;
            this.networkIsSet = true;
            return this;
        }

        @NonNull
        public Builder setOperation(@Nullable Object obj) {
            return setOperation(obj != null ? obj.toString() : null);
        }

        @NonNull
        public Builder setTime(long j) {
            if (j < 0) {
                throw new IllegalArgumentException(k0.a(j, "Illegal time "));
            }
            this.time = j;
            return this;
        }

        @NonNull
        public Builder setType(int i) {
            this.type = i;
            return this;
        }

        @NonNull
        public Builder setUid(@Nullable String str) {
            this.uid = str;
            this.uidIsSet = true;
            return this;
        }

        public /* synthetic */ Builder(String str, int i, String str2, int i2, long j, String str3, String str4, List list, List list2, List list3, List list4, int i3) {
            this(str, i, str2, i2, j, str3, str4, list, list2, list3, list4);
        }

        @NonNull
        public Builder setCollector(@Nullable String str) {
            this.collector = str;
            return this;
        }

        @NonNull
        public Builder setCustom(@NonNull String str, @Nullable String str2) {
            int indexOf;
            ArrayList<String> arrayList = this.customKeys;
            ArrayList<String> arrayList2 = this.customValues;
            if (str2 == null) {
                if (arrayList != null && (indexOf = arrayList.indexOf(str)) >= 0) {
                    arrayList.remove(indexOf);
                    arrayList2.remove(indexOf);
                }
                return this;
            }
            if (arrayList != null) {
                int indexOf2 = arrayList.indexOf(str);
                if (indexOf2 >= 0) {
                    arrayList2.set(indexOf2, str2);
                    return this;
                }
                arrayList.add(str);
                arrayList2.add(str2);
                return this;
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            ArrayList<String> arrayList4 = new ArrayList<>();
            arrayList3.add(str);
            arrayList4.add(str2);
            this.customKeys = arrayList3;
            this.customValues = arrayList4;
            return this;
        }

        @NonNull
        public Builder setDatum(int i, @Nullable String str) {
            this.data = withParam(this.data, i, str);
            return this;
        }

        @NonNull
        public Builder setGroup(int i, @Nullable String str) {
            this.groups = withParam(this.groups, i, str);
            return this;
        }

        @NonNull
        public Builder setOperation(@Nullable String str) {
            this.operation = str;
            return this;
        }

        private Builder(@Nullable String str, int i, @Nullable String str2, int i2, long j, @Nullable String str3, @Nullable String str4, @Nullable List<String> list, @Nullable List<String> list2, @Nullable List<String> list3, @Nullable List<String> list4) {
            this.collector = str;
            this.type = i;
            this.operation = str2;
            this.count = i2;
            this.time = j;
            this.uid = str3;
            this.uidIsSet = true;
            this.network = str4;
            this.networkIsSet = true;
            this.groups = copyNullableList(list);
            this.data = copyNullableList(list2);
            this.customKeys = copyNullableList(list3);
            this.customValues = copyNullableList(list4);
        }

        private Builder() {
            init();
        }
    }

    public static final class Creator implements Parcelable.Creator<OneLogItem> {
        public /* synthetic */ Creator(int i) {
            this();
        }

        private Creator() {
        }

        @Override // android.os.Parcelable.Creator
        public OneLogItem createFromParcel(@NonNull Parcel parcel) {
            return new OneLogItem(0, parcel);
        }

        @Override // android.os.Parcelable.Creator
        public OneLogItem[] newArray(int i) {
            return new OneLogItem[i];
        }
    }

    public /* synthetic */ OneLogItem(int i, Parcel parcel) {
        this(parcel);
    }

    @NonNull
    public static Builder builder() {
        return new Builder(0);
    }

    @NonNull
    public Builder buildUpon() {
        return new Builder(this.collector, this.type, this.operation, this.count, this.time, this.uid, this.network, this.groups, this.data, this.customKeys, this.customValues, 0);
    }

    @NonNull
    public String collector() {
        return this.collector;
    }

    public int count() {
        return this.count;
    }

    public int customCount() {
        return this.customKeys.size();
    }

    @NonNull
    public String customKey(int i) {
        return this.customKeys.get(i);
    }

    @Nullable
    public String customValue(int i) {
        return this.customValues.get(i);
    }

    public int dataCount() {
        return this.data.size();
    }

    @Nullable
    public String datum(int i) {
        return this.data.get(i);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public String group(int i) {
        return this.groups.get(i);
    }

    public int groupsCount() {
        return this.groups.size();
    }

    public void log() {
        OneLog.log(this);
    }

    @Nullable
    public String network() {
        return this.network;
    }

    public String operation() {
        return this.operation;
    }

    public long time() {
        return this.time;
    }

    public long timestamp() {
        return this.timestamp;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{collector: ");
        sb.append(this.collector);
        sb.append(", timestamp: ");
        sb.append(this.timestamp);
        sb.append(", type: ");
        sb.append(this.type);
        sb.append(", operation: ");
        sb.append(this.operation);
        sb.append(", time: ");
        sb.append(this.time);
        if (this.uid != null) {
            sb.append(", uid: ");
            sb.append(this.uid);
        }
        if (this.network != null) {
            sb.append(", network: ");
            sb.append(this.network);
        }
        if (this.count != 1) {
            sb.append(", count: ");
            sb.append(this.count);
            sb.append(", ");
        }
        if (!this.data.isEmpty()) {
            sb.append(", data: [");
            for (int i = 0; i < this.data.size(); i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(this.data.get(i));
            }
            sb.append(X3.j.e);
        }
        if (!this.groups.isEmpty()) {
            sb.append(", groups: [");
            for (int i2 = 0; i2 < this.groups.size(); i2++) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(this.groups.get(i2));
            }
            sb.append(X3.j.e);
        }
        if (!this.customKeys.isEmpty()) {
            sb.append(", custom: {");
            for (int i3 = 0; i3 < this.customKeys.size(); i3++) {
                if (i3 > 0) {
                    sb.append(", ");
                }
                sb.append(this.customKeys.get(i3));
                sb.append(": ");
                sb.append(this.customValues.get(i3));
            }
            sb.append("}");
        }
        sb.append("}");
        return sb.toString();
    }

    public int type() {
        return this.type;
    }

    @Nullable
    public String uid() {
        return this.uid;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.collector);
        parcel.writeLong(this.timestamp);
        parcel.writeInt(this.type);
        parcel.writeString(this.operation);
        parcel.writeInt(this.count);
        parcel.writeLong(this.time);
        parcel.writeString(this.uid);
        parcel.writeString(this.network);
        parcel.writeStringList(this.groups);
        parcel.writeStringList(this.data);
        parcel.writeStringList(this.customKeys);
        parcel.writeStringList(this.customValues);
    }

    public /* synthetic */ OneLogItem(String str, int i, String str2, int i2, long j, String str3, String str4, List list, List list2, List list3, List list4, int i3) {
        this(str, i, str2, i2, j, str3, str4, list, list2, list3, list4);
    }

    private OneLogItem(@NonNull String str, int i, @NonNull String str2, int i2, long j, @Nullable String str3, @Nullable String str4, @NonNull List<String> list, @NonNull List<String> list2, @NonNull List<String> list3, @NonNull List<String> list4) {
        this.collector = str;
        this.type = i;
        this.operation = str2;
        this.count = i2;
        this.time = j;
        this.uid = str3;
        this.network = str4;
        this.groups = list;
        this.data = list2;
        this.customKeys = list3;
        this.customValues = list4;
        this.timestamp = System.currentTimeMillis();
    }

    private OneLogItem(@NonNull Parcel parcel) {
        this.collector = parcel.readString();
        this.timestamp = parcel.readLong();
        this.type = parcel.readInt();
        this.operation = parcel.readString();
        this.count = parcel.readInt();
        this.time = parcel.readLong();
        this.uid = parcel.readString();
        this.network = parcel.readString();
        this.groups = parcel.createStringArrayList();
        this.data = parcel.createStringArrayList();
        this.customKeys = parcel.createStringArrayList();
        this.customValues = parcel.createStringArrayList();
    }
}
