package com.yandex.go.scooters.insurance;

import com.yandex.go.scooters.insurance.ScootersInsuranceModalView;
import com.yandex.go.scooters.insurance.model.ScootersInsuranceControl;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class c {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[ScootersInsuranceControl.values().length];
        try {
            iArr[ScootersInsuranceControl.BUTTON.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersInsuranceControl.TOGGLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScootersInsuranceControl.IMMUTABLE_TOGGLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[ScootersInsuranceModalView.LoadingButton.values().length];
        try {
            iArr2[ScootersInsuranceModalView.LoadingButton.MAIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ScootersInsuranceModalView.LoadingButton.MINOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
