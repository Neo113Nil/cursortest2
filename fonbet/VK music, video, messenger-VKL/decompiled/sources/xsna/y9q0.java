package xsna;

import android.content.Context;
import android.widget.ImageView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.sdk.shared.upload.badge.UploadBadgeIconType;
import com.vk.core.ui.image.VKImageController;
import kotlin.collections.EmptyList;

/* compiled from: UploadBadgeViewImpl.kt */
/* loaded from: classes17.dex */
public final class y9q0 implements x9q0 {
    public final u9q0 a;
    public final com.vk.clips.design.view.component.video.preview.b b;
    public final io.reactivex.rxjava3.core.q<v9q0> c;
    public io.reactivex.rxjava3.disposables.c d;

    /* compiled from: UploadBadgeViewImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UploadBadgeIconType.values().length];
            try {
                iArr[UploadBadgeIconType.PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UploadBadgeIconType.CANCEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UploadBadgeIconType.CHECK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UploadBadgeIconType.RETRY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public y9q0(Context context, u9q0 u9q0Var, sdl sdlVar) {
        this.a = u9q0Var;
        com.vk.clips.design.view.component.video.preview.b bVar = new com.vk.clips.design.view.component.video.preview.b(context);
        this.b = bVar;
        io.reactivex.rxjava3.internal.operators.observable.z0 z0Var = u9q0Var.e;
        this.c = z0Var;
        Context context2 = bVar.getContext();
        sdlVar.getClass();
        rdl rdlVar = new rdl(context2);
        bVar.d = rdlVar;
        bVar.b.setBackgroundContentControllerFactory(new xw70(rdlVar, 9));
        this.d = new io.reactivex.rxjava3.internal.operators.observable.k1(z0Var).L(new oyr(new i0b0(io.reactivex.rxjava3.android.schedulers.a.b(), 7), 20), false).subscribe(new cp50(new dso0(this, 3), 19));
        bVar.setOnCancelClickListener(new h8n0(this, 4));
        bVar.setOnDismissListener(new wm80(this, 28));
        u9q0Var.f = u9q0Var.b.f().a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new o330(new qjl0(u9q0Var, 6), 21));
    }

    @Override // xsna.x9q0
    public final void a() {
        com.vk.clips.design.view.component.video.preview.b bVar = this.b;
        bVar.e = false;
        bVar.setX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // xsna.x9q0
    public final void b() {
        u9q0 u9q0Var = this.a;
        u9q0Var.k = true;
        u9q0Var.d.onNext(new v9q0(null, 0, 0, false, false, false, false, false, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE));
    }

    @Override // xsna.x9q0
    public final void c() {
        u9q0 u9q0Var = this.a;
        u9q0Var.k = false;
        u9q0Var.b(u9q0Var.l);
    }

    @Override // xsna.x9q0
    public final void release() {
        io.reactivex.rxjava3.disposables.c cVar = this.d;
        if (cVar != null) {
            cVar.dispose();
        }
        this.d = null;
        u9q0 u9q0Var = this.a;
        io.reactivex.rxjava3.disposables.c cVar2 = u9q0Var.f;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        u9q0Var.f = null;
        io.reactivex.rxjava3.disposables.c cVar3 = u9q0Var.g;
        if (cVar3 != null) {
            cVar3.dispose();
        }
        u9q0Var.g = null;
        u9q0Var.j = null;
        u9q0Var.h.clear();
        u9q0Var.i.clear();
        u9q0Var.l = EmptyList.b;
        u9q0Var.k = false;
        com.vk.clips.design.view.component.video.preview.b bVar = this.b;
        cno<ImageView> cnoVar = bVar.d;
        if (cnoVar != null) {
            ((rdl) cnoVar).a(null, VKImageController.b.q);
        }
        bVar.d = null;
    }
}
