package xsna;

import android.os.Bundle;
import com.vk.core.serialize.Serializer;
import com.vk.core.util.state.ByteArrayParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.LinkedBlockingDeque;

/* compiled from: MusicAppStateCacheHelper.kt */
/* loaded from: classes3.dex */
public final class aa40 {
    public static ArrayList a(Class cls, Bundle bundle, String str) {
        if (bundle == null) {
            bn40.f("loadArray for key:", str, "bundleWithKey=null");
            return null;
        }
        ByteArrayParcelable byteArrayParcelable = (ByteArrayParcelable) com.vk.core.util.state.a.b(ByteArrayParcelable.class, bundle, str);
        byte[] bArr = byteArrayParcelable != null ? byteArrayParcelable.b : null;
        if (bArr == null) {
            bn40.f("loadArray for key:", str, "data=null");
            return null;
        }
        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
        ArrayList b = Serializer.b.b(bArr, cls.getClassLoader());
        bn40.f("loadArray for key:", str, "size=", Integer.valueOf(b != null ? b.size() : -1));
        return b;
    }

    public static Bundle b(String str, ArrayList arrayList) {
        bn40.f("saveArray for key:", str, "size=", Integer.valueOf(arrayList != null ? arrayList.size() : -1));
        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
        byte[] f = Serializer.b.f(arrayList);
        LinkedBlockingDeque<String> linkedBlockingDeque = com.vk.core.util.state.a.a;
        Bundle bundle = new Bundle();
        com.vk.core.util.state.a.c(bundle, str, new ByteArrayParcelable(f));
        return bundle;
    }
}
