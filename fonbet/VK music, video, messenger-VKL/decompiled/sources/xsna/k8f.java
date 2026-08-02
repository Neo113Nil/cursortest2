package xsna;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import com.vk.clips.editor.templates.impl.domain.ClipsTemplateEditorVideoItem;
import com.vk.media.MediaUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: ClipsTemplateEditorStateHandlerImpl.kt */
/* loaded from: classes16.dex */
public final class k8f {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [T, android.graphics.Bitmap] */
    public final io.reactivex.rxjava3.internal.operators.single.x a(z7f z7fVar, Set set) {
        List<n7f> list = z7fVar.d;
        Iterator it = set.iterator();
        while (true) {
            z7f z7fVar2 = z7fVar;
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (intValue < list.size() && list.get(intValue).c != null) {
                    n7f n7fVar = list.get(intValue);
                    ClipsTemplateEditorVideoItem clipsTemplateEditorVideoItem = n7fVar.c;
                    if (n7fVar.d != null) {
                        q500 q500Var = new q500(clipsTemplateEditorVideoItem.f, clipsTemplateEditorVideoItem.g);
                        Long l = n7fVar.e;
                        if (l != null && q500Var.f(l.longValue())) {
                        }
                    }
                    long j = clipsTemplateEditorVideoItem.f + 10;
                    String str = clipsTemplateEditorVideoItem.b;
                    MediaUtils.d dVar = new MediaUtils.d(iah0.a(48), iah0.a(64));
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    try {
                        mediaMetadataRetriever.setDataSource(str);
                        ref$ObjectRef.element = MediaUtils.a.i(j, mediaMetadataRetriever, dVar);
                        s3q0 s3q0Var = s3q0.a;
                    } catch (Exception unused) {
                    } catch (Throwable th) {
                        mediaMetadataRetriever.release();
                        throw th;
                    }
                    mediaMetadataRetriever.release();
                    z7fVar = z7f.a(z7fVar2, rdi.I(intValue, n7f.a(n7fVar, null, (Bitmap) ref$ObjectRef.element, Long.valueOf(j), 7), z7fVar2.d), null, null, null, 503);
                }
            }
            return io.reactivex.rxjava3.core.x.k(z7fVar2);
        }
    }

    public final io.reactivex.rxjava3.internal.operators.single.x b(z7f z7fVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<n7f> list = z7fVar.d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((n7f) obj).c != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            n7f n7fVar = (n7f) it.next();
            yds0 d = n7fVar.c.d();
            linkedHashMap.put(Integer.valueOf(System.identityHashCode(d)), n7fVar);
            arrayList2.add(d);
        }
        return io.reactivex.rxjava3.core.x.k(new Pair(z7f.a(z7fVar, null, null, null, linkedHashMap, 415), arrayList2));
    }
}
