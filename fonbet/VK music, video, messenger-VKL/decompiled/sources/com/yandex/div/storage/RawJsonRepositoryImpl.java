package com.yandex.div.storage;

import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.storage.DivStorage;
import com.yandex.div.storage.RawJsonRepository;
import com.yandex.div.storage.database.StorageException;
import com.yandex.div.storage.rawjson.RawJson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import xsna.c5g;
import xsna.izs;
import xsna.j5g;

/* compiled from: RawJsonRepositoryImpl.kt */
/* loaded from: classes7.dex */
public final class RawJsonRepositoryImpl implements RawJsonRepository {
    private final DivStorage divStorage;
    private final Map<String, RawJson> inMemoryData = new LinkedHashMap();
    private Set<String> jsonIdsWithErrors = EmptySet.b;

    public RawJsonRepositoryImpl(DivStorage divStorage) {
        this.divStorage = divStorage;
    }

    private final RawJsonRepositoryResult loadFromStorage(Set<String> set) {
        ArrayList arrayList = new ArrayList();
        DivStorage.LoadDataResult<RawJson> readRawJsons = this.divStorage.readRawJsons(set);
        List<RawJson> component1 = readRawJsons.component1();
        arrayList.addAll(toRawJsonRepositoryExceptions(readRawJsons.component2()));
        return new RawJsonRepositoryResult(component1, arrayList);
    }

    private final void removeFromInMemory(Set<String> set) {
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            this.inMemoryData.remove((String) it.next());
        }
    }

    private final List<RawJsonRepositoryException> toRawJsonRepositoryExceptions(List<? extends StorageException> list) {
        List<? extends StorageException> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new RawJsonRepositoryException((StorageException) it.next()));
        }
        return arrayList;
    }

    @Override // com.yandex.div.storage.RawJsonRepository
    public RawJsonRepositoryResult get(List<String> list) {
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.assertMainThread();
        }
        if (list.isEmpty()) {
            return RawJsonRepositoryResult.Companion.getEMPTY();
        }
        List<String> list2 = list;
        Set<String> R0 = j5g.R0(list2);
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list2) {
            RawJson rawJson = this.inMemoryData.get(str);
            if (rawJson != null) {
                arrayList.add(rawJson);
                R0.remove(str);
            }
        }
        if (R0.isEmpty()) {
            return new RawJsonRepositoryResult(arrayList, EmptyList.b);
        }
        RawJsonRepositoryResult loadFromStorage = loadFromStorage(R0);
        for (RawJson rawJson2 : loadFromStorage.getResultData()) {
            this.inMemoryData.put(rawJson2.getId(), rawJson2);
        }
        return loadFromStorage.addData(arrayList);
    }

    @Override // com.yandex.div.storage.RawJsonRepository
    public RawJsonRepositoryResult put(RawJsonRepository.Payload payload) {
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.assertMainThread();
        }
        List<RawJson> jsons = payload.getJsons();
        for (RawJson rawJson : jsons) {
            this.inMemoryData.put(rawJson.getId(), rawJson);
        }
        List<StorageException> errors = this.divStorage.saveRawJsons(jsons, payload.getActionOnError()).getErrors();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(toRawJsonRepositoryExceptions(errors));
        return new RawJsonRepositoryResult(jsons, arrayList);
    }

    @Override // com.yandex.div.storage.RawJsonRepository
    public RawJsonRepositoryRemoveResult remove(izs<? super RawJson, Boolean> izsVar) {
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.assertMainThread();
        }
        DivStorage.RemoveResult removeRawJsons = this.divStorage.removeRawJsons(izsVar);
        Set<String> component1 = removeRawJsons.component1();
        List<RawJsonRepositoryException> rawJsonRepositoryExceptions = toRawJsonRepositoryExceptions(removeRawJsons.component2());
        removeFromInMemory(component1);
        return new RawJsonRepositoryRemoveResult(component1, rawJsonRepositoryExceptions);
    }
}
