package xsna;

import com.vk.im.engine.models.ImBgSyncState;
import com.vk.photoeditor.engine.ChronicleException;
import com.vk.photoeditor.engine.PhotoEditorEngine;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class x1w implements io.reactivex.rxjava3.functions.l, PhotoEditorEngine.a, io.reactivex.rxjava3.functions.m {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x1w(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // com.vk.photoeditor.engine.PhotoEditorEngine.a
    public void a(ChronicleException chronicleException) {
        ((com.vk.metrics.eventtracking.b) this.c).a(chronicleException);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (ImBgSyncState) ((p58) this.c).invoke(obj);
            default:
                return (io.reactivex.rxjava3.core.b0) ((fzc0) this.c).invoke(obj);
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return ((Boolean) ((j2u) this.c).invoke(obj)).booleanValue();
    }
}
