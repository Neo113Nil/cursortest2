package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.catalog2.common.dto.ui.UIBlockSearchAuthor;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchAuthorCellVh;
import com.vk.dto.common.VideoFile;
import com.vk.friends.groupinvite.impl.models.InviteFriendsTabIndex;
import com.vk.log.L;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoDraftClick;
import com.vk.superapp.browser.internal.commands.controller.VkUiCommand;
import com.vk.voip.api.id.CallId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.asx;
import xsna.gqx;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class l49 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l49(int i, Object obj, Object obj2, String str) {
        this.b = i;
        this.c = obj;
        this.e = obj2;
        this.d = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        ovv0 J;
        dvv0 a;
        switch (this.b) {
            case 0:
                q49 q49Var = (q49) this.c;
                String str = (String) this.d;
                CallId callId = (CallId) this.e;
                StringBuilder sb = new StringBuilder("callLifecycleListeners: ");
                CopyOnWriteArraySet<g49> copyOnWriteArraySet = q49Var.b;
                L.e("CallLifecycleListenerProxy", fw3.d(copyOnWriteArraySet, sb));
                Iterator<g49> it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    it.next().v(callId, str);
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.c;
                bi20 bi20Var = (bi20) this.d;
                break;
            case 2:
                com.vk.catalog.mvi.block.video.impl.p002short.draft.d dVar = (com.vk.catalog.mvi.block.video.impl.p002short.draft.d) this.c;
                VideoFile videoFile = (VideoFile) this.e;
                String str2 = (String) this.d;
                qzv0 qzv0Var = dVar.d;
                if (qzv0Var != null) {
                    qzv0.a(qzv0Var, videoFile, MobileOfficialAppsVideoStat$TypeVideoDraftClick.EventType.DELETE_DRAFT_CONFIRM);
                }
                ClipsDraftPersistentStore clipsDraftPersistentStore = ClipsDraftPersistentStore.b;
                com.vk.movika.sdk.base.observable.a0 a0Var = new com.vk.movika.sdk.base.observable.a0(str2, 1);
                clipsDraftPersistentStore.getClass();
                ClipsDraftPersistentStore.o(a0Var);
                break;
            case 3:
                TextView textView = (TextView) this.c;
                ViewGroup viewGroup = (ViewGroup) this.d;
                ifp ifpVar = (ifp) this.e;
                bwt0.p0(textView, true);
                int height = viewGroup.getHeight() - ifpVar.itemView.getBottom();
                View view = ifpVar.itemView;
                bwt0.c0(view.getHeight() + height, view);
                break;
            case 4:
                anx anxVar = (anx) this.c;
                wh50 wh50Var = (wh50) this.d;
                wh50 wh50Var2 = (wh50) this.e;
                float floatValue = ((vak0) anxVar.a.b).getFloatValue() - Float.intBitsToFloat((int) (((ov70) wh50Var.getValue()).a >> 32));
                float intValue = ((wak0) r0.a).getIntValue() + floatValue;
                if (floatValue < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    floatValue = 0.0f;
                }
                float f = (int) (((q9x) wh50Var2.getValue()).a >> 32);
                if (floatValue > f) {
                    floatValue = f;
                }
                if (intValue < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    intValue = 0.0f;
                }
                float f2 = (int) (((q9x) wh50Var2.getValue()).a >> 32);
                if (intValue > f2) {
                    intValue = f2;
                }
                break;
            case 5:
                r6y r6yVar = (r6y) this.c;
                VkUiCommand vkUiCommand = (VkUiCommand) this.e;
                String str3 = (String) this.d;
                fvv0 M = r6yVar.M();
                if (M != null && (J = M.J()) != null && (a = J.a(vkUiCommand)) != null) {
                    a.a(str3);
                }
                break;
            case 6:
                com.vk.photo.editor.features.mlenhance.c cVar = (com.vk.photo.editor.features.mlenhance.c) this.c;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.d;
                Bitmap bitmap = (Bitmap) this.e;
                if (!cVar.f) {
                    break;
                } else {
                    Bitmap bitmap2 = (Bitmap) ref$ObjectRef.element;
                    kmp kmpVar = new kmp(cVar.c.x());
                    kmpVar.setVisibility(4);
                    kmpVar.setOnDividerMoved(new il7(9, new Ref$BooleanRef(), cVar));
                    fyt0.c(kmpVar, new asy(kmpVar, cVar, bitmap, bitmap2, 1));
                    cVar.l.addView(kmpVar);
                    cVar.n = kmpVar;
                    break;
                }
            case 7:
                ((l7r0) this.c).d((ij20) this.d, (hw30) this.e);
                break;
            case 8:
                ((SearchAuthorCellVh) this.c).k.e(true, (Context) this.d, (UIBlockSearchAuthor) this.e, false);
                break;
            case 9:
                ((izs) this.c).invoke(new gqx.c((InviteFriendsTabIndex) this.d, ((asx.a) this.e).b));
                break;
            default:
                nst0 nst0Var = (nst0) this.c;
                zos0 zos0Var = (zos0) this.d;
                gzs gzsVar = (gzs) this.e;
                com.vk.libvideo.api.promo.stats.a aVar = (com.vk.libvideo.api.promo.stats.a) nst0Var.c.getValue();
                String str4 = zos0Var != null ? zos0Var.b : null;
                if (str4 == null) {
                    str4 = "";
                }
                aVar.a(str4);
                dw20 dw20Var = nst0Var.e;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ l49(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
