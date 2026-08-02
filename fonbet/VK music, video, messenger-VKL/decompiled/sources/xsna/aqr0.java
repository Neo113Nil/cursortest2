package xsna;

import android.os.Parcelable;
import com.ironsource.Hb;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.instantjobs.InstantJob;
import com.vk.upload.core.utils.UploadException;
import com.vk.upload.impl.c;
import com.vk.upload.impl.tasks.k;
import java.util.List;
import org.json.JSONObject;

/* compiled from: VerticalizationPhotoUploadTask.kt */
/* loaded from: classes.dex */
public final class aqr0 extends oda0<Photo> {
    public final UserId m;
    public final aha0 n;
    public c.C1938c o;

    /* compiled from: VerticalizationPhotoUploadTask.kt */
    public static final class a extends k.a<aqr0> {
        @Override // xsna.s7x
        public final InstantJob a(ny90 ny90Var) {
            aqr0 aqr0Var = new aqr0(ny90Var.f(DownloadModel.FILE_NAME), new UserId(ny90Var.e("owner_id")));
            aqr0Var.d = ny90Var.c("task_id");
            return aqr0Var;
        }

        @Override // com.vk.upload.impl.tasks.k.a, xsna.s7x
        public final void b(InstantJob instantJob, ny90 ny90Var) {
            aqr0 aqr0Var = (aqr0) instantJob;
            super.b(aqr0Var, ny90Var);
            ny90Var.n("owner_id", aqr0Var.m.b);
        }

        @Override // com.vk.upload.impl.tasks.k.a
        /* renamed from: c */
        public final void b(aqr0 aqr0Var, ny90 ny90Var) {
            aqr0 aqr0Var2 = aqr0Var;
            super.b(aqr0Var2, ny90Var);
            ny90Var.n("owner_id", aqr0Var2.m.b);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "VerticalizationPhotoUploadTask";
        }
    }

    public aqr0(String str, UserId userId) {
        super(str, null, 6);
        this.m = userId;
        this.n = f9t.d();
    }

    @Override // xsna.sp6
    public final Parcelable Y() {
        c.C1938c c1938c = this.o;
        if (c1938c == null) {
            return null;
        }
        PhotosPhotoDto photosPhotoDto = (PhotosPhotoDto) j5g.a0((List) rsg0.a0(yfb.x(zga0.k(this.n, c1938c.b, this.m, null, Integer.valueOf(Integer.parseInt(c1938c.a)), c1938c.c, Boolean.FALSE, 460))).a());
        if (photosPhotoDto != null) {
            return xfa0.a(photosPhotoDto);
        }
        return null;
    }

    @Override // com.vk.upload.impl.b
    public final io.reactivex.rxjava3.core.q<ncq0> b0() {
        xy2 d;
        d = this.n.d(null, Boolean.FALSE);
        dz2 x = yfb.x(d);
        this.g = x.b;
        return rsg0.a0(x).U(new hl30(new n0m0(10), 18));
    }

    @Override // com.vk.upload.impl.tasks.k
    public final void g0(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.o = new c.C1938c(jSONObject.getString(Hb.a), jSONObject.getString("photo"), jSONObject.getString("hash"));
        } catch (Exception e) {
            if (str == null) {
                str = "";
            }
            throw new UploadException("can't parse upload response", str, e);
        }
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "VerticalizationPhotoUploadTask";
    }
}
