package xsna;

import android.os.Bundle;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.IOException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d45 implements io.reactivex.rxjava3.functions.l, Continuation {
    public final /* synthetic */ Object b;

    public /* synthetic */ d45(Object obj) {
        this.b = obj;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        return (io.reactivex.rxjava3.core.t) ((c45) this.b).invoke(obj);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        ((h3u) this.b).getClass();
        Bundle bundle = (Bundle) task.getResult(IOException.class);
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        bundle.toString();
        new Throwable();
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }
}
