package defpackage;

import com.yandex.messaging.files.ImageFileInfo;
import java.io.FileNotFoundException;
import java.io.InputStream;
import kotlin.a;

/* loaded from: classes15.dex */
public final class gwd extends m5j0 {
    public final i3y b;
    public final /* synthetic */ hwd c;
    public final /* synthetic */ ImageFileInfo d;
    public final /* synthetic */ wg10 e;
    public final /* synthetic */ boolean f;

    public gwd(hwd hwdVar, ImageFileInfo imageFileInfo, wg10 wg10Var, boolean z) {
        this.c = hwdVar;
        this.d = imageFileInfo;
        this.e = wg10Var;
        this.f = z;
        this.b = a.a(new jhd(5, hwdVar, imageFileInfo));
    }

    @Override // defpackage.m5j0
    public final long a() {
        return this.f ? ((byte[]) this.b.getValue()).length : this.d.getByteSize();
    }

    @Override // defpackage.m5j0
    public final wg10 b() {
        return this.e;
    }

    @Override // defpackage.m5j0
    public final void d(oq6 oq6Var) {
        ImageFileInfo imageFileInfo = this.d;
        if (this.f) {
            oq6Var.write((byte[]) this.b.getValue());
            oq6Var.flush();
            return;
        }
        try {
            InputStream openInputStream = this.c.a.getContentResolver().openInputStream(imageFileInfo.getUri());
            try {
                if (openInputStream != null) {
                    oq6Var.N1(vng.H(openInputStream));
                    oq6Var.flush();
                    openInputStream.close();
                } else {
                    throw new FileNotFoundException("Can't open stream from uri: " + imageFileInfo.getUri());
                }
            } finally {
            }
        } catch (SecurityException unused) {
            throw new FileNotFoundException(imageFileInfo.getUri().toString());
        }
    }
}
