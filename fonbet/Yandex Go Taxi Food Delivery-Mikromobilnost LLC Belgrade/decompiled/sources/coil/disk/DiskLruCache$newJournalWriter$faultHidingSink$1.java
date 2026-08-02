package coil.disk;

import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/io/IOException;", "Lokio/IOException;", "it", "Lzy11;", "invoke", "(Ljava/io/IOException;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class DiskLruCache$newJournalWriter$faultHidingSink$1 extends Lambda implements tls {
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiskLruCache$newJournalWriter$faultHidingSink$1(a aVar) {
        super(1);
        this.this$0 = aVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        this.this$0.D = true;
        return zy11.a;
    }
}
