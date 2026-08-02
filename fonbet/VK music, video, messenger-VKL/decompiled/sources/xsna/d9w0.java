package xsna;

import com.vk.core.fragments.FragmentImpl;
import com.vk.vmoji.upload.VmojiPhotoUploadFragment;
import kotlin.NoWhenBranchMatchedException;
import xsna.c9w0;
import xsna.f9w0;

/* compiled from: VmojiPhotoUploadFeature.kt */
/* loaded from: classes7.dex */
public final class d9w0 extends wk50<j9w0, h9w0, c9w0, f9w0> {
    public final e9w0 f;
    public final f2i g;

    /* compiled from: VmojiPhotoUploadFeature.kt */
    public static final class a {
        public a() {
        }

        public final void a() {
            d9w0.this.T(f9w0.a.b);
        }
    }

    public d9w0(g9w0 g9w0Var, e9w0 e9w0Var, f2i f2iVar) {
        super(c9w0.b.b, g9w0Var);
        this.f = e9w0Var;
        this.g = f2iVar;
        e9w0Var.b = new a();
    }

    @Override // xsna.wk50
    public final void N(h9w0 h9w0Var, c9w0 c9w0Var) {
        c9w0 c9w0Var2 = c9w0Var;
        boolean equals = c9w0Var2.equals(c9w0.b.b);
        e9w0 e9w0Var = this.f;
        if (equals) {
            e9w0Var.a();
            return;
        }
        if (c9w0Var2.equals(c9w0.c.b)) {
            e9w0Var.a();
            T(f9w0.b.b);
        } else {
            if (!c9w0Var2.equals(c9w0.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            VmojiPhotoUploadFragment vmojiPhotoUploadFragment = (VmojiPhotoUploadFragment) this.g.b;
            qcy<Object>[] qcyVarArr = FragmentImpl.M;
            vmojiPhotoUploadFragment.Mf(0, null);
        }
    }
}
