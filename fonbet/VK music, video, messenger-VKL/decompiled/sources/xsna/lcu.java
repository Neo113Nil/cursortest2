package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.id.UserId;
import com.vk.pending.PendingGraffitiAttachment;
import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.cdu;
import xsna.nbu;
import xsna.rcu;

/* compiled from: GraffitiFeature.kt */
/* loaded from: classes15.dex */
public final class lcu extends wk50<edu, cdu, nbu, rcu> {
    public final f4z<PendingGraffitiAttachment> f;
    public final f4z<Object> g;
    public final f4z<Object> h;
    public final f4z<Object> i;
    public final s1t j;

    public lcu() {
        this(null, null);
    }

    @Override // xsna.wk50
    public final void N(cdu cduVar, nbu nbuVar) {
        Bitmap bitmap;
        Bitmap bitmap2;
        cdu cduVar2 = cduVar;
        nbu nbuVar2 = nbuVar;
        int i = cduVar2.b;
        int i2 = cduVar2.b;
        cdu.a aVar = cduVar2.f;
        List<vlo> list = cduVar2.c;
        boolean equals = nbuVar2.equals(nbu.a.b);
        nbu.b bVar = nbu.b.b;
        cdu.a.C2659a c2659a = cdu.a.C2659a.a;
        if (equals) {
            if (aVar instanceof cdu.a.d) {
                T(new rcu.a(c2659a));
                return;
            } else {
                C(bVar);
                return;
            }
        }
        boolean equals2 = nbuVar2.equals(bVar);
        f4z<Object> f4zVar = this.h;
        if (equals2) {
            if (list.get(i2).a.isEmpty()) {
                f4zVar.b(new Object());
                return;
            } else {
                this.g.b(new Object());
                return;
            }
        }
        if (nbuVar2.equals(nbu.c.b)) {
            f4zVar.b(new Object());
            return;
        }
        if (nbuVar2.equals(ubu.b)) {
            if ((aVar instanceof cdu.a.d) && (bitmap2 = ((cdu.a.d) aVar).a) != null) {
                bitmap2.recycle();
            }
            T(new rcu.a(c2659a));
            return;
        }
        if (nbuVar2.equals(vbu.b)) {
            if ((aVar instanceof cdu.a.d) && (bitmap = ((cdu.a.d) aVar).a) != null) {
                bitmap.recycle();
            }
            T(new rcu.a(cdu.a.b.a));
            return;
        }
        if (nbuVar2 instanceof wbu) {
            T(new rcu.a(new cdu.a.d(((wbu) nbuVar2).b)));
            return;
        }
        if (nbuVar2 instanceof nbu.d) {
            nbu.d dVar = (nbu.d) nbuVar2;
            T(new qcu(new ghq0(dVar.b, null)));
            this.e.b(mcr0.l(-1L, dVar.c).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new k41(new bv1(15, this, dVar), 22), new kcu(new wr0(20), 0)));
            return;
        }
        if (nbuVar2.equals(nbu.e.b)) {
            if (i2 < e43.h(list)) {
                T(new pcu(list, i + 1));
                return;
            }
            return;
        }
        if (nbuVar2.equals(nbu.f.b)) {
            if (i2 > 0) {
                T(new pcu(list, i - 1));
                return;
            }
            return;
        }
        if (nbuVar2.equals(sbu.b)) {
            U(cduVar2, false);
            return;
        }
        if (nbuVar2.equals(tbu.b)) {
            U(cduVar2, true);
            return;
        }
        if (nbuVar2 instanceof qbu) {
            float f = ((qbu) nbuVar2).b;
            rho rhoVar = cduVar2.e;
            T(new ocu(rho.a(rhoVar, f, null, null, Math.max(f, rhoVar.a), 6)));
        } else {
            if (nbuVar2 instanceof rbu) {
                vlo vloVar = ((rbu) nbuVar2).b;
                if (epx.f(j5g.i0(list), vloVar)) {
                    return;
                }
                ArrayList v0 = i == e43.h(list) ? j5g.v0(vloVar, list) : j5g.v0(vloVar, list.subList(0, i + 1));
                T(new pcu(v0, e43.h(v0)));
                return;
            }
            if (nbuVar2 instanceof obu) {
                T(new ocu(rho.a(cduVar2.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, ((obu) nbuVar2).b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11)));
            } else {
                if (!(nbuVar2 instanceof pbu)) {
                    throw new NoWhenBranchMatchedException();
                }
                pbu pbuVar = (pbu) nbuVar2;
                T(new ocu(rho.a(cduVar2.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new z5g(pbuVar.b, pbuVar.c), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13)));
            }
        }
    }

    public final void U(cdu cduVar, boolean z) {
        io.reactivex.rxjava3.core.a aVar;
        PermissionHelper permissionHelper = PermissionHelper.a;
        Context context = e43.a;
        PendingGraffitiAttachment pendingGraffitiAttachment = null;
        if (context == null) {
            context = null;
        }
        permissionHelper.getClass();
        if (!PermissionHelper.q(context)) {
            if (z) {
                return;
            }
            this.i.b(new Object());
            return;
        }
        try {
            File q = com.vk.core.files.a.q();
            FileOutputStream fileOutputStream = new FileOutputStream(q);
            Bitmap c = this.j.c(cduVar);
            if (c != null) {
                c.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.close();
                Uri fromFile = Uri.fromFile(q);
                io.reactivex.rxjava3.disposables.b bVar = this.e;
                if (fromFile != null) {
                    aVar = mcr0.r(fromFile, null, null);
                } else {
                    Field field = mcr0.a;
                    aVar = io.reactivex.rxjava3.internal.operators.completable.i.b;
                }
                bVar.b(aVar.subscribe());
                pendingGraffitiAttachment = new PendingGraffitiAttachment(com.vk.upload.impl.a.d.getAndIncrement(), UserId.d, fromFile.toString(), c.getWidth(), c.getHeight(), null);
            }
        } catch (Exception unused) {
            cvk.u(R.string.picker_graffiti_save_result, false);
        }
        if (pendingGraffitiAttachment == null) {
            return;
        }
        this.f.b(pendingGraffitiAttachment);
    }

    public lcu(String str, String str2) {
        super(new nbu.d(str, str2), new xcu(new cdu(0)));
        this.f = new f4z<>();
        this.g = new f4z<>();
        this.h = new f4z<>();
        this.i = new f4z<>();
        this.j = new s1t();
    }
}
