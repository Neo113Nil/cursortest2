package com.vkontakte.android.data;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class Wiki implements Parcelable {
    public static final Parcelable.Creator<Wiki> CREATOR = new a();
    public final String b;
    public final String c;

    public class a implements Parcelable.Creator<Wiki> {
        @Override // android.os.Parcelable.Creator
        public final Wiki createFromParcel(Parcel parcel) {
            return new Wiki(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Wiki[] newArray(int i) {
            return new Wiki[i];
        }
    }

    public Wiki(JSONObject jSONObject) {
        this.b = jSONObject.optString("title");
        this.c = jSONObject.optString("view_url");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    public Wiki(Parcel parcel) {
        this.b = parcel.readString();
        this.c = parcel.readString();
    }
}
