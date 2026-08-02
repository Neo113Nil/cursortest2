package sg.bigo.ads.controller.landing;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public class LandingPageStyleConfig implements Parcelable {
    public static final Parcelable.Creator<LandingPageStyleConfig> CREATOR = new Parcelable.Creator<LandingPageStyleConfig>() { // from class: sg.bigo.ads.controller.landing.LandingPageStyleConfig.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LandingPageStyleConfig createFromParcel(Parcel parcel) {
            return new LandingPageStyleConfig(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LandingPageStyleConfig[] newArray(int i) {
            return new LandingPageStyleConfig[i];
        }
    };
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final Class<? extends c> g;

    public LandingPageStyleConfig(Parcel parcel) {
        this.g = (Class) parcel.readSerializable();
        this.c = parcel.readInt();
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readFloat();
    }

    public final boolean a() {
        return this.g != null && this.d > 0;
    }

    public final boolean b() {
        return this.a == 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.g);
        parcel.writeInt(this.c);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeFloat(this.f);
    }

    public LandingPageStyleConfig(Class<? extends c> cls, int i, int i2, int i3, int i4, int i5, float f) {
        this.g = cls;
        this.c = i;
        this.a = i2;
        this.b = i3;
        this.d = i4;
        this.e = i5;
        this.f = f;
    }
}
