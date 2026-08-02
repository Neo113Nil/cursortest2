package com.ybsdk.core.utils.ui.core;

import android.view.ViewOutlineProvider;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.fqe;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\b\t\b&\u0018\u0000 \t2\u00020\u0001:\u0001\nB\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/ybsdk/core/utils/ui/core/CoreOutlineProvider;", "Landroid/view/ViewOutlineProvider;", "", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "<init>", "([F)V", "[F", "getCornerRadius", "()[F", "Companion", "fqe", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class CoreOutlineProvider extends ViewOutlineProvider {
    public static final fqe Companion = new fqe();
    private final float[] cornerRadius;

    public CoreOutlineProvider(float[] fArr) {
        this.cornerRadius = fArr;
    }

    public final float[] getCornerRadius() {
        return this.cornerRadius;
    }
}
