package com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.presentation.bottomsheet;

import android.os.Bundle;
import defpackage.yvf0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/presentation/bottomsheet/CustomBottomSheetFragmentHelper;", "", "<init>", "()V", "Landroid/os/Bundle;", "bundle", "Lyvf0;", "Lflex/engine/a;", "creator", "Lzy11;", "saveEngineCreator", "(Landroid/os/Bundle;Lyvf0;)V", "Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/presentation/bottomsheet/FlexArgs;", "args", "saveArgs", "(Landroid/os/Bundle;Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/presentation/bottomsheet/FlexArgs;)V", "arguments", "getEngineCreator", "(Landroid/os/Bundle;)Lyvf0;", "getArgs", "(Landroid/os/Bundle;)Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/presentation/bottomsheet/FlexArgs;", "clearStorage", "(Landroid/os/Bundle;)V", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CustomBottomSheetFragmentHelper {
    public static final CustomBottomSheetFragmentHelper INSTANCE = new CustomBottomSheetFragmentHelper();

    private CustomBottomSheetFragmentHelper() {
    }

    public final void clearStorage(Bundle arguments) {
        String string;
        String string2;
        if (arguments != null && (string2 = arguments.getString(CustomBottomSheetStorageKt.ENGINE_LABEL_KEY)) != null) {
            CustomBottomSheetCreatorStorage.INSTANCE.clear(string2);
        }
        if (arguments == null || (string = arguments.getString(CustomBottomSheetStorageKt.ARGS_LABEL_KEY)) == null) {
            return;
        }
        CustomBottomSheetArgsStorage.INSTANCE.clear(string);
    }

    public final FlexArgs getArgs(Bundle arguments) {
        String string;
        if (arguments == null || (string = arguments.getString(CustomBottomSheetStorageKt.ARGS_LABEL_KEY)) == null) {
            return null;
        }
        return CustomBottomSheetArgsStorage.INSTANCE.obtain(string);
    }

    public final yvf0 getEngineCreator(Bundle arguments) {
        String string;
        if (arguments == null || (string = arguments.getString(CustomBottomSheetStorageKt.ENGINE_LABEL_KEY)) == null) {
            return null;
        }
        return CustomBottomSheetCreatorStorage.INSTANCE.obtain(string);
    }

    public final void saveArgs(Bundle bundle, FlexArgs args) {
        bundle.putString(CustomBottomSheetStorageKt.ARGS_LABEL_KEY, CustomBottomSheetArgsStorage.INSTANCE.persist(args));
    }

    public final void saveEngineCreator(Bundle bundle, yvf0 creator) {
        bundle.putString(CustomBottomSheetStorageKt.ENGINE_LABEL_KEY, CustomBottomSheetCreatorStorage.INSTANCE.persist(creator));
    }
}
