package xsna;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.vk.core.fragments.FragmentImpl;

/* compiled from: ChatClipsTopBarDecorationViewFactoryImpl.kt */
/* loaded from: classes2.dex */
public final class mpb implements l7p0 {
    private static final l7p0 STUB = new a();
    public final gob a;

    /* compiled from: ChatClipsTopBarDecorationViewFactoryImpl.kt */
    public static final class a implements l7p0 {
        @Override // xsna.l7p0
        public final d6e a(Fragment fragment) {
            return null;
        }
    }

    public mpb(nob nobVar) {
        this.a = nobVar;
    }

    @Override // xsna.l7p0
    public final d6e a(Fragment fragment) {
        if (!(fragment instanceof FragmentImpl)) {
            return null;
        }
        dhr0 dhr0Var = dhr0.a;
        Context requireContext = fragment.requireContext();
        dhr0Var.getClass();
        return new lpb(dhr0.t(requireContext), this.a, new h20(fragment, 9));
    }
}
