package xsna;

import android.net.Uri;
import com.vk.clips.uploader.api.model.ClipUploadJob;
import com.vk.clips.uploader.api.model.ClipUploaderData;
import com.vk.dto.common.id.UserId;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import xsna.ceq0;
import xsna.ded;

/* compiled from: ClipsUploadingStateMapper.kt */
/* loaded from: classes17.dex */
public final class xlf {
    public static ceq0 a(ClipUploadJob clipUploadJob, ded dedVar) {
        Integer num = clipUploadJob.f;
        int i = clipUploadJob.b;
        ClipUploaderData.Author author = clipUploadJob.c;
        UserId d = author != null ? author.d() : null;
        File file = clipUploadJob.e;
        String valueOf = String.valueOf(file != null ? Uri.fromFile(file) : null);
        boolean z = (num != null ? num.intValue() : 0) > 0;
        boolean z2 = clipUploadJob.g;
        if (dedVar instanceof ded.i) {
            return new ceq0.h.b(d, (num != null ? num.intValue() : 0) > 0, z2, valueOf, i);
        }
        if (dedVar instanceof ded.f) {
            return new ceq0.g.b(((ded.f) dedVar).a, i, d, valueOf, z, z2);
        }
        if (dedVar instanceof ded.c) {
            return new ceq0.a.b(d, z, z2, valueOf, i);
        }
        if (dedVar instanceof ded.b) {
            return new ceq0.c.b(d, z, z2, valueOf, i);
        }
        if (dedVar instanceof ded.e) {
            return new ceq0.f.b(d, z, z2, valueOf, i);
        }
        if (dedVar instanceof ded.d) {
            return new ceq0.b(d, z, z2, valueOf, i);
        }
        if (dedVar instanceof ded.h) {
            return new ceq0.e(d, z, z2, valueOf, i);
        }
        if ((dedVar instanceof ded.g) || (dedVar instanceof ded.a)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static ceq0 b(eed eedVar) {
        if (eedVar == null) {
            return null;
        }
        xdd xddVar = eedVar.a;
        int i = xddVar.a;
        boolean z = xddVar.j > 0;
        if (eedVar instanceof med) {
            return new ceq0.h.a(((med) eedVar).a);
        }
        if (eedVar instanceof ted) {
            return null;
        }
        if (eedVar instanceof jed) {
            jed jedVar = (jed) eedVar;
            return jedVar.c ? new ceq0.a.C2662a(jedVar.a) : new ceq0.g.a(an10.b(jedVar.b * 100), jedVar.a);
        }
        if (eedVar instanceof ged) {
            return new ceq0.f.a(((ged) eedVar).a);
        }
        if (eedVar instanceof ydd) {
            return new ceq0.c.a(((ydd) eedVar).a);
        }
        if (eedVar instanceof aed) {
            return new ceq0.d(i, z, ((aed) eedVar).a.k);
        }
        if (!(eedVar instanceof ced)) {
            throw new NoWhenBranchMatchedException();
        }
        ced cedVar = (ced) eedVar;
        xdd xddVar2 = cedVar.a;
        boolean z2 = xddVar2.k;
        File file = xddVar2.c.a;
        return new ceq0.e(cedVar.a.h, z, z2, String.valueOf(file != null ? Uri.fromFile(file) : null), i);
    }
}
