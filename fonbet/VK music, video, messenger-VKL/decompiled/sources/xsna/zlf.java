package xsna;

import android.util.SparseArray;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.clips.upload.model.ClipUploadData;
import com.vk.clips.upload.vk.impl.uploader.ClipsPersistentStore;
import com.vk.dto.common.ClipVideoFile;
import com.vk.log.L;
import com.vk.superapp.browser.utils.VkUiUploadFailureType;
import java.util.List;
import kotlin.Pair;

/* compiled from: ClipsUploadsInteractorImpl.kt */
/* loaded from: classes.dex */
public final class zlf implements ylf {
    @Override // xsna.ylf
    public final void a(ClipUploadData clipUploadData) {
        com.vk.clips.upload.vk.impl.uploader.c cVar = com.vk.clips.upload.vk.impl.uploader.c.a;
        ClipsDraftPersistentStore.b.getClass();
        ClipsDraftVk k = ClipsDraftPersistentStore.k();
        cVar.getClass();
        ((com.vk.clips.upload.vk.impl.uploader.e) com.vk.clips.upload.vk.impl.uploader.c.i.getValue()).b(clipUploadData, k);
        ClipsDraftPersistentStore.p(false);
        ClipsDraftPersistentStore.s();
    }

    @Override // xsna.ylf
    public final io.reactivex.rxjava3.core.q<List<Pair<ClipVideoFile, eed>>> b() {
        com.vk.clips.upload.vk.impl.uploader.c.a.getClass();
        com.vk.clips.upload.vk.impl.uploader.c.d();
        io.reactivex.rxjava3.internal.operators.observable.y yVar = new io.reactivex.rxjava3.internal.operators.observable.y(ysg0.b.a.b0(eed.class), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
        io.reactivex.rxjava3.internal.operators.observable.s0 s0Var = new io.reactivex.rxjava3.internal.operators.observable.s0(new udf());
        final vdf vdfVar = new vdf();
        return io.reactivex.rxjava3.core.q.m(yVar, s0Var, new io.reactivex.rxjava3.functions.c() { // from class: xsna.wdf
            @Override // io.reactivex.rxjava3.functions.c
            public final Object apply(Object obj, Object obj2) {
                return (List) vdf.this.invoke(obj, obj2);
            }
        });
    }

    @Override // xsna.ylf
    public final void c(ClipUploadData clipUploadData) {
        com.vk.clips.upload.vk.impl.uploader.c.a.getClass();
        ((com.vk.clips.upload.vk.impl.uploader.e) com.vk.clips.upload.vk.impl.uploader.c.i.getValue()).a(clipUploadData);
    }

    @Override // xsna.ylf
    public final void d(int i, String str) {
        com.vk.clips.upload.vk.impl.uploader.c.a.getClass();
        SparseArray<xdd> sparseArray = com.vk.clips.upload.vk.impl.uploader.c.d;
        xdd xddVar = sparseArray.get(i);
        if (xddVar == null) {
            return;
        }
        synchronized (xddVar) {
            try {
                com.vk.upload.impl.a.b(i, str);
                com.vk.clips.upload.vk.impl.uploader.c.c.remove(i);
                xdd xddVar2 = sparseArray.get(i);
                if (xddVar2 == null) {
                    return;
                }
                xddVar2.j(true);
                ClipsPersistentStore.PersistedUpload c = com.vk.clips.upload.vk.impl.uploader.c.e.c(xddVar2.a());
                if (c != null) {
                    asu0.a.getClass();
                    asu0.n().submit(new or4(c, 2));
                }
                sparseArray.remove(i);
                ysg0.b.a(new aed(xddVar2));
                a86 a86Var = new a86(VkUiUploadFailureType.DELETED, 4);
                Integer C = xddVar2.d().Ab().C();
                String Z = xddVar2.d().Ab().Z();
                if (C != null && Z != null) {
                    a86Var.invoke(Long.valueOf(C.intValue()), Z);
                }
                asu0.a.getClass();
                asu0.n().submit(new hv1(xddVar2, 2));
                L.e("ClipsController", "upload " + i + " deleted");
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.ylf
    public final void e(xdd xddVar) {
        com.vk.clips.upload.vk.impl.uploader.c.a.getClass();
        com.vk.clips.upload.vk.impl.uploader.c.i(xddVar);
    }

    @Override // xsna.ylf
    public final void f(xdd xddVar, String str) {
        com.vk.clips.upload.vk.impl.uploader.c.a.getClass();
        com.vk.clips.upload.vk.impl.uploader.c.a(xddVar, str);
    }

    @Override // xsna.ylf
    public final io.reactivex.rxjava3.internal.operators.single.v g() {
        com.vk.clips.upload.vk.impl.uploader.c.a.getClass();
        com.vk.clips.upload.vk.impl.uploader.c.d();
        return new io.reactivex.rxjava3.internal.operators.single.v(new aef(0));
    }
}
