package androidx.compose.ui.platform;

import defpackage.a7u0;
import defpackage.l4z;
import defpackage.n3z;
import defpackage.qwd;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\" \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003\" \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0005\u001a\u0004\b\b\u0010\u0003¨\u0006\u000b"}, d2 = {"Landroidx/compose/runtime/h;", "Lpey;", "getLocalLifecycleOwner", "()Landroidx/compose/runtime/h;", "getLocalLifecycleOwner$annotations", "()V", "LocalLifecycleOwner", "Lj2m0;", "getLocalSavedStateRegistryOwner", "getLocalSavedStateRegistryOwner$annotations", "LocalSavedStateRegistryOwner", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {
    public static final qwd a = new qwd(AndroidCompositionLocals_androidKt$LocalConfiguration$1.w);
    public static final a7u0 b = new a7u0(AndroidCompositionLocals_androidKt$LocalContext$1.w);
    public static final qwd c = new qwd(AndroidCompositionLocals_androidKt$LocalResources$1.w);
    public static final a7u0 d = new a7u0(AndroidCompositionLocals_androidKt$LocalImageVectorCache$1.w);
    public static final a7u0 e = new a7u0(AndroidCompositionLocals_androidKt$LocalResourceIdCache$1.w);
    public static final a7u0 f = new a7u0(AndroidCompositionLocals_androidKt$LocalView$1.w);

    public static final void a(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    public static final androidx.compose.runtime.h getLocalLifecycleOwner() {
        return n3z.a;
    }

    public static final androidx.compose.runtime.h getLocalSavedStateRegistryOwner() {
        return l4z.a;
    }
}
