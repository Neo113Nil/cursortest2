package one.video.calls.sdk.upload;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.n23;
import xsna.urd0;
import xsna.xe9;

/* loaded from: classes8.dex */
public final class FileUploadEvent implements Parcelable {
    public static final Parcelable.Creator<FileUploadEvent> CREATOR = new a();
    public final String b;
    public final String c;
    public final boolean d;

    public static final class a implements Parcelable.Creator<FileUploadEvent> {
        @Override // android.os.Parcelable.Creator
        public final FileUploadEvent createFromParcel(Parcel parcel) {
            boolean readBoolean;
            if (parcel == null) {
                return null;
            }
            String readString = parcel.readString();
            if (readString == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String readString2 = parcel.readString();
            if (readString2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            readBoolean = parcel.readBoolean();
            return new FileUploadEvent(readString, readString2, readBoolean);
        }

        @Override // android.os.Parcelable.Creator
        public final FileUploadEvent[] newArray(int i) {
            return new FileUploadEvent[i];
        }
    }

    public FileUploadEvent(String str, String str2, boolean z) {
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileUploadEvent)) {
            return false;
        }
        FileUploadEvent fileUploadEvent = (FileUploadEvent) obj;
        return epx.f(this.b, fileUploadEvent.b) && epx.f(this.c, fileUploadEvent.c) && this.d == fileUploadEvent.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + urd0.a(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        return n23.b(xe9.a("FileUploadEvent(filePath=", this.b, ", destinationUrl=", this.c, ", removeAfterUpload="), this.d, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeBoolean(this.d);
    }
}
