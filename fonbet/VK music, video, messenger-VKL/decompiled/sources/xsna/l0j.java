package xsna;

import android.view.View;
import com.vk.core.view.components.search.VkSearchView;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.gm50;
import xsna.i1j;
import xsna.m1j;

/* compiled from: ConfigureRoomParticipantsDialog.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class l0j extends FunctionReferenceImpl implements izs<m1j.d, s3q0> {
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final s3q0 invoke(m1j.d dVar) {
        i1j i1jVar = (i1j) this.receiver;
        i1jVar.getClass();
        i1jVar.b(i1j.a.LOADING);
        gm50.a.a(i1jVar, dVar.a, new f1j(i1jVar, 0));
        bwt0.p0((View) i1jVar.g.getValue(), false);
        bwt0.p0(i1jVar.a(), false);
        bwt0.p0((VkSearchView) i1jVar.p.getValue(), false);
        bwt0.p0((View) i1jVar.o.getValue(), false);
        bwt0.p0((View) i1jVar.l.getValue(), false);
        bwt0.p0((View) i1jVar.q.getValue(), false);
        bwt0.p0((View) i1jVar.i.getValue(), false);
        bwt0.p0((View) i1jVar.f.getValue(), true);
        return s3q0.a;
    }
}
