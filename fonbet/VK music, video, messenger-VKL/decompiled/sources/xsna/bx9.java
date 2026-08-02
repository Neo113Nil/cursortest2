package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetTemplateExtendedResponseDto;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.mvp.holder.container.ShowAllListVh;
import com.vk.catalog2.common.ui.mvp.holder.header.ToolbarVh;
import com.vk.clips.editor.templates.api.di.ClipsTemplatesEditorComponent;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridDraftsListFragment;
import com.vk.dto.common.clips.ClipAudioTemplate;
import com.vk.dto.market.catalog.CatalogMarketStatusOption;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.toggle.b;
import com.vk.toggle.internal.ToggleManager;
import java.util.HashSet;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.sga;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class bx9 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ bx9(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                izs izsVar = (izs) this.c;
                String str = (String) this.d;
                String str2 = (String) this.e;
                gzs gzsVar = (gzs) this.f;
                tgi0 tgi0Var = (tgi0) obj;
                izsVar.invoke(tgi0Var);
                qgi0.n(tgi0Var, 0);
                qgi0.h(tgi0Var, str);
                qgi0.e(tgi0Var, str2, new cx9(0, gzsVar));
                return s3q0.a;
            case 1:
                sga sgaVar = (sga) this.d;
                rga rgaVar = (rga) this.e;
                izs<? super yda, s3q0> izsVar2 = (izs) this.c;
                ksr ksrVar = (ksr) this.f;
                nvy nvyVar = (nvy) obj;
                if (sgaVar instanceof sga.a) {
                    sga.a aVar = (sga.a) sgaVar;
                    rgaVar.a(nvyVar, aVar, izsVar2, ksrVar);
                    sga.e eVar = aVar.h;
                    if (eVar instanceof sga.c) {
                        rgaVar.d(nvyVar, (sga.c) eVar, false, izsVar2);
                    } else if (epx.f(eVar, sga.d.b)) {
                        rgaVar.e(nvyVar, false);
                    } else if (eVar != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (sgaVar instanceof sga.c) {
                    rgaVar.d(nvyVar, (sga.c) sgaVar, true, izsVar2);
                } else if (epx.f(sgaVar, sga.d.b)) {
                    rgaVar.e(nvyVar, true);
                } else if (!(sgaVar instanceof sga.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                return s3q0.a;
            case 2:
                ClipsGridDraftsListFragment clipsGridDraftsListFragment = (ClipsGridDraftsListFragment) this.c;
                v8f v8fVar = (v8f) this.d;
                ClipAudioTemplate clipAudioTemplate = (ClipAudioTemplate) this.e;
                tce tceVar = (tce) this.f;
                int i = ClipsGridDraftsListFragment.l0;
                ((ClipsTemplatesEditorComponent) clipsGridDraftsListFragment.h0.getValue()).l4().e("ClipsGridDraftsListFragment");
                v8fVar.d(clipsGridDraftsListFragment.requireView(), clipAudioTemplate, (ShortVideoGetTemplateExtendedResponseDto) obj, tceVar.a);
                return s3q0.a;
            case 3:
                vcr vcrVar = (vcr) this.c;
                u9 u9Var = (u9) this.d;
                god0 god0Var = (god0) this.e;
                FragmentActivity fragmentActivity = (FragmentActivity) this.f;
                ((wzk0) vcrVar).f = (CatalogMarketStatusOption) obj;
                u9Var.invoke(vcrVar);
                god0Var.a.g(fragmentActivity);
                return s3q0.a;
            case 4:
                HashSet hashSet = (HashSet) this.c;
                HashSet hashSet2 = (HashSet) this.d;
                Map map = (Map) this.e;
                ToggleManager toggleManager = (ToggleManager) this.f;
                b.d dVar = (b.d) obj;
                if (hashSet.contains(dVar.b.toString()) ? hashSet2.contains(dVar) : dVar.equals(map.get(dVar.b.toString()))) {
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l, L.LogType.d, new Object[]{"Removing user toggle " + dVar});
                    }
                    toggleManager.h.k(dVar.b.toString(), true);
                    toggleManager.i.a.remove(dVar.b.toString());
                    if (toggleManager.q.containsKey(dVar.b.toString())) {
                        toggleManager.q.put(dVar.b.toString(), dVar);
                    }
                }
                return s3q0.a;
            default:
                u4a u4aVar = (u4a) this.c;
                return new ShowAllListVh(u4aVar, (ToolbarVh) this.d, com.vk.catalog2.common.ui.mvp.configuration.a.g0((com.vk.catalog2.common.ui.mvp.configuration.a) this.e, (UIBlock) this.f, u4aVar, (tba) obj, 8), false, false, false, null, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
        }
    }

    public /* synthetic */ bx9(sga sgaVar, rga rgaVar, izs izsVar, ksr ksrVar) {
        this.b = 1;
        this.d = sgaVar;
        this.e = rgaVar;
        this.c = izsVar;
        this.f = ksrVar;
    }
}
