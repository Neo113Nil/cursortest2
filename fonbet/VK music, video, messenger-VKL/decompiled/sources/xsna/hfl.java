package xsna;

import android.net.Uri;
import android.os.SystemClock;
import com.vk.core.serialize.Serializer;
import com.vkontakte.android.fragments.friends.FriendsFragment;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class hfl implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hfl(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((ifl) obj).c = Long.valueOf(SystemClock.elapsedRealtime());
                return s3q0.a;
            default:
                ArrayList arrayList = (ArrayList) obj;
                int i2 = FriendsFragment.q0;
                File p = com.vk.core.files.a.p();
                FileOutputStream fileOutputStream = new FileOutputStream(p);
                try {
                    HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                    fileOutputStream.write(Serializer.b.f(arrayList));
                    s3q0 s3q0Var = s3q0.a;
                    fileOutputStream.close();
                    return Uri.fromFile(p);
                } finally {
                }
        }
    }
}
