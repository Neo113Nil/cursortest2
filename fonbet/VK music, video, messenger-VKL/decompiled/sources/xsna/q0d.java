package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import kotlin.collections.EmptySet;
import xsna.k2d;
import xsna.z2d;

/* compiled from: ClipItemDefaultOverlayRenderFactory.kt */
/* loaded from: classes17.dex */
public final class q0d implements g2d {
    public final k2d a;
    public final f1d b;
    public final com.vk.clips.sdk.shared.item.common.restriction.a c;
    public final com.vk.clips.sdk.shared.item.common.error.a d;
    public final u1d e;
    public final a3d f;

    public q0d(njd njdVar, jlh0 jlh0Var, ClipFeedTab clipFeedTab, xne xneVar, yof yofVar, lf00 lf00Var, qnd qndVar) {
        k2d k2dVar = new k2d();
        k2dVar.b = EmptySet.b;
        this.a = k2dVar;
        this.b = new f1d(njdVar, jlh0Var, clipFeedTab, xneVar, yofVar, lf00Var, qndVar);
        this.c = new com.vk.clips.sdk.shared.item.common.restriction.a();
        this.d = new com.vk.clips.sdk.shared.item.common.error.a();
        this.e = new u1d();
        this.f = new a3d();
    }

    @Override // xsna.g2d
    public final i390 a(z2d.a aVar) {
        m390 m390Var = new m390(aVar);
        m0d m0dVar = aVar.b;
        String str = m0dVar.b;
        SdkClipVideoFile sdkClipVideoFile = m0dVar.a;
        k2d k2dVar = this.a;
        k2dVar.getClass();
        String str2 = m390Var.a.b;
        k2d.a aVar2 = k2d.a.MainOverlay;
        boolean a = k2dVar.a(aVar2, m390Var);
        k2d.a aVar3 = k2d.a.RestrictionOverlay;
        boolean a2 = k2dVar.a(aVar3, m390Var);
        k2d.a aVar4 = k2d.a.ErrorOverlay;
        boolean a3 = k2dVar.a(aVar4, m390Var);
        boolean a4 = k2dVar.a(k2d.a.SeekBar, m390Var);
        boolean a5 = k2dVar.a(k2d.a.UnfocusedBlackout, m390Var);
        k2d.a aVar5 = k2d.a.Subtitles;
        boolean a6 = k2dVar.a(aVar5, m390Var);
        k2d.a aVar6 = k2d.a.NpsOverlay;
        q390 q390Var = new q390(str2, a4, a, a2, a3, a5, a6, k2dVar.a(aVar6, m390Var));
        boolean a7 = k2dVar.a(aVar2, m390Var);
        j4b0 j4b0Var = aVar.n;
        umc umcVar = aVar.i;
        return new i390(q390Var, this.b.a(new mf00(a7, m0dVar, j4b0Var, aVar.g, aVar.h, umcVar, aVar.j, aVar.k, aVar.l, aVar.m, aVar.o, aVar.s, aVar.t, aVar.v, aVar.x, aVar.z, aVar.A)), this.c.a(new bdg0(k2dVar.a(aVar3, m390Var), str, sdkClipVideoFile.O())), this.d.a(new iwp(k2dVar.a(aVar4, m390Var), str, aVar.r)), this.e.a(new am70(k2dVar.a(aVar6, m390Var), str, m0dVar.g, aVar.v)), this.f.a(new k1n0(str, aVar.s, k2dVar.a(aVar5, m390Var))));
    }
}
