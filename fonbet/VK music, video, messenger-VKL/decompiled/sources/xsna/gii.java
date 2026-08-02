package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import io.requery.android.database.sqlite.SQLiteStatement;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class gii implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ gii(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1020379228, intValue, -1, "com.vk.music.playlist.display.presentation.ComposableSingletons$MusicPlaylistListContentKt.lambda$1020379228.<anonymous> (MusicPlaylistListContent.kt:191)");
                    }
                    if (a690.d(q630.a.a, tab0.d, aVar, 6)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                rdi.m((SQLiteStatement) obj, ((Integer) obj3).intValue(), ((com.vk.im.engine.models.dialogs.b) obj2).T);
                return s3q0.a;
            default:
                q630 q630Var = (q630) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                aVar2.K(-382653760);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-382653760, intValue2, -1, "com.vk.catalog.mvi.section.ui.view.reorder.dragActivator.<anonymous> (DragAndDropReorder.kt:166)");
                }
                wfo wfoVar = (wfo) aVar2.r(sfo.a);
                nfu nfuVar = (nfu) aVar2.r(sfo.b);
                Object r = aVar2.r(sfo.c);
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (wfoVar != null && r != null) {
                    aVar2.K(-794662881);
                    boolean y = aVar2.y(wfoVar) | aVar2.y(r);
                    Object x = aVar2.x();
                    if (y || x == c0012a) {
                        x = new qfo(wfoVar, r);
                        aVar2.R(x);
                    }
                    q630Var = skn0.b(q630Var, wfoVar, (PointerInputEventHandler) x);
                    aVar2.j();
                } else if (nfuVar == null || r == null) {
                    aVar2.K(1636973892);
                    aVar2.j();
                } else {
                    aVar2.K(-794013493);
                    boolean y2 = aVar2.y(nfuVar) | aVar2.y(r);
                    Object x2 = aVar2.x();
                    if (y2 || x2 == c0012a) {
                        x2 = new rfo(nfuVar, r);
                        aVar2.R(x2);
                    }
                    q630Var = skn0.b(q630Var, nfuVar, (PointerInputEventHandler) x2);
                    aVar2.j();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2.j();
                return q630Var;
        }
    }
}
