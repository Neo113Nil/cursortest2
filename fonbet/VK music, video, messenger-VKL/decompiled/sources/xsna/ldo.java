package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.vk.catalog2.common.dto.ui.UIBlockSearchAuthor;
import com.vk.catalog2.common.ui.core.analytics.tracking.SearchAuthorAnalyticsInfo;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchAuthorCellVh;
import com.vk.dto.common.VideoFile;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoDraftClick;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ldo implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ldo(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                com.vk.catalog.mvi.block.video.impl.p002short.draft.d dVar = (com.vk.catalog.mvi.block.video.impl.p002short.draft.d) this.c;
                VideoFile videoFile = (VideoFile) this.d;
                View view = (View) this.e;
                Activity activity = (Activity) this.f;
                qzv0 qzv0Var = dVar.d;
                if (qzv0Var != null) {
                    qzv0.a(qzv0Var, videoFile, MobileOfficialAppsVideoStat$TypeVideoDraftClick.EventType.EDIT_DRAFT);
                }
                dVar.a(videoFile, view, activity);
                break;
            default:
                SearchAuthorCellVh searchAuthorCellVh = (SearchAuthorCellVh) this.c;
                Context context = (Context) this.d;
                UIBlockSearchAuthor uIBlockSearchAuthor = (UIBlockSearchAuthor) this.e;
                oap oapVar = (oap) this.f;
                cnh0 cnh0Var = searchAuthorCellVh.k;
                cnh0Var.getClass();
                cnh0Var.f(uIBlockSearchAuthor, SearchAuthorAnalyticsInfo.ClickTarget.SendMessage);
                ams.a().j(context, cnh0.a(oapVar, true), "");
                break;
        }
        return s3q0.a;
    }
}
