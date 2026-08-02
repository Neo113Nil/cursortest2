package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes6.dex */
public final class oz30 extends pyp0 {
    public static final oz30 INSTANCE = new oz30();
    public static final String a = "MtShimmerSection";
    public static final /* synthetic */ i3y b = a.b(LazyThreadSafetyMode.PUBLICATION, new z530(15));

    @Override // defpackage.pyp0
    /* renamed from: c */
    public final String getA() {
        return a;
    }

    @Override // defpackage.pyp0
    /* renamed from: d */
    public final boolean getD() {
        return false;
    }

    public final KSerializer serializer() {
        return (KSerializer) b.getValue();
    }
}
