package yads;

/* loaded from: classes10.dex */
public abstract class x21 implements tt1 {
    public final String b;

    public x21(String str) {
        this.b = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.b;
    }
}
