package one.video.exo.model.text;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import one.video.player.model.text.SubtitleRenderItem;
import xsna.rkk;

/* compiled from: SubtitleRenderItemExo.kt */
/* loaded from: classes8.dex */
public final class SubtitleRenderItemExo extends SubtitleRenderItem implements Parcelable {
    public static final a CREATOR = new a();
    public final rkk c;

    /* compiled from: SubtitleRenderItemExo.kt */
    public static final class a implements Parcelable.Creator<SubtitleRenderItemExo> {
        @Override // android.os.Parcelable.Creator
        public final SubtitleRenderItemExo createFromParcel(Parcel parcel) {
            return new SubtitleRenderItemExo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SubtitleRenderItemExo[] newArray(int i) {
            return new SubtitleRenderItemExo[i];
        }
    }

    public SubtitleRenderItemExo(rkk rkkVar) {
        super(String.valueOf(rkkVar.a));
        this.c = rkkVar;
    }

    @Override // one.video.player.model.text.SubtitleRenderItem, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // one.video.player.model.text.SubtitleRenderItem, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        rkk rkkVar = this.c;
        Bundle c = rkkVar.c();
        Bitmap bitmap = rkkVar.d;
        if (bitmap != null) {
            c.putParcelable(rkk.w, bitmap);
        }
        parcel.writeBundle(c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SubtitleRenderItemExo(Parcel parcel) {
        this(rkk.b(r2 == null ? Bundle.EMPTY : r2));
        Bundle readBundle = parcel.readBundle(rkk.class.getClassLoader());
    }
}
