package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.im.engine.models.conversations.BotButton;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: StreamParcelableToBlobSerializer.kt */
/* loaded from: classes2.dex */
public final class apm0 {
    public static final ArrayList a(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
        Serializer.d dVar = new Serializer.d(new DataInputStream(byteArrayInputStream));
        int u = dVar.u();
        ArrayList arrayList = new ArrayList(u);
        for (int i = 0; i < u; i++) {
            arrayList.add(dVar.l(BotButton.class.getClassLoader()));
        }
        byteArrayInputStream.close();
        return arrayList;
    }

    public static final byte[] b(List<? extends List<? extends Serializer.StreamParcelable>> list) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
        Serializer.e eVar = new Serializer.e(new DataOutputStream(byteArrayOutputStream));
        eVar.S(list.size());
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            eVar.W((List) it.next());
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return byteArray;
    }
}
