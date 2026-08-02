package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.compose.material3.SheetValue;
import androidx.lifecycle.Lifecycle;
import com.vk.api.generated.adsint.dto.AdsintEventTypeDto;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.dto.video.VideoAlbum;
import com.vk.ecomm.market.good.ui.topbar.ProductCardTopBarControlAction;
import com.vk.story.viewer.api.StoryViewerRouter;
import java.util.Collections;
import java.util.LinkedHashMap;
import xsna.olh0;
import xsna.px20;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ywc implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ywc(View view, pkg pkgVar, StoryOwner.Owner owner, l9 l9Var) {
        this.b = 1;
        this.c = view;
        this.d = pkgVar;
        this.e = owner;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.String] */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                VideoFile videoFile = (VideoFile) this.c;
                nlh0 nlh0Var = (nlh0) this.d;
                axc axcVar = (axc) this.e;
                if (videoFile instanceof ClipVideoFile) {
                    nlh0Var.d(Collections.singletonList(new olh0.d(false)));
                    ClipVideoFile clipVideoFile = (ClipVideoFile) videoFile;
                    axcVar.getClass();
                    Integer num = clipVideoFile.x1;
                    if (num != null && num.intValue() > 0) {
                        axcVar.f(clipVideoFile);
                    }
                }
                break;
            case 1:
                View view = (View) this.c;
                pkg pkgVar = (pkg) this.d;
                StoryOwner.Owner owner = (StoryOwner.Owner) this.e;
                Activity h = e3m.h(view.getContext());
                if (h == null) {
                    h = enj.b(view);
                }
                Activity activity = h;
                if (activity != null) {
                    StoryViewerRouter.e((StoryViewerRouter) pkgVar.b.getValue(), activity, new StoryEntry(), null, null, 28);
                }
                UserId userId = owner.e;
                a1w a1wVar = q1w.a;
                (a1wVar != null ? a1wVar : null).x(new yb80(userId));
                break;
            case 2:
                gdj0 gdj0Var = (gdj0) this.c;
                gzs gzsVar = (gzs) this.d;
                yvj yvjVar = (yvj) this.e;
                int i = px20.a.$EnumSwitchMapping$0[((SheetValue) ((zak0) gdj0Var.d.g).getValue()).ordinal()];
                if (i == 1) {
                    gzsVar.invoke();
                    s3q0 s3q0Var = s3q0.a;
                } else if (i != 2) {
                    myc0.h(yvjVar, null, null, new mx20(gdj0Var, null), 3);
                } else {
                    myc0.h(yvjVar, null, null, new lx20(gdj0Var, null), 3);
                }
                break;
            case 3:
                String str = (String) this.c;
                String str2 = (String) this.d;
                a3d0 a3d0Var = (a3d0) this.e;
                AdsintEventTypeDto adsintEventTypeDto = AdsintEventTypeDto.MRC_CLICK_PRETTY_CARD;
                int layoutPosition = a3d0Var.getLayoutPosition();
                break;
            case 4:
                vmd0 vmd0Var = (vmd0) this.c;
                ProductCardTopBarControlAction productCardTopBarControlAction = (ProductCardTopBarControlAction) this.d;
                wh50 wh50Var = (wh50) this.e;
                ((izs) ((zak0) vmd0Var.d).getValue()).invoke(productCardTopBarControlAction);
                wh50Var.setValue(Boolean.FALSE);
                break;
            case 5:
                seg0 seg0Var = (seg0) this.c;
                f5z f5zVar = (f5z) this.d;
                String str3 = (String) this.e;
                boolean z = f5zVar.getLifecycle().getCurrentState() == Lifecycle.State.RESUMED;
                LinkedHashMap linkedHashMap = seg0Var.c;
                LinkedHashMap linkedHashMap2 = seg0Var.d;
                if (!linkedHashMap2.isEmpty()) {
                    if (z) {
                        ?? r1 = seg0Var.b;
                        if (!epx.f(r1 != 0 ? r1 : null, str3)) {
                            seg0Var.b = str3;
                            seg0.i(linkedHashMap);
                        }
                    }
                    linkedHashMap.putAll(linkedHashMap2);
                    linkedHashMap2.clear();
                }
                break;
            default:
                ((u4t0) this.c).b((Context) this.d, (VideoAlbum) this.e);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ ywc(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
