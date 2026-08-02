package com.yandex.go.eboks.objects.data;

import com.yandex.go.eboks.objects.data.model.EboksObjectsParams;
import com.yandex.go.eboks.objects.data.model.EboksObjectsResponse;
import defpackage.cmt;
import defpackage.ni21;
import defpackage.pq90;
import defpackage.q76;
import defpackage.s490;
import kotlin.Metadata;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J3\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/yandex/go/eboks/objects/data/EboksObjectsApi;", "", "", "mode", MetaDataField.SCREEN_FIELD, "Lcom/yandex/go/eboks/objects/data/model/EboksObjectsParams;", "params", "Lcmt;", "Lcom/yandex/go/eboks/objects/data/model/EboksObjectsResponse;", "a", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/go/eboks/objects/data/model/EboksObjectsParams;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface EboksObjectsApi {
    @s490("eboks/{mode}/v1/objects/{screen}")
    @ni21
    cmt<EboksObjectsResponse> a(@pq90("mode") String mode, @pq90("screen") String screen, @q76 EboksObjectsParams params);
}
