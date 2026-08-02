package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.core.files.a;
import java.util.ArrayList;

/* compiled from: WriteBarAttachHolder.kt */
/* loaded from: classes7.dex */
public final class r0y0 extends a.C0764a {
    public final /* synthetic */ ner0 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ com.vk.writebar.c c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Uri e;

    public r0y0(ner0 ner0Var, Context context, com.vk.writebar.c cVar, int i, Uri uri) {
        this.a = ner0Var;
        this.b = context;
        this.c = cVar;
        this.d = i;
        this.e = uri;
    }

    @Override // com.vk.core.files.a.C0764a
    public final void a(ArrayList<Uri> arrayList) {
        if (!arrayList.isEmpty()) {
            this.c.b(this.d, this.e);
        }
        u1u0.b(this.a);
    }

    @Override // com.vk.core.files.a.C0764a
    public final void b(Exception exc) {
        h03.b(exc);
        u1u0.b(this.a);
    }
}
