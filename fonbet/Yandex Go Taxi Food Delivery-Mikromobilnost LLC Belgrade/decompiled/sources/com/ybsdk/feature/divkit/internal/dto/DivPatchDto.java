package com.ybsdk.feature.divkit.internal.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/divkit/internal/dto/DivPatchDto;", "", "divPatch", "Lcom/ybsdk/feature/divkit/internal/dto/DivPatch;", "<init>", "(Lcom/ybsdk/feature/divkit/internal/dto/DivPatch;)V", "getDivPatch", "()Lcom/ybsdk/feature/divkit/internal/dto/DivPatch;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DivPatchDto {
    private final DivPatch divPatch;

    public DivPatchDto(@Json(name = "div_patch") DivPatch divPatch) {
        this.divPatch = divPatch;
    }

    public static /* synthetic */ DivPatchDto copy$default(DivPatchDto divPatchDto, DivPatch divPatch, int i, Object obj) {
        if ((i & 1) != 0) {
            divPatch = divPatchDto.divPatch;
        }
        return divPatchDto.copy(divPatch);
    }

    /* renamed from: component1, reason: from getter */
    public final DivPatch getDivPatch() {
        return this.divPatch;
    }

    public final DivPatchDto copy(@Json(name = "div_patch") DivPatch divPatch) {
        return new DivPatchDto(divPatch);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DivPatchDto) && jl40.l(this.divPatch, ((DivPatchDto) other).divPatch);
    }

    public final DivPatch getDivPatch() {
        return this.divPatch;
    }

    public int hashCode() {
        DivPatch divPatch = this.divPatch;
        if (divPatch == null) {
            return 0;
        }
        return divPatch.hashCode();
    }

    public String toString() {
        return "DivPatchDto(divPatch=" + this.divPatch + Extension.C_BRAKE;
    }
}
