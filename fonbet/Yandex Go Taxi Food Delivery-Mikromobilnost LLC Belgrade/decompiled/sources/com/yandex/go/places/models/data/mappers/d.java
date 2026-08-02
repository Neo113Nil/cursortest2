package com.yandex.go.places.models.data.mappers;

import com.yandex.go.places.models.data.entities.network.CompressionResistantAttributedTextContainerDto;
import com.yandex.go.places.models.data.entities.network.CompressionResistantAttributedTextDto;
import defpackage.jwd;
import defpackage.kwd;
import defpackage.ny61;
import defpackage.tcc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class d {
    public final e a;

    public d(e eVar) {
        this.a = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0089 -> B:10:0x008a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(CompressionResistantAttributedTextContainerDto compressionResistantAttributedTextContainerDto, ContinuationImpl continuationImpl) {
        CompressionResistantAttributedTextContainerMapper$mapModel$1 compressionResistantAttributedTextContainerMapper$mapModel$1;
        int i;
        Iterator it;
        Collection collection;
        if (continuationImpl instanceof CompressionResistantAttributedTextContainerMapper$mapModel$1) {
            compressionResistantAttributedTextContainerMapper$mapModel$1 = (CompressionResistantAttributedTextContainerMapper$mapModel$1) continuationImpl;
            int i2 = compressionResistantAttributedTextContainerMapper$mapModel$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                compressionResistantAttributedTextContainerMapper$mapModel$1.label = i2 - Integer.MIN_VALUE;
                Object obj = compressionResistantAttributedTextContainerMapper$mapModel$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = compressionResistantAttributedTextContainerMapper$mapModel$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list = compressionResistantAttributedTextContainerDto.a;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    it = list.iterator();
                    collection = arrayList;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    collection = (Collection) compressionResistantAttributedTextContainerMapper$mapModel$1.L$7;
                    it = (Iterator) compressionResistantAttributedTextContainerMapper$mapModel$1.L$4;
                    Collection collection2 = (Collection) compressionResistantAttributedTextContainerMapper$mapModel$1.L$3;
                    kotlin.b.b(obj);
                    collection.add((jwd) obj);
                    collection = collection2;
                    if (it.hasNext()) {
                        CompressionResistantAttributedTextDto compressionResistantAttributedTextDto = (CompressionResistantAttributedTextDto) it.next();
                        compressionResistantAttributedTextContainerMapper$mapModel$1.L$0 = null;
                        compressionResistantAttributedTextContainerMapper$mapModel$1.L$1 = null;
                        compressionResistantAttributedTextContainerMapper$mapModel$1.L$2 = null;
                        compressionResistantAttributedTextContainerMapper$mapModel$1.L$3 = collection;
                        compressionResistantAttributedTextContainerMapper$mapModel$1.L$4 = it;
                        compressionResistantAttributedTextContainerMapper$mapModel$1.L$5 = null;
                        compressionResistantAttributedTextContainerMapper$mapModel$1.L$6 = null;
                        compressionResistantAttributedTextContainerMapper$mapModel$1.L$7 = collection;
                        compressionResistantAttributedTextContainerMapper$mapModel$1.label = 1;
                        obj = this.a.a(compressionResistantAttributedTextDto, compressionResistantAttributedTextContainerMapper$mapModel$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        collection2 = collection;
                        collection.add((jwd) obj);
                        collection = collection2;
                        if (it.hasNext()) {
                            return new kwd((List) collection);
                        }
                    }
                }
            }
        }
        compressionResistantAttributedTextContainerMapper$mapModel$1 = new CompressionResistantAttributedTextContainerMapper$mapModel$1(this, continuationImpl);
        Object obj2 = compressionResistantAttributedTextContainerMapper$mapModel$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = compressionResistantAttributedTextContainerMapper$mapModel$1.label;
        if (i != 0) {
        }
    }
}
