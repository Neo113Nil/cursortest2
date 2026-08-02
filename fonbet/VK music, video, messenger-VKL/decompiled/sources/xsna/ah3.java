package xsna;

import android.content.Context;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: ArchiveChannelsInteractor.kt */
/* loaded from: classes15.dex */
public final class ah3 implements yy5, dwz0 {
    public final Object b;
    public Object c;

    public /* synthetic */ ah3(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yy5
    public void a(mih0 mih0Var) {
        ((yy5) this.b).a(mih0Var);
        dw20 dw20Var = (dw20) ((Ref$ObjectRef) this.c).element;
        if (dw20Var != null) {
            dw20Var.dismiss();
        }
    }

    @Override // xsna.yy5
    public void b(mih0 mih0Var) {
        ((yy5) this.b).b(mih0Var);
    }

    public boolean c() {
        ((cew) this.c).getClass();
        return cew.h().getBoolean("pref_archive_channels_banner_hidden", false);
    }

    public void d(long j) {
        a1w a1wVar = (a1w) this.b;
        Serializer.c<Peer> cVar = Peer.CREATOR;
        a1wVar.D(this, new odb(Collections.singletonList(Peer.a.b(j))));
    }

    @Override // xsna.dwz0
    public Object zza() {
        return new ko01((Context) ((mbl) ((cbb) this.b).c).b, (sp01) ((dwz0) this.c).zza());
    }

    public ah3(u4a u4aVar) {
        this.b = u4aVar;
    }

    public ah3() {
        this.b = new ci50(new Reference[16]);
        this.c = new ReferenceQueue();
    }
}
