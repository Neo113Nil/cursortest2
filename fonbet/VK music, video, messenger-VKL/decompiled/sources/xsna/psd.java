package xsna;

import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: ClipsDraftFilesClearer.kt */
/* loaded from: classes14.dex */
public final class psd implements w8i {
    public final com.vk.movika.sdk.base.model.props.d b;

    public psd(com.vk.movika.sdk.base.model.props.d dVar) {
        this.b = dVar;
    }

    public static HashSet b() {
        PrivateFiles.a b;
        HashSet hashSet = new HashSet();
        List l = e43.l(PrivateSubdir.CLIPS_VIDEO, PrivateSubdir.CLIPS_PREVIEW, PrivateSubdir.CLIPS_AUDIO, PrivateSubdir.CLIPS_CAMERA);
        ArrayList arrayList = new ArrayList(c5g.u(l, 10));
        Iterator it = l.iterator();
        while (it.hasNext()) {
            b = e8r.a.b(r3, ((PrivateSubdir) it.next()).h(), true);
            arrayList.add(b.a);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            File[] listFiles = ((File) it2.next()).listFiles();
            if (listFiles == null) {
                listFiles = new File[0];
            }
            g5g.A(hashSet, listFiles);
        }
        return hashSet;
    }

    public final void a() {
        asu0.a.getClass();
        asu0.n().submit(new sj1(this, 4));
    }
}
