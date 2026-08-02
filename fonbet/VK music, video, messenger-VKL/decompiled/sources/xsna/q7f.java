package xsna;

import android.view.View;
import com.vk.clips.design.view.templates.ClipsTemplateEditorFragmentsBottomView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class q7f implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ View d;

    public /* synthetic */ q7f(int i, long j, View view) {
        this.b = i;
        this.d = view;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ClipsTemplateEditorFragmentsBottomView.a((ClipsTemplateEditorFragmentsBottomView) this.d, this.c);
                break;
            default:
                com.vk.clips.editor.templates.impl.player.a.g((com.vk.clips.editor.templates.impl.player.a) this.d, this.c);
                break;
        }
    }
}
