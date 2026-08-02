package xsna;

import android.view.View;
import com.vk.dto.hints.HintId;
import com.vk.libvideo.tooltips.VideoTooltip;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class vkt0 implements gzs {
    public final /* synthetic */ VideoTooltip b;
    public final /* synthetic */ HintId c;
    public final /* synthetic */ VideoTooltip.b d;
    public final /* synthetic */ o7j0 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ VideoTooltip.a g;

    public /* synthetic */ vkt0(VideoTooltip videoTooltip, HintId hintId, VideoTooltip.b bVar, o7j0 o7j0Var, boolean z, VideoTooltip.a aVar) {
        this.b = videoTooltip;
        this.c = hintId;
        this.d = bVar;
        this.e = o7j0Var;
        this.f = z;
        this.g = aVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        VideoTooltip videoTooltip = this.b;
        if (videoTooltip.a.getVisibility() == 0) {
            h7v h7vVar = videoTooltip.c;
            View view = videoTooltip.a;
            o7j0 o7j0Var = this.e;
            VideoTooltip.b bVar = this.d;
            boolean z = this.f;
            VideoTooltip.a aVar = this.g;
            zwp0 zwp0Var = new zwp0(o7j0Var, videoTooltip, bVar, z, aVar);
            h8n0 h8n0Var = new h8n0(aVar, 13);
            int i = VideoTooltip.d.$EnumSwitchMapping$0[bVar.f.ordinal()];
            HintId hintId = this.c;
            if (i == 1) {
                h7vVar.h(view, hintId.getId(), new wkt0(0, videoTooltip, bVar), zwp0Var, h8n0Var);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                h7vVar.j(view, hintId.getId(), zwp0Var, VideoTooltip.a(view, bVar), h8n0Var);
            }
        }
        return s3q0.a;
    }
}
