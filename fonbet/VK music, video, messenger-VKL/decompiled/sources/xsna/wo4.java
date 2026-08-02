package xsna;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.editor.state.model.ClipsEditorAudioItem;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import com.vk.editor.timeline.api.YIndexShift;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.luc;
import xsna.wzd;

/* compiled from: AudioFragmentActionsHandler.kt */
/* loaded from: classes16.dex */
public final class wo4 {
    public final szd a;
    public final com.vk.clips.editor.base.api.b b;
    public final hwd c;

    /* compiled from: AudioFragmentActionsHandler.kt */
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

    public wo4(szd szdVar, com.vk.clips.editor.base.api.b bVar, hwd hwdVar) {
        this.a = szdVar;
        this.b = bVar;
        this.c = hwdVar;
    }

    public final void a(String str, Long l, YIndexShift yIndexShift, boolean z) {
        ClipsEditorAudioItem a2;
        if (z) {
            d(str, z, Collections.singletonList(new wzd.a(luc.f.a, 1)), new com.vk.movika.sdk.base.hooks.p(l, 9));
            return;
        }
        if (z || (a2 = this.a.o.a.a(str)) == null) {
            return;
        }
        if (yIndexShift == null) {
            e(a2, l.longValue(), true);
            return;
        }
        e(a2, l.longValue(), false);
        List<? extends wzd> singletonList = Collections.singletonList(new wzd.a(true, (luc) luc.f.a));
        String str2 = a2.f;
        int i = yIndexShift.a;
        boolean z2 = yIndexShift.b == YIndexShift.Mode.MIDDLE;
        szd szdVar = this.a;
        szdVar.c(com.vk.clips.editor.state.model.a.c(szdVar.o.a, null, null, null, l4p.c(i, str2, z2, szdVar.o.a.e), null, null, 111), singletonList);
    }

    public final void b(String str, final long j, final long j2, final Long l, boolean z) {
        d(str, z, Collections.singletonList(new wzd.a(luc.h.a, 1)), new izs() { // from class: xsna.uo4
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                ClipsEditorAudioItem clipsEditorAudioItem = (ClipsEditorAudioItem) obj;
                return ClipsEditorAudioItem.a(clipsEditorAudioItem, ClipsEditorMusicInfo.zb(clipsEditorAudioItem.a, null, null, (int) j, (int) j2, (int) l.longValue(), null, 0, 2019), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 30);
            }
        });
        ClipsEditorAudioItem a2 = this.a.o.a.a(str);
        if (a2 != null && Math.abs(a2.b() - (j2 - j)) < 20 && a2.d() == ClipsEditorAudioItem.Type.LICENSED) {
            String str2 = a2.f;
            this.c.f(a2.b(), str2);
        }
    }

    public final void c(String str, boolean z) {
        luc lucVar;
        szd szdVar = this.a;
        ClipsEditorAudioItem a2 = szdVar.o.a.a(str);
        if (a2 == null) {
            return;
        }
        int i = a.$EnumSwitchMapping$0[a2.d().ordinal()];
        if (i == 1) {
            lucVar = uuc.a;
        } else if (i == 2) {
            lucVar = nuc.a;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            lucVar = fvc.a;
        }
        wzd.a aVar = new wzd.a(lucVar, 1);
        if (!z) {
            vzd.a(szdVar, str, Collections.singletonList(aVar));
        } else {
            szdVar.c(com.vk.clips.editor.state.model.a.c(szdVar.o.a, null, null, null, null, null, null, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE), Collections.singletonList(aVar));
        }
    }

    public final void d(String str, boolean z, List<? extends wzd> list, izs<? super ClipsEditorAudioItem, ClipsEditorAudioItem> izsVar) {
        szd szdVar = this.a;
        ClipsEditorAudioItem a2 = szdVar.o.a.a(str);
        if (a2 == null) {
            return;
        }
        ClipsEditorAudioItem invoke = izsVar.invoke(a2);
        if (z) {
            szdVar.c(com.vk.clips.editor.state.model.a.c(szdVar.o.a, null, null, invoke, null, null, null, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE), list);
            return;
        }
        String str2 = invoke.f;
        com.vk.clips.editor.state.model.a aVar = szdVar.o.a;
        szdVar.c(com.vk.clips.editor.state.model.a.c(aVar, null, null, null, l4p.d(aVar.e, str2, invoke), null, null, 111), list);
    }

    public final void e(ClipsEditorAudioItem clipsEditorAudioItem, long j, boolean z) {
        List<? extends wzd> singletonList = z ? Collections.singletonList(new wzd.a(luc.f.a, 1)) : EmptyList.b;
        String str = clipsEditorAudioItem.f;
        ClipsEditorAudioItem a2 = ClipsEditorAudioItem.a(clipsEditorAudioItem, ClipsEditorMusicInfo.zb(clipsEditorAudioItem.a, null, null, 0, 0, (int) j, null, 0, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 30);
        szd szdVar = this.a;
        com.vk.clips.editor.state.model.a aVar = szdVar.o.a;
        szdVar.c(com.vk.clips.editor.state.model.a.c(aVar, null, null, null, l4p.d(aVar.e, str, a2), null, null, 111), singletonList);
    }
}
