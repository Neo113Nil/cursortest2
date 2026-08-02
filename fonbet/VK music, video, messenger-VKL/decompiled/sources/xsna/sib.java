package xsna;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Callable;
import xsna.i340;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class sib implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sib(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return Optional.ofNullable(((h7v) obj2).p((String) ((tib) obj).a));
            default:
                List list = (List) obj;
                File file = new File(dgn0.d().getFilesDir(), ((i340.d) obj2).a);
                if (file.exists()) {
                    file.delete();
                    file.createNewFile();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file, false);
                try {
                    fileOutputStream.write(kvf.a(list).toString().getBytes(emb.b));
                    s3q0 s3q0Var = s3q0.a;
                    fileOutputStream.close();
                    return s3q0.a;
                } finally {
                }
        }
    }
}
