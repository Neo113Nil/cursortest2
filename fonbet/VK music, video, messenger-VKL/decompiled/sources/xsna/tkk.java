package xsna;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: CueEncoder.java */
/* loaded from: classes12.dex */
public final class tkk {
    public static byte[] a(ImmutableList immutableList, long j) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(immutableList.size());
        Iterator<E> it = immutableList.iterator();
        while (it.hasNext()) {
            rkk rkkVar = (rkk) it.next();
            Bundle c = rkkVar.c();
            Bitmap bitmap = rkkVar.d;
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                fxc0.z(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                c.putByteArray(rkk.x, byteArrayOutputStream.toByteArray());
            }
            arrayList.add(c);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }
}
