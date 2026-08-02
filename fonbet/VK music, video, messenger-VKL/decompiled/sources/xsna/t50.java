package xsna;

import android.database.Cursor;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.vk.core.preference.Preference;
import com.vk.dto.messages.MsgTextFormat;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.attaches.AttachSticker;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.messages.MsgSendSource;
import com.vk.im.engine.models.stickers.StickerEntry;
import com.vk.im.ui.components.msg_search.analytics.ImSearchAnalytics;
import com.vk.im.ui.components.msg_search.analytics.ImSearchItemLoggingInfo;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.log.L;
import com.vk.superapp.ui.VkTextFieldView;
import com.vk.superapp.vkpay.checkout.feature.pin.success.PinSuccessView;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.Iterator;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.Regex;
import ru.ok.android.utils.Logger;
import xsna.l65;
import xsna.uaw;
import xsna.xn50;

/* compiled from: ActionStoryViewDelegate.kt */
/* loaded from: classes6.dex */
public final /* synthetic */ class t50 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t50(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i;
        Object obj2 = null;
        switch (this.b) {
            case 0:
                ((com.vk.metrics.eventtracking.b) this.receiver).a((Throwable) obj);
                return s3q0.a;
            case 1:
                u62 u62Var = (u62) this.receiver;
                Regex regex = u62.b;
                u62Var.getClass();
                return u62.c((Cursor) obj);
            case 2:
                ar3 ar3Var = (ar3) this.receiver;
                ar3Var.getClass();
                xn50.a.c(ar3Var, (br3) obj);
                return s3q0.a;
            case 3:
                ((xgx0) this.receiver).getClass();
                xgx0.d((Throwable) obj);
                return s3q0.a;
            case 4:
                kse kseVar = (kse) this.receiver;
                kseVar.getClass();
                xn50.a.c(kseVar, (jse) obj);
                return s3q0.a;
            case 5:
                ((com.vk.profile.community.impl.ui.profile.a) this.receiver).T((com.vk.profile.community.impl.ui.profile.d) obj);
                return s3q0.a;
            case 6:
                b0l0 b0l0Var = (b0l0) obj;
                cbk cbkVar = (cbk) this.receiver;
                bbk bbkVar = cbkVar.e;
                if (b0l0Var.b()) {
                    im0 im0Var = new im0(cbkVar, 29);
                    PinSuccessView pinSuccessView = bbkVar.o;
                    if (pinSuccessView == null) {
                        pinSuccessView = null;
                    }
                    pinSuccessView.setOnShownListener(im0Var);
                    PinSuccessView pinSuccessView2 = bbkVar.o;
                    (pinSuccessView2 != null ? pinSuccessView2 : null).a();
                } else {
                    Toast.makeText(bbkVar.mo2getContext(), b0l0Var.a().toString(), 0).show();
                }
                return s3q0.a;
            case 7:
                Throwable th = (Throwable) obj;
                pim pimVar = (pim) this.receiver;
                f9w f9wVar = pim.q;
                pimVar.getClass();
                pim.q.a(th);
                btk0 btk0Var = pimVar.l;
                btk0Var.d = false;
                btk0Var.a = new DialogExt(pimVar.l.a.e, (ProfilesInfo) null, 2, (zcl) null);
                pimVar.l.e = th;
                pimVar.d1();
                return s3q0.a;
            case 8:
                sdw0.a(((cbv) this.receiver).a, null, Float.valueOf(-((Number) obj).intValue()), null, null, null, true);
                return s3q0.a;
            case 9:
                l280 l280Var = (l280) obj;
                uaw uawVar = (uaw) this.receiver;
                bpn0 bpn0Var = uaw.e;
                uawVar.getClass();
                uawVar.e(new uaw.a(l280Var.c, l280Var.d, -2));
                vvr0.d();
                return s3q0.a;
            case 10:
                nma0 nma0Var = (nma0) this.receiver;
                mma0 mma0Var = nma0Var.e;
                mma0Var.un();
                if (((b0l0) obj).b()) {
                    nma0Var.h.getClass();
                    Preference.C("com.vk.superapp.vkpay.forgot_id", "vk_pay_checkout_forgot_id");
                    ViewGroup viewGroup = mma0Var.m;
                    if (viewGroup == null) {
                        viewGroup = null;
                    }
                    viewGroup.setVisibility(0);
                    ViewGroup viewGroup2 = mma0Var.l;
                    if (viewGroup2 == null) {
                        viewGroup2 = null;
                    }
                    f4m.j(viewGroup2);
                    ViewGroup viewGroup3 = mma0Var.k;
                    if (viewGroup3 == null) {
                        viewGroup3 = null;
                    }
                    f4m.j(viewGroup3);
                    TextView textView = mma0Var.s;
                    if (textView == null) {
                        textView = null;
                    }
                    textView.setVisibility(4);
                    VkTextFieldView vkTextFieldView = mma0Var.n;
                    mhy.d((vkTextFieldView != null ? vkTextFieldView : null).getKeyboardTargetView());
                } else {
                    VkTextFieldView vkTextFieldView2 = mma0Var.n;
                    (vkTextFieldView2 != null ? vkTextFieldView2 : null).setValue("");
                    mma0Var.xn(R.string.vk_pay_checkout_wrong_code);
                }
                return s3q0.a;
            case 11:
                com.vk.clips.viewer.impl.grid.toolbar.profile.swap.modal.picking.b bVar = (com.vk.clips.viewer.impl.grid.toolbar.profile.swap.modal.picking.b) this.receiver;
                bVar.getClass();
                xn50.a.c(bVar, (cja0) obj);
                return s3q0.a;
            case 12:
                lmj0 lmj0Var = (lmj0) this.receiver;
                lmj0Var.getClass();
                if (((l65) obj) instanceof l65.f) {
                    vdx0 vdx0Var = e370.e;
                    lmj0Var.b.b((vdx0Var != null ? vdx0Var : null).e().x(lmj0Var.d.b, lmj0Var.c).r0(io.reactivex.rxjava3.schedulers.a.b()).subscribe(new h4f0(new gqe0(lmj0Var, 5), 2), new o330(new i750(lmj0Var, 26), 14)));
                }
                return s3q0.a;
            case 13:
                StickerItem stickerItem = (StickerItem) obj;
                h2l0 h2l0Var = (h2l0) this.receiver;
                h2l0Var.getClass();
                t6g0 t6g0Var = t6g0.b;
                kcl0 d = t6g0.d();
                int i2 = stickerItem.b;
                StickerStockItem H = d.H(i2);
                if (H == null) {
                    Iterator it = ((Iterable) h2l0Var.q).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (epx.f(((StickerEntry) next).c, stickerItem)) {
                                obj2 = next;
                            }
                        }
                    }
                    StickerEntry stickerEntry = (StickerEntry) obj2;
                    if (stickerEntry != null) {
                        i = stickerEntry.b;
                    }
                    return s3q0.a;
                }
                i = H.b;
                AttachSticker attachSticker = new AttachSticker(i2, i, stickerItem, "chat_empty");
                ChatFragment chatFragment = ChatFragment.this;
                ImSearchItemLoggingInfo imSearchItemLoggingInfo = chatFragment.h0;
                if (imSearchItemLoggingInfo != null) {
                    ImSearchAnalytics.d(ImSearchAnalytics.ClickAction.SEND_MESSAGE_OUT, imSearchItemLoggingInfo);
                }
                ChatFragment.eo(chatFragment, 0, "", MsgTextFormat.d, "", Collections.singletonList(attachSticker), EmptySet.b, null, MsgSendSource.e.a, ly30.f);
                return s3q0.a;
            case 14:
                L.i((Throwable) obj);
                return s3q0.a;
            case 15:
                ((igm0) this.receiver).getClass();
                StoryEntry b = ((chm0) obj).b();
                if (b != null) {
                    return b;
                }
                throw new IllegalArgumentException("Required value was null.");
            default:
                ((com.vk.metrics.eventtracking.b) this.receiver).a((Throwable) obj);
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t50(Object obj, int i) {
        super(1, obj, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0);
        this.b = i;
        switch (i) {
            case 1:
                super(1, obj, u62.class, "readContact", "readContact(Landroid/database/Cursor;)Lcom/vk/contacts/AndroidContact;", 0);
                break;
            case 3:
                super(1, obj, xgx0.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 14:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 15:
                super(1, obj, igm0.class, "buildStoryEntry", "buildStoryEntry(Lcom/vk/stories/design/view/stats/mvi/StoryStatisticsState;)Lcom/vk/dto/stories/model/StoryEntry;", 0);
                break;
            case 16:
                super(1, obj, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0);
                break;
            default:
                break;
        }
    }
}
