package com.yandex.go.places.impl.ui.organizations.buttons;

import com.yandex.go.places.impl.domain.entities.organizations.OrganizationPreviewCardButtonType;
import com.yandex.go.places.impl.ui.organizations.buttons.OrganizationActionButtonComponent;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[OrganizationPreviewCardButtonType.values().length];
        try {
            iArr[OrganizationPreviewCardButtonType.LEAD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OrganizationPreviewCardButtonType.SECONDARY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[OrganizationActionButtonComponent.ButtonStyle.values().length];
        try {
            iArr2[OrganizationActionButtonComponent.ButtonStyle.LEAD.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[OrganizationActionButtonComponent.ButtonStyle.SECONDARY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}
