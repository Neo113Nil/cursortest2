package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.editor.state.model.ClipsEditorAudioItem;
import com.vk.clips.editor.state.model.FragmentType;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.wzd;

/* compiled from: ClipsEditorAudioShiftingDelegateImpl.kt */
/* loaded from: classes16.dex */
public final class wwd implements vwd {
    public final c9d a;
    public final wo4 b;
    public final hwd c;
    public final r0e d;
    public final szd e;
    public String f;

    public wwd(c9d c9dVar, wo4 wo4Var, hwd hwdVar, r0e r0eVar, szd szdVar) {
        this.a = c9dVar;
        this.b = wo4Var;
        this.c = hwdVar;
        this.d = r0eVar;
        this.e = szdVar;
    }

    @Override // xsna.vwd
    public final void b() {
        this.a.d(true);
        this.d.c(true);
    }

    @Override // xsna.vwd
    public final void c(y3o0 y3o0Var) {
        ClipsEditorAudioItem a;
        String str = y3o0Var.a;
        FragmentType.a aVar = FragmentType.Companion;
        String str2 = y3o0Var.b;
        aVar.getClass();
        FragmentType a2 = FragmentType.a.a(str2);
        if (a2 == null) {
            return;
        }
        boolean z = a2 == FragmentType.LICENSED_MUSIC;
        wo4 wo4Var = this.b;
        com.vk.clips.editor.state.model.a b = wo4Var.a.b();
        if (b != null && (a = b.a(str)) != null) {
            EmptyList emptyList = EmptyList.b;
            szd szdVar = wo4Var.a;
            if (szdVar.o.a.a(str) != null) {
                if (z) {
                    szdVar.c(com.vk.clips.editor.state.model.a.c(szdVar.o.a, null, null, a, null, null, null, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE), emptyList);
                } else {
                    String str3 = a.f;
                    com.vk.clips.editor.state.model.a aVar2 = szdVar.o.a;
                    szdVar.c(com.vk.clips.editor.state.model.a.c(aVar2, null, null, null, l4p.d(aVar2.e, str3, a), null, null, 111), emptyList);
                }
            }
        }
        this.d.c(false);
        if (epx.f(this.f, str)) {
            this.e.d(false);
            this.f = null;
        }
    }

    @Override // xsna.vwd
    public final void d(y3o0 y3o0Var) {
        FragmentType.a aVar = FragmentType.Companion;
        String str = y3o0Var.b;
        aVar.getClass();
        FragmentType a = FragmentType.a.a(str);
        if (a == null) {
            return;
        }
        String str2 = y3o0Var.a;
        this.a.d(true);
        boolean z = a == FragmentType.LICENSED_MUSIC;
        wo4 wo4Var = this.b;
        szd szdVar = wo4Var.a;
        com.vk.clips.editor.state.model.a b = szdVar.b();
        ClipsEditorAudioItem a2 = b != null ? b.a(str2) : null;
        ClipsEditorAudioItem a3 = szdVar.o.a.a(str2);
        if (a3 != null && !a3.equals(a2)) {
            List<? extends wzd> singletonList = Collections.singletonList(new wzd.a(true, (luc) tuc.a));
            szd szdVar2 = wo4Var.a;
            if (szdVar2.o.a.a(str2) != null) {
                if (z) {
                    szdVar2.c(com.vk.clips.editor.state.model.a.c(szdVar2.o.a, null, null, a3, null, null, null, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE), singletonList);
                } else {
                    String str3 = a3.f;
                    com.vk.clips.editor.state.model.a aVar2 = szdVar2.o.a;
                    szdVar2.c(com.vk.clips.editor.state.model.a.c(aVar2, null, null, null, l4p.d(aVar2.e, str3, a3), null, null, 111), singletonList);
                }
            }
        }
        this.d.c(false);
        this.f = null;
    }

    @Override // xsna.vwd
    public final void e() {
        this.c.h();
    }

    @Override // xsna.vwd
    public final void i(y3o0 y3o0Var, final long j, final long j2) {
        FragmentType.a aVar = FragmentType.Companion;
        String str = y3o0Var.b;
        aVar.getClass();
        FragmentType a = FragmentType.a.a(str);
        if (a == null) {
            return;
        }
        String str2 = y3o0Var.a;
        this.a.d(true);
        boolean z = a == FragmentType.LICENSED_MUSIC;
        wo4 wo4Var = this.b;
        wo4Var.getClass();
        wo4Var.d(str2, z, EmptyList.b, new izs() { // from class: xsna.vo4
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                ClipsEditorAudioItem clipsEditorAudioItem = (ClipsEditorAudioItem) obj;
                return ClipsEditorAudioItem.a(clipsEditorAudioItem, ClipsEditorMusicInfo.zb(clipsEditorAudioItem.a, null, null, (int) j, (int) j2, 0, null, 0, 2035), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 30);
            }
        });
    }

    @Override // xsna.vwd
    public final void j(String str) {
        this.f = str;
    }
}
