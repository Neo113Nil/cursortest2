package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.clips.sdk.drafts.api.ClearDraftMode;
import com.vk.clips.sdk.drafts.api.ClipsDraftDirType;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraft;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraftCommonData;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraftMusicInfo;
import com.vk.dto.clips.model.ClipsEditorInputVideoItem;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: ClipsDraftFilesController.kt */
/* loaded from: classes17.dex */
public final class qsd {
    public final mtd a;
    public final xke b;

    /* compiled from: ClipsDraftFilesController.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipsDraftDirType.values().length];
            try {
                iArr[ClipsDraftDirType.PREVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipsDraftDirType.AUDIO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipsDraftDirType.VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public qsd(mtd mtdVar, xke xkeVar) {
        this.a = mtdVar;
        this.b = xkeVar;
    }

    public static File b(qsd qsdVar, File file, File file2) {
        qsdVar.getClass();
        File c = c(file, file2);
        if (c != null) {
            return c;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(UUID.randomUUID());
        sb.append('_');
        sb.append(System.currentTimeMillis());
        File file3 = new File(file2, sb.toString());
        cbr cbrVar = cbr.a;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        cbrVar.getClass();
        if (cbr.d(context, file, file3)) {
            return file3;
        }
        return null;
    }

    public static File c(File file, File file2) {
        File[] listFiles = file2.listFiles();
        if (listFiles == null) {
            return null;
        }
        for (File file3 : listFiles) {
            cbr.a.getClass();
            if (cbr.a(file3, file)) {
                return file3;
            }
        }
        return null;
    }

    public final void a(ClipsDraft clipsDraft, ClearDraftMode clearDraftMode) {
        Uri g;
        String path;
        ClipsDraftCommonData clipsDraftCommonData = clipsDraft.b;
        if (clearDraftMode == ClearDraftMode.NONE) {
            return;
        }
        for (ClipsEditorInputVideoItem clipsEditorInputVideoItem : clipsDraftCommonData.d) {
            vhk0.b(clipsEditorInputVideoItem.b);
            File file = clipsEditorInputVideoItem.g;
            if (file != null) {
                vhk0.b(file);
            }
        }
        if (clearDraftMode == ClearDraftMode.CLEAN_ALL) {
            String str = clipsDraftCommonData.j;
            if (str != null && (g = jeq0.g(str)) != null && (path = g.getPath()) != null) {
                File file2 = new File(path);
                if (brm0.B(file2.getAbsolutePath(), this.a.a().b().getAbsolutePath(), false)) {
                    vhk0.b(file2);
                }
            }
            List<? extends List<ClipsDraftMusicInfo>> list = clipsDraftCommonData.l;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((List) it.next()).iterator();
                    while (it2.hasNext()) {
                        vhk0.c(((ClipsDraftMusicInfo) it2.next()).b.g);
                    }
                }
            }
        }
    }
}
