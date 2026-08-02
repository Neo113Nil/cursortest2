package xsna;

import android.support.v4.media.session.PlaybackStateCompat;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.vk.dto.common.id.UserId;
import com.vk.instantjobs.InstantJob;
import com.vk.upload.impl.tasks.k;
import com.vkontakte.android.R;

/* compiled from: LogFileUploadTask.kt */
/* loaded from: classes11.dex */
public final class h000 extends com.vk.upload.impl.tasks.i {

    /* compiled from: LogFileUploadTask.kt */
    public static final class a extends k.a<h000> {
        @Override // xsna.s7x
        public final InstantJob a(ny90 ny90Var) {
            h000 h000Var = new h000(ny90Var.f(DownloadModel.FILE_NAME), new UserId(ny90Var.e("owner_id")), ny90Var.a("need_wall"), ny90Var.a("do_notify"));
            h000Var.d = ny90Var.c("task_id");
            return h000Var;
        }

        @Override // com.vk.upload.impl.tasks.k.a, xsna.s7x
        public final void b(InstantJob instantJob, ny90 ny90Var) {
            h000 h000Var = (h000) instantJob;
            super.b(h000Var, ny90Var);
            ny90Var.n("owner_id", h000Var.l.b);
            ny90Var.j("need_wall", h000Var.m);
            ny90Var.j("do_notify", h000Var.n);
        }

        @Override // com.vk.upload.impl.tasks.k.a
        /* renamed from: c */
        public final void b(h000 h000Var, ny90 ny90Var) {
            h000 h000Var2 = h000Var;
            super.b(h000Var2, ny90Var);
            ny90Var.n("owner_id", h000Var2.l.b);
            ny90Var.j("need_wall", h000Var2.m);
            ny90Var.j("do_notify", h000Var2.n);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "LogFileUploadTask";
        }
    }

    @Override // com.vk.upload.impl.tasks.k
    public final boolean e0(raq0 raq0Var) {
        if (raq0Var.a() >= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            return true;
        }
        cvk.u(R.string.uploading_log_err_notify, true);
        return false;
    }

    @Override // com.vk.upload.impl.tasks.i, com.vk.instantjobs.InstantJob
    public final String s() {
        return "LogFileUploadTask";
    }
}
