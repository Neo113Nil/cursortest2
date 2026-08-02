package xsna;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vk.dto.discover.carousel.apps.AppCarousel;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.im.ui.utils.recyclerview.LinearLayoutManagerScrollHelper;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.gp20;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class cta implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ cta(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        AppCarousel appCarousel;
        switch (this.b) {
            case 0:
                ((gta) this.c).e((StoryEntry) this.d, StoryPrivacyType.ALL, (po6) this.e);
                return s3q0.a;
            case 1:
                smq.f(((yah) this.c).e, (Context) this.d, (Narrative) this.e, null, null, null, false, null, null, IronSourceError.ERROR_CODE_INIT_FAILED);
                return s3q0.a;
            case 2:
                yq20 yq20Var = (yq20) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                gp20.a aVar = (gp20.a) this.e;
                nbf0 nbf0Var = yq20Var.G;
                if (nbf0Var != null) {
                    nbf0Var.c = null;
                }
                yq20Var.K.submitList(arrayList);
                yq20.b7(aVar.a.f);
                vq20 vq20Var = (vq20) yq20Var.C;
                if (vq20Var != null && (appCarousel = vq20Var.i) != null) {
                    ((NewsFeedComponent) yq20Var.F.getValue()).w().e(148, appCarousel);
                }
                return s3q0.a;
            default:
                zfh0 zfh0Var = (zfh0) this.c;
                final vm30 vm30Var = (vm30) this.d;
                final String str = (String) this.e;
                if (!zfh0Var.equals(vm30Var.V) && vm30Var.V != null) {
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l, L.LogType.d, new Object[]{"ChatScrollIssue: smoothScrollTo cancel due to pendingScrollParams change"});
                    }
                    return s3q0.a;
                }
                if (zfh0Var instanceof bvx) {
                    bvx bvxVar = (bvx) zfh0Var;
                    int d = vm30Var.d(bvxVar);
                    if (d >= 0) {
                        L.d(new om30(d, vm30Var, bvxVar, str));
                        LinearLayoutManagerScrollHelper.f(vm30Var.Y, d, bvxVar.c, 0, null, null, 56);
                    } else {
                        L l2 = L.a;
                        l2.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l2, L.LogType.w, new Object[]{efz.b(bvxVar.a, " not found", new StringBuilder("ChatScrollIssue: internalSmoothScrollTo item with id "))});
                        }
                    }
                } else {
                    if (!(zfh0Var instanceof gb20)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    final gb20 gb20Var = (gb20) zfh0Var;
                    int d2 = vm30Var.d(gb20Var);
                    Integer valueOf = Integer.valueOf(d2);
                    if (d2 == -1) {
                        valueOf = null;
                    }
                    final int intValue = valueOf != null ? valueOf.intValue() : 0;
                    L.d(new gzs() { // from class: xsna.sm30
                        @Override // xsna.gzs
                        public final Object invoke() {
                            StringBuilder a = vq.a("ChatScrollIssue: internalSmoothScrollToMsg position=", intValue, '/');
                            a.append(vm30Var.H.f.size() - 1);
                            a.append(", scrollTo=");
                            a.append(gb20Var);
                            return i5s.a(a, ", chain=", str);
                        }
                    });
                    LinearLayoutManagerScrollHelper.f(vm30Var.Y, intValue, gb20Var.c, 0, null, LinearLayoutManagerScrollHelper.Speed.NORMAL, 24);
                }
                return s3q0.a;
        }
    }
}
