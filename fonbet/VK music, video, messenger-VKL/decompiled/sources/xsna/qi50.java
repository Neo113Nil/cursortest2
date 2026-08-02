package xsna;

import android.content.Context;
import com.vk.clips.design.view.component.audio.ClipsAudioToggle;
import kotlin.NoWhenBranchMatchedException;
import xsna.ti50;

/* compiled from: MuteRenderDelegate.kt */
/* loaded from: classes17.dex */
public final class qi50 {
    public final ClipsAudioToggle a;
    public ti50 b;

    public qi50(ClipsAudioToggle clipsAudioToggle) {
        this.a = clipsAudioToggle;
    }

    public final void a(ti50 ti50Var, boolean z) {
        ClipsAudioToggle clipsAudioToggle = this.a;
        if (clipsAudioToggle == null || ti50Var.equals(this.b)) {
            return;
        }
        if (ti50Var instanceof ti50.a) {
            f4m.j(clipsAudioToggle);
        } else {
            if (!(ti50Var instanceof ti50.b)) {
                throw new NoWhenBranchMatchedException();
            }
            ti50.b bVar = (ti50.b) ti50Var;
            clipsAudioToggle.setVisibility(0);
            Context context = clipsAudioToggle.getContext();
            if (context != null) {
                String string = context.getString(bVar.a);
                ClipsAudioToggle.a c0566a = bVar.b ? new ClipsAudioToggle.a.C0566a(string) : new ClipsAudioToggle.a.b(string);
                clipsAudioToggle.setContentDescription(c0566a.getContentDescription());
                int a = c0566a.a();
                if (clipsAudioToggle.p != a) {
                    clipsAudioToggle.p = a;
                    clipsAudioToggle.setAnimation(a);
                    if (z) {
                        clipsAudioToggle.m0();
                    } else {
                        clipsAudioToggle.setProgress(1.0f);
                    }
                }
            }
        }
        this.b = ti50Var;
    }
}
