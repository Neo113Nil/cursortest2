package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.clips.coauthors.list.common.mvi.entity.state.ClipCoauthorListItem;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.id.UserId;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.shortvideo.ClipCameraParams;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.dto.stories.model.NarrativePublishEventType;
import java.util.Collections;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.a9j0;
import xsna.c4r0;
import xsna.coc;
import xsna.q8j0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class n37 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ n37(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                break;
            case 1:
                ClipCoauthorListItem clipCoauthorListItem = (ClipCoauthorListItem) this.c;
                syf syfVar = (syf) this.d;
                el50 el50Var = (el50) this.e;
                coc.e eVar = (coc.e) this.f;
                break;
            case 2:
                ClipGridParams.Data data = (ClipGridParams.Data) this.c;
                wzs wzsVar = (wzs) this.d;
                ClipCameraParams clipCameraParams = (ClipCameraParams) this.e;
                sce sceVar = (sce) this.f;
                if (data != null) {
                    wzsVar.invoke(data, clipCameraParams);
                    dw20 dw20Var = sceVar.a;
                    if (dw20Var != null) {
                        dw20Var.dismiss();
                    }
                }
                break;
            case 3:
                Context context = (Context) this.c;
                Uri uri = (Uri) this.d;
                LaunchContext launchContext = (LaunchContext) this.e;
                yp80 yp80Var = (yp80) this.f;
                c4r0.a aVar = (c4r0.a) obj;
                if (aVar != null) {
                    com.vk.common.links.b.h(context, aVar.a, aVar.b, aVar.c, null);
                } else {
                    xwk.d().getBrowser().i(context, uri, launchContext, null);
                }
                yp80Var.onSuccess();
                break;
            case 4:
                crf crfVar = (crf) this.c;
                vt30 vt30Var = (vt30) this.d;
                ww wwVar = (ww) this.e;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.f;
                int i = ((brj0) obj).a;
                if (i == 0) {
                    crfVar.invoke();
                } else if (i == 1) {
                    vt30Var.invoke();
                } else if (i == 2) {
                    wwVar.invoke();
                }
                dw20 dw20Var2 = (dw20) ref$ObjectRef.element;
                if (dw20Var2 != null) {
                    dw20Var2.dismiss();
                }
                break;
            default:
                l8j0 l8j0Var = (l8j0) this.c;
                String str = (String) this.d;
                UserId userId = (UserId) this.e;
                String str2 = (String) this.f;
                Narrative narrative = (Narrative) obj;
                l8j0Var.T(new q8j0.e(Collections.singletonList(narrative), str, true));
                l8j0Var.m.b(a9j0.c.a);
                j6v j6vVar = l8j0Var.l;
                j6vVar.d(NarrativePublishEventType.PUBLISH_NARRATIVE, l8j0Var.f.g, j6vVar.e(Integer.valueOf(narrative.b), Long.valueOf(userId.b), str2, EmptyList.b, null));
                break;
        }
        return s3q0.a;
    }
}
