package com.ybsdk.feature.autotopup.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.stories.dto.FullScreenDto;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/BindingPaymentInstructionsDto;", "", "introductionScreen", "Lcom/ybsdk/core/stories/dto/FullScreenDto;", "confirmInstruction", "Lcom/ybsdk/feature/autotopup/internal/network/dto/BindingPaymentConfirmInstructionDto;", "<init>", "(Lcom/ybsdk/core/stories/dto/FullScreenDto;Lcom/ybsdk/feature/autotopup/internal/network/dto/BindingPaymentConfirmInstructionDto;)V", "getIntroductionScreen", "()Lcom/ybsdk/core/stories/dto/FullScreenDto;", "getConfirmInstruction", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/BindingPaymentConfirmInstructionDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BindingPaymentInstructionsDto {
    private final BindingPaymentConfirmInstructionDto confirmInstruction;
    private final FullScreenDto introductionScreen;

    public BindingPaymentInstructionsDto(@Json(name = "introduction_screen") FullScreenDto fullScreenDto, @Json(name = "confirm_instruction") BindingPaymentConfirmInstructionDto bindingPaymentConfirmInstructionDto) {
        this.introductionScreen = fullScreenDto;
        this.confirmInstruction = bindingPaymentConfirmInstructionDto;
    }

    public static /* synthetic */ BindingPaymentInstructionsDto copy$default(BindingPaymentInstructionsDto bindingPaymentInstructionsDto, FullScreenDto fullScreenDto, BindingPaymentConfirmInstructionDto bindingPaymentConfirmInstructionDto, int i, Object obj) {
        if ((i & 1) != 0) {
            fullScreenDto = bindingPaymentInstructionsDto.introductionScreen;
        }
        if ((i & 2) != 0) {
            bindingPaymentConfirmInstructionDto = bindingPaymentInstructionsDto.confirmInstruction;
        }
        return bindingPaymentInstructionsDto.copy(fullScreenDto, bindingPaymentConfirmInstructionDto);
    }

    /* renamed from: component1, reason: from getter */
    public final FullScreenDto getIntroductionScreen() {
        return this.introductionScreen;
    }

    /* renamed from: component2, reason: from getter */
    public final BindingPaymentConfirmInstructionDto getConfirmInstruction() {
        return this.confirmInstruction;
    }

    public final BindingPaymentInstructionsDto copy(@Json(name = "introduction_screen") FullScreenDto introductionScreen, @Json(name = "confirm_instruction") BindingPaymentConfirmInstructionDto confirmInstruction) {
        return new BindingPaymentInstructionsDto(introductionScreen, confirmInstruction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BindingPaymentInstructionsDto)) {
            return false;
        }
        BindingPaymentInstructionsDto bindingPaymentInstructionsDto = (BindingPaymentInstructionsDto) other;
        return jl40.l(this.introductionScreen, bindingPaymentInstructionsDto.introductionScreen) && jl40.l(this.confirmInstruction, bindingPaymentInstructionsDto.confirmInstruction);
    }

    public final BindingPaymentConfirmInstructionDto getConfirmInstruction() {
        return this.confirmInstruction;
    }

    public final FullScreenDto getIntroductionScreen() {
        return this.introductionScreen;
    }

    public int hashCode() {
        FullScreenDto fullScreenDto = this.introductionScreen;
        return this.confirmInstruction.hashCode() + ((fullScreenDto == null ? 0 : fullScreenDto.hashCode()) * 31);
    }

    public String toString() {
        return "BindingPaymentInstructionsDto(introductionScreen=" + this.introductionScreen + ", confirmInstruction=" + this.confirmInstruction + Extension.C_BRAKE;
    }
}
