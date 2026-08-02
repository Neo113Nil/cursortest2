package com.ybsdk.feature.pdf.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.pdf.internal.network.dto.Button;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/feature/pdf/internal/network/dto/ButtonsGroup;", "", "primaryButton", "Lcom/ybsdk/feature/pdf/internal/network/dto/Button;", "secondaryButton", "alignment", "Lcom/ybsdk/feature/pdf/internal/network/dto/Button$Alignment;", "<init>", "(Lcom/ybsdk/feature/pdf/internal/network/dto/Button;Lcom/ybsdk/feature/pdf/internal/network/dto/Button;Lcom/ybsdk/feature/pdf/internal/network/dto/Button$Alignment;)V", "getPrimaryButton", "()Lcom/ybsdk/feature/pdf/internal/network/dto/Button;", "getSecondaryButton", "getAlignment", "()Lcom/ybsdk/feature/pdf/internal/network/dto/Button$Alignment;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-pdf_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ButtonsGroup {
    private final Button.Alignment alignment;
    private final Button primaryButton;
    private final Button secondaryButton;

    public ButtonsGroup(@Json(name = "primary_button") Button button, @Json(name = "secondary_button") Button button2, @Json(name = "alignment") Button.Alignment alignment) {
        this.primaryButton = button;
        this.secondaryButton = button2;
        this.alignment = alignment;
    }

    public static /* synthetic */ ButtonsGroup copy$default(ButtonsGroup buttonsGroup, Button button, Button button2, Button.Alignment alignment, int i, Object obj) {
        if ((i & 1) != 0) {
            button = buttonsGroup.primaryButton;
        }
        if ((i & 2) != 0) {
            button2 = buttonsGroup.secondaryButton;
        }
        if ((i & 4) != 0) {
            alignment = buttonsGroup.alignment;
        }
        return buttonsGroup.copy(button, button2, alignment);
    }

    /* renamed from: component1, reason: from getter */
    public final Button getPrimaryButton() {
        return this.primaryButton;
    }

    /* renamed from: component2, reason: from getter */
    public final Button getSecondaryButton() {
        return this.secondaryButton;
    }

    /* renamed from: component3, reason: from getter */
    public final Button.Alignment getAlignment() {
        return this.alignment;
    }

    public final ButtonsGroup copy(@Json(name = "primary_button") Button primaryButton, @Json(name = "secondary_button") Button secondaryButton, @Json(name = "alignment") Button.Alignment alignment) {
        return new ButtonsGroup(primaryButton, secondaryButton, alignment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonsGroup)) {
            return false;
        }
        ButtonsGroup buttonsGroup = (ButtonsGroup) other;
        return jl40.l(this.primaryButton, buttonsGroup.primaryButton) && jl40.l(this.secondaryButton, buttonsGroup.secondaryButton) && this.alignment == buttonsGroup.alignment;
    }

    public final Button.Alignment getAlignment() {
        return this.alignment;
    }

    public final Button getPrimaryButton() {
        return this.primaryButton;
    }

    public final Button getSecondaryButton() {
        return this.secondaryButton;
    }

    public int hashCode() {
        Button button = this.primaryButton;
        int hashCode = (button == null ? 0 : button.hashCode()) * 31;
        Button button2 = this.secondaryButton;
        int hashCode2 = (hashCode + (button2 == null ? 0 : button2.hashCode())) * 31;
        Button.Alignment alignment = this.alignment;
        return hashCode2 + (alignment != null ? alignment.hashCode() : 0);
    }

    public String toString() {
        return "ButtonsGroup(primaryButton=" + this.primaryButton + ", secondaryButton=" + this.secondaryButton + ", alignment=" + this.alignment + Extension.C_BRAKE;
    }
}
