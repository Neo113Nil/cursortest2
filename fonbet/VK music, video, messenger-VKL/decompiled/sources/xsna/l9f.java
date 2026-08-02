package xsna;

import android.os.Parcelable;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.dto.common.id.UserId;
import com.vk.instantjobs.InstantJob;
import com.vk.log.L;
import com.vk.upload.impl.tasks.k;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.UUID;
import xsna.lgj0;

/* compiled from: ClipsThumbsUploadTaskGU.kt */
/* loaded from: classes.dex */
public final class l9f extends oda0<Parcelable> implements ned, w8i {
    public final String m;
    public final UserId n;
    public final int o;
    public final voc p;
    public final bpn0 q;
    public String r;

    /* compiled from: ClipsThumbsUploadTaskGU.kt */
    public static final class a extends k.a<l9f> {
        @Override // xsna.s7x
        public final InstantJob a(ny90 ny90Var) {
            l9f l9fVar = new l9f(ny90Var.f(DownloadModel.FILE_NAME), new UserId(ny90Var.e("owner_id")), ny90Var.c("video_id"), null);
            l9fVar.d = ny90Var.c("task_id");
            return l9fVar;
        }

        @Override // com.vk.upload.impl.tasks.k.a, xsna.s7x
        public final void b(InstantJob instantJob, ny90 ny90Var) {
            l9f l9fVar = (l9f) instantJob;
            super.b(l9fVar, ny90Var);
            ny90Var.n("owner_id", l9fVar.n.b);
            ny90Var.l("video_id", l9fVar.o);
        }

        @Override // com.vk.upload.impl.tasks.k.a
        /* renamed from: c */
        public final void b(l9f l9fVar, ny90 ny90Var) {
            l9f l9fVar2 = l9fVar;
            super.b(l9fVar2, ny90Var);
            ny90Var.n("owner_id", l9fVar2.n.b);
            ny90Var.l("video_id", l9fVar2.o);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "ClipsThumbsUploadTaskGU";
        }
    }

    public l9f(String str, UserId userId, int i, voc vocVar) {
        super(str, null, 6);
        this.m = str;
        this.n = userId;
        this.o = i;
        this.p = vocVar;
        this.q = new bpn0(new com.vk.movika.sdk.base.logic.interactor.j(this, 27));
        this.d = (int) UUID.randomUUID().getLeastSignificantBits();
    }

    @Override // com.vk.upload.impl.b, xsna.sp6
    public final void S(Exception exc) {
        voc vocVar = this.p;
        if (vocVar != null) {
            vocVar.a(exc);
        }
        super.S(exc);
    }

    @Override // com.vk.upload.impl.b, xsna.sp6
    public final void T() {
        super.T();
        if (((mhd) this.q.getValue()).k()) {
            return;
        }
        ClipsDraftPersistentStore.b.getClass();
        ClipsDraftPersistentStore.e(this.m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.sp6
    public final Parcelable Y() {
        L.e("ClipsThumbsUploadTaskGU", "save: " + this.r);
        String str = this.r;
        if (str != null) {
            io.reactivex.rxjava3.internal.operators.observable.b0 a0 = rsg0.a0(yfb.x(lgj0.a.n(new ogj0(), this.n, str, Integer.valueOf(this.o))));
            nf1 nf1Var = new nf1(new t9e(this, 3), 18);
            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
            a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        }
        return null;
    }

    @Override // com.vk.upload.impl.b
    public final io.reactivex.rxjava3.core.q<ncq0> b0() {
        dz2 x = yfb.x(lgj0.a.j(new ogj0(), this.n));
        this.g = x.b;
        io.reactivex.rxjava3.internal.operators.observable.j1 U = rsg0.a0(x).U(new bk1(new nk(12), 7));
        tp0 tp0Var = new tp0(new gv3(10), 14);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return U.E(tp0Var, lVar, kVar, kVar);
    }

    @Override // com.vk.upload.impl.tasks.k
    public final void g0(String str) {
        this.r = str;
        L.e("ClipsThumbsUploadTaskGU", go9.b("saveUploadResponse: ", str));
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "ClipsThumbsUploadTaskGU";
    }
}
