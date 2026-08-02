package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.xvz;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/yandex/messaging/core/net/entities/ResolveYaDiskParams;", "", "files", "", "Lcom/yandex/messaging/core/net/entities/ResolveYaDiskParam;", "useReadableErrorCodes", "", "<init>", "(Ljava/util/List;Z)V", "getFiles", "()Ljava/util/List;", "getUseReadableErrorCodes", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ResolveYaDiskParams {
    private final List<ResolveYaDiskParam> files;
    private final boolean useReadableErrorCodes;

    public /* synthetic */ ResolveYaDiskParams(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? false : z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResolveYaDiskParams copy$default(ResolveYaDiskParams resolveYaDiskParams, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = resolveYaDiskParams.files;
        }
        if ((i & 2) != 0) {
            z = resolveYaDiskParams.useReadableErrorCodes;
        }
        return resolveYaDiskParams.copy(list, z);
    }

    public final List<ResolveYaDiskParam> component1() {
        return this.files;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getUseReadableErrorCodes() {
        return this.useReadableErrorCodes;
    }

    public final ResolveYaDiskParams copy(@Json(name = "files") List<ResolveYaDiskParam> files, @Json(name = "use_readable_error_codes") boolean useReadableErrorCodes) {
        return new ResolveYaDiskParams(files, useReadableErrorCodes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResolveYaDiskParams)) {
            return false;
        }
        ResolveYaDiskParams resolveYaDiskParams = (ResolveYaDiskParams) other;
        return jl40.l(this.files, resolveYaDiskParams.files) && this.useReadableErrorCodes == resolveYaDiskParams.useReadableErrorCodes;
    }

    public final List<ResolveYaDiskParam> getFiles() {
        return this.files;
    }

    public final boolean getUseReadableErrorCodes() {
        return this.useReadableErrorCodes;
    }

    public int hashCode() {
        return Boolean.hashCode(this.useReadableErrorCodes) + (this.files.hashCode() * 31);
    }

    public String toString() {
        return xvz.o(this.files, "ResolveYaDiskParams(files=", ", useReadableErrorCodes=", Extension.C_BRAKE, this.useReadableErrorCodes);
    }

    public ResolveYaDiskParams(@Json(name = "files") List<ResolveYaDiskParam> list, @Json(name = "use_readable_error_codes") boolean z) {
        this.files = list;
        this.useReadableErrorCodes = z;
    }
}
