package xsna;

import com.vk.core.serialize.Serializer;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.HashMap;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class ocm implements yzs {
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Integer) obj3).intValue();
        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
        ((SQLiteStatement) obj).bindBlob(intValue, Serializer.b.e(((com.vk.im.engine.models.dialogs.b) obj2).v));
        return s3q0.a;
    }
}
