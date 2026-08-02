package xsna;

import android.content.Context;
import android.content.Intent;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import com.vk.core.files.ExternalDirType;
import com.vk.core.fragments.FragmentImpl;
import com.vk.mediapicker.api.models.MediaPickerConfiguration;
import com.vk.mediapicker.impl.presentation.mvi.MediaPickerMviState;
import com.vk.mediapicker.impl.presentation.mvi.a;
import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import xsna.mt10;
import xsna.wcy;

/* compiled from: MediaPickerFacadeImpl.kt */
/* loaded from: classes3.dex */
public final class pt10 implements mt10 {
    public final bu10 a;
    public u1h0 b;
    public com.vk.mediapicker.impl.presentation.mvi.g c;
    public s8g0 d;
    public FrameLayout e;

    /* compiled from: MediaPickerFacadeImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MediaPickerConfiguration.MediaType.values().length];
            try {
                iArr[MediaPickerConfiguration.MediaType.Image.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaPickerConfiguration.MediaType.Video.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public pt10(bu10 bu10Var) {
        this.a = bu10Var;
    }

    @Override // xsna.mt10
    public final void C() {
        m().b(a.i.b);
    }

    @Override // xsna.mt10
    public final void D() {
        m().b(a.b.b);
    }

    @Override // xsna.mt10
    public final void K0(int i, String[] strArr) {
        s8g0 s8g0Var = this.d;
        if (s8g0Var == null) {
            s8g0Var = null;
        }
        s8g0Var.K0(i, strArr);
    }

    @Override // xsna.mt10
    public final void a(int i) {
        m().b(new a.h(i));
    }

    @Override // xsna.mt10
    public final void b(int i) {
        m().b(new a.C1266a(i));
    }

    @Override // xsna.mt10
    public final void c(int i, ArrayList arrayList) {
        s8g0 s8g0Var = this.d;
        if (s8g0Var == null) {
            s8g0Var = null;
        }
        s8g0Var.wi(i, arrayList);
    }

    @Override // xsna.mt10
    public final void d() {
        m().b(a.n.b);
    }

    @Override // xsna.mt10
    public final void e(FragmentImpl fragmentImpl, MediaPickerConfiguration.MediaType mediaType) {
        int i = a.$EnumSwitchMapping$0[mediaType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            wlb0.q(fragmentImpl);
        } else {
            Context mo2getContext = fragmentImpl.mo2getContext();
            if (mo2getContext == null) {
                return;
            }
            PermissionHelper permissionHelper = PermissionHelper.a;
            permissionHelper.getClass();
            PermissionHelper.f(permissionHelper, mo2getContext, PermissionHelper.t, R.string.vk_permissions_intent_photo, R.string.vk_permissions_intent_photo, new oe5(23, mo2getContext, fragmentImpl), null, 32);
        }
    }

    @Override // xsna.mt10
    public final void f(int i) {
        m().b(new a.g(i));
    }

    @Override // xsna.mt10
    public final void g() {
        m().b(a.e.b);
    }

    @Override // xsna.mt10
    public final void h(FragmentImpl fragmentImpl, int i, int i2, Intent intent) {
        s8g0 s8g0Var = this.d;
        if (s8g0Var == null) {
            s8g0Var = null;
        }
        s8g0Var.onActivityResult(i, i2, intent);
        if (vua0.s(i)) {
            boolean t = vua0.t(i);
            File l = vua0.l(i);
            if (l == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            io.reactivex.rxjava3.internal.operators.single.f0 c = com.vk.core.files.b.c(new com.vk.core.files.b(fragmentImpl.requireContext().getApplicationContext()), l, t ? ExternalDirType.VIDEO : ExternalDirType.IMAGES, 4);
            int i3 = kwg0.a;
            itg0.c(c.subscribe(new iwg0(), new hwg0()), fragmentImpl);
        }
    }

    @Override // xsna.mt10
    public final void i(int i) {
        m().b(new a.f(i));
    }

    @Override // xsna.mt10
    public final void j(int i, ArrayList arrayList) {
        s8g0 s8g0Var = this.d;
        if (s8g0Var == null) {
            s8g0Var = null;
        }
        s8g0Var.pc(i, arrayList);
    }

    @Override // xsna.mt10
    public final void k() {
        m().b(a.l.b);
    }

    @Override // xsna.mt10
    public final void l(FragmentImpl fragmentImpl, MediaPickerConfiguration mediaPickerConfiguration, List list, mt10.a aVar) {
        String[] strArr;
        qt10 qt10Var = new qt10(mediaPickerConfiguration, list, this);
        this.c = new com.vk.mediapicker.impl.presentation.mvi.g(fragmentImpl.requireContext());
        nt10 nt10Var = new nt10(qt10Var, 0);
        int i = wcy.c;
        this.b = new u1h0(fpf0.e(bn50.class, wcy.a.a(fpf0.d(MediaPickerMviState.class)), wcy.a.a(fpf0.d(MediaPickerMviState.class)), wcy.a.a(fpf0.d(com.vk.mediapicker.impl.presentation.mvi.a.class)), wcy.a.a(fpf0.d(com.vk.mediapicker.impl.presentation.mvi.f.class))).toString(), fragmentImpl, fragmentImpl, nt10Var);
        FrameLayout frameLayout = new FrameLayout(fragmentImpl.requireContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.e = frameLayout;
        MediaPickerConfiguration.MediaType mediaType = mediaPickerConfiguration.d;
        int i2 = (gz80.a(34) && mediaType == MediaPickerConfiguration.MediaType.Image) ? R.string.vk_permissions_storage_separate_photo : (gz80.a(34) && mediaType == MediaPickerConfiguration.MediaType.Video) ? R.string.vk_permissions_storage_separate_video : R.string.vk_permissions_storage;
        ebs c = kn4.c(fragmentImpl);
        Context requireContext = fragmentImpl.requireContext();
        ey90 ey90Var = new ey90(e3m.f(R.attr.vk_ui_background_content, requireContext), e3m.f(R.attr.vk_ui_text_subhead, requireContext));
        String[] strArr2 = PermissionHelper.g;
        if (gz80.a(34) && mediaType == MediaPickerConfiguration.MediaType.Image) {
            PermissionHelper.a.getClass();
            strArr = PermissionHelper.r;
        } else if (gz80.a(34) && mediaType == MediaPickerConfiguration.MediaType.Video) {
            PermissionHelper.a.getClass();
            strArr = PermissionHelper.s;
        } else if (gz80.a(29)) {
            PermissionHelper.a.getClass();
            strArr = PermissionHelper.q;
        } else {
            PermissionHelper.a.getClass();
            strArr = PermissionHelper.e;
        }
        this.d = new s8g0(c, frameLayout, ey90Var, new yx90(i2, 16, strArr2, strArr, false), new com.vk.movika.sdk.base.ui.i(19, fragmentImpl, this), null, new m2j(this, 25), null, null, null);
        po40.e(new fz7(2, fragmentImpl, this)).a(new com.vk.mvi.binder.a(fragmentImpl.getLifecycle(), Lifecycle.State.RESUMED), m(), aVar);
    }

    public final bn50<MediaPickerMviState, MediaPickerMviState, com.vk.mediapicker.impl.presentation.mvi.a, com.vk.mediapicker.impl.presentation.mvi.f> m() {
        u1h0 u1h0Var = this.b;
        if (u1h0Var == null) {
            u1h0Var = null;
        }
        return (bn50) u1h0Var.getValue();
    }

    @Override // xsna.mt10
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        s8g0 s8g0Var = this.d;
        if (s8g0Var == null) {
            s8g0Var = null;
        }
        s8g0Var.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // xsna.mt10
    public final void onResume() {
        m().b(a.m.b);
    }
}
