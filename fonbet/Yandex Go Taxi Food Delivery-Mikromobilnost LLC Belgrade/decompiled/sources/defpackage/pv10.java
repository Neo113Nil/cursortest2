package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.images.utils.ScaleMode;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.entities.ReplyData;
import java.io.File;
import kotlin.a;
import kotlin.io.b;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes15.dex */
public final class pv10 implements rmt0 {
    public static final /* synthetic */ kgx[] T = {new MutablePropertyReference1Impl("replySubscription", 0, "getReplySubscription()Lcom/yandex/alicekit/core/Disposable;", pv10.class), oyr.B(qoi0.a, pv10.class, "replyMessageSubscription", "getReplyMessageSubscription()Lcom/yandex/alicekit/core/Disposable;", 0), new MutablePropertyReference1Impl("imageReplyCreator", 0, "getImageReplyCreator()Lcom/yandex/images/ImageCreator;", pv10.class)};
    public final lqo A;
    public final xzq B;
    public final v3k0 C;
    public final zg10 D;
    public final i3y E = a.a(new nv10(this, 1));
    public final iv31 F;
    public boolean G;
    public final i3y H;
    public String I;
    public j3b J;
    public ReplyData K;
    public final qp3 L;
    public final qp3 M;
    public final ymu N;
    public Editable O;
    public ServerMessageRef P;
    public Boolean Q;
    public String R;
    public final i3y S;
    public final View a;
    public final h45 b;
    public final boolean c;
    public final tn1 w;
    public final tmt0 x;
    public final q0k y;
    public final h3y z;

    public pv10(View view, jwf jwfVar, h45 h45Var, boolean z, tn1 tn1Var) {
        this.a = view;
        this.b = h45Var;
        this.c = z;
        this.w = tn1Var;
        this.x = (tmt0) jwfVar.t;
        this.y = (q0k) jwfVar.r;
        this.z = (h3y) jwfVar.u;
        this.A = (lqo) jwfVar.i;
        this.B = (xzq) jwfVar.s;
        this.C = (v3k0) ((ooy0) jwfVar.q).a();
        this.D = (zg10) jwfVar.K;
        int i = e9h0.reply;
        this.F = new iv31(view, i, i);
        this.H = a.a(new nv10(this, 2));
        this.L = new qp3();
        this.M = new qp3();
        int i2 = 3;
        this.N = new ymu(new i0z(i2));
        this.S = a.a(new nv10(this, i2));
    }

    public final ov10 a() {
        return (ov10) this.E.getValue();
    }

    public final void b() {
        if (this.G) {
            com.yandex.messaging.input.voice.reply.a aVar = (com.yandex.messaging.input.voice.reply.a) this.S.getValue();
            kotlinx.coroutines.a.g(aVar.g.a, null);
            fk6 fk6Var = aVar.e;
            if (fk6Var == null) {
                fk6Var = null;
            }
            aVar.e = fk6Var.insert(new jum(new zj6(aVar.a, 0)));
            ys0 ys0Var = aVar.h;
            if (ys0Var != null) {
                ys0Var.invoke();
            }
            aVar.h = null;
            this.G = false;
        }
    }

