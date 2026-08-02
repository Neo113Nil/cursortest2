package com.yandex.go.safety.center.safetycenter_web.ui.error;

import android.graphics.drawable.BitmapDrawable;
import com.yandex.go.safety.center.experiment.SafetyCenterWebConfig;
import defpackage.ny61;
import defpackage.pkf;
import defpackage.pul0;
import defpackage.rul0;
import defpackage.w511;
import java.util.Map;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes13.dex */
public final class a {
    public final e a;

    public a(e eVar) {
        this.a = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, SafetyCenterWebConfig.Button button, Map map, boolean z, ContinuationImpl continuationImpl) {
        SafetyCenterWebErrorViewUiStateFactory$mapButton$1 safetyCenterWebErrorViewUiStateFactory$mapButton$1;
        int i;
        SafetyCenterWebErrorViewUiState$ButtonUiState$Type safetyCenterWebErrorViewUiState$ButtonUiState$Type;
        String str;
        String str2;
        String str3;
        SafetyCenterWebErrorViewUiState$ButtonUiState$Type safetyCenterWebErrorViewUiState$ButtonUiState$Type2;
        aVar.getClass();
        if (continuationImpl instanceof SafetyCenterWebErrorViewUiStateFactory$mapButton$1) {
            safetyCenterWebErrorViewUiStateFactory$mapButton$1 = (SafetyCenterWebErrorViewUiStateFactory$mapButton$1) continuationImpl;
            int i2 = safetyCenterWebErrorViewUiStateFactory$mapButton$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                safetyCenterWebErrorViewUiStateFactory$mapButton$1.label = i2 - Integer.MIN_VALUE;
                Object obj = safetyCenterWebErrorViewUiStateFactory$mapButton$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = safetyCenterWebErrorViewUiStateFactory$mapButton$1.label;
                if (i != 0) {
                    b.b(obj);
                    SafetyCenterWebConfig.Button.Type type = button.a;
                    if (type != SafetyCenterWebConfig.Button.Type.SHARE_ROUTE || z) {
                        int i3 = rul0.a[type.ordinal()];
                        if (i3 == 1) {
                            safetyCenterWebErrorViewUiState$ButtonUiState$Type = SafetyCenterWebErrorViewUiState$ButtonUiState$Type.CALL_EMERGENCY;
                        } else if (i3 == 2) {
                            safetyCenterWebErrorViewUiState$ButtonUiState$Type = SafetyCenterWebErrorViewUiState$ButtonUiState$Type.SUPPORT;
                        } else if (i3 == 3) {
                            safetyCenterWebErrorViewUiState$ButtonUiState$Type = SafetyCenterWebErrorViewUiState$ButtonUiState$Type.SHARE_URL;
                        } else if (i3 != 4) {
                            w511.b();
                            return null;
                        }
                        str = (String) map.get(button.b);
                        if (str == null) {
                            str = "";
                        }
                        String str4 = button.c;
                        if (str4 != null) {
                            e eVar = aVar.a;
                            safetyCenterWebErrorViewUiStateFactory$mapButton$1.L$0 = null;
                            safetyCenterWebErrorViewUiStateFactory$mapButton$1.L$1 = null;
                            safetyCenterWebErrorViewUiStateFactory$mapButton$1.L$2 = safetyCenterWebErrorViewUiState$ButtonUiState$Type;
                            safetyCenterWebErrorViewUiStateFactory$mapButton$1.L$3 = str;
                            safetyCenterWebErrorViewUiStateFactory$mapButton$1.L$4 = str4;
                            safetyCenterWebErrorViewUiStateFactory$mapButton$1.Z$0 = z;
                            safetyCenterWebErrorViewUiStateFactory$mapButton$1.label = 1;
                            Object f = e.f(eVar, str4, null, safetyCenterWebErrorViewUiStateFactory$mapButton$1, 6);
                            if (f == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            SafetyCenterWebErrorViewUiState$ButtonUiState$Type safetyCenterWebErrorViewUiState$ButtonUiState$Type3 = safetyCenterWebErrorViewUiState$ButtonUiState$Type;
                            obj = f;
                            str2 = str4;
                            str3 = str;
                            safetyCenterWebErrorViewUiState$ButtonUiState$Type2 = safetyCenterWebErrorViewUiState$ButtonUiState$Type3;
                        }
                        return new pul0(safetyCenterWebErrorViewUiState$ButtonUiState$Type, str, r4);
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = (String) safetyCenterWebErrorViewUiStateFactory$mapButton$1.L$4;
                str3 = (String) safetyCenterWebErrorViewUiStateFactory$mapButton$1.L$3;
                safetyCenterWebErrorViewUiState$ButtonUiState$Type2 = (SafetyCenterWebErrorViewUiState$ButtonUiState$Type) safetyCenterWebErrorViewUiStateFactory$mapButton$1.L$2;
                b.b(obj);
                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                r4 = bitmapDrawable != null ? pkf.g(bitmapDrawable, str2, null) : null;
                safetyCenterWebErrorViewUiState$ButtonUiState$Type = safetyCenterWebErrorViewUiState$ButtonUiState$Type2;
                str = str3;
                return new pul0(safetyCenterWebErrorViewUiState$ButtonUiState$Type, str, r4);
            }
        }
        safetyCenterWebErrorViewUiStateFactory$mapButton$1 = new SafetyCenterWebErrorViewUiStateFactory$mapButton$1(aVar, continuationImpl);
        Object obj2 = safetyCenterWebErrorViewUiStateFactory$mapButton$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = safetyCenterWebErrorViewUiStateFactory$mapButton$1.label;
        if (i != 0) {
        }
        BitmapDrawable bitmapDrawable2 = (BitmapDrawable) obj2;
        if (bitmapDrawable2 != null) {
        }
        safetyCenterWebErrorViewUiState$ButtonUiState$Type = safetyCenterWebErrorViewUiState$ButtonUiState$Type2;
        str = str3;
        return new pul0(safetyCenterWebErrorViewUiState$ButtonUiState$Type, str, r4);
    }
}
