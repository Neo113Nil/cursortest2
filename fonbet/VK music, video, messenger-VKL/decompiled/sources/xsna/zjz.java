package xsna;

import android.graphics.drawable.Drawable;
import androidx.fragment.app.FragmentActivity;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.dw20;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class zjz implements izs {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ FragmentActivity c;
    public final /* synthetic */ Ref$ObjectRef d;
    public final /* synthetic */ VideoFile e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ wv2 g;
    public final /* synthetic */ gcp0 h;

    public /* synthetic */ zjz(boolean z, FragmentActivity fragmentActivity, Ref$ObjectRef ref$ObjectRef, VideoFile videoFile, boolean z2, wv2 wv2Var, gcp0 gcp0Var) {
        this.b = z;
        this.c = fragmentActivity;
        this.d = ref$ObjectRef;
        this.e = videoFile;
        this.f = z2;
        this.g = wv2Var;
        this.h = gcp0Var;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, xsna.iq9] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean z = this.b;
        final Ref$ObjectRef ref$ObjectRef = this.d;
        final VideoFile videoFile = this.e;
        final boolean z2 = this.f;
        final wv2 wv2Var = this.g;
        final gcp0 gcp0Var = this.h;
        if (z) {
            final FragmentActivity fragmentActivity = this.c;
            gzs<s3q0> gzsVar = new gzs() { // from class: xsna.bkz
                /* JADX WARN: Type inference failed for: r0v2, types: [T, xsna.akz] */
                @Override // xsna.gzs
                public final Object invoke() {
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    VideoFile videoFile2 = videoFile;
                    boolean z3 = z2;
                    wv2 wv2Var2 = wv2Var;
                    gcp0 gcp0Var2 = gcp0Var;
                    yjz yjzVar = new yjz(ref$ObjectRef2, videoFile2, z3, wv2Var2, gcp0Var2);
                    FragmentActivity fragmentActivity2 = fragmentActivity;
                    zjz zjzVar = new zjz(false, fragmentActivity2, ref$ObjectRef2, videoFile2, z3, wv2Var2, gcp0Var2);
                    PermissionHelper permissionHelper = PermissionHelper.a;
                    permissionHelper.getClass();
                    PermissionHelper.l(permissionHelper, fragmentActivity2, PermissionHelper.b, yjzVar, zjzVar, 4);
                    Ref$ObjectRef.this.element = new akz(ref$ObjectRef2);
                    return s3q0.a;
                }
            };
            gzs<s3q0> gzsVar2 = new gzs() { // from class: xsna.ckz
                /* JADX WARN: Type inference failed for: r1v3, types: [T, xsna.iq9] */
                @Override // xsna.gzs
                public final Object invoke() {
                    mgz mgzVar = new mgz(gcp0Var, 1);
                    VideoFile videoFile2 = videoFile;
                    UserId I0 = videoFile2.I0();
                    int o0 = videoFile2.o0();
                    boolean z3 = z2;
                    Ref$ObjectRef.this.element = new iq9(rsg0.D0(new r6z(o0, I0, z3)).subscribe(new m40(new dkz(videoFile2, z3, mgzVar, wv2Var), 23)));
                    return s3q0.a;
                }
            };
            dw20.b t0 = new dw20.b(fragmentActivity, null).v0(R.string.topshelf_notification_perm_title).r0(R.string.topshelf_notification_perm_message).t0(fragmentActivity.getColor(R.color.vk_steel_gray_500));
            Drawable drawable = fragmentActivity.getDrawable(R.drawable.vk_icon_notification_outline_56);
            if (drawable != null) {
                drawable.setTint(fragmentActivity.getColor(R.color.vk_azure_300));
            } else {
                drawable = null;
            }
            t0.N(drawable).X(gzsVar2).j0(fragmentActivity.getString(R.string.topshelf_notification_perm_allow), gzsVar).V(fragmentActivity.getString(R.string.topshelf_notification_perm_deny), gzsVar2).H0(fragmentActivity.getSupportFragmentManager(), null);
        } else {
            ref$ObjectRef.element = new iq9(rsg0.D0(new r6z(videoFile.o0(), videoFile.I0(), z2)).subscribe(new m40(new dkz(videoFile, z2, new lrk(gcp0Var, 25), wv2Var), 23)));
        }
        return s3q0.a;
    }
}
