package xsna;

import com.vk.clips.editor.state.model.ClipsEditorAudioItem;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.kuc;

/* compiled from: SingleFragmentModificationDelegate.kt */
/* loaded from: classes16.dex */
public final class guj0 {
    public final x8d a;
    public final rzd b;
    public huj0 c;
    public kyd d;
    public kyd e;

    /* compiled from: SingleFragmentModificationDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipsEditorAudioItem.Type.values().length];
            try {
                iArr[ClipsEditorAudioItem.Type.LICENSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipsEditorAudioItem.Type.EXTRACTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipsEditorAudioItem.Type.VOICEOVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public guj0(c9d c9dVar, rzd rzdVar) {
        this.a = c9dVar;
        this.b = rzdVar;
    }

    public static com.vk.clips.editor.state.model.a c(com.vk.clips.editor.state.model.a aVar, kyd kydVar) {
        if (!(kydVar instanceof com.vk.clips.editor.state.model.c)) {
            if (kydVar instanceof ClipsEditorAudioItem) {
                ClipsEditorAudioItem clipsEditorAudioItem = aVar.d;
                ClipsEditorAudioItem clipsEditorAudioItem2 = (ClipsEditorAudioItem) kydVar;
                return epx.f(clipsEditorAudioItem != null ? clipsEditorAudioItem.f : null, clipsEditorAudioItem2.f) ? com.vk.clips.editor.state.model.a.c(aVar, null, null, clipsEditorAudioItem2, null, null, null, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) : com.vk.clips.editor.state.model.a.c(aVar, null, null, null, l4p.d(aVar.e, clipsEditorAudioItem2.f, kydVar), null, null, 111);
            }
            if (kydVar instanceof com.vk.clips.editor.state.model.b) {
                return com.vk.clips.editor.state.model.a.c(aVar, null, null, null, null, l4p.d(aVar.f, ((com.vk.clips.editor.state.model.b) kydVar).a, kydVar), null, 95);
            }
            throw new NoWhenBranchMatchedException();
        }
        List<com.vk.clips.editor.state.model.c> list = aVar.c;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (com.vk.clips.editor.state.model.c cVar : list) {
            com.vk.clips.editor.state.model.c cVar2 = (com.vk.clips.editor.state.model.c) kydVar;
            if (epx.f(cVar.j, cVar2.j)) {
                cVar = cVar2;
            }
            arrayList.add(cVar);
        }
        return com.vk.clips.editor.state.model.a.c(aVar, null, arrayList, null, null, null, null, 123);
    }

    public final void a(izs izsVar, boolean z) {
        kyd kydVar = this.d;
        if (kydVar == null) {
            kydVar = null;
        }
        this.e = (kyd) izsVar.invoke(kydVar);
        com.vk.clips.editor.state.model.a state = this.b.getState();
        kyd kydVar2 = this.e;
        if (kydVar2 == null) {
            kydVar2 = null;
        }
        this.a.c(c(state, kydVar2), null, z);
    }

    public final void b() {
        kyd kydVar = this.e;
        if (kydVar == null) {
            kydVar = null;
        }
        kyd kydVar2 = this.d;
        if (kydVar2 == null) {
            kydVar2 = null;
        }
        if (epx.f(kydVar, kydVar2)) {
            huj0 huj0Var = this.c;
            (huj0Var != null ? huj0Var : null).d();
            return;
        }
        huj0 huj0Var2 = this.c;
        huj0 huj0Var3 = huj0Var2 != null ? huj0Var2 : null;
        jz70 jz70Var = new jz70(this, 22);
        huj0Var3.getClass();
        huj0Var3.f.c(new kuc.b(new wf40(jz70Var, 27), new d2c0(6)));
    }
}
