package xsna;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.Peer;

/* compiled from: ChatClipsBottomBarDecorationViewFactoryImpl.kt */
/* loaded from: classes2.dex */
public final class cob implements c48 {
    private static final c48 STUB = new a();
    public final gob a;
    public final com.vk.im.engine.models.c b;
    public final Peer c;

    /* compiled from: ChatClipsBottomBarDecorationViewFactoryImpl.kt */
    public static final class a implements c48 {
        @Override // xsna.c48
        public final d6e a(Fragment fragment) {
            return null;
        }

        @Override // xsna.c48
        public final int b() {
            return 48;
        }
    }

    public cob(nob nobVar, com.vk.im.engine.models.c cVar, Peer peer) {
        this.a = nobVar;
        this.b = cVar;
        this.c = peer;
    }

    @Override // xsna.c48
    public final d6e a(Fragment fragment) {
        if (!(fragment instanceof FragmentImpl)) {
            return null;
        }
        dhr0 dhr0Var = dhr0.a;
        Context requireContext = fragment.requireContext();
        dhr0Var.getClass();
        return new ynb(dhr0.t(requireContext), this.a, this.b, this.c, new gy0(fragment, 16));
    }

    @Override // xsna.c48
    public final int b() {
        return iah0.a(48);
    }
}
