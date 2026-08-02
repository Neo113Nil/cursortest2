package xsna;

import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;

/* compiled from: PhotoUploadTask.kt */
/* loaded from: classes11.dex */
public abstract class oda0<S extends Parcelable> extends com.vk.upload.impl.tasks.k<S> {
    public final bwi l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oda0(String str, String str2, int i) {
        super(str, (i & 4) != 0 ? "photo" : str2);
        boolean z = (i & 2) == 0;
        o25.a().E();
        Context context = e43.a;
        this.l = new bwi(context == null ? null : context, z);
    }

    @Override // com.vk.upload.impl.tasks.k
    public String f0() {
        if (!ozg0.a().b()) {
            return null;
        }
        return this.l.a(Uri.parse(this.i));
    }
}
