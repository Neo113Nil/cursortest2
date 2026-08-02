package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import com.vk.api.generated.market.dto.MarketGetOrderPaymentURLResponseDto;
import com.vk.api.generated.market.dto.MarketPaymentParametersDto;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Attachment;
import com.vk.dto.market.order.OrderPaymentParameters;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.attaches.AttachQuestion;
import com.vk.im.engine.models.messages.CnvMsgId;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.log.L;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.domain.model.PostingStep;
import com.vk.newsfeed.posting.impl.domain.model.PostingStepScreen;
import com.vk.newsfeed.posting.impl.presentation.model.ToolbarNavButtonType;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;

/* compiled from: BroadcastFinishView.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class pf8 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pf8(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String string;
        PostingStepScreen postingStepScreen;
        switch (this.b) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                wf8 wf8Var = (wf8) this.receiver;
                bwt0.p0(wf8Var.n, booleanValue);
                bwt0.p0(wf8Var.p, booleanValue);
                return s3q0.a;
            case 1:
                ((ffc) this.receiver).l.setItems((List) obj);
                return s3q0.a;
            case 2:
                ((n3g) this.receiver).h = (Map) obj;
                return s3q0.a;
            case 3:
                return ((uj00) this.receiver).a((Bitmap) obj);
            case 4:
                ((com.vk.profile.community.impl.ui.profile.a) this.receiver).Y((com.vk.profile.community.impl.ui.profile.actions.d) obj);
                return s3q0.a;
            case 5:
                ((k8p) this.receiver).l.setEnabled(((Boolean) obj).booleanValue());
                return s3q0.a;
            case 6:
                ((xgx0) this.receiver).getClass();
                xgx0.d((Throwable) obj);
                return s3q0.a;
            case 7:
                ((izs) this.receiver).invoke((uav) obj);
                return s3q0.a;
            case 8:
                t140 t140Var = (t140) obj;
                kz30 kz30Var = (kz30) this.receiver;
                kz30Var.getClass();
                MsgFromUser msgFromUser = (MsgFromUser) j5g.X(t140Var.a.c.values());
                ProfilesSimpleInfo Ob = t140Var.b.Ob();
                if (kz30Var.j == null) {
                    kz30.S(kz30Var, null, 3);
                }
                kz30Var.y();
                kz30Var.j = msgFromUser;
                if (msgFromUser.da()) {
                    kz30Var.Y(msgFromUser);
                } else {
                    CharSequence a = kz30Var.U.a(msgFromUser.F, msgFromUser.G);
                    ArrayList arrayList = msgFromUser.H;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (true) {
                        boolean z = false;
                        if (it.hasNext()) {
                            Attachment b = wdw.b((Attach) it.next(), Ob, false, 4);
                            if (b != null) {
                                arrayList2.add(b);
                            }
                        } else {
                            ArrayList X1 = msgFromUser.X1();
                            ArrayList arrayList3 = new ArrayList(c5g.u(X1, 10));
                            Iterator it2 = X1.iterator();
                            while (it2.hasNext()) {
                                NestedMsg nestedMsg = (NestedMsg) it2.next();
                                arrayList3.add(new CnvMsgId(nestedMsg.e, nestedMsg.d));
                            }
                            kz30Var.Z(a, arrayList2, arrayList3, msgFromUser.p3() ? new MsgFromUser(msgFromUser.pa()) : null, Ob);
                            WriteBar writeBar = kz30Var.t;
                            WriteBar writeBar2 = writeBar != null ? writeBar : null;
                            ArrayList arrayList4 = msgFromUser.H;
                            if (arrayList4 == null || !arrayList4.isEmpty()) {
                                Iterator it3 = arrayList4.iterator();
                                while (it3.hasNext()) {
                                    if (((Attach) it3.next()) instanceof AttachQuestion) {
                                        writeBar2.setAddAttachAllowed(z);
                                    }
                                }
                            }
                            z = true;
                            writeBar2.setAddAttachAllowed(z);
                        }
                    }
                }
                return s3q0.a;
            case 9:
                MarketGetOrderPaymentURLResponseDto marketGetOrderPaymentURLResponseDto = (MarketGetOrderPaymentURLResponseDto) obj;
                ((uw80) this.receiver).getClass();
                MarketPaymentParametersDto d = marketGetOrderPaymentURLResponseDto.d();
                String url = d != null ? d.getUrl() : null;
                MarketPaymentParametersDto d2 = marketGetOrderPaymentURLResponseDto.d();
                return new OrderPaymentParameters(url, d2 != null ? d2.d() : null);
            case 10:
                L.i((Throwable) obj);
                return s3q0.a;
            case 11:
                PostingState postingState = (PostingState) obj;
                Context context = ((vpc0) this.receiver).a;
                boolean z2 = postingState instanceof PostingState.Editing;
                if (z2) {
                    PostingStep postingStep = (PostingStep) j5g.k0(edi.t(((PostingState.Editing) postingState).g).e);
                    string = (postingStep == null || (postingStepScreen = postingStep.b) == null) ? context.getString(R.string.media_picker_title) : postingStepScreen instanceof PostingStepScreen.VkPhotoAlbum ? ((PostingStepScreen.VkPhotoAlbum) postingStepScreen).b.g : postingStepScreen instanceof PostingStepScreen.VkPhotoAlbumsList ? context.getString(R.string.media_picker_albums) : "";
                } else {
                    string = context.getString(R.string.media_picker_title);
                }
                return new chc0(string, !z2 ? ToolbarNavButtonType.Close : !edi.t(((PostingState.Editing) postingState).g).e.isEmpty() ? ToolbarNavButtonType.Back : ToolbarNavButtonType.Close, postingState.getContext().n);
            default:
                ((c59) this.receiver).a((b59) obj);
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pf8(Object obj, int i) {
        super(1, obj, ffc.class, "setItems", "setItems(Ljava/util/List;)V", 0);
        this.b = i;
        switch (i) {
            case 2:
                super(1, obj, n3g.class, "handleCollageSlotsLoadingStatusChanged", "handleCollageSlotsLoadingStatusChanged(Ljava/util/Map;)V", 0);
                break;
            case 5:
                super(1, obj, k8p.class, "setApplyButtonEnabled", "setApplyButtonEnabled(Z)V", 0);
                break;
            case 6:
                super(1, obj, xgx0.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 10:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 11:
                super(1, obj, vpc0.class, "mapMediaPickerToolbar", "mapMediaPickerToolbar(Lcom/vk/newsfeed/posting/impl/domain/model/PostingState;)Lcom/vk/newsfeed/posting/impl/presentation/model/PostingMediaPickerToolbarViewState;", 0);
                break;
            default:
                break;
        }
    }
}
