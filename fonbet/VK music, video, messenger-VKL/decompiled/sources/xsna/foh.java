package xsna;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetResponseDto;
import com.vk.im.engine.internal.sync.longpoll.LongPollSyncManager$InitialSyncState;
import com.vk.im.ui.components.msg_view.header.MsgViewHeaderComponent;
import com.vk.newsfeed.posting.impl.domain.model.PhotoVideoAttachmentsCropData;
import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;
import com.vk.newsfeed.posting.impl.domain.model.PostEditingReason;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.photo.editor.features.filter.FilterUiModel;
import com.vk.photo.editor.features.filter.a;
import com.vk.voip.VoipService;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;

/* compiled from: CommunityProfileFeature.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class foh extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ foh(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c5, code lost:
    
        if (r2 == false) goto L40;
     */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Object obj2;
        boolean z = true;
        switch (this.b) {
            case 0:
                ((com.vk.profile.community.impl.ui.profile.a) this.receiver).T((com.vk.profile.community.impl.ui.profile.d) obj);
                return s3q0.a;
            case 1:
                FilterUiModel filterUiModel = (FilterUiModel) obj;
                com.vk.photo.editor.features.filter.c cVar = (com.vk.photo.editor.features.filter.c) this.receiver;
                cVar.getClass();
                if (filterUiModel.d && filterUiModel.f == FilterUiModel.Type.GROUP_ENTRY_POINT) {
                    Iterable iterable = (Iterable) cVar.i().b.getValue();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : iterable) {
                        if (obj3 instanceof a.C1457a) {
                            arrayList.add(obj3);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (((a.C1457a) obj2).a.h) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    a.C1457a c1457a = (a.C1457a) obj2;
                    if (c1457a != null) {
                        cVar.q(c1457a.a);
                    }
                } else {
                    cVar.q(filterUiModel);
                }
                return s3q0.a;
            case 2:
                ((fxv) this.receiver).d((LongPollSyncManager$InitialSyncState) obj);
                return s3q0.a;
            case 3:
                ((Boolean) obj).getClass();
                op5 op5Var = ((MsgViewHeaderComponent) this.receiver).n;
                if (op5Var != null) {
                    op5Var.h();
                }
                return s3q0.a;
            case 4:
                ((fgj0) this.receiver).getClass();
                return fgj0.a((ShortVideoGetResponseDto) obj);
            case 5:
                PostingState postingState = (PostingState) obj;
                ((vpc0) this.receiver).getClass();
                if ((postingState.J7() instanceof PostEditingReason.NewPost) && (postingState instanceof PostingState.Editing) && tuk0.a(postingState)) {
                    PostingState.Editing editing = (PostingState.Editing) postingState;
                    PostEditableData postEditableData = editing.i;
                    boolean z2 = (epx.f(postEditableData.t, editing.d.j) || postEditableData.t == null) ? false : true;
                    if (PostEditableData.a(editing.i, null, null, null, null, null, null, null, PhotoVideoAttachmentsCropData.f, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 201031423).equals(PostEditableData.D)) {
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 6:
                ((ImageView) this.receiver).setImageDrawable((Drawable) obj);
                return s3q0.a;
            case 7:
                jtl0 jtl0Var = (jtl0) this.receiver;
                int i = jtl0.A;
                jtl0Var.x6((as80) obj);
                return s3q0.a;
            case 8:
                ((com.vk.metrics.eventtracking.b) this.receiver).q((Throwable) obj);
                return s3q0.a;
            case 9:
                ((xgx0) this.receiver).getClass();
                xgx0.d((Throwable) obj);
                return s3q0.a;
            default:
                VoipService voipService = (VoipService) this.receiver;
                Object obj4 = VoipService.q;
                voipService.getClass();
                if (!(obj instanceof fjw0) && !(obj instanceof g3x0) && !(obj instanceof h3x0)) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public foh(Object obj, int i) {
        super(1, obj, com.vk.photo.editor.features.filter.c.class, "handleUserSelectFilter", "handleUserSelectFilter(Lcom/vk/photo/editor/features/filter/FilterUiModel;)V", 0);
        this.b = i;
        switch (i) {
            case 2:
                super(1, obj, fxv.class, "onInitialSyncStateChanged", "onInitialSyncStateChanged(Lcom/vk/im/engine/internal/sync/longpoll/LongPollSyncManager$InitialSyncState;)V", 0);
                break;
            case 3:
                super(1, obj, MsgViewHeaderComponent.class, "onUnpinMsgSuccess", "onUnpinMsgSuccess(Z)V", 0);
                break;
            case 4:
                super(1, obj, fgj0.class, "map", "map(Lcom/vk/api/generated/shortVideo/dto/ShortVideoGetResponseDto;)Lcom/vk/dto/common/ClipVideoFile;", 0);
                break;
            case 5:
                super(1, obj, vpc0.class, "mapIsDraftsButtonVisible", "mapIsDraftsButtonVisible(Lcom/vk/newsfeed/posting/impl/domain/model/PostingState;)Z", 0);
                break;
            case 6:
                super(1, obj, ImageView.class, "setImageDrawable", "setImageDrawable(Landroid/graphics/drawable/Drawable;)V", 0);
                break;
            case 7:
            default:
                break;
            case 8:
                super(1, obj, com.vk.metrics.eventtracking.b.class, "logOrFail", "logOrFail(Ljava/lang/Throwable;)V", 0);
                break;
            case 9:
                super(1, obj, xgx0.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
        }
    }
}
