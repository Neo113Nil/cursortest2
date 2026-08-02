package com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.presentation.bottomsheet;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import defpackage.cjh;
import defpackage.u1m;
import defpackage.yvf0;
import defpackage.ywl;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006Ji\u0010\u0018\u001a\u00020\u00172\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u000b2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/presentation/bottomsheet/CustomBottomSheetFragmentFactory;", "Lcjh;", "Lyvf0;", "Lflex/engine/a;", "documentEngineCreator", "<init>", "(Lyvf0;)V", "Lu1m;", "query", "Lywl;", "document", "", "fullscreen", "closeOnTapOutside", "closeOnSlideDown", "dimBackground", "", "defaultHeight", "shouldLoadByQuery", "", "", "", "customProps", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "create", "(Lu1m;Lywl;ZZZZLjava/lang/Float;ZLjava/util/Map;)Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Lyvf0;", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CustomBottomSheetFragmentFactory implements cjh {
    private final yvf0 documentEngineCreator;

    public CustomBottomSheetFragmentFactory(yvf0 yvf0Var) {
        this.documentEngineCreator = yvf0Var;
    }

    @Override // defpackage.cjh
    public BottomSheetDialogFragment create(u1m query, ywl document, boolean fullscreen, boolean closeOnTapOutside, boolean closeOnSlideDown, boolean dimBackground, Float defaultHeight, boolean shouldLoadByQuery, Map<String, ? extends Object> customProps) {
        return CustomBottomSheetFragment.INSTANCE.newInstance(this.documentEngineCreator, query, document, fullscreen, closeOnTapOutside, closeOnSlideDown, dimBackground, defaultHeight, shouldLoadByQuery, customProps);
    }
}
