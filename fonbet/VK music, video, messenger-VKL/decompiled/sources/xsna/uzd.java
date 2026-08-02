package xsna;

import android.content.Context;
import com.vk.clips.editor.state.model.ClipsEditorAudioItem;
import com.vk.dto.clips.media.AudioConfigEditor;
import com.vk.dto.clips.media.VideoConfigEditor;
import com.vk.dto.clips.model.ClipsEditorInputAudioItem;
import com.vk.dto.clips.model.ClipsEditorInputData;
import com.vk.dto.clips.model.ClipsEditorInputVideoItem;
import com.vk.media.MediaUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.fzd;

/* compiled from: ClipsEditorStateMapper.kt */
/* loaded from: classes16.dex */
public final class uzd {
    public static com.vk.clips.editor.state.model.a a(ClipsEditorInputData clipsEditorInputData, ayd aydVar, osd osdVar) {
        nzd nzdVar = new nzd(clipsEditorInputData.g, clipsEditorInputData.h, clipsEditorInputData.i);
        List<ClipsEditorInputVideoItem> list = clipsEditorInputData.b;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b((ClipsEditorInputVideoItem) it.next(), aydVar, osdVar));
        }
        ClipsEditorInputAudioItem clipsEditorInputAudioItem = clipsEditorInputData.c;
        ClipsEditorAudioItem clipsEditorAudioItem = clipsEditorInputAudioItem != null ? new ClipsEditorAudioItem(clipsEditorInputAudioItem.b, clipsEditorInputAudioItem.c, clipsEditorInputAudioItem.e, clipsEditorInputAudioItem.d, false, 16) : null;
        List<List<ClipsEditorInputAudioItem>> list2 = clipsEditorInputData.d;
        ClipsEditorAudioItem clipsEditorAudioItem2 = clipsEditorAudioItem;
        ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            List<ClipsEditorInputAudioItem> list3 = (List) it2.next();
            ArrayList arrayList3 = new ArrayList(c5g.u(list3, 10));
            for (ClipsEditorInputAudioItem clipsEditorInputAudioItem2 : list3) {
                arrayList3.add(new ClipsEditorAudioItem(clipsEditorInputAudioItem2.b, clipsEditorInputAudioItem2.c, clipsEditorInputAudioItem2.e, clipsEditorInputAudioItem2.d, false, 16));
            }
            arrayList2.add(arrayList3);
        }
        return new com.vk.clips.editor.state.model.a(nzdVar, yzd.f, arrayList, clipsEditorAudioItem2, arrayList2, EmptyList.b, new pwd(!arrayList.isEmpty() ? ((com.vk.clips.editor.state.model.c) arrayList.get(0)).d() / ((com.vk.clips.editor.state.model.c) arrayList.get(0)).c() : 0.5625f, clipsEditorInputData.k));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.vk.clips.editor.state.model.c b(ClipsEditorInputVideoItem clipsEditorInputVideoItem, zxd zxdVar, osd osdVar) {
        File file;
        File file2;
        File file3;
        File[] listFiles;
        AudioConfigEditor audioConfigEditor;
        AudioConfigEditor audioConfigEditor2;
        File file4 = clipsEditorInputVideoItem.b;
        File a = zxdVar.a();
        File c = osdVar != null ? osdVar.c() : null;
        if (!brm0.B(file4.getAbsolutePath(), a.getAbsolutePath(), false)) {
            if ((c != null ? c.getAbsolutePath() : null) == null || !brm0.B(file4.getAbsolutePath(), c.getAbsolutePath(), false)) {
                File[] listFiles2 = a.listFiles();
                if (listFiles2 != null) {
                    int length = listFiles2.length;
                    for (int i = 0; i < length; i++) {
                        file = listFiles2[i];
                        cbr.a.getClass();
                        if (cbr.a(file, file4)) {
                            break;
                        }
                    }
                }
                file = null;
                if (c != null && (listFiles = c.listFiles()) != null) {
                    int length2 = listFiles.length;
                    for (int i2 = 0; i2 < length2; i2++) {
                        file2 = listFiles[i2];
                        cbr.a.getClass();
                        if (cbr.a(file2, file4)) {
                            break;
                        }
                    }
                }
                file2 = null;
                if (file == null) {
                    file = file2;
                }
                if (file != null) {
                    file3 = file;
                } else {
                    String uuid = UUID.randomUUID().toString();
                    cbr cbrVar = cbr.a;
                    File a2 = zxdVar.a();
                    cbrVar.getClass();
                    File e = cbr.e(a2, uuid, "mp4");
                    Context context = e43.a;
                    if (context == null) {
                        context = null;
                    }
                    cbr.d(context, file4, e);
                    file3 = e;
                }
                fzd fzdVar = new fzd(null, null, new fzd.a(file3.getPath(), clipsEditorInputVideoItem.c, clipsEditorInputVideoItem.i.b));
                audioConfigEditor = clipsEditorInputVideoItem.o;
                if (audioConfigEditor == null) {
                    audioConfigEditor2 = audioConfigEditor;
                } else {
                    String absolutePath = file3.getAbsolutePath();
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    p490.z(new ga3(absolutePath, 1), new jb5(ref$ObjectRef, 8));
                    MediaUtils.AudioConfig audioConfig = (MediaUtils.AudioConfig) ref$ObjectRef.element;
                    audioConfigEditor2 = audioConfig != null ? new AudioConfigEditor(audioConfig.b, audioConfig.c) : null;
                }
                MediaUtils.f d = MediaUtils.a.d(file3.getAbsolutePath());
                VideoConfigEditor videoConfigEditor = d != null ? new VideoConfigEditor(d.a, d.b, d.c, d.d, d.f) : null;
                return new com.vk.clips.editor.state.model.c(file3, clipsEditorInputVideoItem.c, Math.min(clipsEditorInputVideoItem.d, videoConfigEditor == null ? (long) (videoConfigEditor.f / clipsEditorInputVideoItem.k) : Long.MAX_VALUE), clipsEditorInputVideoItem.e, clipsEditorInputVideoItem.f, clipsEditorInputVideoItem.g, clipsEditorInputVideoItem.h, clipsEditorInputVideoItem.i, clipsEditorInputVideoItem.j, UUID.randomUUID().toString(), clipsEditorInputVideoItem.l, clipsEditorInputVideoItem.m, clipsEditorInputVideoItem.n, audioConfigEditor2, videoConfigEditor, clipsEditorInputVideoItem.q, fzdVar, clipsEditorInputVideoItem.r, clipsEditorInputVideoItem.k);
            }
        }
        file3 = file4;
        fzd fzdVar2 = new fzd(null, null, new fzd.a(file3.getPath(), clipsEditorInputVideoItem.c, clipsEditorInputVideoItem.i.b));
        audioConfigEditor = clipsEditorInputVideoItem.o;
        if (audioConfigEditor == null) {
        }
        MediaUtils.f d2 = MediaUtils.a.d(file3.getAbsolutePath());
        if (d2 != null) {
        }
        return new com.vk.clips.editor.state.model.c(file3, clipsEditorInputVideoItem.c, Math.min(clipsEditorInputVideoItem.d, videoConfigEditor == null ? (long) (videoConfigEditor.f / clipsEditorInputVideoItem.k) : Long.MAX_VALUE), clipsEditorInputVideoItem.e, clipsEditorInputVideoItem.f, clipsEditorInputVideoItem.g, clipsEditorInputVideoItem.h, clipsEditorInputVideoItem.i, clipsEditorInputVideoItem.j, UUID.randomUUID().toString(), clipsEditorInputVideoItem.l, clipsEditorInputVideoItem.m, clipsEditorInputVideoItem.n, audioConfigEditor2, videoConfigEditor, clipsEditorInputVideoItem.q, fzdVar2, clipsEditorInputVideoItem.r, clipsEditorInputVideoItem.k);
    }
}
