package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.ka31;
import defpackage.la31;
import defpackage.ma31;

/* loaded from: classes10.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(ka31 ka31Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        ma31 ma31Var = remoteActionCompat.a;
        boolean z = true;
        if (ka31Var.e(1)) {
            ma31Var = ka31Var.h();
        }
        remoteActionCompat.a = (IconCompat) ma31Var;
        CharSequence charSequence = remoteActionCompat.b;
        if (ka31Var.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((la31) ka31Var).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (ka31Var.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((la31) ka31Var).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) ka31Var.g(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.e;
        if (ka31Var.e(5)) {
            z2 = ((la31) ka31Var).e.readInt() != 0;
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f;
        if (!ka31Var.e(6)) {
            z = z3;
        } else if (((la31) ka31Var).e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, ka31 ka31Var) {
        ka31Var.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        ka31Var.i(1);
        ka31Var.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        ka31Var.i(2);
        Parcel parcel = ((la31) ka31Var).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        ka31Var.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        ka31Var.k(remoteActionCompat.d, 4);
        boolean z = remoteActionCompat.e;
        ka31Var.i(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        ka31Var.i(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
