package defpackage;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.text.Editable;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.go.chargers.discounts.api.ChargersDiscountsListEntryPoint;
import com.yandex.go.chargers.offer.navigation.b;
import com.yandex.messaging.core.net.entities.UserData;
import com.yandex.messaging.internal.entities.MediaMessageData;
import com.yandex.messaging.internal.entities.MessageData;
import com.yandex.messaging.internal.entities.PollMessageData;
import com.yandex.messaging.internal.entities.RemovedMessageData;
import com.yandex.messaging.internal.entities.TechBaseMessage;
import com.yandex.messaging.internal.entities.UnsupportedMessageData;
import com.yandex.messaging.internal.net.Error;
import com.yandex.messaging.internal.view.chat.c;
import com.yandex.messaging.internal.view.timeline.i;
import com.ybsdk.widgets.common.communication.CommunicationFullScreenView;
import java.lang.reflect.Type;
import java.util.Date;

/* loaded from: classes15.dex */
public final class io9 implements f1a, ho3, s3z, maz0, zeo, asc, wwc, ag7, ex4, g3e {
    public final Object a;

    public io9(vr vrVar) {
        this.a = new xiu0(vrVar.a.getSharedPreferences("common_storage", 0), "");
    }

    @Override // defpackage.go3
    public void D(Object obj) {
        u1b.a((u1b) this.a, (UserData) obj);
    }

    @Override // defpackage.ho3
    /* renamed from: c */
    public boolean mo103c(int i) {
        ((u1b) this.a).g(Error.GENERIC);
        return true;
    }

    @Override // defpackage.s3z
    public /* bridge */ /* synthetic */ Object g(Date date, String str, UnsupportedMessageData unsupportedMessageData) {
        return Boolean.FALSE;
    }

    @Override // defpackage.daz0
    public void h(faz0 faz0Var) {
        if (faz0Var.a == 0) {
            ((i) this.a).L.scrollToPosition(0);
        }
    }

    @Override // defpackage.wwc
    public wwc i(boolean z) {
        vwc vwcVar = (vwc) this.a;
        return z ? new yfa(vwcVar) : new c29(vwcVar);
    }

    @Override // defpackage.s3z
    public /* bridge */ /* synthetic */ Object k(Date date, TechBaseMessage techBaseMessage, String str, boolean z) {
        return Boolean.FALSE;
    }

    @Override // defpackage.s3z
    public /* bridge */ /* synthetic */ Object l(Date date) {
        return Boolean.FALSE;
    }

    @Override // defpackage.s3z
    public /* bridge */ /* synthetic */ Object m(Date date, RemovedMessageData removedMessageData) {
        return Boolean.FALSE;
    }

    @Override // defpackage.ag7
    public Type n() {
        return (Type) this.a;
    }

    @Override // defpackage.s3z
    public Object o(my40 my40Var, boolean z) {
        c cVar = (c) this.a;
        TextView textView = cVar.I;
        ImageView imageView = cVar.H;
        MessageData messageData = my40Var.g;
        if (my40Var.c) {
            imageView.setVisibility(8);
            textView.setText(oyh0.messenger_forwarder_messages_text);
        } else if (messageData instanceof MediaMessageData) {
            ((MediaMessageData) messageData).a(new y7b(cVar));
        } else if (messageData instanceof PollMessageData) {
            textView.setText(((PollMessageData) messageData).title, TextView.BufferType.EDITABLE);
            int i = wwg0.msg_ic_user_poll_18;
            int i2 = wwg0.msg_bg_circle;
            int i3 = fxa1.c(jng0.messagingCommonBackgroundSecondaryColor, cVar.F.getContext()).data;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            Activity activity = cVar.b;
            imageView.setVisibility(0);
            imageView.setImageResource(i);
            imageView.setScaleType(scaleType);
            Resources resources = activity.getResources();
            Resources.Theme theme = activity.getTheme();
            ThreadLocal threadLocal = wuj0.a;
            imageView.setBackground(resources.getDrawable(i2, theme));
            imageView.setBackgroundTintList(ColorStateList.valueOf(i3));
        } else {
            imageView.setVisibility(8);
            smt0 smt0Var = cVar.O;
            if (smt0Var != null) {
                smt0Var.close();
            }
            cVar.O = null;
            noy0 noy0Var = cVar.A;
            String str = messageData.text;
            if (str == null) {
                str = "";
            }
            textView.setText(((v3k0) noy0Var).b(0, str), TextView.BufferType.EDITABLE);
            tmt0 tmt0Var = cVar.y;
            Editable editableText = textView.getEditableText();
            tmt0Var.getClass();
            cVar.O = new smt0(tmt0Var, null, editableText, tmt0.e, false);
        }
        return Boolean.valueOf(!messageData.hiddenByModeration);
    }

    @Override // defpackage.zeo
    public void onCancel(Object obj) {
        ((t7c) this.a).a = null;
    }

    @Override // defpackage.zeo
    public void onListen(Object obj, xeo xeoVar) {
        ((t7c) this.a).a = (yeo) xeoVar;
    }

    @Override // defpackage.asc
    public void p(zrc zrcVar) {
        asc ascVar;
        ascVar = ((CommunicationFullScreenView) this.a).eventsListener;
        if (ascVar != null) {
            ascVar.p(zrcVar);
        }
    }

    public void q(String str, tsa tsaVar, ir9 ir9Var) {
        h9a h9aVar = (h9a) this.a;
        h9aVar.A((m950) h9aVar.S.get(), new hw9(ChargersDiscountsListEntryPoint.OFFER, str, tsaVar, ir9Var, null, null, null, 112), new b(h9aVar));
    }

    @Override // defpackage.ag7
    public Object r(yv60 yv60Var) {
        hyc hycVar = new hyc(yv60Var);
        yv60Var.k0(new gyc(hycVar));
        return hycVar;
    }

    public /* synthetic */ io9(Object obj) {
        this.a = obj;
    }
}
