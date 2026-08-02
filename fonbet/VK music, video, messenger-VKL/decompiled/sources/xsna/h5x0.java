package xsna;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.vk.content.design.view.camera.a;
import com.vk.dto.common.id.UserId;
import com.vk.masks.MasksController;
import com.vkontakte.android.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Objects;
import org.chromium.net.NetError;
import xsna.cpk;
import xsna.i3x0;
import xsna.kpk;

/* compiled from: VoipVirtualBackgroundControllerImpl.kt */
/* loaded from: classes7.dex */
public final class h5x0 extends rnw0 implements z4x0 {
    public final lqw0 t;
    public final n4u0 u;
    public final bpn0 v;
    public final bpn0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5x0(final Context context, lqw0 lqw0Var, final xgw0 xgw0Var, final i5x0 i5x0Var, n4u0 n4u0Var, a000 a000Var) {
        super(context, xgw0Var, i5x0Var, a000Var, i3x0.d.a.c, MasksController.MasksCatalogType.VOIP_VIRTUAL_BACKGROUND);
        String s;
        i3x0.d.a.getClass();
        this.t = lqw0Var;
        this.u = n4u0Var;
        this.v = new bpn0(new srq0(i5x0Var, 14));
        bpn0 bpn0Var = new bpn0(new gzs() { // from class: xsna.a5x0
            @Override // xsna.gzs
            public final Object invoke() {
                View findViewById = xgw0.this.findViewById(R.id.custom_virtual_background_progress_container);
                h5x0 h5x0Var = this;
                bzb0 bzb0Var = h5x0Var.h;
                i5x0 i5x0Var2 = i5x0Var;
                b5x0 b5x0Var = new b5x0(1, i5x0Var2, j5x0.class, "openCustomVirtualBackgroundImagePicker", "openCustomVirtualBackgroundImagePicker(Landroid/content/Intent;)V", 0);
                cpk.a aVar = new cpk.a(new c5x0(0, h5x0Var, h5x0.class, "onImagePickerOpened", "onImagePickerOpened()V", 0), new d5x0(0, h5x0Var, h5x0.class, "onImagePickerClosed", "onImagePickerClosed()V", 0), new e5x0(1, h5x0Var, h5x0.class, "onCustomVirtualBackgroundMaskDeleted", "onCustomVirtualBackgroundMaskDeleted(Lcom/vk/dto/masks/Mask;)V", 0), new f5x0(1, h5x0Var, h5x0.class, "onCustomVirtualBackgroundMaskCreated", "onCustomVirtualBackgroundMaskCreated(Lcom/vk/dto/masks/Mask;)V", 0));
                i3x0.f fVar = (i3x0.f) i5x0Var2.f.getValue();
                n4u0 n4u0Var2 = h5x0Var.u;
                UserId a = i5x0Var2.d().a();
                gpk gpkVar = n4u0Var2.b;
                if (!epx.f(gpkVar != null ? gpkVar.a : null, a)) {
                    gpkVar = new gpk(n4u0Var2.a, a);
                    n4u0Var2.b = gpkVar;
                }
                return new cpk(context, findViewById, bzb0Var, b5x0Var, fVar, aVar, gpkVar);
            }
        });
        this.w = bpn0Var;
        this.g.setVirtualBackground((a.b) new bpn0(new ew3(28, this, i5x0Var)).getValue());
        this.g.setNeedMaskBageReload(false);
        this.g.setMasksAnalytics(new fdi());
        gpk gpkVar = ((cpk) bpn0Var.getValue()).g;
        if (gpkVar.a()) {
            kpk kpkVar = (kpk) gpkVar.b.getValue();
            vea0 vea0Var = new vea0(kpkVar.b, NetError.ERR_ICANN_NAME_COLLISION, 0, 1000, true);
            UserId userId = kpkVar.b;
            if (fkq0.c(userId) && !o25.a().a(userId) && (s = o25.a().s(userId)) != null) {
                vea0Var.l = s;
                vea0Var.m = null;
            }
            io.reactivex.rxjava3.kotlin.c.e(rsg0.w0(vea0Var).m(asu0.a.d()), new jr3(10), new p4f(kpkVar, 13));
        }
        if (h().a()) {
            this.g.setOnNewDataListener(new g5x0(this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // xsna.z4x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Intent intent) {
        final Uri uri;
        ArrayList parcelableArrayList;
        cpk cpkVar = (cpk) this.w.getValue();
        if (intent != null) {
            cpkVar.getClass();
            Bundle bundleExtra = intent.getBundleExtra("result_attachments");
            if (bundleExtra != null && (parcelableArrayList = bundleExtra.getParcelableArrayList("result_files")) != null) {
                uri = (Uri) j5g.a0(parcelableArrayList);
                if (uri != null) {
                    final kpk kpkVar = (kpk) cpkVar.g.b.getValue();
                    kpkVar.getClass();
                    io.reactivex.rxjava3.internal.operators.single.b bVar = new io.reactivex.rxjava3.internal.operators.single.b(new io.reactivex.rxjava3.core.a0() { // from class: xsna.jpk
                        @Override // io.reactivex.rxjava3.core.a0
                        public final void subscribe(io.reactivex.rxjava3.core.y yVar) {
                            File i;
                            final kpk kpkVar2 = kpk.this;
                            Context context = kpkVar2.a;
                            final Uri uri2 = uri;
                            try {
                                k9x k9xVar = epk.a;
                                final Uri a = epk.a(context, uri2);
                                if (!yVar.h()) {
                                    final int h = com.vk.upload.impl.a.h(new com.vk.upload.impl.tasks.f(a.toString(), kpkVar2.b), new o43(17, kpkVar2, yVar));
                                    yVar.a(new io.reactivex.rxjava3.functions.e() { // from class: xsna.ipk
                                        @Override // io.reactivex.rxjava3.functions.e
                                        public final void cancel() {
                                            File i2;
                                            com.vk.upload.impl.a.b(h, null);
                                            Uri uri3 = uri2;
                                            Uri uri4 = a;
                                            if (uri3.equals(uri4) || (i2 = com.vk.core.files.a.i(kpkVar2.a, uri4)) == null) {
                                                return;
                                            }
                                            vhk0.d(i2);
                                        }
                                    });
                                } else {
                                    if (uri2.equals(a) || (i = com.vk.core.files.a.i(context, a)) == null) {
                                        return;
                                    }
                                    vhk0.d(i);
                                }
                            } catch (Throwable th) {
                                yVar.onSuccess(new kpk.a.C3195a(th));
                            }
                        }
                    });
                    asu0 asu0Var = asu0.a;
                    io.reactivex.rxjava3.internal.operators.single.f0 q = bVar.q(asu0Var.c());
                    io.reactivex.rxjava3.core.w c = asu0Var.c();
                    Objects.requireNonNull(c, "scheduler is null");
                    cpkVar.h = io.reactivex.rxjava3.kotlin.c.e(new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(new io.reactivex.rxjava3.internal.operators.single.l0(q, c).m(asu0Var.d()), new y50(new zqh(cpkVar, 5), 18)), new bpk(cpkVar, 0)), new ae8(1, cpkVar, cpk.class, "onSaveError", "onSaveError(Ljava/lang/Throwable;)V", 0, 3), new dpk(1, cpkVar, cpk.class, "onSaveResult", "onSaveResult(Lcom/vk/voip/call_effects/custom/CustomVirtualBackgroundStorage$SaveResult;)V", 0));
                }
                cpkVar.f.b.invoke();
            }
        }
        uri = null;
        if (uri != null) {
        }
        cpkVar.f.b.invoke();
    }

    @Override // xsna.rnw0
    public final void e() {
        cpk cpkVar = (cpk) this.w.getValue();
        io.reactivex.rxjava3.disposables.c cVar = cpkVar.h;
        if (cVar != null) {
            cVar.dispose();
        }
        cpkVar.h = null;
    }

    @Override // xsna.rnw0
    public final void f(String str) {
        if (str == null) {
            h().b();
        } else {
            h().d(str);
        }
    }

    public final unw0 h() {
        return (unw0) this.v.getValue();
    }
}
