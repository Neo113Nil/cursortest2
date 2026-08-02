package defpackage;

import com.yandex.div.storage.DivDataRepository;
import com.yandex.div.storage.DivStorageComponent;
import com.yandex.div.storage.c;
import com.yandex.div.storage.d;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u0013¨\u0006\u0014"}, d2 = {"Lfsw;", "Lcom/yandex/div/storage/DivStorageComponent;", "Lcom/yandex/div/storage/DivDataRepository;", "repository", "Lcom/yandex/div/storage/d;", "rawJsonRepository", "Lcom/yandex/div/storage/c;", "storage", "<init>", "(Lcom/yandex/div/storage/DivDataRepository;Lcom/yandex/div/storage/d;Lcom/yandex/div/storage/c;)V", "b", "Lcom/yandex/div/storage/DivDataRepository;", "()Lcom/yandex/div/storage/DivDataRepository;", "c", "Lcom/yandex/div/storage/d;", "a", "()Lcom/yandex/div/storage/d;", "d", "Lcom/yandex/div/storage/c;", "()Lcom/yandex/div/storage/c;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class fsw implements DivStorageComponent {

    /* renamed from: b, reason: from kotlin metadata */
    private final DivDataRepository repository;

    /* renamed from: c, reason: from kotlin metadata */
    private final d rawJsonRepository;

    /* renamed from: d, reason: from kotlin metadata */
    private final c storage;

    public fsw(DivDataRepository divDataRepository, d dVar, c cVar) {
        this.repository = divDataRepository;
        this.rawJsonRepository = dVar;
        this.storage = cVar;
    }

    @Override // com.yandex.div.storage.DivStorageComponent
    /* renamed from: a, reason: from getter */
    public final d getRawJsonRepository() {
        return this.rawJsonRepository;
    }

    @Override // com.yandex.div.storage.DivStorageComponent
    /* renamed from: b, reason: from getter */
    public final DivDataRepository getRepository() {
        return this.repository;
    }

    /* renamed from: c, reason: from getter */
    public final c getStorage() {
        return this.storage;
    }
}
