package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import java.util.List;
import kotlinx.serialization.json.c;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/yandex/messaging/core/net/entities/GetExperimentsResponse;", "", "Lkotlinx/serialization/json/c;", "flags", "", "Lcom/yandex/messaging/core/net/entities/TestIdData;", "testIds", "<init>", "(Lkotlinx/serialization/json/c;Ljava/util/List;)V", "component1", "()Lkotlinx/serialization/json/c;", "component2", "()Ljava/util/List;", "copy", "(Lkotlinx/serialization/json/c;Ljava/util/List;)Lcom/yandex/messaging/core/net/entities/GetExperimentsResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlinx/serialization/json/c;", "getFlags", "Ljava/util/List;", "getTestIds", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class GetExperimentsResponse {
    private final c flags;
    private final List<TestIdData> testIds;

    public GetExperimentsResponse(@Json(name = "flags") c cVar, @Json(name = "testIds") List<TestIdData> list) {
        this.flags = cVar;
        this.testIds = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetExperimentsResponse copy$default(GetExperimentsResponse getExperimentsResponse, c cVar, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            cVar = getExperimentsResponse.flags;
        }
        if ((i & 2) != 0) {
            list = getExperimentsResponse.testIds;
        }
        return getExperimentsResponse.copy(cVar, list);
    }

    /* renamed from: component1, reason: from getter */
    public final c getFlags() {
        return this.flags;
    }

    public final List<TestIdData> component2() {
        return this.testIds;
    }

    public final GetExperimentsResponse copy(@Json(name = "flags") c flags, @Json(name = "testIds") List<TestIdData> testIds) {
        return new GetExperimentsResponse(flags, testIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetExperimentsResponse)) {
            return false;
        }
        GetExperimentsResponse getExperimentsResponse = (GetExperimentsResponse) other;
        return jl40.l(this.flags, getExperimentsResponse.flags) && jl40.l(this.testIds, getExperimentsResponse.testIds);
    }

    public final c getFlags() {
        return this.flags;
    }

    public final List<TestIdData> getTestIds() {
        return this.testIds;
    }

    public int hashCode() {
        return this.testIds.hashCode() + (this.flags.a.hashCode() * 31);
    }

    public String toString() {
        return "GetExperimentsResponse(flags=" + this.flags + ", testIds=" + this.testIds + Extension.C_BRAKE;
    }
}
