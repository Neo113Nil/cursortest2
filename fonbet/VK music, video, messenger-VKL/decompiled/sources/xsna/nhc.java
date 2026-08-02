package xsna;

import com.vk.pushes.PushComponent;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class nhc implements gzs {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ PushComponent c;
    public final /* synthetic */ String d;
    public final /* synthetic */ List e;
    public final /* synthetic */ com.vk.movika.sdk.base.model.b f;

    public /* synthetic */ nhc(boolean z, PushComponent pushComponent, String str, List list, String str2, com.vk.movika.sdk.base.model.b bVar) {
        this.b = z;
        this.c = pushComponent;
        this.d = str;
        this.e = list;
        this.f = bVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        if (!this.b && !o25.a().b()) {
            this.c.sc().b(this.d, this.f);
        }
        return s3q0.a;
    }
}
