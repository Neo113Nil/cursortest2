package com.yandex.div.storage;

/* compiled from: InternalStorageComponent.kt */
/* loaded from: classes7.dex */
public final class InternalStorageComponent implements DivStorageComponent {
    private final RawJsonRepository rawJsonRepository;
    private final DivDataRepository repository;
    private final DivStorage storage;

    public InternalStorageComponent(DivDataRepository divDataRepository, RawJsonRepository rawJsonRepository, DivStorage divStorage) {
        this.repository = divDataRepository;
        this.rawJsonRepository = rawJsonRepository;
        this.storage = divStorage;
    }

    @Override // com.yandex.div.storage.DivStorageComponent
    public RawJsonRepository getRawJsonRepository() {
        return this.rawJsonRepository;
    }
}
