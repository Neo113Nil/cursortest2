package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.ResultReceiver;
import java.util.Set;

/* loaded from: classes10.dex */
public abstract class h9f {
    public static final g9f a = new g9f();
    public static final Set b = j73.f0(new Integer[]{7, 20});
    public static final int c = 1;

    public static void a(ResultReceiver resultReceiver, Intent intent, String str) {
        intent.putExtra("TYPE", str);
        intent.putExtra("ACTIVITY_REQUEST_CODE", c);
        Parcel obtain = Parcel.obtain();
        resultReceiver.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        ResultReceiver resultReceiver2 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        intent.putExtra("RESULT_RECEIVER", resultReceiver2);
        intent.setFlags(65536);
    }
}
