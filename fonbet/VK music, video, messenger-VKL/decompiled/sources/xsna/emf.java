package xsna;

import com.vk.clips.uploader.api.model.ClipUploadJob;
import com.vk.clips.uploader.api.model.ClipUploaderData;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.OriginalSoundStatus;
import com.vk.dto.common.clips.ClipLinkModerationStatus;
import com.vk.dto.common.id.UserId;
import kotlin.collections.EmptyList;

/* compiled from: ClipsUtils.kt */
/* loaded from: classes17.dex */
public final class emf {
    public static final /* synthetic */ int a = 0;

    static {
        new bpn0(new com.vk.movika.sdk.base.ui.o0(11));
    }

    public static boolean a(ClipVideoFile clipVideoFile, eed eedVar) {
        xdd xddVar;
        if (clipVideoFile.r <= 0) {
            return ((eedVar instanceof ced) || eedVar == null || (xddVar = eedVar.a) == null || xddVar.j <= 0) ? false : true;
        }
        return true;
    }

    public static ClipVideoFile b(ClipUploadJob clipUploadJob) {
        UserId userId;
        Integer num = clipUploadJob.d;
        EmptyList emptyList = EmptyList.b;
        ClipVideoFile clipVideoFile = new ClipVideoFile(null, null, emptyList, emptyList, null, null, OriginalSoundStatus.NONE, false, ClipLinkModerationStatus.UNDEFINED, null, emptyList, emptyList, jgp.b, null, null, emptyList, null, null, null);
        clipVideoFile.p = "short_video";
        clipVideoFile.m = "";
        clipVideoFile.O = true;
        clipVideoFile.G = true;
        ClipUploaderData.Author author = clipUploadJob.c;
        if (author == null || (userId = author.e()) == null) {
            userId = UserId.d;
        }
        clipVideoFile.b = userId;
        clipVideoFile.c = num != null ? num.intValue() : 0;
        return clipVideoFile;
    }
}
