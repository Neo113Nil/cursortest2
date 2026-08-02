package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import com.vk.clips.download.api.ClipsDownloadLauncher$ClipsDownloadQuality;
import com.vk.dto.common.ClipVideoFile;
import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;
import java.util.List;
import xsna.av20;
import xsna.dw20;

/* compiled from: ClipDownloaderImpl.kt */
/* loaded from: classes16.dex */
public final class irc implements hrc {
    @Override // xsna.hrc
    public final void a(final Context context, final ClipVideoFile clipVideoFile, final boolean z, final gzs<s3q0> gzsVar, final izs<? super ClipsDownloadLauncher$ClipsDownloadQuality, s3q0> izsVar) {
        jrd jrdVar = jrd.a;
        final ord ordVar = new ord();
        gzs<s3q0> gzsVar2 = new gzs() { // from class: xsna.krd
            @Override // xsna.gzs
            public final Object invoke() {
                Context E;
                int i;
                List l = e43.l(new e520(0, 0, R.string.clip_save_quality_1080, 0, false, 0, 0, false, null, 0, null, false, 8178), new e520(1, 0, R.string.clip_save_quality_720, 1, false, 0, 0, false, null, 0, null, false, 8178), new e520(2, 0, R.string.clip_save_quality_480, 2, false, 0, 0, false, null, 0, null, false, 8178));
                izs izsVar2 = izsVar;
                ClipVideoFile clipVideoFile2 = clipVideoFile;
                ord ordVar2 = ord.this;
                Context context2 = context;
                lrd lrdVar = new lrd(izsVar2, clipVideoFile2, ordVar2, context2, gzsVar);
                av20.a aVar = new av20.a();
                boolean z2 = z;
                if (z2) {
                    dhr0.a.getClass();
                    E = dhr0.s();
                } else {
                    dhr0.a.getClass();
                    E = dhr0.E();
                }
                aVar.d(R.layout.actions_popup_item, LayoutInflater.from(E));
                aVar.d = new prd();
                aVar.e = new qrd(lrdVar, ordVar2);
                av20 b = aVar.b();
                b.setItems(l);
                dw20.b bVar = (dw20.b) dw20.a.k(new dw20.b(context2, null), b, 4);
                if (z2) {
                    dhr0.a.getClass();
                    i = dhr0.u().c;
                } else {
                    dhr0.a.getClass();
                    i = dhr0.C().c;
                }
                ordVar2.a = bVar.u0(i).I0("download_quality_selector");
                return s3q0.a;
            }
        };
        if (gz80.a(34)) {
            gzsVar2.invoke();
            return;
        }
        PermissionHelper permissionHelper = PermissionHelper.a;
        permissionHelper.getClass();
        permissionHelper.d(context, PermissionHelper.e, R.string.vk_permissions_storage, R.string.vk_permissions_storage, gzsVar2, null);
    }

    @Override // xsna.hrc
    public final void b(int i) {
        jrd jrdVar = jrd.a;
        jrd.e(i);
    }
}
