package xsna;

import android.graphics.Rect;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import io.jsonwebtoken.JwtParser;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PersistentEntityCacheImpl.kt */
/* loaded from: classes17.dex */
public final class uy90 {
    public final Object a;
    public final Object b;
    public final Object c;
    public Object d;

    public uy90(qd50 qd50Var, hez hezVar) {
        this.a = qd50Var;
        this.b = hezVar;
        this.c = new Rect();
        this.d = new Rect();
    }

    public void a(boolean z) {
        Rect rect = (Rect) this.d;
        qd50 qd50Var = (qd50) this.a;
        Rect rect2 = (Rect) this.c;
        qd50Var.c(rect2);
        hez hezVar = (hez) this.b;
        int i = hezVar.c(rect2).b;
        if (i < 0) {
            qd50Var.f();
            return;
        }
        if (i == 0) {
            qd50Var.f();
            return;
        }
        if (((vtt0) qd50Var.c).f()) {
            Long d = hezVar.d(i);
            if (d == null) {
                qd50Var.f();
                return;
            }
            int i2 = hezVar.b(rect2).b;
            qd50Var.h(d.longValue());
            if (i2 < 0) {
                qd50Var.g(z);
                return;
            }
            hezVar.e(i2, rect);
            int i3 = rect2.top;
            int i4 = rect2.bottom;
            int i5 = rect.bottom;
            if (i3 > i5 || i5 > i4) {
                qd50Var.g(z);
            }
        }
    }

    public void b(Message message) {
        File file = (File) this.a;
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                throw new IOException("Unable to create parent directories of " + this);
            }
        }
        File file2 = new File(file.getAbsolutePath() + ".tmp");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                message.encode(fileOutputStream);
                fileOutputStream.getFD().sync();
                s3q0 s3q0Var = s3q0.a;
                fileOutputStream.close();
                if (file2.renameTo(file)) {
                    return;
                }
                throw new IOException("Unable to rename " + file2 + JwtParser.SEPARATOR_CHAR);
            } finally {
            }
        } catch (IOException e) {
            if (file2.exists()) {
                file2.delete();
            }
            throw e;
        }
    }

    public uy90(File file, ProtoAdapter protoAdapter) {
        this.a = file;
        this.b = protoAdapter;
        this.c = new ReentrantReadWriteLock();
    }
}