    public final void c(float f) {
        if (this.K == null) {
            return;
        }
        a().c.setAlpha(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x024c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        String str;
        CharSequence charSequence;
        Editable editable;
        int i;
        j3b j3bVar;
        kgx[] kgxVarArr = T;
        kgx kgxVar = kgxVarArr[2];
        ymu ymuVar = this.N;
        ymuVar.setValue(this, kgxVar, null);
        kgx kgxVar2 = kgxVarArr[0];
        qp3 qp3Var = this.L;
        qp3Var.b(null);
        kgx kgxVar3 = kgxVarArr[1];
        qp3 qp3Var2 = this.M;
        qp3Var2.b(null);
        this.O = null;
        String str2 = this.I;
        ReplyData replyData = this.K;
        ServerMessageRef serverMessageRef = this.P;
        Boolean bool = this.Q;
        iv31 iv31Var = this.F;
        if (replyData == null || str2 == null || bool == null) {
            iv31Var.c(8);
            b();
            return;
        }
        iv31Var.c(0);
        String quotedText = replyData.getQuotedText();
        if (quotedText == null) {
            quotedText = replyData.getText();
        }
        if (quotedText == null || evu0.J(quotedText)) {
            quotedText = null;
        }
        boolean z = replyData.getQuotedText() != null;
        a().e.setVisibility(z ? 0 : 8);
        a().d.setBackground(null);
        boolean z2 = replyData.getIsMedia() || replyData.getIsSticker() || replyData.getIsGallery();
        boolean isVoice = replyData.getIsVoice();
        View view = this.a;
        if (!isVoice && !replyData.getIsHiddenByModeration() && z2) {
            a().d.setVisibility(0);
            String fileId = replyData.getFileId();
            xzq xzqVar = this.B;
            if (fileId != null) {
                ImageView imageView = a().d;
                ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
                imageView.setScaleType(scaleType);
                if (replyData.getFileName() != null) {
                    String fileName = replyData.getFileName();
                    String m = b.m(new File(replyData.getFileName()));
                    Integer a = xzqVar.a(m);
                    ((u0r) this.H.getValue()).c(a != null ? a.intValue() : xzq.b, replyData.getFileId(), this.D.c(this.J, m, replyData.getFileSource()) && (j3bVar = this.J) != null && okb1.b(j3bVar).j());
                    str = fileName;
                } else {
                    a().d.setScaleType(scaleType);
                    String f = com.yandex.messaging.internal.images.b.f(replyData.getFileId());
                    ViewGroup.LayoutParams layoutParams = a().d.getLayoutParams();
                    g9v load = ((xav) this.z.get()).load(f);
                    int i2 = layoutParams.width;
                    yn50 yn50Var = (yn50) load;
                    xn50 xn50Var = yn50Var.b;
                    xn50Var.i = i2;
                    xn50Var.j = layoutParams.height;
                    xn50Var.k = ScaleMode.CENTER_CROP;
                    ImageView imageView2 = a().d;
                    ReplyData replyData2 = this.K;
                    yn50Var.b(a().d, new ahv(imageView2, replyData2 != null ? replyData2.getFileSource() : null));
                    ymuVar.setValue(this, kgxVarArr[2], yn50Var);
                    if (quotedText == null) {
                        str = view.getContext().getResources().getString(replyData.getIsSticker() ? oyh0.messenger_message_with_sticker : replyData.getIsGallery() ? oyh0.messenger_message_with_gallery : replyData.getIsAnimatedImage() ? oyh0.messenger_message_with_gif : oyh0.messenger_message_with_image);
                    }
                }
            } else {
                a().d.setScaleType(ImageView.ScaleType.FIT_CENTER);
                String fileName2 = replyData.getFileName();
                Integer a2 = xzqVar.a(fileName2 != null ? b.m(new File(fileName2)) : null);
                a().d.setImageResource(a2 != null ? a2.intValue() : xzq.b);
                str = fileName2;
            }
            Typeface typeface = a().c.getTypeface();
            if (replyData.getIsHiddenByModeration()) {
                a().c.setTypeface(typeface, 0);
                charSequence = str;
            } else {
                a().c.setTypeface(typeface, 2);
                charSequence = view.getResources().getString(oyh0.messaging_moderation_action_hide_text);
            }
            if (charSequence == null) {
                String str3 = this.R;
                v3k0 v3k0Var = this.C;
                if (str3 == null) {
                    if (quotedText != null) {
                        charSequence = v3k0Var.b(2, new SpannableStringBuilder(quotedText));
                    }
                    charSequence = null;
                } else {
                    boolean a3 = this.A.a(tz10.x);
                    String str4 = this.R;
                    if (a3) {
                        if (str4 != null) {
                            charSequence = v3k0Var.b(2, new SpannableStringBuilder(str4));
                        }
                        charSequence = null;
                    } else {
                        charSequence = str4;
                    }
                }
            }
            if (charSequence == null) {
                charSequence = "";
            }
            this.O = Editable.Factory.getInstance().newEditable(charSequence);
            TextView textView = a().c;
            textView.setMaxLines(!z ? 6 : 1);
            textView.setHorizontallyScrolling(false);
            textView.setText(charSequence);
            if (replyData.getIsVoice()) {
                b();
            } else {
                this.G = true;
                com.yandex.messaging.input.voice.reply.a aVar = (com.yandex.messaging.input.voice.reply.a) this.S.getValue();
                aVar.getClass();
                View findViewById = view.findViewById(e9h0.timeline_message_container);
                ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
                ViewGroup.LayoutParams layoutParams3 = layoutParams2 == null ? null : layoutParams2;
                if (layoutParams3 != null && (i = layoutParams3.width) != -1) {
                    aVar.h = new ys0(aVar, findViewById, i);
                    layoutParams3.width = -1;
                    findViewById.setLayoutParams(layoutParams3);
                }
                aVar.a(str2, serverMessageRef, bool.booleanValue(), replyData, new nv10(this, 0));
            }
            editable = this.O;
            if (editable != null) {
                smt0 smt0Var = new smt0(this.x, this, editable, tmt0.e, false);
                kgx kgxVar4 = kgxVarArr[1];
                qp3Var2.b(smt0Var);
            }
            zyj b = this.y.b(replyData.getAuthorGuid(), gvg0.avatar_size_24, new uhx(12, this));
            kgx kgxVar5 = kgxVarArr[0];
            qp3Var.b(b);
        }
        if (replyData.getIsPoll()) {
            a().d.setVisibility(0);
            a().d.setScaleType(ImageView.ScaleType.CENTER);
            a().d.setBackgroundResource(wwg0.msg_bg_circle);
            int i3 = this.c ? jng0.messagingOutgoingButtonColor : jng0.messagingIncomingButtonColor;
            ImageView imageView3 = a().d;
            int i4 = fxa1.c(i3, a().d.getContext()).data;
            Drawable background = imageView3.getBackground();
            if (background != null) {
                background.setColorFilter(new PorterDuffColorFilter(i4, PorterDuff.Mode.SRC_ATOP));
            }
            a().d.setImageResource(wwg0.msg_ic_user_poll_18);
        } else {
            a().d.setVisibility(8);
        }
        str = null;
        Typeface typeface2 = a().c.getTypeface();
        if (replyData.getIsHiddenByModeration()) {
        }
        if (charSequence == null) {
        }
        if (charSequence == null) {
        }
        this.O = Editable.Factory.getInstance().newEditable(charSequence);
        TextView textView2 = a().c;
        textView2.setMaxLines(!z ? 6 : 1);
        textView2.setHorizontallyScrolling(false);
        textView2.setText(charSequence);
        if (replyData.getIsVoice()) {
        }
        editable = this.O;
        if (editable != null) {
        }
        zyj b2 = this.y.b(replyData.getAuthorGuid(), gvg0.avatar_size_24, new uhx(12, this));
        kgx kgxVar52 = kgxVarArr[0];
        qp3Var.b(b2);
    }

    @Override // defpackage.rmt0
    public final void o(Editable editable) {
        if (editable != this.O) {
            return;
        }
        a().c.setText(editable);
    }
}
